package yr2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.garmin.android.apps.connectmobile.l2;

/* JADX INFO: loaded from: classes11.dex */
public final class k {
    public static final void a(Intent intent, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        parcelObtain.writeValue(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 512000) {
            bundle.putBoolean("is.large.bundle", false);
            intent.putExtras(bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is.large.bundle", true);
        l2.f37135b.getClass();
        l2.a.b().a(intent, bundle);
        intent.putExtras(bundle2);
    }
}
