package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\t\u000eJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\t\u001a\u00020\u0002H&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&¨\u0006\u000f"}, d2 = {"Ljg;", "", "", "init", "deInit", "Ljg$a;", "mode", "Ljg$b;", "operation", PluginDeviceInfo.FMODEL, "", "minutes", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface jg {

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Ljg$a;", "", "", "value", com.xiaomi.onetrack.api.c.f13755a, PluginDeviceInfo.FMODEL, "()B", "<init>", "(B)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, "Ljg$a$a;", "Ljg$a$b;", "Ljg$a$c;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f22752a;

        /* JADX INFO: renamed from: jg$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg$a$a;", "Ljg$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0981a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C0981a f22753b = new C0981a();

            public C0981a() {
                super((byte) 3, null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg$a$b;", "Ljg$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f22754b = new b();

            public b() {
                super((byte) 1, null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg$a$c;", "Ljg$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f22755b = new c();

            public c() {
                super((byte) 0, null);
            }
        }

        public /* synthetic */ a(byte b2, DefaultConstructorMarker defaultConstructorMarker) {
            this(b2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte getF22752a() {
            return this.f22752a;
        }

        public a(byte b2) {
            this.f22752a = b2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Ljg$b;", "", "", "value", c.f13755a, PluginDeviceInfo.FMODEL, "()B", "<init>", "(B)V", PluginDeviceInfo.FDESC, "Ljg$b$a;", "Ljg$b$b;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f22756a;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg$b$a;", "Ljg$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f22757b = new a();

            public a() {
                super((byte) 0, null);
            }
        }

        /* JADX INFO: renamed from: jg$b$b, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg$b$b;", "Ljg$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0982b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C0982b f22758b = new C0982b();

            public C0982b() {
                super((byte) 1, null);
            }
        }

        public /* synthetic */ b(byte b2, DefaultConstructorMarker defaultConstructorMarker) {
            this(b2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte getF22756a() {
            return this.f22756a;
        }

        public b(byte b2) {
            this.f22756a = b2;
        }
    }

    boolean a();

    boolean a(int minutes);

    boolean a(@NotNull a mode, @NotNull b operation);

    boolean deInit();

    @Nullable
    HeartRateConfig getHeartRateConfig();

    boolean init();
}
