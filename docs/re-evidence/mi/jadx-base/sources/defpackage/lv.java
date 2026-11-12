package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Llv;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class lv {
    @NotNull
    public final Response<Boolean> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length >= 2) {
            return Response.INSTANCE.a(Boolean.valueOf(c3.a(data[1])));
        }
        return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(data), 0, 2, null);
    }

    @NotNull
    public final Response<Boolean> b(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length >= 2) {
            return Response.INSTANCE.a(Boolean.valueOf(c3.a(data[1])));
        }
        return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(data), 0, 2, null);
    }

    @NotNull
    public final Response<Boolean> c(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length >= 2) {
            return Response.INSTANCE.a(Boolean.valueOf(c3.a(data[1])));
        }
        return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(data), 0, 2, null);
    }
}
