package com.huami.femalehealth.uilib.widget.calendar;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.api.DeleteType;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.BasicInputValue;
import com.huami.femalehealth.logiclib.calculation.Day;
import com.huami.femalehealth.logiclib.calculation.Duration;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarNormalStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.ForecastStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.OvulationStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PregnantStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
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
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\be\u0010fJ&\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002JW\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J´\u0001\u0010)\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2.\u0010!\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2&\u0010&\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\u00120#\u0012\u0004\u0012\u00020\t0\"2\u0006\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000e\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+JT\u0010.\u001a\u00020\t2\u0006\u0010,\u001a\u00020+27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u008c\u0001\u00106\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2\u0018\b\u0002\u00103\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\"2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\t04H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0080\u0001\u0010<\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2=\u0010!\u001a9\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2\u001c\b\u0002\u0010;\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J¬\u0001\u0010>\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2.\u0010!\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2&\u0010&\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\u00120#\u0012\u0004\u0012\u00020\t0\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J¬\u0001\u0010@\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2.\u0010!\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2&\u0010&\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\u00120#\u0012\u0004\u0012\u00020\t0\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b@\u0010?J\u0084\u0001\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u001f2.\u0010!\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0086@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0094\u0001\u0010F\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u001c\b\u0002\u0010D\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\"2=\u0010!\u001a9\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\"H\u0086@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJx\u0010J\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\u00120#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'27\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0086@ø\u0001\u0000¢\u0006\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020%8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010LR\u0016\u0010P\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010S\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010OR\"\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\\\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u0016\u0010\u001b\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001d\u0010b\u001a\u00020_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\bQ\u0010aR\u0016\u0010d\u001a\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/CalculationManager;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "list", "Ljava/util/Date;", "end", "", "isEnd", "", "h", "", "periodDuration", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "date", "Lkotlin/coroutines/Continuation;", "", "getLastMenstruation", "e", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "timeMilli", "Lcom/huami/femalehealth/logiclib/calculation/Day;", "g", "Lcom/huami/calendarview/Calendar;", "now", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "styleCatch", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "descTime", "getMenstruationOfDay", "Lkotlin/Function1;", "Lkotlin/Triple;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "", "callback", "Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;", "cardContentStyle", "a", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "basicInputValue", "initBasicInputValue", PointCategory.INIT, "(Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predictionDur", "(Lcom/huami/calendarview/Calendar;Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "catchPutIntercept", "Lkotlin/Function0;", "refresh", "predictionMenstruation", "(Lcom/huami/calendarview/Calendar;Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "year", "month", "dateList", "addToCatch", "getMenstruationByMonth", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardLongContent", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardShortContent", "dateTriple", "predictionDurComplete", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onMonthCallBack", "putFun", "putMonthStyle", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentState", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailsContent", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;Lcom/huami/femalehealth/uilib/widget/calendar/content/BaseCardContentStyle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "CYCLE_MAX", "c", "CYCLE_MIN", "MONTH_OF_DAY", "Lcom/huami/femalehealth/logiclib/calculation/Day;", "getPredictionDurCarche", "()Lcom/huami/femalehealth/logiclib/calculation/Day;", "setPredictionDurCarche", "(Lcom/huami/femalehealth/logiclib/calculation/Day;)V", "predictionDurCarche", "getPredictionCycleCarche", "setPredictionCycleCarche", "predictionCycleCarche", "f", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "Lkotlin/Lazy;", "()Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "menstruationRepo", "()Ljava/util/Date;", "default", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalculationManager implements KoinComponent {

    @NotNull
    public static final CalculationManager INSTANCE;
    public static final int MONTH_OF_DAY = 30;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "CalculationManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int CYCLE_MAX = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int CYCLE_MIN = 12;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static Day predictionDurCarche;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static Day predictionCycleCarche;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static DateTriple now;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy menstruationRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {RaceId.RACE_SWITCH_POWER_MODE, FTPCodes.PAGE_TYPE_UNKNOWN}, m = "getCardContent", n = {"this", "descTime", "getLastMenstruation", "callback", "cardContentStyle", "now", "styleCatch"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return CalculationManager.this.a(null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("预测耗时:", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends DateTriple>, Unit> {
        public final /* synthetic */ StyleCatch a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StyleCatch styleCatch) {
            super(1);
            this.a = styleCatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DateTriple> list) {
            invoke2((List<DateTriple>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<DateTriple> list) {
            StyleCatch styleCatch = this.a;
            for (DateTriple dateTriple : list) {
                styleCatch.initMonthOfDayIfNull(dateTriple.getYear(), dateTriple.getMonth());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionMenstruation predictionCycle", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$getCardContent$3", f = "CalculationManager.kt", i = {}, l = {534}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<List<? extends Date>, Continuation<? super List<MenstruationVo>>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((c) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                List<? extends Date> list = (List) this.b;
                Function2<List<? extends Date>, Continuation<? super List<MenstruationVo>>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(list, this);
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
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionMenstruation predictionDur", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<MenstruationVo, Unit> {
        public final /* synthetic */ StyleCatch a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StyleCatch styleCatch) {
            super(1);
            this.a = styleCatch;
        }

        public final void a(@NotNull MenstruationVo menstruationVo) {
            StyleCatch.put$default(this.a, ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstruationVo menstruationVo) {
            a(menstruationVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionMenstruation incrementIfNeed", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$getCardContent$5", f = "CalculationManager.kt", i = {}, l = {FTPCodes.EXCEEDED_STORAGE_ALLOCATION}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((e) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(this.c, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                Function2<Date, Continuation<? super List<MenstruationVo>>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(date, this);
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
    public static final class e0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;
        public final /* synthetic */ Ref.ObjectRef<Day> b;
        public final /* synthetic */ Ref.ObjectRef<Day> c;
        public final /* synthetic */ List<MenstruationVo> d;
        public final /* synthetic */ List<MenstruationVo> e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ DateTriple g;
        public final /* synthetic */ Ref.ObjectRef<Date> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Calendar calendar, Ref.ObjectRef<Day> objectRef, Ref.ObjectRef<Day> objectRef2, List<MenstruationVo> list, List<MenstruationVo> list2, boolean z, DateTriple dateTriple, Ref.ObjectRef<Date> objectRef3) {
            super(0);
            this.a = calendar;
            this.b = objectRef;
            this.c = objectRef2;
            this.d = list;
            this.e = list2;
            this.f = z;
            this.g = dateTriple;
            this.h = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Date date;
            Date date2;
            StringBuilder sb = new StringBuilder();
            sb.append("normalDay:");
            sb.append(ExtKt.toDateTriple(this.a));
            sb.append("  dur:");
            sb.append(this.b.element);
            sb.append("  cycle:");
            sb.append(this.c.element);
            sb.append("  lastMenstruation:");
            MenstruationVo menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull((List) this.d);
            DateTriple dateTriple = null;
            sb.append((menstruationVo == null || (date = menstruationVo.getDate()) == null) ? null : AidKt.toDateTriple(date));
            sb.append("  lastMenstruationOrCurrent:");
            MenstruationVo menstruationVo2 = (MenstruationVo) CollectionsKt.firstOrNull((List) this.e);
            if (menstruationVo2 != null && (date2 = menstruationVo2.getDate()) != null) {
                dateTriple = AidKt.toDateTriple(date2);
            }
            sb.append(dateTriple);
            sb.append("  todayIsMenstruation:");
            sb.append(this.f);
            sb.append("  limit:");
            sb.append(this.g);
            sb.append("  startTime.time:");
            sb.append(AidKt.toDateTriple(new Milli(this.h.element.getTime())));
            sb.append("  ");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function1<Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> a;
        public final /* synthetic */ DateTriple b;
        public final /* synthetic */ StyleCatch c;
        public final /* synthetic */ BaseCardContentStyle d;
        public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$getCardContent$6$1", f = "CalculationManager.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ Function1<Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> c;
            public final /* synthetic */ DateTriple d;
            public final /* synthetic */ StyleCatch e;
            public final /* synthetic */ BaseCardContentStyle f;
            public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> g;

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.widget.calendar.CalculationManager$f$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$getCardContent$6$1$1", f = "CalculationManager.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0420a extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0420a(Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super C0420a> continuation) {
                    super(2, continuation);
                    this.c = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                    return ((C0420a) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0420a c0420a = new C0420a(this.c, continuation);
                    c0420a.b = obj;
                    return c0420a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Date date = (Date) this.b;
                        Function2<Date, Continuation<? super List<MenstruationVo>>, Object> function2 = this.c;
                        this.a = 1;
                        obj = function2.invoke(date, this);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function1, DateTriple dateTriple, StyleCatch styleCatch, BaseCardContentStyle baseCardContentStyle, Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = function1;
                this.d = dateTriple;
                this.e = styleCatch;
                this.f = baseCardContentStyle;
                this.g = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Function1 function1;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function2 = this.c;
                    CalculationManager calculationManager = CalculationManager.INSTANCE;
                    DateTriple dateTriple = this.d;
                    StyleCatch styleCatch = this.e;
                    BaseCardContentStyle baseCardContentStyle = this.f;
                    C0420a c0420a = new C0420a(this.g, null);
                    this.a = function2;
                    this.b = 1;
                    Object detailsContent = calculationManager.getDetailsContent(dateTriple, styleCatch, baseCardContentStyle, c0420a, this);
                    if (detailsContent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function2;
                    obj = detailsContent;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                function1.invoke(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function1, DateTriple dateTriple, StyleCatch styleCatch, BaseCardContentStyle baseCardContentStyle, Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2) {
            super(0);
            this.a = function1;
            this.b = dateTriple;
            this.c = styleCatch;
            this.d = baseCardContentStyle;
            this.e = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(this.a, this.b, this.c, this.d, this.e, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$predictionMenstruation$time$1$measureTimeMillis$1$1", f = "CalculationManager.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    public static final class f0 extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public f0(Continuation<? super f0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((f0) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f0 f0Var = new f0(continuation);
            f0Var.b = obj;
            return f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                MenstruationRepo menstruationRepoC = CalculationManager.INSTANCE.c();
                this.a = 1;
                obj = menstruationRepoC.getLastMenstruation(date, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {0, 0, 1, 2, 2, 3}, l = {660, TypedValues.TransitionType.TYPE_STAGGERED, 713, 792}, m = "getDetailsContent", n = {"descTime", "cardContentStyle", "value0", "value0", "descMenstruation", "i"}, s = {"L$0", "L$1", "L$4", "L$4", "L$5", "I$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public boolean g;
        public int h;
        public /* synthetic */ Object i;
        public int k;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return CalculationManager.this.getDetailsContent(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {}, l = {628}, m = "putMonthStyle", n = {}, s = {})
    public static final class g0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g0(Continuation<? super g0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CalculationManager.this.putMonthStyle(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Ref.LongRef longRef) {
            super(0);
            this.a = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getDetailsContent time1:", Long.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$refreshDB$1", f = "CalculationManager.kt", i = {0, 1}, l = {100, 102, 105, 107}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u2d0", "$this$invokeSuspend_u24lambda_u2d0"}, s = {"L$2", "L$2"})
    public static final class h0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ List<MenstruationVo> e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ Date g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Date a;
            public final /* synthetic */ Date b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Date date, Date date2, boolean z) {
                super(0);
                this.a = date;
                this.b = date2;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "自增长返回参数:start:" + AidKt.toDateTriple(this.a) + " end:" + AidKt.toDateTriple(this.b) + " isEnd:" + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(List<MenstruationVo> list, boolean z, Date date, Continuation<? super h0> continuation) {
            super(2, continuation);
            this.e = list;
            this.f = z;
            this.g = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h0(this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00df  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ff A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Date date;
            Object lastMenstruation;
            Date date2;
            Date date3;
            Date date4;
            List list;
            Date date5;
            Date date6;
            MenstruationRepo menstruationRepoC;
            Date date7;
            Date date8;
            Boolean boolBoxBoolean;
            DeleteType deleteType;
            Date date9;
            Date date10;
            Date date11;
            MenstruationRepo menstruationRepoC2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationVo menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull((List) this.e);
                if (menstruationVo != null && (date = menstruationVo.getDate()) != null) {
                    boolean z = this.f;
                    Date date12 = this.g;
                    HMLog.info("xys_CalculationManager", new a(date, date12, z));
                    if (z) {
                        DateTriple dateTripleNowDate$default = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
                        MenstruationRepo menstruationRepoC3 = CalculationManager.INSTANCE.c();
                        Date date13 = AidKt.toDate(dateTripleNowDate$default);
                        this.a = date;
                        this.b = date12;
                        this.c = date;
                        this.d = 1;
                        lastMenstruation = menstruationRepoC3.getLastMenstruation(date13, this);
                        if (lastMenstruation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        date2 = date;
                        date3 = date2;
                        date4 = date12;
                        list = (List) lastMenstruation;
                        if (!list.isEmpty()) {
                            menstruationRepoC = CalculationManager.INSTANCE.c();
                            date7 = ((MenstruationVo) CollectionsKt.first(list)).getDate();
                            date8 = ((MenstruationVo) CollectionsKt.last(list)).getDate();
                            boolBoxBoolean = Boxing.boxBoolean(true);
                            deleteType = DeleteType.TYPE_MERGE;
                            this.a = date3;
                            this.b = date4;
                            this.c = date2;
                            this.d = 2;
                            if (menstruationRepoC.delete(date7, date8, boolBoxBoolean, null, deleteType, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            date9 = date2;
                            date10 = date4;
                            date11 = date3;
                            date3 = date11;
                            date6 = date10;
                            date5 = date9;
                        } else {
                            date5 = date2;
                            date6 = date4;
                        }
                        menstruationRepoC2 = CalculationManager.INSTANCE.c();
                        this.a = date3;
                        this.b = null;
                        this.c = null;
                        this.d = 3;
                        if (menstruationRepoC2.add(date5, date6, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        MenstruationRepo menstruationRepoC4 = CalculationManager.INSTANCE.c();
                        this.a = date;
                        this.d = 4;
                        if (menstruationRepoC4.add(date, date12, false, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else if (i == 1) {
                Date date14 = (Date) this.c;
                Date date15 = (Date) this.b;
                Date date16 = (Date) this.a;
                ResultKt.throwOnFailure(obj);
                date2 = date14;
                date4 = date15;
                date3 = date16;
                lastMenstruation = obj;
                list = (List) lastMenstruation;
                if (!list.isEmpty()) {
                    menstruationRepoC = CalculationManager.INSTANCE.c();
                    date7 = ((MenstruationVo) CollectionsKt.first(list)).getDate();
                    date8 = ((MenstruationVo) CollectionsKt.last(list)).getDate();
                    boolBoxBoolean = Boxing.boxBoolean(true);
                    deleteType = DeleteType.TYPE_MERGE;
                    this.a = date3;
                    this.b = date4;
                    this.c = date2;
                    this.d = 2;
                    if (menstruationRepoC.delete(date7, date8, boolBoxBoolean, null, deleteType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    date9 = date2;
                    date10 = date4;
                    date11 = date3;
                    date3 = date11;
                    date6 = date10;
                    date5 = date9;
                } else {
                    date5 = date2;
                    date6 = date4;
                }
                menstruationRepoC2 = CalculationManager.INSTANCE.c();
                this.a = date3;
                this.b = null;
                this.c = null;
                this.d = 3;
                if (menstruationRepoC2.add(date5, date6, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                date9 = (Date) this.c;
                date10 = (Date) this.b;
                date11 = (Date) this.a;
                ResultKt.throwOnFailure(obj);
                date3 = date11;
                date6 = date10;
                date5 = date9;
                menstruationRepoC2 = CalculationManager.INSTANCE.c();
                this.a = date3;
                this.b = null;
                this.c = null;
                this.d = 3;
                if (menstruationRepoC2.add(date5, date6, true, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0000H\n"}, d2 = {"", "", "", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]>, Unit> {
        public final /* synthetic */ DateTriple a;
        public final /* synthetic */ List<Pair<Long, Pair<CalendarPeriodStyle, MenstruationVo>>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(DateTriple dateTriple, List<Pair<Long, Pair<CalendarPeriodStyle, MenstruationVo>>> list) {
            super(1);
            this.a = dateTriple;
            this.b = list;
        }

        public final void a(@NotNull Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> entry) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) entry.getKey(), new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
            int i = Integer.parseInt((String) listSplit$default.get(0));
            int i2 = Integer.parseInt((String) listSplit$default.get(1));
            Pair<CalendarPeriodStyle, MenstruationVo>[] value = entry.getValue();
            DateTriple dateTriple = this.a;
            List<Pair<Long, Pair<CalendarPeriodStyle, MenstruationVo>>> list = this.b;
            int i3 = 0;
            for (Pair<CalendarPeriodStyle, MenstruationVo> pair : value) {
                i3++;
                Milli milli = AidKt.toMilli(new DateTriple(i, i2, i3));
                if (milli.getValue() > AidKt.toDate(dateTriple).getTime()) {
                    list.add(TuplesKt.to(Long.valueOf(milli.getValue()), pair));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]> entry) {
            a(entry);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Ref.LongRef longRef) {
            super(0);
            this.a = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getDetailsContent time2:", Long.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Day d;
        public final /* synthetic */ List<MenstruationVo> e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ DateTriple g;
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z, Ref.IntRef intRef, int i, Day day, List<MenstruationVo> list, boolean z2, DateTriple dateTriple, boolean z3) {
            super(0);
            this.a = z;
            this.b = intRef;
            this.c = i;
            this.d = day;
            this.e = list;
            this.f = z2;
            this.g = dateTriple;
            this.h = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isCurrentMenstruation:" + this.a + " value0:" + this.b.element + " value1:" + this.c + " dur:" + this.d + " descMenstruation:" + this.e.size() + " isEnd:" + this.f + " descTime:" + this.g + " isToday:" + this.h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Ref.LongRef longRef) {
            super(0);
            this.a = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getDetailsContent time3:", Long.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {}, l = {464}, m = "getMenstruationByMonth", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CalculationManager.this.getMenstruationByMonth(0, 0, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$incrementIfNeed$1", f = "CalculationManager.kt", i = {0, 0, 0, 1, 1}, l = {124, 129}, m = "invokeSuspend", n = {"styleCatch", "now", "start$iv", "$this$invokeSuspend_u24lambda_u2d1_u24lambda_u2d0", "start$iv"}, s = {"L$1", "L$2", "J$0", "L$3", "J$0"})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public long e;
        public int f;
        public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> g;
        public final /* synthetic */ Integer h;

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
                return Intrinsics.stringPlus("经期自增耗时:", Long.valueOf(this.a));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Boolean bool, int i, int i2, int i3, boolean z) {
                super(0);
                this.a = bool;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "判断经期自增：isEnd:" + this.a + "  over:" + this.b + "  (dur + 1):" + (this.c + 1) + "  fixDur:" + this.d + "  todayIsMenstruation:" + this.e + "  ";
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
                return "不需要经期自增";
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
                return "自增2";
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
                return "不需要经期自增";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Integer num, Continuation<? super n> continuation) {
            super(2, continuation);
            this.g = function2;
            this.h = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0119  */
        /* JADX WARN: Code duplicated, block: B:31:0x011b  */
        /* JADX WARN: Code duplicated, block: B:34:0x0139  */
        /* JADX WARN: Code duplicated, block: B:36:0x0141  */
        /* JADX WARN: Code duplicated, block: B:38:0x014c  */
        /* JADX WARN: Code duplicated, block: B:39:0x014e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:41:0x0152  */
        /* JADX WARN: Code duplicated, block: B:43:0x0155  */
        /* JADX WARN: Code duplicated, block: B:44:0x015b  */
        /* JADX WARN: Code duplicated, block: B:46:0x0163  */
        /* JADX WARN: Code duplicated, block: B:49:0x019d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long jCurrentTimeMillis;
            Object objInvoke;
            Integer num;
            StyleCatch styleCatch;
            Date date;
            List list;
            int iIntValue;
            int value;
            MenstruationVo menstruationVo;
            Object objPredictionDur;
            List list2;
            long j;
            MenstruationVo menstruationVo2;
            boolean zInDur;
            int value2;
            MenstruationVo menstruationVo3;
            Boolean boolBoxBoolean;
            Boolean bool;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.f;
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.e;
                    Date date2 = (Date) this.c;
                    StyleCatch styleCatch2 = (StyleCatch) this.b;
                    Integer num2 = (Integer) this.a;
                    ResultKt.throwOnFailure(obj);
                    num = num2;
                    styleCatch = styleCatch2;
                    date = date2;
                    objInvoke = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.e;
                    menstruationVo2 = (MenstruationVo) this.d;
                    list2 = (List) this.b;
                    date = (Date) this.a;
                    ResultKt.throwOnFailure(obj);
                    objPredictionDur = obj;
                }
                menstruationVo = menstruationVo2;
                list = list2;
                jCurrentTimeMillis = j;
                value = ((Day) objPredictionDur).getValue();
                zInDur = AidKt.inDur(new Milli(date.getTime()), new Duration(menstruationVo.getDate().getTime(), value));
                int i2 = value + 7;
                value2 = AidKt.toDay(new Duration(menstruationVo.getDate().getTime(), date.getTime())).getValue();
                menstruationVo3 = (MenstruationVo) CollectionsKt.lastOrNull(list);
                if (menstruationVo3 == null) {
                    boolBoxBoolean = null;
                } else {
                    boolBoxBoolean = Boxing.boxBoolean(menstruationVo3.isEnd());
                }
                bool = boolBoxBoolean;
                HMLog.info("xys_CalculationManager", new b(boolBoxBoolean, value2, value, i2, zInDur));
                if (zInDur) {
                    HMLog.info("xys_CalculationManager", c.a);
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                    if (value <= value2 || value2 >= i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        CalculationManager.INSTANCE.h(list, date, false);
                    } else if (!list.isEmpty()) {
                        HMLog.info("xys_CalculationManager", e.a);
                    } else {
                        HMLog.info("xys_CalculationManager", e.a);
                    }
                } else if ((!list.isEmpty()) || ((MenstruationVo) CollectionsKt.first(list)).isEnd()) {
                    HMLog.info("xys_CalculationManager", e.a);
                } else {
                    HMLog.info("xys", d.a);
                    CalculationManager.INSTANCE.h(list, AidKt.toDate(new Milli(menstruationVo.getDate().getTime() + AidKt.toMilli(new Day(value - 1)).getValue())), true);
                }
                HMLog.warn$default("xys_CalculationManager", null, new a(System.currentTimeMillis() - jCurrentTimeMillis), 2, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Function2<Date, Continuation<? super List<MenstruationVo>>, Object> function2 = this.g;
            Integer num3 = this.h;
            jCurrentTimeMillis = System.currentTimeMillis();
            StyleCatch overNowStyleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();
            DateHelper dateHelper = DateHelper.INSTANCE;
            Date date3 = AidKt.toDate(DateHelper.nowDate$default(dateHelper, 0L, 1, null));
            Date date4 = AidKt.toDate(DateHelper.nowDate$default(dateHelper, 0L, 1, null));
            this.a = num3;
            this.b = overNowStyleCatch;
            this.c = date3;
            this.e = jCurrentTimeMillis;
            this.f = 1;
            objInvoke = function2.invoke(date4, this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            num = num3;
            styleCatch = overNowStyleCatch;
            date = date3;
            list = (List) objInvoke;
            MenstruationVo menstruationVo4 = (MenstruationVo) CollectionsKt.firstOrNull(list);
            if (menstruationVo4 != null) {
                if (num == null) {
                    FHCalculation.Companion companion = FHCalculation.INSTANCE;
                    if (companion.getBasicInputValue().getEnablePredict()) {
                        CalculationManager calculationManager = CalculationManager.INSTANCE;
                        Calendar calendar = ExtKt.toCalendar(date);
                        this.a = date;
                        this.b = list;
                        this.c = menstruationVo4;
                        this.d = menstruationVo4;
                        this.e = jCurrentTimeMillis;
                        this.f = 2;
                        objPredictionDur = calculationManager.predictionDur(calendar, styleCatch, this);
                        if (objPredictionDur == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        j = jCurrentTimeMillis;
                        menstruationVo2 = menstruationVo4;
                        menstruationVo = menstruationVo2;
                        list = list2;
                        jCurrentTimeMillis = j;
                        value = ((Day) objPredictionDur).getValue();
                        zInDur = AidKt.inDur(new Milli(date.getTime()), new Duration(menstruationVo.getDate().getTime(), value));
                        int i3 = value + 7;
                        value2 = AidKt.toDay(new Duration(menstruationVo.getDate().getTime(), date.getTime())).getValue();
                        menstruationVo3 = (MenstruationVo) CollectionsKt.lastOrNull(list);
                        if (menstruationVo3 == null) {
                            boolBoxBoolean = null;
                        } else {
                            boolBoxBoolean = Boxing.boxBoolean(menstruationVo3.isEnd());
                        }
                        bool = boolBoxBoolean;
                        HMLog.info("xys_CalculationManager", new b(boolBoxBoolean, value2, value, i3, zInDur));
                        if (zInDur) {
                            HMLog.info("xys_CalculationManager", c.a);
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                            if (value <= value2) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                CalculationManager.INSTANCE.h(list, date, false);
                            } else if (!list.isEmpty()) {
                                HMLog.info("xys_CalculationManager", e.a);
                            } else {
                                HMLog.info("xys_CalculationManager", e.a);
                            }
                        } else if (!list.isEmpty()) {
                            HMLog.info("xys_CalculationManager", e.a);
                        } else {
                            HMLog.info("xys_CalculationManager", e.a);
                        }
                    } else {
                        iIntValue = companion.getBasicInputValue().getMenstruationDurationDay();
                    }
                } else {
                    iIntValue = num.intValue();
                }
                value = iIntValue;
                menstruationVo = menstruationVo4;
                zInDur = AidKt.inDur(new Milli(date.getTime()), new Duration(menstruationVo.getDate().getTime(), value));
                int i4 = value + 7;
                value2 = AidKt.toDay(new Duration(menstruationVo.getDate().getTime(), date.getTime())).getValue();
                menstruationVo3 = (MenstruationVo) CollectionsKt.lastOrNull(list);
                if (menstruationVo3 == null) {
                    boolBoxBoolean = null;
                } else {
                    boolBoxBoolean = Boxing.boxBoolean(menstruationVo3.isEnd());
                }
                bool = boolBoxBoolean;
                HMLog.info("xys_CalculationManager", new b(boolBoxBoolean, value2, value, i4, zInDur));
                if (zInDur) {
                    HMLog.info("xys_CalculationManager", c.a);
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                    if (value <= value2) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        CalculationManager.INSTANCE.h(list, date, false);
                    } else if (!list.isEmpty()) {
                        HMLog.info("xys_CalculationManager", e.a);
                    } else {
                        HMLog.info("xys_CalculationManager", e.a);
                    }
                } else if (!list.isEmpty()) {
                    HMLog.info("xys_CalculationManager", e.a);
                } else {
                    HMLog.info("xys_CalculationManager", e.a);
                }
            }
            HMLog.warn$default("xys_CalculationManager", null, new a(System.currentTimeMillis() - jCurrentTimeMillis), 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$init$2", f = "CalculationManager.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<Date, Continuation<? super List<MenstruationVo>>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super o> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((o) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.c, continuation);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) this.b;
                Function2<Date, Continuation<? super List<MenstruationVo>>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(date, this);
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
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionCycle:", Boolean.valueOf(FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {0, 0, 0, 0, 0}, l = {com.baseflow.permissionhandler.m.d}, m = "predictionDur", n = {"this", "now", "styleCatch", "currentIsEnd", "start$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0"})
    public static final class q extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return CalculationManager.this.predictionDur(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionDur:", Boolean.valueOf(FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Day a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Day day) {
            super(0);
            this.a = day;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("predictionDur duration ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(long j, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = j;
            this.b = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "predictionDur spend time " + this.a + " currentIsEnd:" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Ref.ObjectRef<List<HistoryItemBean>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(long j, Ref.ObjectRef<List<HistoryItemBean>> objectRef) {
            super(0);
            this.a = j;
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "predictionDur spend time " + this.a + " list:" + this.b.element.size() + "  " + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {}, l = {StageEnum.APP_RESULT_FOTA_FILE_SYSTEM_NVKEY_SUCCESS, 600}, m = "predictionDurComplete", n = {}, s = {})
    public static final class v extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return CalculationManager.this.predictionDurComplete(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<List<? extends DateTriple>, Unit> {
        public final /* synthetic */ StyleCatch a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(StyleCatch styleCatch) {
            super(1);
            this.a = styleCatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DateTriple> list) {
            invoke2((List<DateTriple>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<DateTriple> list) {
            StyleCatch styleCatch = this.a;
            for (DateTriple dateTriple : list) {
                styleCatch.initMonthOfDayIfNull(dateTriple.getYear(), dateTriple.getMonth());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager$predictionDurComplete$5", f = "CalculationManager.kt", i = {}, l = {592}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<List<? extends Date>, Continuation<? super List<MenstruationVo>>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Continuation<? super x> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((x) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            x xVar = new x(this.c, continuation);
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
                List<? extends Date> list = (List) this.b;
                Function2<List<? extends Date>, Continuation<? super List<MenstruationVo>>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(list, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function1<MenstruationVo, Unit> {
        public final /* synthetic */ StyleCatch a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(StyleCatch styleCatch) {
            super(1);
            this.a = styleCatch;
        }

        public final void a(@NotNull MenstruationVo menstruationVo) {
            this.a.put(ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(menstruationVo.getInPeriod() ? StatusKt.getPeriodStyle() : StatusKt.getNormalStyle(), menstruationVo), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstruationVo menstruationVo) {
            a(menstruationVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.calendar.CalculationManager", f = "CalculationManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {281}, m = "predictionMenstruation", n = {"now", "limit", "styleCatch", "catchPutIntercept", "refresh", "normalDay", "cycle", "dur", "start$iv", "nowResetHour", "start$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "J$1", "J$2"})
    public static final class z extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public long j;
        public long k;
        public long l;
        public /* synthetic */ Object m;
        public int o;

        public z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return CalculationManager.this.predictionMenstruation(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final CalculationManager calculationManager = new CalculationManager();
        INSTANCE = calculationManager;
        predictionDurCarche = new Day(5);
        predictionCycleCarche = new Day(28);
        final Qualifier qualifier = null;
        now = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        menstruationRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MenstruationRepo>() { // from class: com.huami.femalehealth.uilib.widget.calendar.CalculationManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.femalehealth.logiclib.repo.MenstruationRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenstruationRepo invoke() {
                KoinComponent koinComponent = calculationManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MenstruationRepo.class), qualifier, objArr);
            }
        });
    }

    private CalculationManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(DateTriple dateTriple, Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function3, Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function1, BaseCardContentStyle baseCardContentStyle, Continuation<? super Unit> continuation) {
        a aVar;
        Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function4;
        DateTriple dateTriple2;
        Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function5;
        CalculationManager calculationManager;
        BaseCardContentStyle baseCardContentStyle2;
        DateTriple dateTriple3;
        StyleCatch styleCatch;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.j = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.h;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar2.j;
        if (i3 != 0) {
            if (i3 == 1) {
                StyleCatch styleCatch2 = (StyleCatch) aVar2.g;
                dateTriple3 = (DateTriple) aVar2.f;
                BaseCardContentStyle baseCardContentStyle3 = (BaseCardContentStyle) aVar2.e;
                Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function6 = (Function1) aVar2.d;
                Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function7 = (Function2) aVar2.c;
                DateTriple dateTriple4 = (DateTriple) aVar2.b;
                calculationManager = (CalculationManager) aVar2.a;
                ResultKt.throwOnFailure(obj);
                styleCatch = styleCatch2;
                function4 = function6;
                baseCardContentStyle2 = baseCardContentStyle3;
                dateTriple2 = dateTriple4;
                function5 = function7;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DateTriple dateTripleNowDate$default = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
        StyleCatch overNowStyleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();
        b bVar = new b(overNowStyleCatch);
        c cVar = new c(function3, null);
        d dVar = new d(overNowStyleCatch);
        aVar2.a = this;
        aVar2.b = dateTriple;
        aVar2.c = function2;
        function4 = function1;
        aVar2.d = function4;
        aVar2.e = baseCardContentStyle;
        aVar2.f = dateTripleNowDate$default;
        aVar2.g = overNowStyleCatch;
        aVar2.j = 1;
        if (putMonthStyle$default(this, null, bVar, cVar, dVar, aVar2, 1, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        dateTriple2 = dateTriple;
        function5 = function2;
        calculationManager = this;
        baseCardContentStyle2 = baseCardContentStyle;
        dateTriple3 = dateTripleNowDate$default;
        styleCatch = overNowStyleCatch;
        DateHelper dateHelper = DateHelper.INSTANCE;
        DateTriple dateTripleOffsetDay = dateHelper.offsetDay(AidKt.toDay$default(new Milli(Math.abs(AidKt.toMilli(dateTriple3).getValue() - AidKt.toMilli(dateTriple2).getValue())), false, 1, null).getValue() + 101, AidKt.toMilli(new DateTriple(dateTriple2.getYear(), dateTriple2.getMonth(), dateHelper.getMonthOfDay(dateTriple2.getYear(), dateTriple2.getMonth()))).getValue());
        Calendar calendar = ExtKt.toCalendar(dateTriple3);
        e eVar = new e(function5, null);
        f fVar = new f(function4, dateTriple2, styleCatch, baseCardContentStyle2, function5);
        aVar2.a = null;
        aVar2.b = null;
        aVar2.c = null;
        aVar2.d = null;
        aVar2.e = null;
        aVar2.f = null;
        aVar2.g = null;
        aVar2.j = 2;
        if (calculationManager.predictionMenstruation(calendar, dateTripleOffsetDay, styleCatch, eVar, null, fVar, aVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final Date b() {
        return AidKt.toDate(FHCalculation.INSTANCE.getBasicInputValue().getLastMenstruationTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenstruationRepo c() {
        return (MenstruationRepo) menstruationRepo.getValue();
    }

    private final Calendar d(Calendar now2, StyleCatch styleCatch) {
        while (true) {
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = styleCatch.getDayStyle(now2);
            if (!((dayStyle == null ? null : dayStyle.getFirst()) instanceof PeriodStyle)) {
                return now2;
            }
            now2 = ExtKt.toCalendar(DateHelper.INSTANCE.offsetDay(-1, ExtKt.getDayMillis(now2)));
        }
    }

    private final void e(Integer periodDuration, Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> getLastMenstruation) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new n(getLastMenstruation, periodDuration, null), 3, null);
    }

    public static /* synthetic */ void f(CalculationManager calculationManager, Integer num, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        calculationManager.e(num, function2);
    }

    private final Day g(Milli timeMilli) {
        Day day;
        HMLog.info("xys_CalculationManager", p.a);
        FHCalculation.Companion companion = FHCalculation.INSTANCE;
        if (companion.getBasicInputValue().getEnablePredict()) {
            FHCalculation.Prediction prediction = FHCalculation.Prediction.INSTANCE;
            List<HistoryItemBean> preMenstruation2 = FHCalculation.Assist.INSTANCE.getPreMenstruation2(timeMilli, 4);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(preMenstruation2, 10));
            for (HistoryItemBean historyItemBean : preMenstruation2) {
                arrayList.add(new Duration(historyItemBean.getMenstrualPeriod(), historyItemBean.getMenstrualEndTime().longValue()));
            }
            day = prediction.nextMenstruationCycle(arrayList);
        } else {
            day = new Day(companion.getBasicInputValue().getMenstruationCycleDay());
        }
        predictionCycleCarche = day;
        return day;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getMenstruationByMonth$default(CalculationManager calculationManager, int i2, int i3, Function2 function2, Function1 function1, Continuation continuation, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            function1 = null;
        }
        return calculationManager.getMenstruationByMonth(i2, i3, function2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(List<MenstruationVo> list, Date end, boolean isEnd) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new h0(list, isEnd, end, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object putMonthStyle$default(CalculationManager calculationManager, List list, Function1 function1, Function2 function2, Function1 function3, Continuation continuation, int i2, Object obj) {
        List list2;
        if ((i2 & 1) != 0) {
            int iCeil = (int) Math.ceil(5.0f);
            ArrayList arrayList = new ArrayList(iCeil);
            int i3 = 0;
            while (i3 < iCeil) {
                i3++;
                arrayList.add(DateHelper.INSTANCE.preMonth(now.getYear(), now.getMonth(), i3));
            }
            int i4 = 1;
            arrayList.add(new DateTriple(now.getYear(), now.getMonth(), 1));
            while (true) {
                int i5 = i4 + 1;
                arrayList.add(DateHelper.INSTANCE.nextMonth(now.getYear(), now.getMonth(), i4));
                if (i5 > 4) {
                    break;
                }
                i4 = i5;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return calculationManager.putMonthStyle(list2, function1, function2, function3, continuation);
    }

    @Nullable
    public final Object getCardLongContent(@NotNull DateTriple dateTriple, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function3, @NotNull Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(dateTriple, function2, function3, function1, BaseCardContentStyle.INSTANCE.longStyle$uilib_release(), continuation);
        return objA == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object getCardShortContent(@NotNull DateTriple dateTriple, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function3, @NotNull Function1<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(dateTriple, function2, function3, function1, BaseCardContentStyle.INSTANCE.shortStyle$uilib_release(), continuation);
        return objA == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object getCurrentState(@NotNull DateTriple dateTriple, @NotNull StyleCatch styleCatch, @NotNull Continuation<? super CalendarPeriodStyle> continuation) {
        if (!FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()) {
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple));
            if (!((dayStyle == null ? null : dayStyle.getFirst()) instanceof PeriodStyle)) {
                return null;
            }
        }
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = styleCatch.getDayStyle(ExtKt.toCalendar(dateTriple));
        if (dayStyle2 == null) {
            return null;
        }
        return dayStyle2.getFirst();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x031c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x039b  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x03db  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:140:0x0402  */
    /* JADX WARN: Code duplicated, block: B:141:0x0404  */
    /* JADX WARN: Code duplicated, block: B:144:0x040e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0414  */
    /* JADX WARN: Code duplicated, block: B:164:0x0483  */
    /* JADX WARN: Code duplicated, block: B:165:0x0488  */
    /* JADX WARN: Code duplicated, block: B:249:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x014e  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d A[LOOP:2: B:32:0x00ff->B:44:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x020b  */
    /* JADX WARN: Code duplicated, block: B:64:0x022e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0241  */
    /* JADX WARN: Code duplicated, block: B:71:0x0249  */
    /* JADX WARN: Code duplicated, block: B:74:0x026a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0271  */
    /* JADX WARN: Code duplicated, block: B:79:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0297  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ee  */
    @Nullable
    public final Object getDetailsContent(@NotNull DateTriple dateTriple, @NotNull StyleCatch styleCatch, @NotNull BaseCardContentStyle baseCardContentStyle, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Continuation<? super Triple<? extends CalendarPeriodStyle, String, ? extends Object>> continuation) {
        g gVar;
        boolean zAreEqual;
        Pair<CalendarPeriodStyle, MenstruationVo> pair;
        boolean z2;
        int i2;
        Ref.IntRef intRef;
        Object obj;
        Pair<CalendarPeriodStyle, MenstruationVo> pair2;
        List list;
        int i3;
        int i4;
        int iIntValue;
        ArrayList arrayList;
        Ref.IntRef intRef2;
        int i5;
        Ref.IntRef intRef3;
        Object objPredictionDur;
        StyleCatch styleCatch2;
        BaseCardContentStyle baseCardContentStyle2;
        Ref.IntRef intRef4;
        List list2;
        DateTriple dateTriple2;
        boolean z3;
        int iIntValue2;
        Ref.IntRef intRef5;
        Day day;
        int value;
        DateHelper dateHelper;
        MenstruationVo menstruationVo;
        Date date;
        Long lBoxLong;
        long jLongValue;
        MenstruationVo menstruationVo2;
        Date date2;
        Long lBoxLong2;
        long jLongValue2;
        boolean zInDur;
        MenstruationVo menstruationVo3;
        Boolean boolBoxBoolean;
        boolean zBooleanValue;
        BaseCardContentStyle baseCardContentStyle3;
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle;
        CalendarPeriodStyle first;
        String strPeriodWithRemaining;
        int value2;
        String strForecastPeriodWithRemaining;
        DateTriple dateTriple3 = dateTriple;
        StyleCatch styleCatch3 = styleCatch;
        BaseCardContentStyle baseCardContentStyle4 = baseCardContentStyle;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i6 = gVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.k = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objInvoke = gVar.i;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i7 = gVar.k;
        if (i7 != 0) {
            if (i7 == 1) {
                BaseCardContentStyle baseCardContentStyle5 = (BaseCardContentStyle) gVar.b;
                DateTriple dateTriple4 = (DateTriple) gVar.a;
                ResultKt.throwOnFailure(objInvoke);
                baseCardContentStyle4 = baseCardContentStyle5;
                dateTriple3 = dateTriple4;
                list = (List) objInvoke;
                i3 = 0;
                for (Object obj2 : list) {
                    i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    iIntValue = Boxing.boxInt(i3).intValue();
                    if (((MenstruationVo) obj2).getDate().getTime() == AidKt.toDate(dateTriple3).getTime()) {
                        return iIntValue == CollectionsKt__CollectionsKt.getLastIndex(list) ? new Triple(StatusKt.getPeriodStyle(), baseCardContentStyle4.periodFinish(Intrinsics.areEqual(dateTriple3, DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null))), null) : new Triple(StatusKt.getPeriodStyle(), baseCardContentStyle4.periodPos(iIntValue + 1), null);
                    }
                    i3 = i4;
                }
                return new Triple(StatusKt.getNormalStyle(), baseCardContentStyle4.noRecord(), null);
            }
            if (i7 == 2) {
                boolean z4 = gVar.g;
                Ref.IntRef intRef6 = (Ref.IntRef) gVar.e;
                Pair<CalendarPeriodStyle, MenstruationVo> pair3 = (Pair) gVar.d;
                BaseCardContentStyle baseCardContentStyle6 = (BaseCardContentStyle) gVar.c;
                StyleCatch styleCatch4 = (StyleCatch) gVar.b;
                DateTriple dateTriple5 = (DateTriple) gVar.a;
                ResultKt.throwOnFailure(objInvoke);
                obj = objInvoke;
                zAreEqual = z4;
                dateTriple3 = dateTriple5;
                intRef = intRef6;
                styleCatch3 = styleCatch4;
                pair2 = pair3;
                baseCardContentStyle4 = baseCardContentStyle6;
                arrayList = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    Ref.IntRef intRef7 = intRef;
                    if (Boxing.boxBoolean(!DateHelper.INSTANCE.isFeatureDay(((MenstruationVo) obj3).getDate().getTime())).booleanValue()) {
                        arrayList.add(obj3);
                    }
                    intRef = intRef7;
                }
                intRef2 = intRef;
                i5 = 0;
                for (Object obj4 : arrayList) {
                    int i8 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    iIntValue2 = Boxing.boxInt(i5).intValue();
                    if (((MenstruationVo) obj4).getDate().getTime() == AidKt.toDate(dateTriple3).getTime()) {
                        intRef5 = intRef2;
                        intRef5.element = iIntValue2 + 1;
                    } else {
                        intRef5 = intRef2;
                    }
                    intRef2 = intRef5;
                    i5 = i8;
                }
                intRef3 = intRef2;
                CalculationManager calculationManager = INSTANCE;
                Calendar calendar = ExtKt.toCalendar(dateTriple3);
                gVar.a = dateTriple3;
                gVar.b = styleCatch3;
                gVar.c = baseCardContentStyle4;
                gVar.d = pair2;
                gVar.e = intRef3;
                gVar.f = arrayList;
                gVar.g = zAreEqual;
                gVar.k = 3;
                objPredictionDur = calculationManager.predictionDur(calendar, styleCatch3, gVar);
                if (objPredictionDur == coroutine_suspended) {
                    return coroutine_suspended;
                }
                styleCatch2 = styleCatch3;
                baseCardContentStyle2 = baseCardContentStyle4;
                intRef4 = intRef3;
                list2 = arrayList;
                dateTriple2 = dateTriple3;
                z3 = zAreEqual;
                objInvoke = objPredictionDur;
            } else {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = gVar.h;
                    z2 = gVar.g;
                    Pair<CalendarPeriodStyle, MenstruationVo> pair4 = (Pair) gVar.b;
                    BaseCardContentStyle baseCardContentStyle7 = (BaseCardContentStyle) gVar.a;
                    ResultKt.throwOnFailure(objInvoke);
                    pair = pair4;
                    baseCardContentStyle4 = baseCardContentStyle7;
                    value2 = ((Day) objInvoke).getValue() - i2;
                    if (i2 <= 0) {
                        strForecastPeriodWithRemaining = baseCardContentStyle4.forecastPeriodFinish(z2);
                    } else {
                        strForecastPeriodWithRemaining = baseCardContentStyle4.forecastPeriodWithRemaining(value2, i2);
                    }
                    return new Triple(pair.getFirst(), strForecastPeriodWithRemaining, null);
                }
                z3 = gVar.g;
                list2 = (List) gVar.f;
                intRef4 = (Ref.IntRef) gVar.e;
                pair2 = (Pair) gVar.d;
                baseCardContentStyle2 = (BaseCardContentStyle) gVar.c;
                StyleCatch styleCatch5 = (StyleCatch) gVar.b;
                dateTriple2 = (DateTriple) gVar.a;
                ResultKt.throwOnFailure(objInvoke);
                styleCatch2 = styleCatch5;
            }
            day = (Day) objInvoke;
            value = day.getValue() - intRef4.element;
            dateHelper = DateHelper.INSTANCE;
            long time = AidKt.toDate(DateHelper.nowDate$default(dateHelper, 0L, 1, null)).getTime();
            menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull(list2);
            if (menstruationVo != null || (date = menstruationVo.getDate()) == null || (lBoxLong = Boxing.boxLong(date.getTime())) == null) {
                jLongValue = 0;
            } else {
                jLongValue = lBoxLong.longValue();
            }
            menstruationVo2 = (MenstruationVo) CollectionsKt.lastOrNull(list2);
            if (menstruationVo2 != null || (date2 = menstruationVo2.getDate()) == null || (lBoxLong2 = Boxing.boxLong(date2.getTime())) == null) {
                jLongValue2 = 0;
            } else {
                jLongValue2 = lBoxLong2.longValue();
            }
            zInDur = AidKt.inDur(time, new Duration(jLongValue, jLongValue2));
            menstruationVo3 = (MenstruationVo) CollectionsKt.firstOrNull(list2);
            if (menstruationVo3 == null && (boolBoxBoolean = Boxing.boxBoolean(menstruationVo3.isEnd())) != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            } else {
                zBooleanValue = false;
            }
            HMLog.info("xys_CalculationManager", new k(zInDur, intRef4, value, day, list2, zBooleanValue, dateTriple2, z3));
            if (!zInDur && day.getValue() < list2.size()) {
                if (zBooleanValue) {
                    return intRef4.element == list2.size() ? new Triple(StatusKt.getPeriodStyle(), baseCardContentStyle2.periodFinish(true), null) : new Triple(StatusKt.getPeriodStyle(), baseCardContentStyle2.periodPos(intRef4.element), null);
                }
                return new Triple(StatusKt.getPeriodStyle(), baseCardContentStyle2.periodPos(intRef4.element), null);
            }
            baseCardContentStyle3 = baseCardContentStyle2;
            if (zInDur) {
                dayStyle = styleCatch2.getDayStyle(ExtKt.toCalendar(dateHelper.offsetDay(1, AidKt.toMilli(dateTriple2).getValue())));
                if (dayStyle == null) {
                    first = null;
                } else {
                    first = dayStyle.getFirst();
                }
                if (first instanceof PeriodStyle) {
                    strPeriodWithRemaining = baseCardContentStyle3.periodWithRemaining(intRef4.element, list2.size() - intRef4.element);
                } else {
                    strPeriodWithRemaining = baseCardContentStyle3.periodFinish(false);
                }
            } else if (value == 0) {
                if (intRef4.element == day.getValue()) {
                    if (zBooleanValue) {
                        strPeriodWithRemaining = baseCardContentStyle3.periodFinish(z3);
                    } else {
                        strPeriodWithRemaining = baseCardContentStyle3.forecastPeriodFinish(true);
                    }
                } else if (zBooleanValue) {
                    strPeriodWithRemaining = baseCardContentStyle3.periodFinish(false);
                } else {
                    strPeriodWithRemaining = baseCardContentStyle3.periodPos(intRef4.element);
                }
            } else if (zBooleanValue && value > 0) {
                strPeriodWithRemaining = baseCardContentStyle3.periodPosWithForecast(intRef4.element, value);
            } else if (intRef4.element == list2.size()) {
                strPeriodWithRemaining = baseCardContentStyle3.periodFinish(true);
            } else {
                strPeriodWithRemaining = baseCardContentStyle3.periodWithRemaining(intRef4.element, list2.size() - intRef4.element);
            }
            return new Triple(pair2.getFirst(), strPeriodWithRemaining, null);
        }
        ResultKt.throwOnFailure(objInvoke);
        zAreEqual = Intrinsics.areEqual(dateTriple3, DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
        Ref.LongRef longRef = new Ref.LongRef();
        long jCurrentTimeMillis = System.currentTimeMillis();
        FHCalculation.Companion companion = FHCalculation.INSTANCE;
        if (!companion.getBasicInputValue().getEnablePredict()) {
            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = styleCatch3.getDayStyle(ExtKt.toCalendar(dateTriple));
            if ((dayStyle2 == null ? null : dayStyle2.getFirst()) instanceof PeriodStyle) {
                Date date3 = AidKt.toDate(dateTriple);
                gVar.a = dateTriple3;
                gVar.b = baseCardContentStyle4;
                gVar.k = 1;
                objInvoke = function2.invoke(date3, gVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) objInvoke;
                i3 = 0;
                while (r1.hasNext()) {
                    i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    iIntValue = Boxing.boxInt(i3).intValue();
                    if (((MenstruationVo) obj2).getDate().getTime() == AidKt.toDate(dateTriple3).getTime()) {
                        if (iIntValue == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                        }
                    }
                    i3 = i4;
                }
            }
            return new Triple(StatusKt.getNormalStyle(), baseCardContentStyle4.noRecord(), null);
        }
        Unit unit = Unit.INSTANCE;
        longRef.element = System.currentTimeMillis() - jCurrentTimeMillis;
        HMLog.warn$default("xys_CalculationManager", null, new h(longRef), 2, null);
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle3 = styleCatch3.getDayStyle(ExtKt.toCalendar(dateTriple));
        if (dayStyle3 == null) {
            dayStyle3 = TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY());
        }
        pair = dayStyle3;
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        styleCatch3.forEach(new i(dateTriple3, arrayList2));
        if (arrayList2.size() > 1) {
            kotlin.collections.g.sortWith(arrayList2, new Comparator() { // from class: com.huami.femalehealth.uilib.widget.calendar.CalculationManager$getDetailsContent$lambda-23$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Long) ((Pair) t2).getFirst(), (Long) ((Pair) t3).getFirst());
                }
            });
        }
        longRef.element = System.currentTimeMillis() - jCurrentTimeMillis2;
        HMLog.warn$default("xys_CalculationManager", null, new j(longRef), 2, null);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        CalendarPeriodStyle first2 = pair.getFirst();
        if (!(first2 instanceof PeriodStyle)) {
            if (first2 instanceof ForecastStyle) {
                Iterator it2 = arrayList2.iterator();
                int i9 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        int iIntValue3 = Boxing.boxInt(i9).intValue();
                        if (!(((Pair) ((Pair) next).getSecond()).getFirst() instanceof ForecastStyle)) {
                            CalculationManager calculationManager2 = INSTANCE;
                            Calendar calendar2 = ExtKt.toCalendar(dateTriple);
                            gVar.a = baseCardContentStyle4;
                            gVar.b = pair;
                            gVar.g = zAreEqual;
                            gVar.h = iIntValue3;
                            gVar.k = 4;
                            Object objPredictionDur2 = calculationManager2.predictionDur(calendar2, styleCatch3, gVar);
                            if (objPredictionDur2 != coroutine_suspended) {
                                z2 = zAreEqual;
                                objInvoke = objPredictionDur2;
                                i2 = iIntValue3;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        i9 = i10;
                    }
                }
                value2 = ((Day) objInvoke).getValue() - i2;
                if (i2 <= 0) {
                    strForecastPeriodWithRemaining = baseCardContentStyle4.forecastPeriodFinish(z2);
                } else {
                    strForecastPeriodWithRemaining = baseCardContentStyle4.forecastPeriodWithRemaining(value2, i2);
                }
                return new Triple(pair.getFirst(), strForecastPeriodWithRemaining, null);
            }
            if (first2 instanceof OvulationStyle) {
                return new Triple(pair.getFirst(), BaseCardContentStyle.forecastPeriodWithOvulation$default(baseCardContentStyle4, 0, 0, 3, null), null);
            }
            if (first2 instanceof PregnantStyle) {
                int i11 = 0;
                for (Object obj5 : arrayList2) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair5 = (Pair) obj5;
                    int iIntValue4 = Boxing.boxInt(i11).intValue();
                    if (((Pair) pair5.getSecond()).getFirst() instanceof OvulationStyle) {
                        return new Triple(pair.getFirst(), BaseCardContentStyle.forecastPregnantBeforeOvulation$default(baseCardContentStyle4, iIntValue4 + 1, 0, 2, null), null);
                    }
                    int i13 = 0;
                    if (((Pair) pair5.getSecond()).getFirst() instanceof ForecastStyle) {
                        int i14 = iIntValue4 + 1;
                        int i15 = 0;
                        for (Object obj6 : arrayList2) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            int iIntValue5 = Boxing.boxInt(i15).intValue();
                            if (!(((Pair) ((Pair) obj6).getSecond()).getFirst() instanceof PregnantStyle)) {
                                int i17 = 10 - iIntValue5;
                                if (i17 == 10) {
                                    for (Object obj7 : arrayList2) {
                                        int i18 = i13 + 1;
                                        if (i13 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        }
                                        Pair pair6 = (Pair) obj7;
                                        int iIntValue6 = Boxing.boxInt(i13).intValue();
                                        if ((((Pair) pair6.getSecond()).getFirst() instanceof ForecastStyle) || (((Pair) pair6.getSecond()).getFirst() instanceof PeriodStyle)) {
                                            return new Triple(pair.getFirst(), baseCardContentStyle4.pregnantFinish(zAreEqual, iIntValue6 + 1), null);
                                        }
                                        i13 = i18;
                                    }
                                }
                                return new Triple(pair.getFirst(), baseCardContentStyle4.forecastPregnantAfterOvulation(i17, 10, i14), null);
                            }
                            i15 = i16;
                        }
                    }
                    i11 = i12;
                }
            } else {
                int i19 = 0;
                if (first2 instanceof CalendarNormalStyle) {
                    int menstruationCycleDay = companion.getBasicInputValue().getMenstruationCycleDay();
                    for (Object obj8 : arrayList2) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        int iIntValue7 = Boxing.boxInt(Boxing.boxInt(i19).intValue() + 1).intValue();
                        CalendarPeriodStyle calendarPeriodStyle = (CalendarPeriodStyle) ((Pair) ((Pair) obj8).getSecond()).getFirst();
                        if (calendarPeriodStyle instanceof ForecastStyle) {
                            return new Triple(pair.getFirst(), iIntValue7 > menstruationCycleDay ? baseCardContentStyle.noRecord() : baseCardContentStyle4.forecastPeriodStart(iIntValue7), null);
                        }
                        if (calendarPeriodStyle instanceof PregnantStyle) {
                            return new Triple(pair.getFirst(), iIntValue7 > menstruationCycleDay ? baseCardContentStyle.noRecord() : baseCardContentStyle4.forecastPregnantStart(iIntValue7), null);
                        }
                        if (calendarPeriodStyle instanceof PeriodStyle) {
                            return new Triple(pair.getFirst(), iIntValue7 > menstruationCycleDay ? baseCardContentStyle.noRecord() : baseCardContentStyle4.periodStart(iIntValue7), null);
                        }
                        i19 = i20;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
            longRef.element = System.currentTimeMillis() - jCurrentTimeMillis3;
            HMLog.warn$default("xys_CalculationManager", null, new l(longRef), 2, null);
            return new Triple(pair.getFirst(), baseCardContentStyle.noRecord(), null);
        }
        intRef = new Ref.IntRef();
        Date date4 = AidKt.toDate(dateTriple);
        gVar.a = dateTriple3;
        gVar.b = styleCatch3;
        gVar.c = baseCardContentStyle4;
        gVar.d = pair;
        gVar.e = intRef;
        gVar.g = zAreEqual;
        gVar.k = 2;
        Object objInvoke2 = function2.invoke(date4, gVar);
        if (objInvoke2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objInvoke2;
        pair2 = pair;
        arrayList = new ArrayList();
        while (r10.hasNext()) {
            Ref.IntRef intRef8 = intRef;
            if (Boxing.boxBoolean(!DateHelper.INSTANCE.isFeatureDay(((MenstruationVo) obj3).getDate().getTime())).booleanValue()) {
                arrayList.add(obj3);
            }
            intRef = intRef8;
        }
        intRef2 = intRef;
        i5 = 0;
        while (r8.hasNext()) {
            int i21 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            iIntValue2 = Boxing.boxInt(i5).intValue();
            if (((MenstruationVo) obj4).getDate().getTime() == AidKt.toDate(dateTriple3).getTime()) {
                intRef5 = intRef2;
                intRef5.element = iIntValue2 + 1;
            } else {
                intRef5 = intRef2;
            }
            intRef2 = intRef5;
            i5 = i21;
        }
        intRef3 = intRef2;
        CalculationManager calculationManager3 = INSTANCE;
        Calendar calendar3 = ExtKt.toCalendar(dateTriple3);
        gVar.a = dateTriple3;
        gVar.b = styleCatch3;
        gVar.c = baseCardContentStyle4;
        gVar.d = pair2;
        gVar.e = intRef3;
        gVar.f = arrayList;
        gVar.g = zAreEqual;
        gVar.k = 3;
        objPredictionDur = calculationManager3.predictionDur(calendar3, styleCatch3, gVar);
        if (objPredictionDur == coroutine_suspended) {
            return coroutine_suspended;
        }
        styleCatch2 = styleCatch3;
        baseCardContentStyle2 = baseCardContentStyle4;
        intRef4 = intRef3;
        list2 = arrayList;
        dateTriple2 = dateTriple3;
        z3 = zAreEqual;
        objInvoke = objPredictionDur;
        day = (Day) objInvoke;
        value = day.getValue() - intRef4.element;
        dateHelper = DateHelper.INSTANCE;
        long time2 = AidKt.toDate(DateHelper.nowDate$default(dateHelper, 0L, 1, null)).getTime();
        menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull(list2);
        if (menstruationVo != null) {
            jLongValue = 0;
        } else {
            jLongValue = lBoxLong.longValue();
        }
        menstruationVo2 = (MenstruationVo) CollectionsKt.lastOrNull(list2);
        if (menstruationVo2 != null) {
            jLongValue2 = 0;
        } else {
            jLongValue2 = lBoxLong2.longValue();
        }
        zInDur = AidKt.inDur(time2, new Duration(jLongValue, jLongValue2));
        menstruationVo3 = (MenstruationVo) CollectionsKt.firstOrNull(list2);
        if (menstruationVo3 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolBoxBoolean.booleanValue();
        }
        HMLog.info("xys_CalculationManager", new k(zInDur, intRef4, value, day, list2, zBooleanValue, dateTriple2, z3));
        if (!zInDur) {
        }
        baseCardContentStyle3 = baseCardContentStyle2;
        if (zInDur) {
            dayStyle = styleCatch2.getDayStyle(ExtKt.toCalendar(dateHelper.offsetDay(1, AidKt.toMilli(dateTriple2).getValue())));
            if (dayStyle == null) {
                first = null;
            } else {
                first = dayStyle.getFirst();
            }
            if (first instanceof PeriodStyle) {
                strPeriodWithRemaining = baseCardContentStyle3.periodFinish(false);
            } else {
                strPeriodWithRemaining = baseCardContentStyle3.periodWithRemaining(intRef4.element, list2.size() - intRef4.element);
            }
        } else if (value == 0) {
            if (intRef4.element == day.getValue()) {
                if (zBooleanValue) {
                    strPeriodWithRemaining = baseCardContentStyle3.periodFinish(z3);
                } else {
                    strPeriodWithRemaining = baseCardContentStyle3.forecastPeriodFinish(true);
                }
            } else if (zBooleanValue) {
                strPeriodWithRemaining = baseCardContentStyle3.periodFinish(false);
            } else {
                strPeriodWithRemaining = baseCardContentStyle3.periodPos(intRef4.element);
            }
        } else if (zBooleanValue) {
            if (intRef4.element == list2.size()) {
                strPeriodWithRemaining = baseCardContentStyle3.periodFinish(true);
            } else {
                strPeriodWithRemaining = baseCardContentStyle3.periodWithRemaining(intRef4.element, list2.size() - intRef4.element);
            }
        } else if (intRef4.element == list2.size()) {
            strPeriodWithRemaining = baseCardContentStyle3.periodFinish(true);
        } else {
            strPeriodWithRemaining = baseCardContentStyle3.periodWithRemaining(intRef4.element, list2.size() - intRef4.element);
        }
        return new Triple(pair2.getFirst(), strPeriodWithRemaining, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMenstruationByMonth(int i2, int i3, @NotNull Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @Nullable Function1<? super List<MenstruationVo>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i4 = mVar.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mVar.d = i4 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objInvoke = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = mVar.d;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            int monthOfDay = DateHelper.INSTANCE.getMonthOfDay(i2, i3);
            ArrayList arrayList = new ArrayList(monthOfDay);
            for (int i6 = 0; i6 < monthOfDay; i6++) {
                arrayList.add(AidKt.toDate(new DateTriple(i2, i3, Boxing.boxInt(i6).intValue() + 1)));
            }
            mVar.a = function1;
            mVar.d = 1;
            objInvoke = function2.invoke(arrayList, mVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) mVar.a;
            ResultKt.throwOnFailure(objInvoke);
        }
        List list = (List) objInvoke;
        if (function1 != null) {
            function1.invoke(list);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final Day getPredictionCycleCarche() {
        return predictionCycleCarche;
    }

    @NotNull
    public final Day getPredictionDurCarche() {
        return predictionDurCarche;
    }

    @Nullable
    public final Object init(@NotNull BasicInputValue basicInputValue, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        now = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
        initBasicInputValue(basicInputValue);
        f(this, null, new o(function2, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void initBasicInputValue(@NotNull BasicInputValue basicInputValue) {
        FHCalculation.INSTANCE.setBasicInputValue(basicInputValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.List] */
    @Nullable
    public final Object predictionDur(@NotNull Calendar calendar, @NotNull StyleCatch styleCatch, @NotNull Continuation<? super Day> continuation) {
        q qVar;
        Day day;
        CalculationManager calculationManager;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Calendar calendar2;
        StyleCatch styleCatch2;
        long j2;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.i = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object obj = qVar.g;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = qVar.i;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("xys_CalculationManager", r.a);
            FHCalculation.Companion companion = FHCalculation.INSTANCE;
            if (companion.getBasicInputValue().getEnablePredict()) {
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                long jCurrentTimeMillis = System.currentTimeMillis();
                MenstruationRepo menstruationRepoC = INSTANCE.c();
                Date date = ExtKt.toDate(calendar);
                qVar.a = this;
                qVar.b = calendar;
                qVar.c = styleCatch;
                qVar.d = booleanRef3;
                qVar.e = booleanRef3;
                qVar.f = jCurrentTimeMillis;
                qVar.i = 1;
                Object lastMenstruation2 = menstruationRepoC.getLastMenstruation2(date, qVar);
                if (lastMenstruation2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef3;
                booleanRef2 = booleanRef;
                obj = lastMenstruation2;
                calculationManager = this;
                calendar2 = calendar;
                styleCatch2 = styleCatch;
                j2 = jCurrentTimeMillis;
            } else {
                day = new Day(companion.getBasicInputValue().getMenstruationDurationDay());
                calculationManager = this;
            }
            calculationManager.setPredictionDurCarche(day);
            HMLog.info("xys_CalculationManager", new s(day));
            return day;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = qVar.f;
        booleanRef = (Ref.BooleanRef) qVar.e;
        booleanRef2 = (Ref.BooleanRef) qVar.d;
        styleCatch2 = (StyleCatch) qVar.c;
        calendar2 = (Calendar) qVar.b;
        calculationManager = (CalculationManager) qVar.a;
        ResultKt.throwOnFailure(obj);
        HistoryItemBean historyItemBean = (HistoryItemBean) obj;
        booleanRef.element = historyItemBean != null && historyItemBean.getEnd() == 1;
        HMLog.info("xys_CalculationManager", new t(System.currentTimeMillis() - j2, booleanRef2));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        objectRef.element = FHCalculation.Assist.INSTANCE.getPreMenstruation2(new Milli(booleanRef2.element ? ExtKt.getDayMillis(calendar2) : ExtKt.getDayMillis(INSTANCE.d(calendar2, styleCatch2))), 3);
        HMLog.info("xys_CalculationManager", new u(System.currentTimeMillis() - jCurrentTimeMillis2, objectRef));
        if (((List) objectRef.element).size() < 3) {
            day = new Day(FHCalculation.INSTANCE.getBasicInputValue().getMenstruationDurationDay());
        } else {
            FHCalculation.Prediction prediction = FHCalculation.Prediction.INSTANCE;
            List<HistoryItemBean> listTake = CollectionsKt___CollectionsKt.take((Iterable) objectRef.element, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
            for (HistoryItemBean historyItemBean2 : listTake) {
                arrayList.add(new Duration(historyItemBean2.getMenstrualPeriod(), historyItemBean2.getMenstrualEndTime().longValue()));
            }
            day = prediction.menstruationDuration(arrayList);
        }
        calculationManager.setPredictionDurCarche(day);
        HMLog.info("xys_CalculationManager", new s(day));
        return day;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object predictionDurComplete(@NotNull DateTriple dateTriple, @NotNull Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function3, @NotNull Continuation<? super Day> continuation) {
        v vVar;
        DateTriple dateTriple2;
        CalculationManager calculationManager;
        StyleCatch styleCatch;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.f = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        v vVar2 = vVar;
        Object objPredictionDur = vVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = vVar2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                styleCatch = (StyleCatch) vVar2.c;
                DateTriple dateTriple3 = (DateTriple) vVar2.b;
                calculationManager = (CalculationManager) vVar2.a;
                ResultKt.throwOnFailure(objPredictionDur);
                dateTriple2 = dateTriple3;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPredictionDur);
            }
        }
        ResultKt.throwOnFailure(objPredictionDur);
        StyleCatch overNowStyleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();
        int iCeil = (int) Math.ceil(5.0f);
        ArrayList arrayList = new ArrayList(iCeil);
        for (int i4 = 0; i4 < iCeil; i4++) {
            arrayList.add(DateHelper.INSTANCE.preMonth(dateTriple.getYear(), dateTriple.getMonth(), Boxing.boxInt(i4).intValue() + 1));
        }
        arrayList.add(new DateTriple(dateTriple.getYear(), dateTriple.getMonth(), 1));
        arrayList.add(DateHelper.nextMonth$default(DateHelper.INSTANCE, dateTriple.getYear(), dateTriple.getMonth(), 0, 4, null));
        Unit unit = Unit.INSTANCE;
        w wVar = new w(overNowStyleCatch);
        x xVar = new x(function2, null);
        y yVar = new y(overNowStyleCatch);
        vVar2.a = this;
        dateTriple2 = dateTriple;
        vVar2.b = dateTriple2;
        vVar2.c = overNowStyleCatch;
        vVar2.f = 1;
        if (putMonthStyle(arrayList, wVar, xVar, yVar, vVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        calculationManager = this;
        styleCatch = overNowStyleCatch;
        Calendar calendar = ExtKt.toCalendar(dateTriple2);
        vVar2.a = null;
        vVar2.b = null;
        vVar2.c = null;
        vVar2.f = 2;
        objPredictionDur = calculationManager.predictionDur(calendar, styleCatch, vVar2);
        return objPredictionDur == coroutine_suspended ? coroutine_suspended : objPredictionDur;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x045c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0471 A[LOOP:5: B:130:0x03f4->B:152:0x0471, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x062c A[LOOP:1: B:57:0x0246->B:235:0x062c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x0655 A[EDGE_INSN: B:245:0x0655->B:237:0x0655 BREAK  A[LOOP:1: B:57:0x0246->B:235:0x062c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0484 A[EDGE_INSN: B:252:0x0484->B:154:0x0484 BREAK  A[LOOP:5: B:130:0x03f4->B:152:0x0471], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, java.util.Date] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.huami.femalehealth.logiclib.calculation.Day] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Nullable
    public final Object predictionMenstruation(@NotNull Calendar calendar, @NotNull DateTriple dateTriple, @NotNull StyleCatch styleCatch, @NotNull Function2<? super Date, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @Nullable Function1<? super CalendarPeriodStyle, Boolean> function1, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        z zVar;
        long jCurrentTimeMillis;
        Calendar calendarD;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        long j2;
        T t2;
        StyleCatch styleCatch2;
        DateTriple dateTriple2;
        Function0<Unit> function3;
        long j3;
        Function1<? super CalendarPeriodStyle, Boolean> function4;
        Ref.ObjectRef objectRef3;
        Date date;
        T tB;
        String str;
        DateTriple dateTriple3;
        boolean z2;
        Ref.ObjectRef objectRef4;
        ArrayList arrayList;
        Date date2;
        Calendar calendar2;
        Long lBoxLong;
        Boolean boolInvoke;
        Boolean boolInvoke2;
        Boolean boolInvoke3;
        Date date3;
        Long lBoxLong2;
        Calendar calendar3;
        Long lBoxLong3;
        MenstruationVo second;
        FHCalculation.Reality reality;
        ?? date4;
        Date date5;
        Boolean boolInvoke4;
        Boolean boolInvoke5;
        Boolean boolInvoke6;
        Boolean boolInvoke7;
        Calendar calendar4 = calendar;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i2 = zVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.o = i2 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object obj = zVar.m;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = zVar.o;
        String str2 = "xys";
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            long jResetHour = DateHelper.INSTANCE.resetHour(ExtKt.getDayMillis(calendar));
            CalculationManager calculationManager = INSTANCE;
            calendarD = calculationManager.d(calendar4, styleCatch);
            objectRef = new Ref.ObjectRef();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            objectRef.element = calculationManager.g(new Milli(System.currentTimeMillis()));
            HMLog.warn$default("xys", null, new b0(System.currentTimeMillis() - jCurrentTimeMillis2), 2, null);
            objectRef2 = new Ref.ObjectRef();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            zVar.a = calendar4;
            zVar.b = dateTriple;
            zVar.c = styleCatch;
            zVar.d = function1;
            zVar.e = function0;
            zVar.f = calendarD;
            zVar.g = objectRef;
            zVar.h = objectRef2;
            zVar.i = objectRef2;
            zVar.j = jCurrentTimeMillis;
            zVar.k = jResetHour;
            zVar.l = jCurrentTimeMillis3;
            j2 = jCurrentTimeMillis3;
            zVar.o = 1;
            Object objPredictionDur = calculationManager.predictionDur(calendar4, styleCatch, zVar);
            if (objPredictionDur == coroutine_suspended) {
                return coroutine_suspended;
            }
            t2 = objPredictionDur;
            styleCatch2 = styleCatch;
            dateTriple2 = dateTriple;
            function3 = function0;
            j3 = jResetHour;
            function4 = function1;
            objectRef3 = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = zVar.l;
            j3 = zVar.k;
            jCurrentTimeMillis = zVar.j;
            objectRef2 = (Ref.ObjectRef) zVar.i;
            objectRef3 = (Ref.ObjectRef) zVar.h;
            objectRef = (Ref.ObjectRef) zVar.g;
            calendarD = (Calendar) zVar.f;
            function3 = (Function0) zVar.e;
            function4 = (Function1) zVar.d;
            StyleCatch styleCatch3 = (StyleCatch) zVar.c;
            dateTriple2 = (DateTriple) zVar.b;
            Calendar calendar5 = (Calendar) zVar.a;
            ResultKt.throwOnFailure(obj);
            j2 = j4;
            styleCatch2 = styleCatch3;
            calendar4 = calendar5;
            t2 = obj;
        }
        objectRef2.element = t2;
        HMLog.warn$default("xys", null, new c0(System.currentTimeMillis() - j2), 2, null);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        long j5 = jCurrentTimeMillis;
        INSTANCE.e(Boxing.boxInt(((Day) objectRef3.element).getValue()), new f0(null));
        HMLog.warn$default("xys", null, new d0(System.currentTimeMillis() - jCurrentTimeMillis4), 2, null);
        FHCalculation.Assist assist = FHCalculation.Assist.INSTANCE;
        List listEmptyList = (List) CollectionsKt.firstOrNull((List) assist.getPreMenstruation(new Milli(ExtKt.getDayMillis(calendarD)), 1));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        List listEmptyList2 = (List) CollectionsKt.firstOrNull((List) assist.getPreMenstruation(new Milli(j3), 1));
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listEmptyList2) {
            if (Boxing.boxBoolean(((MenstruationVo) obj2).getDate().getTime() <= ExtKt.toDate(calendar4).getTime()).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        MenstruationVo menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull(list);
        if (menstruationVo == null) {
            tB = 0;
        } else {
            date = menstruationVo.getDate();
        }
        if (tB == 0) {
            tB = date;
            tB = INSTANCE.b();
        }
        tB = date;
        objectRef5.element = tB;
        MenstruationVo menstruationVo2 = (MenstruationVo) CollectionsKt.firstOrNull((List) arrayList2);
        Date date6 = menstruationVo2 == null ? null : menstruationVo2.getDate();
        if (date6 == null) {
            date6 = INSTANCE.b();
        }
        MenstruationVo menstruationVo3 = (MenstruationVo) CollectionsKt.lastOrNull((List) arrayList2);
        Date date7 = menstruationVo3 == null ? null : menstruationVo3.getDate();
        if (date7 == null) {
            date7 = INSTANCE.b();
        }
        boolean zInDur = arrayList2.isEmpty() ? false : AidKt.inDur(new Milli(ExtKt.getDayMillis(calendar4)), new Duration(((MenstruationVo) CollectionsKt.first((List) arrayList2)).getDate().getTime(), ((MenstruationVo) CollectionsKt.last((List) arrayList2)).getDate().getTime()));
        HMLog.warn$default("xys_CalculationManager", null, new e0(calendarD, objectRef3, objectRef, list, arrayList2, zInDur, dateTriple2, objectRef5), 2, null);
        while (true) {
            Ref.ObjectRef objectRef6 = objectRef5;
            if (AidKt.toMilli(dateTriple2).getValue() <= ((Date) objectRef6.element).getTime()) {
                str = str2;
                break;
            }
            if (zInDur) {
                int value = ((Day) objectRef3.element).getValue() - arrayList2.size();
                if (value <= 0) {
                    styleCatch2 = styleCatch2;
                    dateTriple3 = dateTriple2;
                    z2 = zInDur;
                } else {
                    MenstruationVo menstruationVo4 = (MenstruationVo) CollectionsKt.lastOrNull((List) arrayList2);
                    if (!((menstruationVo4 == null || menstruationVo4.isEnd()) ? false : true) || 1 > value) {
                        styleCatch2 = styleCatch2;
                        dateTriple3 = dateTriple2;
                        z2 = zInDur;
                    } else {
                        int i4 = 1;
                        while (true) {
                            int i5 = i4 + 1;
                            dateTriple3 = dateTriple2;
                            z2 = zInDur;
                            styleCatch2.put(ExtKt.toCalendar(DateHelper.INSTANCE.offsetDay(i4, date7.getTime())), TuplesKt.to(StatusKt.getForecastStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke7 = function4.invoke(StatusKt.getForecastStyle())) == null) ? true : boolInvoke7.booleanValue());
                            if (i4 == value) {
                                break;
                            }
                            styleCatch2 = styleCatch2;
                            i4 = i5;
                            dateTriple2 = dateTriple3;
                            zInDur = z2;
                        }
                    }
                }
                int value2 = ((Day) objectRef3.element).getValue();
                if (value2 > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        date5 = date7;
                        styleCatch2.put(ExtKt.toCalendar(new Milli(date6.getTime() + AidKt.toMilli((Day) objectRef.element).getValue()), i6), TuplesKt.to(StatusKt.getForecastStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke6 = function4.invoke(StatusKt.getForecastStyle())) == null) ? false : boolInvoke6.booleanValue());
                        if (i7 >= value2) {
                            break;
                        }
                        i6 = i7;
                        date7 = date5;
                    }
                } else {
                    date5 = date7;
                }
                int value3 = ((Day) objectRef.element).getValue();
                if (12 <= value3 && value3 <= 60) {
                    Iterator<T> it2 = AidKt.toList(FHCalculation.Prediction.INSTANCE.pregnantDate(new Milli(date6.getTime()), (Day) objectRef.element)).iterator();
                    while (it2.hasNext()) {
                        styleCatch2.put(ExtKt.toCalendar$default((Milli) it2.next(), 0, 1, null), TuplesKt.to(StatusKt.getPregnantStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke5 = function4.invoke(StatusKt.getPregnantStyle())) == null) ? false : boolInvoke5.booleanValue());
                    }
                    styleCatch2.put(ExtKt.toCalendar$default(FHCalculation.Prediction.INSTANCE.ovulationDate(new Milli(date6.getTime()), (Day) objectRef.element), 0, 1, null), TuplesKt.to(StatusKt.getOvulationStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke4 = function4.invoke(StatusKt.getOvulationStyle())) == null) ? false : boolInvoke4.booleanValue());
                }
                arrayList = arrayList2;
                date2 = date5;
                str = str2;
            } else {
                styleCatch2 = styleCatch2;
                dateTriple3 = dateTriple2;
                z2 = zInDur;
                Date date8 = date7;
                ArrayList<Triple> arrayList3 = new ArrayList();
                int value4 = ((Day) objectRef3.element).getValue();
                if (value4 > 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = i8 + 1;
                        date2 = date8;
                        Calendar calendar6 = ExtKt.toCalendar(new Milli(((Date) objectRef6.element).getTime()), i8);
                        str = str2;
                        objectRef4 = objectRef6;
                        arrayList = arrayList2;
                        if (AidKt.inDur(ExtKt.getDayMillis(calendar4), new Duration(((Date) objectRef6.element).getTime(), ((Day) objectRef3.element).getValue()))) {
                            Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = styleCatch2.getDayStyle(calendar4);
                            if ((dayStyle == null ? null : dayStyle.getFirst()) instanceof PeriodStyle) {
                                arrayList3.add(new Triple(calendar6, StatusKt.getForecastStyle(), MenstruationVo.INSTANCE.getEMPTY()));
                                if (i9 >= value4) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                                date8 = date2;
                                str2 = str;
                                arrayList2 = arrayList;
                                objectRef6 = objectRef4;
                            } else {
                                Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = styleCatch2.getDayStyle(calendar4);
                                if ((dayStyle2 == null || (second = dayStyle2.getSecond()) == null || !second.isEnd()) ? false : true) {
                                    break;
                                }
                                arrayList3.add(new Triple(calendar6, StatusKt.getForecastStyle(), MenstruationVo.INSTANCE.getEMPTY()));
                                if (i9 >= value4) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                                date8 = date2;
                                str2 = str;
                                arrayList2 = arrayList;
                                objectRef6 = objectRef4;
                            }
                        } else {
                            arrayList3.add(new Triple(calendar6, StatusKt.getForecastStyle(), MenstruationVo.INSTANCE.getEMPTY()));
                            if (i9 >= value4) {
                                break;
                            }
                            i8 = i9;
                            date8 = date2;
                            str2 = str;
                            arrayList2 = arrayList;
                            objectRef6 = objectRef4;
                        }
                    }
                } else {
                    objectRef4 = objectRef6;
                    arrayList = arrayList2;
                    date2 = date8;
                    str = str2;
                }
                Triple triple = (Triple) CollectionsKt.firstOrNull((List) arrayList3);
                long jLongValue = 0;
                long jLongValue2 = (triple == null || (calendar2 = (Calendar) triple.getFirst()) == null || (lBoxLong = Boxing.boxLong(ExtKt.getDayMillis(calendar2))) == null) ? 0L : lBoxLong.longValue();
                Triple triple2 = (Triple) CollectionsKt.lastOrNull((List) arrayList3);
                if (triple2 != null && (calendar3 = (Calendar) triple2.getFirst()) != null && (lBoxLong3 = Boxing.boxLong(ExtKt.getDayMillis(calendar3))) != null) {
                    jLongValue = lBoxLong3.longValue();
                }
                Duration duration = new Duration(jLongValue2, jLongValue);
                MenstruationVo menstruationVo5 = (MenstruationVo) CollectionsKt.firstOrNull((List) arrayList);
                if (menstruationVo5 != null && menstruationVo5.isEnd()) {
                    MenstruationVo menstruationVo6 = (MenstruationVo) CollectionsKt.lastOrNull((List) arrayList);
                    long jLongValue3 = -1;
                    if (menstruationVo6 != null && (date3 = menstruationVo6.getDate()) != null && (lBoxLong2 = Boxing.boxLong(date3.getTime())) != null) {
                        jLongValue3 = lBoxLong2.longValue();
                    }
                    if (AidKt.inDur(jLongValue3, duration)) {
                        arrayList3.clear();
                    }
                }
                for (Triple triple3 : arrayList3) {
                    styleCatch2.put((Calendar) triple3.getFirst(), TuplesKt.to(triple3.getSecond(), triple3.getThird()), (function4 == null || (boolInvoke3 = function4.invoke(triple3.getSecond())) == null) ? false : boolInvoke3.booleanValue());
                }
                int value5 = ((Day) objectRef.element).getValue();
                if (12 <= value5 && value5 <= 60) {
                    objectRef6 = objectRef4;
                    Iterator<T> it3 = AidKt.toList(FHCalculation.Prediction.INSTANCE.pregnantDate(new Milli(((Date) objectRef6.element).getTime()), (Day) objectRef.element)).iterator();
                    while (it3.hasNext()) {
                        styleCatch2.put(ExtKt.toCalendar$default((Milli) it3.next(), 0, 1, null), TuplesKt.to(StatusKt.getPregnantStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke2 = function4.invoke(StatusKt.getPregnantStyle())) == null) ? false : boolInvoke2.booleanValue());
                    }
                    styleCatch2.put(ExtKt.toCalendar$default(FHCalculation.Prediction.INSTANCE.ovulationDate(new Milli(((Date) objectRef6.element).getTime()), (Day) objectRef.element), 0, 1, null), TuplesKt.to(StatusKt.getOvulationStyle(), MenstruationVo.INSTANCE.getEMPTY()), (function4 == null || (boolInvoke = function4.invoke(StatusKt.getOvulationStyle())) == null) ? false : boolInvoke.booleanValue());
                } else {
                    objectRef6 = objectRef4;
                }
                reality = FHCalculation.Reality.INSTANCE;
                date4 = AidKt.toDate(reality.nextMenstruationStartTime(new Milli(((Date) objectRef6.element).getTime()), (Day) objectRef.element));
                if (((Date) objectRef6.element).getTime() == date4.getTime()) {
                    break;
                }
                objectRef6.element = date4;
                date6 = AidKt.toDate(reality.nextMenstruationStartTime(new Milli(date6.getTime()), (Day) objectRef.element));
                objectRef5 = objectRef6;
                styleCatch2 = styleCatch2;
                dateTriple2 = dateTriple3;
                zInDur = z2;
                date7 = date2;
                str2 = str;
                arrayList2 = arrayList;
            }
            reality = FHCalculation.Reality.INSTANCE;
            date4 = AidKt.toDate(reality.nextMenstruationStartTime(new Milli(((Date) objectRef6.element).getTime()), (Day) objectRef.element));
            if (((Date) objectRef6.element).getTime() == date4.getTime()) {
                break;
                break;
            }
            objectRef6.element = date4;
            date6 = AidKt.toDate(reality.nextMenstruationStartTime(new Milli(date6.getTime()), (Day) objectRef.element));
            objectRef5 = objectRef6;
            styleCatch2 = styleCatch2;
            dateTriple2 = dateTriple3;
            zInDur = z2;
            date7 = date2;
            str2 = str;
            arrayList2 = arrayList;
        }
        function3.invoke();
        HMLog.warn$default(str, null, new a0(System.currentTimeMillis() - j5), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object putMonthStyle(@NotNull List<DateTriple> list, @Nullable Function1<? super List<DateTriple>, Unit> function1, @NotNull Function2<? super List<? extends Date>, ? super Continuation<? super List<MenstruationVo>>, ? extends Object> function2, @NotNull Function1<? super MenstruationVo, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        g0 g0Var;
        if (continuation instanceof g0) {
            g0Var = (g0) continuation;
            int i2 = g0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(continuation);
            }
        } else {
            g0Var = new g0(continuation);
        }
        Object objInvoke = g0Var.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = g0Var.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (function1 != null) {
                function1.invoke(CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toSet(list)));
            }
            ArrayList arrayList = new ArrayList();
            for (DateTriple dateTriple : list) {
                int monthOfDay = DateHelper.INSTANCE.getMonthOfDay(dateTriple.getYear(), dateTriple.getMonth());
                ArrayList arrayList2 = new ArrayList(monthOfDay);
                for (int i4 = 0; i4 < monthOfDay; i4++) {
                    arrayList2.add(AidKt.toDate(new DateTriple(dateTriple.getYear(), dateTriple.getMonth(), Boxing.boxInt(i4).intValue() + 1)));
                }
                arrayList.addAll(arrayList2);
            }
            g0Var.a = function3;
            g0Var.d = 1;
            objInvoke = function2.invoke(arrayList, g0Var);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function3 = (Function1) g0Var.a;
            ResultKt.throwOnFailure(objInvoke);
        }
        Iterator it2 = ((Iterable) objInvoke).iterator();
        while (it2.hasNext()) {
            function3.invoke((MenstruationVo) it2.next());
        }
        return Unit.INSTANCE;
    }

    public final void setPredictionCycleCarche(@NotNull Day day) {
        predictionCycleCarche = day;
    }

    public final void setPredictionDurCarche(@NotNull Day day) {
        predictionDurCarche = day;
    }
}
