package l52;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$uploadAudioNote$2", f = "WorkoutsRepositoryImpl.kt", l = {250}, m = "invokeSuspend", v = 2)
public final class u1 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f110367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f110368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(File file, z zVar, t13.d<? super u1> dVar) {
        super(1, dVar);
        this.f110367b = file;
        this.f110368c = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u1(this.f110367b, this.f110368c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.a>> dVar) {
        return ((u1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110366a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType mediaType = gz0.a.f80407g;
        File file = this.f110367b;
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.a>> i0VarK = this.f110368c.f110390a.k(MultipartBody.Part.INSTANCE.createFormData("file", file.getName(), companion.create(file, mediaType)));
        this.f110366a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
