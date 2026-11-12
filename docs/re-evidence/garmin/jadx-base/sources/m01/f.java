package m01;

import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm01/f;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm01/a;", "Lc01/a;", "myFitnessPalAPI", "Lf12/l;", "userSettings", "<init>", "(Lc01/a;Lf12/l;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements com.garmin.android.apps.connectmobile.f0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c01.a f115581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f115582b;

    public f(c01.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f115581a = aVar;
        this.f115582b = lVar;
    }

    @Override // m01.a
    public final Object a(MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO, a21.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d(this, myFitnessPalUserAuthDTO, null), bVar);
    }

    @Override // m01.a
    public final Object b(String str, i21.d.e eVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e(this, str, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m01.a
    public final Object c(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f115539c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f115539c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f115537a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f115539c;
        if (i15 == 0) {
            o13.r.b(objJ);
            c cVar2 = new c(this, null);
            bVar.f115539c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, cVar2, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f115582b.p4(((MyFitnessPalUserAuthDTO) ((v2.b) v2Var).f47386a).C());
            return v2Var;
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }
}
