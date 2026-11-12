package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import defpackage.ddv;
import defpackage.ftc;
import defpackage.fua;
import defpackage.idy;
import defpackage.njy;
import defpackage.pjo;
import defpackage.qji;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SleepRecordEntryProvider extends BaseKnitDataProvider {
    private WeakReference<Context> d;
    private SectionBean i;
    private boolean j = fua.c(BaseApplication.getContext());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26838a = fua.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26839b = fua.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ftc> f26840c = new ArrayList();
    private View.OnClickListener e = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepRecordEntryProvider.5
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        private void d(View view) {
            if (view.getId() == R.id.section_button_view1) {
                SleepRecordEntryProvider.this.d();
            } else if (view.getId() == R.id.section_button_view2) {
                SleepRecordEntryProvider.this.e();
            } else if (view.getId() == R.id.section_button_view3) {
                SleepRecordEntryProvider.this.a();
            }
        }

        private void a(View view) {
            if (!SleepRecordEntryProvider.this.j || !SleepRecordEntryProvider.this.f26838a) {
                if (!SleepRecordEntryProvider.this.j || !SleepRecordEntryProvider.this.f26839b) {
                    if (SleepRecordEntryProvider.this.f26839b && SleepRecordEntryProvider.this.f26838a) {
                        if (view.getId() == R.id.section_button_view1) {
                            SleepRecordEntryProvider.this.e();
                            return;
                        } else {
                            if (view.getId() == R.id.section_button_view2) {
                                SleepRecordEntryProvider.this.a();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (view.getId() == R.id.section_button_view1) {
                    SleepRecordEntryProvider.this.d();
                    return;
                } else {
                    if (view.getId() == R.id.section_button_view2) {
                        SleepRecordEntryProvider.this.a();
                        return;
                    }
                    return;
                }
            }
            if (view.getId() == R.id.section_button_view1) {
                SleepRecordEntryProvider.this.d();
            } else if (view.getId() == R.id.section_button_view2) {
                SleepRecordEntryProvider.this.e();
            }
        }

        private void e(View view) {
            if (!SleepRecordEntryProvider.this.j || view.getId() != R.id.section_button_view1) {
                if (!SleepRecordEntryProvider.this.f26839b || view.getId() != R.id.section_button_view1) {
                    if (SleepRecordEntryProvider.this.f26838a && view.getId() == R.id.section_button_view1) {
                        SleepRecordEntryProvider.this.e();
                        return;
                    }
                    return;
                }
                SleepRecordEntryProvider.this.a();
                return;
            }
            SleepRecordEntryProvider.this.d();
        }

        private void b(View view, int i) {
            if (i == 3) {
                d(view);
                return;
            }
            if (i == 2) {
                a(view);
            } else if (i == 1) {
                e(view);
            } else {
                LogUtil.a("SleepRecordEntryProvider", "entry not exist");
            }
        }

        private void c(View view) {
            if (view.getId() == R.id.section_button_view1) {
                SleepRecordEntryProvider.this.d();
            } else if (view.getId() == R.id.section_button_view3) {
                SleepRecordEntryProvider.this.a();
            } else if (view.getId() == R.id.section_button_view4) {
                SleepRecordEntryProvider.this.e();
            }
        }

        private void i(View view) {
            if (!SleepRecordEntryProvider.this.j || !SleepRecordEntryProvider.this.f26838a) {
                if (!SleepRecordEntryProvider.this.j || !SleepRecordEntryProvider.this.f26839b) {
                    if (SleepRecordEntryProvider.this.f26839b && SleepRecordEntryProvider.this.f26838a) {
                        if (view.getId() == R.id.section_button_view1) {
                            SleepRecordEntryProvider.this.a();
                            return;
                        } else {
                            if (view.getId() == R.id.section_button_view2) {
                                SleepRecordEntryProvider.this.e();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (view.getId() == R.id.section_button_view1) {
                    SleepRecordEntryProvider.this.d();
                    return;
                } else {
                    if (view.getId() == R.id.section_button_view2) {
                        SleepRecordEntryProvider.this.a();
                        return;
                    }
                    return;
                }
            }
            if (view.getId() == R.id.section_button_view1) {
                SleepRecordEntryProvider.this.d();
            } else if (view.getId() == R.id.section_button_view2) {
                SleepRecordEntryProvider.this.e();
            }
        }

        private void b(View view) {
            if (!SleepRecordEntryProvider.this.j || view.getId() != R.id.section_button_view1) {
                if (!SleepRecordEntryProvider.this.f26839b || view.getId() != R.id.section_button_view1) {
                    if (SleepRecordEntryProvider.this.f26838a && view.getId() == R.id.section_button_view1) {
                        SleepRecordEntryProvider.this.e();
                        return;
                    }
                    return;
                }
                SleepRecordEntryProvider.this.a();
                return;
            }
            SleepRecordEntryProvider.this.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ?? r0 = SleepRecordEntryProvider.this.j;
            int i = r0;
            if (SleepRecordEntryProvider.this.f26838a) {
                i = r0 + 1;
            }
            int i2 = i;
            if (SleepRecordEntryProvider.this.f26839b) {
                i2 = i + 1;
            }
            if (VersionControlUtil.isSupportSleepManagement()) {
                b(view, i2);
                return;
            }
            if (i2 == 3) {
                c(view);
                return;
            }
            if (i2 == 2) {
                i(view);
            } else if (i2 == 1) {
                b(view);
            } else {
                LogUtil.a("SleepRecordEntryProvider", "entry not exist");
            }
        }
    };
    private long h = System.currentTimeMillis();
    private boolean g = true;

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Context context = this.d.get();
        if (context == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToPhone: context is null");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("hasdate", "true");
        idy.b(AnalyticsValue.MANUALLY_MONITOR_SLEEP_21300044.value(), map);
        pjo.b().c(context, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int i;
        H5ProClient.getServiceManager().registerService(SleepJsApi.class);
        Context context = this.d.get();
        if (context == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToManualEntry: context is null");
            return;
        }
        if (context instanceof KnitSleepDetailActivity) {
            if (VersionControlUtil.isSupportSleepManagement()) {
                i = 9;
            } else {
                i = ((KnitSleepDetailActivity) context).mIsNoDataFragment ? 2 : 1;
            }
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/sleepDataInput?pullFrom=" + i + "&whichDate=" + this.h).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Context context = this.d.get();
        if (context == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToManualEntry: context is null");
            return;
        }
        LogUtil.a("SleepRecordEntryProvider", "jump to rest");
        Intent intent = new Intent();
        intent.setClassName(context, ComponentInfo.PluginSleepBriefs_A_1);
        intent.putExtra("moduleName", "SleepBriefs");
        intent.putExtra("from", 1);
        AppBundle.d().launchActivity(context, intent, null);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        if (EnvironmentInfo.m()) {
            return false;
        }
        return fua.a() || fua.c(context) || fua.c();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.i = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        if (this.g) {
            ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepRecordEntryProvider.4
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (!njy.c(objArr, 0)) {
                        LogUtil.a("SleepRecordEntryProvider", "null args!");
                    } else {
                        SleepRecordEntryProvider.this.h = ((Long) objArr[0]).longValue();
                    }
                }
            }, "SLEEP_CHART_NOW_DATE");
            this.g = false;
        }
    }

    private void e(HashMap map) {
        int i;
        if (this.d.get() instanceof BaseActivity) {
            View.OnClickListener onClickListenerB = qji.b(this.e, (BaseActivity) this.d.get(), true, "");
            if (this.j) {
                if (LanguageUtil.l(this.d.get()) && !Utils.o()) {
                    i = R.drawable.snore_talk;
                } else {
                    i = R.drawable.ic_section_entry_record_icon_intel;
                }
                this.f26840c.add(new ftc.b().b(R.drawable.section_entry_card_background).e(i).c(R.string.IDS_intel_record_sleep).c(onClickListenerB).b());
                map.put("RIGHT_ICON_TEXT", Integer.valueOf(R.string.IDS_clear_sleep_data_cache));
            }
            if (this.f26838a) {
                this.f26840c.add(new ftc.b().b(R.drawable.section_entry_card_background).e(R.drawable.ic_section_entry_rest_icon_intel).c(R.string.IDS_rest_efficient).c(onClickListenerB).b());
            }
            if (this.f26839b) {
                this.f26840c.add(new ftc.b().b(R.drawable.section_entry_card_background).e(R.drawable.ic_section_entry_manual_icon_intel).c(R.string.IDS_sleep_input_text5).c(onClickListenerB).b());
            }
            map.put("SECTION_ENTRY_BUTTON_BEAN_LIST", this.f26840c);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SleepRecordEntryProvider", "parseParams");
        if (map == null || context == null) {
            return;
        }
        this.d = new WeakReference<>(context);
        this.f26840c.clear();
        e(map);
    }
}
