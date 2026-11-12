package i82;

import e23.p;
import java.util.List;
import o13.r;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp3/k2;", "", "Loe/a;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.layout.WindowStateUtilKt$calculateDisplayFeatures$displayFeatures$2$1", f = "WindowStateUtil.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<k2<List<? extends oe.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f92273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<l> f92274c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2<List<oe.a>> f92275a;

        public a(k2<List<oe.a>> k2Var) {
            this.f92275a = k2Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f92275a.setValue(((l) obj).f131239a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r53.i<l> iVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f92274c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f92274c, dVar);
        fVar.f92273b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(k2<List<? extends oe.a>> k2Var, t13.d<? super Unit> dVar) {
        return ((f) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k2 k2Var = (k2) this.f92273b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92272a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(k2Var);
            this.f92273b = null;
            this.f92272a = 1;
            if (this.f92274c.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
