package tn2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ltn2/d0;", "Lms2/d;", "Lis2/b;", "serviceProviderType", "Lhs2/d;", "device", "Ltn2/w0;", "userProvider", "Lhs2/a;", TtmlNode.TAG_METADATA, "<init>", "(Lis2/b;Lhs2/d;Ltn2/w0;Lhs2/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements ms2.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f165539f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f165540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f165541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hs2.a f165542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f165543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f165544e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.felica.FelicaDeviceServiceProvider$deleteCachedData$1", f = "FelicaDeviceServiceProvider.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f165545a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f165545a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    e13.j jVarA = d0.this.f165543d.f165644m.a(true);
                    this.f165545a = 1;
                    if (w2.a0.f(jVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (Throwable th3) {
                d0.f165539f.warn("Error during sync for Suica", th3);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f165539f = gt2.b.f79005a.h("PAY#FN#FelicaDeviceServiceProvider");
    }

    public d0(is2.b bVar, hs2.d dVar, w0 w0Var, hs2.a aVar) {
        bVar.getClass();
        dVar.getClass();
        w0Var.getClass();
        aVar.getClass();
        this.f165540a = bVar;
        this.f165541b = dVar;
        this.f165542c = aVar;
        w wVar = new w(dVar, this.f165542c);
        this.f165544e = wVar;
        this.f165543d = new r0(wVar, null, null, null, null, 30, null);
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF133307a() {
        return this.f165540a;
    }

    @Override // ms2.d
    public final void b() {
        this.f165543d.f165644m.a(true).j(l13.a.f108327b).h(w03.a.f181172c, w03.a.f181173d);
    }

    @Override // ms2.d
    public final void c(js2.b bVar, cs2.a<Boolean> aVar) {
        bVar.getClass();
        aVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void e() {
        this.f165543d.f165644m.a(true).j(l13.a.f108327b).h(w03.a.f181172c, w03.a.f181173d);
    }

    @Override // ms2.d
    public final void g() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(null), 3);
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final hs2.d getF133308b() {
        return this.f165541b;
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final hs2.a getF133309c() {
        return this.f165542c;
    }

    @Override // ms2.d
    public final void h(ps2.b bVar) {
        bVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void i(ps2.b bVar) {
        bVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void k(hs2.a aVar) {
        aVar.getClass();
        this.f165542c = aVar;
    }

    @Override // ms2.d
    public final void l() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltn2/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
