package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Li3/fe;", "", "<init>", "()V", "b", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f88107a = z53.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f88108b = p3.p0.n(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/fe$a;", "Li3/wd;", "Li3/te;", "visuals", "Lo53/j;", "Li3/se;", "continuation", "<init>", "(Li3/te;Lo53/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final te f88109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.j<se> f88110b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(te teVar, o53.j<? super se> jVar) {
            this.f88109a = teVar;
            this.f88110b = jVar;
        }

        @Override // i3.wd
        /* JADX INFO: renamed from: a, reason: from getter */
        public final te getF88109a() {
            return this.f88109a;
        }

        @Override // i3.wd
        public final void b() {
            o53.j<se> jVar = this.f88110b;
            if (jVar.isActive()) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(se.ActionPerformed);
            }
        }

        @Override // i3.wd
        public final void dismiss() {
            o53.j<se> jVar = this.f88110b;
            if (jVar.isActive()) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(se.Dismissed);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f88109a, aVar.f88109a) && p005kotlin.jvm.internal.s.g(this.f88110b, aVar.f88110b);
        }

        public final int hashCode() {
            return this.f88110b.hashCode() + (this.f88109a.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/fe$b;", "Li3/te;", "", "message", "actionLabel", "", "withDismissAction", "Li3/yd;", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLi3/yd;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements te {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final yd f88114d;

        public b(String str, String str2, boolean z14, yd ydVar) {
            this.f88111a = str;
            this.f88112b = str2;
            this.f88113c = z14;
            this.f88114d = ydVar;
        }

        @Override // i3.te
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF88112b() {
            return this.f88112b;
        }

        @Override // i3.te
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF88113c() {
            return this.f88113c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f88111a, bVar.f88111a) && p005kotlin.jvm.internal.s.g(this.f88112b, bVar.f88112b) && this.f88113c == bVar.f88113c && this.f88114d == bVar.f88114d;
        }

        @Override // i3.te
        /* JADX INFO: renamed from: getDuration, reason: from getter */
        public final yd getF88114d() {
            return this.f88114d;
        }

        @Override // i3.te
        /* JADX INFO: renamed from: getMessage, reason: from getter */
        public final String getF88111a() {
            return this.f88111a;
        }

        public final int hashCode() {
            int iHashCode = this.f88111a.hashCode() * 31;
            String str = this.f88112b;
            return this.f88114d.hashCode() + q6.f.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f88113c);
        }
    }

    public static Object b(fe feVar, String str, String str2, yd ydVar, t13.d dVar, int i14) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 8) != 0) {
            ydVar = str2 == null ? yd.Short : yd.Indefinite;
        }
        feVar.getClass();
        return feVar.a(new b(str, str2, false, ydVar), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(b bVar, t13.d dVar) {
        ge geVar;
        z53.a aVar;
        te teVar;
        Throwable th3;
        z53.a aVar2;
        if (dVar instanceof ge) {
            geVar = (ge) dVar;
            int i14 = geVar.f88248e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                geVar.f88248e = i14 - Integer.MIN_VALUE;
            } else {
                geVar = new ge(this, dVar);
            }
        } else {
            geVar = new ge(this, dVar);
        }
        Object obj = geVar.f88246c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = geVar.f88248e;
        p3.c2 c2Var = this.f88108b;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    geVar.f88244a = bVar;
                    aVar = this.f88107a;
                    geVar.f88245b = aVar;
                    geVar.f88248e = 1;
                    if (aVar.c(geVar) != aVar3) {
                    }
                    teVar = bVar;
                    return aVar3;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = geVar.f88245b;
                    try {
                        o13.r.b(obj);
                        c2Var.setValue(null);
                        aVar2.e(null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        c2Var.setValue(null);
                        throw th3;
                    }
                }
                z53.a aVar4 = geVar.f88245b;
                te teVar2 = geVar.f88244a;
                o13.r.b(obj);
                aVar = aVar4;
                teVar = teVar2;
                teVar = bVar;
                geVar.f88244a = teVar;
                geVar.f88245b = aVar;
                geVar.f88248e = 2;
                o53.k kVar = new o53.k(u13.f.b(geVar), 1);
                kVar.q();
                c2Var.setValue(new a(teVar, kVar));
                Object objP = kVar.p();
                if (objP != aVar3) {
                    z53.a aVar5 = aVar;
                    obj = objP;
                    aVar2 = aVar5;
                    c2Var.setValue(null);
                    aVar2.e(null);
                    return obj;
                }
                teVar = bVar;
                return aVar3;
            } catch (Throwable th5) {
                th3 = th5;
                c2Var.setValue(null);
                throw th3;
            }
        } catch (Throwable th6) {
            bVar.e(null);
            throw th6;
        }
    }
}
