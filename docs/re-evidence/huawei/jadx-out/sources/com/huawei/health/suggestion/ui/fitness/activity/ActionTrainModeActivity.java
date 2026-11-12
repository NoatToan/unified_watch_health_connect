package com.huawei.health.suggestion.ui.fitness.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.config.MeasurementModeTab;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionModeViewHolder;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;
import defpackage.gcn;
import defpackage.gzx;
import defpackage.hir;
import defpackage.iei;
import defpackage.njy;
import defpackage.nuc;
import defpackage.peh;
import defpackage.qji;
import defpackage.qpo;
import defpackage.qrs;
import defpackage.xfz;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ActionTrainModeActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9040c;
    private qpo d;
    private HealthViewPager e;
    private Map<String, Object> f;
    private String[] g;
    private HealthBottomSheet h;
    private AtomicAction i;
    private int j;
    private List<FitnessActionModeViewHolder> k = new ArrayList(3);
    private HealthSubTabWidget m;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setContentView(R.layout.activity_action_train_mode);
        d();
        a();
    }

    public void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_ActionTrainModeActivity", "initData() getIntent is null");
            return;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra("intentData");
            if (bundleExtra == null) {
                LogUtil.e("Suggestion_ActionTrainModeActivity", "bundle null.");
                return;
            }
            this.i = (AtomicAction) peh.b(bundleExtra.getString("actionInfo"), AtomicAction.class);
            this.f = (Map) bundleExtra.getSerializable("biIntent");
            LogUtil.a("Suggestion_ActionTrainModeActivity", "initData atomicAction", Boolean.valueOf(this.i == null));
            if (this.i == null) {
                LogUtil.j("Suggestion_ActionTrainModeActivity", "mAtomicAction == null");
                finish();
                return;
            }
            Map<String, Object> map = this.f;
            if (map != null) {
                LogUtil.a("Suggestion_ActionTrainModeActivity", "mBiMap:", map.entrySet());
            }
            String string = bundleExtra.getString("describe");
            this.f9039b = string;
            this.f9038a = hir.b(string);
            this.f9040c = nuc.c(this.i.getExtendPropertyInt("aiMeasurement"));
        } catch (BadParcelableException e) {
            LogUtil.e("Suggestion_ActionTrainModeActivity", "initData exception", LogAnonymous.b(e));
        }
    }

    public void a() {
        this.m = (HealthSubTabWidget) findViewById(R.id.sug_action_mode_tab);
        this.e = (HealthViewPager) findViewById(R.id.action_mode_pager);
        ((HealthButton) findViewById(R.id.train_dialog_confirm)).setOnClickListener(qji.d(this, this, true, ""));
        findViewById(R.id.content).setOnClickListener(new View.OnClickListener() { // from class: hes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.g = MeasurementModeTab.getModeTabName(this.f9040c);
        h();
        this.d = new qpo(this.e, this.m);
        this.e.setOffscreenPageLimit(this.g.length);
        HealthBottomSheet healthBottomSheet = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.h = healthBottomSheet;
        healthBottomSheet.setIndicateSafeInsetsEnabled(true);
        this.h.setForceShowIndicateEnabled(false);
        this.h.setSheetHeight(0);
        int iE = e();
        this.h.setHeightGap(iE);
        this.h.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.ActionTrainModeActivity.3
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    ActionTrainModeActivity.this.finish();
                }
            }
        });
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.drag_View);
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), iE);
        if (this.i == null) {
            return;
        }
        f();
    }

    public /* synthetic */ void d(View view) {
        finish();
    }

    private int e() {
        return (int) (((qrs.m() - qrs.d(this, b())) - qrs.s(this)) - (qrs.ad(this) ? qrs.q(this) : 0));
    }

    private int b() {
        LogUtil.a("Suggestion_ActionTrainModeActivity", "getDragViewHeight scale:", Float.valueOf(qrs.i()));
        if (qrs.u()) {
            return 300;
        }
        return ComponentInfo.PluginPay_A_N;
    }

    private void h() {
        this.m.setOnSubTabChangeListener(new HwSubTabWidget.OnSubTabChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.ActionTrainModeActivity.1
            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabReselected(xfz xfzVar) {
            }

            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabUnselected(xfz xfzVar) {
            }

            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabSelected(xfz xfzVar) {
                ActionTrainModeActivity.this.j = xfzVar.c();
                LogUtil.a("Suggestion_ActionTrainModeActivity", "onSubTabSelected mCurrentPosition:", Integer.valueOf(ActionTrainModeActivity.this.j));
            }
        });
    }

    private void f() {
        this.d.b();
        this.k.clear();
        FitnessActionModeViewHolder.ActionMode actionModeB = FitnessActionModeViewHolder.b(this.i.getId());
        int targetType = actionModeB != null ? actionModeB.getTargetType() : Integer.MAX_VALUE;
        boolean zIsMatch = MeasurementModeTab.isMatch(targetType, this.f9040c);
        ReleaseLogUtil.d("Suggestion_ActionTrainModeActivity", "updateViewPager lastSelectMode:", Integer.valueOf(targetType), "mAIMeasurement:", Integer.valueOf(this.f9040c), "isMatch:", Boolean.valueOf(zIsMatch));
        int[] tabTypeArrayByMeasurement = MeasurementModeTab.getTabTypeArrayByMeasurement(this.f9040c);
        for (int i = 0; i < tabTypeArrayByMeasurement.length; i++) {
            c(targetType, i, MeasurementModeTab.getTabTypeArrayByMeasurement(this.f9040c)[i], zIsMatch);
        }
    }

    private void c(int i, int i2, int i3, boolean z) {
        boolean z2 = (i == i3 && z) || i2 == 0;
        String[] strArr = this.g;
        if (strArr.length <= i2) {
            LogUtil.j("Suggestion_ActionTrainModeActivity", "addSubTab mTabContent.length <= index", Integer.valueOf(i2), "mTabContent.length:", Integer.valueOf(strArr.length));
            return;
        }
        xfz xfzVarB = this.m.b(strArr[i2]);
        FitnessActionModeViewHolder fitnessActionModeViewHolder = new FitnessActionModeViewHolder(this, i3, this.i);
        this.d.c(xfzVarB, fitnessActionModeViewHolder.b(), z2);
        this.k.add(fitnessActionModeViewHolder);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.a("Suggestion_ActionTrainModeActivity", "onClick isFastClick true");
        } else if (view.getId() == R.id.train_dialog_confirm) {
            if (this.i == null) {
                LogUtil.j("Suggestion_ActionTrainModeActivity", "onClick mAtomicAction == null");
            } else {
                PermissionUtil.d(this, PermissionUtil.PermissionType.CAMERA, new d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        iei.a(2, this.i, this.f);
        AIActionBundle aIActionBundleC = c();
        Bundle bundle = new Bundle();
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.addExtra(AIActionBundle.AI_ACTION_BUNDLE, aIActionBundleC);
        bundle.putParcelable("bundle_key_sport_launch_paras", sportLaunchParams);
        gcn.c().startRunCourseSport(this, 700001, AIActionBundle.coverActionToTrackTarget(aIActionBundleC.getTargetType()), aIActionBundleC.getTargetValue(), bundle);
        finish();
    }

    private AIActionBundle c() {
        AIActionBundle aIActionBundle = new AIActionBundle();
        aIActionBundle.setActionId(this.i.getId());
        aIActionBundle.setActionName(this.i.getName());
        aIActionBundle.setAiMeasurement(this.f9040c);
        aIActionBundle.setDuration(FitnessActionModeViewHolder.d(this.i));
        ReleaseLogUtil.d("Suggestion_ActionTrainModeActivity", "onClick viewHolderList size:", Integer.valueOf(this.k.size()), "mCurrentPosition:", Integer.valueOf(this.j));
        if (njy.c(this.k, this.j) && this.k.get(this.j) != null) {
            FitnessActionModeViewHolder fitnessActionModeViewHolder = this.k.get(this.j);
            int iD = fitnessActionModeViewHolder.d();
            int iA = fitnessActionModeViewHolder.a();
            aIActionBundle.setActionName(c(this.i.getName(), fitnessActionModeViewHolder.c()));
            FitnessActionModeViewHolder.a(this.i.getId(), iD, iA);
            aIActionBundle.setTargetType(iD);
            aIActionBundle.setTargetValue(iA);
        }
        aIActionBundle.setCalorie(this.i.getExtendPropertyFloat("calorie"));
        aIActionBundle.setBodyName(gzx.d(this.i.getTrainingPoints()));
        aIActionBundle.setDescribe(this.f9039b);
        aIActionBundle.setTowards(this.f9038a);
        Map<String, Object> map = this.f;
        if (map != null) {
            aIActionBundle.setPullFrom((String) map.get(WebViewHelp.BI_KEY_PULL_FROM));
            aIActionBundle.setResourceId((String) this.f.get("resourceId"));
            aIActionBundle.setResourceName((String) this.f.get("resourceName"));
            aIActionBundle.setPullOrder((String) this.f.get("pullOrder"));
        }
        return aIActionBundle;
    }

    private String c(String str, String str2) {
        String[] strArr = this.g;
        if (strArr == null) {
            return str;
        }
        int length = strArr.length;
        int i = this.j;
        if (length <= i) {
            return str;
        }
        return gzx.c(this, R.string.IDS_sport_history_run_course_name, str, gzx.c(this, R.string.IDS_hwh_motiontrack_sport_data_share_date, strArr[i], str2));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        qji.d(toString());
        super.onDestroy();
    }

    static class d extends CustomPermissionAction {
        private final WeakReference<ActionTrainModeActivity> d;

        private d(ActionTrainModeActivity actionTrainModeActivity) {
            super(actionTrainModeActivity);
            this.d = new WeakReference<>(actionTrainModeActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            ActionTrainModeActivity actionTrainModeActivity = this.d.get();
            if (actionTrainModeActivity != null) {
                actionTrainModeActivity.i();
            } else {
                ReleaseLogUtil.e("Suggestion_ActionTrainModeActivity", "activity is null in WeakReferenceCustomPermissionAction");
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
