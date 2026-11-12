package n12;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewHolder$showAvatarView$1", f = "EditProfileImageViewHolder.kt", l = {268}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f122222b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f122222b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f122221a;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = this.f122222b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
            cVar.f46661d.resetCropImageView();
            p2 p2Var = cVar.f46673p;
            Boolean bool = Boolean.TRUE;
            this.f122221a = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v22.e.q(cVar.f46662e);
        cVar.f46661d.setAlpha(0.0f);
        return Unit.INSTANCE;
    }
}
