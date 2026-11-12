package qi1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ui1.o0;
import ui1.x0;
import ui1.y0;
import ui1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$handleTransferComplete$1", f = "LTESubscriptionViewModel.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144908b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$handleTransferComplete$1$1", f = "LTESubscriptionViewModel.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, 417}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f144910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f144910b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f144910b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (qi1.f.y4(r4, false, true, r8, r7) == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144909a;
            f fVar = this.f144910b;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            int i15 = f.f144858o;
            o0 o0VarD4 = fVar.D4();
            Long l14 = new Long(fVar.f144859a);
            this.f144909a = 1;
            obj = o0VarD4.f(l14, this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                x0 x0Var = (x0) ((v2.b) v2Var).f47386a;
                fVar.f144871m = y0.b(x0Var);
                z0 z0VarA = y0.a(x0Var);
                if (z0VarA != null) {
                    this.f144909a = 2;
                } else {
                    fVar.f144861c.j("LTESubscriptionStatusFragment");
                    fVar.f144862d.j(g3.a.a(g3.f35298f, "Error in getting data from subscription api", null, u.COMPLETED, null, 10));
                }
            } else {
                fVar.f144861c.j("LTESubscriptionStatusFragment");
                fVar.f144862d.j(g3.a.a(g3.f35298f, "Error in getting data from subscription api", null, u.COMPLETED, null, 10));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f144908b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f144908b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144907a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f144908b, null);
            this.f144907a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
