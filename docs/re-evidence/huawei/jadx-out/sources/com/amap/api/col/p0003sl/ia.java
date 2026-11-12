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
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;

/* JADX INFO: loaded from: classes21.dex */
public final class ia implements IShareSearch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f2719b = "http://wb.amap.com/?r=%f,%f,%s,%f,%f,%s,%d,%d,%d,%s,%s,%s&sourceapplication=openapi/0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f2720c = "http://wb.amap.com/?q=%f,%f,%s&sourceapplication=openapi/0";
    private static String d = "http://wb.amap.com/?n=%f,%f,%f,%f,%d&sourceapplication=openapi/0";
    private static String e = "http://wb.amap.com/?p=%s,%f,%f,%s,%s&sourceapplication=openapi/0";
    private static final String f = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2721a;
    private ShareSearch.OnShareSearchListener g;

    public ia(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2721a = context;
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void setOnShareSearchListener(ShareSearch.OnShareSearchListener onShareSearchListener) {
        this.g = onShareSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchPoiShareUrlAsyn(final PoiItem poiItem) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = 1100;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchPoiShareUrl = ia.this.searchPoiShareUrl(poiItem);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchPoiShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchBusRouteShareUrlAsyn(final ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = 1103;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchBusRouteShareUrl = ia.this.searchBusRouteShareUrl(shareBusRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchBusRouteShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchWalkRouteShareUrlAsyn(final ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = ExceptionCode.CHECK_FILE_SIZE_FAILED;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchWalkRouteShareUrl = ia.this.searchWalkRouteShareUrl(shareWalkRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchWalkRouteShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchDrivingRouteShareUrlAsyn(final ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = ExceptionCode.CHECK_FILE_HASH_FAILED;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchDrivingRouteShareUrl = ia.this.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchDrivingRouteShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchNaviShareUrlAsyn(final ShareSearch.ShareNaviQuery shareNaviQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = 1102;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchNaviShareUrl = ia.this.searchNaviShareUrl(shareNaviQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchNaviShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchLocationShareUrlAsyn(final LatLonSharePoint latLonSharePoint) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ia.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (ia.this.g == null) {
                        return;
                    }
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 11;
                    messageObtainMessage.what = 1101;
                    messageObtainMessage.obj = ia.this.g;
                    try {
                        try {
                            String strSearchLocationShareUrl = ia.this.searchLocationShareUrl(latLonSharePoint);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", strSearchLocationShareUrl);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e2) {
                            messageObtainMessage.arg2 = e2.getErrorCode();
                        }
                    } finally {
                        gf.a().sendMessage(messageObtainMessage);
                    }
                }
            });
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
                    return new hb(this.f2721a, String.format(e, poiItem.getPoiId(), Double.valueOf(latLonPoint.getLatitude()), Double.valueOf(latLonPoint.getLongitude()), poiItem.getTitle(), poiItem.getSnippet())).d();
                }
            } catch (AMapException e2) {
                fu.a(e2, "ShareSearch", "searchPoiShareUrl");
                throw e2;
            }
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchNaviShareUrl(ShareSearch.ShareNaviQuery shareNaviQuery) throws AMapException {
        String str;
        try {
            if (shareNaviQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            try {
                ShareSearch.ShareFromAndTo fromAndTo = shareNaviQuery.getFromAndTo();
                if (fromAndTo.getTo() == null) {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                }
                LatLonPoint from = fromAndTo.getFrom();
                LatLonPoint to = fromAndTo.getTo();
                int naviMode = shareNaviQuery.getNaviMode();
                if (fromAndTo.getFrom() == null) {
                    str = String.format(d, null, null, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode));
                } else {
                    str = String.format(d, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode));
                }
                return new hb(this.f2721a, str).d();
            } catch (AMapException e2) {
                e = e2;
                fu.a(e, "ShareSearch", "searchNaviShareUrl");
                throw e;
            }
        } catch (AMapException e3) {
            e = e3;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) throws AMapException {
        try {
            if (latLonSharePoint == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new hb(this.f2721a, String.format(f2720c, Double.valueOf(latLonSharePoint.getLatitude()), Double.valueOf(latLonSharePoint.getLongitude()), latLonSharePoint.getSharePointName())).d();
        } catch (AMapException e2) {
            fu.a(e2, "ShareSearch", "searchLocationShareUrl");
            throw e2;
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
            String str = f2719b;
            double latitude = from.getLatitude();
            double longitude = from.getLongitude();
            double latitude2 = to.getLatitude();
            double longitude2 = to.getLongitude();
            String str2 = f;
            return new hb(this.f2721a, String.format(str, Double.valueOf(latitude), Double.valueOf(longitude), fromName, Double.valueOf(latitude2), Double.valueOf(longitude2), toName, Integer.valueOf(busMode), 1, 0, str2, str2, str2)).d();
        } catch (AMapException e2) {
            fu.a(e2, "ShareSearch", "searchBusRouteShareUrl");
            throw e2;
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
            String str = f2719b;
            double latitude = from.getLatitude();
            double longitude = from.getLongitude();
            double latitude2 = to.getLatitude();
            double longitude2 = to.getLongitude();
            String str2 = f;
            return new hb(this.f2721a, String.format(str, Double.valueOf(latitude), Double.valueOf(longitude), fromName, Double.valueOf(latitude2), Double.valueOf(longitude2), toName, Integer.valueOf(drivingMode), 0, 0, str2, str2, str2)).d();
        } catch (AMapException e2) {
            fu.a(e2, "ShareSearch", "searchDrivingRouteShareUrl");
            throw e2;
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
            String str = f2719b;
            double latitude = from.getLatitude();
            double longitude = from.getLongitude();
            double latitude2 = to.getLatitude();
            double longitude2 = to.getLongitude();
            String str2 = f;
            return new hb(this.f2721a, String.format(str, Double.valueOf(latitude), Double.valueOf(longitude), fromName, Double.valueOf(latitude2), Double.valueOf(longitude2), toName, Integer.valueOf(walkMode), 2, 0, str2, str2, str2)).d();
        } catch (AMapException e2) {
            fu.a(e2, "ShareSearch", "searchWalkRouteShareUrl");
            throw e2;
        }
    }
}
