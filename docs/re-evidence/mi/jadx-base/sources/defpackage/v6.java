package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0007\u0010\u0014¨\u0006\u001b"}, d2 = {"Lv6;", "Lkh;", "Lxct;", "authInfo", "Ldts;", "authCallback", "Lt0;", PluginDeviceInfo.FMODEL, "(Lxct;Ldts;)Lt0;", "", "(Lxct;)Z", "info", "callback", PluginDeviceInfo.FDESC, "Lv0;", "authorizationProtocolInfo", "(Lxct;Lv0;Ldts;)Lt0;", "", "keyBytes", "randomBytes", "([B[B)Lt0;", "", "macAddress", "Ll0;", "authApi", "<init>", "(Ljava/lang/String;Ll0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class v6 implements kh {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f36515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f36516b;
    public final int c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lv6$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ dts t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dts dtsVar) {
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

    public v6(@NotNull String macAddress, @NotNull l0 authApi) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(authApi, "authApi");
        this.f36515a = macAddress;
        this.f36516b = authApi;
        this.c = 1;
    }

    @Override // defpackage.kh
    @NotNull
    public AuthResult a(@NotNull xct authInfo, @NotNull dts authCallback) {
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        Intrinsics.checkNotNullParameter(authCallback, "authCallback");
        AuthorizationProtocolInfo authorizationProtocolInfoA = this.f36516b.a();
        t5t.d("DeviceAuthorizationImpl", authorizationProtocolInfoA + ", support new auth:" + wbt.f37824b);
        return (authorizationProtocolInfoA == null || (authorizationProtocolInfoA.a() && !wbt.f37824b)) ? b(authInfo, authCallback) : a(authInfo, authorizationProtocolInfoA, authCallback);
    }

    public final AuthResult b(xct info, dts callback) {
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
            startAuthResponseA = this.f36516b.a(this.c, bArrA);
            t5t.d("DeviceAuthorizationImpl", "response code:" + startAuthResponseA);
            if (startAuthResponseA != null) {
                int code = startAuthResponseA.getCode();
                if (code == 1) {
                    callback.onAuthentication(new HMAuthState(3, 0, code));
                    z = true;
                } else if (code != 2) {
                    callback.onAuthentication(new HMAuthState(1, 3, code));
                } else {
                    callback.onAuthentication(new HMAuthState(4, 0, code));
                }
            } else {
                callback.onAuthentication(new HMAuthState(1, 4));
            }
        } else {
            startAuthResponseA = null;
        }
        if (!z) {
            return startAuthResponseA == null ? new AuthResult(7, y.START_LOCAL_BIND_FAIL) : new AuthResult(7, new mp(startAuthResponseA.getCode()));
        }
        byte[] bArrA2 = this.f36516b.a(this.c);
        if (bArrA2 == null || bArrA2.length == 0) {
            callback.onAuthentication(new HMAuthState(1, 4, 0));
            return new AuthResult(4, y.REQUEST_RANDOM_FAIL);
        }
        AuthResult authResultA = a(bArrA, bArrA2);
        t5t.d("DeviceAuthorizationImpl", "auth result:" + authResultA);
        if (authResultA.getAuthError() instanceof eu) {
            HMAuthState hMAuthState = new HMAuthState(0, 0, 1);
            hMAuthState.setRandomValue(bArrA2);
            callback.onAuthentication(hMAuthState);
            authResultA.a(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4, authResultA.getOriginCode()));
            authResultA.a(4);
        }
        return authResultA;
    }

    @Override // defpackage.kh
    public boolean a(@NotNull xct authInfo) {
        byte[] bArrA;
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        byte[] bArrA2 = this.f36516b.a(this.c);
        t5t.m("DeviceAuthorizationImpl", "random:" + tet.x(bArrA2));
        if (bArrA2 != null && bArrA2.length == 16) {
            AuthorizationProtocolInfo authorizationProtocolInfoA = this.f36516b.a();
            if (authorizationProtocolInfoA != null && (!authorizationProtocolInfoA.a() || wbt.f37824b)) {
                bArrA = tet.y(authInfo.e());
            } else {
                String strE = authInfo.e();
                Intrinsics.checkNotNullExpressionValue(strE, "authInfo.key");
                bArrA = u0.a(strE);
            }
            t5t.m("DeviceAuthorizationImpl", "key:" + tet.x(bArrA));
            if (bArrA != null && bArrA.length == 16) {
                byte[] bArrA3 = u0.a(bArrA2, bArrA);
                t5t.m("DeviceAuthorizationImpl", "encrypt:" + tet.x(bArrA3));
                if (bArrA3 != null && bArrA3.length == 16) {
                    return this.f36516b.b(bArrA3) == p0.SUCCESS.getT();
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

    public final AuthResult a(xct info, AuthorizationProtocolInfo authorizationProtocolInfo, dts callback) {
        byte[] bArrY;
        if (info.f()) {
            StartAuthResponse startAuthResponseC = this.f36516b.c(this.c, new byte[0]);
            if ((startAuthResponseC != null ? startAuthResponseC.getF36105b() : null) != null && startAuthResponseC.getD() != null) {
                if (!startAuthResponseC.e()) {
                    callback.onAuthentication(new HMAuthState(1, 4));
                    return new AuthResult(4, new mp(startAuthResponseC.getCode()));
                }
                byte[] bArrD = agt.d(this.f36515a, startAuthResponseC.getD());
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
                    AuthResult authResultA = this.f36516b.a(bArrOnGetSignData, new b(callback));
                    if (!(authResultA.getAuthError() instanceof eu)) {
                        if (authResultA.getOriginCode() == 2) {
                            callback.onAuthentication(new HMAuthState(4));
                            authResultA.a(6);
                        } else {
                            callback.onAuthentication(new HMAuthState(1, 3));
                            authResultA.a(3);
                        }
                        return authResultA;
                    }
                    callback.onAuthentication(new HMAuthState(3));
                    bArrY = new byte[16];
                    System.arraycopy(bArrS, 0, bArrY, 0, 16);
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
        byte[] bArrA = this.f36516b.a(this.c);
        if (bArrA != null && bArrA.length != 0) {
            AuthResult authResultA2 = a(bArrY, bArrA);
            t5t.d("DeviceAuthorizationImpl", "auth result:" + authResultA2);
            if (authResultA2.getAuthError() instanceof eu) {
                HMAuthState hMAuthState = new HMAuthState(0);
                hMAuthState.setRandomValue(bArrA);
                callback.onAuthentication(hMAuthState);
                authResultA2.a(0);
            } else {
                callback.onAuthentication(new HMAuthState(1, 4));
                authResultA2.a(4);
            }
            return authResultA2;
        }
        callback.onAuthentication(new HMAuthState(1, 4));
        return new AuthResult(4, y.REQUEST_RANDOM_FAIL);
    }

    public final AuthResult a(byte[] keyBytes, byte[] randomBytes) {
        byte[] bArrA = u0.a(randomBytes, keyBytes);
        if (bArrA != null && bArrA.length == 16) {
            return this.f36516b.a(bArrA);
        }
        t5t.d("DeviceAuthorizationImpl", "wrong chip from local encrypt!!!");
        return new AuthResult(0, y.ENCRYPT_FAIL);
    }
}
