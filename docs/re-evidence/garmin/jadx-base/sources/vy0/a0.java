package vy0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.e2;
import r53.k2;
import r53.p2;
import r53.q2;
import uy0.g1;
import uy0.h1;
import uy0.i1;
import uy0.l1;
import uy0.m1;
import uy0.t0;
import uy0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvy0/a0;", "Landroidx/lifecycle/u1;", "Luy0/z;", "getNavigationItemDataUseCase", "Luy0/u0;", "getSearchableItemsUseCase", "Luy0/h1;", "handleMoreItemClickUseCase", "Lvy0/r;", "moreMenuSearchPreferences", "Luy0/i1;", "recentSearchItemsUseCase", "Luy0/b;", "filterSearchItemsUseCase", "Luy0/l1;", "searchAnalyticsUseCase", "Lze0/b;", "getFeedbackSnackbarMessageUseCase", "<init>", "(Luy0/z;Luy0/u0;Luy0/h1;Lvy0/r;Luy0/i1;Luy0/b;Luy0/l1;Lze0/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f180673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f180674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f180675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uy0.b f180676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f180677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ze0.b f180678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f180679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f180680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f180681i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreViewModel$refreshRecentSearches$1", f = "MoreViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f180683b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f180683b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f180683b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180682a;
            if (i14 == 0) {
                o13.r.b(obj);
                Boolean bool = Boolean.FALSE;
                this.f180683b = null;
                this.f180682a = 1;
                if (jVar.emit(bool, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0002H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lvy0/g0;", "searchState", "", "refreshRecentSearches", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "availableItems", "Luy0/m1;", "searchableItems", "isWheelchairModeEnabled", "Lvy0/x;", "<anonymous>", "(Lvy0/g0;ZLjava/util/List;Ljava/util/List;Z)Lvy0/x;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreViewModel$uiState$1", f = "MoreViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.t<g0, Boolean, List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>, List<? extends m1>, Boolean, t13.d<? super x>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ g0 f180684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f180685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ List f180686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ List f180687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ boolean f180688e;

        public b(t13.d<? super b> dVar) {
            super(6, dVar);
        }

        @Override // e23.t
        public final Object invoke(g0 g0Var, Boolean bool, List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list, List<? extends m1> list2, Boolean bool2, t13.d<? super x> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            b bVar = a0.this.new b(dVar);
            bVar.f180684a = g0Var;
            bVar.f180685b = zBooleanValue;
            bVar.f180686c = list;
            bVar.f180687d = list2;
            bVar.f180688e = zBooleanValue2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:143:0x03d0  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            List list;
            boolean z14;
            boolean z15;
            q.c cVar;
            List<String> listM;
            g0 g0Var2;
            yy0.a aVar;
            List list2;
            boolean z16;
            double d14;
            String str;
            Iterator it;
            Object obj2;
            Object obj3;
            int i14;
            int[] iArr;
            int iMin;
            boolean z17;
            Object next;
            com.garmin.android.apps.connectmobile.navigation.more.b bVar;
            q qVar;
            g0 g0Var3;
            boolean z18;
            q bVar2;
            g0 g0Var4 = this.f180684a;
            boolean z19 = this.f180685b;
            List list3 = this.f180686c;
            List list4 = this.f180687d;
            boolean z24 = this.f180688e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a0 a0Var = a0.this;
            if (z19) {
                a0Var.f180674b.d(false);
            }
            a0Var.getClass();
            boolean z25 = g0Var4.f180719a;
            String str2 = g0Var4.f180720b;
            if (!z25) {
                bVar2 = new q.a(list3);
            } else {
                if (list4 != null) {
                    if (d53.w.J(str2)) {
                        i1 i1Var = a0Var.f180675c;
                        i1Var.getClass();
                        r rVar = i1Var.f173211a;
                        List<String> listA = rVar.a();
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : listA) {
                            Iterator it3 = list4.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (!((m1) next).f173249a.c().equals(str3));
                            m1 m1Var = (m1) next;
                            if (m1Var != null) {
                                bVar = m1Var.f173249a;
                            } else {
                                a2 a2Var = a2.GENERAL;
                                String strM = am.j.m("Recent search ", str3, " not found in current items. Removing it from recent searches.");
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "RecentSearchItemsUseCase", strM);
                                rVar.j(str3);
                                bVar = null;
                            }
                            if (bVar != null) {
                                arrayList.add(bVar);
                            }
                        }
                        bVar2 = new q.b(arrayList);
                    } else {
                        uy0.b bVar3 = a0Var.f180676d;
                        g1 g1Var = bVar3.f173086a;
                        r rVar2 = bVar3.f173087b;
                        if (rVar2.c() && str2.equals("???")) {
                            g0Var = g0Var4;
                            list = list4;
                            z14 = z24;
                            z15 = true;
                            cVar = new q.c(g1Var.a(list4));
                        } else {
                            yy0.a aVar3 = bVar3.f173088c;
                            double dF = rVar2.k() ? rVar2.f() : 0.6d;
                            String strA = yy0.a.a(d53.w.i0(str2).toString());
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                com.garmin.android.apps.connectmobile.navigation.more.b bVar4 = ((m1) next2).f173249a;
                                l22.b bVar5 = aVar3.f200131a;
                                bVar4.getClass();
                                ArrayList arrayListM = p13.x.m(bVar4.a(bVar5));
                                ty0.j f39397b = bVar4.getF39397b();
                                if (f39397b == null || (listM = f39397b.m(bVar5)) == null) {
                                    listM = j0.f134944a;
                                }
                                arrayListM.addAll(listM);
                                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayListM, 10));
                                Iterator it5 = arrayListM.iterator();
                                while (it5.hasNext()) {
                                    arrayList3.add(yy0.a.a((String) it5.next()));
                                }
                                Iterator it6 = arrayList3.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        g0Var2 = g0Var4;
                                        aVar = aVar3;
                                        list2 = list4;
                                        z16 = z24;
                                        d14 = dF;
                                        str = strA;
                                        it = it4;
                                        obj2 = null;
                                        break;
                                    }
                                    Object next3 = it6.next();
                                    String str4 = (String) next3;
                                    Iterator it7 = it6;
                                    if (d53.w.z(str4, strA, false)) {
                                        g0Var2 = g0Var4;
                                        aVar = aVar3;
                                        list2 = list4;
                                        z16 = z24;
                                        obj3 = next3;
                                        d14 = dF;
                                        str = strA;
                                        it = it4;
                                    } else {
                                        aVar = aVar3;
                                        if (strA.length() >= 3) {
                                            List listG = new d53.k("[^\\p{Alnum}]+").g(0, str4);
                                            ArrayList arrayList4 = new ArrayList();
                                            Iterator it8 = listG.iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it8;
                                                Object next4 = it9.next();
                                                if (((String) next4).length() > 0) {
                                                    arrayList4.add(next4);
                                                }
                                                it8 = it9;
                                            }
                                            Set setF1 = p13.h0.f1(arrayList4);
                                            setF1.add(str4);
                                            if (!arrayList4.isEmpty()) {
                                                setF1.add(p13.h0.k0(arrayList4, "", null, null, null, 62));
                                            }
                                            if (!setF1.isEmpty()) {
                                                Iterator it10 = setF1.iterator();
                                                while (true) {
                                                    if (it10.hasNext()) {
                                                        String str5 = (String) it10.next();
                                                        Iterator it11 = it10;
                                                        int iMax = Math.max(strA.length(), str5.length());
                                                        if (iMax == 0 || str5.length() == 0) {
                                                            g0Var2 = g0Var4;
                                                            list2 = list4;
                                                            z16 = z24;
                                                            obj3 = next3;
                                                            d14 = dF;
                                                            str = strA;
                                                            it = it4;
                                                        } else {
                                                            d14 = dF;
                                                            int iFloor = (int) Math.floor(((double) iMax) * (((double) 1) - d14));
                                                            char[] charArray = strA.toCharArray();
                                                            charArray.getClass();
                                                            char[] charArray2 = str5.toCharArray();
                                                            charArray2.getClass();
                                                            if (Math.abs(charArray.length - charArray2.length) <= iFloor) {
                                                                int length = charArray2.length + 1;
                                                                int[] iArr2 = new int[length];
                                                                list2 = list4;
                                                                for (int i15 = 0; i15 < length; i15++) {
                                                                    iArr2[i15] = i15;
                                                                }
                                                                int length2 = charArray.length;
                                                                if (1 <= length2) {
                                                                    int i16 = 1;
                                                                    int[] iArr3 = iArr2;
                                                                    int i17 = 1;
                                                                    while (true) {
                                                                        int[] iArr4 = new int[charArray2.length + 1];
                                                                        iArr4[0] = i17;
                                                                        obj3 = next3;
                                                                        int length3 = charArray2.length;
                                                                        char[] cArr = charArray;
                                                                        int i18 = i16;
                                                                        if (i18 <= length3) {
                                                                            i16 = i18;
                                                                            iArr = iArr4;
                                                                            iMin = i17;
                                                                            while (true) {
                                                                                str = strA;
                                                                                int i19 = i18 - 1;
                                                                                it = it4;
                                                                                z16 = z24;
                                                                                g0Var2 = g0Var4;
                                                                                int iMin2 = Math.min(iArr3[i18] + 1, Math.min(iArr[i19] + 1, iArr3[i19] + (cArr[i17 + (-1)] == charArray2[i19] ? 0 : i16)));
                                                                                iArr[i18] = iMin2;
                                                                                iMin = Math.min(iMin, iMin2);
                                                                                if (i18 == length3) {
                                                                                    break;
                                                                                }
                                                                                i18++;
                                                                                strA = str;
                                                                                it4 = it;
                                                                                g0Var4 = g0Var2;
                                                                                z24 = z16;
                                                                            }
                                                                        } else {
                                                                            g0Var2 = g0Var4;
                                                                            z16 = z24;
                                                                            i16 = i18;
                                                                            iArr = iArr4;
                                                                            str = strA;
                                                                            it = it4;
                                                                            iMin = i17;
                                                                        }
                                                                        if (iMin > iFloor) {
                                                                            i14 = iFloor + 1;
                                                                            break;
                                                                        }
                                                                        if (i17 != length2) {
                                                                            i17++;
                                                                            next3 = obj3;
                                                                            charArray = cArr;
                                                                            iArr3 = iArr;
                                                                            strA = str;
                                                                            it4 = it;
                                                                            g0Var4 = g0Var2;
                                                                            z24 = z16;
                                                                        } else {
                                                                            iArr2 = iArr;
                                                                        }
                                                                    }
                                                                } else {
                                                                    g0Var2 = g0Var4;
                                                                    z16 = z24;
                                                                    obj3 = next3;
                                                                    str = strA;
                                                                    it = it4;
                                                                }
                                                                i14 = iArr2[charArray2.length];
                                                                break;
                                                            } else {
                                                                i14 = iFloor + 1;
                                                                g0Var2 = g0Var4;
                                                                list2 = list4;
                                                                z16 = z24;
                                                                obj3 = next3;
                                                                str = strA;
                                                                it = it4;
                                                            }
                                                            if (i14 <= iFloor) {
                                                            }
                                                        }
                                                        it10 = it11;
                                                        dF = d14;
                                                        list4 = list2;
                                                        next3 = obj3;
                                                        strA = str;
                                                        it4 = it;
                                                        g0Var4 = g0Var2;
                                                        z24 = z16;
                                                    }
                                                }
                                            }
                                        }
                                        it6 = it7;
                                        aVar3 = aVar;
                                        dF = dF;
                                        list4 = list4;
                                        strA = strA;
                                        it4 = it4;
                                        g0Var4 = g0Var4;
                                        z24 = z24;
                                    }
                                    obj2 = obj3;
                                    break;
                                }
                                if (obj2 != null) {
                                    arrayList2.add(next2);
                                }
                                aVar3 = aVar;
                                dF = d14;
                                list4 = list2;
                                strA = str;
                                it4 = it;
                                g0Var4 = g0Var2;
                                z24 = z16;
                            }
                            g0Var = g0Var4;
                            list = list4;
                            z14 = z24;
                            z15 = true;
                            cVar = new q.c(g1Var.a(arrayList2));
                        }
                        l1 l1Var = a0Var.f180677e;
                        boolean zIsEmpty = cVar.f180767a.isEmpty();
                        l1Var.getClass();
                        if (zIsEmpty) {
                            if (str2.length() != 0) {
                                if (!str2.equals(l1Var.f173228a) && str2.length() > l1Var.f173228a.length()) {
                                    l1Var.f173228a = str2;
                                } else if (!d53.w.z(l1Var.f173229b, str2, false) && str2.length() > 0) {
                                    l1Var.a();
                                    l1Var.f173229b = l1Var.f173228a;
                                    l1Var.f173228a = str2;
                                }
                            }
                            z17 = false;
                            qVar = cVar;
                        } else {
                            z17 = false;
                            if (!d53.w.z(l1Var.f173229b, l1Var.f173228a, false)) {
                                l1Var.a();
                            }
                            l1Var.f173228a = "";
                            l1Var.f173229b = "";
                            qVar = cVar;
                        }
                    }
                    g0Var3 = g0Var;
                    if (g0Var3.f180719a || list != null) {
                        z18 = z17;
                    } else {
                        z18 = z15;
                    }
                    return new x(g0Var3, z18, z14, qVar);
                }
                bVar2 = new q.c(j0.f134944a);
            }
            g0Var = g0Var4;
            list = list4;
            z14 = z24;
            z17 = false;
            z15 = true;
            qVar = bVar2;
            g0Var3 = g0Var;
            if (g0Var3.f180719a) {
                z18 = z17;
            } else {
                z18 = z17;
            }
            return new x(g0Var3, z18, z14, qVar);
        }
    }

    public a0(uy0.z zVar, u0 u0Var, h1 h1Var, r rVar, i1 i1Var, uy0.b bVar, l1 l1Var, ze0.b bVar2) {
        zVar.getClass();
        u0Var.getClass();
        h1Var.getClass();
        rVar.getClass();
        i1Var.getClass();
        bVar.getClass();
        l1Var.getClass();
        bVar2.getClass();
        this.f180673a = h1Var;
        this.f180674b = rVar;
        this.f180675c = i1Var;
        this.f180676d = bVar;
        this.f180677e = l1Var;
        this.f180678f = bVar2;
        ty0.b bVar3 = ty0.b.f166892l3;
        p2 p2VarA = q2.a(new g0(false, null, 3, null));
        this.f180679g = p2VarA;
        r53.v vVar = new r53.v(new a(null), rVar.h());
        f12.l.f68084a.getClass();
        e2 f68089c = f12.l.a.a().getF68089c();
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        b2 b2VarK = r53.s.K(f68089c, aVarA, k2.a.a(aVar, 2), Boolean.valueOf(f12.l.a.a().B3()));
        b2 b2VarK2 = r53.s.K(r53.s.D(u0Var.f173323e, new t0(u0Var, null)), v1.a(this), k2.a.a(aVar, 2), null);
        b2 b2VarK3 = r53.s.K(zVar.a(bVar3), v1.a(this), k2.a.a(aVar, 2), j0.f134944a);
        this.f180680h = r53.s.K(r53.s.f(new ze0.c(bVar2, null)), v1.a(this), k2.a.f150706c, null);
        this.f180681i = r53.s.K(r53.s.n(p2VarA, vVar, b2VarK3, b2VarK2, b2VarK, new b(null)), v1.a(this), k2.a.a(aVar, 2), new x(null, false, false, null, 15, null));
    }
}
