package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.FavoriteFoodUseCase$invoke$2", f = "FavoriteFoodUseCase.kt", l = {26, 35}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f174584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f174585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f174586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g01.u f174587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f174588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Double f174589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f174590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f174591i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z14, y yVar, String str, g01.u uVar, String str2, Double d14, String str3, String str4, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f174584b = z14;
        this.f174585c = yVar;
        this.f174586d = str;
        this.f174587e = uVar;
        this.f174588f = str2;
        this.f174589g = d14;
        this.f174590h = str3;
        this.f174591i = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f174584b, this.f174585c, this.f174586d, this.f174587e, this.f174588f, this.f174589g, this.f174590h, this.f174591i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r14 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r14 == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174583a;
        y yVar = this.f174585c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f174584b) {
                m01.g gVar = yVar.f174607a;
                this.f174583a = 1;
                obj = gVar.l(this.f174586d, this.f174587e, this.f174588f, this.f174589g, this.f174590h, this.f174591i, this);
            } else {
                m01.g gVar2 = yVar.f174607a;
                this.f174583a = 2;
                obj = gVar2.i(this.f174586d, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2Var = (v2) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
        }
        if (v2Var instanceof v2.b) {
            yVar.f174608b.a();
        }
        return v2Var;
    }
}
