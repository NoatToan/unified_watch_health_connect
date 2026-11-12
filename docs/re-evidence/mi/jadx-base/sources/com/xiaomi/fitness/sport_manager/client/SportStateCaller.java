package com.xiaomi.fitness.sport_manager.client;

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
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.client.SportStateCaller;
import com.xiaomi.fitness.sport_manager.client.data.AppAndDeviceSportStateNotifyCaller;
import com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport_manager.location.BackgroundLocationPermissionKt;
import com.xiaomi.fitness.sport_manager.server.SportStateServer;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import defpackage.czc;
import defpackage.hxc;
import defpackage.i7r;
import defpackage.ixc;
import defpackage.jxc;
import defpackage.nkk;
import defpackage.ntc;
import defpackage.ptc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ¯\u00012\u00020\u0001:\b¯\u0001°\u0001±\u0001²\u0001B\n\b\u0007¢\u0006\u0005\b®\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0016\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u0019\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u0019\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ)\u0010\u001e\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#H\u0016¢\u0006\u0004\b,\u0010-J'\u0010,\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u0010(J)\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u0017J)\u00100\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010\u0017J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u00102J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00102J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b>\u0010=J\u001b\u0010?\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bA\u0010=J\u0011\u0010B\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u000203H\u0016¢\u0006\u0004\bC\u00105J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u00102J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u00102J\u000f\u0010F\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u000209H\u0016¢\u0006\u0004\bH\u0010;J\u0019\u0010J\u001a\u0002032\b\u0010I\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000fH\u0016¢\u0006\u0004\bL\u00102J!\u0010O\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\u0004\u0018\u00010\u00022\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010SJ\u0011\u0010U\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00022\u0006\u0010&\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YJ\u0011\u0010[\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0002H\u0016¢\u0006\u0004\b]\u0010\u0004J\u000f\u0010^\u001a\u00020\u0002H\u0016¢\u0006\u0004\b^\u0010\u0004J\u001f\u0010`\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00022\u0006\u0010b\u001a\u000203H\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bi\u0010jJ!\u0010m\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010l\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010m\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010\u0012J'\u0010r\u001a\u00020\u00022\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u000f2\u0006\u0010q\u001a\u000203H\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u000203H\u0016¢\u0006\u0004\bt\u00105J\u0017\u0010u\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\bu\u0010\u0012J\u000f\u0010v\u001a\u00020\u000fH\u0016¢\u0006\u0004\bv\u00102J\u0017\u0010x\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u000fH\u0016¢\u0006\u0004\bx\u0010\u0012J\u0017\u0010{\u001a\u0002032\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J#\u0010}\u001a\u00020\u00022\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b}\u0010(J#\u0010~\u001a\u00020\u00022\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b~\u0010(J\u000f\u0010\u007f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u007f\u00102J\u0019\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0080\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00058\u0002X\u0082D¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00058\u0002X\u0082D¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R9\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R1\u0010\u0095\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0004\u0012\u00020%0\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u0097\u0001\u001a\u00070\u0096\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0092\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u00070¡\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\"\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u00020h\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001e\u0010ª\u0001\u001a\u00070©\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "", "initTask", "()V", "", "did", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;", "callback", "remoteStartSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "checkBbLocationPermission", "abnormalChangeSportStateToPause", "", "adujustmentDis", "hadAdjustmentDistance", "(I)V", "vibrateLevel", "shake", DailyRecordKey.sportType, "pauseSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "resumeSport", "finishSport", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "sportRequestData", "startSport", FitnessRecordKey.segmentType, "nextSegmentType", "segmentSport", "(II)V", "Ljava/lang/Class;", "clazz", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/Class;Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "setSportReportDataListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;)V", "removeSportStateChangedListener", "(Ljava/lang/Class;)V", "deviceModelDid", "accidentFinishSport", "restartSport", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()Lkotlin/Unit;", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)Lkotlin/Unit;", "onStopSport", "removeRecoverSport", "isAppAloneLaunch", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "model", "isEcgDevice", "(Ljava/lang/String;)Z", "getMinValidDistance", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "pace", "setGymPace", "(ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "getSportReportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "Lntc;", "setLocalLaunchSportListener", "(Lntc;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRecoverData;", "getRecoverSport", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportRecoverData;", "syncRecoverSport", "abnormalChangeSportStateToFinish", "Li7r;", "isSupportLaunchSport", "(ILi7r;)V", "bool", "setAutoPase", "(Z)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "setSportSyncDataListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ILockListener;", "setLocalReceiveListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ILockListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "isBackgroundProcessAlive", "startSportRemind", "getSportStateFromAppAndDevice", "appLaunchType", "setGymAppLaunchType", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "isSportValid", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)Z", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "getRouteMatchResult", "", "getWholeKiloPaceList", "()Ljava/util/List;", "TAG$1", "Ljava/lang/String;", "TAG", "sportStateChangedListenerName", "Lczc;", "<set-?>", "mSportState$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMSportState", "()Lczc;", "setMSportState", "(Lczc;)V", "mSportState", "Landroid/util/ArrayMap;", "mSportStateChangedListenerArrayMap$delegate", "Lkotlin/Lazy;", "getMSportStateChangedListenerArrayMap", "()Landroid/util/ArrayMap;", "mSportStateChangedListenerArrayMap", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$StateNotifyListener;", "stateNotifyListener", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$StateNotifyListener;", "Lcom/xiaomi/fitness/sport_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "appAndDeviceSportStateNotifyListener$delegate", "getAppAndDeviceSportStateNotifyListener", "()Lcom/xiaomi/fitness/sport_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "appAndDeviceSportStateNotifyListener", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$SyncDataListener;", "remoteDataSyncListener", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$SyncDataListener;", "dataSyncListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "Ljava/lang/ref/WeakReference;", "lockListener", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$LockListener;", "remoteLockListener", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$LockListener;", "iSportReportDataListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "<init>", "Companion", "StateNotifyListener", "SyncDataListener", "LockListener", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStateCaller implements ISportRemoteState {

    @NotNull
    private static final String TAG = "SportStateCaller";

    @Nullable
    private ISportSyncDataListener dataSyncListener;

    @Nullable
    private ISportReportDataListener iSportReportDataListener;

    @Nullable
    private WeakReference<ILockListener> lockListener;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportStateCaller.class, "mSportState", "getMSportState()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteStateApi;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SportStateCaller> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: q1o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportStateCaller.mInstance_delegate$lambda$7();
        }
    });

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = TAG;

    @NotNull
    private final String sportStateChangedListenerName = TAG;

    /* JADX INFO: renamed from: mSportState$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mSportState = new BinderDelegate("ISportRemoteStateApi");

    /* JADX INFO: renamed from: mSportStateChangedListenerArrayMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSportStateChangedListenerArrayMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r1o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportStateCaller.mSportStateChangedListenerArrayMap_delegate$lambda$0();
        }
    });

    @NotNull
    private StateNotifyListener stateNotifyListener = new StateNotifyListener();

    /* JADX INFO: renamed from: appAndDeviceSportStateNotifyListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appAndDeviceSportStateNotifyListener = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s1o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportStateCaller.appAndDeviceSportStateNotifyListener_delegate$lambda$1();
        }
    });

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final SyncDataListener remoteDataSyncListener = new SyncDataListener();

    @NotNull
    private LockListener remoteLockListener = new LockListener();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$Companion;", "", "<init>", "()V", "TAG", "", "mInstance", "Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;", "getMInstance", "()Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SportStateCaller getMInstance() {
            return (SportStateCaller) SportStateCaller.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final SportStateCaller get() {
            return getMInstance();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$LockListener;", "Lptc$a;", "", "isHasLock", "", "lockCode", "", "onLock", "(ZI)V", "<init>", "(Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LockListener extends ptc.a {
        public LockListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLock$lambda$0(SportStateCaller this$0, boolean z, int i) {
            ILockListener iLockListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WeakReference weakReference = this$0.lockListener;
            if (weakReference == null || (iLockListener = (ILockListener) weakReference.get()) == null) {
                return;
            }
            iLockListener.onLock(z, i);
        }

        @Override // defpackage.ptc
        public void onLock(final boolean isHasLock, final int lockCode) {
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.d
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.LockListener.onLock$lambda$0(sportStateCaller, isHasLock, lockCode);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$StateNotifyListener;", "Lixc$a;", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "", "onSportStarted", "(IIIII)V", "onSportRestarted", "()V", "onSportPaused", "", "validSport", "onSportFinished", "(Z)V", "<init>", "(Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportStateCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportStateCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportStateCaller$StateNotifyListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,707:1\n216#2,2:708\n216#2,2:710\n216#2,2:712\n216#2,2:714\n*S KotlinDebug\n*F\n+ 1 SportStateCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportStateCaller$StateNotifyListener\n*L\n564#1:708,2\n574#1:710,2\n586#1:712,2\n598#1:714,2\n*E\n"})
    public final class StateNotifyListener extends ixc.a {
        public StateNotifyListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportFinished$lambda$7(SportStateCaller this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            for (Map.Entry entry : this$0.getMSportStateChangedListenerArrayMap().entrySet()) {
                FitnessLogUtils.i(this$0.TAG, "listener:" + entry.getValue());
                ((ISportStateChangedListener) entry.getValue()).onSportFinished(z, null, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportPaused$lambda$5(SportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportPaused();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportRestarted$lambda$3(SportStateCaller this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportRestarted();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSportStarted$lambda$1(SportStateCaller this$0, int i, int i2, int i3, int i4, int i5) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.getMSportStateChangedListenerArrayMap().entrySet().iterator();
            while (it.hasNext()) {
                ((ISportStateChangedListener) ((Map.Entry) it.next()).getValue()).onSportStarted(i, i2, i3, i4, i5);
            }
        }

        @Override // defpackage.ixc
        public void onSportFinished(final boolean validSport) {
            FitnessLogUtils.i(SportStateCaller.this.TAG, "onSportFinished callback success, sport validSport " + validSport);
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.g
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.StateNotifyListener.onSportFinished$lambda$7(sportStateCaller, validSport);
                }
            });
        }

        @Override // defpackage.ixc
        public void onSportPaused() {
            FitnessLogUtils.d(SportStateCaller.this.TAG, "onSportPaused callback success , mSportStateChangedListenerArrayMap :" + SportStateCaller.this.getMSportStateChangedListenerArrayMap().size() + " , this: " + this);
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.f
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.StateNotifyListener.onSportPaused$lambda$5(sportStateCaller);
                }
            });
        }

        @Override // defpackage.ixc
        public void onSportRestarted() {
            FitnessLogUtils.d(SportStateCaller.this.TAG, "onSportRestarted callback success");
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.e
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.StateNotifyListener.onSportRestarted$lambda$3(sportStateCaller);
                }
            });
        }

        @Override // defpackage.ixc
        public void onSportStarted(final int code, final int startTime, final int timeZone, final int sportType, final int sportLaunchType) {
            FitnessLogUtils.d(SportStateCaller.this.TAG, "onSportStarted callback success , startTime : " + startTime + " , timeZone : " + timeZone + " ,sportType : " + sportType + " ,sportLaunchType:" + sportLaunchType);
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.h
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.StateNotifyListener.onSportStarted$lambda$1(sportStateCaller, code, startTime, timeZone, sportType, sportLaunchType);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller$SyncDataListener;", "Ljxc$a;", "", "result", "isAppLaunch", "", "deviceStartTime", "", "onSync", "(ZZI)V", "<init>", "(Lcom/xiaomi/fitness/sport_manager/client/SportStateCaller;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SyncDataListener extends jxc.a {
        public SyncDataListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSync$lambda$0(SportStateCaller this$0, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ISportSyncDataListener iSportSyncDataListener = this$0.dataSyncListener;
            if (iSportSyncDataListener != null) {
                iSportSyncDataListener.onSync(z, z2, i);
            }
        }

        @Override // defpackage.jxc
        public void onSync(final boolean result, final boolean isAppLaunch, final int deviceStartTime) {
            Handler handler = SportStateCaller.this.handler;
            final SportStateCaller sportStateCaller = SportStateCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.i
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.SyncDataListener.onSync$lambda$0(sportStateCaller, result, isAppLaunch, deviceStartTime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$finishSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$finishSport$1", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC32011 extends nkk.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;

        public BinderC32011(int i, Ref.ObjectRef<String> objectRef, WeakReference<RequestCallback> weakReference) {
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

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.this.TAG, "finishSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = SportStateCaller.this.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: u1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.BinderC32011.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$finishSport$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$finishSport$2", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends nkk.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ WeakReference<RequestCallback> $weak;

        public AnonymousClass2(Ref.ObjectRef<String> objectRef, WeakReference<RequestCallback> weakReference) {
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

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.this.TAG, "finishSport , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = SportStateCaller.this.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: v1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.AnonymousClass2.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$pauseSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$pauseSport$1", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC32021 extends nkk.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;
        final /* synthetic */ SportStateCaller this$0;

        public BinderC32021(int i, Ref.ObjectRef<String> objectRef, SportStateCaller sportStateCaller, WeakReference<RequestCallback> weakReference) {
            this.$sportType = i;
            this.$sid = objectRef;
            this.this$0 = sportStateCaller;
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

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.TAG, "pauseSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = this.this$0.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: w1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.BinderC32021.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$remoteStartSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$remoteStartSport$1", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC32031 extends nkk.a {
        final /* synthetic */ String $did;
        final /* synthetic */ SportRequestData $requestData;
        final /* synthetic */ WeakReference<RequestCallback> $weak;
        final /* synthetic */ SportStateCaller this$0;

        public BinderC32031(SportRequestData sportRequestData, String str, SportStateCaller sportStateCaller, WeakReference<RequestCallback> weakReference) {
            this.$requestData = sportRequestData;
            this.$did = str;
            this.this$0 = sportStateCaller;
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

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.TAG, "startSport , sportType : " + this.$requestData.sportType + "  , did : " + this.$did + " , responseCode : " + responseCode);
            Handler handler = this.this$0.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: x1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.BinderC32031.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$resumeSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$resumeSport$1", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC32051 extends nkk.a {
        final /* synthetic */ Ref.ObjectRef<String> $sid;
        final /* synthetic */ int $sportType;
        final /* synthetic */ WeakReference<RequestCallback> $weak;

        public BinderC32051(int i, Ref.ObjectRef<String> objectRef, WeakReference<RequestCallback> weakReference) {
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

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.this.TAG, "resumeSport , spoetType : " + this.$sportType + "  , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = SportStateCaller.this.handler;
            final WeakReference<RequestCallback> weakReference = this.$weak;
            handler.post(new Runnable() { // from class: y1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.BinderC32051.call$lambda$0(weakReference, responseCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.client.SportStateCaller$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport_manager/client/SportStateCaller$startSport$1", "Lnkk$a;", "", "responseCode", "", "call", "(I)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BinderC32091 extends nkk.a {
        final /* synthetic */ RequestCallback $callback;
        final /* synthetic */ Ref.ObjectRef<String> $sid;

        public BinderC32091(Ref.ObjectRef<String> objectRef, RequestCallback requestCallback) {
            this.$sid = objectRef;
            this.$callback = requestCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(RequestCallback callback, int i) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.call(i);
        }

        @Override // defpackage.nkk
        public void call(final int responseCode) {
            FitnessLogUtils.i(SportStateCaller.this.TAG, "startLocalSport , did : " + ((Object) this.$sid.element) + " , responseCode : " + responseCode);
            Handler handler = SportStateCaller.this.handler;
            final RequestCallback requestCallback = this.$callback;
            handler.post(new Runnable() { // from class: z1o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStateCaller.BinderC32091.call$lambda$0(requestCallback, responseCode);
                }
            });
        }
    }

    public SportStateCaller() {
        ServiceConnector.INSTANCE.getBinder(22, new Function1() { // from class: t1o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportStateCaller._init_$lambda$2(this.f34206a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(SportStateCaller this$0, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        czc czcVarAsInterface = czc.a.asInterface(iBinder);
        if (this$0.getMSportState() == null) {
            this$0.setMSportState(czc.a.asInterface(iBinder));
            if (!(czcVarAsInterface instanceof SportStateServer)) {
                this$0.initTask();
            }
            Logger.i(this$0.TAG, "SportStateCaller getBinder: mSportState : " + this$0.getMSportState());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppAndDeviceSportStateNotifyCaller appAndDeviceSportStateNotifyListener_delegate$lambda$1() {
        return new AppAndDeviceSportStateNotifyCaller();
    }

    @JvmStatic
    @NotNull
    public static final SportStateCaller get() {
        return INSTANCE.get();
    }

    private final AppAndDeviceSportStateNotifyCaller getAppAndDeviceSportStateNotifyListener() {
        return (AppAndDeviceSportStateNotifyCaller) this.appAndDeviceSportStateNotifyListener.getValue();
    }

    private final czc getMSportState() {
        return (czc) this.mSportState.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayMap<Class<?>, ISportStateChangedListener> getMSportStateChangedListenerArrayMap() {
        return (ArrayMap) this.mSportStateChangedListenerArrayMap.getValue();
    }

    private final void initTask() throws RemoteException {
        BackgroundLocationPermissionKt.initBackgroundLocationPermission(getMSportState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportStateCaller mInstance_delegate$lambda$7() {
        return new SportStateCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayMap mSportStateChangedListenerArrayMap_delegate$lambda$0() {
        return new ArrayMap();
    }

    private final void remoteStartSport(String did, SportRequestData requestData, RequestCallback callback) throws RemoteException {
        WeakReference weakReference = new WeakReference(callback);
        FitnessLogUtils.i(this.TAG, "remoteStartSport , requestData : " + requestData);
        SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
        sportManagerPreference.setKEY_START_SPORT_MODE(requestData.accessoryWearMode);
        sportManagerPreference.setKEY_SPORE_HAS_PRE_ROUTE(requestData.hasPreRoute);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.startSport(did, SportWrapperKt.wrap(requestData), new BinderC32031(requestData, did, this, weakReference));
            return;
        }
        Logger.i(this.TAG, "stratSport , mSportState : " + getMSportState());
    }

    private final void setMSportState(czc czcVar) {
        this.mSportState.setValue((Object) this, $$delegatedProperties[0], czcVar);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void abnormalChangeSportStateToFinish() throws RemoteException {
        FitnessLogUtils.i(this.TAG, "abnormalChangeSportStateToFinish , mSportState : " + getMSportState());
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.abnormalChangeSportStateToFinish();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void abnormalChangeSportStateToPause() throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.abnormalChangeSportStateToPause();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public /* bridge */ /* synthetic */ Unit accidentFinishSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m605accidentFinishSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void addAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().put(clazz, listener);
        FitnessLogUtils.i(this.TAG, "addAppAndDeviceSportStateListener,add class : " + clazz + " , size : " + getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().size() + " , this : " + this);
        if (getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().size() == 1) {
            czc mSportState = getMSportState();
            if (mSportState != null) {
                mSportState.addAppAndDeviceSportStateListener("AppAndDeviceSportStateNotifyCaller", getAppAndDeviceSportStateNotifyListener());
                return;
            }
            Logger.i(this.TAG, "addAppAndDeviceSportStateListener , mSportState:" + getMSportState());
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void addSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener) throws RemoteException {
        getMSportStateChangedListenerArrayMap().put(clazz, listener);
        FitnessLogUtils.i(this.TAG, "add class : " + clazz + " , size : " + getMSportStateChangedListenerArrayMap().size() + " , this : " + this);
        if (getMSportStateChangedListenerArrayMap().size() == 1) {
            czc mSportState = getMSportState();
            if (mSportState != null) {
                mSportState.addSportStateChangedListener(this.sportStateChangedListenerName, this.stateNotifyListener);
                return;
            }
            Logger.i(this.TAG, "addSportStateChangedListener , mSportState:" + getMSportState());
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void checkBbLocationPermission() {
        BackgroundLocationPermissionKt.checkBackgroundLocationPermission();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public boolean checkSportDoing() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.checkSportDoing();
        }
        Logger.i(this.TAG, "restartSport , mSportState:" + getMSportState());
        return false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void countDownStart(int num, int interval, boolean isNeedStart) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.countDownStart(num, interval, isNeedStart);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public /* bridge */ /* synthetic */ Unit finishSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m606finishSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getAppLaunchType() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getAppLaunchType();
        }
        Logger.i(this.TAG, "restartSport , mSportState:" + getMSportState());
        return 2;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getLocalSportState() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getLocalSportState();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getMinValidDistance() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getMinValidDistance();
        }
        return 100;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @NotNull
    public String getPhoneDid() {
        String phoneDid;
        czc mSportState = getMSportState();
        return (mSportState == null || (phoneDid = mSportState.getPhoneDid()) == null) ? "xiaomiwear_app" : phoneDid;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public SportRecoverData getRecoverSport() {
        czc mSportState = getMSportState();
        return (SportRecoverData) SportWrapperKt.asData(mSportState != null ? mSportState.getRecoverSport() : null);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getRouteMatchResult() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getRouteMatchResult();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public long getSportDurationInSec() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportDurationInSec();
        }
        return 0L;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getSportLaunchType() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportLaunchType();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public SportData getSportReportData() {
        czc mSportState = getMSportState();
        return (SportData) SportWrapperKt.asData(mSportState != null ? mSportState.getSportReportData() : null);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getSportState() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportState();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getSportStateFromAppAndDevice() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportStateFromAppAndDevice();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public long getSportTotalDuration() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportTotalDuration();
        }
        return 0L;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public int getSportType() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.getSportType();
        }
        return 1;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @NotNull
    public List<Integer> getWholeKiloPaceList() {
        czc mSportState = getMSportState();
        List<Integer> wholeKiloPaceList = mSportState != null ? mSportState.getWholeKiloPaceList() : null;
        Intrinsics.checkNotNull(wholeKiloPaceList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        return wholeKiloPaceList;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void hadAdjustmentDistance(int adujustmentDis) throws RemoteException {
        Logger.i(this.TAG, "hadAdjustmentDistance:" + adujustmentDis);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.hadAdjustmentDistance(adujustmentDis);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public boolean hasOngoingSport() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.hasOngoingSport();
        }
        Logger.i(this.TAG, "hasOngoingSport, mSportState:" + getMSportState());
        return false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public boolean isAppAloneLaunch() {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.isAppAloneLaunch();
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public boolean isBackgroundProcessAlive() {
        return getMSportState() != null;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public boolean isEcgDevice(@Nullable String model) {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            return mSportState.isEcgDevice(model);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @SuppressLint({"SwitchIntDef"})
    public boolean isSportValid(@NotNull PhoneSportData phoneSportData) {
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        if (phoneSportData.sportType == 8) {
            if (phoneSportData.duration < 60) {
                return false;
            }
        } else if (phoneSportData.distance < 100) {
            return false;
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void isSupportLaunchSport(int sportType, @NotNull i7r callback) {
        WearableDeviceModel wearableDeviceModel;
        Intrinsics.checkNotNullParameter(callback, "callback");
        i7r i7rVar = (i7r) new WeakReference(callback).get();
        if (i7rVar == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            return;
        }
        DeviceModelExtKt.isSupportLaunchSport$default(wearableDeviceModel, null, sportType, i7rVar, 1, null);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit onDestroy(@Nullable String deviceModelDid) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.onDestroy(deviceModelDid);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit onStopSport() throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.onStopSport();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public /* bridge */ /* synthetic */ Unit pauseSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m607pauseSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void refreshSportRemind(int sportType, @Nullable GoalRemindData goalRemindData) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.refreshSportRemind(sportType, SportWrapperKt.wrap(goalRemindData));
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void removeAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAppAndDeviceSportStateNotifyListener().getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().remove(clazz);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit removeRecoverSport() throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.removeRecoverSport();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void removeSportStateChangedListener(@Nullable Class<?> clazz) {
        getMSportStateChangedListenerArrayMap().remove(clazz);
        FitnessLogUtils.i(this.TAG, "remove class : " + clazz + " , size : " + getMSportStateChangedListenerArrayMap().size() + " , this : " + this);
        getMSportStateChangedListenerArrayMap().size();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public /* bridge */ /* synthetic */ Unit restartSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m608restartSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public /* bridge */ /* synthetic */ Unit resumeSport(String str, int i, RequestCallback requestCallback) throws RemoteException {
        m609resumeSport(str, i, requestCallback);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void segmentSport(int segmentType, int nextSegmentType) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.segmentSport(segmentType, nextSegmentType);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setAutoPase(boolean bool) throws RemoteException {
        FitnessLogUtils.i(this.TAG, "setAutoPase , mSportState : " + getMSportState() + " , setAutoPause : " + bool);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setAutoPause(bool);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setGymAppLaunchType(int appLaunchType) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setGymAppLaunchType(appLaunchType);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit setGymPace(int pace, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymPace(pace, new nkk.a() { // from class: com.xiaomi.fitness.sport_manager.client.SportStateCaller.setGymPace.1
            @Override // defpackage.nkk
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit setGymSpeed(float speed, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.setGymSpeed(speed, new nkk.a() { // from class: com.xiaomi.fitness.sport_manager.client.SportStateCaller.setGymSpeed.1
            @Override // defpackage.nkk
            public void call(int responseCode) {
                callback.call(responseCode);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setLocalLaunchSportListener(@NotNull ntc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setLocalReceiveListener(@Nullable ILockListener listener) throws RemoteException {
        this.lockListener = new WeakReference<>(listener);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setLocalReceiveListener(this.remoteLockListener);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setSportReportDataListener(@Nullable ISportReportDataListener listener) throws RemoteException {
        FitnessLogUtils.i(this.TAG, "setSportReportDataListener,listener:" + listener);
        this.iSportReportDataListener = listener;
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setSportReportDataListener(new hxc.a() { // from class: com.xiaomi.fitness.sport_manager.client.SportStateCaller.setSportReportDataListener.1
                @Override // defpackage.hxc
                public void onSportReportData(SportWrapper phoneSportData) {
                    SportData sportData = (SportData) SportWrapperKt.asData(phoneSportData);
                    if (sportData != null) {
                        SportStateCaller sportStateCaller = SportStateCaller.this;
                        FitnessLogUtils.i(sportStateCaller.TAG, "sportData:" + sportData + " , listener:" + sportStateCaller.iSportReportDataListener);
                        ISportReportDataListener iSportReportDataListener = sportStateCaller.iSportReportDataListener;
                        if (iSportReportDataListener != null) {
                            iSportReportDataListener.onSportReportData(sportData);
                        }
                    }
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void setSportSyncDataListener(@Nullable ISportSyncDataListener listener) throws RemoteException {
        this.dataSyncListener = listener;
        FitnessLogUtils.i(this.TAG, "setSportSyncDataListener:" + listener);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.setSportSyncDataListener(this.remoteDataSyncListener);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void shake(int vibrateLevel) throws RemoteException {
        Logger.i(this.TAG, "shake:" + vibrateLevel);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.shake(vibrateLevel);
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
    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void startSport(@Nullable String did, @NotNull SportRequestData sportRequestData, @NotNull RequestCallback callback) throws RemoteException {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel;
        Intrinsics.checkNotNullParameter(sportRequestData, "sportRequestData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        String str = did;
        if (did == 0) {
            str = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(str);
        if (deviceModelByDid != null && !deviceModelByDid.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        boolean zIsLocal = sportDeviceModel.isLocal(deviceModelByDid);
        FitnessLogUtils.i(this.TAG, "startSport , did : " + objectRef.element + " , isLocalDevice : " + zIsLocal + " , deviceModel : " + deviceModelByDid + " , mSportState: " + getMSportState() + " , sportRequest:" + sportRequestData);
        if (sportRequestData.sportType == 0) {
            FitnessLogUtils.i(this.TAG, "sportType == none");
            return;
        }
        String str2 = (String) objectRef.element;
        if (str2 == null || !(!StringsKt__StringsKt.isBlank(str2)) || !zIsLocal || (wearableDeviceModelCurGymDeviceModel = sportDeviceModel.curGymDeviceModel()) == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            remoteStartSport((String) objectRef.element, sportRequestData, callback);
            return;
        }
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.startLocalSport((String) objectRef.element, SportWrapperKt.wrap(sportRequestData), new BinderC32091(objectRef, callback));
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void startSportRemind(int sportType) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.startSportRemind(sportType);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit syncLocalDeviceSportStatus() throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.syncLocalDeviceSportStatus();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void syncRecoverSport() throws RemoteException {
        FitnessLogUtils.i(this.TAG, "syncRecoverSport , mSportState : " + getMSportState());
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.syncRecoverSport();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    @Nullable
    public Unit syncWearSportStatus() throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState == null) {
            return null;
        }
        mSportState.syncWearSportStatus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: accidentFinishSport, reason: collision with other method in class */
    public void m605accidentFinishSport(@Nullable String deviceModelDid, int sportType, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.accidentFinishSport(deviceModelDid, sportType, new nkk.a() { // from class: com.xiaomi.fitness.sport_manager.client.SportStateCaller.accidentFinishSport.1
                @Override // defpackage.nkk
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
    public void m606finishSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(str);
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.finishSport((String) objectRef.element, sportType, new BinderC32011(sportType, objectRef, weakReference));
            return;
        }
        Logger.i(this.TAG, "finishSport , mSportState:" + getMSportState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: pauseSport, reason: collision with other method in class */
    public void m607pauseSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(str);
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        FitnessLogUtils.i(this.TAG, "pauseSport, sportType : " + sportType + ", did : " + objectRef.element);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.pauseSport((String) objectRef.element, sportType, new BinderC32021(sportType, objectRef, this, weakReference));
            return;
        }
        Logger.i(this.TAG, "pauseSport , mSportState:" + getMSportState());
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void refreshSportRemind(int sportType) throws RemoteException {
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.refreshSportRemind(sportType, null);
        }
    }

    /* JADX INFO: renamed from: restartSport, reason: collision with other method in class */
    public void m608restartSport(@Nullable String deviceModelDid, int sportType, @NotNull final RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getSportState() == 4 || getSportState() == 0) {
            FitnessLogUtils.i(this.TAG, "cur sportState is finish or idle , can not invoke restart sport");
            return;
        }
        FitnessLogUtils.i(this.TAG, "restartSport() , did:" + deviceModelDid);
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.restartSport(deviceModelDid, sportType, new nkk.a() { // from class: com.xiaomi.fitness.sport_manager.client.SportStateCaller.restartSport.1
                @Override // defpackage.nkk
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
    public void m609resumeSport(@Nullable String did, int sportType, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        WeakReference weakReference = new WeakReference(callback);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String str = did;
        if (did == 0) {
            str = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(str);
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.resumeSport((String) objectRef.element, sportType, new BinderC32051(sportType, objectRef, weakReference));
            return;
        }
        Logger.i(this.TAG, "resumeSport , mSportState:" + getMSportState());
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void removeSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener) {
        if (Intrinsics.areEqual(getMSportStateChangedListenerArrayMap().get(clazz), listener)) {
            removeSportStateChangedListener(clazz);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState
    public void finishSport(@Nullable String did, @NotNull FinishSportData finishSportData, @NotNull RequestCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(finishSportData, "finishSportData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WeakReference weakReference = new WeakReference(callback);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did == 0 ? "" : did);
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            objectRef.element = "";
        }
        czc mSportState = getMSportState();
        if (mSportState != null) {
            mSportState.finishSportWithData(did, SportWrapperKt.wrap(finishSportData), new AnonymousClass2(objectRef, weakReference));
        }
    }
}
