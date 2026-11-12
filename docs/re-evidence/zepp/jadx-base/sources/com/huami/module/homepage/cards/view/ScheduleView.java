package com.huami.module.homepage.cards.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b;\u0010=B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J(\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0011R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0011R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0011¨\u0006?"}, d2 = {"Lcom/huami/module/homepage/cards/view/ScheduleView;", "Landroid/view/View;", "", "a", "b", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", LogUtil.I, StatEvent.TP_FIRST, "c", "two", GoogleApiAvailabilityLight.a, "three", "e", "four", "f", "mHeight", "g", "firstX", "twoX", "i", "threeX", z.j, "fourX", "", hl.k, "Z", "isFirst", "l", "isTwo", "m", "isThread", GoogleApiAvailabilityLight.b, "isFour", "o", "paintWidth", b.r, "speed", DTransferConstants.SEARCH_KEY, "mBarColor", "r", "mShowLineNum", SOAP.XMLNS, "mShowLineSpace", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int first;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int two;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int three;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int four;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int firstX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int twoX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int threeX;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int fourX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isFirst;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isTwo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isThread;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isFour;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int paintWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int speed;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int mBarColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mShowLineNum;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mShowLineSpace;

    public ScheduleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.first = 30;
        this.two = 80;
        this.three = 50;
        this.four = 20;
        this.paintWidth = 6;
        this.speed = 5;
        this.mBarColor = -1;
        this.mShowLineNum = 4;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.Sls_ScheduleView, 0, 0);
        this.mBarColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_ScheduleView_Sls_bar_color, this.mBarColor);
        this.mShowLineNum = typedArrayObtainStyledAttributes.getInt(R.styleable.Sls_ScheduleView_Sls_bar_num, this.mShowLineNum);
        this.mShowLineSpace = typedArrayObtainStyledAttributes.getInt(R.styleable.Sls_ScheduleView_Sls_bar_space, this.mShowLineSpace);
        typedArrayObtainStyledAttributes.recycle();
        b();
        a();
    }

    private final void a() {
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(this.mBarColor);
    }

    private final void b() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.mPaint;
        if (paint2 != null) {
            paint2.setStrokeCap(Paint.Cap.ROUND);
        }
        Paint paint3 = this.mPaint;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.paintWidth);
        }
        Paint paint4 = this.mPaint;
        if (paint4 == null) {
            return;
        }
        paint4.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i = this.first;
        if (i >= 100) {
            this.isFirst = true;
        } else if (i <= 0) {
            this.isFirst = false;
        }
        this.first = (int) (this.isFirst ? ((double) i) - (Math.random() * ((double) this.speed)) : ((double) i) + (Math.random() * ((double) this.speed)));
        int i2 = this.two;
        if (i2 >= 100) {
            this.isTwo = true;
        } else if (i2 <= 0 || !this.isTwo) {
            this.isTwo = false;
        }
        this.two = (int) (this.isTwo ? ((double) i2) - (Math.random() * ((double) this.speed)) : ((double) i2) + (Math.random() * ((double) this.speed)));
        int i3 = this.three;
        if (i3 >= 100) {
            this.isThread = true;
        } else if (i3 <= 0) {
            this.isThread = false;
        }
        this.three = (int) (this.isThread ? ((double) i3) - (Math.random() * ((double) this.speed)) : ((double) i3) + (Math.random() * ((double) this.speed)));
        int i4 = this.firstX;
        int i5 = this.mHeight;
        canvas.drawLine(i4, i5, i4, (float) (((double) i5) * ((double) this.first) * 0.01d), this.mPaint);
        int i6 = this.twoX;
        int i7 = this.mHeight;
        canvas.drawLine(i6, i7, i6, (float) (((double) i7) * ((double) this.two) * 0.01d), this.mPaint);
        int i8 = this.threeX;
        int i9 = this.mHeight;
        canvas.drawLine(i8, i9, i8, (float) (((double) i9) * ((double) this.three) * 0.01d), this.mPaint);
        if (this.mShowLineNum >= 4) {
            int i10 = this.four;
            if (i10 >= 100) {
                this.isFour = true;
            } else if (i10 <= 0) {
                this.isFour = false;
            }
            int iRandom = (int) (this.isFour ? ((double) i10) - (Math.random() * ((double) this.speed)) : ((double) i10) + (Math.random() * ((double) this.speed)));
            this.four = iRandom;
            int i11 = this.fourX;
            int i12 = this.mHeight;
            canvas.drawLine(i11, i12, i11, (float) (((double) i12) * ((double) iRandom) * 0.01d), this.mPaint);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        int i = this.mShowLineSpace;
        if (i > 0) {
            int i2 = this.paintWidth;
            this.firstX = i2 / 2;
            this.twoX = i2 + (i2 / 2) + ScheduleViewKt.a(i, getContext());
            int i3 = this.paintWidth;
            this.threeX = (i3 * 2) + (i3 / 2) + (ScheduleViewKt.a(this.mShowLineSpace, getContext()) * 2);
            int i4 = this.paintWidth;
            this.fourX = (i4 * 3) + (i4 / 2) + (ScheduleViewKt.a(this.mShowLineSpace, getContext()) * 3);
        } else {
            int i5 = this.paintWidth;
            this.firstX = (i5 / 2) + 0;
            double d = w;
            this.twoX = (int) (0.33d * d);
            this.threeX = (int) (d * 0.66d);
            this.fourX = w - (i5 / 2);
        }
        this.mHeight = h;
    }

    public ScheduleView(@NotNull Context context) {
        this(context, null);
    }

    public ScheduleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
