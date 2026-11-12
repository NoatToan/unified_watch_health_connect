package x82;

import ch.qos.logback.core.joran.action.Action;
import e23.p;
import o13.r;
import o53.b0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx82/a;", "PageDataType", "Lv82/a;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "initialData", "", "initialRefresh", "Lx82/f;", "dataFetcher", "<init>", "(Lo53/b0;Ljava/lang/Object;ZLx82/f;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<PageDataType> implements v82.a<PageDataType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f189556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<PageDataType> f189557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f189558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f189559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f189560e;

    /* JADX INFO: renamed from: x82.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"PageDataType", "Lr53/j;", "Lw82/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.state.fetch.FetchingReportsPageDataState$data$1", f = "FetchingReportsPageDataState.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3525a extends i implements p<j<? super w82.a<PageDataType>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<PageDataType> f189561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f189562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3525a(a<PageDataType> aVar, boolean z14, t13.d<? super C3525a> dVar) {
            super(2, dVar);
            this.f189561a = aVar;
            this.f189562b = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3525a(this.f189561a, this.f189562b, dVar);
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((C3525a) create((j) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a<PageDataType> aVar2 = this.f189561a;
            if (((w82.a) aVar2.f189559d.getValue()).f183554c && this.f189562b) {
                aVar2.a();
            }
            return Unit.INSTANCE;
        }
    }

    public a(b0 b0Var, PageDataType pagedatatype, boolean z14, f<PageDataType> fVar) {
        b0Var.getClass();
        fVar.getClass();
        this.f189556a = b0Var;
        this.f189557b = fVar;
        p2 p2VarA = q2.a(new w82.a(w82.a.InterfaceC3402a.b.f183558a, pagedatatype));
        this.f189559d = p2VarA;
        this.f189560e = s.K(new v(new C3525a(this, z14, null), p2VarA), b0Var, k2.a.a(k2.f150703a, 2), p2VarA.getValue());
    }

    public static final void b(a aVar, Throwable th3) {
        Object value;
        p2 p2Var = aVar.f189559d;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, new w82.a(new w82.a.InterfaceC3402a.C3403a(th3, null, 2, null), ((w82.a) value).f183553b)));
    }

    @Override // v82.a
    public final void a() {
        synchronized (this) {
            synchronized (this) {
                try {
                    c2 c2Var = this.f189558c;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    this.f189558c = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f189558c = ge1.b.T(this.f189556a, null, null, new b(true, this, null), 3);
    }

    @Override // v82.a
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final b2 getF189560e() {
        return this.f189560e;
    }

    public /* synthetic */ a(b0 b0Var, Object obj, boolean z14, f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, obj, (i14 & 4) != 0 ? true : z14, fVar);
    }
}
