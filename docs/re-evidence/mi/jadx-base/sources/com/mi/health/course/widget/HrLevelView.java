package com.mi.health.course.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/mi/health/course/widget/HrLevelView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paintNormal", "Landroid/graphics/Paint;", "paintCur", "itemW", Constants.DEVICE_TYPE_WEAR, "h", "space", "", "darkNormalColor", "lightNormalColor", "darkCurColor", "lightCurlColor", "setColor", "", ColorSchemeHelper.SCHEME_DARK, "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "curLevel", "setHrLevel", "hrmZone", "Lcom/xiaomi/fitness/account/HrZoneLevel;", "setDark", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrLevelView extends View {
    private int curLevel;
    private final int darkCurColor;
    private final int darkNormalColor;
    private final int h;
    private final int itemW;
    private final int lightCurlColor;
    private final int lightNormalColor;

    @NotNull
    private final Paint paintCur;

    @NotNull
    private final Paint paintNormal;
    private final float space;
    private final int w;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HrLevelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setColor(boolean dark) {
        if (dark) {
            this.paintNormal.setColor(this.darkNormalColor);
            this.paintCur.setColor(this.darkCurColor);
        } else {
            this.paintNormal.setColor(this.lightNormalColor);
            this.paintCur.setColor(this.lightCurlColor);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getWidth() + getHeight() == 0) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            float f = i * (this.space + this.itemW);
            float height = getHeight();
            if (this.curLevel == i) {
                canvas.drawRect(f, 0.0f, f + this.itemW, height, this.paintCur);
            } else {
                canvas.drawRect(f, 0.0f, f + this.itemW, height, this.paintNormal);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.w, this.h);
    }

    public final void setDark(boolean dark) {
        setColor(dark);
        invalidate();
    }

    public final void setHrLevel(@NotNull HrZoneLevel hrmZone) {
        Intrinsics.checkNotNullParameter(hrmZone, "hrmZone");
        int i = WhenMappings.$EnumSwitchMapping$0[hrmZone.ordinal()];
        int i2 = 4;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else if (i == 3) {
                i2 = 2;
            } else if (i != 4) {
                i2 = i != 5 ? -1 : 0;
            } else {
                i2 = 1;
            }
        }
        this.curLevel = i2;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HrLevelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HrLevelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paintNormal = new Paint(1);
        this.paintCur = new Paint(1);
        int iDip2px = DisplayUtil.dip2px(2.6666667f);
        this.itemW = iDip2px;
        int iDip2px2 = DisplayUtil.dip2px(18.0f);
        this.w = iDip2px2;
        this.h = DisplayUtil.dip2px(9.0f);
        this.space = (iDip2px2 - (iDip2px * 5)) / 4.0f;
        this.darkNormalColor = 922746879;
        this.lightNormalColor = 905969664;
        this.darkCurColor = -1;
        this.lightCurlColor = -16777216;
        setDark(false);
        this.curLevel = -1;
    }

    public /* synthetic */ HrLevelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
