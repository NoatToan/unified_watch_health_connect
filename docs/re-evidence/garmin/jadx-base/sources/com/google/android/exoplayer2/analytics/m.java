package com.google.android.exoplayer2.analytics;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.search.SearchView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import v.a0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class m implements ListenerSet.Event, z, fa.j.a, OnCompleteListener, l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52930d;

    public /* synthetic */ m(Object obj, int i14, int i15, int i16) {
        this.f52927a = i16;
        this.f52930d = obj;
        this.f52928b = i14;
        this.f52929c = i15;
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        a0 a0Var = ((v.l) this.f52930d).f173891o;
        int i14 = this.f52928b;
        int i15 = this.f52929c;
        return l0.j.e(new a0.c(a0Var.a(i14, i15, 1), a0Var.f173630e, i15));
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f52927a) {
            case 0:
                ((AnalyticsListener) obj).onSurfaceSizeChanged((AnalyticsListener.EventTime) this.f52930d, this.f52928b, this.f52929c);
                break;
            default:
                ((ja.b) obj).a0((ja.b.a) this.f52930d, this.f52928b, this.f52929c);
                break;
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        return SearchView.lambda$setUpDividerInsetListener$6((ViewGroup.MarginLayoutParams) this.f52930d, this.f52928b, this.f52929c, view2, m1Var);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        q00.a aVar = (q00.a) this.f52930d;
        task.getClass();
        String str = a2.CLOUD_MESSAGING.f28756a;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("FirebaseMessaging get token -> onComplete() successful=", task.isSuccessful());
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, str, strH);
        if (!task.isSuccessful()) {
            i2.a.f(a2Var, str, "FirebaseMessaging get token failed " + task.getException());
            return;
        }
        String str2 = (String) task.getResult();
        if (str2 != null) {
            i2.a.b(a2Var, str, "FirebaseMessaging get token trigger unregister for token=".concat(str2));
            aVar.b(this.f52928b, this.f52929c, str2);
        }
        FirebaseMessaging.getInstance().deleteToken().addOnCompleteListener(new p6.b(23));
    }
}
