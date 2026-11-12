package oq2;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Loq2/c;", "Lms2/d;", "Lis2/b;", "serviceProviderType", "Lhs2/d;", "device", "Loq2/f;", "userProvider", "Lhs2/a;", TtmlNode.TAG_METADATA, "Les2/a;", "walletItemsDAO", "<init>", "(Lis2/b;Lhs2/d;Loq2/f;Lhs2/a;Les2/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements ms2.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f133306g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f133307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f133308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hs2.a f133309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es2.a f133310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u53.d f133311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.device.nfc.b f133312f;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f133306g = gt2.b.f79005a.h("RabbitDeviceServiceProvider");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(is2.b bVar, hs2.d dVar, f fVar, hs2.a aVar, es2.a aVar2, int i14, j jVar) {
        if ((i14 & 16) != 0) {
            GarminPayCoreDatabase.b bVar2 = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar2.getClass();
            aVar2 = GarminPayCoreDatabase.b.a(contextC).e();
        }
        this(bVar, dVar, fVar, aVar, aVar2);
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF205815a() {
        return this.f133307a;
    }

    @Override // ms2.d
    public final void b() {
        u53.d dVar = this.f133311e;
        if (dVar != null) {
            gl.b.I(dVar, null, new d(this, null), 3);
        } else {
            s.m(Action.SCOPE_ATTRIBUTE);
            throw null;
        }
    }

    @Override // ms2.d
    public final void c(js2.b bVar, cs2.a<Boolean> aVar) {
        bVar.getClass();
        this.f133311e = c0.a(s0.f129406a);
        aVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void e() {
        u53.d dVar = this.f133311e;
        if (dVar != null) {
            gl.b.I(dVar, null, new d(this, null), 3);
        } else {
            s.m(Action.SCOPE_ATTRIBUTE);
            throw null;
        }
    }

    @Override // ms2.d
    public final void g() {
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final hs2.d getF85271a() {
        return this.f133308b;
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final hs2.a getF85273c() {
        return this.f133309c;
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
    public final void j(w.a aVar) {
        u53.d dVar = this.f133311e;
        if (dVar != null) {
            c0.c(dVar, null);
        } else {
            s.m(Action.SCOPE_ATTRIBUTE);
            throw null;
        }
    }

    @Override // ms2.d
    public final void k(hs2.a aVar) {
        aVar.getClass();
        this.f133309c = aVar;
    }

    @Override // ms2.d
    public final void l() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loq2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(is2.b bVar, hs2.d dVar, f fVar, hs2.a aVar, es2.a aVar2) {
        bVar.getClass();
        dVar.getClass();
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f133307a = bVar;
        this.f133308b = dVar;
        this.f133309c = aVar;
        this.f133310d = aVar2;
    }
}
