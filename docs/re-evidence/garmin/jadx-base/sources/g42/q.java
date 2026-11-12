package g42;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.b0;
import c22.z1;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import lc.u0;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg42/q;", "Landroidx/lifecycle/u1;", "Liw/a;", "deviceSettingsRepo", "<init>", "(Liw/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f75816h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw.a f75817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<Address> f75818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f75819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f75821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f75822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75823g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75824a;

        static {
            int[] iArr = new int[j22.f.values().length];
            try {
                iArr[j22.f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.f.ALLOWED_WHILE_USING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75824a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f75816h = gt2.b.f79005a.h("WeatherLocationSelectionViewModel");
    }

    public q(iw.a aVar) {
        aVar.getClass();
        this.f75817a = aVar;
        y0<Address> y0Var = new y0<>();
        this.f75818b = y0Var;
        this.f75819c = y0Var;
        this.f75821e = -1L;
    }

    public static androidx.lifecycle.j A4(String str) {
        return androidx.lifecycle.m.a(null, new t(str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(q qVar, v13.c cVar) {
        u uVar;
        qVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f75836c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f75836c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(qVar, cVar);
            }
        } else {
            uVar = new u(qVar, cVar);
        }
        Object objJ = uVar.f75834a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f75836c;
        Logger logger = f75816h;
        if (i15 == 0) {
            o13.r.b(objJ);
            long j8 = qVar.f75821e;
            if (j8 < 0) {
                logger.error("getDeviceLocation: deviceId not set, cannot fetch location");
                return null;
            }
            iw.a aVar2 = qVar.f75817a;
            uVar.f75836c = 1;
            aVar2.getClass();
            objJ = f0.J(aVar2, new iw.b(aVar2, j8, null), uVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            logger.warn("getDeviceLocation: failed to fetch device settings for device " + qVar.f75821e);
            return null;
        }
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) ((v2.b) v2Var).f47386a;
        Double d14 = deviceSettingsDTO.C1;
        Double d15 = deviceSettingsDTO.D1;
        if (d14 == null || d15 == null) {
            wr.g.w("getDeviceLocation: lat/long not set on server for device ", qVar.f75821e, logger);
            return null;
        }
        Location locationD = cu2.h.d(d14.doubleValue(), d15.doubleValue());
        long j14 = qVar.f75821e;
        StringBuilder sbI = tn.k.i("getDeviceLocation: returning lat[", d14, d15, "], long[", "] for device ");
        sbI.append(j14);
        logger.debug(sbI.toString());
        return locationD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(q qVar, v13.c cVar) {
        w wVar;
        qVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f75843c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f75843c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(qVar, cVar);
            }
        } else {
            wVar = new w(qVar, cVar);
        }
        Object objF = wVar.f75841a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f75843c;
        if (i15 == 0) {
            o13.r.b(objF);
            b0 b0Var = b0.f23008a;
            String strB = b0.b(null);
            b0Var.getClass();
            String strA = b0.a(strB, false);
            z1 z1Var = z1.f23762a;
            wVar.f75843c = 1;
            objF = z1Var.f(strA, wVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        Address address = (Address) objF;
        Location locationD = address != null ? cu2.h.d(address.getLatitude(), address.getLongitude()) : null;
        z1.f23762a.getClass();
        f75816h.debug("getUserCountryLocation: Returning location at ".concat(z1.b(locationD)));
        return locationD;
    }

    public static final Location z4(q qVar, Context context) {
        qVar.getClass();
        j22.b.f96736a.getClass();
        int i14 = b.f75824a[j22.b.j(context).ordinal()];
        if (i14 != 1 && i14 != 2) {
            return null;
        }
        du2.g.f61293g.getClass();
        Location locationA = du2.g.a.a(context);
        z1.f23762a.getClass();
        f75816h.debug("getUserCurrentLocation: returning ".concat(z1.b(locationA)));
        return locationA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(Double d14, Double d15, v13.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f75848e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f75848e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objA = xVar.f75846c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f75848e;
        Logger logger = f75816h;
        if (i15 == 0) {
            o13.r.b(objA);
            if (this.f75821e < 0) {
                logger.error("setDeviceLocation: deviceId not set, cannot save location");
                return Boolean.FALSE;
            }
            String string = new JSONObject().put("latitude", d14 != null ? d14.doubleValue() : 2.147483647E9d).put("longitude", d15 != null ? d15.doubleValue() : 2.147483647E9d).toString();
            string.getClass();
            long j8 = this.f75821e;
            xVar.f75844a = d14;
            xVar.f75845b = d15;
            xVar.f75848e = 1;
            objA = this.f75817a.a(j8, string, xVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d15 = xVar.f75845b;
            d14 = xVar.f75844a;
            o13.r.b(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        long j14 = this.f75821e;
        if (zBooleanValue) {
            StringBuilder sbI = tn.k.i("setDeviceLocation: successfully saved lat[", d14, d15, "], long[", "] for device ");
            sbI.append(j14);
            logger.debug(sbI.toString());
            return objA;
        }
        StringBuilder sbI2 = tn.k.i("setDeviceLocation: failed to save lat[", d14, d15, "], long[", "] for device ");
        sbI2.append(j14);
        logger.warn(sbI2.toString());
        return objA;
    }

    public final void C4(Address address, com.garmin.android.library.mapsdkadapter.f fVar) {
        if (fVar != null) {
            LatLng latLng = fVar.f50283a;
            if (address != null) {
                f75816h.debug("updateTemporaryAddress: updating address with coordinates");
                address.setLatitude(latLng.latitude);
                address.setLongitude(latLng.longitude);
            }
        }
        this.f75818b.m(address);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg42/q$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "USER_HAS_SEEN_MAP_TOOLTIP", "Ljava/lang/String;", "", "INVALID_COORDINATE", "D", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ q(iw.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? iw.a.C1823a.a(iw.a.f95249b) : aVar);
    }
}
