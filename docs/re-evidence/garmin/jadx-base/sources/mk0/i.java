package mk0;

import am.x0;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.ResolveDefaultGearConflictsUseCase$invoke$2", f = "ResolveDefaultGearConflictsUseCase.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection<c> f119122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f119123d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.ResolveDefaultGearConflictsUseCase$invoke$2$collectionTasks$1$1", f = "ResolveDefaultGearConflictsUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f119125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f119126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<x0> f119127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, String str, List<? extends x0> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f119125b = lVar;
            this.f119126c = str;
            this.f119127d = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f119125b, this.f119126c, this.f119127d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119124a;
            if (i14 == 0) {
                r.b(obj);
                this.f119124a = 1;
                Object objA = l.a(this.f119125b, this.f119126c, this.f119127d, this);
                return objA == aVar ? aVar : objA;
            }
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.ResolveDefaultGearConflictsUseCase$invoke$2$individualGearTasks$1$1", f = "ResolveDefaultGearConflictsUseCase.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f119129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f119130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<x0> f119131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar, String str, List<? extends x0> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f119129b = lVar;
            this.f119130c = str;
            this.f119131d = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f119129b, this.f119130c, this.f119131d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119128a;
            if (i14 == 0) {
                r.b(obj);
                this.f119128a = 1;
                Object objB = l.b(this.f119129b, this.f119130c, this.f119131d, this);
                return objB == aVar ? aVar : objB;
            }
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Collection<c> collection, l lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f119122c = collection;
        this.f119123d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f119122c, this.f119123d, dVar);
        iVar.f119121b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        l lVar;
        b0 b0Var = (b0) this.f119121b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119120a;
        boolean z14 = true;
        if (i14 == 0) {
            r.b(obj);
            Collection<c> collection = this.f119122c;
            if (collection.isEmpty()) {
                return Boolean.TRUE;
            }
            Collection<c> collection2 = collection;
            ArrayList<o13.p> arrayList = new ArrayList();
            for (c cVar : collection2) {
                Set<String> set = cVar.f119103b;
                ArrayList arrayList2 = new ArrayList(y.r(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new o13.p((String) it.next(), cVar.f119102a));
                }
                d0.v(arrayList, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (o13.p pVar : arrayList) {
                String str = (String) pVar.f128594a;
                Object arrayList3 = linkedHashMap.get(str);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str, arrayList3);
                }
                ((List) arrayList3).add((x0) pVar.f128595b);
            }
            ArrayList<o13.p> arrayList4 = new ArrayList();
            for (c cVar2 : collection2) {
                Set<String> set2 = cVar2.f119104c;
                ArrayList arrayList5 = new ArrayList(y.r(set2, 10));
                Iterator<T> it3 = set2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new o13.p((String) it3.next(), cVar2.f119102a));
                }
                d0.v(arrayList4, arrayList5);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (o13.p pVar2 : arrayList4) {
                String str2 = (String) pVar2.f128594a;
                Object arrayList6 = linkedHashMap2.get(str2);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(str2, arrayList6);
                }
                ((List) arrayList6).add((x0) pVar2.f128595b);
            }
            ArrayList arrayList7 = new ArrayList(linkedHashMap.size());
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it4.hasNext();
                lVar = this.f119123d;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it4.next();
                arrayList7.add(ge1.b.j(b0Var, null, null, new a(lVar, (String) entry.getKey(), (List) entry.getValue(), null), 3));
            }
            ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                arrayList8.add(ge1.b.j(b0Var, null, null, new b(lVar, (String) entry2.getKey(), (List) entry2.getValue(), null), 3));
            }
            ArrayList arrayListC0 = h0.C0(arrayList7, arrayList8);
            this.f119121b = null;
            this.f119120a = 1;
            obj = g8.i.o(arrayListC0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it5 = iterable.iterator();
            while (it5.hasNext()) {
                if (!((Boolean) it5.next()).booleanValue()) {
                    z14 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
