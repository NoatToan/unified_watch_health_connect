package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class fem extends z07 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17711b;
    public Uri c;

    public fem(z07 z07Var, Context context, Uri uri) {
        super(z07Var);
        this.f17711b = context;
        this.c = uri;
    }

    @Override // defpackage.z07
    public z07 a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.z07
    public z07 b(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.z07
    public boolean c() {
        try {
            return DocumentsContract.deleteDocument(this.f17711b.getContentResolver(), this.c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.z07
    public boolean d() {
        return a17.b(this.f17711b, this.c);
    }

    @Override // defpackage.z07
    public String i() {
        return a17.c(this.f17711b, this.c);
    }

    @Override // defpackage.z07
    public String j() {
        return a17.e(this.f17711b, this.c);
    }

    @Override // defpackage.z07
    public Uri k() {
        return this.c;
    }

    @Override // defpackage.z07
    public boolean l() {
        return a17.f(this.f17711b, this.c);
    }

    @Override // defpackage.z07
    public z07[] m() {
        throw new UnsupportedOperationException();
    }
}
