package com.garmin.android.apps.connectmobile.group.details.challenges;

import androidx.core.view.j;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mt0.p3;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.y;
import q6.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/c;", "Landroidx/lifecycle/u1;", "", "Lym0/a;", "groupRepo", "<init>", "(Lym0/a;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f36301h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3 f36302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f36303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<List<GroupChallengeDTO>> f36304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f36305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f36306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a.b>> f36307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36308g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36309a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.group.details.challenges.b.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.challenges.b.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.challenges.b.PAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36309a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.challenges.GroupChallengesViewModel$challengeItemList$1$1$1", f = "GroupChallengesViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class C0640c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f36310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f36311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f36312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<GroupChallengeDTO> f36314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c f36315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a>> f36316g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0640c(List<? extends GroupChallengeDTO> list, c cVar, w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a>> w0Var, t13.d<? super C0640c> dVar) {
            super(2, dVar);
            this.f36314e = list;
            this.f36315f = cVar;
            this.f36316g = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0640c(this.f36314e, this.f36315f, this.f36316g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0640c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36313d;
            c cVar = this.f36315f;
            if (i14 == 0) {
                r.b(obj);
                ArrayList arrayList4 = new ArrayList();
                List<GroupChallengeDTO> list = this.f36314e;
                list.getClass();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list) {
                    com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
                    GroupChallengeDTO.b bVar = ((GroupChallengeDTO) obj2).f31513b;
                    bVar.getClass();
                    aVar2.getClass();
                    if (com.garmin.android.apps.connectmobile.group.details.challenges.b.CURRENT.f36299a.contains(bVar)) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list) {
                    com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar3 = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
                    GroupChallengeDTO.b bVar2 = ((GroupChallengeDTO) obj3).f31513b;
                    bVar2.getClass();
                    aVar3.getClass();
                    if (com.garmin.android.apps.connectmobile.group.details.challenges.b.PAST.f36299a.contains(bVar2)) {
                        arrayList6.add(obj3);
                    }
                }
                this.f36310a = arrayList4;
                this.f36311b = arrayList5;
                this.f36312c = arrayList6;
                this.f36313d = 1;
                if (c.y4(cVar, arrayList6, this) == aVar) {
                    return aVar;
                }
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList3 = this.f36312c;
                arrayList2 = this.f36311b;
                arrayList = this.f36310a;
                r.b(obj);
            }
            if (arrayList2.isEmpty() && arrayList3.isEmpty() && !cVar.f36308g) {
                arrayList.add(com.garmin.android.apps.connectmobile.group.details.challenges.a.C0637a.f36289a);
            } else if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                c.x4(cVar, arrayList2, com.garmin.android.apps.connectmobile.group.details.challenges.b.CURRENT, arrayList);
                c.x4(cVar, arrayList3, com.garmin.android.apps.connectmobile.group.details.challenges.b.PAST, arrayList);
            }
            this.f36316g.j(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.challenges.GroupChallengesViewModel$pastChallengeItemList$1$1$1", f = "GroupChallengesViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f36317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<GroupChallengeDTO> f36319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a.b>> f36320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f36321e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends GroupChallengeDTO> list, w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a.b>> w0Var, c cVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f36319c = list;
            this.f36320d = w0Var;
            this.f36321e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f36319c, this.f36320d, this.f36321e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<GroupChallengeDTO> arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36318b;
            if (i14 == 0) {
                r.b(obj);
                List<GroupChallengeDTO> list = this.f36319c;
                ArrayList arrayListL = j.l(list);
                for (Object obj2 : list) {
                    com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
                    GroupChallengeDTO.b bVar = ((GroupChallengeDTO) obj2).f31513b;
                    bVar.getClass();
                    aVar2.getClass();
                    if (com.garmin.android.apps.connectmobile.group.details.challenges.b.PAST.f36299a.contains(bVar)) {
                        arrayListL.add(obj2);
                    }
                }
                this.f36317a = arrayListL;
                this.f36318b = 1;
                if (c.y4(this.f36321e, arrayListL, this) == aVar) {
                    return aVar;
                }
                arrayList = arrayListL;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = this.f36317a;
                r.b(obj);
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            for (GroupChallengeDTO groupChallengeDTO : arrayList) {
                ArrayList arrayList3 = groupChallengeDTO.f31519h;
                arrayList3.getClass();
                Object objB0 = h0.b0(arrayList3);
                objB0.getClass();
                ArrayList arrayList4 = groupChallengeDTO.f31519h;
                arrayList4.getClass();
                List listE1 = h0.e1(arrayList4);
                Collections.shuffle(listE1);
                arrayList2.add(new com.garmin.android.apps.connectmobile.group.details.challenges.a.b(groupChallengeDTO, (GroupChallengePlayerDTO) objB0, listE1));
            }
            this.f36320d.j(arrayList2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36322a;

        public e(l lVar) {
            lVar.getClass();
            this.f36322a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f36322a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36322a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public c(ym0.a aVar) {
        aVar.getClass();
        this.f36302a = new p3((a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null));
        this.f36303b = aVar;
        y0<List<GroupChallengeDTO>> y0Var = new y0<>();
        this.f36304c = y0Var;
        final w0 w0Var = new w0();
        final int i14 = 0;
        w0Var.n(y0Var, new e(new l(this) { // from class: pm0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.c f138597b;

            {
                this.f138597b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                w0 w0Var2 = w0Var;
                com.garmin.android.apps.connectmobile.group.details.challenges.c cVar = this.f138597b;
                List list = (List) obj;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.group.details.challenges.c.f36301h;
                        w9.a aVarA = v1.a(cVar);
                        x53.c cVar2 = s0.f129406a;
                        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.group.details.challenges.c.C0640c(list, cVar, w0Var2, null), 2);
                        break;
                    default:
                        int i17 = com.garmin.android.apps.connectmobile.group.details.challenges.c.f36301h;
                        w9.a aVarA2 = v1.a(cVar);
                        x53.c cVar3 = s0.f129406a;
                        ge1.b.T(aVarA2, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.group.details.challenges.c.d(list, w0Var2, cVar, null), 2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.f36305d = w0Var;
        this.f36306e = t1.a(y0Var, new p40.h(17));
        final w0<List<com.garmin.android.apps.connectmobile.group.details.challenges.a.b>> w0Var2 = new w0<>();
        final int i15 = 1;
        w0Var2.n(y0Var, new e(new l(this) { // from class: pm0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.c f138597b;

            {
                this.f138597b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                w0 w0Var3 = w0Var2;
                com.garmin.android.apps.connectmobile.group.details.challenges.c cVar = this.f138597b;
                List list = (List) obj;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.group.details.challenges.c.f36301h;
                        w9.a aVarA = v1.a(cVar);
                        x53.c cVar2 = s0.f129406a;
                        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.group.details.challenges.c.C0640c(list, cVar, w0Var3, null), 2);
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.group.details.challenges.c.f36301h;
                        w9.a aVarA2 = v1.a(cVar);
                        x53.c cVar3 = s0.f129406a;
                        ge1.b.T(aVarA2, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.group.details.challenges.c.d(list, w0Var3, cVar, null), 2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.f36307f = w0Var2;
    }

    public static final void x4(c cVar, List list, com.garmin.android.apps.connectmobile.group.details.challenges.b bVar, List list2) {
        cVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        list2.add(new com.garmin.android.apps.connectmobile.group.details.challenges.a.c(bVar));
        List<GroupChallengeDTO> listS0 = h0.S0(list, 3);
        ArrayList arrayList = new ArrayList(y.r(listS0, 10));
        for (GroupChallengeDTO groupChallengeDTO : listS0) {
            ArrayList arrayList2 = groupChallengeDTO.f31519h;
            arrayList2.getClass();
            Object objB0 = h0.b0(arrayList2);
            objB0.getClass();
            ArrayList arrayList3 = groupChallengeDTO.f31519h;
            arrayList3.getClass();
            List listE1 = h0.e1(arrayList3);
            Collections.shuffle(listE1);
            arrayList.add(new com.garmin.android.apps.connectmobile.group.details.challenges.a.b(groupChallengeDTO, (GroupChallengePlayerDTO) objB0, listE1));
        }
        list2.addAll(arrayList);
        if (list.size() > 3) {
            list2.add(new com.garmin.android.apps.connectmobile.group.details.challenges.a.d(bVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(c cVar, ArrayList arrayList, v13.c cVar2) {
        pm0.d dVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        cVar.getClass();
        if (cVar2 instanceof pm0.d) {
            dVar = (pm0.d) cVar2;
            int i14 = dVar.f138607d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f138607d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new pm0.d(cVar, cVar2);
            }
        } else {
            dVar = new pm0.d(cVar, cVar2);
        }
        Object objX4 = dVar.f138605b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f138607d;
        if (i15 == 0) {
            r.b(objX4);
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = ((GroupChallengeDTO) it.next()).f31519h;
                arrayList3.getClass();
                String str = ((GroupChallengePlayerDTO) h0.b0(arrayList3)).f31537a;
                str.getClass();
                arrayList2.add(new Integer(Integer.parseInt(str)));
            }
            List<Integer> listB1 = h0.b1(h0.f1(arrayList2));
            List<? extends k> listC = w.c(k.FRAMED_THUMBNAIL);
            dVar.f138604a = arrayList;
            dVar.f138607d = 1;
            objX4 = cVar.f36302a.x4(listB1, listC, dVar);
            if (objX4 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = dVar.f138604a;
            r.b(objX4);
        }
        Map map = (Map) objX4;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList4 = ((GroupChallengeDTO) it3.next()).f31519h;
            arrayList4.getClass();
            GroupChallengePlayerDTO groupChallengePlayerDTO = (GroupChallengePlayerDTO) h0.b0(arrayList4);
            String str2 = groupChallengePlayerDTO.f31537a;
            str2.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) f.l(Integer.parseInt(str2), map);
            groupChallengePlayerDTO.f31548l = new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46877f, null, null, null, null, 30, null);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/c$a;", "", "<init>", "()V", "", "MAX_CHALLENGE_DISPLAY_COUNT", "I", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(ym0.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            ym0.a.f197886f.getClass();
            aVar = ym0.a.C3709a.a();
        }
        this(aVar);
    }
}
