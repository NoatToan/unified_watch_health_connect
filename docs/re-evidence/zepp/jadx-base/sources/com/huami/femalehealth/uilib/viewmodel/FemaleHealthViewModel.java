package com.huami.femalehealth.uilib.viewmodel;

import androidx.arch.core.util.Function;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.api.DeleteType;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBeanKt;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.BasicInputValue;
import com.huami.femalehealth.logiclib.calculation.Day;
import com.huami.femalehealth.logiclib.calculation.Duration;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.db.po.MenstruationWithSymptoms;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.event.EventDevSyncFemaleFinish;
import com.huami.femalehealth.logiclib.event.EventFHSettingChanged;
import com.huami.femalehealth.logiclib.event.EventMenstruationOperation;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateHelperKt;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.helper.ext.PoToVoKt;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.logiclib.vo.SymptomTotalVo;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.helper.DateFormatHelper;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.ForecastStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.OvulationStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PregnantStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.cloud.WebResponse;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u0019\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010>\u001a\u00020<¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J&\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002J#\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002J0\u0010\u001b\u001a\u00020\u00042\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020%J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020&J\u0018\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u0002J\u0010\u0010,\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010.\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010J\u001e\u00103\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/J\u0006\u00104\u001a\u00020\u0004J\u0006\u00105\u001a\u00020\u0004J\u0018\u00107\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u00106\u001a\u00020\u0002R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010DR*\u0010L\u001a\u0016\u0012\u0004\u0012\u00020G\u0012\f\u0012\n\u0012\u0004\u0012\u00020I\u0018\u00010H0F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010PR\u0018\u0010V\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010PR\u0016\u0010W\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR!\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100X8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010[R\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020G0X8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\b]\u0010[R\u001f\u0010a\u001a\b\u0012\u0004\u0012\u00020G0X8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[R\u001f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00020X8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bb\u0010[R3\u0010h\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020e\u0018\u00010d0X8\u0006@\u0006¢\u0006\f\n\u0004\bf\u0010Y\u001a\u0004\bg\u0010[R3\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010d0X8\u0006@\u0006¢\u0006\f\n\u0004\bi\u0010Y\u001a\u0004\bj\u0010[R!\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100X8\u0006@\u0006¢\u0006\f\n\u0004\bl\u0010Y\u001a\u0004\bm\u0010[R\u001f\u0010q\u001a\b\u0012\u0004\u0012\u00020G0X8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010Y\u001a\u0004\bp\u0010[R\u001f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00020X8\u0006@\u0006¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\bs\u0010[R\u001f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00190X8\u0006@\u0006¢\u0006\f\n\u0004\bu\u0010Y\u001a\u0004\bv\u0010[R\u001e\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0x8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R+\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0H0~0}8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0087\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u00010}8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0081\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00108B@\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\bJ\u0010\u0088\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008d\u0001"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/FemaleHealthViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "", "needReload", "", com.google.android.exoplayer2.text.ttml.b.r, "i", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "", "year", "month", "e", hl.k, "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "select", "c", "dateTriple", "m", GoogleApiAvailabilityLight.b, "o", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "action", "g", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "onCreate", "onResume", "onDestroy", "Lcom/huami/femalehealth/logiclib/event/EventFHSettingChanged;", "event", "onEvent", "Lcom/huami/femalehealth/logiclib/event/EventDevSyncFemaleFinish;", "Lcom/huami/femalehealth/logiclib/event/EventMenstruationOperation;", "Lcom/huami/calendarview/Calendar;", "calendar", "hard", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "calRenderStyle", "onCalendarSelect", "onMonthChange", "isTomorrowMenstruation", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "painSelect", "bloodSelect", "moodSelect", "setCardStatus", "createMenstruation", "endMenstruation", "delAll", "delWhenSelectMenstruationStartDay", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "f", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "styleCatch", "", "", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "h", "Ljava/util/Map;", "statusCatch", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "Lkotlinx/coroutines/Job;", com.loc.z.j, "Lkotlinx/coroutines/Job;", "statusJob", "Z", "clickable", "l", "renderPredictionJob", "calendarRenderJob", "firstComeIn", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getRefreshLiveData", "()Landroidx/lifecycle/MutableLiveData;", "refreshLiveData", "getStateCardContentLiveData", "stateCardContentLiveData", DTransferConstants.SEARCH_KEY, "getStateCardDateLiveData", "stateCardDateLiveData", "getEnablePredictLiveData", "enablePredictLiveData", "Lkotlin/Triple;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", SOAP.XMLNS, "getSelectDateLiveData", "selectDateLiveData", "t", "getStatusLiveDate", "statusLiveDate", "u", "getDialogLiveData", "dialogLiveData", "v", "getTrainingTag", "trainingTag", "w", "getShowEditButtonLiveData", "showEditButtonLiveData", "x", "getChangeNoticeLiveData", "changeNoticeLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Ljava/util/Date;", "y", "Landroidx/lifecycle/MediatorLiveData;", "symptomLastDate", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "z", "Landroidx/lifecycle/LiveData;", "menstruationWithSymptom", "Lcom/huami/femalehealth/logiclib/vo/SymptomTotalVo;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSymptomLive", "()Landroidx/lifecycle/LiveData;", "symptomLive", "()Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "now", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthViewModel extends FHBaseViewModel {

    @NotNull
    private static final String B = "FemaleHealthViewModel";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SymptomTotalVo> symptomLive;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job statusJob;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Job renderPredictionJob;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Job calendarRenderJob;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Triple<Degree, Degree, Degree>> statusLiveDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DateTriple> dialogLiveData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> trainingTag;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showEditButtonLiveData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Object> changeNoticeLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Date> symptomLastDate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<MenstruationWithSymptoms>>> menstruationWithSymptom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final StyleCatch styleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<String, List<HistoryDetailBean>> statusCatch = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private DateTriple select = new DateTriple(-1, -1, -1);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private volatile boolean clickable = true;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean firstComeIn = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DateTriple> refreshLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> stateCardContentLiveData = new MutableLiveData<>("");

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> stateCardDateLiveData = new MutableLiveData<>("");

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> enablePredictLiveData = new MutableLiveData<>(Boolean.valueOf(FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()));

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Triple<DateTriple, CalendarPeriodStyle, MenstruationVo>> selectDateLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("afterPrediction spend time ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public static final a0 a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refreshSymptomLastDate";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createBtnSmartClickable";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(List<MenstruationVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("list:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createBtnSmartClickable failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel", f = "FemaleHealthViewModel.kt", i = {}, l = {363, 397}, m = "renderPrediction", n = {}, s = {})
    public static final class c0 extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public c0(Continuation<? super c0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return FemaleHealthViewModel.this.r(0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createBtnSmartClickable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function1<List<? extends DateTriple>, Unit> {
        public d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DateTriple> list) {
            invoke2((List<DateTriple>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<DateTriple> list) {
            FemaleHealthViewModel femaleHealthViewModel = FemaleHealthViewModel.this;
            for (DateTriple dateTriple : list) {
                femaleHealthViewModel.styleCatch.initMonthOfDayIfNull(dateTriple.getYear(), dateTriple.getMonth());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createBtnSmartClickable true";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$renderPrediction$5", f = "FemaleHealthViewModel.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e0(Continuation<? super e0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((e0) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e0 e0Var = FemaleHealthViewModel.this.new e0(continuation);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<? extends Date> list = (List) this.b;
                MenstruationRepo menstruationRepo = FemaleHealthViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getMenstruationOfDay(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$createMenstruation$1$1$1", f = "FemaleHealthViewModel.kt", i = {1, 1, 1, 1, 2, 2}, l = {TypedValues.MotionType.TYPE_PATHMOTION_ARC, 619, 637, 648}, m = "invokeSuspend", n = {"dur", "endTime", "isIncludeTodayConsiderExpand", "isIncludeToday", "endTime", "isIncludeToday"}, s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "Z$0"})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public Object a;
            public Object b;
            public boolean c;
            public boolean d;
            public int e;
            public final /* synthetic */ DateTriple f;
            public final /* synthetic */ FemaleHealthViewModel g;

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$f$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0412a extends Lambda implements Function0<String> {
                public final /* synthetic */ Day a;
                public final /* synthetic */ DateTriple b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0412a(Day day, DateTriple dateTriple) {
                    super(0);
                    this.a = day;
                    this.b = dateTriple;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "dur:" + this.a + "  " + AidKt.toMilli(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$createMenstruation$1$1$1$2", f = "FemaleHealthViewModel.kt", i = {}, l = {621}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ FemaleHealthViewModel c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(FemaleHealthViewModel femaleHealthViewModel, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.c = femaleHealthViewModel;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                    return ((b) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    b bVar = new b(this.c, continuation);
                    bVar.b = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        List<? extends Date> list = (List) this.b;
                        MenstruationRepo menstruationRepo = this.c.repo;
                        this.a = 1;
                        obj = menstruationRepo.getMenstruationOfDay(list, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$createMenstruation$1$1$1$3", f = "FemaleHealthViewModel.kt", i = {}, l = {622}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ FemaleHealthViewModel c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(FemaleHealthViewModel femaleHealthViewModel, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.c = femaleHealthViewModel;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                    return ((c) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    c cVar = new c(this.c, continuation);
                    cVar.b = obj;
                    return cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Date date = (Date) this.b;
                        MenstruationRepo menstruationRepo = this.c.repo;
                        this.a = 1;
                        obj = menstruationRepo.getLastMenstruation(date, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ Date a;
                public final /* synthetic */ Date b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Date date, Date date2) {
                    super(0);
                    this.a = date;
                    this.b = date2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "创建经期先删除:" + AidKt.toDateTriple(this.a) + " - " + AidKt.toDateTriple(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ DateTriple a;
                public final /* synthetic */ Milli b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(DateTriple dateTriple, Milli milli) {
                    super(0);
                    this.a = dateTriple;
                    this.b = milli;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "创建经期:" + AidKt.toDateTriple(AidKt.toDate(this.a)) + " - " + AidKt.toDateTriple(AidKt.toDate(this.b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DateTriple dateTriple, FemaleHealthViewModel femaleHealthViewModel, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f = dateTriple;
                this.g = femaleHealthViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f, this.g, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0153  */
            /* JADX WARN: Code duplicated, block: B:30:0x0191 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:31:0x0192  */
            /* JADX WARN: Code duplicated, block: B:35:0x01a4  */
            /* JADX WARN: Code duplicated, block: B:38:0x01bd  */
            /* JADX WARN: Code duplicated, block: B:41:0x01df  */
            /* JADX WARN: Code duplicated, block: B:44:0x0207 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objPredictionDur;
                Day day;
                int periodLen;
                boolean z;
                Milli milli;
                boolean z2;
                Object objPredictionDurComplete;
                boolean z3;
                boolean z4;
                Day day2;
                Milli milli2;
                Pair<Date, Date> pairCalcCurrMenstruationDelPart;
                Date first;
                Date second;
                MenstruationRepo menstruationRepo;
                Boolean boolBoxBoolean;
                DeleteType deleteType;
                boolean z5;
                Milli milli3;
                boolean z6;
                boolean z7;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.e;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        objPredictionDur = obj;
                    } else if (i == 2) {
                        z4 = this.d;
                        boolean z8 = this.c;
                        Milli milli4 = (Milli) this.b;
                        Day day3 = (Day) this.a;
                        ResultKt.throwOnFailure(obj);
                        day2 = day3;
                        milli2 = milli4;
                        z3 = z8;
                        objPredictionDurComplete = obj;
                        periodLen = ((Day) objPredictionDurComplete).getValue();
                        z2 = z4;
                        z = z3;
                        milli = milli2;
                        day = day2;
                        pairCalcCurrMenstruationDelPart = this.g.manager.calcCurrMenstruationDelPart(false, z, AidKt.toDate(this.g.select), DateHelperKt.offset(AidKt.toDate(this.g.select), day.getValue()), periodLen);
                        if (pairCalcCurrMenstruationDelPart != null) {
                            FemaleHealthViewModel femaleHealthViewModel = this.g;
                            first = pairCalcCurrMenstruationDelPart.getFirst();
                            second = pairCalcCurrMenstruationDelPart.getSecond();
                            HMLog.info("xys_FemaleHealthViewModel", new d(first, second));
                            menstruationRepo = femaleHealthViewModel.repo;
                            boolBoxBoolean = Boxing.boxBoolean(false);
                            deleteType = DeleteType.TYPE_MERGE;
                            this.a = milli;
                            this.b = pairCalcCurrMenstruationDelPart;
                            this.c = z2;
                            this.e = 3;
                            if (MenstruationRepo.delete$default(menstruationRepo, first, second, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z5 = z2;
                            milli3 = milli;
                            z2 = z5;
                            milli = milli3;
                        }
                        HMLog.info("xys_FemaleHealthViewModel", new e(this.f, milli));
                        if (z2) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (AidKt.toMilli(this.g.select).getValue() == AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)).getValue()) {
                        }
                        this.a = null;
                        this.b = null;
                        this.e = 4;
                        if (this.g.repo.add(AidKt.toDate(this.f), AidKt.toDate(milli), true ^ z6, (32 & 8) != 0 ? false : false, (32 & 16) != 0 ? true : z7, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 3) {
                        z5 = this.c;
                        milli3 = (Milli) this.a;
                        ResultKt.throwOnFailure(obj);
                        z2 = z5;
                        milli = milli3;
                        HMLog.info("xys_FemaleHealthViewModel", new e(this.f, milli));
                        if (z2 || milli.getValue() == AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)).getValue()) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z7 = AidKt.toMilli(this.g.select).getValue() == AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)).getValue();
                        this.a = null;
                        this.b = null;
                        this.e = 4;
                        if (this.g.repo.add(AidKt.toDate(this.f), AidKt.toDate(milli), true ^ z6, (32 & 8) != 0 ? false : false, (32 & 16) != 0 ? true : z7, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.g.e(Dispatchers.getDefault(), this.f.getYear(), this.f.getMonth());
                    this.g.getChangeNoticeLiveData().postValue(null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CalculationManager calculationManager = CalculationManager.INSTANCE;
                Calendar calendar = ExtKt.toCalendar(this.f);
                StyleCatch styleCatch = this.g.styleCatch;
                this.e = 1;
                objPredictionDur = calculationManager.predictionDur(calendar, styleCatch, this);
                if (objPredictionDur == coroutine_suspended) {
                    return coroutine_suspended;
                }
                day = (Day) objPredictionDur;
                HMLog.info("xys_FemaleHealthViewModel", new C0412a(day, this.f));
                Milli milliMenstruationEndTime = FHCalculation.Reality.INSTANCE.menstruationEndTime(AidKt.toMilli(this.f), day);
                boolean zInDur = AidKt.inDur(AidKt.toMilli(this.g.h()), new Duration(AidKt.toMilli(this.g.select).getValue(), day.getValue() + 2));
                boolean zInDur2 = AidKt.inDur(AidKt.toMilli(this.g.h()), new Duration(AidKt.toMilli(this.g.select).getValue(), day.getValue()));
                periodLen = this.g.manager.getSp().getPeriodLen();
                if (zInDur) {
                    CalculationManager calculationManager2 = CalculationManager.INSTANCE;
                    DateTriple dateTriple = AidKt.toDateTriple(AidKt.toDate(this.g.select));
                    b bVar = new b(this.g, null);
                    c cVar = new c(this.g, null);
                    this.a = day;
                    this.b = milliMenstruationEndTime;
                    this.c = zInDur;
                    this.d = zInDur2;
                    this.e = 2;
                    objPredictionDurComplete = calculationManager2.predictionDurComplete(dateTriple, bVar, cVar, this);
                    if (objPredictionDurComplete == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z3 = zInDur;
                    z4 = zInDur2;
                    day2 = day;
                    milli2 = milliMenstruationEndTime;
                    periodLen = ((Day) objPredictionDurComplete).getValue();
                    z2 = z4;
                    z = z3;
                    milli = milli2;
                    day = day2;
                } else {
                    z = zInDur;
                    milli = milliMenstruationEndTime;
                    z2 = zInDur2;
                }
                pairCalcCurrMenstruationDelPart = this.g.manager.calcCurrMenstruationDelPart(false, z, AidKt.toDate(this.g.select), DateHelperKt.offset(AidKt.toDate(this.g.select), day.getValue()), periodLen);
                if (pairCalcCurrMenstruationDelPart != null) {
                    FemaleHealthViewModel femaleHealthViewModel2 = this.g;
                    first = pairCalcCurrMenstruationDelPart.getFirst();
                    second = pairCalcCurrMenstruationDelPart.getSecond();
                    HMLog.info("xys_FemaleHealthViewModel", new d(first, second));
                    menstruationRepo = femaleHealthViewModel2.repo;
                    boolBoxBoolean = Boxing.boxBoolean(false);
                    deleteType = DeleteType.TYPE_MERGE;
                    this.a = milli;
                    this.b = pairCalcCurrMenstruationDelPart;
                    this.c = z2;
                    this.e = 3;
                    if (MenstruationRepo.delete$default(menstruationRepo, first, second, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z5 = z2;
                    milli3 = milli;
                    z2 = z5;
                    milli = milli3;
                }
                HMLog.info("xys_FemaleHealthViewModel", new e(this.f, milli));
                if (z2) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (AidKt.toMilli(this.g.select).getValue() == AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)).getValue()) {
                }
                this.a = null;
                this.b = null;
                this.e = 4;
                if (this.g.repo.add(AidKt.toDate(this.f), AidKt.toDate(milli), true ^ z6, (32 & 8) != 0 ? false : false, (32 & 16) != 0 ? true : z7, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.g.e(Dispatchers.getDefault(), this.f.getYear(), this.f.getMonth());
                this.g.getChangeNoticeLiveData().postValue(null);
                return Unit.INSTANCE;
            }
        }

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DateTriple dateTriple = FemaleHealthViewModel.this.select;
            FemaleHealthViewModel femaleHealthViewModel = FemaleHealthViewModel.this;
            femaleHealthViewModel.g(new a(dateTriple, femaleHealthViewModel, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function1<MenstruationVo, Unit> {
        public f0() {
            super(1);
        }

        public final void a(@NotNull MenstruationVo menstruationVo) {
            FemaleHealthViewModel.this.styleCatch.put(ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstruationVo menstruationVo) {
            a(menstruationVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DateTriple a;
        public final /* synthetic */ FemaleHealthViewModel b;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$delWhenSelectMenstruationStartDay$1$1$1", f = "FemaleHealthViewModel.kt", i = {}, l = {714, 722, 730}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FemaleHealthViewModel b;
            public final /* synthetic */ DateTriple c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ Date e;

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$g$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0413a extends Lambda implements Function0<String> {
                public final /* synthetic */ DateTriple a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ List<MenstruationVo> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0413a(DateTriple dateTriple, boolean z, List<MenstruationVo> list) {
                    super(0);
                    this.a = dateTriple;
                    this.b = z;
                    this.c = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "删除当日经期 dateTriple:" + this.a + "  delAll：" + this.b + "  list.first().date:" + AidKt.toDateTriple(((MenstruationVo) CollectionsKt.first((List) this.c)).getDate()) + "  list.last().date:" + AidKt.toDateTriple(((MenstruationVo) CollectionsKt.last((List) this.c)).getDate()) + "  ";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleHealthViewModel femaleHealthViewModel, DateTriple dateTriple, boolean z, Date date, Continuation<? super a> continuation) {
                super(1, continuation);
                this.b = femaleHealthViewModel;
                this.c = dateTriple;
                this.d = z;
                this.e = date;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0087  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a0 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MenstruationRepo menstruationRepo;
                Date date;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.d) {
                            menstruationRepo = this.b.repo;
                            date = this.e;
                            this.a = 3;
                            if (menstruationRepo.add(date, date, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.b.e(Dispatchers.getDefault(), this.c.getYear(), this.c.getMonth());
                    this.b.getChangeNoticeLiveData().postValue(null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo2 = this.b.repo;
                Date date2 = AidKt.toDate(this.c);
                this.a = 1;
                obj = menstruationRepo2.getLastMenstruation(date2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list = (List) obj;
                if (!list.isEmpty()) {
                    HMLog.info("xys", new C0413a(this.c, this.d, list));
                    MenstruationRepo menstruationRepo3 = this.b.repo;
                    Date date3 = ((MenstruationVo) CollectionsKt.first(list)).getDate();
                    Date date4 = ((MenstruationVo) CollectionsKt.last(list)).getDate();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    DeleteType deleteType = DeleteType.TYPE_TOO_SHORT;
                    this.a = 2;
                    if (MenstruationRepo.delete$default(menstruationRepo3, date3, date4, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!this.d) {
                        menstruationRepo = this.b.repo;
                        date = this.e;
                        this.a = 3;
                        if (menstruationRepo.add(date, date, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                this.b.e(Dispatchers.getDefault(), this.c.getYear(), this.c.getMonth());
                this.b.getChangeNoticeLiveData().postValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DateTriple dateTriple, FemaleHealthViewModel femaleHealthViewModel, boolean z) {
            super(0);
            this.a = dateTriple;
            this.b = femaleHealthViewModel;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Date date;
            DateTriple dateTriple = this.a;
            if (dateTriple == null || (date = AidKt.toDate(dateTriple)) == null) {
                return;
            }
            FemaleHealthViewModel femaleHealthViewModel = this.b;
            femaleHealthViewModel.g(new a(femaleHealthViewModel, this.a, this.c, date, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$renderPrediction$7", f = "FemaleHealthViewModel.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, s = {})
    public static final class g0 extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public g0(Continuation<? super g0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((g0) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g0 g0Var = FemaleHealthViewModel.this.new g0(continuation);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = FemaleHealthViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$endMenstruation$1$1$1", f = "FemaleHealthViewModel.kt", i = {2}, l = {WebResponse.CODE_LIKED, 678, 685}, m = "invokeSuspend", n = {"delDate"}, s = {"L$3"})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public Object a;
            public Object b;
            public Object c;
            public Object d;
            public int e;
            public final /* synthetic */ FemaleHealthViewModel f;
            public final /* synthetic */ DateTriple g;

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$h$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0414a extends Lambda implements Function0<String> {
                public final /* synthetic */ DateTriple a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0414a(DateTriple dateTriple) {
                    super(0);
                    this.a = dateTriple;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("弹出删除dialog：", this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Date a;
                public final /* synthetic */ Date b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Date date, Date date2) {
                    super(0);
                    this.a = date;
                    this.b = date2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "结束经期click:" + AidKt.toDateTriple(this.a) + " - " + AidKt.toDateTriple(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Date a;
                public final /* synthetic */ Date b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Date date, Date date2) {
                    super(0);
                    this.a = date;
                    this.b = date2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "后段经期删除:" + AidKt.toDateTriple(this.a) + " - " + AidKt.toDateTriple(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ MenstruationVo a;
                public final /* synthetic */ Date b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(MenstruationVo menstruationVo, Date date) {
                    super(0);
                    this.a = menstruationVo;
                    this.b = date;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "结束(当前经期):" + AidKt.toDateTriple(this.a.getDate()) + " - " + AidKt.toDateTriple(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleHealthViewModel femaleHealthViewModel, DateTriple dateTriple, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f = femaleHealthViewModel;
                this.g = dateTriple;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f, this.g, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:49:0x0151  */
            /* JADX WARN: Code duplicated, block: B:51:0x0159  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object lastMenstruation;
                List list;
                Date date;
                Date date2;
                Date date3;
                Date date4;
                Date date5;
                MenstruationVo menstruationVo;
                FemaleHealthViewModel femaleHealthViewModel;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MenstruationRepo menstruationRepo = this.f.repo;
                    Date date6 = AidKt.toDate(this.g);
                    this.e = 1;
                    lastMenstruation = menstruationRepo.getLastMenstruation(date6, this);
                    if (lastMenstruation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            date4 = (Date) this.b;
                            date5 = (Date) this.a;
                            ResultKt.throwOnFailure(obj);
                            HMLog.info("xys_FemaleHealthViewModel", new b(date5, date4));
                            this.f.e(Dispatchers.getDefault(), this.g.getYear(), this.g.getMonth());
                            this.f.getChangeNoticeLiveData().postValue(null);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        date3 = (Date) this.d;
                        date2 = (Date) this.c;
                        date = (Date) this.b;
                        list = (List) this.a;
                        ResultKt.throwOnFailure(obj);
                        HMLog.info("xys_FemaleHealthViewModel", new c(date3, date2));
                        menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull(list);
                        if (menstruationVo != null) {
                            femaleHealthViewModel = this.f;
                            if (!menstruationVo.isEnd()) {
                                HMLog.info("xys_FemaleHealthViewModel", new d(menstruationVo, date));
                                femaleHealthViewModel.repo.menstruationEndByDateRange(menstruationVo.getDate(), date, true);
                            }
                        }
                        this.f.e(Dispatchers.getDefault(), this.g.getYear(), this.g.getMonth());
                        this.f.getChangeNoticeLiveData().postValue(null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    lastMenstruation = obj;
                }
                List list2 = (List) lastMenstruation;
                Date date7 = AidKt.toDate(this.g);
                MenstruationVo menstruationVo2 = (MenstruationVo) CollectionsKt.firstOrNull(list2);
                Date date8 = menstruationVo2 == null ? null : menstruationVo2.getDate();
                MenstruationVo menstruationVo3 = (MenstruationVo) CollectionsKt.lastOrNull(list2);
                Date date9 = menstruationVo3 == null ? null : menstruationVo3.getDate();
                if (date8 != null && date9 != null) {
                    if (date7.getTime() == date8.getTime()) {
                        HMLog.info("xys_FemaleHealthViewModel", new C0414a(this.g));
                        this.f.getDialogLiveData().postValue(this.g);
                    } else {
                        if (date9.getTime() == date7.getTime()) {
                            MenstruationVo menstruationVo4 = (MenstruationVo) CollectionsKt.lastOrNull(list2);
                            if ((menstruationVo4 == null || menstruationVo4.isEnd()) ? false : true) {
                                MenstruationRepo menstruationRepo2 = this.f.repo;
                                this.a = date8;
                                this.b = date9;
                                this.e = 2;
                                Date date10 = date9;
                                Date date11 = date8;
                                if (menstruationRepo2.add(date8, date9, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                date4 = date10;
                                date5 = date11;
                                HMLog.info("xys_FemaleHealthViewModel", new b(date5, date4));
                                this.f.e(Dispatchers.getDefault(), this.g.getYear(), this.g.getMonth());
                            }
                        }
                        Date date12 = date9;
                        Date date13 = AidKt.toDate(DateHelper.INSTANCE.offsetDay(1, date7.getTime()));
                        MenstruationRepo menstruationRepo3 = this.f.repo;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                        DeleteType deleteType = DeleteType.TYPE_TOO_SHORT;
                        this.a = list2;
                        this.b = date7;
                        this.c = date12;
                        this.d = date13;
                        this.e = 3;
                        if (MenstruationRepo.delete$default(menstruationRepo3, date13, date12, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = list2;
                        date = date7;
                        date2 = date12;
                        date3 = date13;
                        HMLog.info("xys_FemaleHealthViewModel", new c(date3, date2));
                        menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull(list);
                        if (menstruationVo != null) {
                            femaleHealthViewModel = this.f;
                            if (!menstruationVo.isEnd()) {
                                HMLog.info("xys_FemaleHealthViewModel", new d(menstruationVo, date));
                                femaleHealthViewModel.repo.menstruationEndByDateRange(menstruationVo.getDate(), date, true);
                            }
                        }
                        this.f.e(Dispatchers.getDefault(), this.g.getYear(), this.g.getMonth());
                    }
                }
                this.f.getChangeNoticeLiveData().postValue(null);
                return Unit.INSTANCE;
            }
        }

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DateTriple dateTriple = FemaleHealthViewModel.this.select;
            FemaleHealthViewModel femaleHealthViewModel = FemaleHealthViewModel.this;
            femaleHealthViewModel.g(new a(femaleHealthViewModel, dateTriple, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<Unit> {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FemaleHealthViewModel femaleHealthViewModel = FemaleHealthViewModel.this;
            femaleHealthViewModel.c(femaleHealthViewModel.select);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("initPrediction basicInputValue:", FHCalculation.INSTANCE.getBasicInputValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationWithSymptoms> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(List<MenstruationWithSymptoms> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("menstruationWithSymptoms: data=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onCreate ViewModel FemaleHealth";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Resource<List<MenstruationWithSymptoms>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j0(Resource<? extends List<MenstruationWithSymptoms>> resource) {
            super(0);
            this.a = resource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("menstruationWithSymptoms: status=", this.a.getStatus());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "设置项修改，刷新日历";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "同步完成，刷新日历";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onEvent, EventMenstruationOperation";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onResume start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onResume ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onResume ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onResume ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onResume ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel", f = "FemaleHealthViewModel.kt", i = {0}, l = {352}, m = "reRenderPrediction", n = {"start$iv"}, s = {"J$0"})
    public static final class t extends ContinuationImpl {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FemaleHealthViewModel.this.k(0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reRenderPrediction start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("reRenderPrediction end ", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("trainingTag=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$refreshCardContent$1$1$1", f = "FemaleHealthViewModel.kt", i = {}, l = {484}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((x) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            x xVar = FemaleHealthViewModel.this.new x(continuation);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepo = FemaleHealthViewModel.this.repo;
                this.a = 1;
                obj = menstruationRepo.getLastMenstruation(date, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ DateTriple a;
        public final /* synthetic */ Ref.ObjectRef<List<HistoryDetailBean>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(DateTriple dateTriple, Ref.ObjectRef<List<HistoryDetailBean>> objectRef) {
            super(0);
            this.a = dateTriple;
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refreshCardStatus：" + this.a + " -> :" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function1<List<? extends HistoryDetailBean>, Unit> {
        public final /* synthetic */ Ref.ObjectRef<List<HistoryDetailBean>> a;
        public final /* synthetic */ FemaleHealthViewModel b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DateTriple d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Ref.ObjectRef<List<HistoryDetailBean>> objectRef, FemaleHealthViewModel femaleHealthViewModel, String str, DateTriple dateTriple) {
            super(1);
            this.a = objectRef;
            this.b = femaleHealthViewModel;
            this.c = str;
            this.d = dateTriple;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends HistoryDetailBean> list) {
            invoke2((List<HistoryDetailBean>) list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<HistoryDetailBean> list) {
            HistoryDetailBean historyDetailBeanPrevious;
            this.a.element = list;
            this.b.statusCatch.put(this.c, this.a.element);
            MutableLiveData<Triple<Degree, Degree, Degree>> statusLiveDate = this.b.getStatusLiveDate();
            List<HistoryDetailBean> list2 = this.a.element;
            Triple<Degree, Degree, Degree> triple = null;
            if (list2 != null) {
                DateTriple dateTriple = this.d;
                ListIterator<HistoryDetailBean> listIterator = list2.listIterator(list2.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        historyDetailBeanPrevious = null;
                        break;
                    }
                    historyDetailBeanPrevious = listIterator.previous();
                } while (!(AidKt.resetZeroHour(historyDetailBeanPrevious.getMenstruationTime()) == AidKt.toMilli(dateTriple).getValue()));
                HistoryDetailBean historyDetailBean = historyDetailBeanPrevious;
                if (historyDetailBean != null) {
                    triple = HistoryDetailBeanKt.toTriple(historyDetailBean);
                }
            }
            statusLiveDate.postValue(triple);
        }
    }

    public FemaleHealthViewModel(@NotNull MenstruationRepo menstruationRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        this.repo = menstruationRepo;
        this.manager = menstruationDataManager;
        this.sp = menstruationDataManager.getSp();
        Degree degree = Degree.UNSPECIFIED;
        this.statusLiveDate = new MutableLiveData<>(new Triple(degree, degree, degree));
        this.dialogLiveData = new MutableLiveData<>(null);
        this.trainingTag = new MutableLiveData<>();
        this.showEditButtonLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.changeNoticeLiveData = new MutableLiveData<>(null);
        MediatorLiveData<Date> mediatorLiveData = new MediatorLiveData<>();
        this.symptomLastDate = mediatorLiveData;
        LiveData<Resource<List<MenstruationWithSymptoms>>> liveDataSwitchMap = Transformations.switchMap(mediatorLiveData, new Function() { // from class: r52
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FemaleHealthViewModel.j(this.a, (Date) obj);
            }
        });
        this.menstruationWithSymptom = liveDataSwitchMap;
        this.symptomLive = Transformations.switchMap(liveDataSwitchMap, new Function() { // from class: s52
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FemaleHealthViewModel.s((Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(DateTriple select) {
        CoroutineContext main = Dispatchers.getMain();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(main, FHBaseViewModel.c)) {
            main = main.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), main, coroutineStart, new FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1(null, this, select));
    }

    public static /* synthetic */ CalendarPeriodStyle calRenderStyle$default(FemaleHealthViewModel femaleHealthViewModel, Calendar calendar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return femaleHealthViewModel.calRenderStyle(calendar, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(CoroutineContext context, int year, int month) {
        Job job = this.calendarRenderJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(context, FHBaseViewModel.c)) {
            context = context.plus(FHBaseViewModel.c);
        }
        this.calendarRenderJob = BuildersKt.launch(ViewModelKt.getViewModelScope(this), context, coroutineStart, new FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1(null, this, year, month));
    }

    public static /* synthetic */ void f(FemaleHealthViewModel femaleHealthViewModel, CoroutineContext coroutineContext, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i4 & 2) != 0) {
            i2 = femaleHealthViewModel.select.getYear();
        }
        if ((i4 & 4) != 0) {
            i3 = femaleHealthViewModel.select.getMonth();
        }
        femaleHealthViewModel.e(coroutineContext, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        HMLog.info("xys_FemaleHealthViewModel", b.a);
        if (!this.clickable) {
            HMLog.info("xys_FemaleHealthViewModel", c.a);
            return;
        }
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$createBtnSmartClickable$$inlined$safeLaunch$uilib_release$default$1(null, this, action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DateTriple h() {
        return AidKt.toDateTriple(AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)));
    }

    private final void i() {
        FHCalculation.INSTANCE.setBasicInputValue(new BasicInputValue(this.sp.getLastMenstruationTime(), this.sp.getPeriodLen(), this.sp.getCycleLen(), this.sp.getEnablePredict()));
        HMLog.info("xys_FemaleHealthViewModel", i.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData j(FemaleHealthViewModel femaleHealthViewModel, Date date) {
        return date == null ? new MutableLiveData(new Resource(Status.ERROR, CollectionsKt__CollectionsKt.emptyList(), "")) : femaleHealthViewModel.repo.loadLiveMenstruationWithSymptoms(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:12:0x0026, B:20:0x0056, B:13:0x002c, B:14:0x0033, B:15:0x0034, B:8:0x0014), top: B:26:0x0001 }] */
    public final synchronized Object k(int i2, int i3, Continuation<? super Unit> continuation) {
        t tVar;
        long j2;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i4 = tVar.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.d = i4 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object obj = tVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = tVar.d;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("xys_FemaleHealthViewModel", u.a);
            StyleCatch.clearAll$default(this.styleCatch, false, 1, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            tVar.a = jCurrentTimeMillis;
            tVar.d = 1;
            if (r(i2, i3, tVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = jCurrentTimeMillis;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = tVar.a;
            ResultKt.throwOnFailure(obj);
        }
        HMLog.info("xys_FemaleHealthViewModel", new v(System.currentTimeMillis() - j2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(DateTriple dateTriple) {
        String str;
        if (dateTriple != null) {
            getRefreshLiveData().postValue(dateTriple);
            Calendar calendar = ExtKt.toCalendar(dateTriple);
            n(dateTriple);
            MutableLiveData<Triple<DateTriple, CalendarPeriodStyle, MenstruationVo>> selectDateLiveData = getSelectDateLiveData();
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.styleCatch.getDayStyle(calendar);
            CalendarPeriodStyle first = dayStyle == null ? null : dayStyle.getFirst();
            if (first == null) {
                first = StatusKt.getNormalStyle();
            }
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = this.styleCatch.getDayStyle(calendar);
            MenstruationVo second = dayStyle2 == null ? null : dayStyle2.getSecond();
            if (second == null) {
                second = MenstruationVo.INSTANCE.getEMPTY();
            }
            selectDateLiveData.postValue(new Triple<>(dateTriple, first, second));
            getStateCardDateLiveData().postValue(DateFormatHelper.INSTANCE.smartDateFormat(AidKt.toDate(dateTriple).getTime()));
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle3 = this.styleCatch.getDayStyle(calendar);
            if ((dayStyle3 == null ? null : dayStyle3.getFirst()) instanceof PeriodStyle) {
                o(dateTriple);
            }
            String value = getTrainingTag().getValue();
            if ((value == null || value.length() == 0) && this.styleCatch.getDayStyle(ExtKt.toCalendar(h())) != null) {
                CalendarPeriodStyle first2 = this.styleCatch.getDayStyle(ExtKt.toCalendar(h())).getFirst();
                if (first2 instanceof PeriodStyle ? true : first2 instanceof ForecastStyle) {
                    str = TrainingViewModel.TAG_PERIOD;
                } else {
                    str = first2 instanceof OvulationStyle ? true : first2 instanceof PregnantStyle ? TrainingViewModel.TAG_OVULATION : TrainingViewModel.TAG_OTHER;
                }
                HMLog.info("xys_FemaleHealthViewModel", new w(str));
                getTrainingTag().postValue("xys_FemaleHealthViewModel");
            }
            if (this.symptomLastDate.getValue() == null) {
                q(this, false, 1, null);
            }
            MutableLiveData<Boolean> showEditButtonLiveData = getShowEditButtonLiveData();
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle4 = this.styleCatch.getDayStyle(calendar);
            showEditButtonLiveData.postValue(Boolean.valueOf((dayStyle4 == null ? null : dayStyle4.getFirst()) instanceof PeriodStyle));
        }
        this.calendarRenderJob = null;
    }

    private final void n(DateTriple dateTriple) {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1(null, dateTriple, this));
    }

    private final void o(DateTriple dateTriple) {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1(null, dateTriple, this));
    }

    private final void p(boolean needReload) {
        HMLog.info("xys_FemaleHealthViewModel", a0.a);
        Job job = this.statusJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        this.statusJob = BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1(null, needReload, this));
    }

    public static /* synthetic */ void q(FemaleHealthViewModel femaleHealthViewModel, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        femaleHealthViewModel.p(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x001c A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:8:0x0018, B:10:0x0021, B:14:0x0033, B:32:0x010f, B:15:0x0038, B:16:0x003f, B:17:0x0040, B:26:0x00c0, B:28:0x00cc, B:35:0x0113, B:18:0x0052, B:20:0x0068, B:21:0x007d, B:9:0x001c), top: B:41:0x0009 }] */
    public final synchronized Object r(int i2, int i3, Continuation<? super Unit> continuation) {
        c0 c0Var;
        int i4;
        Object obj;
        FemaleHealthViewModel femaleHealthViewModel;
        int i5 = i2;
        int i6 = i3;
        synchronized (this) {
            if (continuation instanceof c0) {
                c0Var = (c0) continuation;
                int i7 = c0Var.f;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0Var.f = i7 - Integer.MIN_VALUE;
                } else {
                    c0Var = new c0(continuation);
                }
            } else {
                c0Var = new c0(continuation);
            }
            c0 c0Var2 = c0Var;
            Object obj2 = c0Var2.d;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i8 = c0Var2.f;
            if (i8 != 0) {
                if (i8 == 1) {
                    int i9 = c0Var2.c;
                    int i10 = c0Var2.b;
                    femaleHealthViewModel = (FemaleHealthViewModel) c0Var2.a;
                    ResultKt.throwOnFailure(obj2);
                    i6 = i9;
                    i5 = i10;
                    obj = coroutine_suspended;
                    i4 = 2;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj2);
            CalculationManager calculationManager = CalculationManager.INSTANCE;
            int iCeil = (int) Math.ceil(5.0f);
            ArrayList arrayList = new ArrayList(iCeil);
            for (int i11 = 0; i11 < iCeil; i11++) {
                arrayList.add(DateHelper.INSTANCE.preMonth(i5, i6, Boxing.boxInt(i11).intValue() + 1));
            }
            arrayList.add(new DateTriple(i5, i6, 1));
            arrayList.add(DateHelper.nextMonth$default(DateHelper.INSTANCE, i2, i3, 0, 4, null));
            Unit unit = Unit.INSTANCE;
            d0 d0Var = new d0();
            e0 e0Var = new e0(null);
            f0 f0Var = new f0();
            c0Var2.a = this;
            c0Var2.b = i5;
            c0Var2.c = i6;
            c0Var2.f = 1;
            i4 = 2;
            obj = coroutine_suspended;
            if (calculationManager.putMonthStyle(arrayList, d0Var, e0Var, f0Var, c0Var2) == obj) {
                return obj;
            }
            femaleHealthViewModel = this;
            if (!FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()) {
                femaleHealthViewModel.c(femaleHealthViewModel.select);
                return Unit.INSTANCE;
            }
            DateHelper dateHelper = DateHelper.INSTANCE;
            DateTriple dateTripleOffsetDay = dateHelper.offsetDay(101, AidKt.toMilli(new DateTriple(i5, i6, dateHelper.getMonthOfDay(i5, i6))).getValue());
            CalculationManager calculationManager2 = CalculationManager.INSTANCE;
            Calendar calendar = ExtKt.toCalendar(femaleHealthViewModel.h());
            StyleCatch styleCatch = femaleHealthViewModel.styleCatch;
            g0 g0Var = femaleHealthViewModel.new g0(0);
            h0 h0Var = femaleHealthViewModel.new h0();
            c0Var2.a = r12;
            c0Var2.f = i4;
            Object obj3 = obj;
            if (calculationManager2.predictionMenstruation(calendar, dateTripleOffsetDay, styleCatch, g0Var, null, h0Var, c0Var2) == obj3) {
                return obj3;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData s(Resource resource) {
        Object next;
        MutableLiveData mutableLiveData = new MutableLiveData();
        Object next2 = null;
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            List list = (List) resource.getData();
            HMLog.info("xys_FemaleHealthViewModel", new i0(list));
            if (!(list == null || list.isEmpty())) {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long time = ((MenstruationWithSymptoms) next).getRecord().getDate().getTime();
                        do {
                            Object next3 = it2.next();
                            long time2 = ((MenstruationWithSymptoms) next3).getRecord().getDate().getTime();
                            if (time > time2) {
                                next = next3;
                                time = time2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Date date = ((MenstruationWithSymptoms) next).getRecord().getDate();
                Iterator it3 = list.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        long time3 = ((MenstruationWithSymptoms) next2).getRecord().getDate().getTime();
                        do {
                            Object next4 = it3.next();
                            long time4 = ((MenstruationWithSymptoms) next4).getRecord().getDate().getTime();
                            if (time3 < time4) {
                                next2 = next4;
                                time3 = time4;
                            }
                        } while (it3.hasNext());
                    }
                }
                Date date2 = ((MenstruationWithSymptoms) next2).getRecord().getDate();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SymptomType[] symptomTypeArrValues = SymptomType.values();
                int length = symptomTypeArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    SymptomType symptomType = symptomTypeArrValues[i2];
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        kotlin.collections.h.addAll(arrayList, ((MenstruationWithSymptoms) it4.next()).getSymptoms());
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(PoToVoKt.toSymptomVo((Symptom) it5.next()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((SymptomVo) obj).getType() == symptomType) {
                            arrayList3.add(obj);
                        }
                    }
                    linkedHashMap.put(symptomType, arrayList3);
                }
                mutableLiveData.postValue(new SymptomTotalVo(date, date2, linkedHashMap));
            }
        } else {
            mutableLiveData.postValue(null);
            HMLog.warn$default("xys_FemaleHealthViewModel", null, new j0(resource), 2, null);
        }
        return mutableLiveData;
    }

    @NotNull
    public final CalendarPeriodStyle calRenderStyle(@NotNull Calendar calendar, boolean hard) {
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.styleCatch.getDayStyle(calendar);
        if (dayStyle == null) {
            dayStyle = TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY());
        }
        this.styleCatch.put(calendar, dayStyle, hard);
        return dayStyle.getFirst();
    }

    public final void createMenstruation() {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new f(), 1, null);
    }

    public final void delWhenSelectMenstruationStartDay(@Nullable DateTriple dateTriple, boolean delAll) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new g(dateTriple, this, delAll), 1, null);
    }

    public final void endMenstruation() {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new h(), 1, null);
    }

    @NotNull
    public final MutableLiveData<Object> getChangeNoticeLiveData() {
        return this.changeNoticeLiveData;
    }

    @NotNull
    public final MutableLiveData<DateTriple> getDialogLiveData() {
        return this.dialogLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEnablePredictLiveData() {
        return this.enablePredictLiveData;
    }

    @NotNull
    public final MutableLiveData<DateTriple> getRefreshLiveData() {
        return this.refreshLiveData;
    }

    @NotNull
    public final MutableLiveData<Triple<DateTriple, CalendarPeriodStyle, MenstruationVo>> getSelectDateLiveData() {
        return this.selectDateLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowEditButtonLiveData() {
        return this.showEditButtonLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getStateCardContentLiveData() {
        return this.stateCardContentLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getStateCardDateLiveData() {
        return this.stateCardDateLiveData;
    }

    @NotNull
    public final MutableLiveData<Triple<Degree, Degree, Degree>> getStatusLiveDate() {
        return this.statusLiveDate;
    }

    @NotNull
    public final LiveData<SymptomTotalVo> getSymptomLive() {
        return this.symptomLive;
    }

    @NotNull
    public final MutableLiveData<String> getTrainingTag() {
        return this.trainingTag;
    }

    public final boolean isTomorrowMenstruation(@NotNull DateTriple dateTriple) {
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.styleCatch.getDayStyle(ExtKt.toCalendar(DateHelper.INSTANCE.offsetDay(1, AidKt.toDate(dateTriple).getTime())));
        return (dayStyle == null ? null : dayStyle.getFirst()) instanceof PeriodStyle;
    }

    public final void onCalendarSelect(@Nullable Calendar calendar) {
        if (calendar == null) {
            return;
        }
        if (calendar.getYear() == this.select.getYear() && calendar.getMonth() == this.select.getMonth() && calendar.getDay() == this.select.getDay()) {
            return;
        }
        DateTriple dateTriple = ExtKt.toDateTriple(calendar);
        this.select = dateTriple;
        m(dateTriple);
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        HMLog.warn$default(B, null, j.a, 2, null);
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$onCreate$$inlined$safeLaunch$uilib_release$default$1(null, this));
        super.onCreate(owner);
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, k.a, 1, null);
        FHBaseViewModel.safeRegisterEvent$default(this, false, 1, null);
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        super.onDestroy(owner);
        safeUnregisterEvent();
    }

    public final void onEvent(@NotNull EventFHSettingChanged event) {
        HMLog.info("xys_FemaleHealthViewModel", l.a);
        i();
        DateTriple dateTriple = this.select;
        e(Dispatchers.getIO(), dateTriple.getYear(), dateTriple.getMonth());
        this.enablePredictLiveData.postValue(Boolean.valueOf(FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()));
    }

    public final void onMonthChange(int year, int month) {
        if (this.firstComeIn) {
            this.firstComeIn = false;
            return;
        }
        Job job = this.renderPredictionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        this.renderPredictionJob = BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$onMonthChange$$inlined$safeLaunch$uilib_release$default$1(null, this, year, month));
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        super.onResume(owner);
        i();
        DateTriple dateTriple = this.select;
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1(null, this, dateTriple));
        this.enablePredictLiveData.postValue(Boolean.valueOf(FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()));
    }

    public final void setCardStatus(@NotNull final Degree painSelect, @NotNull final Degree bloodSelect, @NotNull final Degree moodSelect) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new Function0<Unit>() { // from class: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel.setCardStatus.1

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$setCardStatus$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Long a;
                public final /* synthetic */ List<MenstruationVo> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Long l, List<MenstruationVo> list) {
                    super(0);
                    this.a = l;
                    this.b = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "setCardStatus time:" + this.a + StringUtil.SPACE + this.b;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FemaleHealthViewModel femaleHealthViewModel = FemaleHealthViewModel.this;
                CoroutineContext io2 = Dispatchers.getIO();
                FemaleHealthViewModel femaleHealthViewModel2 = FemaleHealthViewModel.this;
                Degree degree = painSelect;
                Degree degree2 = bloodSelect;
                Degree degree3 = moodSelect;
                CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
                if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
                    io2 = io2.plus(FHBaseViewModel.c);
                }
                BuildersKt.launch(ViewModelKt.getViewModelScope(femaleHealthViewModel), io2, coroutineStart, new FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1(null, femaleHealthViewModel2, degree, degree2, degree3));
            }
        }, 1, null);
    }

    public final void onEvent(@NotNull EventDevSyncFemaleFinish event) {
        HMLog.info("xys_FemaleHealthViewModel", m.a);
        DateTriple dateTriple = this.select;
        e(Dispatchers.getIO(), dateTriple.getYear(), dateTriple.getMonth());
    }

    public final void onEvent(@NotNull EventMenstruationOperation event) {
        HMLog.info("xys_FemaleHealthViewModel", n.a);
        q(this, false, 1, null);
    }
}
