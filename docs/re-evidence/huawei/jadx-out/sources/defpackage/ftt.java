package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.LogAnonymous;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ftt extends JsModuleBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f34562a = lsl.a(lsl.d(System.currentTimeMillis(), -1), 20, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f34563b = lsl.a(System.currentTimeMillis(), 20, 0);
    private static int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f34564c;
    private H5ProJsCbkInvoker<Object> d;
    private Observer j;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onMount(Context context, H5ProInstance h5ProInstance) {
        super.onMount(context, h5ProInstance);
        this.f34564c = context;
        this.d = h5ProInstance.getJsCbkInvoker();
    }

    @JavascriptInterface
    public void initWebviewHeight(long j, int i) {
        LogUtil.a("SectionH5InteractionUtils", "initWebviewHeight enter");
        ObserverManagerUtil.e("REFRESH_H5_HEIGHT", Integer.valueOf(i));
    }

    @JavascriptInterface
    public void pullUpDialog(final long j, final int i) {
        LogUtil.a("SectionH5InteractionUtils", "pullUpDialog enter");
        HandlerExecutor.c(new Runnable() { // from class: ftt.2
            @Override // java.lang.Runnable
            public void run() {
                ftt.this.e(j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final long j, final int i) {
        final JSONObject jSONObject = new JSONObject();
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f34564c);
        builder.a(e(i)).a(b(i), new View.OnClickListener() { // from class: ftt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("SectionH5InteractionUtils", "it is positive");
                try {
                    jSONObject.put("response", "ok");
                    ftt.this.d.onSuccess(jSONObject, j);
                    if (i == 3) {
                        pjo.b().a(ftt.this.f34564c, "#/DreamTalkSetting");
                    }
                } catch (JSONException e2) {
                    LogUtil.e("SectionH5InteractionUtils", "positive button click jsonException", LogAnonymous.b(e2));
                    ftt.this.d.onFailure(-1, LogAnonymous.b(e2), j);
                }
            }
        }).d(c(i), new View.OnClickListener() { // from class: ftt.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("SectionH5InteractionUtils", "it is negative");
                try {
                    jSONObject.put("response", "cancel");
                    ftt.this.d.onSuccess(jSONObject, j);
                } catch (JSONException e2) {
                    LogUtil.e("SectionH5InteractionUtils", "negative button click jsonException", LogAnonymous.b(e2));
                    ftt.this.d.onFailure(-1, LogAnonymous.b(e2), j);
                }
            }
        });
        builder.c().show();
    }

    @JavascriptInterface
    public void acquireTimeStamp(final long j) throws JSONException {
        LogUtil.a("SectionH5InteractionUtils", "acquireTimeStamp enter");
        final JSONObject jSONObject = new JSONObject();
        if (this.j == null) {
            LogUtil.a("SectionH5InteractionUtils", "timeStampObserver is null");
            jSONObject.put("chart_start_time", f34562a);
            jSONObject.put("chart_end_time", f34563b);
            this.d.onSuccess(jSONObject, j);
            ObserverManagerUtil.a(this.j, "CHART_START_END_TIME");
            Observer observer = new Observer() { // from class: ftt.3
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    Object obj;
                    Object obj2;
                    try {
                        LogUtil.a("SectionH5InteractionUtils", "timeStampObserver: " + ftt.this.j.toString());
                        if (objArr == null || objArr.length <= 1 || (obj = objArr[0]) == null || (obj2 = objArr[1]) == null || !(obj instanceof Long) || !(obj2 instanceof Long)) {
                            return;
                        }
                        LogUtil.a("SectionH5InteractionUtils", "start end time is valid");
                        Long l = (Long) objArr[0];
                        long jLongValue = l.longValue();
                        Long l2 = (Long) objArr[1];
                        long jLongValue2 = l2.longValue();
                        LogUtil.a("SectionH5InteractionUtils", "startTime ", l, "endTime ", l2);
                        jSONObject.put("chart_start_time", jLongValue);
                        jSONObject.put("chart_end_time", jLongValue2);
                        ftt.this.d.onSuccess(jSONObject, j);
                    } catch (JSONException e2) {
                        LogUtil.e("SectionH5InteractionUtils", "acquireTimeStamp jsonException", LogAnonymous.b(e2));
                        ftt.this.d.onFailure(-1, LogAnonymous.b(e2), j);
                    }
                }
            };
            this.j = observer;
            ObserverManagerUtil.d(observer, "CHART_START_END_TIME");
        }
    }

    public static void b(long j) {
        f34562a = j;
    }

    public static void e(long j) {
        f34563b = j;
    }

    private String e(int i) {
        if (i == 1) {
            return this.f34564c.getResources().getString(R.string.IDS_sleep_snoring_delete_confirm);
        }
        if (i == 2) {
            return this.f34564c.getResources().getString(R.string.IDS_sleep_talk_delete_confirm);
        }
        if (i == 3) {
            return this.f34564c.getResources().getString(R.string.IDS_sleep_keep_audio_file_confirm);
        }
        return "";
    }

    private String b(int i) {
        if (i == 1) {
            return BaseApplication.b().getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ROOT);
        }
        if (i == 2) {
            return BaseApplication.b().getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ROOT);
        }
        if (i == 3) {
            return this.f34564c.getResources().getString(R.string.IDS_sleep_to_close);
        }
        return "";
    }

    private static String c(int i) {
        return BaseApplication.b().getString(R.string.IDS_hw_show_cancel);
    }

    @JavascriptInterface
    public static void pageType(int i) {
        e = i;
    }

    public static int a() {
        return e;
    }
}
