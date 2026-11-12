package wn1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwn1/n;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f186263n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f186264a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f186265b = t.a.b(t.f186332a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f186266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f186267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f186268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f186269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f186270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f186271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f186272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f186273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f186274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.u1 f186275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r53.u1 f186276m;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$childAccountFlow$1", f = "InviteFriendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<Map<String, ? extends li0.l0>, List<? extends li0.d0>, t13.d<? super List<? extends li0.d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f186277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f186278b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, List<? extends li0.d0> list, t13.d<? super List<? extends li0.d0>> dVar) {
            b bVar = new b(dVar);
            bVar.f186277a = map;
            bVar.f186278b = list;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f186277a;
            List list = this.f186278b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(li0.e0.f((li0.d0) it.next(), map));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wn1/n$c", "Lli0/f;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$inviteAction$1$updateStateData$1", f = "InviteFriendsViewModel.kt", l = {77, 80}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f186281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f186282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ li0.l0 f186283d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, String str, li0.l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f186281b = nVar;
                this.f186282c = str;
                this.f186283d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f186281b, this.f186282c, this.f186283d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            
                if (p005kotlin.Unit.INSTANCE == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186280a;
                li0.l0 l0Var = this.f186283d;
                String str = this.f186282c;
                n nVar = this.f186281b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                LinkedHashMap linkedHashMapN = u0.n((Map) nVar.f186267d.getValue());
                linkedHashMapN.put(str, l0Var);
                p2 p2Var = nVar.f186267d;
                this.f186280a = 1;
                p2Var.k(null, linkedHashMapN);
                if (Unit.INSTANCE != aVar) {
                }
                return aVar;
                LinkedHashMap linkedHashMapN2 = u0.n((Map) nVar.f186269f.getValue());
                linkedHashMapN2.put(str, l0Var);
                p2 p2Var2 = nVar.f186269f;
                this.f186280a = 2;
                p2Var2.k(null, linkedHashMapN2);
            }
        }

        public c(o53.b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void g(Context context, li0.d0 d0Var) {
            context.getClass();
            n nVar = n.this;
            ge1.b.T(v1.a(nVar), null, null, new q(n.this, new com.garmin.android.apps.connectmobile.smartscale.model.b(null, String.valueOf(nVar.f186273j), Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), null, null, d0Var != null ? d0Var.f112654g : null, null, com.garmin.android.apps.connectmobile.smartscale.model.d.INVITED, null, null, null, null, null, null, null, null, 65369, null), d0Var, this, context, null), 3);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, li0.l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            n nVar = n.this;
            ge1.b.T(v1.a(nVar), null, null, new a(nVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "Lli0/d0;", "list", "", "Lwn1/m;", "<anonymous>", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$inviteFriendFlow$1", f = "InviteFriendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<Map<String, ? extends li0.l0>, List<? extends li0.d0>, t13.d<? super List<m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f186284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f186285b;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, List<? extends li0.d0> list, t13.d<? super List<m>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f186284a = map;
            dVar2.f186285b = list;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            li0.d0 d0Var;
            String str;
            Character chQ0;
            Map map = this.f186284a;
            List list = this.f186285b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList<li0.d0> arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(li0.e0.f((li0.d0) it.next(), map));
            }
            ArrayList arrayList2 = new ArrayList();
            for (li0.d0 d0Var2 : arrayList) {
                String str2 = d0Var2.f112651d;
                char upperCase = (str2 == null || (chQ0 = d53.y.q0(str2)) == null) ? '?' : Character.toUpperCase(chQ0.charValue());
                Object objN0 = p13.h0.n0(arrayList2);
                Character ch3 = null;
                m.a aVar2 = objN0 instanceof m.a ? (m.a) objN0 : null;
                if (aVar2 != null && (d0Var = aVar2.f186260a) != null && (str = d0Var.f112651d) != null) {
                    ch3 = new Character(Character.toUpperCase(d53.y.p0(str)));
                }
                if (ch3 == null || ch3.charValue() != upperCase) {
                    arrayList2.add(new m.b(upperCase));
                }
                arrayList2.add(new m.a(d0Var2));
            }
            return arrayList2;
        }
    }

    static {
        new a(null);
        f186263n = 8;
    }

    public n() {
        p13.j0 j0Var = p13.j0.f134944a;
        p2 p2VarA = q2.a(j0Var);
        this.f186266c = p2VarA;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        p2 p2VarA2 = q2.a(k0Var);
        this.f186267d = p2VarA2;
        p2 p2VarA3 = q2.a(j0Var);
        this.f186268e = p2VarA3;
        p2 p2VarA4 = q2.a(k0Var);
        this.f186269f = p2VarA4;
        this.f186270g = (j0) KoinJavaComponent.get$default(j0.class, null, null, 6, null);
        p2 p2VarA5 = q2.a(Boolean.FALSE);
        this.f186271h = p2VarA5;
        this.f186272i = r53.s.d(p2VarA5);
        this.f186273j = -1L;
        this.f186274k = new c(v1.a(this));
        this.f186275l = new r53.u1(p2VarA4, p2VarA3, new b(null));
        this.f186276m = new r53.u1(p2VarA2, p2VarA, new d(null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:22:0x0079->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x4(java.util.List r22, java.util.List r23, v13.c r24) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn1.n.x4(java.util.List, java.util.List, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0104, code lost:
    
        if (li0.e0.d(r2, r9, r3) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        r9 = r2;
        r11 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y4(List list, List list2, v13.c cVar) {
        p pVar;
        ArrayList arrayList;
        Iterator it;
        List list3;
        int i14;
        Collection collection;
        int i15;
        hi0.a aVar;
        li0.d0 d0VarA;
        li0.d0 d0Var;
        Collection collection2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i16 = pVar.f186305j;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                pVar.f186305j = i16 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f186303h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = pVar.f186305j;
        if (i17 == 0) {
            o13.r.b(obj);
            if (list2 != null) {
                arrayList = new ArrayList(p13.y.r(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((com.garmin.android.apps.connectmobile.smartscale.model.e) it3.next()).getUserProfileId());
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            it = list.iterator();
            list3 = arrayList;
            i14 = 0;
            collection = arrayList2;
            i15 = 0;
            if (it.hasNext()) {
                return (List) collection;
            }
            aVar = (hi0.a) it.next();
            d0VarA = hi0.b.a(aVar);
            p2 p2Var = this.f186267d;
            if (list3 == null && list3.contains(aVar.getUserId())) {
                li0.d0 d0VarB = li0.d0.b(d0VarA, null, li0.b0.REQUEST_SENT, null, null, aVar.getUserId(), null, null, 445);
                pVar.f186296a = list3;
                Collection collection3 = collection;
                pVar.f186297b = collection3;
                pVar.f186298c = it;
                pVar.f186299d = d0VarB;
                pVar.f186300e = collection3;
                pVar.f186301f = i14;
                pVar.f186302g = i15;
                pVar.f186305j = 1;
                if (li0.e0.d(d0VarB, p2Var, pVar) != aVar2) {
                    d0Var = d0VarB;
                    collection2 = collection;
                }
            } else {
                li0.d0 d0VarB2 = li0.d0.b(d0VarA, null, null, null, null, aVar.getUserId(), null, null, 445);
                pVar.f186296a = list3;
                Collection collection4 = collection;
                pVar.f186297b = collection4;
                pVar.f186298c = it;
                pVar.f186299d = d0VarB2;
                pVar.f186300e = collection4;
                pVar.f186301f = i14;
                pVar.f186302g = i15;
                pVar.f186305j = 2;
            }
            return aVar2;
        }
        if (i17 != 1 && i17 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i15 = pVar.f186302g;
        i14 = pVar.f186301f;
        collection = pVar.f186300e;
        d0Var = pVar.f186299d;
        it = pVar.f186298c;
        collection2 = pVar.f186297b;
        list3 = pVar.f186296a;
        o13.r.b(obj);
        collection.add(d0Var);
        collection = collection2;
        if (it.hasNext()) {
            return (List) collection;
        }
        aVar = (hi0.a) it.next();
        d0VarA = hi0.b.a(aVar);
        p2 p2Var2 = this.f186267d;
        if (list3 == null) {
            li0.d0 d0VarB3 = li0.d0.b(d0VarA, null, null, null, null, aVar.getUserId(), null, null, 445);
            pVar.f186296a = list3;
            Collection collection5 = collection;
            pVar.f186297b = collection5;
            pVar.f186298c = it;
            pVar.f186299d = d0VarB3;
            pVar.f186300e = collection5;
            pVar.f186301f = i14;
            pVar.f186302g = i15;
            pVar.f186305j = 2;
        } else {
            li0.d0 d0VarB4 = li0.d0.b(d0VarA, null, null, null, null, aVar.getUserId(), null, null, 445);
            pVar.f186296a = list3;
            Collection collection6 = collection;
            pVar.f186297b = collection6;
            pVar.f186298c = it;
            pVar.f186299d = d0VarB4;
            pVar.f186300e = collection6;
            pVar.f186301f = i14;
            pVar.f186302g = i15;
            pVar.f186305j = 2;
        }
        return aVar2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwn1/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
