package s00;

import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$getUserProfilePicture$2", f = "ChildAccountsPushNotificationHandler.kt", l = {517}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f155369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f155369b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f155369b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155368a;
        String str = this.f155369b;
        if (i14 == 0) {
            o13.r.b(obj);
            a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
            List<String> listC = p13.w.c(str);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
            this.f155368a = 1;
            obj = iVar.a(listC, listC2, this);
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
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str), (Map) obj);
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
            return null;
        }
        return profileImageUrls.f46880i;
    }
}
