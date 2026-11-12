package com.huami.mifit.sportlib.locate;

/* JADX INFO: loaded from: classes11.dex */
public class GPSLocationHelper {
    private static volatile GPSLocationHelper b;
    private long a;

    private GPSLocationHelper() {
    }

    public static GPSLocationHelper getInstance() {
        if (b == null) {
            synchronized (GPSLocationHelper.class) {
                if (b == null) {
                    b = new GPSLocationHelper();
                }
            }
        }
        return b;
    }

    public long getLocationTimeStampOffset() {
        return this.a;
    }

    public void setLocationTimeStampOffset(long j) {
        this.a = j;
    }
}
