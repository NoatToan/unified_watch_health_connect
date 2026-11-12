package com.xiaomi.fitness.relative.hrm;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.AbnormalDataUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.hrm.HrmAbnormalChartFragment;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.distribute.HrmDistribute;
import com.xiaomi.fitness.widget.view.CardStyleSetView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.cx;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.sz6;
import defpackage.uz6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000 \u0087\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0087\u0001B\b¢\u0006\u0005\b\u0086\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ5\u0010$\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ!\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H&¢\u0006\u0004\b2\u0010\bJ\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010Y\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010TR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010XR$\u0010a\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010P\u001a\u0004\bb\u0010R\"\u0004\bc\u0010TR\u0018\u0010d\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010VR\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010XR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010XR$\u0010g\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010P\u001a\u0004\bh\u0010R\"\u0004\bi\u0010TR\u0018\u0010j\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010VR\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010XR\u001e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010XR$\u0010m\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010P\u001a\u0004\bn\u0010R\"\u0004\bo\u0010TR\u0018\u0010p\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010VR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010XR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010XR\u0018\u0010s\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010}\u001a\u00020|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00118$X¤\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/xiaomi/fitness/relative/hrm/HrmBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewIfNeed", "refreshAbnormalFibCard", "refreshAbnormalHighHrmCard", "refreshPhoneRecordCard", "refreshDistributeCard", "refreshAbnormalLowHrmCard", "refreshDetailCard", "refreshTitle", "", "position", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "hrmReport", "", "getTitleDesc", "(ILcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)Ljava/lang/String;", "getTitleHrValue", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)I", "initView", "initAbnormalFibCard", "initAbnormalHighHrmCard", "initAbnormalLowHrmCard", "", "Lqpo;", "adapterList", "srcList", "Lopo;", "adapter", "setAbnormalFold", "(Ljava/util/List;Ljava/util/List;Lopo;)V", "initDetailCard", "initDistributeCard", "updateRecyclerDistributeLayoutManager", "updateRecyclerDetailLayoutManager", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "hrmPhoneRecordCard", "Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "getHrmPhoneRecordCard", "()Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "setHrmPhoneRecordCard", "(Lcom/xiaomi/fitness/widget/view/CardStyleSetView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mRateDetailAdapter", "Lopo;", "mDataListRateDetail", "Ljava/util/List;", "recyclerRateDistribute", "getRecyclerRateDistribute", "setRecyclerRateDistribute", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDataListDistribute", "lowHrmRecycler", "getLowHrmRecycler", "setLowHrmRecycler", "lowHrmAdapter", "lowHrmDataAdapterList", "lowHrmDataSrcList", "highHrmRecycler", "getHighHrmRecycler", "setHighHrmRecycler", "highHrmAdapter", "highHrmDataAdapterList", "highHrmDataSrcList", "abnormalFibRecycler", "getAbnormalFibRecycler", "setAbnormalFibRecycler", "abnormalFibAdapter", "abnormalFibDataAdapterList", "abnormalFibDataSrcList", "mDailyHrmReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "Lcom/xiaomi/fitness/view/CardUnderstandView;", "mUnderstandView", "Lcom/xiaomi/fitness/view/CardUnderstandView;", "getMUnderstandView", "()Lcom/xiaomi/fitness/view/CardUnderstandView;", "setMUnderstandView", "(Lcom/xiaomi/fitness/view/CardUnderstandView;)V", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class HrmBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:hrm";

    @Nullable
    private opo abnormalFibAdapter;

    @Nullable
    private List<qpo> abnormalFibDataAdapterList;

    @Nullable
    private List<qpo> abnormalFibDataSrcList;

    @Nullable
    private RecyclerView abnormalFibRecycler;

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private opo highHrmAdapter;

    @Nullable
    private List<qpo> highHrmDataAdapterList;

    @Nullable
    private List<qpo> highHrmDataSrcList;

    @Nullable
    private RecyclerView highHrmRecycler;

    @Nullable
    private CardStyleSetView hrmPhoneRecordCard;

    @Nullable
    private opo lowHrmAdapter;

    @Nullable
    private List<qpo> lowHrmDataAdapterList;

    @Nullable
    private List<qpo> lowHrmDataSrcList;

    @Nullable
    private RecyclerView lowHrmRecycler;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyHrReport mDailyHrmReport;

    @Nullable
    private List<uz6> mDataListDistribute;

    @Nullable
    private List<qpo> mDataListRateDetail;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private opo mRateDetailAdapter;

    @Nullable
    private CardUnderstandView mUnderstandView;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private RecyclerView recyclerRateDistribute;
    private long relativeUid = -1;

    private final String getTitleDesc(int position, DailyHrReport hrmReport) {
        if (position == 0) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(hrmReport.getTime()))) {
                HrItem latestHrRecord = hrmReport.getLatestHrRecord();
                if (latestHrRecord == null) {
                    return "";
                }
                return TimeDateUtil.getDateMMddFormat(latestHrRecord.getTime()) + " " + TimeDateUtil.getDateHHmm24Format(latestHrRecord.getTime());
            }
        }
        Intrinsics.checkNotNull(hrmReport);
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(hrmReport.getTime());
        if (position == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDateTimestampToLocalDate);
        }
        if (position != 1) {
            return position != 2 ? "" : TimeDateUtil.getDateYYYYMMLocalFormat(localDateTimestampToLocalDate);
        }
        return HealthUtil.getWeekDateStr(localDateTimestampToLocalDate);
    }

    private final int getTitleHrValue(DailyHrReport hrmReport) {
        if (getFragmentPosition() == 0) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(hrmReport.getTime()))) {
                HrItem latestHrRecord = hrmReport.getLatestHrRecord();
                if ((latestHrRecord != null ? Integer.valueOf(latestHrRecord.getHr()) : null) == null) {
                    return 0;
                }
                HrItem latestHrRecord2 = hrmReport.getLatestHrRecord();
                Integer numValueOf = latestHrRecord2 != null ? Integer.valueOf(latestHrRecord2.getHr()) : null;
                Intrinsics.checkNotNull(numValueOf);
                return numValueOf.intValue();
            }
        }
        hrmReport.getAvgHr();
        return hrmReport.getAvgHr();
    }

    private final void initAbnormalFibCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.abnormalFibDataAdapterList = new ArrayList();
        this.abnormalFibDataSrcList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalFibCard.1
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((HrmBaseRelativeFragment) this.this$0).abnormalFibAdapter;
                Intrinsics.checkNotNull(opoVar);
                if (!opoVar.isHeaderView(position)) {
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    if (!opoVar2.isFooterView(position)) {
                        return 1;
                    }
                }
                return 2;
            }
        });
        RecyclerView recyclerView = this.abnormalFibRecycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.abnormalFibRecycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(bl5Var);
        }
        opo opoVar = new opo(getMActivity(), this.abnormalFibDataAdapterList, c0j.c9, pni.q0);
        this.abnormalFibAdapter = opoVar;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalFibCard.2
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmBaseRelativeFragment) this.this$0).abnormalFibDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    opoVar2.p(c0j.E4, false);
                } else {
                    HrmBaseRelativeFragment<VM, VDB> hrmBaseRelativeFragment = this.this$0;
                    List list4 = ((HrmBaseRelativeFragment) hrmBaseRelativeFragment).abnormalFibDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmBaseRelativeFragment.setAbnormalFold(list4, list5, ((HrmBaseRelativeFragment) this.this$0).abnormalFibAdapter);
                }
                opo opoVar3 = ((HrmBaseRelativeFragment) this.this$0).abnormalFibAdapter;
                Intrinsics.checkNotNull(opoVar3);
                opoVar3.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.abnormalFibRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.abnormalFibAdapter);
        }
        RecyclerView recyclerView4 = this.abnormalFibRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initAbnormalHighHrmCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.highHrmDataAdapterList = new ArrayList();
        this.highHrmDataSrcList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalHighHrmCard.1
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((HrmBaseRelativeFragment) this.this$0).highHrmAdapter;
                Intrinsics.checkNotNull(opoVar);
                if (!opoVar.isHeaderView(position)) {
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).highHrmAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    if (!opoVar2.isFooterView(position)) {
                        return 1;
                    }
                }
                return 2;
            }
        });
        RecyclerView recyclerView = this.highHrmRecycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.highHrmRecycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(bl5Var);
        }
        opo opoVar = new opo(getMActivity(), this.highHrmDataAdapterList, c0j.a9, pni.q0);
        this.highHrmAdapter = opoVar;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalHighHrmCard.2
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmBaseRelativeFragment) this.this$0).highHrmDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmBaseRelativeFragment) this.this$0).highHrmDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmBaseRelativeFragment) this.this$0).highHrmDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).highHrmAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    opoVar2.p(c0j.E4, false);
                } else {
                    HrmBaseRelativeFragment<VM, VDB> hrmBaseRelativeFragment = this.this$0;
                    List list4 = ((HrmBaseRelativeFragment) hrmBaseRelativeFragment).highHrmDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmBaseRelativeFragment) this.this$0).highHrmDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmBaseRelativeFragment.setAbnormalFold(list4, list5, ((HrmBaseRelativeFragment) this.this$0).highHrmAdapter);
                }
                opo opoVar3 = ((HrmBaseRelativeFragment) this.this$0).highHrmAdapter;
                Intrinsics.checkNotNull(opoVar3);
                opoVar3.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
                if (model instanceof cx) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("abnormal_item", ((cx) model).b());
                    bundle.putInt("type", 1);
                    BaseFragmentExKt.gotoPage(this.this$0, HrmAbnormalChartFragment.class, bundle);
                }
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.highHrmRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.highHrmAdapter);
        }
        RecyclerView recyclerView4 = this.highHrmRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initAbnormalLowHrmCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.lowHrmDataAdapterList = new ArrayList();
        this.lowHrmDataSrcList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalLowHrmCard.1
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((HrmBaseRelativeFragment) this.this$0).lowHrmAdapter;
                Intrinsics.checkNotNull(opoVar);
                if (!opoVar.isHeaderView(position)) {
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).lowHrmAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    if (!opoVar2.isFooterView(position)) {
                        return 1;
                    }
                }
                return 2;
            }
        });
        RecyclerView recyclerView = this.lowHrmRecycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.lowHrmRecycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(bl5Var);
        }
        opo opoVar = new opo(getMActivity(), this.lowHrmDataAdapterList, c0j.b9, pni.q0);
        this.lowHrmAdapter = opoVar;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.relative.hrm.HrmBaseRelativeFragment.initAbnormalLowHrmCard.2
            final /* synthetic */ HrmBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmBaseRelativeFragment) this.this$0).lowHrmDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmBaseRelativeFragment) this.this$0).lowHrmDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmBaseRelativeFragment) this.this$0).lowHrmDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar2 = ((HrmBaseRelativeFragment) this.this$0).lowHrmAdapter;
                    Intrinsics.checkNotNull(opoVar2);
                    opoVar2.p(c0j.E4, false);
                } else {
                    HrmBaseRelativeFragment<VM, VDB> hrmBaseRelativeFragment = this.this$0;
                    List list4 = ((HrmBaseRelativeFragment) hrmBaseRelativeFragment).lowHrmDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmBaseRelativeFragment) this.this$0).lowHrmDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmBaseRelativeFragment.setAbnormalFold(list4, list5, ((HrmBaseRelativeFragment) this.this$0).lowHrmAdapter);
                }
                opo opoVar3 = ((HrmBaseRelativeFragment) this.this$0).lowHrmAdapter;
                Intrinsics.checkNotNull(opoVar3);
                opoVar3.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
                if (model instanceof cx) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("abnormal_item", ((cx) model).b());
                    bundle.putInt("type", 0);
                    BaseFragmentExKt.gotoPage(this.this$0, HrmAbnormalChartFragment.class, bundle);
                }
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.lowHrmRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.lowHrmAdapter);
        }
        RecyclerView recyclerView4 = this.lowHrmRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initBundle() {
        LocalDate localDateMinusDays;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            int i = arguments.getInt("offset", 0);
            int fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateMinusDays = fragmentPosition != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(i)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(i));
            } else {
                localDateMinusDays = LocalDate.now().minusDays(i);
            }
            this.mCurrentLocalDate = localDateMinusDays;
        }
        if (this.mCurrentLocalDate == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListRateDetail = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mRateDetailAdapter = new opo(getMActivity(), this.mDataListRateDetail, c0j.I6, pni.B3);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mRateDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDistributeCard() {
        this.mDataListDistribute = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDataListDistribute, 3);
        updateRecyclerDistributeLayoutManager();
        RecyclerView recyclerView2 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        sz6 sz6Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var);
        sz6Var.k(false);
        RecyclerView recyclerView3 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initView() {
        initDetailCard();
        initAbnormalLowHrmCard();
        initAbnormalHighHrmCard();
        initAbnormalFibCard();
        initDistributeCard();
        CardUnderstandView cardUnderstandView = this.mUnderstandView;
        if (cardUnderstandView != null) {
            ViewExtKt.setVisible(cardUnderstandView, false);
        }
    }

    private final void refreshAbnormalFibCard() {
        DailyHrReport dailyHrReport;
        if (AppUtil.INSTANCE.isPlayChannel()) {
            RecyclerView recyclerView = this.abnormalFibRecycler;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalFibRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<AbnormalFibItem> abnormalFibRecords = dailyHrReport2.getAbnormalFibRecords();
                Intrinsics.checkNotNull(abnormalFibRecords);
                List<qpo> listCreateAbnormalFibModel = abnormalDataUtil.createAbnormalFibModel(abnormalFibRecords);
                int size = listCreateAbnormalFibModel.size();
                if (size == 0) {
                    RecyclerView recyclerView2 = this.abnormalFibRecycler;
                    if (recyclerView2 != null) {
                        ViewExtKt.setVisible(recyclerView2, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView3 = this.abnormalFibRecycler;
                if (recyclerView3 != null) {
                    ViewExtKt.setVisible(recyclerView3, true);
                }
                List<qpo> list = this.abnormalFibDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.abnormalFibDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalFibModel);
                }
                if (size >= 10) {
                    List<qpo> list3 = this.abnormalFibDataAdapterList;
                    Intrinsics.checkNotNull(list3);
                    List<qpo> list4 = this.abnormalFibDataSrcList;
                    Intrinsics.checkNotNull(list4);
                    setAbnormalFold(list3, list4, this.abnormalFibAdapter);
                } else {
                    List<qpo> list5 = this.abnormalFibDataAdapterList;
                    if (list5 != null) {
                        list5.clear();
                    }
                    List<qpo> list6 = this.abnormalFibDataAdapterList;
                    if (list6 != null) {
                        List<qpo> list7 = this.abnormalFibDataSrcList;
                        Intrinsics.checkNotNull(list7);
                        list6.addAll(list7);
                    }
                    opo opoVar = this.abnormalFibAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                }
                opo opoVar2 = this.abnormalFibAdapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView4 = this.abnormalFibRecycler;
        if (recyclerView4 != null) {
            ViewExtKt.setVisible(recyclerView4, false);
        }
    }

    private final void refreshAbnormalHighHrmCard() {
        DailyHrReport dailyHrReport;
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalHrHighRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<SegmentItem> abnormalHrHighRecords = dailyHrReport2.getAbnormalHrHighRecords();
                Intrinsics.checkNotNull(abnormalHrHighRecords);
                String quantityString = getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                List<cx> listCreateAbnormalSummaryViewModel = abnormalDataUtil.createAbnormalSummaryViewModel(abnormalHrHighRecords, quantityString, true);
                int size = listCreateAbnormalSummaryViewModel.size();
                if (size == 0) {
                    RecyclerView recyclerView = this.highHrmRecycler;
                    if (recyclerView != null) {
                        ViewExtKt.setVisible(recyclerView, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.highHrmRecycler;
                if (recyclerView2 != null) {
                    ViewExtKt.setVisible(recyclerView2, true);
                }
                List<qpo> list = this.highHrmDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.highHrmDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalSummaryViewModel);
                }
                if (size >= 10) {
                    List<qpo> list3 = this.highHrmDataAdapterList;
                    Intrinsics.checkNotNull(list3);
                    List<qpo> list4 = this.highHrmDataSrcList;
                    Intrinsics.checkNotNull(list4);
                    setAbnormalFold(list3, list4, this.highHrmAdapter);
                } else {
                    List<qpo> list5 = this.highHrmDataAdapterList;
                    if (list5 != null) {
                        list5.clear();
                    }
                    List<qpo> list6 = this.highHrmDataAdapterList;
                    if (list6 != null) {
                        List<qpo> list7 = this.highHrmDataSrcList;
                        Intrinsics.checkNotNull(list7);
                        list6.addAll(list7);
                    }
                    opo opoVar = this.highHrmAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                }
                opo opoVar2 = this.highHrmAdapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = this.highHrmRecycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, false);
        }
    }

    private final void refreshAbnormalLowHrmCard() {
        DailyHrReport dailyHrReport;
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalHrLowRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<SegmentItem> abnormalHrLowRecords = dailyHrReport2.getAbnormalHrLowRecords();
                Intrinsics.checkNotNull(abnormalHrLowRecords);
                String quantityString = getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                List<cx> listCreateAbnormalSummaryViewModel = abnormalDataUtil.createAbnormalSummaryViewModel(abnormalHrLowRecords, quantityString, true);
                int size = listCreateAbnormalSummaryViewModel.size();
                if (size == 0) {
                    RecyclerView recyclerView = this.lowHrmRecycler;
                    if (recyclerView != null) {
                        ViewExtKt.setVisible(recyclerView, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.lowHrmRecycler;
                if (recyclerView2 != null) {
                    ViewExtKt.setVisible(recyclerView2, true);
                }
                List<qpo> list = this.lowHrmDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.lowHrmDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalSummaryViewModel);
                }
                if (size >= 10) {
                    List<qpo> list3 = this.lowHrmDataAdapterList;
                    Intrinsics.checkNotNull(list3);
                    List<qpo> list4 = this.lowHrmDataSrcList;
                    Intrinsics.checkNotNull(list4);
                    setAbnormalFold(list3, list4, this.lowHrmAdapter);
                } else {
                    List<qpo> list5 = this.lowHrmDataAdapterList;
                    if (list5 != null) {
                        list5.clear();
                    }
                    List<qpo> list6 = this.lowHrmDataAdapterList;
                    if (list6 != null) {
                        List<qpo> list7 = this.lowHrmDataSrcList;
                        Intrinsics.checkNotNull(list7);
                        list6.addAll(list7);
                    }
                    opo opoVar = this.lowHrmAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                }
                opo opoVar2 = this.lowHrmAdapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = this.lowHrmRecycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, false);
        }
    }

    private final void refreshDetailCard() {
        if (this.mDailyHrmReport == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        Intrinsics.checkNotNull(dailyHrReport);
        List<qpo> listCreateDetailModelList = hrmDataUtil.createDetailModelList(fragmentActivityRequireActivity, dailyHrReport, false);
        if (!(!listCreateDetailModelList.isEmpty())) {
            RecyclerView recyclerView2 = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<qpo> list = this.mDataListRateDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListRateDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDetailModelList);
        opo opoVar = this.mRateDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
        Intrinsics.checkNotNull(dailyHrReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyHrReport2.getTag()));
        opo opoVar2 = this.mRateDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshDistributeCard() {
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        if (dailyHrReport != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (dailyHrReport.getHrDistribute() != null) {
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                DailyHrDistribute hrDistribute = dailyHrReport2.getHrDistribute();
                Intrinsics.checkNotNull(hrDistribute);
                HrmDistribute hrmDistribute = new HrmDistribute(hrDistribute.getWarmUp(), hrDistribute.getFatBurn(), hrDistribute.getAerobic(), hrDistribute.getAnaerobic(), hrDistribute.getExtreme());
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                List<uz6> listCreateDistributeModelListForHrFragment = DistributeDataUtil.createDistributeModelListForHrFragment(fragmentActivityRequireActivity, hrmDistribute);
                List<uz6> list = listCreateDistributeModelListForHrFragment;
                if (!(!list.isEmpty())) {
                    RecyclerView recyclerView = this.recyclerRateDistribute;
                    Intrinsics.checkNotNull(recyclerView);
                    recyclerView.setVisibility(8);
                    return;
                }
                DistributeDataUtil.setPositionOfList(listCreateDistributeModelListForHrFragment);
                RecyclerView recyclerView2 = this.recyclerRateDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<uz6> list2 = this.mDataListDistribute;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<uz6> list3 = this.mDataListDistribute;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                sz6 sz6Var = this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                sz6Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshPhoneRecordCard() {
        CardStyleSetView cardStyleSetView = this.hrmPhoneRecordCard;
        if (cardStyleSetView != null) {
            ExtUtilKt.gone(cardStyleSetView);
        }
    }

    private final void refreshTitle() {
        if (this.mDailyHrmReport == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        int fragmentPosition = getFragmentPosition();
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        Intrinsics.checkNotNull(dailyHrReport);
        getTitleDesc(fragmentPosition, dailyHrReport);
        DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
        Intrinsics.checkNotNull(dailyHrReport2);
        int titleHrValue = getTitleHrValue(dailyHrReport2);
        Intrinsics.checkNotNullExpressionValue(requireContext().getResources().getQuantityString(qxi.common_unit_heart_rate_desc2, titleHrValue, Integer.valueOf(titleHrValue)), "getQuantityString(...)");
        String.valueOf(titleHrValue);
        TextView textView2 = this.dataTitleView;
        if (textView2 != null) {
            ViewExtKt.setVisible(textView2, false);
        }
    }

    private final void refreshViewIfNeed() {
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        Logger.i("MiHealth:hrm", "refreshViewIfNeed:" + (dailyHrReport != null ? dailyHrReport.toString() : null));
        refreshTitle();
        refreshPhoneRecordCard();
        refreshDetailCard();
        refreshAbnormalLowHrmCard();
        refreshAbnormalHighHrmCard();
        refreshAbnormalFibCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IHeartRateRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new HrmBaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ldc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrmBaseRelativeFragment.requestData$lambda$0(this.f24936a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(HrmBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.mDailyHrmReport = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailyHrReport) {
                this$0.mDailyHrmReport = (DailyHrReport) dailyBasicReport;
            }
        }
        this$0.refreshViewIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAbnormalFold(List<qpo> adapterList, List<qpo> srcList, opo adapter) {
        adapterList.clear();
        int size = srcList.size();
        if (size >= 2) {
            adapterList.addAll(srcList.subList(0, 2));
        } else if (size == 1) {
            adapterList.addAll(srcList.subList(0, 1));
        } else {
            adapterList.addAll(srcList);
        }
        Intrinsics.checkNotNull(adapter);
        adapter.p(c0j.F4, true);
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mRateDetailAdapter == null || (recyclerView = this.recyclerDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mRateDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    private final void updateRecyclerDistributeLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.recyclerRateDistribute) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        sz6 sz6Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, sz6Var));
    }

    @Nullable
    public final RecyclerView getAbnormalFibRecycler() {
        return this.abnormalFibRecycler;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final TextView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getHighHrmRecycler() {
        return this.highHrmRecycler;
    }

    @Nullable
    public final CardStyleSetView getHrmPhoneRecordCard() {
        return this.hrmPhoneRecordCard;
    }

    @Nullable
    public final RecyclerView getLowHrmRecycler() {
        return this.lowHrmRecycler;
    }

    @Nullable
    public final CardUnderstandView getMUnderstandView() {
        return this.mUnderstandView;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final RecyclerView getRecyclerRateDistribute() {
        return this.recyclerRateDistribute;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
        updateRecyclerDistributeLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i("MiHealth:hrm", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setAbnormalFibRecycler(@Nullable RecyclerView recyclerView) {
        this.abnormalFibRecycler = recyclerView;
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setHighHrmRecycler(@Nullable RecyclerView recyclerView) {
        this.highHrmRecycler = recyclerView;
    }

    public final void setHrmPhoneRecordCard(@Nullable CardStyleSetView cardStyleSetView) {
        this.hrmPhoneRecordCard = cardStyleSetView;
    }

    public final void setLowHrmRecycler(@Nullable RecyclerView recyclerView) {
        this.lowHrmRecycler = recyclerView;
    }

    public final void setMUnderstandView(@Nullable CardUnderstandView cardUnderstandView) {
        this.mUnderstandView = cardUnderstandView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerRateDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerRateDistribute = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }
}
