package defpackage;

import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ewy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, b> f33595c = new HashMap();
    private static Map<String, b> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, b> f33593a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, b> f33594b = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static b c(String str, String str2) {
        byte b2;
        switch (str) {
            case "Activity":
                b2 = 3;
                break;
            case "Information":
                b2 = 1;
                break;
            case "Url":
                b2 = 4;
                break;
            case "SleepMusic":
                b2 = 2;
                break;
            case "Course":
                b2 = 0;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return f33595c.get(str2);
        }
        if (b2 == 1) {
            return d.get(str2);
        }
        if (b2 == 2) {
            return f33593a.get(str2);
        }
        if (b2 != 3) {
            return null;
        }
        return f33594b.get(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    public static b e(Context context, SingleDailyMomentContent singleDailyMomentContent, IGetTitleCallback iGetTitleCallback) {
        byte b2;
        String coverLinkType = singleDailyMomentContent.getCoverLinkType();
        b bVarC = c(coverLinkType, singleDailyMomentContent.getCoverLinkValue());
        if (bVarC != null) {
            return bVarC;
        }
        switch (coverLinkType) {
            case "Activity":
                b2 = 3;
                break;
            case "Information":
                b2 = 1;
                break;
            case "Url":
                b2 = 4;
                break;
            case "SleepMusic":
                b2 = 2;
                break;
            case "Course":
                b2 = 0;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(singleDailyMomentContent.getCoverLinkValue(), b(iGetTitleCallback));
            return null;
        }
        if (b2 == 1) {
            c(context, singleDailyMomentContent.getCoverLinkValue(), b(iGetTitleCallback));
            return null;
        }
        if (b2 != 2) {
            return null;
        }
        e(context, singleDailyMomentContent.getCoverLinkValue(), b(iGetTitleCallback));
        return null;
    }

    private static UiCallback<b> b(final IGetTitleCallback iGetTitleCallback) {
        return new UiCallback<b>() { // from class: ewy.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                iGetTitleCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(b bVar) {
                if (bVar == null) {
                    iGetTitleCallback.onSuccess(null);
                } else {
                    iGetTitleCallback.onSuccess(bVar);
                }
            }
        };
    }

    public static void b(final String str, final UiCallback<b> uiCallback) {
        LogUtil.a("PageDetailManager", "fetchCourseInfo");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            return;
        }
        courseApi.getCourseById(str, null, null, new UiCallback<Workout>() { // from class: ewy.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.a("PageDetailManager", "fetchCourseInfo onFailure");
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onFailure(i, str2);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Workout workout) {
                LogUtil.a("PageDetailManager", "fetchCourseInfo onSuccess");
                FitWorkout fitWorkoutD = pea.d(workout);
                if (fitWorkoutD == null) {
                    onFailure(0, "data is not Fitworkout");
                    return;
                }
                b bVar = new b(fitWorkoutD.acquireName(), fitWorkoutD.getPreviewVideoUrl());
                ewy.f33595c.put(str, bVar);
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onSuccess(bVar);
                }
            }
        });
    }

    public static void c(Context context, final String str, final UiCallback<b> uiCallback) {
        LogUtil.a("PageDetailManager", "fetchInformationInfo");
        final String str2 = LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() ? "/messageCenter/information/v2/queryByIdAnon" : "/messageCenter/information/v2/queryById";
        final HashMap<String, String> mapE = ewv.e(context);
        mapE.put("id", str);
        final HashMap<String, String> mapB = ewv.b(context);
        GRSManager.c(BaseApplication.getContext()).d("messageCenterUrl", new GrsQueryCallback() { // from class: ewy.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                ltg.c(str3 + str2, mapE, mapB, new HttpResCallback() { // from class: ewy.2.1
                    @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                    public void onFinished(int i, String str4) {
                        if (i != 200) {
                            if (uiCallback != null) {
                                uiCallback.onFailure(0, "query information by id failed");
                                return;
                            }
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str4).getJSONObject(TtmlNode.TAG_INFORMATION);
                            b bVar = new b(jSONObject.getString("title"), jSONObject.getString("url"));
                            ewy.d.put(str, bVar);
                            if (uiCallback != null) {
                                uiCallback.onSuccess(bVar);
                            }
                        } catch (JSONException unused) {
                            if (uiCallback != null) {
                                uiCallback.onFailure(0, "information json exception");
                            }
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onFailure(0, "information get url failed");
                }
            }
        });
    }

    public static void e(Context context, final String str, final UiCallback<b> uiCallback) {
        LogUtil.a("PageDetailManager", "fetchAudioInfo");
        final String str2 = LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() ? "/messageCenter/getSleepAudioById" : "/messageCenter/user/getSleepAudioById";
        final HashMap<String, String> mapE = ewv.e(context);
        mapE.put(CommonUtil.PAGE_TYPE, String.valueOf(1));
        mapE.put("Id", str);
        final HashMap<String, String> mapB = ewv.b(context);
        GRSManager.c(BaseApplication.getContext()).d("messageCenterUrl", new GrsQueryCallback() { // from class: ewy.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                ltg.c(str3 + str2, mapE, mapB, new HttpResCallback() { // from class: ewy.5.4
                    @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                    public void onFinished(int i, String str4) {
                        if (200 != i) {
                            if (uiCallback != null) {
                                uiCallback.onFailure(0, "query audio info by id failed");
                                return;
                            }
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str4).getJSONObject("sleepAudio");
                            b bVar = new b(jSONObject.getString("name"), jSONObject.getString("audioUrl"));
                            ewy.f33593a.put(str, bVar);
                            if (uiCallback != null) {
                                uiCallback.onSuccess(bVar);
                            }
                        } catch (JSONException unused) {
                            if (uiCallback != null) {
                                uiCallback.onFailure(0, "audio info json exception");
                            }
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onFailure(0, "audio info get url failed");
                }
            }
        });
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33605b;

        public b(String str, String str2) {
            this.f33605b = str;
            this.f33604a = str2;
        }

        public String c() {
            return this.f33605b;
        }

        public String a() {
            return this.f33604a;
        }

        public String toString() {
            return "PageDetail{title='" + this.f33605b + "', url='" + this.f33604a + "'}";
        }
    }
}
