package fc1;

import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n70.a0;
import o13.p;
import o53.s0;
import o70.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.u0;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\fB+\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfc1/b;", "Ln70/a0;", "Lr53/i;", "Lfc1/h;", "Lj70/d;", "", "", "data", "Lae0/b;", "userSummariesUseCase", "<init>", "(Lr53/i;Lae0/b;)V", "a", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<r53.i<? extends h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<List<String>>> f70398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f70399b;

    /* JADX INFO: renamed from: fc1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1442b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70400a;

        static {
            int[] iArr = new int[t.b.values().length];
            try {
                iArr[t.b.f130089d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.f130090e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70400a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(r53.i<j70.d<List<String>>> iVar, ae0.b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.f70398a = iVar;
        this.f70399b = bVar;
    }

    public static final i53.g c(b bVar, List list, String str) {
        p pVar;
        bVar.getClass();
        DateTime dateTimeQ = k.q(str, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
        if (list == null) {
            return i53.a.c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            DateTime dateTime = new DateTime((Long) h0.d0(list2), DateTimeZone.UTC);
            Long l14 = (Long) h0.n0(list2);
            if (l14 != null) {
                pVar = new p(Float.valueOf(Hours.hoursBetween(dateTimeQ, dateTime).getHours()), Float.valueOf(l14.longValue()));
            } else {
                pVar = null;
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return i53.a.k(u0.l(arrayList));
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetPulseOxDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends h> invoke() {
        return s.A(new c(this.f70398a, this), s0.f129406a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfc1/b$a;", "", "<init>", "()V", "", "MINUTES_BETWEEN_TIMESTAMPS", "I", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
