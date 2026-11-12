package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lk5;", "Lsi;", "Li5;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class k5 implements si<i5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f23461a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk5$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public IPrimaryData a(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return si.a.a(this, byteBuffer, z, i);
    }

    @Nullable
    public i5 a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        i5 i5Var = new i5();
        i5Var.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            i5.a aVar = i5.w;
            if (b3 == aVar.c()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "multiLinkSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                i5Var.c(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == aVar.a()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "connectedAdvSwitch");
                if (booleanDataA2 == null) {
                    return null;
                }
                i5Var.a(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == aVar.d()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "restrictedBindingSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                i5Var.d(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == aVar.b()) {
                BooleanData booleanDataA4 = fs.a(byteBuffer, "hidSwitch");
                if (booleanDataA4 == null) {
                    return null;
                }
                i5Var.b(Boolean.valueOf(booleanDataA4.getValue()));
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("ConnectionParser", "[WARNING] parseConnection unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return i5Var;
    }
}
