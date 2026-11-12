package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes7.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public final void a() {
        Object obj = AuthTask.f28404c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
