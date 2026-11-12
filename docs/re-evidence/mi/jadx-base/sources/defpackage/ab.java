package defpackage;

import com.huami.bluetooth.profile.channel.module.find.FindDeviceModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Lab;", "Luj;", "Lbb;", "", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FMODEL, "", Home.JSON_KEY_ADDRESS, "(Ljava/lang/String;)V", "Lkd;", "device", "Lta;", "(Lkd;)Lta;", "Ln1t;", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class ab implements uj, bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f845a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Device not support find phone";
        }
    }

    public ab(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f845a = device;
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void b() {
        ta taVarA;
        if (this.f845a.F(FindDeviceModule.class) && (taVarA = a(this.f845a)) != null) {
            taVarA.b(this);
        }
    }

    @Override // defpackage.uj
    public void a() {
        ta taVarA = a(this.f845a);
        if (taVarA != null) {
            taVarA.a(this);
        }
    }

    public final ta a(kd device) {
        ta taVarA = ua.f35555a.a(device);
        if (taVarA != null) {
            return taVarA;
        }
        le.a((String) null, a.t, 1, (Object) null);
        return null;
    }

    @Override // defpackage.bb
    public void b(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        uj.a.a(this, this.f845a, ik.FIND_PHONE, null, 4, null);
    }

    @Override // defpackage.bb
    public void a(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        uj.a.a(this, this.f845a, ik.STOP_FIND_PHONE, null, 4, null);
    }
}
