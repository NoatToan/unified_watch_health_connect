package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.i0;
import defpackage.ayf;
import defpackage.g83;
import defpackage.loa;
import defpackage.obq;
import defpackage.oh8;
import defpackage.rk1;
import defpackage.toe;
import defpackage.uaq;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(18)
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.c {
    public final UUID c;
    public final com.google.android.exoplayer2.drm.f.InterfaceC0185f d;
    public final i e;
    public final HashMap<String, String> f;
    public final boolean g;
    public final int[] h;
    public final boolean i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.h f7877k;
    public final g l;
    public final long m;
    public final List<DefaultDrmSession> n;
    public final List<DefaultDrmSession> o;
    public final Set<e> p;
    public final Set<DefaultDrmSession> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7878r;
    public com.google.android.exoplayer2.drm.f s;
    public DefaultDrmSession t;
    public DefaultDrmSession u;
    public Looper v;
    public Handler w;
    public int x;
    public byte[] y;
    public volatile d z;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
            sb.append("Media does not support uuid: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    public static final class b {
        public boolean d;
        public boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f7879a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f7880b = g83.d;
        public com.google.android.exoplayer2.drm.f.InterfaceC0185f c = com.google.android.exoplayer2.drm.g.d;
        public com.google.android.exoplayer2.upstream.h g = new com.google.android.exoplayer2.upstream.f();
        public int[] e = new int[0];
        public long h = 300000;

        public DefaultDrmSessionManager a(i iVar) {
            return new DefaultDrmSessionManager(this.f7880b, this.c, iVar, this.f7879a, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(boolean z) {
            this.d = z;
            return this;
        }

        public b c(boolean z) {
            this.f = z;
            return this;
        }

        public b d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                rk1.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, com.google.android.exoplayer2.drm.f.InterfaceC0185f interfaceC0185f) {
            this.f7880b = (UUID) rk1.e(uuid);
            this.c = (com.google.android.exoplayer2.drm.f.InterfaceC0185f) rk1.e(interfaceC0185f);
            return this;
        }
    }

    public class c implements com.google.android.exoplayer2.drm.f.c {
        public c() {
        }

        @Override // com.google.android.exoplayer2.drm.f.c
        public void a(com.google.android.exoplayer2.drm.f fVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((d) rk1.e(DefaultDrmSessionManager.this.z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.n) {
                if (defaultDrmSession.q(bArr)) {
                    defaultDrmSession.y(message.what);
                    return;
                }
            }
        }
    }

    public class e implements com.google.android.exoplayer2.drm.c.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.b.a f7883b;
        public DrmSession c;
        public boolean d;

        public e(com.google.android.exoplayer2.drm.b.a aVar) {
            this.f7883b = aVar;
        }

        public void e(final Format format) {
            ((Handler) rk1.e(DefaultDrmSessionManager.this.w)).post(new Runnable() { // from class: ou5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29680a.f(format);
                }
            });
        }

        public final /* synthetic */ void f(Format format) {
            if (DefaultDrmSessionManager.this.f7878r == 0 || this.d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.c = defaultDrmSessionManager.q((Looper) rk1.e(defaultDrmSessionManager.v), this.f7883b, format, false);
            DefaultDrmSessionManager.this.p.add(this);
        }

        public final /* synthetic */ void g() {
            if (this.d) {
                return;
            }
            DrmSession drmSession = this.c;
            if (drmSession != null) {
                drmSession.a(this.f7883b);
            }
            DefaultDrmSessionManager.this.p.remove(this);
            this.d = true;
        }

        @Override // com.google.android.exoplayer2.drm.c.b
        public void release() {
            wlq.E0((Handler) rk1.e(DefaultDrmSessionManager.this.w), new Runnable() { // from class: pu5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30775a.g();
                }
            });
        }
    }

    public class f implements DefaultDrmSession.a {
        public f() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(DefaultDrmSession defaultDrmSession) {
            if (DefaultDrmSessionManager.this.o.contains(defaultDrmSession)) {
                return;
            }
            DefaultDrmSessionManager.this.o.add(defaultDrmSession);
            if (DefaultDrmSessionManager.this.o.size() == 1) {
                defaultDrmSession.E();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b() {
            Iterator it = DefaultDrmSessionManager.this.o.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).z();
            }
            DefaultDrmSessionManager.this.o.clear();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void c(Exception exc) {
            Iterator it = DefaultDrmSessionManager.this.o.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A(exc);
            }
            DefaultDrmSessionManager.this.o.clear();
        }
    }

    public class g implements DefaultDrmSession.b {
        public g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(final DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.q.add(defaultDrmSession);
                ((Handler) rk1.e(DefaultDrmSessionManager.this.w)).postAtTime(new Runnable() { // from class: qu5
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.a(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.m);
                return;
            }
            if (i == 0) {
                DefaultDrmSessionManager.this.n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.t = null;
                }
                if (DefaultDrmSessionManager.this.u == defaultDrmSession) {
                    DefaultDrmSessionManager.this.u = null;
                }
                if (DefaultDrmSessionManager.this.o.size() > 1 && DefaultDrmSessionManager.this.o.get(0) == defaultDrmSession) {
                    ((DefaultDrmSession) DefaultDrmSessionManager.this.o.get(1)).E();
                }
                DefaultDrmSessionManager.this.o.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                    ((Handler) rk1.e(DefaultDrmSessionManager.this.w)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.q.remove(defaultDrmSession);
                }
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.q.remove(defaultDrmSession);
                ((Handler) rk1.e(DefaultDrmSessionManager.this.w)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    public static boolean r(DrmSession drmSession) {
        return drmSession.getState() == 1 && (wlq.f38110a < 19 || (((DrmSession.DrmSessionException) rk1.e(drmSession.c())).getCause() instanceof ResourceBusyException));
    }

    public static List<DrmInitData.SchemeData> v(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i = 0; i < drmInitData.d; i++) {
            DrmInitData.SchemeData schemeDataF = drmInitData.f(i);
            if ((schemeDataF.e(uuid) || (g83.c.equals(uuid) && schemeDataF.e(g83.f18709b))) && (schemeDataF.e != null || z)) {
                arrayList.add(schemeDataF);
            }
        }
        return arrayList;
    }

    public void A(int i, byte[] bArr) {
        rk1.g(this.n.isEmpty());
        if (i == 1 || i == 3) {
            rk1.e(bArr);
        }
        this.x = i;
        this.y = bArr;
    }

    public final void B(DrmSession drmSession, com.google.android.exoplayer2.drm.b.a aVar) {
        drmSession.a(aVar);
        if (this.m != -9223372036854775807L) {
            drmSession.a(null);
        }
    }

    @Override // com.google.android.exoplayer2.drm.c
    public DrmSession a(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format) {
        w(looper);
        return q(looper, aVar, format, true);
    }

    @Override // com.google.android.exoplayer2.drm.c
    public com.google.android.exoplayer2.drm.c.b b(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format) {
        w(looper);
        e eVar = new e(aVar);
        eVar.e(format);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.drm.c
    public Class<? extends oh8> c(Format format) {
        Class<? extends oh8> clsA = ((com.google.android.exoplayer2.drm.f) rk1.e(this.s)).a();
        DrmInitData drmInitData = format.o;
        if (drmInitData != null) {
            return s(drmInitData) ? clsA : obq.class;
        }
        if (wlq.t0(this.h, ayf.l(format.l)) != -1) {
            return clsA;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void prepare() {
        int i = this.f7878r;
        this.f7878r = i + 1;
        if (i != 0) {
            return;
        }
        rk1.g(this.s == null);
        com.google.android.exoplayer2.drm.f fVarA = this.d.a(this.c);
        this.s = fVarA;
        fVarA.setOnEventListener(new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final DrmSession q(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format, boolean z) {
        List<DrmInitData.SchemeData> listV;
        y(looper);
        DrmInitData drmInitData = format.o;
        if (drmInitData == null) {
            return x(ayf.l(format.l), z);
        }
        DefaultDrmSession defaultDrmSessionU = null;
        Object[] objArr = 0;
        if (this.y == null) {
            listV = v((DrmInitData) rk1.e(drmInitData), this.c, false);
            if (listV.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.c);
                toe.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new com.google.android.exoplayer2.drm.e(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            listV = null;
        }
        if (this.g) {
            for (DefaultDrmSession defaultDrmSession : this.n) {
                if (wlq.c(defaultDrmSession.f7868a, listV)) {
                    defaultDrmSessionU = defaultDrmSession;
                    break;
                }
            }
        } else {
            defaultDrmSessionU = this.u;
        }
        if (defaultDrmSessionU == null) {
            defaultDrmSessionU = u(listV, false, aVar, z);
            if (!this.g) {
                this.u = defaultDrmSessionU;
            }
            this.n.add(defaultDrmSessionU);
        } else {
            defaultDrmSessionU.f(aVar);
        }
        return defaultDrmSessionU;
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void release() {
        int i = this.f7878r - 1;
        this.f7878r = i;
        if (i != 0) {
            return;
        }
        if (this.m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).a(null);
            }
        }
        z();
        ((com.google.android.exoplayer2.drm.f) rk1.e(this.s)).release();
        this.s = null;
    }

    public final boolean s(DrmInitData drmInitData) {
        if (this.y != null) {
            return true;
        }
        if (v(drmInitData, this.c, true).isEmpty()) {
            if (drmInitData.d != 1 || !drmInitData.f(0).e(g83.f18709b)) {
                return false;
            }
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(strValueOf);
            toe.h("DefaultDrmSessionMgr", sb.toString());
        }
        String str = drmInitData.c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return wlq.f38110a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final DefaultDrmSession t(List<DrmInitData.SchemeData> list, boolean z, com.google.android.exoplayer2.drm.b.a aVar) {
        rk1.e(this.s);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.c, this.s, this.j, this.l, list, this.x, this.i | z, z, this.y, this.f, this.e, (Looper) rk1.e(this.v), this.f7877k);
        defaultDrmSession.f(aVar);
        if (this.m != -9223372036854775807L) {
            defaultDrmSession.f(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession u(List<DrmInitData.SchemeData> list, boolean z, com.google.android.exoplayer2.drm.b.a aVar, boolean z2) {
        DefaultDrmSession defaultDrmSessionT = t(list, z, aVar);
        if (r(defaultDrmSessionT) && !this.q.isEmpty()) {
            uaq it = ImmutableSet.copyOf((Collection) this.q).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).a(null);
            }
            B(defaultDrmSessionT, aVar);
            defaultDrmSessionT = t(list, z, aVar);
        }
        if (!r(defaultDrmSessionT) || !z2 || this.p.isEmpty()) {
            return defaultDrmSessionT;
        }
        z();
        B(defaultDrmSessionT, aVar);
        return t(list, z, aVar);
    }

    public final synchronized void w(Looper looper) {
        try {
            Looper looper2 = this.v;
            if (looper2 == null) {
                this.v = looper;
                this.w = new Handler(looper);
            } else {
                rk1.g(looper2 == looper);
                rk1.e(this.w);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final DrmSession x(int i, boolean z) {
        com.google.android.exoplayer2.drm.f fVar = (com.google.android.exoplayer2.drm.f) rk1.e(this.s);
        if ((loa.class.equals(fVar.a()) && loa.d) || wlq.t0(this.h, i) == -1 || obq.class.equals(fVar.a())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.t;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionU = u(ImmutableList.of(), true, null, z);
            this.n.add(defaultDrmSessionU);
            this.t = defaultDrmSessionU;
        } else {
            defaultDrmSession.f(null);
        }
        return this.t;
    }

    public final void y(Looper looper) {
        if (this.z == null) {
            this.z = new d(looper);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        uaq it = ImmutableSet.copyOf((Collection) this.p).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    public DefaultDrmSessionManager(UUID uuid, com.google.android.exoplayer2.drm.f.InterfaceC0185f interfaceC0185f, i iVar, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, com.google.android.exoplayer2.upstream.h hVar, long j) {
        rk1.e(uuid);
        rk1.b(!g83.f18709b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = interfaceC0185f;
        this.e = iVar;
        this.f = map;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.f7877k = hVar;
        this.j = new f();
        this.l = new g();
        this.x = 0;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = i0.f();
        this.q = i0.f();
        this.m = j;
    }
}
