package iw2;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/io/File;", "<anonymous>", "(Lo53/b0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$getCompositionsDirectory$2", f = "RTSPhoneStorageCoordinator.kt", l = {80}, m = "invokeSuspend", v = 1)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super File>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, long j8, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f95467b = context;
        this.f95468c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f95467b, this.f95468c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super File> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95466a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            this.f95466a = 1;
            obj = w.c(wVar, this.f95467b, this.f95468c, this);
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
        return new File((File) obj, "composition_files");
    }
}
