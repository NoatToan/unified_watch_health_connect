package hq2;

import android.annotation.SuppressLint;
import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Optional;
import hq.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;
import p13.u;
import p13.x;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u0005:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lhq2/r;", "Lms2/d;", "Las2/i;", "", "Las2/j;", "Las2/h;", "Lhs2/d;", "device", "Lms2/g;", "userProvider", "Lhs2/a;", TtmlNode.TAG_METADATA, "<init>", "(Lhs2/d;Lms2/g;Lhs2/a;)V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class r extends as2.h implements ms2.d, as2.i<Short>, as2.j<Short> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f85270f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.d f85271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms2.g f85272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hs2.a f85273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es2.a f85274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public as2.f<Short> f85275e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhq2/r$b;", "", "", "header", "payload", "<init>", "([B[B)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f85276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f85277b;

        public b(byte[] bArr, byte[] bArr2) {
            bArr.getClass();
            bArr2.getClass();
            this.f85276a = bArr;
            this.f85277b = bArr2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f85276a.equals(bVar.f85276a) && this.f85277b.equals(bVar.f85277b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f85277b) + (Arrays.hashCode(this.f85276a) * 31);
        }

        public final String toString() {
            return e0.g("PreloadCardPacket(header=", Arrays.toString(this.f85276a), ", payload=", Arrays.toString(this.f85277b), ")");
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f85270f = gt2.b.f79005a.h("PAY#PR#PreloadTransitDeviceService");
    }

    public r(hs2.d dVar, ms2.g gVar, hs2.a aVar) {
        dVar.getClass();
        gVar.getClass();
        aVar.getClass();
        this.f85271a = dVar;
        this.f85272b = gVar;
        this.f85273c = aVar;
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        this.f85274d = GarminPayCoreDatabase.b.a(contextC).e();
    }

    public static short s(byte[] bArr) {
        bArr.getClass();
        return ByteBuffer.wrap(v(bArr).f85277b).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    public static ArrayList t(byte[] bArr, iq2.d dVar) {
        bArr.getClass();
        byte[] bArr2 = v(bArr).f85277b;
        List listK = x.k(u.W(bArr2, new j23.l(0, 15)), u.W(bArr2, new j23.l(16, 31)), u.W(bArr2, new j23.l(32, 47)));
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            iq2.c cVarA = dVar.a((byte[]) it.next());
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    public static b v(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = new byte[bArr.length - 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).get(bArr2).get(bArr3);
        return new b(bArr2, bArr3);
    }

    @Override // ms2.d
    public final void b() {
        u().j(l13.a.f108327b).h(w03.a.f181172c, w03.a.f181173d);
    }

    @Override // ms2.d
    public final void c(js2.b bVar, cs2.a<Boolean> aVar) {
        bVar.getClass();
        this.f85275e = new as2.f<>(this, this);
        aVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    @SuppressLint({"CheckResult"})
    public final void e() {
        f85270f.debug("deviceWalletReady");
        u().j(l13.a.f108327b).h(w03.a.f181172c, w03.a.f181173d);
    }

    @Override // as2.i
    public final void f(String str, as2.b<Short> bVar) {
        str.getClass();
        String strName = getF205815a().name();
        long f99647a = this.f85271a.getF99647a();
        es2.a aVar = this.f85274d;
        fs2.a aVar2 = (fs2.a) h0.d0(aVar.j(f99647a, strName));
        q qVar = aVar2 != null ? (q) fs2.a.f(aVar2, q.class) : null;
        if (qVar != null) {
            fs2.a.k(aVar2, new q(qVar.getPurseId(), bVar, qVar.getLastTopUpRecord(), qVar.d()));
            aVar.d(aVar2);
        }
    }

    @Override // ms2.d
    public final void g() {
    }

    @Override // as2.i
    public final Optional<as2.b<Short>> getBy(String str) {
        str.getClass();
        fs2.a aVar = (fs2.a) h0.d0(this.f85274d.j(this.f85271a.getF99647a(), getF205815a().name()));
        q qVar = aVar != null ? (q) fs2.a.f(aVar, q.class) : null;
        Optional<as2.b<Short>> optionalFromNullable = Optional.fromNullable(qVar != null ? qVar.a() : null);
        optionalFromNullable.getClass();
        return optionalFromNullable;
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final hs2.d getF85271a() {
        return this.f85271a;
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final hs2.a getF85273c() {
        return this.f85273c;
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
        this.f85273c = aVar;
    }

    @Override // ms2.d
    public final void l() {
    }

    public abstract qs2.a o();

    public abstract int p();

    public abstract byte[] q();

    public abstract e13.j r();

    public final e13.j u() {
        a73.h hVar = new a73.h(this, 6);
        int i14 = w03.b.f181178a;
        return new e13.j(new e13.o(new e13.b(hVar).g(l13.a.f108328c), new gw.j(new f0(15), 29)), new gw.j(new ho0.g(this, 5), 27));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhq2/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
