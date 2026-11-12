package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lyu;", "Ljq$a;", "", "value", "<init>", "(I)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, com.xiaomi.onetrack.b.e.f13808a, "Lyu$b;", "Lyu$c;", "Lyu$d;", "Lyu$e;", "Lyu$f;", "Lyu$g;", "Lyu$h;", "Lyu$i;", "Lyu$j;", "Lyu$k;", "Lyu$l;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class yu extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40532a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lyu$a;", "", "", "Lyu;", PluginDeviceInfo.FMODEL, "", "CMD_BYTES", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: yu$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyu;", "cmd", "", PluginDeviceInfo.FMODEL, "(Lyu;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        public static final class C1158a extends Lambda implements Function1<yu, Boolean> {
            public final /* synthetic */ byte[] t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1158a(byte[] bArr) {
                super(1);
                this.t = bArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0021  */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke2(@NotNull yu cmd) {
                boolean z;
                Intrinsics.checkNotNullParameter(cmd, "cmd");
                byte[] bytes = cmd.getBytes();
                byte[] bArr = this.t;
                if (bArr.length >= bytes.length) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bytes.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    if (Arrays.equals(bytes, bArrCopyOf)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final yu a(@NotNull byte[] bArr) throws Exception {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C1158a c1158a = new C1158a(bArr);
            yu yuVar = g.f40538b;
            if (!c1158a.invoke2(yuVar).booleanValue()) {
                yuVar = l.f40543b;
                if (!c1158a.invoke2(yuVar).booleanValue()) {
                    yuVar = e.f40536b;
                    if (!c1158a.invoke2(yuVar).booleanValue()) {
                        yuVar = f.f40537b;
                        if (!c1158a.invoke2(yuVar).booleanValue()) {
                            yuVar = j.f40541b;
                            if (!c1158a.invoke2(yuVar).booleanValue()) {
                                yuVar = k.f40542b;
                                if (!c1158a.invoke2(yuVar).booleanValue()) {
                                    yuVar = c.f40534b;
                                    if (!c1158a.invoke2(yuVar).booleanValue()) {
                                        yuVar = d.f40535b;
                                        if (!c1158a.invoke2(yuVar).booleanValue()) {
                                            yuVar = h.f40539b;
                                            if (!c1158a.invoke2(yuVar).booleanValue()) {
                                                yuVar = i.f40540b;
                                                if (!c1158a.invoke2(yuVar).booleanValue()) {
                                                    yuVar = b.f40533b;
                                                    if (!c1158a.invoke2(yuVar).booleanValue()) {
                                                        throw new Exception("Unknown command!");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return yuVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$b;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f40533b = new b();

        public b() {
            super(13, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$c;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f40534b = new c();

        public c() {
            super(7, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$d;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f40535b = new d();

        public d() {
            super(8, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$e;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f40536b = new e();

        public e() {
            super(3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$f;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f40537b = new f();

        public f() {
            super(4, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$g;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f40538b = new g();

        public g() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$h;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f40539b = new h();

        public h() {
            super(9, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$i;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f40540b = new i();

        public i() {
            super(10, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$j;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f40541b = new j();

        public j() {
            super(5, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$k;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f40542b = new k();

        public k() {
            super(6, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu$l;", "Lyu;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l extends yu {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l f40543b = new l();

        public l() {
            super(2, null);
        }
    }

    public /* synthetic */ yu(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public yu(int i2) {
        super(c3.a(i2, 1));
    }
}
