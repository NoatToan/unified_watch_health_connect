package te2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$isMFATokenValid$2", f = "MFAManager.kt", l = {ModuleDescriptor.MODULE_VERSION, 159, 165}, m = "invokeSuspend")
public final class c2 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f163994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve2.d f163995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f163996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ve2.l f163997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2 f163998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context, ve2.d dVar, String str, ve2.l lVar, e2 e2Var, t13.d<? super c2> dVar2) {
        super(2, dVar2);
        this.f163994c = context;
        this.f163995d = dVar;
        this.f163996e = str;
        this.f163997f = lVar;
        this.f163998g = e2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c2(this.f163994c, this.f163995d, this.f163996e, this.f163997f, this.f163998g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((c2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        int i14;
        int i15;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f163993b;
        boolean z14 = false;
        e2 e2Var = this.f163998g;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                Context context = this.f163994c;
                ve2.d dVar = this.f163995d;
                rc2.i0 i0Var = new rc2.i0(context, dVar.f177690a, dVar.f177691b, this.f163996e, this.f163997f.d());
                this.f163993b = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rc2.h0(i0Var, null), this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i16 == 1) {
                o13.r.b(obj);
            } else if (i16 == 2) {
                o13.r.b(obj);
            } else {
                if (i16 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i15 = this.f163992a;
                o13.r.b(obj);
                i14 = i15;
                if (i14 != 0) {
                    z14 = true;
                }
            }
            return Boolean.valueOf(z14);
            Object objA = wc2.b.a((wc2.a) obj);
            boolean z15 = objA instanceof Unit;
            Context context2 = this.f163994c;
            if (z15) {
                this.f163993b = 2;
                e2Var.getClass();
                x53.c cVar2 = o53.s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new t1(e2Var, "MFAManager.isMFATokenValid", context2, null), this);
                if (objE0 != aVar) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == aVar) {
                }
                return Boolean.valueOf(z14);
            }
            if (!(objA instanceof ve2.k)) {
                throw new Exception("unexpected return type");
            }
            if (((ve2.k) objA).a()) {
                Long l14 = ((ve2.k) objA).f177754b;
                l14.getClass();
                if (nd2.c.e(l14.longValue())) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
            } else {
                i14 = 0;
            }
            if (i14 == 0) {
                this.f163992a = i14;
                this.f163993b = 3;
                e2Var.getClass();
                x53.c cVar3 = o53.s0.f129406a;
                Object objE1 = ge1.b.e0(x53.b.f189152a, new t1(e2Var, "MFAManager.isMFATokenValid", context2, null), this);
                if (objE1 != aVar) {
                    objE1 = Unit.INSTANCE;
                }
                if (objE1 != aVar) {
                    i15 = i14;
                    i14 = i15;
                    if (i14 != 0) {
                        z14 = true;
                    }
                }
            } else if (i14 != 0) {
                z14 = true;
            }
            return Boolean.valueOf(z14);
            return aVar;
        } catch (Exception e4) {
            e2.a(e2Var).error("isMFATokenValid", (Throwable) e4);
            throw e4;
        }
    }
}
