package n12;

import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileSucceeded$profileInfoMap$1", f = "EditProfileImageViewModel.kt", l = {330}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f122265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i14, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f122265b = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f122265b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f122264a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
        List<String> listC = p13.w.c(String.valueOf(this.f122265b));
        this.f122264a = 1;
        a22.i.a aVar2 = a22.i.f537b;
        Object objA = iVar.a(listC, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
        return objA == aVar ? aVar : objA;
    }
}
