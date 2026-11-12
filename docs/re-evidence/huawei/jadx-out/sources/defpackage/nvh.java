package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.NonceResponseInfo;
import com.huawei.hwversionmgr.info.PsiUploadResponseInfo;
import com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback;
import com.huawei.networkclient.ResultCallback;

/* JADX INFO: loaded from: classes11.dex */
public class nvh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile nvh f43801c;
    private static final byte[] d = new byte[1];

    public static nvh e() {
        synchronized (d) {
            if (f43801c == null) {
                f43801c = new nvh();
            }
        }
        return f43801c;
    }

    public void b(final DeviceInfo deviceInfo, final boolean z, final PsiUploadResultCallback psiUploadResultCallback) {
        nuz.d(new ResultCallback<NonceResponseInfo>() { // from class: nvh.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NonceResponseInfo nonceResponseInfo) {
                LogUtil.d("PsiUpdateUtil", "queryNonceDetail resultCode:", nonceResponseInfo.toString());
                nuz.c(deviceInfo, nonceResponseInfo.getNonce(), z, new ResultCallback<PsiUploadResponseInfo>() { // from class: nvh.5.5
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(PsiUploadResponseInfo psiUploadResponseInfo) {
                        LogUtil.d("PsiUpdateUtil", "queryPsiUploadDetail data:", psiUploadResponseInfo.toString());
                        if (psiUploadResultCallback != null) {
                            psiUploadResultCallback.onSuccess(psiUploadResponseInfo);
                        }
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.d("PsiUpdateUtil", "queryPsiUploadDetail onFailure:", th.getMessage());
                        if (psiUploadResultCallback != null) {
                            psiUploadResultCallback.onFailure(th);
                        }
                    }
                });
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.d("PsiUpdateUtil", "queryNonceDetail onFailure:", th.getMessage());
                PsiUploadResultCallback psiUploadResultCallback2 = psiUploadResultCallback;
                if (psiUploadResultCallback2 != null) {
                    psiUploadResultCallback2.onFailure(th);
                }
            }
        });
    }
}
