package com.miui.tsmclient.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.dkf.IDKFRequestService;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.RKEDataHelper;
import com.miui.tsmclient.entity.digitalkey.CertificateInfo;
import com.miui.tsmclient.entity.digitalkey.GenerateSessionInfo;
import com.miui.tsmclient.entity.digitalkey.KeyTrackingInfo;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.miui.tsmclient.util.PrefUtils;
import com.miui.tsmclient.util.ResUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.tlv.TLVBuilder;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.bfs;
import defpackage.bvs;
import defpackage.e2s;
import defpackage.e5t;
import defpackage.e7t;
import defpackage.f2s;
import defpackage.f3t;
import defpackage.g2s;
import defpackage.h2s;
import defpackage.hss;
import defpackage.kjs;
import defpackage.ljs;
import defpackage.nxs;
import defpackage.vns;
import defpackage.xus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class DKFRequestService extends Service {
    public static final int A0 = 4106;
    public static final int B0 = 4107;
    public static final int C0 = 4108;
    public static final int D0 = 4109;
    public static final int E0 = 4110;
    public static final int F0 = 4111;
    public static final int G0 = 4112;
    public static final int H0 = 4113;
    public static final int I0 = 4114;
    public static final int J0 = 4115;
    public static final int K0 = 4116;
    public static final int L0 = 4117;
    public static final int M0 = 4118;
    public static final int N0 = 4119;
    public static final int O0 = 4122;
    public static final int P0 = 4123;
    public static final int Q0 = 4124;
    public static final int R0 = 4125;
    public static final int S0 = 3;
    public static final String T0 = "com.miui.tsmclient.ui.digitalkey.CarKeyInvokeFromCarActivity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10401b = 1;
    public static final int c = 2;
    public static final String g = "INSTANCE_CA_CERTIFICATE";
    public static final String h = "DEVICE_OEM_CA_CERTIFICATE";
    public static final String i = "VEHICLE_OEM_CA_CERTIFICATE";
    public static final String j = "VEHICLE_OEM_PRIVACY_ENCRYPTION_CERTIFICATE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10402k = "VEHICLE_OEM_SIGNATURE_KEY_CERTIFICATE";
    public static final int l = 1536;
    public static final byte n = 48;
    public static final byte o = -96;
    public static final byte p = -128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte f10403r = 3;
    public static final int s0 = 4097;
    public static final int t0 = 4098;
    public static final int u0 = 4099;
    public static final int v0 = 4101;
    public static final int w0 = 4102;
    public static final int x0 = 4103;
    public static final int y0 = 4104;
    public static final int z0 = 4105;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IDKFRequestService f10404a;
    public static Gson f = new Gson();
    public static final byte[] m = {127, 114};
    public static final byte[] q = {95, 120};
    public static final byte[] s = {64};
    public static final byte[] t = {-112, 0};
    public static final byte[] u = {2, 2};
    public static final byte[] v = {2, 4};
    public static final byte[] w = {3, 3};
    public static final byte[] x = {6, 1};
    public static final byte[] y = {7, 1};
    public static final byte[] z = {8, 1};
    public static final byte[] A = {-1, -1};
    public static final byte[] B = {10, 0};
    public static final byte[] C = {10, 1};
    public static final byte[] D = {AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 0};
    public static final byte[] E = {AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 1};
    public static final byte[] F = {AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2};
    public static final byte[] G = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 0};
    public static final byte[] H = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 1};
    public static final byte[] I = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 2};
    public static final byte[] J = {HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 0};
    public static final byte[] K = {HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 1};
    public static final byte[] L = {15, 0};
    public static final byte[] M = {9, 1};
    public static final byte[] N = {9, 2};
    public static final byte[] O = {9, 3};
    public static final byte[] P = {16, 1};
    public static final byte[] Q = {17, 1};
    public static final byte[] R = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 1};
    public static final byte[] S = {3, 1};
    public static final byte[] T = {3, 2};
    public static final byte[] U = {3, 4};
    public static final byte[] V = {-65, 17};
    public static final byte[] W = {127, 34};
    public static final byte[] X = {127, 32};
    public static final byte[] Y = {127, HMProSyncDataBaseProfile.DATA_SPO2_ODI};
    public static final byte[] Z = {95, SettingsModule.VALUE_TYPE_STRING_ENUM};
    public static final byte[] a0 = {-45};
    public static final byte[] b0 = {-65, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG};
    public static final byte[] c0 = {-65, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC};
    public static final byte[] d0 = {-65, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG};
    public static final byte[] e0 = {95, SettingsModule.VALUE_TYPE_STRING_ENUM};
    public static final byte[] f0 = {-65, 27};
    public static final byte[] g0 = {-65, 31};
    public static final byte[] h0 = {-65, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT};
    public static final byte[] i0 = {-65, 64};
    public static final byte[] j0 = {-65, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION};
    public static final byte[] k0 = {-65, 66};
    public static final byte[] l0 = {-65, 67};
    public static final byte[] m0 = {-65, 69};
    public static final byte[] n0 = {-65, 70};
    public static final byte[] o0 = {-65, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR};
    public static final byte[] p0 = {-65, 73};
    public static final byte[] q0 = {-65, 74};
    public static final byte[] r0 = {-65, 16};
    public static final String d = "SDK-DigitalKey-Service";
    public static final boolean e = true;
    public static final byte[] U0 = bfs.f4159a;
    public static final byte[] V0 = bfs.f4160b;
    public static final byte[] W0 = bfs.c;
    public static final byte[] X0 = bfs.d;
    public static final byte[] Y0 = bfs.e;
    public static final byte[] Z0 = bfs.f;
    public static final byte[] a1 = bfs.g;
    public static final byte[] b1 = bfs.h;
    public static final byte[] c1 = bfs.i;
    public static final byte[] d1 = bfs.j;
    public static final byte[] e1 = bfs.f4161k;
    public static final byte[] f1 = bfs.l;
    public static final byte[] g1 = bfs.m;
    public static final byte[] h1 = bfs.n;
    public static final byte[] i1 = bfs.o;
    public static final byte[] j1 = bfs.p;
    public static final byte[] k1 = bfs.q;
    public static final byte[] l1 = bfs.f4162r;
    public static final byte[] m1 = bfs.s;
    public static final byte[] n1 = bfs.t;
    public static final byte[] o1 = bfs.u;
    public static final byte[] p1 = bfs.v;
    public static final byte[] q1 = bfs.w;
    public static final byte[] r1 = bfs.x;
    public static final byte[] s1 = bfs.y;
    public static final byte[] t1 = bfs.z;

    public static class a extends IDKFRequestService.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f10405b = "PHONE";
        public static final String c = "WATCH";
        public static final String d = "OTHER";
        public static final String e = "ownerKeyID";
        public static final String f = "friendKeyID";
        public static final String g = "pwd";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f10406a;

        /* JADX INFO: renamed from: com.miui.tsmclient.service.DKFRequestService$a$a, reason: collision with other inner class name */
        public class C0331a extends TypeToken<HashMap<String, String>> {
            public C0331a() {
            }
        }

        public a(Context context) {
            this.f10406a = context;
        }

        public final byte[] a(byte[] bArr) {
            BaseResponse baseResponseQ;
            LogUtils.d(DKFRequestService.d, "activateKey");
            String str = new String(a(bArr, DKFRequestService.e0));
            LogUtils.t(DKFRequestService.d, "activate key: " + str);
            HashMap map = new HashMap();
            map.put("keyId", str);
            String str2 = new String(a(bArr, DKFRequestService.f0));
            try {
                CarKeyCardInfo carKeyCardInfo = new CarKeyCardInfo();
                carKeyCardInfo.setVehicleOEMId(str2);
                baseResponseQ = new xus().q(this.f10406a, "CCC_RESUME_KEY", carKeyCardInfo, DKFRequestService.f.toJson(map));
            } catch (AuthApiException e2) {
                e = e2;
                LogUtils.e(DKFRequestService.d, "exception when activating key " + str + ": " + e);
                baseResponseQ = null;
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                LogUtils.e(DKFRequestService.d, "InterruptedException, " + e3);
                baseResponseQ = null;
            } catch (r.a e4) {
                e = e4;
                LogUtils.e(DKFRequestService.d, "exception when activating key " + str + ": " + e);
                baseResponseQ = null;
            }
            if (baseResponseQ != null) {
                return baseResponseQ.isSuccess() ? DKFRequestService.t : a(baseResponseQ.mResultCode, DKFRequestService.y);
            }
            return a(-1, DKFRequestService.y);
        }

        public final byte[] b(byte[] bArr) {
            return a(DKFRequestService.V, new byte[]{0}, bArr);
        }

        public final byte[] c(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "cancelSession");
            String str = new String(a(bArr, DKFRequestService.b0));
            LogUtils.t(DKFRequestService.d, "cancelSession, sessionId = " + str);
            CommonResponseInfo commonResponseInfoM = new e2s().m(this.f10406a, str);
            if (commonResponseInfoM.isSuccess()) {
                return DKFRequestService.t;
            }
            LogUtils.e(DKFRequestService.d, "cancelSession failed, " + commonResponseInfoM.getErrorCode());
            return a(commonResponseInfoM.getErrorCode(), DKFRequestService.O);
        }

        public final byte[] d(byte[] bArr) {
            String str;
            String str2;
            String strBytesToHexString;
            String str3;
            String str4;
            String strOptString;
            String strOptString2;
            String strOptString3;
            int iBytesToInt;
            String str5;
            LogUtils.d(DKFRequestService.d, "createMailbox");
            h2s h2sVar = new h2s();
            h2sVar.c(bArr);
            Iterator<g2s> it = h2sVar.a().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    str2 = "";
                    strBytesToHexString = str2;
                    str3 = strBytesToHexString;
                    str4 = str3;
                    strOptString = str4;
                    strOptString2 = strOptString;
                    strOptString3 = strOptString2;
                    iBytesToInt = 0;
                    str5 = strOptString3;
                    break;
                }
                g2s next = it.next();
                if (next.a()[0] == DKFRequestService.r0[0] && next.a()[1] == DKFRequestService.r0[1]) {
                    h2s h2sVar2 = new h2s();
                    h2sVar2.c(next.b());
                    str2 = "";
                    strBytesToHexString = str2;
                    str3 = strBytesToHexString;
                    str4 = str3;
                    strOptString = str4;
                    strOptString2 = strOptString;
                    strOptString3 = strOptString2;
                    iBytesToInt = 0;
                    str5 = strOptString3;
                    for (g2s g2sVar : h2sVar2.a()) {
                        if (f2s.d(g2sVar.a(), DKFRequestService.k1)) {
                            str = new String(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.l1)) {
                            str5 = new String(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.n1)) {
                            str2 = new String(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.e0)) {
                            strBytesToHexString = Coder.bytesToHexString(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.i0)) {
                            str3 = new String(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.j0)) {
                            str4 = new String(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.k0)) {
                            iBytesToInt = Coder.bytesToInt(g2sVar.b());
                        } else if (f2s.d(g2sVar.a(), DKFRequestService.s)) {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(g2sVar.b()));
                                strOptString = jSONObject.optString("friendlyName");
                                strOptString2 = jSONObject.optString("target");
                                strOptString3 = jSONObject.optString(TSMAuthContants.PARAM_TARGET_DEVICE_TYPE);
                            } catch (JSONException e2) {
                                LogUtils.e(DKFRequestService.d, "parse json for CreateMailbox", e2);
                            }
                        }
                    }
                    break;
                }
            }
            LogUtils.t(DKFRequestService.d, "createMailbox, deviceClaim = " + str + ", payload = " + str5 + ", notificationToken = " + str2 + ", keyId = " + strBytesToHexString + ", keyValidFrom = " + str3 + ", keyValidTo = " + str4 + ", right = " + iBytesToInt + ", name = " + strOptString + ", target = " + strOptString2 + ", deviceType = " + strOptString3);
            kjs kjsVarG = new e2s().g(this.f10406a, str, str5, str2, strBytesToHexString, str3, str4, iBytesToInt, strOptString, strOptString2, strOptString3);
            if (kjsVarG == null) {
                LogUtils.e(DKFRequestService.d, "createMailbox response null");
                return DKFRequestService.A;
            }
            int errorCode = kjsVarG.getErrorCode();
            if (errorCode != 200 && errorCode != 201) {
                if (errorCode != 400) {
                    return errorCode != 401 ? DKFRequestService.A : DKFRequestService.E;
                }
                return DKFRequestService.D;
            }
            String strB = kjsVarG.a().b();
            String strA = kjsVarG.a().a();
            byte[] bArrB = b(a(DKFRequestService.m1, a(strB.getBytes().length), strB.getBytes()), a(DKFRequestService.l0, a(strA.getBytes().length), strA.getBytes()));
            return b(a(DKFRequestService.V, a(bArrB.length), bArrB), DKFRequestService.t);
        }

        @Override // com.miui.tsmclient.dkf.IDKFRequestService
        public byte[] dkfRequest(int i, byte[] bArr) throws RemoteException {
            try {
                switch (i) {
                    case DKFRequestService.s0 /* 4097 */:
                        return i(bArr);
                    case DKFRequestService.t0 /* 4098 */:
                        return k(bArr);
                    case DKFRequestService.u0 /* 4099 */:
                        return l(bArr);
                    case 4100:
                    case 4120:
                    case 4121:
                    default:
                        LogUtils.d(DKFRequestService.d, "dkfRequest unknown type");
                    case DKFRequestService.v0 /* 4101 */:
                        return null;
                    case DKFRequestService.w0 /* 4102 */:
                        return m(bArr);
                    case DKFRequestService.x0 /* 4103 */:
                        return a(bArr);
                    case 4104:
                        return e(bArr);
                    case DKFRequestService.z0 /* 4105 */:
                        return h(bArr);
                    case DKFRequestService.A0 /* 4106 */:
                        return q(bArr);
                    case DKFRequestService.B0 /* 4107 */:
                        return c(bArr);
                    case DKFRequestService.C0 /* 4108 */:
                        return b();
                    case DKFRequestService.D0 /* 4109 */:
                        return d(bArr);
                    case DKFRequestService.E0 /* 4110 */:
                        return p(bArr);
                    case DKFRequestService.F0 /* 4111 */:
                        return v(bArr);
                    case DKFRequestService.G0 /* 4112 */:
                        return f(bArr);
                    case DKFRequestService.H0 /* 4113 */:
                        return j(bArr);
                    case DKFRequestService.I0 /* 4114 */:
                        return c();
                    case DKFRequestService.J0 /* 4115 */:
                        return e();
                    case DKFRequestService.K0 /* 4116 */:
                        return u(bArr);
                    case DKFRequestService.L0 /* 4117 */:
                        return t(bArr);
                    case DKFRequestService.M0 /* 4118 */:
                        return d();
                    case DKFRequestService.N0 /* 4119 */:
                        return n(bArr);
                    case DKFRequestService.O0 /* 4122 */:
                        return o(bArr);
                    case DKFRequestService.P0 /* 4123 */:
                        return s(bArr);
                    case DKFRequestService.Q0 /* 4124 */:
                        return g(bArr);
                    case DKFRequestService.R0 /* 4125 */:
                        return r(bArr);
                }
            } catch (Exception e2) {
                LogUtils.e(DKFRequestService.d, "dkfRequest Exception ", e2);
            }
        }

        public final byte[] e(byte[] bArr) {
            BaseResponse baseResponseQ;
            LogUtils.d(DKFRequestService.d, "deactivateKey");
            String str = new String(a(bArr, DKFRequestService.e0));
            LogUtils.t(DKFRequestService.d, "deactivate key: " + str);
            HashMap map = new HashMap();
            map.put("keyId", str);
            String str2 = new String(a(bArr, DKFRequestService.f0));
            try {
                CarKeyCardInfo carKeyCardInfo = new CarKeyCardInfo();
                carKeyCardInfo.setVehicleOEMId(str2);
                baseResponseQ = new xus().q(this.f10406a, "CCC_SUSPEND_KEY", carKeyCardInfo, DKFRequestService.f.toJson(map));
            } catch (AuthApiException e2) {
                e = e2;
                LogUtils.e(DKFRequestService.d, "exception when deactivating key " + str + ": " + e);
                baseResponseQ = null;
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                LogUtils.e(DKFRequestService.d, "InterruptedException, " + e3);
                baseResponseQ = null;
            } catch (r.a e4) {
                e = e4;
                LogUtils.e(DKFRequestService.d, "exception when deactivating key " + str + ": " + e);
                baseResponseQ = null;
            }
            if (baseResponseQ != null) {
                return baseResponseQ.isSuccess() ? DKFRequestService.t : a(baseResponseQ.mResultCode, DKFRequestService.y);
            }
            return a(-1, DKFRequestService.z);
        }

        public final byte[] f(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "deleteMailbox");
            String str = new String(a(bArr, DKFRequestService.k1));
            String str2 = new String(a(bArr, DKFRequestService.m1));
            LogUtils.t(DKFRequestService.d, String.format("deleteMailbox, deviceClaim = %s, urlLink = %s", str, str2));
            CommonResponseInfo commonResponseInfoB = new e2s().b(this.f10406a, str, str2);
            if (commonResponseInfoB == null) {
                LogUtils.e(DKFRequestService.d, "deleteMailbox response null");
                return DKFRequestService.A;
            }
            int errorCode = commonResponseInfoB.getErrorCode();
            if (errorCode == 200 || errorCode == 201) {
                return DKFRequestService.t;
            }
            if (errorCode != 401) {
                return errorCode != 404 ? DKFRequestService.A : DKFRequestService.K;
            }
            return DKFRequestService.J;
        }

        public final byte[] g(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "delete share invitation");
            if (!NetworkUtil.isConnected(this.f10406a)) {
                return a(2, DKFRequestService.R);
            }
            try {
                String str = new String(TLVParser.parse(ByteArray.wrap(bArr)).getValue().findTLV(ByteArray.wrap(DKFRequestService.s)).getValue().toBytes().toBytes());
                LogUtils.t(DKFRequestService.d, "delete share invitation: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("keyId");
                String strOptString2 = jSONObject.optString("mailboxId");
                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                    CommonResponseInfo commonResponseInfoN = new e2s().n(this.f10406a, strOptString.toUpperCase(Locale.ROOT), strOptString2);
                    return commonResponseInfoN.isSuccess() ? DKFRequestService.t : a(commonResponseInfoN.getErrorCode(), DKFRequestService.R);
                }
                return a(22003, DKFRequestService.R);
            } catch (InvalidTLVException e2) {
                e = e2;
                LogUtils.e("delete share invitation", e);
                return a(22003, DKFRequestService.R);
            } catch (TagNotFoundException e3) {
                e = e3;
                LogUtils.e("delete share invitation", e);
                return a(22003, DKFRequestService.R);
            } catch (JSONException e4) {
                e = e4;
                LogUtils.e("delete share invitation", e);
                return a(22003, DKFRequestService.R);
            }
        }

        public final byte[] h(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "generateSession");
            String str = new String(a(bArr, DKFRequestService.e0));
            LogUtils.t(DKFRequestService.d, "generateSession, keyId = " + str);
            vns vnsVarQ = new e2s().q(this.f10406a, str);
            if (vnsVarQ.isSuccess() && vnsVarQ.a() != null) {
                GenerateSessionInfo generateSessionInfoA = vnsVarQ.a();
                String inviteLink = generateSessionInfoA.getInviteLink();
                String sessionId = generateSessionInfoA.getSessionId();
                byte[] bArrB = b(a(DKFRequestService.b0, a(sessionId.getBytes().length), sessionId.getBytes()), a(DKFRequestService.c0, a(inviteLink.getBytes().length), inviteLink.getBytes()));
                return b(a(DKFRequestService.V, a(bArrB.length), bArrB), DKFRequestService.t);
            }
            LogUtils.e(DKFRequestService.d, "generateSession failed, " + vnsVarQ.getErrorCode());
            return a(vnsVarQ.getErrorCode(), DKFRequestService.M);
        }

        public final byte[] i(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "getCAs");
            LogUtils.t(DKFRequestService.d, "vehicleOemId = " + new String(bArr));
            try {
                LogUtils.d(DKFRequestService.d, "getCAs start to get certs");
                JSONObject jSONObject = new JSONObject();
                if (!DKFRequestService.e) {
                    jSONObject.put(Constants.KEY_FID, ljs.l(this.f10406a));
                }
                CarKeyCardInfo carKeyCardInfo = new CarKeyCardInfo();
                carKeyCardInfo.setVehicleOEMId(new String(bArr));
                BaseResponse baseResponseQ = new xus().q(this.f10406a, Constants.OPERATION_CCC_CREATE_INSTANCE_CA, carKeyCardInfo, jSONObject.toString());
                if (!baseResponseQ.isSuccess()) {
                    return a(baseResponseQ.mResultCode, DKFRequestService.u);
                }
                LogUtils.d(DKFRequestService.d, "getCAs certs successfully after generating instance ca");
                return a(new e2s().k(this.f10406a, carKeyCardInfo, "DEVICE_OEM_CA_CERTIFICATE,INSTANCE_CA_CERTIFICATE,VEHICLE_OEM_CA_CERTIFICATE,VEHICLE_OEM_PRIVACY_ENCRYPTION_CERTIFICATE,VEHICLE_OEM_SIGNATURE_KEY_CERTIFICATE"));
            } catch (AuthApiException e2) {
                LogUtils.e(DKFRequestService.d, "occur AuthApiException", e2);
                return a(e2.mErrorCode, DKFRequestService.u);
            } catch (InterruptedException e3) {
                LogUtils.e(DKFRequestService.d, "occur InterruptedException", e3);
                Thread.currentThread().interrupt();
                return b(DKFRequestService.u);
            } catch (JSONException e4) {
                LogUtils.e(DKFRequestService.d, "occur InterruptedException", e4);
                return a(22003, DKFRequestService.u);
            } catch (r.a e5) {
                LogUtils.e(DKFRequestService.d, "occur SeiTSMApiException", e5);
                return a(e5.a(), DKFRequestService.u);
            }
        }

        public final byte[] j(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "invokeApp");
            String str = new String(a(bArr, DKFRequestService.o0));
            String str2 = new String(a(bArr, DKFRequestService.p0));
            String str3 = new String(a(bArr, DKFRequestService.q0));
            String str4 = new String(a(bArr, DKFRequestService.f0));
            String str5 = new String(a(bArr, DKFRequestService.o1));
            LogUtils.t(DKFRequestService.d, "packageName = " + str + ", appPairingLink = " + str2 + ", cardArt = " + str3 + ", vehicleOEMID = " + str4 + ", vehicleBrandID = " + str5);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fi5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17805a.f();
                    }
                });
                return DKFRequestService.R;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.miui.tsmclient", DKFRequestService.T0);
            intent.addFlags(268468224);
            intent.putExtra(Constants.EXTRA_APP_PACKAGE_NAME, str);
            intent.putExtra(Constants.EXTRA_APP_PAIRING_LINK, str2);
            intent.putExtra("cardArt", str3);
            intent.putExtra("vehicleOEMId", str4);
            intent.putExtra("vehicleBrandId", str5);
            this.f10406a.startActivity(intent);
            return DKFRequestService.t;
        }

        public final byte[] k(byte[] bArr) {
            String strOptString;
            int errorCode;
            String strB;
            String str;
            String str2;
            LogUtils.d(DKFRequestService.d, "ktsRegister");
            h2s h2sVar = new h2s();
            h2sVar.c(bArr);
            Iterator<g2s> it = h2sVar.a().iterator();
            String str3 = "";
            String str4 = "";
            String str5 = str4;
            String str6 = str5;
            String str7 = str6;
            String str8 = str7;
            String strB2 = str8;
            String strB3 = strB2;
            String strEncodeToString = strB3;
            String str9 = strEncodeToString;
            String str10 = str9;
            String str11 = str10;
            String strB4 = str11;
            String strB5 = strB4;
            String strB6 = strB5;
            String strB7 = strB6;
            String strOptString2 = strB7;
            String strOptString3 = strOptString2;
            String strOptString4 = strOptString3;
            while (true) {
                strOptString = str5;
                if (!it.hasNext()) {
                    break;
                }
                g2s next = it.next();
                Iterator<g2s> it2 = it;
                if (next.a()[0] == -65 && next.a()[1] == 16) {
                    h2s h2sVar2 = new h2s();
                    h2sVar2.c(next.b());
                    Iterator<g2s> it3 = h2sVar2.a().iterator();
                    String str12 = str3;
                    String str13 = str4;
                    while (it3.hasNext()) {
                        g2s next2 = it3.next();
                        String str14 = str13;
                        Iterator<g2s> it4 = it3;
                        if (f2s.d(next2.a(), DKFRequestService.d1)) {
                            str12 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "vehicleOEMId = " + str12);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.Z)) {
                            strB = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "keyID = " + strB);
                        } else {
                            strB = str6;
                        }
                        if (f2s.d(next2.a(), DKFRequestService.a0)) {
                            str7 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "friendlyName = " + str7);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.a1)) {
                            str8 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "keyDataVersion = " + str8);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.Z0)) {
                            strB2 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "keyDataEphemeralPublicKey = " + strB2);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.Y0)) {
                            strB3 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "keyDataPublicKeyHash = " + strB3);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.X0)) {
                            LogUtils.t(DKFRequestService.d, "keyData = " + strEncodeToString);
                            strEncodeToString = Base64.encodeToString(next2.b(), 0);
                            LogUtils.t(DKFRequestService.d, "keyData  Base64 = " + strEncodeToString);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.b1)) {
                            str9 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "keyType = " + str9);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.c1)) {
                            str10 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "sharingSessionId = " + str10);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.d0)) {
                            String str15 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "deviceModel = " + str15);
                            str = str15;
                        } else {
                            str = str14;
                        }
                        if (f2s.d(next2.a(), DKFRequestService.i1)) {
                            strB4 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "vehicleId = " + strB4);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.o1)) {
                            strB5 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "vehicleBrandId = " + strB5);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.r1)) {
                            strB6 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "terminatedKeyId = " + strB6);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.s1)) {
                            strB7 = f2s.b(next2.b());
                            LogUtils.t(DKFRequestService.d, "terminatedKeyAttestation = " + strB7);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.t1)) {
                            str11 = new String(next2.b());
                            LogUtils.t(DKFRequestService.d, "pairingType = " + str11);
                        }
                        if (f2s.d(next2.a(), DKFRequestService.s)) {
                            try {
                                String str16 = new String(next2.b());
                                String str17 = DKFRequestService.d;
                                StringBuilder sb = new StringBuilder();
                                str2 = str;
                                try {
                                    sb.append("extra data = ");
                                    sb.append(str16);
                                    LogUtils.t(str17, sb.toString());
                                    JSONObject jSONObject = new JSONObject(str16);
                                    strOptString = jSONObject.optString("authType");
                                    strOptString2 = jSONObject.optString(TSMAuthContants.PARAM_ACTIVATION_OPTIONS);
                                    strOptString3 = jSONObject.optString(TSMAuthContants.PARAM_SHARE_LINK);
                                    strOptString4 = jSONObject.optString("vehicleWirelessCapabilities");
                                } catch (JSONException e2) {
                                    e = e2;
                                    LogUtils.e(DKFRequestService.d, "parse extra data", e);
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                str2 = str;
                            }
                        } else {
                            str2 = str;
                        }
                        str13 = str2;
                        it3 = it4;
                        str6 = strB;
                        str12 = str12;
                    }
                    str4 = str13;
                    str3 = str12;
                }
                str5 = strOptString;
                it = it2;
            }
            e7t.a aVarU = new e7t.a().t(str3).k(str6).f(str7).j(str8).h(strB2).i(strB3).g(strEncodeToString).l(str9).e(a()).o(str10).d(DKFRequestService.e ? CardEnvironmentConfig.getDeviceInfo().getDeviceModel() : str4).s(strB4).r(strB5).q(strB6).p(strB7).m(str11).c(strOptString).a(strOptString2).n(strOptString3).u(strOptString4);
            if (DKFRequestService.e) {
                int i = 0;
                do {
                    nxs nxsVarI = new e2s().i(this.f10406a, aVarU);
                    TLVBuilder tLVBuilder = new TLVBuilder(ByteArray.wrap(DKFRequestService.V));
                    if (!nxsVarI.isSuccess()) {
                        errorCode = nxsVarI.getErrorCode();
                        if (errorCode != 50000 && errorCode != 50401) {
                            if (errorCode != 2 && errorCode != 500 && errorCode != 503) {
                                break;
                            }
                            i++;
                        } else {
                            return b(tLVBuilder.buildArray(), DKFRequestService.S);
                        }
                    } else {
                        KeyTrackingInfo keyTrackingInfoA = nxsVarI.a();
                        KeyTrackingInfo.UiBundle uiBundle = keyTrackingInfoA.getUiBundle();
                        if (uiBundle != null) {
                            if (uiBundle.getKtsSignature() != null) {
                                byte[] bArrHexStringToBytes = Coder.hexStringToBytes(keyTrackingInfoA.getUiBundle().getKtsSignature());
                                if (bArrHexStringToBytes.length > 0) {
                                    tLVBuilder.addBytes(ByteArray.wrap(DKFRequestService.g1), bArrHexStringToBytes);
                                }
                            }
                            tLVBuilder.addBytes(ByteArray.wrap(DKFRequestService.s), uiBundle.toJson().getBytes());
                        }
                        if (keyTrackingInfoA.getVehicleMobilizationData() != null) {
                            tLVBuilder.addBytes(ByteArray.wrap(DKFRequestService.h1), keyTrackingInfoA.getVehicleMobilizationData().toJson().getBytes());
                        }
                        byte[] bArrBuildArray = tLVBuilder.buildArray();
                        LogUtils.t(DKFRequestService.d, "ktsRegister exit, tlvBytes = " + Coder.bytesToHexString(bArrBuildArray));
                        return b(bArrBuildArray, DKFRequestService.t);
                    }
                } while (i < 3);
                return a(errorCode, DKFRequestService.T);
            }
            if (!NetworkUtil.isConnected(this.f10406a)) {
                return b(b(DKFRequestService.V, a(0)), DKFRequestService.U);
            }
            nxs nxsVarI2 = new e2s().i(this.f10406a, aVarU);
            if (nxsVarI2 == null) {
                return b(b(DKFRequestService.V, a(0)), DKFRequestService.T);
            }
            if (!nxsVarI2.isSuccess()) {
                int errorCode2 = nxsVarI2.getErrorCode();
                byte[] bArrB = b(DKFRequestService.V, a(0));
                if (errorCode2 == 50000 || errorCode2 == 50401) {
                    return b(bArrB, DKFRequestService.S);
                }
                return (errorCode2 == 2 || errorCode2 == 500 || errorCode2 == 503) ? b(bArrB, DKFRequestService.U) : b(bArrB, DKFRequestService.T);
            }
            KeyTrackingInfo keyTrackingInfoA2 = nxsVarI2.a();
            LogUtils.t(DKFRequestService.d, "KeyTrackingInfo info = " + keyTrackingInfoA2);
            byte[] bArrA = new byte[0];
            byte[] bArrA2 = new byte[0];
            byte[] bArrA3 = new byte[0];
            if (keyTrackingInfoA2 != null) {
                KeyTrackingInfo.UiBundle uiBundle2 = keyTrackingInfoA2.getUiBundle();
                if (uiBundle2 != null) {
                    if (uiBundle2.getKtsSignature() != null) {
                        byte[] bArrE = f2s.e(keyTrackingInfoA2.getUiBundle().getKtsSignature());
                        LogUtils.t(DKFRequestService.d, "RSP ktsSignature = " + f2s.b(bArrE));
                        if (bArrE.length > 0) {
                            bArrA = a(DKFRequestService.g1, a(bArrE.length), bArrE);
                        }
                    } else {
                        LogUtils.e(DKFRequestService.d, "KtsSignature is null");
                    }
                    byte[] bytes = uiBundle2.toJson().getBytes();
                    bArrA3 = a(DKFRequestService.s, a(bytes.length), bytes);
                }
                if (keyTrackingInfoA2.getVehicleMobilizationData() != null) {
                    String json = keyTrackingInfoA2.getVehicleMobilizationData().toJson();
                    LogUtils.t(DKFRequestService.d, "ktsRegister mobData " + json);
                    byte[] bytes2 = json.getBytes();
                    bArrA2 = a(DKFRequestService.h1, a(bytes2.length), bytes2);
                }
            }
            byte[] bArrA4 = a(bArrA, bArrA2, bArrA3);
            byte[] bArrA5 = a(DKFRequestService.V, a(bArrA4.length), bArrA4);
            LogUtils.t(DKFRequestService.d, "ktsRegister exit, tlvBytes = " + f2s.b(bArrA5));
            return b(bArrA5, keyTrackingInfoA2 == null ? DKFRequestService.T : DKFRequestService.t);
        }

        public final byte[] l(byte[] bArr) {
            String strB;
            int iBytesToInt;
            int iBytesToInt2;
            LogUtils.d(DKFRequestService.d, "ktsTerminate");
            h2s h2sVar = new h2s();
            h2sVar.c(bArr);
            Iterator<g2s> it = h2sVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strB = "";
                    iBytesToInt = 0;
                    iBytesToInt2 = 0;
                    break;
                }
                g2s next = it.next();
                if (f2s.d(DKFRequestService.r0, next.a())) {
                    h2s h2sVar2 = new h2s();
                    h2sVar2.c(next.b());
                    strB = f2s.b(h2sVar2.b(DKFRequestService.Z));
                    iBytesToInt = Coder.bytesToInt(h2sVar2.b(DKFRequestService.e1));
                    iBytesToInt2 = Coder.bytesToInt(h2sVar2.b(DKFRequestService.f1));
                    break;
                }
            }
            LogUtils.t(DKFRequestService.d, "send delete to server, keyID = " + strB + ", offset = " + iBytesToInt + ", length = " + iBytesToInt2);
            CarKeyCardInfo carKeyCardInfo = new CarKeyCardInfo();
            carKeyCardInfo.setVehicleOEMId("all");
            carKeyCardInfo.setKeyId(strB);
            BaseResponse baseResponseN = new xus().n(this.f10406a, carKeyCardInfo, iBytesToInt, iBytesToInt2);
            if (!baseResponseN.isSuccess()) {
                return a(baseResponseN.mResultCode, DKFRequestService.w);
            }
            CardInfoManager cardInfoManager = CardInfoManager.getInstance(this.f10406a);
            CardInfo cardInfo = cardInfoManager.getCardInfo(strB);
            if (cardInfo != null) {
                if (((CarKeyCardInfo) cardInfo).isOwnerType()) {
                    PrefUtils.remove(this.f10406a, strB);
                }
                cardInfoManager.updateCards(CardGroupType.CCC);
            }
            return DKFRequestService.t;
        }

        public final byte[] m(byte[] bArr) {
            String strB;
            h2s h2sVar = new h2s();
            h2sVar.c(bArr);
            byte[] bArrB = h2sVar.b(DKFRequestService.r0);
            if (bArrB != null) {
                h2s h2sVar2 = new h2s();
                h2sVar2.c(bArrB);
                strB = f2s.b(h2sVar2.b(DKFRequestService.o1));
            } else {
                strB = null;
            }
            LogUtils.d(DKFRequestService.d, "listKey, vehicleBrandId: " + strB);
            String strJ = new e2s().j(this.f10406a, null, strB, ProductList.ProductInfo.CCC_TYPE);
            return strJ == null ? b(DKFRequestService.x) : b(a(DKFRequestService.V, a(strJ.getBytes().length), strJ.getBytes()), DKFRequestService.t);
        }

        public final byte[] n(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "notify RKE data");
            LogUtils.t("notify RKE data: " + Coder.bytesToHexString(bArr));
            try {
                String string = TLVParser.parseTLVValue(ByteArray.wrap(bArr)).findTLV(ByteArray.wrap(DKFRequestService.e0)).getValue().toBytes().toString();
                RKEDataHelper rKEDataHelper = new RKEDataHelper();
                rKEDataHelper.update(this.f10406a, bArr, rKEDataHelper.get(this.f10406a, string));
            } catch (InvalidTLVException | TagNotFoundException e2) {
                LogUtils.e("notify rke data", e2);
            }
            return DKFRequestService.t;
        }

        public final byte[] o(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "notify pwd data");
            try {
                JSONObject jSONObject = new JSONObject(new String(TLVParser.parse(ByteArray.wrap(bArr)).getValue().findTLV(ByteArray.wrap(DKFRequestService.s)).getValue().toBytes().toBytes()));
                String strOptString = jSONObject.optString(e);
                Locale locale = Locale.ROOT;
                String upperCase = strOptString.toUpperCase(locale);
                String upperCase2 = jSONObject.optString(f).toUpperCase(locale);
                String strOptString2 = jSONObject.optString("pwd");
                String string = PrefUtils.getString(this.f10406a, upperCase, "{}");
                Gson gson = new Gson();
                Map map = (Map) gson.fromJson(string, new C0331a().getType());
                map.put(upperCase2, strOptString2);
                PrefUtils.putString(this.f10406a, upperCase, gson.toJson(map));
            } catch (InvalidTLVException | TagNotFoundException | JSONException e2) {
                LogUtils.e("notify pwd data", e2);
            }
            return DKFRequestService.t;
        }

        public final byte[] p(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "queryMailbox");
            String str = new String(a(bArr, DKFRequestService.k1));
            String str2 = new String(a(bArr, DKFRequestService.m1));
            LogUtils.t(DKFRequestService.d, String.format("queryMailbox, deviceClaim = %s, urlLink = %s", str, str2));
            f3t f3tVarS = new e2s().s(this.f10406a, str, str2);
            if (f3tVarS == null) {
                LogUtils.e(DKFRequestService.d, "queryMailbox response null");
                return DKFRequestService.A;
            }
            int errorCode = f3tVarS.getErrorCode();
            if (errorCode == 200 || errorCode == 201) {
                String json = f3tVarS.a().toJson();
                String strD = f3tVarS.c().d();
                byte[] bArrB = b(a(DKFRequestService.j1, a(json.getBytes().length), json.getBytes()), a(DKFRequestService.l1, a(strD.getBytes().length), strD.getBytes()));
                return b(a(DKFRequestService.V, a(bArrB.length), bArrB), DKFRequestService.t);
            }
            if (errorCode == 400) {
                return DKFRequestService.D;
            }
            if (errorCode != 401) {
                return errorCode != 404 ? DKFRequestService.A : DKFRequestService.F;
            }
            return DKFRequestService.E;
        }

        public final byte[] q(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "redeemSession");
            String str = new String(a(bArr, DKFRequestService.f0));
            String str2 = new String(a(bArr, DKFRequestService.b0));
            String str3 = new String(a(bArr, DKFRequestService.g0));
            LogUtils.t(DKFRequestService.d, "redeemSession, sessionId = " + str2);
            CommonResponseInfo commonResponseInfoO = new e2s().o(this.f10406a, str, str2, str3);
            if (commonResponseInfoO.isSuccess()) {
                return DKFRequestService.t;
            }
            int errorCode = commonResponseInfoO.getErrorCode();
            LogUtils.e(DKFRequestService.d, "redeemSession failed, " + errorCode);
            return a(errorCode, DKFRequestService.N);
        }

        public final byte[] r(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "relinquishMailbox");
            String str = new String(a(bArr, DKFRequestService.k1));
            String str2 = new String(a(bArr, DKFRequestService.m1));
            LogUtils.t(DKFRequestService.d, String.format("relinquishMailbox, deviceClaim = %s, urlLink = %s", str, str2));
            CommonResponseInfo commonResponseInfoT = new e2s().t(this.f10406a, str, str2);
            if (commonResponseInfoT == null) {
                LogUtils.e(DKFRequestService.d, "relinquishMailbox response null");
                return DKFRequestService.A;
            }
            int errorCode = commonResponseInfoT.getErrorCode();
            if (errorCode == 200 || errorCode == 201) {
                return DKFRequestService.t;
            }
            if (errorCode != 401) {
                return errorCode != 404 ? DKFRequestService.A : DKFRequestService.K;
            }
            return DKFRequestService.J;
        }

        public final byte[] s(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "update share invitation");
            if (!NetworkUtil.isConnected(this.f10406a)) {
                return a(2, DKFRequestService.R);
            }
            try {
                String str = new String(TLVParser.parse(ByteArray.wrap(bArr)).getValue().findTLV(ByteArray.wrap(DKFRequestService.s)).getValue().toBytes().toBytes());
                LogUtils.t(DKFRequestService.d, "update share invitation param: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("keyId");
                String strOptString2 = jSONObject.optString("mailboxId");
                String strOptString3 = jSONObject.optString(TSMAuthContants.PARAM_SHARED_ID);
                int iOptInt = jSONObject.optInt(TSMAuthContants.PARAM_SHARE_DATA_TYPE);
                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                    e2s e2sVar = new e2s();
                    Context context = this.f10406a;
                    Locale locale = Locale.ROOT;
                    CommonResponseInfo commonResponseInfoC = e2sVar.c(context, strOptString.toUpperCase(locale), strOptString3.toUpperCase(locale), strOptString2, iOptInt);
                    if (!commonResponseInfoC.isSuccess()) {
                        return a(commonResponseInfoC.getErrorCode(), DKFRequestService.R);
                    }
                    if (iOptInt != 3) {
                        Intent intent = new Intent(Constants.ACTION_EVENT_TYPE_UPDATE_SHARED_INVITATION);
                        intent.putExtra("keyId", strOptString.toUpperCase(locale));
                        this.f10406a.sendBroadcast(intent);
                    }
                    return DKFRequestService.t;
                }
                return a(22003, DKFRequestService.R);
            } catch (InvalidTLVException e2) {
                e = e2;
                LogUtils.e("update share invitation", e);
                return a(22003, DKFRequestService.R);
            } catch (TagNotFoundException e3) {
                e = e3;
                LogUtils.e("update share invitation", e);
                return a(22003, DKFRequestService.R);
            } catch (JSONException e4) {
                e = e4;
                LogUtils.e("update share invitation", e);
                return a(22003, DKFRequestService.R);
            }
        }

        public final byte[] t(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "reportTrackResult");
            CommonResponseInfo commonResponseInfoA = new e2s().a(this.f10406a, Coder.bytesToHexString(a(bArr, DKFRequestService.Z)), Coder.bytesToInt(a(bArr, DKFRequestService.p1)), new String(a(bArr, DKFRequestService.q1)));
            if (commonResponseInfoA != null) {
                return commonResponseInfoA.isSuccess() ? DKFRequestService.t : DKFRequestService.A;
            }
            LogUtils.e(DKFRequestService.d, "reportTrackResult response null");
            return DKFRequestService.A;
        }

        public final byte[] u(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "terminateRemoteDigitalKey");
            CommonResponseInfo commonResponseInfoD = new e2s().d(this.f10406a, Coder.bytesToHexString(a(bArr, DKFRequestService.Z)), new String(a(bArr, DKFRequestService.m0)), new String(a(bArr, DKFRequestService.a1)), Coder.bytesToHexString(a(bArr, DKFRequestService.Z0)), Coder.bytesToHexString(a(bArr, DKFRequestService.Y0)), new String(a(bArr, DKFRequestService.n0)));
            if (commonResponseInfoD != null) {
                return commonResponseInfoD.isSuccess() ? DKFRequestService.t : DKFRequestService.A;
            }
            LogUtils.e(DKFRequestService.d, "terminateRemoteDigitalKey response null");
            return DKFRequestService.A;
        }

        public final byte[] v(byte[] bArr) {
            LogUtils.d(DKFRequestService.d, "updateMailbox");
            String str = new String(a(bArr, DKFRequestService.k1));
            String str2 = new String(a(bArr, DKFRequestService.m1));
            String str3 = new String(a(bArr, DKFRequestService.l1));
            String str4 = new String(a(bArr, DKFRequestService.n1));
            LogUtils.t(DKFRequestService.d, String.format("updateMailbox, deviceClaim = %s, urlLink = %s, payload=%s, notificationToken = %s", str, str2, str3, str4));
            e5t e5tVarL = new e2s().l(this.f10406a, str, str3, str2, str4);
            if (e5tVarL == null) {
                LogUtils.e(DKFRequestService.d, "updateMailbox response null");
                return DKFRequestService.A;
            }
            int errorCode = e5tVarL.getErrorCode();
            if (errorCode == 200 || errorCode == 201) {
                return DKFRequestService.t;
            }
            if (errorCode == 400) {
                return DKFRequestService.G;
            }
            if (errorCode != 401) {
                return errorCode != 404 ? DKFRequestService.A : DKFRequestService.I;
            }
            return DKFRequestService.H;
        }

        public final byte[] a(List<CertificateInfo> list) {
            byte[] bArr;
            byte[] bArrB = new byte[0];
            for (CertificateInfo certificateInfo : list) {
                String certificateType = certificateInfo.getCertificateType();
                certificateType.hashCode();
                switch (certificateType) {
                    case "VEHICLE_OEM_PRIVACY_ENCRYPTION_CERTIFICATE":
                        bArr = DKFRequestService.V0;
                        break;
                    case "VEHICLE_OEM_CA_CERTIFICATE":
                        bArr = DKFRequestService.Y;
                        break;
                    case "INSTANCE_CA_CERTIFICATE":
                        bArr = DKFRequestService.W;
                        break;
                    case "VEHICLE_OEM_SIGNATURE_KEY_CERTIFICATE":
                        bArr = DKFRequestService.W0;
                        break;
                    case "DEVICE_OEM_CA_CERTIFICATE":
                        bArr = DKFRequestService.X;
                        break;
                    default:
                        continue;
                        break;
                }
                byte[] bArrDecode = Base64.decode(a(certificateInfo.getCertificate()), 0);
                bArrB = b(bArrB, a(bArr, a(bArrDecode.length), bArrDecode));
            }
            byte[] bArrB2 = b(a(DKFRequestService.V, a(bArrB.length), bArrB), DKFRequestService.t);
            LogUtils.t(DKFRequestService.d, "Get CA data all : " + f2s.b(bArrB2));
            return bArrB2;
        }

        public final byte[] b() {
            LogUtils.d(DKFRequestService.d, "getMailboxConfiguration");
            hss hssVarH = new e2s().h(this.f10406a);
            if (hssVarH == null) {
                LogUtils.e(DKFRequestService.d, "getMailboxConfiguration response null");
                return DKFRequestService.A;
            }
            int errorCode = hssVarH.getErrorCode();
            if (errorCode != 200) {
                if (errorCode != 401) {
                    return errorCode != 404 ? DKFRequestService.A : DKFRequestService.C;
                }
                return DKFRequestService.B;
            }
            String json = hssVarH.a().getDisplayInformation().toJson();
            String jsonString = hssVarH.a().getMailboxConfiguration().toJsonString();
            byte[] bArrB = b(a(DKFRequestService.j1, a(json.getBytes().length), json.getBytes()), a(DKFRequestService.h0, a(jsonString.getBytes().length), jsonString.getBytes()));
            return b(a(DKFRequestService.V, a(bArrB.length), bArrB), DKFRequestService.t);
        }

        public final byte[] c() {
            LogUtils.d(DKFRequestService.d, "getNotificationToken");
            bvs bvsVarU = new e2s().u(this.f10406a, a());
            if (bvsVarU == null) {
                LogUtils.e(DKFRequestService.d, "getNotificationToken response null");
                return DKFRequestService.A;
            }
            int errorCode = bvsVarU.getErrorCode();
            if (errorCode != 200) {
                return errorCode != 401 ? DKFRequestService.A : DKFRequestService.L;
            }
            String json = bvsVarU.a().toJson();
            byte[] bArrA = a(DKFRequestService.n1, a(json.getBytes().length), json.getBytes());
            return b(a(DKFRequestService.V, a(bArrA.length), bArrA), DKFRequestService.t);
        }

        public final byte[] d() {
            LogUtils.d(DKFRequestService.d, "getPolicy");
            String strP = new e2s().p(this.f10406a);
            return strP == null ? b(DKFRequestService.Q) : b(a(DKFRequestService.V, a(strP.getBytes().length), strP.getBytes()), DKFRequestService.t);
        }

        public final byte[] e() {
            LogUtils.d(DKFRequestService.d, "getVehicleOemPackageNames");
            String strR = new e2s().r(this.f10406a);
            return strR == null ? b(DKFRequestService.P) : b(a(DKFRequestService.V, a(strR.getBytes().length), strR.getBytes()), DKFRequestService.t);
        }

        public final /* synthetic */ void f() {
            Context context = this.f10406a;
            Toast.makeText(context, ResUtils.getString(context, "car_key_invoke_failed"), 0).show();
        }

        public final byte[] a(int i, byte[] bArr) {
            byte[] bytes = String.valueOf(i).getBytes();
            byte[] bArrA = a(DKFRequestService.U0, a(bytes.length), bytes);
            return b(a(DKFRequestService.V, a(bArrA.length), bArrA), bArr);
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public final byte[] a(int i) {
            byte[] bArr = new byte[0];
            if (i >= 0 && i < 127) {
                return new byte[]{(byte) i};
            }
            if (127 <= i && i < 255) {
                return new byte[]{-127, (byte) i};
            }
            if (255 <= i && i < 65535) {
                return b(new byte[]{-126}, Coder.hexStringToBytes(String.format("%04X", Integer.valueOf(i & 65535))));
            }
            if (65535 <= i && i < 16777215) {
                return b(new byte[]{-125}, Coder.hexStringToBytes(String.format("%06X", Integer.valueOf(i & 16777215))));
            }
            if (16777215 <= i && i < 4294967295L) {
                return b(new byte[]{-124}, Coder.hexStringToBytes(String.format("%08X", Integer.valueOf(i))));
            }
            LogUtils.e(DKFRequestService.d, "error length");
            return bArr;
        }

        public final boolean a(List<CertificateInfo> list, String str) {
            Iterator<CertificateInfo> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getCertificateType(), str)) {
                    return true;
                }
            }
            return false;
        }

        public final String a() {
            int deviceType = CardEnvironmentConfig.getDeviceInfo().getDeviceType();
            if (deviceType == 1) {
                return "PHONE";
            }
            return deviceType == 3 ? "WATCH" : d;
        }

        public final String a(String str) {
            String[] strArrSplit = str.split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArrSplit) {
                if (!str2.startsWith("-----")) {
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            int iBytesToInt;
            int i;
            int i2 = 0;
            while (true) {
                if (i2 > bArr.length - 1) {
                    i2 = -1;
                    break;
                }
                if (bArr[i2] == bArr2[0] && bArr[i2 + 1] == bArr2[1]) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                return new byte[0];
            }
            byte b2 = bArr[i2 + 2];
            if (b2 == -124) {
                iBytesToInt = Coder.bytesToInt(bArr[i2 + 3], bArr[i2 + 4], bArr[i2 + 5], bArr[i2 + 6]);
                i = i2 + 7;
            } else if (b2 == -125) {
                iBytesToInt = Coder.bytesToInt(bArr[i2 + 3], bArr[4 + i2], bArr[i2 + 5]);
                i = i2 + 6;
            } else if (b2 == -126) {
                iBytesToInt = Coder.bytesToInt(bArr[3 + i2], bArr[4 + i2]);
                i = i2 + 5;
            } else if (b2 == -127) {
                iBytesToInt = Coder.bytesToInt(bArr[3 + i2]);
                i = i2 + 4;
            } else {
                iBytesToInt = Coder.bytesToInt(b2);
                i = i2 + 3;
            }
            return Arrays.copyOfRange(bArr, i, iBytesToInt + i);
        }

        public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
            return bArr4;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f10404a == null) {
            this.f10404a = new a(getApplicationContext());
        }
        LogUtils.t(d, "onBind");
        return this.f10404a.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtils.t(d, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtils.t(d, LifecycleConstantKt.ON_DESTROY);
    }
}
