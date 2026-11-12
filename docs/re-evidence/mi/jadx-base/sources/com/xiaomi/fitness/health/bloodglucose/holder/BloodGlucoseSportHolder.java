package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.data.CourseInfo;
import com.mi.health.course.export.data.CourseInfoItem;
import com.xiaomi.fit.fitness.export.data.aggregation.SportBloodSugarData;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseSportHolder;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.lp5;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.sf2;
import defpackage.uw2;
import defpackage.v3b;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.vx2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010I\u001a\u00020\u0013¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010#R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/content/Context;", "context", "", "initChartView", "(Landroid/content/Context;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "sportReport", "refreshBarChart", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;)V", "initTitleView", "initContentRecycle", "()V", "report", "refreshContentRecycle", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;)V", "data", "bindData", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvx2;", "Lsf2;", "mLineChartAdapter", "Lvx2;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Lqpo;", "contentList", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;", "contentAdapter", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifeCycle", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/LifecycleOwner;", "viewLifeCycle", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "mViewModel", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "Landroid/widget/TextView;", "titleName", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "titleImageView", "Landroid/widget/ImageView;", "getTitleImageView", "()Landroid/widget/ImageView;", "setTitleImageView", "(Landroid/widget/ImageView;)V", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseSportHolder extends RecyclerView.d0 {

    @Nullable
    private BloodGlucoseContentAdapter contentAdapter;

    @NotNull
    private final List<qpo> contentList;

    @NotNull
    private final ViewModelStoreOwner lifeCycle;

    @Nullable
    private vfe lineChartAttrs;

    @NotNull
    private final LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;
    private final Context mContext;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private vx2<sf2> mLineChartAdapter;

    @NotNull
    private final View mRootView;

    @Nullable
    private BloodGlucoseViewModel mViewModel;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private SportBloodSugarData report;
    public ImageView titleImageView;
    private TextView titleName;

    @NotNull
    private final LifecycleOwner viewLifeCycle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BloodGlucoseSportHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(eri.E0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        Context context = viewFindViewById.getContext();
        this.mContext = context;
        View viewFindViewById2 = itemView.findViewById(eri.Vg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.lineChartRecyclerView = (LineChartRecyclerView) viewFindViewById2;
        this.contentList = new ArrayList();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) context;
        this.lifeCycle = viewModelStoreOwner;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        this.viewLifeCycle = (LifecycleOwner) context;
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider(viewModelStoreOwner).get(BloodGlucoseViewModel.class);
        this.mViewModel = bloodGlucoseViewModel;
        if (bloodGlucoseViewModel != null) {
            bloodGlucoseViewModel.getBloodSugarRemindSettingFromLocal();
        }
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        initChartView(context2);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        initTitleView(context3);
        initContentRecycle();
    }

    private final void initChartView(Context context) {
        this.lineChartAttrs = (vfe) this.lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new uw2());
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, false, 8, null);
        this.mItemDecoration = bloodGlucoseLineChartItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setXAxisDrawBloodGlucoseDetail(true);
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        vx2<sf2> vx2Var = new vx2<>(context, this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, null);
        this.mLineChartAdapter = vx2Var;
        this.lineChartRecyclerView.setAdapter(vx2Var);
        this.lineChartRecyclerView.setLayoutManager(speedRatioLayoutManager);
        this.lineChartRecyclerView.setNestedScrollingEnabled(false);
    }

    private final void initContentRecycle() {
        View viewFindViewById = this.mRootView.findViewById(eri.z0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        recyclerView.addItemDecoration(new v3b(false));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        BloodGlucoseContentAdapter bloodGlucoseContentAdapter = new BloodGlucoseContentAdapter(mContext, this.contentList);
        this.contentAdapter = bloodGlucoseContentAdapter;
        recyclerView.setAdapter(bloodGlucoseContentAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private final void initTitleView(Context context) {
        TextView textView = (TextView) this.mRootView.findViewById(eri.x1);
        TextView textView2 = (TextView) this.mRootView.findViewById(eri.z1);
        View viewFindViewById = this.mRootView.findViewById(eri.Wg);
        this.titleName = (TextView) viewFindViewById.findViewById(eri.Xg);
        setTitleImageView((ImageView) viewFindViewById.findViewById(eri.W));
        textView.setText(context.getString(c0j.b1));
        textView2.setText(context.getString(c0j.a1));
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    private final void refreshBarChart(Context context, SportBloodSugarData sportReport) {
        int i;
        MutableLiveData<CourseInfoItem> courseTrainRecord;
        int iA = lp5.a(sportReport.getSportReport());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = lp5.c(iA);
        Long cloudCourseId = sportReport.getSportReport().getCloudCourseId();
        if (cloudCourseId != null) {
            BloodGlucoseViewModel bloodGlucoseViewModel = this.mViewModel;
            if (bloodGlucoseViewModel != null) {
                long jLongValue = cloudCourseId.longValue();
                Integer cloudCourseSource = sportReport.getSportReport().getCloudCourseSource();
                bloodGlucoseViewModel.getCourseInfo(jLongValue, cloudCourseSource != null ? cloudCourseSource.intValue() : 0);
            }
            BloodGlucoseViewModel bloodGlucoseViewModel2 = this.mViewModel;
            if (bloodGlucoseViewModel2 != null && (courseTrainRecord = bloodGlucoseViewModel2.getCourseTrainRecord()) != null) {
                courseTrainRecord.observe(this.viewLifeCycle, new BloodGlucoseSportHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ay2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BloodGlucoseSportHolder.refreshBarChart$lambda$1$lambda$0(objectRef, this, (CourseInfoItem) obj);
                    }
                }));
            }
        }
        TextView textView = this.titleName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleName");
            textView = null;
        }
        textView.setText((CharSequence) objectRef.element);
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateDaySportEntries = bloodGlucoseDataUtil.createDaySportEntries(mContext, vfeVar, sportReport);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateDaySportEntries);
        }
        float f = 15.0f;
        if (HealthUtil.getTheMaxValuesNumber(listCreateDaySportEntries) < 15.0f) {
            i = 5;
        } else {
            f = 25.0f;
            i = 7;
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(i);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = i;
        int size = listCreateDaySportEntries.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setYAxis(this.mYAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        bloodGlucoseLineChartItemDecoration2.setXAxis(this.mXAxis);
        vx2<sf2> vx2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var);
        vx2Var.setYAxis(this.mYAxis);
        vx2<sf2> vx2Var2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var2);
        vx2Var2.setXAxis(this.mXAxis);
        BloodGlucoseViewModel bloodGlucoseViewModel3 = this.mViewModel;
        float lowSettingValue = bloodGlucoseViewModel3 != null ? bloodGlucoseViewModel3.getLowSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel4 = this.mViewModel;
        float highSettingValue = bloodGlucoseViewModel4 != null ? bloodGlucoseViewModel4.getHighSettingValue() : 10.0f;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        bloodGlucoseDataUtil.initLineColor(lowSettingValue, highSettingValue, bloodGlucoseLineChartItemDecoration3);
        vx2<sf2> vx2Var3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var3);
        vx2Var3.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    public static final Unit refreshBarChart$lambda$1$lambda$0(Ref.ObjectRef name, BloodGlucoseSportHolder this$0, CourseInfoItem courseInfoItem) {
        CourseInfo courseInfoItem2;
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = null;
        if (((courseInfoItem == null || (courseInfoItem2 = courseInfoItem.getCourseInfoItem()) == null) ? null : courseInfoItem2.getCourseName()) != null) {
            name.element = courseInfoItem.getCourseInfoItem().getCourseName();
            TextView textView2 = this$0.titleName;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleName");
            } else {
                textView = textView2;
            }
            textView.setText((CharSequence) name.element);
        }
        return Unit.INSTANCE;
    }

    private final void refreshContentRecycle(SportBloodSugarData report) {
        float bsDiff = report.getAnalyzeData().getBsDiff();
        this.contentList.clear();
        if (bsDiff == 0.0f) {
            this.contentList.add(new qpo(this.mContext.getString(c0j.r1), this.mContext.getString(c0j.s1), ""));
        } else {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            qpo qpoVar = new qpo(this.mContext.getString(c0j.r1), "1.2", ResourceExtKt.getQuantityString(mContext, qxi.d, 1, 1));
            if (bsDiff > 0.0f) {
                qpoVar.f31729k = this.mContext.getString(c0j.e1);
            } else if (bsDiff < 0.0f) {
                qpoVar.f31729k = this.mContext.getString(c0j.d1);
            }
            this.contentList.add(qpoVar);
        }
        int normalPercent = report.getAnalyzeData().getNormalPercent();
        if (normalPercent > 0) {
            this.contentList.add(new qpo(this.mContext.getString(c0j.P0), String.valueOf(normalPercent), "%"));
        }
        int lowBSCount = report.getAnalyzeData().getLowBSCount();
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        this.contentList.add(new qpo(this.mContext.getString(c0j.F0), String.valueOf(lowBSCount), ResourceExtKt.getQuantityString(mContext2, qxi.common_unit_rowing_machine_count, 1, 1)));
        int lowBSDurationInMin = report.getAnalyzeData().getLowBSDurationInMin();
        Context mContext3 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
        this.contentList.add(new qpo(this.mContext.getString(c0j.H0), String.valueOf(lowBSDurationInMin), ResourceExtKt.getQuantityString(mContext3, qxi.P1, 1, 1)));
        BloodGlucoseContentAdapter bloodGlucoseContentAdapter = this.contentAdapter;
        Intrinsics.checkNotNull(bloodGlucoseContentAdapter);
        bloodGlucoseContentAdapter.notifyDataSetChanged();
    }

    public final void bindData(@NotNull Context context, @NotNull SportBloodSugarData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.lineChartRecyclerView.setVisibility(0);
        this.lineChartRecyclerView.requestLayout();
        this.report = data;
        refreshBarChart(context, data);
        refreshContentRecycle(data);
    }

    @NotNull
    public final ImageView getTitleImageView() {
        ImageView imageView = this.titleImageView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titleImageView");
        return null;
    }

    public final void setTitleImageView(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.titleImageView = imageView;
    }
}
