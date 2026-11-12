package com.huami.watch.dataflow.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.cloud.WebResponse;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.dataflow.model.sport.SportParams;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportStatistics;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SportDataAPI {
    private static final String a = "Cloud-API-SportData";
    private static final int b = 1000;

    public static class SportDetailResult {
        public SportDetail detail;
        public boolean success;

        public String toString() {
            return "<Success : " + this.success + " RunningDetail : " + this.detail + SearchCriteria.GT;
        }
    }

    public static class SportHistoryResult {
        public boolean success;
        public List<SportSummary> summaryItems = new ArrayList();

        public String toString() {
            return "<Success : " + this.success + ", SummaryItems : " + this.summaryItems.size() + " " + Arrays.toString(this.summaryItems.toArray()) + SearchCriteria.GT;
        }
    }

    public static class SportStatisticsResult {
        public SportStatistics stat = new SportStatistics();
        public boolean success;

        public String toString() {
            return "<Success : " + this.success + ", " + this.stat + SearchCriteria.GT;
        }
    }

    @NonNull
    private static SportHistoryResult a(Context context, long j, long j2, int i, String str) {
        SportHistoryResult sportHistoryResult = new SportHistoryResult();
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("count", String.valueOf(i));
        map.put(SportParams.PARAM_START_TRACK_ID, String.valueOf(j));
        map.put(SportParams.PARAM_STOP_TRACK_ID, String.valueOf(j2));
        Log.d(a, "Get Cloud SportHistory : " + map.toString(), new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlSportHistory(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful() && !TextUtils.isEmpty(strResponseBodyString)) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    WebResponse webResponse = WebResponse.parse(context, jSONObject);
                    if (webResponse.success()) {
                        sportHistoryResult.success = true;
                        if (!TextUtils.isEmpty(webResponse.data)) {
                            sportHistoryResult.summaryItems = a.b(jSONObject.getJSONObject("data"));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(a, "GetHistory Failed!!", e, new Object[0]);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "GetHistory Failed!!", e2, new Object[0]);
        }
        Log.d(a, "Cloud SportHistoryResult : " + sportHistoryResult, new Object[0]);
        return sportHistoryResult;
    }

    @NonNull
    private static SportStatisticsResult b(Context context, String str) {
        SportStatisticsResult sportStatisticsResult = new SportStatisticsResult();
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("type", "all");
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlSportStatistics(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful() && !TextUtils.isEmpty(strResponseBodyString)) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    WebResponse webResponse = WebResponse.parse(context, jSONObject);
                    if (webResponse.success() && !TextUtils.isEmpty(webResponse.data)) {
                        sportStatisticsResult.success = true;
                        sportStatisticsResult.stat = a.c(jSONObject);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(a, "GetStatistics Failed!!", e, new Object[0]);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "GetStatistics Failed!!", e2, new Object[0]);
        }
        Log.d(a, "SportStatistics Result : " + sportStatisticsResult, new Object[0]);
        return sportStatisticsResult;
    }

    private static boolean c(Context context, @NonNull String str, @NonNull String str2) {
        boolean zSuccess;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(str, str2, "application/x-www-form-urlencoded"));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (!responseDoRequest.isSuccessful() || TextUtils.isEmpty(strResponseBodyString)) {
                zSuccess = false;
            } else {
                try {
                    zSuccess = WebResponse.parse(context, new JSONObject(strResponseBodyString)).success();
                } catch (Exception e) {
                    Log.e(a, "PostDataFail", e, new Object[0]);
                    zSuccess = false;
                    Log.d(a, "Post <" + str + ", " + str2 + ">, Success : " + zSuccess, new Object[0]);
                    return zSuccess;
                }
            }
        } catch (IOException e2) {
            Log.w(a, "PostDataFail", e2, new Object[0]);
            zSuccess = false;
        }
        Log.d(a, "Post <" + str + ", " + str2 + ">, Success : " + zSuccess, new Object[0]);
        return zSuccess;
    }

    public static boolean deleteSummary(Context context, long j, String str) {
        boolean z;
        HashMap map = new HashMap();
        map.put("trackid", String.valueOf(j));
        map.put("source", str);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newDelete(Cloud.urlSportSummary(), null, map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                z = true;
            } else {
                Log.w(a, "Delete Sport Record Body : " + strResponseBodyString, new Object[0]);
                z = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(a, "DeleteSportSummaryFail", e, new Object[0]);
        }
        Log.d(a, "DeleteSummary <" + j + ", Success : " + z, new Object[0]);
        return z;
    }

    @NonNull
    public static SportDetailResult getDetail(Context context, long j, String str) {
        SportDetailResult sportDetailResult = new SportDetailResult();
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("trackid", String.valueOf(j));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlSportDetail(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful() && !TextUtils.isEmpty(strResponseBodyString)) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    WebResponse webResponse = WebResponse.parse(context, jSONObject);
                    if (webResponse.success() && !TextUtils.isEmpty(webResponse.data)) {
                        sportDetailResult.success = true;
                        sportDetailResult.detail = a.a(jSONObject.getJSONObject("data"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(a, "GetRunningDetail Failed!!", e, new Object[0]);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "GetRunningDetail Failed!!", e2, new Object[0]);
        }
        Log.d(a, "Result : " + sportDetailResult, new Object[0]);
        return sportDetailResult;
    }

    @NonNull
    public static SportHistoryResult getHistory(Context context, long j) {
        return getHistory(context, j, System.currentTimeMillis() / 1000, 1000);
    }

    @NonNull
    public static SportStatisticsResult getStatistics(Context context) {
        SportStatisticsResult sportStatisticsResultB = b(context, DeviceSource.DATA_SOURCE_HUANGHE);
        if (sportStatisticsResultB.success) {
            SportStatisticsResult sportStatisticsResultB2 = b(context, DeviceSource.DATA_SOURCE_EVEREST);
            if (sportStatisticsResultB2.success) {
                SportStatisticsResult sportStatisticsResultB3 = b(context, DeviceSource.DATA_SOURCE_QOGIR);
                if (sportStatisticsResultB3.success) {
                    SportStatistics sportStatistics = sportStatisticsResultB.stat;
                    sportStatistics.setCalorie(sportStatistics.getCalorie() + sportStatisticsResultB2.stat.getCalorie() + sportStatisticsResultB3.stat.getCalorie());
                    SportStatistics sportStatistics2 = sportStatisticsResultB.stat;
                    sportStatistics2.setCount(sportStatistics2.getCount() + sportStatisticsResultB2.stat.getCount() + sportStatisticsResultB3.stat.getCount());
                    SportStatistics sportStatistics3 = sportStatisticsResultB.stat;
                    sportStatistics3.setDis(sportStatistics3.getDis() + sportStatisticsResultB2.stat.getDis() + sportStatisticsResultB3.stat.getDis());
                    SportStatistics sportStatistics4 = sportStatisticsResultB.stat;
                    sportStatistics4.setRuntime(sportStatistics4.getRuntime() + sportStatisticsResultB2.stat.getRuntime() + sportStatisticsResultB3.stat.getRuntime());
                } else {
                    sportStatisticsResultB.success = false;
                    sportStatisticsResultB.stat = new SportStatistics();
                }
            } else {
                sportStatisticsResultB.success = false;
                sportStatisticsResultB.stat = new SportStatistics();
            }
        }
        return sportStatisticsResultB;
    }

    @NonNull
    public static SportHistoryResult getSummary(Context context, long j, String str) {
        SportHistoryResult sportHistoryResult = new SportHistoryResult();
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("trackid", String.valueOf(j));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlSportSummary(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful() && !TextUtils.isEmpty(strResponseBodyString)) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    WebResponse webResponse = WebResponse.parse(context, jSONObject);
                    if (webResponse.success() && !TextUtils.isEmpty(webResponse.data)) {
                        sportHistoryResult.success = true;
                        sportHistoryResult.summaryItems.add(a.d(jSONObject.getJSONObject("data")));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(a, "GetSportSummaryFail", e, new Object[0]);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "GetSportSummaryFail", e2, new Object[0]);
        }
        Log.d(a, "GetSummary <" + j + ">, Result : " + sportHistoryResult, new Object[0]);
        return sportHistoryResult;
    }

    public static boolean postDetail(Context context, @NonNull String str) {
        return c(context, Cloud.urlSportDetail(), str);
    }

    public static boolean postSummary(Context context, @NonNull String str) {
        return c(context, Cloud.urlSportSummary(), str);
    }

    @NonNull
    public static SportHistoryResult getHistory(Context context, long j, long j2, int i) {
        return a(context, j, j2, i, DeviceSource.DATA_SOURCE_ALL);
    }
}
