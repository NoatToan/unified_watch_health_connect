package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.l;
import androidx.media3.common.x;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import fa.k;
import fa.z;
import ja.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k32.n;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f8851y = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f8852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.g.b f8853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f8854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f8855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f8859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f8860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f8861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f8862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f8863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<e> f8864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<DefaultDrmSession> f8865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.media3.exoplayer.drm.g f8867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DefaultDrmSession f8868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DefaultDrmSession f8869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f8870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f8871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f8872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f8873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile d f8874x;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f8875a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f8876b = androidx.media3.common.h.f8299d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public kg.f f8877c = h.f8906d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f8878d = new int[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8879e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.a f8880f = new androidx.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f8881g = 300000;
    }

    public class c {
        private c() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f8863m) {
                defaultDrmSession.j();
                if (Arrays.equals(defaultDrmSession.f8839v, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f8822e == 0 && defaultDrmSession.f8833p == 4) {
                        int i14 = z.f70071a;
                        defaultDrmSession.c(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class e implements androidx.media3.exoplayer.drm.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.b.a f8884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DrmSession f8885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8886c;

        public e(androidx.media3.exoplayer.drm.b.a aVar) {
            this.f8884a = aVar;
        }

        @Override // androidx.media3.exoplayer.drm.c.b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f8871u;
            handler.getClass();
            z.R(handler, new n(this, 6));
        }
    }

    public class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f8888a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DefaultDrmSession f8889b;

        public f(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z14) {
            this.f8889b = null;
            HashSet hashSet = this.f8888a;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) hashSet);
            hashSet.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                defaultDrmSession.getClass();
                defaultDrmSession.e(z14 ? 1 : 3, exc);
            }
        }

        public final void b(DefaultDrmSession defaultDrmSession) {
            this.f8888a.add(defaultDrmSession);
            if (this.f8889b != null) {
                return;
            }
            this.f8889b = defaultDrmSession;
            androidx.media3.exoplayer.drm.g.c provisionRequest = defaultDrmSession.f8819b.getProvisionRequest();
            defaultDrmSession.f8842y = provisionRequest;
            DefaultDrmSession.c cVar = defaultDrmSession.f8836s;
            int i14 = z.f70071a;
            provisionRequest.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new DefaultDrmSession.d(sa.i.f158115c.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
        }
    }

    public class g implements DefaultDrmSession.b {
        private g() {
        }
    }

    private DefaultDrmSessionManager(UUID uuid, androidx.media3.exoplayer.drm.g.b bVar, j jVar, HashMap<String, String> map, boolean z14, int[] iArr, boolean z15, androidx.media3.exoplayer.upstream.b bVar2, long j8) {
        uuid.getClass();
        fa.a.b(!androidx.media3.common.h.f8297b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f8852b = uuid;
        this.f8853c = bVar;
        this.f8854d = jVar;
        this.f8855e = map;
        this.f8856f = z14;
        this.f8857g = iArr;
        this.f8858h = z15;
        this.f8860j = bVar2;
        this.f8859i = new f(this);
        this.f8861k = new g();
        this.f8863m = new ArrayList();
        this.f8864n = Sets.newIdentityHashSet();
        this.f8865o = Sets.newIdentityHashSet();
        this.f8862l = j8;
    }

    public static boolean f(DefaultDrmSession defaultDrmSession) {
        defaultDrmSession.j();
        if (defaultDrmSession.f8833p != 1) {
            return false;
        }
        DrmSession.DrmSessionException error = defaultDrmSession.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || androidx.media3.exoplayer.drm.d.c(cause);
    }

    public static ArrayList i(l lVar, UUID uuid, boolean z14) {
        ArrayList arrayList = new ArrayList(lVar.f8341d);
        for (int i14 = 0; i14 < lVar.f8341d; i14++) {
            l.b bVar = lVar.f8338a[i14];
            if ((bVar.b(uuid) || (androidx.media3.common.h.f8298c.equals(uuid) && bVar.b(androidx.media3.common.h.f8297b))) && (bVar.f8346e != null || z14)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.drm.c
    public final int a(androidx.media3.common.q qVar) {
        k(false);
        androidx.media3.exoplayer.drm.g gVar = this.f8867q;
        gVar.getClass();
        int cryptoType = gVar.getCryptoType();
        l lVar = qVar.f8390r;
        if (lVar == null) {
            int iH = x.h(qVar.f8386n);
            int i14 = z.f70071a;
            int i15 = 0;
            while (true) {
                int[] iArr = this.f8857g;
                if (i15 >= iArr.length) {
                    i15 = -1;
                    break;
                }
                if (iArr[i15] == iH) {
                    break;
                }
                i15++;
            }
            if (i15 == -1) {
                return 0;
            }
        } else if (this.f8872v == null) {
            UUID uuid = this.f8852b;
            if (i(lVar, uuid, true).isEmpty()) {
                if (lVar.f8341d == 1 && lVar.f8338a[0].b(androidx.media3.common.h.f8297b)) {
                    k.g("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = lVar.f8340c;
            if (str != null && !C.CENC_TYPE_cenc.equals(str) && (!C.CENC_TYPE_cbcs.equals(str) ? C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) : z.f70071a < 25)) {
                return 1;
            }
        }
        return cryptoType;
    }

    @Override // androidx.media3.exoplayer.drm.c
    public final DrmSession b(androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.common.q qVar) {
        k(false);
        fa.a.d(this.f8866p > 0);
        fa.a.f(this.f8870t);
        return e(this.f8870t, aVar, qVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.c
    public final androidx.media3.exoplayer.drm.c.b c(androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.common.q qVar) {
        fa.a.d(this.f8866p > 0);
        fa.a.f(this.f8870t);
        e eVar = new e(aVar);
        Handler handler = DefaultDrmSessionManager.this.f8871u;
        handler.getClass();
        handler.post(new l0.e(1, eVar, qVar));
        return eVar;
    }

    @Override // androidx.media3.exoplayer.drm.c
    public final void d(Looper looper, q qVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f8870t;
                if (looper2 == null) {
                    this.f8870t = looper;
                    this.f8871u = new Handler(looper);
                } else {
                    fa.a.d(looper2 == looper);
                    this.f8871u.getClass();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f8873w = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DrmSession e(Looper looper, androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.common.q qVar, boolean z14) {
        ArrayList arrayListI;
        if (this.f8874x == null) {
            this.f8874x = new d(looper);
        }
        l lVar = qVar.f8390r;
        int i14 = 0;
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (lVar == null) {
            int iH = x.h(qVar.f8386n);
            androidx.media3.exoplayer.drm.g gVar = this.f8867q;
            gVar.getClass();
            if (gVar.getCryptoType() != 2 || !la.c.f111603c) {
                int[] iArr = this.f8857g;
                int i15 = z.f70071a;
                while (true) {
                    if (i14 >= iArr.length) {
                        i14 = -1;
                        break;
                    }
                    if (iArr[i14] == iH) {
                        break;
                    }
                    i14++;
                }
                if (i14 != -1 && gVar.getCryptoType() != 1) {
                    DefaultDrmSession defaultDrmSession2 = this.f8868r;
                    if (defaultDrmSession2 == null) {
                        DefaultDrmSession defaultDrmSessionH = h(ImmutableList.of(), true, null, z14);
                        this.f8863m.add(defaultDrmSessionH);
                        this.f8868r = defaultDrmSessionH;
                    } else {
                        defaultDrmSession2.b(null);
                    }
                    return this.f8868r;
                }
            }
            return null;
        }
        if (this.f8872v == null) {
            arrayListI = i(lVar, this.f8852b, false);
            if (arrayListI.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f8852b);
                k.d("DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.e(missingSchemeDataException);
                }
                return new androidx.media3.exoplayer.drm.f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            arrayListI = null;
        }
        if (this.f8856f) {
            for (DefaultDrmSession defaultDrmSession3 : this.f8863m) {
                List<l.b> list = defaultDrmSession3.f8818a;
                int i16 = z.f70071a;
                if (Objects.equals(list, arrayListI)) {
                    defaultDrmSession = defaultDrmSession3;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f8869s;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.b(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionH2 = h(arrayListI, false, aVar, z14);
        if (!this.f8856f) {
            this.f8869s = defaultDrmSessionH2;
        }
        this.f8863m.add(defaultDrmSessionH2);
        return defaultDrmSessionH2;
    }

    public final DefaultDrmSession g(List<l.b> list, boolean z14, androidx.media3.exoplayer.drm.b.a aVar) {
        this.f8867q.getClass();
        boolean z15 = this.f8858h | z14;
        androidx.media3.exoplayer.drm.g gVar = this.f8867q;
        byte[] bArr = this.f8872v;
        Looper looper = this.f8870t;
        looper.getClass();
        q qVar = this.f8873w;
        qVar.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f8852b, gVar, this.f8859i, this.f8861k, list, 0, z15, z14, bArr, this.f8855e, this.f8854d, looper, this.f8860j, qVar);
        defaultDrmSession.b(aVar);
        if (this.f8862l != C.TIME_UNSET) {
            defaultDrmSession.b(null);
        }
        return defaultDrmSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DefaultDrmSession h(List<l.b> list, boolean z14, androidx.media3.exoplayer.drm.b.a aVar, boolean z15) {
        DefaultDrmSession defaultDrmSessionG = g(list, z14, aVar);
        boolean zF = f(defaultDrmSessionG);
        long j8 = this.f8862l;
        Set<DefaultDrmSession> set = this.f8865o;
        if (zF && !set.isEmpty()) {
            UnmodifiableIterator it = ImmutableSet.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).a(null);
            }
            defaultDrmSessionG.a(aVar);
            if (j8 != C.TIME_UNSET) {
                defaultDrmSessionG.a(null);
            }
            defaultDrmSessionG = g(list, z14, aVar);
        }
        if (f(defaultDrmSessionG) && z15) {
            Set<e> set2 = this.f8864n;
            if (!set2.isEmpty()) {
                UnmodifiableIterator it3 = ImmutableSet.copyOf((Collection) set2).iterator();
                while (it3.hasNext()) {
                    ((e) it3.next()).release();
                }
                if (!set.isEmpty()) {
                    UnmodifiableIterator it4 = ImmutableSet.copyOf((Collection) set).iterator();
                    while (it4.hasNext()) {
                        ((DrmSession) it4.next()).a(null);
                    }
                }
                defaultDrmSessionG.a(aVar);
                if (j8 != C.TIME_UNSET) {
                    defaultDrmSessionG.a(null);
                }
                return g(list, z14, aVar);
            }
        }
        return defaultDrmSessionG;
    }

    public final void j() {
        if (this.f8867q != null && this.f8866p == 0 && this.f8863m.isEmpty() && this.f8864n.isEmpty()) {
            androidx.media3.exoplayer.drm.g gVar = this.f8867q;
            gVar.getClass();
            gVar.release();
            this.f8867q = null;
        }
    }

    public final void k(boolean z14) {
        if (z14 && this.f8870t == null) {
            k.h("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f8870t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            k.h("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f8870t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.c
    public final void prepare() {
        k(true);
        int i14 = this.f8866p;
        this.f8866p = i14 + 1;
        if (i14 != 0) {
            return;
        }
        if (this.f8867q == null) {
            androidx.media3.exoplayer.drm.g gVarAcquireExoMediaDrm = this.f8853c.acquireExoMediaDrm(this.f8852b);
            this.f8867q = gVarAcquireExoMediaDrm;
            gVarAcquireExoMediaDrm.a(new c());
        } else {
            if (this.f8862l == C.TIME_UNSET) {
                return;
            }
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.f8863m;
                if (i15 >= arrayList.size()) {
                    return;
                }
                ((DefaultDrmSession) arrayList.get(i15)).b(null);
                i15++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.drm.c
    public final void release() {
        k(true);
        int i14 = this.f8866p - 1;
        this.f8866p = i14;
        if (i14 != 0) {
            return;
        }
        if (this.f8862l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f8863m);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((DefaultDrmSession) arrayList.get(i15)).a(null);
            }
        }
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.f8864n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        j();
    }
}
