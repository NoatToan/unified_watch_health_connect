package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u0015\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0015"}, d2 = {"Lbh;", "", "Lcom/huami/bluetooth/profile/channel/module/a;", "T", "Ljava/lang/Class;", "moduleClass", PluginDeviceInfo.FMODEL, "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/a;", "", "moduleId", "", "(I)Z", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "clocks", "(Ljava/util/List;)Z", "()Ljava/util/List;", "Ln1t;", "bleDevice", "<init>", "(Ln1t;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f4198b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f4199a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbh$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setAlarms getChannelModule null";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "clear alarm failed";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "add alarm failed";
        }
    }

    public bh(@NotNull n1t bleDevice) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        this.f4199a = bleDevice;
    }

    @Nullable
    public final <T extends com.huami.bluetooth.profile.channel.module.a> T a(@NotNull Class<T> moduleClass) {
        Intrinsics.checkNotNullParameter(moduleClass, "moduleClass");
        return (T) f4.c.a(this.f4199a).a(moduleClass);
    }

    public final boolean a(int moduleId) {
        return this.f4199a.a(moduleId);
    }

    public final boolean a(@NotNull List<? extends AlarmClockExt> clocks) {
        Intrinsics.checkNotNullParameter(clocks, "clocks");
        AlarmModule alarmModule = (AlarmModule) a(AlarmModule.class);
        if (alarmModule == null) {
            le.c("HuamiOSDeviceDelegate", b.t);
            return false;
        }
        if (!alarmModule.clearAlarmSync()) {
            le.c("HuamiOSDeviceDelegate", c.t);
            return false;
        }
        boolean zAddAlarmsSync = alarmModule.addAlarmsSync(clocks);
        if (!zAddAlarmsSync) {
            le.c("HuamiOSDeviceDelegate", d.t);
        }
        return zAddAlarmsSync;
    }

    @Nullable
    public final List<AlarmClockExt> a() {
        AlarmModule alarmModule = (AlarmModule) a(AlarmModule.class);
        if (alarmModule != null) {
            return alarmModule.inquireAlarmSync();
        }
        return null;
    }
}
