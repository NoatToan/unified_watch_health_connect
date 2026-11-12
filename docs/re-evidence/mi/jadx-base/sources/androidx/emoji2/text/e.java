package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.e0a;
import defpackage.ekp;
import defpackage.g6i;
import defpackage.gb4;
import defpackage.j0a;
import defpackage.w5q;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.AbstractC0033c {
    public static final a j = new a();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {
        public Typeface a(Context context, j0a.b bVar) throws PackageManager.NameNotFoundException {
            return j0a.a(context, null, new j0a.b[]{bVar});
        }

        public j0a.a b(Context context, e0a e0aVar) throws PackageManager.NameNotFoundException {
            return j0a.b(context, null, e0aVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0a f2303b;
        public final a c;
        public final Object d = new Object();

        @GuardedBy("mLock")
        public Handler e;

        @GuardedBy("mLock")
        public Executor f;

        @GuardedBy("mLock")
        public ThreadPoolExecutor g;

        @GuardedBy("mLock")
        public c.h h;

        @GuardedBy("mLock")
        public ContentObserver i;

        @GuardedBy("mLock")
        public Runnable j;

        public b(Context context, e0a e0aVar, a aVar) {
            g6i.h(context, "Context cannot be null");
            g6i.h(e0aVar, "FontRequest cannot be null");
            this.f2302a = context.getApplicationContext();
            this.f2303b = e0aVar;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.c.g
        @RequiresApi(19)
        public void a(c.h hVar) {
            g6i.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.f2302a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @RequiresApi(19)
        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        j0a.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            ekp.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.c.a(this.f2302a, bVarE);
                            ByteBuffer byteBufferE = w5q.e(this.f2302a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            ekp.b();
                            synchronized (this.d) {
                                try {
                                    c.h hVar = this.h;
                                    if (hVar != null) {
                                        hVar.b(fVarB);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            ekp.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.d) {
                            try {
                                c.h hVar2 = this.h;
                                if (hVar2 != null) {
                                    hVar2.a(th3);
                                }
                                b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        @RequiresApi(19)
        public void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = gb4.b("emojiCompat");
                        this.g = threadPoolExecutorB;
                        this.f = threadPoolExecutorB;
                    }
                    this.f.execute(new Runnable() { // from class: f0a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17257a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final j0a.b e() {
            try {
                j0a.a aVarB = this.c.b(this.f2302a, this.f2303b);
                if (aVarB.c() == 0) {
                    j0a.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public e(Context context, e0a e0aVar) {
        super(new b(context, e0aVar, j));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
