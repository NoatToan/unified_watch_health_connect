package com.huawei.pluginachievement.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.lmf;
import defpackage.njy;
import defpackage.oru;
import defpackage.otu;
import defpackage.oyv;
import defpackage.pbn;
import health.compact.a.LanguageUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class SportMedalDialog extends Activity implements HealthViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22146a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDotsPageIndicator f22148c;
    private HealthButton d;
    private ImageView e;
    private PluginAchieveAdapter f;
    private ImageView h;
    private oyv i;
    private int j;
    private HealthViewPager o;
    private List<MedalInfoDesc> g = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22147b = "";

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("PLGACHIEVE_SportMedalDialog", "onCreate");
        pbn.c((Activity) this);
        setContentView(R.layout.layout_sport_medal_layout);
        this.f22146a = this;
        c();
        e();
    }

    private void c() {
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.sport_medal_view_page);
        this.o = healthViewPager;
        healthViewPager.setIsScroll(false);
        this.f22148c = (HealthDotsPageIndicator) findViewById(R.id.view_medal_dots_page_indicator);
        this.d = (HealthButton) findViewById(R.id.sport_medal_button);
        this.e = (ImageView) findViewById(R.id.medal_arrow_left);
        this.h = (ImageView) findViewById(R.id.medal_arrow_right);
        if (LanguageUtil.ba(this.f22146a)) {
            this.e.setImageResource(R.drawable.medal_arrow_right);
            this.h.setImageResource(R.drawable.medal_arrow_left);
        } else {
            this.e.setImageResource(R.drawable.medal_arrow_left);
            this.h.setImageResource(R.drawable.medal_arrow_right);
        }
        ((ImageView) findViewById(R.id.medal_close_dialog_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.SportMedalDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportMedalDialog.this.finish();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.SportMedalDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SportMedalDialog.this.o == null || SportMedalDialog.this.j == 0 || !njy.c(SportMedalDialog.this.g, SportMedalDialog.this.j - 1)) {
                    return;
                }
                SportMedalDialog.this.o.setCurrentItem(SportMedalDialog.this.j - 1);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.SportMedalDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SportMedalDialog.this.o == null || SportMedalDialog.this.j >= 5 || !njy.c(SportMedalDialog.this.g, SportMedalDialog.this.j + 1)) {
                    return;
                }
                SportMedalDialog.this.o.setCurrentItem(SportMedalDialog.this.j + 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 int, still in use, count: 7, list:
      (r1v2 int) from 0x002b: IF  (r1v2 int) != (2065 int)  -> B:9:0x002d A[HIDDEN]
      (r1v2 int) from 0x002f: IF  (r1v2 int) != (2068 int)  -> B:11:0x0031 A[HIDDEN]
      (r1v2 int) from 0x0033: IF  (r1v2 int) != (2099 int)  -> B:13:0x0035 A[HIDDEN]
      (r1v2 int) from 0x0037: IF  (r1v2 int) != (2101 int)  -> B:15:0x0039 A[HIDDEN]
      (r1v2 int) from 0x003b: IF  (r1v2 int) != (2130 int)  -> B:17:0x003d A[HIDDEN]
      (r1v2 int) from 0x0040: SWITCH (r1v2 int)
     case 2095: goto B:41:0x008d
     case 2096: goto B:37:0x0080
     case 2097: goto B:33:0x0072
     default: goto B:19:0x0043 A[RegionRef:SW:18]
      (r1v2 int) from 0x0043: SWITCH (r1v2 int)
     case 2126: goto B:29:0x0064
     case 2127: goto B:25:0x0056
     case 2128: goto B:21:0x0048
     default: goto B:79:0x00ff A[RegionRef:SW:19]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a() {
        byte b2;
        if (njy.e(this.g) || njy.e(this.g, this.j)) {
            return;
        }
        String strAcquireMedalType = this.g.get(this.j).acquireMedalType();
        strAcquireMedalType.hashCode();
        if (iHashCode != 2065) {
            if (iHashCode != 2068) {
                if (iHashCode != 2099) {
                    if (iHashCode != 2101) {
                        if (iHashCode != 2130) {
                            switch (strAcquireMedalType) {
                                case "A":
                                    b2 = 0;
                                    break;
                                case "B":
                                    b2 = 1;
                                    break;
                                case "C":
                                    b2 = 2;
                                    break;
                                case "D":
                                    b2 = 3;
                                    break;
                                default:
                                    switch (strAcquireMedalType) {
                                        case 2095:
                                            if (!strAcquireMedalType.equals("B1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 6;
                                            }
                                            break;
                                        case 2096:
                                            if (!strAcquireMedalType.equals("B2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 7;
                                            }
                                            break;
                                        case 2097:
                                            if (!strAcquireMedalType.equals("B3")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 8;
                                            }
                                            break;
                                        default:
                                            switch (strAcquireMedalType) {
                                                case 2126:
                                                    if (!strAcquireMedalType.equals("C1")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 11;
                                                    }
                                                    break;
                                                case 2127:
                                                    if (!strAcquireMedalType.equals("C2")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 12;
                                                    }
                                                    break;
                                                case 2128:
                                                    if (!strAcquireMedalType.equals("C3")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 13;
                                                    }
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                            break;
                                    }
                            }
                        } else if (strAcquireMedalType.equals("C5")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                    } else if (strAcquireMedalType.equals("B7")) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                } else if (strAcquireMedalType.equals("B5")) {
                    b2 = 9;
                } else {
                    b2 = -1;
                }
            } else if (strAcquireMedalType.equals("A5")) {
                b2 = 5;
            } else {
                b2 = -1;
            }
        } else if (strAcquireMedalType.equals("A2")) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 6:
            case 11:
                otu.b(this.f22146a).e("huaweischeme://healthapp/track?sportType=2&targetType=m&targetValue=0");
                break;
            case 1:
            case 2:
            case 3:
            case 7:
                otu.b(this.f22146a).e("huaweischeme://healthapp/track?sportType=1&targetType=m&targetValue=0");
                break;
            case 4:
            case 8:
            case 12:
                otu.b(this.f22146a).e(KakaConstants.RIDE_URL);
                break;
            case 5:
            case 10:
            case 14:
                otu.b(this.f22146a).e("huaweischeme://healthapp/track?sportType=283&targetType=s&targetValue=0");
                break;
            case 9:
            case 13:
                PluginAchieveAdapter pluginAchieveAdapter = this.f;
                if (pluginAchieveAdapter != null) {
                    pluginAchieveAdapter.gotoFitness();
                } else {
                    LogUtil.a("PLGACHIEVE_SportMedalDialog", "pluginAchieveAdapter is null");
                    return;
                }
                break;
            default:
                LogUtil.a("PLGACHIEVE_SportMedalDialog", "pluginAchieveAdapter is no branch.");
                break;
        }
        e(strAcquireMedalType);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 int, still in use, count: 7, list:
      (r2v0 int) from 0x0011: IF  (r2v0 int) != (2065 int)  -> B:4:0x0013 A[HIDDEN]
      (r2v0 int) from 0x0015: IF  (r2v0 int) != (2068 int)  -> B:6:0x0017 A[HIDDEN]
      (r2v0 int) from 0x0019: IF  (r2v0 int) != (2099 int)  -> B:8:0x001b A[HIDDEN]
      (r2v0 int) from 0x001d: IF  (r2v0 int) != (2101 int)  -> B:10:0x001f A[HIDDEN]
      (r2v0 int) from 0x0021: IF  (r2v0 int) != (2130 int)  -> B:12:0x0023 A[HIDDEN]
      (r2v0 int) from 0x0026: SWITCH (r2v0 int)
     case 2095: goto B:36:0x0073
     case 2096: goto B:32:0x0066
     case 2097: goto B:28:0x0058
     default: goto B:14:0x0029 A[RegionRef:SW:13]
      (r2v0 int) from 0x0029: SWITCH (r2v0 int)
     case 2126: goto B:24:0x004a
     case 2127: goto B:20:0x003c
     case 2128: goto B:16:0x002e
     default: goto B:74:0x00e5 A[RegionRef:SW:14]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void e(String str) {
        byte b2;
        String strValueOf = String.valueOf(258);
        str.hashCode();
        if (iHashCode != 2065) {
            if (iHashCode != 2068) {
                if (iHashCode != 2099) {
                    if (iHashCode != 2101) {
                        if (iHashCode != 2130) {
                            switch (str) {
                                case "A":
                                    b2 = 0;
                                    break;
                                case "B":
                                    b2 = 1;
                                    break;
                                case "C":
                                    b2 = 2;
                                    break;
                                case "D":
                                    b2 = 3;
                                    break;
                                default:
                                    switch (str) {
                                        case 2095:
                                            if (!str.equals("B1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 6;
                                            }
                                            break;
                                        case 2096:
                                            if (!str.equals("B2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 7;
                                            }
                                            break;
                                        case 2097:
                                            if (!str.equals("B3")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 8;
                                            }
                                            break;
                                        default:
                                            switch (str) {
                                                case 2126:
                                                    if (!str.equals("C1")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 11;
                                                    }
                                                    break;
                                                case 2127:
                                                    if (!str.equals("C2")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 12;
                                                    }
                                                    break;
                                                case 2128:
                                                    if (!str.equals("C3")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 13;
                                                    }
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                            break;
                                    }
                            }
                        } else if (str.equals("C5")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("B7")) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("B5")) {
                    b2 = 9;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("A5")) {
                b2 = 5;
            } else {
                b2 = -1;
            }
        } else if (str.equals("A2")) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 6:
            case 11:
                strValueOf = String.valueOf(258);
                break;
            case 1:
            case 2:
            case 3:
            case 7:
                strValueOf = String.valueOf(257);
                break;
            case 4:
            case 8:
            case 12:
                strValueOf = String.valueOf(259);
                break;
            case 5:
            case 10:
            case 14:
                strValueOf = String.valueOf(283);
                break;
            case 9:
            case 13:
                strValueOf = String.valueOf(10001);
                break;
            default:
                LogUtil.a("PLGACHIEVE_SportMedalDialog", "pluginAchieveAdapter is no branch.");
                break;
        }
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("from", this.f22147b);
        map.put("to", strValueOf);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MEDAL_SPORT_2041092.value(), map, 0);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("PLGACHIEVE_SportMedalDialog", "getData intent is null");
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("sport_medal_record");
        if (serializableExtra instanceof List) {
            this.g = (List) serializableExtra;
        }
        this.f22147b = intent.getStringExtra("medal_sport_type_bi_click");
        d();
    }

    private void d() {
        if (njy.e(this.g)) {
            finish();
            return;
        }
        if (this.g.size() == 1) {
            this.e.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.o.addOnPageChangeListener(this);
        oyv oyvVar = new oyv(this.g);
        this.i = oyvVar;
        this.o.setAdapter(oyvVar);
        this.o.setOffscreenPageLimit(5);
        this.f = oru.a(this.f22146a).getAdapter();
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.SportMedalDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportMedalDialog.this.a();
                SportMedalDialog.this.finish();
            }
        });
        this.f22148c.setRtlEnable(LanguageUtil.ba(this.f22146a));
        this.f22148c.setViewPager(this.o);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.j = i;
        if (i == 0) {
            this.e.setVisibility(8);
            this.h.setVisibility(0);
        } else if (i == this.g.size() - 1) {
            this.e.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.h.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
