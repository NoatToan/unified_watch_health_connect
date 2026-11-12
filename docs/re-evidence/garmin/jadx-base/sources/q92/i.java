package q92;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lq92/a0;", "", "Lq92/v;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getAllConsents$2", f = "ConsentRepository.kt", l = {119}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<b0, t13.d<? super a0<? extends List<? extends v>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f143655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f143656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.l f143657e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq92/a0;", "", "Lq92/v;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getAllConsents$2$1", f = "ConsentRepository.kt", l = {121}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends List<? extends v>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f143660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s92.l f143661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f143662e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, boolean z14, s92.l lVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143659b = fVar;
            this.f143660c = z14;
            this.f143661d = lVar;
            this.f143662e = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143659b, this.f143660c, this.f143661d, this.f143662e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends List<? extends v>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<s92.c> list;
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143658a;
            s92.l lVar = this.f143661d;
            boolean z14 = this.f143660c;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f143658a = 1;
                r92.a aVar2 = this.f143659b.f143628a;
                obj = lVar == null ? aVar2.p(z14, this) : aVar2.e(lVar.f158101a, z14, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            Response response = a0Var.f25745a;
            if (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) {
                IOException iOException = new IOException(sn.a.e(response.code(), "Error fetching all consents code[", "] ", response.message()));
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            ArrayList arrayList = new ArrayList();
            for (s92.c cVar : list) {
                x.a aVar3 = x.f143797c;
                String consentTypeId = cVar.getConsentTypeId();
                aVar3.getClass();
                Iterator<T> it = x.C.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((x) next).f143819a, consentTypeId));
                x xVar = (x) next;
                if (xVar != null) {
                    p92.o.f136619a.getClass();
                    p92.o.m().e(xVar, cVar, lVar);
                    arrayList.add(p92.o.m().d(xVar, lVar));
                }
            }
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", "getAllConsents(" + z14 + ") successfully " + list);
            return new a0.b(h0.b1(h0.Z(arrayList)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, boolean z14, s92.l lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f143655c = fVar;
        this.f143656d = z14;
        this.f143657e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f143655c, this.f143656d, this.f143657e, dVar);
        iVar.f143654b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends List<? extends v>>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143653a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143655c, this.f143656d, this.f143657e, (b0) this.f143654b, null);
        this.f143653a = 1;
        Object objA = u92.b.a(aVar2, "Error fetching all consents", this);
        return objA == aVar ? aVar : objA;
    }
}
