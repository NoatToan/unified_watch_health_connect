package a21;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.Locale;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p92.o;
import q92.x;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Ld20/f;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.viewmodel.MyFitnessPalAccountViewModel$getMFPAccountStatusAndConsent$1", f = "MyFitnessPalAccountViewModel.kt", l = {32, 54}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<t0<d20.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f520c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ld20/f;", "<anonymous>", "(Lo53/b0;)Ld20/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.viewmodel.MyFitnessPalAccountViewModel$getMFPAccountStatusAndConsent$1$mfpConsentDto$1", f = "MyFitnessPalAccountViewModel.kt", l = {35, 38, 40}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super d20.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s92.g f521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f524d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f524d, dVar);
            aVar.f523c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super d20.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0071  */
        /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0018, B:31:0x0074, B:33:0x007a, B:37:0x0086, B:34:0x0081, B:39:0x0090, B:40:0x0095, B:14:0x0025, B:27:0x005e, B:15:0x0029, B:21:0x004a, B:24:0x004f, B:18:0x0030), top: B:43:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0018, B:31:0x0074, B:33:0x007a, B:37:0x0086, B:34:0x0081, B:39:0x0090, B:40:0x0095, B:14:0x0025, B:27:0x005e, B:15:0x0029, B:21:0x004a, B:24:0x004f, B:18:0x0030), top: B:43:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:36:0x0085  */
        /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0018, B:31:0x0074, B:33:0x007a, B:37:0x0086, B:34:0x0081, B:39:0x0090, B:40:0x0095, B:14:0x0025, B:27:0x005e, B:15:0x0029, B:21:0x004a, B:24:0x004f, B:18:0x0030), top: B:43:0x000e }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            s92.g gVar;
            Object objB;
            s92.g gVar2;
            v2 v2Var;
            d20.d dVar;
            b0 b0Var = (b0) this.f523c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f522b;
            d dVar2 = this.f524d;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    this.f523c = b0Var;
                    this.f522b = 1;
                    int i15 = d.f505d;
                    dVar2.getClass();
                    x53.c cVar = s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new f(dVar2, false, null), this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        r.b(obj);
                        gVar = (s92.g) obj;
                        e20.a aVar2 = dVar2.f506a;
                        this.f523c = b0Var;
                        this.f521a = gVar;
                        this.f522b = 3;
                        objB = aVar2.b("MY_FITNESS_PAL", this);
                        if (objB != aVar) {
                            gVar2 = gVar;
                            obj = objB;
                        }
                        return aVar;
                    }
                    if (i14 != 3) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar2 = this.f521a;
                    r.b(obj);
                }
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    dVar = (d20.d) ((v2.b) v2Var).f47386a;
                } else {
                    if (v2Var instanceof v2.a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = null;
                }
                d20.f fVar = new d20.f(null, null, 3, null);
                fVar.f57283a = gVar2;
                fVar.f57284b = dVar;
                return fVar;
                if (((MyFitnessPalUserAuthDTO) obj) == null) {
                    return null;
                }
                o oVar = o.f136619a;
                x xVar = x.DI_CONNECT_THIRDPARTY;
                this.f523c = b0Var;
                this.f522b = 2;
                obj = oVar.f(xVar, Locale.getDefault(), this);
                if (obj != aVar) {
                    gVar = (s92.g) obj;
                    e20.a aVar3 = dVar2.f506a;
                    this.f523c = b0Var;
                    this.f521a = gVar;
                    this.f522b = 3;
                    objB = aVar3.b("MY_FITNESS_PAL", this);
                    if (objB != aVar) {
                        gVar2 = gVar;
                        obj = objB;
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            dVar = (d20.d) ((v2.b) v2Var).f47386a;
                        } else {
                            if (v2Var instanceof v2.a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = null;
                        }
                        d20.f fVar2 = new d20.f(null, null, 3, null);
                        fVar2.f57283a = gVar2;
                        fVar2.f57284b = dVar;
                        return fVar2;
                    }
                }
                return aVar;
            } catch (Exception e4) {
                a2 a2Var = a2.NUTRITION;
                String strH = f3.h(e4, "GET My Fitness Pal Status -> server call failed with status=[", "]");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "MyFitnessPalAccountViewModel", strH);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f520c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f520c, dVar);
        gVar.f519b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(t0<d20.f> t0Var, t13.d<? super Unit> dVar) {
        return ((g) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit((d20.f) r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f519b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f518a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f520c, null);
        this.f519b = t0Var;
        this.f518a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f519b = null;
        this.f518a = 2;
    }
}
