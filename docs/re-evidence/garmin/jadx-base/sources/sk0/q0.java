package sk0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsk0/q0;", "Lsk0/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkk0/b;", "gearRepository", "Lkk0/j0;", "webDataRepository", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Landroid/content/Context;Lkk0/b;Lkk0/j0;Lmk0/l;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends b0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.EditGearViewModel", f = "AddGearViewModel.kt", l = {316}, m = "saveGearRequest", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jk0.x f159814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f159815b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f159817d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f159815b = obj;
            this.f159817d |= Integer.MIN_VALUE;
            return q0.this.y4(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, kk0.b bVar, kk0.j0 j0Var, mk0.l lVar) {
        super(context, bVar, j0Var, lVar);
        context.getClass();
        bVar.getClass();
        j0Var.getClass();
        lVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sk0.b0
    public final Object y4(jk0.x xVar, t13.d<? super v2<jk0.x>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f159817d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f159817d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f159815b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f159817d;
        if (i15 == 0) {
            o13.r.b(objD);
            aVar.f159814a = xVar;
            aVar.f159817d = 1;
            objD = this.f159580a.d(xVar, aVar);
            if (objD == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = aVar.f159814a;
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(xVar, bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }
}
