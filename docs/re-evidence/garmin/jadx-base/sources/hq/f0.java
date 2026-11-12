package hq;

import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.google.common.base.Optional;
import f5.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85012a;

    public /* synthetic */ f0(int i14) {
        this.f85012a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        li0.n0 n0Var;
        hi0.e.b bVar;
        li0.d0 d0Var;
        li0.d0 d0VarB;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        switch (this.f85012a) {
            case 0:
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj;
                int i16 = g0.f85018e;
                dVar.getClass();
                List<String> list = dVar.f41108g;
                return list == null ? p13.j0.f134944a : list;
            case 1:
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj;
                int i17 = g0.f85018e;
                dVar2.getClass();
                return Boolean.valueOf(dVar2.f41110i != null);
            case 2:
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar3 = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj;
                int i18 = g0.f85018e;
                dVar3.getClass();
                List<String> list2 = dVar3.f41110i;
                if (list2 == null || list2.isEmpty()) {
                    return p13.w.c(qu1.a.NO_EQUIPMENT.f147898a);
                }
                List<String> list3 = dVar3.f41110i;
                list3.getClass();
                return list3;
            case 3:
                h.a aVar = (h.a) obj;
                int i19 = m0.f85071d;
                aVar.getClass();
                return aVar.f85026a;
            case 4:
                h.b bVar2 = (h.b) obj;
                int i24 = m0.f85071d;
                bVar2.getClass();
                return bVar2.f85026a;
            case 5:
                List list4 = (List) obj;
                ArrayList arrayListL = androidx.core.view.j.l(list4);
                for (Object obj2 : list4) {
                    if (obj2 instanceof h.b) {
                        arrayListL.add(obj2);
                    }
                }
                return p13.h0.M0(arrayListL);
            case 6:
                List list5 = (List) obj;
                ArrayList arrayListL2 = androidx.core.view.j.l(list5);
                for (Object obj3 : list5) {
                    if (obj3 instanceof h.a) {
                        arrayListL2.add(obj3);
                    }
                }
                return p13.h0.M0(arrayListL2);
            case 7:
                List list6 = (List) obj;
                list6.getClass();
                return Boolean.valueOf(!list6.isEmpty());
            case 8:
                List list7 = (List) obj;
                list7.getClass();
                return Integer.valueOf(list7.size());
            case 9:
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar4 = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj;
                int i25 = com.garmin.android.apps.connectmobile.activities.stats.exercises.b.c.C0460c.f29876b;
                dVar4.getClass();
                String str = dVar4.f41107f;
                return str == null ? "" : str;
            case 10:
                h hVar = (h) obj;
                y0 y0Var = y0.f85193a;
                hVar.getClass();
                return hVar.f();
            case 11:
                Optional optional = (Optional) obj;
                int i26 = hq2.g.f85248g;
                optional.getClass();
                return optional.isPresent() ? (String) optional.get() : "";
            case 12:
                byte[] bArr = (byte[]) obj;
                int i27 = hq2.g.f85248g;
                bArr.getClass();
                return q03.r.f(Short.valueOf(hq2.r.s(bArr)));
            case 13:
                wl2.b bVar3 = (wl2.b) obj;
                int i28 = hq2.g.f85248g;
                bVar3.getClass();
                e13.p pVarG = q03.r.e(wl2.b.m(bVar3, qs2.a.f147384m.f147399d)).g(l13.a.f108328c);
                gw.j jVar = new gw.j(new f0(11), 12);
                int i29 = w03.b.f181178a;
                return new e13.h(new e13.o(pVarG, jVar), new hq2.d(bVar3, z14 ? 1 : 0));
            case 14:
                byte[] bArr2 = (byte[]) obj;
                int i30 = hq2.n.f85263g;
                bArr2.getClass();
                return q03.r.f(Short.valueOf(hq2.r.s(bArr2)));
            case 15:
                Map map = (Map) obj;
                Logger logger = hq2.r.f85270f;
                map.getClass();
                return ((com.garmin.device.nfc.b) p13.h0.b0(p13.h0.b1(map.values()))).f50857j;
            case 16:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                oi0.b bVar4 = (oi0.b) obj;
                int i34 = ht0.e.f85518g;
                bVar4.getClass();
                bVar4.b();
                bVar4.M();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar5 = (oi0.b) obj;
                int i35 = ht0.j.f85529g;
                bVar5.getClass();
                bVar5.b();
                bVar5.M();
                return Unit.INSTANCE;
            case 20:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            case 23:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.E(k0Var2, 5.0f);
                return Unit.INSTANCE;
            case 24:
                ki0.a aVar2 = (ki0.a) obj;
                p2 p2Var = com.garmin.android.apps.connectmobile.newsfeed.a.f39475c;
                com.garmin.android.apps.connectmobile.newsfeed.a aVar3 = com.garmin.android.apps.connectmobile.newsfeed.a.f39473a;
                aVar2.getClass();
                int i36 = -1;
                int i37 = -1;
                if (aVar2 instanceof ki0.a.C2006a) {
                    ki0.a.C2006a c2006a = (ki0.a.C2006a) aVar2;
                    li0.l0 l0Var = c2006a.f104808b;
                    String str2 = c2006a.f104807a;
                    aVar3.getClass();
                    if (str2 != null && l0Var != null) {
                        List listA = com.garmin.android.apps.connectmobile.newsfeed.a.a();
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(((li0.d0) it.next()).f112650c, str2)) {
                                i37 = i14;
                                if (i37 >= 0) {
                                    d0Var = (li0.d0) listA.get(i37);
                                    d0VarB = li0.d0.b(d0Var, null, l0Var.f112785a, null, null, l0Var.f112787c, l0Var.f112788d, l0Var.f112789e, 61);
                                    if (!d0VarB.equals(d0Var)) {
                                        listA.set(i37, d0VarB);
                                        p2Var.setValue(p13.h0.b1(listA));
                                    }
                                }
                            } else {
                                i14++;
                            }
                        }
                        if (i37 >= 0) {
                            d0Var = (li0.d0) listA.get(i37);
                            d0VarB = li0.d0.b(d0Var, null, l0Var.f112785a, null, null, l0Var.f112787c, l0Var.f112788d, l0Var.f112789e, 61);
                            if (!d0VarB.equals(d0Var)) {
                                listA.set(i37, d0VarB);
                                p2Var.setValue(p13.h0.b1(listA));
                            }
                        }
                    }
                    qz0.a aVar4 = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b;
                    if (str2 != null && l0Var != null && (n0Var = l0Var.f112789e) != null) {
                        Boolean bool = n0Var.f112818c;
                        Boolean bool2 = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(bool, bool2) || p005kotlin.jvm.internal.s.g(n0Var.f112817b, bool2) || (bVar = n0Var.f112816a) == hi0.e.b.NONE || bVar == hi0.e.b.FOLLOWED) {
                            aVar4.a(new gp.j(str2, 27));
                        } else {
                            Boolean bool3 = n0Var.f112819d;
                            if (bool3 != null) {
                                aVar4.c(str2, bool3.equals(bool2));
                            }
                        }
                    }
                } else {
                    if (!(aVar2 instanceof ki0.a.b)) {
                        lc.u0.r();
                        return null;
                    }
                    ki0.a.b bVar6 = (ki0.a.b) aVar2;
                    if (bVar6.f104810b == ki0.a.b.EnumC2007a.DISMISS_SUGGESTION) {
                        String str3 = bVar6.f104809a;
                        if (str3 == null) {
                            aVar3.getClass();
                        } else {
                            aVar3.getClass();
                            List listA2 = com.garmin.android.apps.connectmobile.newsfeed.a.a();
                            Iterator it3 = listA2.iterator();
                            while (it3.hasNext()) {
                                if (p005kotlin.jvm.internal.s.g(((li0.d0) it3.next()).f112650c, str3)) {
                                    i36 = i15;
                                    if (i36 >= 0) {
                                        listA2.remove(i36);
                                        p2Var.setValue(p13.h0.b1(listA2));
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            if (i36 >= 0) {
                                listA2.remove(i36);
                                p2Var.setValue(p13.h0.b1(listA2));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 25:
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                ((v1.a) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                NewsFeedItem newsFeedItem = (NewsFeedItem) obj;
                int i38 = NewsFeedViewModel.f39455j;
                newsFeedItem.getClass();
                return Boolean.valueOf(newsFeedItem instanceof NewsFeedItem.SuggestedFollowingList);
            case 27:
                float fFloatValue = ((Float) obj).floatValue();
                i02.p.a aVar5 = i02.p.f86882o;
                float f15 = 1;
                float f16 = f15 - fFloatValue;
                return Float.valueOf(f15 - (((f16 * f16) * f16) * f16));
            case 28:
                float fFloatValue2 = ((Float) obj).floatValue();
                i02.p.a aVar6 = i02.p.f86882o;
                return Float.valueOf(fFloatValue2 * fFloatValue2 * fFloatValue2 * fFloatValue2 * fFloatValue2);
            default:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f0(hq2.r rVar, int i14) {
        this.f85012a = i14;
    }
}
