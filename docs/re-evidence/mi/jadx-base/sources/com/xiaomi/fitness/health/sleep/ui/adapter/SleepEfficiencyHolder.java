package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.GoToBedTimeCalibrateFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepDayFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepDayItemFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder;
import com.xiaomi.fitness.health.sleep.view.widget.SleepStageProgressBarView;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b1\u00102JY\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n \u001e*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010%\u001a\n \u001e*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n \u001e*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010 R\u0014\u0010/\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00100\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010 ¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyHolder;", "", "Ls7r;", "packet", "", "needResponse", "", "method", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "", "successCallback", "", "failureCallback", "deviceApiCall", "(Ls7r;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDayReport", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope", "updateSleepSegmentReport", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "efficiencyTv", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "efficiencyDetailRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView;", "stageProgressBar", "Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView;", "validDataView", "Landroidx/appcompat/widget/AppCompatTextView;", "titleDrawable", "Landroidx/appcompat/widget/AppCompatTextView;", "highPrecisionOffView", "goTurnOnHighPrecisionBtn", "entryDurationNotDetectedView", "<init>", "(Landroid/view/View;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepEfficiencyHolder {

    @NotNull
    public static final String KEY_ALL_DAY_SLEEP_TIMESTAMP = "all_day_sleep_timestamp";

    @NotNull
    public static final String KEY_SLEEP_SEGMENT_REPORT = "sleep_segment_report";

    @NotNull
    public static final String TAG = "SleepEfficiencyHolder";
    private final ConstraintLayout container;
    private final RecyclerView efficiencyDetailRecycler;
    private final TextView efficiencyTv;

    @NotNull
    private final ConstraintLayout entryDurationNotDetectedView;

    @NotNull
    private final TextView goTurnOnHighPrecisionBtn;

    @NotNull
    private final ConstraintLayout highPrecisionOffView;

    @NotNull
    private final View itemView;
    private final SleepStageProgressBarView stageProgressBar;

    @NotNull
    private final AppCompatTextView titleDrawable;

    @NotNull
    private final ConstraintLayout validDataView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder$deviceApiCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyHolder$deviceApiCall$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $failureCallback;
        final /* synthetic */ String $method;
        final /* synthetic */ Function1<SyncResult, Unit> $successCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super SyncResult, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$method = str;
            this.$successCallback = function1;
            this.$failureCallback = function2;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, int code) {
            AnyExtKt.main$default(null, new SleepEfficiencyHolder$deviceApiCall$1$onError$1(this.$method, type, did, code, this.$failureCallback, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, SyncResult result) {
            AnyExtKt.main$default(null, new SleepEfficiencyHolder$deviceApiCall$1$onSuccess$1(result, this.$method, this.$successCallback, this, did, type, this.$failureCallback, null), 1, null);
        }
    }

    public SleepEfficiencyHolder(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
        this.container = (ConstraintLayout) itemView.findViewById(eri.V1);
        this.efficiencyTv = (TextView) itemView.findViewById(eri.A4);
        this.efficiencyDetailRecycler = (RecyclerView) itemView.findViewById(eri.Nf);
        this.stageProgressBar = (SleepStageProgressBarView) itemView.findViewById(eri.Dg);
        View viewFindViewById = itemView.findViewById(eri.Oo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.validDataView = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(eri.cj);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleDrawable = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(eri.O6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.highPrecisionOffView = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(eri.p5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.goTurnOnHighPrecisionBtn = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(eri.Q4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.entryDurationNotDetectedView = (ConstraintLayout) viewFindViewById5;
    }

    private final void deviceApiCall(s7r packet, boolean needResponse, String method, Function1<? super SyncResult, Unit> successCallback, Function1<? super Integer, Unit> failureCallback) {
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), packet, needResponse, new AnonymousClass1(method, successCallback, failureCallback), 0, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deviceApiCall$default(SleepEfficiencyHolder sleepEfficiencyHolder, s7r s7rVar, boolean z, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        sleepEfficiencyHolder.deviceApiCall(s7rVar, z, str, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepSegmentReport$lambda$0(AppCompatTextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepEfficiencyUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepSegmentReport$lambda$3(LifecycleCoroutineScope lifecycleScope, SleepEfficiencyHolder this$0, SyncResult it) {
        ur9 ur9VarU;
        ls9 ls9VarZ;
        Intrinsics.checkNotNullParameter(lifecycleScope, "$lifecycleScope");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        s7r packet = it.getPacket();
        if (packet != null && (ur9VarU = packet.u()) != null && (ls9VarZ = ur9VarU.z()) != null) {
            ls9.a aVar = ls9VarZ.j;
            boolean z = false;
            if (aVar != null && aVar.c) {
                z = true;
            }
            Logger.i(TAG, "updateSleepSegmentReport assistSleepOn=" + z);
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1(z, this$0, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepSegmentReport$lambda$4(SleepEfficiencyHolder this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout container = this$0.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.gone(container);
        return Unit.INSTANCE;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    public final void updateSleepSegmentReport(@NotNull SleepSegmentReport segmentReport, @NotNull AllDaySleepReport allDayReport, @NotNull final LifecycleCoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        Intrinsics.checkNotNullParameter(allDayReport, "allDayReport");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Logger.i(TAG, "updateSleepSegmentReport segmentReport=" + segmentReport);
        ViewExtKt.clickWithTrigger$default(this.titleDrawable, 0L, new Function1() { // from class: dmm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepEfficiencyHolder.updateSleepSegmentReport$lambda$0((AppCompatTextView) obj);
            }
        }, 1, null);
        Integer sleepEfficiency = segmentReport.getSleepEfficiency();
        boolean z = false;
        if (sleepEfficiency == null || sleepEfficiency.intValue() <= 0) {
            long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SLEEP_EFFICIENCY)) {
                z = true;
            }
            Logger.i(TAG, "zeroTimeInSec=" + todayZeroTimeInSec + " supportSleepEfficiency=" + z + " ");
            if (allDayReport.getTimeStamp() != todayZeroTimeInSec || !z) {
                ConstraintLayout container = this.container;
                Intrinsics.checkNotNullExpressionValue(container, "container");
                ViewExtKt.gone(container);
                return;
            }
            ConstraintLayout container2 = this.container;
            Intrinsics.checkNotNullExpressionValue(container2, "container");
            ViewExtKt.visible(container2);
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 10;
            deviceApiCall(s7rVar, true, "loadSleepSettingSwitch", new Function1() { // from class: emm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepEfficiencyHolder.updateSleepSegmentReport$lambda$3(lifecycleScope, this, (SyncResult) obj);
                }
            }, new Function1() { // from class: fmm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepEfficiencyHolder.updateSleepSegmentReport$lambda$4(this.f17933a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        ConstraintLayout container3 = this.container;
        Intrinsics.checkNotNullExpressionValue(container3, "container");
        ViewExtKt.visible(container3);
        ViewExtKt.visible(this.validDataView);
        ViewExtKt.gone(this.highPrecisionOffView);
        ViewExtKt.gone(this.entryDurationNotDetectedView);
        TextView textView = this.efficiencyTv;
        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numValueOf = Integer.valueOf(c0j.xf);
        Integer sleepEfficiency2 = segmentReport.getSleepEfficiency();
        textView.setText(styledStringUtils.getStyledString(context, numValueOf, (474 & 2) != 0 ? null : null, (List<StyledStringUtils.StyledArg>) ((474 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Integer.valueOf(sleepEfficiency2 != null ? sleepEfficiency2.intValue() : 0), new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(SpanPropKey.FONT_SIZE, "220%")))))), (474 & 8) != 0, (474 & 16) != 0 ? Locale.getDefault() : null, (474 & 32) != 0, (474 & 64) != 0 ? null : null, (Map<String, StyledStringUtils.CssStyle>) ((474 & 128) != 0 ? MapsKt__MapsKt.emptyMap() : null), (List<StyledStringUtils.SegmentStyle>) ((474 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null)));
        SleepEfficiencyDetailAdapter sleepEfficiencyDetailAdapter = new SleepEfficiencyDetailAdapter(allDayReport.getTimeStamp());
        sleepEfficiencyDetailAdapter.setOnItemClickListener(new SleepEfficiencyDetailAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder.updateSleepSegmentReport.2
            @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyDetailAdapter.OnItemClickListener
            public void onItemClick(SleepSegmentReport segmentReport2, long allDaySleepTimestampInSec) {
                Object next;
                Fragment fragment;
                Fragment fragment2;
                FragmentManager childFragmentManager;
                List<Fragment> listY0;
                Fragment fragmentPrevious;
                FragmentManager childFragmentManager2;
                List<Fragment> listY1;
                Object next2;
                Intrinsics.checkNotNullParameter(segmentReport2, "segmentReport");
                Bundle bundle = new Bundle();
                bundle.putSerializable(SleepEfficiencyHolder.KEY_SLEEP_SEGMENT_REPORT, segmentReport2);
                bundle.putLong(SleepEfficiencyHolder.KEY_ALL_DAY_SLEEP_TIMESTAMP, allDaySleepTimestampInSec);
                Context context2 = SleepEfficiencyHolder.this.getItemView().getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                List<Fragment> listY2 = ((FragmentActivity) context2).getSupportFragmentManager().y0();
                Intrinsics.checkNotNullExpressionValue(listY2, "getFragments(...)");
                Iterator<T> it = listY2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Fragment) next) instanceof SleepFragment));
                SleepFragment sleepFragment = next instanceof SleepFragment ? (SleepFragment) next : null;
                if (sleepFragment == null || (childFragmentManager2 = sleepFragment.getChildFragmentManager()) == null || (listY1 = childFragmentManager2.y0()) == null) {
                    fragment = null;
                } else {
                    Iterator<T> it2 = listY1.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!(((Fragment) next2) instanceof SleepDayFragment));
                    fragment = (Fragment) next2;
                }
                SleepDayFragment sleepDayFragment = fragment instanceof SleepDayFragment ? (SleepDayFragment) fragment : null;
                if (sleepDayFragment == null || (childFragmentManager = sleepDayFragment.getChildFragmentManager()) == null || (listY0 = childFragmentManager.y0()) == null) {
                    fragment2 = null;
                } else {
                    ListIterator<Fragment> listIterator = listY0.listIterator(listY0.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            fragmentPrevious = null;
                            break;
                        }
                        fragmentPrevious = listIterator.previous();
                    } while (!(fragmentPrevious instanceof SleepDayItemFragment));
                    fragment2 = fragmentPrevious;
                }
                SleepDayItemFragment sleepDayItemFragment = fragment2 instanceof SleepDayItemFragment ? (SleepDayItemFragment) fragment2 : null;
                ActivityResultLauncher<Intent> resultLauncherForSleepEfficiencyCard = sleepDayItemFragment != null ? sleepDayItemFragment.getResultLauncherForSleepEfficiencyCard() : null;
                if (resultLauncherForSleepEfficiencyCard != null) {
                    Context context3 = SleepEfficiencyHolder.this.getItemView().getContext();
                    Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type android.app.Activity");
                    UtilsKt.gotoPageForResult$default((Activity) context3, GoToBedTimeCalibrateFragment.class, bundle, resultLauncherForSleepEfficiencyCard, false, 16, null);
                } else {
                    Context context4 = SleepEfficiencyHolder.this.getItemView().getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    UtilsKt.gotoPage$default(context4, GoToBedTimeCalibrateFragment.class, bundle, false, 8, null);
                }
            }
        });
        this.efficiencyDetailRecycler.setAdapter(sleepEfficiencyDetailAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.itemView.getContext(), 7);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder.updateSleepSegmentReport.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                if (position == 0) {
                    return 3;
                }
                if (position != 1) {
                    return position != 2 ? 0 : 3;
                }
                return 1;
            }
        });
        RecyclerView efficiencyDetailRecycler = this.efficiencyDetailRecycler;
        Intrinsics.checkNotNullExpressionValue(efficiencyDetailRecycler, "efficiencyDetailRecycler");
        ItemDecorationExtKt.clearAllItemDecorations(efficiencyDetailRecycler);
        this.efficiencyDetailRecycler.setLayoutManager(gridLayoutManager);
        this.efficiencyDetailRecycler.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(10), 0.0f, false));
        sleepEfficiencyDetailAdapter.updateSegmentReport(segmentReport);
        this.stageProgressBar.updateSleepSegmentReport(segmentReport);
    }
}
