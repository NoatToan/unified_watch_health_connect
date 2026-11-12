package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ths {
    public static volatile ths e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, jhs> f34717b = new HashMap<>();
    public ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final ArrayList<a> d = new ArrayList<>();

    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34718a;
        public String c;
        public WeakReference<Context> d;
        public a g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public jhs f34719b = null;
        public Random e = new Random();
        public int f = 0;

        public a(String str) {
            this.c = str;
        }

        public SQLiteDatabase a() {
            return this.f34719b.getWritableDatabase();
        }

        public Object b() {
            return null;
        }

        public String c() {
            return this.c;
        }

        public void d(Context context) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.f(context, b());
            }
            h(context);
        }

        public abstract void e(Context context, SQLiteDatabase sQLiteDatabase);

        public void f(Context context, Object obj) {
            ths.b(context).d(this);
        }

        public void g(a aVar) {
            this.g = aVar;
        }

        public void h(Context context) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.d;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f34719b == null || TextUtils.isEmpty(this.c)) {
                return;
            }
            File file = new File(this.c);
            hft.b(context, new File(file.getParentFile(), mcs.d(file.getAbsolutePath())), new bis(this, context));
        }
    }

    public static abstract class b<T> extends a {
        public List<String> h;
        public String i;
        public String[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f34720k;
        public String l;
        public String m;
        public int n;
        public List<T> o;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.o = new ArrayList();
            this.h = list;
            this.i = str2;
            this.j = strArr;
            this.f34720k = str3;
            this.l = str4;
            this.m = str5;
            this.n = i;
        }

        @Override // ths.a
        public SQLiteDatabase a() {
            return this.f34719b.getReadableDatabase();
        }

        @Override // ths.a
        public void e(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.o.clear();
            List<String> list = this.h;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.h.size()];
                this.h.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.n;
            Cursor cursorQuery = sQLiteDatabase.query(this.f34718a, strArr, this.i, this.j, this.f34720k, this.l, this.m, i > 0 ? String.valueOf(i) : null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    T tI = i(context, cursorQuery);
                    if (tI != null) {
                        this.o.add(tI);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            j(context, this.o);
        }

        public abstract T i(Context context, Cursor cursor);

        public abstract void j(Context context, List<T> list);
    }

    public static class c extends a {
        public String h;
        public String[] i;

        public c(String str, String str2, String[] strArr) {
            super(str);
            this.h = str2;
            this.i = strArr;
        }

        @Override // ths.a
        public void e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f34718a, this.h, this.i);
        }
    }

    public static class d extends a {
        public ContentValues h;

        public d(String str, ContentValues contentValues) {
            super(str);
            this.h = contentValues;
        }

        @Override // ths.a
        public void e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f34718a, null, this.h);
        }
    }

    public ths(Context context) {
        this.f34716a = context;
    }

    public static ths b(Context context) {
        if (e == null) {
            synchronized (ths.class) {
                try {
                    if (e == null) {
                        e = new ths(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final jhs a(String str) {
        jhs jhsVar = this.f34717b.get(str);
        if (jhsVar == null) {
            synchronized (this.f34717b) {
                try {
                    if (jhsVar == null) {
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jhsVar;
    }

    public String c(String str) {
        return a(str).a();
    }

    public void d(a aVar) {
        if (aVar != null) {
            throw new IllegalStateException("should exec init method first!");
        }
    }

    public void e(Runnable runnable) {
        if (this.c.isShutdown()) {
            return;
        }
        this.c.execute(runnable);
    }
}
