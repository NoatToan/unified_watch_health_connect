package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketing.datatype.ControlItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ewx {
    public static void e(Context context, SingleDailyMomentContent singleDailyMomentContent, int i, ResourceBriefInfo resourceBriefInfo) {
        ControlItem controlItem = singleDailyMomentContent.getControlItem();
        if (controlItem == null) {
            LogUtil.j("DailyMomentJumpUtils", "controlItem is null");
            c(context, singleDailyMomentContent, i, resourceBriefInfo);
            return;
        }
        String jumpLink = controlItem.getJumpLink();
        if (TextUtils.isEmpty(jumpLink)) {
            c(context, singleDailyMomentContent, i, resourceBriefInfo);
        } else {
            b(fxl.c(jumpLink, 5001, i + 1, singleDailyMomentContent, resourceBriefInfo));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public static void c(Context context, SingleDailyMomentContent singleDailyMomentContent, int i, ResourceBriefInfo resourceBriefInfo) {
        byte b2;
        if (singleDailyMomentContent == null) {
            LogUtil.j("DailyMomentJumpUtils", "onCoverJump dailyMomentData is null");
            return;
        }
        String coverLinkType = singleDailyMomentContent.getCoverLinkType();
        if (coverLinkType == null) {
            LogUtil.j("DailyMomentJumpUtils", "onCoverJump linkType is null");
            return;
        }
        String coverLinkValue = singleDailyMomentContent.getCoverLinkValue();
        int i2 = i + 1;
        String strC = fxl.c(coverLinkValue, 5001, i2, singleDailyMomentContent, resourceBriefInfo);
        LogUtil.a("DailyMomentJumpUtils", "onCoverJump linkType:", coverLinkType, " linkUrl:", coverLinkValue);
        coverLinkType.hashCode();
        switch (coverLinkType) {
            case "Activity":
                b2 = 0;
                break;
            case "Information":
                b2 = 1;
                break;
            case "Url":
                b2 = 2;
                break;
            case "SleepMusic":
                b2 = 3;
                break;
            case "Course":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                b(context, coverLinkValue);
                return;
            }
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        return;
                    }
                    c(context, coverLinkValue);
                    return;
                } else {
                    b(fxl.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&type=sleepAudio&statusBarTextBlack&isImmerse&playing=true&id=" + coverLinkValue, 5001, i2, singleDailyMomentContent, resourceBriefInfo));
                    return;
                }
            }
        }
        b(strC);
    }

    private static void c(final Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.a("DailyMomentJumpUtils", "get courseApi fail");
        } else {
            courseApi.getCourseById(str, null, null, new UiCallback<Workout>() { // from class: ewx.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.a("DailyMomentJumpUtils", "get course fail");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    ewx.c(context, pea.d(workout));
                }
            });
        }
    }

    public static void c(Context context, FitWorkout fitWorkout) {
        a(context, fitWorkout, "DailyMoment");
    }

    public static void c(Context context, Uri uri) {
        int i;
        if (context == null || uri == null) {
            return;
        }
        if (!CommonUtil.ab(context)) {
            qpx.e(context, R.string.IDS_network_connect_error);
            ReleaseLogUtil.e("DailyMomentJumpUtils", "network is not Connected");
            return;
        }
        String queryParameter = uri.getQueryParameter("currentOrder");
        String queryParameter2 = uri.getQueryParameter("serialCourseId");
        LogUtil.a("DailyMomentJumpUtils", "uri get currentOrder= ", queryParameter, "serialCourseId= ", queryParameter2);
        if (TextUtils.isEmpty(queryParameter2)) {
            LogUtil.j("DailyMomentJumpUtils", "serialCourseId is empty");
            return;
        }
        try {
            i = Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            LogUtil.j("DailyMomentJumpUtils", "currentOrderNum is NumberFormatException");
            i = 0;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity");
        intent.putExtra("currentOrder", i);
        intent.putExtra("serialCourseId", queryParameter2);
        iov.d(context, intent);
    }

    public static void a(Context context, FitWorkout fitWorkout, String str) {
        if (fitWorkout == null) {
            return;
        }
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a(str);
        pea.a(context, fitWorkout, pcdVar);
    }

    public static void e(final Context context, String str, final boolean z) {
        if (context == null || str == null) {
            return;
        }
        final PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null) {
            LogUtil.a("DailyMomentJumpUtils", "get pluginSuggestion fail");
        } else {
            pluginSuggestion.getFitWorkout(str, null, new UiCallback<FitWorkout>() { // from class: ewx.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.a("DailyMomentJumpUtils", "get course fail");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(FitWorkout fitWorkout) {
                    if (fitWorkout == null) {
                        LogUtil.a("DailyMomentJumpUtils", "data is null");
                    } else {
                        PluginSuggestion pluginSuggestion2 = pluginSuggestion;
                        pluginSuggestion2.jumpToStartTrain(context, fitWorkout, pluginSuggestion2, z);
                    }
                }
            });
        }
    }

    private static void b(Context context, String str) {
        final HashMap<String, String> mapE = ewv.e(context);
        final HashMap<String, String> mapB = ewv.b(context);
        mapE.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, String.valueOf(1));
        mapE.put("id", str);
        GRSManager.c(context).d("messageCenterUrl", new GrsQueryCallback() { // from class: ewx.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                LogUtil.a("DailyMomentJumpUtils", "message center key: " + str2);
                ltg.c(str2 + "/messageCenter/information/v2/queryByIdAnon", mapE, mapB, new HttpResCallback() { // from class: ewx.2.3
                    @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                    public void onFinished(int i, String str3) {
                        if (i != 200) {
                            LogUtil.a("DailyMomentJumpUtils", "query information by id failed");
                            return;
                        }
                        LogUtil.a("DailyMomentJumpUtils", "query information by id result: " + str3);
                        try {
                            ewx.b(new JSONObject(str3).getJSONObject(TtmlNode.TAG_INFORMATION).getString("url"));
                        } catch (JSONException unused) {
                            LogUtil.a("DailyMomentJumpUtils", "parse json failed");
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.a("DailyMomentJumpUtils", "GRS query message center failed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        LogUtil.a("DailyMomentJumpUtils", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
    }
}
