package yt0;

import c22.b3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyt0/i0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkt0/a;", "challengesDelegate", "<init>", "(Lkt0/a;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt0.a f199509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.i f199510b;

    public i0(kt0.a aVar) {
        aVar.getClass();
        this.f199509a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f199494c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f199494c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objO = g0Var.f199492a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f199494c;
        if (i15 == 0) {
            o13.r.b(objO);
            String strA = b3.a();
            com.garmin.android.apps.connectmobile.badges.service.model.i iVar = this.f199510b;
            if (iVar == null || !p005kotlin.jvm.internal.s.g(iVar.f30587c, strA)) {
                g0Var.f199494c = 1;
                objO = this.f199509a.o(strA, "", g0Var);
                if (objO == aVar) {
                    return aVar;
                }
            }
            return this.f199510b;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objO);
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            this.f199510b = (com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a;
        }
        return this.f199510b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f199502c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f199502c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objO = h0Var.f199500a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f199502c;
        if (i15 == 0) {
            o13.r.b(objO);
            com.garmin.android.apps.connectmobile.badges.service.model.i iVar = this.f199510b;
            if (iVar == null || !p005kotlin.jvm.internal.s.g(iVar.f30587c, str)) {
                h0Var.f199502c = 1;
                objO = this.f199509a.o(str, str2, h0Var);
                if (objO == aVar) {
                    return aVar;
                }
            }
            return this.f199510b;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objO);
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            this.f199510b = (com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a;
        }
        return this.f199510b;
    }
}
