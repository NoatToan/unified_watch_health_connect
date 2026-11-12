package f12;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.library.mobileauth.exception.IllegalAccountStateException;
import java.util.LinkedHashMap;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getUserGUID$2", f = "GCMUserAccountImpl.kt", l = {323}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f68061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f68062c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getUserGUID$2$1", f = "GCMUserAccountImpl.kt", l = {333}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap f68063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sc2.a f68064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f68066d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f68066d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68066d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            LinkedHashMap linkedHashMap;
            sc2.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68065c;
            if (i14 == 0) {
                o13.r.b(obj);
                linkedHashMap = this.f68066d.f68021c;
                sc2.a aVar3 = sc2.a.f158478d;
                re2.b bVar = re2.b.f152215a;
                this.f68063a = linkedHashMap;
                this.f68064b = aVar3;
                this.f68065c = 1;
                bVar.getClass();
                Object objX = re2.b.x(aVar3, this);
                if (objX == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                obj = objX;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f68064b;
                linkedHashMap = this.f68063a;
                o13.r.b(obj);
            }
            linkedHashMap.put(aVar, obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f68062c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f68062c, dVar);
        fVar.f68061b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        b0 b0Var = (b0) this.f68061b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68060a;
        c cVar = this.f68062c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                sc2.a aVar2 = sc2.a.f158478d;
                int i15 = c.f68018f;
                cVar.J("getUserGUID()", aVar2);
                re2.b bVar = re2.b.f152215a;
                this.f68061b = b0Var;
                this.f68060a = 1;
                bVar.getClass();
                obj = re2.b.j(this);
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
            ve2.d dVar = (ve2.d) obj;
            return (dVar == null || (str = dVar.f177691b) == null) ? "" : str;
        } catch (RateLimitException e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "GCMUserAccount", "ERROR getUserGUID() -> " + e4);
            ge1.b.W(t13.h.f161748a, new a(cVar, null));
            return "";
        } catch (IllegalAccountStateException e14) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "GCMUserAccount", "ERROR getUserGUID() -> " + e14);
            return "";
        } catch (IllegalAccessException e15) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var3, "GCMUserAccount", "ERROR getUserGUID() -> " + e15);
            return "";
        } catch (Exception e16) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e16, "ERROR getUserGUID() -> ");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var4, "GCMUserAccount", strD);
            return "";
        }
    }
}
