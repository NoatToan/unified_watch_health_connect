package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000f"}, d2 = {"Lbv;", "Lkh;", "Lxct;", "authInfo", "Ldts;", "authCallback", "Lt0;", PluginDeviceInfo.FMODEL, "(Lxct;Ldts;)Lt0;", "", "(Lxct;)Z", "Ljet;", "gattPeripheral", "<init>", "(Ljet;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bv implements kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final jet f4627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final pft f4628b;

    public bv(@NotNull jet gattPeripheral) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.f4627a = gattPeripheral;
        this.f4628b = new pft(gattPeripheral);
    }

    @Override // defpackage.kh
    @NotNull
    public AuthResult a(@NotNull xct authInfo, @NotNull dts authCallback) {
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        Intrinsics.checkNotNullParameter(authCallback, "authCallback");
        AuthResult authResultA = this.f4628b.a(authInfo, authCallback);
        Intrinsics.checkNotNullExpressionValue(authResultA, "authController.auth(authInfo, authCallback)");
        return authResultA;
    }

    @Override // defpackage.kh
    public boolean a(@NotNull xct authInfo) {
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        return this.f4628b.c(authInfo);
    }
}
