package c83;

import okhttp3.Call;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k<ResponseT, ReturnT> extends c0<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f25794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f25795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<ResponseBody, ResponseT> f25796c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, ReturnT> f25797d;

        public a(z zVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(zVar, factory, hVar);
            this.f25797d = eVar;
        }

        @Override // c83.k
        public final Object c(r rVar, Object[] objArr) {
            return this.f25797d.b(rVar);
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f25798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f25799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f25800f;

        public b(z zVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z14, boolean z15) {
            super(zVar, factory, hVar);
            this.f25798d = eVar;
            this.f25799e = z14;
            this.f25800f = z15;
        }

        @Override // c83.k
        public final Object c(r rVar, Object[] objArr) {
            d dVar = (d) this.f25798d.b(rVar);
            t13.d dVar2 = (t13.d) objArr[objArr.length - 1];
            try {
                if (!this.f25800f) {
                    return this.f25799e ? m.b(dVar, dVar2) : m.a(dVar, dVar2);
                }
                dVar.getClass();
                return m.b(dVar, dVar2);
            } catch (LinkageError e4) {
                throw e4;
            } catch (ThreadDeath e14) {
                throw e14;
            } catch (VirtualMachineError e15) {
                throw e15;
            } catch (Throwable th3) {
                return m.c(dVar2, th3);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f25801d;

        public c(z zVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(zVar, factory, hVar);
            this.f25801d = eVar;
        }

        @Override // c83.k
        public final Object c(r rVar, Object[] objArr) throws Throwable {
            d dVar = (d) this.f25801d.b(rVar);
            t13.d dVar2 = (t13.d) objArr[objArr.length - 1];
            try {
                o53.k kVar = new o53.k(u13.f.b(dVar2), 1);
                kVar.q();
                kVar.r(new n(dVar));
                dVar.q0(new o(kVar));
                Object objP = kVar.p();
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                return objP;
            } catch (Exception e4) {
                return m.c(dVar2, e4);
            }
        }
    }

    public k(z zVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar) {
        this.f25794a = zVar;
        this.f25795b = factory;
        this.f25796c = hVar;
    }

    @Override // c83.c0
    public final ReturnT a(Object obj, Object[] objArr) {
        return (ReturnT) c(new r(this.f25794a, obj, objArr, this.f25795b, this.f25796c), objArr);
    }

    public abstract Object c(r rVar, Object[] objArr);
}
