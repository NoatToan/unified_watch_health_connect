package com.huami.bluetooth.profile.channel.module.find;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceWrapper;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", "findDevice", "", "findDeviceSync", "", BehaviorTaggingWebApi.g.g, "", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceWrapper {

    @NotNull
    public static final FindDeviceWrapper INSTANCE = new FindDeviceWrapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "FindDeviceWrapper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Find device api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Find device api is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "api is null";
        }
    }

    private FindDeviceWrapper() {
    }

    @Deprecated(message = "推荐使用同步方法，由调用方处理线程切换", replaceWith = @ReplaceWith(expression = "findDeviceSync", imports = {}))
    public final void findDevice(@NotNull HMBaseDevice device, @NotNull HMCallback<?> callback) {
        FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(device);
        if (findDeviceApiCreate != null) {
            findDeviceApiCreate.findDevice(callback);
        } else {
            HMLog.info(tag, a.a);
            callback.onFinish(false);
        }
    }

    public final boolean findDeviceSync(@NotNull HMBaseDevice device) {
        FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(device);
        if (findDeviceApiCreate != null) {
            return findDeviceApiCreate.findDeviceSync();
        }
        HMLog.info(tag, b.a);
        return false;
    }

    public final int protocolVersion(@NotNull HMBaseDevice device) {
        FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(device);
        if (findDeviceApiCreate != null) {
            return findDeviceApiCreate.queryFindDeviceProtocolVersion();
        }
        HMLog.info(tag, c.a);
        return -1;
    }
}
