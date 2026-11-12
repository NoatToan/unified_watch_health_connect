package ap;

import am.x0;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$divideLeg$1", f = "MultisportEditLegsViewModel.kt", l = {407, WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo.p f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f11621f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11622a;

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
            f11622a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yo.p pVar, d dVar, int i14, int i15, x0 x0Var, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f11617b = pVar;
        this.f11618c = dVar;
        this.f11619d = i14;
        this.f11620e = i15;
        this.f11621f = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f11617b, this.f11618c, this.f11619d, this.f11620e, this.f11621f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11616a;
        d dVar = this.f11618c;
        if (i14 == 0) {
            r.b(obj);
            int i15 = a.f11622a[this.f11617b.ordinal()];
            x0 x0Var = this.f11621f;
            int i16 = this.f11620e;
            int i17 = this.f11619d;
            if (i15 == 1) {
                yo.e eVar = dVar.f11593e;
                this.f11616a = 1;
                Object objD = eVar.f198237g.d(i17, i16, x0Var, this);
                if (objD != aVar) {
                    objD = Unit.INSTANCE;
                }
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                yo.e eVar2 = dVar.f11593e;
                this.f11616a = 2;
                Object objC = eVar2.f198237g.c(i17, i16, x0Var, this);
                if (objC != aVar) {
                    objC = Unit.INSTANCE;
                }
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Integer num = (Integer) dVar.f11597i.d();
        if (num != null && num.intValue() != -1) {
            dVar.A4(num.intValue() + 1);
        }
        return Unit.INSTANCE;
    }
}
