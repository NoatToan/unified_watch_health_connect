package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import bm.h0;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;
import o53.b0;
import ot.f;
import ps.m;
import qe2.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Continuation, i.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f53828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f53832e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f53828a = obj;
        this.f53829b = obj2;
        this.f53830c = obj3;
        this.f53831d = obj4;
        this.f53832e = obj5;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.k
    public void onMapLoaded() {
        GCMMapView gCMMapView = (GCMMapView) this.f53828a;
        f fVar = (f) this.f53829b;
        b0 b0Var = (b0) this.f53830c;
        m mVar = (m) this.f53831d;
        Context context = (Context) this.f53832e;
        String str = f.f133585v;
        h mapProxy = gCMMapView.getMapProxy();
        h0 h0Var = new h0(fVar, b0Var, mVar, context, 3);
        mapProxy.getClass();
        mapProxy.Y(new qd0.a(h0Var, 16));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.f53828a).lambda$fetchIfCacheExpiredAndNotThrottled$2((Task) this.f53829b, (Task) this.f53830c, (Date) this.f53831d, (Map) this.f53832e, task);
    }
}
