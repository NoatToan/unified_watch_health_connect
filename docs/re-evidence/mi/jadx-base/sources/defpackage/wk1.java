package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wk1<T> implements jl5<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f38048b;
    public T c;

    public wk1(AssetManager assetManager, String str) {
        this.f38048b = assetManager;
        this.f38047a = str;
    }

    @Override // defpackage.jl5
    public void b() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            e(t);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.jl5
    public void c(Priority priority, jl5.a<? super T> aVar) {
        try {
            T tF = f(this.f38048b, this.f38047a);
            this.c = tF;
            aVar.e(tF);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
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

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
