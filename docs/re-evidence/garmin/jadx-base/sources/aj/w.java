package aj;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class w<Data> implements o<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f3405a;

    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // aj.p
        public final o<String, AssetFileDescriptor> d(s sVar) {
            return new w(sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // aj.p
        public final o<String, ParcelFileDescriptor> d(s sVar) {
            return new w(sVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<String, InputStream> {
        @Override // aj.p
        public final o<String, InputStream> d(s sVar) {
            return new w(sVar.c(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f3405a = oVar;
    }

    @Override // aj.o
    public final o.a a(String str, int i14, int i15, ui.h hVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            o<Uri, Data> oVar = this.f3405a;
            if (oVar.b(uriFromFile)) {
                return oVar.a(uriFromFile, i14, i15, hVar);
            }
        }
        return null;
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}
