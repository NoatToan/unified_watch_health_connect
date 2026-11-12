package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class wt5 implements f93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static wt5 f38331a;

    public static synchronized wt5 f() {
        try {
            if (f38331a == null) {
                f38331a = new wt5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38331a;
    }

    @Override // defpackage.f93
    public c93 a(ImageRequest imageRequest, Object obj) {
        c93 c93Var;
        String name;
        b5i b5iVarG = imageRequest.g();
        if (b5iVarG != null) {
            c93 c93VarB = b5iVarG.b();
            name = b5iVarG.getClass().getName();
            c93Var = c93VarB;
        } else {
            c93Var = null;
            name = null;
        }
        return new xp2(e(imageRequest.q()).toString(), imageRequest.m(), imageRequest.o(), imageRequest.d(), c93Var, name, obj);
    }

    @Override // defpackage.f93
    public c93 b(ImageRequest imageRequest, Object obj) {
        return d(imageRequest, imageRequest.q(), obj);
    }

    @Override // defpackage.f93
    public c93 c(ImageRequest imageRequest, Object obj) {
        return new xp2(e(imageRequest.q()).toString(), imageRequest.m(), imageRequest.o(), imageRequest.d(), null, null, obj);
    }

    @Override // defpackage.f93
    public c93 d(ImageRequest imageRequest, Uri uri, Object obj) {
        return new icm(e(uri).toString());
    }

    public Uri e(Uri uri) {
        return uri;
    }
}
