package eb2;

import android.content.Context;
import android.location.Address;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63686a;

    public b(Context context, kb2.a aVar) {
        double latitude;
        double longitude;
        context.getApplicationContext();
        if (aVar != null) {
            Address address = (Address) aVar.f103839a.getParcelable("android.location.Address");
            if (address != null && address.hasLatitude()) {
                latitude = address.getLatitude();
            } else {
                if (!aVar.f103840b.getBoolean("com.garmin.android.location.HasLatitude")) {
                    h.z("No latitude exists for this place");
                    throw null;
                }
                latitude = aVar.f103840b.getDouble("com.garmin.android.location.Latitude");
            }
            lb2.b.a(latitude);
            Address address2 = (Address) aVar.f103839a.getParcelable("android.location.Address");
            if (address2 != null && address2.hasLongitude()) {
                longitude = address2.getLongitude();
            } else {
                if (!aVar.f103840b.getBoolean("com.garmin.android.location.HasLongitude")) {
                    h.z("No longitude exists for this place");
                    throw null;
                }
                longitude = aVar.f103840b.getDouble("com.garmin.android.location.Longitude");
            }
            lb2.b.a(longitude);
            this.f63686a = true;
        }
    }

    @Override // eb2.d
    public final boolean b() {
        return this.f63686a;
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public b(Context context, int i14, int i15) {
        context.getApplicationContext();
        this.f63686a = true;
    }
}
