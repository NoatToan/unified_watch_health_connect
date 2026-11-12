package l81;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll81/e;", "Ll81/a;", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j81.a f111498a = (j81.a) KoinJavaComponent.get$default(j81.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k81.a f111499b;

    @Override // l81.a
    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final k81.a getF111499b() {
        return this.f111499b;
    }

    @Override // l81.a
    public final Object r1(LocalDate localDate, LocalDate localDate2, m61.a aVar, v13.c cVar) {
        return f0.J(this, new b(this, localDate, localDate2, aVar, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l81.a
    public final Object w(LocalDate localDate, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f111494d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f111494d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f111492b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f111494d;
        if (i15 == 0) {
            r.b(objJ);
            d dVar = new d(this, localDate, null);
            cVar2.f111491a = localDate;
            cVar2.f111494d = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate = cVar2.f111491a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        if (z14) {
            v2.b bVar = (v2.b) v2Var;
            if (!(bVar.f47386a instanceof k81.a)) {
                return new v2.b(null, bVar.f47387b, null, null, 12, null);
            }
        }
        if (z14 && localDate == null) {
            this.f111499b = (k81.a) ((v2.b) v2Var).f47386a;
        }
        return v2Var;
    }
}
