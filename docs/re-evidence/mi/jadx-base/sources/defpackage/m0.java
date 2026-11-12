package defpackage;

import com.huami.bluetooth.profile.channel.module.auth.AuthModule;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J \u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¨\u0006\u0017"}, d2 = {"Lm0;", "Ll0;", "Lv0;", PluginDeviceInfo.FMODEL, "", "apiLevel", "", "keyBytes", "Lut;", CommonConstants.KEY_PUB_KEY, PluginDeviceInfo.FICONON, MiTsmConstants.KEY_SIGNATURE, "Lkotlin/Function0;", "", "callback", "Lt0;", "Llq;", PluginDeviceInfo.FDESC, "cipher", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "moduleProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<AuthModule> f25597a;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@NotNull Function0<? extends AuthModule> moduleProvider) {
        Intrinsics.checkNotNullParameter(moduleProvider, "moduleProvider");
        this.f25597a = moduleProvider;
    }

    @Override // defpackage.l0
    @Nullable
    public AuthorizationProtocolInfo a() {
        return this.f25597a.invoke().getAuthorizationInfo();
    }

    @Override // defpackage.l0
    @Nullable
    public RequestAuthResponse b(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        return this.f25597a.invoke().requestAuth(apiLevel, pubKey);
    }

    @Override // defpackage.l0
    @Nullable
    public StartAuthResponse c(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        return this.f25597a.invoke().startCloudBiding(apiLevel, pubKey);
    }

    @Override // defpackage.l0
    @Nullable
    public StartAuthResponse a(int apiLevel, @NotNull byte[] keyBytes) {
        Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
        return this.f25597a.invoke().startLocalBinding(apiLevel, keyBytes);
    }

    @Override // defpackage.l0
    @Nullable
    public byte[] b(int apiLevel) {
        return this.f25597a.invoke().requestDeAuth(apiLevel);
    }

    @Override // defpackage.l0
    @NotNull
    public AuthResult a(@NotNull byte[] signature, @Nullable Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        return this.f25597a.invoke().verifySignature(signature, callback);
    }

    @Override // defpackage.l0
    public int b(@NotNull byte[] cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return this.f25597a.invoke().deAuthorize(cipher);
    }

    @Override // defpackage.l0
    @Nullable
    public byte[] a(int apiLevel) {
        return this.f25597a.invoke().requestRandomNumber(apiLevel);
    }

    @Override // defpackage.l0
    @NotNull
    public AuthResult a(@NotNull byte[] cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return this.f25597a.invoke().authorize(cipher);
    }
}
