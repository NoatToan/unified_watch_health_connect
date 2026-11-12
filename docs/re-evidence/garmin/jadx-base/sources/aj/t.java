package aj;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public class t<Data> implements o<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f3395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3396b;

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3397a;

        public a(Resources resources) {
            this.f3397a = resources;
        }

        @Override // aj.p
        public final o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f3397a, sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3398a;

        public b(Resources resources) {
            this.f3398a = resources;
        }

        @Override // aj.p
        public final o<Integer, InputStream> d(s sVar) {
            return new t(this.f3398a, sVar.c(Uri.class, InputStream.class));
        }
    }

    public static class c implements p<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3399a;

        public c(Resources resources) {
            this.f3399a = resources;
        }

        @Override // aj.p
        public final o<Integer, Uri> d(s sVar) {
            return new t(this.f3399a, x.f3406a);
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f3396b = resources;
        this.f3395a = oVar;
    }

    @Override // aj.o
    public final o.a a(Integer num, int i14, int i15, ui.h hVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f3396b.getResourcePackageName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + num2);
        } catch (Resources.NotFoundException unused) {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f3395a.a(uri, i14, i15, hVar);
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}
