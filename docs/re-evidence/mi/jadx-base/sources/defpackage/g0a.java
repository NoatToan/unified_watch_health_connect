package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class g0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache<String, Typeface> f18417a = new LruCache<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f18418b = kok.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();

    @GuardedBy("LOCK")
    public static final SimpleArrayMap<String, ArrayList<Consumer<e>>> d = new SimpleArrayMap<>();

    public class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18420b;
        public final /* synthetic */ e0a c;
        public final /* synthetic */ int d;

        public a(String str, Context context, e0a e0aVar, int i) {
            this.f18419a = str;
            this.f18420b = context;
            this.c = e0aVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return g0a.c(this.f18419a, this.f18420b, this.c, this.d);
        }
    }

    public class b implements Consumer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ db3 f18421a;

        public b(db3 db3Var) {
            this.f18421a = db3Var;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f18421a.b(eVar);
        }
    }

    public class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18423b;
        public final /* synthetic */ e0a c;
        public final /* synthetic */ int d;

        public c(String str, Context context, e0a e0aVar, int i) {
            this.f18422a = str;
            this.f18423b = context;
            this.c = e0aVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g0a.c(this.f18422a, this.f18423b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements Consumer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18424a;

        public d(String str) {
            this.f18424a = str;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g0a.c) {
                try {
                    SimpleArrayMap<String, ArrayList<Consumer<e>>> simpleArrayMap = g0a.d;
                    ArrayList<Consumer<e>> arrayList = simpleArrayMap.get(this.f18424a);
                    if (arrayList == null) {
                        return;
                    }
                    simpleArrayMap.remove(this.f18424a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(e0a e0aVar, int i) {
        return e0aVar.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(j0a.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        j0a.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i = 0;
            for (j0a.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, e0a e0aVar, int i) {
        LruCache<String, Typeface> lruCache = f18417a;
        Typeface typeface = lruCache.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            j0a.a aVarE = d0a.e(context, e0aVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = q5q.b(context, null, aVarE.b(), i);
            if (typefaceB == null) {
                return new e(-3);
            }
            lruCache.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, e0a e0aVar, int i, Executor executor, db3 db3Var) {
        String strA = a(e0aVar, i);
        Typeface typeface = f18417a.get(strA);
        if (typeface != null) {
            db3Var.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(db3Var);
        synchronized (c) {
            try {
                SimpleArrayMap<String, ArrayList<Consumer<e>>> simpleArrayMap = d;
                ArrayList<Consumer<e>> arrayList = simpleArrayMap.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<Consumer<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                simpleArrayMap.put(strA, arrayList2);
                c cVar = new c(strA, context, e0aVar, i);
                if (executor == null) {
                    executor = f18418b;
                }
                kok.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, e0a e0aVar, db3 db3Var, int i, int i2) {
        String strA = a(e0aVar, i);
        Typeface typeface = f18417a.get(strA);
        if (typeface != null) {
            db3Var.b(new e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            e eVarC = c(strA, context, e0aVar, i);
            db3Var.b(eVarC);
            return eVarC.f18425a;
        }
        try {
            e eVar = (e) kok.c(f18418b, new a(strA, context, e0aVar, i), i2);
            db3Var.b(eVar);
            return eVar.f18425a;
        } catch (InterruptedException unused) {
            db3Var.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f18425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18426b;

        public e(int i) {
            this.f18425a = null;
            this.f18426b = i;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f18426b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f18425a = typeface;
            this.f18426b = 0;
        }
    }
}
