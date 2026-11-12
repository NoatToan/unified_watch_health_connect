package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.bean.KomootRouteBean;
import com.huawei.featureuserprofile.route.bean.KomootRouteData;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcloudmodel.model.unite.RouteExtendData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.route.GetRouteDetailRsp;
import com.huawei.route.Manger.MyRouteInfoManager;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.SceneType;
import health.compact.a.UnitUtil;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class cxu {
    public static void a(final HashMap<String, InputStream> map, final RouteResultCallBack<CloudCommonReponse> routeResultCallBack) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cxr
            @Override // java.lang.Runnable
            public final void run() {
                cxu.b(map, routeResultCallBack);
            }
        });
    }

    static /* synthetic */ void b(HashMap map, RouteResultCallBack routeResultCallBack) {
        NavigationFileParser navigationFileParser;
        Exception e;
        String strSubstring;
        LogUtil.d("KomootImportUtil", "addKomootRoutes routeMaps size -->" + map.size());
        ArrayList arrayList = new ArrayList();
        NavigationFileParser navigationFileParser2 = null;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            int iNavigationParser = 0;
            try {
                InputStream inputStream = (InputStream) entry.getValue();
                try {
                    navigationFileParser = new NavigationFileParser();
                    try {
                        if (str.contains(".")) {
                            strSubstring = str.substring(str.lastIndexOf(".") + 1);
                        } else {
                            strSubstring = "gpx";
                        }
                        iNavigationParser = navigationFileParser.navigationParser(inputStream, strSubstring);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                LogUtil.e("KomootImportUtil", "IOException | XmlPullParserException | ParseException = ", e.getMessage());
                            } catch (ParseException e3) {
                                e = e3;
                                LogUtil.e("KomootImportUtil", "IOException | XmlPullParserException | ParseException = ", e.getMessage());
                            } catch (XmlPullParserException e4) {
                                e = e4;
                                LogUtil.e("KomootImportUtil", "IOException | XmlPullParserException | ParseException = ", e.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        navigationFileParser2 = navigationFileParser;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | ParseException | XmlPullParserException e5) {
                navigationFileParser = navigationFileParser2;
                e = e5;
                LogUtil.e("KomootImportUtil", "IOException | XmlPullParserException | ParseException = ", e.getMessage());
                navigationFileParser2 = navigationFileParser;
                if (navigationFileParser2 != null) {
                }
                LogUtil.j("KomootImportUtil", "parser is error");
                return;
            }
            navigationFileParser2 = navigationFileParser;
            if (navigationFileParser2 != null || iNavigationParser != 1) {
                LogUtil.j("KomootImportUtil", "parser is error");
                return;
            } else {
                RouteData routeDataA = a(navigationFileParser2, str);
                routeDataA.setSceneType(SceneType.OTHER.sceneType());
                arrayList.add(routeDataA);
            }
        }
        if (RouteDataStorageManager.isSupportRouteDeliver()) {
            RouteDataStorageManager.setRouteDataList(arrayList);
        }
        MyRouteInfoManager.addRouteDetails(arrayList, routeResultCallBack);
    }

    private static RouteData a(NavigationFileParser navigationFileParser, String str) {
        RouteData routeData = new RouteData();
        String strE = e(str, 2);
        routeData.setRouteName(strE);
        String sportType = navigationFileParser.getSportType();
        if (!TextUtils.isEmpty(sportType)) {
            strE = sportType;
        }
        routeData.setSportType(strE);
        routeData.setRoutePoints(navigationFileParser.getPoints());
        routeData.setRouteDistance(navigationFileParser.getSportLocalDistance());
        routeData.setRouteTime(navigationFileParser.getSportTotalTime());
        routeData.setType(3);
        routeData.setRouteType(navigationFileParser.getRouteType());
        routeData.setExtendData(f(str));
        return routeData;
    }

    private static String e(String str, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (str.lastIndexOf("_") != -1) {
                str = str.substring(0, str.lastIndexOf("_"));
                i2++;
            }
        }
        return str;
    }

    private static String f(String str) {
        RouteExtendData routeExtendData = new RouteExtendData();
        int length = e(str, 2).length() + 1;
        routeExtendData.setRouteId(str.substring(length, str.lastIndexOf("_") == -1 ? length : str.lastIndexOf("_")));
        return new Gson().toJson(routeExtendData);
    }

    public static KomootRouteBean e(String str) {
        KomootRouteBean komootRouteBean = new KomootRouteBean();
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        if (asJsonObject.has("_embedded")) {
            JsonObject asJsonObject2 = asJsonObject.get("_embedded").getAsJsonObject();
            if (!asJsonObject2.has("tours")) {
                LogUtil.j("KomootImportUtil", "parse error because json data has no FIELD_TOURS");
                return komootRouteBean;
            }
            e(komootRouteBean, asJsonObject2);
        }
        b(komootRouteBean, asJsonObject);
        return komootRouteBean;
    }

    private static void e(KomootRouteBean komootRouteBean, JsonObject jsonObject) {
        JsonArray asJsonArray = jsonObject.getAsJsonArray("tours");
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : asJsonArray) {
            KomootRouteBean.Tour tour = new KomootRouteBean.Tour();
            if (jsonElement instanceof JsonObject) {
                JsonObject jsonObject2 = (JsonObject) jsonElement;
                tour.setId(jsonObject2.has("id") ? jsonObject2.get("id").getAsLong() : 0L);
                tour.setSport(jsonObject2.has("sport") ? jsonObject2.get("sport").getAsString() : "");
                tour.setDate(jsonObject2.has("date") ? jsonObject2.get("date").getAsString() : "");
                tour.setName(jsonObject2.has("name") ? jsonObject2.get("name").getAsString() : "");
                tour.setDistance(Double.valueOf(jsonObject2.has("distance") ? jsonObject2.get("distance").getAsDouble() : 0.0d));
                tour.setDuration(jsonObject2.has("duration") ? jsonObject2.get("duration").getAsLong() : 0L);
                if (jsonObject2.has("map_image_preview")) {
                    JsonObject asJsonObject = jsonObject2.get("map_image_preview").getAsJsonObject();
                    tour.setPreviewSrc(asJsonObject.has("src") ? asJsonObject.get("src").getAsString() : "");
                }
                arrayList.add(tour);
            }
        }
        komootRouteBean.setTours(arrayList);
    }

    private static void b(KomootRouteBean komootRouteBean, JsonObject jsonObject) {
        if (jsonObject.has("page")) {
            JsonObject asJsonObject = jsonObject.get("page").getAsJsonObject();
            komootRouteBean.setTotalElements(asJsonObject.has("totalElements") ? asJsonObject.get("totalElements").getAsInt() : 0);
            komootRouteBean.setTotalPages(asJsonObject.has("totalPages") ? asJsonObject.get("totalPages").getAsInt() : 0);
            komootRouteBean.setPageNumber(asJsonObject.has("number") ? asJsonObject.get("number").getAsInt() : 0);
        }
    }

    public static String a(Context context, String str) {
        if ("All".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_all);
        }
        if ("jogging".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_jogging);
        }
        if ("touringbicycle".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_bicycle);
        }
        if ("e_touringbicycle".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_e_bicycle);
        }
        if ("mountaineering".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_mountain);
        }
        if ("racebike".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_racebike);
        }
        if ("e_racebike".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_e_racebike);
        }
        if ("mtb".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_mtb);
        }
        if ("e_mtb".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_e_mtb);
        }
        if ("mtb_easy".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_mtb_easy);
        }
        if ("e_mtb_easy".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_e_mtb_easy);
        }
        if ("mtb_advanced".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_mtb_advanced);
        }
        if ("e_mtb_advanced".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_e_mtb_advanced);
        }
        if ("hike".equalsIgnoreCase(str)) {
            return context.getResources().getString(R.string.IDS_my_route_type_hike);
        }
        return d(str);
    }

    public static String d(String str) {
        char[] charArray = str.toCharArray();
        charArray[0] = (char) (charArray[0] - ' ');
        return String.valueOf(charArray);
    }

    public static List<KomootRouteData> a(KomootRouteBean komootRouteBean, List<Long> list) {
        ArrayList arrayList = new ArrayList();
        List<KomootRouteBean.Tour> tours = komootRouteBean.getTours();
        if (njy.e(tours)) {
            return arrayList;
        }
        Iterator<KomootRouteBean.Tour> it = tours.iterator();
        while (it.hasNext()) {
            arrayList.add(new KomootRouteData(0, it.next()));
        }
        return a(arrayList, list);
    }

    private static List<KomootRouteData> a(List<KomootRouteData> list, List<Long> list2) {
        KomootRouteBean.Tour data;
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.j("KomootImportUtil", "filterRouteList param list is empty , return the original");
            return list;
        }
        Iterator<KomootRouteData> it = list.iterator();
        while (it.hasNext()) {
            KomootRouteData next = it.next();
            if (next != null && (data = next.getData()) != null && list2.contains(Long.valueOf(data.getId()))) {
                StringBuilder sb = new StringBuilder("filterRouteList remove:");
                sb.append(c(data.getName()));
                sb.append(" - ");
                sb.append(c(data.getId() + ""));
                LogUtil.d("KomootImportUtil", sb.toString());
                it.remove();
            }
        }
        return list;
    }

    public static List<Long> a(List<RouteData> list) {
        ArrayList arrayList = new ArrayList();
        for (RouteData routeData : list) {
            if (routeData.getType() != 3) {
                LogUtil.j("KomootImportUtil", "getKomootUploadedRouteIds continue for not Komoot route:" + routeData.toString());
            } else if (TextUtils.isEmpty(routeData.getRouteId())) {
                LogUtil.j("KomootImportUtil", "getKomootUploadedRouteIds continue for id is empty :" + routeData.toString());
            } else {
                LogUtil.d("KomootImportUtil", "getKomootUploadedRouteIds id :" + c(routeData.getRouteId()));
                arrayList.add(Long.valueOf(routeData.getRouteId()));
            }
        }
        return arrayList;
    }

    public static String a(KomootRouteBean.Tour tour, String str) {
        StringBuilder sb = new StringBuilder();
        if (tour != null) {
            sb.append(tour.getName());
            sb.append(str);
            sb.append("_");
            sb.append(tour.getId());
            sb.append("_komoot.gpx");
        }
        return sb.toString();
    }

    public static String c(String str, ImageView imageView) {
        return imageView == null ? str : str.replace("{width}", Integer.toString(imageView.getWidth())).replace("{height}", Integer.toString(imageView.getHeight())).replace("&crop={crop}", "");
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        return qrk.d(ieg.b(str.trim().substring(0, str.contains(ExifInterface.GPS_DIRECTION_TRUE) ? str.indexOf(ExifInterface.GPS_DIRECTION_TRUE) : str.length()), "yyyy-MM-dd").getTime());
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        return str.trim().substring(0, str.contains(ExifInterface.GPS_DIRECTION_TRUE) ? str.indexOf(ExifInterface.GPS_DIRECTION_TRUE) : str.length());
    }

    public static String e(Context context, long j) {
        return context.getResources().getString(R.string.IDS_hw_show_sport_timeline_mins_string, Integer.valueOf(Double.valueOf(new BigDecimal(Double.toString(j)).divide(new BigDecimal(Double.toString(60.0d)), 1, 4).doubleValue()).intValue()));
    }

    public static String e(Context context, double d) {
        if (context == null) {
            LogUtil.a("KomootImportUtil", "getFormatDistance context is null");
            return "";
        }
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(1000.0d), 2, 4).doubleValue();
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_distance_mi, (int) UnitUtil.e(dDoubleValue, 3), UnitUtil.e(dDoubleValue, 1, 2));
        }
        return context.getResources().getQuantityString(R.plurals.IDS_distance_km, (int) dDoubleValue, UnitUtil.e(dDoubleValue, 1, 2));
    }

    public static String c(String str) {
        if (str.isEmpty() || str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.length() <= 3) {
            return sb.replace(1, str.length() - 1, Constants.CONFUSION_CHARS).toString();
        }
        return sb.replace(1, str.length() - 3, Constants.CONFUSION_CHARS).toString();
    }

    public static void c(RouteResultCallBack<GetRouteDetailRsp> routeResultCallBack) {
        MyRouteInfoManager.queryRouteDetailOrSummary(0, 0L, routeResultCallBack);
    }
}
