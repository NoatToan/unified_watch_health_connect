package nx1;

import com.garmin.android.apps.connectmobile.v2;
import jv1.e0;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnx1/l;", "", "Lkv1/y;", "userSettingsRepo", "<init>", "(Lkv1/y;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv1.y f128242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f128243b;

    public l(kv1.y yVar) {
        yVar.getClass();
        this.f128242a = yVar;
        this.f128243b = q2.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        k kVar;
        p2 p2Var;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f128241d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f128241d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objA = kVar.f128239b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f128241d;
        p2 p2Var2 = this.f128243b;
        if (i15 == 0) {
            o13.r.b(objA);
            kVar.f128238a = p2Var2;
            kVar.f128241d = 1;
            objA = this.f128242a.a(kVar);
            if (objA != aVar) {
                p2Var = p2Var2;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objA);
                return p2Var2;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p2Var = kVar.f128238a;
        o13.r.b(objA);
        v2 v2Var = (v2) objA;
        e0 e0Var = v2Var instanceof v2.b ? (e0) ((v2.b) v2Var).f47386a : null;
        kVar.f128238a = null;
        kVar.f128241d = 2;
        return p2Var.emit(e0Var, kVar) == aVar ? aVar : p2Var2;
    }
}
