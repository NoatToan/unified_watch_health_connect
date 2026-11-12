package ne0;

import android.content.Context;
import android.net.Uri;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lne0/j0;", "", "Lme0/w;", "dogsRepository", "<init>", "(Lme0/w;)V", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f125481c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me0.w f125482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f125483b;

    static {
        new a(null);
    }

    public j0(me0.w wVar) {
        wVar.getClass();
        this.f125482a = wVar;
        this.f125483b = o13.m.b(new n61.h(20));
    }

    public static final MultipartBody.Part a(j0 j0Var, Context context, Uri uri) throws Exception {
        bq0.c cVar = (bq0.c) j0Var.f125483b.getValue();
        bq0.k kVar = new bq0.k(uri, "photo", "jpg", 0.0d);
        int i14 = bq0.c.f19481c;
        zp0.f fVarA = cVar.a(context, kVar, null);
        return MultipartBody.Part.INSTANCE.createFormData("photo", "photo.".concat(fVarA.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVarA.f206588a, qe0.a.f144523a, 0, 0, 6, (Object) null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lne0/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
