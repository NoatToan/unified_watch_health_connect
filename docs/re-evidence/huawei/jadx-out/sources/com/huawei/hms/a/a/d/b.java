package com.huawei.hms.a.a.d;

import android.content.Context;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwidauth.api.ResultCallBack;
import defpackage.nmv;
import defpackage.nox;

/* JADX INFO: loaded from: classes33.dex */
public class b implements ResultCallBack<nmv> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaskCompletionSource<Void> f12661c = new TaskCompletionSource<>();

    public b(Context context, String str) {
        this.f12659a = context;
        this.f12660b = str;
    }

    public TaskCompletionSource<Void> a() {
        return this.f12661c;
    }

    @Override // com.huawei.hwidauth.api.ResultCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(nmv nmvVar) {
        int iE = nmvVar.getStatus().e();
        if (200 == iE) {
            nox.b("[ACCOUNTSDK]AccountPickerRevokeCallBack", "RevokeResult is success.", true);
            this.f12661c.setResult(null);
            return;
        }
        nox.b("[ACCOUNTSDK]AccountPickerRevokeCallBack", "RevokeResult is error: " + iE, true);
        nox.b("[ACCOUNTSDK]AccountPickerRevokeCallBack", "RevokeResult is error: " + iE + " status message " + nmvVar.getStatus().a(), false);
        String strA = nmvVar.getStatus().a();
        if (404 == iE) {
            this.f12661c.setException(new ApiException(new Status(iE, "cancel authorization request error.")));
        } else {
            this.f12661c.setException(new ApiException(new Status(iE, strA)));
        }
    }
}
