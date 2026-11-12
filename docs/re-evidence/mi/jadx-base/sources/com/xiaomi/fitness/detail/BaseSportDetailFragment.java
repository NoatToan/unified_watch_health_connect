package com.xiaomi.fitness.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.view.BubblePopupWindow;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.util.ConsistencyEventUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.lp5;
import defpackage.v84;
import defpackage.xd5;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u007f2\u00020\u0001:\u0001\u007fB\u0007¢\u0006\u0004\b~\u0010\u001eJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0007H\u0004¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\u0007H\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020\u00072\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0005¢\u0006\u0004\b.\u0010/J'\u00104\u001a\u00020\u00072\u0006\u00101\u001a\u00020\n2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+H\u0004¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u00072\u0006\u00101\u001a\u00020\n2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+H\u0004¢\u0006\u0004\b6\u00105J\u001d\u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\n¢\u0006\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010D\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010C8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b0\u0010/R\u0016\u0010I\u001a\u00020H8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u00020H8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010J\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010Q\u001a\u0004\u0018\u00010P8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010\u0004\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010J\u001a\u0004\bd\u0010M\"\u0004\be\u0010OR$\u0010g\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010h\u001a\u0004\bn\u0010j\"\u0004\bo\u0010lR$\u0010q\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010J\u001a\u0004\bx\u0010M\"\u0004\by\u0010OR$\u0010z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010_\u001a\u0004\b{\u0010\u0004\"\u0004\b|\u0010bR\u0014\u0010}\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0010¨\u0006\u0080\u0001"}, d2 = {"Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "key", "", "initIvExpandViewClick", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)V", "", "dataType", "onTraceBtmIntroduction", "(Ljava/lang/String;)V", "", "hasMaxMinAverage", "()Z", "", "average", VibrateModeSetFragment.MAX, "min", "reportCardInfo", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getCardName", "()Ljava/lang/String;", "onTraceBtnFullScreen", "more", "onTraceBtnLoad", "(Ljava/lang/String;Z)V", "onDestroyView", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initBaseChart", "initDetailViewModel", "initBaseParams", "menuVisible", "setMenuVisibility", "(Z)V", "", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", "barEntries", "setVisibleEntries1", "(Ljava/util/List;)V", "setVisibleEntries", "logTag", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "printChartInt", "(Ljava/lang/String;Ljava/util/List;)V", "printChartFloat", "Landroid/content/Context;", "context", "str", "Lcom/xiaomi/fitness/detail/view/BubblePopupWindow;", "createAbnormalBubblePop", "(Landroid/content/Context;Ljava/lang/String;)Lcom/xiaomi/fitness/detail/view/BubblePopupWindow;", "Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "mLineChart", "Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "Lxd5;", "mLineChartAttr", "Lxd5;", "", "visibleEntries", "Ljava/util/List;", "getVisibleEntries", "()Ljava/util/List;", "", DailyRecordKey.sportType, "I", "sportDataType", "getSportDataType", "()I", "setSportDataType", "(I)V", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "detailViewModel", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "getDetailViewModel", "()Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "setDetailViewModel", "(Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;)V", "Landroid/view/View$OnClickListener;", "abnormalGuideListener", "Landroid/view/View$OnClickListener;", "getAbnormalGuideListener", "()Landroid/view/View$OnClickListener;", "setAbnormalGuideListener", "(Landroid/view/View$OnClickListener;)V", "mSportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMSportValues", "setMSportValues", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "mDetailSportType", "getMDetailSportType", "setMDetailSportType", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemViewLeft", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemViewLeft", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemViewLeft", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemViewRight", "getItemViewRight", "setItemViewRight", "Landroid/widget/ImageView;", "ivExpandView", "Landroid/widget/ImageView;", "getIvExpandView", "()Landroid/widget/ImageView;", "setIvExpandView", "(Landroid/widget/ImageView;)V", "maxShowCountNum", "getMaxShowCountNum", "setMaxShowCountNum", "mBasicReport", "getMBasicReport", "setMBasicReport", "isTriathlonNum", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BaseSportDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SPORT_DATA_TYPE = "sport_data_type";

    @Nullable
    private View.OnClickListener abnormalGuideListener;

    @Nullable
    private SportRecordDetailViewModel detailViewModel;

    @Nullable
    private SportDetailItemView itemViewLeft;

    @Nullable
    private SportDetailItemView itemViewRight;

    @Nullable
    private ImageView ivExpandView;

    @Nullable
    private SportBasicReport mBasicReport;
    private int mDetailSportType;

    @JvmField
    @Nullable
    protected CustomLineChart mLineChart;

    @JvmField
    @Nullable
    protected xd5 mLineChartAttr;

    @Nullable
    private SportBasicReport mSportValues;
    private int maxShowCountNum;
    private int sportDataType;

    @JvmField
    protected int sportType;

    @Nullable
    private List<SportRecordEntry> visibleEntries;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0005J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/BaseSportDetailFragment$Companion;", "", "<init>", "()V", "SPORT_DATA_TYPE", "", "createFragmentTag", "originalTag", "triathlonNum", "", "sportDataType", Constants.EXTRA_FROM_SWITCH_FRAGMENT, "", "containerId", "clz", "Ljava/lang/Class;", "tag", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String createFragmentTag(@NotNull String originalTag, int triathlonNum, int sportDataType) {
            Intrinsics.checkNotNullParameter(originalTag, "originalTag");
            if (sportDataType != 17) {
                return originalTag;
            }
            return originalTag + triathlonNum;
        }

        @JvmStatic
        public final void switchFragment(int containerId, @NotNull Class<?> clz, @Nullable String tag, @Nullable Bundle bundle, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(clz, "clz");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            k kVarO = fragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            BaseSportDetailFragment baseSportDetailFragment = (BaseSportDetailFragment) fragmentManager.l0(tag);
            if (baseSportDetailFragment != null) {
                kVarO.F(baseSportDetailFragment);
                baseSportDetailFragment.setArguments(bundle);
                kVarO.m();
                return;
            }
            try {
                Object objNewInstance = clz.newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.detail.BaseSportDetailFragment");
                BaseSportDetailFragment baseSportDetailFragment2 = (BaseSportDetailFragment) objNewInstance;
                baseSportDetailFragment2.setArguments(bundle);
                kVarO.x(containerId, baseSportDetailFragment2, tag);
            } catch (Fragment.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            }
            kVarO.m();
        }
    }

    public BaseSportDetailFragment() {
        super(0, 1, null);
        this.mDetailSportType = -1;
        this.maxShowCountNum = 10;
    }

    @JvmStatic
    @NotNull
    public static final String createFragmentTag(@NotNull String str, int i, int i2) {
        return INSTANCE.createFragmentTag(str, i, i2);
    }

    private final SportBasicReport getSportReport() {
        SportBasicReport sportBasicReport = this.mBasicReport;
        return sportBasicReport != null ? sportBasicReport : this.mSportValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initDetailViewModel$lambda$1(BaseSportDetailFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ImageView imageView = this$0.ivExpandView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this$0.ivExpandView;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initIvExpandViewClick$lambda$0(BaseSportDetailFragment this$0, SportRecordKey key, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        if (sportBasicReport == null) {
            sportBasicReport = this$0.mSportValues;
        }
        int iA = sportBasicReport == null ? -1 : lp5.a(sportBasicReport);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36903");
        pairArr[1] = TuplesKt.to("name", "btn_full_screen_chart");
        pairArr[2] = TuplesKt.to("type_str", lp5.c(iA));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        pairArr[4] = TuplesKt.to("data_type", SportDetailUtil.INSTANCE.getSportKeyName(key, sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) SportDetailLandActivity.class);
        SportBasicReport sportBasicReport2 = this$0.mBasicReport;
        if (sportBasicReport2 == null) {
            sportBasicReport2 = this$0.mSportValues;
        }
        intent.putExtra("sport_report", sportBasicReport2);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, key);
        intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, this$0.mDetailSportType);
        this$0.startActivity(intent);
    }

    public static /* synthetic */ void reportCardInfo$default(BaseSportDetailFragment baseSportDetailFragment, Float f, Float f2, Float f3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportCardInfo");
        }
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        baseSportDetailFragment.reportCardInfo(f, f2, f3);
    }

    @JvmStatic
    public static final void switchFragment(int i, @NotNull Class<?> cls, @Nullable String str, @Nullable Bundle bundle, @NotNull FragmentManager fragmentManager) {
        INSTANCE.switchFragment(i, cls, str, bundle, fragmentManager);
    }

    @NotNull
    public final BubblePopupWindow createAbnormalBubblePop(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "str");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BubblePopupWindow bubblePopupWindow = new BubblePopupWindow(contextRequireContext);
        View viewInflate = LayoutInflater.from(context).inflate(ivi.A1, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        TextView textView = (TextView) viewInflate.findViewById(bsi.f4564a);
        bubblePopupWindow.setBubbleView(viewInflate);
        textView.setText(str);
        return bubblePopupWindow;
    }

    @Nullable
    public final View.OnClickListener getAbnormalGuideListener() {
        return this.abnormalGuideListener;
    }

    @NotNull
    public String getCardName() {
        return "";
    }

    @Nullable
    public final SportRecordDetailViewModel getDetailViewModel() {
        return this.detailViewModel;
    }

    @Nullable
    public final SportDetailItemView getItemViewLeft() {
        return this.itemViewLeft;
    }

    @Nullable
    public final SportDetailItemView getItemViewRight() {
        return this.itemViewRight;
    }

    @Nullable
    public final ImageView getIvExpandView() {
        return this.ivExpandView;
    }

    @Nullable
    public final SportBasicReport getMBasicReport() {
        return this.mBasicReport;
    }

    public final int getMDetailSportType() {
        return this.mDetailSportType;
    }

    @Nullable
    public final SportBasicReport getMSportValues() {
        return this.mSportValues;
    }

    public final int getMaxShowCountNum() {
        return this.maxShowCountNum;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @Nullable
    public final List<SportRecordEntry> getVisibleEntries() {
        return this.visibleEntries;
    }

    public boolean hasMaxMinAverage() {
        return false;
    }

    public void initBaseChart() {
        setStatusBarFontBlack(true);
        CustomLineChart customLineChart = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart);
        this.mLineChartAttr = customLineChart.getMLineChartAttr();
        v84.i(this.mLineChart, ExtUtilsKt.getDp(18), 0, 0, 0);
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        customLineChart2.setPaddingRelative(ExtUtilsKt.getDp(2), 0, ExtUtilsKt.getDp(1), 0);
        CustomLineChart customLineChart3 = this.mLineChart;
        if (customLineChart3 != null) {
            customLineChart3.setPadding(ExtUtilsKt.getDp(2), ExtUtilsKt.getDp(10), ExtUtilsKt.getDp(1), ExtUtilsKt.getDp(0));
        }
    }

    public final void initBaseParams() {
        if (getArguments() != null) {
            this.sportType = requireArguments().getInt("sport_type", -1);
            this.sportDataType = requireArguments().getInt(SPORT_DATA_TYPE, -1);
        }
    }

    public final void initDetailViewModel() {
        MutableLiveData<Boolean> showExpandViewFlag;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportRecordDetailViewModel sportRecordDetailViewModel = (SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class);
        this.detailViewModel = sportRecordDetailViewModel;
        if (sportRecordDetailViewModel == null || (showExpandViewFlag = sportRecordDetailViewModel.getShowExpandViewFlag()) == null) {
            return;
        }
        showExpandViewFlag.observe(requireActivity(), new BaseSportDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mc2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportDetailFragment.initDetailViewModel$lambda$1(this.f25998a, (Boolean) obj);
            }
        }));
    }

    public final void initIvExpandViewClick(@NotNull final SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ImageView imageView = this.ivExpandView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: nc2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSportDetailFragment.initIvExpandViewClick$lambda$0(this.f27765a, key, view);
                }
            });
        }
    }

    public final boolean isTriathlonNum() {
        return this.sportDataType == -1;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
        if (sportRecordDetailViewModel != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            sportRecordDetailViewModel.unRegisterObserver(fragmentActivityRequireActivity);
        }
        super.onDestroyView();
    }

    public final void onTraceBtmIntroduction(@NotNull String dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null) {
            sportBasicReport = this.mSportValues;
        }
        int iA = sportBasicReport == null ? -1 : lp5.a(sportBasicReport);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36903");
        pairArr[1] = TuplesKt.to("name", "btn_introduction");
        pairArr[2] = TuplesKt.to("type_str", lp5.c(iA));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        pairArr[4] = TuplesKt.to("data_type", dataType);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void onTraceBtnFullScreen(@NotNull String dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null) {
            sportBasicReport = this.mSportValues;
        }
        int iA = sportBasicReport == null ? -1 : lp5.a(sportBasicReport);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36903");
        pairArr[1] = TuplesKt.to("name", "btn_introduction");
        pairArr[2] = TuplesKt.to("type_str", lp5.c(iA));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        pairArr[4] = TuplesKt.to("data_type", dataType);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void onTraceBtnLoad(@NotNull String dataType, boolean more) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        String str = more ? "btn_expand_all" : "btn_fold";
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null) {
            sportBasicReport = this.mSportValues;
        }
        int iA = sportBasicReport == null ? -1 : lp5.a(sportBasicReport);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36903");
        pairArr[1] = TuplesKt.to("name", str);
        pairArr[2] = TuplesKt.to("type_str", lp5.c(iA));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        pairArr[4] = TuplesKt.to("data_type", dataType);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        if (hasMaxMinAverage()) {
            return;
        }
        reportCardInfo$default(this, null, null, null, 7, null);
    }

    public final void printChartFloat(@NotNull String logTag, @Nullable List<SportRecordItem> valueList) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        if (valueList != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            for (int i = 0; i < valueList.size(); i++) {
                stringBuffer.append(xr5.e(2, valueList.get(i).getValue().floatValue()));
                if (i != valueList.size() - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append("]");
            Logger.i(logTag, "the chart valueList is " + ((Object) stringBuffer));
        }
    }

    public final void printChartInt(@NotNull String logTag, @Nullable List<SportRecordItem> valueList) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        if (valueList != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            for (int i = 0; i < valueList.size(); i++) {
                stringBuffer.append(valueList.get(i).getValue().intValue());
                if (i != valueList.size() - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append("]");
            Logger.i(logTag, "the chart valueList is " + ((Object) stringBuffer));
        }
    }

    public final void reportCardInfo(@Nullable Float average, @Nullable Float max, @Nullable Float min) {
        ConsistencyEventUtils.INSTANCE.reportCardInfo(getSportReport(), getCardName(), average, max, min);
    }

    public final void setAbnormalGuideListener(@Nullable View.OnClickListener onClickListener) {
        this.abnormalGuideListener = onClickListener;
    }

    public final void setDetailViewModel(@Nullable SportRecordDetailViewModel sportRecordDetailViewModel) {
        this.detailViewModel = sportRecordDetailViewModel;
    }

    public final void setItemViewLeft(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemViewLeft = sportDetailItemView;
    }

    public final void setItemViewRight(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemViewRight = sportDetailItemView;
    }

    public final void setIvExpandView(@Nullable ImageView imageView) {
        this.ivExpandView = imageView;
    }

    public final void setMBasicReport(@Nullable SportBasicReport sportBasicReport) {
        this.mBasicReport = sportBasicReport;
    }

    public final void setMDetailSportType(int i) {
        this.mDetailSportType = i;
    }

    public final void setMSportValues(@Nullable SportBasicReport sportBasicReport) {
        this.mSportValues = sportBasicReport;
    }

    public final void setMaxShowCountNum(int i) {
        this.maxShowCountNum = i;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        if (getView() != null) {
            requireView().setVisibility(menuVisible ? 0 : 8);
        }
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setVisibleEntries(@Nullable List<SportRecordEntry> list) {
        this.visibleEntries = list;
    }

    @JvmName(name = "setVisibleEntries1")
    public final void setVisibleEntries1(@Nullable List<? extends SportRecordEntry> barEntries) {
        List<SportRecordEntry> list = this.visibleEntries;
        if (list == null) {
            this.visibleEntries = new ArrayList();
        } else {
            Intrinsics.checkNotNull(list);
            list.clear();
        }
        List<SportRecordEntry> list2 = this.visibleEntries;
        Intrinsics.checkNotNull(list2);
        Intrinsics.checkNotNull(barEntries);
        list2.addAll(barEntries);
    }
}
