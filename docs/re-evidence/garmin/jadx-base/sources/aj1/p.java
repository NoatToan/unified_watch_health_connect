package aj1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laj1/p;", "Landroidx/lifecycle/u1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> f3480a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<Boolean> f3481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f3482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.notifications.model.a f3483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dj1.a f3484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k12.b f3485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k12.d f3486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f3487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x01.i f3488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lc0.h f3489j;

    public p() {
        y0<Boolean> y0Var = new y0<>(Boolean.FALSE);
        this.f3481b = y0Var;
        this.f3482c = y0Var;
        this.f3484e = (dj1.a) KoinJavaComponent.get$default(dj1.a.class, null, null, 6, null);
        this.f3485f = k12.b.a.a(k12.b.f102303b);
        this.f3486g = k12.d.a.a(k12.d.f102315g);
        this.f3487h = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
        this.f3488i = (x01.i) KoinJavaComponent.get$default(x01.i.class, null, null, 6, null);
        this.f3489j = (lc0.h) KoinJavaComponent.get$default(lc0.h.class, null, null, 6, null);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new l(this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x4(String str, v13.c cVar) {
        k kVar;
        String strQ2;
        String str2;
        Object objJ;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f3451e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f3451e = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objI = kVar.f3449c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f3451e;
        if (i15 == 0) {
            r.b(objI);
            f12.l.f68084a.getClass();
            strQ2 = f12.l.a.a().Q2();
            str2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).d().f158514a;
            if (strQ2.length() == 0) {
                kVar.f3447a = str;
                kVar.f3448b = str2;
                kVar.f3451e = 1;
                objI = this.f3486g.i(kVar);
            } else {
                String str3 = str;
                String str4 = str2;
                kVar.f3447a = null;
                kVar.f3448b = null;
                kVar.f3451e = 2;
                k12.b bVar = this.f3485f;
                bVar.getClass();
                objJ = f0.J(bVar, new k12.c(bVar, str3, strQ2, str4, null), kVar);
                if (objJ != aVar) {
                    return objJ;
                }
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str5 = kVar.f3448b;
        String str6 = kVar.f3447a;
        r.b(objI);
        str2 = str5;
        str = str6;
        v2 v2Var = (v2) objI;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new v2.a(new Exception("Invalid customerGUID"), null, null, 6, null);
            }
            u0.r();
            return null;
        }
        strQ2 = ((j12.l) ((v2.b) v2Var).f47386a).getGarminGUID();
        if (strQ2 == null) {
            strQ2 = "";
        }
        String str7 = str;
        String str8 = str2;
        kVar.f3447a = null;
        kVar.f3448b = null;
        kVar.f3451e = 2;
        k12.b bVar2 = this.f3485f;
        bVar2.getClass();
        objJ = f0.J(bVar2, new k12.c(bVar2, str7, strQ2, str8, null), kVar);
        if (objJ != aVar) {
            return aVar;
        }
        return objJ;
    }

    public final y0 y4() {
        y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var = this.f3480a;
        if (y0Var.d() == null) {
            ge1.b.T(v1.a(this), null, null, new m(this, null), 3);
        }
        return y0Var;
    }
}
