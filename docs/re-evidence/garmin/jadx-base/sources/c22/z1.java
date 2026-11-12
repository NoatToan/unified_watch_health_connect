package c22;

import android.location.Address;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/z1;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f23762a = new z1();

    private z1() {
    }

    public static com.garmin.android.library.mapsdkadapter.f a(Address address, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        address.getClass();
        dVar.getClass();
        return new com.garmin.android.library.mapsdkadapter.f(address.getLatitude(), address.getLongitude(), dVar);
    }

    public static String b(Location location) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("(%.4f, %.4f)", Arrays.copyOf(new Object[]{location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null}, 2));
    }

    public static String c(com.garmin.android.library.mapsdkadapter.f fVar) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        LatLng latLng = fVar.f50283a;
        return String.format("(%.4f, %.4f)", Arrays.copyOf(new Object[]{Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude)}, 2));
    }

    public static Address d(com.garmin.android.library.mapsdkadapter.f fVar) {
        Address address = new Address(Locale.getDefault());
        LatLng latLng = fVar.f50283a;
        address.setLatitude(latLng.latitude);
        address.setLongitude(latLng.longitude);
        return address;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(com.garmin.android.library.mapsdkadapter.f fVar, v13.c cVar) {
        y1 y1Var;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i14 = y1Var.f23757c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y1Var.f23757c = i14 - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(this, cVar);
            }
        } else {
            y1Var = new y1(this, cVar);
        }
        Object objA = y1Var.f23755a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y1Var.f23757c;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.library.mapsdkadapter.g gVar = new com.garmin.android.library.mapsdkadapter.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            y1Var.f23757c = 1;
            objA = gVar.f50285a.a(fVar, y1Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return p13.h0.d0((List) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, v13.c cVar) {
        x1 x1Var;
        if (cVar instanceof x1) {
            x1Var = (x1) cVar;
            int i14 = x1Var.f23750c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x1Var.f23750c = i14 - Integer.MIN_VALUE;
            } else {
                x1Var = new x1(this, cVar);
            }
        } else {
            x1Var = new x1(this, cVar);
        }
        Object objB = x1Var.f23748a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x1Var.f23750c;
        if (i15 == 0) {
            o13.r.b(objB);
            com.garmin.android.library.mapsdkadapter.g gVar = new com.garmin.android.library.mapsdkadapter.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            x1Var.f23750c = 1;
            objB = gVar.f50285a.b(str, x1Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return p13.h0.d0((List) objB);
    }
}
