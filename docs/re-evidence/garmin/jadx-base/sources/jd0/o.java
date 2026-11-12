package jd0;

import am.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd0/o;", "Lmk0/h;", "Lco/h;", "mapActivityListItemUseCase", "Lao/d;", "repository", "<init>", "(Lco/h;Lao/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements mk0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co.h f98357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.d f98358b;

    public o(co.h hVar, ao.d dVar) {
        hVar.getClass();
        dVar.getClass();
        this.f98357a = hVar;
        this.f98358b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // mk0.h
    public final Object a(String str, List list, int i14, int i15, v13.c cVar) {
        n nVar;
        Object objF;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i16 = nVar.f98356c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                nVar.f98356c = i16 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        n nVar2 = nVar;
        Object obj = nVar2.f98354a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = nVar2.f98356c;
        if (i17 == 0) {
            o13.r.b(obj);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((x0) it.next()).f4358a);
            }
            nVar2.f98356c = 1;
            objF = this.f98358b.f(str, i14, i15, arrayList, nVar2);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objF = ((o13.q) obj).f128597a;
        }
        int i18 = o13.q.f128596b;
        if (objF instanceof o13.q.b) {
            return objF;
        }
        List list2 = (List) objF;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(this.f98357a.a((bo.l) it3.next()));
        }
        return arrayList2;
    }
}
