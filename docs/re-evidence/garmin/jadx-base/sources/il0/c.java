package il0;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lil0/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    DOWNLOADING,
    DOWNLOADED,
    NOT_DOWNLOADED,
    DOWNLOAD_FAILED;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93960a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lil0/c$a;", "", "<init>", "()V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: il0.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1795a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f93966a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.DOWNLOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.DOWNLOADED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.NOT_DOWNLOADED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.DOWNLOAD_FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f93966a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static int a(c cVar) {
            int i14 = C1795a.f93966a[cVar.ordinal()];
            if (i14 == 1) {
                return R.string.lbl_in_progress;
            }
            if (i14 == 2) {
                return R.string.lbl_downloaded;
            }
            if (i14 == 3 || i14 == 4) {
                return R.string.lbl_download;
            }
            u0.r();
            return 0;
        }

        public static c b(Integer num) {
            if ((num != null && num.intValue() == 1) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 4))) {
                return c.NOT_DOWNLOADED;
            }
            if (num != null && num.intValue() == 3) {
                return c.DOWNLOADING;
            }
            if (num != null && num.intValue() == 5) {
                return c.DOWNLOADED;
            }
            if (num != null && num.intValue() == 6) {
                return c.DOWNLOAD_FAILED;
            }
            return null;
        }

        private a() {
        }
    }
}
