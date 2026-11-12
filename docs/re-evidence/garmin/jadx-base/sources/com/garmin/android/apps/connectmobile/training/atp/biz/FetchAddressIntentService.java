package com.garmin.android.apps.connectmobile.training.atp.biz;

import android.app.IntentService;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/FetchAddressIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FetchAddressIntentService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f45116a;

    static {
        new a(null);
    }

    public FetchAddressIntentService() {
        super("FetchAddressIS");
    }

    public final void a(int i14, String str, Address address) {
        Bundle bundleD = b71.i.d("com.google.android.gms.location.sample.locationaddress.RESULT_DATA_KEY", str);
        if (address != null) {
            bundleD.putParcelable("com.google.android.gms.location.sample.locationaddress.RESULT_ADDRESS_KEY", address);
        }
        ResultReceiver resultReceiver = this.f45116a;
        resultReceiver.getClass();
        resultReceiver.send(i14, bundleD);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Parcelable parcelable;
        Parcelable parcelable2;
        List<Address> fromLocation;
        intent.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.google.android.gms.location.sample.locationaddress.RECEIVER", ResultReceiver.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.location.sample.locationaddress.RECEIVER");
            if (!(parcelableExtra instanceof ResultReceiver)) {
                parcelableExtra = null;
            }
            parcelable = (ResultReceiver) parcelableExtra;
        }
        ResultReceiver resultReceiver = (ResultReceiver) parcelable;
        this.f45116a = resultReceiver;
        if (resultReceiver == null) {
            i2.a.j(i2.f36769a, "FetchAddressIS", "No receiver received. There is nowhere to send the results.");
            return;
        }
        if (i14 >= 33) {
            parcelable2 = (Parcelable) intent.getParcelableExtra("com.google.android.gms.location.sample.locationaddress.LOCATION_DATA_EXTRA", Location.class);
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("com.google.android.gms.location.sample.locationaddress.LOCATION_DATA_EXTRA");
            if (!(parcelableExtra2 instanceof Location)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (Location) parcelableExtra2;
        }
        Location location = (Location) parcelable2;
        if (location == null) {
            i2.a.j(i2.f36769a, "FetchAddressIS", "No location data provided");
            a(1, "", null);
            return;
        }
        try {
            fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        } catch (IOException e4) {
            i2.a.j(i2.f36769a, "FetchAddressIS", "Sorry, the service is not available: " + e4.getMessage());
            fromLocation = null;
        } catch (IllegalArgumentException e14) {
            i2.a aVar = i2.f36769a;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            String message = e14.getMessage();
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("Invalid latitude or longitude used. Latitude = ", latitude, ", Longitude = ");
            sbA.append(longitude);
            sbA.append(" : ");
            sbA.append(message);
            i2.a.j(aVar, "FetchAddressIS", sbA.toString());
            fromLocation = null;
        }
        if (fromLocation == null || fromLocation.size() == 0) {
            i2.a.j(i2.f36769a, "FetchAddressIS", "No address found");
            a(1, "No address found", null);
            return;
        }
        Address address = fromLocation.get(0);
        ArrayList arrayList = new ArrayList();
        int maxAddressLineIndex = address.getMaxAddressLineIndex();
        if (maxAddressLineIndex >= 0) {
            int i15 = 0;
            while (true) {
                arrayList.add(address.getAddressLine(i15));
                if (i15 == maxAddressLineIndex) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        i2.a.l(i2.f36769a, "FetchAddressIS", "Address found");
        String strJoin = TextUtils.join(System.getProperty("line.separator"), arrayList);
        strJoin.getClass();
        a(0, strJoin, address);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/FetchAddressIntentService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
