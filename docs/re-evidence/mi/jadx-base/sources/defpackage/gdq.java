package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class gdq<Data> implements d7g<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f18864b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", MiuiCursorConstants.CONTENT, "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Data> f18865a;

    public static final class a implements e7g<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f18866a;

        public a(ContentResolver contentResolver) {
            this.f18866a = contentResolver;
        }

        @Override // gdq.c
        public jl5<AssetFileDescriptor> a(Uri uri) {
            return new tk1(this.f18866a, uri);
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, AssetFileDescriptor> d(iag iagVar) {
            return new gdq(this);
        }
    }

    public static class b implements e7g<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f18867a;

        public b(ContentResolver contentResolver) {
            this.f18867a = contentResolver;
        }

        @Override // gdq.c
        public jl5<ParcelFileDescriptor> a(Uri uri) {
            return new pl9(this.f18867a, uri);
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, ParcelFileDescriptor> d(iag iagVar) {
            return new gdq(this);
        }
    }

    public interface c<Data> {
        jl5<Data> a(Uri uri);
    }

    public static class d implements e7g<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f18868a;

        public d(ContentResolver contentResolver) {
            this.f18868a = contentResolver;
        }

        @Override // gdq.c
        public jl5<InputStream> a(Uri uri) {
            return new uio(this.f18868a, uri);
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new gdq(this);
        }
    }

    public gdq(c<Data> cVar) {
        this.f18865a = cVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(Uri uri, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(uri), this.f18865a.a(uri));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f18864b.contains(uri.getScheme());
    }
}
