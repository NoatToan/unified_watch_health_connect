package v01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv01/g2;", "", "Lm01/g;", "repository", "Lv01/q1;", "photoUploadUseCase", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lm01/g;Lv01/q1;Lo53/z;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f174386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f174387c;

    public g2(m01.g gVar, q1 q1Var, o53.z zVar) {
        gVar.getClass();
        q1Var.getClass();
        zVar.getClass();
        this.f174385a = gVar;
        this.f174386b = q1Var;
        this.f174387c = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(g2 g2Var, String str, v13.c cVar) {
        e2 e2Var;
        g2Var.getClass();
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i14 = e2Var.f174346c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e2Var.f174346c = i14 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(g2Var, cVar);
            }
        } else {
            e2Var = new e2(g2Var, cVar);
        }
        Object objD0 = e2Var.f174344a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e2Var.f174346c;
        if (i15 == 0) {
            o13.r.b(objD0);
            m01.g gVar = g2Var.f174385a;
            PhotoCategory photoCategory = PhotoCategory.RECIPE;
            e2Var.f174346c = 1;
            objD0 = gVar.d0(photoCategory, str, e2Var);
            if (objD0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD0);
        }
        v2 v2Var = (v2) objD0;
        if (v2Var instanceof v2.b) {
            return q01.b.c.f141984a;
        }
        if (v2Var instanceof v2.a) {
            return q01.b.C2663b.f141983a;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g2(m01.g gVar, q1 q1Var, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(gVar, q1Var, zVar);
    }
}
