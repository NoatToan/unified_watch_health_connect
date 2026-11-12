package bd0;

import android.text.TextUtils;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import lc.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lj0.j f17623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l80.a f17625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17626g;

    public class a implements lj0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17627a;

        /* JADX INFO: renamed from: bd0.v$a$a, reason: collision with other inner class name */
        public class C0250a implements lj0.k {
            public C0250a(a aVar) {
            }

            @Override // lj0.k
            public final void a(lj0.b bVar) {
                i2.f(a2.DEVICES, "DeviceRegistrar", "Error ReInitialize DeviceTask failed [" + bVar.f112957a.name() + ", " + bVar.f112958b + "].");
            }

            @Override // lj0.k
            public final void b(lj0.e.a aVar) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "DeviceRegistrar", "ReInitialize DeviceTask Succeeded");
            }
        }

        public a(boolean z14) {
            this.f17627a = z14;
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            yl2.e eVar;
            v vVar = v.this;
            if (vVar.f17623d.e()) {
                return;
            }
            a2 a2Var = a2.DEVICES;
            StringBuilder sb3 = new StringBuilder("Error registering device [");
            lj0.c cVar = bVar.f112957a;
            int i14 = bVar.f112958b;
            sb3.append(cVar.name());
            sb3.append(", ");
            sb3.append(i14);
            sb3.append("].");
            i2.f(a2Var, "DeviceRegistrar", sb3.toString());
            if (vVar.f17620a != null) {
                if (b.f17629a[bVar.f112957a.ordinal()] == 1) {
                    eVar = yl2.e.NO_INTERNET_CONNECTION;
                } else if (i14 == 409) {
                    eVar = yl2.e.HTTP_CONFLICT_409;
                } else {
                    eVar = i14 == 500 ? yl2.e.HTTP_INTERNAL_ERROR_500 : yl2.e.OTHER_FATAL;
                }
                vVar.f17620a.b(eVar);
            }
        }

        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            v vVar = v.this;
            lj0.j jVar = vVar.f17623d;
            long j8 = vVar.f17621b;
            c cVar = vVar.f17620a;
            if (jVar.e()) {
                return;
            }
            int i14 = aVar.f112978b;
            Object obj = aVar.f112977a;
            if (i14 == 400) {
                yl2.e eVar = yl2.e.OTHER_FATAL;
                try {
                    JSONObject jSONObject = new JSONObject((String) obj).getJSONObject(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    if (4001 == jSONObject.getInt("subcode")) {
                        eVar = yl2.e.INVALID_UNIT_ID;
                        String strOptString = jSONObject.optString("message", null);
                        if (!TextUtils.isEmpty(strOptString)) {
                            i2.m(a2.DEVICES, "DeviceRegistrar", "Unit ID [" + j8 + "]. " + strOptString);
                        }
                    }
                } catch (JSONException unused) {
                } finally {
                    cVar.b(eVar);
                }
                return;
            }
            try {
                boolean z14 = new JSONObject((String) obj).getBoolean("newRegistration");
                lj0.f fVar = lj0.f.f112998z;
                Object[] objArr = {String.valueOf(j8)};
                if (!z14) {
                    new lj0.j(new C0250a(this)).b(new lj0.i(fVar, objArr));
                }
            } catch (JSONException e4) {
                u0.v(e4, new StringBuilder("Error parsing device registration succeeded JSON response: "), a2.DEVICES, "DeviceRegistrar");
                cVar.b(yl2.e.JSON_PARSING_EXCEPTION);
            }
            if (vVar.f17626g) {
                cVar.c();
                return;
            }
            if (this.f17627a) {
                new u(j8, new w(vVar)).a();
            } else {
                cVar.c();
            }
            vVar.f17625f.B(vVar.f17622c);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17629a;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f17629a = iArr;
            try {
                iArr[lj0.c.CONNECT_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface c {
        void a();

        void b(yl2.e eVar);

        void c();
    }

    public v(boolean z14, long j8, int i14, c cVar, l80.a aVar, boolean z15) {
        this.f17624e = z14;
        this.f17621b = j8;
        this.f17622c = i14;
        this.f17620a = cVar;
        this.f17625f = aVar;
        this.f17626g = z15;
    }

    public final void a(String str, byte[] bArr, boolean z14) {
        c cVar = this.f17620a;
        if (bArr == null || bArr.length == 0) {
            i2.f(a2.DEVICES, "DeviceRegistrar", "Device XML bytes is null!");
            if (cVar != null) {
                cVar.b(yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES);
                return;
            }
            return;
        }
        lj0.f fVar = lj0.f.f112984j;
        fVar.f113006h = bArr;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new Pair("UserLocale", str));
        }
        if (this.f17624e) {
            arrayList.add(new Pair("Override", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        }
        lj0.j jVar = new lj0.j(new a(z14));
        this.f17623d = jVar;
        jVar.b(new lj0.i(fVar, new Object[0], arrayList));
        if (cVar != null) {
            cVar.a();
        }
    }
}
