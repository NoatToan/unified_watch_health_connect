package com.amap.api.services.nearby;

import android.content.Context;
import com.amap.api.col.p0003sl.p0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public class NearbySearch {
    public static final int AMAP = 1;
    public static final int GPS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static NearbySearch f6586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private INearbySearch f6587b;

    /* JADX INFO: renamed from: com.amap.api.services.nearby.NearbySearch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6588a;

        static {
            int[] iArr = new int[NearbySearchFunctionType.values().length];
            f6588a = iArr;
            try {
                iArr[NearbySearchFunctionType.DISTANCE_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6588a[NearbySearchFunctionType.DRIVING_DISTANCE_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface NearbyListener {
        void onNearbyInfoSearched(NearbySearchResult nearbySearchResult, int i);

        void onNearbyInfoUploaded(int i);

        void onUserInfoCleared(int i);
    }

    public static class NearbyQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f6589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private NearbySearchFunctionType f6590b = NearbySearchFunctionType.DISTANCE_SEARCH;
        private int c = 1000;
        private int d = 1800;
        private int e = 1;

        public LatLonPoint getCenterPoint() {
            return this.f6589a;
        }

        public int getCoordType() {
            return this.e;
        }

        public int getRadius() {
            return this.c;
        }

        public int getTimeRange() {
            return this.d;
        }

        public int getType() {
            int i = AnonymousClass1.f6588a[this.f6590b.ordinal()];
            return (i == 1 || i != 2) ? 0 : 1;
        }

        public void setCenterPoint(LatLonPoint latLonPoint) {
            this.f6589a = latLonPoint;
        }

        public void setCoordType(int i) {
            if (i == 0 || i == 1) {
                this.e = i;
            } else {
                this.e = 1;
            }
        }

        public void setRadius(int i) {
            if (i > 10000) {
                i = 10000;
            }
            this.c = i;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
          0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
        public void setTimeRange(int i) {
            int i2 = 5;
            if (i < 5) {
                i = i2;
            } else {
                i2 = RepositoryManager.GAP_A_DAY;
                if (i > 86400) {
                    i = i2;
                }
            }
            this.d = i;
        }

        public void setType(NearbySearchFunctionType nearbySearchFunctionType) {
            this.f6590b = nearbySearchFunctionType;
        }
    }

    private NearbySearch(Context context) throws AMapException {
        if (this.f6587b == null) {
            try {
                this.f6587b = new p0(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    private void a() {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.destroy();
        }
        this.f6587b = null;
    }

    public static synchronized void destroy() {
        try {
            NearbySearch nearbySearch = f6586a;
            if (nearbySearch != null) {
                try {
                    nearbySearch.a();
                } catch (Throwable th) {
                    xts.i(th, "NearbySearch", "destryoy");
                }
            }
            f6586a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized NearbySearch getInstance(Context context) throws AMapException {
        if (f6586a == null) {
            try {
                f6586a = new NearbySearch(context);
            } catch (AMapException e) {
                throw e;
            }
        }
        return f6586a;
    }

    public synchronized void addNearbyListener(NearbyListener nearbyListener) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.addNearbyListener(nearbyListener);
        }
    }

    public void clearUserInfoAsyn() {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.clearUserInfoAsyn();
        }
    }

    public synchronized void removeNearbyListener(NearbyListener nearbyListener) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.removeNearbyListener(nearbyListener);
        }
    }

    public NearbySearchResult searchNearbyInfo(NearbyQuery nearbyQuery) throws AMapException {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            return iNearbySearch.searchNearbyInfo(nearbyQuery);
        }
        return null;
    }

    public void searchNearbyInfoAsyn(NearbyQuery nearbyQuery) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.searchNearbyInfoAsyn(nearbyQuery);
        }
    }

    public void setUserID(String str) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.setUserID(str);
        }
    }

    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.startUploadNearbyInfoAuto(uploadInfoCallback, i);
        }
    }

    public synchronized void stopUploadNearbyInfoAuto() {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.stopUploadNearbyInfoAuto();
        }
    }

    public void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        INearbySearch iNearbySearch = this.f6587b;
        if (iNearbySearch != null) {
            iNearbySearch.uploadNearbyInfoAsyn(uploadInfo);
        }
    }
}
