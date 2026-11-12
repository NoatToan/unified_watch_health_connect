package jb;

import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.w;
import bb.f0;
import bb.g0;
import bb.i;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.k;
import fa.r;
import j20.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import vb.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f98078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98081e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qb.a f98083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f98084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f98085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f98086j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f98077a = new r(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f98082f = -1;

    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        String strP;
        c cVarA;
        qb.a aVar;
        long j8;
        int i14 = this.f98079c;
        long j14 = -1;
        r rVar = this.f98077a;
        if (i14 == 0) {
            rVar.D(2);
            oVar.readFully(rVar.f70054a, 0, 2);
            int iA = rVar.A();
            this.f98080d = iA;
            if (iA == 65498) {
                if (this.f98082f != -1) {
                    this.f98079c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((iA < 65488 || iA > 65497) && iA != 65281) {
                this.f98079c = 1;
            }
            return 0;
        }
        if (i14 == 1) {
            rVar.D(2);
            oVar.readFully(rVar.f70054a, 0, 2);
            this.f98081e = rVar.A() - 2;
            this.f98079c = 2;
            return 0;
        }
        if (i14 != 2) {
            if (i14 != 4) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        return -1;
                    }
                    x.h();
                    return 0;
                }
                if (this.f98085i == null || oVar != this.f98084h) {
                    this.f98084h = oVar;
                    this.f98085i = new d(oVar, this.f98082f);
                }
                j jVar = this.f98086j;
                jVar.getClass();
                int iB = jVar.b(this.f98085i, f0Var);
                if (iB == 1) {
                    f0Var.f17167a += this.f98082f;
                }
                return iB;
            }
            long position = oVar.getPosition();
            long j15 = this.f98082f;
            if (position != j15) {
                f0Var.f17167a = j15;
                return 1;
            }
            if (!oVar.peekFully(rVar.f70054a, 0, 1, true)) {
                f();
                return 0;
            }
            oVar.resetPeekPosition();
            if (this.f98086j == null) {
                this.f98086j = new j(yb.n.a.f195662a, 8);
            }
            d dVar = new d(oVar, this.f98082f);
            this.f98085i = dVar;
            if (!this.f98086j.d(dVar)) {
                f();
                return 0;
            }
            j jVar2 = this.f98086j;
            long j16 = this.f98082f;
            p pVar = this.f98078b;
            pVar.getClass();
            jVar2.c(new e(j16, pVar));
            qb.a aVar2 = this.f98083g;
            aVar2.getClass();
            p pVar2 = this.f98078b;
            pVar2.getClass();
            l0 l0VarTrack = pVar2.track(1024, 4);
            q.b bVar = new q.b();
            bVar.f8410l = androidx.media3.common.x.n(MimeTypes.IMAGE_JPEG);
            bVar.f8409k = new w(aVar2);
            l0VarTrack.d(bVar.a());
            this.f98079c = 5;
            return 0;
        }
        if (this.f98080d == 65505) {
            r rVar2 = new r(this.f98081e);
            oVar.readFully(rVar2.f70054a, 0, this.f98081e);
            if (this.f98083g == null && "http://ns.adobe.com/xap/1.0/".equals(rVar2.p()) && (strP = rVar2.p()) != null) {
                long length = oVar.getLength();
                if (length == -1) {
                    aVar = null;
                } else {
                    try {
                        cVarA = f.a(strP);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        k.g("Ignoring unexpected XMP metadata");
                        cVarA = null;
                    }
                    if (cVarA == null) {
                        aVar = null;
                    } else {
                        List<c.a> list = cVarA.f98088b;
                        if (list.size() < 2) {
                            aVar = null;
                        } else {
                            int size = list.size() - 1;
                            long j17 = -1;
                            long j18 = -1;
                            long j19 = -1;
                            long j24 = -1;
                            boolean z14 = false;
                            while (size >= 0) {
                                c.a aVar3 = list.get(size);
                                long j25 = j14;
                                boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar3.f98089a) | z14;
                                if (size == 0) {
                                    length -= aVar3.f98091c;
                                    j8 = 0;
                                } else {
                                    j8 = length - aVar3.f98090b;
                                }
                                long j26 = length;
                                length = j8;
                                if (!zEquals || length == j26) {
                                    z14 = zEquals;
                                } else {
                                    j24 = j26 - length;
                                    j19 = length;
                                    z14 = false;
                                }
                                if (size == 0) {
                                    j18 = j26;
                                    j17 = length;
                                }
                                size--;
                                j14 = j25;
                            }
                            long j27 = j14;
                            if (j19 == j27 || j24 == j27 || j17 == j27 || j18 == j27) {
                                aVar = null;
                            } else {
                                aVar = new qb.a(j17, j18, cVarA.f98087a, j19, j24);
                            }
                        }
                    }
                }
                this.f98083g = aVar;
                if (aVar != null) {
                    this.f98082f = aVar.f143946d;
                }
            }
        } else {
            oVar.skipFully(this.f98081e);
        }
        this.f98079c = 0;
        return 0;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f98078b = pVar;
    }

    @Override // bb.n
    public final boolean d(o oVar) throws EOFException, InterruptedIOException {
        i iVar = (i) oVar;
        r rVar = this.f98077a;
        rVar.D(2);
        iVar.peekFully(rVar.f70054a, 0, 2, false);
        if (rVar.A() == 65496) {
            rVar.D(2);
            iVar.peekFully(rVar.f70054a, 0, 2, false);
            int iA = rVar.A();
            this.f98080d = iA;
            if (iA == 65504) {
                rVar.D(2);
                iVar.peekFully(rVar.f70054a, 0, 2, false);
                iVar.advancePeekPosition(rVar.A() - 2, false);
                rVar.D(2);
                iVar.peekFully(rVar.f70054a, 0, 2, false);
                this.f98080d = rVar.A();
            }
            if (this.f98080d == 65505) {
                iVar.advancePeekPosition(2, false);
                rVar.D(6);
                iVar.peekFully(rVar.f70054a, 0, 6, false);
                if (rVar.w() == 1165519206 && rVar.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        p pVar = this.f98078b;
        pVar.getClass();
        pVar.endTracks();
        this.f98078b.a(new g0.b(C.TIME_UNSET));
        this.f98079c = 6;
    }

    @Override // bb.n
    public final void release() {
        j jVar = this.f98086j;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        if (j8 == 0) {
            this.f98079c = 0;
            this.f98086j = null;
        } else if (this.f98079c == 5) {
            j jVar = this.f98086j;
            jVar.getClass();
            jVar.seek(j8, j14);
        }
    }
}
