package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.ftp.ChartDataEntity;
import com.xiaomi.fitness.sport_eco.ftp.ChartViewProperty;
import com.xiaomi.fitness.sport_eco.ftp.CourseSportState;
import com.xiaomi.fitness.sport_eco.ftp.FtpActivityState;
import com.xiaomi.fitness.sport_eco.ftp.FtpChartType;
import com.xiaomi.fitness.sport_eco.ftp.FtpDeviceState;
import com.xiaomi.fitness.sport_eco.ftp.StopWatch;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.eu6;
import defpackage.j7r;
import defpackage.oe4;
import defpackage.tr9;
import defpackage.y7r;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Ì\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ì\u0001B\n\b\u0007¢\u0006\u0005\bË\u0001\u0010\u0010J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J1\u0010(\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010%J!\u0010+\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010%J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0010J/\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0010J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0010J!\u00107\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH\u0014¢\u0006\u0004\bA\u0010\u0010J\u0015\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u000b¢\u0006\u0004\bC\u0010\u000eJ\u001d\u0010F\u001a\u00020\b2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bI\u0010JJ\u0019\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0K¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\b¢\u0006\u0004\bP\u0010\u0010J\u0015\u0010Q\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bQ\u0010RJ\u001d\u0010S\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bU\u0010TJ\u001d\u0010V\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bV\u0010TJ\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\u0010J\r\u0010X\u001a\u00020\u0015¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u0015¢\u0006\u0004\b[\u0010\\J!\u0010`\u001a\u00020\b2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0]¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u0015¢\u0006\u0004\bb\u0010YJ\u001d\u0010d\u001a\u00020\b2\u0006\u0010c\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u0004\u0018\u00010!¢\u0006\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00060o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR!\u0010x\u001a\b\u0012\u0004\u0012\u00020s0r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020!0r8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010wR#\u0010|\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010g\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0081\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0081\u0001\u0010Y\"\u0005\b\u0083\u0001\u0010\\R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0089\u0001\u001a\u0013\u0012\u000f\u0012\r \u0088\u0001*\u0005\u0018\u00010\u0087\u00010\u0087\u00010r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR$\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u008a\u00018\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0082\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R0\u0010\u0094\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0094\u0001\u0010z\u001a\u0005\b\u0095\u0001\u0010w\"\u0006\b\u0096\u0001\u0010\u0097\u0001R.\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0099\u0001\u0010z\u001a\u0005\b\u009a\u0001\u0010w\"\u0006\b\u009b\u0001\u0010\u0097\u0001R.\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u009d\u0001\u0010z\u001a\u0005\b\u009e\u0001\u0010w\"\u0006\b\u009f\u0001\u0010\u0097\u0001R/\u0010 \u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b \u0001\u0010z\u001a\u0005\b¡\u0001\u0010w\"\u0006\b¢\u0001\u0010\u0097\u0001R \u0010¦\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010u\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010c\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010}R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0082\u0001R(\u0010©\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b©\u0001\u0010§\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0005\b¬\u0001\u0010\u000eR)\u0010\u00ad\u0001\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u00ad\u0001\u0010}\u001a\u0005\b®\u0001\u0010g\"\u0006\b¯\u0001\u0010\u0080\u0001R'\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R \u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b³\u0001\u0010u\u001a\u0006\b´\u0001\u0010µ\u0001R*\u0010·\u0001\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010@R'\u0010-\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b-\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R#\u0010Â\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Á\u00010r8\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010z\u001a\u0005\bÃ\u0001\u0010wR\u001a\u0010Ç\u0001\u001a\u0005\u0018\u00010Ä\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010É\u0001\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010gR\u0017\u0010\"\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010g¨\u0006Í\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpActivityViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "Lcom/mi/health/course/export/data/CourseConfigModel$AudioSegment;", "segment", "", "showTitle", "(Lcom/mi/health/course/export/data/CourseConfigModel$AudioSegment;)V", "", DailyRecordKey.sportType, "restartWearSport", "(I)V", "timerPause", "()V", "timerStart", "timerCancel", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "callback", "", "isConnected", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Z", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "result", "isAppLaunch", "deviceStartTime", "onSync", "(ZZI)V", "", "did", "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "disconnectOperate", "startTime", "timeZone", "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "onCleared", "duration", "setMinute", "", "segments", "initAudioSegment", "(Ljava/util/List;)V", "value", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Ltr9;", "readEcoFtpTarget", "()Lkotlinx/coroutines/flow/Flow;", "checkDeviceStatus", "startLocalSport", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "pauseSport", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "resumeSport", "finishSport", "finishSportState", "isDeviceConnect", "()Z", "enable", "setCmdEnable", "(Z)V", "Lkotlin/Function1;", "", "onSecondTick", "setOnSecondTick", "(Lkotlin/jvm/functions/Function1;)V", "isSportValid", "model", "initData", "(Ljava/lang/String;I)V", "getLocalModelStr", "()Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Ljava/util/ArrayList;", "audioSegmentList", "Ljava/util/ArrayList;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport_eco/ftp/ChartViewProperty;", "lineChartDataEmitter$delegate", "Lkotlin/Lazy;", "getLineChartDataEmitter", "()Landroidx/lifecycle/MutableLiveData;", "lineChartDataEmitter", "titleEmitter", "Landroidx/lifecycle/MutableLiveData;", "getTitleEmitter", "lineChartType", "Ljava/lang/String;", "getLineChartType", "setLineChartType", "(Ljava/lang/String;)V", "isDistanceNotMet", "Z", "setDistanceNotMet", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "kotlin.jvm.PlatformType", "_stateData", "Landroidx/lifecycle/LiveData;", "stateData", "Landroidx/lifecycle/LiveData;", "getStateData", "()Landroidx/lifecycle/LiveData;", "supportDeviceLink", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mSportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "Loe4;", "connectEcoState", "getConnectEcoState", "setConnectEcoState", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "mDeviceState", "getMDeviceState", "setMDeviceState", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpSportState;", "mSportState", "getMSportState", "setMSportState", "mPhoneSportData", "getMPhoneSportData", "setMPhoneSportData", "deviceStatusObj$delegate", "getDeviceStatusObj", "()Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "deviceStatusObj", "I", "cmdEnable", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "()I", "setProgress", "otherDevice", "getOtherDevice", "setOtherDevice", "onTick", "Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch;", "durationTimer$delegate", "getDurationTimer", "()Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch;", "durationTimer", "mSportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "getMSportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "setMSportData", "J", "getStartTime", "()J", "setStartTime", "(J)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordEmitter", "getRecordEmitter", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getLocalDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "localDevice", "getRecordSid", "recordSid", "getDid", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpActivityViewModel extends AbsViewModel implements ISportDataChangedListener, ISportStateChangedListener, OnEcoDeviceStatusListener, ISportSyncDataListener {

    @NotNull
    private static final String TAG = "FtpActivityViewModel";

    @NotNull
    private final MutableLiveData<FtpActivityState> _stateData;
    private boolean cmdEnable;

    @Nullable
    private MutableLiveData<oe4> connectEcoState;
    public FitnessDataGetter dataGetter;

    /* JADX INFO: renamed from: deviceStatusObj$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusObj;

    /* JADX INFO: renamed from: durationTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationTimer;
    private boolean isDistanceNotMet;

    @NotNull
    private MutableLiveData<FtpDeviceState> mDeviceState;

    @NotNull
    private MutableLiveData<PhoneSportData> mPhoneSportData;

    @Nullable
    private PhoneSportData mSportData;

    @NotNull
    private IEcoSportRemoteData mSportDataCaller;

    @NotNull
    private MutableLiveData<CourseSportState> mSportState;

    @NotNull
    private String model;

    @Nullable
    private Function1<? super Long, Unit> onTick;

    @Nullable
    private String otherDevice;
    private int progress;

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter;
    private int sportType;
    private long startTime;

    @NotNull
    private final LiveData<FtpActivityState> stateData;
    private boolean supportDeviceLink;

    @NotNull
    private ArrayList<CourseConfigModel.AudioSegment> audioSegmentList = new ArrayList<>();

    /* JADX INFO: renamed from: lineChartDataEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineChartDataEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nqa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivityViewModel.lineChartDataEmitter_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<String> titleEmitter = new MutableLiveData<>();

    @NotNull
    private String lineChartType = "";

    @NotNull
    private IEcoSportRemoteState mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$1", f = "FtpActivityViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpActivityViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<tr9[]> ecoFtpTarget = FtpActivityViewModel.this.readEcoFtpTarget();
                final FtpActivityViewModel ftpActivityViewModel = FtpActivityViewModel.this;
                FlowCollector<? super tr9[]> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((tr9[]) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(tr9[] tr9VarArr, Continuation<? super Unit> continuation) {
                        if (!(tr9VarArr.length == 0)) {
                            MutableLiveData mutableLiveData = ftpActivityViewModel._stateData;
                            FtpActivityState ftpActivityState = (FtpActivityState) ftpActivityViewModel._stateData.getValue();
                            mutableLiveData.setValue(ftpActivityState != null ? FtpActivityState.copy$default(ftpActivityState, tr9VarArr, 0, 2, null) : null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (ecoFtpTarget.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$onSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$onSync$1", f = "FtpActivityViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31051(String str, Continuation<? super C31051> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpActivityViewModel.this.new C31051(this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                FtpActivityViewModel$onSync$1$report$1 ftpActivityViewModel$onSync$1$report$1 = new FtpActivityViewModel$onSync$1$report$1(FtpActivityViewModel.this, this.$sid, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, ftpActivityViewModel$onSync$1$report$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SportBasicReport sportBasicReport = (SportBasicReport) obj;
            FitnessLogUtils.d(FtpActivityViewModel.TAG, "onSync: start = " + FtpActivityViewModel.this.getStartTime() + ", " + sportBasicReport);
            FtpActivityViewModel.this.getRecordEmitter().setValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$readEcoFtpTarget$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "", "Ltr9;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$readEcoFtpTarget$1", f = "FtpActivityViewModel.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31061 extends SuspendLambda implements Function2<ProducerScope<? super tr9[]>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C31061(Continuation<? super C31061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31061 c31061 = new C31061(continuation);
            c31061.L$0 = obj;
            return c31061;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
                eu6<tr9[]> eu6Var = new eu6<tr9[]>() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        ScopeExtKt.scope(Dispatchers.getMain(), new FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1(producerScope, null));
                    }

                    @Override // defpackage.eu6
                    public void onResult(tr9[] result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        ScopeExtKt.scope(Dispatchers.getMain(), new FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onResult$1(producerScope, result, null));
                    }
                };
                if (localDeviceModel != null) {
                    EcoDeviceModelExtKt.getEcoFtpTarget(localDeviceModel, eu6Var);
                }
                Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super tr9[]> producerScope, Continuation<? super Unit> continuation) {
            return ((C31061) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FtpActivityViewModel() {
        MutableLiveData<FtpActivityState> mutableLiveData = new MutableLiveData<>(FtpActivityState.INSTANCE.getInitial());
        this._stateData = mutableLiveData;
        this.stateData = mutableLiveData;
        this.supportDeviceLink = true;
        this.mSportDataCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE);
        this.connectEcoState = new MutableLiveData<>();
        this.mDeviceState = new MutableLiveData<>(null);
        this.mSportState = new MutableLiveData<>(CourseSportState.Idle.INSTANCE);
        this.mPhoneSportData = new MutableLiveData<>(null);
        this.deviceStatusObj = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oqa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpActivityViewModel.deviceStatusObj_delegate$lambda$1();
            }
        });
        this.model = "";
        this.cmdEnable = true;
        this.durationTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pqa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpActivityViewModel.durationTimer_delegate$lambda$3(this.f30640a);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        this.recordEmitter = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDeviceStatus$lambda$4(FtpActivityViewModel this$0, boolean z) {
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean z2 = false;
        this$0.getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
        FtpDeviceState deviceStatusObj = this$0.getDeviceStatusObj();
        String str = "";
        if (ecoDeviceModel == null || (name = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        this$0.getDeviceStatusObj().setWearHas(z && ecoDeviceModel != null);
        this$0.getDeviceStatusObj().setSportHas(true);
        FtpDeviceState deviceStatusObj2 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice = this$0.getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z2 = true;
        }
        deviceStatusObj2.setSportConnect(z2);
        FtpDeviceState deviceStatusObj3 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice2 = this$0.getLocalDevice();
        if (localDevice2 != null && (name2 = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getName(localDevice2)) != null) {
            str = name2;
        }
        deviceStatusObj3.setSportName(str);
        this$0.mDeviceState.postValue(this$0.getDeviceStatusObj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FtpDeviceState deviceStatusObj_delegate$lambda$1() {
        return new FtpDeviceState(false, false, null, false, false, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch durationTimer_delegate$lambda$3(final FtpActivityViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(0L, new Function1() { // from class: rqa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivityViewModel.durationTimer_delegate$lambda$3$lambda$2(this.f32796a, ((Long) obj).longValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit durationTimer_delegate$lambda$3$lambda$2(FtpActivityViewModel this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Long, Unit> function1 = this$0.onTick;
        if (function1 != null) {
            function1.invoke2(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    private final FtpDeviceState getDeviceStatusObj() {
        return (FtpDeviceState) this.deviceStatusObj.getValue();
    }

    private final String getDid() {
        EcoDeviceModel localDevice;
        if (this.supportDeviceLink) {
            localDevice = getLocalDevice();
            if (localDevice == null) {
                return null;
            }
        } else {
            localDevice = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (localDevice == null) {
                return null;
            }
        }
        return localDevice.getDid();
    }

    private final StopWatch getDurationTimer() {
        return (StopWatch) this.durationTimer.getValue();
    }

    private final EcoDeviceModel getLocalDevice() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
    }

    private final String getRecordSid() {
        if (!this.supportDeviceLink) {
            return "xiaomiwear_app";
        }
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return localDevice.getDid();
        }
        return null;
    }

    private final boolean isConnected(RequestCallback callback) {
        EcoDeviceModel localDevice = getLocalDevice();
        boolean isDeviceConnected = localDevice != null ? localDevice.getIsDeviceConnected() : false;
        if (!isDeviceConnected) {
            if (callback != null) {
                callback.call(1);
            }
            FitnessLogUtils.d(TAG, "local device disconnect");
        }
        return isDeviceConnected;
    }

    public static /* synthetic */ boolean isConnected$default(FtpActivityViewModel ftpActivityViewModel, RequestCallback requestCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            requestCallback = null;
        }
        return ftpActivityViewModel.isConnected(requestCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData lineChartDataEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    private final void restartWearSport(int sportType) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.d(TAG, "restartWearSport");
        this.mSportStateCaller.restartSport(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel.restartWearSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(FtpActivityViewModel.TAG, "restartSport: res = " + responseCode);
            }
        });
    }

    private final void showTitle(CourseConfigModel.AudioSegment segment) {
        if (segment.isShowTitle) {
            return;
        }
        segment.isShowTitle = true;
        this.titleEmitter.setValue(segment.introduction);
    }

    private final void timerCancel() {
        getDurationTimer().cancel();
    }

    private final void timerPause() {
        getDurationTimer().pause();
    }

    private final void timerStart() {
        getDurationTimer().start();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.mSportStateCaller.setSportSyncDataListener(this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.mSportStateCaller.addSportStateChangedListener(FtpActivityViewModel.class, this);
        this.mSportDataCaller.addSportDataChangedListener(FtpActivityViewModel.class, this);
    }

    public final void checkDeviceStatus() {
        String name;
        if (this.supportDeviceLink) {
            this.mSportStateCaller.isSupportLaunchSport(this.sportType, new j7r() { // from class: qqa
                @Override // defpackage.j7r
                public final void a(Boolean bool) {
                    FtpActivityViewModel.checkDeviceStatus$lambda$4(this.f31743a, bool.booleanValue());
                }
            });
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
        FtpDeviceState deviceStatusObj = getDeviceStatusObj();
        if (ecoDeviceModel == null || (name = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
            name = "";
        }
        deviceStatusObj.setWearName(name);
        getDeviceStatusObj().setWearHas(ecoDeviceModel != null);
        getDeviceStatusObj().setSportHas(false);
        this.mDeviceState.postValue(getDeviceStatusObj());
    }

    public final void disconnectOperate() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final void finishSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            FitnessLogUtils.d(TAG, "finishSport: sportType = " + sportType + " ");
            this.mSportStateCaller.finishSport(getDid(), sportType, callback);
        }
    }

    public final void finishSportState() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    @Nullable
    public final MutableLiveData<oe4> getConnectEcoState() {
        return this.connectEcoState;
    }

    @NotNull
    public final FitnessDataGetter getDataGetter() {
        FitnessDataGetter fitnessDataGetter = this.dataGetter;
        if (fitnessDataGetter != null) {
            return fitnessDataGetter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataGetter");
        return null;
    }

    @NotNull
    public final MutableLiveData<ChartViewProperty> getLineChartDataEmitter() {
        return (MutableLiveData) this.lineChartDataEmitter.getValue();
    }

    @NotNull
    public final String getLineChartType() {
        return this.lineChartType;
    }

    @Nullable
    public final String getLocalModelStr() {
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getModel(localDevice);
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<FtpDeviceState> getMDeviceState() {
        return this.mDeviceState;
    }

    @NotNull
    public final MutableLiveData<PhoneSportData> getMPhoneSportData() {
        return this.mPhoneSportData;
    }

    @Nullable
    public final PhoneSportData getMSportData() {
        return this.mSportData;
    }

    @NotNull
    public final MutableLiveData<CourseSportState> getMSportState() {
        return this.mSportState;
    }

    @Nullable
    public final String getOtherDevice() {
        return this.otherDevice;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<SportBasicReport> getRecordEmitter() {
        return this.recordEmitter;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final LiveData<FtpActivityState> getStateData() {
        return this.stateData;
    }

    @NotNull
    public final MutableLiveData<String> getTitleEmitter() {
        return this.titleEmitter;
    }

    public final void initAudioSegment(@Nullable List<? extends CourseConfigModel.AudioSegment> segments) {
        String item;
        int iIntValue;
        String str;
        if (segments == null) {
            return;
        }
        this.audioSegmentList.addAll(segments);
        ArrayList arrayList = new ArrayList();
        if (this.audioSegmentList.isEmpty()) {
            return;
        }
        int size = this.audioSegmentList.size();
        CourseConfigModel.AudioSegment audioSegment = this.audioSegmentList.get(0);
        if (audioSegment == null || (item = audioSegment.triggerItem) == null) {
            item = FtpChartType.TIME.getItem();
        }
        FitnessLogUtils.d(TAG, "initRecommendSpeed type=" + item + "***audioSegment list size=" + size);
        String str2 = "startTime";
        String str3 = "get(...)";
        String str4 = "endTime";
        if (Intrinsics.areEqual(item, FtpChartType.DISTANCE.getItem())) {
            int i = 0;
            int iIntValue2 = 0;
            while (i < size) {
                CourseConfigModel.AudioSegment audioSegment2 = this.audioSegmentList.get(i);
                Intrinsics.checkNotNullExpressionValue(audioSegment2, "get(...)");
                CourseConfigModel.AudioSegment audioSegment3 = audioSegment2;
                String startTime = audioSegment3.startTime;
                Intrinsics.checkNotNullExpressionValue(startTime, "startTime");
                audioSegment3.timeInMills = CourseAllInfoKt.parseTime(startTime);
                String str5 = audioSegment3.endTime;
                Intrinsics.checkNotNullExpressionValue(str5, str4);
                audioSegment3.endTimeMills = CourseAllInfoKt.parseTime(str5);
                audioSegment3.requiredDistance = iIntValue2;
                long j = audioSegment3.timeInMills;
                StringBuilder sb = new StringBuilder();
                String str6 = str4;
                sb.append("initRecommendSpeed timeInMills=");
                sb.append(j);
                sb.append("***requiredDistance=");
                sb.append(iIntValue2);
                FitnessLogUtils.d(TAG, sb.toString());
                int i2 = i + 1;
                if (i2 >= size) {
                    String triggerValue = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue);
                    iIntValue = (intOrNull != null ? intOrNull.intValue() : 0) + iIntValue2;
                    float f = iIntValue;
                    arrayList.add(new ChartDataEntity(f, audioSegment3.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f + "***y=" + audioSegment3.speed);
                } else {
                    CourseConfigModel.AudioSegment audioSegment4 = this.audioSegmentList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(audioSegment4, "get(...)");
                    CourseConfigModel.AudioSegment audioSegment5 = audioSegment4;
                    if (i == 0) {
                        arrayList.add(new ChartDataEntity(0.0f, audioSegment3.speed));
                        FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=0f***y=" + audioSegment3.speed);
                    }
                    String triggerValue2 = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue2);
                    iIntValue2 += intOrNull2 != null ? intOrNull2.intValue() : 0;
                    float f2 = iIntValue2;
                    arrayList.add(new ChartDataEntity(f2, audioSegment3.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment3.speed);
                    arrayList.add(new ChartDataEntity(f2, audioSegment5.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment5.speed);
                    str4 = str6;
                    i = i2;
                }
            }
            iIntValue = iIntValue2;
        } else {
            String str7 = "endTime";
            if (Intrinsics.areEqual(item, FtpChartType.TIME.getItem())) {
                int i3 = 0;
                int time = 0;
                while (i3 < size) {
                    CourseConfigModel.AudioSegment audioSegment6 = this.audioSegmentList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(audioSegment6, str3);
                    CourseConfigModel.AudioSegment audioSegment7 = audioSegment6;
                    String str8 = audioSegment7.startTime;
                    Intrinsics.checkNotNullExpressionValue(str8, str2);
                    audioSegment7.timeInMills = CourseAllInfoKt.parseTime(str8);
                    String str9 = audioSegment7.endTime;
                    String str10 = str7;
                    Intrinsics.checkNotNullExpressionValue(str9, str10);
                    audioSegment7.endTimeMills = CourseAllInfoKt.parseTime(str9);
                    String str11 = audioSegment7.startTime;
                    Intrinsics.checkNotNullExpressionValue(str11, str2);
                    float f3 = 60000;
                    float time2 = CourseAllInfoKt.parseTime(str11) / f3;
                    String str12 = str2;
                    arrayList.add(new ChartDataEntity(time2, audioSegment7.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + time2 + "***y=" + audioSegment7.speed);
                    String str13 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str13, str10);
                    String str14 = str3;
                    float time3 = ((float) CourseAllInfoKt.parseTime(str13)) / f3;
                    String str15 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str15, str10);
                    arrayList.add(new ChartDataEntity(CourseAllInfoKt.parseTime(str15) / f3, audioSegment7.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + time3 + "***y=" + audioSegment7.speed + "**maxValueX=" + time);
                    if (i3 == size - 1) {
                        String str16 = audioSegment7.endTime;
                        str = str10;
                        Intrinsics.checkNotNullExpressionValue(str16, str);
                        time = ((int) CourseAllInfoKt.parseTime(str16)) / 1000;
                    } else {
                        str = str10;
                    }
                    i3++;
                    str3 = str14;
                    str7 = str;
                    str2 = str12;
                }
                iIntValue = time;
            } else {
                iIntValue = 0;
            }
        }
        this.lineChartType = item;
        ChartViewProperty chartViewProperty = new ChartViewProperty(arrayList, item, iIntValue);
        FitnessLogUtils.d(TAG, "initRecommendSpeed linechart maxValueX=" + iIntValue);
        getLineChartDataEmitter().setValue(chartViewProperty);
    }

    public final void initData(@NotNull String model, int sportType) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        this.sportType = sportType;
        this.supportDeviceLink = true;
    }

    public final boolean isDeviceConnect() {
        EcoDeviceModel localDevice = getLocalDevice();
        return localDevice != null && localDevice.getIsDeviceConnected();
    }

    /* JADX INFO: renamed from: isDistanceNotMet, reason: from getter */
    public final boolean getIsDistanceNotMet() {
        return this.isDistanceNotMet;
    }

    public final boolean isSportValid() {
        PhoneSportData phoneSportData = this.mSportData;
        if (phoneSportData == null) {
            phoneSportData = new PhoneSportData();
        }
        return phoneSportData.duration >= 120;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.mSportStateCaller.setSportSyncDataListener(null);
        timerCancel();
        this.mSportStateCaller.removeSportStateChangedListener(FtpActivityViewModel.class);
        this.mSportDataCaller.removeSportDataChangedListener(FtpActivityViewModel.class, this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "onConnectFailure=" + did);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "onConnectStart=" + did);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "onConnectSuccess=" + did);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.supportDeviceLink) {
            EcoDeviceModel localDevice = getLocalDevice();
            if (Intrinsics.areEqual(localDevice != null ? localDevice.getDid() : null, did)) {
                this.mSportStateCaller.syncLocalDeviceSportStatus();
            } else {
                if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                    restartWearSport(this.sportType);
                }
            }
        } else {
            if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
                restartWearSport(this.sportType);
            }
        }
        checkDeviceStatus();
        oe4 oe4Var = new oe4(did, true);
        MutableLiveData<oe4> mutableLiveData = this.connectEcoState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "onDisconnect=" + did);
        checkDeviceStatus();
        oe4 oe4Var = new oe4(did, false);
        MutableLiveData<oe4> mutableLiveData = this.connectEcoState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        if (phoneSportData != null) {
            this.mSportData = phoneSportData;
            this.mPhoneSportData.postValue(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable y7r wearSportData) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        this.mSportState.postValue(new CourseSportState.Finish(isSportValid()));
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.mSportState.postValue(CourseSportState.Pause.INSTANCE);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.mSportState.postValue(CourseSportState.Restart.INSTANCE);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        this.mSportState.postValue(new CourseSportState.Start(startTime, sportType));
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        String recordSid = getRecordSid();
        FitnessLogUtils.d(TAG, "onSync: sid = " + recordSid + ", sportType= " + this.sportType + ", time = " + this.startTime);
        if (recordSid == null || recordSid.length() == 0) {
            this.recordEmitter.setValue(null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31051(recordSid, null), 3, null);
        }
    }

    public final void pauseSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.pauseSport(getDid(), sportType, callback);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    @NotNull
    public final Flow<tr9[]> readEcoFtpTarget() {
        return FlowKt.callbackFlow(new C31061(null));
    }

    public final void resumeSport(int sportType, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            this.mSportStateCaller.resumeSport(getDid(), sportType, callback);
        }
    }

    public final void setCmdEnable(boolean enable) {
        this.cmdEnable = enable;
    }

    public final void setConnectEcoState(@Nullable MutableLiveData<oe4> mutableLiveData) {
        this.connectEcoState = mutableLiveData;
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setDistanceNotMet(boolean z) {
        this.isDistanceNotMet = z;
    }

    public final void setGymFtpTest(boolean value, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.d(TAG, "startFtpTest=" + value);
        this.mSportStateCaller.setGymFtpTest(value, callback);
    }

    public final void setLineChartType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lineChartType = str;
    }

    public final void setMDeviceState(@NotNull MutableLiveData<FtpDeviceState> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mDeviceState = mutableLiveData;
    }

    public final void setMPhoneSportData(@NotNull MutableLiveData<PhoneSportData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mPhoneSportData = mutableLiveData;
    }

    public final void setMSportData(@Nullable PhoneSportData phoneSportData) {
        this.mSportData = phoneSportData;
    }

    public final void setMSportState(@NotNull MutableLiveData<CourseSportState> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mSportState = mutableLiveData;
    }

    public final void setMinute(int duration) {
        int i = (duration % 3600) / 60;
        FtpActivityState value = this._stateData.getValue();
        if (value == null || value.getMinute() != i) {
            MutableLiveData<FtpActivityState> mutableLiveData = this._stateData;
            FtpActivityState value2 = mutableLiveData.getValue();
            mutableLiveData.setValue(value2 != null ? FtpActivityState.copy$default(value2, null, i, 1, null) : null);
        }
    }

    public final void setOnSecondTick(@NotNull Function1<? super Long, Unit> onSecondTick) {
        Intrinsics.checkNotNullParameter(onSecondTick, "onSecondTick");
        this.onTick = onSecondTick;
    }

    public final void setOtherDevice(@Nullable String str) {
        this.otherDevice = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void startLocalSport(@NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.supportDeviceLink || isConnected(callback)) {
            FitnessLogUtils.d(TAG, "mSportStateCaller.getSportState()=" + this.mSportStateCaller.getSportState());
            long jCurrentTimeMillis = System.currentTimeMillis();
            long offset = (long) TimeZone.getDefault().getOffset(jCurrentTimeMillis);
            SportRequestData.a aVar = new SportRequestData.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            SportRequestData sportRequestDataJ = aVar.u(jCurrentTimeMillis, timeUnit).w(offset, timeUnit).s(this.sportType).q(null).p(1).j();
            IEcoSportRemoteState iEcoSportRemoteState = this.mSportStateCaller;
            String did = getDid();
            Intrinsics.checkNotNull(sportRequestDataJ);
            iEcoSportRemoteState.startSport(did, sportRequestDataJ, callback);
            this.startTime = timeUnit.toSeconds(jCurrentTimeMillis);
        }
    }
}
