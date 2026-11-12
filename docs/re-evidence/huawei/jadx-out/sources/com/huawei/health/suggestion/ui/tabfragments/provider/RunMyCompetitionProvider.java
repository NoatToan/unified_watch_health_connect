package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.content.DialogInterface;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.btw;
import defpackage.bue;
import defpackage.gnf;
import defpackage.qom;
import defpackage.qre;
import defpackage.qrh;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class RunMyCompetitionProvider extends FitnessEntranceProvider<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<gnf.e> f10112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10113c;

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Track_Provider_RunMyCompetitionProvider", "loadData planApi is null.");
        } else {
            planApi.c(new UiCallback<gnf>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCompetitionProvider.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Track_Provider_RunMyCompetitionProvider", "errorCode::", Integer.valueOf(i), " errorInfo:", str);
                    SectionBean sectionBean2 = RunMyCompetitionProvider.this.getSectionBean();
                    if (sectionBean2 != null) {
                        sectionBean2.c(new gnf());
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gnf gnfVar) {
                    SectionBean sectionBean2 = RunMyCompetitionProvider.this.getSectionBean();
                    if (sectionBean2 == null) {
                        ReleaseLogUtil.e("Track_Provider_RunMyCompetitionProvider", "getMyCompetitions success sectionBean is null");
                        return;
                    }
                    boolean zF = UnitUtil.f();
                    List<gnf.e> listB = gnfVar != null ? gnfVar.b() : new ArrayList<>();
                    if (!Objects.equals(listB, RunMyCompetitionProvider.this.f10112b) || RunMyCompetitionProvider.this.f10113c != zF) {
                        RunMyCompetitionProvider.this.f10113c = zF;
                        RunMyCompetitionProvider.this.f10112b = listB;
                        sectionBean2.c(gnfVar);
                        return;
                    }
                    LogUtil.j("Track_Provider_RunMyCompetitionProvider", "getMyCompetitions success sectionBean is same and imperialUnit is same");
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return btw.j() && CommonUtil.ab(context) && LoginInit.getInstance(context).getIsLogined() && !LoginInit.getInstance(context).isMinorAccount() && !Utils.k();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_RunMyCompetitionProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return qre.f(R.string.IDS_competition_my);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(final Context context, HashMap<String, Object> map, Object obj) {
        LogUtil.a("Track_Provider_RunMyCompetitionProvider", "parseParams:", obj);
        map.put("VISIVILITY_LIST", obj);
        map.put("SUBTITLE", getSubViewTitle());
        map.put("CLICK_EVENT_LISTENER", new qom() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCompetitionProvider.3
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                RunMyCompetitionProvider.this.b(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context, final String str) {
        if (!qrh.e()) {
            d(context, str);
        } else {
            qrh.d(context, new DialogInterface.OnClickListener() { // from class: icn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.e.b(context, str, dialogInterface, i);
                }
            });
        }
    }

    public /* synthetic */ void b(Context context, String str, DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            d(context, str);
        }
    }

    private void d(Context context, String str) {
        String str2 = CollectionUtils.a(this.f10112b) ? "run_page_not_enabled" : "run_page_enabled";
        if ("LEFT_ICON_CLICK_EVENT".equals(str)) {
            str = "#/custom_competition_create";
        } else if ("RIGHT_ICON_CLICK_EVENT".equals(str)) {
            str = "#/competition_select";
        } else if ("SHOW_MORE_CLICK_EVENT".equals(str)) {
            bue.e(context, 1, "my_events", "", "enabled_status");
            str = "#/my_competition";
        } else {
            bue.e(context, 1, "event_management", "", "enabled_status");
        }
        JumpUtil.a(context, str, str2, "com.huawei.health.h5.intelligent-training-plan");
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public Object getDefaultData() {
        return new Object();
    }
}
