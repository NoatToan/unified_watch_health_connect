package y90;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly90/g;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195284a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al2.b.NO_ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al2.b.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195284a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public static boolean a(String str, al2.c cVar) {
        boolean z14;
        str.getClass();
        int i14 = a.f195284a[cVar.f3777c.ordinal()];
        if (i14 == 1) {
            CoreTransferException coreTransferException = cVar.f3778d;
            if ((coreTransferException != null ? coreTransferException.getFailure() : null) != ok2.e.f132641i) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else if (i14 == 2 || i14 == 3) {
            z14 = true;
        } else {
            z14 = false;
        }
        return yr1.e.d(str) && z14;
    }
}
