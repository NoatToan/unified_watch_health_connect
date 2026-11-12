package com.huami.sleep.daysleep.sleepstagechart.viewmodel;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.repo.IRespRateRepo;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo;
import com.huami.sleep.daysleep.sleepstagechart.repo.SleepTagRepo;
import com.huami.sleep.daysleep.sleepstagechart.util.SleepTagToChartDataUtil;
import com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectTip;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagChartData;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepUserTagInfo;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.transform.RespRateTransformImpl;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0098\u00012\u00020\u0001:\u0002\u0098\u0001B!\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J(\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u000fJ\u0010\u0010\u001f\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 J\u0016\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#J\u0010\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020*J\u0006\u0010,\u001a\u00020\u0005R\u0019\u00102\u001a\u00020-8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\"\u0010F\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER#\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020R0M8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010UR+\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0W0M8\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010UR!\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0M8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010P\u001a\u0004\b]\u0010UR!\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0M8\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010P\u001a\u0004\ba\u0010UR\u001f\u0010e\u001a\b\u0012\u0004\u0012\u00020 0M8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010P\u001a\u0004\bd\u0010UR/\u0010h\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u00110G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010I\u001a\u0004\bg\u0010KR!\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150M8\u0006@\u0006¢\u0006\f\n\u0004\bi\u0010P\u001a\u0004\bj\u0010UR#\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000f0G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bl\u0010KR\u001f\u0010o\u001a\b\u0012\u0004\u0012\u00020 0M8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bn\u0010UR-\u0010q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010W0M8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\bp\u0010UR#\u0010u\u001a\b\u0012\u0004\u0012\u00020R0r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bs\u0010tR#\u0010w\u001a\b\u0012\u0004\u0012\u00020R0r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bv\u0010tR#\u0010y\u001a\b\u0012\u0004\u0012\u00020R0r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bx\u0010tR#\u0010{\u001a\b\u0012\u0004\u0012\u00020 0r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\bz\u0010tR+\u0010\u0081\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000f0|j\b\u0012\u0004\u0012\u00020\u000f`}8\u0006@\u0006¢\u0006\r\n\u0004\bx\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0r8F@\u0006X\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u0017\u0010I\u001a\u0005\b\u0082\u0001\u0010tR%\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020 0G8F@\u0006X\u0086\u0084\u0002¢\u0006\r\n\u0004\bg\u0010I\u001a\u0005\b\u0084\u0001\u0010KR&\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0086\u0001R,\u0010\u008a\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000f0\u0088\u00010G8F@\u0006X\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u000e\u0010I\u001a\u0005\b\u0089\u0001\u0010KR%\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0G8F@\u0006X\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u0006\u0010I\u001a\u0005\b\u008b\u0001\u0010KR7\u0010\u008f\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0005\u0012\u00030\u008d\u00010|j\t\u0012\u0005\u0012\u00030\u008d\u0001`}0G8F@\u0006X\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u0007\u0010I\u001a\u0005\b\u008e\u0001\u0010KR,\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\t0M8F@\u0006X\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010UR\"\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020 0G8\u0006@\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010K¨\u0006\u0099\u0001"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/viewmodel/SleepStageChartViewModel;", "Landroidx/lifecycle/ViewModel;", "", "startMin", "endMin", "", "B", "C", "E", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "list", com.google.android.exoplayer2.text.ttml.b.r, "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "date", "Landroid/util/Pair;", SOAP.XMLNS, "index", "value", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectTip;", "u", "x", DTransferConstants.SEARCH_KEY, "z", "setDate", "Lcom/huami/chart/util/Index;", "type", "selectChange", "getOverLayType", "selectOverlayDataType", "", "show", "changeMakeSleepTagStatus", "", "startRate", "endRate", "setDragInterval", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "tagInfo", "setSelectTag", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "uploadSelfDefTagToWeb", "loadSleepTagByDate", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "a", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "getRepo", "()Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/sleep/daysleep/daydetail/repo/IRespRateRepo;", "b", "Lcom/huami/sleep/daysleep/daydetail/repo/IRespRateRepo;", "respRateRepo", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/SleepTagRepo;", "c", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/SleepTagRepo;", "tagRepo", GoogleApiAvailabilityLight.a, "Z", "hrOk", "e", "respOk", "f", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Landroidx/lifecycle/MutableLiveData;", "g", "Lkotlin/Lazy;", "r", "()Landroidx/lifecycle/MutableLiveData;", "dateLive", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "h", "Landroidx/lifecycle/LiveData;", "sleepInfoLiveData", "Lcom/huami/chart/data/ChartDataList;", "i", "getStageSleepChartData", "()Landroidx/lifecycle/LiveData;", "stageSleepChartData", "Lkotlin/Pair;", z.j, "getStartEndTimeShow", "startEndTimeShow", "", hl.k, "getSleepTimeZone", "sleepTimeZone", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "l", "getStageDurInfo", "stageDurInfo", "m", "getStageViewShow", "stageViewShow", GoogleApiAvailabilityLight.b, "y", "selectIndexType", "o", "getMSelectTipInfo", "mSelectTipInfo", "v", "overlayType", "getShowNoSleep", "showNoSleep", "getMSleepStartEndIndex", "mSleepStartEndIndex", "Landroidx/lifecycle/MediatorLiveData;", "getAddChartDataList", "()Landroidx/lifecycle/MediatorLiveData;", "addChartDataList", "t", "hrChartDataList", "w", "respRateChartDataList", "getOverlayChartShow", "overlayChartShow", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getOverLayTypeList", "()Ljava/util/ArrayList;", "overLayTypeList", "getOverLayTypeListLiveData", "overLayTypeListLiveData", "getMMakeSleepTagStatus", "mMakeSleepTagStatus", "Landroid/util/Pair;", "mDragInterval", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "getMWebRequestResult", "mWebRequestResult", "getMToast", "mToast", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "getMSleepTagChart", "mSleepTagChart", LogUtil.D, "getMTagList", "mTagList", "Landroidx/lifecycle/MutableLiveData;", "getMSleepMakeTagEnable", "mSleepMakeTagEnable", "<init>", "(Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;Lcom/huami/sleep/daysleep/daydetail/repo/IRespRateRepo;Lcom/huami/sleep/daysleep/sleepstagechart/repo/SleepTagRepo;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStageChartViewModel extends ViewModel {

    @NotNull
    private static final String F = "SleepStageChartRepo";
    private static final int G = 1440;
    public static final int MAX_TAG_NUM = 4;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWebRequestResult;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy mToast;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTagChart;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTagList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> mSleepMakeTagEnable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDaySleepStageRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IRespRateRepo respRateRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SleepTagRepo tagRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hrOk;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean respOk;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateLive = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepInfo> sleepInfoLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ChartDataList> stageSleepChartData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<String, String>> startEndTimeShow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Object> sleepTimeZone;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepStageDurationInfo> stageDurInfo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> stageViewShow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectIndexType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SelectTip> mSelectTipInfo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy overlayType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showNoSleep;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, Integer>> mSleepStartEndIndex;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy addChartDataList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrChartDataList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy respRateChartDataList;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy overlayChartShow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> overLayTypeList;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy overLayTypeListLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMakeSleepTagStatus;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private android.util.Pair<Float, Float> mDragInterval;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/chart/data/ChartDataList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MediatorLiveData<ChartDataList>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<ChartDataList> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<String>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i, int i2) {
            super(0);
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + "  " + this.b + "  " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i, int i2) {
            super(0);
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + "  " + this.b + "  " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/chart/data/ChartDataList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MediatorLiveData<ChartDataList>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<ChartDataList> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepHrData$1", f = "SleepStageChartViewModel.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepHrData$1$1", f = "SleepStageChartViewModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepStageChartViewModel b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepStageChartViewModel sleepStageChartViewModel, int i, int i2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sleepStageChartViewModel;
                this.c = i;
                this.d = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IDaySleepStageRepo repo = this.b.getRepo();
                    String userId = this.b.getUserId();
                    String str = (String) this.b.r().getValue();
                    int i2 = this.c;
                    int i3 = this.d;
                    this.a = 1;
                    obj = repo.loadheartRateData(userId, str, i2, i3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.hrOk = true;
                this.b.t().postValue((ChartDataList) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStageChartViewModel.this.new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepStageChartViewModel.this, this.c, this.d, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepRespRateData$1", f = "SleepStageChartViewModel.kt", i = {}, l = {FTPCodes.HELP_MESSAGE}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepRespRateData$1$1", f = "SleepStageChartViewModel.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ SleepStageChartViewModel c;
            public final /* synthetic */ long d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepStageChartViewModel sleepStageChartViewModel, long j, int i, int i2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = sleepStageChartViewModel;
                this.d = j;
                this.e = i;
                this.f = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                RespRateTransformImpl respRateTransformImpl;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RespRateTransformImpl respRateTransformImpl2 = RespRateTransformImpl.INSTANCE;
                    IRespRateRepo iRespRateRepo = this.c.respRateRepo;
                    long j = this.d;
                    long j2 = ((long) (this.e * 60 * 1000)) + j;
                    long j3 = ((long) (this.f * 60 * 1000)) + j;
                    this.a = respRateTransformImpl2;
                    this.b = 1;
                    Object respRateList = iRespRateRepo.getRespRateList(j2, j3, this);
                    if (respRateList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    respRateTransformImpl = respRateTransformImpl2;
                    obj = respRateList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    respRateTransformImpl = (RespRateTransformImpl) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                ChartDataList chartDataListTransformToChartData = respRateTransformImpl.transformToChartData((byte[]) obj, this.e, this.f);
                this.c.respOk = true;
                this.c.w().postValue(chartDataListTransformToChartData);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j, int i, int i2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStageChartViewModel.this.new h(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepStageChartViewModel.this, this.c, this.d, this.e, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepTagByDate$1", f = "SleepStageChartViewModel.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$loadSleepTagByDate$1$1", f = "SleepStageChartViewModel.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepStageChartViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepStageChartViewModel sleepStageChartViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sleepStageChartViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SleepStageChartViewModel sleepStageChartViewModel = this.b;
                    android.util.Pair pairS = sleepStageChartViewModel.s((String) sleepStageChartViewModel.r().getValue());
                    SleepTagRepo sleepTagRepo = this.b.tagRepo;
                    String userId = this.b.getUserId();
                    long jLongValue = ((Number) pairS.first).longValue();
                    long jLongValue2 = ((Number) pairS.second).longValue();
                    this.a = 1;
                    obj = sleepTagRepo.loadSleepMakeTagInfo(userId, jLongValue, jLongValue2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List<SleepUserTagInfo> list = (List) obj;
                if (list == null) {
                    this.b.getMSleepMakeTagEnable().postValue(Boxing.boxBoolean(false));
                } else {
                    this.b.getMSleepTagChart().postValue(SleepTagToChartDataUtil.INSTANCE.getSleepTagChartData(list));
                }
                return Unit.INSTANCE;
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStageChartViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepStageChartViewModel.this, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00030\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<MutableLiveData<ArrayList<SleepTagChartData>>> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<ArrayList<SleepTagChartData>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MutableLiveData<String>> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MutableLiveData<Resource<? extends String>>> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<String>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<MediatorLiveData<List<? extends String>>> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<List<String>> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<MediatorLiveData<Boolean>> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<Boolean> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<MutableLiveData<String>> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/chart/data/ChartDataList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<MediatorLiveData<ChartDataList>> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<ChartDataList> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Landroid/util/Pair;", "Lcom/huami/chart/util/Index;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<MutableLiveData<android.util.Pair<Index, String>>> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<android.util.Pair<Index, String>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$setSelectTag$1$1$1", f = "SleepStageChartViewModel.kt", i = {0}, l = {339}, m = "invokeSuspend", n = {"tagInfo"}, s = {"L$0"})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ android.util.Pair<Float, Float> c;
        public final /* synthetic */ SleepTagDataVo d;
        public final /* synthetic */ SleepStageChartViewModel e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(android.util.Pair<Float, Float> pair, SleepTagDataVo sleepTagDataVo, SleepStageChartViewModel sleepStageChartViewModel, Continuation<? super s> continuation) {
            super(2, continuation);
            this.c = pair;
            this.d = sleepTagDataVo;
            this.e = sleepStageChartViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new s(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepUserTagInfo sleepUserTagInfo;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepUserTagInfo sleepUserTagInfo2 = new SleepUserTagInfo((int) ((Number) this.c.first).floatValue(), (int) ((Number) this.c.second).floatValue(), this.d.getTag(), this.d.getTagType(), this.e.A());
                this.a = sleepUserTagInfo2;
                this.b = 1;
                Object objUploadTagEvent = this.e.tagRepo.uploadTagEvent(this.e.getUserId(), new SleepUserTagInfo[]{sleepUserTagInfo2}, this);
                if (objUploadTagEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepUserTagInfo = sleepUserTagInfo2;
                obj = objUploadTagEvent;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sleepUserTagInfo = (SleepUserTagInfo) this.a;
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SleepStageChartViewModel sleepStageChartViewModel = this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(sleepUserTagInfo);
                Unit unit = Unit.INSTANCE;
                sleepStageChartViewModel.p(arrayList);
                this.e.getMWebRequestResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else {
                this.e.getMWebRequestResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$uploadSelfDefTagToWeb$1", f = "SleepStageChartViewModel.kt", i = {}, l = {379}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SleepTagInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(SleepTagInfo sleepTagInfo, Continuation<? super t> continuation) {
            super(2, continuation);
            this.c = sleepTagInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStageChartViewModel.this.new t(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepTagRepo sleepTagRepo = SleepStageChartViewModel.this.tagRepo;
                String userId = SleepStageChartViewModel.this.getUserId();
                SleepTagInfo[] sleepTagInfoArr = {this.c};
                this.a = 1;
                obj = sleepTagRepo.uploadSelfDefTagEvent(userId, sleepTagInfoArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SleepStageChartViewModel.this.getMWebRequestResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else {
                SleepStageChartViewModel.this.getMWebRequestResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public SleepStageChartViewModel(@NotNull IDaySleepStageRepo iDaySleepStageRepo, @NotNull IRespRateRepo iRespRateRepo, @NotNull SleepTagRepo sleepTagRepo) {
        this.repo = iDaySleepStageRepo;
        this.respRateRepo = iRespRateRepo;
        this.tagRepo = sleepTagRepo;
        LiveData<SleepInfo> liveDataSwitchMap = Transformations.switchMap(r(), new Function<String, LiveData<SleepInfo>>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<SleepInfo> apply(String str) {
                return this.a.getRepo().getSleepInfo(this.a.getUserId(), str);
            }
        });
        this.sleepInfoLiveData = liveDataSwitchMap;
        this.stageSleepChartData = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, ChartDataList>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final ChartDataList apply(SleepInfo sleepInfo) {
                return this.a.getRepo().getStageSleepChartData(sleepInfo);
            }
        });
        this.startEndTimeShow = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Pair<? extends String, ? extends String>>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends String, ? extends String> apply(SleepInfo sleepInfo) {
                return this.a.getRepo().getStartEndTime(sleepInfo);
            }
        });
        this.sleepTimeZone = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Object>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Object apply(SleepInfo sleepInfo) {
                JSONObject usrSummaryJson;
                SleepInfo sleepInfo2 = sleepInfo;
                if (sleepInfo2 == null || (usrSummaryJson = sleepInfo2.getUsrSummaryJson()) == null) {
                    return null;
                }
                return usrSummaryJson.opt("tz");
            }
        });
        this.stageDurInfo = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, SleepStageDurationInfo>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final SleepStageDurationInfo apply(SleepInfo sleepInfo) {
                return this.a.getRepo().getStageDurInfo(sleepInfo);
            }
        });
        this.stageViewShow = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                SleepShowData sleepShowData = SleepDataUtil.INSTANCE.parse2Sleep(sleepInfo2);
                int deepDurationHour = sleepShowData.getDeepDurationHour() + sleepShowData.getDeepDurationMin() + sleepShowData.getLightDurationHour() + sleepShowData.getLightDurationMin();
                boolean hasSleep = false;
                if (deepDurationHour != 0 && sleepInfo2 != null) {
                    hasSleep = sleepInfo2.getHasSleep();
                }
                return Boolean.valueOf(hasSleep);
            }
        });
        this.selectIndexType = LazyKt__LazyJVMKt.lazy(r.a);
        this.mSelectTipInfo = Transformations.map(y(), new Function() { // from class: h27
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SleepStageChartViewModel.D(this.a, (android.util.Pair) obj);
            }
        });
        this.overlayType = LazyKt__LazyJVMKt.lazy(p.a);
        this.showNoSleep = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                boolean z = true;
                if (sleepInfo2 != null && (sleepInfo2.getHasSleep() || !sleepInfo2.getOddStageSleep().isEmpty())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        LiveData map = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Pair<? extends Integer, ? extends Integer>>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$7
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends Integer, ? extends Integer> apply(SleepInfo sleepInfo) {
                return this.a.getRepo().getSleepStartEndIndex(sleepInfo);
            }
        });
        this.mSleepStartEndIndex = map;
        this.addChartDataList = LazyKt__LazyJVMKt.lazy(a.a);
        this.hrChartDataList = LazyKt__LazyJVMKt.lazy(f.a);
        this.respRateChartDataList = LazyKt__LazyJVMKt.lazy(q.a);
        this.overlayChartShow = LazyKt__LazyJVMKt.lazy(o.a);
        this.overLayTypeList = new ArrayList<>();
        this.overLayTypeListLiveData = LazyKt__LazyJVMKt.lazy(n.a);
        t().addSource(map, new Observer() { // from class: m27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.i(this.a, (Pair) obj);
            }
        });
        w().addSource(map, new Observer() { // from class: n27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.j(this.a, (Pair) obj);
            }
        });
        getAddChartDataList().addSource(v(), new Observer() { // from class: l27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.k(this.a, (String) obj);
            }
        });
        getOverlayChartShow().addSource(v(), new Observer() { // from class: k27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.m(this.a, (String) obj);
            }
        });
        getOverLayTypeListLiveData().addSource(t(), new Observer() { // from class: i27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.n(this.a, (ChartDataList) obj);
            }
        });
        getOverLayTypeListLiveData().addSource(w(), new Observer() { // from class: j27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStageChartViewModel.o(this.a, (ChartDataList) obj);
            }
        });
        this.mMakeSleepTagStatus = LazyKt__LazyJVMKt.lazy(j.a);
        this.mWebRequestResult = LazyKt__LazyJVMKt.lazy(m.a);
        this.mToast = LazyKt__LazyJVMKt.lazy(l.a);
        this.mSleepTagChart = LazyKt__LazyJVMKt.lazy(k.a);
        this.mTagList = LazyKt__LazyJVMKt.lazy(new SleepStageChartViewModel$mTagList$2(this));
        this.mSleepMakeTagEnable = (MutableLiveData) Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$special$$inlined$map$8
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(SleepTimeUtil.INSTANCE.timeStrToDate(r().getValue()));
        calendar.set(1, calendar2.get(1));
        calendar.set(2, calendar2.get(2));
        calendar.set(5, calendar2.get(5));
        return calendar.getTimeInMillis();
    }

    private final void B(int startMin, int endMin) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new g(startMin, endMin, null), 3, null);
    }

    private final void C(int startMin, int endMin) {
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        String value = r().getValue();
        SleepInfo value2 = this.sleepInfoLiveData.getValue();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new h(sleepTimeUtil.getOffsetTime(value, (value2 == null ? null : Integer.valueOf(value2.getOffset())).intValue()), startMin, endMin, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectTip D(SleepStageChartViewModel sleepStageChartViewModel, android.util.Pair pair) {
        Integer first;
        ChartData dataByPositionIndex;
        ChartData dataByPositionIndex2;
        Integer first2;
        ChartData dataByPositionIndex3;
        BaseIndex posiIndex = ((Index) pair.first).getPosiIndex();
        int index = posiIndex == null ? -1 : posiIndex.getIndex();
        int sumValue = 0;
        if (!Intrinsics.areEqual(pair.second, "heart_rate")) {
            if (!Intrinsics.areEqual(pair.second, DataConstant.ID_DATA_OVERLAY_RESP_RATE)) {
                return sleepStageChartViewModel.z(((Index) pair.first).getDataIndex(), sleepStageChartViewModel.r().getValue());
            }
            Pair<Integer, Integer> value = sleepStageChartViewModel.getMSleepStartEndIndex().getValue();
            int iIntValue = (value == null || (first = value.getFirst()) == null) ? 0 : first.intValue();
            ChartDataList value2 = sleepStageChartViewModel.w().getValue();
            if (value2 != null && (dataByPositionIndex = value2.getDataByPositionIndex(index)) != null) {
                sumValue = (int) dataByPositionIndex.getSumValue();
            }
            return sleepStageChartViewModel.x(index, iIntValue, sumValue, sleepStageChartViewModel.r().getValue());
        }
        ChartDataList value3 = sleepStageChartViewModel.t().getValue();
        if (((value3 == null || (dataByPositionIndex2 = value3.getDataByPositionIndex(index)) == null) ? 0 : (int) dataByPositionIndex2.getSumValue()) <= 0) {
            return null;
        }
        Pair<Integer, Integer> value4 = sleepStageChartViewModel.getMSleepStartEndIndex().getValue();
        int iIntValue2 = (value4 == null || (first2 = value4.getFirst()) == null) ? 0 : first2.intValue();
        ChartDataList value5 = sleepStageChartViewModel.t().getValue();
        if (value5 != null && (dataByPositionIndex3 = value5.getDataByPositionIndex(index)) != null) {
            sumValue = (int) dataByPositionIndex3.getSumValue();
        }
        return sleepStageChartViewModel.u(index, iIntValue2, sumValue, sleepStageChartViewModel.r().getValue());
    }

    private final void E() {
        if (this.hrOk && this.respOk) {
            getOverLayTypeListLiveData().setValue(this.overLayTypeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SleepStageChartViewModel sleepStageChartViewModel, Pair pair) {
        sleepStageChartViewModel.hrOk = false;
        sleepStageChartViewModel.getOverLayTypeList().remove("heart_rate");
        if (pair != null) {
            sleepStageChartViewModel.B(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        } else {
            sleepStageChartViewModel.hrOk = true;
            sleepStageChartViewModel.t().setValue(new ChartDataList(new SparseArray()));
        }
        sleepStageChartViewModel.getOverlayChartShow().setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SleepStageChartViewModel sleepStageChartViewModel, Pair pair) {
        sleepStageChartViewModel.respOk = false;
        sleepStageChartViewModel.getOverLayTypeList().remove(DataConstant.ID_DATA_OVERLAY_RESP_RATE);
        if (pair != null) {
            sleepStageChartViewModel.C(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        } else {
            sleepStageChartViewModel.respOk = true;
            sleepStageChartViewModel.w().setValue(new ChartDataList(new SparseArray()));
        }
        sleepStageChartViewModel.getOverlayChartShow().setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SleepStageChartViewModel sleepStageChartViewModel, String str) {
        if (Intrinsics.areEqual(str, "heart_rate")) {
            sleepStageChartViewModel.getAddChartDataList().postValue(sleepStageChartViewModel.t().getValue());
        } else if (Intrinsics.areEqual(str, DataConstant.ID_DATA_OVERLAY_RESP_RATE)) {
            sleepStageChartViewModel.getAddChartDataList().postValue(sleepStageChartViewModel.w().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SleepStageChartViewModel sleepStageChartViewModel, String str) {
        sleepStageChartViewModel.getOverlayChartShow().setValue(Boolean.valueOf((TextUtils.isEmpty(str) || Intrinsics.areEqual(str, "sleep")) ? false : true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SleepStageChartViewModel sleepStageChartViewModel, ChartDataList chartDataList) {
        if (chartDataList.getCount() > 0) {
            sleepStageChartViewModel.getOverLayTypeList().add("heart_rate");
        }
        sleepStageChartViewModel.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SleepStageChartViewModel sleepStageChartViewModel, ChartDataList chartDataList) {
        if (chartDataList.getCount() > 0) {
            sleepStageChartViewModel.getOverLayTypeList().add(DataConstant.ID_DATA_OVERLAY_RESP_RATE);
        }
        sleepStageChartViewModel.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(List<SleepUserTagInfo> list) {
        ArrayList<SleepTagChartData> sleepTagChartData = SleepTagToChartDataUtil.INSTANCE.getSleepTagChartData(list);
        MutableLiveData<ArrayList<SleepTagChartData>> mSleepTagChart = getMSleepTagChart();
        ArrayList<SleepTagChartData> value = getMSleepTagChart().getValue();
        if (value != null) {
            value.addAll(sleepTagChartData);
            Unit unit = Unit.INSTANCE;
            sleepTagChartData = value;
        }
        mSleepTagChart.postValue(sleepTagChartData);
    }

    private final String q(String date) {
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return sleepTimeUtil.formatDateTimeForMD(sleepTimeUtil.timeStrToDate(date).getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<String> r() {
        return (MutableLiveData) this.dateLive.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.util.Pair<Long, Long> s(String date) {
        Calendar calendar = Calendar.getInstance();
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        calendar.setTime(sleepTimeUtil.timeStrToDate(date));
        sleepTimeUtil.resetCalendarTimeToEarliest(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        sleepTimeUtil.resetCalendarTimeToLast(calendar);
        return new android.util.Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediatorLiveData<ChartDataList> t() {
        return (MediatorLiveData) this.hrChartDataList.getValue();
    }

    private final SelectTip u(int index, int startMin, int value, String date) {
        HMLog.info(F, new c(date, index, startMin));
        int i2 = startMin + (index * 5);
        if (i2 < 1440) {
            date = SportDay.fromString(date).getPreDay().getKey();
        }
        return new SelectTip(KoinExtKt.getAppContext().getString(R.string.slp_night_hr_rate), TimeShowUtilsKt.getTimesStr(value, com.huami.sleep.ext.KoinExtKt.getAppContext()), q(date) + " " + TimeUtils.formatTime(com.huami.sleep.ext.KoinExtKt.getAppContext(), i2));
    }

    private final MutableLiveData<String> v() {
        return (MutableLiveData) this.overlayType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediatorLiveData<ChartDataList> w() {
        return (MediatorLiveData) this.respRateChartDataList.getValue();
    }

    private final SelectTip x(int index, int startMin, int value, String date) {
        HMLog.info(F, new d(date, index, startMin));
        int i2 = startMin + (index * 5);
        if (i2 < 1440) {
            date = SportDay.fromString(date).getPreDay().getKey();
        }
        return new SelectTip(KoinExtKt.getAppContext().getString(R.string.slp_night_resp_rate), TimeShowUtilsKt.getTimesStr(value, com.huami.sleep.ext.KoinExtKt.getAppContext()), q(date) + " " + TimeUtils.formatTime(com.huami.sleep.ext.KoinExtKt.getAppContext(), i2));
    }

    private final MutableLiveData<android.util.Pair<Index, String>> y() {
        return (MutableLiveData) this.selectIndexType.getValue();
    }

    private final SelectTip z(int index, String date) {
        try {
            return this.repo.getSleepSelectTipInfo(index, date, this.sleepInfoLiveData.getValue());
        } catch (Exception e2) {
            HMLog.error$default(F, null, e2, new e(e2), 2, null);
            return null;
        }
    }

    public final void changeMakeSleepTagStatus(boolean show) {
        getMMakeSleepTagStatus().setValue(Boolean.valueOf(show));
    }

    @NotNull
    public final MediatorLiveData<ChartDataList> getAddChartDataList() {
        return (MediatorLiveData) this.addChartDataList.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getMMakeSleepTagStatus() {
        return (MutableLiveData) this.mMakeSleepTagStatus.getValue();
    }

    @NotNull
    public final LiveData<SelectTip> getMSelectTipInfo() {
        return this.mSelectTipInfo;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMSleepMakeTagEnable() {
        return this.mSleepMakeTagEnable;
    }

    @NotNull
    public final LiveData<Pair<Integer, Integer>> getMSleepStartEndIndex() {
        return this.mSleepStartEndIndex;
    }

    @NotNull
    public final MutableLiveData<ArrayList<SleepTagChartData>> getMSleepTagChart() {
        return (MutableLiveData) this.mSleepTagChart.getValue();
    }

    @NotNull
    public final LiveData<List<SleepTagDataVo>> getMTagList() {
        return (LiveData) this.mTagList.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getMToast() {
        return (MutableLiveData) this.mToast.getValue();
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getMWebRequestResult() {
        return (MutableLiveData) this.mWebRequestResult.getValue();
    }

    @NotNull
    public final String getOverLayType() {
        String value = v().getValue();
        return value == null ? "sleep" : value;
    }

    @NotNull
    public final ArrayList<String> getOverLayTypeList() {
        return this.overLayTypeList;
    }

    @NotNull
    public final MediatorLiveData<List<String>> getOverLayTypeListLiveData() {
        return (MediatorLiveData) this.overLayTypeListLiveData.getValue();
    }

    @NotNull
    public final MediatorLiveData<Boolean> getOverlayChartShow() {
        return (MediatorLiveData) this.overlayChartShow.getValue();
    }

    @NotNull
    public final IDaySleepStageRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final LiveData<Boolean> getShowNoSleep() {
        return this.showNoSleep;
    }

    @NotNull
    public final LiveData<Object> getSleepTimeZone() {
        return this.sleepTimeZone;
    }

    @NotNull
    public final LiveData<SleepStageDurationInfo> getStageDurInfo() {
        return this.stageDurInfo;
    }

    @NotNull
    public final LiveData<ChartDataList> getStageSleepChartData() {
        return this.stageSleepChartData;
    }

    @NotNull
    public final LiveData<Boolean> getStageViewShow() {
        return this.stageViewShow;
    }

    @NotNull
    public final LiveData<Pair<String, String>> getStartEndTimeShow() {
        return this.startEndTimeShow;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void loadSleepTagByDate() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new i(null), 3, null);
    }

    public final void selectChange(@NotNull Index index, @NotNull String type) {
        y().setValue(new android.util.Pair<>(index, type));
    }

    public final void selectOverlayDataType(@Nullable String type) {
        v().setValue(type);
    }

    public final void setDate(@NotNull String date) {
        r().setValue(date);
    }

    public final void setDragInterval(float startRate, float endRate) {
        this.mDragInterval = new android.util.Pair<>(Float.valueOf(startRate), Float.valueOf(endRate));
    }

    public final void setSelectTag(@Nullable SleepTagDataVo tagInfo) {
        android.util.Pair<Float, Float> pair;
        if (tagInfo == null) {
            getMToast().setValue(com.huami.sleep.ext.KoinExtKt.getAppContext().getString(R.string.slp_no_tag_select));
            changeMakeSleepTagStatus(false);
        }
        if (tagInfo == null || (pair = this.mDragInterval) == null) {
            return;
        }
        ArrayList<SleepTagChartData> value = getMSleepTagChart().getValue();
        if ((value == null ? 0 : value.size()) >= 4) {
            getMToast().setValue(com.huami.sleep.ext.KoinExtKt.getAppContext().getString(R.string.slp_tag_limite_tip));
            changeMakeSleepTagStatus(false);
        } else {
            if (((int) ((Number) pair.first).floatValue()) == ((int) ((Number) pair.second).floatValue())) {
                getMToast().setValue(com.huami.sleep.ext.KoinExtKt.getAppContext().getString(R.string.slp_invalid_tag_duration));
                return;
            }
            changeMakeSleepTagStatus(false);
            getMWebRequestResult().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new s(pair, tagInfo, this, null), 2, null);
        }
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void uploadSelfDefTagToWeb(@NotNull SleepTagInfo tagInfo) {
        getMWebRequestResult().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new t(tagInfo, null), 2, null);
    }
}
