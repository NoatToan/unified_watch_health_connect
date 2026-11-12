package com.xiaomi.fitness.eco.device.contact.syncer;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import com.xiaomi.fitness.eco.device.contact.syncer.BaseSyncer;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0015J$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00020\u001e\"\u00020\fH\u0004J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "getDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mSyncers", "Ljava/util/ArrayList;", "mForceSyncer", "needSyncTypes", "", "getNeedSyncTypes", "()Ljava/util/ArrayList;", "needSyncTypes$delegate", "Lkotlin/Lazy;", "forceSyncTypes", "getForceSyncTypes", "forceSyncTypes$delegate", "addSyncItem", "", "isForce", "", "type", CervicalMucusRecord.Appearance.CLEAR, "addSyncer", "syncer", "Lcom/xiaomi/fitness/eco/device/contact/syncer/DeviceSyncerInternal;", "types", "", "syncData", "did", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseSyncer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSyncer.kt\ncom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n13423#2,2:81\n1863#3,2:83\n*S KotlinDebug\n*F\n+ 1 BaseSyncer.kt\ncom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer\n*L\n66#1:81,2\n76#1:83,2\n*E\n"})
public abstract class BaseSyncer implements EcoDeviceSyncer {

    @NotNull
    private final EcoDeviceModel deviceModel;

    /* JADX INFO: renamed from: forceSyncTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy forceSyncTypes;

    @NotNull
    private final ArrayList<EcoDeviceSyncer> mForceSyncer;

    @NotNull
    private final ArrayList<EcoDeviceSyncer> mSyncers;

    /* JADX INFO: renamed from: needSyncTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needSyncTypes;

    public BaseSyncer(@NotNull EcoDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.deviceModel = deviceModel;
        this.mSyncers = new ArrayList<>();
        this.mForceSyncer = new ArrayList<>();
        this.needSyncTypes = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ge2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseSyncer.needSyncTypes_delegate$lambda$0();
            }
        });
        this.forceSyncTypes = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ie2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseSyncer.forceSyncTypes_delegate$lambda$1();
            }
        });
        addSyncItem(true, 1);
        if (EcoDeviceModelExtKt.isSupportFeature(deviceModel, Feature.WATCHFACE)) {
            addSyncItem(true, 2);
        }
        addSyncItem(false, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList forceSyncTypes_delegate$lambda$1() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList needSyncTypes_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void addSyncItem(boolean isForce, int type) {
        if (isForce && !getForceSyncTypes().contains(Integer.valueOf(type))) {
            getForceSyncTypes().add(Integer.valueOf(type));
        }
        if (getNeedSyncTypes().contains(Integer.valueOf(type))) {
            return;
        }
        getNeedSyncTypes().add(Integer.valueOf(type));
    }

    public final void addSyncer(boolean isForce, @NotNull DeviceSyncerInternal syncer, @NotNull int... types) {
        Intrinsics.checkNotNullParameter(syncer, "syncer");
        Intrinsics.checkNotNullParameter(types, "types");
        if (!this.mSyncers.contains(syncer)) {
            this.mSyncers.add(syncer);
        }
        for (int i : types) {
            addSyncItem(isForce, i);
        }
    }

    public final void clear() {
        getNeedSyncTypes().clear();
        getForceSyncTypes().clear();
    }

    @NotNull
    public final EcoDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final ArrayList<Integer> getForceSyncTypes() {
        return (ArrayList) this.forceSyncTypes.getValue();
    }

    @NotNull
    public final ArrayList<Integer> getNeedSyncTypes() {
        return (ArrayList) this.needSyncTypes.getValue();
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer
    public void syncData(@NotNull String did, @Nullable EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (this.mSyncers.isEmpty()) {
            if (callBack != null) {
                callBack.onSyncError(did, -1, "");
            }
        } else {
            Iterator<T> it = this.mSyncers.iterator();
            while (it.hasNext()) {
                ((EcoDeviceSyncer) it.next()).syncData(did, callBack);
            }
        }
    }
}
