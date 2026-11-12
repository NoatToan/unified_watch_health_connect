package bd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f17605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lj0.j f17606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f17607f;

    public class a implements lj0.k {
        public a() {
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            s sVar = s.this;
            if (sVar.f17606e.e()) {
                return;
            }
            i2.f(a2.DEVICES, "DeviceFirmwareUpdateChecker", bVar.f112957a.name() + ", " + bVar.f112958b);
            int i14 = b.f17609a[bVar.f112957a.ordinal()];
            b0 b0Var = (i14 == 1 || i14 == 2) ? b0.NO_CONNECTION : b0.DEFAULT;
            b0Var.getClass();
            sVar.f17605d.b(b0Var);
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            s sVar = s.this;
            if (sVar.f17606e.e()) {
                return;
            }
            sVar.f17605d.c(aVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17609a;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f17609a = iArr;
            try {
                iArr[lj0.c.CONNECT_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17609a[lj0.c.IO_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface c {
        void a();

        void b(b0 b0Var);

        void c(lj0.e.a aVar);
    }

    public s(long j8, byte[] bArr, c cVar) {
        this.f17602a = false;
        this.f17603b = -1L;
        this.f17604c = null;
        this.f17605d = null;
        this.f17606e = null;
        this.f17607f = new a();
        this.f17603b = j8;
        this.f17604c = bArr;
        this.f17605d = cVar;
        this.f17602a = false;
    }

    public final void a() {
        lj0.f fVar = !this.f17602a ? lj0.f.f112985k : lj0.f.f112986l;
        fVar.f113006h = this.f17604c;
        String str = BooleanUtils.FALSE;
        try {
            DeviceProfile deviceProfileB = ((l80.b) KoinJavaComponent.get(l80.b.class)).b(this.f17603b);
            Configuration configuration = deviceProfileB == null ? null : deviceProfileB.getConfiguration();
            if (configuration != null && configuration.getCapabilityFlagsAsSet().contains(Integer.valueOf(SupportedCapability.DELTA_SOFTWARE_UPDATE_FILES.ordinal()))) {
                str = BooleanUtils.TRUE;
            }
        } catch (Throwable unused) {
        }
        try {
            lj0.j jVar = new lj0.j(this.f17607f);
            this.f17606e = jVar;
            jVar.b(new lj0.i((lj0.g) fVar, new Object[]{str}, false));
            this.f17605d.a();
        } catch (Exception unused2) {
        }
    }

    private s() {
        this.f17602a = false;
        this.f17603b = -1L;
        this.f17604c = null;
        this.f17605d = null;
        this.f17606e = null;
        this.f17607f = new a();
    }

    public s(long j8, byte[] bArr, c cVar, boolean z14) {
        this.f17602a = false;
        this.f17603b = -1L;
        this.f17604c = null;
        this.f17605d = null;
        this.f17606e = null;
        this.f17607f = new a();
        this.f17603b = j8;
        this.f17604c = bArr;
        this.f17605d = cVar;
        this.f17602a = z14;
    }
}
