package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import health.compact.a.AuthorizationUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qgd extends qgg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f46156c;
    private boolean e;

    public qgd(oaw oawVar) {
        super(oawVar);
        this.e = false;
    }

    @Override // defpackage.qgg
    public boolean b(oaw oawVar) {
        LogUtil.a("LaunchPageTask", "onTaskStart");
        return e(oawVar);
    }

    private boolean e(oaw oawVar) {
        this.e = false;
        this.f46156c = new CountDownLatch(1);
        g(oawVar);
        try {
            this.f46156c.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            LogUtil.e("LaunchPageTask", "LightMedalListSuccess catch InterruptedException");
        }
        return this.e;
    }

    private void g(oaw oawVar) {
        if (!(oawVar instanceof oaz)) {
            this.f46156c.countDown();
            return;
        }
        oaz oazVar = (oaz) oawVar;
        if (oazVar.c() == 2) {
            LogUtil.j("LaunchPageTask", "ReceiveMessage is end");
            this.e = true;
            if (oazVar.a() != 200) {
                LogUtil.e("LaunchPageTask", "launchPage fail! code ", Integer.valueOf(oazVar.a()));
                this.e = false;
            }
            this.f46156c.countDown();
            return;
        }
        e();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qgd.2
            @Override // java.lang.Runnable
            public void run() {
                qgd.this.d(BaseApplication.getContext());
            }
        });
    }

    private void e() {
        obb obbVarD = d(4);
        obbVarD.e(200);
        lkr.b().sendComand(e(obbVarD), new qgg.b(new ResponseCallback<Integer>() { // from class: qgd.4
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Integer num) {
                if (i == 207) {
                    qgd.this.e = true;
                }
                qgd.this.f46156c.countDown();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        if (b(context)) {
            LogUtil.j("LaunchPageTask", "PluginAchieveAdapter == null || PluginOperationAdapter == null!");
            c(context);
            e(context, "achieveMedal");
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        LogUtil.a("LaunchPageTask", "LoginInit ", Boolean.valueOf(loginInit.getIsLogined()));
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(context)) {
            e(context, "achieveMedal");
        } else {
            j(context);
            LogUtil.a("LaunchPageTask", "jump to loading data activity");
        }
    }

    private void j(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("LaunchPageTask", "showAchieveMedal()");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_NEW_MEDALS);
        intent.setFlags(HiUserInfo.DATA_CLOUD);
        context.startActivity(intent);
    }

    private boolean b(Context context) {
        return oru.a(context).getAdapter() == null || !(PluginOperation.getInstance(context).getAdapter() instanceof PluginOperationAdapter);
    }

    private void c(Context context) {
        if (oru.a(context).getAdapter() == null) {
            LogUtil.j("LaunchPageTask", "PluginAchieveAdapter == null");
            oru.a(context).setAdapter(new PluginAchieveAdapterImpl());
        }
        e(context);
    }

    private void e(Context context) {
        if (PluginOperation.getInstance(context).getAdapter() instanceof PluginOperationAdapter) {
            return;
        }
        LogUtil.j("LaunchPageTask", "pluginOperationAdapter == null");
        a(context);
    }

    private void a(Context context) {
        PluginOperation pluginOperation = PluginOperation.getInstance(context);
        pluginOperation.setAdapter(PluginOperationAdapterImpl.getInstance(context));
        pluginOperation.init(context);
    }

    private void e(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            launchIntentForPackage.putExtra(str, str);
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            LogUtil.a("LaunchPageTask", "jump to main activity");
        }
    }
}
