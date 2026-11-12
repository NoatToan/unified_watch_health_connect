package a21;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import e23.p;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.viewmodel.MyFitnessPalAccountViewModel$checkMFPAccountStatusAfterDisconnection$1", f = "MyFitnessPalAccountViewModel.kt", l = {58, 58}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<t0<MyFitnessPalUserAuthDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f512d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f512d, dVar);
        eVar.f511c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t0<MyFitnessPalUserAuthDTO> t0Var, t13.d<? super Unit> dVar) {
        return ((e) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f511c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f510b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f509a;
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
        this.f511c = null;
        this.f509a = t0Var;
        this.f510b = 1;
        int i15 = d.f505d;
        d dVar = this.f512d;
        dVar.getClass();
        x53.c cVar = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new f(dVar, true, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f511c = null;
        this.f509a = null;
        this.f510b = 2;
    }
}
