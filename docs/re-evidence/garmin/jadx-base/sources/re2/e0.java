package re2;

import com.garmin.android.lib.networking.authentication.exceptions.InvalidOAuth2TokenException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/o;", "<anonymous>", "(Lo53/b0;)Lsc2/o;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$validateIT2AccessToken$2", f = "AuthenticationHelper.kt", l = {1273}, m = "invokeSuspend")
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.o>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.e f152284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc2.o f152285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f152286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ve2.e eVar, sc2.o oVar, boolean z14, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f152284b = eVar;
        this.f152285c = oVar;
        this.f152286d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f152284b, this.f152285c, this.f152286d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.o> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152283a;
        sc2.o oVar = this.f152285c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b.f152216b.debug("validateIT2AccessToken");
                rc2.h hVar = new rc2.h(b.f152215a.b(), this.f152284b, oVar.f158544a, b.m().d());
                this.f152283a = 1;
                obj = hVar.b(this);
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
            wc2.a aVar2 = (wc2.a) obj;
            if (aVar2 instanceof wc2.a.b) {
                return oVar;
            }
            aVar2.getClass();
            Exception exc = ((wc2.a.C3415a) aVar2).f184312a;
            if (exc instanceof InvalidOAuth2TokenException) {
                return null;
            }
            throw exc;
        } catch (Throwable th3) {
            if (this.f152286d) {
                b.f152216b.error("validateIT2AccessToken", th3);
            }
            throw th3;
        }
    }
}
