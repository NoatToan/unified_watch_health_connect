package tk;

import android.content.Context;
import android.os.RemoteException;
import java.util.regex.Matcher;
import uk.t;
import uk.u;

/* JADX INFO: loaded from: classes7.dex */
public class l extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f165248n = {-6, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f165249o = {-5, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f165250p = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f165251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f165252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f165253m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165254a;

        static {
            int[] iArr = new int[uk.i.values().length];
            f165254a = iArr;
            try {
                iArr[uk.i.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f165254a[uk.i.FINISHED_WITH_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f165254a[uk.i.FINISHED_WITH_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(sk.a aVar, String str, String str2, c.e eVar, Context context) {
        super(aVar, str, str2, eVar, context);
        m mVar = f165250p;
        long jD = d();
        Matcher matcher = k.f165241i.matcher(this.f165209c.f165218d);
        boolean z14 = true;
        int i14 = !matcher.matches() ? 0 : Integer.parseInt(matcher.group(1).replace(".", ""));
        synchronized (mVar) {
            m.b bVar = mVar.f165255a.get(Long.valueOf(jD));
            if (bVar != null && i14 == bVar.f165257b && System.nanoTime() - bVar.f165256a <= 600000000000L) {
                z14 = false;
            }
        }
        this.f165251k = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.io.Serializable] */
    @Override // tk.c
    public final void e(int i14, t.b bVar) {
        if (i14 != 0 || this.f165251k) {
            super.e(i14, bVar);
        } else {
            bVar.a(new byte[16]);
        }
    }

    @Override // tk.c
    public final void f() {
        if (this.f165251k) {
            super.f();
        }
    }

    @Override // tk.c
    public final void g(sk.l lVar) {
        if (this.f165251k) {
            super.g(lVar);
        } else {
            lVar.a(this);
        }
    }

    @Override // tk.k
    public final void i(byte[] bArr, byte b14, byte b15, u.a aVar) {
        if (b14 == -1 && b15 == 8) {
            this.f165253m = true;
        }
        super.i(bArr, b14, b15, aVar);
    }

    @Override // tk.k
    public final void j(uk.i iVar) {
        int i14 = a.f165254a[iVar.ordinal()];
        if (i14 == 1) {
            if (this.f165252l) {
                m mVar = f165250p;
                long jD = d();
                synchronized (mVar) {
                    mVar.f165255a.remove(Long.valueOf(jD));
                }
                h();
                k(0L, f165249o);
                return;
            }
            return;
        }
        if (i14 == 2) {
            if (this.f165251k) {
                m mVar2 = f165250p;
                long jD2 = d();
                Matcher matcher = k.f165241i.matcher(this.f165209c.f165218d);
                int i15 = !matcher.matches() ? 0 : Integer.parseInt(matcher.group(1).replace(".", ""));
                synchronized (mVar2) {
                    m.b bVar = new m.b();
                    bVar.f165256a = System.nanoTime();
                    bVar.f165257b = i15;
                    mVar2.f165255a.put(Long.valueOf(jD2), bVar);
                }
            } else {
                try {
                    this.f165210d.f(f165248n);
                } catch (RemoteException unused) {
                }
            }
            if (this.f165253m) {
                this.f165208b.b();
                return;
            }
        } else if (i14 != 3) {
            return;
        }
        if (this.f165251k) {
            h();
            k(0L, f165249o);
        } else {
            k(30000L, k.f165242j);
        }
        this.f165252l = true;
    }
}
