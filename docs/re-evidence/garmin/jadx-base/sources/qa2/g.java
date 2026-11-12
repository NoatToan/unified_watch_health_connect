package qa2;

import c83.a0;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.model.ReportsDataStore$downloadReport$1", f = "ReportsDataStore.kt", l = {175, 179, 180, 191}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f143912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f143913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f143914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f143915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<ResponseBody, Unit> f143916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(e eVar, l<? super ResponseBody, Unit> lVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f143915d = eVar;
        this.f143916e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f143915d, this.f143916e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:38:0x00bd, B:39:0x00bf, B:17:0x0037, B:35:0x00b0, B:20:0x0042, B:30:0x0088, B:32:0x0094, B:26:0x0076), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[Catch: Exception -> 0x002e, PHI: r1 r2
      0x00b0: PHI (r1v8 ra2.a) = (r1v7 ra2.a), (r1v12 ra2.a) binds: [B:33:0x00ad, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String) binds: [B:33:0x00ad, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:38:0x00bd, B:39:0x00bf, B:17:0x0037, B:35:0x00b0, B:20:0x0042, B:30:0x0088, B:32:0x0094, B:26:0x0076), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (r11 == r0) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ra2.a aVar;
        String str;
        a0 a0Var;
        long jF;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143914c;
        l lVar = this.f143916e;
        try {
            if (i14 == 0) {
                r.b(obj);
                pa2.b.f136781a.getClass();
                pa2.a aVarA = pa2.b.a.a();
                e eVar = this.f143915d;
                String str2 = eVar.f143903c;
                if (!s.g(aVarA.f136770b, "ecg") || str2 == null) {
                    String str3 = eVar.f143903c;
                    if (str3 != null) {
                        ra2.b bVar = eVar.f143907g;
                        this.f143912a = null;
                        this.f143913b = lVar;
                        this.f143914c = 4;
                        obj = bVar.b(str3, this);
                    } else {
                        lVar.invoke(null);
                    }
                    return Unit.INSTANCE;
                }
                ra2.h.f151495a.getClass();
                Object objB = ra2.h.a().b(ra2.a.class);
                objB.getClass();
                ra2.a aVar3 = (ra2.a) objB;
                this.f143912a = str2;
                this.f143913b = aVar3;
                this.f143914c = 1;
                Object objA = aVar3.a(str2, this);
                if (objA != aVar2) {
                    aVar = aVar3;
                    obj = objA;
                    str = str2;
                    a0Var = (a0) obj;
                    if (a0Var.f25745a.code() == 202) {
                        e.f143900h.getClass();
                        e53.c.a aVar4 = e53.c.f63094b;
                        jF = e53.e.f(2000L, e53.f.MILLISECONDS);
                        this.f143912a = str;
                        this.f143913b = aVar;
                        this.f143914c = 2;
                        if (m0.c(jF, this) == aVar2) {
                            this.f143912a = null;
                            this.f143913b = null;
                            this.f143914c = 3;
                            obj = aVar.a(str, this);
                            if (obj == aVar2) {
                            }
                            a0Var = (a0) obj;
                        }
                    }
                }
                return aVar2;
            }
            if (i14 == 1) {
                aVar = (ra2.a) this.f143913b;
                str = this.f143912a;
                r.b(obj);
                a0Var = (a0) obj;
                if (a0Var.f25745a.code() == 202) {
                    e.f143900h.getClass();
                    e53.c.a aVar5 = e53.c.f63094b;
                    jF = e53.e.f(2000L, e53.f.MILLISECONDS);
                    this.f143912a = str;
                    this.f143913b = aVar;
                    this.f143914c = 2;
                    if (m0.c(jF, this) == aVar2) {
                        this.f143912a = null;
                        this.f143913b = null;
                        this.f143914c = 3;
                        obj = aVar.a(str, this);
                        if (obj == aVar2) {
                        }
                    }
                    return aVar2;
                }
            } else if (i14 == 2) {
                aVar = (ra2.a) this.f143913b;
                str = this.f143912a;
                r.b(obj);
                this.f143912a = null;
                this.f143913b = null;
                this.f143914c = 3;
                obj = aVar.a(str, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 3) {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = (l) this.f143913b;
                    r.b(obj);
                    lVar.invoke((ResponseBody) obj);
                    return Unit.INSTANCE;
                }
                r.b(obj);
            }
            a0Var = (a0) obj;
            lVar.invoke(a0Var.f25746b);
        } catch (Exception e4) {
            e.f143900h.a("Exception fetching response " + e4.getMessage());
            lVar.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
