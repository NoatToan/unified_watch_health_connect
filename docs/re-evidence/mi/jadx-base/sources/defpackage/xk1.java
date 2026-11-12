package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import coil.util.Utils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class xk1<Data> implements d7g<Uri, Data> {
    public static final int c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f39202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Data> f39203b;

    public interface a<Data> {
        jl5<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements e7g<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f39204a;

        public b(AssetManager assetManager) {
            this.f39204a = assetManager;
        }

        @Override // xk1.a
        public jl5<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new ol9(assetManager, str);
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, AssetFileDescriptor> d(iag iagVar) {
            return new xk1(this.f39204a, this);
        }
    }

    public static class c implements e7g<Uri, InputStream>, a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f39205a;

        public c(AssetManager assetManager) {
            this.f39205a = assetManager;
        }

        @Override // xk1.a
        public jl5<InputStream> a(AssetManager assetManager, String str) {
            return new oio(assetManager, str);
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new xk1(this.f39205a, this);
        }
    }

    public xk1(AssetManager assetManager, a<Data> aVar) {
        this.f39202a = assetManager;
        this.f39203b = aVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(Uri uri, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(uri), this.f39203b.a(this.f39202a, uri.toString().substring(c)));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && Utils.ASSET_FILE_PATH_ROOT.equals(uri.getPathSegments().get(0));
    }
}
