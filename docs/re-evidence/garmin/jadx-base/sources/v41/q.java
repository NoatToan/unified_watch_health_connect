package v41;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p005kotlin.Metadata;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv41/q;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr53/z1;", "Lu41/b;", "paceProPlanFlow", "Lr53/o2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailFlow", "Lqw0/s;", "mapSettingsPreferences", "Lf12/l;", "gcmUserSettings", "<init>", "(Landroid/content/Context;Lr53/z1;Lr53/o2;Lqw0/s;Lf12/l;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1<u41.b> f175651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2<com.garmin.android.apps.connectmobile.courses.model.e> f175652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qw0.s f175653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.l f175654e;

    public q(Context context, z1<u41.b> z1Var, o2<com.garmin.android.apps.connectmobile.courses.model.e> o2Var, qw0.s sVar, f12.l lVar) {
        context.getClass();
        z1Var.getClass();
        o2Var.getClass();
        sVar.getClass();
        lVar.getClass();
        this.f175650a = context;
        this.f175651b = z1Var;
        this.f175652c = o2Var;
        this.f175653d = sVar;
        this.f175654e = lVar;
    }

    public static final le2.c a(q qVar, Context context, ke2.b bVar, int i14) {
        qVar.getClass();
        Drawable drawable = a7.b.getDrawable(context, i14);
        Bitmap bitmapB = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
        return new le2.c(bVar, bitmapB, b(bitmapB), 1.0f);
    }

    public static BitmapDescriptor b(Bitmap bitmap) {
        ie2.n.f93149a.getClass();
        if (((qw0.i) ie2.n.a()).f() != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
            return null;
        }
        if (bitmap != null) {
            try {
                BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                if (bitmapDescriptorFromBitmap != null) {
                    return bitmapDescriptorFromBitmap;
                }
            } catch (Exception e4) {
                sn.a.s("Exception creating BitmapDescriptor: ", e4.getMessage(), i2.f36769a, a2.GENERAL, "PlanMapUseCase");
                return null;
            }
        }
        BitmapDescriptor bitmapDescriptorDefaultMarker = BitmapDescriptorFactory.defaultMarker();
        bitmapDescriptorDefaultMarker.getClass();
        return bitmapDescriptorDefaultMarker;
    }

    public final void c(boolean z14) {
        z1<u41.b> z1Var;
        u41.b value;
        u41.b bVar;
        o51.e eVar;
        do {
            z1Var = this.f175651b;
            value = z1Var.getValue();
            bVar = value;
            eVar = bVar.f168614f;
        } while (!z1Var.b(value, u41.b.a(bVar, null, null, null, 0, 0, eVar != null ? o51.e.a(eVar, null, 0, z14, 247) : null, null, null, null, null, null, false, false, false, 16351)));
        this.f175653d.a(z14);
        if (z14) {
            d(com.garmin.android.library.mapsdkadapter.i.d.MAPBOX);
        }
    }

    public final void d(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        z1<u41.b> z1Var;
        u41.b value;
        u41.b bVar;
        o51.e eVar;
        dVar.getClass();
        do {
            z1Var = this.f175651b;
            value = z1Var.getValue();
            bVar = value;
            eVar = bVar.f168614f;
        } while (!z1Var.b(value, u41.b.a(bVar, null, null, null, 0, 0, eVar != null ? o51.e.a(eVar, dVar, 0, false, 254) : null, null, null, null, null, null, false, false, false, 16351)));
        if (dVar != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
            c(false);
        }
        this.f175653d.z(dVar);
    }
}
