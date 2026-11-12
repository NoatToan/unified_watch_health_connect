package com.garmin.android.apps.connectmobile;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class GolfDeviceProviderWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Uri f28701e = Uri.parse("content://com.garmin.android.apps.golf.contentprovider.devices/devices");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f28702f = {"unit_id", "part_nbr", "product_nbr", "software_version", "image_url", "display_name", "product_display_name", "mac_address", "connection_type", "gble_ediv", "gble_rand", "gble_ltk", "capabilities", "application_key"};

    public GolfDeviceProviderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    @Override // androidx.work.Worker
    public final androidx.work.d.a c() {
        int i14;
        byte[] bArrDecode;
        boolean z14;
        try {
            if (hb2.j.b(GarminConnectMobileApp.f28688j, "com.garmin.android.apps.golf")) {
                ContentResolver contentResolver = GarminConnectMobileApp.f28688j.getContentResolver();
                Cursor cursorQuery = contentResolver != null ? contentResolver.query(f28701e, f28702f, null, null, null) : null;
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    Collection<String> collectionF = ed0.a.f();
                    while (cursorQuery.moveToNext()) {
                        long j8 = Long.parseLong(cursorQuery.getString(0));
                        cursorQuery.getString(1);
                        String string = cursorQuery.getString(2);
                        if (collectionF.contains(string)) {
                            int i15 = Integer.parseInt(string);
                            String string2 = cursorQuery.getString(3);
                            cursorQuery.getString(4);
                            cursorQuery.getString(5);
                            String string3 = cursorQuery.getString(6);
                            String string4 = cursorQuery.getString(7);
                            String string5 = cursorQuery.getString(8);
                            String string6 = cursorQuery.getString(9);
                            String string7 = cursorQuery.getString(10);
                            String string8 = cursorQuery.getString(11);
                            String string9 = cursorQuery.getString(12);
                            String string10 = cursorQuery.getString(13);
                            if (string5.equals("ble")) {
                                i14 = 1;
                            } else {
                                i14 = string5.equals("btc") ? 2 : 3;
                            }
                            if (string6 != null) {
                                try {
                                    bArrDecode = Base64.decode(string6, 0);
                                } catch (NullPointerException e4) {
                                    i2.f(a2.GOLF, "GolfDeviceProviderWorker", "GolfDeviceProviderWorker.doWork(): " + e4.getMessage());
                                }
                            } else {
                                bArrDecode = null;
                            }
                            byte[] bArrDecode2 = string7 != null ? Base64.decode(string7, 0) : null;
                            byte[] bArrDecode3 = string8 != null ? Base64.decode(string8, 0) : null;
                            if (string9 != null) {
                                byte[] bArrDecode4 = Base64.decode(string9, 0);
                                SupportedCapability supportedCapability = SupportedCapability.MULTI_LINK_SERVICE;
                                if ((bArrDecode4[supportedCapability.ordinal() / 8] & (1 << (supportedCapability.ordinal() % 8))) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                            rd2.f.a().f152047c.g(j8, i15, string10, string4, string3, string2, 0L, 0, i14, new byte[0], false, "", bArrDecode, bArrDecode2, bArrDecode3, z14, null);
                        } else {
                            i2.m(a2.GOLF, "GolfDeviceProviderWorker", "GolfDeviceProviderWorker skip unnecessary product number " + string);
                            rd2.f.a().f152046b.getClass();
                            rd2.g.d(j8);
                        }
                    }
                }
            }
        } catch (Exception e14) {
            i2.f(a2.GOLF, "GolfDeviceProviderWorker", "Exception reading device information from Golf application: " + e14.getMessage());
        }
        return new androidx.work.d.a.c();
    }
}
