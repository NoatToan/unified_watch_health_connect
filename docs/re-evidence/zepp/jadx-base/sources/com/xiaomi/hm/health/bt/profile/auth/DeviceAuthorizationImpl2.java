package com.xiaomi.hm.health.bt.profile.auth;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.encrypt.EncryptKeyStore;
import com.huami.bluetooth.profile.channel.encrypt.KeyStoreManager;
import com.huami.bluetooth.profile.channel.module.auth.AuthApi;
import com.huami.bluetooth.profile.channel.module.auth.AuthorizationProtocolInfo;
import com.huami.bluetooth.profile.channel.module.auth.RequestAuthResponse;
import com.huami.bluetooth.profile.channel.module.auth.StartAuthResponse;
import com.huami.core.device.feature.encrypt.impl.KeyShareApiImpl;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.Success;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/DeviceAuthorizationImpl2;", "Lcom/xiaomi/hm/health/bt/profile/auth/IDeviceAuthorization;", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "authorizationProtocolInfo", "b", "", "keyBytes", "a", "authInfo", "authCallback", "authorize", "", "deAuthorize", "", "Ljava/lang/String;", TakePicSettingActivity.KEY_ADDRESS, "Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "authApi", "", "c", LogUtil.I, "APP_API_LEVEL", "Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "Lkotlin/Lazy;", "()Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "keyShareApi", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceAuthorizationImpl2 implements IDeviceAuthorization {

    @NotNull
    private static final String e = "DeviceAuthorizationImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AuthApi authApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int APP_API_LEVEL = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy keyShareApi = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthErrorCode.values().length];
            iArr[AuthErrorCode.INVALID_STATE.ordinal()] = 1;
            iArr[AuthErrorCode.USER_REJECTED.ordinal()] = 2;
            iArr[AuthErrorCode.OPERATION_FAILED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<KeyShareApiImpl> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KeyShareApiImpl invoke() {
            return new KeyShareApiImpl();
        }
    }

    public DeviceAuthorizationImpl2(@NotNull String str, @NotNull AuthApi authApi) {
        this.macAddress = str;
        this.authApi = authApi;
    }

    private final AuthResult a(byte[] keyBytes) {
        Object objM3845constructorimpl;
        byte[] bArrRandomKey = c().randomKey();
        RequestAuthResponse requestAuthResponseRequestAuth = this.authApi.requestAuth(this.APP_API_LEVEL, c().generatePublicKey(bArrRandomKey));
        if (requestAuthResponseRequestAuth != null) {
            if (!(requestAuthResponseRequestAuth.getRandomNumber().length == 0)) {
                if (!(requestAuthResponseRequestAuth.getPublickKey().length == 0)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(c().generateSharedSecKey(bArrRandomKey, requestAuthResponseRequestAuth.getPublickKey()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                    byte[] bArr = (byte[]) objM3845constructorimpl;
                    if (bArr == null) {
                        Debug.fi(e, "calculate share key failed!!!");
                        return new AuthResult(0, AppAuthError.GENERATE_SEC_FAIL);
                    }
                    ArrayList arrayList = new ArrayList(keyBytes.length);
                    int length = keyBytes.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        arrayList.add(Byte.valueOf((byte) (bArr[i2 + 8] ^ keyBytes[i])));
                        i++;
                        i2++;
                    }
                    byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
                    byte[] bArrEncrypt = AuthUtilsKt.encrypt(requestAuthResponseRequestAuth.getRandomNumber(), keyBytes);
                    byte[] bArrEncrypt2 = AuthUtilsKt.encrypt(requestAuthResponseRequestAuth.getRandomNumber(), byteArray);
                    if (bArrEncrypt == null || bArrEncrypt.length != 16 || bArrEncrypt2 == null || bArrEncrypt2.length != 16) {
                        Debug.fi(e, "wrong chip from local encrypt!!!");
                        return new AuthResult(0, AppAuthError.LOCAL_ENCRYPT);
                    }
                    AuthResult authResultAuthorize = this.authApi.authorize(ArraysKt___ArraysJvmKt.plus(bArrEncrypt, bArrEncrypt2));
                    if (authResultAuthorize.getAuthError() instanceof Success) {
                        KeyStoreManager.INSTANCE.updateKeyStore(this.macAddress, new EncryptKeyStore(bArr, keyBytes));
                    }
                    return authResultAuthorize;
                }
            }
        }
        return new AuthResult(0, AppAuthError.REQUEST_RANDOM_FAIL);
    }

    private final AuthResult b(AuthInfo info, AuthorizationProtocolInfo authorizationProtocolInfo, IHMAuthCallback callback) {
        byte[] bArrHexStringToBytes;
        Object objM3845constructorimpl;
        if (info.isPair()) {
            byte[] bArrRandomKey = c().randomKey();
            StartAuthResponse startAuthResponseStartCloudBiding = this.authApi.startCloudBiding(this.APP_API_LEVEL, c().generatePublicKey(bArrRandomKey));
            Debug.fi(e, Intrinsics.stringPlus("response code:", startAuthResponseStartCloudBiding));
            if ((startAuthResponseStartCloudBiding == null ? null : startAuthResponseStartCloudBiding.getPublicKeyHash()) == null || startAuthResponseStartCloudBiding.getPublickKey() == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.START_CLOUD_BIND_FAIL);
            }
            if (!startAuthResponseStartCloudBiding.success()) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, new ProtocolAuthError(startAuthResponseStartCloudBiding.getCode()));
            }
            byte[] bArrD = HMProAuthProfile.d(this.macAddress, startAuthResponseStartCloudBiding.getPublickKey());
            Debug.i(e, Intrinsics.stringPlus("newRandom:", GattUtils.bytesToHexString(bArrD)));
            if (bArrD == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.GENERATE_RANDOM_FAIL);
            }
            byte[] bArrU = HMProAuthProfile.u(bArrD);
            Debug.i(e, Intrinsics.stringPlus("sha256:", GattUtils.bytesToHexString(bArrU)));
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
            Debug.i(e, sb.toString());
            if (bArrOnGetSignData == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, AppAuthError.GET_SIGN_FAIL);
            }
            AuthResult authResultVerifySignature = this.authApi.verifySignature(bArrOnGetSignData, new a(callback));
            AuthErrorCode authErrorCodeFromValue = AuthErrorCode.INSTANCE.fromValue(authResultVerifySignature.getOriginCode());
            Debug.fi(e, "verify result code:" + authErrorCodeFromValue + '(' + authErrorCodeFromValue.getDesc() + ')');
            AuthError authError = authResultVerifySignature.getAuthError();
            if (authError instanceof AppAuthError) {
                if (authResultVerifySignature.getAuthError() == AppAuthError.VERIFY_SIGNATURE_FAIL) {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    authResultVerifySignature.setOriginCode(4);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 3));
                    authResultVerifySignature.setOriginCode(3);
                }
                return authResultVerifySignature;
            }
            if (authError instanceof ProtocolAuthError) {
                int i = WhenMappings.$EnumSwitchMapping$0[authErrorCodeFromValue.ordinal()];
                if (i == 1 || i == 2) {
                    callback.onAuthentication(new HMAuthState(4));
                    authResultVerifySignature.setOriginCode(6);
                } else if (i != 3) {
                    callback.onAuthentication(new HMAuthState(1, 3));
                    authResultVerifySignature.setOriginCode(3);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    authResultVerifySignature.setOriginCode(4);
                }
                return authResultVerifySignature;
            }
            if (authError instanceof Success) {
                callback.onAuthentication(new HMAuthState(3));
            }
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(c().generateSharedSecKey(bArrRandomKey, startAuthResponseStartCloudBiding.getPublickKey()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            byte[] bArr = (byte[]) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
            if (bArr == null) {
                Debug.fi(e, "calculate share key failed!!!");
                return new AuthResult(0, AppAuthError.GENERATE_SEC_FAIL);
            }
            bArrHexStringToBytes = new byte[16];
            System.arraycopy(bArr, 0, bArrHexStringToBytes, 0, 16);
            info.setKey(GattUtils.bytesToHexStringNoSpace(bArrHexStringToBytes));
        } else {
            bArrHexStringToBytes = GattUtils.hexStringToBytes(info.getKey());
            if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(5, AppAuthError.KEY_ERROR);
            }
        }
        AuthResult authResultA = a(bArrHexStringToBytes);
        int originCode = authResultA.getOriginCode();
        Debug.fi(e, "Auth result code:" + originCode + '(' + AuthErrorCode.INSTANCE.fromValue(originCode).getDesc() + ')');
        if (authResultA.getAuthError() instanceof Success) {
            callback.onAuthentication(new HMAuthState(0));
            authResultA.setOriginCode(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4));
            authResultA.setOriginCode(4);
        }
        return authResultA;
    }

    private final KeyShareApiImpl c() {
        return (KeyShareApiImpl) this.keyShareApi.getValue();
    }

    private final AuthResult d(AuthInfo info, IHMAuthCallback callback) {
        byte[] bArrLocalKeyFromString = AuthUtilsKt.localKeyFromString(info.getKey());
        if (bArrLocalKeyFromString != null) {
            if (!(bArrLocalKeyFromString.length == 0)) {
                boolean z = !info.isPair();
                StartAuthResponse startAuthResponse = null;
                if (info.isPair()) {
                    callback.onAuthentication(new HMAuthState(2));
                    StartAuthResponse startAuthResponseStartLocalBinding = this.authApi.startLocalBinding(this.APP_API_LEVEL, bArrLocalKeyFromString);
                    Debug.fi(e, Intrinsics.stringPlus("response code:", startAuthResponseStartLocalBinding));
                    if (startAuthResponseStartLocalBinding != null) {
                        int code = startAuthResponseStartLocalBinding.getCode();
                        if (code == 1) {
                            callback.onAuthentication(new HMAuthState(3, 0, startAuthResponseStartLocalBinding.getCode()));
                            startAuthResponse = startAuthResponseStartLocalBinding;
                            z = true;
                        } else if (code != 2) {
                            callback.onAuthentication(new HMAuthState(1, 3, startAuthResponseStartLocalBinding.getCode()));
                        } else {
                            callback.onAuthentication(new HMAuthState(4, 0, startAuthResponseStartLocalBinding.getCode()));
                        }
                    } else {
                        callback.onAuthentication(new HMAuthState(1, 4));
                    }
                    startAuthResponse = startAuthResponseStartLocalBinding;
                }
                if (!z) {
                    return new AuthResult(7, startAuthResponse == null ? AppAuthError.START_LOCAL_BIND_FAIL : new ProtocolAuthError(startAuthResponse.getCode()));
                }
                AuthResult authResultA = a(bArrLocalKeyFromString);
                int originCode = authResultA.getOriginCode();
                Debug.fi(e, "response code:" + originCode + '(' + AuthErrorCode.INSTANCE.fromValue(originCode).getDesc() + ')');
                if (authResultA.getAuthError() instanceof Success) {
                    callback.onAuthentication(new HMAuthState(0, 0, 1));
                    authResultA.setOriginCode(0);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 4, originCode));
                    authResultA.setOriginCode(4);
                }
                return authResultA;
            }
        }
        callback.onAuthentication(new HMAuthState(1, 5));
        return new AuthResult(5, AppAuthError.KEY_ERROR);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    @NotNull
    public AuthResult authorize(@NotNull AuthInfo authInfo, @NotNull IHMAuthCallback authCallback) {
        AuthorizationProtocolInfo authorizationInfo = this.authApi.getAuthorizationInfo();
        return (authorizationInfo == null || (authorizationInfo.allowLocalBind() && !HMBleConfig.SUPPORT_NEW_AUTH)) ? d(authInfo, authCallback) : b(authInfo, authorizationInfo, authCallback);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    public boolean deAuthorize(@NotNull AuthInfo authInfo) {
        byte[] bArrRequestDeAuth = this.authApi.requestDeAuth(this.APP_API_LEVEL);
        Debug.i(e, Intrinsics.stringPlus("random:", GattUtils.bytesToHexString(bArrRequestDeAuth)));
        if (bArrRequestDeAuth == null || bArrRequestDeAuth.length != 16) {
            Debug.fi(e, "wrong data from device!!!");
            return false;
        }
        AuthorizationProtocolInfo authorizationInfo = this.authApi.getAuthorizationInfo();
        byte[] bArrLocalKeyFromString = (authorizationInfo == null || (authorizationInfo.allowLocalBind() && !HMBleConfig.SUPPORT_NEW_AUTH)) ? AuthUtilsKt.localKeyFromString(authInfo.getKey()) : GattUtils.hexStringToBytes(authInfo.getKey());
        Debug.i(e, Intrinsics.stringPlus("key:", GattUtils.bytesToHexString(bArrLocalKeyFromString)));
        if (bArrLocalKeyFromString == null || bArrLocalKeyFromString.length != 16) {
            Debug.fi(e, "wrong key!!!");
            return false;
        }
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.macAddress);
        byte[] key = keyStore == null ? null : keyStore.getKey();
        if (key == null) {
            Debug.fi(e, "wrong data from device!!!");
            return false;
        }
        byte[] bArrEncrypt = AuthUtilsKt.encrypt(bArrRequestDeAuth, bArrLocalKeyFromString);
        byte[] bArrEncrypt2 = AuthUtilsKt.encrypt(bArrRequestDeAuth, key);
        Debug.i(e, Intrinsics.stringPlus("encrypt:", GattUtils.bytesToHexString(bArrEncrypt)));
        if (bArrEncrypt != null && bArrEncrypt.length == 16 && bArrEncrypt2 != null) {
            if (!(bArrEncrypt2.length == 0)) {
                int iDeAuthorize = this.authApi.deAuthorize(ArraysKt___ArraysJvmKt.plus(bArrEncrypt, bArrEncrypt2));
                Debug.fi(e, "DeAuth code:" + iDeAuthorize + '(' + AuthErrorCode.INSTANCE.fromValue(iDeAuthorize).getDesc() + ')');
                return iDeAuthorize == AuthErrorCode.SUCCESS.getCode();
            }
        }
        Debug.fi(e, "wrong chip from local encrypt!!!");
        return false;
    }
}
