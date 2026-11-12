package com.huami.sleep.daysleep.tonality;

import android.content.ComponentCallbacks;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.monitor.ExposureAnalyticsKt;
import com.huami.sleep.R;
import com.huami.sleep.databinding.ItemSleepTonalityBinding;
import com.huami.sleep.daysleep.tonality.SleepTonalityFragment;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.UnitTextView;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.web.service.WebItem;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J*\u0010\u000e\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u001c\u0010\u001d\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010'\u001a\u00020\u001bH\u0002J$\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u001a\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\b\u00103\u001a\u00020\u0002H\u0016R\u001d\u00109\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020:8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/SleepTonalityFragment;", "Landroidx/fragment/app/Fragment;", "", "m", "g", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "sleepTonalityBean", DTransferConstants.SEARCH_KEY, "Lcom/huami/chart/data/ChartDataList;", "relaxChartDataList", "", "minRelaxScore", "maxRelaxScore", "intoSleepSignIndex", "t", "", "tonalityStartTime", "tonalityEndTime", "u", "playCount", SOAP.XMLNS, "listenCount", "r", "targetInt", GoogleApiAvailabilityLight.b, "", "dateKey", "", "showRating", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.D, "", "rating", "C", "feeling", "isHighColor", "v", "F", "continueCountText", "isToday", "o", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroyView", "Lcom/huami/sleep/daysleep/tonality/SleepTonalityViewModel;", "a", "Lkotlin/Lazy;", "x", "()Lcom/huami/sleep/daysleep/tonality/SleepTonalityViewModel;", "sleepTonalityViewModel", "Lcom/huami/sleep/databinding/ItemSleepTonalityBinding;", "b", "Lcom/huami/sleep/databinding/ItemSleepTonalityBinding;", "itemSleepTonalityBinding", "Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "c", "z", "()Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "tonalityChartHelper", "y", "()Lcom/huami/sleep/databinding/ItemSleepTonalityBinding;", "tonalityBinding", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTonalityFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "SleepTonalityFragment";
    private static final int e = 50;
    private static final int f = 2;
    private static final int g = -1;
    private static final int h = 10;
    private static final double i = 0.5d;

    @NotNull
    private static final String j = "https://api.huami.com/t/c166c";

    @NotNull
    private static final String k = "https://api.huami.com/t/05cca";

    @NotNull
    private static final String l = "dateKey";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepTonalityViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ItemSleepTonalityBinding itemSleepTonalityBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy tonalityChartHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/SleepTonalityFragment$Companion;", "", "", "date", "Lcom/huami/sleep/daysleep/tonality/SleepTonalityFragment;", "newInstance", "", "DEFAULT_TONALITY_MIN_VALUE", LogUtil.I, "DIVIDE_NUM_TEN", "FEELING_H5", "Ljava/lang/String;", "", "HALF_ALPHA", LogUtil.D, "INVALID_SIGN", "KEY_DATE", "TAG", "TONALITY_DESC_H5", "TWO", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepTonalityFragment newInstance(@NotNull String date) {
            SleepTonalityFragment sleepTonalityFragment = new SleepTonalityFragment();
            Bundle bundle = new Bundle();
            bundle.putString("dateKey", date);
            sleepTonalityFragment.setArguments(bundle);
            return sleepTonalityFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            KoinExtKt.getWebService().launch(new WebItem(SleepTonalityFragment.k));
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_TONALITY_QUESTION);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            KoinExtKt.getWebService().launch(new WebItem(SleepTonalityFragment.j));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillContinueText continueCountText = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillContinueText continueCountText = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "keyDate = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<TonalityChartHelper> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TonalityChartHelper getA() {
            return new TonalityChartHelper(SleepTonalityFragment.this.requireContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepTonalityFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.tonality.SleepTonalityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sleepTonalityViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepTonalityViewModel>() { // from class: com.huami.sleep.daysleep.tonality.SleepTonalityFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.daysleep.tonality.SleepTonalityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SleepTonalityViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepTonalityViewModel.class), function0, objArr);
            }
        });
        this.tonalityChartHelper = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final void A(String dateKey, boolean showRating) {
        boolean z = false;
        boolean zIsToday = dateKey == null ? false : SportDay.fromString(dateKey).isToday();
        ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityDivide, zIsToday);
        ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityVocationGroup, zIsToday && !showRating);
        Group group = getItemSleepTonalityBinding().tonalityRatingGroup;
        if (zIsToday && showRating) {
            z = true;
        }
        ViewExKt.setVisible(group, z);
        ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityNoRatingSpace, !zIsToday);
        C(getItemSleepTonalityBinding().tonalityCommentRatingBar.getRating());
    }

    public static /* synthetic */ void B(SleepTonalityFragment sleepTonalityFragment, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        sleepTonalityFragment.A(str, z);
    }

    private final void C(float rating) {
        if (rating == 1.0f) {
            v(getResources().getString(R.string.sleep_sky_comment_very_bad), true);
            return;
        }
        if (rating == 2.0f) {
            v(getResources().getString(R.string.sleep_sky_comment_common), true);
            return;
        }
        if (rating == 3.0f) {
            v(getResources().getString(R.string.sleep_sky_comment_common), true);
            return;
        }
        if (rating == 4.0f) {
            v(getResources().getString(R.string.sleep_sky_comment_good), true);
            return;
        }
        if (rating == 5.0f) {
            v(getResources().getString(R.string.sleep_sky_comment_very_good), true);
        } else {
            v("", false);
        }
    }

    private final void D() {
        getItemSleepTonalityBinding().tonalityCommentRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: d37
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
                SleepTonalityFragment.E(this.a, ratingBar, f2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SleepTonalityFragment sleepTonalityFragment, RatingBar ratingBar, float f2, boolean z) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect() && f2 > 0.0f) {
            IconToast.showError(KoinExtKt.getAppContext(), sleepTonalityFragment.getResources().getString(R.string.sleep_no_net));
            sleepTonalityFragment.F();
            return;
        }
        sleepTonalityFragment.C(f2);
        boolean z2 = false;
        if (1.0f <= f2 && f2 <= 5.0f) {
            z2 = true;
        }
        if (z2) {
            sleepTonalityFragment.getItemSleepTonalityBinding().tonalityCommentRatingBar.setIsIndicator(true);
            sleepTonalityFragment.x().reportRatingToCloud((int) f2);
        }
    }

    private final void F() {
        getItemSleepTonalityBinding().tonalityCommentRatingBar.setRating(0.0f);
        getItemSleepTonalityBinding().tonalityCommentRatingBar.setIsIndicator(false);
    }

    private final void g() {
        x().getShowSleepTonality().observe(getViewLifecycleOwner(), new Observer() { // from class: i37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepTonalityFragment.h(this.a, (Boolean) obj);
            }
        });
        x().getSleepTonalityDataLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: e37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws Exception {
                SleepTonalityFragment.i(this.a, (SleepTonalityBean) obj);
            }
        });
        x().getDaySportLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: f37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepTonalityFragment.j(this.a, (SleepInfo) obj);
            }
        });
        x().getHadRating().observe(getViewLifecycleOwner(), new Observer() { // from class: h37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepTonalityFragment.k(this.a, (Boolean) obj);
            }
        });
        x().getReportSuccess().observe(getViewLifecycleOwner(), new Observer() { // from class: g37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepTonalityFragment.l(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SleepTonalityFragment sleepTonalityFragment, Boolean bool) {
        ViewExKt.setVisible(sleepTonalityFragment.getItemSleepTonalityBinding().getRoot(), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SleepTonalityFragment sleepTonalityFragment, SleepTonalityBean sleepTonalityBean) throws Exception {
        ViewExKt.setVisible(sleepTonalityFragment.getItemSleepTonalityBinding().getRoot(), sleepTonalityBean != null);
        if (sleepTonalityBean == null) {
            return;
        }
        sleepTonalityFragment.q(sleepTonalityBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SleepTonalityFragment sleepTonalityFragment, SleepInfo sleepInfo) {
        sleepTonalityFragment.x().fetchSleepTonalityData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SleepTonalityFragment sleepTonalityFragment, Boolean bool) {
        sleepTonalityFragment.A(sleepTonalityFragment.x().getDayLiveData().getValue(), !bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SleepTonalityFragment sleepTonalityFragment, Boolean bool) {
        if (bool.booleanValue()) {
            IconToast.showSuccess(KoinExtKt.getAppContext(), sleepTonalityFragment.getResources().getString(R.string.sleep_sky_thanks_comment));
        } else {
            IconToast.showError(KoinExtKt.getAppContext(), sleepTonalityFragment.getResources().getString(R.string.sleep_sky_comment_failed));
            sleepTonalityFragment.F();
        }
    }

    private final void m() {
        ViewExKt.smartClick$default(getItemSleepTonalityBinding().tonalityQuestion, 0L, a.a, 1, null);
        ViewExKt.smartClick$default(getItemSleepTonalityBinding().tonalityVocation, 0L, b.a, 1, null);
    }

    private final int n(int targetInt) {
        boolean z = false;
        if (targetInt >= 0 && targetInt < 50) {
            z = true;
        }
        if (z) {
            return (targetInt / 10) * 10;
        }
        return 50;
    }

    private final void o(String continueCountText, boolean isToday) {
        HMLog.info(d, new c(continueCountText));
        if ((continueCountText == null || continueCountText.length() == 0) || !isToday) {
            ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityContinueDays, false);
            return;
        }
        try {
            ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityContinueDays, Integer.parseInt(continueCountText) > 1);
            getItemSleepTonalityBinding().tonalityContinueDays.setText(getString(R.string.sleep_tonality_continue_days, continueCountText));
        } catch (Exception e2) {
            HMLog.error$default(d, null, e2, new d(continueCountText), 2, null);
            ViewExKt.setVisible(getItemSleepTonalityBinding().tonalityContinueDays, true);
            getItemSleepTonalityBinding().tonalityContinueDays.setText(getString(R.string.sleep_tonality_continue_days, continueCountText));
        }
    }

    public static /* synthetic */ void p(SleepTonalityFragment sleepTonalityFragment, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        sleepTonalityFragment.o(str, z);
    }

    private final void q(SleepTonalityBean sleepTonalityBean) throws Exception {
        if (sleepTonalityBean.getBeToday()) {
            ConstraintLayout root = getItemSleepTonalityBinding().getRoot();
            CountEventBuilder countEventBuilder = new CountEventBuilder(SleepStatusAnalytics.EventId.SLP_TONALITY_FEELING_EXPOSE);
            countEventBuilder.setAnonymous(false);
            countEventBuilder.setIdentified(true);
            countEventBuilder.putExtras(q.mapOf(TuplesKt.to("wakeup_time", String.valueOf(sleepTonalityBean.getAwakeTimeIndex()))));
            Unit unit = Unit.INSTANCE;
            ExposureAnalyticsKt.addExposeAnalytics$default(root, countEventBuilder, getViewLifecycleOwner(), 0, 0.0f, 12, null);
        }
        t(sleepTonalityBean.getRelaxChartDataList(), n(sleepTonalityBean.getRelaxMinScore()), 100, sleepTonalityBean.getMusicListenTimeCount() == 0 ? -1 : sleepTonalityBean.getIntoSleepSignIndex());
        u(sleepTonalityBean.getRelaxStartTimeMS(), sleepTonalityBean.getRelaxEndTimeMS());
        o(sleepTonalityBean.getContinueListenDaysCount(), sleepTonalityBean.getBeToday());
        x().hadRatingByDateKey(sleepTonalityBean.getDayKey());
        LinearLayout linearLayout = getItemSleepTonalityBinding().tonalityListenLinear;
        long relaxStartTimeMS = sleepTonalityBean.getRelaxStartTimeMS() + 1;
        long relaxEndTimeMS = sleepTonalityBean.getRelaxEndTimeMS();
        long intoSleepTime = sleepTonalityBean.getIntoSleepTime();
        ViewExKt.setVisible(linearLayout, relaxStartTimeMS <= intoSleepTime && intoSleepTime <= relaxEndTimeMS);
        View view = getItemSleepTonalityBinding().tonalityInfoLinearDivide;
        long relaxStartTimeMS2 = sleepTonalityBean.getRelaxStartTimeMS() + 1;
        long relaxEndTimeMS2 = sleepTonalityBean.getRelaxEndTimeMS();
        long intoSleepTime2 = sleepTonalityBean.getIntoSleepTime();
        ViewExKt.setVisible(view, relaxStartTimeMS2 <= intoSleepTime2 && intoSleepTime2 <= relaxEndTimeMS2);
        s(sleepTonalityBean.getMusicPlayTimeCount());
        r(sleepTonalityBean.getMusicListenTimeCount());
    }

    private final void r(int listenCount) {
        if (listenCount != -1) {
            UnitTextView unitTextView = getItemSleepTonalityBinding().tonalityListenCount;
            String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(listenCount, requireContext(), false, false, 6, null);
            unitTextView.setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
        }
    }

    private final void s(int playCount) {
        if (playCount != -1) {
            UnitTextView unitTextView = getItemSleepTonalityBinding().tonalityPlayCount;
            String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(playCount, requireContext(), false, false, 6, null);
            unitTextView.setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
        }
    }

    private final void t(ChartDataList relaxChartDataList, int minRelaxScore, int maxRelaxScore, int intoSleepSignIndex) {
        if (relaxChartDataList == null) {
            return;
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i2 = (minRelaxScore + maxRelaxScore) / 2;
        sparseArray.put(0, new YAxisData(minRelaxScore, String.valueOf(minRelaxScore)));
        sparseArray.put(1, new YAxisData(i2, String.valueOf(i2)));
        sparseArray.put(2, new YAxisData(maxRelaxScore, String.valueOf(maxRelaxScore)));
        z().drawSleepTonalityChart(getItemSleepTonalityBinding().tonalityRelaxChart, relaxChartDataList, sparseArray, intoSleepSignIndex);
    }

    private final void u(long tonalityStartTime, long tonalityEndTime) {
        if (tonalityStartTime != -1) {
            getItemSleepTonalityBinding().tonalityRelaxStartTime.setText(TimeUtils.formatTime(getContext(), tonalityStartTime));
        }
        if (tonalityEndTime != -1) {
            getItemSleepTonalityBinding().tonalityRelaxEndTime.setText(TimeUtils.formatTime(getContext(), tonalityEndTime));
        }
    }

    private final void v(String feeling, boolean isHighColor) {
        getItemSleepTonalityBinding().tonalityCommentTips.setText(feeling);
        getItemSleepTonalityBinding().tonalityCommentTips.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), isHighColor ? R.color.s33 : R.color.s3)));
    }

    public static /* synthetic */ void w(SleepTonalityFragment sleepTonalityFragment, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        sleepTonalityFragment.v(str, z);
    }

    private final SleepTonalityViewModel x() {
        return (SleepTonalityViewModel) this.sleepTonalityViewModel.getValue();
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    private final ItemSleepTonalityBinding getItemSleepTonalityBinding() {
        return this.itemSleepTonalityBinding;
    }

    private final TonalityChartHelper z() {
        return (TonalityChartHelper) this.tonalityChartHelper.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.itemSleepTonalityBinding = ItemSleepTonalityBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return getItemSleepTonalityBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.itemSleepTonalityBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("dateKey");
        HMLog.info(d, new e(string));
        D();
        m();
        g();
        if (string == null) {
            return;
        }
        x().triggerDataFetch(string);
    }
}
