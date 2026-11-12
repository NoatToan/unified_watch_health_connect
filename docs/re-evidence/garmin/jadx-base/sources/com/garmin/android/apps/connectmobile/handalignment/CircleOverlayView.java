package com.garmin.android.apps.connectmobile.handalignment;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import en0.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/CircleOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "F", "getCircleRadius", "()F", "setCircleRadius", "(F)V", "circleRadius", "b", "I", "getOverlayColor", "()I", "setOverlayColor", "(I)V", "overlayColor", "c", "getOverlayAlpha", "setOverlayAlpha", "overlayAlpha", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CircleOverlayView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float circleRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int overlayColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int overlayAlpha;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f36522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f36523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f36524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f36525i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleOverlayView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.overlayColor = -16777216;
        this.overlayAlpha = 70;
        this.f36522f = new Paint();
        Paint paint = new Paint();
        this.f36523g = paint;
        Paint paint2 = new Paint();
        this.f36524h = paint2;
        this.circleRadius = TypedValue.applyDimension(1, 100.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f64714a, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 100);
            this.overlayColor = typedArrayObtainStyledAttributes.getColor(2, -16777216);
            this.overlayAlpha = typedArrayObtainStyledAttributes.getInt(1, 70);
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        }
        paint.setColor(getResources().getColor(R.color.transparent, null));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setColor(this.overlayColor);
        paint2.setAlpha(this.overlayAlpha);
    }

    public final void a() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f36520d, this.f36521e, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f36524h);
        canvas.drawCircle(this.f36520d / 2.0f, this.f36521e / 2.0f, this.circleRadius, this.f36523g);
        this.f36525i = bitmapCreateBitmap;
    }

    public final float getCircleRadius() {
        return this.circleRadius;
    }

    public final int getOverlayAlpha() {
        return this.overlayAlpha;
    }

    public final int getOverlayColor() {
        return this.overlayColor;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f36525i == null) {
            a();
        }
        Bitmap bitmap = this.f36525i;
        bitmap.getClass();
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f36522f);
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        this.f36520d = View.MeasureSpec.getSize(i14);
        int size = View.MeasureSpec.getSize(i15);
        this.f36521e = size;
        setMeasuredDimension(this.f36520d, size);
        super.onMeasure(i14, i15);
    }

    public final void setCircleRadius(float f14) {
        this.circleRadius = f14;
    }

    public final void setOverlayAlpha(int i14) {
        this.overlayAlpha = i14;
    }

    public final void setOverlayColor(int i14) {
        this.overlayColor = i14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/CircleOverlayView$a;", "", "<init>", "()V", "", "DEFAULT_CIRCLE_RADIUS_DP", "I", "DEFAULT_OVERLAY_ALPHA", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleOverlayView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CircleOverlayView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
