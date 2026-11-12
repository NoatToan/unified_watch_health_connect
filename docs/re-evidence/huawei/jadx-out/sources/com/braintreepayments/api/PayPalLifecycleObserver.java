package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.td;
import defpackage.uf;

/* JADX INFO: loaded from: classes21.dex */
public class PayPalLifecycleObserver implements LifecycleEventObserver {
    final uf e;

    public PayPalLifecycleObserver(uf ufVar) {
        this.e = ufVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        final FragmentActivity activity;
        if (event == Lifecycle.Event.ON_RESUME) {
            if (lifecycleOwner instanceof FragmentActivity) {
                activity = (FragmentActivity) lifecycleOwner;
            } else {
                activity = lifecycleOwner instanceof Fragment ? ((Fragment) lifecycleOwner).getActivity() : null;
            }
            if (activity != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.braintreepayments.api.PayPalLifecycleObserver.4
                    @Override // java.lang.Runnable
                    public void run() {
                        td tdVarE = PayPalLifecycleObserver.this.e.e(activity);
                        td tdVarD = (tdVarE == null || tdVarE.e() != 13591) ? null : PayPalLifecycleObserver.this.e.d(activity);
                        td tdVarB = PayPalLifecycleObserver.this.e.b(activity);
                        if (tdVarB != null && tdVarB.e() == 13591) {
                            tdVarD = PayPalLifecycleObserver.this.e.c(activity);
                        }
                        if (tdVarD != null) {
                            PayPalLifecycleObserver.this.e.e(tdVarD);
                        }
                    }
                });
            }
        }
    }
}
