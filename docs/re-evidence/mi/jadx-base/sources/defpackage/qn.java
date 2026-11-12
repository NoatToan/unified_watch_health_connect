package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lqn;", "Lsi;", "Lpn;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class qn implements si<pn> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31670a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lqn$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
    public pn a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        pn pnVar = new pn();
        pnVar.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        int iW = z2.w(byteBuffer);
        for (int i = 0; i < iW; i++) {
            byte b2 = byteBuffer.get();
            pn.a aVar = pn.x;
            if (b2 == aVar.b()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "activeWithIn5SByTurningWristSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                pnVar.b(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b2 == aVar.c()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "activeWithIn5SWhenScreenOnSwitch");
                if (booleanDataA2 == null) {
                    return null;
                }
                pnVar.c(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b2 == aVar.a()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "activeDuringScreenOnSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                pnVar.a(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b2 == aVar.d()) {
                EnumData enumDataA = fs.a(byteBuffer, "language", zL);
                if (enumDataA == null) {
                    return null;
                }
                pnVar.setLanguage(enumDataA);
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b2);
                t5t.d("OfflineVoiceV2Parser", "[WARNING] parseOfflineVoiceV2 unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return pnVar;
    }
}
