package com.huami.bluetooth.profile.channel.module.schedule.action;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/UpdateDeleteResultAction;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "insertOrUpdate", "delete", "sync", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UpdateDeleteResultAction {
    @NotNull
    public final Response<Boolean> delete(@NotNull byte[] data) {
        return data.length < 2 ? Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(data)), 0, 2, null) : Response.INSTANCE.success(Boolean.valueOf(ByteUtilsKt.toBoolean(data[1])));
    }

    @NotNull
    public final Response<Boolean> insertOrUpdate(@NotNull byte[] data) {
        return data.length < 2 ? Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(data)), 0, 2, null) : Response.INSTANCE.success(Boolean.valueOf(ByteUtilsKt.toBoolean(data[1])));
    }

    @NotNull
    public final Response<Boolean> sync(@NotNull byte[] data) {
        return data.length < 2 ? Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(data)), 0, 2, null) : Response.INSTANCE.success(Boolean.valueOf(ByteUtilsKt.toBoolean(data[1])));
    }
}
