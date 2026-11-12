package n12;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewHolder$updateAvatarImageUri$1", f = "EditProfileImageViewHolder.kt", l = {282}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f122239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, Uri uri, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f122238b = cVar;
        this.f122239c = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f122238b, this.f122239c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f122237a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
            com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = this.f122238b;
            cVar.getClass();
            ge1.b.T(cVar, null, null, new b0(cVar, null), 3);
            p2 p2Var = cVar.f46674q;
            this.f122237a = 1;
            p2Var.setValue(this.f122239c);
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
        return Unit.INSTANCE;
    }
}
