package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class wrb extends wrc {
    private UserProfileMgrApi h;

    public wrb(Context context, PersonalCenterUiApi personalCenterUiApi) {
        super(context, personalCenterUiApi);
    }

    @Override // defpackage.wrc
    protected void a() {
        if (this.f52359a != null) {
            return;
        }
        this.f52359a = new wre();
        this.f52359a.a(5);
        this.f52359a.b(R.mipmap.ic_me_active_target);
        this.f52359a.d(R.string.IDS_hwh_me_active_target);
        this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_create_annual_flag));
        if (this.h == null) {
            this.h = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        }
        this.f52359a.c(this.h.isTargetRedNeedShow());
        this.f52359a.a(qji.b(new View.OnClickListener() { // from class: wrh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        }, (BaseActivity) this.f52360b, true, ""));
    }

    /* synthetic */ void c(View view) {
        if (qrs.e(view)) {
            LogUtil.a("AnnualFlagCardData", "click too fast");
            return;
        }
        if (this.f52359a != null && this.f52359a.n()) {
            this.h.hideTargetRed();
            b(false, 2304);
        }
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).gotoH5ActiveTarget(this.f52360b);
    }

    @Override // defpackage.wrc
    protected void d() {
        super.d();
        if (this.d) {
            this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_create_annual_flag));
            if (this.j != null) {
                this.j.a(this.f52359a);
            }
            b(false, 2304);
            return;
        }
        b();
        lsy.a(new Runnable() { // from class: wrg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    /* synthetic */ void c() {
        this.h.getActiveTargetStatus(new IBaseResponseCallback() { // from class: wri
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f52366b.b(i, obj);
            }
        });
    }

    /* synthetic */ void b(int i, Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            LogUtil.a("AnnualFlagCardData", "flag count = ", num);
            e(iIntValue);
        }
    }

    @Override // defpackage.wrc, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "AnnualFlagCardData";
    }

    private void e(final int i) {
        HandlerExecutor.b(new Runnable() { // from class: wrj
            @Override // java.lang.Runnable
            public final void run() {
                this.f52368b.c(i);
            }
        });
    }

    /* synthetic */ void c(int i) {
        String string;
        if (this.j == null) {
            LogUtil.j("AnnualFlagCardData", "mViewHolder is null");
            return;
        }
        if (i > 0) {
            string = qre.e(R.plurals.IDS_me_flag_count, i, UnitUtil.e(i, 1, 0));
        } else if (i == 0) {
            string = this.f52360b.getString(R.string.IDS_hwh_annual_flag_finished);
        } else {
            string = this.f52360b.getString(R.string.IDS_hwh_create_annual_flag);
        }
        if (TextUtils.isEmpty(string) || string.equals(this.f52359a.b())) {
            return;
        }
        this.f52359a.a(string);
        this.j.a(this.f52359a);
    }

    private void b() {
        if (Utils.o() || LoginInit.getInstance(this.f52360b).isKidAccount()) {
            return;
        }
        b(this.h.isTargetRedNeedShow(), 2304);
    }
}
