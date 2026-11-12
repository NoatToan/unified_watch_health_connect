package df;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f59415a = {13, 15, 14};

    public static final int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            l.f59412a.getClass();
            int[] capabilities = networkRequest.getCapabilities();
            capabilities.getClass();
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 30; i14++) {
            int i15 = iArr[i14];
            k.f59411a.getClass();
            if (networkRequest.hasCapability(i15)) {
                arrayList.add(Integer.valueOf(i15));
            }
        }
        return h0.a1(arrayList);
    }

    public static final int[] b(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            l.f59412a.getClass();
            int[] transportTypes = networkRequest.getTransportTypes();
            transportTypes.getClass();
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = iArr[i14];
            k.f59411a.getClass();
            if (networkRequest.hasTransport(i15)) {
                arrayList.add(Integer.valueOf(i15));
            }
        }
        return h0.a1(arrayList);
    }
}
