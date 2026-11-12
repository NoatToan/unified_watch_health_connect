package androidx.emoji2.text;

import a8.l;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f7030j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile d f7031k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.b f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f7035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f7037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0099d f7038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.emoji2.text.b f7040i;

    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f7041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f7042c;

        public a(d dVar) {
            super(dVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f7043a;

        public b(d dVar) {
            this.f7043a = dVar;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f7044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7045b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.emoji2.text.b f7046c = new androidx.emoji2.text.b();

        public c(h hVar) {
            k7.h.e(hVar, "metadataLoader cannot be null.");
            this.f7044a = hVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0099d implements j {
    }

    public interface e {
    }

    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th3);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    public interface j {
    }

    private d(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7032a = reentrantReadWriteLock;
        this.f7034c = 3;
        cVar.getClass();
        this.f7037f = cVar.f7044a;
        int i14 = cVar.f7045b;
        this.f7039h = i14;
        this.f7040i = cVar.f7046c;
        this.f7035d = new Handler(Looper.getMainLooper());
        this.f7033b = new p1.b();
        this.f7038g = new C0099d();
        a aVar = new a(this);
        this.f7036e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i14 == 0) {
            try {
                this.f7034c = 0;
            } catch (Throwable th3) {
                this.f7032a.writeLock().unlock();
                throw th3;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            d dVar = aVar.f7043a;
            try {
                dVar.f7037f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th4) {
                dVar.g(th4);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (f7030j) {
            dVar = f7031k;
            k7.h.f(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static void d(EmojiCompatInitializer.a aVar) {
        if (f7031k == null) {
            synchronized (f7030j) {
                try {
                    if (f7031k == null) {
                        f7031k = new d(aVar);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static boolean e() {
        return f7031k != null;
    }

    public final int b(int i14, CharSequence charSequence) {
        androidx.emoji2.text.f fVar = this.f7036e.f7041b;
        fVar.getClass();
        if (i14 < 0 || i14 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a8.g[] gVarArr = (a8.g[]) spanned.getSpans(i14, i14 + 1, a8.g.class);
            if (gVarArr.length > 0) {
                return spanned.getSpanStart(gVarArr[0]);
            }
        }
        return ((androidx.emoji2.text.f.c) fVar.c(charSequence, Math.max(0, i14 - 16), Math.min(charSequence.length(), i14 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.f.c(i14))).f7059b;
    }

    public final int c() {
        this.f7032a.readLock().lock();
        try {
            return this.f7034c;
        } finally {
            this.f7032a.readLock().unlock();
        }
    }

    public final void f() {
        k7.h.f(this.f7039h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (c() == 1) {
            return;
        }
        this.f7032a.writeLock().lock();
        try {
            if (this.f7034c == 0) {
                this.f7032a.writeLock().unlock();
                return;
            }
            this.f7034c = 0;
            this.f7032a.writeLock().unlock();
            a aVar = this.f7036e;
            d dVar = aVar.f7043a;
            try {
                dVar.f7037f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th3) {
                dVar.g(th3);
            }
        } catch (Throwable th4) {
            this.f7032a.writeLock().unlock();
            throw th4;
        }
    }

    public final void g(Throwable th3) {
        ArrayList arrayList = new ArrayList();
        this.f7032a.writeLock().lock();
        try {
            this.f7034c = 2;
            arrayList.addAll(this.f7033b);
            this.f7033b.clear();
            this.f7032a.writeLock().unlock();
            this.f7035d.post(new g(arrayList, this.f7034c, th3));
        } catch (Throwable th4) {
            this.f7032a.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009e A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:48:0x008e, B:50:0x0098, B:52:0x009b, B:54:0x009e, B:56:0x00ae, B:57:0x00b1), top: B:93:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:48:0x008e, B:50:0x0098, B:52:0x009b, B:54:0x009e, B:56:0x00ae, B:57:0x00b1), top: B:93:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public final CharSequence h(int i14, int i15, int i16, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th3;
        int i17;
        int i18;
        a8.g[] gVarArr;
        int spanStart;
        k7.h.f(c() == 1, "Not initialized yet");
        if (i14 < 0) {
            vb.h.s("start cannot be negative");
            return null;
        }
        if (i15 < 0) {
            vb.h.s("end cannot be negative");
            return null;
        }
        k7.h.b(i14 <= i15, "start should be <= than end");
        l lVar = null;
        if (charSequence == null) {
            return null;
        }
        k7.h.b(i14 <= charSequence.length(), "start should be < than charSequence length");
        k7.h.b(i15 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i14 == i15) {
            return charSequence;
        }
        boolean z14 = i16 == 1;
        androidx.emoji2.text.f fVar = this.f7036e.f7041b;
        fVar.getClass();
        boolean z15 = charSequence instanceof a8.i;
        if (z15) {
            ((a8.i) charSequence).a();
        }
        if (z15) {
            lVar = new l((Spannable) charSequence);
            if (lVar != null) {
                for (a8.g gVar : gVarArr) {
                    spanStart = lVar.f1926b.getSpanStart(gVar);
                    int spanEnd = lVar.f1926b.getSpanEnd(gVar);
                    if (spanStart != i15) {
                        lVar.removeSpan(gVar);
                    }
                    i14 = Math.min(spanStart, i14);
                    i15 = Math.max(spanEnd, i15);
                }
            }
            i17 = i14;
            i18 = i15;
            if (i17 != i18) {
                charSequence2 = charSequence;
                if (!z15) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z15) {
                    return charSequence2;
                }
            }
            ((a8.i) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    lVar = new l((Spannable) charSequence);
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    th3 = th;
                    if (!z15) {
                        throw th3;
                    }
                    ((a8.i) charSequence2).b();
                    throw th3;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i14 - 1, i15 + 1, a8.g.class) <= i15) {
                lVar = new l(charSequence);
            }
            if (lVar != null && (gVarArr = (a8.g[]) lVar.f1926b.getSpans(i14, i15, a8.g.class)) != null && gVarArr.length > 0) {
                while (i < r3) {
                    spanStart = lVar.f1926b.getSpanStart(gVar);
                    int spanEnd2 = lVar.f1926b.getSpanEnd(gVar);
                    if (spanStart != i15) {
                        lVar.removeSpan(gVar);
                    }
                    i14 = Math.min(spanStart, i14);
                    i15 = Math.max(spanEnd2, i15);
                }
            }
            i17 = i14;
            i18 = i15;
            if (i17 != i18 || i17 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z15) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    l lVar2 = (l) fVar.c(charSequence2, i17, i18, Integer.MAX_VALUE, z14, new androidx.emoji2.text.f.a(lVar, fVar.f7051a));
                    if (lVar2 != null) {
                        Spannable spannable = lVar2.f1926b;
                        if (z15) {
                            ((a8.i) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z15) {
                        return charSequence2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    if (!z15) {
                        throw th3;
                    }
                    ((a8.i) charSequence2).b();
                    throw th3;
                }
            }
            ((a8.i) charSequence2).b();
            return charSequence2;
        } catch (Throwable th6) {
            th3 = th6;
            charSequence2 = charSequence;
        }
        if (!z15) {
            throw th3;
        }
        ((a8.i) charSequence2).b();
        throw th3;
    }

    public final void i(f fVar) {
        k7.h.e(fVar, "initCallback cannot be null");
        this.f7032a.writeLock().lock();
        try {
            if (this.f7034c == 1 || this.f7034c == 2) {
                this.f7035d.post(new g(fVar, this.f7034c));
            } else {
                this.f7033b.add(fVar);
            }
        } finally {
            this.f7032a.writeLock().unlock();
        }
    }

    public final void j(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.f7036e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        b8.b bVar = aVar.f7042c.f7079a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f16373b.getInt(iA + bVar.f16372a) : 0);
        Bundle bundle2 = editorInfo.extras;
        aVar.f7043a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7048b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(f fVar, int i14) {
            this(Arrays.asList(fVar), i14, null);
            k7.h.e(fVar, "initCallback cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f7047a;
            int size = arrayList.size();
            int i14 = 0;
            if (this.f7048b != 1) {
                while (i14 < size) {
                    ((f) arrayList.get(i14)).a();
                    i14++;
                }
            } else {
                while (i14 < size) {
                    ((f) arrayList.get(i14)).b();
                    i14++;
                }
            }
        }

        public g(Collection<f> collection, int i14) {
            this(collection, i14, null);
        }

        public g(Collection<f> collection, int i14, Throwable th3) {
            k7.h.e(collection, "initCallbacks cannot be null");
            this.f7047a = new ArrayList(collection);
            this.f7048b = i14;
        }
    }
}
