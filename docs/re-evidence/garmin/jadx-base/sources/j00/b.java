package j00;

import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj00/b;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95965a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.NOT_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f95965a = iArr;
        }
    }

    public String a(DateTime dateTime, d dVar) {
        dVar.getClass();
        int i14 = a.f95965a[dVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return StringUtils.SPACE;
        }
        if (i14 == 4) {
            return "";
        }
        u0.r();
        return null;
    }
}
