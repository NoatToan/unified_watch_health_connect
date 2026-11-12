package com.loc;

import android.os.Bundle;
import com.amap.api.fence.DistrictItem;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.PoiItem;
import com.amap.api.location.DPoint;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class c {
    private static long a;

    public static int a(String str, List<GeoFence> list, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("status", 0);
            int iOptInt2 = jSONObject.optInt("infocode", 0);
            if (iOptInt != 1 || (jSONArrayOptJSONArray = jSONObject.optJSONArray("pois")) == null) {
                return iOptInt2;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                GeoFence geoFence = new GeoFence();
                PoiItem poiItem = new PoiItem();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                poiItem.setPoiId(jSONObject2.optString("id"));
                poiItem.setPoiName(jSONObject2.optString("name"));
                poiItem.setPoiType(jSONObject2.optString("type"));
                poiItem.setTypeCode(jSONObject2.optString("typecode"));
                poiItem.setAddress(jSONObject2.optString(IntegrityManager.INTEGRITY_TYPE_ADDRESS));
                String strOptString = jSONObject2.optString("location");
                if (strOptString != null) {
                    String[] strArrSplit = strOptString.split(",");
                    poiItem.setLongitude(Double.parseDouble(strArrSplit[0]));
                    poiItem.setLatitude(Double.parseDouble(strArrSplit[1]));
                    List<List<DPoint>> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    DPoint dPoint = new DPoint(poiItem.getLatitude(), poiItem.getLongitude());
                    arrayList2.add(dPoint);
                    arrayList.add(arrayList2);
                    geoFence.setPointList(arrayList);
                    geoFence.setCenter(dPoint);
                }
                poiItem.setTel(jSONObject2.optString("tel"));
                poiItem.setProvince(jSONObject2.optString("pname"));
                poiItem.setCity(jSONObject2.optString("cityname"));
                poiItem.setAdname(jSONObject2.optString("adname"));
                geoFence.setPoiItem(poiItem);
                StringBuilder sb = new StringBuilder();
                sb.append(a());
                geoFence.setFenceId(sb.toString());
                geoFence.setCustomId(bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID));
                geoFence.setPendingIntentAction(bundle.getString("pendingIntentAction"));
                geoFence.setType(2);
                geoFence.setRadius(bundle.getFloat("fenceRadius"));
                geoFence.setExpiration(bundle.getLong(Configs.Params.EXPIRATION));
                geoFence.setActivatesAction(bundle.getInt("activatesAction", 1));
                list.add(geoFence);
            }
            return iOptInt2;
        } catch (Throwable unused) {
            return 5;
        }
    }

    public static synchronized long a() {
        long jB = eo.b();
        long j = a;
        if (jB > j) {
            a = jB;
        } else {
            a = j + 1;
        }
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[SYNTHETIC] */
    private List<DPoint> a(List<DPoint> list, float f) {
        double longitude;
        double latitude;
        double longitude2;
        double latitude2;
        double dA;
        List<DPoint> list2 = list;
        if (list2 == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        DPoint dPoint = list2.get(0);
        int i = 1;
        DPoint dPoint2 = list2.get(list.size() - 1);
        double d = 0.0d;
        double d2 = 0.0d;
        int i2 = 1;
        int i3 = 0;
        while (i2 < list.size() - i) {
            DPoint dPoint3 = list2.get(i2);
            double longitude3 = dPoint3.getLongitude() - dPoint.getLongitude();
            double latitude3 = dPoint3.getLatitude() - dPoint.getLatitude();
            double longitude4 = dPoint2.getLongitude() - dPoint.getLongitude();
            double latitude4 = dPoint2.getLatitude() - dPoint.getLatitude();
            double d3 = ((longitude3 * longitude4) + (latitude3 * latitude4)) / ((longitude4 * longitude4) + (latitude4 * latitude4));
            boolean z = dPoint.getLongitude() == dPoint2.getLongitude() && dPoint.getLatitude() == dPoint2.getLatitude();
            if (d3 < d || z) {
                longitude = dPoint.getLongitude();
                latitude = dPoint.getLatitude();
            } else {
                if (d3 > 1.0d) {
                    longitude = dPoint2.getLongitude();
                    latitude = dPoint2.getLatitude();
                } else {
                    longitude2 = dPoint.getLongitude() + (longitude4 * d3);
                    latitude2 = dPoint.getLatitude() + (d3 * latitude4);
                }
                dA = eo.a(new DPoint(dPoint3.getLatitude(), dPoint3.getLongitude()), new DPoint(latitude2, longitude2));
                if (dA > d2) {
                    d2 = dA;
                    i3 = i2;
                }
                i2++;
                list2 = list;
                dPoint = dPoint;
                i = 1;
                d = 0.0d;
            }
            longitude2 = longitude;
            latitude2 = latitude;
            dA = eo.a(new DPoint(dPoint3.getLatitude(), dPoint3.getLongitude()), new DPoint(latitude2, longitude2));
            if (dA > d2) {
                d2 = dA;
                i3 = i2;
            }
            i2++;
            list2 = list;
            dPoint = dPoint;
            i = 1;
            d = 0.0d;
        }
        DPoint dPoint4 = dPoint;
        if (d2 < f) {
            arrayList.add(dPoint4);
            arrayList.add(dPoint2);
            return arrayList;
        }
        List<DPoint> listA = a(list.subList(0, i3 + 1), f);
        List<DPoint> listA2 = a(list.subList(i3, list.size()), f);
        arrayList.addAll(listA);
        arrayList.remove(arrayList.size() - 1);
        arrayList.addAll(listA2);
        return arrayList;
    }

    public final int b(String str, List<GeoFence> list, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        String str2;
        String str3;
        float f;
        long j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("status", 0);
            int iOptInt2 = jSONObject.optInt("infocode", 0);
            String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
            String string2 = bundle.getString("pendingIntentAction");
            float f2 = bundle.getFloat("fenceRadius");
            long j2 = bundle.getLong(Configs.Params.EXPIRATION);
            int i = bundle.getInt("activatesAction", 1);
            if (iOptInt == 1 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("districts")) != null) {
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    ArrayList arrayList = new ArrayList();
                    List<List<DPoint>> arrayList2 = new ArrayList<>();
                    GeoFence geoFence = new GeoFence();
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    String strOptString = jSONObject2.optString("citycode");
                    String strOptString2 = jSONObject2.optString("adcode");
                    String strOptString3 = jSONObject2.optString("name");
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    String string3 = jSONObject2.getString(com.google.android.exoplayer2.text.ttml.b.m0);
                    int i3 = iOptInt2;
                    DPoint dPoint = new DPoint();
                    int i4 = i2;
                    String str4 = ",";
                    if (string3 != null) {
                        String[] strArrSplit = string3.split(",");
                        dPoint.setLatitude(Double.parseDouble(strArrSplit[1]));
                        dPoint.setLongitude(Double.parseDouble(strArrSplit[0]));
                        geoFence.setCenter(dPoint);
                    }
                    geoFence.setCustomId(string);
                    geoFence.setPendingIntentAction(string2);
                    geoFence.setType(3);
                    geoFence.setRadius(f2);
                    geoFence.setExpiration(j2);
                    geoFence.setActivatesAction(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(a());
                    geoFence.setFenceId(sb.toString());
                    String strOptString4 = jSONObject2.optString("polyline");
                    if (strOptString4 != null) {
                        String[] strArrSplit2 = strOptString4.split("\\|");
                        int length = strArrSplit2.length;
                        float fMin = Float.MAX_VALUE;
                        int i5 = 0;
                        float fMax = Float.MIN_VALUE;
                        while (i5 < length) {
                            String str5 = string;
                            String str6 = strArrSplit2[i5];
                            String[] strArr = strArrSplit2;
                            DistrictItem districtItem = new DistrictItem();
                            String str7 = string2;
                            List<DPoint> arrayList3 = new ArrayList<>();
                            districtItem.setCitycode(strOptString);
                            districtItem.setAdcode(strOptString2);
                            String str8 = strOptString2;
                            String str9 = strOptString3;
                            districtItem.setDistrictName(str9);
                            strOptString3 = str9;
                            String[] strArrSplit3 = str6.split(";");
                            float f3 = f2;
                            int i6 = 0;
                            while (i6 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i6].split(str4);
                                String str10 = str4;
                                String[] strArr2 = strArrSplit3;
                                if (strArrSplit4.length > 1) {
                                    arrayList3.add(new DPoint(Double.parseDouble(strArrSplit4[1]), Double.parseDouble(strArrSplit4[0])));
                                }
                                i6++;
                                strOptString = strOptString;
                                str4 = str10;
                                strArrSplit3 = strArr2;
                                j2 = j2;
                                length = length;
                            }
                            String str11 = str4;
                            long j3 = j2;
                            int i7 = length;
                            String str12 = strOptString;
                            if (arrayList3.size() > 100.0f) {
                                try {
                                    arrayList3 = a(arrayList3, 100.0f);
                                } catch (Throwable unused) {
                                    return 5;
                                }
                            }
                            arrayList2.add(arrayList3);
                            districtItem.setPolyline(arrayList3);
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(districtItem);
                            fMax = Math.max(fMax, a.b(dPoint, arrayList3));
                            fMin = Math.min(fMin, a.a(dPoint, arrayList3));
                            i5++;
                            strOptString = str12;
                            arrayList = arrayList4;
                            string = str5;
                            strArrSplit2 = strArr;
                            string2 = str7;
                            strOptString2 = str8;
                            f2 = f3;
                            str4 = str11;
                            j2 = j3;
                            length = i7;
                        }
                        str2 = string;
                        str3 = string2;
                        f = f2;
                        j = j2;
                        geoFence.setMaxDis2Center(fMax);
                        geoFence.setMinDis2Center(fMin);
                        geoFence.setDistrictItemList(arrayList);
                        geoFence.setPointList(arrayList2);
                        list.add(geoFence);
                    } else {
                        str2 = string;
                        str3 = string2;
                        f = f2;
                        j = j2;
                    }
                    i2 = i4 + 1;
                    jSONArrayOptJSONArray = jSONArray;
                    iOptInt2 = i3;
                    i = i;
                    string = str2;
                    string2 = str3;
                    f2 = f;
                    j2 = j;
                }
            }
            return iOptInt2;
        } catch (Throwable unused2) {
        }
    }
}
