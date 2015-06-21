package com.example.saurabhpandey.scratchthescreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;


public class SaurabhGraphics extends View {

    Bitmap arrow, arrow2, paintingArea;
    float ChangingY, ChangingX;
    Typeface opensans;

    public SaurabhGraphics(Context context) {
        super(context);
        arrow2 = BitmapFactory.decodeResource(getResources(), R.drawable.arrow2);
        arrow = BitmapFactory.decodeResource(getResources(), R.drawable.arrow);
        ChangingY = 0;
        opensans = Typeface.createFromAsset(context.getAssets(), "OpenSans-ExtraBold.ttf");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        paintingArea = drawBitmap(paintingArea, new Rect(100, 100, 150, 150), new Rect(0, 0, 50, 50), null);
//        Rect rect = new Rect();
//        rect.set(0, 100, canvas.getWidth(), 100);
//        Paint yellow = new Paint();
//        yellow.setColor(Color.YELLOW);
//        canvas.drawRect(rect, yellow);
        canvas.drawColor(Color.WHITE);
        Paint textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(40);
//        textPaint.setStyle(Paint.Style.STROKE);
        canvas.drawText("The Moving Arrows ;) ", canvas.getWidth() / 2, canvas.getHeight() / 2, textPaint);


        canvas.drawBitmap(arrow, (canvas.getWidth() / 2 - 55), ChangingY, null);

        if (ChangingY < canvas.getHeight()) {
            ChangingY += 5;
        } else {

            ChangingY = 0;
        }

        invalidate();

        canvas.drawBitmap(arrow2, ChangingX, canvas.getHeight() / 2 - 20, null);

        if (ChangingX < canvas.getHeight()) {
            ChangingX += 5;
        } else {

            ChangingX = 0;
        }

        invalidate();
    }

}
