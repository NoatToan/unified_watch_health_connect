package com.amap.api.services.nearby;

import android.content.Context;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.hu;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;

/* JADX INFO: loaded from: classes4.dex */
public class NearbySearch {
    public static final int AMAP = 1;
    public static final int GPS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static NearbySearch f3602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private INearbySearch f3603b;

    public interface NearbyListener {
        void onNearbyInfoSearched(NearbySearchResult nearbySearchResult, int i);

        void onNearbyInfoUploaded(int i);

        void onUserInfoCleared(int i);
    }

    public static NearbySearch getInstance(Context context) throws AMapException {
        NearbySearch nearbySearch;
        synchronized (NearbySearch.class) {
            if (f3602a == null) {
                try {
                    f3602a = new NearbySearch(context);
                } catch (AMapException e) {
                    throw e;
                }
            }
            nearbySearch = f3602a;
        }
        return nearbySearch;
    }

    private NearbySearch(Context context) throws AMapException {
        if (this.f3603b == null) {
            try {
                this.f3603b = new hu(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public void addNearbyListener(NearbyListener nearbyListener) {
        synchronized (this) {
            INearbySearch iNearbySearch = this.f3603b;
            if (iNearbySearch != null) {
                iNearbySearch.addNearbyListener(nearbyListener);
            }
        }
    }

    public void removeNearbyListener(NearbyListener nearbyListener) {
        synchronized (this) {
            INearbySearch iNearbySearch = this.f3603b;
            if (iNearbySearch != null) {
                iNearbySearch.removeNearbyListener(nearbyListener);
            }
        }
    }

    public void clearUserInfoAsyn() {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            iNearbySearch.clearUserInfoAsyn();
        }
    }

    public void setUserID(String str) {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            iNearbySearch.setUserID(str);
        }
    }

    public void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        synchronized (this) {
            INearbySearch iNearbySearch = this.f3603b;
            if (iNearbySearch != null) {
                iNearbySearch.startUploadNearbyInfoAuto(uploadInfoCallback, i);
            }
        }
    }

    public void stopUploadNearbyInfoAuto() {
        synchronized (this) {
            INearbySearch iNearbySearch = this.f3603b;
            if (iNearbySearch != null) {
                iNearbySearch.stopUploadNearbyInfoAuto();
            }
        }
    }

    public void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            iNearbySearch.uploadNearbyInfoAsyn(uploadInfo);
        }
    }

    public void searchNearbyInfoAsyn(NearbyQuery nearbyQuery) {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            iNearbySearch.searchNearbyInfoAsyn(nearbyQuery);
        }
    }

    public NearbySearchResult searchNearbyInfo(NearbyQuery nearbyQuery) throws AMapException {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            return iNearbySearch.searchNearbyInfo(nearbyQuery);
        }
        return null;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class NearbyQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f3605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private NearbySearchFunctionType f3606b = NearbySearchFunctionType.DISTANCE_SEARCH;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3607c = 1000;
        private int d = 1800;
        private int e = 1;

        public void setCenterPoint(LatLonPoint latLonPoint) {
            this.f3605a = latLonPoint;
        }

        public LatLonPoint getCenterPoint() {
            return this.f3605a;
        }

        public int getRadius() {
            return this.f3607c;
        }

        public void setRadius(int i) {
            if (i > 10000) {
                i = 10000;
            }
            this.f3607c = i;
        }

        public void setType(NearbySearchFunctionType nearbySearchFunctionType) {
            this.f3606b = nearbySearchFunctionType;
        }

        public int getType() {
            int i = AnonymousClass1.f3604a[this.f3606b.ordinal()];
            return (i == 1 || i != 2) ? 0 : 1;
        }

        public void setCoordType(int i) {
            if (i != 0 && i != 1) {
                this.e = 1;
            } else {
                this.e = i;
            }
        }

        public int getCoordType() {
            return this.e;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
          0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
        public void setTimeRange(int i) {
            int i2 = 5;
            if (i < 5) {
                i = i2;
            } else {
                i2 = 86400;
                if (i > 86400) {
                    i = i2;
                }
            }
            this.d = i;
        }

        public int getTimeRange() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: com.amap.api.services.nearby.NearbySearch$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3604a;

        static {
            int[] iArr = new int[NearbySearchFunctionType.values().length];
            f3604a = iArr;
            try {
                iArr[NearbySearchFunctionType.DISTANCE_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3604a[NearbySearchFunctionType.DRIVING_DISTANCE_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void destroy() {
        synchronized (NearbySearch.class) {
            NearbySearch nearbySearch = f3602a;
            if (nearbySearch != null) {
                try {
                    nearbySearch.a();
                } catch (Throwable th) {
                    fu.a(th, "NearbySearch", "destryoy");
                }
            }
            f3602a = null;
        }
    }

    private void a() {
        INearbySearch iNearbySearch = this.f3603b;
        if (iNearbySearch != null) {
            iNearbySearch.destroy();
        }
        this.f3603b = null;
    }
}
