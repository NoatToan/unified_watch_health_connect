package oq2;

import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq2/b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f133301a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f133302b = {1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f133303c = {0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f133304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Uri f133305e;

    static {
        Uri uri = Uri.parse("https://discover.garmin.com/th-TH/minisite/rabbit/user-guide/");
        uri.getClass();
        f133304d = uri;
        Uri uri2 = Uri.parse("https://discover.garmin.com/th-TH/minisite/rabbit/en/user-guide/ ");
        uri2.getClass();
        f133305e = uri2;
    }

    private b() {
    }
}
