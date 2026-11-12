package com.xiaomi.fitness.eco.device.contact;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.amap.api.maps.model.MyLocationStyle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.eco.common.connect.IEcoMassDataCallback;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.b;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal;
import com.xiaomi.fitness.eco.device.contact.remote.a;
import com.xiaomi.fitness.eco.device.contact.syncer.BaseSyncer;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.dr7;
import defpackage.dsf;
import defpackage.u7r;
import defpackage.xzi;
import defpackage.zrc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ~2\u00020\u0001:\u0002~\u007fB\u0011\b\u0007\u0012\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\b|\u0010}J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u001f\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u00104J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J1\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010:\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010<J;\u0010;\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010:\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010=J\u001f\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\u0006\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010D\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00122\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00122\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bF\u0010EJ\u0017\u0010H\u001a\u00020G2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bH\u0010IJK\u0010N\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0006\u0010A\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u0001022\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010l\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010\\R/\u0010u\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010m8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR&\u0010z\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00110y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{¨\u0006\u0080\u0001"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl;", "Ldr7;", "", "initSyncEngine", "()V", "initSyncer", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "it", "iniSyncer", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "deviceModel", "", "isAuto", "syncData", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Z)V", "isNeedSync", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Z)Z", "", "", "syncTypes", "initOrResetTypeArray", "(Ljava/util/List;)V", "isSyncFinish", "(Ljava/util/List;)Z", "success", "doOnSyncFinish", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;ZZ)V", "isSuccess", "syncFinish", "originType", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "callback", "Lcom/xiaomi/fitness/eco/device/contact/export/b;", "ecoCallback", "(ILcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)Lcom/xiaomi/fitness/eco/device/contact/export/b;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "syncer", "addSyncer", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;)V", "removeSyncer", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "resultCallBack", "addSyncResultCallback", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;)V", "removeSyncResultCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSyncStateListener", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;)V", "removeSyncStateListener", "", "did", "(Ljava/lang/String;Z)V", "isIDLE", "()Z", "Lu7r;", "packet", "needResponse", "timeout", "call", "(Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;I)V", "(Ljava/lang/String;Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;I)I", "taskId", "cancelTask", "(Ljava/lang/String;I)V", "type", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "dataHandler", "addDataHandler", "(ILcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;)V", "removeDataHandler", "Lzrc;", "getDataHandler", "(Ljava/lang/String;)Lzrc;", "detailType", "path", "segmentLength", "priority", "sendFile", "(Ljava/lang/String;IILjava/lang/String;IILcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;)I", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "mDeviceManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "Lcom/xiaomi/fitness/eco/device/contact/EcoSyncObservers;", "mEcoSyncObservers", "Lcom/xiaomi/fitness/eco/device/contact/EcoSyncObservers;", "getMEcoSyncObservers", "()Lcom/xiaomi/fitness/eco/device/contact/EcoSyncObservers;", "setMEcoSyncObservers", "(Lcom/xiaomi/fitness/eco/device/contact/EcoSyncObservers;)V", "", "lastSyncDataTime", "J", "getLastSyncDataTime", "()J", "setLastSyncDataTime", "(J)V", "Landroid/util/SparseIntArray;", "syncTypeArray$delegate", "Lkotlin/Lazy;", "getSyncTypeArray", "()Landroid/util/SparseIntArray;", "syncTypeArray", "mCurrentDeviceModel", "Ljava/lang/String;", "mSyncTypes", "Ljava/util/List;", "mForceSyncTypes", "startSyncTime", "Lcom/xiaomi/fitness/eco/device/contact/remote/a;", "<set-?>", "mDeviceSyncEngine$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMDeviceSyncEngine", "()Lcom/xiaomi/fitness/eco/device/contact/remote/a;", "setMDeviceSyncEngine", "(Lcom/xiaomi/fitness/eco/device/contact/remote/a;)V", "mDeviceSyncEngine", "Ljava/util/concurrent/locks/ReentrantLock;", "mDataHandlerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/HashMap;", "mDataHandlerMap", "Ljava/util/HashMap;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;)V", "Companion", "DeviceSyncCallbackImpl", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceContactImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceContactImpl.kt\ncom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,432:1\n1863#2,2:433\n*S KotlinDebug\n*F\n+ 1 EcoDeviceContactImpl.kt\ncom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl\n*L\n236#1:433,2\n*E\n"})
public final class EcoDeviceContactImpl implements dr7 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDeviceContactImpl.class, "mDeviceSyncEngine", "getMDeviceSyncEngine()Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngine;", 0))};
    private static final int SYNC_RESULT_DEFAULT = 0;
    private static final int SYNC_RESULT_FAILURE = -1;
    private static final int SYNC_RESULT_SUCCESS = 1;

    @NotNull
    public static final String TAG = "[EcoDeviceDataSync]";
    private long lastSyncDataTime;

    @Nullable
    private String mCurrentDeviceModel;

    @NotNull
    private ReentrantLock mDataHandlerLock;

    @NotNull
    private final HashMap<Integer, List<EcoDataHandlerWrapper>> mDataHandlerMap;

    @NotNull
    private final EcoDeviceManager mDeviceManager;

    /* JADX INFO: renamed from: mDeviceSyncEngine$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mDeviceSyncEngine;
    public EcoSyncObservers mEcoSyncObservers;
    private List<Integer> mForceSyncTypes;
    private List<Integer> mSyncTypes;
    private long startSyncTime;

    /* JADX INFO: renamed from: syncTypeArray$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncTypeArray;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl$DeviceSyncCallbackImpl;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "isAuto", "", "<init>", "(Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl;Z)V", "onSyncSuccess", "", "did", "", "type", "", "result", "", "onSyncError", MyLocationStyle.ERROR_INFO, "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DeviceSyncCallbackImpl implements EcoDeviceSyncCallback {
        private final boolean isAuto;

        public DeviceSyncCallbackImpl(boolean z) {
            this.isAuto = z;
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("[EcoDeviceDataSync] sync error:" + type + ",did:" + did + ",errorInfo:" + errorInfo + ", thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            AnyExtKt.main$default(null, new EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncError$1(EcoDeviceContactImpl.this, did, type, this, null), 1, null);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncSuccess(@NotNull String did, int type, @Nullable Object result) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("[EcoDeviceDataSync] sync success:" + type + ",did:" + did + ",thread:" + Thread.currentThread().getName() + "\n", new Object[0]);
            AnyExtKt.main$default(null, new EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1(EcoDeviceContactImpl.this, did, type, result, this, null), 1, null);
        }
    }

    public EcoDeviceContactImpl(@NotNull EcoDeviceManager mDeviceManager) {
        Intrinsics.checkNotNullParameter(mDeviceManager, "mDeviceManager");
        this.mDeviceManager = mDeviceManager;
        this.syncTypeArray = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zq7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoDeviceContactImpl.syncTypeArray_delegate$lambda$0();
            }
        });
        this.mDeviceSyncEngine = new BinderDelegate("mEcoDeviceSyncEngine");
        this.mDataHandlerLock = new ReentrantLock();
        this.mDataHandlerMap = new HashMap<>();
        initSyncEngine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnSyncFinish(EcoDeviceModel deviceModel, boolean isAuto, boolean success) {
        syncFinish(deviceModel, success, isAuto);
    }

    private final b ecoCallback(final int originType, final OnEcoSyncCallback callback) {
        return new b.a() { // from class: com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl.ecoCallback.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.b
            public void onSyncError(String did, int type, int code) {
                EcoDeviceSyncExtKt.logi("eco Type(" + type + ") call error did=" + did + ", code=" + code);
                OnEcoSyncCallback onEcoSyncCallback = callback;
                if (onEcoSyncCallback != null) {
                    onEcoSyncCallback.onError(did, originType, code);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.b
            public void onSyncSuccess(String did, int type, EcoSyncResult result) {
                EcoDeviceSyncExtKt.logi("eco Type(" + type + ") call success, did=" + did + ", result=" + result);
                OnEcoSyncCallback onEcoSyncCallback = callback;
                if (onEcoSyncCallback != null) {
                    onEcoSyncCallback.onSuccess(did, originType, result);
                }
            }
        };
    }

    private final a getMDeviceSyncEngine() {
        return (a) this.mDeviceSyncEngine.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseIntArray getSyncTypeArray() {
        return (SparseIntArray) this.syncTypeArray.getValue();
    }

    private final void iniSyncer(EcoDeviceModel it) {
        EcoDeviceSyncExtKt.logi("init " + it + "'s syncers, and current device is " + this.mCurrentDeviceModel);
        EcoDeviceSyncExtKt.logi("init " + (it != null ? it.getDid() : null) + "'s ");
        EcoDeviceSyncExtKt.logi("init " + it + "'s ");
        if (Intrinsics.areEqual(it != null ? it.getDid() : null, this.mCurrentDeviceModel)) {
            return;
        }
        if (it == null) {
            EcoDeviceSyncExtKt.logi("init " + it + "'s null,syncObservers.clear()");
            getMEcoSyncObservers().clear();
        } else {
            EcoDeviceSyncExtKt.logi("init " + it + "'s not null");
            String str = this.mCurrentDeviceModel;
            if (str != null && str.length() != 0) {
                EcoDeviceSyncExtKt.logi("mCurrentDeviceModel " + this.mCurrentDeviceModel);
                EcoDeviceSyncExtKt.logi("mSyncers " + EcoDeviceModelExtKt.getMSyncers());
                BaseSyncer baseSyncer = EcoDeviceModelExtKt.getMSyncers().get(this.mCurrentDeviceModel);
                if (baseSyncer != null) {
                    EcoDeviceSyncExtKt.logi("mSyncers it " + baseSyncer);
                    removeSyncer(baseSyncer);
                }
            }
            if (com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(it)) {
                addSyncer(EcoDeviceModelExtKt.getSyncer(it));
            }
        }
        this.mCurrentDeviceModel = it != null ? it.getDid() : null;
    }

    private final void initOrResetTypeArray(List<Integer> syncTypes) {
        Iterator<T> it = syncTypes.iterator();
        while (it.hasNext()) {
            getSyncTypeArray().put(((Number) it.next()).intValue(), 0);
        }
    }

    private final void initSyncEngine() {
        ServiceConnector.INSTANCE.getBinder(30, new Function1() { // from class: ar7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceContactImpl.initSyncEngine$lambda$1(this.f3376a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSyncEngine$lambda$1(EcoDeviceContactImpl this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (iBinder != null) {
            this$0.setMDeviceSyncEngine(a.AbstractBinderC0547a.asInterface(iBinder));
            EcoDeviceSyncExtKt.logi("EcoDeviceSyncEngine = " + this$0.getMDeviceSyncEngine());
            this$0.initSyncer();
            try {
                if (this$0.mDataHandlerLock.tryLock(5L, TimeUnit.SECONDS)) {
                    for (Map.Entry<Integer, List<EcoDataHandlerWrapper>> entry : this$0.mDataHandlerMap.entrySet()) {
                        for (EcoDataHandlerWrapper ecoDataHandlerWrapper : entry.getValue()) {
                            EcoDeviceSyncExtKt.logi("addDataHandler from cached: " + entry.getKey() + " " + ecoDataHandlerWrapper);
                            a mDeviceSyncEngine = this$0.getMDeviceSyncEngine();
                            if (mDeviceSyncEngine != null) {
                                mDeviceSyncEngine.addDataHandler(entry.getKey().intValue(), ecoDataHandlerWrapper);
                            }
                        }
                    }
                    this$0.mDataHandlerMap.clear();
                } else {
                    Logger.e(TAG, "initSyncEngine lock failed");
                }
                this$0.mDataHandlerLock.unlock();
            } catch (Throwable th) {
                this$0.mDataHandlerLock.unlock();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    private final void initSyncer() {
        this.mDeviceManager.addDeviceChangeListener(new Function1() { // from class: yq7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceContactImpl.initSyncer$lambda$2(this.f40424a, (EcoDeviceModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSyncer$lambda$2(EcoDeviceContactImpl this$0, EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.iniSyncer(ecoDeviceModel);
        return Unit.INSTANCE;
    }

    private final boolean isNeedSync(EcoDeviceModel deviceModel, boolean isAuto) {
        if (deviceModel.getDeviceStatus() == 6) {
            return false;
        }
        if (com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isHuaMi(deviceModel) && EcoDeviceModelExtKt.isSportAlive(deviceModel)) {
            if (isAuto) {
                return false;
            }
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), xzi.f39619a);
            deviceModel.setDeviceStatus(5);
            getMEcoSyncObservers().onFinish(deviceModel, -1);
            return false;
        }
        if (NetworkExtKt.isNetworkAvailable()) {
            return true;
        }
        if (isAuto) {
            return false;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), xzi.d);
        getMEcoSyncObservers().onFinish(deviceModel, -1);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ORIG_RETURN, RETURN] */
    public final boolean isSyncFinish(List<Integer> syncTypes) {
        for (Object obj : syncTypes) {
            int iIntValue = ((Number) obj).intValue();
            int i = getSyncTypeArray().get(iIntValue);
            EcoDeviceSyncExtKt.logi("The status of Type(" + iIntValue + ") is " + i);
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

    private final void setMDeviceSyncEngine(a aVar) {
        this.mDeviceSyncEngine.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    private final void syncFinish(EcoDeviceModel deviceModel, boolean isSuccess, boolean isAuto) {
        int i = 0;
        Logger.i("[EcoDeviceDataSync] sync finish:" + isSuccess + ", deviceModel:" + deviceModel + " \n", new Object[0]);
        if (deviceModel == null) {
            return;
        }
        if (isSuccess) {
            this.lastSyncDataTime = System.currentTimeMillis();
        } else {
            i = -1;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) this.mDeviceManager.getCurrentDeviceModel();
        String did = ecoDeviceModel != null ? ecoDeviceModel.getDid() : null;
        this.mCurrentDeviceModel = did;
        if (Intrinsics.areEqual(did, deviceModel.getDid())) {
            if (deviceModel.getDeviceStatus() == 6) {
                deviceModel.setDeviceStatus(isSuccess ? 7 : 5);
            }
            getMEcoSyncObservers().onFinish(deviceModel, i);
            return;
        }
        Logger.i(TAG, "syncFinish isSuccess=" + isSuccess + ", currentDevice:" + this.mCurrentDeviceModel + ", syncDevice: " + deviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseIntArray syncTypeArray_delegate$lambda$0() {
        return new SparseIntArray();
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void addDataHandler(int type, @NotNull EcoDataHandlerWrapper dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        try {
            if (!this.mDataHandlerLock.tryLock(5L, TimeUnit.SECONDS)) {
                Logger.e(TAG, "addDataHandler lock failed");
            } else if (getMDeviceSyncEngine() != null) {
                EcoDeviceSyncExtKt.logi("addDataHandler type: " + type + " handler: " + dataHandler);
                a mDeviceSyncEngine = getMDeviceSyncEngine();
                if (mDeviceSyncEngine != null) {
                    mDeviceSyncEngine.addDataHandler(type, dataHandler);
                }
            } else {
                EcoDeviceSyncExtKt.logi("addDataHandler into cached " + type + " " + dataHandler);
                List<EcoDataHandlerWrapper> arrayList = this.mDataHandlerMap.get(Integer.valueOf(type));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ListExtKt.add(arrayList, dataHandler);
                this.mDataHandlerMap.put(Integer.valueOf(type), arrayList);
            }
        } finally {
            this.mDataHandlerLock.unlock();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void addSyncResultCallback(@NotNull EcoDeviceSyncCallback resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        getMEcoSyncObservers().add(resultCallBack);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void addSyncStateListener(@NotNull EcoSyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMEcoSyncObservers().addSyncStateListener(listener);
    }

    public final void addSyncer(@NotNull EcoDeviceSyncer syncer) {
        Intrinsics.checkNotNullParameter(syncer, "syncer");
        getMEcoSyncObservers().addSyncer(syncer);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public int call(@Nullable String did, @NotNull u7r packet, boolean needResponse, @Nullable OnEcoSyncCallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Logger.i(TAG, "send cmd to device  " + packet);
        byte[] bArrI = dsf.i(packet);
        if (timeout > 0) {
            a mDeviceSyncEngine = getMDeviceSyncEngine();
            if (mDeviceSyncEngine != null) {
                return mDeviceSyncEngine.callEcoTimeout(did, bArrI, needResponse, ecoCallback(packet.e, callback), timeout);
            }
            return -1;
        }
        a mDeviceSyncEngine2 = getMDeviceSyncEngine();
        if (mDeviceSyncEngine2 != null) {
            return mDeviceSyncEngine2.callEco(did, bArrI, needResponse, ecoCallback(packet.e, callback));
        }
        return -1;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void cancelTask(@NotNull String did, int taskId) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        a mDeviceSyncEngine = getMDeviceSyncEngine();
        if (mDeviceSyncEngine != null) {
            mDeviceSyncEngine.cancelTask(did, taskId);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    @NotNull
    public zrc getDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        a mDeviceSyncEngine = getMDeviceSyncEngine();
        Intrinsics.checkNotNull(mDeviceSyncEngine, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal");
        return ((EcoDeviceContactEngineInternal) mDeviceSyncEngine).getDataHandler(did);
    }

    public final long getLastSyncDataTime() {
        return this.lastSyncDataTime;
    }

    @NotNull
    public final EcoSyncObservers getMEcoSyncObservers() {
        EcoSyncObservers ecoSyncObservers = this.mEcoSyncObservers;
        if (ecoSyncObservers != null) {
            return ecoSyncObservers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcoSyncObservers");
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public boolean isIDLE() {
        Logger.i(TAG, "isIDLE: engine " + getMDeviceSyncEngine());
        a mDeviceSyncEngine = getMDeviceSyncEngine();
        return mDeviceSyncEngine != null && mDeviceSyncEngine.isIDLE();
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void removeDataHandler(int type, @NotNull EcoDataHandlerWrapper dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        try {
            try {
                if (!this.mDataHandlerLock.tryLock(5L, TimeUnit.SECONDS)) {
                    Logger.e(TAG, "removeDataHandler lock failed");
                } else if (getMDeviceSyncEngine() != null) {
                    a mDeviceSyncEngine = getMDeviceSyncEngine();
                    if (mDeviceSyncEngine != null) {
                        mDeviceSyncEngine.removeDataHandler(type, dataHandler);
                    }
                } else {
                    this.mDataHandlerMap.remove(Integer.valueOf(type));
                }
            } catch (Exception e) {
                EcoDeviceSyncExtKt.logi("remove data handler error " + e);
                e.printStackTrace();
            }
        } finally {
            this.mDataHandlerLock.unlock();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void removeSyncResultCallback(@NotNull EcoDeviceSyncCallback resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        getMEcoSyncObservers().remove(resultCallBack);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void removeSyncStateListener(@NotNull EcoSyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMEcoSyncObservers().removeSyncStateListener(listener);
    }

    public final void removeSyncer(@NotNull EcoDeviceSyncer syncer) {
        Intrinsics.checkNotNullParameter(syncer, "syncer");
        getMEcoSyncObservers().removeSyncer(syncer);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public int sendFile(@NotNull final String did, int type, int detailType, @Nullable String path, int segmentLength, int priority, @Nullable final EcoSyncStateListener listener) {
        Intrinsics.checkNotNullParameter(did, "did");
        a mDeviceSyncEngine = getMDeviceSyncEngine();
        if (mDeviceSyncEngine != null) {
            return mDeviceSyncEngine.sendFile(did, type, detailType, path, segmentLength, priority, new IEcoMassDataCallback.a() { // from class: com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl.sendFile.1
                @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
                public void onComplete() {
                    AnyExtKt.main$default(null, new EcoDeviceContactImpl$sendFile$1$onComplete$1(listener, did, null), 1, null);
                }

                @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
                public void onFail(int errorCode, String errorMsg) {
                    AnyExtKt.main$default(null, new EcoDeviceContactImpl$sendFile$1$onFail$1(listener, did, errorCode, null), 1, null);
                }

                @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
                public void onProgress(int sentCount, int totalCount) {
                    AnyExtKt.main$default(null, new EcoDeviceContactImpl$sendFile$1$onProgress$1(sentCount, listener, did, totalCount, null), 1, null);
                }
            });
        }
        return -1;
    }

    public final void setLastSyncDataTime(long j) {
        this.lastSyncDataTime = j;
    }

    public final void setMEcoSyncObservers(@NotNull EcoSyncObservers ecoSyncObservers) {
        Intrinsics.checkNotNullParameter(ecoSyncObservers, "<set-?>");
        this.mEcoSyncObservers = ecoSyncObservers;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void syncData(@NotNull String did, boolean isAuto) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) this.mDeviceManager.getDeviceModel(did);
        if (ecoDeviceModel == null) {
            EcoDeviceSyncExtKt.loge("Cannot find device of did (" + did + ")");
            return;
        }
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) this.mDeviceManager.getDeviceModel(did);
        if (ecoDeviceModel2 == null || ecoDeviceModel2.getIsDeviceConnected()) {
            syncData(ecoDeviceModel, isAuto);
            return;
        }
        EcoDeviceSyncExtKt.loge("device is not connected of did (" + did + ")");
    }

    private final void syncData(EcoDeviceModel deviceModel, boolean isAuto) {
        if (!isNeedSync(deviceModel, isAuto)) {
            EcoDeviceSyncExtKt.logi("Do not need sync");
            return;
        }
        this.mCurrentDeviceModel = deviceModel.getDid();
        deviceModel.setDeviceStatus(6);
        getMEcoSyncObservers().onStart(deviceModel);
        this.mSyncTypes = EcoDeviceModelExtKt.getNeedSyncTypes(deviceModel);
        this.mForceSyncTypes = EcoDeviceModelExtKt.getForceSyncTypes(deviceModel);
        List<Integer> list = this.mSyncTypes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSyncTypes");
            list = null;
        }
        initOrResetTypeArray(list);
        this.startSyncTime = System.currentTimeMillis();
        getMEcoSyncObservers().syncData(deviceModel.getDid(), new DeviceSyncCallbackImpl(isAuto));
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact
    public void call(@NotNull u7r packet, boolean needResponse, @Nullable OnEcoSyncCallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        call(null, packet, needResponse, callback, timeout);
    }
}
