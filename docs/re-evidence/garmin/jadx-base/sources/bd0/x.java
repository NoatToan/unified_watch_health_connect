package bd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lj0.j f17633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f17634d;

    public class a implements lj0.k {
        public a() {
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            x xVar = x.this;
            if (xVar.f17633c.e()) {
                return;
            }
            i2.f(a2.DEVICES, "DeviceRegistrationStatusChecker", "Error checking registration status for device [" + bVar.f112957a.name() + ", " + bVar.f112958b + "].");
            xVar.f17632b.b(b.f17636a[bVar.f112957a.ordinal()] != 1 ? yl2.e.OTHER_FATAL : yl2.e.NO_INTERNET_CONNECTION);
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            x xVar = x.this;
            lj0.j jVar = xVar.f17633c;
            c cVar = xVar.f17632b;
            if (jVar.e()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject((String) aVar.f112977a);
                boolean z14 = jSONObject.getBoolean("thisDeviceActiveWithCurrentUser");
                cVar.c(z14, jSONObject.getBoolean("otherDeviceActiveWithCurrentUser"), jSONObject.getBoolean("previousAssociationWithOther"), jSONObject);
                f12.l.f68084a.getClass();
                f12.l.a.a().M0(xVar.f17631a, z14);
            } catch (JSONException e4) {
                u0.v(e4, new StringBuilder("Error parsing device registration succeeded JSON response: "), a2.DEVICES, "DeviceRegistrationStatusChecker");
                cVar.b(yl2.e.JSON_PARSING_EXCEPTION);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17636a;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f17636a = iArr;
            try {
                iArr[lj0.c.CONNECT_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface c {
        void a();

        void b(yl2.e eVar);

        void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject);
    }

    public x(long j8, c cVar) {
        this.f17631a = -1L;
        this.f17632b = null;
        this.f17633c = null;
        this.f17634d = new a();
        this.f17631a = j8;
        this.f17632b = cVar;
    }

    public final void a() {
        lj0.j jVar = new lj0.j(this.f17634d);
        this.f17633c = jVar;
        jVar.b(new lj0.i(lj0.f.f112995w, new Object[]{String.valueOf(this.f17631a)}));
        this.f17632b.a();
    }

    private x() {
        this.f17631a = -1L;
        this.f17632b = null;
        this.f17633c = null;
        this.f17634d = new a();
    }
}
