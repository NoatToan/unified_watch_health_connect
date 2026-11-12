package com.huawei.hms.ads.inner;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: com.huawei.hms.ads.inner.a$a, reason: collision with other inner class name */
    static class C0091a implements OnCanceledListener {
        @Override // com.huawei.hmf.tasks.OnCanceledListener
        public void onCanceled() {
            hw.b("LockScreenOpener", "unlock screen canceled.");
        }

        private C0091a() {
        }
    }

    static class b implements OnFailureListener {
        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            hw.b("LockScreenOpener", "unlock fail, exception is %s.", exc.getMessage());
        }

        private b() {
        }
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static class c implements OnSuccessListener<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.huawei.openalliance.ad.uriaction.interfaces.a f12799a;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            hw.b("LockScreenOpener", "onSuccess ret: %s.", bool);
            if (this.f12799a != null) {
                hw.b("LockScreenOpener", "action excute");
                this.f12799a.a();
            }
        }

        public c(com.huawei.openalliance.ad.uriaction.interfaces.a aVar) {
            this.f12799a = aVar;
        }
    }

    public static void a(Context context, OnSuccessListener<Boolean> onSuccessListener) {
        hw.b("LockScreenOpener", "onLockScreenOpen.");
        try {
            if (!(context instanceof Activity)) {
                hw.c("LockScreenOpener", "param activity is not Activity!");
                onSuccessListener.onSuccess(true);
                return;
            }
            Task<Boolean> taskA = HiAd.getInstance(context).getAskForUnlockScreen().a(context);
            taskA.addOnSuccessListener(onSuccessListener);
            taskA.addOnCanceledListener(new C0091a());
            taskA.addOnFailureListener(new b());
            hw.b("LockScreenOpener", "task is set.");
        } catch (NullPointerException unused) {
            hw.c("LockScreenOpener", "get task err, NullPointerException");
            onSuccessListener.onSuccess(true);
        } catch (Throwable th) {
            hw.c("LockScreenOpener", "listen task err: %s.", th.getClass().getSimpleName());
        }
    }
}
