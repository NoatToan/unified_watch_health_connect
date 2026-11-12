package aj;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f3321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0057a<Data> f3322b;

    /* JADX INFO: renamed from: aj.a$a, reason: collision with other inner class name */
    public interface InterfaceC0057a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0057a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f3323a;

        public b(AssetManager assetManager) {
            this.f3323a = assetManager;
        }

        @Override // aj.a.InterfaceC0057a
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // aj.p
        public final o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.f3323a, this);
        }
    }

    public static class c implements p<Uri, InputStream>, InterfaceC0057a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f3324a;

        public c(AssetManager assetManager) {
            this.f3324a = assetManager;
        }

        @Override // aj.a.InterfaceC0057a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // aj.p
        public final o<Uri, InputStream> d(s sVar) {
            return new a(this.f3324a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0057a<Data> interfaceC0057a) {
        this.f3321a = assetManager;
        this.f3322b = interfaceC0057a;
    }

    @Override // aj.o
    public final o.a a(Uri uri, int i14, int i15, ui.h hVar) {
        Uri uri2 = uri;
        return new o.a(new pj.d(uri2), this.f3322b.a(this.f3321a, uri2.toString().substring(22)));
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
