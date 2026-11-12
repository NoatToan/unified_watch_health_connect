package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.l;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.WidevineUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import fa.k;
import fa.z;
import ja.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k32.n;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l.b> f8818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f8820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f8821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f8825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fa.h<androidx.media3.exoplayer.drm.b.a> f8826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f8827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f8828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f8829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f8830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Looper f8831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f8832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HandlerThread f8835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f8836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public la.c f8837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DrmSession.DrmSessionException f8838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f8839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f8840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g.a f8841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g.c f8842y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th3) {
            super(th3);
        }
    }

    public interface a {
    }

    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8843a;

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            IOException unexpectedDrmSessionException;
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i14 = message.what;
                if (i14 == 1) {
                    objB = ((i) DefaultDrmSession.this.f8829l).b((g.c) dVar.f8848d);
                } else {
                    if (i14 != 2) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = ((i) defaultDrmSession.f8829l).a(defaultDrmSession.f8830m, (g.a) dVar.f8848d);
                }
            } catch (MediaDrmCallbackException e4) {
                d dVar2 = (d) message.obj;
                objB = e4;
                if (dVar2.f8846b) {
                    int i15 = dVar2.f8849e + 1;
                    dVar2.f8849e = i15;
                    if (i15 <= DefaultDrmSession.this.f8827j.getMinimumLoadableRetryCount(3)) {
                        sa.i iVar = new sa.i(dVar2.f8845a, e4.dataSpec, e4.uriAfterRedirects, e4.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar2.f8847c, e4.bytesLoaded);
                        sa.j jVar = new sa.j(3);
                        if (e4.getCause() instanceof IOException) {
                            objB = e4;
                            unexpectedDrmSessionException = (IOException) e4.getCause();
                        } else {
                            objB = e4;
                            unexpectedDrmSessionException = new UnexpectedDrmSessionException(e4.getCause());
                        }
                        long jB = DefaultDrmSession.this.f8827j.b(new androidx.media3.exoplayer.upstream.b.c(iVar, jVar, unexpectedDrmSessionException, dVar2.f8849e));
                        objB = e4;
                        if (jB != C.TIME_UNSET) {
                            synchronized (this) {
                                try {
                                    if (!this.f8843a) {
                                        sendMessageDelayed(Message.obtain(message), jB);
                                        return;
                                    }
                                    objB = e4;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e14) {
                k.h("Key/provisioning request produced an unexpected exception. Not retrying.", e14);
                objB = e14;
            }
            objB = e4;
            androidx.media3.exoplayer.upstream.b bVar = DefaultDrmSession.this.f8827j;
            long j8 = dVar.f8845a;
            bVar.getClass();
            synchronized (this) {
                try {
                    if (!this.f8843a) {
                        DefaultDrmSession.this.f8832o.obtainMessage(message.what, Pair.create(dVar.f8848d, objB)).sendToTarget();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f8848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8849e;

        public d(long j8, boolean z14, long j14, Object obj) {
            this.f8845a = j8;
            this.f8846b = z14;
            this.f8847c = j14;
            this.f8848d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<androidx.media3.exoplayer.drm.b.a> set;
            Set<androidx.media3.exoplayer.drm.b.a> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i14 = message.what;
            if (i14 == 1) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                a aVar = defaultDrmSession.f8820c;
                if (obj == defaultDrmSession.f8842y) {
                    if (defaultDrmSession.f8833p == 2 || defaultDrmSession.d()) {
                        defaultDrmSession.f8842y = null;
                        if (obj2 instanceof Exception) {
                            ((DefaultDrmSessionManager.f) aVar).a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f8819b.provideProvisionResponse((byte[]) obj2);
                            DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) aVar;
                            fVar.f8889b = null;
                            HashSet hashSet = fVar.f8888a;
                            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) hashSet);
                            hashSet.clear();
                            UnmodifiableIterator it = immutableListCopyOf.iterator();
                            while (it.hasNext()) {
                                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) it.next();
                                if (defaultDrmSession2.g()) {
                                    defaultDrmSession2.c(true);
                                }
                            }
                            return;
                        } catch (Exception e4) {
                            ((DefaultDrmSessionManager.f) aVar).a(e4, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i14 != 2) {
                return;
            }
            DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
            if (obj == defaultDrmSession3.f8841x && defaultDrmSession3.d()) {
                defaultDrmSession3.f8841x = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    defaultDrmSession3.f((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    int i15 = defaultDrmSession3.f8822e;
                    g gVar = defaultDrmSession3.f8819b;
                    if (i15 == 3) {
                        byte[] bArr2 = defaultDrmSession3.f8840w;
                        int i16 = z.f70071a;
                        gVar.provideKeyResponse(bArr2, bArr);
                        fa.h<androidx.media3.exoplayer.drm.b.a> hVar = defaultDrmSession3.f8826i;
                        synchronized (hVar.f70014a) {
                            set2 = hVar.f70016c;
                        }
                        Iterator<androidx.media3.exoplayer.drm.b.a> it3 = set2.iterator();
                        while (it3.hasNext()) {
                            it3.next().b();
                        }
                        return;
                    }
                    byte[] bArrProvideKeyResponse = gVar.provideKeyResponse(defaultDrmSession3.f8839v, bArr);
                    int i17 = defaultDrmSession3.f8822e;
                    if ((i17 == 2 || (i17 == 0 && defaultDrmSession3.f8840w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        defaultDrmSession3.f8840w = bArrProvideKeyResponse;
                    }
                    defaultDrmSession3.f8833p = 4;
                    fa.h<androidx.media3.exoplayer.drm.b.a> hVar2 = defaultDrmSession3.f8826i;
                    synchronized (hVar2.f70014a) {
                        set = hVar2.f70016c;
                    }
                    Iterator<androidx.media3.exoplayer.drm.b.a> it4 = set.iterator();
                    while (it4.hasNext()) {
                        it4.next().a();
                    }
                } catch (Exception e14) {
                    e = e14;
                    defaultDrmSession3.f(e, true);
                } catch (NoSuchMethodError e15) {
                    e = e15;
                    defaultDrmSession3.f(e, true);
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, g gVar, a aVar, b bVar, List<l.b> list, int i14, boolean z14, boolean z15, byte[] bArr, HashMap<String, String> map, j jVar, Looper looper, androidx.media3.exoplayer.upstream.b bVar2, q qVar) {
        if (i14 == 1 || i14 == 3) {
            bArr.getClass();
        }
        this.f8830m = uuid;
        this.f8820c = aVar;
        this.f8821d = bVar;
        this.f8819b = gVar;
        this.f8822e = i14;
        this.f8823f = z14;
        this.f8824g = z15;
        if (bArr != null) {
            this.f8840w = bArr;
            this.f8818a = null;
        } else {
            list.getClass();
            this.f8818a = Collections.unmodifiableList(list);
        }
        this.f8825h = map;
        this.f8829l = jVar;
        this.f8826i = new fa.h<>();
        this.f8827j = bVar2;
        this.f8828k = qVar;
        this.f8833p = 2;
        this.f8831n = looper;
        this.f8832o = new e(looper);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void a(androidx.media3.exoplayer.drm.b.a aVar) {
        j();
        int i14 = this.f8834q;
        if (i14 <= 0) {
            k.c("release() called on a session that's already fully released.");
            return;
        }
        int i15 = i14 - 1;
        this.f8834q = i15;
        if (i15 == 0) {
            this.f8833p = 0;
            e eVar = this.f8832o;
            int i16 = z.f70071a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f8836s;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f8843a = true;
            }
            this.f8836s = null;
            this.f8835r.quit();
            this.f8835r = null;
            this.f8837t = null;
            this.f8838u = null;
            this.f8841x = null;
            this.f8842y = null;
            byte[] bArr = this.f8839v;
            if (bArr != null) {
                this.f8819b.closeSession(bArr);
                this.f8839v = null;
            }
        }
        if (aVar != null) {
            fa.h<androidx.media3.exoplayer.drm.b.a> hVar = this.f8826i;
            synchronized (hVar.f70014a) {
                try {
                    Integer num = (Integer) hVar.f70015b.get(aVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(hVar.f70017d);
                        arrayList.remove(aVar);
                        hVar.f70017d = Collections.unmodifiableList(arrayList);
                        int iIntValue = num.intValue();
                        HashMap map = hVar.f70015b;
                        if (iIntValue == 1) {
                            map.remove(aVar);
                            HashSet hashSet = new HashSet(hVar.f70016c);
                            hashSet.remove(aVar);
                            hVar.f70016c = Collections.unmodifiableSet(hashSet);
                        } else {
                            map.put(aVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f8826i.a(aVar) == 0) {
                aVar.f();
            }
        }
        b bVar = this.f8821d;
        int i17 = this.f8834q;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i17 == 1 && defaultDrmSessionManager.f8866p > 0 && defaultDrmSessionManager.f8862l != C.TIME_UNSET) {
            defaultDrmSessionManager.f8865o.add(this);
            Handler handler = defaultDrmSessionManager.f8871u;
            handler.getClass();
            handler.postAtTime(new n(this, 7), this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f8862l);
        } else if (i17 == 0) {
            defaultDrmSessionManager.f8863m.remove(this);
            if (defaultDrmSessionManager.f8868r == this) {
                defaultDrmSessionManager.f8868r = null;
            }
            if (defaultDrmSessionManager.f8869s == this) {
                defaultDrmSessionManager.f8869s = null;
            }
            DefaultDrmSessionManager.f fVar = defaultDrmSessionManager.f8859i;
            HashSet hashSet2 = fVar.f8888a;
            hashSet2.remove(this);
            if (fVar.f8889b == this) {
                fVar.f8889b = null;
                if (!hashSet2.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet2.iterator().next();
                    fVar.f8889b = defaultDrmSession;
                    g.c provisionRequest = defaultDrmSession.f8819b.getProvisionRequest();
                    defaultDrmSession.f8842y = provisionRequest;
                    c cVar2 = defaultDrmSession.f8836s;
                    int i18 = z.f70071a;
                    provisionRequest.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(1, new d(sa.i.f158115c.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f8862l != C.TIME_UNSET) {
                Handler handler2 = defaultDrmSessionManager.f8871u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f8865o.remove(this);
            }
        }
        int i19 = DefaultDrmSessionManager.f8851y;
        defaultDrmSessionManager.j();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void b(androidx.media3.exoplayer.drm.b.a aVar) {
        j();
        if (this.f8834q < 0) {
            k.c("Session reference count less than zero: " + this.f8834q);
            this.f8834q = 0;
        }
        if (aVar != null) {
            fa.h<androidx.media3.exoplayer.drm.b.a> hVar = this.f8826i;
            synchronized (hVar.f70014a) {
                try {
                    ArrayList arrayList = new ArrayList(hVar.f70017d);
                    arrayList.add(aVar);
                    hVar.f70017d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) hVar.f70015b.get(aVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(hVar.f70016c);
                        hashSet.add(aVar);
                        hVar.f70016c = Collections.unmodifiableSet(hashSet);
                    }
                    hVar.f70015b.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        int i14 = this.f8834q + 1;
        this.f8834q = i14;
        if (i14 == 1) {
            fa.a.d(this.f8833p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f8835r = handlerThread;
            handlerThread.start();
            this.f8836s = new c(this.f8835r.getLooper());
            if (g()) {
                c(true);
            }
        } else if (aVar != null && d() && this.f8826i.a(aVar) == 1) {
            aVar.d(this.f8833p);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f8862l != C.TIME_UNSET) {
            defaultDrmSessionManager.f8865o.remove(this);
            Handler handler = defaultDrmSessionManager.f8871u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final void c(boolean z14) {
        long jMin;
        long j8;
        Set<androidx.media3.exoplayer.drm.b.a> set;
        if (this.f8824g) {
            return;
        }
        byte[] bArr = this.f8839v;
        int i14 = z.f70071a;
        int i15 = this.f8822e;
        if (i15 != 0 && i15 != 1) {
            if (i15 == 2) {
                if (this.f8840w == null || i()) {
                    h(bArr, 2, z14);
                    return;
                }
                return;
            }
            if (i15 != 3) {
                return;
            }
            this.f8840w.getClass();
            this.f8839v.getClass();
            h(this.f8840w, 3, z14);
            return;
        }
        if (this.f8840w == null) {
            h(bArr, 1, z14);
            return;
        }
        if (this.f8833p == 4 || i()) {
            if (androidx.media3.common.h.f8299d.equals(this.f8830m)) {
                j();
                byte[] bArr2 = this.f8839v;
                Pair pair = null;
                Map<String, String> mapQueryKeyStatus = bArr2 == null ? null : this.f8819b.queryKeyStatus(bArr2);
                if (mapQueryKeyStatus != null) {
                    long j14 = C.TIME_UNSET;
                    try {
                        String str = mapQueryKeyStatus.get(WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING);
                        j8 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                    } catch (NumberFormatException unused) {
                    }
                    Long lValueOf = Long.valueOf(j8);
                    try {
                        String str2 = mapQueryKeyStatus.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                        if (str2 != null) {
                            j14 = Long.parseLong(str2);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    pair = new Pair(lValueOf, Long.valueOf(j14));
                }
                pair.getClass();
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (this.f8822e == 0 && jMin <= 60) {
                k.b("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                h(bArr, 2, z14);
                return;
            }
            if (jMin <= 0) {
                e(2, new KeysExpiredException());
                return;
            }
            this.f8833p = 4;
            fa.h<androidx.media3.exoplayer.drm.b.a> hVar = this.f8826i;
            synchronized (hVar.f70014a) {
                set = hVar.f70016c;
            }
            Iterator<androidx.media3.exoplayer.drm.b.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public final boolean d() {
        int i14 = this.f8833p;
        return i14 == 3 || i14 == 4;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final void e(int i14, Throwable th3) {
        int iT;
        Set<androidx.media3.exoplayer.drm.b.a> set;
        if (th3 instanceof MediaDrm.MediaDrmStateException) {
            iT = z.t(z.u(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo()));
        } else if (z.f70071a >= 23 && (th3 instanceof MediaDrmResetException)) {
            iT = 6006;
        } else if ((th3 instanceof NotProvisionedException) || androidx.media3.exoplayer.drm.d.b(th3)) {
            iT = 6002;
        } else if (th3 instanceof DeniedByServerException) {
            iT = 6007;
        } else if (th3 instanceof UnsupportedDrmException) {
            iT = 6001;
        } else if (th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            iT = 6003;
        } else if (th3 instanceof KeysExpiredException) {
            iT = 6008;
        } else if (i14 == 1) {
            iT = 6006;
        } else if (i14 == 2) {
            iT = 6004;
        } else {
            if (i14 != 3) {
                vb.h.w();
                return;
            }
            iT = 6002;
        }
        this.f8838u = new DrmSession.DrmSessionException(th3, iT);
        k.d("DRM session error", th3);
        if (th3 instanceof Exception) {
            fa.h<androidx.media3.exoplayer.drm.b.a> hVar = this.f8826i;
            synchronized (hVar.f70014a) {
                set = hVar.f70016c;
            }
            Iterator<androidx.media3.exoplayer.drm.b.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().e((Exception) th3);
            }
        } else if (!(th3 instanceof Error)) {
            com.airbnb.lottie.animation.keyframe.a.x("Unexpected Throwable subclass", th3);
            return;
        } else if (!androidx.media3.exoplayer.drm.d.c(th3) && !androidx.media3.exoplayer.drm.d.b(th3)) {
            throw ((Error) th3);
        }
        if (this.f8833p != 4) {
            this.f8833p = 1;
        }
    }

    public final void f(Throwable th3, boolean z14) {
        if ((th3 instanceof NotProvisionedException) || androidx.media3.exoplayer.drm.d.b(th3)) {
            ((DefaultDrmSessionManager.f) this.f8820c).b(this);
        } else {
            e(z14 ? 1 : 2, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    public final boolean g() {
        Set<androidx.media3.exoplayer.drm.b.a> set;
        if (d()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f8819b.openSession();
            this.f8839v = bArrOpenSession;
            this.f8819b.b(bArrOpenSession, this.f8828k);
            this.f8837t = this.f8819b.createCryptoConfig(this.f8839v);
            this.f8833p = 3;
            fa.h<androidx.media3.exoplayer.drm.b.a> hVar = this.f8826i;
            synchronized (hVar.f70014a) {
                set = hVar.f70016c;
            }
            Iterator<androidx.media3.exoplayer.drm.b.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f8839v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((DefaultDrmSessionManager.f) this.f8820c).b(this);
            return false;
        } catch (Exception e4) {
            e = e4;
            if (androidx.media3.exoplayer.drm.d.b(e)) {
                ((DefaultDrmSessionManager.f) this.f8820c).b(this);
                return false;
            }
            e(1, e);
            return false;
        } catch (NoSuchMethodError e14) {
            e = e14;
            if (androidx.media3.exoplayer.drm.d.b(e)) {
                ((DefaultDrmSessionManager.f) this.f8820c).b(this);
                return false;
            }
            e(1, e);
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final la.c getCryptoConfig() {
        j();
        return this.f8837t;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        j();
        if (this.f8833p == 1) {
            return this.f8838u;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID getSchemeUuid() {
        j();
        return this.f8830m;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        j();
        return this.f8833p;
    }

    public final void h(byte[] bArr, int i14, boolean z14) {
        try {
            g.a keyRequest = this.f8819b.getKeyRequest(bArr, this.f8818a, i14, this.f8825h);
            this.f8841x = keyRequest;
            c cVar = this.f8836s;
            int i15 = z.f70071a;
            keyRequest.getClass();
            cVar.getClass();
            cVar.obtainMessage(2, new d(sa.i.f158115c.getAndIncrement(), z14, SystemClock.elapsedRealtime(), keyRequest)).sendToTarget();
        } catch (Exception | NoSuchMethodError e4) {
            f(e4, true);
        }
    }

    public final boolean i() {
        try {
            this.f8819b.restoreKeys(this.f8839v, this.f8840w);
            return true;
        } catch (Exception | NoSuchMethodError e4) {
            e(1, e4);
            return false;
        }
    }

    public final void j() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f8831n;
        if (threadCurrentThread != looper.getThread()) {
            k.h("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean playClearSamplesWithoutKeys() {
        j();
        return this.f8823f;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean requiresSecureDecoder(String str) {
        j();
        byte[] bArr = this.f8839v;
        fa.a.f(bArr);
        return this.f8819b.requiresSecureDecoder(bArr, str);
    }
}
