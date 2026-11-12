package ji2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji2/a;", "Lji2/h;", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(Lli2/d;Lli2/a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hi2.d f98827d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li2.a f98828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi2.b f98829c;

    static {
        new C1903a(null);
        f98827d = new hi2.d("DSL-ControlsResetDataLoader", null, 2, null);
    }

    public a(li2.d dVar, li2.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f98828b = aVar;
        this.f98829c = mi2.b.f118988b.a(dVar);
    }

    @Override // ji2.h
    public final void a(ni2.c cVar, li2.b bVar) {
        f98827d.b("saveData: Should not be here for save.");
    }

    @Override // ji2.h
    public final void b(String str, ai2.e.a aVar) {
        try {
            mi2.b bVar = this.f98829c;
            bVar.f118990a.d(this.f98828b.f112900a).q0(new b(aVar, this, str));
        } catch (Exception unused) {
            f98827d.b("onDataLoaded: Exception");
            aVar.b(null, new Exception("No data"));
        }
    }

    /* JADX INFO: renamed from: ji2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lji2/a$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1903a {
        public /* synthetic */ C1903a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1903a() {
        }
    }
}
