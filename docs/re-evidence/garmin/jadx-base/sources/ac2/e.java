package ac2;

import ch.qos.logback.classic.Logger;
import gy2.f;
import gy2.i;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2710a = new f("SYNC#");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f2711b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2712a;

        static {
            int[] iArr = new int[i.values().length];
            f2712a = iArr;
            try {
                iArr[i.DEVICE_MESSAGE_DOWNLOAD_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2712a[i.INVALID_MESSAGE_DOWNLOAD_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2712a[i.FIT_FILE_CONTENT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2712a[i.INVALID_SOFTWARE_UPDATE_FILE_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2712a[i.SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2712a[i.CONTENT_DOES_NOT_EXIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2712a[i.TEMP_FILE_WRITE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2712a[i.NO_NETWORK_CONNECTIVITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2712a[i.UNEXPECTED_SERVER_RESPONSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2712a[i.EMPTY_SERVER_RESPONSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public e() {
        int i14 = gt2.c.f79010a;
        this.f2711b = gt2.b.f79005a.i("SYNC#SwDownloadStrategy");
    }
}
