package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class f extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f11115g;

    public f(e eVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f11115g = eVar;
        this.f11109a = obj;
        this.f11110b = arrayList;
        this.f11111c = obj2;
        this.f11112d = arrayList2;
        this.f11113e = obj3;
        this.f11114f = arrayList3;
    }

    @Override // androidx.transition.o, androidx.transition.m.h
    public final void onTransitionEnd(m mVar) {
        mVar.removeListener(this);
    }

    @Override // androidx.transition.o, androidx.transition.m.h
    public final void onTransitionStart(m mVar) {
        e eVar = this.f11115g;
        Object obj = this.f11109a;
        if (obj != null) {
            eVar.A(obj, this.f11110b, null);
        }
        Object obj2 = this.f11111c;
        if (obj2 != null) {
            eVar.A(obj2, this.f11112d, null);
        }
        Object obj3 = this.f11113e;
        if (obj3 != null) {
            eVar.A(obj3, this.f11114f, null);
        }
    }
}
