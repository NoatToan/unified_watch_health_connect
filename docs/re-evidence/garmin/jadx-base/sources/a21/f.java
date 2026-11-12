package a21;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.viewmodel.MyFitnessPalAccountViewModel$fetchMFPAccountStatus$2", f = "MyFitnessPalAccountViewModel.kt", l = {63, 67}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super MyFitnessPalUserAuthDTO>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, boolean z14, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f516d = dVar;
        this.f517e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f516d, this.f517e, dVar);
        fVar.f515c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super MyFitnessPalUserAuthDTO> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        v2 v2Var2;
        b0 b0Var = (b0) this.f515c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f514b;
        d dVar = this.f516d;
        if (i14 == 0) {
            r.b(obj);
            m01.a aVar2 = dVar.f507b;
            this.f515c = b0Var;
            this.f514b = 1;
            obj = aVar2.c(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var2 = this.f513a;
            r.b(obj);
        }
        sn.a.o(l.f68084a, true);
        v2Var = v2Var2;
        a2 a2Var = a2.NUTRITION;
        v2.b bVar = (v2.b) v2Var;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("MyFitnessPal account connected: ", ((MyFitnessPalUserAuthDTO) bVar.f47386a).C());
        i2.f36769a.getClass();
        i2.a.b(a2Var, "MyFitnessPalAccountViewModel", strH);
        return (MyFitnessPalUserAuthDTO) bVar.f47386a;
        v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            String strM = j.m("GET My Fitness Pal Status -> failed with error=[", ((v2.a) v2Var).f47385c, "]");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "MyFitnessPalAccountViewModel", strM);
            return null;
        }
        l.f68084a.getClass();
        l lVarA = l.a.a();
        v2.b bVar2 = (v2.b) v2Var;
        MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO = (MyFitnessPalUserAuthDTO) bVar2.f47386a;
        lVarA.p4(myFitnessPalUserAuthDTO.C());
        if (this.f517e && !myFitnessPalUserAuthDTO.C()) {
            x01.i iVar = dVar.f508c;
            this.f515c = b0Var;
            this.f513a = bVar2;
            this.f514b = 2;
            if (iVar.a(false, this) != aVar) {
                v2Var2 = v2Var;
                sn.a.o(l.f68084a, true);
                v2Var = v2Var2;
            }
            return aVar;
        }
        a2 a2Var3 = a2.NUTRITION;
        v2.b bVar3 = (v2.b) v2Var;
        String strH2 = com.airbnb.lottie.animation.keyframe.a.h("MyFitnessPal account connected: ", ((MyFitnessPalUserAuthDTO) bVar3.f47386a).C());
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "MyFitnessPalAccountViewModel", strH2);
        return (MyFitnessPalUserAuthDTO) bVar3.f47386a;
    }
}
