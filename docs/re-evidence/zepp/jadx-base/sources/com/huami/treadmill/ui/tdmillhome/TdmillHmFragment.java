package com.huami.treadmill.ui.tdmillhome;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.treadmill.R;
import com.huami.treadmill.data.BoltRecordStatics;
import com.huami.treadmill.eventbus.StatisticsRefreshEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.line.TdmillLinesActivity;
import com.huami.treadmill.ui.record.RecordActivity;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.treadmill.util.DataFormatter;
import com.huami.treadmill.util.DensityUtils;
import com.huami.treadmill.util.RecordKeeper;
import com.huami.widget.typeface.TypefaceTextView;
import com.tencent.connect.common.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010,¨\u00063"}, d2 = {"Lcom/huami/treadmill/ui/tdmillhome/TdmillHmFragment;", "Landroidx/fragment/app/Fragment;", "", "i", "o", DTransferConstants.SEARCH_KEY, "Lcom/huami/treadmill/data/BoltRecordStatics;", "it", GoogleApiAvailabilityLight.b, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroyView", "Lcom/huami/treadmill/eventbus/StatisticsRefreshEvent;", "refreshEvent", "onEventMainThread", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "a", "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmViewModel;", "viewmodel", "", "b", "Z", TdmillHmFragment.ARG_IS_OVERSEA, "c", TdmillHmFragment.ARG_IS_METRIC, "Landroidx/lifecycle/Observer;", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/Observer;", "observerNotUpload", "e", "observerBindStatus", "f", "observerStatics", "", "g", "Ljava/lang/String;", "AIRRUN_WEB", "h", "AIRRUN_WEB_OVERSEA", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillHmFragment extends Fragment {

    @NotNull
    public static final String ARG_IS_METRIC = "isMetric";

    @NotNull
    public static final String ARG_IS_OVERSEA = "isOversea";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TdmillHmViewModel viewmodel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isOversea;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Observer<Integer> observerNotUpload;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Observer<Boolean> observerBindStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Observer<BoltRecordStatics> observerStatics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String AIRRUN_WEB = "https://m.amazfit.com/products/airrun";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String AIRRUN_WEB_OVERSEA = "https://www.amazfit.com/en/airrun.html";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/treadmill/ui/tdmillhome/TdmillHmFragment$Companion;", "", "", "isOverSea", TdmillHmFragment.ARG_IS_METRIC, "Lcom/huami/treadmill/ui/tdmillhome/TdmillHmFragment;", "newInstance", "", "ARG_IS_METRIC", "Ljava/lang/String;", "ARG_IS_OVERSEA", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TdmillHmFragment newInstance(boolean isOverSea, boolean isMetric) {
            TdmillHmFragment tdmillHmFragment = new TdmillHmFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(TdmillHmFragment.ARG_IS_OVERSEA, isOverSea);
            bundle.putBoolean(TdmillHmFragment.ARG_IS_METRIC, isMetric);
            Unit unit = Unit.INSTANCE;
            tdmillHmFragment.setArguments(bundle);
            return tdmillHmFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "status", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            int i;
            View view = TdmillHmFragment.this.getView();
            TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.maintain_tip));
            if (z) {
                i = 0;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    private final void i() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.not_uploaded))).setOnClickListener(new View.OnClickListener() { // from class: ll7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TdmillHmFragment.j(this.a, view2);
            }
        });
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.btn_detail))).setOnClickListener(new View.OnClickListener() { // from class: jl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TdmillHmFragment.k(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.btn_look_more))).setOnClickListener(new View.OnClickListener() { // from class: ml7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                TdmillHmFragment.l(this.a, view4);
            }
        });
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.maintain_tip) : null)).setOnClickListener(new View.OnClickListener() { // from class: kl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                TdmillHmFragment.m(this.a, view5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TdmillHmFragment tdmillHmFragment, View view) {
        Intent intent = new Intent(tdmillHmFragment.getContext(), (Class<?>) RecordActivity.class);
        intent.putExtra(ARG_IS_OVERSEA, tdmillHmFragment.isOversea);
        intent.putExtra(ARG_IS_METRIC, tdmillHmFragment.isMetric);
        tdmillHmFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TdmillHmFragment tdmillHmFragment, View view) {
        if (tdmillHmFragment.isOversea) {
            ProxyTreadmill.INSTANCE.getInstance().launchWeb(tdmillHmFragment.getContext(), tdmillHmFragment.AIRRUN_WEB_OVERSEA);
        } else {
            ProxyTreadmill.INSTANCE.getInstance().launchWeb(tdmillHmFragment.getContext(), tdmillHmFragment.AIRRUN_WEB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TdmillHmFragment tdmillHmFragment, View view) {
        tdmillHmFragment.startActivity(new Intent(tdmillHmFragment.getContext(), (Class<?>) TdmillLinesActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TdmillHmFragment tdmillHmFragment, View view) {
        ProxyTreadmill.INSTANCE.getInstance().launchWeb(tdmillHmFragment.getContext(), HMServerDef.getUrl("t/mifit.play.watch.600"));
    }

    private final void n(BoltRecordStatics it2) {
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.cumulative_number))).setText(String.valueOf(it2.getCount()));
        View view2 = getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.calories))).setText(String.valueOf((int) it2.getCalories()));
        String rawKilometerToFormatKilometer = DataFormatter.INSTANCE.parseRawKilometerToFormatKilometer(RunDataConversion.convertMeterToKmOrMile(it2.getDistance(), this.isMetric));
        View view3 = getView();
        ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.total_dis_unit))).setText(this.isMetric ? R.string.td_total_dis_kilometer : R.string.td_total_dis_mile);
        View view4 = getView();
        ((TypefaceTextView) (view4 != null ? view4.findViewById(R.id.total_dis) : null)).setText(rawKilometerToFormatKilometer);
        RecordKeeper.INSTANCE.setBoltRecordData(getContext(), it2);
    }

    @JvmStatic
    @NotNull
    public static final TdmillHmFragment newInstance(boolean z, boolean z2) {
        return INSTANCE.newInstance(z, z2);
    }

    private final void o() {
        final TdHmAdapter tdHmAdapter = new TdHmAdapter();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        boolean z = true;
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setLayoutManager(linearLayoutManager);
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null)).setAdapter(tdHmAdapter);
        List<String> promotionIds = ProxyBoltTrackRecord.INSTANCE.getInstance().getPromotionIds();
        if (promotionIds != null && !promotionIds.isEmpty()) {
            z = false;
        }
        if (z) {
            return;
        }
        TdmillHmViewModel tdmillHmViewModel = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel);
        tdmillHmViewModel.getTdmillLines().observe(this, new Observer() { // from class: ql7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TdmillHmFragment.p(this.a, tdHmAdapter, (PagedList) obj);
            }
        });
        TdmillHmViewModel tdmillHmViewModel2 = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel2);
        tdmillHmViewModel2.showLines(Constants.VIA_REPORT_TYPE_WPA_STATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TdmillHmFragment tdmillHmFragment, TdHmAdapter tdHmAdapter, PagedList pagedList) {
        View view = tdmillHmFragment.getView();
        ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.td_lines))).setVisibility(0);
        if (pagedList.size() != 0) {
            tdHmAdapter.setData(pagedList);
        } else {
            View view2 = tdmillHmFragment.getView();
            ((ConstraintLayout) (view2 != null ? view2.findViewById(R.id.td_lines) : null)).setVisibility(8);
        }
    }

    private final void q() {
        String boltRecordData = RecordKeeper.INSTANCE.getBoltRecordData(getContext());
        int i = 0;
        if (!m.equals$default(boltRecordData, "", false, 2, null)) {
            n((BoltRecordStatics) HMHttpUtils.getGson().fromJson(boltRecordData, BoltRecordStatics.class));
        }
        this.observerStatics = new Observer() { // from class: nl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TdmillHmFragment.r(this.a, (BoltRecordStatics) obj);
            }
        };
        this.observerNotUpload = new Observer() { // from class: pl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TdmillHmFragment.s(this.a, (Integer) obj);
            }
        };
        this.observerBindStatus = new Observer() { // from class: ol7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TdmillHmFragment.t(this.a, (Boolean) obj);
            }
        };
        TdmillHmViewModel tdmillHmViewModel = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel);
        tdmillHmViewModel.getBoltRecordStatics().observeForever(this.observerStatics);
        TdmillHmViewModel tdmillHmViewModel2 = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel2);
        tdmillHmViewModel2.getNot_upload().observeForever(this.observerNotUpload);
        TdmillHmViewModel tdmillHmViewModel3 = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel3);
        tdmillHmViewModel3.isBinding().observeForever(this.observerBindStatus);
        View view = getView();
        TextView textView = (TextView) (view != null ? view.findViewById(R.id.maintain_tip) : null);
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        boolean zBooleanValue = companion.getInstance().getMaintainStatus().booleanValue();
        if (!zBooleanValue) {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        textView.setVisibility(i);
        companion.getInstance().setMaintainStatusListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(TdmillHmFragment tdmillHmFragment, BoltRecordStatics boltRecordStatics) {
        tdmillHmFragment.n(boltRecordStatics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(TdmillHmFragment tdmillHmFragment, Integer num) {
        int i;
        View view = tdmillHmFragment.getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.not_uploaded));
        boolean z = num.intValue() > 0;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        textView.setVisibility(i);
        View view2 = tdmillHmFragment.getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.not_uploaded) : null)).setText(tdmillHmFragment.getContext().getResources().getQuantityString(R.plurals.tdmill_not_upload_upgrade, num.intValue(), num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(TdmillHmFragment tdmillHmFragment, Boolean bool) {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        View view = tdmillHmFragment.getView();
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) (view == null ? null : view.findViewById(R.id.status_binding));
        int i2 = 8;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i = 0;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        linearLayoutCompat.setVisibility(i);
        View view2 = tdmillHmFragment.getView();
        LinearLayout linearLayout = (LinearLayout) (view2 == null ? null : view2.findViewById(R.id.status_unbinding));
        boolean zBooleanValue = bool.booleanValue();
        if (!zBooleanValue) {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (bool.booleanValue()) {
            TdmillHmViewModel tdmillHmViewModel = tdmillHmFragment.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel);
            tdmillHmViewModel.getBoltStatisticsInfo();
            TdmillHmViewModel tdmillHmViewModel2 = tdmillHmFragment.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel2);
            tdmillHmViewModel2.getNoOwnerNum();
            tdmillHmFragment.o();
            return;
        }
        View view3 = tdmillHmFragment.getView();
        ((LinearLayout) (view3 == null ? null : view3.findViewById(R.id.status_unbinding))).measure(-1, -2);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = tdmillHmFragment.getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        View view4 = tdmillHmFragment.getView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((LinearLayout) (view4 == null ? null : view4.findViewById(R.id.status_unbinding))).getLayoutParams());
        if (tdmillHmFragment.isOversea) {
            layoutParams.topMargin = 0;
        } else {
            int i3 = displayMetrics.heightPixels;
            View view5 = tdmillHmFragment.getView();
            layoutParams.topMargin = (i3 - ((LinearLayout) (view5 == null ? null : view5.findViewById(R.id.status_unbinding))).getMeasuredHeight()) - DensityUtils.INSTANCE.dip2px(tdmillHmFragment.getContext(), 376.0f);
        }
        DensityUtils densityUtils = DensityUtils.INSTANCE;
        layoutParams.setMarginStart(densityUtils.dip2px(tdmillHmFragment.getContext(), 15.0f));
        layoutParams.setMarginEnd(densityUtils.dip2px(tdmillHmFragment.getContext(), 15.0f));
        View view6 = tdmillHmFragment.getView();
        ((LinearLayout) (view6 != null ? view6.findViewById(R.id.status_unbinding) : null)).setLayoutParams(layoutParams);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        View viewInflate = inflater.inflate(R.layout.fragment_treadmill, container, false);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.viewmodel = (TdmillHmViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, TdmillHmViewModel.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isOversea = arguments.getBoolean(ARG_IS_OVERSEA, false);
            this.isMetric = arguments.getBoolean(ARG_IS_METRIC, false);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroyView();
        Observer<BoltRecordStatics> observer = this.observerStatics;
        if (observer != null) {
            TdmillHmViewModel tdmillHmViewModel = this.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel);
            tdmillHmViewModel.getBoltRecordStatics().removeObserver(observer);
        }
        Observer<Integer> observer2 = this.observerNotUpload;
        if (observer2 != null) {
            TdmillHmViewModel tdmillHmViewModel2 = this.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel2);
            tdmillHmViewModel2.getNot_upload().removeObserver(observer2);
        }
        Observer<Boolean> observer3 = this.observerBindStatus;
        if (observer3 == null) {
            return;
        }
        TdmillHmViewModel tdmillHmViewModel3 = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel3);
        tdmillHmViewModel3.isBinding().removeObserver(observer3);
    }

    public final void onEventMainThread(@NotNull StatisticsRefreshEvent refreshEvent) {
        if (Intrinsics.areEqual(refreshEvent.getSectionRefresh(), StatisticsRefreshEvent.SECTION_NUM_REFRESH)) {
            TdmillHmViewModel tdmillHmViewModel = this.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel);
            tdmillHmViewModel.getNoOwnerNum();
        } else {
            TdmillHmViewModel tdmillHmViewModel2 = this.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel2);
            tdmillHmViewModel2.getBoltStatisticsInfo();
            TdmillHmViewModel tdmillHmViewModel3 = this.viewmodel;
            Objects.requireNonNull(tdmillHmViewModel3);
            tdmillHmViewModel3.getNoOwnerNum();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        q();
        i();
        TdmillHmViewModel tdmillHmViewModel = this.viewmodel;
        Objects.requireNonNull(tdmillHmViewModel);
        tdmillHmViewModel.getBindStatus();
        o();
    }
}
