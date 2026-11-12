package r53;

import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lr53/u2;", "T", "Lr53/d2;", "sharedFlow", "Lkotlin/Function2;", "Lr53/j;", "Lt13/d;", "", "", "action", "<init>", "(Lr53/d2;Le23/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2<T> implements d2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2<T> f150890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<j<? super T>, t13.d<? super Unit>, Object> f150891b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u2<T> f150893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u2<T> u2Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150893b = u2Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150892a = obj;
            this.f150894c |= Integer.MIN_VALUE;
            return this.f150893b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u2(d2<? extends T> d2Var, e23.p<? super j<? super T>, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f150890a = d2Var;
        this.f150891b = pVar;
    }

    @Override // r53.d2
    public final List<T> a() {
        return this.f150890a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150894c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150894c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150892a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150894c;
        if (i15 == 0) {
            o13.r.b(obj);
            t2 t2Var = new t2(jVar, this.f150891b);
            aVar.f150894c = 1;
            if (this.f150890a.collect(t2Var, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
