package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.notch.ScreenUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.data.valueformatter.RateHighLightMarkValueFormatter;
import com.xiaomi.fitness.electronic.scale.data.valueformatter.WeightHighLightMarkValueFormatter;
import com.xiaomi.fitness.electronic.scale.dialog.WeightTypeListDialog;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bl5;
import defpackage.bri;
import defpackage.eu3;
import defpackage.gfr;
import defpackage.gui;
import defpackage.hak;
import defpackage.lni;
import defpackage.mpo;
import defpackage.ofr;
import defpackage.onq;
import defpackage.ppo;
import defpackage.rtr;
import defpackage.str;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.zqr;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0083\u00012\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b}\u0010\u0006B\u001c\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~¢\u0006\u0005\b}\u0010\u0080\u0001B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u001b¢\u0006\u0005\b}\u0010\u0082\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ)\u0010\u0010\u001a\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\bJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b(\u0010\"J%\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020$¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020$¢\u0006\u0004\b0\u0010/J\u0015\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020A\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010:R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020W\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010:R\u0016\u0010Y\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR0\u0010[\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010.\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010^R$\u0010u\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010S\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010VR\u001e\u0010{\u001a\n\u0012\u0004\u0012\u00020W\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010:R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010|¨\u0006\u0085\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "initView", "(Landroid/content/Context;)V", "initMaxMinTitleRecyclerView", "()V", "initChartRecyclerView", "initDetailRecyclerView", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "map", "refreshDetailCard", "(Ljava/util/Map;)V", "Ljava/util/TreeMap;", "", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResults", "refreshView", "(Ljava/util/TreeMap;)V", "refreshVisibleEntries", "refreshTopSwitchView", "dealIndexOnClick", "", "resultCode", "dealDialogResult", "(I)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "refreshChartView", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "refreshStaticChartView", "", "hasData", "refreshTitleTimeView", "(Z)V", "refreshWeightData", AccountInteractActivity.KEY_REQUEST_CODE, "Landroid/os/Bundle;", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "isSelectedItem", "()Z", "canUpdate", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView$DataChangeListener;", "dataChangeListener", "setDataChangeListener", "(Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView$DataChangeListener;)V", "Landroid/widget/TextView;", "tvIndexSelect", "Landroid/widget/TextView;", "", "arrayIndexStringList", "Ljava/util/List;", "currentBodyType", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "chartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "mChartEntries", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "maxMinRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lmpo;", "mMaxMinTitleAdapter", "Lmpo;", "Lppo;", "mMaxMinTitleList", "typeIndex", "I", "mWeightResults", "Ljava/util/Map;", "isAdult", "Z", "Landroid/view/View;", "rootViewLayout", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "mNoteLin", "Landroid/widget/LinearLayout;", "mRootContainer", "mContext", "Landroid/content/Context;", "", "startTime", "J", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel;", "mViewModel", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel;", "recyclerWeightDetail", "getRecyclerWeightDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerWeightDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mDetailAdapter", "mDataListDetail", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView$DataChangeListener;", "<init>", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "DataChangeListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVirtualMemberStatisticsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualMemberStatisticsView.kt\ncom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,485:1\n1019#2,2:486\n*S KotlinDebug\n*F\n+ 1 VirtualMemberStatisticsView.kt\ncom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView\n*L\n442#1:486,2\n*E\n"})
public final class VirtualMemberStatisticsView extends ConstraintLayout {
    private static final int REQUEST_LENGTH = 9;
    private static final int REQ_CODE = 1;

    @NotNull
    public static final String TAG = "VirtualMemberStatisticsView";

    @NotNull
    private List<String> arrayIndexStringList;

    @Nullable
    private LineChartRecyclerView chartRecyclerView;

    @NotNull
    private BodyComposition currentBodyType;

    @Nullable
    private DataChangeListener dataChangeListener;
    private long endTime;
    private boolean isAdult;
    private boolean isSelectedItem;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private List<MaxMinEntry> mChartEntries;
    private Context mContext;

    @Nullable
    private List<ppo> mDataListDetail;

    @Nullable
    private mpo mDetailAdapter;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private mpo mMaxMinTitleAdapter;

    @Nullable
    private List<ppo> mMaxMinTitleList;
    private LinearLayout mNoteLin;
    private LinearLayout mRootContainer;

    @NotNull
    private VirtualMemberStatisticsViewModel mViewModel;

    @Nullable
    private Map<String, ? extends TreeMap<String, WeightResult>> mWeightResults;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView maxMinRecyclerView;

