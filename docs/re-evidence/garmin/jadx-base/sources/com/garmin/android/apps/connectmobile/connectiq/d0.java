package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class d0 implements b0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f31854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.k f31855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f31856c;

    public d0(b0 b0Var, List list, b0.k kVar) {
        this.f31856c = b0Var;
        this.f31854a = list;
        this.f31855b = kVar;
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.k
    public final void K3() {
        b0.k kVar = this.f31855b;
        if (kVar != null) {
            new Handler(Looper.getMainLooper()).post(new c0(kVar, 0));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.b0.k
    public final void R7() {
        List list = this.f31854a;
        if (list.isEmpty()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a8.d(this, 14, list, this.f31855b));
    }
}
