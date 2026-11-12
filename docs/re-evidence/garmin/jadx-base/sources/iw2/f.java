package iw2;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$deleteImageDirectory$2", f = "RTSPhoneStorageCoordinator.kt", l = {122}, m = "invokeSuspend", v = 1)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f95410b = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f95410b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95409a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            this.f95409a = 1;
            obj = w.a(wVar, this.f95410b, this);
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
        Boolean boolValueOf = Boolean.valueOf(a23.g.d(new File((File) obj, "icon_image_set")));
        w.f95547a.getClass();
        w.f95548b.getClass();
        return boolValueOf;
    }
}
