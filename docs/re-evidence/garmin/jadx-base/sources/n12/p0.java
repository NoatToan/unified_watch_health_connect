package n12;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.ProfileImageViewHolder$loadImage$2", f = "ProfileImageViewHolder.kt", l = {117}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f122290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f122291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, Uri uri, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f122290b = u0Var;
        this.f122291c = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f122290b, this.f122291c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f122289a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f122290b.f122315d;
            this.f122289a = 1;
            p2Var.setValue(this.f122291c);
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
