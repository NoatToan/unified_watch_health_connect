package com.xiaomi.fitness.eco.device.contact;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.eco.device.contact.SyncInfo;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u000fR!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/SyncInfo;", "", "<init>", "()V", "needSyncTypes", "Ljava/util/ArrayList;", "", "getNeedSyncTypes", "()Ljava/util/ArrayList;", "needSyncTypes$delegate", "Lkotlin/Lazy;", "forceSyncTypes", "getForceSyncTypes", "forceSyncTypes$delegate", "addSyncItem", "", "type", "addForceSyncItem", "isForce", "", "removeSyncItem", CervicalMucusRecord.Appearance.CLEAR, "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncInfo {

    /* JADX INFO: renamed from: needSyncTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needSyncTypes = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jto
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncInfo.needSyncTypes_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: forceSyncTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy forceSyncTypes = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lto
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncInfo.forceSyncTypes_delegate$lambda$1();
        }
    });

    private final void addForceSyncItem(int type) {
        if (getForceSyncTypes().contains(Integer.valueOf(type))) {
            return;
        }
        getForceSyncTypes().add(Integer.valueOf(type));
    }

    private final void addSyncItem(int type) {
        if (getNeedSyncTypes().contains(Integer.valueOf(type))) {
            return;
        }
        getNeedSyncTypes().add(Integer.valueOf(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList forceSyncTypes_delegate$lambda$1() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList needSyncTypes_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void clear() {
        getNeedSyncTypes().clear();
        getForceSyncTypes().clear();
    }

    @NotNull
    public final ArrayList<Integer> getForceSyncTypes() {
        return (ArrayList) this.forceSyncTypes.getValue();
    }

    @NotNull
    public final ArrayList<Integer> getNeedSyncTypes() {
        return (ArrayList) this.needSyncTypes.getValue();
    }

    public final void removeSyncItem(int type) {
        if (getForceSyncTypes().contains(Integer.valueOf(type))) {
            getForceSyncTypes().remove(Integer.valueOf(type));
        }
        if (getNeedSyncTypes().contains(Integer.valueOf(type))) {
            getNeedSyncTypes().remove(Integer.valueOf(type));
        }
    }

    public final void addSyncItem(boolean isForce, int type) {
        if (isForce) {
            addForceSyncItem(type);
        }
        addSyncItem(type);
    }
}
