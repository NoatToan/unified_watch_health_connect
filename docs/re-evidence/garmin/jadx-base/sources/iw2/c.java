package iw2;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/io/File;", "<anonymous>", "(Lo53/b0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$createCompositionTextFile$2", f = "RTSPhoneStorageCoordinator.kt", l = {373}, m = "invokeSuspend", v = 1)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super File>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f95378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, long j8, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f95376b = context;
        this.f95377c = j8;
        this.f95378d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f95376b, this.f95377c, this.f95378d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super File> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95375a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            wVar.getClass();
            w.f95548b.getClass();
            this.f95375a = 1;
            obj = w.b(wVar, this.f95376b, this.f95377c, this);
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
        File file = (File) obj;
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, tn.k.g(this.f95378d, ".txt"));
        file2.createNewFile();
        w.f95547a.getClass();
        w.f95548b.getClass();
        return file2;
    }
}
