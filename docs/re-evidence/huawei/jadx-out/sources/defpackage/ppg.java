package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.huawei.haf.application.BaseApplication;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject;

/* JADX INFO: loaded from: classes42.dex */
public class ppg extends MultiTouchObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f45761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Drawable f45762c;
    private Context e;

    public ppg(Context context, int i, Resources resources) {
        super(resources);
        this.e = context;
        this.f45762c = resources.getDrawable(i);
        d();
    }

    public ppg(Context context, Drawable drawable, Resources resources) {
        super(resources);
        this.e = context;
        this.f45762c = drawable;
        d();
    }

    public void d() {
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(3.0f);
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject
    public void draw(Canvas canvas) {
        canvas.save();
        float f = (this.mMaxY + this.mMinY) / 2.0f;
        float f2 = (this.mMaxX + this.mMinX) / 2.0f;
        int iD = qrs.d(BaseApplication.b(), 16.0f);
        this.f45762c.setBounds(((int) this.mMinX) + iD, ((int) this.mMinY) + iD, ((int) this.mMaxX) - iD, ((int) this.mMaxY) - iD);
        if (this.mFlippedHorizontally) {
            canvas.scale(-1.0f, 1.0f, f2, f);
        }
        canvas.translate(f2, f);
        if (this.mFlippedHorizontally) {
            canvas.rotate(((-this.mAngle) * 180.0f) / 3.1415927f);
        } else {
            canvas.rotate((this.mAngle * 180.0f) / 3.1415927f);
        }
        canvas.translate(-f2, -f);
        this.f45762c.draw(canvas);
        if (this.isLatestSelected) {
            int iD2 = qrs.d(BaseApplication.b(), 8.0f);
            canvas.drawRect(((int) this.mMinX) + iD2, ((int) this.mMinY) + iD2, ((int) this.mMaxX) - iD2, ((int) this.mMaxY) - iD2, this.mBorderPaint);
            c(canvas, iD2);
        }
        canvas.restore();
    }

    private void c(Canvas canvas, int i) {
        this.f45761b = BitmapFactory.decodeResource(this.e.getResources(), R.mipmap.share_sticker_close);
        if (this.isRTLLanguage) {
            float f = i;
            canvas.drawBitmap(this.f45761b, (this.mMinX - (this.f45761b.getWidth() / 2)) + f, (this.mMinY - (this.f45761b.getHeight() / 2)) + f, new Paint());
            return;
        }
        float f2 = i;
        canvas.drawBitmap(this.f45761b, (this.mMaxX - (this.f45761b.getWidth() / 2)) - f2, (this.mMinY - (this.f45761b.getHeight() / 2)) + f2, new Paint());
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject
    public void unload() {
        this.f45762c = null;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject
    public void init(Context context, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        init(context.getResources());
        this.mStartMidY = f2;
        this.mStartMidX = f;
        this.mHeight = this.f45762c.getIntrinsicHeight();
        this.mWidth = this.f45762c.getIntrinsicWidth();
        if (this.mIsFirstLoad) {
            float fMax = (float) (((double) (Math.max(this.mDisplayWidth, this.mDisplayHeight) / Math.max(this.mWidth, this.mHeight))) * 0.15d);
            this.mIsFirstLoad = false;
            f3 = fMax;
            f7 = f3;
            f4 = f;
            f5 = f2;
            f6 = 0.0f;
        } else {
            float f8 = this.mAngle;
            float f9 = this.mCenterY;
            float f10 = this.mCenterX;
            f3 = this.mScaleX;
            f4 = f10;
            f5 = f9;
            f6 = f8;
            f7 = this.mScaleY;
        }
        setPos(f4, f5, f3, f7, f6);
    }
}
