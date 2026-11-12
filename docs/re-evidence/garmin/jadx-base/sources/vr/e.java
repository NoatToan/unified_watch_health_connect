package vr;

import b63.o;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import e2.f0;
import e23.l;
import g22.k;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f179472b;

    public /* synthetic */ e(List list, int i14) {
        this.f179471a = i14;
        this.f179472b = list;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        jq1.e.d dVar;
        Object next;
        jq1.e eVar;
        String str;
        Object[] objArr;
        switch (this.f179471a) {
            case 0:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                List list = this.f179472b;
                f0Var.a(list.size(), null, new g.a(list), new z3.e(2039820996, true, new g.b(list)));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                Iterator it = this.f179472b.iterator();
                do {
                    dVar = null;
                    objArr = 0;
                    if (it.hasNext()) {
                        next = it.next();
                        str = ((jq1.e) next).f99995a;
                    } else {
                        next = null;
                    }
                    eVar = (jq1.e) next;
                    if (eVar == null) {
                        return new jq1.e(str2, dVar, 2, (j) (objArr == true ? 1 : 0));
                    }
                    return eVar;
                } while (!s.g(str != null ? k.v(str, "yyyy-MM-dd") : null, g22.l.h(o.Companion.b(o.INSTANCE, str2))));
                eVar = (jq1.e) next;
                if (eVar == null) {
                    return new jq1.e(str2, dVar, 2, (j) (objArr == true ? 1 : 0));
                }
                return eVar;
            case 2:
                wu.a aVar = (wu.a) obj;
                aVar.getClass();
                List list2 = this.f179472b;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        aVar.a((m) it3.next(), false);
                    }
                }
                return Unit.INSTANCE;
            default:
                wu.a aVar2 = (wu.a) obj;
                aVar2.getClass();
                List list3 = this.f179472b;
                if (list3 != null && !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        aVar2.a((m) it4.next(), false);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
