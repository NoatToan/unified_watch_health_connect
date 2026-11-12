package qw0;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqw0/m;", "", "Lcom/garmin/android/library/mapsdkadapter/i$d;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$d;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f148324a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148325a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.MAPBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.BAIDU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148325a = iArr;
        }
    }

    public m(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        this.f148324a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f148324a == ((m) obj).f148324a;
    }

    public final int hashCode() {
        return this.f148324a.hashCode();
    }

    public final String toString() {
        return "MapProviderItem(type=" + this.f148324a + ")";
    }
}
