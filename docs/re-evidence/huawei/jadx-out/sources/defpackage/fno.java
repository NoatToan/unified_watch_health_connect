package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.utils.UserInfoMockInteractor;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.fno;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class fno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fno f34274a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34275c;
    private boolean e;

    private fno(Context context) {
        this.e = false;
        boolean zCa = CommonUtil.ca();
        this.f34275c = zCa;
        if (zCa) {
            this.e = b(context);
            e(context);
        }
    }

    public static fno c(Context context) {
        fno fnoVar;
        synchronized (d) {
            if (f34274a == null) {
                f34274a = new fno(context);
            }
            fnoVar = f34274a;
        }
        return fnoVar;
    }

    public void a(Context context) {
        LogUtil.a("Login_MainInteractorsForStoreDemo", String.format(Locale.ENGLISH, "insertDataToHiHealth::enter mIsReLaunchBeyondDays:%b mIsStoreDemoVersion:%b", Boolean.valueOf(this.e), Boolean.valueOf(this.f34275c)));
        if (this.e && this.f34275c) {
            LogUtil.a("Login_MainInteractorsForStoreDemo", "insertDataToHiHealth::start insert");
            wvc.b(context);
            jap.c(7);
            wun.c().b();
            wun.c().i();
            wun.c().h();
            wty.a();
            wty.d();
            uwm.b();
            wvh.a();
            wun.c().d();
            Services.b("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer() { // from class: fnp
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    ((PluginSuggestion) obj).deleteFitnessDataForStoreDemo();
                }
            });
            Services.b("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer() { // from class: fnr
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    ((PluginSuggestion) obj).restoreUserDataForDemoVersion();
                }
            });
            d(context);
            wvc.a(context);
            jap.c(30);
            wun.c().a();
            wun.c().j();
            wun.c().g();
            wty.c();
            wty.e();
            uwm.e();
            new UserInfoMockInteractor(context).d();
            oum.e(context.getApplicationContext());
            wvh.b();
            d(context);
            this.e = false;
        }
    }

    private void d(final Context context) {
        HiHealthData hiHealthData = new HiHealthData(50001);
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiHealthData.setTimeInterval(jCurrentTimeMillis, jCurrentTimeMillis);
        hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
        hiHealthData.setValue(60);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(hiHealthData);
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.health.interactor.MainInteractorsForStoreDemo$$ExternalSyntheticLambda2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                fno.d(context, i, obj);
            }
        });
    }

    public static /* synthetic */ void d(Context context, int i, Object obj) {
        Intent intent = new Intent("com.huawei.hihealth.action_data_refresh");
        intent.setPackage(BaseApplication.d());
        intent.putExtra("refresh_type", 0);
        context.sendBroadcast(intent, "com.huawei.hihealth.DEFAULT_PERMISSION");
        HiBroadcastUtil.h(context);
    }

    private static boolean b(Context context) {
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int i = context != null ? context.getSharedPreferences("demo_share_config", 0).getInt("demo_last_open_time", 20140101) : 20140101;
        try {
            return HiDateUtil.d(i, iD, "yyyyMMdd") > 1 || HiDateUtil.d(iD, i, "yyyyMMdd") > 1;
        } catch (ParseException e) {
            LogUtil.e("Login_MainInteractorsForStoreDemo", "needDelDBFile parse date fail, e=", e.getMessage());
        }
    }

    private static void e(Context context) {
        if (context != null) {
            LogUtil.e("Login_MainInteractorsForStoreDemo", "update newday config");
            context.getSharedPreferences("demo_share_config", 0).edit().putInt("demo_last_open_time", HiDateUtil.d(System.currentTimeMillis())).apply();
        }
    }
}
