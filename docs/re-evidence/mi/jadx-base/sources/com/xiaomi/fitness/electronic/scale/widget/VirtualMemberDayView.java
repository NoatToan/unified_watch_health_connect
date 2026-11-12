package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.notch.ScreenUtil;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.DataReportActivity;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberDayViewModel;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.view.SEGMENTAL;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightBodyCompositionHolder;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightBodyScoreHolder;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightControlSuggestHolder;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightIndexEvaluationHolder;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightSegmentalHolder;
import com.xiaomi.fitness.electronic.scale.widget.VirtualMemberDayView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.bu7;
import defpackage.f4b;
import defpackage.gfr;
import defpackage.gr5;
import defpackage.gui;
import defpackage.hak;
import defpackage.oxi;
import defpackage.qal;
import defpackage.rtr;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.wqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.zzi;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0081\u00012\u00020\u0001:\u0002\u0081\u0001B\u0011\b\u0016\u0012\u0006\u0010y\u001a\u00020`¢\u0006\u0004\bz\u0010{B\u001b\b\u0016\u0012\u0006\u0010y\u001a\u00020`\u0012\b\u0010}\u001a\u0004\u0018\u00010|¢\u0006\u0004\bz\u0010~B$\b\u0016\u0012\u0006\u0010y\u001a\u00020`\u0012\b\u0010}\u001a\u0004\u0018\u00010|\u0012\u0006\u0010\u007f\u001a\u00020V¢\u0006\u0005\bz\u0010\u0080\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J%\u0010\u001a\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0014J\u001d\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\r¢\u0006\u0004\b%\u0010\u0010J\r\u0010&\u001a\u00020\r¢\u0006\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R*\u0010A\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00101\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001dR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0018\u0010F\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010XR\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010_\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010LR\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020o8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010tR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006\u0082\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initView", "()V", "initLineChartRecyclerView", "initViewHolder", "refreshCardHolder", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "curWeightItem", "bindDataWithLastWeightItem", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "gotoDataReport", "", "isShowDataReport", "showDataReportBtn", "(Z)V", "", Column.ACCOUNT_ID, "setVisibleForDataReportBtn", "(J)V", "updateLastData", "", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResults", "millis", "refreshLineChart", "(Ljava/util/List;J)V", "updateDataTitleView", "(Ljava/util/List;)V", "time", "updateCurVirtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "refreshWeightData", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;J)V", "selectedTop", "setIsSelectedTop", "isSelectedItem", "()Z", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "Lcom/xiaomi/fitness/electronic/scale/widget/DataTitleView;", "mDataTitleView", "Lcom/xiaomi/fitness/electronic/scale/widget/DataTitleView;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lvqr;", "mXAxis", "Lvqr;", "Lrtr;", "mYAxis", "Lrtr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineEntryList", "getMLineEntryList", "()Ljava/util/List;", "setMLineEntryList", "mListVirtualAccounts", "mCurVirtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "Landroid/widget/LinearLayout;", "mNoteLin", "Landroid/widget/LinearLayout;", "mIsSelectedTop", "Z", "Landroid/view/View;", "rootViewLayout", "Landroid/view/View;", "Landroid/widget/ScrollView;", "mRootContainer", "Landroid/widget/ScrollView;", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel;", "mViewModel", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel;", "", "mUserSex", "I", "mUserBirth", "J", "mUserHeight", "", "mUsername", "Ljava/lang/String;", "isAdult", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "layoutWeightDayDetail", "Landroid/view/ViewGroup;", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyScoreHolder;", "weightBodyScoreHolder", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyScoreHolder;", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyCompositionHolder;", "weightBodyCompositionHolder", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyCompositionHolder;", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightControlSuggestHolder;", "weightControlSuggestHolder", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightControlSuggestHolder;", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightIndexEvaluationHolder;", "weightIndexEvaluationHolder", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightIndexEvaluationHolder;", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightSegmentalHolder;", "weightSegmentalFatHolder", "Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightSegmentalHolder;", "weightSegmentalMuscleHolder", "Landroid/widget/TextView;", "downloadReportBtn", "Landroid/widget/TextView;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVirtualMemberDayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualMemberDayView.kt\ncom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,553:1\n1#2:554\n1863#3,2:555\n1062#3:557\n*S KotlinDebug\n*F\n+ 1 VirtualMemberDayView.kt\ncom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView\n*L\n289#1:555,2\n415#1:557\n*E\n"})
public final class VirtualMemberDayView extends ConstraintLayout {

    @NotNull
    public static final String TAG = "VirtualMemberDayView";
    private TextView downloadReportBtn;
    private boolean isAdult;
    private boolean isSelectedItem;
    private ViewGroup layoutWeightDayDetail;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @NotNull
    private Context mContext;

    @Nullable
    private VirtualAccount mCurVirtualAccount;

    @Nullable
    private DataTitleView mDataTitleView;
    private boolean mIsSelectedTop;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerView;

    @Nullable
    private List<? extends MaxMinEntry> mLineEntryList;

    @Nullable
    private List<VirtualAccount> mListVirtualAccounts;
    private LinearLayout mNoteLin;
    private ScrollView mRootContainer;
    private long mUserBirth;
    private int mUserHeight;
    private int mUserSex;

    @NotNull
    private String mUsername;

    @NotNull
    private VirtualMemberDayViewModel mViewModel;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;
    private View rootViewLayout;
    private WeightBodyCompositionHolder weightBodyCompositionHolder;
    private WeightBodyScoreHolder weightBodyScoreHolder;
    private WeightControlSuggestHolder weightControlSuggestHolder;
    private WeightIndexEvaluationHolder weightIndexEvaluationHolder;
    private WeightSegmentalHolder weightSegmentalFatHolder;
    private WeightSegmentalHolder weightSegmentalMuscleHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberDayView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mViewModel = new VirtualMemberDayViewModel();
        this.mUsername = "";
        this.mContext = context;
        initView();
    }

    private final void bindDataWithLastWeightItem(final WeightItem curWeightItem) {
        VirtualMemberDayViewModel virtualMemberDayViewModel = this.mViewModel;
        VirtualAccount virtualAccount = this.mCurVirtualAccount;
        Intrinsics.checkNotNull(virtualAccount);
        virtualMemberDayViewModel.queryLastWeightRecordByCreateTime(virtualAccount, new Function1() { // from class: xzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDayView.bindDataWithLastWeightItem$lambda$2(this.f39627a, curWeightItem, (WeightResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDataWithLastWeightItem$lambda$2(VirtualMemberDayView this$0, WeightItem weightItem, WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeightBodyScoreHolder weightBodyScoreHolder = null;
        if (weightResult != null) {
            Logger.i("bindDataWithLastWeightItem() last weightItem " + f4b.c(weightResult), new Object[0]);
            WeightBodyScoreHolder weightBodyScoreHolder2 = this$0.weightBodyScoreHolder;
            if (weightBodyScoreHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weightBodyScoreHolder");
            } else {
                weightBodyScoreHolder = weightBodyScoreHolder2;
            }
            WeightItem weightItemWeightResultToWeightItem = WeightInfoUtil.INSTANCE.weightResultToWeightItem(weightResult);
            VirtualAccount virtualAccount = this$0.mCurVirtualAccount;
            Intrinsics.checkNotNull(virtualAccount);
            weightBodyScoreHolder.bindData(weightItem, weightItemWeightResultToWeightItem, virtualAccount);
        } else {
            Logger.i("bindDataWithLastWeightItem() last weightItem is null", new Object[0]);
            WeightBodyScoreHolder weightBodyScoreHolder3 = this$0.weightBodyScoreHolder;
            if (weightBodyScoreHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weightBodyScoreHolder");
                weightBodyScoreHolder3 = null;
            }
            VirtualAccount virtualAccount2 = this$0.mCurVirtualAccount;
            Intrinsics.checkNotNull(virtualAccount2);
            weightBodyScoreHolder3.bindData(weightItem, null, virtualAccount2);
        }
        return Unit.INSTANCE;
    }

    private final void gotoDataReport() {
        VirtualAccount virtualAccount = this.mCurVirtualAccount;
        if (virtualAccount != null) {
            virtualAccount.setName(this.mUsername);
        }
        Intent intent = new Intent(AppUtil.getApp().getApplicationContext(), (Class<?>) DataReportActivity.class);
        intent.putExtra(DataReportActivity.KEY_BODY_RESULT, this.mCurVirtualAccount);
        intent.putExtra(DataReportActivity.KEY_BODY_SEX, this.mUserSex);
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(this.mUserBirth, "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        intent.putExtra(DataReportActivity.KEY_BODY_AGE, weightInfoUtil.getAge(dateToString));
        intent.putExtra(DataReportActivity.KEY_BODY_HEIGHT, this.mUserHeight);
        intent.addFlags(268435456);
        AppUtil.getApp().getApplicationContext().startActivity(intent);
        Logger.i("gotoDataReport() " + f4b.c(this.mCurVirtualAccount), new Object[0]);
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getContext(), this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c, new wqr());
        this.mXAxis = vqrVar;
        yfe yfeVar = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        this.mItemDecoration = yfeVar;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(new gr5(getContext()));
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getContext(), this.mChartEntries, this.mLineChartRecyclerView, this.mXAxis, this.lineChartAttrs, new gr5(getContext()));
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getContext(), this.mLineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.electronic.scale.widget.VirtualMemberDayView$initLineChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                Logger.i(VirtualMemberDayView.TAG, "onItemSelected : " + this.this$0.isSelectedItem + " , position :  " + position);
                this.this$0.isSelectedItem = true;
                if (position != 0 && this.this$0.getMLineEntryList() != null) {
                    List<MaxMinEntry> mLineEntryList = this.this$0.getMLineEntryList();
                    Intrinsics.checkNotNull(mLineEntryList);
                    if (!mLineEntryList.isEmpty()) {
                        List<MaxMinEntry> mLineEntryList2 = this.this$0.getMLineEntryList();
                        Intrinsics.checkNotNull(mLineEntryList2);
                        mLineEntryList2.get(0).setSelected(0);
                        this.this$0.mIsSelectedTop = false;
                    }
                }
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.mDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                    }
                    this.this$0.updateLastData();
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.mDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
                this.this$0.updateCurVirtualAccount(barEntry.timestamp);
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initView() {
        View viewInflate = LayoutInflater.from(AppUtil.getApp().getApplicationContext()).inflate(gui.f0, (ViewGroup) this, true);
        this.rootViewLayout = viewInflate;
        View view = null;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            viewInflate = null;
        }
        this.mRootContainer = (ScrollView) viewInflate.findViewById(bri.y3);
        View view2 = this.rootViewLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view2 = null;
        }
        this.mNoteLin = (LinearLayout) view2.findViewById(bri.Q1);
        ScrollView scrollView = this.mRootContainer;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
            scrollView = null;
        }
        ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
        ScreenUtil screenUtil = ScreenUtil.INSTANCE;
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        layoutParams.width = screenUtil.getScreenSize(applicationContext)[0];
        ScrollView scrollView2 = this.mRootContainer;
        if (scrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
            scrollView2 = null;
        }
        scrollView2.setLayoutParams(layoutParams);
        View view3 = this.rootViewLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view3 = null;
        }
        this.mLineChartRecyclerView = (LineChartRecyclerView) view3.findViewById(bri.S1);
        View view4 = this.rootViewLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
        } else {
            view = view4;
        }
        this.mDataTitleView = (DataTitleView) view.findViewById(bri.I);
        initLineChartRecyclerView();
        initViewHolder();
    }

    private final void initViewHolder() {
        View view = this.rootViewLayout;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view = null;
        }
        this.layoutWeightDayDetail = (ViewGroup) view.findViewById(bri.K1);
        Context context = this.mContext;
        ViewGroup viewGroup = this.layoutWeightDayDetail;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup = null;
        }
        View viewFindViewById = viewGroup.findViewById(bri.F0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.weightBodyScoreHolder = new WeightBodyScoreHolder(context, (ViewGroup) viewFindViewById);
        Context context2 = this.mContext;
        ViewGroup viewGroup2 = this.layoutWeightDayDetail;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup2 = null;
        }
        View viewFindViewById2 = viewGroup2.findViewById(bri.E0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.weightBodyCompositionHolder = new WeightBodyCompositionHolder(context2, (ViewGroup) viewFindViewById2);
        Context context3 = this.mContext;
        ViewGroup viewGroup3 = this.layoutWeightDayDetail;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup3 = null;
        }
        View viewFindViewById3 = viewGroup3.findViewById(bri.G0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.weightControlSuggestHolder = new WeightControlSuggestHolder(context3, (ViewGroup) viewFindViewById3);
        Context context4 = this.mContext;
        ViewGroup viewGroup4 = this.layoutWeightDayDetail;
        if (viewGroup4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup4 = null;
        }
        View viewFindViewById4 = viewGroup4.findViewById(bri.H0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.weightIndexEvaluationHolder = new WeightIndexEvaluationHolder(context4, (ViewGroup) viewFindViewById4);
        Context context5 = this.mContext;
        ViewGroup viewGroup5 = this.layoutWeightDayDetail;
        if (viewGroup5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup5 = null;
        }
        View viewFindViewById5 = viewGroup5.findViewById(bri.I0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.weightSegmentalFatHolder = new WeightSegmentalHolder(context5, (ViewGroup) viewFindViewById5, SEGMENTAL.FAT);
        Context context6 = this.mContext;
        ViewGroup viewGroup6 = this.layoutWeightDayDetail;
        if (viewGroup6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup6 = null;
        }
        View viewFindViewById6 = viewGroup6.findViewById(bri.J0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.weightSegmentalMuscleHolder = new WeightSegmentalHolder(context6, (ViewGroup) viewFindViewById6, SEGMENTAL.MUSCLE);
        ViewGroup viewGroup7 = this.layoutWeightDayDetail;
        if (viewGroup7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup7 = null;
        }
        TextView textView2 = (TextView) viewGroup7.findViewById(bri.A4);
        this.downloadReportBtn = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadReportBtn");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: yzq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VirtualMemberDayView.initViewHolder$lambda$0(this.f40733a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewHolder$lambda$0(VirtualMemberDayView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoDataReport();
    }

    private final void refreshCardHolder() {
        Logger.i("refreshCardHolder() mCurVirtualAccount " + this.mCurVirtualAccount, new Object[0]);
        ViewGroup viewGroup = null;
        WeightSegmentalHolder weightSegmentalHolder = null;
        if (this.mCurVirtualAccount == null || !this.isAdult) {
            Logger.i(TAG, "refreshCardHolder gone");
            ViewGroup viewGroup2 = this.layoutWeightDayDetail;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            } else {
                viewGroup = viewGroup2;
            }
            ViewExtKt.gone(viewGroup);
            return;
        }
        Logger.i(TAG, "refreshCardHolder visible");
        ViewGroup viewGroup3 = this.layoutWeightDayDetail;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup3 = null;
        }
        ViewExtKt.visible(viewGroup3);
        VirtualAccount virtualAccount = this.mCurVirtualAccount;
        Intrinsics.checkNotNull(virtualAccount);
        WeightResult weightResult = (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class);
        WeightItem weightItemWeightResultToWeightItem = weightResult != null ? WeightInfoUtil.INSTANCE.weightResultToWeightItem(weightResult) : null;
        Logger.i("refreshCardHolder() weightItem " + f4b.c(weightItemWeightResultToWeightItem), new Object[0]);
        bindDataWithLastWeightItem(weightItemWeightResultToWeightItem);
        WeightBodyCompositionHolder weightBodyCompositionHolder = this.weightBodyCompositionHolder;
        if (weightBodyCompositionHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyCompositionHolder");
            weightBodyCompositionHolder = null;
        }
        VirtualAccount virtualAccount2 = this.mCurVirtualAccount;
        Intrinsics.checkNotNull(virtualAccount2);
        weightBodyCompositionHolder.bindData(weightItemWeightResultToWeightItem, virtualAccount2);
        WeightControlSuggestHolder weightControlSuggestHolder = this.weightControlSuggestHolder;
        if (weightControlSuggestHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightControlSuggestHolder");
            weightControlSuggestHolder = null;
        }
        weightControlSuggestHolder.bindData(weightItemWeightResultToWeightItem);
        WeightIndexEvaluationHolder weightIndexEvaluationHolder = this.weightIndexEvaluationHolder;
        if (weightIndexEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightIndexEvaluationHolder");
            weightIndexEvaluationHolder = null;
        }
        VirtualAccount virtualAccount3 = this.mCurVirtualAccount;
        Intrinsics.checkNotNull(virtualAccount3);
        weightIndexEvaluationHolder.bindData(weightItemWeightResultToWeightItem, virtualAccount3);
        WeightSegmentalHolder weightSegmentalHolder2 = this.weightSegmentalFatHolder;
        if (weightSegmentalHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalFatHolder");
            weightSegmentalHolder2 = null;
        }
        weightSegmentalHolder2.bindData(weightItemWeightResultToWeightItem);
        WeightSegmentalHolder weightSegmentalHolder3 = this.weightSegmentalMuscleHolder;
        if (weightSegmentalHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalMuscleHolder");
        } else {
            weightSegmentalHolder = weightSegmentalHolder3;
        }
        weightSegmentalHolder.bindData(weightItemWeightResultToWeightItem);
    }

    private final void refreshLineChart(List<WeightResult> weightResults, long millis) {
        List<MaxMinEntry> listC = gfr.c(this.lineChartAttrs, weightResults, Long.valueOf(millis));
        if (listC != null && listC.size() > 0 && listC.get(0) != null && this.mIsSelectedTop) {
            this.isSelectedItem = true;
            listC.get(0).setSelected(1);
            updateCurVirtualAccount(listC.get(0).timestamp);
        }
        this.mLineEntryList = listC;
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listC);
            list2.addAll(listC);
        }
        int weightYMaxValue = this.mViewModel.formatWeightYMaxValue(this.mViewModel.getTheMaxNumber(listC));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarL = rtrVar.l(this.mYAxis, weightYMaxValue);
        this.mYAxis = rtrVarL;
        Intrinsics.checkNotNull(rtrVarL);
        rtrVarL.setLabelCount(3);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.f = 3;
        int size = listC.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.setYAxis(this.mYAxis);
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar2);
        ufeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.notifyDataSetChanged();
        updateDataTitleView(weightResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshWeightData$lambda$4(VirtualMemberDayView this$0, long j, List virtualAccounts) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccounts, "virtualAccounts");
        ArrayList arrayList = new ArrayList();
        Iterator it = virtualAccounts.iterator();
        while (it.hasNext()) {
            VirtualAccount virtualAccount = (VirtualAccount) it.next();
            qal.c("refreshWeightData() " + virtualAccount + ".bodyComposition");
            ListExtKt.add(arrayList, (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class));
        }
        this$0.mListVirtualAccounts = virtualAccounts;
        this$0.refreshLineChart(arrayList, j);
        if (arrayList.isEmpty()) {
            Logger.i(TAG, "refreshWeightData isEmpty gone");
            ViewGroup viewGroup = this$0.layoutWeightDayDetail;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
                viewGroup = null;
            }
            ViewExtKt.gone(viewGroup);
        } else {
            this$0.updateLastData();
        }
        Logger.i(TAG, "weightResults : " + arrayList.size());
        return Unit.INSTANCE;
    }

    private final void setVisibleForDataReportBtn(long accountId) {
        VirtualAccount virtualAccount = this.mCurVirtualAccount;
        if (virtualAccount != null) {
            Intrinsics.checkNotNull(virtualAccount);
            if (virtualAccount.getAccountId() == accountId && this.isAdult) {
                VirtualAccount virtualAccount2 = this.mCurVirtualAccount;
                Intrinsics.checkNotNull(virtualAccount2);
                WeightResult weightResult = (WeightResult) bu7.a(virtualAccount2.getBodyComposition(), WeightResult.class);
                if (weightResult != null) {
                    boolean z = false;
                    Logger.i("setVisibleForDataReportBtn " + f4b.c(weightResult), new Object[0]);
                    if (weightResult.getMeasuringImpedance1() != 0 && weightResult.getMeasuringImpedance2() != 0 && weightResult.getMeasuringImpedance3() != 0 && weightResult.getMeasuringImpedance4() != 0 && weightResult.getMeasuringImpedance5() != 0 && weightResult.getMeasuringImpedance6() != 0 && weightResult.getMeasuringImpedance7() != 0 && weightResult.getMeasuringImpedance8() != 0 && weightResult.getMeasuringImpedance9() != 0 && weightResult.getMeasuringImpedance10() != 0 && weightResult.getMeasuringImpedance11() != 0 && weightResult.getMeasuringImpedance12() != 0 && weightResult.getBfp() != 0.0f && this.isAdult) {
                        z = true;
                    }
                    showDataReportBtn(z);
                    return;
                }
                return;
            }
        }
        Logger.i(TAG, "setVisibleForDataReportBtn gone");
        ViewGroup viewGroup = this.layoutWeightDayDetail;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup = null;
        }
        ViewExtKt.gone(viewGroup);
    }

    private final void showDataReportBtn(boolean isShowDataReport) {
        TextView textView = null;
        if (this.isAdult) {
            Logger.i(TAG, "showDataReportBtn visible");
            ViewGroup viewGroup = this.layoutWeightDayDetail;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
                viewGroup = null;
            }
            ViewExtKt.visible(viewGroup);
        } else {
            Logger.i(TAG, "showDataReportBtn gone");
            ViewGroup viewGroup2 = this.layoutWeightDayDetail;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
                viewGroup2 = null;
            }
            ViewExtKt.gone(viewGroup2);
        }
        TextView textView2 = this.downloadReportBtn;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadReportBtn");
        } else {
            textView = textView2;
        }
        ViewExtKt.setVisible(textView, isShowDataReport);
    }

    private final void updateDataTitleView(List<WeightResult> weightResults) {
        String str;
        DataTitleView dataTitleView = this.mDataTitleView;
        if (dataTitleView != null) {
            dataTitleView.setVisibility(0);
        }
        if (!(!weightResults.isEmpty())) {
            DataTitleView dataTitleView2 = this.mDataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.b(ResourceExtKt.getString(zzi.d6));
                return;
            }
            return;
        }
        if (this.mIsSelectedTop) {
            DataTitleView dataTitleView3 = this.mDataTitleView;
            if (dataTitleView3 != null) {
                dataTitleView3.b("");
                return;
            }
            return;
        }
        Logger.i(TAG, "updateDataTitleView gone");
        ViewGroup viewGroup = this.layoutWeightDayDetail;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup = null;
        }
        ViewExtKt.gone(viewGroup);
        this.isSelectedItem = false;
        WeightResult weightResult = weightResults.get(weightResults.size() - 1);
        WeightResult weightResult2 = weightResults.size() > 1 ? weightResults.get(weightResults.size() - 2) : null;
        WeightResult weightResult3 = weightResult;
        if (weightResult3 != null) {
            if (TimeDateUtil.isToday(TimeDateUtil.timestampToLocalDateInner(weightResult3.getTime()))) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s %s", Arrays.copyOf(new Object[]{ResourceExtKt.getString(zzi.z0), TimeDateUtil.getDateStr(weightResult3.getTime() / ((long) 1000), TimeUtils.FORMAT_H_M)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = TimeDateUtil.getDateYYYYMMddLocalFormat(weightResult3.getTime()) + " " + TimeDateUtil.getDateStr(weightResult3.getTime() / ((long) 1000), TimeUtils.FORMAT_H_M);
            }
            if (weightResult2 == null) {
                DataTitleView dataTitleView4 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView4);
                dataTitleView4.a(getContext(), ResourceExtKt.getString(zzi.p0, String.valueOf(weightResult3.getWeight())), String.valueOf(weightResult3.getWeight()), str);
                return;
            }
            float weight = weightResult2.getWeight();
            float weight2 = weightResult3.getWeight();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(weight2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            int iCompare = Float.compare(weight2, weight);
            if (iCompare == -1) {
                BigDecimal bigDecimalSubtract = new BigDecimal(weight).subtract(new BigDecimal(weight2));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal scale = bigDecimalSubtract.setScale(1, RoundingMode.HALF_UP);
                DataTitleView dataTitleView5 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView5);
                dataTitleView5.a(getContext(), getResources().getQuantityString(oxi.d, 1, str2, 1, scale.toString()), str2, str);
                return;
            }
            if (iCompare != 1) {
                DataTitleView dataTitleView6 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView6);
                dataTitleView6.a(getContext(), ResourceExtKt.getString(zzi.p0, str2), str2, str);
            } else {
                BigDecimal bigDecimalSubtract2 = new BigDecimal(weight2).subtract(new BigDecimal(weight));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                BigDecimal scale2 = bigDecimalSubtract2.setScale(1, RoundingMode.HALF_UP);
                DataTitleView dataTitleView7 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView7);
                dataTitleView7.a(getContext(), getResources().getQuantityString(oxi.c, 1, str2, 1, scale2.toString()), str2, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLastData() {
        List<VirtualAccount> list = this.mListVirtualAccounts;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<VirtualAccount> list2 = this.mListVirtualAccounts;
        Intrinsics.checkNotNull(list2);
        List<VirtualAccount> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.widget.VirtualMemberDayView$updateLastData$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((VirtualAccount) t2).getCreateTime()), Long.valueOf(((VirtualAccount) t).getCreateTime()));
            }
        });
        this.mListVirtualAccounts = listSortedWith;
        Intrinsics.checkNotNull(listSortedWith);
        Logger.i(TAG, "refreshWeightData last time " + listSortedWith.get(0).getCreateTime());
        List<VirtualAccount> list3 = this.mListVirtualAccounts;
        Intrinsics.checkNotNull(list3);
        updateCurVirtualAccount(list3.get(0).getCreateTime() / ((long) 1000));
    }

    @Nullable
    public final List<MaxMinEntry> getMLineEntryList() {
        return this.mLineEntryList;
    }

    /* JADX INFO: renamed from: isSelectedItem, reason: from getter */
    public final boolean getIsSelectedItem() {
        return this.isSelectedItem;
    }

    public final void refreshWeightData(@NotNull VirtualAccount virtualAccount, final long millis) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Logger.i(TAG, "refreshWeightData birth: " + virtualAccount.getBirth());
        Logger.i(TAG, "refreshWeightData height: " + virtualAccount.getHeight());
        Logger.i(TAG, "refreshWeightData sex: " + virtualAccount.getSex());
        Logger.i(TAG, "refreshWeightData name: " + virtualAccount.getName());
        this.mUserBirth = virtualAccount.getBirth();
        this.mUserHeight = virtualAccount.getHeight();
        this.mUserSex = virtualAccount.getSex();
        this.mUsername = virtualAccount.getName();
        Logger.i(TAG, "refreshWeightData gone");
        ViewGroup viewGroup = this.layoutWeightDayDetail;
        LinearLayout linearLayout = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutWeightDayDetail");
            viewGroup = null;
        }
        ViewExtKt.gone(viewGroup);
        setVisibleForDataReportBtn(virtualAccount.getAccountId());
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        this.isAdult = weightInfoUtil.getAge(dateToString) >= 18;
        LinearLayout linearLayout2 = this.mNoteLin;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoteLin");
        } else {
            linearLayout = linearLayout2;
        }
        ViewExtKt.setVisible(linearLayout, !this.isAdult);
        this.mViewModel.queryByVirtualid(virtualAccount, millis, millis + TimeUnit.DAYS.toMillis(1L), new Function1() { // from class: wzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDayView.refreshWeightData$lambda$4(this.f38527a, millis, (List) obj);
            }
        });
    }

    public final void setIsSelectedTop(boolean selectedTop) {
        this.mIsSelectedTop = selectedTop;
    }

    public final void setMLineEntryList(@Nullable List<? extends MaxMinEntry> list) {
        this.mLineEntryList = list;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    public final void updateCurVirtualAccount(long time) {
        boolean z;
        boolean z2 = false;
        Logger.i("updateCurVirtualAccount " + this.mListVirtualAccounts, new Object[0]);
        List<VirtualAccount> list = this.mListVirtualAccounts;
        if (list != null) {
            Logger.i("updateCurVirtualAccount mListVirtualAccounts " + f4b.c(list), new Object[0]);
        }
        List<VirtualAccount> list2 = this.mListVirtualAccounts;
        LinearLayout linearLayout = null;
        if (list2 != null) {
            boolean z3 = false;
            for (VirtualAccount virtualAccount : list2) {
                WeightResult weightResult = (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class);
                Logger.i("updateCurVirtualAccount forEach ()  time " + time + ": " + (weightResult != null ? Long.valueOf(weightResult.getTime()) : null), new Object[0]);
                if (weightResult != null && time == weightResult.getTime() / ((long) 1000)) {
                    this.mCurVirtualAccount = virtualAccount;
                    virtualAccount.setSex(this.mUserSex);
                    VirtualAccount virtualAccount2 = this.mCurVirtualAccount;
                    if (virtualAccount2 != null) {
                        virtualAccount2.setBirth(this.mUserBirth);
                    }
                    VirtualAccount virtualAccount3 = this.mCurVirtualAccount;
                    if (virtualAccount3 != null) {
                        virtualAccount3.setHeight(this.mUserHeight);
                    }
                    if (weightResult.getMeasuringImpedance1() != 0 && weightResult.getMeasuringImpedance2() != 0 && weightResult.getMeasuringImpedance3() != 0 && weightResult.getMeasuringImpedance4() != 0 && weightResult.getMeasuringImpedance5() != 0 && weightResult.getMeasuringImpedance6() != 0 && weightResult.getMeasuringImpedance7() != 0 && weightResult.getMeasuringImpedance8() != 0 && weightResult.getMeasuringImpedance9() != 0 && weightResult.getMeasuringImpedance10() != 0 && weightResult.getMeasuringImpedance11() != 0 && weightResult.getMeasuringImpedance12() != 0 && weightResult.getBfp() != 0.0f) {
                        z3 = true;
                    }
                }
            }
            if (z3 && this.isAdult) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        showDataReportBtn(z);
        LinearLayout linearLayout2 = this.mNoteLin;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoteLin");
        } else {
            linearLayout = linearLayout2;
        }
        if (!z && !this.isAdult) {
            z2 = true;
        }
        ViewExtKt.setVisible(linearLayout, z2);
        refreshCardHolder();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberDayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mViewModel = new VirtualMemberDayViewModel();
        this.mUsername = "";
        this.mContext = context;
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberDayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mViewModel = new VirtualMemberDayViewModel();
        this.mUsername = "";
        this.mContext = context;
        initView();
    }
}
