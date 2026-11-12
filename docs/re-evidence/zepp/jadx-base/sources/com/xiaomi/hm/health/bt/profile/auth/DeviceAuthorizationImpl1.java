package com.xiaomi.hm.health.bt.profile.auth;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.auth.AuthApi;
import com.huami.bluetooth.profile.channel.module.auth.AuthorizationProtocolInfo;
import com.huami.bluetooth.profile.channel.module.auth.StartAuthResponse;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.Success;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/DeviceAuthorizationImpl1;", "Lcom/xiaomi/hm/health/bt/profile/auth/IDeviceAuthorization;", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "c", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "authorizationProtocolInfo", "b", "", "keyBytes", "randomBytes", "a", "authInfo", "authCallback", "authorize", "", "deAuthorize", "", "Ljava/lang/String;", TakePicSettingActivity.KEY_ADDRESS, "Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "authApi", "", LogUtil.I, "APP_API_LEVEL", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceAuthorizationImpl1 implements IDeviceAuthorization {

    @NotNull
    private static final String d = "DeviceAuthorizationImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AuthApi authApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int APP_API_LEVEL = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ IHMAuthCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IHMAuthCallback iHMAuthCallback) {
            super(0);
            this.a = iHMAuthCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.onAuthentication(new HMAuthState(2));
        }
    }

    public DeviceAuthorizationImpl1(@NotNull String str, @NotNull AuthApi authApi) {
        this.macAddress = str;
        this.authApi = authApi;
    }

    private final AuthResult a(byte[] keyBytes, byte[] randomBytes) {
        byte[] bArrEncrypt = AuthUtilsKt.encrypt(randomBytes, keyBytes);
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return this.authApi.authorize(bArrEncrypt);
        }
        Debug.fi(d, "wrong chip from local encrypt!!!");
        return new AuthResult(0, AppAuthError.ENCRYPT_FAIL);
    }

    private final AuthResult b(AuthInfo info, AuthorizationProtocolInfo authorizationProtocolInfo, IHMAuthCallback callback) {
        byte[] bArrHexStringToBytes;
        if (info.isPair()) {
            StartAuthResponse startAuthResponseStartCloudBiding = this.authApi.startCloudBiding(this.APP_API_LEVEL, new byte[0]);
            if ((startAuthResponseStartCloudBiding == null ? null : startAuthResponseStartCloudBiding.getPublicKeyHash()) == null || startAuthResponseStartCloudBiding.getRandomNumber() == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.START_CLOUD_BIND_FAIL);
            }
            if (!startAuthResponseStartCloudBiding.success()) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, new ProtocolAuthError(startAuthResponseStartCloudBiding.getCode()));
            }
            byte[] bArrD = HMProAuthProfile.d(this.macAddress, startAuthResponseStartCloudBiding.getRandomNumber());
            Debug.i(d, Intrinsics.stringPlus("newRandom:", GattUtils.bytesToHexString(bArrD)));
            if (bArrD == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.GENERATE_RANDOM_FAIL);
            }
            byte[] bArrU = HMProAuthProfile.u(bArrD);
            Debug.i(d, Intrinsics.stringPlus("sha256:", GattUtils.bytesToHexString(bArrU)));
            if (bArrU == null || bArrU.length != 32) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.GENERATE_SHA_256_FAIL);
            }
            byte[] bArrOnGetSignData = callback.onGetSignData(bArrU, startAuthResponseStartCloudBiding.getPublicKeyHash(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append("signData:");
            sb.append((Object) GattUtils.bytesToHexString(bArrOnGetSignData));
            sb.append(",len:");
            sb.append(bArrOnGetSignData == null ? 0 : bArrOnGetSignData.length);
            Debug.i(d, sb.toString());
            if (bArrOnGetSignData == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.GET_SIGN_FAIL);
            }
            AuthResult authResultVerifySignature = this.authApi.verifySignature(bArrOnGetSignData, new a(callback));
            if (!(authResultVerifySignature.getAuthError() instanceof Success)) {
                if (authResultVerifySignature.getOriginCode() == 2) {
                    callback.onAuthentication(new HMAuthState(4));
                    authResultVerifySignature.setOriginCode(6);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 3));
                    authResultVerifySignature.setOriginCode(3);
                }
                return authResultVerifySignature;
            }
            callback.onAuthentication(new HMAuthState(3));
            bArrHexStringToBytes = new byte[16];
            System.arraycopy(bArrU, 0, bArrHexStringToBytes, 0, 16);
            info.setKey(GattUtils.bytesToHexStringNoSpace(bArrHexStringToBytes));
        } else {
            bArrHexStringToBytes = GattUtils.hexStringToBytes(info.getKey());
            if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(5, AppAuthError.KEY_ERROR);
            }
        }
        byte[] bArrRequestRandomNumber = this.authApi.requestRandomNumber(this.APP_API_LEVEL);
        if (bArrRequestRandomNumber != null) {
            if (!(bArrRequestRandomNumber.length == 0)) {
                AuthResult authResultA = a(bArrHexStringToBytes, bArrRequestRandomNumber);
                Debug.fi(d, Intrinsics.stringPlus("auth result:", authResultA));
                if (authResultA.getAuthError() instanceof Success) {
                    HMAuthState hMAuthState = new HMAuthState(0);
                    hMAuthState.setRandomValue(bArrRequestRandomNumber);
                    callback.onAuthentication(hMAuthState);
                    authResultA.setOriginCode(0);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    authResultA.setOriginCode(4);
                }
                return authResultA;
            }
        }
        callback.onAuthentication(new HMAuthState(1, 4));
        return new AuthResult(4, AppAuthError.REQUEST_RANDOM_FAIL);
    }

    private final AuthResult c(AuthInfo info, IHMAuthCallback callback) {
        byte[] bArrLocalKeyFromString = AuthUtilsKt.localKeyFromString(info.getKey());
        if (bArrLocalKeyFromString != null) {
            if (!(bArrLocalKeyFromString.length == 0)) {
                boolean z = !info.isPair();
                StartAuthResponse startAuthResponse = null;
                if (info.isPair()) {
                    callback.onAuthentication(new HMAuthState(2));
                    StartAuthResponse startAuthResponseStartLocalBinding = this.authApi.startLocalBinding(this.APP_API_LEVEL, bArrLocalKeyFromString);
                    Debug.fi(d, Intrinsics.stringPlus("response code:", startAuthResponseStartLocalBinding));
                    if (startAuthResponseStartLocalBinding != null) {
                        int code = startAuthResponseStartLocalBinding.getCode();
                        if (code == 1) {
                            callback.onAuthentication(new HMAuthState(3, 0, code));
                            startAuthResponse = startAuthResponseStartLocalBinding;
                            z = true;
                        } else if (code != 2) {
                            callback.onAuthentication(new HMAuthState(1, 3, code));
                        } else {
                            callback.onAuthentication(new HMAuthState(4, 0, code));
                        }
                    } else {
                        callback.onAuthentication(new HMAuthState(1, 4));
                    }
                    startAuthResponse = startAuthResponseStartLocalBinding;
                }
                if (!z) {
                    return startAuthResponse == null ? new AuthResult(7, AppAuthError.START_LOCAL_BIND_FAIL) : new AuthResult(7, new ProtocolAuthError(startAuthResponse.getCode()));
                }
                byte[] bArrRequestRandomNumber = this.authApi.requestRandomNumber(this.APP_API_LEVEL);
                if (bArrRequestRandomNumber != null) {
                    if (!(bArrRequestRandomNumber.length == 0)) {
                        AuthResult authResultA = a(bArrLocalKeyFromString, bArrRequestRandomNumber);
                        Debug.fi(d, Intrinsics.stringPlus("auth result:", authResultA));
                        if (authResultA.getAuthError() instanceof Success) {
                            HMAuthState hMAuthState = new HMAuthState(0, 0, 1);
                            hMAuthState.setRandomValue(bArrRequestRandomNumber);
                            callback.onAuthentication(hMAuthState);
                            authResultA.setOriginCode(0);
                        } else {
                            callback.onAuthentication(new HMAuthState(1, 4, authResultA.getOriginCode()));
                            authResultA.setOriginCode(4);
                        }
                        return authResultA;
                    }
                }
                callback.onAuthentication(new HMAuthState(1, 4, 0));
                return new AuthResult(4, AppAuthError.REQUEST_RANDOM_FAIL);
            }
        }
        callback.onAuthentication(new HMAuthState(1, 5));
        return new AuthResult(5, AppAuthError.KEY_ERROR);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    @NotNull
    public AuthResult authorize(@NotNull AuthInfo authInfo, @NotNull IHMAuthCallback authCallback) {
        AuthorizationProtocolInfo authorizationInfo = this.authApi.getAuthorizationInfo();
        Debug.fi(d, authorizationInfo + ", support new auth:" + HMBleConfig.SUPPORT_NEW_AUTH);
        return (authorizationInfo == null || (authorizationInfo.allowLocalBind() && !HMBleConfig.SUPPORT_NEW_AUTH)) ? c(authInfo, authCallback) : b(authInfo, authorizationInfo, authCallback);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    public boolean deAuthorize(@NotNull AuthInfo authInfo) {
        byte[] bArrRequestRandomNumber = this.authApi.requestRandomNumber(this.APP_API_LEVEL);
        Debug.i(d, Intrinsics.stringPlus("random:", GattUtils.bytesToHexString(bArrRequestRandomNumber)));
        if (bArrRequestRandomNumber == null || bArrRequestRandomNumber.length != 16) {
            Debug.fi(d, "wrong data from device!!!");
            return false;
        }
        AuthorizationProtocolInfo authorizationInfo = this.authApi.getAuthorizationInfo();
        byte[] bArrLocalKeyFromString = (authorizationInfo == null || (authorizationInfo.allowLocalBind() && !HMBleConfig.SUPPORT_NEW_AUTH)) ? AuthUtilsKt.localKeyFromString(authInfo.getKey()) : GattUtils.hexStringToBytes(authInfo.getKey());
        Debug.i(d, Intrinsics.stringPlus("key:", GattUtils.bytesToHexString(bArrLocalKeyFromString)));
        if (bArrLocalKeyFromString == null || bArrLocalKeyFromString.length != 16) {
            Debug.fi(d, "wrong key!!!");
            return false;
        }
        byte[] bArrEncrypt = AuthUtilsKt.encrypt(bArrRequestRandomNumber, bArrLocalKeyFromString);
        Debug.i(d, Intrinsics.stringPlus("encrypt:", GattUtils.bytesToHexString(bArrEncrypt)));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return this.authApi.deAuthorize(bArrEncrypt) == AuthErrorCode.SUCCESS.getCode();
        }
        Debug.fi(d, "wrong chip from local encrypt!!!");
        return false;
    }
}