    @Nullable
    private RecyclerView recyclerWeightDetail;
    private View rootViewLayout;
    private long startTime;

    @Nullable
    private TextView tvIndexSelect;
    private int typeIndex;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView$DataChangeListener;", "", "onTimeChange", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DataChangeListener {
        void onTimeChange(long start, long end);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BodyComposition.values().length];
            try {
                iArr[BodyComposition.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BodyComposition.BODY_FAT_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BodyComposition.MUSCLE_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberStatisticsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.arrayIndexStringList = new ArrayList();
        this.currentBodyType = BodyComposition.WEIGHT;
        this.mViewModel = new VirtualMemberStatisticsViewModel();
        initView(context);
    }

    private final void dealDialogResult(int resultCode) {
        BodyComposition bodyComposition;
        if (resultCode < 0) {
            return;
        }
        if (resultCode >= this.arrayIndexStringList.size()) {
            resultCode = 0;
        }
        this.typeIndex = resultCode;
        refreshTopSwitchView();
        int i = this.typeIndex;
        if (i == 0) {
            bodyComposition = BodyComposition.WEIGHT;
        } else if (i != 1) {
            bodyComposition = i != 2 ? BodyComposition.WEIGHT : BodyComposition.MUSCLE_RATE;
        } else {
            bodyComposition = BodyComposition.BODY_FAT_RATE;
        }
        this.currentBodyType = bodyComposition;
        Logger.i(TAG, "dealDialogResult refreshStaticChartView");
        refreshStaticChartView();
    }

    private final void dealIndexOnClick() {
        if (this.isAdult) {
            WeightTypeListDialog weightTypeListDialogCreate = new WeightTypeListDialog.b().create();
            Intrinsics.checkNotNullExpressionValue(weightTypeListDialogCreate, "create(...)");
            WeightTypeListDialog weightTypeListDialog = weightTypeListDialogCreate;
            weightTypeListDialog.updateData(this.arrayIndexStringList);
            weightTypeListDialog.setRequestCode(1);
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            weightTypeListDialog.showIfNeed(((BaseActivity) context).getSupportFragmentManager());
        }
    }

    private final void initChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.a0 = true;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(AppUtil.getApp().getApplicationContext(), this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        this.mYAxis = rtr.f(vfeVar2, 60.0f, 3);
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vqr vqrVar = new vqr(vfeVar3, vfeVar3.c, new zqr(getContext()));
        this.mXAxis = vqrVar;
        yfe yfeVar = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        this.mItemDecoration = yfeVar;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(new WeightHighLightMarkValueFormatter(AppUtil.getApp().getApplicationContext()));
        LineChartRecyclerView lineChartRecyclerView2 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(AppUtil.getApp().getApplicationContext(), this.mChartEntries, this.chartRecyclerView, this.mXAxis, this.lineChartAttrs, new WeightHighLightMarkValueFormatter(AppUtil.getApp().getApplicationContext()));
        LineChartRecyclerView lineChartRecyclerView3 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(AppUtil.getApp().getApplicationContext(), this.chartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView$initChartRecyclerView$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                this.this$0.isSelectedItem = true;
                if (barEntry == null || !barEntry.isSelected()) {
                    RecyclerView recyclerView = this.this$0.maxMinRecyclerView;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.this$0.maxMinRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initDetailRecyclerView() {
        this.mDataListDetail = new ArrayList();
        Context context = this.mContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView.initDetailRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                mpo mpoVar = VirtualMemberStatisticsView.this.mDetailAdapter;
                Intrinsics.checkNotNull(mpoVar);
                return mpoVar.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(new bl5());
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context2 = context3;
        }
        this.mDetailAdapter = new mpo(context2, this.mDataListDetail, zzi.s3, lni.l);
        RecyclerView recyclerView3 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initMaxMinTitleRecyclerView() {
        ArrayList arrayList = new ArrayList();
        this.mMaxMinTitleList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        List<ppo> listD = gfr.d(AppUtil.getApp().getApplicationContext(), this.typeIndex, "-", "-");
        Intrinsics.checkNotNullExpressionValue(listD, "createMaxMinTitleSummaryModel(...)");
        arrayList.addAll(listD);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(AppUtil.getApp().getApplicationContext(), 2);
        RecyclerView recyclerView = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        ofr ofrVar = new ofr();
        RecyclerView recyclerView2 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(ofrVar);
        this.mMaxMinTitleAdapter = new mpo(AppUtil.getApp().getApplicationContext(), this.mMaxMinTitleList);
        RecyclerView recyclerView3 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mMaxMinTitleAdapter);
        RecyclerView recyclerView4 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initView(Context context) {
        this.mContext = context;
        View viewInflate = LayoutInflater.from(AppUtil.getApp().getApplicationContext()).inflate(gui.h0, (ViewGroup) this, true);
        this.rootViewLayout = viewInflate;
        View view = null;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            viewInflate = null;
        }
        this.mRootContainer = (LinearLayout) viewInflate.findViewById(bri.y3);
        View view2 = this.rootViewLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view2 = null;
        }
        this.mNoteLin = (LinearLayout) view2.findViewById(bri.Q1);
        LinearLayout linearLayout = this.mRootContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ScreenUtil screenUtil = ScreenUtil.INSTANCE;
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        layoutParams.width = screenUtil.getScreenSize(applicationContext)[0];
        View view3 = this.rootViewLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view3 = null;
        }
        this.chartRecyclerView = (LineChartRecyclerView) view3.findViewById(bri.u);
        View view4 = this.rootViewLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view4 = null;
        }
        this.maxMinRecyclerView = (RecyclerView) view4.findViewById(bri.q2);
        View view5 = this.rootViewLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
            view5 = null;
        }
        TextView textView = (TextView) view5.findViewById(bri.G5);
        this.tvIndexSelect = textView;
        Intrinsics.checkNotNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: i0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                VirtualMemberStatisticsView.initView$lambda$0(this.f20655a, view6);
            }
        });
        View view6 = this.rootViewLayout;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootViewLayout");
        } else {
            view = view6;
        }
        this.recyclerWeightDetail = (RecyclerView) view.findViewById(bri.L);
        refreshTopSwitchView();
        initChartRecyclerView();
        initMaxMinTitleRecyclerView();
        initDetailRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(VirtualMemberStatisticsView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealIndexOnClick();
    }

    private final void refreshChartView(VirtualAccount virtualAccount) {
        this.mViewModel.queryVirtualDayData(virtualAccount, this.isAdult, new Function2() { // from class: h0r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VirtualMemberStatisticsView.refreshChartView$lambda$2(this.f19552a, (Map) obj, (Map) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshChartView$lambda$2(VirtualMemberStatisticsView this$0, Map changeMap, Map valueMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(changeMap, "changeMap");
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        this$0.mWeightResults = valueMap;
        Logger.i(TAG, "refreshChartView refreshStaticChartView");
        this$0.refreshStaticChartView();
        this$0.refreshDetailCard(changeMap);
        return Unit.INSTANCE;
    }

    private final void refreshDetailCard(Map<BodyComposition, ? extends List<WeightItem>> map) {
        Logger.i(TAG, "refreshDetailCard map:" + map.size());
        if (map.isEmpty()) {
            RecyclerView recyclerView = this.recyclerWeightDetail;
            Intrinsics.checkNotNull(recyclerView);
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        List<ppo> listF = gfr.f(context, map);
        List<ppo> list = listF;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView2 = this.recyclerWeightDetail;
            Intrinsics.checkNotNull(recyclerView2);
            ViewExtKt.setVisible(recyclerView2, false);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView3);
        ViewExtKt.setVisible(recyclerView3, true);
        List<ppo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<ppo> list3 = this.mDataListDetail;
        Intrinsics.checkNotNull(list3);
        Intrinsics.checkNotNull(listF);
        list3.addAll(list);
        mpo mpoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(mpoVar);
        mpoVar.notifyDataChanged();
    }

    private final void refreshStaticChartView() {
        TreeMap<String, WeightResult> treeMap;
        Map<String, ? extends TreeMap<String, WeightResult>> map = this.mWeightResults;
        if (map == null) {
            Logger.i(TAG, "refreshStaticChartView mWeightResults == null");
            refreshView(new TreeMap<>());
            refreshTitleTimeView(false);
            return;
        }
        if (this.typeIndex == 0) {
            Intrinsics.checkNotNull(map);
            treeMap = map.get("weight");
        } else {
            Intrinsics.checkNotNull(map);
            treeMap = map.get(VirtualMemberStatisticsViewModel.KEY_FAT);
        }
        if (treeMap == null) {
            Logger.i(TAG, "refreshStaticChartView result == null");
            refreshView(new TreeMap<>());
            refreshTitleTimeView(false);
        } else {
            refreshView(treeMap);
            Logger.i(TAG, "refreshStaticChartView hasData");
            refreshTitleTimeView(true);
        }
    }

    private final void refreshTitleTimeView(boolean hasData) {
        TreeMap<String, WeightResult> treeMap;
        if (!hasData) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.endTime = jCurrentTimeMillis;
            long millis = jCurrentTimeMillis - TimeUnit.DAYS.toMillis(7L);
            this.startTime = millis;
            DataChangeListener dataChangeListener = this.dataChangeListener;
            if (dataChangeListener != null) {
                dataChangeListener.onTimeChange(millis, this.endTime);
                return;
            }
            return;
        }
        if (this.typeIndex == 0) {
            Map<String, ? extends TreeMap<String, WeightResult>> map = this.mWeightResults;
            Intrinsics.checkNotNull(map);
            treeMap = map.get("weight");
        } else {
            Map<String, ? extends TreeMap<String, WeightResult>> map2 = this.mWeightResults;
            Intrinsics.checkNotNull(map2);
            treeMap = map2.get(VirtualMemberStatisticsViewModel.KEY_FAT);
        }
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, WeightResult>> setEntrySet = treeMap != null ? treeMap.entrySet() : null;
        Intrinsics.checkNotNull(setEntrySet);
        for (Map.Entry<String, WeightResult> entry : setEntrySet) {
            Intrinsics.checkNotNullExpressionValue(entry, "next(...)");
            WeightResult value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            arrayList.add(value);
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView$refreshTitleTimeView$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((WeightResult) t2).getTime()), Long.valueOf(((WeightResult) t).getTime()));
                }
            });
        }
        if (arrayList.size() < 1) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.endTime = jCurrentTimeMillis2;
            long millis2 = jCurrentTimeMillis2 - TimeUnit.DAYS.toMillis(7L);
            this.startTime = millis2;
            DataChangeListener dataChangeListener2 = this.dataChangeListener;
            if (dataChangeListener2 != null) {
                dataChangeListener2.onTimeChange(millis2, this.endTime);
                return;
            }
            return;
        }
        if (arrayList.size() < 2) {
            this.startTime = ((WeightResult) arrayList.get(0)).getTime();
            this.endTime = ((WeightResult) arrayList.get(0)).getTime();
            DataChangeListener dataChangeListener3 = this.dataChangeListener;
            if (dataChangeListener3 != null) {
                dataChangeListener3.onTimeChange(((WeightResult) arrayList.get(0)).getTime(), ((WeightResult) arrayList.get(0)).getTime());
                return;
            }
            return;
        }
        this.startTime = ((WeightResult) arrayList.get(arrayList.size() - 1)).getTime();
        long time = ((WeightResult) arrayList.get(0)).getTime();
        this.endTime = time;
        DataChangeListener dataChangeListener4 = this.dataChangeListener;
        if (dataChangeListener4 != null) {
            dataChangeListener4.onTimeChange(this.startTime, time);
        }
    }

    private final void refreshTopSwitchView() {
        this.arrayIndexStringList.clear();
        this.arrayIndexStringList.add(ResourceExtKt.getString(zzi.A2));
        if (this.isAdult) {
            this.arrayIndexStringList.add(ResourceExtKt.getString(zzi.B1));
            this.arrayIndexStringList.add(ResourceExtKt.getString(zzi.W1));
        } else {
            this.currentBodyType = BodyComposition.WEIGHT;
            this.typeIndex = 0;
        }
        if (this.typeIndex < this.arrayIndexStringList.size()) {
            TextView textView = this.tvIndexSelect;
            Intrinsics.checkNotNull(textView);
            textView.setText(this.arrayIndexStringList.get(this.typeIndex));
        }
    }

    private final void refreshView(TreeMap<String, WeightResult> weightResults) {
        List<MaxMinEntry> listG;
        onq weightHighLightMarkValueFormatter;
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        BodyComposition bodyComposition = this.currentBodyType;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[bodyComposition.ordinal()];
        if (i == 1) {
            listG = gfr.g(weightResults);
        } else if (i != 2) {
            listG = i != 3 ? gfr.g(weightResults) : gfr.e(weightResults);
        } else {
            listG = gfr.a(weightResults);
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        Intrinsics.checkNotNull(listG);
        list2.addAll(listG);
        int weightYMaxValue = this.mViewModel.formatWeightYMaxValue(ScaleUtil.getTheMaxNumber(this.mChartEntries));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.m(this.mYAxis, weightYMaxValue, 3);
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        int i2 = iArr[this.currentBodyType.ordinal()];
        if (i2 != 1) {
            weightHighLightMarkValueFormatter = (i2 == 2 || i2 == 3) ? new RateHighLightMarkValueFormatter(AppUtil.getApp().getApplicationContext()) : new WeightHighLightMarkValueFormatter(AppUtil.getApp().getApplicationContext());
        } else {
            weightHighLightMarkValueFormatter = new WeightHighLightMarkValueFormatter(AppUtil.getApp().getApplicationContext());
        }
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(weightHighLightMarkValueFormatter);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: g0r
                @Override // java.lang.Runnable
                public final void run() {
                    VirtualMemberStatisticsView.refreshView$lambda$1(this.f18440a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshView$lambda$1(VirtualMemberStatisticsView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshVisibleEntries();
    }

    private final void refreshVisibleEntries() {
        long j;
        Float f;
        Float f2;
        long jChangZeroOfTheDay;
        String str;
        str strVarJ = eu3.j(this.chartRecyclerView, 7);
        List<T> list = strVarJ.c;
        Logger.i(TAG, "refreshVisibleEntries visibleEntries size " + list.size());
        Float fValueOf = Float.valueOf(strVarJ.f33986b);
        Float fValueOf2 = Float.valueOf(strVarJ.f33985a);
        if (ArrayUtils.isEmpty(list)) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.localDateToTimestamp(localDateNow));
            f2 = null;
            j = jChangZeroOfTheDay;
            f = null;
        } else {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            j = ((RecyclerBarEntry) obj).timestamp;
            Object obj2 = list.get(list.size() - 1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            f = fValueOf;
            f2 = fValueOf2;
            jChangZeroOfTheDay = ((RecyclerBarEntry) obj2).timestamp;
        }
        Logger.i(TAG, "refreshVisibleEntries leftTime:" + TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay) + "/rightTime:" + TimeDateUtil.timestampToLocalDate(j) + "/minValue:" + f + "/maxValue:" + f2 + "/type" + this.typeIndex);
        String str2 = "-";
        if (f == null) {
            str = "-";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (f2 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f2}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        List<ppo> list2 = this.mMaxMinTitleList;
        if (list2 != null) {
            list2.clear();
        }
        List<ppo> list3 = this.mMaxMinTitleList;
        if (list3 != null) {
            List<ppo> listD = gfr.d(AppUtil.getApp().getApplicationContext(), this.typeIndex, str2, str);
            Intrinsics.checkNotNullExpressionValue(listD, "createMaxMinTitleSummaryModel(...)");
            list3.addAll(listD);
        }
        mpo mpoVar = this.mMaxMinTitleAdapter;
        if (mpoVar != null) {
            mpoVar.notifyDataChanged();
        }
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            ViewExtKt.setVisible(recyclerView, true);
        }
    }

    public final boolean canUpdate() {
        TreeMap<String, WeightResult> treeMap;
        Map<String, ? extends TreeMap<String, WeightResult>> map = this.mWeightResults;
        if (map == null) {
            return true;
        }
        if (this.typeIndex == 0) {
            Intrinsics.checkNotNull(map);
            treeMap = map.get("weight");
        } else {
            Intrinsics.checkNotNull(map);
            treeMap = map.get(VirtualMemberStatisticsViewModel.KEY_FAT);
        }
        return treeMap == null || treeMap.size() < 7;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final RecyclerView getRecyclerWeightDetail() {
        return this.recyclerWeightDetail;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: isSelectedItem, reason: from getter */
    public final boolean getIsSelectedItem() {
        return this.isSelectedItem;
    }

    public final void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 1) {
            dealDialogResult(resultCode);
        }
    }

    public final void refreshWeightData(@NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        this.isAdult = weightInfoUtil.getAge(dateToString) >= 18;
        LinearLayout linearLayout = this.mNoteLin;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoteLin");
            linearLayout = null;
        }
        ViewExtKt.setVisible(linearLayout, !this.isAdult);
        refreshTopSwitchView();
        refreshChartView(virtualAccount);
    }

    public final void setDataChangeListener(@NotNull DataChangeListener dataChangeListener) {
        Intrinsics.checkNotNullParameter(dataChangeListener, "dataChangeListener");
        this.dataChangeListener = dataChangeListener;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setRecyclerWeightDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerWeightDetail = recyclerView;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.arrayIndexStringList = new ArrayList();
        this.currentBodyType = BodyComposition.WEIGHT;
        this.mViewModel = new VirtualMemberStatisticsViewModel();
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.arrayIndexStringList = new ArrayList();
        this.currentBodyType = BodyComposition.WEIGHT;
        this.mViewModel = new VirtualMemberStatisticsViewModel();
        initView(context);
    }
}
