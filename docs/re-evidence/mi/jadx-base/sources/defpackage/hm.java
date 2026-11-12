package defpackage;

import com.huami.bluetooth.profile.channel.module.nfc.NFCModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhm;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f20224a = new a(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lhm$a;", "", "Lyus;", "baseProfile", "Lgm;", PluginDeviceInfo.FMODEL, "(Lyus;)Lgm;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final gm a(@NotNull yus baseProfile) {
            Intrinsics.checkNotNullParameter(baseProfile, "baseProfile");
            if (!baseProfile.q1(NFCModule.class)) {
                return new xbt(baseProfile);
            }
            NFCModule nFCModule = (NFCModule) baseProfile.i1(NFCModule.class);
            dm nfcApi = nFCModule != null ? nFCModule.getNfcApi() : null;
            if (nfcApi != null) {
                return new km(nfcApi);
            }
            return null;
        }
    }
}
