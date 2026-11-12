package jw;

import android.webkit.URLUtil;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101230c;

    public c() {
        this.f101229b = AbstractComponentTracker.LINGERING_TIMEOUT;
        this.f101230c = 2592000000L;
    }

    public abstract String a();

    public abstract r53.i<String> b();

    public abstract String c();

    public abstract void d(Object obj, String str);

    public final void e(String str) {
        if (URLUtil.isValidUrl(str)) {
            this.f101228a = str;
        } else {
            i2.n("CacheController", "Invalid cache key: will not save cache.");
            this.f101228a = null;
        }
    }

    public c(long j8, long j14) {
        this.f101229b = j8;
        this.f101230c = j14;
    }
}
