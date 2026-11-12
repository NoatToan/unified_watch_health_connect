package ar;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.m;
import com.google.android.gms.maps.model.LatLng;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.koin.java.KoinJavaComponent;
import zb0.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    public static Intent a(Activity activity, gs1.b bVar) {
        Long activityId;
        if (bVar != null && (activityId = bVar.getActivityId()) != null) {
            gs1.c activityType = bVar.getActivityType();
            String typeKey = activityType != null ? activityType.getTypeKey() : null;
            aq.b bVar2 = new aq.b();
            bVar2.f11823b = activityId.longValue();
            am.h hVar = am.h.VIEW_EDIT;
            if (hVar != null) {
                bVar2.f11824c = hVar;
            }
            bVar2.f11825d = true;
            bVar2.f11827f = typeKey;
            return bVar2.a(activity);
        }
        return new Intent();
    }

    public static Intent b(Context context, com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.BAIDU;
        m mVar = m.f50298a;
        dVar.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarG = fVar.g(m.c(fVar.f50283a, dVar));
        if (fVarG == null) {
            vb.h.s("Illegal coordinate system transformation.");
            return null;
        }
        StringBuilder sb3 = new StringBuilder("baidumap://map/marker?location=");
        LatLng latLng = fVarG.f50283a;
        sb3.append(latLng.latitude);
        sb3.append(",");
        sb3.append(latLng.longitude);
        sb3.append("&title=");
        sb3.append(URLEncoder.encode(context.getString(R.string.last_known_location_label), "UTF-8"));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString()));
        intent.setPackage("com.baidu.BaiduMap");
        intent.setFlags(268468224);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://api.map.baidu.com/marker?location=" + latLng.latitude + "," + latLng.longitude + "&title=" + URLEncoder.encode(context.getString(R.string.last_known_location_label), "UTF-8") + "&output=html"));
        intent2.setFlags(268468224);
        return intent2;
    }

    public static Intent c(Context context, com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        m mVar = m.f50298a;
        dVar.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarG = fVar.g(m.c(fVar.f50283a, dVar));
        if (fVarG == null) {
            vb.h.s("Illegal coordinate system transformation.");
            return null;
        }
        StringBuilder sb3 = new StringBuilder("geo:0,0?q=");
        LatLng latLng = fVarG.f50283a;
        sb3.append(latLng.latitude);
        sb3.append(",");
        sb3.append(latLng.longitude);
        sb3.append(URLEncoder.encode(context.getString(R.string.last_known_location_label), "UTF-8"));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString()));
        intent.setPackage("com.google.android.apps.maps");
        intent.setFlags(268468224);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        Toast.makeText(context, context.getString(R.string.download_goolge_maps_lbl), 0).show();
        return null;
    }

    public static Intent d(Context context, long j8) {
        b0 b0VarP0 = ((am.d) KoinJavaComponent.get(am.d.class)).p0(context, j8);
        double d14 = Double.parseDouble(b0VarP0.f203431b);
        double d15 = Double.parseDouble(b0VarP0.f203432c);
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(d14, d15, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        if (d14 == 0.0d && d15 == 0.0d) {
            new androidx.appcompat.app.e.a(context).setTitle(R.string.common_no_location_found).setMessage(R.string.common_last_known_device_location).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
            return null;
        }
        try {
            return ((f12.b) KoinJavaComponent.get(f12.b.class)).f() ? b(context, fVar) : c(context, fVar);
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
