package w43;

import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181988a;

    public static final class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f181989b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i14) {
            StringBuilder sbI = b71.i.i(i14, "must have at least ", " value parameter");
            sbI.append(i14 > 1 ? "s" : "");
            super(sbI.toString(), null);
            this.f181989b = i14;
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return eVar.f().size() >= this.f181989b;
        }
    }

    public static final class b extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f181990b;

        public b(int i14) {
            super(e0.f(i14, "must have exactly ", " value parameters"), null);
            this.f181990b = i14;
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return eVar.f().size() == this.f181990b;
        }
    }

    public static final class c extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f181991b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return eVar.f().isEmpty();
        }
    }

    public static final class d extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f181992b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return eVar.f().size() == 1;
        }
    }

    private a0(String str) {
        this.f181988a = str;
    }

    @Override // w43.f
    public final /* bridge */ String b(j33.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // w43.f
    public final String getDescription() {
        return this.f181988a;
    }

    public /* synthetic */ a0(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
