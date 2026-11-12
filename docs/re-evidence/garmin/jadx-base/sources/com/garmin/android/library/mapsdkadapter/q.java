package com.garmin.android.library.mapsdkadapter;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/q;", "", "<init>", "()V", "src", "(Lcom/garmin/android/library/mapsdkadapter/q;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie2.p f50328a;

    public q(q qVar) {
        qVar.getClass();
        ie2.p pVar = qVar.f50328a;
        ArrayList arrayListD1 = h0.d1(pVar.f93153a);
        List<ie2.r> list = pVar.f93154b;
        float f14 = pVar.f93155c;
        int i14 = pVar.f93156d;
        List<? extends ie2.o> list2 = pVar.f93157e;
        float f15 = pVar.f93158f;
        boolean z14 = pVar.f93159g;
        boolean z15 = pVar.f93160h;
        boolean z16 = pVar.f93161i;
        ie2.d dVar = pVar.f93162j;
        ie2.d dVar2 = pVar.f93163k;
        Object obj = pVar.f93164l;
        List<ie2.r> list3 = pVar.f93165m;
        boolean z17 = pVar.f93166n;
        boolean z18 = pVar.f93167o;
        list.getClass();
        list2.getClass();
        dVar.getClass();
        dVar2.getClass();
        list3.getClass();
        this.f50328a = new ie2.p(arrayListD1, list, f14, i14, list2, f15, z14, z15, z16, dVar, dVar2, obj, list3, z17, z18);
    }

    public final void a(List list) {
        list.getClass();
        this.f50328a.f93153a.addAll(list);
    }

    public final void b() {
        this.f50328a.f93153a.clear();
    }

    public final void c(ie2.d dVar) {
        dVar.getClass();
        ie2.p pVar = this.f50328a;
        pVar.getClass();
        pVar.f93163k = dVar;
    }

    public final void d(ie2.d dVar) {
        dVar.getClass();
        ie2.p pVar = this.f50328a;
        pVar.getClass();
        pVar.f93162j = dVar;
    }

    public final String toString() {
        String strF;
        ie2.p pVar = this.f50328a;
        List<f> list = pVar.f93153a;
        int size = list.size();
        if (size == 0) {
            strF = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        } else if (size != 1) {
            strF = "[" + h0.b0(list) + ", ...] (" + list.size() + ")";
        } else {
            strF = org.apache.commons.lang3.e.f("[", "]", h0.b0(list));
        }
        float f14 = pVar.f93155c;
        int i14 = pVar.f93156d;
        float f15 = pVar.f93158f;
        boolean z14 = pVar.f93160h;
        boolean z15 = pVar.f93161i;
        ie2.d dVar = pVar.f93162j;
        ie2.d dVar2 = pVar.f93163k;
        Object obj = pVar.f93164l;
        Boolean boolValueOf = Boolean.valueOf(pVar.f93166n);
        Boolean boolValueOf2 = Boolean.valueOf(pVar.f93167o);
        StringBuilder sb3 = new StringBuilder("{ points=");
        sb3.append(strF);
        sb3.append(", width=");
        sb3.append(f14);
        sb3.append(", color=");
        sb3.append(i14);
        sb3.append(", zIndex=");
        sb3.append(f15);
        sb3.append(", isVisible=");
        kg.f.q(", isGeodesic=", ", startCap=", sb3, z14, z15);
        sb3.append(dVar);
        sb3.append(", endCap=");
        sb3.append(dVar2);
        sb3.append(", tag=");
        sb3.append(obj);
        sb3.append(" drawBorder=");
        sb3.append(boolValueOf);
        sb3.append(" shouldBlendColors=");
        return p6.b.f(sb3, boolValueOf2, " }");
    }

    public q() {
        this.f50328a = new ie2.p(null, null, 0.0f, 0, null, 0.0f, false, false, false, null, null, null, null, false, false, 32767, null);
    }
}
