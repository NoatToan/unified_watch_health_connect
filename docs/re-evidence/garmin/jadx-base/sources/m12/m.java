package m12;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm12/m;", "", "Lk12/b;", "ssoRepo", "Lk12/a;", "usersRepo", "Lf12/b;", "userAccount", "Lf12/l;", "userSettings", "<init>", "(Lk12/b;Lk12/a;Lf12/b;Lf12/l;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.b f115844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k12.a f115845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.b f115846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f115847d;

    public m(k12.b bVar, k12.a aVar, f12.b bVar2, f12.l lVar) {
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        lVar.getClass();
        this.f115844a = bVar;
        this.f115845b = aVar;
        this.f115846c = bVar2;
        this.f115847d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, v13.c cVar) {
        l lVar;
        String strQ2;
        String str2;
        Object objJ;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f115843e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f115843e = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objI = lVar.f115841c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f115843e;
        if (i15 == 0) {
            o13.r.b(objI);
            strQ2 = this.f115847d.Q2();
            str2 = this.f115846c.d().f158514a;
            if (strQ2.length() == 0) {
                lVar.f115839a = str;
                lVar.f115840b = str2;
                lVar.f115843e = 1;
                objI = this.f115845b.i(lVar);
            } else {
                String str3 = str;
                String str4 = strQ2;
                String str5 = str2;
                lVar.f115839a = null;
                lVar.f115840b = null;
                lVar.f115843e = 2;
                k12.b bVar = this.f115844a;
                objJ = f0.J(bVar, new k12.c(bVar, str3, str4, str5, null), lVar);
                if (objJ != aVar) {
                    return objJ;
                }
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str6 = lVar.f115840b;
        String str7 = lVar.f115839a;
        o13.r.b(objI);
        str2 = str6;
        str = str7;
        v2 v2Var = (v2) objI;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new v2.a(new Exception("Failed to fetch customer GUID", ((v2.a) v2Var).f47383a), null, null, 6, null);
            }
            u0.r();
            return null;
        }
        strQ2 = ((j12.l) ((v2.b) v2Var).f47386a).getGarminGUID();
        if (strQ2 == null) {
            strQ2 = "";
        }
        String str8 = str;
        String str9 = strQ2;
        String str10 = str2;
        lVar.f115839a = null;
        lVar.f115840b = null;
        lVar.f115843e = 2;
        k12.b bVar2 = this.f115844a;
        objJ = f0.J(bVar2, new k12.c(bVar2, str8, str9, str10, null), lVar);
        if (objJ != aVar) {
            return aVar;
        }
        return objJ;
    }
}
