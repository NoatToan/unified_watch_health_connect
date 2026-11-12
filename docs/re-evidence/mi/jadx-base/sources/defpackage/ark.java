package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ark<Data> implements d7g<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7g<Uri, Data> f3385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3386b;

    public static final class a implements e7g<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3387a;

        public a(Resources resources) {
            this.f3387a = resources;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, AssetFileDescriptor> d(iag iagVar) {
            return new ark(this.f3387a, iagVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements e7g<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3388a;

        public b(Resources resources) {
            this.f3388a = resources;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, InputStream> d(iag iagVar) {
            return new ark(this.f3388a, iagVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements e7g<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3389a;

        public c(Resources resources) {
            this.f3389a = resources;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, Uri> d(iag iagVar) {
            return new ark(this.f3389a, faq.c());
        }
    }

    public ark(Resources resources, d7g<Uri, Data> d7gVar) {
        this.f3386b = resources;
        this.f3385a = d7gVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(Integer num, int i, int i2, cch cchVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f3385a.b(uriD, i, i2, cchVar);
    }

    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f3386b.getResourcePackageName(num.intValue()) + '/' + this.f3386b.getResourceTypeName(num.intValue()) + '/' + this.f3386b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            return null;
        }
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
