package te2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$getMFAToken$2", f = "MFAManager.kt", l = {71}, m = "invokeSuspend")
public final class w1 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f164367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f164368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f164369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(e2 e2Var, boolean z14, boolean z15, t13.d<? super w1> dVar) {
        super(2, dVar);
        this.f164367b = e2Var;
        this.f164368c = z14;
        this.f164369d = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w1(this.f164367b, this.f164368c, this.f164369d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((w1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164366a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f164366a = 1;
            this.f164367b.getClass();
            x53.c cVar = o53.s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new x1(this.f164368c, this.f164369d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ve2.k kVar = (ve2.k) obj;
        if (kVar != null) {
            return kVar.f177753a;
        }
        return null;
    }
}
