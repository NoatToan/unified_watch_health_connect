package gy0;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgy0/o;", "Lgy0/n;", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f80203b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f80204a = o13.m.b(new go1.j(12));

    static {
        new a(null);
    }

    @Override // gy0.n
    public final String a(String str) {
        Map map;
        str.getClass();
        String strA4 = ((f12.l) this.f80204a.getValue()).A4("epicReportsConfig", null);
        if (strA4 == null || strA4.length() == 0) {
            map = null;
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            m63.y1 y1Var = m63.y1.f117048a;
            map = (Map) aVar.c(j63.a.d(new m63.q0(y1Var, y1Var)), strA4);
        }
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    @Override // gy0.n
    public final void b(String str, String str2) {
        Map linkedHashMap;
        str.getClass();
        o13.t tVar = this.f80204a;
        String strA4 = ((f12.l) tVar.getValue()).A4("epicReportsConfig", null);
        if (strA4 == null || strA4.length() == 0) {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            linkedHashMap = new LinkedHashMap(k0Var);
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            m63.y1 y1Var = m63.y1.f117048a;
            linkedHashMap = (Map) aVar.c(new m63.q0(y1Var, y1Var), strA4);
        }
        linkedHashMap.put(str, str2);
        f12.l lVar = (f12.l) tVar.getValue();
        n63.b.a aVar2 = n63.b.f123892d;
        aVar2.getClass();
        m63.y1 y1Var2 = m63.y1.f117048a;
        lVar.S("epicReportsConfig", aVar2.b(new m63.q0(y1Var2, y1Var2), linkedHashMap));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/o$a;", "", "<init>", "()V", "", "USER_EPIC_REPORTS_CONFIG", "Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
