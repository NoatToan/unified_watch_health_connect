package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.PostMealBSDiff;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.BloodGlucoseHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerDayItemFragment;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.e3a;
import defpackage.jui;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.s13;
import defpackage.sf2;
import defpackage.ux2;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 w2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001wB\u0007¢\u0006\u0004\bv\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010ER$\u0010^\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010T\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\u0018\u0010a\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010[R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ER$\u0010c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010/\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010i\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010o\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010/\u001a\u0004\bp\u0010e\"\u0004\bq\u0010gR\u0014\u0010u\u001a\u00020r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFingerDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Le3a;", "", "refreshViewOnReportChanged", "()V", "initViewBinding", "initView", "initUnderstandView", "initLineChartRecyclerView", "refreshBarChart", "initPointLineColor", "initDetailCard", "updateRecyclerLayoutManager", "refreshDetailCard", "initDetailFingerCard", "updateRecyclerFingerLayoutManager", "refreshDetailFingerCard", Constants.KEY_REQUEST_DATA, "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "mBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "", "MODEL_CGM", "Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "mCurrentDate", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "containerView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lux2;", "Lsf2;", "mLineChartAdapter", "Lux2;", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "recyclerFingerDetail", "getRecyclerFingerDetail", "setRecyclerFingerDetail", "mDetailFingerAdapter", "mDataListFingerDetail", "understandCard", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "moreDeviceCard", "getMoreDeviceCard", "setMoreDeviceCard", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseFingerDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseFingerDayItemFragment.kt\ncom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFingerDayItemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,440:1\n1#2:441\n*E\n"})
public final class BloodGlucoseFingerDayItemFragment extends Hilt_BloodGlucoseFingerDayItemFragment<BloodGlucoseViewModel, e3a> {

    @NotNull
    public static final String TAG = "BloodGlucoseFingerDay";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private DailyBloodSugarReport mBloodSugarReport;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private List<qpo> mDataListFingerDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private opo mDetailFingerAdapter;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private ux2<sf2> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private View moreDeviceCard;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private RecyclerView recyclerFingerDetail;

    @Nullable
    private View understandCard;

    @NotNull
    private final String MODEL_CGM = BloodGlucoseAllDayItemFragment.MODEL_CGM;

