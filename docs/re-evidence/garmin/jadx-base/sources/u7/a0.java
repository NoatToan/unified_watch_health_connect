package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lu7/e;", "<anonymous>", "(Z)Lu7/e;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
public final class a0 extends v13.i implements e23.p<Boolean, t13.d<? super e<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f169077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(m<Object> mVar, int i14, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f169078d = mVar;
        this.f169079e = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f169078d, this.f169079e, dVar);
        a0Var.f169077c = ((Boolean) obj).booleanValue();
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(Boolean bool, t13.d<? super e<Object>> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((a0) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        Object obj2;
        int iIntValue;
        int iHashCode;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169076b;
        m<Object> mVar = this.f169078d;
        if (i14 == 0) {
            o13.r.b(obj);
            z14 = this.f169077c;
            this.f169077c = z14;
            this.f169076b = 1;
            int i15 = m.f169187m;
            obj = mVar.i(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            z14 = this.f169077c;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f169075a;
            o13.r.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new e(obj2, iHashCode, iIntValue);
        if (z14) {
            int i16 = m.f169187m;
            t0 t0VarG = mVar.g();
            this.f169075a = obj;
            this.f169076b = 2;
            Object objE = t0VarG.e(this);
            if (objE != aVar) {
                obj2 = obj;
                obj = objE;
                iIntValue = ((Number) obj).intValue();
            }
            return aVar;
        }
        obj2 = obj;
        iIntValue = this.f169079e;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new e(obj2, iHashCode, iIntValue);
    }
}
