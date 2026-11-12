package ne0;

import android.content.Context;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import lc.u0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.UploadDogPhotoUseCase$invoke$2", f = "UploadDogPhotoUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f125497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f125498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f125499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f125500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, Context context, Uri uri, long j8, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f125497c = j0Var;
        this.f125498d = context;
        this.f125499e = uri;
        this.f125500f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f125497c, this.f125498d, this.f125499e, this.f125500f, dVar);
        k0Var.f125496b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objO0;
        j0 j0Var = this.f125497c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125495a;
        if (i14 == 0) {
            o13.r.b(obj);
            try {
                MultipartBody.Part partA = j0.a(j0Var, this.f125498d, this.f125499e);
                me0.w wVar = j0Var.f125482a;
                this.f125496b = null;
                this.f125495a = 1;
                me0.v vVar = new me0.v(wVar, this.f125500f, partA, null);
                int i15 = com.garmin.android.apps.connectmobile.f0.O;
                objO0 = wVar.O0(3, 5000L, vVar, this);
                if (objO0 == aVar) {
                    return aVar;
                }
            } catch (Exception e4) {
                a2 a2Var = a2.GENERAL;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to process dog photo before upload: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "UploadDogPhotoUseCase", strD);
                return new v2.a(e4, null, null, 6, null);
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objO0 = obj;
        }
        v2 v2Var = (v2) objO0;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            je0.m mVar = (je0.m) p13.h0.d0(((je0.k) bVar.f47386a).f98548b);
            String str = mVar != null ? mVar.f98555b : null;
            return str != null ? new v2.b(str, bVar.f47387b, null, null, 12, null) : new v2.a(new IOException("Photo upload response did not contain a usable photo URL"), null, null, 6, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }
}
