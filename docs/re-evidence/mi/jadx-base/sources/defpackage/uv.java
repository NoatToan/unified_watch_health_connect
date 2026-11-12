package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0003\u0010\tR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\tR\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010\t¨\u0006*"}, d2 = {"Luv;", "", "", PluginDeviceInfo.FMODEL, "", MedicalIdSPContract.PREF_BIRTHDAY, "Z", "getBirth", "()Z", "(Z)V", "gender", "getGender", PluginDeviceInfo.FICONON, "height", "getHeight", PluginDeviceInfo.FICONOFF, "weight", "getWeight", Constant.KeyValue.KEY_COLUMN, "stepGoal", "getStepGoal", "i", "location", "getLocation", PluginDeviceInfo.FBLUETOOTHPAIR, "uid", "getUid", "j", "bloodPressure", "getBloodPressure", PluginDeviceInfo.FDESC, "registerRegion", "getRegisterRegion", "h", "idc", "getIdc", PluginDeviceInfo.FICONOFFLINE, "nickName", "getNickName", PluginDeviceInfo.FLOCALIZATIONS, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class uv {

    @NotNull
    public static final a l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36173b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36174k;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Luv$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(boolean z) {
        this.f36172a = z;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public final void c(boolean z) {
        this.f36173b = z;
    }

    public final void d(boolean z) {
        this.c = z;
    }

    public final void e(boolean z) {
        this.j = z;
    }

    public final void f(boolean z) {
        this.f = z;
    }

    public final void g(boolean z) {
        this.f36174k = z;
    }

    public final void h(boolean z) {
        this.i = z;
    }

    public final void i(boolean z) {
        this.e = z;
    }

    public final void j(boolean z) {
        this.g = z;
    }

    public final void k(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    public final byte[] a() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            boolean z = this.f36172a;
            ?? r1 = z;
            if (this.f36173b) {
                r1 = (z ? 1 : 0) | 2;
            }
            ?? r2 = r1;
            if (this.c) {
                r2 = (r1 == true ? 1 : 0) | 4;
            }
            ?? r3 = r2;
            if (this.d) {
                r3 = (r2 == true ? 1 : 0) | 8;
            }
            ?? r4 = r3;
            if (this.e) {
                r4 = (r3 == true ? 1 : 0) | 16;
            }
            ?? r5 = r4;
            if (this.f) {
                r5 = (r4 == true ? 1 : 0) | 32;
            }
            ?? r6 = r5;
            if (this.g) {
                r6 = (r5 == true ? 1 : 0) | 64;
            }
            ?? r7 = r6;
            if (this.h) {
                r7 = (r6 == true ? 1 : 0) | 128;
            }
            ?? r8 = r7;
            if (this.i) {
                r8 = (r7 == true ? 1 : 0) | 256;
            }
            ?? r9 = r8;
            if (this.j) {
                r9 = (r8 == true ? 1 : 0) | 512;
            }
            int i = r9;
            if (this.f36174k) {
                i = (r9 == true ? 1 : 0) | 1024;
            }
            byteArrayOutputStream.write(tet.p(i));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.d("UserInfoRequest", "exception: " + e);
            return null;
        }
    }
}
