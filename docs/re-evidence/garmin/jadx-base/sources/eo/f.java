package eo;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import jr.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Leo/f;", "", "", "serverKey", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum f {
    NAME("name", null, 2, null),
    START_LOCAL("startLocal", null, 2, null),
    DISTANCE("distance", Integer.valueOf(R.string.lbl_distance)),
    DURATION("duration", Integer.valueOf(R.string.lbl_duration)),
    MAX_DEPTH("maxDepth", Integer.valueOf(R.string.lbl_max_depth));


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64768c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f64776b;

    /* synthetic */ f(String str, Integer num, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : num);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo/f$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: eo.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1378a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64777a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.DISTANCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.SWIMMING_DISTANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.TOTAL_TIME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[p.MAX_DEPTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f64777a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    f(String str, Integer num) {
        this.f64775a = str;
        this.f64776b = num;
    }
}
