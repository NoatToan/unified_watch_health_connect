package tk;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import jk.o;
import jk.t;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f165219n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue<h> f165220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f165221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sk.a f165222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ok.d f165223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f165224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f165225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f165226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f165227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f165228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vk.a f165229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f165230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f165231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3102e f165232m;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0123  */
        /* JADX WARN: Code duplicated, block: B:94:0x0138 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x0002 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            if (r2 == null) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        
            r5 = r4.f165223d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (r1 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        
            r6 = r4.f165232m;
            r7 = r4.f165225f;
            r9 = android.provider.Settings.Secure.getString(r7.getContentResolver(), "android_id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            r7 = r7.getSharedPreferences("device_id.xml", 4);
            r10 = r7.getString("device_id", null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
        
            if (r10 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            r7 = java.util.UUID.fromString(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            if ("9774d56d682e549c".equals(r9) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        
            r9 = java.util.UUID.nameUUIDFromBytes(r9.getBytes("utf8"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
        
            r9 = java.util.UUID.randomUUID();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        
            r7.edit().putString("device_id", r9.toString()).commit();
            r7 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        
            r7 = r7.getLeastSignificantBits() & 4294967295L;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        
            gk.a.a();
            r7 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x013d, code lost:
        
            if (r1 == null) goto L98;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00e3. Please report as an issue. */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            vk.b bVar;
            h hVarPoll;
            e eVar;
            ok.d dVar;
            jk.j.i iVarT;
            C3102e c3102e;
            long leastSignificantBits;
            while (true) {
                bVar = null;
                while (true) {
                    try {
                        hVarPoll = e.this.f165220a.poll(10L, TimeUnit.SECONDS);
                        if (hVarPoll == e.this.f165231l) {
                            hVarPoll = null;
                        }
                        while (true) {
                            e eVar2 = e.this;
                            if (hVarPoll == eVar2.f165230k) {
                                tk.c.this.a();
                                return;
                            } else {
                                if (hVarPoll != null) {
                                    hVarPoll.T();
                                }
                                hVarPoll = e.this.f165220a.poll();
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                    synchronized (e.this.f165221b) {
                        eVar = e.this;
                        if (eVar.f165228i) {
                        }
                    }
                }
                bVar.t(new jk.h(bVar, eVar.f165227h, 0, 0));
                try {
                    e.this.f165223d.b();
                } catch (InterruptedException unused2) {
                }
            }
            bVar = new vk.b(c3102e, leastSignificantBits, eVar.f165222c.f159485c);
            eVar.f165229j = new vk.a(bVar.f99063k, bVar.f99072t, 0);
            try {
                if (dVar.g(bVar, 1100)) {
                    jk.j.h hVar = bVar.f99068p;
                    while (true) {
                        jk.j.h hVar2 = jk.j.h.TRANSPORT_IDLE;
                        if (hVar != hVar2) {
                            Objects.toString(hVar);
                            switch (f.f165235a[hVar.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    try {
                                        Thread.sleep(100L);
                                    } catch (InterruptedException unused3) {
                                        Thread.currentThread().interrupt();
                                    }
                                    break;
                                case 10:
                                    iVarT = bVar.t(new o(bVar, null, new jk.g(bVar.f99063k)));
                                    Objects.toString(iVarT);
                                    if (iVarT != jk.j.i.SUCCESS) {
                                        hVar = bVar.f99068p;
                                    } else {
                                        hVarPoll.b(iVarT);
                                        try {
                                            dVar.b();
                                        } catch (InterruptedException unused4) {
                                        }
                                    }
                                    break;
                                case 11:
                                    iVarT = bVar.t(new jk.k(bVar, eVar.f165229j));
                                    Objects.toString(iVarT);
                                    if (iVarT != jk.j.i.SUCCESS) {
                                        hVar = bVar.f99068p;
                                    } else {
                                        hVarPoll.b(iVarT);
                                        dVar.b();
                                    }
                                    break;
                                case 12:
                                    iVarT = bVar.t(new jk.l(bVar, eVar.f165229j, eVar.f165224e));
                                    Objects.toString(iVarT);
                                    if (iVarT != jk.j.i.SUCCESS) {
                                        hVar = bVar.f99068p;
                                    } else {
                                        hVarPoll.b(iVarT);
                                        dVar.b();
                                    }
                                    break;
                                case 13:
                                    hVar = hVar2;
                                    break;
                                default:
                                    iVarT = jk.j.i.FAIL_WRONG_ANTFS_STATE;
                                    Objects.toString(iVarT);
                                    if (iVarT != jk.j.i.SUCCESS) {
                                        hVar = bVar.f99068p;
                                    } else {
                                        hVarPoll.b(iVarT);
                                        dVar.b();
                                    }
                                    break;
                            }
                        }
                    }
                    if (bVar != null) {
                        hVarPoll.a(bVar);
                    }
                } else {
                    hVarPoll.b(jk.j.i.FAIL_EXECUTOR_CANCELLED_TASK);
                }
            } catch (InterruptedException unused5) {
                hVarPoll.b(jk.j.i.FAIL_EXECUTOR_CANCELLED_TASK);
            }
            bVar = null;
            if (bVar != null) {
                hVarPoll.a(bVar);
            }
            bVar = null;
            if (bVar != null) {
                hVarPoll.a(bVar);
            }
        }
    }

    public class b implements ok.d.b {
        public b() {
        }

        @Override // ok.d.b
        public final void a() {
            synchronized (e.this.f165221b) {
                e eVar = e.this;
                eVar.f165228i = true;
                eVar.f165220a.add(eVar.f165230k);
            }
        }
    }

    public class c implements h {
        public c(e eVar) {
        }

        @Override // tk.h
        public final void T() {
        }

        @Override // tk.h
        public final void a(vk.b bVar) {
        }

        @Override // tk.h
        public final void b(jk.j.i iVar) {
        }
    }

    public class d implements h {
        public d(e eVar) {
        }

        @Override // tk.h
        public final void T() {
        }

        @Override // tk.h
        public final void a(vk.b bVar) {
        }

        @Override // tk.h
        public final void b(jk.j.i iVar) {
        }
    }

    /* JADX INFO: renamed from: tk.e$e, reason: collision with other inner class name */
    public class C3102e implements jk.j.k {
        public C3102e(e eVar) {
        }

        @Override // jk.j.k
        public final void a(jk.j.h hVar, jk.j.g gVar) {
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165235a;

        static {
            int[] iArr = new int[jk.j.h.values().length];
            f165235a = iArr;
            try {
                iArr[jk.j.h.SEARCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f165235a[jk.j.h.LINK_CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f165235a[jk.j.h.AUTH_REQUESTING_PASSKEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f165235a[jk.j.h.AUTH_REQUESTING_PASSTHROUGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f165235a[jk.j.h.AUTH_REQUESTING_SERIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f165235a[jk.j.h.AUTH_WAITING_FOR_PAIRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f165235a[jk.j.h.TRANSPORT_DOWNLOADING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f165235a[jk.j.h.TRANSPORT_ERASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f165235a[jk.j.h.TRANSPORT_UPLOADING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f165235a[jk.j.h.NOT_CONNECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f165235a[jk.j.h.LINK_IDLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f165235a[jk.j.h.AUTH_IDLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f165235a[jk.j.h.TRANSPORT_IDLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public interface g {
    }

    public e(sk.a aVar, ok.e eVar, t tVar, g gVar, Context context) {
        LinkedBlockingQueue<h> linkedBlockingQueue = new LinkedBlockingQueue<>();
        this.f165220a = linkedBlockingQueue;
        this.f165221b = linkedBlockingQueue;
        this.f165227h = 0;
        this.f165228i = false;
        a aVar2 = new a("antfs-task-queue-worker");
        this.f165229j = null;
        b bVar = new b();
        this.f165230k = new c(this);
        this.f165231l = new d(this);
        this.f165232m = new C3102e(this);
        this.f165225f = context;
        this.f165226g = gVar;
        this.f165222c = aVar;
        this.f165224e = tVar;
        ok.d dVar = new ok.d(aVar, bVar);
        this.f165223d = dVar;
        dVar.e(eVar);
        aVar2.start();
    }

    public final void a(h hVar) {
        synchronized (this.f165221b) {
            try {
                if (this.f165228i) {
                    return;
                }
                this.f165220a.add(hVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        synchronized (this.f165221b) {
            try {
                if (this.f165228i) {
                    return;
                }
                this.f165220a.add(this.f165231l);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
