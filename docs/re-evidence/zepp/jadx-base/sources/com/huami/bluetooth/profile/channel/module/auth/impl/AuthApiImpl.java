package com.huami.bluetooth.profile.channel.module.auth.impl;

import com.huami.bluetooth.profile.channel.module.auth.AuthApi;
import com.huami.bluetooth.profile.channel.module.auth.AuthModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthorizationProtocolInfo;
import com.huami.bluetooth.profile.channel.module.auth.RequestAuthResponse;
import com.huami.bluetooth.profile.channel.module.auth.StartAuthResponse;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\r¢\u0006\u0004\b\u001d\u0010\u001eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/impl/AuthApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "getAuthorizationInfo", "", "apiLevel", "", "keyBytes", "Lcom/huami/bluetooth/profile/channel/module/auth/StartAuthResponse;", "startLocalBinding", "pubKey", "startCloudBiding", "signature", "Lkotlin/Function0;", "", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "verifySignature", "Lcom/huami/bluetooth/profile/channel/module/auth/RequestAuthResponse;", "requestAuth", "requestDeAuth", "requestRandomNumber", "cipher", "authorize", "deAuthorize", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "a", "Lkotlin/jvm/functions/Function0;", "moduleProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AuthApiImpl implements AuthApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<AuthModule> moduleProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthApiImpl(@NotNull Function0<? extends AuthModule> function0) {
        this.moduleProvider = function0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @NotNull
    public AuthResult authorize(@NotNull byte[] cipher) {
        return this.moduleProvider.invoke().authorize(cipher);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    public int deAuthorize(@NotNull byte[] cipher) {
        return this.moduleProvider.invoke().deAuthorize(cipher);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public AuthorizationProtocolInfo getAuthorizationInfo() {
        return this.moduleProvider.invoke().getAuthorizationInfo();
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey) {
        return this.moduleProvider.invoke().requestAuth(apiLevel, pubKey);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public byte[] requestDeAuth(int apiLevel) {
        return this.moduleProvider.invoke().requestDeAuth(apiLevel);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public byte[] requestRandomNumber(int apiLevel) {
        return this.moduleProvider.invoke().requestRandomNumber(apiLevel);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey) {
        return this.moduleProvider.invoke().startCloudBiding(apiLevel, pubKey);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @Nullable
    public StartAuthResponse startLocalBinding(int apiLevel, @NotNull byte[] keyBytes) {
        return this.moduleProvider.invoke().startLocalBinding(apiLevel, keyBytes);
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthApi
    @NotNull
    public AuthResult verifySignature(@NotNull byte[] signature, @Nullable Function0<Unit> callback) {
        return this.moduleProvider.invoke().verifySignature(signature, callback);
    }
}
