package v72;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import d53.u;
import d53.w;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n72.k;
import o13.m;
import o13.r;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;
import r53.b2;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import s5.w0;
import t13.d;
import ty1.f1;
import v13.e;
import v13.i;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv72/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f176175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f176176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f176177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f176178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f176179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f176180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f176181g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx5/l0;", "it", "", "<anonymous>", "(Lx5/l0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.ui.catalog.library.search.SearchComponentsViewModel$components$1", f = "SearchComponentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<l0, d<? super Unit>, Object> {
        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(l0 l0Var, d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = b.this.f176177c;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: v72.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx5/l0;", "textFieldValue", "", "Ln72/i;", "components", "<anonymous>", "(Lx5/l0;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.ui.catalog.library.search.SearchComponentsViewModel$components$2", f = "SearchComponentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3283b extends i implements q<l0, List<? extends n72.i>, d<? super List<? extends n72.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ l0 f176183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f176184b;

        public C3283b(d<? super C3283b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(l0 l0Var, List<? extends n72.i> list, d<? super List<? extends n72.i>> dVar) {
            C3283b c3283b = b.this.new C3283b(dVar);
            c3283b.f176183a = l0Var;
            c3283b.f176184b = list;
            return c3283b.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l0 l0Var = this.f176183a;
            List list = this.f176184b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            String str = l0Var.f188878a.f157138b;
            if (w.J(str)) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                n72.i iVar = (n72.i) obj2;
                b.this.getClass();
                List listK = x.k(iVar.getF124913b(), u.v(iVar.getF124913b(), "-", StringUtils.SPACE, false), iVar.getF124914c());
                if (listK == null || !listK.isEmpty()) {
                    Iterator it = listK.iterator();
                    while (it.hasNext()) {
                        if (w.z((String) it.next(), str, true)) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ln72/i;", "it", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.ui.catalog.library.search.SearchComponentsViewModel$components$3", f = "SearchComponentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<List<? extends n72.i>, d<? super Unit>, Object> {
        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(List<? extends n72.i> list, d<? super Unit> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = b.this.f176177c;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    public b() {
        p2 p2VarA = q2.a(new l0("", 0L, (w0) null, 6, (j) null));
        this.f176175a = p2VarA;
        b2 b2VarD = s.d(p2VarA);
        this.f176176b = b2VarD;
        p2 p2VarA2 = q2.a(Boolean.FALSE);
        this.f176177c = p2VarA2;
        this.f176178d = s.d(p2VarA2);
        t tVarB = m.b(new v10.a(4));
        this.f176179e = tVarB;
        this.f176180f = m.b(new f1(this, 27));
        p2 p2VarA3 = q2.a(h0.C0(h0.C0(k.f124900e, k.f124897b), (List) tVarB.getValue()));
        this.f176181g = s.K(new m1(new r53.u1(new m1(s.q(b2VarD, 500L), new a(null)), p2VarA3, new C3283b(null)), new c(null)), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA3.getValue());
    }
}
