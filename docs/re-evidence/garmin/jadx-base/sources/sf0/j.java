package sf0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.LinkedHashMap;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsf0/j;", "Landroidx/lifecycle/u1;", "Lvf0/a;", "repository", "<init>", "(Lvf0/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f158858c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf0.a f158859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f158860b;

    static {
        new a(null);
    }

    public j(vf0.a aVar) {
        aVar.getClass();
        this.f158859a = aVar;
        this.f158860b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(j jVar, String str, String str2, v13.c cVar) {
        k kVar;
        jVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f158864d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f158864d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(jVar, cVar);
            }
        } else {
            kVar = new k(jVar, cVar);
        }
        Object objJ = kVar.f158862b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f158864d;
        if (i15 == 0) {
            r.b(objJ);
            jVar.y4(str).m(i.c.f158853a);
            vf0.a aVar2 = jVar.f158859a;
            kVar.f158861a = str;
            kVar.f158864d = 1;
            aVar2.getClass();
            objJ = f0.J(aVar2, new vf0.b(aVar2, str, str2, null), kVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = kVar.f158861a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            uf0.b bVar = (uf0.b) ((v2.b) v2Var).f47386a;
            y0<i> y0VarY4 = jVar.y4(str);
            String status = bVar != null ? bVar.getStatus() : null;
            if (status == null) {
                y0VarY4.m(new i.e(bVar, true));
            } else {
                int iHashCode = status.hashCode();
                if (iHashCode != 66247144) {
                    if (iHashCode != 183181625) {
                        if (iHashCode == 1485840007 && status.equals("PAT_VERIFICATION_REQUIRED")) {
                            y0VarY4.m(new i.f(bVar.a()));
                        } else {
                            y0VarY4.m(new i.e(bVar, true));
                        }
                    } else if (status.equals("COMPLETE")) {
                        y0VarY4.m(new i.a(true));
                    } else {
                        y0VarY4.m(new i.e(bVar, true));
                    }
                } else if (status.equals("ERROR")) {
                    y0VarY4.m(i.b.f158852a);
                } else {
                    y0VarY4.m(new i.e(bVar, true));
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            jVar.y4(str).m(i.b.f158852a);
        }
        return Unit.INSTANCE;
    }

    public final y0<i> y4(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.f158860b;
        Object y0Var = linkedHashMap.get(str);
        if (y0Var == null) {
            y0Var = new y0();
            linkedHashMap.put(str, y0Var);
        }
        y0<i> y0Var2 = (y0) y0Var;
        i iVarD = y0Var2.d();
        if (iVarD == null) {
            y0Var2.m(i.d.f158854a);
            return y0Var2;
        }
        if (iVarD instanceof i.a) {
            ((i.a) iVarD).f158851a = false;
            return y0Var2;
        }
        if (iVarD instanceof i.e) {
            ((i.e) iVarD).f158856b = false;
            return y0Var2;
        }
        iVarD.toString();
        return y0Var2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf0/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
