package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.ftp.CourseSportState;
import com.xiaomi.fitness.sport_eco.ftp.FtpActivityState;
import com.xiaomi.fitness.sport_eco.ftp.FtpDeviceState;
import com.xiaomi.fitness.sport_eco.ftp.FtpPart;
import com.xiaomi.fitness.sport_eco.ftp.StopWatch;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.FtpStateData;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.e1j;
import defpackage.eu6;
import defpackage.j7r;
import defpackage.oe4;
import defpackage.tr9;
import defpackage.y7r;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Å\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002Å\u0001B\n\b\u0007¢\u0006\u0005\bÄ\u0001\u0010\u0014J1\u0010\r\u001a\u00020\u000b2 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J1\u0010(\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010%J!\u0010+\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010%J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\u0014J/\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u0014J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u0014J!\u00107\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000bH\u0014¢\u0006\u0004\bA\u0010\u0014J\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000f¢\u0006\u0004\bC\u0010\u0012J\u001d\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0G¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010\u0014J\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\bO\u0010NJ\u001d\u0010P\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\bP\u0010NJ\r\u0010Q\u001a\u00020\b¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ!\u0010X\u001a\u00020\u000b2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u000b0G¢\u0006\u0004\bX\u0010IJ\r\u0010Y\u001a\u00020\b¢\u0006\u0004\bY\u0010RJ\u001d\u0010[\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u000b¢\u0006\u0004\b]\u0010\u0014J\r\u0010^\u001a\u00020\u000b¢\u0006\u0004\b^\u0010\u0014J\u000f\u0010_\u001a\u0004\u0018\u00010!¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020!H\u0016¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020!2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\u001d\u0010k\u001a\u00020!2\u0006\u0010i\u001a\u00020h2\u0006\u0010j\u001a\u00020\u000f¢\u0006\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010z\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010x0x0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001e\u0010}\u001a\b\u0012\u0004\u0012\u00020x0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R1\u0010\u0087\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010{\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R/\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010{\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R/\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0091\u0001\u0010{\u001a\u0006\b\u0092\u0001\u0010\u0089\u0001\"\u0006\b\u0093\u0001\u0010\u008b\u0001R0\u0010\u0094\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0094\u0001\u0010{\u001a\u0006\b\u0095\u0001\u0010\u0089\u0001\"\u0006\b\u0096\u0001\u0010\u008b\u0001R0\u0010\u0097\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010{\u001a\u0006\b\u0098\u0001\u0010\u0089\u0001\"\u0006\b\u0099\u0001\u0010\u008b\u0001R!\u0010\u009e\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010Z\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010\u009f\u0001R\u0017\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0082\u0001R(\u0010¢\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¢\u0001\u0010 \u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010\u0012R)\u0010¦\u0001\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¦\u0001\u0010\u009f\u0001\u001a\u0005\b§\u0001\u0010`\"\u0005\b¨\u0001\u0010cR'\u0010©\u0001\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u000b\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R!\u0010¯\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u009b\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010°\u0001\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0005\b´\u0001\u0010@R'\u0010-\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b-\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010º\u00010w8\u0006¢\u0006\u000f\n\u0005\b»\u0001\u0010{\u001a\u0006\b¼\u0001\u0010\u0089\u0001R\u001a\u0010À\u0001\u001a\u0005\u0018\u00010½\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Â\u0001\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010`R\u0017\u0010\"\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010`¨\u0006Æ\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpV2ActivityViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IFtpStateListener;", "Lkotlin/Function2;", "", "", "Ltr9;", "", "callback", "readEcoFtpTarget", "(Lkotlin/jvm/functions/Function2;)V", "", DailyRecordKey.sportType, "restartWearSport", "(I)V", "timerCancel", "()V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "isConnected", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Z", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "result", "isAppLaunch", "deviceStartTime", "onSync", "(ZZI)V", "", "did", "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "disconnectOperate", "startTime", "timeZone", "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "onCleared", "duration", "setMinute", "value", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "Lkotlin/Function1;", "getEcoFtpTarget", "(Lkotlin/jvm/functions/Function1;)V", "checkDeviceStatus", "startLocalSport", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "pauseSport", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "resumeSport", "finishSport", "isDeviceConnect", "()Z", "enable", "setCmdEnable", "(Z)V", "", "onSecondTick", "setOnSecondTick", "isSportValid", "model", "initData", "(Ljava/lang/String;I)V", "initListener", "resetListener", "getLocalModelStr", "()Ljava/lang/String;", "ftpStateDataJson", "onFtpStateChange", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpPart;", "ftpPart", "getPartText", "(Lcom/xiaomi/fitness/sport_eco/ftp/FtpPart;)Ljava/lang/String;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/FtpStateData;", "ftpStateData", "sumStage", "getIndicatorText", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/FtpStateData;I)Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpActivityState;", "kotlin.jvm.PlatformType", "_stateData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "stateData", "Landroidx/lifecycle/LiveData;", "getStateData", "()Landroidx/lifecycle/LiveData;", "supportDeviceLink", "Z", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "mSportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "Loe4;", "connectEcoState", "getConnectEcoState", "()Landroidx/lifecycle/MutableLiveData;", "setConnectEcoState", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "mDeviceState", "getMDeviceState", "setMDeviceState", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpSportState;", "mSportState", "getMSportState", "setMSportState", "mPhoneSportData", "getMPhoneSportData", "setMPhoneSportData", "mFtpStateData", "getMFtpStateData", "setMFtpStateData", "deviceStatusObj$delegate", "Lkotlin/Lazy;", "getDeviceStatusObj", "()Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "deviceStatusObj", "Ljava/lang/String;", "I", "cmdEnable", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "()I", "setProgress", "otherDevice", "getOtherDevice", "setOtherDevice", "onTick", "Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch;", "durationTimer$delegate", "getDurationTimer", "()Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch;", "durationTimer", "mSportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "getMSportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "setMSportData", "J", "getStartTime", "()J", "setStartTime", "(J)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordEmitter", "getRecordEmitter", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getLocalDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "localDevice", "getRecordSid", "recordSid", "getDid", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFtpV2ActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtpV2ActivityViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpV2ActivityViewModel\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,413:1\n29#2:414\n*S KotlinDebug\n*F\n+ 1 FtpV2ActivityViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpV2ActivityViewModel\n*L\n342#1:414\n*E\n"})
public final class FtpV2ActivityViewModel extends AbsViewModel implements ISportDataChangedListener, ISportStateChangedListener, OnEcoDeviceStatusListener, ISportSyncDataListener, IFtpStateListener {

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

    @NotNull
    private MutableLiveData<FtpDeviceState> mDeviceState;

    @NotNull
    private MutableLiveData<FtpStateData> mFtpStateData;

    @NotNull
    private MutableLiveData<PhoneSportData> mPhoneSportData;

    @Nullable
    private PhoneSportData mSportData;

    @NotNull
    private IEcoSportRemoteData mSportDataCaller;

    @NotNull
    private MutableLiveData<CourseSportState> mSportState;

    @NotNull
    private IEcoSportRemoteState mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FtpPart.values().length];
            try {
                iArr[FtpPart.START_WARMING_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FtpPart.WARMING_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FtpPart.TEST_IS_ABOUT_TO_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FtpPart.TEST_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FtpPart.KEEP_GOING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FtpPart.DAWN_IS_COMING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FtpPart.NEW_STAGE_BEGINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FtpPart.THE_ENERGY_RING_STARTS_CHARGING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FtpPart.COMPLETE_TEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FtpPart.TRUST_ME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel$onSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel$onSync$1", f = "FtpV2ActivityViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpV2ActivityViewModel.this.new AnonymousClass1(this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                FtpV2ActivityViewModel$onSync$1$report$1 ftpV2ActivityViewModel$onSync$1$report$1 = new FtpV2ActivityViewModel$onSync$1$report$1(FtpV2ActivityViewModel.this, this.$sid, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, ftpV2ActivityViewModel$onSync$1$report$1, this);
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
            FitnessLogUtils.i(FtpV2ActivityViewModel.TAG, "onSync: start = " + FtpV2ActivityViewModel.this.getStartTime() + ", " + sportBasicReport);
            FtpV2ActivityViewModel.this.getRecordEmitter().setValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FtpV2ActivityViewModel() {
        MutableLiveData<FtpActivityState> mutableLiveData = new MutableLiveData<>(FtpActivityState.INSTANCE.getInitial());
        this._stateData = mutableLiveData;
        this.stateData = mutableLiveData;
        this.supportDeviceLink = true;
        this.mSportDataCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE);
        this.connectEcoState = new MutableLiveData<>();
        this.mDeviceState = new MutableLiveData<>(null);
        this.mSportState = new MutableLiveData<>(CourseSportState.Idle.INSTANCE);
        this.mPhoneSportData = new MutableLiveData<>(null);
        this.mFtpStateData = new MutableLiveData<>(null);
        this.deviceStatusObj = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpV2ActivityViewModel.deviceStatusObj_delegate$lambda$0();
            }
        });
        this.model = "";
        this.cmdEnable = true;
        this.durationTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpV2ActivityViewModel.durationTimer_delegate$lambda$2(this.f24278a);
            }
        });
        this.recordEmitter = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkDeviceStatus$lambda$4(FtpV2ActivityViewModel this$0, boolean z) {
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = "";
        boolean z2 = false;
        if (z) {
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            this$0.getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
            FtpDeviceState deviceStatusObj = this$0.getDeviceStatusObj();
            if (ecoDeviceModel == null || (name2 = EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
                name2 = "";
            }
            deviceStatusObj.setWearName(name2);
            this$0.getDeviceStatusObj().setWearHas(z && ecoDeviceModel != null);
        }
        this$0.getDeviceStatusObj().setSportHas(true);
        FtpDeviceState deviceStatusObj2 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice = this$0.getLocalDevice();
        if (localDevice != null && localDevice.getIsDeviceConnected()) {
            z2 = true;
        }
        deviceStatusObj2.setSportConnect(z2);
        FtpDeviceState deviceStatusObj3 = this$0.getDeviceStatusObj();
        EcoDeviceModel localDevice2 = this$0.getLocalDevice();
        if (localDevice2 != null && (name = EcoDeviceModelExtKt.getName(localDevice2)) != null) {
            str = name;
        }
        deviceStatusObj3.setSportName(str);
        this$0.mDeviceState.postValue(this$0.getDeviceStatusObj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FtpDeviceState deviceStatusObj_delegate$lambda$0() {
        return new FtpDeviceState(false, false, null, false, false, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch durationTimer_delegate$lambda$2(final FtpV2ActivityViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(0L, new Function1() { // from class: lta
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2ActivityViewModel.durationTimer_delegate$lambda$2$lambda$1(this.f25414a, ((Long) obj).longValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit durationTimer_delegate$lambda$2$lambda$1(FtpV2ActivityViewModel this$0, long j) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoFtpTarget$lambda$3(Function1 callback, FtpV2ActivityViewModel this$0, boolean z, tr9[] tr9VarArr) {
        tr9 tr9Var;
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "readEcoFtpTarget");
        FitnessLogUtils.i(TAG, String.valueOf((tr9VarArr == null || (tr9Var = tr9VarArr[1]) == null) ? null : Integer.valueOf(tr9Var.f)));
        callback.invoke2(Boolean.valueOf(z));
        if (z && tr9VarArr != null) {
            if (!(tr9VarArr.length == 0)) {
                MutableLiveData<FtpActivityState> mutableLiveData = this$0._stateData;
                FtpActivityState value = mutableLiveData.getValue();
                mutableLiveData.setValue(value != null ? FtpActivityState.copy$default(value, tr9VarArr, 0, 2, null) : null);
            }
        }
        return Unit.INSTANCE;
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
            FitnessLogUtils.i(TAG, "local device disconnect");
        }
        return isDeviceConnected;
    }

    public static /* synthetic */ boolean isConnected$default(FtpV2ActivityViewModel ftpV2ActivityViewModel, RequestCallback requestCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            requestCallback = null;
        }
        return ftpV2ActivityViewModel.isConnected(requestCallback);
    }

    private final void readEcoFtpTarget(final Function2<? super Boolean, ? super tr9[], Unit> callback) {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        eu6<tr9[]> eu6Var = new eu6<tr9[]>() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel$readEcoFtpTarget$mCallBack$1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpV2ActivityViewModel$readEcoFtpTarget$mCallBack$1$onError$1(callback, null));
            }

            @Override // defpackage.eu6
            public void onResult(tr9[] result) {
                Intrinsics.checkNotNullParameter(result, "result");
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpV2ActivityViewModel$readEcoFtpTarget$mCallBack$1$onResult$1(callback, result, null));
            }
        };
        if (localDeviceModel != null) {
            com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getEcoFtpTarget(localDeviceModel, eu6Var);
        }
    }

    private final void restartWearSport(int sportType) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i(TAG, "restartWearSport");
        this.mSportStateCaller.restartSport(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel.restartWearSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(FtpV2ActivityViewModel.TAG, "restartSport: res = " + responseCode);
            }
        });
    }

    private final void timerCancel() {
        getDurationTimer().cancel();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.mSportStateCaller.setSportSyncDataListener(this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.mSportStateCaller.addSportStateChangedListener(FtpV2ActivityViewModel.class, this);
        this.mSportDataCaller.addSportDataChangedListener(FtpV2ActivityViewModel.class, this);
    }

    public final void checkDeviceStatus() {
        String name;
        if (this.supportDeviceLink) {
            this.mSportStateCaller.isSupportLaunchSport(this.sportType, new j7r() { // from class: mta
                @Override // defpackage.j7r
                public final void a(Boolean bool) {
                    FtpV2ActivityViewModel.checkDeviceStatus$lambda$4(this.f27180a, bool.booleanValue());
                }
            });
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        getDeviceStatusObj().setWearConnect(ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected());
        FtpDeviceState deviceStatusObj = getDeviceStatusObj();
        if (ecoDeviceModel == null || (name = EcoDeviceModelExtKt.getName(ecoDeviceModel)) == null) {
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
            FitnessLogUtils.i(TAG, "finishSport: sportType = " + sportType + " ");
            this.mSportStateCaller.finishSport(getDid(), sportType, callback);
        }
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

    public final void getEcoFtpTarget(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        readEcoFtpTarget(new Function2() { // from class: ita
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpV2ActivityViewModel.getEcoFtpTarget$lambda$3(callback, this, ((Boolean) obj).booleanValue(), (tr9[]) obj2);
            }
        });
    }

    @NotNull
    public final String getIndicatorText(@NotNull FtpStateData ftpStateData, int sumStage) {
        Intrinsics.checkNotNullParameter(ftpStateData, "ftpStateData");
        int i = ftpStateData.stage;
        if (i > 0) {
            return ftpStateData.retryCount > 0 ? ResourceExtKt.getString(e1j.Z0, Integer.valueOf(i), Integer.valueOf(ftpStateData.stage), Integer.valueOf(sumStage)) : ResourceExtKt.getString(e1j.Y0, Integer.valueOf(i), Integer.valueOf(ftpStateData.stage), Integer.valueOf(sumStage));
        }
        return ResourceExtKt.getString(e1j.s1);
    }

    @Nullable
    public final String getLocalModelStr() {
        EcoDeviceModel localDevice = getLocalDevice();
        if (localDevice != null) {
            return EcoDeviceModelExtKt.getModel(localDevice);
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<FtpDeviceState> getMDeviceState() {
        return this.mDeviceState;
    }

    @NotNull
    public final MutableLiveData<FtpStateData> getMFtpStateData() {
        return this.mFtpStateData;
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

    @NotNull
    public final String getPartText(@NotNull FtpPart ftpPart) {
        Intrinsics.checkNotNullParameter(ftpPart, "ftpPart");
        switch (WhenMappings.$EnumSwitchMapping$0[ftpPart.ordinal()]) {
            case 1:
                return ResourceExtKt.getString(e1j.i1);
            case 2:
                return ResourceExtKt.getString(e1j.j1);
            case 3:
                return ResourceExtKt.getString(e1j.k1);
            case 4:
                return ResourceExtKt.getString(e1j.l1);
            case 5:
                return ResourceExtKt.getString(e1j.m1);
            case 6:
                return ResourceExtKt.getString(e1j.n1);
            case 7:
                return ResourceExtKt.getString(e1j.o1);
            case 8:
                return ResourceExtKt.getString(e1j.p1);
            case 9:
                return ResourceExtKt.getString(e1j.q1);
            case 10:
                return ResourceExtKt.getString(e1j.r1);
            default:
                throw new NoWhenBranchMatchedException();
        }
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

    public final void initData(@NotNull String model, int sportType) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        this.sportType = sportType;
        this.supportDeviceLink = true;
    }

    public final void initListener() {
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setFtpStateReceiveListener(this);
    }

    public final boolean isDeviceConnect() {
        EcoDeviceModel localDevice = getLocalDevice();
        return localDevice != null && localDevice.getIsDeviceConnected();
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
        this.mSportStateCaller.removeSportStateChangedListener(FtpV2ActivityViewModel.class);
        this.mSportDataCaller.removeSportDataChangedListener(FtpV2ActivityViewModel.class, this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(TAG, "onConnectFailure=" + did);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(TAG, "onConnectStart=" + did);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(TAG, "onConnectSuccess=" + did);
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
        FitnessLogUtils.i(TAG, "onDisconnect=" + did);
        checkDeviceStatus();
        oe4 oe4Var = new oe4(did, false);
        MutableLiveData<oe4> mutableLiveData = this.connectEcoState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateListener
    public void onFtpStateChange(@NotNull String ftpStateDataJson) {
        Intrinsics.checkNotNullParameter(ftpStateDataJson, "ftpStateDataJson");
        FitnessLogUtils.i(TAG, "ftpStateDataJson is " + ftpStateDataJson);
        if (ftpStateDataJson.length() > 0) {
            this.mFtpStateData.postValue((FtpStateData) new Gson().fromJson(ftpStateDataJson, new TypeToken<FtpStateData>() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel$onFtpStateChange$$inlined$fromJson$1
            }.getType()));
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
        FitnessLogUtils.i(TAG, "onSync: sid = " + recordSid + ", sportType= " + this.sportType + ", time = " + this.startTime);
        if (recordSid == null || recordSid.length() == 0) {
            this.recordEmitter.setValue(null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(recordSid, null), 3, null);
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

    public final void resetListener() {
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setFtpStateReceiveListener(null);
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

    public final void setGymFtpTest(boolean value, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i(TAG, "startFtpTest=" + value);
        this.mSportStateCaller.setGymFtpTest(value, callback);
    }

    public final void setMDeviceState(@NotNull MutableLiveData<FtpDeviceState> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mDeviceState = mutableLiveData;
    }

    public final void setMFtpStateData(@NotNull MutableLiveData<FtpStateData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mFtpStateData = mutableLiveData;
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
            FitnessLogUtils.i(TAG, "mSportStateCaller.getSportState()=" + this.mSportStateCaller.getSportState());
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
