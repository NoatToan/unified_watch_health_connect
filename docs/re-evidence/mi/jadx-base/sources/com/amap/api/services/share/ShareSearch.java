package com.amap.api.services.share;

import android.content.Context;
import com.amap.api.col.p0003sl.v0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;

/* JADX INFO: loaded from: classes4.dex */
public class ShareSearch {
    public static final int BusComfortable = 4;
    public static final int BusDefault = 0;
    public static final int BusLeaseChange = 2;
    public static final int BusLeaseWalk = 3;
    public static final int BusNoSubway = 5;
    public static final int BusSaveMoney = 1;
    public static final int DrivingAvoidCongestion = 4;
    public static final int DrivingDefault = 0;
    public static final int DrivingNoHighWay = 3;
    public static final int DrivingNoHighWayAvoidCongestion = 6;
    public static final int DrivingNoHighWaySaveMoney = 5;
    public static final int DrivingNoHighWaySaveMoneyAvoidCongestion = 8;
    public static final int DrivingSaveMoney = 1;
    public static final int DrivingSaveMoneyAvoidCongestion = 7;
    public static final int DrivingShortDistance = 2;
    public static final int NaviAvoidCongestion = 4;
    public static final int NaviDefault = 0;
    public static final int NaviNoHighWay = 3;
    public static final int NaviNoHighWayAvoidCongestion = 6;
    public static final int NaviNoHighWaySaveMoney = 5;
    public static final int NaviNoHighWaySaveMoneyAvoidCongestion = 8;
    public static final int NaviSaveMoney = 1;
    public static final int NaviSaveMoneyAvoidCongestion = 7;
    public static final int NaviShortDistance = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IShareSearch f6790a;

    public interface OnShareSearchListener {
        void onBusRouteShareUrlSearched(String str, int i);

        void onDrivingRouteShareUrlSearched(String str, int i);

        void onLocationShareUrlSearched(String str, int i);

        void onNaviShareUrlSearched(String str, int i);

        void onPoiShareUrlSearched(String str, int i);

        void onWalkRouteShareUrlSearched(String str, int i);
    }

    public static class ShareBusRouteQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ShareFromAndTo f6791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6792b;

        public ShareBusRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f6791a = shareFromAndTo;
            this.f6792b = i;
        }

        public int getBusMode() {
            return this.f6792b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f6791a;
        }
    }

    public static class ShareDrivingRouteQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ShareFromAndTo f6793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6794b;

        public ShareDrivingRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f6793a = shareFromAndTo;
            this.f6794b = i;
        }

        public int getDrivingMode() {
            return this.f6794b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f6793a;
        }
    }

    public static class ShareFromAndTo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f6795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f6796b;
        private String c = "起点";
        private String d = "终点";

        public ShareFromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f6795a = latLonPoint;
            this.f6796b = latLonPoint2;
        }

        public LatLonPoint getFrom() {
            return this.f6795a;
        }

        public String getFromName() {
            return this.c;
        }

        public LatLonPoint getTo() {
            return this.f6796b;
        }

        public String getToName() {
            return this.d;
        }

        public void setFromName(String str) {
            this.c = str;
        }

        public void setToName(String str) {
            this.d = str;
        }
    }

    public static class ShareNaviQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ShareFromAndTo f6797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6798b;

        public ShareNaviQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f6797a = shareFromAndTo;
            this.f6798b = i;
        }

        public ShareFromAndTo getFromAndTo() {
            return this.f6797a;
        }

        public int getNaviMode() {
            return this.f6798b;
        }
    }

    public static class ShareWalkRouteQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ShareFromAndTo f6799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6800b;

        public ShareWalkRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f6799a = shareFromAndTo;
            this.f6800b = i;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f6799a;
        }

        public int getWalkMode() {
            return this.f6800b;
        }
    }

    public ShareSearch(Context context) throws AMapException {
        if (this.f6790a == null) {
            try {
                this.f6790a = new v0(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public String searchBusRouteShareUrl(ShareBusRouteQuery shareBusRouteQuery) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchBusRouteShareUrl(shareBusRouteQuery);
        return null;
    }

    public void searchBusRouteShareUrlAsyn(ShareBusRouteQuery shareBusRouteQuery) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchBusRouteShareUrlAsyn(shareBusRouteQuery);
        }
    }

    public String searchDrivingRouteShareUrl(ShareDrivingRouteQuery shareDrivingRouteQuery) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
        return null;
    }

    public void searchDrivingRouteShareUrlAsyn(ShareDrivingRouteQuery shareDrivingRouteQuery) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchDrivingRouteShareUrlAsyn(shareDrivingRouteQuery);
        }
    }

    public String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchLocationShareUrl(latLonSharePoint);
        return null;
    }

    public void searchLocationShareUrlAsyn(LatLonSharePoint latLonSharePoint) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchLocationShareUrlAsyn(latLonSharePoint);
        }
    }

    public String searchNaviShareUrl(ShareNaviQuery shareNaviQuery) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchNaviShareUrl(shareNaviQuery);
        return null;
    }

    public void searchNaviShareUrlAsyn(ShareNaviQuery shareNaviQuery) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchNaviShareUrlAsyn(shareNaviQuery);
        }
    }

    public String searchPoiShareUrl(PoiItem poiItem) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchPoiShareUrl(poiItem);
        return null;
    }

    public void searchPoiShareUrlAsyn(PoiItem poiItem) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchPoiShareUrlAsyn(poiItem);
        }
    }

    public String searchWalkRouteShareUrl(ShareWalkRouteQuery shareWalkRouteQuery) throws AMapException {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch == null) {
            return null;
        }
        iShareSearch.searchWalkRouteShareUrl(shareWalkRouteQuery);
        return null;
    }

    public void searchWalkRouteShareUrlAsyn(ShareWalkRouteQuery shareWalkRouteQuery) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.searchWalkRouteShareUrlAsyn(shareWalkRouteQuery);
        }
    }

    public void setOnShareSearchListener(OnShareSearchListener onShareSearchListener) {
        IShareSearch iShareSearch = this.f6790a;
        if (iShareSearch != null) {
            iShareSearch.setOnShareSearchListener(onShareSearchListener);
        }
    }
}
