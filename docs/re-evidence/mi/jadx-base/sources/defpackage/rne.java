package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rne<T> implements jl5<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f32722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f32723b;
    public T c;

    public rne(ContentResolver contentResolver, Uri uri) {
        this.f32723b = contentResolver;
        this.f32722a = uri;
    }

    @Override // defpackage.jl5
    public void b() {
        T t = this.c;
        if (t != null) {
            try {
                e(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.jl5
    public final void c(Priority priority, jl5.a<? super T> aVar) {
        try {
            T tF = f(this.f32722a, this.f32723b);
            this.c = tF;
            aVar.e(tF);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.f(e);
        }
    }

    @Override // defpackage.jl5
    public void cancel() {
    }

    @Override // defpackage.jl5
    public DataSource d() {
        return DataSource.LOCAL;
    }

    public abstract void e(T t) throws IOException;

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
