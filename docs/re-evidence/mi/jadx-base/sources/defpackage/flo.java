package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class flo<Data> implements d7g<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7g<Uri, Data> f17903a;

    public static final class a implements e7g<String, AssetFileDescriptor> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<String, AssetFileDescriptor> d(iag iagVar) {
            return new flo(iagVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements e7g<String, ParcelFileDescriptor> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<String, ParcelFileDescriptor> d(iag iagVar) {
            return new flo(iagVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements e7g<String, InputStream> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<String, InputStream> d(iag iagVar) {
            return new flo(iagVar.d(Uri.class, InputStream.class));
        }
    }

    public flo(d7g<Uri, Data> d7gVar) {
        this.f17903a = d7gVar;
    }

    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(String str, int i, int i2, cch cchVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f17903a.a(uriE)) {
            return null;
        }
        return this.f17903a.b(uriE, i, i2, cchVar);
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }
}
