package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class z07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z07 f40743a;

    public z07(z07 z07Var) {
        this.f40743a = z07Var;
    }

    public static z07 f(File file) {
        return new acj(null, file);
    }

    public static z07 g(Context context, Uri uri) {
        return new fem(null, context, uri);
    }

    public static z07 h(Context context, Uri uri) {
        return new s1q(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public abstract z07 a(String str);

    public abstract z07 b(String str, String str2);

    public abstract boolean c();

    public abstract boolean d();

    public z07 e(String str) {
        for (z07 z07Var : m()) {
            if (str.equals(z07Var.i())) {
                return z07Var;
            }
        }
        return null;
    }

    public abstract String i();

    public abstract String j();

    public abstract Uri k();

    public abstract boolean l();

    public abstract z07[] m();
}
