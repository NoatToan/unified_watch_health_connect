package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Ld7;", "Lsi;", "Lc7;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class d7 implements si<c7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f15162a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ld7$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
    public c7 a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        c7 c7Var = new c7();
        c7Var.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            c7.a aVar = c7.w;
            if (b3 == aVar.l()) {
                IntData intDataE = fs.e(byteBuffer, "upgradeOrder", zL);
                if (intDataE == null) {
                    return null;
                }
                c7Var.a(intDataE);
            } else if (b3 == aVar.h()) {
                Flag flagB = fs.b(byteBuffer, "languageFamily");
                if (flagB == null) {
                    return null;
                }
                c7Var.b(flagB);
            } else if (b3 == aVar.a()) {
                StringData stringDataF = fs.f(byteBuffer, "baseResourceVersion", zL);
                if (stringDataF == null) {
                    return null;
                }
                c7Var.a(stringDataF);
            } else if (b3 == aVar.f()) {
                StringData stringDataF2 = fs.f(byteBuffer, "increaseResourceVersion", zL);
                if (stringDataF2 == null) {
                    return null;
                }
                c7Var.e(stringDataF2);
            } else if (b3 == aVar.d()) {
                StringData stringDataF3 = fs.f(byteBuffer, "fontVersion", zL);
                if (stringDataF3 == null) {
                    return null;
                }
                c7Var.c(stringDataF3);
            } else if (b3 == aVar.c()) {
                StringData stringDataF4 = fs.f(byteBuffer, "externalResourceVersion", zL);
                if (stringDataF4 == null) {
                    return null;
                }
                c7Var.b(stringDataF4);
            } else if (b3 == aVar.e()) {
                StringData stringDataF5 = fs.f(byteBuffer, "gpsFirmwareVersion", zL);
                if (stringDataF5 == null) {
                    return null;
                }
                c7Var.d(stringDataF5);
            } else if (b3 == c7.F) {
                Flag flagB2 = fs.b(byteBuffer, "aGpsType");
                if (flagB2 == null) {
                    return null;
                }
                c7Var.a(flagB2);
            } else if (b3 == c7.G) {
                TimeStamp timeStampD = fs.d(byteBuffer, "aGpsUpgradeTime");
                if (timeStampD == null) {
                    return null;
                }
                c7Var.b(timeStampD);
            } else if (b3 == c7.H) {
                TimeStamp timeStampD2 = fs.d(byteBuffer, "aGpsExpirationTime");
                if (timeStampD2 == null) {
                    return null;
                }
                c7Var.a(timeStampD2);
            } else if (b3 == aVar.b()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "differentialPackageOtaMark");
                if (booleanDataA == null) {
                    return null;
                }
                c7Var.a(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == aVar.g()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "isDomesticProduct");
                if (booleanDataA2 == null) {
                    return null;
                }
                c7Var.b(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == aVar.k()) {
                EnumData enumDataA = fs.a(byteBuffer, "systemImageStatus", zL);
                if (enumDataA == null) {
                    return null;
                }
                c7Var.a(enumDataA);
            } else if (b3 == aVar.i()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "lockStatus");
                if (booleanDataA3 == null) {
                    return null;
                }
                c7Var.c(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == aVar.j()) {
                StringData stringDataF6 = fs.f(byteBuffer, "offlineVoiceVersion", zL);
                if (stringDataF6 == null) {
                    return null;
                }
                c7Var.f(stringDataF6);
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("DeviceInformationParser", "[WARNING] parseDeviceInformation unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return c7Var;
    }
}
