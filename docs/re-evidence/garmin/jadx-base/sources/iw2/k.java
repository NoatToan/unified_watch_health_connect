package iw2;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/io/File;", "<anonymous>", "(Lo53/b0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$getCompositionFile$2", f = "RTSPhoneStorageCoordinator.kt", l = {309}, m = "invokeSuspend", v = 1)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super File>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, long j8, int i14, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f95459b = context;
        this.f95460c = j8;
        this.f95461d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f95459b, this.f95460c, this.f95461d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super File> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95458a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            wVar.getClass();
            w.f95548b.getClass();
            this.f95458a = 1;
            obj = w.b(wVar, this.f95459b, this.f95460c, this);
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
        File file = new File((File) obj, androidx.core.view.j.f(this.f95461d, ".txt"));
        w.f95547a.getClass();
        w.f95548b.getClass();
        return file;
    }
}
