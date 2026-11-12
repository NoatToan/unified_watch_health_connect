package nh;

import com.alipay.sdk.app.APayEntranceActivity;

/* JADX INFO: loaded from: classes7.dex */
public class f implements APayEntranceActivity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f126115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f126116b;

    public f(i iVar, Object obj) {
        this.f126116b = iVar;
        this.f126115a = obj;
    }

    @Override // com.alipay.sdk.app.APayEntranceActivity.a
    public final void a(String str) {
        this.f126116b.f126128g = str;
        synchronized (this.f126115a) {
            try {
                this.f126115a.notify();
            } catch (Throwable th3) {
                wg.a.d(this.f126116b.f126126e, "biz", "BSAResultEx", th3);
            }
        }
    }
}
