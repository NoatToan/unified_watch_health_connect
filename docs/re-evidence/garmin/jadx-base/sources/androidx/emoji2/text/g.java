package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import i7.k;
import i7.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class g extends d.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7070d = new a();

    public static class a {
    }

    public static class b implements d.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i7.e f7072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f7073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f7074d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f7075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ThreadPoolExecutor f7076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f7077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d.i f7078h;

        public b(Context context, i7.e eVar, a aVar) {
            k7.h.e(context, "Context cannot be null");
            k7.h.e(eVar, "FontRequest cannot be null");
            this.f7071a = context.getApplicationContext();
            this.f7072b = eVar;
            this.f7073c = aVar;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.f7074d) {
                this.f7078h = iVar;
            }
            synchronized (this.f7074d) {
                try {
                    if (this.f7078h == null) {
                        return;
                    }
                    if (this.f7076f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a8.a("emojiCompat", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f7077g = threadPoolExecutor;
                        this.f7076f = threadPoolExecutor;
                    }
                    this.f7076f.execute(new a0.c(this, 2));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void b() {
            synchronized (this.f7074d) {
                try {
                    this.f7078h = null;
                    Handler handler = this.f7075e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f7075e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f7077g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f7076f = null;
                    this.f7077g = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final l c() {
            try {
                a aVar = this.f7073c;
                Context context = this.f7071a;
                i7.e eVar = this.f7072b;
                aVar.getClass();
                Object[] objArr = {eVar};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                k kVarA = i7.d.a(context, Collections.unmodifiableList(arrayList));
                int i14 = kVarA.f91935a;
                if (i14 != 0) {
                    kg.f.n(e0.f(i14, "fetchFonts failed (", ")"));
                    return null;
                }
                l[] lVarArr = kVarA.f91936b.get(0);
                if (lVarArr != null && lVarArr.length != 0) {
                    return lVarArr[0];
                }
                kg.f.n("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e4) {
                q2.v("provider not found", e4);
                return null;
            }
        }
    }

    public g(Context context, i7.e eVar) {
        super(new b(context, eVar, f7070d));
    }

    public g(Context context, i7.e eVar, a aVar) {
        super(new b(context, eVar, aVar));
    }
}
