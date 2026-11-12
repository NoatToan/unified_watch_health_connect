package au0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau0/y;", "Lau0/x;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f13000a;

    static {
        new a(null);
    }

    public y(f12.l lVar) {
        lVar.getClass();
        this.f13000a = lVar;
    }

    @Override // au0.x
    public final void a(int i14) {
        this.f13000a.u2(i14, "max_live_activity_version");
    }

    @Override // au0.x
    public final int b() {
        return this.f13000a.i2(0, "max_live_activity_version");
    }

    @Override // au0.x
    public final void c(boolean z14) {
        this.f13000a.O2("locked_in_activity_recording", z14);
    }

    @Override // au0.x
    public final boolean d() {
        return this.f13000a.W2("locked_in_activity_recording", false);
    }

    @Override // au0.x
    public final void e(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(entry.getKey() + ":" + ((jg2.d) entry.getValue()).f98736a + ":" + ((jg2.d) entry.getValue()).f98737b.f196898a);
        }
        this.f13000a.X1("value_estimation_sessions", p13.h0.g1(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    @Override // au0.x
    public final Map<Long, jg2.d> f() {
        o13.p pVar;
        Long lJ;
        Set<String> setD0 = this.f13000a.D0("value_estimation_sessions", null);
        if (setD0 == null) {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setD0.iterator();
        while (it.hasNext()) {
            List listX = d53.w.X((String) it.next(), new char[]{CoreConstants.COLON_CHAR});
            if (listX.size() != 3) {
                listX = null;
            }
            if (listX == null || (lJ = d53.t.j((String) listX.get(0))) == null) {
                pVar = null;
            } else {
                try {
                    UUID uuidFromString = UUID.fromString((String) listX.get(1));
                    String str = (String) p13.h0.e0(2, listX);
                    if (str != null) {
                        yf2.a.f196894b.getClass();
                        yf2.a aVarA = yf2.a.C3687a.a(str);
                        if (aVarA == null) {
                            pVar = null;
                        } else {
                            uuidFromString.getClass();
                            pVar = new o13.p(lJ, new jg2.d(uuidFromString, aVarA));
                        }
                    } else {
                        pVar = null;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return u0.l(arrayList);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lau0/y$a;", "", "<init>", "()V", "", "LOCKED_IN_ACTIVITY_RECORDING_KEY", "Ljava/lang/String;", "MAX_LIVE_ACTIVITY_VERSION_KEY", "VALUE_ESTIMATION_SESSIONS_KEY", "", "SESSION_FORMAT_DELIMITER", "C", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
