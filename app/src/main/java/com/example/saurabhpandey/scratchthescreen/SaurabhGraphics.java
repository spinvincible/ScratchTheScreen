package com.example.saurabhpandey.scratchthescreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by SaurabhPandey on 6/21/2015.
 */
public class SaurabhGraphics extends View {

    Bitmap arrow, arrow2;
    float ChangingY, ChangingX;

    public SaurabhGraphics(Context context) {
        super(context);
        arrow2 = BitmapFactory.decodeResource(getResources(), R.drawable.arrow2);
        arrow = BitmapFactory.decodeResource(getResources(), R.drawable.arrow);
        ChangingY = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

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
        Rect rect = new Rect();
        rect.set(0, 100, canvas.getWidth(), 100);
        Paint yellow = new Paint();
        yellow.setColor(Color.YELLOW);
        canvas.drawRect(rect, yellow);
        invalidate();
    }
}