    @Nullable
    private List<BloodGlucoseEntry> mChartEntries = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void initBundle() {
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            localDateNow = LocalDate.now().minusDays(numValueOf.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.I);
        updateRecyclerLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDetailFingerCard() {
        this.mDataListFingerDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerFingerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        opo opoVar = new opo(getMActivity(), this.mDataListFingerDetail, c0j.p0, pni.J);
        this.mDetailFingerAdapter = opoVar;
        opoVar.q(c0j.q0, true);
        updateRecyclerFingerLayoutManager();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: mx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseFingerDayItemFragment.initDetailFingerCard$lambda$1(this.f27304a, view);
            }
        };
        opo opoVar2 = this.mDetailFingerAdapter;
        if (opoVar2 != null) {
            opoVar2.o(0, onClickListener);
        }
        RecyclerView recyclerView2 = this.recyclerFingerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailFingerAdapter);
        RecyclerView recyclerView3 = this.recyclerFingerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDetailFingerCard$lambda$1(BloodGlucoseFingerDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String understandBloodSugarUrl = HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null));
        Context context = this$0.getContext();
        WebViewUtilKt.startWebView$default(understandBloodSugarUrl, context != null ? context.getString(c0j.o1) : null, false, false, null, false, null, false, 252, null);
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        this.mXAxis = new vqr(vfeVar, vfeVar.c);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(15.0f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new xqr());
        this.mItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, false, 8, null);
        BloodGlucoseHighLightMarkValueFormatter bloodGlucoseHighLightMarkValueFormatter = new BloodGlucoseHighLightMarkValueFormatter(0);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setHighLightValueFormatter(bloodGlucoseHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView2.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        this.mLineChartAdapter = new ux2<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, bloodGlucoseHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        s13 s13Var = new s13(getActivity(), this.lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerDayItemFragment$initLineChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(s13Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPointLineColor() {
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) getMViewModel();
        float lowSettingValue = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.getLowSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel2 = (BloodGlucoseViewModel) getMViewModel();
        float highSettingValue = bloodGlucoseViewModel2 != null ? bloodGlucoseViewModel2.getHighSettingValue() : 10.0f;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseDataUtil.initLineColor(lowSettingValue, highSettingValue, bloodGlucoseLineChartItemDecoration);
        ux2<sf2> ux2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var);
        ux2Var.notifyDataSetChanged();
    }

    private final void initUnderstandView() {
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 4);
        }
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: nx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodGlucoseFingerDayItemFragment.initUnderstandView$lambda$0(this.f28533a, view2);
                }
            });
        }
        View view2 = this.moreDeviceCard;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$0(BloodGlucoseFingerDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initView() {
        initLineChartRecyclerView();
        initDetailCard();
        initDetailFingerCard();
        initUnderstandView();
        requestData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((e3a) getMBinding()).B;
        this.lineChartRecyclerView = ((e3a) getMBinding()).E;
        this.dataTitleView = ((e3a) getMBinding()).C;
        this.understandCard = ((e3a) getMBinding()).I;
        this.recyclerDetail = ((e3a) getMBinding()).G;
        this.recyclerFingerDetail = ((e3a) getMBinding()).H;
        this.moreDeviceCard = ((e3a) getMBinding()).F;
        this.healthBannerCardSetView = ((e3a) getMBinding()).D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBarChart() {
        BloodSugarItem latestFingerItem;
        BloodSugarItem latestFingerItem2;
        BloodSugarItem latestFingerItem3;
        StatisticBloodSugar statisticFingerBS;
        BloodSugarItem maxItem;
        StatisticBloodSugar statisticBloodSugar;
        BloodSugarItem maxItem2;
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyBloodSugarReport = new DailyBloodSugarReport(TimeDateUtil.changZeroOfTheDay(localDate), "days");
        }
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateDayEntries = bloodGlucoseDataUtil.createDayEntries(contextRequireContext, vfeVar, dailyBloodSugarReport, 2);
        List<BloodGlucoseEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<BloodGlucoseEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateDayEntries);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateDayEntries);
        DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
        Float fValueOf = null;
        float fBloodSugar = 10.0f;
        if ((dailyBloodSugarReport2 != null ? dailyBloodSugarReport2.getStatisticBloodSugar() : null) != null) {
            DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
            theMaxNumber = (dailyBloodSugarReport3 == null || (statisticBloodSugar = dailyBloodSugarReport3.getStatisticBloodSugar()) == null || (maxItem2 = statisticBloodSugar.getMaxItem()) == null) ? 10.0f : maxItem2.bloodSugar();
        }
        DailyBloodSugarReport dailyBloodSugarReport4 = this.mBloodSugarReport;
        if ((dailyBloodSugarReport4 != null ? dailyBloodSugarReport4.getStatisticFingerBS() : null) != null) {
            DailyBloodSugarReport dailyBloodSugarReport5 = this.mBloodSugarReport;
            if (dailyBloodSugarReport5 != null && (statisticFingerBS = dailyBloodSugarReport5.getStatisticFingerBS()) != null && (maxItem = statisticFingerBS.getMaxItem()) != null) {
                fBloodSugar = maxItem.bloodSugar();
            }
            theMaxNumber = Math.max(theMaxNumber, fBloodSugar);
        }
        if (theMaxNumber < ((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue()) {
            theMaxNumber = ((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue();
        }
        float f = 15.0f;
        if (theMaxNumber >= 15.0f) {
            f = 20.0f;
            if (theMaxNumber >= 20.0f) {
                f = 25.0f;
            }
        }
        DailyBloodSugarReport dailyBloodSugarReport6 = this.mBloodSugarReport;
        if (((dailyBloodSugarReport6 == null || (latestFingerItem3 = dailyBloodSugarReport6.getLatestFingerItem()) == null) ? -1.0f : latestFingerItem3.bloodSugar()) > -1.0f) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                ViewExtKt.setVisible(dataTitleView, true);
            }
            DailyBloodSugarReport dailyBloodSugarReport7 = this.mBloodSugarReport;
            long jCurrentTimeMillis = (dailyBloodSugarReport7 == null || (latestFingerItem2 = dailyBloodSugarReport7.getLatestFingerItem()) == null) ? System.currentTimeMillis() / ((long) 1000) : latestFingerItem2.getTime();
            String dateHHmmFormat = TimeDateUtil.getDateHHmmFormat(jCurrentTimeMillis);
            if (!TimeUtils.INSTANCE.isSameDay(((long) 1000) * jCurrentTimeMillis, System.currentTimeMillis())) {
                dateHHmmFormat = TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(jCurrentTimeMillis)) + " " + dateHHmmFormat;
            }
            DailyBloodSugarReport dailyBloodSugarReport8 = this.mBloodSugarReport;
            if (dailyBloodSugarReport8 != null && (latestFingerItem = dailyBloodSugarReport8.getLatestFingerItem()) != null) {
                fValueOf = Float.valueOf(latestFingerItem.bloodSugar());
            }
            Resources resources = requireContext().getResources();
            int i = qxi.X;
            Intrinsics.checkNotNull(fValueOf);
            String quantityString = resources.getQuantityString(i, (int) fValueOf.floatValue(), fValueOf.toString());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            if (Intrinsics.areEqual(fValueOf, 2.0f)) {
                quantityString = requireContext().getResources().getQuantityString(qxi.c, (int) fValueOf.floatValue(), fValueOf.toString());
            } else if (Intrinsics.areEqual(fValueOf, 25.0f)) {
                quantityString = requireContext().getResources().getQuantityString(qxi.f31939b, (int) fValueOf.floatValue(), fValueOf.toString());
            }
            String string = fValueOf.toString();
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.a(requireContext(), quantityString, string, dateHHmmFormat);
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration != null) {
                bloodGlucoseLineChartItemDecoration.setDrawSelectFill(true);
            }
        } else {
            DataTitleView dataTitleView3 = this.dataTitleView;
            if (dataTitleView3 != null) {
                ViewExtKt.setVisible(dataTitleView3, true);
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration2 != null) {
                bloodGlucoseLineChartItemDecoration2.setDrawSelectFill(false);
            }
            DataTitleView dataTitleView4 = this.dataTitleView;
            if (dataTitleView4 != null) {
                dataTitleView4.c(getString(c0j.L6));
            }
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        bloodGlucoseLineChartItemDecoration3.setYAxis(this.mYAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration4 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration4);
        bloodGlucoseLineChartItemDecoration4.setXAxis(this.mXAxis);
        ux2<sf2> ux2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var);
        ux2Var.setYAxis(this.mYAxis);
        ux2<sf2> ux2Var2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var2);
        ux2Var2.setXAxis(this.mXAxis);
        initPointLineColor();
    }

    private final void refreshDetailCard() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport != null) {
            Intrinsics.checkNotNull(dailyBloodSugarReport);
            if (dailyBloodSugarReport.getStatisticFingerBS() != null) {
                BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
                Intrinsics.checkNotNull(dailyBloodSugarReport2);
                StatisticBloodSugar statisticFingerBS = dailyBloodSugarReport2.getStatisticFingerBS();
                Intrinsics.checkNotNull(statisticFingerBS);
                List<qpo> listCreateSummaryModelList = bloodGlucoseDataUtil.createSummaryModelList(contextRequireContext, statisticFingerBS, 2);
                if (!listCreateSummaryModelList.isEmpty()) {
                    DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
                    Intrinsics.checkNotNull(dailyBloodSugarReport3);
                    Map<Long, List<BloodSugarItem>> fingerBSMap = dailyBloodSugarReport3.getFingerBSMap();
                    if (fingerBSMap != null && fingerBSMap.size() > 1) {
                        RecyclerView recyclerView = this.recyclerDetail;
                        Intrinsics.checkNotNull(recyclerView);
                        recyclerView.setVisibility(0);
                        List<qpo> list = this.mDataListDetail;
                        Intrinsics.checkNotNull(list);
                        list.clear();
                        List<qpo> list2 = this.mDataListDetail;
                        Intrinsics.checkNotNull(list2);
                        list2.addAll(listCreateSummaryModelList);
                        opo opoVar = this.mDetailAdapter;
                        Intrinsics.checkNotNull(opoVar);
                        opoVar.setHeaderViewTitle(qpo.a("days"));
                        opo opoVar2 = this.mDetailAdapter;
                        Intrinsics.checkNotNull(opoVar2);
                        opoVar2.notifyDataChanged();
                        return;
                    }
                }
                RecyclerView recyclerView2 = this.recyclerDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(8);
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshDetailFingerCard() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport != null) {
            Intrinsics.checkNotNull(dailyBloodSugarReport);
            if (dailyBloodSugarReport.getFingerBSDiff() != null) {
                BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
                Intrinsics.checkNotNull(dailyBloodSugarReport2);
                PostMealBSDiff fingerBSDiff = dailyBloodSugarReport2.getFingerBSDiff();
                Intrinsics.checkNotNull(fingerBSDiff);
                List<qpo> listCreateFingerDayModelList = bloodGlucoseDataUtil.createFingerDayModelList(contextRequireContext, fingerBSDiff);
                if (!(!listCreateFingerDayModelList.isEmpty())) {
                    RecyclerView recyclerView = this.recyclerFingerDetail;
                    Intrinsics.checkNotNull(recyclerView);
                    recyclerView.setVisibility(8);
                    return;
                }
                RecyclerView recyclerView2 = this.recyclerFingerDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<qpo> list = this.mDataListFingerDetail;
                Intrinsics.checkNotNull(list);
                list.clear();
                List<qpo> list2 = this.mDataListFingerDetail;
                Intrinsics.checkNotNull(list2);
                list2.addAll(listCreateFingerDayModelList);
                opo opoVar = this.mDetailFingerAdapter;
                Intrinsics.checkNotNull(opoVar);
                opoVar.notifyDataChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerFingerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        Logger.i(TAG, "refresh BloodGlucoseDay .. " + (dailyBloodSugarReport != null ? dailyBloodSugarReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDetailFingerCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureDay", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        ((BloodGlucoseViewModel) getMViewModel()).triggerFetchFitnessReport(IBloodSugarRepository.class, "days", jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: lx2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodGlucoseFingerDayItemFragment.requestData$lambda$2(this.f25510a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$2(BloodGlucoseFingerDayItemFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mBloodSugarReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyBloodSugarReport) {
                this$0.mBloodSugarReport = (DailyBloodSugarReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    private final void updateRecyclerFingerLayoutManager() {
        final int i;
        if (getMActivity() == null || this.mDetailFingerAdapter == null) {
            return;
        }
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
            i = 3;
        } else {
            UIUtils uIUtils = UIUtils.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            if (uIUtils.isTabletAndLandscape(mActivity)) {
                i = 3;
            } else {
                i = 2;
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerDayItemFragment.updateRecyclerFingerLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = BloodGlucoseFingerDayItemFragment.this.mDetailFingerAdapter;
                Intrinsics.checkNotNull(opoVar);
                if (!opoVar.isHeaderView(position)) {
                    opo opoVar2 = BloodGlucoseFingerDayItemFragment.this.mDetailFingerAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    if (!opoVar2.l(position)) {
                        return 1;
                    }
                }
                return i;
            }
        });
        RecyclerView recyclerView = this.recyclerFingerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private final void updateRecyclerLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.recyclerDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    @Nullable
    public final HealthBannerCardSetView getHealthBannerCardSetView() {
        return this.healthBannerCardSetView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.u;
    }

    @Nullable
    public final LineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    @Nullable
    public final LocalDate getMCurrentDate() {
        return this.mCurrentDate;
    }

    @Nullable
    public final View getMoreDeviceCard() {
        return this.moreDeviceCard;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final RecyclerView getRecyclerFingerDetail() {
        return this.recyclerFingerDetail;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerLayoutManager();
        updateRecyclerFingerLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
        ((BloodGlucoseViewModel) getMViewModel()).getBloodSugarRemindSettingFromLocal();
        initPointLineColor();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        initView();
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setHealthBannerCardSetView(@Nullable HealthBannerCardSetView healthBannerCardSetView) {
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.lineChartRecyclerView = lineChartRecyclerView;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setMoreDeviceCard(@Nullable View view) {
        this.moreDeviceCard = view;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerFingerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerFingerDetail = recyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
