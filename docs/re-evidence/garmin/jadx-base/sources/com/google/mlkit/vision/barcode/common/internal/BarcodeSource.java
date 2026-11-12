package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public interface BarcodeSource {
    @KeepForSdk
    Rect getBoundingBox();

    @KeepForSdk
    Barcode.CalendarEvent getCalendarEvent();

    @KeepForSdk
    Barcode.ContactInfo getContactInfo();

    @KeepForSdk
    Point[] getCornerPoints();

    @KeepForSdk
    String getDisplayValue();

    @KeepForSdk
    Barcode.DriverLicense getDriverLicense();

    @KeepForSdk
    Barcode.Email getEmail();

    @KeepForSdk
    int getFormat();

    @KeepForSdk
    Barcode.GeoPoint getGeoPoint();

    @KeepForSdk
    Barcode.Phone getPhone();

    @KeepForSdk
    byte[] getRawBytes();

    @KeepForSdk
    String getRawValue();

    @KeepForSdk
    Barcode.Sms getSms();

    @KeepForSdk
    Barcode.UrlBookmark getUrl();

    @KeepForSdk
    int getValueType();

    @KeepForSdk
    Barcode.WiFi getWifi();
}
