package s83;

import j83.m;

/* JADX INFO: loaded from: classes11.dex */
public final class j<T> extends j83.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f157977b;

    public class a implements j83.l.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f157978a;

        public a(Object obj) {
            this.f157978a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // n83.b
        public final void call(Object obj) {
            ((m) obj).c(this.f157978a);
        }
    }

    public static final class b<T> implements j83.l.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q83.c f157979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f157980b;

        public b(q83.c cVar, T t7) {
            this.f157979a = cVar;
            this.f157980b = t7;
        }

        @Override // n83.b
        public final void call(Object obj) {
            m mVar = (m) obj;
            mVar.a(this.f157979a.a(new d(mVar, this.f157980b)));
        }
    }

    public static final class c<T> implements j83.l.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j83.h f157981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f157982b;

        public c(j83.h hVar, T t7) {
            this.f157981a = hVar;
            this.f157982b = t7;
        }

        @Override // n83.b
        public final void call(Object obj) {
            m mVar = (m) obj;
            j83.h.a aVarCreateWorker = this.f157981a.createWorker();
            mVar.a(aVarCreateWorker);
            aVarCreateWorker.a(new d(mVar, this.f157982b));
        }
    }

    public static final class d<T> implements n83.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m<? super T> f157983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f157984b;

        public d(m<? super T> mVar, T t7) {
            this.f157983a = mVar;
            this.f157984b = t7;
        }

        @Override // n83.a
        public final void d() {
            m<? super T> mVar = this.f157983a;
            try {
                mVar.c(this.f157984b);
            } catch (Throwable th3) {
                mVar.b(th3);
            }
        }
    }

    public j(T t7) {
        super(new a(t7));
        this.f157977b = t7;
    }

    public final j83.l<T> e(j83.h hVar) {
        boolean z14 = hVar instanceof q83.c;
        T t7 = this.f157977b;
        return z14 ? new j83.l<>(new b((q83.c) hVar, t7)) : new j83.l<>(new c(hVar, t7));
    }
}
