package j91;

import com.garmin.android.apps.connectmobile.g3;
import d91.u;
import e23.p;
import n70.h7;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuViewModel$updatePersonalizedInsightsEnabled$1", f = "PersonalizedInsightsDevMenuViewModel.kt", l = {58, 60}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f97896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, boolean z14, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f97896b = fVar;
        this.f97897c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f97896b, this.f97897c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (o53.m0.b(100, r5) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f97895a;
        f fVar = this.f97896b;
        if (i14 == 0) {
            r.b(obj);
            h7 h7Var = fVar.f97887c;
            o70.f fVar2 = o70.f.PERSONALIZED_INSIGHTS;
            this.f97895a = 1;
            obj = h7Var.a(fVar2, this.f97897c, this);
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
            r.b(obj);
        }
        fVar.f97885a.a(u.DEVELOPER_MENU);
        return Unit.INSTANCE;
        if (((g3) obj).f35300a == fw.p.SUCCESS) {
            this.f97895a = 2;
        }
        return Unit.INSTANCE;
    }
}
