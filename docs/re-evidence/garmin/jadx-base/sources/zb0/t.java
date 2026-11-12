package zb0;

import android.content.Context;
import android.util.Patterns;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    public static final boolean a(String str) {
        return str != null && Patterns.WEB_URL.matcher(str).matches();
    }

    public static final void b(ImageView imageView, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        imageView.getClass();
        String imageUrl = lVar != null ? lVar.getImageUrl() : null;
        String deviceImageURL = lVar != null ? lVar.getDeviceImageURL() : null;
        StringBuilder sbI = p6.b.i("setDeviceImage(URL[", imageUrl, "] FALLBACK_URL[", deviceImageURL, "]) for device[");
        sbI.append(lVar);
        sbI.append("]");
        String string = sbI.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "DeviceImageLoader", string);
        zp0.c.a aVar2 = zp0.c.f206560v;
        Context context = imageView.getContext();
        context.getClass();
        aVar2.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = imageUrl;
        cVar.f206566f = deviceImageURL;
        cVar.f206571k = 2131231969;
        cVar.f206575o = null;
        cVar.h(imageView);
    }

    public static void c(ImageView imageView, sd2.f fVar) {
        imageView.getClass();
        String strD = fVar != null ? d(fVar) : null;
        String imageURL = fVar != null ? fVar.getImageURL() : null;
        StringBuilder sbI = p6.b.i("setDeviceImage(URL[", strD, "]) FALLBACK_URL[", imageURL, "]) for device[");
        sbI.append(fVar);
        sbI.append("]");
        String string = sbI.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "DeviceImageLoader", string);
        zp0.c.a aVar2 = zp0.c.f206560v;
        Context context = imageView.getContext();
        context.getClass();
        aVar2.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = strD;
        cVar.f206566f = imageURL;
        cVar.f206571k = 2131231969;
        cVar.f206575o = null;
        cVar.h(imageView);
    }

    public static final String d(sd2.f fVar) {
        if (fVar == null) {
            return null;
        }
        if (a(fVar.u4())) {
            return fVar.u4();
        }
        if (a(fVar.t0())) {
            return fVar.t0();
        }
        return a(fVar.L()) ? fVar.L() : fVar.getImageURL();
    }
}
