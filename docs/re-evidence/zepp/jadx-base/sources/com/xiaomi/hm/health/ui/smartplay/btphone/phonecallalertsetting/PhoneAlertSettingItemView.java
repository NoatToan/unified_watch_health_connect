package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.alipay.sdk.m.x.d;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.SettingItemViewBinding;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001(B!\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010&B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u001d\u0010\u0014\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "enable", "", "a", "", "radiusPosition", "setRadiusPosition", "select", "showSelectStatus", "isSelectedStatus", "resId", d.o, "setSubTitle", Constants.ENABLED, "setEnabled", "Lkotlin/Lazy;", "getSelectColorRes", "()I", "selectColorRes", "b", "getUnSelectColorRes", "unSelectColorRes", "Lcom/xiaomi/hm/health/databinding/SettingItemViewBinding;", "c", "Lcom/xiaomi/hm/health/databinding/SettingItemViewBinding;", "binding", GoogleApiAvailabilityLight.a, LogUtil.I, "mCornerRadius", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "RadiusPosition", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneAlertSettingItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectColorRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy unSelectColorRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SettingItemViewBinding binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mCornerRadius;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingItemView$RadiusPosition;", "", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RadiusPosition {
        public static final int ALL = 3;
        public static final int BOTTOM = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;
        public static final int NONE = 0;
        public static final int TOP = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingItemView$RadiusPosition$Companion;", "", "", NoticesEntity.LOOP_TYPE_NONE, LogUtil.I, "TOP", "BOTTOM", "ALL", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final int ALL = 3;
            public static final int BOTTOM = 2;
            public static final int NONE = 0;
            public static final int TOP = 1;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ResourcesCompat.getColor(PhoneAlertSettingItemView.this.getResources(), R.color.p4, this.b.getTheme());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ResourcesCompat.getColor(PhoneAlertSettingItemView.this.getResources(), R.color.s1, this.b.getTheme());
        }
    }

    public PhoneAlertSettingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectColorRes = LazyKt__LazyJVMKt.lazy(new a(context));
        this.unSelectColorRes = LazyKt__LazyJVMKt.lazy(new b(context));
        this.binding = SettingItemViewBinding.inflate(LayoutInflater.from(context), this);
        setBackgroundResource(R.color.s38);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.xiaomi.hm.health.R.styleable.PhoneAlertSettingItemView, 0, i);
        String string = typedArrayObtainStyledAttributes.getString(3);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z2 = true;
        this.mCornerRadius = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.binding.titleTv.setText(string);
        this.binding.subTitleTv.setText(string2);
        if (string2 != null && string2.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            this.binding.subTitleTv.setVisibility(0);
        }
        this.binding.dividerView.setVisibility(z ? 0 : 8);
        setRadiusPosition(this.mCornerRadius);
    }

    private final void a(boolean enable) {
        this.binding.maskView.setVisibility(enable ? 8 : 0);
    }

    private final int getSelectColorRes() {
        return ((Number) this.selectColorRes.getValue()).intValue();
    }

    private final int getUnSelectColorRes() {
        return ((Number) this.unSelectColorRes.getValue()).intValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean isSelectedStatus() {
        return this.binding.leftArrowIv.getVisibility() == 0;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        a(enabled);
    }

    public final void setRadiusPosition(final int radiusPosition) {
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.rainbow_corner_radius);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingItemView.setRadiusPosition.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline outline) {
                int i = radiusPosition;
                if (i == 1) {
                    int width = this.getWidth();
                    int height = this.getHeight();
                    int i2 = dimensionPixelSize;
                    outline.setRoundRect(0, 0, width, height + i2, i2);
                    return;
                }
                if (i == 2) {
                    outline.setRoundRect(0, -dimensionPixelSize, this.getWidth(), this.getHeight(), dimensionPixelSize);
                } else if (i != 3) {
                    outline.setRoundRect(0, 0, this.getWidth(), this.getHeight(), 0.0f);
                } else {
                    outline.setRoundRect(0, 0, this.getWidth(), this.getHeight(), dimensionPixelSize);
                }
            }
        });
        setClipToOutline(true);
    }

    public final void setSubTitle(@StringRes int resId) {
        this.binding.subTitleTv.setText(resId);
        this.binding.subTitleTv.setVisibility(0);
    }

    public final void setTitle(@StringRes int resId) {
        this.binding.titleTv.setText(resId);
    }

    public final void showSelectStatus(boolean select) {
        if (select) {
            this.binding.leftArrowIv.setVisibility(0);
            this.binding.titleTv.setTextColor(getSelectColorRes());
        } else {
            this.binding.leftArrowIv.setVisibility(8);
            this.binding.titleTv.setTextColor(getUnSelectColorRes());
        }
    }

    public PhoneAlertSettingItemView(@NotNull Context context) {
        this(context, null, 0);
    }

    public PhoneAlertSettingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
