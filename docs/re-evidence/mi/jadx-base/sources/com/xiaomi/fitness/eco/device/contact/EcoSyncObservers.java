package com.xiaomi.fitness.eco.device.contact;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.eco.device.contact.EcoSyncObservers;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0013J\u0018\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001bJ\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\u0013J*\u0010)\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001J\u000e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020\u00132\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020+J\u0016\u00104\u001a\u00020\u00132\u0006\u00100\u001a\u0002012\u0006\u00105\u001a\u00020+J\u0006\u00106\u001a\u00020\u0013J\u0016\u00107\u001a\u00020\u00132\u0006\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020-R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/EcoSyncObservers;", "", "<init>", "()V", "injectSyncers", "", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "getInjectSyncers$annotations", "getInjectSyncers", "()Ljava/util/Set;", "setInjectSyncers", "(Ljava/util/Set;)V", "mSyncers", "Ljava/util/ArrayList;", "getMSyncers", "()Ljava/util/ArrayList;", "mSyncers$delegate", "Lkotlin/Lazy;", "addSyncer", "", "dataSyncer", "removeSyncer", "clearSyncer", "syncData", "did", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "syncResultList", "", "mSyncStateListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;", "addSyncStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeSyncStateListener", "add", "resultCallBack", "remove", "dataSync", "clearCallback", "dispatchResult", "type", "", "isSuccess", "", "obj", LifecycleConstantKt.ON_START, "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onFinish", "code", CervicalMucusRecord.Appearance.CLEAR, "dispatchFinish", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoSyncObservers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoSyncObservers.kt\ncom/xiaomi/fitness/eco/device/contact/EcoSyncObservers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1863#2,2:130\n1863#2,2:132\n1863#2,2:134\n1863#2,2:136\n1863#2,2:138\n*S KotlinDebug\n*F\n+ 1 EcoSyncObservers.kt\ncom/xiaomi/fitness/eco/device/contact/EcoSyncObservers\n*L\n48#1:130,2\n52#1:132,2\n100#1:134,2\n106#1:136,2\n116#1:138,2\n*E\n"})
public final class EcoSyncObservers {
    public Set<EcoDeviceSyncer> injectSyncers;

    /* JADX INFO: renamed from: mSyncers$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSyncers = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zy7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSyncObservers.mSyncers_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<EcoDeviceSyncCallback> syncResultList = new ArrayList();

    @NotNull
    private final CopyOnWriteArrayList<EcoSyncStateListener> mSyncStateListeners = new CopyOnWriteArrayList<>();

    public static /* synthetic */ void getInjectSyncers$annotations() {
    }

    private final ArrayList<EcoDeviceSyncer> getMSyncers() {
        return (ArrayList) this.mSyncers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList mSyncers_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void add(@NotNull EcoDeviceSyncCallback resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        if (this.syncResultList.contains(resultCallBack)) {
            return;
        }
        this.syncResultList.add(resultCallBack);
    }

    public final void addSyncStateListener(@NotNull EcoSyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mSyncStateListeners.contains(listener)) {
            return;
        }
        this.mSyncStateListeners.add(listener);
    }

    public final void addSyncer(@NotNull EcoDeviceSyncer dataSyncer) {
        Intrinsics.checkNotNullParameter(dataSyncer, "dataSyncer");
        getMSyncers().add(dataSyncer);
    }

    public final void clear() {
        clearSyncer();
        clearCallback();
    }

    public final void clearCallback() {
        this.syncResultList.clear();
    }

    public final void clearSyncer() {
        getMSyncers().clear();
    }

    public final void dispatchFinish(@NotNull EcoDeviceModel deviceModel, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
    }

    public final void dispatchResult(@Nullable String did, int type, boolean isSuccess, @Nullable Object obj) {
        ArrayList<EcoDeviceSyncCallback> arrayList = new ArrayList(this.syncResultList);
        if (!arrayList.isEmpty()) {
            for (EcoDeviceSyncCallback ecoDeviceSyncCallback : arrayList) {
                if (isSuccess) {
                    Intrinsics.checkNotNull(did);
                    ecoDeviceSyncCallback.onSyncSuccess(did, type, obj);
                } else {
                    Intrinsics.checkNotNull(did);
                    ecoDeviceSyncCallback.onSyncError(did, type, null);
                }
            }
        }
    }

    @NotNull
    public final Set<EcoDeviceSyncer> getInjectSyncers() {
        Set<EcoDeviceSyncer> set = this.injectSyncers;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injectSyncers");
        return null;
    }

    public final void onFinish(@NotNull EcoDeviceModel deviceModel, int code) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Iterator<T> it = this.mSyncStateListeners.iterator();
        while (it.hasNext()) {
            ((EcoSyncStateListener) it.next()).onFinish(deviceModel.getDid(), code);
        }
    }

    public final void onStart(@NotNull EcoDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Iterator<T> it = this.mSyncStateListeners.iterator();
        while (it.hasNext()) {
            ((EcoSyncStateListener) it.next()).onStart(deviceModel.getDid());
        }
    }

    public final void onSyncing(@NotNull EcoDeviceModel deviceModel, int progress) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Iterator<T> it = this.mSyncStateListeners.iterator();
        while (it.hasNext()) {
            ((EcoSyncStateListener) it.next()).onSyncing(deviceModel.getDid(), progress);
        }
    }

    public final void remove(@NotNull EcoDeviceSyncCallback dataSync) {
        Intrinsics.checkNotNullParameter(dataSync, "dataSync");
        this.syncResultList.remove(dataSync);
    }

    public final void removeSyncStateListener(@NotNull EcoSyncStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSyncStateListeners.remove(listener);
    }

    public final void removeSyncer(@NotNull EcoDeviceSyncer dataSyncer) {
        Intrinsics.checkNotNullParameter(dataSyncer, "dataSyncer");
        getMSyncers().remove(dataSyncer);
    }

    public final void setInjectSyncers(@NotNull Set<EcoDeviceSyncer> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.injectSyncers = set;
    }

    public final void syncData(@Nullable String did, @NotNull EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (did == null || did.length() == 0) {
            EcoDeviceSyncExtKt.logi("SyncObservers, syncData: did is null or empty");
            return;
        }
        EcoDeviceSyncExtKt.logi("SyncObservers syncData,syncList size: " + getMSyncers().size() + ">>" + getInjectSyncers().size());
        Iterator<T> it = getMSyncers().iterator();
        while (it.hasNext()) {
            ((EcoDeviceSyncer) it.next()).syncData(did, callBack);
        }
        if (!getInjectSyncers().isEmpty()) {
            Iterator<T> it2 = getInjectSyncers().iterator();
            while (it2.hasNext()) {
                ((EcoDeviceSyncer) it2.next()).syncData(did, callBack);
            }
        }
    }
}
