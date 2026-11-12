package com.huami.devicestylepower;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b8\u0010<B#\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010=\u001a\u00020\u0004¢\u0006\u0004\b8\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J$\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0004J$\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u0004J(\u0010\"\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0014J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0014J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00103R\u001a\u00105\u001a\u00020\u0007*\u00020\u00078B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00104¨\u0006?"}, d2 = {"Lcom/huami/devicestylepower/DeviceImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "l", "", "electricityRatio", "m", "", hl.k, GoogleApiAvailabilityLight.a, "b", "e", "a", "c", "resId", "Landroid/graphics/drawable/Drawable;", "g", "leftRatio", "rightRatio", "f", z.j, "i", "deviceStyleColor", "highPowerColor", "lowPowerColor", "setDeviceColor", "earphoneHighColor", "earphoneLowColor", "earphoneNoneColor", "setEarphoneColor", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/huami/devicestylepower/DeviceStyle;", "deviceType", "setDeviceType", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "", "Z", Configs.Params.RESET, LogUtil.I, "Lcom/huami/devicestylepower/DeviceStyle;", "(F)F", Constant.PAI_KEY_DAILY_PAI, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceImageView extends AppCompatImageView {

    @NotNull
    private static final a k = new a(null);

    @Deprecated
    @NotNull
    private static final String l = "DeviceImageView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean reset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int lowPowerColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int highPowerColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int deviceStyleColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int earphoneHighColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int earphoneLowColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int earphoneNoneColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private DeviceStyle deviceType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicestylepower/DeviceImageView$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("开始绘制设备电量信息：", DeviceImageView.this.deviceType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("DeviceImageView---> onSizeChanged: ", DeviceImageView.this.deviceType);
        }
    }

    public DeviceImageView(@NotNull Context context) {
        this(context, null);
    }

    private final void a(int electricityRatio) {
        float[] fArr;
        m(electricityRatio);
        if (electricityRatio > 95) {
            fArr = new float[]{h(5.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f)};
        } else {
            fArr = electricityRatio >= 90 ? new float[]{h(2.0f), h(2.0f), h(2.0f), h(2.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f)} : new float[]{h(1.0f), h(1.0f), h(1.0f), h(1.0f), h(5.0f), h(5.0f), h(5.0f), h(5.0f)};
        }
        this.path.addRoundRect(new RectF((getWidth() / 2) - h(2.4f), (getHeight() / 2) - (h(6.5f) * k(electricityRatio)), (getWidth() / 2) + h(2.7f), (getHeight() / 2) + h(6.8f)), fArr, Path.Direction.CCW);
    }

    private final void b(int electricityRatio) {
        m(electricityRatio);
        if (electricityRatio > 100) {
            electricityRatio = 100;
        } else if (electricityRatio < 20) {
            electricityRatio = 20;
        }
        float f = 360;
        float f2 = (electricityRatio / 100.0f) * f;
        this.path.addArc(new RectF((getWidth() / 2) - h(5.0f), (getHeight() / 2) - h(5.0f), (getWidth() / 2) + h(5.0f), (getHeight() / 2) + h(5.0f)), 270 + ((f - f2) / 2), f2);
    }

    private final void c(int electricityRatio) {
        m(electricityRatio);
        if (electricityRatio < 0) {
            this.path.addRect(new RectF((getWidth() / 2) - h(3.0f), (getHeight() / 2) - h(4.0f), (getWidth() / 2) + h(3.5f), (getHeight() / 2) - h(2.0f)), Path.Direction.CCW);
        } else {
            this.path.addRoundRect(new RectF((getWidth() / 2) - h(6.0f), (getHeight() / 2) - (h(6.0f) * k(electricityRatio)), (getWidth() / 2) + h(6.5f), (getHeight() / 2) + h(6.5f)), h(2.0f), h(2.0f), Path.Direction.CCW);
        }
    }

    private final void d(int electricityRatio) {
        m(electricityRatio);
        this.path.addRoundRect(new RectF((getWidth() / 2) - h(5.0f), (getHeight() / 2) - (h(5.0f) * k(electricityRatio)), (getWidth() / 2) + h(5.2f), (getHeight() / 2) + h(5.0f)), h(1.0f), h(1.0f), Path.Direction.CCW);
    }

    private final void e(int electricityRatio) {
        m(electricityRatio);
        this.path.addRoundRect(new RectF((getWidth() / 2) - h(2.0f), (getHeight() / 2) - (h(6.0f) * k(electricityRatio)), (getWidth() / 2) + h(2.5f), (getHeight() / 2) + h(6.5f)), h(1.0f), h(1.0f), Path.Direction.CCW);
    }

    private final Drawable f(int leftRatio, int rightRatio) {
        Pair pair;
        if (leftRatio > 20) {
            pair = rightRatio > 20 ? TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneHighColor)) : TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneLowColor));
        } else {
            pair = rightRatio > 20 ? TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneHighColor)) : TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneLowColor));
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        return VectorDrawableHelper.setPartPathColor$default(VectorDrawableHelper.setPartPathColor$default(VectorDrawableHelper.setPartPathColor$default(VectorDrawableHelper.setPartPathColor$default(VectorDrawableHelper.setPartPathColor$default(VectorDrawableHelper.setPartPathColor$default(new VectorDrawableHelper(getContext(), R.drawable.icon_device_style_chopin), "chopin_left1", iIntValue, false, 4, null), "chopin_left2", iIntValue, false, 4, null), "chopin_left3", iIntValue, false, 4, null), "chopin_right1", iIntValue2, false, 4, null), "chopin_right2", iIntValue2, false, 4, null), "chopin_right3", iIntValue2, false, 4, null).create();
    }

    private final Drawable g(@DrawableRes int resId) {
        return new VectorDrawableHelper(getContext(), resId).setTint(this.deviceStyleColor).create();
    }

    private final float h(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    private final Drawable i(int leftRatio, int rightRatio) {
        Pair pair;
        if (leftRatio > 20) {
            if (rightRatio > 20) {
                pair = TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneHighColor));
            } else {
                pair = rightRatio == -1 ? TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneNoneColor)) : TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneLowColor));
            }
        } else if (leftRatio == -1) {
            pair = rightRatio > 20 ? TuplesKt.to(Integer.valueOf(this.earphoneNoneColor), Integer.valueOf(this.earphoneHighColor)) : TuplesKt.to(Integer.valueOf(this.earphoneNoneColor), Integer.valueOf(this.earphoneLowColor));
        } else if (rightRatio > 20) {
            pair = TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneHighColor));
        } else {
            pair = rightRatio == -1 ? TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneNoneColor)) : TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneLowColor));
        }
        return new VectorDrawableHelper(getContext(), R.drawable.icon_device_style_haydn).setPartPathColor("haydn_left", ((Number) pair.component1()).intValue(), true).setPartPathColor("haydn_right", ((Number) pair.component2()).intValue(), true).create();
    }

    private final Drawable j(int leftRatio, int rightRatio) {
        Pair pair;
        if (leftRatio > 20) {
            if (rightRatio > 20) {
                pair = TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneHighColor));
            } else {
                pair = rightRatio == -1 ? TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneNoneColor)) : TuplesKt.to(Integer.valueOf(this.earphoneHighColor), Integer.valueOf(this.earphoneLowColor));
            }
        } else if (leftRatio == -1) {
            pair = rightRatio > 20 ? TuplesKt.to(Integer.valueOf(this.earphoneNoneColor), Integer.valueOf(this.earphoneHighColor)) : TuplesKt.to(Integer.valueOf(this.earphoneNoneColor), Integer.valueOf(this.earphoneLowColor));
        } else if (rightRatio > 20) {
            pair = TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneHighColor));
        } else {
            pair = rightRatio == -1 ? TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneNoneColor)) : TuplesKt.to(Integer.valueOf(this.earphoneLowColor), Integer.valueOf(this.earphoneLowColor));
        }
        return new VectorDrawableHelper(getContext(), R.drawable.icon_device_style_mozart).setPartPathColor("mozart_left", ((Number) pair.component1()).intValue(), true).setPartPathColor("mozart_right", ((Number) pair.component2()).intValue(), true).create();
    }

    private final float k(int electricityRatio) {
        int i = 50;
        if (electricityRatio < 20) {
            i = -30;
        } else if (electricityRatio <= 100) {
            i = electricityRatio - 50;
        }
        return i / 50.0f;
    }

    private final void l() {
        this.path.reset();
        DeviceStyle deviceStyle = this.deviceType;
        if (deviceStyle instanceof DeviceStyle.Square) {
            d(((DeviceStyle.Square) deviceStyle).getElectricityRatio());
            return;
        }
        if (deviceStyle instanceof DeviceStyle.Circle) {
            b(((DeviceStyle.Circle) deviceStyle).getElectricityRatio());
            return;
        }
        if (deviceStyle instanceof DeviceStyle.Bracelet) {
            a(((DeviceStyle.Bracelet) deviceStyle).getElectricityRatio());
            return;
        }
        if (deviceStyle instanceof DeviceStyle.Venice) {
            e(((DeviceStyle.Venice) deviceStyle).getElectricityRatio());
        } else {
            if (deviceStyle instanceof DeviceStyle.Weight) {
                c(((DeviceStyle.Weight) deviceStyle).getElectricityRatio());
                return;
            }
            if (deviceStyle instanceof DeviceStyle.Chopin ? true : deviceStyle instanceof DeviceStyle.Treadmill ? true : deviceStyle instanceof DeviceStyle.Shoes ? true : deviceStyle instanceof DeviceStyle.Mozart) {
                return;
            }
            boolean z = deviceStyle instanceof DeviceStyle.Haydn;
        }
    }

    private final void m(int electricityRatio) {
        int i;
        Paint paint = this.paint;
        if (electricityRatio < 0) {
            i = this.deviceStyleColor;
        } else {
            i = electricityRatio <= 20 ? this.lowPowerColor : this.highPowerColor;
        }
        paint.setColor(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        DeviceStyle deviceStyle = this.deviceType;
        if ((!(deviceStyle instanceof DeviceStyle.Weight) && DeviceStyleKt.getSingleBatteryRatio(deviceStyle) == -1) || !DeviceStyleKt.getEarPhoneIsConnected(this.deviceType)) {
            setVisibility(8);
            return;
        }
        if (!this.reset) {
            l();
            this.reset = true;
        }
        HMLog.info(l, new b());
        DeviceStyle deviceStyle2 = this.deviceType;
        if ((deviceStyle2 instanceof DeviceStyle.Treadmill) || (deviceStyle2 instanceof DeviceStyle.Chopin) || (deviceStyle2 instanceof DeviceStyle.Mozart) || (deviceStyle2 instanceof DeviceStyle.Haydn)) {
            return;
        }
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        HMLog.info(l, new c());
        this.reset = true;
        l();
    }

    @NotNull
    public final DeviceImageView setDeviceColor(@ColorInt int deviceStyleColor, @ColorInt int highPowerColor, @ColorInt int lowPowerColor) {
        this.highPowerColor = highPowerColor;
        this.lowPowerColor = lowPowerColor;
        this.deviceStyleColor = deviceStyleColor;
        return this;
    }

    public final void setDeviceType(@NotNull DeviceStyle deviceType) {
        Drawable drawableG;
        this.reset = false;
        this.deviceType = deviceType;
        if (deviceType instanceof DeviceStyle.Bracelet) {
            drawableG = g(R.drawable.icon_device_style_bracelet);
        } else if (deviceType instanceof DeviceStyle.Chopin) {
            DeviceStyle.Chopin chopin = (DeviceStyle.Chopin) deviceType;
            drawableG = f(chopin.getLeftElectricityRatio(), chopin.getRightElectricityRatio());
        } else if (deviceType instanceof DeviceStyle.Circle) {
            drawableG = g(R.drawable.icon_device_style_circle);
        } else if (deviceType instanceof DeviceStyle.Haydn) {
            DeviceStyle.Haydn haydn = (DeviceStyle.Haydn) deviceType;
            drawableG = i(haydn.getLeftElectricityRatio(), haydn.getRightElectricityRatio());
        } else if (deviceType instanceof DeviceStyle.Mozart) {
            DeviceStyle.Mozart mozart = (DeviceStyle.Mozart) deviceType;
            drawableG = j(mozart.getLeftElectricityRatio(), mozart.getRightElectricityRatio());
        } else if (deviceType instanceof DeviceStyle.Square) {
            drawableG = g(R.drawable.icon_device_style_square);
        } else if (deviceType instanceof DeviceStyle.Treadmill) {
            drawableG = g(R.drawable.icon_device_style_treadmill);
        } else if (deviceType instanceof DeviceStyle.Venice) {
            drawableG = g(R.drawable.icon_device_style_venice);
        } else if (deviceType instanceof DeviceStyle.Weight) {
            drawableG = g(R.drawable.icon_device_style_scale);
        } else {
            if (!(deviceType instanceof DeviceStyle.Shoes)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableG = g(R.drawable.icon_device_style_shoes);
        }
        setBackground(drawableG);
    }

    @NotNull
    public final DeviceImageView setEarphoneColor(@ColorInt int earphoneHighColor, @ColorInt int earphoneLowColor, @ColorInt int earphoneNoneColor) {
        this.earphoneHighColor = earphoneHighColor;
        this.earphoneLowColor = earphoneLowColor;
        this.earphoneNoneColor = earphoneNoneColor;
        return this;
    }

    public DeviceImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeviceImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint(1);
        this.path = new Path();
        this.lowPowerColor = SupportMenu.CATEGORY_MASK;
        this.highPowerColor = -16711936;
        this.deviceStyleColor = -16777216;
        this.earphoneHighColor = -16777216;
        this.earphoneLowColor = SupportMenu.CATEGORY_MASK;
        this.earphoneNoneColor = -7829368;
        this.deviceType = new DeviceStyle.Square(100);
    }
}
