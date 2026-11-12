package com.xiaomi.fitness.sport_eco_manager.client;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller;
import com.xiaomi.fitness.sport_eco_manager.client.data.AppAndDeviceSportStateNotifyCaller;
import com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.bsc;
import defpackage.esc;
import defpackage.ew7;
import defpackage.fsc;
import defpackage.isc;
import defpackage.j7r;
import defpackage.otc;
import defpackage.psc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ¥\u00012\u00020\u0001:\n¥\u0001¦\u0001§\u0001¨\u0001©\u0001B\n\b\u0007¢\u0006\u0005\b¤\u0001\u0010MJ)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ'\u0010\u0017\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J)\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ)\u0010\u001d\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b+\u0010*J\u001b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b.\u0010*J\u0011\u0010/\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b/\u0010*J\u000f\u00100\u001a\u00020 H\u0016¢\u0006\u0004\b0\u0010\"J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u001fJ\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u001fJ\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020&H\u0016¢\u0006\u0004\b5\u0010(J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u001fJ!\u00109\u001a\u0004\u0018\u00010\b2\u0006\u00108\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u0004\u0018\u00010\b2\u0006\u0010;\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u0004\u0018\u00010\b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u0004\u0018\u00010\b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010@J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010MJ\u001f\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020 H\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b\\\u0010]J!\u0010`\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010`\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b`\u0010bJ'\u0010f\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020 H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020 H\u0016¢\u0006\u0004\bh\u0010\"J\u0017\u0010i\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bi\u0010bJ\u000f\u0010j\u001a\u00020\u000bH\u0016¢\u0006\u0004\bj\u0010\u001fJ\u0017\u0010l\u001a\u00020\b2\u0006\u0010k\u001a\u00020\u000bH\u0016¢\u0006\u0004\bl\u0010bJ\u0017\u0010m\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\b2\u0006\u0010o\u001a\u00020 H\u0016¢\u0006\u0004\bp\u0010TJ\u0017\u0010s\u001a\u00020 2\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ#\u0010u\u001a\u00020\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bu\u0010\u0018J#\u0010v\u001a\u00020\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bv\u0010\u0018R\u0014\u0010y\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bz\u0010xR3\u0010\u0083\u0001\u001a\u0004\u0018\u00010{2\b\u0010|\u001a\u0004\u0018\u00010{8B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0089\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00150\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008b\u0001\u001a\u00070\u008a\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0091\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u0086\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u00070\u0095\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\"\u0010\u009b\u0001\u001a\u000b\u0012\u0004\u0012\u00020X\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020[\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009c\u0001R\u001e\u0010\u009f\u0001\u001a\u00070\u009e\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001e\u0010¢\u0001\u001a\u00070¡\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "", "did", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "callback", "", "remoteStartSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "", DailyRecordKey.sportType, "startSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "pauseSport", "resumeSport", "finishSport", "sportRequestData", "Ljava/lang/Class;", "clazz", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/Class;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;)V", "removeSportStateChangedListener", "(Ljava/lang/Class;)V", "deviceModelDid", "accidentFinishSport", "restartSport", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()Lkotlin/Unit;", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)Lkotlin/Unit;", "onStopSport", "removeRecoverSport", "isAppAloneLaunch", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "getMinValidDistance", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "ftpTest", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "ftpPercentRpm", "setGymFtpPercentRpm", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "pace", "setGymPace", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "getSportReportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "Lotc;", "setLocalLaunchSportListener", "(Lotc;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRecoverData;", "getRecoverSport", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRecoverData;", "syncRecoverSport", "()V", "abnormalChangeSportStateToFinish", "Lj7r;", "isSupportLaunchSport", "(ILj7r;)V", "bool", "setAutoPase", "(Z)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "setSportSyncDataListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "setLocalReceiveListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IFtpStateListener;", "setFtpStateReceiveListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IFtpStateListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;)V", "(I)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "isBackgroundProcessAlive", "startSportRemind", "getSportStateFromAppAndDevice", "appLaunchType", "setGymAppLaunchType", "updateSportStateData", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;)V", "isConnected", "connectChanged", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "isSportValid", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)Z", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "TAG$1", "Ljava/lang/String;", "TAG", "sportStateChangedListenerName", "Lisc;", "<set-?>", "mSportState$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMSportState", "()Lisc;", "setMSportState", "(Lisc;)V", "mSportState", "Landroid/util/ArrayMap;", "mSportStateChangedListenerArrayMap$delegate", "Lkotlin/Lazy;", "getMSportStateChangedListenerArrayMap", "()Landroid/util/ArrayMap;", "mSportStateChangedListenerArrayMap", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$StateNotifyListener;", "stateNotifyListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$StateNotifyListener;", "Lcom/xiaomi/fitness/sport_eco_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "appAndDeviceSportStateNotifyListener$delegate", "getAppAndDeviceSportStateNotifyListener", "()Lcom/xiaomi/fitness/sport_eco_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "appAndDeviceSportStateNotifyListener", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$SyncDataListener;", "remoteDataSyncListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$SyncDataListener;", "dataSyncListener", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "Ljava/lang/ref/WeakReference;", "lockListener", "Ljava/lang/ref/WeakReference;", "ftpStateListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$LockListener;", "remoteLockListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$LockListener;", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$FtpStateListener;", "remoteFtpStateListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$FtpStateListener;", "<init>", "Companion", "StateNotifyListener", "SyncDataListener", "LockListener", "FtpStateListener", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoSportStateCaller implements IEcoSportRemoteState {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoSportStateCaller.class, "mSportState", "getMSportState()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteStateApi;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<EcoSportStateCaller> M_INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: oy7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSportStateCaller.M_INSTANCE_delegate$lambda$7();
        }
    });

    @NotNull
    private static final String TAG = "SportStateCaller";

    @Nullable
    private ISportSyncDataListener dataSyncListener;

    @Nullable
    private WeakReference<IFtpStateListener> ftpStateListener;

    @Nullable
    private WeakReference<ILockListener> lockListener;

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "EcoSportStateCaller";

    @NotNull
    private final String sportStateChangedListenerName = "EcoSportStateCaller";

    /* JADX INFO: renamed from: mSportState$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mSportState = new BinderDelegate("IEcoSportRemoteStateApi");

    /* JADX INFO: renamed from: mSportStateChangedListenerArrayMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSportStateChangedListenerArrayMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: py7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSportStateCaller.mSportStateChangedListenerArrayMap_delegate$lambda$0();
        }
    });

    @NotNull
    private StateNotifyListener stateNotifyListener = new StateNotifyListener();

    /* JADX INFO: renamed from: appAndDeviceSportStateNotifyListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appAndDeviceSportStateNotifyListener = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qy7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSportStateCaller.appAndDeviceSportStateNotifyListener_delegate$lambda$1();
        }
    });

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final SyncDataListener remoteDataSyncListener = new SyncDataListener();

    @NotNull
    private LockListener remoteLockListener = new LockListener();

    @NotNull
    private FtpStateListener remoteFtpStateListener = new FtpStateListener();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$Companion;", "", "<init>", "()V", "TAG", "", "M_INSTANCE", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;", "getM_INSTANCE", "()Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;", "M_INSTANCE$delegate", "Lkotlin/Lazy;", "get", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final EcoSportStateCaller getM_INSTANCE() {
            return (EcoSportStateCaller) EcoSportStateCaller.M_INSTANCE$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final EcoSportStateCaller get() {
            return getM_INSTANCE();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$FtpStateListener;", "Lpsc$a;", "", "ftpStateDataJson", "", "onFtpStateChange", "(Ljava/lang/String;)V", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FtpStateListener extends psc.a {
        public FtpStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFtpStateChange$lambda$0(EcoSportStateCaller this$0, String ftpStateDataJson) {
            IFtpStateListener iFtpStateListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(ftpStateDataJson, "$ftpStateDataJson");
            WeakReference weakReference = this$0.ftpStateListener;
            if (weakReference == null || (iFtpStateListener = (IFtpStateListener) weakReference.get()) == null) {
                return;
            }
            iFtpStateListener.onFtpStateChange(ftpStateDataJson);
        }

        @Override // defpackage.psc
        public void onFtpStateChange(@NotNull final String ftpStateDataJson) {
            Intrinsics.checkNotNullParameter(ftpStateDataJson, "ftpStateDataJson");
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.b
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.FtpStateListener.onFtpStateChange$lambda$0(ecoSportStateCaller, ftpStateDataJson);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$LockListener;", "Lbsc$a;", "", "isHasLock", "", "lockCode", "", "onLock", "(ZI)V", "code", "ecoDeviceFault", "(I)V", "isDynamicMode", "onModeSwitch", "(Z)V", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LockListener extends bsc.a {
        public LockListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ecoDeviceFault$lambda$1(EcoSportStateCaller this$0, int i) {
            ILockListener iLockListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WeakReference weakReference = this$0.lockListener;
            if (weakReference == null || (iLockListener = (ILockListener) weakReference.get()) == null) {
                return;
            }
            iLockListener.ecoDeviceFault(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLock$lambda$0(EcoSportStateCaller this$0, boolean z, int i) {
            ILockListener iLockListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WeakReference weakReference = this$0.lockListener;
            if (weakReference == null || (iLockListener = (ILockListener) weakReference.get()) == null) {
                return;
            }
            iLockListener.onLock(z, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onModeSwitch$lambda$2(EcoSportStateCaller this$0, boolean z) {
            ILockListener iLockListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WeakReference weakReference = this$0.lockListener;
            if (weakReference == null || (iLockListener = (ILockListener) weakReference.get()) == null) {
                return;
            }
            iLockListener.onModeSwitch(z);
        }

        @Override // defpackage.bsc
        public void ecoDeviceFault(final int code) {
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.e
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.LockListener.ecoDeviceFault$lambda$1(ecoSportStateCaller, code);
                }
            });
        }

        @Override // defpackage.bsc
        public void onLock(final boolean isHasLock, final int lockCode) {
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.d
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.LockListener.onLock$lambda$0(ecoSportStateCaller, isHasLock, lockCode);
                }
            });
        }

        @Override // defpackage.bsc
        public void onModeSwitch(final boolean isDynamicMode) {
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.c
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.LockListener.onModeSwitch$lambda$2(ecoSportStateCaller, isDynamicMode);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$StateNotifyListener;", "Lesc$a;", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "", "onSportStarted", "(IIII)V", "onSportRestarted", "()V", "onSportPaused", "", "validSport", "onSportFinished", "(Z)V", "onSportRested", "onSportShutdown", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nEcoSportStateCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoSportStateCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$StateNotifyListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,720:1\n216#2,2:721\n216#2,2:723\n216#2,2:725\n216#2,2:727\n216#2,2:729\n216#2,2:731\n*S KotlinDebug\n*F\n+ 1 EcoSportStateCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$StateNotifyListener\n*L\n522#1:721,2\n532#1:723,2\n544#1:725,2\n556#1:727,2\n565#1:729,2\n574#1:731,2\n*E\n"})
    public final class StateNotifyListener extends esc.a {
        public StateNotifyListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportFinished$lambda$7(EcoSportStateCaller this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportFinished(z, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportPaused$lambda$5(EcoSportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportPaused();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportRestarted$lambda$3(EcoSportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportRestarted();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportRested$lambda$9(EcoSportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportRested();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportShutdown$lambda$11(EcoSportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportShutdown();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportStarted$lambda$1(EcoSportStateCaller this$0, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportStarted(i, i2, i3, i4);
            }
        }

        @Override // defpackage.esc
        public void onSportFinished(final boolean validSport) {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportFinished callback success, sport validSport " + validSport);
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.h
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportFinished$lambda$7(ecoSportStateCaller, validSport);
                }
            });
        }

        @Override // defpackage.esc
        public void onSportPaused() {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportPaused callback success , mSportStateChangedListenerArrayMap :" + EcoSportStateCaller.this.getMSportStateChangedListenerArrayMap().size() + " , this: " + this);
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.k
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportPaused$lambda$5(ecoSportStateCaller);
                }
            });
        }

        @Override // defpackage.esc
        public void onSportRestarted() {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportRestarted callback success");
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.f
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportRestarted$lambda$3(ecoSportStateCaller);
                }
            });
        }

        @Override // defpackage.esc
        public void onSportRested() {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportRested callback success");
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.j
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportRested$lambda$9(ecoSportStateCaller);
                }
            });
        }

        @Override // defpackage.esc
        public void onSportShutdown() {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportShutdown callback success");
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.i
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportShutdown$lambda$11(ecoSportStateCaller);
                }
            });
        }

        @Override // defpackage.esc
        public void onSportStarted(final int startTime, final int timeZone, final int sportType, final int sportLaunchType) {
            FitnessLogUtils.d(EcoSportStateCaller.this.TAG, "onSportStarted callback success , startTime : " + startTime + " , timeZone : " + timeZone + " ,sportType : " + sportType + " ,sportLaunchType:" + sportLaunchType);
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.g
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.StateNotifyListener.onSportStarted$lambda$1(ecoSportStateCaller, startTime, timeZone, sportType, sportLaunchType);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$SyncDataListener;", "Lfsc$a;", "", "result", "isAppLaunch", "", "deviceStartTime", "", "onSync", "(ZZI)V", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SyncDataListener extends fsc.a {
        public SyncDataListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSync$lambda$0(EcoSportStateCaller this$0, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            FitnessLogUtils.i(this$0.TAG, "dataSyncListener: " + this$0.dataSyncListener);
            ISportSyncDataListener iSportSyncDataListener = this$0.dataSyncListener;
            if (iSportSyncDataListener != null) {
                iSportSyncDataListener.onSync(z, z2, i);
            }
        }

        @Override // defpackage.fsc
        public void onSync(final boolean result, final boolean isAppLaunch, final int deviceStartTime) {
            Handler handler = EcoSportStateCaller.this.handler;
            final EcoSportStateCaller ecoSportStateCaller = EcoSportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.l
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.SyncDataListener.onSync$lambda$0(ecoSportStateCaller, result, isAppLaunch, deviceStartTime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller$finishSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$finishSport$1", "Lew7$a;", "", "responseCode", "", "call", "(I)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC31801 extends ew7.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;

        public BinderC31801(int i, Ref.ObjectRef<String> objectRef, WeakReference<RequestCallback> weakReference) {
            this.$sportType = i;
            this.$sid = objectRef;
            this.$weak = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(WeakReference weak, int i) {
            Intrinsics.checkNotNullParameter(weak, "$weak");
            RequestCallback requestCallback = (RequestCallback) weak.get();
            if (requestCallback != null) {
                requestCallback.call(i);
            }
        }

        @Override // defpackage.ew7
        public void call(final int responseCode) {
            FitnessLogUtils.i(EcoSportStateCaller.this.TAG, "finishSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = EcoSportStateCaller.this.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: sy7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.BinderC31801.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller$pauseSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$pauseSport$1", "Lew7$a;", "", "responseCode", "", "call", "(I)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC31811 extends ew7.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;
        final /* synthetic */ EcoSportStateCaller this$0;

        public BinderC31811(int i, Ref.ObjectRef<String> objectRef, EcoSportStateCaller ecoSportStateCaller, WeakReference<RequestCallback> weakReference) {
            this.$sportType = i;
            this.$sid = objectRef;
            this.this$0 = ecoSportStateCaller;
            this.$weak = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(WeakReference weak, int i) {
            Intrinsics.checkNotNullParameter(weak, "$weak");
            RequestCallback requestCallback = (RequestCallback) weak.get();
            if (requestCallback != null) {
                requestCallback.call(i);
            }
        }

        @Override // defpackage.ew7
        public void call(final int responseCode) {
            FitnessLogUtils.i(EcoSportStateCaller.TAG, "pauseSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = this.this$0.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: ty7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.BinderC31811.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller$remoteStartSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$remoteStartSport$1", "Lew7$a;", "", "responseCode", "", "call", "(I)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC31821 extends ew7.a {
        final /* synthetic */ String $did;
        final /* synthetic */ SportRequestData $requestData;
        final /* synthetic */ WeakReference<RequestCallback> $weak;
        final /* synthetic */ EcoSportStateCaller this$0;

        public BinderC31821(SportRequestData sportRequestData, String str, EcoSportStateCaller ecoSportStateCaller, WeakReference<RequestCallback> weakReference) {
            this.$requestData = sportRequestData;
            this.$did = str;
            this.this$0 = ecoSportStateCaller;
            this.$weak = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(WeakReference weak, int i) {
            Intrinsics.checkNotNullParameter(weak, "$weak");
            RequestCallback requestCallback = (RequestCallback) weak.get();
            if (requestCallback != null) {
                requestCallback.call(i);
            }
        }

        @Override // defpackage.ew7
        public void call(final int responseCode) {
            FitnessLogUtils.i(EcoSportStateCaller.TAG, "startSport , sportType : " + this.$requestData.sportType + "  , did : " + this.$did + " , responseCode : " + responseCode);
            Handler handler = this.this$0.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: uy7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.BinderC31821.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller$resumeSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$resumeSport$1", "Lew7$a;", "", "responseCode", "", "call", "(I)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC31841 extends ew7.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;

        public BinderC31841(int i, Ref.ObjectRef<String> objectRef, WeakReference<RequestCallback> weakReference) {
            this.$sportType = i;
            this.$sid = objectRef;
            this.$weak = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(WeakReference weak, int i) {
            Intrinsics.checkNotNullParameter(weak, "$weak");
            RequestCallback requestCallback = (RequestCallback) weak.get();
            if (requestCallback != null) {
                requestCallback.call(i);
            }
        }

        @Override // defpackage.ew7
        public void call(final int responseCode) {
            FitnessLogUtils.i(EcoSportStateCaller.this.TAG, "resumeSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = EcoSportStateCaller.this.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: vy7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.BinderC31841.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/client/EcoSportStateCaller$startSport$1", "Lew7$a;", "", "responseCode", "", "call", "(I)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC31891 extends ew7.a {
        final /* synthetic */ RequestCallback $callback;
        final /* synthetic */ Ref.ObjectRef<String> $sid;

        public BinderC31891(Ref.ObjectRef<String> objectRef, RequestCallback requestCallback) {
            this.$sid = objectRef;
            this.$callback = requestCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(RequestCallback callback, int i) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.call(i);
        }

        @Override // defpackage.ew7
        public void call(final int responseCode) {
            FitnessLogUtils.i(EcoSportStateCaller.this.TAG, "startLocalSport , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = EcoSportStateCaller.this.handler;
            final RequestCallback requestCallback = this.$callback;
            handler.post(new Runnable() { // from class: wy7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportStateCaller.BinderC31891.call$lambda$0(requestCallback, responseCode);
                }
            });
        }
    }

    public EcoSportStateCaller() {
        ServiceConnector.INSTANCE.getBinder(122, new Function1() { // from class: ry7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoSportStateCaller._init_$lambda$2(this.f33056a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoSportStateCaller M_INSTANCE_delegate$lambda$7() {
        return new EcoSportStateCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(EcoSportStateCaller this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        isc.a.asInterface(iBinder);
        this$0.setMSportState(isc.a.asInterface(iBinder));
        Logger.i(this$0.TAG, "SportStateCaller getBinder: mSportState : " + this$0.getMSportState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppAndDeviceSportStateNotifyCaller appAndDeviceSportStateNotifyListener_delegate$lambda$1() {
        return new AppAndDeviceSportStateNotifyCaller();
    }

    @JvmStatic
    @NotNull
    public static final EcoSportStateCaller get() {
        return INSTANCE.get();
    }

    private final AppAndDeviceSportStateNotifyCaller getAppAndDeviceSportStateNotifyListener() {
        return (AppAndDeviceSportStateNotifyCaller) this.appAndDeviceSportStateNotifyListener.getValue();
    }

    private final isc getMSportState() {
        return (isc) this.mSportState.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayMap<Class<?>, ISportStateChangedListener> getMSportStateChangedListenerArrayMap() {
        return (ArrayMap) this.mSportStateChangedListenerArrayMap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayMap mSportStateChangedListenerArrayMap_delegate$lambda$0() {
        return new ArrayMap();
    }

    private final void remoteStartSport(String did, SportRequestData requestData, RequestCallback callback) throws RemoteException {
        WeakReference weakReference = new WeakReference(callback);
        FitnessLogUtils.i(this.TAG, "remoteStartSport , requestData : " + requestData);
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.startSport(did, SportWrapperKt.wrap(requestData), new BinderC31821(requestData, did, this, weakReference));
            return;
        }
        Logger.i(this.TAG, "stratSport , mSportState : " + getMSportState());
    }

    private final void setMSportState(isc iscVar) {
        this.mSportState.setValue((Object) this, $$delegatedProperties[0], iscVar);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void abnormalChangeSportStateToFinish() throws RemoteException {
        FitnessLogUtils.i(this.TAG, "abnormalChangeSportStateToFinish , mSportState : " + getMSportState());
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.abnormalChangeSportStateToFinish();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit accidentFinishSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m599accidentFinishSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void addAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().put(clazz, listener);
        FitnessLogUtils.i(this.TAG, "addAppAndDeviceSportStateListener,add class : " + clazz + " , size : " + getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().size() + " , this : " + this);
        if (getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().size() == 1) {
            isc mSportState = getMSportState();
            if (mSportState != null) {
                mSportState.addAppAndDeviceSportStateListener("AppAndDeviceSportStateNotifyCaller", getAppAndDeviceSportStateNotifyListener());
                return;
            }
            Logger.i(this.TAG, "addAppAndDeviceSportStateListener , mSportState:" + getMSportState());
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void addSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener) throws RemoteException {
        getMSportStateChangedListenerArrayMap().put(clazz, listener);
        FitnessLogUtils.i(this.TAG, "add class : " + clazz + " , size : " + getMSportStateChangedListenerArrayMap().size() + " , this : " + this);
        if (getMSportStateChangedListenerArrayMap().size() == 1) {
            isc mSportState = getMSportState();
            if (mSportState != null) {
                mSportState.addSportStateChangedListener(this.sportStateChangedListenerName, this.stateNotifyListener);
                return;
            }
            Logger.i(this.TAG, "addSportStateChangedListener , mSportState:" + getMSportState());
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public boolean checkSportDoing() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.checkSportDoing();
        }
        Logger.i(this.TAG, "restartSport , mSportState:" + getMSportState());
        return false;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void connectChanged(boolean isConnected) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.connectChanged(isConnected);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void countDownStart(int num, int interval, boolean isNeedStart) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.countDownStart(num, interval, isNeedStart);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit finishSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m600finishSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getAppLaunchType() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getAppLaunchType();
        }
        Logger.i(this.TAG, "restartSport , mSportState:" + getMSportState());
        return 2;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getLocalSportState() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getLocalSportState();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getMinValidDistance() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getMinValidDistance();
        }
        return 100;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @NotNull
    public String getPhoneDid() {
        String phoneDid;
        isc mSportState = getMSportState();
        return (mSportState == null || (phoneDid = mSportState.getPhoneDid()) == null) ? "xiaomiwear_app" : phoneDid;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public SportRecoverData getRecoverSport() {
        isc mSportState = getMSportState();
        return (SportRecoverData) SportWrapperKt.asData(mSportState != null ? mSportState.getRecoverSport() : null);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public long getSportDurationInSec() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportDurationInSec();
        }
        return 0L;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getSportLaunchType() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportLaunchType();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public SportData getSportReportData() {
        isc mSportState = getMSportState();
        return (SportData) SportWrapperKt.asData(mSportState != null ? mSportState.getSportReportData() : null);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getSportState() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportState();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getSportStateFromAppAndDevice() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportStateFromAppAndDevice();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public long getSportTotalDuration() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportTotalDuration();
        }
        return 0L;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public int getSportType() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportType();
        }
        return 1;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public boolean hasOngoingSport() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.hasOngoingSport();
        }
        Logger.i(this.TAG, "hasOngoingSport, mSportState:" + getMSportState());
        return false;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public boolean isAppAloneLaunch() {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.isAppAloneLaunch();
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public boolean isBackgroundProcessAlive() {
        return getMSportState() != null;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @SuppressLint({"SwitchIntDef"})
    public boolean isSportValid(@NotNull PhoneSportData phoneSportData) {
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        FitnessLogUtils.i(this.TAG, "isSportValid sportType = " + phoneSportData.sportType);
        int i = phoneSportData.sportType;
        if (i != 8) {
            if (i != 14) {
                if (phoneSportData.distance < 100) {
                    return false;
                }
            } else if (phoneSportData.jumpDuration < 30) {
                return false;
            }
        } else if (phoneSportData.duration < 60) {
            return false;
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void isSupportLaunchSport(int sportType, @NotNull j7r callback) {
        EcoDeviceModel ecoDeviceModel;
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        if (EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel() == 0) {
            callback.a(Boolean.FALSE);
            return;
        }
        j7r j7rVar = (j7r) new WeakReference(callback).get();
        if (j7rVar == null || (ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null) {
            return;
        }
        DeviceModelExtKt.isSupportLaunchSport(ecoDeviceModel, sportType, j7rVar);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit onDestroy(@Nullable String deviceModelDid) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.onDestroy(deviceModelDid);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit onStopSport() throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.onStopSport();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit pauseSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m601pauseSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void refreshSportRemind(int sportType, @Nullable GoalRemindData goalRemindData) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.refreshSportRemind(sportType, SportWrapperKt.wrap(goalRemindData));
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void removeAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().remove(clazz);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit removeRecoverSport() throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.removeRecoverSport();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void removeSportStateChangedListener(@Nullable Class<?> clazz) {
        getMSportStateChangedListenerArrayMap().remove(clazz);
        FitnessLogUtils.i(this.TAG, "remove class : " + clazz + " , size : " + getMSportStateChangedListenerArrayMap().size() + " , this : " + this);
        getMSportStateChangedListenerArrayMap().size();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit restartSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m602restartSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit resumeSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m603resumeSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setAutoPase(boolean bool) throws RemoteException {
        FitnessLogUtils.i(this.TAG, "setAutoPase , mSportState : " + getMSportState() + " , setAutoPause : " + bool);
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setAutoPause(bool);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setFtpStateReceiveListener(@Nullable IFtpStateListener listener) throws RemoteException {
        this.ftpStateListener = new WeakReference<>(listener);
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setFtpStateReceiveListener(this.remoteFtpStateListener);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setGymAppLaunchType(int appLaunchType) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setGymAppLaunchType(appLaunchType);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit setGymFtpPercentRpm(int ftpPercentRpm, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymFtpPercentRpm(ftpPercentRpm, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.setGymFtpPercentRpm.1
            @Override // defpackage.ew7
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit setGymFtpTest(boolean ftpTest, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymFtpTest(ftpTest, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.setGymFtpTest.1
            @Override // defpackage.ew7
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit setGymPace(int pace, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymPace(pace, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.setGymPace.1
            @Override // defpackage.ew7
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit setGymSpeed(float speed, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymSpeed(speed, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.setGymSpeed.1
            @Override // defpackage.ew7
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setLocalLaunchSportListener(@NotNull otc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setLocalReceiveListener(@Nullable ILockListener listener) throws RemoteException {
        this.lockListener = new WeakReference<>(listener);
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setLocalReceiveListener(this.remoteLockListener);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void setSportSyncDataListener(@Nullable ISportSyncDataListener listener) throws RemoteException {
        this.dataSyncListener = listener;
        FitnessLogUtils.i(this.TAG, "setSportSyncDataListener:" + listener);
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setSportSyncDataListener(this.remoteDataSyncListener);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public /* bridge */ /* synthetic */ Unit startSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m604startSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void startSportRemind(int sportType) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.startSportRemind(sportType);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit syncLocalDeviceSportStatus() throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.syncLocalDeviceSportStatus();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void syncRecoverSport() throws RemoteException {
        FitnessLogUtils.i(this.TAG, "syncRecoverSport , mSportState : " + getMSportState());
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.syncRecoverSport();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    @Nullable
    public Unit syncWearSportStatus() throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.syncWearSportStatus();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void updateSportStateData(@NotNull SportRequestData requestData) throws RemoteException {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.updateSportStateData(SportWrapperKt.wrap(requestData));
        }
    }

    /* JADX INFO: renamed from: accidentFinishSport, reason: collision with other method in class */
    public void m599accidentFinishSport(@Nullable String deviceModelDid, int sportType, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.accidentFinishSport(deviceModelDid, sportType, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.accidentFinishSport.1
                @Override // defpackage.ew7
                public void call(int responseCode) {
                    callback.call(responseCode);
                }
            });
            return;
        }
        Logger.i(this.TAG, "accidentFinishSport , mSportState:" + getMSportState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: finishSport, reason: collision with other method in class */
    public void m600finishSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel != null && !ecoDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.finishSport((String) objectRef.element, sportType, new BinderC31801(sportType, objectRef, weakReference));
            return;
        }
        FitnessLogUtils.i(this.TAG, "finishSport , mSportState:" + getMSportState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: pauseSport, reason: collision with other method in class */
    public void m601pauseSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel != null && !ecoDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.pauseSport((String) objectRef.element, sportType, new BinderC31811(sportType, objectRef, this, weakReference));
            return;
        }
        Logger.i(this.TAG, "pauseSport , mSportState:" + getMSportState());
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void refreshSportRemind(int sportType) throws RemoteException {
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.refreshSportRemind(sportType, null);
        }
    }

    /* JADX INFO: renamed from: restartSport, reason: collision with other method in class */
    public void m602restartSport(@Nullable String deviceModelDid, int sportType, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i(this.TAG, "restartSport()");
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.restartSport(deviceModelDid, sportType, new ew7.a() { // from class: com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller.restartSport.1
                @Override // defpackage.ew7
                public void call(int responseCode) {
                    callback.call(responseCode);
                }
            });
            return;
        }
        Logger.i(this.TAG, "restartSport , mSportState:" + getMSportState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: resumeSport, reason: collision with other method in class */
    public void m603resumeSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        WeakReference weakReference = new WeakReference(callback);
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel != null && !ecoDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        isc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.resumeSport((String) objectRef.element, sportType, new BinderC31841(sportType, objectRef, weakReference));
            return;
        }
        Logger.i(this.TAG, "resumeSport , mSportState:" + getMSportState());
    }

    /* JADX INFO: renamed from: startSport, reason: collision with other method in class */
    public void m604startSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did == null ? "" : did);
        if (ecoDeviceModel != null && !ecoDeviceModel.getIsDeviceConnected()) {
            did = "";
        }
        SportRequestData sportRequestDataJ = new SportRequestData.a().s(sportType).j();
        Intrinsics.checkNotNull(sportRequestDataJ);
        remoteStartSport(did, sportRequestDataJ, callback);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void removeSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener) {
        if (Intrinsics.areEqual(getMSportStateChangedListenerArrayMap().get(clazz), listener)) {
            removeSportStateChangedListener(clazz);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState
    public void startSport(@Nullable String did, @NotNull SportRequestData sportRequestData, @NotNull RequestCallback callback) throws RemoteException {
        EcoDeviceModel localDeviceModel;
        Intrinsics.checkNotNullParameter(sportRequestData, "sportRequestData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        String str = did;
        if (did == 0) {
            str = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(str);
        if (deviceModelByDid != null && !deviceModelByDid.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        boolean zIsLocal = sportDeviceModel.isLocal(deviceModelByDid);
        FitnessLogUtils.i(this.TAG, "startSport , did : " + objectRef.element + " , isLocalDevice : " + zIsLocal + " , deviceModel : " + deviceModelByDid + " , mSportState: " + getMSportState());
        if (sportRequestData.sportType != 0) {
            String str2 = (String) objectRef.element;
            if (str2 != null && (!StringsKt__StringsKt.isBlank(str2)) && zIsLocal && (localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE())) != null && localDeviceModel.getIsDeviceConnected()) {
                isc mSportState = getMSportState();
                if (mSportState != null) {
                    mSportState.startLocalSport((String) objectRef.element, SportWrapperKt.wrap(sportRequestData), new BinderC31891(objectRef, callback));
                    return;
                }
                return;
            }
            remoteStartSport((String) objectRef.element, sportRequestData, callback);
            return;
        }
        throw new RuntimeException("startSport , sportType is none");
    }
}
