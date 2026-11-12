package com.huami.mifit.sportlib.utils;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.huami.mifit.sportlib.R;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.GPSPoint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public class MapUtil {
    private static GPSPoint a = null;
    private static List<GPSPoint> b = null;
    private static List<GPSPoint> c = null;
    private static List<GPSPoint> d = null;
    private static List<GPSPoint> e = null;
    private static final String f = "coordinates";

    private static void a(JSONArray jSONArray, List<GPSPoint> list) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                list.add(new GPSPoint(jSONArray2.getDouble(1), jSONArray2.getDouble(0)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static String b(Context context, int i) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().openRawResource(i));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStreamReader.close();
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static void c(Context context) {
        List<GPSPoint> list = e;
        if (list == null || list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONObject(b(context, R.raw.hongkong_polygon)).getJSONArray(f);
                if (jSONArray.length() != 1) {
                    LogKit.w2f("MapUtil", "Error coordinates length for hongkong");
                    return;
                }
                JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                ArrayList arrayList = new ArrayList();
                e = arrayList;
                a(jSONArray2, arrayList);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void d(Context context) {
        List<GPSPoint> list = c;
        if (list == null || list.isEmpty()) {
            List<GPSPoint> list2 = d;
            if (list2 == null || list2.isEmpty()) {
                try {
                    JSONArray jSONArray = new JSONObject(b(context, R.raw.macao_polygon)).getJSONArray(f);
                    if (jSONArray.length() != 2) {
                        LogKit.w2f("MapUtil", "Error coordinates length for macao");
                        return;
                    }
                    JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                    ArrayList arrayList = new ArrayList();
                    c = arrayList;
                    a(jSONArray2, arrayList);
                    JSONArray jSONArray3 = jSONArray.getJSONArray(1);
                    ArrayList arrayList2 = new ArrayList();
                    d = arrayList2;
                    a(jSONArray3, arrayList2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static boolean e(List<GPSPoint> list, GPSPoint gPSPoint) {
        if (list == null) {
            return false;
        }
        int size = list.size();
        int i = size - 1;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((list.get(i2).mLongitude < gPSPoint.mLongitude && list.get(i).mLongitude >= gPSPoint.mLongitude) || (list.get(i).mLongitude < gPSPoint.mLongitude && list.get(i2).mLongitude >= gPSPoint.mLongitude)) && (list.get(i2).mLatitude <= gPSPoint.mLatitude || list.get(i).mLatitude <= gPSPoint.mLatitude)) {
                z ^= list.get(i2).mLatitude + (((gPSPoint.mLongitude - list.get(i2).mLongitude) / (list.get(i).mLongitude - list.get(i2).mLongitude)) * (list.get(i).mLatitude - list.get(i2).mLatitude)) < gPSPoint.mLatitude;
            }
            i = i2;
        }
        return z;
    }

    @Deprecated
    public static void genMainlandGPSPoints(Context context) {
        List<GPSPoint> list = b;
        if (list == null || list.isEmpty()) {
            XmlResourceParser xml = context.getResources().getXml(R.xml.mainland_polygon);
            try {
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 0) {
                        b = new ArrayList();
                    } else if (eventType == 2 && "point".equals(xml.getName())) {
                        b.add(new GPSPoint(Double.valueOf(xml.getAttributeValue(0)).doubleValue(), Double.valueOf(xml.getAttributeValue(1)).doubleValue()));
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (XmlPullParserException e3) {
                e3.printStackTrace();
            }
        }
    }

    public static GPSPoint getFirstGPSPoint() {
        return a;
    }

    public static void initFirstLocationPoint(GPSPoint gPSPoint) {
        a = gPSPoint;
    }

    public static void initMacaoAndHongkongPolygon(Context context) {
        d(context);
        c(context);
    }

    public static boolean isPointInHongkong(GPSPoint gPSPoint) {
        return e(e, gPSPoint);
    }

    public static boolean isPointInMacao(GPSPoint gPSPoint) {
        return e(c, gPSPoint) || e(d, gPSPoint);
    }

    @Deprecated
    public static boolean isPointInMainland(GPSPoint gPSPoint) {
        return e(b, gPSPoint);
    }
}
