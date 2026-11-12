package u7;

import androidx.datastore.core.CorruptionException;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
public final class b0 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f169087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f169089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f169091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p005kotlin.jvm.internal.r0<Object> r0Var, m<Object> mVar, p005kotlin.jvm.internal.p0 p0Var, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f169089c = r0Var;
        this.f169090d = mVar;
        this.f169091e = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f169089c, this.f169090d, this.f169091e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        p005kotlin.jvm.internal.r0<Object> r0Var;
        T t7;
        p005kotlin.jvm.internal.p0 p0Var;
        Object obj3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169088b;
        p005kotlin.jvm.internal.p0 p0Var2 = this.f169091e;
        p005kotlin.jvm.internal.r0<Object> r0Var2 = this.f169089c;
        m<Object> mVar = this.f169090d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f169087a = r0Var2;
                this.f169088b = 1;
                int i15 = m.f169187m;
                Object objI = mVar.i(this);
                if (objI != aVar) {
                    r0Var = r0Var2;
                    t7 = objI;
                }
                return aVar;
            }
            if (i14 == 1) {
                r0Var = (p005kotlin.jvm.internal.r0) this.f169087a;
                o13.r.b(obj);
                t7 = obj;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p0Var2 = (p005kotlin.jvm.internal.p0) this.f169087a;
                    o13.r.b(obj);
                    obj2 = obj;
                    p0Var2.f105807a = ((Number) obj2).intValue();
                    return Unit.INSTANCE;
                }
                p0Var = (p005kotlin.jvm.internal.p0) this.f169087a;
                o13.r.b(obj);
                obj3 = obj;
            }
            p0Var.f105807a = ((Number) obj3).intValue();
            return Unit.INSTANCE;
            r0Var.f105810a = t7;
            int i16 = m.f169187m;
            t0 t0VarG = mVar.g();
            this.f169087a = p0Var2;
            this.f169088b = 2;
            Object objE = t0VarG.e(this);
            if (objE == aVar) {
                return aVar;
            }
            p0Var = p0Var2;
            obj3 = objE;
            p0Var.f105807a = ((Number) obj3).intValue();
            return Unit.INSTANCE;
        } catch (CorruptionException unused) {
            Object obj4 = r0Var2.f105810a;
            this.f169087a = p0Var2;
            this.f169088b = 3;
            Object objJ = mVar.j(obj4, true, this);
            obj2 = objJ;
        }
    }
}
