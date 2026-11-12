package wi;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f185364a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f185365b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f185366c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f185367d;

    public class a extends j {
        @Override // wi.j
        public final boolean a() {
            return true;
        }

        @Override // wi.j
        public final boolean b() {
            return true;
        }

        @Override // wi.j
        public final boolean c(ui.a aVar) {
            return aVar == ui.a.REMOTE;
        }

        @Override // wi.j
        public final boolean d(boolean z14, ui.a aVar, ui.c cVar) {
            return (aVar == ui.a.RESOURCE_DISK_CACHE || aVar == ui.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends j {
        @Override // wi.j
        public final boolean a() {
            return false;
        }

        @Override // wi.j
        public final boolean b() {
            return false;
        }

        @Override // wi.j
        public final boolean c(ui.a aVar) {
            return false;
        }

        @Override // wi.j
        public final boolean d(boolean z14, ui.a aVar, ui.c cVar) {
            return false;
        }
    }

    public class c extends j {
        @Override // wi.j
        public final boolean a() {
            return true;
        }

        @Override // wi.j
        public final boolean b() {
            return false;
        }

        @Override // wi.j
        public final boolean c(ui.a aVar) {
            return (aVar == ui.a.DATA_DISK_CACHE || aVar == ui.a.MEMORY_CACHE) ? false : true;
        }

        @Override // wi.j
        public final boolean d(boolean z14, ui.a aVar, ui.c cVar) {
            return false;
        }
    }

    public class d extends j {
        @Override // wi.j
        public final boolean a() {
            return false;
        }

        @Override // wi.j
        public final boolean b() {
            return true;
        }

        @Override // wi.j
        public final boolean c(ui.a aVar) {
            return false;
        }

        @Override // wi.j
        public final boolean d(boolean z14, ui.a aVar, ui.c cVar) {
            return (aVar == ui.a.RESOURCE_DISK_CACHE || aVar == ui.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends j {
        @Override // wi.j
        public final boolean a() {
            return true;
        }

        @Override // wi.j
        public final boolean b() {
            return true;
        }

        @Override // wi.j
        public final boolean c(ui.a aVar) {
            return aVar == ui.a.REMOTE;
        }

        @Override // wi.j
        public final boolean d(boolean z14, ui.a aVar, ui.c cVar) {
            return ((z14 && aVar == ui.a.DATA_DISK_CACHE) || aVar == ui.a.LOCAL) && cVar == ui.c.TRANSFORMED;
        }
    }

    static {
        new d();
        f185367d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(ui.a aVar);

    public abstract boolean d(boolean z14, ui.a aVar, ui.c cVar);
}
