package com.huami.pai.ui.uicase;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.pai.device.IPaiDevice;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.ActivityPaiPaiDetailBinding;
import com.huami.pai.service.IPaiUiService;
import com.huami.pai.ui.detail.FitnessAgeFragment;
import com.huami.pai.ui.heartrate.PaiDayHeartRateFragment;
import com.huami.pai.ui.heartrate.PaiNoHeartRateFragment;
import com.huami.pai.ui.history.PAIHistoryFragment;
import com.huami.pai.ui.hrsetting.HeartRateSettingFragment;
import com.huami.pai.ui.intro.PaiIntroFragment;
import com.huami.pai.ui.sporthint.PaiSportHintFragment;
import com.huami.pai.view.PaiCustomToast;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Route({RouterHelper.PAI_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u001b¨\u0006#"}, d2 = {"Lcom/huami/pai/ui/uicase/PaiDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/pai/device/IPaiDevice;", "x", "Lkotlin/Lazy;", "m", "()Lcom/huami/pai/device/IPaiDevice;", "ipaiDevice", "Lcom/huami/pai/service/IPaiUiService;", "y", "l", "()Lcom/huami/pai/service/IPaiUiService;", "iPaiUiService", "Lcom/huami/pai/lib/databinding/ActivityPaiPaiDetailBinding;", "z", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.b, "()Lcom/huami/pai/lib/databinding/ActivityPaiPaiDetailBinding;", "paiDetailBinding", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "o", "()I", "s1ColorInt", "B", com.google.android.exoplayer2.text.ttml.b.r, "s38ColorInt", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiDetailActivity extends BaseTitleActivity {
    public static final /* synthetic */ KProperty<Object>[] C;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy s1ColorInt;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy s38ColorInt;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy ipaiDevice;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy iPaiUiService;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty paiDetailBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/pai/ui/uicase/PaiDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startHMPai", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startHMPai(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) PaiDetailActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(PaiDetailActivity.this, R.color.s1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(PaiDetailActivity.this, R.color.s38);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[5];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PaiDetailActivity.class), "paiDetailBinding", "getPaiDetailBinding()Lcom/huami/pai/lib/databinding/ActivityPaiPaiDetailBinding;"));
        C = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaiDetailActivity() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.ipaiDevice = LazyKt__LazyJVMKt.lazy(new Function0<IPaiDevice>() { // from class: com.huami.pai.ui.uicase.PaiDetailActivity$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.device.IPaiDevice, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPaiDevice invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(IPaiDevice.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.iPaiUiService = LazyKt__LazyJVMKt.lazy(new Function0<IPaiUiService>() { // from class: com.huami.pai.ui.uicase.PaiDetailActivity$special$$inlined$injectInPai$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.service.IPaiUiService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPaiUiService invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(IPaiUiService.class), objArr2, objArr3);
            }
        });
        this.paiDetailBinding = ActivityViewBindingsKt.viewBinding(new PaiDetailActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityPaiPaiDetailBinding.class)));
        this.s1ColorInt = LazyKt__LazyJVMKt.lazy(new a());
        this.s38ColorInt = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void initTitle() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, p(), getString(R.string.pai_pai_name), !RainbowUtils.isDarkMode(this));
        TextView titleTextView = getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        titleTextView.setTextColor(o());
        setTitleBarBackgroundColor(p());
        setStatusBarColor(p());
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, R.color.s1);
    }

    private final IPaiUiService l() {
        return (IPaiUiService) this.iPaiUiService.getValue();
    }

    private final IPaiDevice m() {
        return (IPaiDevice) this.ipaiDevice.getValue();
    }

    private final ActivityPaiPaiDetailBinding n() {
        return (ActivityPaiPaiDetailBinding) this.paiDetailBinding.getValue(this, C[2]);
    }

    private final int o() {
        return ((Number) this.s1ColorInt.getValue()).intValue();
    }

    private final int p() {
        return ((Number) this.s38ColorInt.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(n().getRoot());
        initTitle();
        ViewExKt.setVisible(n().jpHintText, l().showBottomHint());
        m().supportPaiInDevice().observe(this, new Observer<T>() { // from class: com.huami.pai.ui.uicase.PaiDetailActivity$onCreate$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Toast toastMakeText;
                if (!((Boolean) t).booleanValue() || (toastMakeText = PaiCustomToast.INSTANCE.makeText(this.a, R.string.pai_not_support_toast, 0)) == null) {
                    return;
                }
                toastMakeText.show();
            }
        });
        m().supportPaiButDisabled(this).observe(this, new Observer<T>() { // from class: com.huami.pai.ui.uicase.PaiDetailActivity$onCreate$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (((Boolean) t).booleanValue()) {
                    Analytics.recordEvent(new CountEventBuilder("SPORT_PAI_V").addExtra("tp", "guide"));
                }
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_history, new PAIHistoryFragment(), "PaiHistoryFragment").replace(R.id.fl_hrsetting, new HeartRateSettingFragment(), HeartRateSettingFragment.class.getSimpleName()).replace(R.id.fl_sporthint, new PaiSportHintFragment(), PaiSportHintFragment.class.getSimpleName()).replace(R.id.fl_dayhr, new PaiDayHeartRateFragment(), PaiDayHeartRateFragment.class.getSimpleName()).replace(R.id.fl_daynohr, new PaiNoHeartRateFragment(), PaiNoHeartRateFragment.class.getSimpleName()).replace(R.id.fl_fitnessage, new FitnessAgeFragment(), FitnessAgeFragment.class.getSimpleName()).replace(R.id.fl_intro, new PaiIntroFragment(), PaiIntroFragment.class.getSimpleName()).commit();
    }
}
