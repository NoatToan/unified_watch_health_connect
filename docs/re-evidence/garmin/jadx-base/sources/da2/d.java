package da2;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.android.gfdi.DefaultAuthStateCallback;
import com.garmin.android.gfdi.framework.GfdiServiceSubscriber;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.datatypes.capabilities.CapabilitiesRegistry;
import eh2.e;
import java.util.UUID;
import ml2.l;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements CapabilitiesRegistry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f58880c = LoggerFactory.getLogger("GDI#Gdi");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f58881d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f58882e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f58883f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static d f58884g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static e f58885h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final la2.e f58886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hk0.f f58887b;

    private d(Context context, e eVar) {
        Logger logger = f58880c;
        logger.debug("initialize start");
        BluetoothAdapter.getDefaultAdapter();
        ma2.g.b(ml2.m.f119394a, new eh2.f.b());
        for (UUID uuid : eVar.f58891b) {
            UUID uuid2 = ma2.h.f117674b;
            if (uuid2.equals(uuid)) {
                ma2.g.b(uuid2, new GfdiServiceSubscriber.Creator(uuid2, ma2.h.f117677e, ma2.h.f117676d));
            } else {
                ma2.g.b(uuid, new GfdiServiceSubscriber.Creator(uuid, ma2.h.f117679g, ma2.h.f117678f));
            }
        }
        ma2.g.b(ma2.h.f117687o, new fh2.d.a());
        final int i14 = eVar.f58893d;
        vb2.b.f176922e.getClass();
        eh2.h.f64078a.put(22, new eh2.e.a() { // from class: vb2.a
            @Override // eh2.e.a
            public final e a(Context context2, l lVar) {
                lVar.getClass();
                return new b(lVar, i14, null);
            }
        });
        this.f58886a = new la2.e(context, eVar);
        AuthRegistry.getInstance().addCallback(new DefaultAuthStateCallback(context));
        logger.debug("initialize end");
    }

    public static d b() {
        d dVar;
        synchronized (f58883f) {
            try {
                dVar = f58884g;
                if (dVar == null) {
                    throw new IllegalStateException("Cannot access Gdi without supplying GdiClientConfiguration and Context");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    public static d c(Context context) {
        d dVar;
        synchronized (f58883f) {
            try {
                if (f58884g == null) {
                    e eVar = f58885h;
                    if (eVar == null) {
                        f58880c.error("GdiClientConfiguaration has not bee set.");
                        throw new IllegalStateException("App must call initialize or setClientConfig before accessing Gdi");
                    }
                    f58884g = new d(context, eVar);
                    oa2.c.a(f58885h);
                }
                dVar = f58884g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    public final DeviceProfile a(String str) {
        return this.f58886a.f111646e.d(str);
    }

    @Override // com.garmin.device.datatypes.capabilities.CapabilitiesRegistry
    public final <T> T getCapability(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) this.f58886a.f111646e.getCapability(str, cls);
    }
}
