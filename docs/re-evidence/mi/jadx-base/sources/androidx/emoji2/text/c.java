package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import defpackage.a98;
import defpackage.g6i;
import defpackage.x5q;
import defpackage.z88;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final Object n = new Object();
    public static final Object o = new Object();

    @GuardedBy("INSTANCE_LOCK")
    public static volatile c p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mInitLock")
    public final Set<e> f2289b;
    public final b e;
    public final g f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2290k;
    public final int l;
    public final d m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f2288a = new ReentrantReadWriteLock();

    @GuardedBy("mInitLock")
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    @RequiresApi(19)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.d f2291b;
        public volatile androidx.emoji2.text.f c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0032a extends h {
            public C0032a() {
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                a.this.f2293a.m(th);
            }

            @Override // androidx.emoji2.text.c.h
            public void b(androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.f2293a.f.a(new C0032a());
            } catch (Throwable th) {
                this.f2293a.m(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2291b.h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2293a.g);
        }

        public void d(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f2293a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = fVar;
            androidx.emoji2.text.f fVar2 = this.c;
            i iVar = new i();
            d dVar = this.f2293a.m;
            c cVar = this.f2293a;
            this.f2291b = new androidx.emoji2.text.d(fVar2, iVar, dVar, cVar.h, cVar.i);
            this.f2293a.n();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2293a;

        public b(c cVar) {
            this.f2293a = cVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0033c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f2294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2295b;
        public boolean c;
        public int[] d;
        public Set<e> e;
        public boolean f;
        public int g = -16711936;
        public int h = 0;
        public d i = new androidx.emoji2.text.b();

        public AbstractC0033c(g gVar) {
            g6i.h(gVar, "metadataLoader cannot be null.");
            this.f2294a = gVar;
        }

        public final g a() {
            return this.f2294a;
        }

        public AbstractC0033c b(int i) {
            this.h = i;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e> f2296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f2297b;
        public final int c;

        public f(e eVar, int i) {
            this(Arrays.asList((e) g6i.h(eVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2296a.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    this.f2296a.get(i).a(this.f2297b);
                    i++;
                }
            } else {
                while (i < size) {
                    this.f2296a.get(i).b();
                    i++;
                }
            }
        }

        public f(Collection<e> collection, int i) {
            this(collection, i, null);
        }

        public f(Collection<e> collection, int i, Throwable th) {
            g6i.h(collection, "initCallbacks cannot be null");
            this.f2296a = new ArrayList(collection);
            this.c = i;
            this.f2297b = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class i {
        public a98 a(z88 z88Var) {
            return new x5q(z88Var);
        }
    }

    public c(AbstractC0033c abstractC0033c) {
        this.g = abstractC0033c.f2295b;
        this.h = abstractC0033c.c;
        this.i = abstractC0033c.d;
        this.j = abstractC0033c.f;
        this.f2290k = abstractC0033c.g;
        this.f = abstractC0033c.f2294a;
        this.l = abstractC0033c.h;
        this.m = abstractC0033c.i;
        ArraySet arraySet = new ArraySet();
        this.f2289b = arraySet;
        Set<e> set = abstractC0033c.e;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(abstractC0033c.e);
        }
        this.e = new a(this);
        l();
    }

    public static c b() {
        c cVar;
        synchronized (n) {
            cVar = p;
            g6i.j(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        return androidx.emoji2.text.d.c(inputConnection, editable, i2, i3, z);
    }

    public static boolean f(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.d(editable, i2, keyEvent);
    }

    public static c g(AbstractC0033c abstractC0033c) {
        c cVar = p;
        if (cVar == null) {
            synchronized (n) {
                try {
                    cVar = p;
                    if (cVar == null) {
                        cVar = new c(abstractC0033c);
                        p = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cVar;
    }

    public static boolean h() {
        return p != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int c() {
        return this.f2290k;
    }

    public int d() {
        this.f2288a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f2288a.readLock().unlock();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean i() {
        return this.j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        g6i.j(this.l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f2288a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.f2288a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.f2288a.writeLock().unlock();
            this.e.a();
        } catch (Throwable th) {
            this.f2288a.writeLock().unlock();
            throw th;
        }
    }

    public final void l() {
        this.f2288a.writeLock().lock();
        try {
            if (this.l == 0) {
                this.c = 0;
            }
            this.f2288a.writeLock().unlock();
            if (d() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.f2288a.writeLock().unlock();
            throw th;
        }
    }

    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2288a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f2289b);
            this.f2289b.clear();
            this.f2288a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f2288a.writeLock().unlock();
            throw th2;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f2288a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.f2289b);
            this.f2289b.clear();
            this.f2288a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c));
        } catch (Throwable th) {
            this.f2288a.writeLock().unlock();
            throw th;
        }
    }

    @CheckResult
    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @CheckResult
    public CharSequence p(CharSequence charSequence, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return q(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    @CheckResult
    public CharSequence q(CharSequence charSequence, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        return r(charSequence, i2, i3, i4, 0);
    }

    @CheckResult
    public CharSequence r(CharSequence charSequence, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, int i5) {
        boolean z;
        g6i.j(j(), "Not initialized yet");
        g6i.e(i2, "start cannot be negative");
        g6i.e(i3, "end cannot be negative");
        g6i.e(i4, "maxEmojiCount cannot be negative");
        g6i.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        g6i.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        g6i.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.g : false;
        } else {
            z = true;
        }
        return this.e.b(charSequence, i2, i3, i4, z);
    }

    public void s(e eVar) {
        g6i.h(eVar, "initCallback cannot be null");
        this.f2288a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new f(eVar, this.c));
            } else {
                this.f2289b.add(eVar);
            }
        } finally {
            this.f2288a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        g6i.h(eVar, "initCallback cannot be null");
        this.f2288a.writeLock().lock();
        try {
            this.f2289b.remove(eVar);
        } finally {
            this.f2288a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.c(editorInfo);
    }
}
