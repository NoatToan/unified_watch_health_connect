package com.xiaomi.fitness.health.stress;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.StressEntry;
import com.xiaomi.fitness.chart.view.ScrollChartRecycleView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import com.xiaomi.fitness.util.StressDataUtil;
import defpackage.cko;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.nrd;
import defpackage.onq;
import defpackage.rtr;
import defpackage.s69;
import defpackage.sja;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\rJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressDayItemFragment;", "Lcom/xiaomi/fitness/health/stress/StressDayWeekMonthItemFragment;", "Lcom/xiaomi/fitness/health/stress/StressViewModel;", "Lsja;", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "mBarEntries", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "createStressEntries", "(Ljava/util/List;)Ljava/util/List;", "", "initViewBinding", "()V", "onInvisible", "initStressFaceChart", "refreshStressFaceView", "mChartEntries", "Ljava/util/List;", "Lufe;", "mLineChartAdapter", "Lufe;", "", "getFragmentPosition", "()I", "fragmentPosition", "getLayoutId", "layoutId", "<init>", "StressXAxisDayFormatter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStressDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDayItemFragment.kt\ncom/xiaomi/fitness/health/stress/StressDayItemFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1872#2,3:234\n1872#2,3:237\n*S KotlinDebug\n*F\n+ 1 StressDayItemFragment.kt\ncom/xiaomi/fitness/health/stress/StressDayItemFragment\n*L\n156#1:234,3\n184#1:237,3\n*E\n"})
public final class StressDayItemFragment extends Hilt_StressDayItemFragment<StressViewModel, sja> {
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    @NotNull
    private final List<MaxMinEntry> mChartEntries = new ArrayList();
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressDayItemFragment$StressXAxisDayFormatter;", "Lonq;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class StressXAxisDayFormatter extends onq {
        @Override // defpackage.onq
        @NotNull
        public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
            Intrinsics.checkNotNullParameter(barEntry, "barEntry");
            return barEntry.type == 2 ? TimeDateUtil.getDateStr(barEntry.timestamp, TimeUtils.FORMAT_H_M) : "";
        }
    }

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("StressDayItemFragment.kt", StressDayItemFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.stress.StressDayItemFragment", "", "", "", "void"), 58);
    }

    private final List<MaxMinEntry> createStressEntries(List<SegmentBarEntry> mBarEntries) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        SegmentBarEntry segmentBarEntry = null;
        for (Object obj : mBarEntries) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SegmentBarEntry segmentBarEntry2 = (SegmentBarEntry) obj;
            if (i2 % 2 != 0) {
                StressEntry.Companion companion = StressEntry.INSTANCE;
                Intrinsics.checkNotNull(segmentBarEntry);
                float y = segmentBarEntry.getY();
                Intrinsics.checkNotNull(segmentBarEntry2);
                int stressType = companion.getStressType((int) ((y + segmentBarEntry2.getY()) / 2), StressDataUtil.INSTANCE.getDeviceType());
                if (stressType == 0) {
                    i = 5;
                } else if (stressType != 1) {
                    i = 25;
                    if (stressType != 2 && stressType == 3) {
                        i = 35;
                    }
                } else {
                    i = 15;
                }
                Logger.i("StressDayItemFragment", "createStressEntries = " + i);
                MaxMinEntry maxMinEntry = new MaxMinEntry((float) i2, (float) i, segmentBarEntry2.timestamp, 5);
                maxMinEntry.localDate = TimeDateUtil.timestampToLocalDate(segmentBarEntry2.timestamp);
                arrayList.add(maxMinEntry);
                segmentBarEntry = null;
            } else {
                segmentBarEntry = segmentBarEntry2;
            }
            i2 = i3;
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public int getFragmentPosition() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.H1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void initStressFaceChart() {
        vfe vfeVar = (vfe) ((sja) getMBinding()).N.mAttrs;
        Context context = getContext();
        vfeVar.c = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 8 : 18;
        this.mChartEntries.clear();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), vfeVar);
        rtr rtrVar = new rtr(vfeVar);
        rtrVar.f = 4;
        rtrVar.setAxisMaximum(40.0f);
        vfeVar.J = BaseFragmentExtKt.getColor(this, iji.m2);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c, new StressXAxisDayFormatter());
        ((sja) getMBinding()).N.addItemDecoration(new cko(rtrVar, vqrVar, vfeVar));
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, ((sja) getMBinding()).N, vqrVar, vfeVar, new StressFaceValueFormatter(4));
        ScrollChartRecycleView scrollChartRecycleView = ((sja) getMBinding()).N;
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
            ufeVar = null;
        }
        scrollChartRecycleView.setAdapter(ufeVar);
        ((sja) getMBinding()).N.setLayoutManager(speedRatioLayoutManager);
        ((sja) getMBinding()).N.setNestedScrollingEnabled(false);
        ((sja) getMBinding()).N.addOnItemTouchListener(new hak(getActivity(), ((sja) getMBinding()).N, new xcm() { // from class: com.xiaomi.fitness.health.stress.StressDayItemFragment$initStressFaceChart$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.getScrollX();
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.isRightScrollInner = dx < 0;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void initViewBinding() {
        setContainerView(((sja) getMBinding()).M);
        setMBarChartRecyclerView(((sja) getMBinding()).A);
        setRecyclerDetail(((sja) getMBinding()).L.C);
        setRecyclerStressDistribute(((sja) getMBinding()).L.D);
        setMDeviceListView(((sja) getMBinding()).L.A);
        setUnderstandCard(((sja) getMBinding()).L.E);
        setDataTitleView(((sja) getMBinding()).B);
        setHealthBannerCardSetView(((sja) getMBinding()).L.B);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "stress_detail_page", "page_fragment", "day", "title", "压力"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        try {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
            Object[] objArr = new Object[8];
            objArr[0] = "name";
            objArr[1] = "stress_detail_page";
            objArr[2] = "page_fragment";
            objArr[3] = "day";
            objArr[4] = "title";
            objArr[5] = "压力";
            objArr[6] = "data";
            objArr[7] = getMDailyStressReport() == null ? "0" : "1";
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$0;
            if (annotation2 == null) {
                Method declaredMethod = StressDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$0;
            if (annotation == null) {
                annotation = StressDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
                ajc$anno$0 = annotation;
            }
            oneTrackReportAspectAspectOf.oneTrackReportPageView(nrdVarB, (OneTrackReport) annotation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment
    public void refreshStressFaceView() {
        List<MaxMinEntry> faceBarChartEntries = StressDataUtil.INSTANCE.getFaceBarChartEntries(getMDailyStressReport(), getMBarChartAttrs(), getFragmentPosition(), getMCurrentLocalDate());
        this.mChartEntries.clear();
        List<MaxMinEntry> list = faceBarChartEntries;
        this.mChartEntries.addAll(list);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineChartAdapter");
            ufeVar = null;
        }
        ufeVar.notifyDataSetChanged();
        if (!list.isEmpty()) {
            int i = 0;
            for (Object obj : faceBarChartEntries) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (((MaxMinEntry) obj).getY() != 0.0f) {
                    int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i + 7, faceBarChartEntries.size() - 1);
                    while (iCoerceAtMost < faceBarChartEntries.size() && faceBarChartEntries.get(iCoerceAtMost).getY() == 0.0f) {
                        iCoerceAtMost--;
                    }
                    int i3 = iCoerceAtMost - i;
                    int i4 = (i3 + 1 != 8 && i < 16) ? (i - ((8 - i3) / 2)) + 1 : i;
                    Logger.i(StressDayWeekMonthItemFragment.TAG, "scrollToPosition = " + i + " last = " + iCoerceAtMost + " scrollIndex = " + i4);
                    ((sja) getMBinding()).N.scrollToPosition(i4);
                    return;
                }
                i = i2;
            }
        }
    }
}
