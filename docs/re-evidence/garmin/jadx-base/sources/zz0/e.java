package zz0;

import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import e23.p;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.viewholder.NotificationActivityViewHolder$getUserProfilePicture$2", f = "NotificationActivityViewHolder.kt", l = {419}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f207599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f207599b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f207599b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207598a;
        String str = this.f207599b;
        if (i14 == 0) {
            r.b(obj);
            a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
            List<String> listC = w.c(str);
            List<? extends k> listC2 = w.c(k.PREMIUM_THUMBNAIL);
            this.f207598a = 1;
            obj = iVar.a(listC, listC2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        l lVar = (l) q6.f.l(Integer.parseInt(str), (Map) obj);
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
            return null;
        }
        return profileImageUrls.f46880i;
    }
}
