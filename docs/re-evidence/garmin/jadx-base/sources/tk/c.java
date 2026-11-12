package tk;

import android.content.Context;
import com.google.common.primitives.UnsignedBytes;
import java.util.Calendar;
import java.util.Objects;
import jk.r;
import uk.t;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f165207e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk.e f165208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f165209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk.a f165210d;

    public class a implements h {
        public a(c cVar) {
        }

        @Override // tk.h
        public final void T() {
        }

        @Override // tk.h
        public final void a(vk.b bVar) {
            try {
                Calendar calendar = Calendar.getInstance();
                long timeInMillis = calendar.getTimeInMillis();
                long timeInMillis2 = (timeInMillis - r.f99224b.getTimeInMillis()) / 1000;
                int offset = calendar.getTimeZone().getOffset(timeInMillis) / 900000;
                byte[] bArr = new byte[12];
                ik.a.c(bArr, 0, timeInMillis2);
                bArr[8] = UnsignedBytes.MAX_POWER_OF_TWO;
                bArr[9] = (byte) offset;
                Objects.toString(bVar.u((byte) 3, bArr, true).f99081a);
            } catch (InterruptedException unused) {
            }
        }

        @Override // tk.h
        public final void b(jk.j.i iVar) {
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sk.l f165211a;

        public b(sk.l lVar) {
            this.f165211a = lVar;
        }

        @Override // tk.h
        public final void T() {
            this.f165211a.b("Device gone.");
        }

        @Override // tk.h
        public final void a(vk.b bVar) {
            this.f165211a.a((k) c.this);
        }

        @Override // tk.h
        public final void b(jk.j.i iVar) {
            Objects.toString(iVar);
            this.f165211a.b("Antfs prep: " + iVar);
        }
    }

    /* JADX INFO: renamed from: tk.c$c, reason: collision with other inner class name */
    public class C3101c implements tk.e.g {
        public C3101c() {
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165214a;

        static {
            int[] iArr = new int[uk.i.values().length];
            f165214a = iArr;
            try {
                iArr[uk.i.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f165214a[uk.i.FINISHED_WITH_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f165214a[uk.i.FINISHED_WITH_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f165215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f165216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f165217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f165218d;
    }

    public c(sk.a aVar, String str, String str2, e eVar, Context context) {
        super(str, str2);
        C3101c c3101c = new C3101c();
        this.f165210d = aVar;
        this.f165208b = new tk.e(aVar, b(), c(), c3101c, context);
        this.f165209c = eVar;
    }

    public void a() {
    }

    public abstract yk.a b();

    public abstract wk.a c();

    public final long d() {
        try {
            return Long.parseLong(this.f165209c.f165217c, 16);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public void e(int i14, t.b bVar) {
        this.f165208b.a(new tk.b(this, bVar, e0.f(i14, "Could not download file index ", " from device: "), i14));
    }

    public void f() {
        this.f165208b.a(new a(this));
    }

    public void g(sk.l lVar) {
        this.f165208b.a(new b(lVar));
    }
}
