package defpackage;

import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iu, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0010"}, d2 = {"Liu;", "", "", PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "items", "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SyncRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final List<ScheduleModel> items;

    public SyncRequest(@NotNull List<ScheduleModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    @NotNull
    public final byte[] a() {
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{lr.CMD_SYNC_DATA.b()}, c3.a(this.items.size(), 2));
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, ScheduleModel.toByteArray$default((ScheduleModel) it.next(), false, 1, null));
        }
        return bArrPlus;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SyncRequest) && Intrinsics.areEqual(this.items, ((SyncRequest) other).items);
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "SyncRequest(items=" + this.items + ')';
    }
}
