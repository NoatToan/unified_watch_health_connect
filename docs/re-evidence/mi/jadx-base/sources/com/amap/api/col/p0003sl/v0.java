package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;
import com.amap.api.services.share.ShareSearch;
import com.mibi.sdk.common.MibiSdkConstants;
import defpackage.ays;
import defpackage.qxs;
import defpackage.wts;
import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements IShareSearch {
    public static String c = "http://wb.amap.com/?r=%f,%f,%s,%f,%f,%s,%d,%d,%d,%s,%s,%s&sourceapplication=openapi/0";
    public static String d = "http://wb.amap.com/?q=%f,%f,%s&sourceapplication=openapi/0";
    public static String e = "http://wb.amap.com/?n=%f,%f,%f,%f,%d&sourceapplication=openapi/0";
    public static String f = "http://wb.amap.com/?p=%s,%f,%f,%s,%s&sourceapplication=openapi/0";
    public static final String g = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ShareSearch.OnShareSearchListener f6281b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PoiItem f6282a;

        public a(PoiItem poiItem) {
            this.f6282a = poiItem;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = 1100;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchPoiShareUrl = v0.this.searchPoiShareUrl(this.f6282a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchPoiShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareSearch.ShareBusRouteQuery f6284a;

        public b(ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
            this.f6284a = shareBusRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = AMapException.CODE_AMAP_ENGINE_RETURN_TIMEOUT;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchBusRouteShareUrl = v0.this.searchBusRouteShareUrl(this.f6284a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchBusRouteShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareSearch.ShareWalkRouteQuery f6286a;

        public c(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
            this.f6286a = shareWalkRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = 1105;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchWalkRouteShareUrl = v0.this.searchWalkRouteShareUrl(this.f6286a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchWalkRouteShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareSearch.ShareDrivingRouteQuery f6288a;

        public d(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
            this.f6288a = shareDrivingRouteQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = MibiSdkConstants.RESULT_CHECK_RISK_ERROR;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchDrivingRouteShareUrl = v0.this.searchDrivingRouteShareUrl(this.f6288a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchDrivingRouteShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareSearch.ShareNaviQuery f6290a;

        public e(ShareSearch.ShareNaviQuery shareNaviQuery) {
            this.f6290a = shareNaviQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = AMapException.CODE_AMAP_ENGINE_CONNECT_TIMEOUT;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchNaviShareUrl = v0.this.searchNaviShareUrl(this.f6290a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchNaviShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LatLonSharePoint f6292a;

        public f(LatLonSharePoint latLonSharePoint) {
            this.f6292a = latLonSharePoint;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v0.this.f6281b == null) {
                return;
            }
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 11;
            messageObtainMessage.what = AMapException.CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR;
            messageObtainMessage.obj = v0.this.f6281b;
            try {
                try {
                    String strSearchLocationShareUrl = v0.this.searchLocationShareUrl(this.f6292a);
                    Bundle bundle = new Bundle();
                    bundle.putString("shareurlkey", strSearchLocationShareUrl);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                y.a().sendMessage(messageObtainMessage);
            }
        }
    }

    public v0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a == iu.c.SuccessCode) {
            this.f6280a = context;
        } else {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchBusRouteShareUrl(ShareSearch.ShareBusRouteQuery shareBusRouteQuery) throws AMapException {
        try {
            if (shareBusRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            int busMode = shareBusRouteQuery.getBusMode();
            ShareSearch.ShareFromAndTo shareFromAndTo = shareBusRouteQuery.getShareFromAndTo();
            if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            LatLonPoint from = shareFromAndTo.getFrom();
            LatLonPoint to = shareFromAndTo.getTo();
            String fromName = shareFromAndTo.getFromName();
            String toName = shareFromAndTo.getToName();
            String str = c;
            String str2 = g;
            return new qxs(this.f6280a, String.format(str, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(busMode), 1, 0, str2, str2, str2)).m();
        } catch (AMapException e2) {
            xts.i(e2, "ShareSearch", "searchBusRouteShareUrl");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchBusRouteShareUrlAsyn(ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
        try {
            ays.a().b(new b(shareBusRouteQuery));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchDrivingRouteShareUrl(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) throws AMapException {
        try {
            if (shareDrivingRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            int drivingMode = shareDrivingRouteQuery.getDrivingMode();
            ShareSearch.ShareFromAndTo shareFromAndTo = shareDrivingRouteQuery.getShareFromAndTo();
            if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            LatLonPoint from = shareFromAndTo.getFrom();
            LatLonPoint to = shareFromAndTo.getTo();
            String fromName = shareFromAndTo.getFromName();
            String toName = shareFromAndTo.getToName();
            String str = c;
            String str2 = g;
            return new qxs(this.f6280a, String.format(str, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(drivingMode), 0, 0, str2, str2, str2)).m();
        } catch (AMapException e2) {
            xts.i(e2, "ShareSearch", "searchDrivingRouteShareUrl");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchDrivingRouteShareUrlAsyn(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
        try {
            ays.a().b(new d(shareDrivingRouteQuery));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) throws AMapException {
        try {
            if (latLonSharePoint != null) {
                return new qxs(this.f6280a, String.format(d, Double.valueOf(latLonSharePoint.getLatitude()), Double.valueOf(latLonSharePoint.getLongitude()), latLonSharePoint.getSharePointName())).m();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            xts.i(e2, "ShareSearch", "searchLocationShareUrl");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchLocationShareUrlAsyn(LatLonSharePoint latLonSharePoint) {
        try {
            ays.a().b(new f(latLonSharePoint));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchNaviShareUrl(ShareSearch.ShareNaviQuery shareNaviQuery) throws AMapException {
        try {
            if (shareNaviQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            ShareSearch.ShareFromAndTo fromAndTo = shareNaviQuery.getFromAndTo();
            if (fromAndTo.getTo() == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            LatLonPoint from = fromAndTo.getFrom();
            LatLonPoint to = fromAndTo.getTo();
            int naviMode = shareNaviQuery.getNaviMode();
            return new qxs(this.f6280a, fromAndTo.getFrom() == null ? String.format(e, null, null, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode)) : String.format(e, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode))).m();
        } catch (AMapException e2) {
            xts.i(e2, "ShareSearch", "searchNaviShareUrl");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchNaviShareUrlAsyn(ShareSearch.ShareNaviQuery shareNaviQuery) {
        try {
            ays.a().b(new e(shareNaviQuery));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchPoiShareUrl(PoiItem poiItem) throws AMapException {
        if (poiItem != null) {
            try {
                if (poiItem.getLatLonPoint() != null) {
                    LatLonPoint latLonPoint = poiItem.getLatLonPoint();
                    return new qxs(this.f6280a, String.format(f, poiItem.getPoiId(), Double.valueOf(latLonPoint.getLatitude()), Double.valueOf(latLonPoint.getLongitude()), poiItem.getTitle(), poiItem.getSnippet())).m();
                }
            } catch (AMapException e2) {
                xts.i(e2, "ShareSearch", "searchPoiShareUrl");
                throw e2;
            }
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchPoiShareUrlAsyn(PoiItem poiItem) {
        try {
            ays.a().b(new a(poiItem));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchWalkRouteShareUrl(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) throws AMapException {
        try {
            if (shareWalkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            int walkMode = shareWalkRouteQuery.getWalkMode();
            ShareSearch.ShareFromAndTo shareFromAndTo = shareWalkRouteQuery.getShareFromAndTo();
            if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            LatLonPoint from = shareFromAndTo.getFrom();
            LatLonPoint to = shareFromAndTo.getTo();
            String fromName = shareFromAndTo.getFromName();
            String toName = shareFromAndTo.getToName();
            String str = c;
            String str2 = g;
            return new qxs(this.f6280a, String.format(str, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(walkMode), 2, 0, str2, str2, str2)).m();
        } catch (AMapException e2) {
            xts.i(e2, "ShareSearch", "searchWalkRouteShareUrl");
            throw e2;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchWalkRouteShareUrlAsyn(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
        try {
            ays.a().b(new c(shareWalkRouteQuery));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void setOnShareSearchListener(ShareSearch.OnShareSearchListener onShareSearchListener) {
        this.f6281b = onShareSearchListener;
    }
}
