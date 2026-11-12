package te2;

import com.garmin.android.library.mobileauth.exception.IllegalAccountStateException;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/k;", "<anonymous>", "(Lo53/b0;)Lve2/k;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$getMFATokenData$2", f = "MFAManager.kt", l = {90}, m = "invokeSuspend")
public final class x1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f164383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f164384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f164386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z14, boolean z15, t13.d<? super x1> dVar) {
        super(2, dVar);
        this.f164386d = z14;
        this.f164387e = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x1(this.f164386d, this.f164387e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.k> dVar) {
        return ((x1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [T, ve2.k] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws MFATokenExpiredException, IllegalAccountStateException {
        p005kotlin.jvm.internal.r0 r0VarS;
        boolean z14;
        ?? r14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164385c;
        if (i14 == 0) {
            r0VarS = wr.g.s(obj);
            re2.b bVar = re2.b.f152215a;
            if (this.f164386d) {
                bVar.I("MFAManager.getMFATokenData");
            }
            this.f164383a = r0VarS;
            boolean z15 = this.f164387e;
            this.f164384b = z15;
            this.f164385c = 1;
            bVar.getClass();
            obj = re2.b.j(this);
            if (obj == aVar) {
                return aVar;
            }
            z14 = z15;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f164384b;
            r0VarS = this.f164383a;
            o13.r.b(obj);
        }
        ve2.d dVar = (ve2.d) obj;
        if (dVar != null && (r14 = dVar.f177697h) != 0 && r14.a()) {
            if (z14) {
                Long l14 = r14.f177754b;
                l14.getClass();
                if (nd2.c.e(l14.longValue())) {
                    throw new MFATokenExpiredException();
                }
            }
            r0VarS.f105810a = r14;
        }
        return r0VarS.f105810a;
    }
}
