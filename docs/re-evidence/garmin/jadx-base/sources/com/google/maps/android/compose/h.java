package com.google.maps.android.compose;

import android.content.Context;
import java.util.ArrayList;
import java.util.ListIterator;
import p005kotlin.Unit;
import p3.n1;
import p3.o1;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f54075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f54077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f54078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f54079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f54080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f54081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f54082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f54083l;

    public /* synthetic */ h(pt1.l lVar, e23.l lVar2, o1 o1Var, p1 p1Var, p1 p1Var2, Context context, f4.s sVar, f4.s sVar2, e23.l lVar3, n1 n1Var, p1 p1Var3) {
        this.f54072a = 1;
        this.f54075d = lVar;
        this.f54073b = lVar2;
        this.f54076e = o1Var;
        this.f54077f = p1Var;
        this.f54078g = p1Var2;
        this.f54079h = context;
        this.f54080i = sVar;
        this.f54081j = sVar2;
        this.f54074c = lVar3;
        this.f54082k = n1Var;
        this.f54083l = p1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f54072a) {
            case 0:
                return InputHandlerKt.InputHandler$lambda$1$lambda$0((e23.l) this.f54073b, (e23.l) this.f54074c, (e23.l) this.f54075d, (e23.l) this.f54076e, (e23.l) this.f54077f, (e23.l) this.f54078g, (e23.l) this.f54079h, (e23.l) this.f54080i, (e23.l) this.f54081j, (e23.l) this.f54082k, (e23.l) this.f54083l);
            case 1:
                pt1.l lVar = (pt1.l) this.f54075d;
                e23.l lVar2 = (e23.l) this.f54073b;
                o1 o1Var = (o1) this.f54076e;
                p1 p1Var = (p1) this.f54077f;
                p1 p1Var2 = (p1) this.f54078g;
                Context context = (Context) this.f54079h;
                f4.s sVar = (f4.s) this.f54080i;
                f4.s sVar2 = (f4.s) this.f54081j;
                e23.l lVar3 = (e23.l) this.f54074c;
                n1 n1Var = (n1) this.f54082k;
                p1 p1Var3 = (p1) this.f54083l;
                if (lVar.f140876c != null) {
                    int intValue = n1Var.getIntValue();
                    long j8 = o1Var.j();
                    CharSequence charSequence = (CharSequence) p1Var.getF182175a();
                    if (charSequence.length() == 0) {
                        charSequence = null;
                    }
                    String str = (String) charSequence;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    us1.h.a aVar = us1.h.f172403e;
                    String str2 = (String) p1Var3.getF182175a();
                    aVar.getClass();
                    us1.h hVarB = us1.h.a.b(context, str2);
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = sVar.listIterator();
                    while (true) {
                        f4.z zVar = (f4.z) listIterator;
                        if (zVar.hasNext()) {
                            String str3 = (String) zVar.next();
                            us1.g.f172395c.getClass();
                            us1.g gVarA = us1.g.a.a(context, str3);
                            if (gVarA != null) {
                                arrayList.add(gVarA);
                            }
                        } else {
                            i53.c cVarE = i53.a.e(arrayList);
                            if (cVarE.isEmpty()) {
                                cVarE = null;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            ListIterator listIterator2 = sVar2.listIterator();
                            while (true) {
                                f4.z zVar2 = (f4.z) listIterator2;
                                if (zVar2.hasNext()) {
                                    String str4 = (String) zVar2.next();
                                    us1.i.f172411c.getClass();
                                    us1.i iVarB = us1.i.a.b(context, str4);
                                    if (iVarB != null) {
                                        arrayList2.add(iVarB);
                                    }
                                } else {
                                    i53.c cVarE2 = i53.a.e(arrayList2);
                                    lVar2.invoke(pt1.l.a(lVar, 0L, null, intValue, j8, null, str, zBooleanValue, hVarB, cVarE, cVarE2.isEmpty() ? null : cVarE2, null, false, 28751));
                                }
                            }
                        }
                    }
                } else {
                    int intValue2 = n1Var.getIntValue();
                    long j14 = o1Var.j();
                    CharSequence charSequence2 = (CharSequence) p1Var.getF182175a();
                    if (charSequence2.length() == 0) {
                        charSequence2 = null;
                    }
                    String str5 = (String) charSequence2;
                    boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    us1.h.a aVar2 = us1.h.f172403e;
                    String str6 = (String) p1Var3.getF182175a();
                    aVar2.getClass();
                    us1.h hVarB2 = us1.h.a.b(context, str6);
                    ArrayList arrayList3 = new ArrayList();
                    ListIterator listIterator3 = sVar.listIterator();
                    while (true) {
                        f4.z zVar3 = (f4.z) listIterator3;
                        if (zVar3.hasNext()) {
                            String str7 = (String) zVar3.next();
                            us1.g.f172395c.getClass();
                            us1.g gVarA2 = us1.g.a.a(context, str7);
                            if (gVarA2 != null) {
                                arrayList3.add(gVarA2);
                            }
                        } else {
                            i53.c cVarE3 = i53.a.e(arrayList3);
                            if (cVarE3.isEmpty()) {
                                cVarE3 = null;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            ListIterator listIterator4 = sVar2.listIterator();
                            while (true) {
                                f4.z zVar4 = (f4.z) listIterator4;
                                if (zVar4.hasNext()) {
                                    String str8 = (String) zVar4.next();
                                    us1.i.f172411c.getClass();
                                    us1.i iVarB2 = us1.i.a.b(context, str8);
                                    if (iVarB2 != null) {
                                        arrayList4.add(iVarB2);
                                    }
                                } else {
                                    i53.c cVarE4 = i53.a.e(arrayList4);
                                    lVar3.invoke(pt1.l.a(lVar, 0L, null, intValue2, j14, null, str5, zBooleanValue2, hVarB2, cVarE3, cVarE4.isEmpty() ? null : cVarE4, null, false, 28751));
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                Long l14 = (Long) this.f54073b;
                qt1.k kVar = (qt1.k) this.f54074c;
                Context context2 = (Context) this.f54075d;
                qt1.a aVar3 = (qt1.a) this.f54076e;
                Long l15 = (Long) this.f54077f;
                Long l16 = (Long) this.f54078g;
                Integer num = (Integer) this.f54079h;
                Long l17 = (Long) this.f54080i;
                String str9 = (String) this.f54081j;
                String str10 = (String) this.f54082k;
                String str11 = (String) this.f54083l;
                ot1.u.f133824a.getClass();
                ot1.u.g(l14, kVar, context2, aVar3, l15, l16, num, l17, str9, str10, str11, true);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i14) {
        this.f54072a = i14;
        this.f54073b = obj;
        this.f54074c = obj2;
        this.f54075d = obj3;
        this.f54076e = obj4;
        this.f54077f = obj5;
        this.f54078g = obj6;
        this.f54079h = obj7;
        this.f54080i = obj8;
        this.f54081j = obj9;
        this.f54082k = obj10;
        this.f54083l = obj11;
    }
}
