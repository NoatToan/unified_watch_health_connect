package defpackage;

import android.content.Context;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonLibUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class qja implements BrowsingBiEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile qja f46295b;
    private static final Object d = new Object();
    private static Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46297c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46296a = null;

    private qja() {
    }

    public static qja e(Context context) {
        if (f46295b == null) {
            synchronized (d) {
                if (f46295b == null) {
                    f46295b = new qja();
                    e = context;
                    if (context == null) {
                        e = BaseApplication.getContext();
                    }
                    LoginInit.getInstance(e);
                    LoginInit.setBrowsingBiEvent(f46295b);
                }
            }
        }
        return f46295b;
    }

    @Override // com.huawei.browse.BrowsingBiEvent
    public void updateCountryCodeAndUserId() {
        lmf.d().c(LoginInit.getInstance(e).getUsetId());
        lmf.d().a(LoginInit.getInstance(e).getCountryCode(null));
    }

    @Override // com.huawei.browse.BrowsingBiEvent
    public void loginBeforeBiEvent(String str) {
        updateCountryCodeAndUserId();
        this.f46297c = LoginInit.getInstance(e).getCountryCode(null);
        this.f46296a = str;
        HashMap map = new HashMap();
        map.put("triggerPos", str);
        lmf.d().c(e, AnalyticsValue.HEALTH_TRIGGER_LOGIN_APP_2050004.value(), map, 0);
    }

    @Override // com.huawei.browse.BrowsingBiEvent
    public void loginSuccessBiEvent() {
        lmf.d().a(LoginInit.getInstance(e).getCountryCode(null));
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("lastCountry", this.f46297c);
        map.put("triggerPos", this.f46296a);
        lmf.d().c(e, AnalyticsValue.HEALTH_LOGIN_APP_2050001.value(), map, 0);
        lmf.d().c(LoginInit.getInstance(e).getUsetId());
    }

    @Override // com.huawei.browse.BrowsingBiEvent
    public void showFullServiceDialog(Context context) {
        showFullServiceDialog(com.huawei.haf.application.BaseApplication.j(), new View.OnClickListener() { // from class: qjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("BrowseBi", "showFullServiceDialog onClick to cancel");
            }
        });
    }

    @Override // com.huawei.browse.BrowsingBiEvent
    public void showFullServiceDialog(final Context context, final View.OnClickListener onClickListener) {
        LogUtil.a("BrowseBi", "showFullServiceDialog in");
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: qjg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(context, onClickListener);
                }
            });
            return;
        }
        if (context == null) {
            LogUtil.e("BrowseBi", "Context is null");
            return;
        }
        String string = context.getString(R.string.IDS_hw_health_full_service);
        CustomTextAlertDialog.Builder builderB = new CustomTextAlertDialog.Builder(context).e(string).a(context.getString(R.string.IDS_hw_health_full_service_label)).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: qja.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
                SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_agree_full_service_model", true);
                CommonLibUtil.d(context);
            }
        }).e(R.string.IDS_hw_common_ui_dialog_cancel, onClickListener).b((Boolean) true);
        CustomTextAlertDialog customTextAlertDialogB = builderB.b();
        builderB.c().setBackground(context.getDrawable(R.drawable.button_background_emphasize));
        builderB.c().setTextColor(context.getColor(R.color.common_color_white));
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void a(Context context, View.OnClickListener onClickListener) {
        LogUtil.a("BrowseBi", "showFullServiceDialog runOnUiThread");
        showFullServiceDialog(context, onClickListener);
    }
}
