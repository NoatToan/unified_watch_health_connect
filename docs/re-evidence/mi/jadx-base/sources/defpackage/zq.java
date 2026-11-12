package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u000f"}, d2 = {"Lzq;", "Leh;", "Lyus;", "baseProfile", "Lg4s;", PluginDeviceInfo.FMODEL, "(Lyus;)Lg4s;", "Lt0;", "authResult", "Ln1t;", "baseBleDevice", "", "(Lt0;Ln1t;)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class zq implements eh {
    @Override // defpackage.eh
    @Nullable
    public g4s a(@NotNull yus baseProfile) {
        Intrinsics.checkNotNullParameter(baseProfile, "baseProfile");
        return baseProfile.Y0();
    }

    @Override // defpackage.eh
    public void a(@NotNull AuthResult authResult, @NotNull n1t baseBleDevice) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        Intrinsics.checkNotNullParameter(baseBleDevice, "baseBleDevice");
        baseBleDevice.M0(authResult.getAuthError() instanceof eu ? wt.AUTH_SUCCESS_WITHOUT_DEVICE_INFO : wt.AUTH_FAILED.a(authResult.getOriginCode()).a(authResult));
    }
}
