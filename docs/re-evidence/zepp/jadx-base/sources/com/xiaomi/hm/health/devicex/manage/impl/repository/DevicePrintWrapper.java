package com.xiaomi.hm.health.devicex.manage.impl.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR%\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DevicePrintWrapper;", "", "", "c", "b", "", "printShortInfo", "printFullInfo", "a", "Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/databases/model/Device;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/databases/model/Device;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DevicePrintWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Device device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return DevicePrintWrapper.this.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return DevicePrintWrapper.this.c();
        }
    }

    public DevicePrintWrapper(@NotNull String str, @NotNull Device device) {
        this.tag = str;
        this.device = device;
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return a().toJson(this.device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(this.device.getDevice_type().intValue());
        return this.device.getDevice_id() + "@" + hMDeviceTypeFromValue + ":" + this.device.getDisplayName() + "_" + this.device.getDevice_address();
    }

    public final void printFullInfo() {
        HMLog.debug(this.tag, new b());
    }

    public final void printShortInfo() {
        HMLog.debug(this.tag, new c());
    }
}
