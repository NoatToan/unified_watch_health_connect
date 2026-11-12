package com.huawei.hms.a.a.d;

import android.content.Context;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwidauth.api.ResultCallBack;
import defpackage.nml;
import defpackage.nox;

/* JADX INFO: loaded from: classes33.dex */
public class c implements ResultCallBack<nml> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TaskCompletionSource<Void> f12662a = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12664c;

    public TaskCompletionSource<Void> a() {
        return this.f12662a;
    }

    public c(Context context, String str) {
        this.f12663b = context;
        this.f12664c = str;
    }

    @Override // com.huawei.hwidauth.api.ResultCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(nml nmlVar) {
        if (nmlVar.a()) {
            nox.b("[ACCOUNTSDK]AccountPickerSignOutCallBack", "ClearAccountResult is success.", true);
            this.f12662a.setResult(null);
            return;
        }
        nox.b("[ACCOUNTSDK]AccountPickerSignOutCallBack", "ClearAccountResult is error: " + nmlVar.getStatus().e(), true);
        nox.b("[ACCOUNTSDK]AccountPickerSignOutCallBack", "ClearAccountResult is error: " + nmlVar.getStatus().e() + " status message " + nmlVar.getStatus().a(), false);
        this.f12662a.setException(new ApiException(new Status(2015, nmlVar.getStatus().a())));
    }
}
