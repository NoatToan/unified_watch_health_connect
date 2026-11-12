package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class eie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Uri, a> f16678a;

    public static class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f16679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f16680b;
        public boolean c = true;

        public a(Context context, Uri uri) {
            this.f16679a = context;
            this.f16680b = uri;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (this.c) {
                this.c = false;
                return;
            }
            Logger logger = Logger.INSTANCE;
            Logger.d("LiveDataChangeDeliver", "provider data change: %s", this.f16680b);
            this.f16679a.getContentResolver().notifyChange(this.f16680b, null);
        }
    }

    public eie(int i) {
        this.f16678a = new ArrayMap(i);
    }

    public <T> void c(Context context, Uri uri, final LiveData<T> liveData) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(uri);
        Objects.requireNonNull(liveData);
        synchronized (this.f16678a) {
            try {
                if (this.f16678a.containsKey(uri)) {
                    return;
                }
                final a aVar = new a(context, uri);
                this.f16678a.put(uri, aVar);
                ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: die
                    @Override // java.lang.Runnable
                    public final void run() {
                        s6r.a(liveData, aVar);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
