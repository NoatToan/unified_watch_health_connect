package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 a2\u00020\u0001:\u0001aB'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\b\u0002\u0010^\u001a\u00020\t¢\u0006\u0004\b_\u0010`J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0019\u0010\u001a\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u00101\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u00109\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\"\u0010=\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010A\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010,\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\"\u0010E\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010.\"\u0004\bD\u00100R\"\u0010G\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010U\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010,\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010,¨\u0006b"}, d2 = {"Lcom/xiaomi/hm/health/device/view/PassWordView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "c", "b", GoogleApiAvailabilityLight.a, "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "onDetachedFromWindow", "", "isInput", "updateInputState", "startInputState", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/os/Handler;", "Landroid/os/Handler;", "getMyHandler", "()Landroid/os/Handler;", "setMyHandler", "(Landroid/os/Handler;)V", "myHandler", "Z", "isInputState", "()Z", "setInputState", "(Z)V", "e", "getDrawRemindLineState", "setDrawRemindLineState", "drawRemindLineState", "f", LogUtil.I, "getInputStateBoxColor", "()I", "setInputStateBoxColor", "(I)V", "inputStateBoxColor", "g", "getNoInputStateBoxColor", "setNoInputStateBoxColor", "noInputStateBoxColor", "h", "getRemindLineColor", "setRemindLineColor", "remindLineColor", "i", "getInputStateTextColor", "setInputStateTextColor", "inputStateTextColor", z.j, "getBoxDrawType", "setBoxDrawType", "boxDrawType", hl.k, "getShowPassType", "setShowPassType", "showPassType", "l", "isShowRemindLine", "setShowRemindLine", "", "m", "Ljava/lang/String;", "getPassText", "()Ljava/lang/String;", "setPassText", "(Ljava/lang/String;)V", "passText", "value", GoogleApiAvailabilityLight.b, "getDrawTxtSize", "setDrawTxtSize", "drawTxtSize", "o", "getBoxLineSize", "setBoxLineSize", "boxLineSize", b.r, "textHeight", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PassWordView extends View {

    @NotNull
    private static final String A = "0123456789";
    public static final int PASS_INPUTED_TYPE_TEXT = 2;
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 3;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final float z = 8.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Handler myHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isInputState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean drawRemindLineState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int inputStateBoxColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int noInputStateBoxColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int remindLineColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int inputStateTextColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int boxDrawType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int showPassType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isShowRemindLine;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private String passText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int drawTxtSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int boxLineSize;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int textHeight;

    @JvmOverloads
    public PassWordView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PassWordView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public PassWordView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        Paint paint = new Paint();
        this.paint = paint;
        this.isShowRemindLine = true;
        this.passText = "";
        this.drawTxtSize = 18;
        this.boxLineSize = 4;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.boxLineSize);
        paint.setPathEffect(new CornerPathEffect(1.0f));
    }

    private final void a(Canvas canvas) {
        if (this.boxDrawType == 3) {
            return;
        }
        if (this.isInputState) {
            this.paint.setColor(ContextCompat.getColor(this.mContext, this.inputStateBoxColor));
        } else {
            this.paint.setColor(ContextCompat.getColor(this.mContext, this.noInputStateBoxColor));
        }
        this.paint.setStyle(Paint.Style.STROKE);
        int i = this.boxDrawType;
        if (i == 1) {
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (getMeasuredWidth() / 2) - 5, this.paint);
        } else if (i != 2) {
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), 6.0f, 6.0f, this.paint);
        } else {
            canvas.drawLine(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }
    }

    private final void b(Canvas canvas) {
        if (this.passText.length() == 0) {
            return;
        }
        this.paint.setColor(ContextCompat.getColor(this.mContext, this.inputStateTextColor));
        this.paint.setStyle(Paint.Style.FILL);
        int i = this.showPassType;
        if (i == 0) {
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, 8.0f, this.paint);
            return;
        }
        if (i == 1) {
            this.paint.setTextSize((getMeasuredWidth() / 2) + 10);
            float fMeasureText = this.paint.measureText("*");
            float f = 2;
            canvas.drawText("*", (getMeasuredWidth() / 2) - (fMeasureText / f), ((getMeasuredHeight() / 2) - ((this.paint.descent() + this.paint.ascent()) / f)) + (fMeasureText / 3), this.paint);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (getMeasuredWidth() / 2) - 5, this.paint);
        } else {
            this.paint.setTextSize(this.drawTxtSize);
            float f2 = 2;
            canvas.drawText(this.passText, (getMeasuredWidth() / 2) - (this.paint.measureText(this.passText) / f2), (getMeasuredHeight() / 2) - ((this.paint.descent() + this.paint.ascent()) / f2), this.paint);
        }
    }

    private final void c(Canvas canvas) {
        if (m.isBlank(this.passText)) {
            int color = this.paint.getColor();
            this.paint.setColor(ContextCompat.getColor(this.mContext, this.inputStateTextColor));
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (getMeasuredWidth() / 2) - 5, this.paint);
            this.paint.setColor(color);
        }
    }

    private final void d(Canvas canvas) {
        if (this.drawRemindLineState && this.isShowRemindLine) {
            int measuredWidth = (getMeasuredWidth() / 2) - 10;
            if (measuredWidth < 0) {
                measuredWidth = getMeasuredWidth() / 2;
            }
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(ContextCompat.getColor(this.mContext, this.remindLineColor));
            int i = measuredWidth / 2;
            canvas.drawLine(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - i, getMeasuredWidth() / 2, (getMeasuredHeight() / 2) + i, this.paint);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getBoxDrawType() {
        return this.boxDrawType;
    }

    public final int getBoxLineSize() {
        return this.boxLineSize;
    }

    public final boolean getDrawRemindLineState() {
        return this.drawRemindLineState;
    }

    public final int getDrawTxtSize() {
        return this.drawTxtSize;
    }

    public final int getInputStateBoxColor() {
        return this.inputStateBoxColor;
    }

    public final int getInputStateTextColor() {
        return this.inputStateTextColor;
    }

    @Nullable
    public final Handler getMyHandler() {
        return this.myHandler;
    }

    public final int getNoInputStateBoxColor() {
        return this.noInputStateBoxColor;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final String getPassText() {
        return this.passText;
    }

    public final int getRemindLineColor() {
        return this.remindLineColor;
    }

    public final int getShowPassType() {
        return this.showPassType;
    }

    /* JADX INFO: renamed from: isInputState, reason: from getter */
    public final boolean getIsInputState() {
        return this.isInputState;
    }

    /* JADX INFO: renamed from: isShowRemindLine, reason: from getter */
    public final boolean getIsShowRemindLine() {
        return this.isShowRemindLine;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.myHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        a(canvas);
        d(canvas);
        b(canvas);
        if (this.boxDrawType == 3) {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(size, e.coerceAtLeast(size, this.textHeight));
    }

    public final void setBoxDrawType(int i) {
        this.boxDrawType = i;
    }

    public final void setBoxLineSize(int i) {
        this.boxLineSize = i;
    }

    public final void setDrawRemindLineState(boolean z2) {
        this.drawRemindLineState = z2;
    }

    public final void setDrawTxtSize(int i) {
        this.drawTxtSize = i;
        this.paint.setTextSize(i);
        Rect rect = new Rect();
        getPaint().getTextBounds(A, 0, 10, rect);
        this.textHeight = rect.height();
    }

    public final void setInputState(boolean z2) {
        this.isInputState = z2;
    }

    public final void setInputStateBoxColor(int i) {
        this.inputStateBoxColor = i;
    }

    public final void setInputStateTextColor(int i) {
        this.inputStateTextColor = i;
    }

    public final void setMyHandler(@Nullable Handler handler) {
        this.myHandler = handler;
    }

    public final void setNoInputStateBoxColor(int i) {
        this.noInputStateBoxColor = i;
    }

    public final void setPassText(@NotNull String str) {
        this.passText = str;
    }

    public final void setRemindLineColor(int i) {
        this.remindLineColor = i;
    }

    public final void setShowPassType(int i) {
        this.showPassType = i;
    }

    public final void setShowRemindLine(boolean z2) {
        this.isShowRemindLine = z2;
    }

    public final void startInputState() {
        this.isInputState = true;
        if (this.myHandler == null) {
            this.myHandler = new Handler();
        }
        this.myHandler.removeCallbacksAndMessages(null);
        if (this.isShowRemindLine) {
            this.myHandler.post(new Runnable() { // from class: com.xiaomi.hm.health.device.view.PassWordView.startInputState.1
                @Override // java.lang.Runnable
                public void run() {
                    PassWordView passWordView = PassWordView.this;
                    passWordView.setDrawRemindLineState(!passWordView.getDrawRemindLineState());
                    PassWordView.this.invalidate();
                    if (PassWordView.this.getIsInputState()) {
                        PassWordView.this.getMyHandler().postDelayed(this, 800L);
                    }
                }
            });
        } else {
            invalidate();
        }
    }

    public final void updateInputState(boolean isInput) {
        Handler handler = this.myHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.isInputState = isInput;
        this.drawRemindLineState = false;
        invalidate();
    }

    public /* synthetic */ PassWordView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
