package com.huawei.hms.support.api.safetydetect;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hms.support.api.entity.safetydetect.MaliciousAppsListResp;
import com.huawei.hms.support.api.entity.safetydetect.RiskTokenResponse;
import com.huawei.hms.support.api.entity.safetydetect.SysIntegrityRequest;
import com.huawei.hms.support.api.entity.safetydetect.SysIntegrityResp;
import com.huawei.hms.support.api.entity.safetydetect.UrlCheckResponse;
import com.huawei.hms.support.api.entity.safetydetect.UserDetectResponse;
import com.huawei.hms.support.api.entity.safetydetect.VerifyAppsCheckEnabledResp;
import com.huawei.hms.support.api.entity.safetydetect.WifiDetectResponse;
import com.huawei.hms.support.api.safetydetect.p001default.a0;
import com.huawei.hms.support.api.safetydetect.p001default.b;
import com.huawei.hms.support.api.safetydetect.p001default.b0;
import com.huawei.hms.support.api.safetydetect.p001default.c;
import com.huawei.hms.support.api.safetydetect.p001default.c0;
import com.huawei.hms.support.api.safetydetect.p001default.d0;
import com.huawei.hms.support.api.safetydetect.p001default.e0;
import com.huawei.hms.support.api.safetydetect.p001default.f;
import com.huawei.hms.support.api.safetydetect.p001default.f0;
import com.huawei.hms.support.api.safetydetect.p001default.g;
import com.huawei.hms.support.api.safetydetect.p001default.h;
import com.huawei.hms.support.api.safetydetect.p001default.i;
import com.huawei.hms.support.api.safetydetect.p001default.j;
import com.huawei.hms.support.api.safetydetect.p001default.k;
import com.huawei.hms.support.api.safetydetect.p001default.l;
import com.huawei.hms.support.api.safetydetect.p001default.n;
import com.huawei.hms.support.api.safetydetect.p001default.p;
import com.huawei.hms.support.api.safetydetect.p001default.q;
import com.huawei.hms.support.api.safetydetect.p001default.r;
import com.huawei.hms.support.api.safetydetect.p001default.u;
import com.huawei.hms.support.api.safetydetect.p001default.v;
import com.huawei.hms.support.api.safetydetect.p001default.w;
import com.huawei.hms.support.api.safetydetect.p001default.x;
import com.huawei.hms.support.api.safetydetect.p001default.y;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.SHA256;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class a extends HuaweiApi<u> implements SafetyDetectClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16552b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f16553c = new r();
    private static final Api<u> d = new Api<>("HuaweiSafetyDetect.API");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16554a;

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<UserDetectResponse> userDetection(String str) {
        Checker.checkNonNull(str);
        return doWrite(new c0(getContext(), "safetydetect.userDetection", new d0(str).a(), true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<UrlCheckResponse> urlCheck(String str, String str2, int... iArr) {
        Checker.checkNonNull(str);
        Checker.checkNonNull(str2);
        return doWrite(new a0(getContext(), "safetydetect.urlCheck", new b0(str, str2, iArr).a(), true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<SysIntegrityResp> sysIntegrity(byte[] bArr, String str) {
        SysIntegrityRequest sysIntegrityRequest = new SysIntegrityRequest();
        sysIntegrityRequest.setAlg(CommonPickerConstant.IdTokenSupportAlg.RS_256);
        sysIntegrityRequest.setAppId(str);
        sysIntegrityRequest.setNonce(bArr);
        return sysIntegrity(sysIntegrityRequest);
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<SysIntegrityResp> sysIntegrity(SysIntegrityRequest sysIntegrityRequest) {
        ApiException e;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (sysIntegrityRequest != null) {
            try {
                if (!TextUtils.isEmpty(sysIntegrityRequest.getAlg()) && !TextUtils.isEmpty(sysIntegrityRequest.getAppId()) && sysIntegrityRequest.getNonce() != null) {
                    String alg = sysIntegrityRequest.getAlg();
                    byte[] nonce = sysIntegrityRequest.getNonce();
                    String appId = sysIntegrityRequest.getAppId();
                    a(nonce);
                    if (!CommonPickerConstant.IdTokenSupportAlg.RS_256.equals(alg) && !"PS256".equals(alg)) {
                        throw new ApiException(new Status(SafetyDetectStatusCodes.PARAM_ERROR_INVALID, SafetyDetectStatusCodes.getStatusCodeString(SafetyDetectStatusCodes.PARAM_ERROR_INVALID)));
                    }
                    return doWrite(new y(getContext(), "safetydetect.sysIntegrity", a(nonce, appId, alg, this.f16554a).a(), true));
                }
            } catch (ApiException e2) {
                e = e2;
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            } catch (Exception unused) {
                e = new ApiException(new Status(SafetyDetectStatusCodes.SDK_INTERNAL_ERROR, SafetyDetectStatusCodes.getStatusCodeString(SafetyDetectStatusCodes.SDK_INTERNAL_ERROR)));
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            }
        }
        throw new ApiException(new Status(SafetyDetectStatusCodes.PARAM_ERROR_EMPTY, SafetyDetectStatusCodes.getStatusCodeString(SafetyDetectStatusCodes.PARAM_ERROR_EMPTY)));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> shutdownUserDetect() {
        return doWrite(new v(getContext(), "safetydetect.shutdownUserDetect", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> shutdownUrlCheck() {
        return doWrite(new w(getContext(), "safetydetect.shutdownUrlChecker", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> releaseAntiFraud() {
        return doWrite(new p(getContext(), "safetydetect.releaseAntiFraud", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<VerifyAppsCheckEnabledResp> isVerifyAppsCheck() {
        return doWrite(new f0(getContext(), "safetydetect.isVerifyAppsCheck", new e0().a(), true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> initUserDetect() {
        return doWrite(new l(getContext(), "safetydetect.initUserDetect", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> initUrlCheck() {
        return doWrite(new b(getContext(), "safetydetect.initUrlChecker", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<Void> initAntiFraud(String str) {
        Checker.checkNonNull(str);
        return doWrite(new k(getContext(), "safetydetect.initAntiFraud", new c(str).a(), true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<WifiDetectResponse> getWifiDetectStatus() {
        return doWrite(new j(getContext(), "safetydetect.getWifiDetectStatus", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<RiskTokenResponse> getRiskToken() {
        String strA = q.a(this.f16554a);
        if (!TextUtils.isEmpty(strA)) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(new RiskTokenResponse(strA));
                return taskCompletionSource.getTask();
            } catch (JSONException e) {
                Log.e(f16552b, "Json conversion exception! " + e.getMessage());
            }
        }
        return doWrite(new i(getContext(), "safetydetect.getRiskToken", "", true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<MaliciousAppsListResp> getMaliciousAppsList() {
        return doWrite(new h(getContext(), "safetydetect.getHarmfulAppsList", new n().a(), true));
    }

    @Override // com.huawei.hms.support.api.safetydetect.SafetyDetectClient
    public Task<VerifyAppsCheckEnabledResp> enableAppsCheck() {
        return doWrite(new g(getContext(), "safetydetect.enableAppsCheck", new f().a(), true));
    }

    private void a(byte[] bArr) throws ApiException {
        if (bArr == null || bArr.length < 16 || bArr.length > 66) {
            throw new ApiException(new Status(SafetyDetectStatusCodes.PARAM_ERROR_INVALID, SafetyDetectStatusCodes.getStatusCodeString(SafetyDetectStatusCodes.PARAM_ERROR_INVALID)));
        }
    }

    private static String a(String str) {
        try {
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(str), MessageDigest.getInstance("SHA-256"));
            try {
                while (digestInputStream.read(new byte[131072]) > 0) {
                }
                String strEncode = Base64.encode(digestInputStream.getMessageDigest().digest());
                digestInputStream.close();
                return strEncode;
            } catch (Throwable th) {
                try {
                    digestInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private x a(byte[] bArr, String str, String str2, Context context) {
        x xVar = new x();
        String str3 = context.getApplicationInfo().sourceDir;
        xVar.d(Base64.encode(bArr));
        xVar.c(str);
        xVar.e(context.getApplicationInfo().packageName);
        xVar.a(str2);
        xVar.b(a(str3));
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            String[] strArr = new String[packageInfo.signatures.length];
            int i = 0;
            while (true) {
                Signature[] signatureArr = packageInfo.signatures;
                if (i >= signatureArr.length) {
                    xVar.a(strArr);
                    return xVar;
                }
                strArr[i] = Base64.encode(SHA256.digest(signatureArr[i].toByteArray()));
                i++;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            xVar.a((String[]) null);
            return xVar;
        }
    }

    a(Context context, u uVar) {
        super(context, d, uVar, f16553c, 60700305);
        this.f16554a = context;
    }

    a(Activity activity, u uVar) {
        super(activity, d, uVar, (AbstractClientBuilder) f16553c, 60700305);
        this.f16554a = activity;
    }
}
