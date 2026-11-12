package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ibi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f20974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gbi f20975b;
    public final ekg c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final scp g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y5d f20976k;
    public dbi<w14<u14>> l;
    public dbi<o98> m;
    public dbi<o98> n;
    public dbi<Void> o;
    public dbi<Void> p;
    public dbi<o98> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public dbi<w14<u14>> f20977r;
    public dbi<w14<u14>> s;
    public dbi<w14<u14>> t;
    public dbi<w14<u14>> u;
    public dbi<w14<u14>> v;
    public dbi<w14<u14>> w;
    public dbi<w14<u14>> x;
    public Map<dbi<w14<u14>>, dbi<w14<u14>>> y = new HashMap();
    public Map<dbi<w14<u14>>, dbi<Void>> z = new HashMap();
    public Map<dbi<w14<u14>>, dbi<w14<u14>>> A = new HashMap();

    public ibi(ContentResolver contentResolver, gbi gbiVar, ekg ekgVar, boolean z, boolean z2, scp scpVar, boolean z3, boolean z4, boolean z5, boolean z6, y5d y5dVar) {
        this.f20974a = contentResolver;
        this.f20975b = gbiVar;
        this.c = ekgVar;
        this.d = z;
        this.e = z2;
        this.g = scpVar;
        this.h = z3;
        this.i = z4;
        this.f = z5;
        this.j = z6;
        this.f20976k = y5dVar;
    }

    public static void B(ImageRequest imageRequest) {
        b6i.g(imageRequest);
        b6i.b(imageRequest.f().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue());
    }

    public static String s(Uri uri) {
        String strValueOf = String.valueOf(uri);
        if (strValueOf.length() <= 30) {
            return strValueOf;
        }
        return strValueOf.substring(0, 30) + "...";
    }

    public final dbi<o98> A(dbi<o98> dbiVar, zdp<o98>[] zdpVarArr) {
        return gbi.g(z(zdpVarArr), this.f20975b.B(this.f20975b.z(gbi.a(dbiVar), true, this.f20976k)));
    }

    public final synchronized dbi<o98> a() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
            }
            if (this.m == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
                }
                this.m = this.f20975b.b(y(this.f20975b.r()), this.g);
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final synchronized dbi<o98> b() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
            }
            if (this.n == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
                }
                this.n = this.f20975b.b(e(), this.g);
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.n;
    }

    public final dbi<w14<u14>> c(ImageRequest imageRequest) {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            b6i.g(imageRequest);
            Uri uriQ = imageRequest.q();
            b6i.h(uriQ, "Uri is null.");
            int iR = imageRequest.r();
            if (iR == 0) {
                dbi<w14<u14>> dbiVarO = o();
                if (epa.d()) {
                    epa.b();
                }
                return dbiVarO;
            }
            switch (iR) {
                case 2:
                    dbi<w14<u14>> dbiVarN = n();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarN;
                case 3:
                    dbi<w14<u14>> dbiVarL = l();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarL;
                case 4:
                    if (fmf.c(this.f20974a.getType(uriQ))) {
                        dbi<w14<u14>> dbiVarN2 = n();
                        if (epa.d()) {
                            epa.b();
                        }
                        return dbiVarN2;
                    }
                    dbi<w14<u14>> dbiVarJ = j();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarJ;
                case 5:
                    dbi<w14<u14>> dbiVarI = i();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarI;
                case 6:
                    dbi<w14<u14>> dbiVarM = m();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarM;
                case 7:
                    dbi<w14<u14>> dbiVarF = f();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarF;
                case 8:
                    dbi<w14<u14>> dbiVarR = r();
                    if (epa.d()) {
                        epa.b();
                    }
                    return dbiVarR;
                default:
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + s(uriQ));
            }
        } catch (Throwable th) {
            if (epa.d()) {
                epa.b();
            }
            throw th;
        }
    }

    public final synchronized dbi<w14<u14>> d(dbi<w14<u14>> dbiVar) {
        dbi<w14<u14>> dbiVarF;
        dbiVarF = this.A.get(dbiVar);
        if (dbiVarF == null) {
            dbiVarF = this.f20975b.f(dbiVar);
            this.A.put(dbiVar, dbiVarF);
        }
        return dbiVarF;
    }

    public final synchronized dbi<o98> e() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
            }
            if (this.q == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
                }
                bt0 bt0VarA = gbi.a(y(this.f20975b.u(this.c)));
                this.q = bt0VarA;
                this.q = this.f20975b.z(bt0VarA, this.d && !this.h, this.f20976k);
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.q;
    }

    public final synchronized dbi<w14<u14>> f() {
        try {
            if (this.w == null) {
                dbi<o98> dbiVarH = this.f20975b.h();
                if (icr.f21006a && (!this.e || icr.d == null)) {
                    dbiVarH = this.f20975b.D(dbiVarH);
                }
                this.w = u(this.f20975b.z(gbi.a(dbiVarH), true, this.f20976k));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.w;
    }

    public dbi<w14<u14>> g(ImageRequest imageRequest) {
        if (epa.d()) {
            epa.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        dbi<w14<u14>> dbiVarC = c(imageRequest);
        if (imageRequest.g() != null) {
            dbiVarC = q(dbiVarC);
        }
        if (this.i) {
            dbiVarC = d(dbiVarC);
        }
        if (epa.d()) {
            epa.b();
        }
        return dbiVarC;
    }

    public dbi<Void> h(ImageRequest imageRequest) {
        B(imageRequest);
        int iR = imageRequest.r();
        if (iR == 0) {
            return p();
        }
        if (iR == 2 || iR == 3) {
            return k();
        }
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + s(imageRequest.q()));
    }

    public final synchronized dbi<w14<u14>> i() {
        try {
            if (this.v == null) {
                this.v = v(this.f20975b.n());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.v;
    }

    public final synchronized dbi<w14<u14>> j() {
        try {
            if (this.t == null) {
                this.t = w(this.f20975b.o(), new zdp[]{this.f20975b.p(), this.f20975b.q()});
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.t;
    }

    public final synchronized dbi<Void> k() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
            }
            if (this.o == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
                }
                this.o = gbi.A(a());
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.o;
    }

    public final synchronized dbi<w14<u14>> l() {
        try {
            if (this.f20977r == null) {
                this.f20977r = v(this.f20975b.r());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20977r;
    }

    public final synchronized dbi<w14<u14>> m() {
        try {
            if (this.u == null) {
                this.u = v(this.f20975b.s());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.u;
    }

    public final synchronized dbi<w14<u14>> n() {
        try {
            if (this.s == null) {
                this.s = t(this.f20975b.t());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.s;
    }

    public final synchronized dbi<w14<u14>> o() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getNetworkFetchSequence");
            }
            if (this.l == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
                }
                this.l = u(e());
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public final synchronized dbi<Void> p() {
        try {
            if (epa.d()) {
                epa.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
            }
            if (this.p == null) {
                if (epa.d()) {
                    epa.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
                }
                this.p = gbi.A(b());
                if (epa.d()) {
                    epa.b();
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final synchronized dbi<w14<u14>> q(dbi<w14<u14>> dbiVar) {
        try {
            if (!this.y.containsKey(dbiVar)) {
                this.y.put(dbiVar, this.f20975b.w(this.f20975b.x(dbiVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.y.get(dbiVar);
    }

    public final synchronized dbi<w14<u14>> r() {
        try {
            if (this.x == null) {
                this.x = v(this.f20975b.y());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.x;
    }

    public final dbi<w14<u14>> t(dbi<w14<u14>> dbiVar) {
        return this.f20975b.c(this.f20975b.b(this.f20975b.d(this.f20975b.e(dbiVar)), this.g));
    }

    public final dbi<w14<u14>> u(dbi<o98> dbiVar) {
        if (epa.d()) {
            epa.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        dbi<w14<u14>> dbiVarT = t(this.f20975b.i(dbiVar));
        if (epa.d()) {
            epa.b();
        }
        return dbiVarT;
    }

    public final dbi<w14<u14>> v(dbi<o98> dbiVar) {
        return w(dbiVar, new zdp[]{this.f20975b.q()});
    }

    public final dbi<w14<u14>> w(dbi<o98> dbiVar, zdp<o98>[] zdpVarArr) {
        return u(A(y(dbiVar), zdpVarArr));
    }

    public final dbi<o98> x(dbi<o98> dbiVar) {
        ly6 ly6VarK;
        if (epa.d()) {
            epa.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f) {
            ly6VarK = this.f20975b.k(this.f20975b.v(dbiVar));
        } else {
            ly6VarK = this.f20975b.k(dbiVar);
        }
        iy6 iy6VarJ = this.f20975b.j(ly6VarK);
        if (epa.d()) {
            epa.b();
        }
        return iy6VarJ;
    }

    public final dbi<o98> y(dbi<o98> dbiVar) {
        if (icr.f21006a && (!this.e || icr.d == null)) {
            dbiVar = this.f20975b.D(dbiVar);
        }
        if (this.j) {
            dbiVar = x(dbiVar);
        }
        return this.f20975b.l(this.f20975b.m(dbiVar));
    }

    public final dbi<o98> z(zdp<o98>[] zdpVarArr) {
        return this.f20975b.z(this.f20975b.C(zdpVarArr), true, this.f20976k);
    }
}
