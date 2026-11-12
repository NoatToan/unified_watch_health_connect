package sk0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsk0/p0;", "Lsk0/u;", "Lkk0/b;", "gearRepository", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Lkk0/b;Lmk0/l;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 extends u {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.EditCollectionViewModel", f = "AddCollectionViewModel.kt", l = {302}, m = "saveCollectionRequest", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jk0.j f159799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f159800b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f159802d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f159800b = obj;
            this.f159802d |= Integer.MIN_VALUE;
            return p0.this.A4(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kk0.b bVar, mk0.l lVar) {
        super(bVar, lVar);
        bVar.getClass();
        lVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sk0.u
    public final Object A4(jk0.j jVar, t13.d<? super v2<jk0.j>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f159802d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f159802d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objV = aVar.f159800b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f159802d;
        if (i15 == 0) {
            o13.r.b(objV);
            aVar.f159799a = jVar;
            aVar.f159802d = 1;
            objV = this.f159844a.V(jVar, aVar);
            if (objV == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = aVar.f159799a;
            o13.r.b(objV);
        }
        v2 v2Var = (v2) objV;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(jVar, bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }
}
