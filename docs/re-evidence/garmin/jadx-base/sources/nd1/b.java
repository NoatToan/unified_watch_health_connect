package nd1;

import com.garmin.android.gncs.NotificationConstants;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnd1/b;", "", "Lpd1/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lpd1/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f125403a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125404a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125404a = iArr;
        }
    }

    public b(pd1.a aVar) {
        aVar.getClass();
        this.f125403a = aVar;
    }

    public abstract od1.a a();

    public abstract od1.b b();

    public final void c(c cVar) {
        od1.c cVarB;
        cVar.getClass();
        int i14 = a.f125404a[cVar.ordinal()];
        if (i14 == 1) {
            cVarB = b();
        } else {
            if (i14 != 2) {
                u0.r();
                return;
            }
            cVarB = a();
        }
        cVarB.a();
    }
}
