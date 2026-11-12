package ap;

import am.x0;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$divideLegAndSave$1", f = "MultisportEditLegsViewModel.kt", l = {426, 429, 432}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo.p f11624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f11627e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11628a;

        static {
            int[] iArr = new int[yo.p.values().length];
            try {
                iArr[yo.p.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yo.p.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11628a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yo.p pVar, d dVar, int i14, x0 x0Var, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f11624b = pVar;
        this.f11625c = dVar;
        this.f11626d = i14;
        this.f11627e = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f11624b, this.f11625c, this.f11626d, this.f11627e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r9.i(r1, r8) == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11623a;
        d dVar = this.f11625c;
        if (i14 != 0) {
            if (i14 == 1 || i14 == 2) {
                r.b(obj);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        int i15 = a.f11628a[this.f11624b.ordinal()];
        x0 x0Var = this.f11627e;
        int i16 = this.f11626d;
        if (i15 == 1) {
            yo.e eVar = dVar.f11593e;
            this.f11623a = 1;
            Object objD = eVar.f198237g.d(0, i16, x0Var, this);
            if (objD != aVar) {
                objD = Unit.INSTANCE;
            }
            if (objD != aVar) {
            }
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            yo.e eVar2 = dVar.f11593e;
            this.f11623a = 2;
            Object objC = eVar2.f198237g.c(0, i16, x0Var, this);
            if (objC != aVar) {
                objC = Unit.INSTANCE;
            }
            if (objC != aVar) {
            }
        }
        return aVar;
        yo.e eVar3 = dVar.f11593e;
        zo.k kVar = dVar.f11590b;
        this.f11623a = 3;
    }
}
