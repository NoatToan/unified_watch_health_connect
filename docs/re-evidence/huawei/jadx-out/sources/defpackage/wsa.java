package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wsa extends wrc {
    private MessageCenterApi f;

    public wsa(Context context, PersonalCenterUiApi personalCenterUiApi) {
        super(context, personalCenterUiApi);
        if (this.f == null) {
            this.f = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        }
    }

    @Override // defpackage.wrc, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "MyReportCardData";
    }

    @Override // defpackage.wrc
    protected void a() {
        if (this.f52359a != null) {
            return;
        }
        this.f52359a = new wre();
        this.f52359a.a(5);
        this.f52359a.b(R.mipmap.img_me_weeks_months_years);
        if (Utils.o() || CommonUtil.ca()) {
            this.f52359a.d(R.string.IDS_plugin_achievement_weekly_monthly_report);
        } else {
            this.f52359a.d(R.string.IDS_plugin_achievement_weekly_monthly_year_report);
        }
        this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_no_report));
        this.f52359a.c(false);
        this.f52359a.a(qji.b(new View.OnClickListener() { // from class: wse
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        }, (BaseActivity) this.f52360b, true, AnalyticsValue.HEALTH_MINE_ACHIEVE_REPORT_2040062.value()));
    }

    /* synthetic */ void b(View view) {
        if (qrs.e(view)) {
            LogUtil.a("MyReportCardData", "click too fast");
            return;
        }
        if (this.f52359a.n()) {
            LogUtil.a("MyReportCardData", "ReportRedPoint GONE.");
            b(false, 8);
            SharedPreferenceManager.a(String.valueOf(20003), "new_report", false);
        }
        wsg.a(this.f52360b, 5);
    }

    @Override // defpackage.wrc
    protected void d() {
        super.d();
        if (this.d) {
            this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_no_report));
            if (this.j != null) {
                this.j.a(this.f52359a);
            }
            b(false, 8);
            return;
        }
        lsy.a(new Runnable() { // from class: wsd
            @Override // java.lang.Runnable
            public final void run() {
                this.f52395b.c();
            }
        });
    }

    /* synthetic */ void c() {
        d(this.f.getMessages(11));
    }

    private void d(List<MessageObject> list) {
        String strB = b();
        if (njy.e(list)) {
            LogUtil.j("MyReportCardData", "msgDbObject is null");
            b(strB);
            return;
        }
        LogUtil.a("MyReportCardData", "msgDbObject size== ", Integer.valueOf(list.size()));
        for (int size = list.size() - 1; size >= 0; size--) {
            MessageObject messageObject = list.get(size);
            if (messageObject != null && "16".equals(messageObject.getModule())) {
                if ("monthReportMessage".equals(messageObject.getType())) {
                    strB = b();
                    break;
                } else {
                    strB = this.f52360b.getString(R.string.IDS_hwh_new_week_report);
                    break;
                }
            }
        }
        b(strB);
    }

    public void b(final String str) {
        HandlerExecutor.b(new Runnable() { // from class: wsb
            @Override // java.lang.Runnable
            public final void run() {
                this.f52394c.a(str);
            }
        });
    }

    /* synthetic */ void a(String str) {
        if (this.j == null) {
            LogUtil.j("MyReportCardData", "mViewHolder is null");
            return;
        }
        if (!TextUtils.isEmpty(str) && !str.equals(this.f52359a.b())) {
            this.f52359a.a(str);
            this.j.a(this.f52359a);
        }
        b(SharedPreferenceManager.b(String.valueOf(20003), "new_report", false), 8);
    }

    private String b() {
        String strA = UnitUtil.a(new Date(pal.c(-1, System.currentTimeMillis(), 1)), 56);
        if (LanguageUtil.bp(this.f52360b) || LanguageUtil.y(this.f52360b)) {
            strA = strA.toLowerCase();
        }
        return this.f52360b.getString(R.string.IDS_hwh_new_month_report, strA);
    }
}
