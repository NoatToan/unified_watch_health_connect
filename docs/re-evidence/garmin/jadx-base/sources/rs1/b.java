package rs1;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import pi0.e;
import qs1.t;
import rk0.n;
import v13.c;
import vb.h;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrs1/b;", "Lyc/h3;", "Lqs1/t;", "Lkt1/b;", "Lss1/a;", "trailsRepo", "Lpi0/e;", "gcmDateTimeFormatter", "", "curatedCourseId", "", "pageSize", "initialLoadSize", "Lkotlin/Function1;", "", "onImagesCountFetched", "<init>", "(Lss1/a;Lpi0/e;JIILe23/l;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h3<t, kt1.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1.a f154349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f154350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f154351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f154352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Integer, Unit> f154353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f154354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f154355h;

    public /* synthetic */ b(ss1.a aVar, e eVar, long j8, int i14, int i15, l lVar, int i16, j jVar) {
        this(aVar, eVar, j8, (i16 & 8) != 0 ? 5 : i14, (i16 & 16) != 0 ? 10 : i15, (i16 & 32) != 0 ? new n(20) : lVar);
    }

    @Override // yc.h3
    public final t c(i3<t, kt1.b> i3Var) {
        Integer num = i3Var.f196062b;
        if (num == null) {
            return null;
        }
        h3.b.c<t, kt1.b> cVarA = i3Var.a(num.intValue());
        t tVar = cVarA != null ? cVarA.f196017b : null;
        t tVar2 = this.f154355h;
        boolean zG = s.g(tVar, tVar2);
        int i14 = this.f154352e;
        if (!zG) {
            return tVar == null ? tVar2 : new t(tVar.f147345a + i14, tVar.f147346b + i14);
        }
        int i15 = tVar.f147346b;
        return new t(i15, i14 + i15);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // yc.h3
    public final Object e(h3.a aVar, c cVar) {
        a aVar2;
        t tVar;
        Throwable iOException;
        Exception exc;
        ?? arrayList;
        t tVar2;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f154348d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f154348d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        a aVar3 = aVar2;
        Object obj = aVar3.f154346b;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar3.f154348d;
        t tVar3 = this.f154355h;
        if (i15 == 0) {
            r.b(obj);
            t tVar4 = (t) aVar.a();
            if (tVar4 == null) {
                tVar4 = tVar3;
            }
            int i16 = tVar4.f147345a;
            int i17 = tVar4.f147346b;
            aVar3.f154345a = tVar4;
            aVar3.f154348d = 1;
            Object objZ = this.f154349b.z(this.f154351d, i16, i17, aVar3);
            if (objZ == aVar4) {
                return aVar4;
            }
            tVar = tVar4;
            obj = objZ;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tVar = aVar3.f154345a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        tVar = null;
        t tVar5 = null;
        if (!(v2Var instanceof v2.b)) {
            v2.a aVar5 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
            if (aVar5 == null || (exc = aVar5.f47383a) == null || (iOException = exc.getCause()) == null) {
                iOException = new IOException();
            }
            return new h3.b.a(iOException);
        }
        qs1.c cVar2 = (qs1.c) ((v2.b) v2Var).f47386a;
        if (!s.g(cVar2.getImageCount(), this.f154354g)) {
            Integer imageCount = cVar2.getImageCount();
            this.f154354g = imageCount;
            if (imageCount != null) {
                this.f154353f.invoke(new Integer(imageCount.intValue()));
            }
        }
        int i18 = tVar.f147345a;
        int i19 = tVar.f147346b;
        List<qs1.b> listD = cVar2.d();
        if (listD != null) {
            arrayList = new ArrayList(y.r(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(ge1.b.p((qs1.b) it.next(), this.f154350c, null));
            }
        } else {
            arrayList = j0.f134944a;
        }
        ?? r14 = arrayList;
        boolean zEquals = tVar.equals(tVar3);
        int i24 = this.f154352e;
        if (zEquals) {
            tVar2 = null;
        } else {
            if (i19 - i24 > tVar3.f147346b) {
                int i25 = tVar.f147345a;
                tVar3 = new t(i25 - i24, i25);
            }
            tVar2 = tVar3;
        }
        List<qs1.b> listD2 = cVar2.d();
        if (listD2 != null && !listD2.isEmpty()) {
            tVar5 = new t(i19, i24 + i19);
        }
        return new h3.b.c(r14, tVar2, tVar5, i18, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ss1.a aVar, e eVar, long j8, int i14, int i15, l<? super Integer, Unit> lVar) {
        aVar.getClass();
        eVar.getClass();
        lVar.getClass();
        this.f154349b = aVar;
        this.f154350c = eVar;
        this.f154351d = j8;
        this.f154352e = i14;
        this.f154353f = lVar;
        this.f154355h = new t(0, i15);
    }
}
