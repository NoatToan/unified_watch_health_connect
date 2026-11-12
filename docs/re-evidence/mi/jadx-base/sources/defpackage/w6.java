package defpackage;

import com.huami.core.device.feature.encrypt.impl.KeyShareApiImpl;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0007\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u001f"}, d2 = {"Lw6;", "Lkh;", "Lxct;", "authInfo", "Ldts;", "authCallback", "Lt0;", PluginDeviceInfo.FMODEL, "(Lxct;Ldts;)Lt0;", "", "(Lxct;)Z", "info", "callback", PluginDeviceInfo.FDESC, "Lv0;", "authorizationProtocolInfo", "(Lxct;Lv0;Ldts;)Lt0;", "", "keyBytes", "([B)Lt0;", "Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "keyShareApi$delegate", "Lkotlin/Lazy;", "()Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "keyShareApi", "", "macAddress", "Ll0;", "authApi", "<init>", "(Ljava/lang/String;Ll0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class w6 implements kh {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f37646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f37647b;
    public final int c;

    @NotNull
    public final Lazy d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lw6$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37648a;

        static {
            int[] iArr = new int[p0.values().length];
            try {
                iArr[p0.INVALID_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.USER_REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.OPERATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37648a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ dts t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(dts dtsVar) {
            super(0);
            this.t = dtsVar;
        }

        public final void a() {
            this.t.onAuthentication(new HMAuthState(2));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", PluginDeviceInfo.FMODEL, "()Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<KeyShareApiImpl> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KeyShareApiImpl invoke() {
            return new KeyShareApiImpl();
        }
    }

    public w6(@NotNull String macAddress, @NotNull l0 authApi) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(authApi, "authApi");
        this.f37646a = macAddress;
        this.f37647b = authApi;
        this.c = 2;
        this.d = LazyKt__LazyJVMKt.lazy(d.t);
    }

    public final KeyShareApiImpl a() {
        return (KeyShareApiImpl) this.d.getValue();
    }

    public final AuthResult b(xct info, dts callback) throws Exception {
        StartAuthResponse startAuthResponseA;
        String key = info.e();
        Intrinsics.checkNotNullExpressionValue(key, "key");
        byte[] bArrA = u0.a(key);
        if (bArrA == null || bArrA.length == 0) {
            callback.onAuthentication(new HMAuthState(1, 5));
            return new AuthResult(5, y.KEY_ERROR);
        }
        boolean z = !info.f();
        if (info.f()) {
            callback.onAuthentication(new HMAuthState(2));
            startAuthResponseA = this.f37647b.a(this.c, bArrA);
            t5t.d("DeviceAuthorizationImpl", "response code:" + startAuthResponseA);
            if (startAuthResponseA != null) {
                int code = startAuthResponseA.getCode();
                if (code == 1) {
                    callback.onAuthentication(new HMAuthState(3, 0, startAuthResponseA.getCode()));
                    z = true;
                } else if (code != 2) {
                    callback.onAuthentication(new HMAuthState(1, 3, startAuthResponseA.getCode()));
                } else {
                    callback.onAuthentication(new HMAuthState(4, 0, startAuthResponseA.getCode()));
                }
            } else {
                callback.onAuthentication(new HMAuthState(1, 4));
            }
        } else {
            startAuthResponseA = null;
        }
        if (!z) {
            return new AuthResult(7, startAuthResponseA == null ? y.START_LOCAL_BIND_FAIL : new mp(startAuthResponseA.getCode()));
        }
        AuthResult authResultA = a(bArrA);
        int originCode = authResultA.getOriginCode();
        t5t.d("DeviceAuthorizationImpl", "response code:" + originCode + '(' + p0.v.a(originCode).getU() + ')');
        if (authResultA.getAuthError() instanceof eu) {
            callback.onAuthentication(new HMAuthState(0, 0, 1));
            authResultA.a(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4, originCode));
            authResultA.a(4);
        }
        return authResultA;
    }

    @Override // defpackage.kh
    @NotNull
    public AuthResult a(@NotNull xct authInfo, @NotNull dts authCallback) {
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        Intrinsics.checkNotNullParameter(authCallback, "authCallback");
        AuthorizationProtocolInfo authorizationProtocolInfoA = this.f37647b.a();
        return (authorizationProtocolInfoA == null || (authorizationProtocolInfoA.a() && !wbt.f37824b)) ? b(authInfo, authCallback) : a(authInfo, authorizationProtocolInfoA, authCallback);
    }

    @Override // defpackage.kh
    public boolean a(@NotNull xct authInfo) {
        byte[] bArrA;
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        byte[] bArrB = this.f37647b.b(this.c);
        t5t.m("DeviceAuthorizationImpl", "random:" + tet.x(bArrB));
        if (bArrB != null && bArrB.length == 16) {
            AuthorizationProtocolInfo authorizationProtocolInfoA = this.f37647b.a();
            if (authorizationProtocolInfoA != null && (!authorizationProtocolInfoA.a() || wbt.f37824b)) {
                bArrA = tet.y(authInfo.e());
            } else {
                String strE = authInfo.e();
                Intrinsics.checkNotNullExpressionValue(strE, "authInfo.key");
                bArrA = u0.a(strE);
            }
            t5t.m("DeviceAuthorizationImpl", "key:" + tet.x(bArrA));
            if (bArrA != null && bArrA.length == 16) {
                EncryptKeyStore encryptKeyStoreA = sj.f33689a.a(this.f37646a);
                byte[] key = encryptKeyStoreA != null ? encryptKeyStoreA.getKey() : null;
                if (key == null) {
                    t5t.d("DeviceAuthorizationImpl", "wrong data from device!!!");
                    return false;
                }
                byte[] bArrA2 = u0.a(bArrB, bArrA);
                byte[] bArrA3 = u0.a(bArrB, key);
                t5t.m("DeviceAuthorizationImpl", "encrypt:" + tet.x(bArrA2));
                if (bArrA2 != null && bArrA2.length == 16 && bArrA3 != null && bArrA3.length != 0) {
                    int iB = this.f37647b.b(ArraysKt___ArraysJvmKt.plus(bArrA2, bArrA3));
                    t5t.d("DeviceAuthorizationImpl", "DeAuth code:" + iB + '(' + p0.v.a(iB).getU() + ')');
                    return iB == p0.SUCCESS.getT();
                }
                t5t.d("DeviceAuthorizationImpl", "wrong chip from local encrypt!!!");
                return false;
            }
            t5t.d("DeviceAuthorizationImpl", "wrong key!!!");
            return false;
        }
        t5t.d("DeviceAuthorizationImpl", "wrong data from device!!!");
        return false;
    }

    public final AuthResult a(xct info, AuthorizationProtocolInfo authorizationProtocolInfo, dts callback) throws Exception {
        byte[] bArrY;
        Object objM886constructorimpl;
        if (info.f()) {
            byte[] bArrA = a().a();
            StartAuthResponse startAuthResponseC = this.f37647b.c(this.c, a().a(bArrA));
            t5t.d("DeviceAuthorizationImpl", "response code:" + startAuthResponseC);
            if ((startAuthResponseC != null ? startAuthResponseC.getF36105b() : null) != null && startAuthResponseC.getC() != null) {
                if (!startAuthResponseC.e()) {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    return new AuthResult(4, new mp(startAuthResponseC.getCode()));
                }
                byte[] bArrD = agt.d(this.f37646a, startAuthResponseC.getC());
                t5t.m("DeviceAuthorizationImpl", "newRandom:" + tet.x(bArrD));
                if (bArrD == null) {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    return new AuthResult(4, y.GENERATE_RANDOM_FAIL);
                }
                byte[] bArrS = agt.s(bArrD);
                t5t.m("DeviceAuthorizationImpl", "sha256:" + tet.x(bArrS));
                if (bArrS != null && bArrS.length == 32) {
                    byte[] bArrOnGetSignData = callback.onGetSignData(bArrS, startAuthResponseC.getF36105b(), 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("signData:");
                    sb.append(tet.x(bArrOnGetSignData));
                    sb.append(",len:");
                    sb.append(bArrOnGetSignData != null ? bArrOnGetSignData.length : 0);
                    t5t.m("DeviceAuthorizationImpl", sb.toString());
                    if (bArrOnGetSignData == null) {
                        callback.onAuthentication(new HMAuthState(1, 4));
                        return new AuthResult(4, y.GET_SIGN_FAIL);
                    }
                    AuthResult authResultA = this.f37647b.a(bArrOnGetSignData, new c(callback));
                    p0 p0VarA = p0.v.a(authResultA.getOriginCode());
                    t5t.d("DeviceAuthorizationImpl", "verify result code:" + p0VarA + '(' + p0VarA.getU() + ')');
                    nbt authError = authResultA.getAuthError();
                    if (authError instanceof y) {
                        if (authResultA.getAuthError() == y.VERIFY_SIGNATURE_FAIL) {
                            callback.onAuthentication(new HMAuthState(1, 4));
                            authResultA.a(4);
                        } else {
                            callback.onAuthentication(new HMAuthState(1, 3));
                            authResultA.a(3);
                        }
                        return authResultA;
                    }
                    if (authError instanceof mp) {
                        int i = b.f37648a[p0VarA.ordinal()];
                        if (i == 1 || i == 2) {
                            callback.onAuthentication(new HMAuthState(4));
                            authResultA.a(6);
                        } else if (i != 3) {
                            callback.onAuthentication(new HMAuthState(1, 3));
                            authResultA.a(3);
                        } else {
                            callback.onAuthentication(new HMAuthState(1, 4));
                            authResultA.a(4);
                        }
                        return authResultA;
                    }
                    if (authError instanceof eu) {
                        callback.onAuthentication(new HMAuthState(3));
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(a().a(bArrA, startAuthResponseC.getC()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    }
                    byte[] bArr = (byte[]) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
                    if (bArr == null) {
                        t5t.d("DeviceAuthorizationImpl", "calculate share key failed!!!");
                        return new AuthResult(0, y.GENERATE_SEC_FAIL);
                    }
                    bArrY = new byte[16];
                    System.arraycopy(bArr, 0, bArrY, 0, 16);
                    info.c(tet.B(bArrY));
                } else {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    return new AuthResult(4, y.GENERATE_SHA_256_FAIL);
                }
            } else {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(4, y.START_CLOUD_BIND_FAIL);
            }
        } else {
            bArrY = tet.y(info.e());
            if (bArrY == null || bArrY.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(5, y.KEY_ERROR);
            }
        }
        AuthResult authResultA2 = a(bArrY);
        int originCode = authResultA2.getOriginCode();
        t5t.d("DeviceAuthorizationImpl", "Auth result code:" + originCode + '(' + p0.v.a(originCode).getU() + ')');
        if (authResultA2.getAuthError() instanceof eu) {
            callback.onAuthentication(new HMAuthState(0));
            authResultA2.a(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4));
            authResultA2.a(4);
        }
        return authResultA2;
    }

    public final AuthResult a(byte[] keyBytes) throws Exception {
        Object objM886constructorimpl;
        byte[] bArrA = a().a();
        RequestAuthResponse requestAuthResponseB = this.f37647b.b(this.c, a().a(bArrA));
        if (requestAuthResponseB != null && requestAuthResponseB.getRandomNumber().length != 0 && requestAuthResponseB.getPublickKey().length != 0) {
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(a().a(bArrA, requestAuthResponseB.getPublickKey()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = null;
            }
            byte[] bArr = (byte[]) objM886constructorimpl;
            if (bArr == null) {
                t5t.d("DeviceAuthorizationImpl", "calculate share key failed!!!");
                return new AuthResult(0, y.GENERATE_SEC_FAIL);
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
            byte[] bArrA2 = u0.a(requestAuthResponseB.getRandomNumber(), keyBytes);
            byte[] bArrA3 = u0.a(requestAuthResponseB.getRandomNumber(), byteArray);
            if (bArrA2 != null && bArrA2.length == 16 && bArrA3 != null && bArrA3.length == 16) {
                AuthResult authResultA = this.f37647b.a(ArraysKt___ArraysJvmKt.plus(bArrA2, bArrA3));
                if (authResultA.getAuthError() instanceof eu) {
                    sj.f33689a.a(this.f37646a, new EncryptKeyStore(bArr, keyBytes));
                }
                return authResultA;
            }
            t5t.d("DeviceAuthorizationImpl", "wrong chip from local encrypt!!!");
            return new AuthResult(0, y.LOCAL_ENCRYPT);
        }
        return new AuthResult(0, y.REQUEST_RANDOM_FAIL);
    }
}
