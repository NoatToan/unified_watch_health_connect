package defpackage;

import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lo;", "", "", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "item", "", "supportAddress", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScheduleModel f28598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28599b;

    public o(@NotNull ScheduleModel item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f28598a = item;
        this.f28599b = z;
    }

    @NotNull
    public final byte[] a() {
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[0], lr.CMD_ADD_OR_UPDATE.c()), this.f28598a.toByteArray(this.f28599b));
    }
}
