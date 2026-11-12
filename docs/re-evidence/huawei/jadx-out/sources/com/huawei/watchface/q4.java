package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.utils.HwLog;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSigner;
import com.tencent.open.SocialOperation;
import defpackage.yqe;
import defpackage.yqj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class q4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q4 f30548c = null;
    public static final Object d = new Object();
    public static volatile boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CredentialClient f30549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f30550b = new ConcurrentHashMap();

    public q4() {
        g();
    }

    public static q4 e() {
        if (f30548c == null) {
            synchronized (d) {
                if (f30548c == null) {
                    f30548c = new q4();
                }
            }
        }
        return f30548c;
    }

    public String a(String str) {
        try {
            Credential credentialD = d();
            if (credentialD != null) {
                return new CredentialSigner.Builder().withAlg(CredentialSignAlg.HMAC_SHA256).withCredential(credentialD).withCredentialClient(this.f30549a).build().getSignHandler().from(str.getBytes(StandardCharsets.UTF_8)).signBase64();
            }
            HwLog.i("UcsHelper", "getSignResult credential is null");
            return "";
        } catch (yqe e2) {
            HwLog.e("UcsHelper", "UcsCryptoException , message : " + HwLog.printException((Exception) e2));
            return "";
        } catch (yqj e3) {
            HwLog.e("UcsHelper", "UcsException , code :" + e3.e() + " message : " + HwLog.printException((Exception) e3));
            return "";
        }
    }

    public String b() {
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        if (hwWatchFaceApi == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(q0.e());
        arrayList.add("5");
        arrayList.add(hwWatchFaceApi.getDeviceModel() + hwWatchFaceApi.getSoftVersion());
        String strJoin = String.join("_", arrayList);
        FlavorConfig.safeHwLog("UcsHelper", "buildWatchSignParams:" + strJoin);
        return strJoin;
    }

    public String c() {
        Credential credential = (Credential) this.f30550b.get("WatchfaceUcsCredentialId");
        return credential != null ? credential.getAccessKey() : "";
    }

    public final Credential d() {
        synchronized (this) {
            HwLog.i("UcsHelper", "getCredential enter");
            Credential credential = (Credential) this.f30550b.get("WatchfaceUcsCredentialId");
            if (credential != null && credential.getExpireTime() > System.currentTimeMillis() + 86400000) {
                return credential;
            }
            String strB = e4.b("ucs_credentials_WatchfaceUcsCredentialId", "themename");
            String strA = k5.a(strB, "storagePw");
            if (!TextUtils.isEmpty(strA) && !strA.equals(strB)) {
                CredentialClient credentialClient = this.f30549a;
                if (credentialClient == null) {
                    g();
                    return null;
                }
                Credential credentialGenCredentialFromString = credentialClient.genCredentialFromString(strA);
                if (credentialGenCredentialFromString != null && System.currentTimeMillis() + 86400000 <= credentialGenCredentialFromString.getExpireTime()) {
                    this.f30550b.put("WatchfaceUcsCredentialId", credentialGenCredentialFromString);
                    return credentialGenCredentialFromString;
                }
                HwLog.i("UcsHelper", "credential expired");
                return a();
            }
            HwLog.i("UcsHelper", "empty credential in sp");
            return a();
        }
    }

    public String f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SocialOperation.GAME_SIGNATURE, a(b()));
            jSONObject.put("accessKey", c());
            jSONObject.put(HwPayConstant.KEY_SIGN_TYPE, "0");
            return jSONObject.toString();
        } catch (JSONException e2) {
            HwLog.e("UcsHelper", "getWatchSign JSONException:" + HwLog.printException((Exception) e2));
            return "";
        }
    }

    public final void g() {
        try {
            this.f30549a = new CredentialClient.Builder().context(Environment.getApplicationContext()).serCountry(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode()).build();
        } catch (Exception e2) {
            HwLog.e("UcsHelper", "Failed to initialize CredentialClient: " + HwLog.printException(e2));
        }
    }

    public final void h() {
        HwLog.i("UcsHelper", "initUcs enter");
        if (this.f30549a == null) {
            g();
        }
        try {
            d();
            e = true;
        } catch (yqj e2) {
            HwLog.e("UcsHelper", "init UcsException , code :" + e2.e() + " message : " + HwLog.printException((Exception) e2));
        }
    }

    public void i() {
        if (e) {
            return;
        }
        synchronized (d) {
            if (e) {
                return;
            }
            HwLog.i("UcsHelper", "initUcsSDK");
            h();
        }
    }

    public final Credential a() throws yqj {
        Credential credentialApplyCredential = this.f30549a.applyCredential(Environment.b());
        this.f30550b.put("WatchfaceUcsCredentialId", credentialApplyCredential);
        e4.b("ucs_credentials_WatchfaceUcsCredentialId", k5.c(credentialApplyCredential.toString(), "storagePw"), "themename");
        HwLog.i("UcsHelper", "applyCredential mCredentialMap size:" + this.f30550b.size());
        return credentialApplyCredential;
    }
}
