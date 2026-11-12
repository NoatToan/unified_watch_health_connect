package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class s1q extends z07 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f33180b;
    public Uri c;

    public s1q(z07 z07Var, Context context, Uri uri) {
        super(z07Var);
        this.f33180b = context;
        this.c = uri;
    }

    public static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static Uri o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.z07
    public z07 a(String str) {
        Uri uriO = o(this.f33180b, this.c, "vnd.android.document/directory", str);
        if (uriO != null) {
            return new s1q(this, this.f33180b, uriO);
        }
        return null;
    }

    @Override // defpackage.z07
    public z07 b(String str, String str2) {
        Uri uriO = o(this.f33180b, this.c, str, str2);
        if (uriO != null) {
            return new s1q(this, this.f33180b, uriO);
        }
        return null;
    }

    @Override // defpackage.z07
    public boolean c() {
        try {
            return DocumentsContract.deleteDocument(this.f33180b.getContentResolver(), this.c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.z07
    public boolean d() {
        return a17.b(this.f33180b, this.c);
    }

    @Override // defpackage.z07
    public String i() {
        return a17.c(this.f33180b, this.c);
    }

    @Override // defpackage.z07
    public String j() {
        return a17.e(this.f33180b, this.c);
    }

    @Override // defpackage.z07
    public Uri k() {
        return this.c;
    }

    @Override // defpackage.z07
    public boolean l() {
        return a17.f(this.f33180b, this.c);
    }

    @Override // defpackage.z07
    public z07[] m() {
        ContentResolver contentResolver = this.f33180b.getContentResolver();
        Uri uri = this.c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.c, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed query: ");
                sb.append(e);
            }
            n(cursorQuery);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            z07[] z07VarArr = new z07[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                z07VarArr[i] = new s1q(this, this.f33180b, uriArr[i]);
            }
            return z07VarArr;
        } catch (Throwable th) {
            n(cursorQuery);
            throw th;
        }
    }
}
