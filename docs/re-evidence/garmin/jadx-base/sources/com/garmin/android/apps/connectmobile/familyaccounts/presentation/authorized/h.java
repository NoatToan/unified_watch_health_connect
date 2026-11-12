package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e23.q;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import r53.p2;
import r53.q2;
import rg0.c0;
import rg0.d0;
import rg0.e0;
import rg0.f0;
import rg0.g0;
import rg0.v;
import u62.z;
import ue0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/h;", "Landroidx/lifecycle/u1;", "Lhl/a;", "screenAccessRole", "Lre0/h;", "accountSharingService", "La22/i;", "userProfileRepo", "Lc22/a0;", "dispatcherProvider", "Lf12/l;", "userSettings", "Lte0/d;", "fetchViewableAccountsUseCase", "<init>", "(Lhl/a;Lre0/h;La22/i;Lc22/a0;Lf12/l;Lte0/d;)V", "a", "b", "c", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35084w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.a f35085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.h f35086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.i f35087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f35088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.l f35089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final te0.d f35090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f35091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z53.b f35092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f35093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2 f35094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z53.b f35095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f35096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f35097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f35098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f35099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f35100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f35101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f35102r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f35103t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f35104v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/h$a;", "Landroidx/lifecycle/x1$c;", "Lhl/a;", "screenAccessRole", "<init>", "(Lhl/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hl.a f35105a;

        static {
            hl.a.Companion companion = hl.a.INSTANCE;
        }

        public a(hl.a aVar) {
            aVar.getClass();
            this.f35105a = aVar;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (!cls.isAssignableFrom(h.class)) {
                vb.h.z("UnKnown ViewModel class");
                return null;
            }
            re0.h.f152133t0.getClass();
            hl.a aVar = this.f35105a;
            return new h(aVar, re0.h.a.a(aVar), null, null, null, null, 60, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/h$c;", "", "", "Lue0/j;", "issuedInvites", "Lue0/n;", "receivedInvites", "declinedInvites", "Lue0/l;", "managedChildren", "adminGuardianMembers", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ue0.j> f35106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<n> f35107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<n> f35108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<ue0.l> f35109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<ue0.l> f35110e;

        public c(List<ue0.j> list, List<n> list2, List<n> list3, List<ue0.l> list4, List<ue0.l> list5) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            list5.getClass();
            this.f35106a = list;
            this.f35107b = list2;
            this.f35108c = list3;
            this.f35109d = list4;
            this.f35110e = list5;
        }

        public static c a(c cVar, ArrayList arrayList, List list, List list2, int i14) {
            List<ue0.j> list3 = arrayList;
            if ((i14 & 1) != 0) {
                list3 = cVar.f35106a;
            }
            List<ue0.j> list4 = list3;
            if ((i14 & 2) != 0) {
                list = cVar.f35107b;
            }
            List list5 = list;
            if ((i14 & 4) != 0) {
                list2 = cVar.f35108c;
            }
            List list6 = list2;
            List<ue0.l> list7 = cVar.f35109d;
            List<ue0.l> list8 = cVar.f35110e;
            cVar.getClass();
            list5.getClass();
            list6.getClass();
            return new c(list4, list5, list6, list7, list8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35106a.equals(cVar.f35106a) && this.f35107b.equals(cVar.f35107b) && this.f35108c.equals(cVar.f35108c) && this.f35109d.equals(cVar.f35109d) && this.f35110e.equals(cVar.f35110e);
        }

        public final int hashCode() {
            return this.f35110e.hashCode() + u0.b(u0.b(u0.b(this.f35106a.hashCode() * 31, 31, this.f35107b), 31, this.f35108c), 31, this.f35109d);
        }

        public final String toString() {
            StringBuilder sbK = f3.k("ViewerData(issuedInvites=", ", receivedInvites=", ", declinedInvites=", this.f35106a, this.f35107b);
            n23.j.z(sbK, this.f35108c, ", managedChildren=", this.f35109d, ", adminGuardianMembers=");
            return z.c(sbK, this.f35110e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$getViewers$1", f = "AuthorizedViewersViewModel.kt", l = {118, 121, 131, 457, 468}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v2 f35111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f35112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.b f35113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f35114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public z53.b f35115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f35117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f35118h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lue0/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$getViewers$1$invitesTask$1", f = "AuthorizedViewersViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends ue0.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f35121b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f35121b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f35121b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends ue0.b>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35120a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                re0.h hVar = this.f35121b.f35086b;
                this.f35120a = 1;
                Object objA = hVar.a(this);
                return objA == aVar ? aVar : objA;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = h.this.new d(dVar);
            dVar2.f35118h = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0218  */
        /* JADX WARN: Code duplicated, block: B:104:0x0222  */
        /* JADX WARN: Code duplicated, block: B:113:0x0250  */
        /* JADX WARN: Code duplicated, block: B:115:0x0254  */
        /* JADX WARN: Code duplicated, block: B:116:0x0257  */
        /* JADX WARN: Code duplicated, block: B:118:0x025a  */
        /* JADX WARN: Code duplicated, block: B:119:0x025d  */
        /* JADX WARN: Code duplicated, block: B:122:0x0276  */
        /* JADX WARN: Code duplicated, block: B:125:0x0285  */
        /* JADX WARN: Code duplicated, block: B:126:0x028a  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d7 A[LOOP:0: B:36:0x00d1->B:38:0x00d7, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:45:0x0106 A[LOOP:1: B:43:0x0100->B:45:0x0106, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:46:0x0118  */
        /* JADX WARN: Code duplicated, block: B:49:0x0124  */
        /* JADX WARN: Code duplicated, block: B:52:0x0137 A[LOOP:2: B:50:0x0131->B:52:0x0137, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:53:0x0149  */
        /* JADX WARN: Code duplicated, block: B:56:0x0155  */
        /* JADX WARN: Code duplicated, block: B:59:0x0168 A[LOOP:3: B:57:0x0162->B:59:0x0168, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:60:0x017a  */
        /* JADX WARN: Code duplicated, block: B:62:0x0181  */
        /* JADX WARN: Code duplicated, block: B:64:0x0184  */
        /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:71:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d8 A[PHI: r0
          0x01d8: PHI (r0v17 com.garmin.android.apps.connectmobile.v2) = (r0v4 com.garmin.android.apps.connectmobile.v2), (r0v26 com.garmin.android.apps.connectmobile.v2) binds: [B:63:0x0182, B:73:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:79:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:86:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:90:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:93:0x0208  */
        /* JADX WARN: Code duplicated, block: B:97:0x0212  */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x023d, code lost:
        
            if (r0.c(r18) == r2) goto L107;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v3, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v7, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v6, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r13v8, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Iterable] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objC;
            v2 v2Var;
            v2.a aVar;
            Exception illegalStateException;
            fw.m mVar;
            List list;
            ue0.b bVar;
            ArrayList arrayListC0;
            Object objA;
            v2 v2Var2;
            int i14;
            h hVar;
            List<ue0.j> listC;
            ?? arrayList;
            List<n> listD;
            ?? arrayList2;
            List<ue0.l> listA;
            ?? arrayList3;
            List<ue0.l> listB;
            ?? arrayList4;
            Iterator it;
            Iterator it3;
            Iterator it4;
            Iterator it5;
            Map map;
            z53.b bVar2;
            h hVar2;
            v2 v2Var3;
            c cVar;
            ue0.b bVar3;
            List<ue0.j> listC2;
            ue0.b bVar4;
            List<n> listD2;
            j0 j0Var;
            ue0.b bVar5;
            List<ue0.l> list2;
            ue0.b bVar6;
            List<ue0.l> list3;
            z53.b bVar7;
            List<ue0.l> listA2;
            List<ue0.l> listB2;
            z53.b bVar8;
            b0 b0Var = (b0) this.f35118h;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f35117g;
            h hVar3 = h.this;
            if (i15 == 0) {
                r.b(obj);
                p2 p2Var = hVar3.f35097m;
                fw.m.a aVar3 = fw.m.f73767e;
                fw.m mVar2 = (fw.m) p2Var.getValue();
                p2Var.k(null, fw.m.a.f(aVar3, null, mVar2 != null ? (List) mVar2.f73770c : null, 1));
                c2 c2Var = hVar3.f35094j;
                if (c2Var != null) {
                    this.f35118h = b0Var;
                    this.f35117g = 1;
                    if (c2Var.P(this) != aVar2) {
                    }
                }
                return aVar2;
            }
            try {
                if (i15 == 1) {
                    r.b(obj);
                } else {
                    if (i15 == 2) {
                        r.b(obj);
                        objC = obj;
                        v2Var = (v2) objC;
                        if (v2Var instanceof v2.b) {
                            bVar = (ue0.b) ((v2.b) v2Var).f47386a;
                            if (bVar != null) {
                                listC = bVar.c();
                                if (listC != null) {
                                    arrayList = new ArrayList(y.r(listC, 10));
                                    it5 = listC.iterator();
                                    while (it5.hasNext()) {
                                        arrayList.add(String.valueOf(((ue0.j) it5.next()).getInviteeUserId()));
                                    }
                                } else {
                                    arrayList = j0.f134944a;
                                }
                                Collection collection = (Collection) arrayList;
                                listD = bVar.d();
                                if (listD != null) {
                                    arrayList2 = new ArrayList(y.r(listD, 10));
                                    it4 = listD.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add(String.valueOf(((n) it4.next()).getInviterUserId()));
                                    }
                                } else {
                                    arrayList2 = j0.f134944a;
                                }
                                ArrayList arrayListC1 = h0.C0(collection, arrayList2);
                                listA = bVar.a();
                                if (listA != null) {
                                    arrayList3 = new ArrayList(y.r(listA, 10));
                                    it3 = listA.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(String.valueOf(((ue0.l) it3.next()).getUserId()));
                                    }
                                } else {
                                    arrayList3 = j0.f134944a;
                                }
                                ArrayList arrayListC2 = h0.C0(arrayListC1, arrayList3);
                                listB = bVar.b();
                                if (listB != null) {
                                    arrayList4 = new ArrayList(y.r(listB, 10));
                                    it = listB.iterator();
                                    while (it.hasNext()) {
                                        arrayList4.add(String.valueOf(((ue0.l) it.next()).getUserId()));
                                    }
                                } else {
                                    arrayList4 = j0.f134944a;
                                }
                                arrayListC0 = h0.C0(arrayListC2, arrayList4);
                            } else {
                                arrayListC0 = null;
                            }
                            if (arrayListC0 != null) {
                                a22.i iVar = hVar3.f35087c;
                                List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                                this.f35118h = null;
                                this.f35111a = v2Var;
                                this.f35112b = hVar3;
                                this.f35113c = null;
                                this.f35116f = 0;
                                this.f35117g = 3;
                                objA = iVar.a(arrayListC0, listK, this);
                                if (objA != aVar2) {
                                    v2Var2 = v2Var;
                                    i14 = 0;
                                    hVar = hVar3;
                                    map = (Map) objA;
                                    bVar2 = hVar.f35092h;
                                    this.f35118h = null;
                                    this.f35111a = v2Var2;
                                    this.f35112b = hVar;
                                    this.f35113c = null;
                                    this.f35114d = map;
                                    this.f35115e = bVar2;
                                    this.f35116f = i14;
                                    this.f35117g = 4;
                                    if (bVar2.c(this) != aVar2) {
                                        hVar2 = hVar;
                                        v2Var3 = v2Var2;
                                        hVar2.f35091g.putAll(map);
                                        Unit unit = Unit.INSTANCE;
                                        bVar2.e(null);
                                        v2Var = v2Var3;
                                        v2.b bVar9 = (v2.b) v2Var;
                                        Object obj2 = bVar9.f47386a;
                                        Object obj3 = bVar9.f47386a;
                                        bVar3 = (ue0.b) obj2;
                                        if (bVar3 != null) {
                                            listC2 = j0.f134944a;
                                        } else {
                                            listC2 = j0.f134944a;
                                        }
                                        List<ue0.j> list4 = listC2;
                                        bVar4 = (ue0.b) obj3;
                                        if (bVar4 != null) {
                                            listD2 = j0.f134944a;
                                        } else {
                                            listD2 = j0.f134944a;
                                        }
                                        List<n> list5 = listD2;
                                        j0Var = j0.f134944a;
                                        bVar5 = (ue0.b) obj3;
                                        if (bVar5 != null) {
                                            list2 = j0Var;
                                        } else {
                                            list2 = j0Var;
                                        }
                                        bVar6 = (ue0.b) obj3;
                                        if (bVar6 != null) {
                                            list3 = j0Var;
                                        } else {
                                            list3 = j0Var;
                                        }
                                        cVar = new c(list4, list5, j0Var, list2, list3);
                                        bVar7 = hVar3.f35095k;
                                        this.f35118h = null;
                                        this.f35111a = null;
                                        this.f35112b = cVar;
                                        this.f35113c = bVar7;
                                        this.f35114d = hVar3;
                                        this.f35115e = null;
                                        this.f35116f = 0;
                                        this.f35117g = 5;
                                    }
                                }
                            } else {
                                v2.b bVar10 = (v2.b) v2Var;
                                Object obj4 = bVar10.f47386a;
                                Object obj5 = bVar10.f47386a;
                                bVar3 = (ue0.b) obj4;
                                if (bVar3 != null) {
                                    listC2 = j0.f134944a;
                                } else {
                                    listC2 = j0.f134944a;
                                }
                                List<ue0.j> list6 = listC2;
                                bVar4 = (ue0.b) obj5;
                                if (bVar4 != null) {
                                    listD2 = j0.f134944a;
                                } else {
                                    listD2 = j0.f134944a;
                                }
                                List<n> list7 = listD2;
                                j0Var = j0.f134944a;
                                bVar5 = (ue0.b) obj5;
                                if (bVar5 != null) {
                                    list2 = j0Var;
                                } else {
                                    list2 = j0Var;
                                }
                                bVar6 = (ue0.b) obj5;
                                if (bVar6 != null) {
                                    list3 = j0Var;
                                } else {
                                    list3 = j0Var;
                                }
                                cVar = new c(list6, list7, j0Var, list2, list3);
                                bVar7 = hVar3.f35095k;
                                this.f35118h = null;
                                this.f35111a = null;
                                this.f35112b = cVar;
                                this.f35113c = bVar7;
                                this.f35114d = hVar3;
                                this.f35115e = null;
                                this.f35116f = 0;
                                this.f35117g = 5;
                            }
                            return aVar2;
                        }
                        if (v2Var instanceof v2.a) {
                            aVar = (v2.a) v2Var;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            illegalStateException = aVar.f47383a;
                        } else {
                            illegalStateException = null;
                        }
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(illegalStateException, "Failed to get viewers. ");
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var, "AuthorizedViewersViewModel", strD);
                        p2 p2Var2 = hVar3.f35097m;
                        fw.m.a aVar5 = fw.m.f73767e;
                        if (illegalStateException == null) {
                            illegalStateException = new IllegalStateException();
                        }
                        mVar = (fw.m) hVar3.f35097m.getValue();
                        if (mVar != null) {
                            list = (List) mVar.f73770c;
                        } else {
                            list = null;
                        }
                        aVar5.getClass();
                        p2Var2.k(null, fw.m.a.a(list, illegalStateException));
                        return Unit.INSTANCE;
                    }
                    if (i15 == 3) {
                        i14 = this.f35116f;
                        h hVar4 = (h) this.f35112b;
                        v2 v2Var4 = this.f35111a;
                        r.b(obj);
                        v2Var2 = v2Var4;
                        hVar = hVar4;
                        objA = obj;
                        map = (Map) objA;
                        bVar2 = hVar.f35092h;
                        this.f35118h = null;
                        this.f35111a = v2Var2;
                        this.f35112b = hVar;
                        this.f35113c = null;
                        this.f35114d = map;
                        this.f35115e = bVar2;
                        this.f35116f = i14;
                        this.f35117g = 4;
                        if (bVar2.c(this) != aVar2) {
                            hVar2 = hVar;
                            v2Var3 = v2Var2;
                            hVar2.f35091g.putAll(map);
                            Unit unit2 = Unit.INSTANCE;
                            bVar2.e(null);
                            v2Var = v2Var3;
                            v2.b bVar11 = (v2.b) v2Var;
                            Object obj6 = bVar11.f47386a;
                            Object obj7 = bVar11.f47386a;
                            bVar3 = (ue0.b) obj6;
                            if (bVar3 != null) {
                                listC2 = j0.f134944a;
                            } else {
                                listC2 = j0.f134944a;
                            }
                            List<ue0.j> list8 = listC2;
                            bVar4 = (ue0.b) obj7;
                            if (bVar4 != null) {
                                listD2 = j0.f134944a;
                            } else {
                                listD2 = j0.f134944a;
                            }
                            List<n> list9 = listD2;
                            j0Var = j0.f134944a;
                            bVar5 = (ue0.b) obj7;
                            if (bVar5 != null) {
                                list2 = j0Var;
                            } else {
                                list2 = j0Var;
                            }
                            bVar6 = (ue0.b) obj7;
                            if (bVar6 != null) {
                                list3 = j0Var;
                            } else {
                                list3 = j0Var;
                            }
                            cVar = new c(list8, list9, j0Var, list2, list3);
                            bVar7 = hVar3.f35095k;
                            this.f35118h = null;
                            this.f35111a = null;
                            this.f35112b = cVar;
                            this.f35113c = bVar7;
                            this.f35114d = hVar3;
                            this.f35115e = null;
                            this.f35116f = 0;
                            this.f35117g = 5;
                        }
                        return aVar2;
                    }
                    if (i15 == 4) {
                        z53.b bVar12 = this.f35115e;
                        map = (Map) this.f35114d;
                        hVar2 = (h) this.f35112b;
                        v2Var3 = this.f35111a;
                        r.b(obj);
                        bVar2 = bVar12;
                        try {
                            hVar2.f35091g.putAll(map);
                            Unit unit3 = Unit.INSTANCE;
                            bVar2.e(null);
                            v2Var = v2Var3;
                            v2.b bVar13 = (v2.b) v2Var;
                            Object obj8 = bVar13.f47386a;
                            Object obj9 = bVar13.f47386a;
                            bVar3 = (ue0.b) obj8;
                            if (bVar3 != null || (listC2 = bVar3.c()) == null) {
                                listC2 = j0.f134944a;
                            }
                            List<ue0.j> list10 = listC2;
                            bVar4 = (ue0.b) obj9;
                            if (bVar4 != null || (listD2 = bVar4.d()) == null) {
                                listD2 = j0.f134944a;
                            }
                            List<n> list11 = listD2;
                            j0Var = j0.f134944a;
                            bVar5 = (ue0.b) obj9;
                            if (bVar5 != null || (listB2 = bVar5.b()) == null) {
                                list2 = j0Var;
                            } else {
                                list2 = listB2;
                            }
                            bVar6 = (ue0.b) obj9;
                            if (bVar6 != null || (listA2 = bVar6.a()) == null) {
                                list3 = j0Var;
                            } else {
                                list3 = listA2;
                            }
                            cVar = new c(list10, list11, j0Var, list2, list3);
                            bVar7 = hVar3.f35095k;
                            this.f35118h = null;
                            this.f35111a = null;
                            this.f35112b = cVar;
                            this.f35113c = bVar7;
                            this.f35114d = hVar3;
                            this.f35115e = null;
                            this.f35116f = 0;
                            this.f35117g = 5;
                        } catch (Throwable th3) {
                            bVar2.e(null);
                            throw th3;
                        }
                    } else {
                        if (i15 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hVar3 = (h) this.f35114d;
                        bVar7 = this.f35113c;
                        c cVar2 = (c) this.f35112b;
                        r.b(obj);
                        cVar = cVar2;
                    }
                }
                int i16 = h.f35084w;
                hVar3.H4(cVar);
                Unit unit4 = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                bVar8.e(null);
            }
            bVar8 = bVar7;
            o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(hVar3, null), 3);
            this.f35118h = b0Var;
            this.f35117g = 2;
            objC = j0VarJ.C(this);
            if (objC != aVar2) {
                v2Var = (v2) objC;
                if (v2Var instanceof v2.b) {
                    bVar = (ue0.b) ((v2.b) v2Var).f47386a;
                    if (bVar != null) {
                        listC = bVar.c();
                        if (listC != null) {
                            arrayList = new ArrayList(y.r(listC, 10));
                            it5 = listC.iterator();
                            while (it5.hasNext()) {
                                arrayList.add(String.valueOf(((ue0.j) it5.next()).getInviteeUserId()));
                            }
                        } else {
                            arrayList = j0.f134944a;
                        }
                        Collection collection2 = (Collection) arrayList;
                        listD = bVar.d();
                        if (listD != null) {
                            arrayList2 = new ArrayList(y.r(listD, 10));
                            it4 = listD.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(String.valueOf(((n) it4.next()).getInviterUserId()));
                            }
                        } else {
                            arrayList2 = j0.f134944a;
                        }
                        ArrayList arrayListC3 = h0.C0(collection2, arrayList2);
                        listA = bVar.a();
                        if (listA != null) {
                            arrayList3 = new ArrayList(y.r(listA, 10));
                            it3 = listA.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(String.valueOf(((ue0.l) it3.next()).getUserId()));
                            }
                        } else {
                            arrayList3 = j0.f134944a;
                        }
                        ArrayList arrayListC4 = h0.C0(arrayListC3, arrayList3);
                        listB = bVar.b();
                        if (listB != null) {
                            arrayList4 = new ArrayList(y.r(listB, 10));
                            it = listB.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(String.valueOf(((ue0.l) it.next()).getUserId()));
                            }
                        } else {
                            arrayList4 = j0.f134944a;
                        }
                        arrayListC0 = h0.C0(arrayListC4, arrayList4);
                    } else {
                        arrayListC0 = null;
                    }
                    if (arrayListC0 != null) {
                        a22.i iVar2 = hVar3.f35087c;
                        List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK2 = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                        this.f35118h = null;
                        this.f35111a = v2Var;
                        this.f35112b = hVar3;
                        this.f35113c = null;
                        this.f35116f = 0;
                        this.f35117g = 3;
                        objA = iVar2.a(arrayListC0, listK2, this);
                        if (objA != aVar2) {
                            v2Var2 = v2Var;
                            i14 = 0;
                            hVar = hVar3;
                            map = (Map) objA;
                            bVar2 = hVar.f35092h;
                            this.f35118h = null;
                            this.f35111a = v2Var2;
                            this.f35112b = hVar;
                            this.f35113c = null;
                            this.f35114d = map;
                            this.f35115e = bVar2;
                            this.f35116f = i14;
                            this.f35117g = 4;
                            if (bVar2.c(this) != aVar2) {
                                hVar2 = hVar;
                                v2Var3 = v2Var2;
                                hVar2.f35091g.putAll(map);
                                Unit unit5 = Unit.INSTANCE;
                                bVar2.e(null);
                                v2Var = v2Var3;
                                v2.b bVar14 = (v2.b) v2Var;
                                Object obj10 = bVar14.f47386a;
                                Object obj11 = bVar14.f47386a;
                                bVar3 = (ue0.b) obj10;
                                if (bVar3 != null) {
                                    listC2 = j0.f134944a;
                                } else {
                                    listC2 = j0.f134944a;
                                }
                                List<ue0.j> list12 = listC2;
                                bVar4 = (ue0.b) obj11;
                                if (bVar4 != null) {
                                    listD2 = j0.f134944a;
                                } else {
                                    listD2 = j0.f134944a;
                                }
                                List<n> list13 = listD2;
                                j0Var = j0.f134944a;
                                bVar5 = (ue0.b) obj11;
                                if (bVar5 != null) {
                                    list2 = j0Var;
                                } else {
                                    list2 = j0Var;
                                }
                                bVar6 = (ue0.b) obj11;
                                if (bVar6 != null) {
                                    list3 = j0Var;
                                } else {
                                    list3 = j0Var;
                                }
                                cVar = new c(list12, list13, j0Var, list2, list3);
                                bVar7 = hVar3.f35095k;
                                this.f35118h = null;
                                this.f35111a = null;
                                this.f35112b = cVar;
                                this.f35113c = bVar7;
                                this.f35114d = hVar3;
                                this.f35115e = null;
                                this.f35116f = 0;
                                this.f35117g = 5;
                            }
                        }
                    } else {
                        v2.b bVar15 = (v2.b) v2Var;
                        Object obj12 = bVar15.f47386a;
                        Object obj13 = bVar15.f47386a;
                        bVar3 = (ue0.b) obj12;
                        if (bVar3 != null) {
                            listC2 = j0.f134944a;
                        } else {
                            listC2 = j0.f134944a;
                        }
                        List<ue0.j> list14 = listC2;
                        bVar4 = (ue0.b) obj13;
                        if (bVar4 != null) {
                            listD2 = j0.f134944a;
                        } else {
                            listD2 = j0.f134944a;
                        }
                        List<n> list15 = listD2;
                        j0Var = j0.f134944a;
                        bVar5 = (ue0.b) obj13;
                        if (bVar5 != null) {
                            list2 = j0Var;
                        } else {
                            list2 = j0Var;
                        }
                        bVar6 = (ue0.b) obj13;
                        if (bVar6 != null) {
                            list3 = j0Var;
                        } else {
                            list3 = j0Var;
                        }
                        cVar = new c(list14, list15, j0Var, list2, list3);
                        bVar7 = hVar3.f35095k;
                        this.f35118h = null;
                        this.f35111a = null;
                        this.f35112b = cVar;
                        this.f35113c = bVar7;
                        this.f35114d = hVar3;
                        this.f35115e = null;
                        this.f35116f = 0;
                        this.f35117g = 5;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        aVar = (v2.a) v2Var;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        illegalStateException = aVar.f47383a;
                    } else {
                        illegalStateException = null;
                    }
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(illegalStateException, "Failed to get viewers. ");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var2, "AuthorizedViewersViewModel", strD2);
                    p2 p2Var3 = hVar3.f35097m;
                    fw.m.a aVar7 = fw.m.f73767e;
                    if (illegalStateException == null) {
                        illegalStateException = new IllegalStateException();
                    }
                    mVar = (fw.m) hVar3.f35097m.getValue();
                    if (mVar != null) {
                        list = (List) mVar.f73770c;
                    } else {
                        list = null;
                    }
                    aVar7.getClass();
                    p2Var3.k(null, fw.m.a.a(list, illegalStateException));
                }
                return Unit.INSTANCE;
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f35122a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<fw.m<? extends Object>[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f35123a;

            public a(r53.i[] iVarArr) {
                this.f35123a = iVarArr;
            }

            @Override // e23.a
            public final fw.m<? extends Object>[] invoke() {
                return new fw.m[this.f35123a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$special$$inlined$combine$1$3", f = "AuthorizedViewersViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements q<r53.j<? super Boolean>, fw.m<? extends Object>[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35124a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f35125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f35126c;

            public b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super Boolean> jVar, fw.m<? extends Object>[] mVarArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f35125b = jVar;
                bVar.f35126c = mVarArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35124a;
                if (i14 == 0) {
                    r.b(obj);
                    r53.j jVar = this.f35125b;
                    fw.m[] mVarArr = (fw.m[]) this.f35126c;
                    int length = mVarArr.length;
                    boolean z14 = false;
                    for (int i15 = 0; i15 < length; i15++) {
                        fw.m mVar = mVarArr[i15];
                        if ((mVar != null ? mVar.f73769b : null) == fw.p.LOADING) {
                            z14 = true;
                            break;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    this.f35125b = null;
                    this.f35126c = null;
                    this.f35124a = 1;
                    if (jVar.emit(boolValueOf, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i[] iVarArr) {
            this.f35122a = iVarArr;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f35122a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public h(hl.a aVar, re0.h hVar, a22.i iVar, a0 a0Var, f12.l lVar, te0.d dVar) {
        aVar.getClass();
        hVar.getClass();
        iVar.getClass();
        a0Var.getClass();
        lVar.getClass();
        dVar.getClass();
        this.f35085a = aVar;
        this.f35086b = hVar;
        this.f35087c = iVar;
        this.f35088d = a0Var;
        this.f35089e = lVar;
        this.f35090f = dVar;
        this.f35091g = new LinkedHashMap();
        this.f35092h = z53.c.a();
        this.f35095k = z53.c.a();
        p2 p2VarA = q2.a(null);
        this.f35097m = p2VarA;
        this.f35098n = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f35099o = p2VarA2;
        this.f35100p = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f35101q = p2VarA3;
        this.f35102r = p2VarA3;
        this.f35103t = new e(new r53.i[]{p2VarA, p2VarA2, p2VarA3});
        this.f35104v = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(h hVar, long j8, v13.c cVar) {
        f0 f0Var;
        z53.b bVar;
        n nVar;
        Object next;
        hVar.getClass();
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f152545e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f152545e = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(hVar, cVar);
            }
        } else {
            f0Var = new f0(hVar, cVar);
        }
        Object obj = f0Var.f152543c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f152545e;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = hVar.f35095k;
            f0Var.f152542b = bVar2;
            f0Var.f152541a = j8;
            f0Var.f152545e = 1;
            if (bVar2.c(f0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = f0Var.f152541a;
            bVar = f0Var.f152542b;
            r.b(obj);
        }
        try {
            c cVar2 = hVar.f35096l;
            if (cVar2 != null) {
                Iterator<T> it = cVar2.f35107b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long inviterUserId = ((n) next).getInviterUserId();
                    if (inviterUserId != null && inviterUserId.longValue() == j8) {
                        break;
                    }
                }
                nVar = (n) next;
            } else {
                nVar = null;
            }
            bVar.e(null);
            if (nVar == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "AuthorizedViewersViewModel", "Invite not found from user");
            }
            return nVar;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(h hVar, n nVar, long j8, v13.c cVar) {
        g0 g0Var;
        z53.b bVar;
        c cVarA;
        hVar.getClass();
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f152555f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f152555f = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(hVar, cVar);
            }
        } else {
            g0Var = new g0(hVar, cVar);
        }
        Object obj = g0Var.f152553d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f152555f;
        if (i15 == 0) {
            r.b(obj);
            bVar = hVar.f35095k;
            g0Var.f152550a = nVar;
            g0Var.f152551b = bVar;
            g0Var.f152552c = j8;
            g0Var.f152555f = 1;
            if (bVar.c(g0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = g0Var.f152552c;
            z53.b bVar2 = g0Var.f152551b;
            n nVar2 = g0Var.f152550a;
            r.b(obj);
            bVar = bVar2;
            nVar = nVar2;
        }
        try {
            c cVar2 = hVar.f35096l;
            if (cVar2 != null) {
                ArrayList arrayList = new ArrayList(cVar2.f35107b);
                ArrayList arrayList2 = new ArrayList(cVar2.f35108c);
                Iterator it = arrayList.iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i16 = -1;
                        break;
                    }
                    Long inviteId = ((n) it.next()).getInviteId();
                    if (inviteId != null && inviteId.longValue() == j8) {
                        break;
                    }
                    i16++;
                }
                Integer num = new Integer(i16);
                if (num.intValue() < 0) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (nVar == null) {
                        arrayList2.add((n) arrayList.remove(iIntValue));
                    } else {
                        arrayList.set(iIntValue, nVar);
                    }
                }
                cVarA = c.a(cVar2, null, h0.b1(arrayList), h0.b1(arrayList2), 25);
            } else {
                cVarA = null;
            }
            hVar.H4(cVarA);
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable A4(long j8, v13.c cVar) {
        rg0.z zVar;
        z53.b bVar;
        ue0.j jVar;
        Object next;
        if (cVar instanceof rg0.z) {
            zVar = (rg0.z) cVar;
            int i14 = zVar.f152650e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f152650e = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new rg0.z(this, cVar);
            }
        } else {
            zVar = new rg0.z(this, cVar);
        }
        Object obj = zVar.f152648c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f152650e;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            zVar.f152647b = bVar2;
            zVar.f152646a = j8;
            zVar.f152650e = 1;
            if (bVar2.c(zVar) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = zVar.f152646a;
            bVar = zVar.f152647b;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            if (cVar2 != null) {
                Iterator<T> it = cVar2.f35106a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long inviteeUserId = ((ue0.j) next).getInviteeUserId();
                    if (inviteeUserId != null && inviteeUserId.longValue() == j8) {
                        break;
                    }
                }
                jVar = (ue0.j) next;
            } else {
                jVar = null;
            }
            return jVar;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(v13.c cVar) {
        rg0.a0 a0Var;
        z53.b bVar;
        if (cVar instanceof rg0.a0) {
            a0Var = (rg0.a0) cVar;
            int i14 = a0Var.f152508d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f152508d = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new rg0.a0(this, cVar);
            }
        } else {
            a0Var = new rg0.a0(this, cVar);
        }
        Object obj = a0Var.f152506b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f152508d;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            a0Var.f152505a = bVar2;
            a0Var.f152508d = 1;
            if (bVar2.c(a0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = a0Var.f152505a;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            return cVar2 != null ? cVar2.f35106a : j0.f134944a;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable C4(long j8, v13.c cVar) {
        rg0.b0 b0Var;
        z53.b bVar;
        ue0.l lVar;
        Object next;
        if (cVar instanceof rg0.b0) {
            b0Var = (rg0.b0) cVar;
            int i14 = b0Var.f152515e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f152515e = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new rg0.b0(this, cVar);
            }
        } else {
            b0Var = new rg0.b0(this, cVar);
        }
        Object obj = b0Var.f152513c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f152515e;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            b0Var.f152512b = bVar2;
            b0Var.f152511a = j8;
            b0Var.f152515e = 1;
            if (bVar2.c(b0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = b0Var.f152511a;
            bVar = b0Var.f152512b;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            if (cVar2 != null) {
                Iterator<T> it = cVar2.f35109d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long userId = ((ue0.l) next).getUserId();
                    if (userId != null && userId.longValue() == j8) {
                        break;
                    }
                }
                lVar = (ue0.l) next;
            } else {
                lVar = null;
            }
            return lVar;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable D4(long j8, v13.c cVar) {
        c0 c0Var;
        z53.b bVar;
        n nVar;
        Object next;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f152523e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f152523e = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.f152521c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f152523e;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            c0Var.f152520b = bVar2;
            c0Var.f152519a = j8;
            c0Var.f152523e = 1;
            if (bVar2.c(c0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = c0Var.f152519a;
            bVar = c0Var.f152520b;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            if (cVar2 != null) {
                Iterator<T> it = cVar2.f35107b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long inviterUserId = ((n) next).getInviterUserId();
                    if (inviterUserId != null && inviterUserId.longValue() == j8) {
                        break;
                    }
                }
                nVar = (n) next;
            } else {
                nVar = null;
            }
            return nVar;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E4(v13.c cVar) {
        d0 d0Var;
        z53.b bVar;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i14 = d0Var.f152528d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f152528d = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object obj = d0Var.f152526b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f152528d;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            d0Var.f152525a = bVar2;
            d0Var.f152528d = 1;
            if (bVar2.c(d0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = d0Var.f152525a;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            return cVar2 != null ? cVar2.f35107b : j0.f134944a;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F4(Long l14, v13.c cVar) {
        e0 e0Var;
        z53.b bVar;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f152535e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f152535e = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f152533c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f152535e;
        if (i15 == 0) {
            r.b(obj);
            e0Var.f152531a = l14;
            bVar = this.f35092h;
            e0Var.f152532b = bVar;
            e0Var.f152535e = 1;
            if (bVar.c(e0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = e0Var.f152532b;
            Long l15 = e0Var.f152531a;
            r.b(obj);
            bVar = bVar2;
            l14 = l15;
        }
        try {
            return this.f35091g.get(l14 != null ? new Integer((int) l14.longValue()) : null);
        } finally {
            bVar.e(null);
        }
    }

    public final void G4() {
        c2 c2Var = this.f35093i;
        if (c2Var == null || !c2Var.isActive()) {
            this.f35093i = ge1.b.T(v1.a(this), this.f35088d.f22991c, null, new d(null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    public final void H4(c cVar) {
        Collection collectionN0;
        this.f35096l = cVar;
        fw.m.a aVar = fw.m.f73767e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(f.e.f35073a);
        arrayList.add(f.j.f35079a);
        if (cVar == null) {
            collectionN0 = j0.f134944a;
        } else {
            ArrayList arrayListC0 = h0.C0(cVar.f35106a, cVar.f35110e);
            ArrayList arrayList2 = new ArrayList(y.r(arrayListC0, 10));
            Iterator it = arrayListC0.iterator();
            while (it.hasNext()) {
                arrayList2.add((f) ge1.b.W(t13.h.f161748a, new j(this, (ue0.d) it.next(), null)));
            }
            Collator collator = Collator.getInstance();
            collator.setStrength(1);
            collectionN0 = h0.N0(arrayList2, new v(collator));
        }
        arrayList.addAll(collectionN0);
        f12.l lVar = this.f35089e;
        boolean z14 = lVar.N().contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD") || (lVar.N().contains("ROLE_USER_MANAGED_ACCOUNTS_ADMIN") && (this.f35085a instanceof hl.a.b));
        if (!z14) {
            arrayList.add(f.i.f35078a);
            arrayList.add(f.b.f35068a);
        }
        if (cVar != null) {
            List<ue0.l> list = cVar.f35109d;
            List<n> list2 = cVar.f35108c;
            List<n> list3 = cVar.f35107b;
            if (h0.L(h0.C0(h0.C0(list3, list2), list))) {
                ArrayList arrayListC1 = h0.C0(h0.C0(list3, list2), list);
                ArrayList arrayList3 = new ArrayList(y.r(arrayListC1, 10));
                Iterator it3 = arrayListC1.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((f) ge1.b.W(t13.h.f161748a, new i(this, (ue0.d) it3.next(), cVar, null)));
                }
                Collator collator2 = Collator.getInstance();
                collator2.setStrength(1);
                arrayList.addAll(h0.N0(arrayList3, new v(collator2)));
            } else if (!z14) {
                arrayList.add(f.c.f35069a);
            }
        } else if (!z14) {
            arrayList.add(f.c.f35069a);
        }
        this.f35097m.k(null, fw.m.a.g(aVar, arrayList, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable z4(long j8, v13.c cVar) {
        rg0.y yVar;
        z53.b bVar;
        ue0.l lVar;
        Object next;
        if (cVar instanceof rg0.y) {
            yVar = (rg0.y) cVar;
            int i14 = yVar.f152645e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f152645e = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new rg0.y(this, cVar);
            }
        } else {
            yVar = new rg0.y(this, cVar);
        }
        Object obj = yVar.f152643c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f152645e;
        if (i15 == 0) {
            r.b(obj);
            z53.b bVar2 = this.f35095k;
            yVar.f152642b = bVar2;
            yVar.f152641a = j8;
            yVar.f152645e = 1;
            if (bVar2.c(yVar) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = yVar.f152641a;
            bVar = yVar.f152642b;
            r.b(obj);
        }
        try {
            c cVar2 = this.f35096l;
            if (cVar2 != null) {
                Iterator<T> it = cVar2.f35110e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long userId = ((ue0.l) next).getUserId();
                    if (userId != null && userId.longValue() == j8) {
                        break;
                    }
                }
                lVar = (ue0.l) next;
            } else {
                lVar = null;
            }
            return lVar;
        } finally {
            bVar.e(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/h$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(hl.a aVar, re0.h hVar, a22.i iVar, a0 a0Var, f12.l lVar, te0.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        f12.l lVarA;
        if ((i14 & 4) != 0) {
            a22.i.f537b.getClass();
            iVar = a22.i.a.a();
        }
        a22.i iVar2 = iVar;
        a0 a0Var2 = (i14 & 8) != 0 ? new a0(null, null, null, 7, null) : a0Var;
        if ((i14 & 16) != 0) {
            f12.l.f68084a.getClass();
            lVarA = f12.l.a.a();
        } else {
            lVarA = lVar;
        }
        this(aVar, hVar, iVar2, a0Var2, lVarA, (i14 & 32) != 0 ? (te0.d) KoinJavaComponent.get$default(te0.d.class, null, null, 6, null) : dVar);
    }
}
