package com.xiaomi.fitness.device.contact;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseIntArray;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.amap.api.maps.model.MyLocationStyle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.DeviceContactImpl;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.contact.export.a;
import com.xiaomi.fitness.device.contact.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal;
import com.xiaomi.fitness.device.contact.syncer.BaseSyncer;
import com.xiaomi.fitness.device.manager.DeviceBasicStatusDataHandler;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.wearable.core.client.IDataHandler;
import defpackage.dsf;
import defpackage.s7r;
import defpackage.szi;
import defpackage.utc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0006\u0088\u0001\u0089\u0001\u008a\u0001B\u0013\b\u0007\u0012\u0006\u0010]\u001a\u00020\\¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0016\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b!\u0010 J)\u0010#\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010$J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00020\u0002¢\u0006\u0004\b5\u0010\u0004J\u0015\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010:J\u001f\u0010;\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010:J\u0017\u00108\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010>J1\u0010C\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010DJ;\u0010C\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010EJ;\u0010C\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010A\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010IJE\u0010C\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010F\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010A\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010JJ\u0017\u0010L\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJE\u0010Q\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010F\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\u0010O\u001a\u0004\u0018\u0001062\u0006\u0010P\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010U\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\n2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\n2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bW\u0010VJ\u0017\u0010W\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020Y2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010q\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010aR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR1\u0010\u0081\u0001\u001a\u0004\u0018\u00010y2\b\u0010z\u001a\u0004\u0018\u00010y8B@BX\u0082\u008e\u0002¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0084\u0001\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020S0\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;", "Lcom/xiaomi/fitness/device/contact/DeviceContactWrapper;", "", "initSyncEngine", "()V", "initSyncer", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "it", "iniSyncer", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "syncType", "", "isForceType", "(I)Z", "", "syncTypes", "initOrResetTypeArray", "(Ljava/util/List;)V", "deviceModel", "isAuto", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "callback", "syncData", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZLcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "originType", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "Lcom/xiaomi/fitness/device/contact/export/a;", "(ILcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)Lcom/xiaomi/fitness/device/contact/export/a;", "isNeedSync", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)Z", "isSyncFinish", "(Ljava/util/List;)Z", "isSyncSuccess", "success", "doOnSyncFinish", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZZ)V", "isSuccess", "syncFinish", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;", "syncer", "addSyncer", "(Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;)V", "removeSyncer", "resultCallBack", "addSyncResultCallback", "(Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "removeSyncResultCallback", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSyncStateListener", "(Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;)V", "removeSyncStateListener", CervicalMucusRecord.Appearance.CLEAR, "", "did", "syncDataAtFixRate", "(Ljava/lang/String;)Z", "(Ljava/lang/String;Z)V", "syncDataByWidget", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isIDLE", "()Z", "Ls7r;", "packet", "needResponse", "timeout", "call", "(Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)V", "(Ljava/lang/String;Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)I", "type", "", "data", "(I[BZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)V", "(Ljava/lang/String;I[BZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)I", "taskId", "cancelTask", "(I)V", "detailType", "path", "segmentLength", "sendFile", "(Ljava/lang/String;IILjava/lang/String;ILcom/xiaomi/fitness/device/contact/export/SyncStateListener;)I", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "dataHandler", "addDataHandler", "(ILcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;)V", "removeDataHandler", "(Ljava/lang/String;)V", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "getDataHandler", "(Ljava/lang/String;)Lcom/xiaomi/wearable/core/client/IDataHandler;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "mWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "", "lastSyncDataTime", "J", "getLastSyncDataTime", "()J", "setLastSyncDataTime", "(J)V", "Landroid/util/SparseIntArray;", "syncTypeArray$delegate", "Lkotlin/Lazy;", "getSyncTypeArray", "()Landroid/util/SparseIntArray;", "syncTypeArray", "mCurrentDeviceModel", "Ljava/lang/String;", "mSyncTypes", "Ljava/util/List;", "mForceSyncTypes", "startSyncTime", "Lcom/xiaomi/fitness/device/contact/SyncObservers;", "syncObservers", "Lcom/xiaomi/fitness/device/contact/SyncObservers;", "getSyncObservers", "()Lcom/xiaomi/fitness/device/contact/SyncObservers;", "setSyncObservers", "(Lcom/xiaomi/fitness/device/contact/SyncObservers;)V", "Lcom/xiaomi/fitness/device/contact/remote/a;", "<set-?>", "mDeviceSyncEngine$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMDeviceSyncEngine", "()Lcom/xiaomi/fitness/device/contact/remote/a;", "setMDeviceSyncEngine", "(Lcom/xiaomi/fitness/device/contact/remote/a;)V", "mDeviceSyncEngine", "Ljava/util/concurrent/ConcurrentHashMap;", "", "mDataHandlers", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;)V", "Companion", "WidgetDeviceSyncCallbackImpl", "DeviceSyncCallbackImpl", "device-contact_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceContactImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceContactImpl.kt\ncom/xiaomi/fitness/device/contact/DeviceContactImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,578:1\n1863#2,2:579\n*S KotlinDebug\n*F\n+ 1 DeviceContactImpl.kt\ncom/xiaomi/fitness/device/contact/DeviceContactImpl\n*L\n177#1:579,2\n*E\n"})
public final class DeviceContactImpl implements DeviceContactWrapper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceContactImpl.class, "mDeviceSyncEngine", "getMDeviceSyncEngine()Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngine;", 0))};
    private static final long REFRESH_DATA_INTERVAL_TIME;
    private static final long REFRESH_DEVICE_LIST_INTERVAL_TIME;
    private static final int SYNC_RESULT_DEFAULT = 0;
    private static final int SYNC_RESULT_FAILURE = -1;
    private static final int SYNC_RESULT_SUCCESS = 1;

    @NotNull
    public static final String TAG = "[DeviceDataSync]";
    private long lastSyncDataTime;

    @Nullable
    private String mCurrentDeviceModel;

    @NotNull
    private final ConcurrentHashMap<Integer, List<DataHandlerWrapper>> mDataHandlers;

    /* JADX INFO: renamed from: mDeviceSyncEngine$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mDeviceSyncEngine;
    private List<Integer> mForceSyncTypes;
    private List<Integer> mSyncTypes;

    @NotNull
    private final WearableDeviceManager mWearableDeviceManager;
    private long startSyncTime;
    public SyncObservers syncObservers;

    /* JADX INFO: renamed from: syncTypeArray$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncTypeArray;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceContactImpl$DeviceSyncCallbackImpl;", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "isAuto", "", "<init>", "(Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;Z)V", "onSyncSuccess", "", "did", "", "type", "", "result", "", "onSyncError", MyLocationStyle.ERROR_INFO, "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DeviceSyncCallbackImpl implements DeviceSyncCallback {
        private final boolean isAuto;

        public DeviceSyncCallbackImpl(boolean z) {
            this.isAuto = z;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("[DeviceDataSync] sync error:" + type + ",did:" + did + ",errorInfo:" + errorInfo + ", thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            DeviceContactTracker.INSTANCE.syncTrack(type, false, did, DeviceContactImpl.this.startSyncTime, errorInfo);
            AnyExtKt.main$default(null, new DeviceContactImpl$DeviceSyncCallbackImpl$onSyncError$1(DeviceContactImpl.this, did, type, this, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncSuccess(@NotNull String did, int type, @Nullable Object result) {
            Intrinsics.checkNotNullParameter(did, "did");
            DeviceContactTracker.INSTANCE.syncTrack(type, true, did, DeviceContactImpl.this.startSyncTime, null);
            Logger.i("[DeviceDataSync] sync success:" + type + ",did:" + did + ",thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            AnyExtKt.main$default(null, new DeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1(DeviceContactImpl.this, did, type, result, this, null), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceContactImpl$WidgetDeviceSyncCallbackImpl;", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "isAuto", "", "<init>", "(Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;Z)V", "onSyncSuccess", "", "did", "", "type", "", "result", "", "onSyncError", MyLocationStyle.ERROR_INFO, "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class WidgetDeviceSyncCallbackImpl implements DeviceSyncCallback {
        private final boolean isAuto;

        public WidgetDeviceSyncCallbackImpl(boolean z) {
            this.isAuto = z;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("[DeviceDataSync] sync error:" + type + ",did:" + did + ",errorInfo:" + errorInfo + ", thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            DeviceContactTracker.INSTANCE.syncTrack(type, false, did, DeviceContactImpl.this.startSyncTime, errorInfo);
            AnyExtKt.io$default(null, new DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncError$1(DeviceContactImpl.this, did, type, this, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncSuccess(@NotNull String did, int type, @Nullable Object result) {
            Intrinsics.checkNotNullParameter(did, "did");
            DeviceContactTracker.INSTANCE.syncTrack(type, true, did, DeviceContactImpl.this.startSyncTime, null);
            Logger.i("[DeviceDataSync] sync success:" + type + ",did:" + did + ",thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            AnyExtKt.io$default(null, new DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1(DeviceContactImpl.this, did, type, result, this, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.DeviceContactImpl$addDataHandler$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactImpl$addDataHandler$1", f = "DeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DataHandlerWrapper $dataHandler;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, DataHandlerWrapper dataHandlerWrapper, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$dataHandler = dataHandlerWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContactImpl.this.new AnonymousClass1(this.$type, this.$dataHandler, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List copyOnWriteArrayList = (List) DeviceContactImpl.this.mDataHandlers.get(Boxing.boxInt(this.$type));
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                DeviceContactImpl.this.mDataHandlers.put(Boxing.boxInt(this.$type), copyOnWriteArrayList);
            }
            if (!copyOnWriteArrayList.contains(this.$dataHandler)) {
                Logger.i(DeviceBasicStatusDataHandler.TAG, "addHandler " + this.$dataHandler);
                copyOnWriteArrayList.add(this.$dataHandler);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.DeviceContactImpl$removeDataHandler$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactImpl$removeDataHandler$1", f = "DeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DataHandlerWrapper $dataHandler;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18891(int i, DataHandlerWrapper dataHandlerWrapper, Continuation<? super C18891> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$dataHandler = dataHandlerWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContactImpl.this.new C18891(this.$type, this.$dataHandler, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) DeviceContactImpl.this.mDataHandlers.get(Boxing.boxInt(this.$type));
            if (list != null) {
                Boxing.boxBoolean(list.remove(this.$dataHandler));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        REFRESH_DEVICE_LIST_INTERVAL_TIME = timeUnit.toMillis(30L);
        REFRESH_DATA_INTERVAL_TIME = timeUnit.toMillis(10L);
    }

    public DeviceContactImpl(@NotNull WearableDeviceManager mWearableDeviceManager) {
        Intrinsics.checkNotNullParameter(mWearableDeviceManager, "mWearableDeviceManager");
        this.mWearableDeviceManager = mWearableDeviceManager;
        this.syncTypeArray = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceContactImpl.syncTypeArray_delegate$lambda$0();
            }
        });
        this.mDeviceSyncEngine = new BinderDelegate("mDeviceSyncEngine");
        this.mDataHandlers = new ConcurrentHashMap<>();
        initSyncEngine();
    }

    private final a callback(final int originType, final OnSyncCallback callback) {
        return new a.AbstractBinderC0414a() { // from class: com.xiaomi.fitness.device.contact.DeviceContactImpl.callback.1
            @Override // com.xiaomi.fitness.device.contact.export.a
            public void onSyncError(String did, int type, int code) {
                AnyExtKt.main$default(null, new DeviceContactImpl$callback$1$onSyncError$1(type, did, code, callback, originType, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.a
            public void onSyncSuccess(String did, int type, SyncResult result) {
                AnyExtKt.main$default(null, new DeviceContactImpl$callback$1$onSyncSuccess$1(type, did, result, callback, originType, null), 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnSyncFinish(WearableDeviceModel deviceModel, boolean isAuto, boolean success) {
        syncFinish(deviceModel, success, isAuto);
    }

    private final com.xiaomi.fitness.device.contact.remote.a getMDeviceSyncEngine() {
        return (com.xiaomi.fitness.device.contact.remote.a) this.mDeviceSyncEngine.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseIntArray getSyncTypeArray() {
        return (SparseIntArray) this.syncTypeArray.getValue();
    }

    private final void iniSyncer(WearableDeviceModel it) {
        BaseSyncer baseSyncer;
        BaseSyncer baseSyncer2;
        DeviceSyncExtKt.logi("initSyncer " + it + "'s syncers, and current device is " + this.mCurrentDeviceModel);
        if (Intrinsics.areEqual(it != null ? it.getDid() : null, this.mCurrentDeviceModel)) {
            return;
        }
        if (it == null) {
            getSyncObservers().clear();
            DeviceSyncExtKt.logi("initSyncer clear syncObservers");
        } else {
            String str = this.mCurrentDeviceModel;
            if (str != null && str.length() != 0 && (baseSyncer2 = DeviceModelExtKt.getMSyncers().get(this.mCurrentDeviceModel)) != null) {
                removeSyncer(baseSyncer2);
            }
            if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(it) && (baseSyncer = DeviceModelExtKt.getMSyncers().get(it.getDid())) != null) {
                removeSyncer(baseSyncer);
            }
            addSyncer(DeviceModelExtKt.getSyncer(it));
        }
        this.mCurrentDeviceModel = it != null ? it.getDid() : null;
    }

    private final void initOrResetTypeArray(List<Integer> syncTypes) {
        Logger.i("syncType:" + syncTypes, new Object[0]);
        Iterator<T> it = syncTypes.iterator();
        while (it.hasNext()) {
            getSyncTypeArray().put(((Number) it.next()).intValue(), 0);
        }
    }

    private final void initSyncEngine() {
        final DeviceDataHandlerAdapter deviceDataHandlerAdapter = new DeviceDataHandlerAdapter(this.mDataHandlers);
        ServiceConnector.INSTANCE.getBinder(3, new Function1() { // from class: d26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceContactImpl.initSyncEngine$lambda$1(this.f14985a, deviceDataHandlerAdapter, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSyncEngine$lambda$1(DeviceContactImpl this$0, DeviceDataHandlerAdapter deviceDataHandlerAdapter, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDataHandlerAdapter, "$deviceDataHandlerAdapter");
        if (iBinder != null) {
            this$0.setMDeviceSyncEngine(com.xiaomi.fitness.device.contact.remote.a.AbstractBinderC0416a.asInterface(iBinder));
            DeviceSyncExtKt.logi("DeviceSyncEngine = " + this$0.getMDeviceSyncEngine());
            this$0.initSyncer();
            com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = this$0.getMDeviceSyncEngine();
            if (mDeviceSyncEngine != null) {
                mDeviceSyncEngine.addDataHandler(deviceDataHandlerAdapter);
            }
        }
        return Unit.INSTANCE;
    }

    private final void initSyncer() {
        iniSyncer((WearableDeviceModel) this.mWearableDeviceManager.getCurrentDeviceModel());
        this.mWearableDeviceManager.addDeviceChangeListener(new Function1() { // from class: e26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceContactImpl.initSyncer$lambda$2(this.f16188a, (WearableDeviceModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSyncer$lambda$2(DeviceContactImpl this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.iniSyncer(wearableDeviceModel);
        return Unit.INSTANCE;
    }

    private final boolean isForceType(int syncType) {
        return syncType == 1 || syncType == 2;
    }

    private final boolean isNeedSync(WearableDeviceModel deviceModel, boolean isAuto) {
        if (deviceModel.getDeviceStatus() == 6) {
            return false;
        }
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(deviceModel) || !DeviceModelExtKt.isSportAlive(deviceModel)) {
            return true;
        }
        if (isAuto) {
            return false;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), szi.f34132a);
        deviceModel.setDeviceStatus(5);
        getSyncObservers().onFinish(deviceModel, -1);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ORIG_RETURN, RETURN] */
    public final boolean isSyncFinish(List<Integer> syncTypes) {
        for (Object obj : syncTypes) {
            int iIntValue = ((Number) obj).intValue();
            int i = getSyncTypeArray().get(iIntValue);
            DeviceSyncExtKt.logi("The status of Type(" + iIntValue + ") is " + i);
            if (i == 0) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[ORIG_RETURN, RETURN] */
    public final boolean isSyncSuccess(List<Integer> syncTypes) {
        for (Object obj : syncTypes) {
            int iIntValue = ((Number) obj).intValue();
            int i = getSyncTypeArray().get(iIntValue);
            DeviceSyncExtKt.logi("The status of Type(" + iIntValue + ") is " + i);
            if (i == -1) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    private final void setMDeviceSyncEngine(com.xiaomi.fitness.device.contact.remote.a aVar) {
        this.mDeviceSyncEngine.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    public static /* synthetic */ void syncData$default(DeviceContactImpl deviceContactImpl, WearableDeviceModel wearableDeviceModel, boolean z, DeviceSyncCallback deviceSyncCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            deviceSyncCallback = deviceContactImpl.new DeviceSyncCallbackImpl(z);
        }
        deviceContactImpl.syncData(wearableDeviceModel, z, deviceSyncCallback);
    }

    private final void syncFinish(WearableDeviceModel deviceModel, boolean isSuccess, boolean isAuto) {
        int i = 0;
        Logger.i("[DeviceDataSync] sync finish:" + isSuccess + ", deviceModel:" + deviceModel + " \n", new Object[0]);
        if (deviceModel == null) {
            return;
        }
        if (isSuccess) {
            this.lastSyncDataTime = System.currentTimeMillis();
        } else {
            i = -1;
        }
        if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(deviceModel)) {
            if (deviceModel.getDeviceStatus() == 6) {
                deviceModel.setDeviceStatus(isSuccess ? 7 : 5);
            }
            getSyncObservers().onFinish(deviceModel, i);
            DeviceContactTracker.INSTANCE.track(isSuccess, deviceModel, this.startSyncTime, isAuto);
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        this.mCurrentDeviceModel = did;
        if (Intrinsics.areEqual(did, deviceModel.getDid())) {
            if (deviceModel.getDeviceStatus() == 6) {
                deviceModel.setDeviceStatus(isSuccess ? 7 : 5);
            }
            getSyncObservers().onFinish(deviceModel, i);
            DeviceContactTracker.INSTANCE.track(isSuccess, deviceModel, this.startSyncTime, isAuto);
            return;
        }
        Logger.i(TAG, "syncFinish isSuccess=" + isSuccess + ", currentDevice:" + this.mCurrentDeviceModel + ", syncDevice: " + deviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseIntArray syncTypeArray_delegate$lambda$0() {
        return new SparseIntArray();
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void addDataHandler(int type, @NotNull DataHandlerWrapper dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        AnyExtKt.main$default(null, new AnonymousClass1(type, dataHandler, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void addSyncResultCallback(@NotNull DeviceSyncCallback resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        getSyncObservers().add(resultCallBack);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void addSyncStateListener(@NotNull SyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getSyncObservers().addSyncStateListener(listener);
    }

    public final void addSyncer(@NotNull DeviceSyncer syncer) {
        Intrinsics.checkNotNullParameter(syncer, "syncer");
        getSyncObservers().addSyncer(syncer);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public int call(@Nullable String did, @NotNull s7r packet, boolean needResponse, @Nullable OnSyncCallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        byte[] bArrI = null;
        try {
            bArrI = dsf.i(packet);
        } catch (IllegalArgumentException unused) {
            DeviceSyncExtKt.loge(packet + " is illegal");
            if (callback != null) {
                callback.onError(did, packet.e, -12);
            }
        } catch (Exception e) {
            DeviceSyncExtKt.loge(packet + " is illegal ", e);
            if (callback != null) {
                callback.onError(did, packet.e, -12);
            }
        }
        byte[] bArr = bArrI;
        if (bArr == null) {
            return -1;
        }
        if (timeout > 0) {
            com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
            if (mDeviceSyncEngine != null) {
                return mDeviceSyncEngine.callTimeout(did, bArr, needResponse, callback(packet.e, callback), timeout);
            }
            return -1;
        }
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine2 = getMDeviceSyncEngine();
        if (mDeviceSyncEngine2 != null) {
            return mDeviceSyncEngine2.call(did, bArr, needResponse, callback(packet.e, callback));
        }
        return -1;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void cancelTask(int taskId) throws RemoteException {
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
        if (mDeviceSyncEngine != null) {
            mDeviceSyncEngine.cancelTask(taskId);
        }
    }

    public final void clear() {
        getSyncObservers().clear();
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    @NotNull
    public IDataHandler getDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
        Intrinsics.checkNotNull(mDeviceSyncEngine, "null cannot be cast to non-null type com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal");
        return ((DeviceContactEngineInternal) mDeviceSyncEngine).getDataHandler(did);
    }

    public final long getLastSyncDataTime() {
        return this.lastSyncDataTime;
    }

    @NotNull
    public final SyncObservers getSyncObservers() {
        SyncObservers syncObservers = this.syncObservers;
        if (syncObservers != null) {
            return syncObservers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("syncObservers");
        return null;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public boolean isIDLE() {
        Logger.i(TAG, "isIDLE: engine " + getMDeviceSyncEngine());
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
        return mDeviceSyncEngine != null && mDeviceSyncEngine.isIDLE();
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void removeDataHandler(int type, @NotNull DataHandlerWrapper dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        AnyExtKt.main$default(null, new C18891(type, dataHandler, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void removeSyncResultCallback(@NotNull DeviceSyncCallback resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        getSyncObservers().remove(resultCallBack);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void removeSyncStateListener(@NotNull SyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getSyncObservers().removeSyncStateListener(listener);
    }

    public final void removeSyncer(@NotNull DeviceSyncer syncer) {
        Intrinsics.checkNotNullParameter(syncer, "syncer");
        DeviceSyncExtKt.logi("initSyncer removeSyncer " + syncer);
        getSyncObservers().removeSyncer(syncer);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public int sendFile(@Nullable final String did, int type, int detailType, @Nullable String path, int segmentLength, @Nullable final SyncStateListener listener) {
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
        if (mDeviceSyncEngine != null) {
            return mDeviceSyncEngine.sendFile(did, type, detailType, path, segmentLength, new utc.a() { // from class: com.xiaomi.fitness.device.contact.DeviceContactImpl.sendFile.1
                @Override // defpackage.utc
                public void onComplete() {
                    AnyExtKt.main$default(null, new DeviceContactImpl$sendFile$1$onComplete$1(listener, did, null), 1, null);
                }

                @Override // defpackage.utc
                public void onFail(int errorCode, String errorMsg) {
                    AnyExtKt.main$default(null, new DeviceContactImpl$sendFile$1$onFail$1(listener, did, errorCode, null), 1, null);
                }

                @Override // defpackage.utc
                public void onProgress(int sentCount, int totalCount) {
                    AnyExtKt.main$default(null, new DeviceContactImpl$sendFile$1$onProgress$1(sentCount, listener, did, totalCount, null), 1, null);
                }
            });
        }
        return -1;
    }

    public final void setLastSyncDataTime(long j) {
        this.lastSyncDataTime = j;
    }

    public final void setSyncObservers(@NotNull SyncObservers syncObservers) {
        Intrinsics.checkNotNullParameter(syncObservers, "<set-?>");
        this.syncObservers = syncObservers;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void syncData(@NotNull String did, boolean isAuto) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getDeviceModel(did);
        if (wearableDeviceModel != null) {
            syncData$default(this, wearableDeviceModel, isAuto, null, 4, null);
            return;
        }
        DeviceSyncExtKt.loge("Cannot find device of did (" + did + ")");
    }

    public final boolean syncDataAtFixRate(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getDeviceModel(did);
        if (wearableDeviceModel == null || wearableDeviceModel.getDeviceStatus() != 7 || System.currentTimeMillis() - this.lastSyncDataTime <= REFRESH_DATA_INTERVAL_TIME) {
            return false;
        }
        DeviceSyncExtKt.logi("%s start syncAtFixRate,synced\n");
        syncData$default(this, wearableDeviceModel, true, null, 4, null);
        return true;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void syncDataByWidget(@NotNull String did, boolean isAuto) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getDeviceModel(did);
        if (wearableDeviceModel != null) {
            syncData(wearableDeviceModel, isAuto, new WidgetDeviceSyncCallbackImpl(isAuto));
            return;
        }
        DeviceSyncExtKt.loge("Cannot find device of did (" + did + ")");
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void removeDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
        Intrinsics.checkNotNull(mDeviceSyncEngine, "null cannot be cast to non-null type com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal");
        ((DeviceContactEngineInternal) mDeviceSyncEngine).removeDataHandler(did);
    }

    private final void syncData(WearableDeviceModel deviceModel, boolean isAuto, DeviceSyncCallback callback) {
        if (!isNeedSync(deviceModel, isAuto)) {
            DeviceSyncExtKt.logi("Do not need sync");
            return;
        }
        if (!com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(deviceModel) && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(deviceModel)) {
            this.mCurrentDeviceModel = deviceModel.getDid();
        } else {
            iniSyncer(deviceModel);
        }
        deviceModel.setDeviceStatus(6);
        getSyncObservers().onStart(deviceModel);
        this.mSyncTypes = DeviceModelExtKt.getNeedSyncTypes(deviceModel);
        this.mForceSyncTypes = DeviceModelExtKt.getForceSyncTypes(deviceModel);
        List<Integer> list = this.mSyncTypes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSyncTypes");
            list = null;
        }
        initOrResetTypeArray(list);
        this.startSyncTime = System.currentTimeMillis();
        getSyncObservers().syncData(deviceModel.getDid(), callback);
    }

    @Override // com.xiaomi.fitness.device.contact.DeviceContactInternal
    public boolean syncDataAtFixRate(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (deviceModel.getDeviceStatus() != 7 || System.currentTimeMillis() - this.lastSyncDataTime <= REFRESH_DATA_INTERVAL_TIME) {
            return false;
        }
        Logger.i("[DeviceDataSync] start syncAtFixRate,synced\n", new Object[0]);
        syncData$default(this, deviceModel, true, null, 4, null);
        return true;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void call(@NotNull s7r packet, boolean needResponse, @Nullable OnSyncCallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        call((String) null, packet, needResponse, callback, timeout);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public void call(int type, @Nullable byte[] data, boolean needResponse, @Nullable OnSyncCallback callback, int timeout) {
        call(null, type, data, needResponse, callback, timeout);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceContact
    public int call(@Nullable String did, int type, @Nullable byte[] data, boolean needResponse, @Nullable OnSyncCallback callback, int timeout) {
        if (timeout > 0) {
            com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine = getMDeviceSyncEngine();
            if (mDeviceSyncEngine != null) {
                return mDeviceSyncEngine.callTimeoutWithData(did, type, data, needResponse, callback(type, callback), timeout);
            }
            return -1;
        }
        com.xiaomi.fitness.device.contact.remote.a mDeviceSyncEngine2 = getMDeviceSyncEngine();
        if (mDeviceSyncEngine2 != null) {
            return mDeviceSyncEngine2.callWithData(did, type, data, needResponse, callback(type, callback));
        }
        return -1;
    }
}
