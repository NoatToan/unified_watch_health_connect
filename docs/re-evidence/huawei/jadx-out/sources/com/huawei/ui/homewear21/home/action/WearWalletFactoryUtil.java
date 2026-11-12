package com.huawei.ui.homewear21.home.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil;
import defpackage.ddy;
import defpackage.eey;
import defpackage.lkw;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes18.dex */
public class WearWalletFactoryUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f26260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f26261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Consumer<Integer> f26262c;
    private Object d;
    private ActivityResultLauncher<Intent> e;

    /* JADX INFO: loaded from: classes43.dex */
    public interface FactoryResetResultFlag {
        public static final int FACTORY_RESET_ERROR = -1;
        public static final int FACTORY_RESET_FAIL_AND_CONTINUE_FACTORY_RESET = 2;
        public static final int FACTORY_RESET_FAIL_AND_STOP_FACTORY_RESET = 1;
        public static final int FACTORY_RESET_SUCCESS = 0;
    }

    public WearWalletFactoryUtil() {
    }

    public WearWalletFactoryUtil(BaseActivity baseActivity) {
        a(baseActivity);
    }

    public void a(BaseActivity baseActivity) {
        this.e = baseActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.f26263b.c((ActivityResult) obj);
            }
        });
    }

    /* synthetic */ void c(ActivityResult activityResult) {
        LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity on result");
        if (this.f26262c == null) {
            LogUtil.j("WearWalletFactoryUtil", "startWalletRestoredActivity result callback is null");
            return;
        }
        Intent data = activityResult.getData();
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity result code:", Integer.valueOf(resultCode));
            this.f26262c.accept(-1);
        } else if (data == null) {
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity intent not set");
            this.f26262c.accept(-1);
        } else {
            int intExtra = data.getIntExtra("factoryresetresult", -1);
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity reset result:", Integer.valueOf(intExtra));
            this.f26262c.accept(Integer.valueOf(intExtra));
            this.f26262c = null;
        }
    }

    public void c(DeviceInfo deviceInfo, final Consumer<Boolean> consumer) {
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("WearWalletFactoryUtil", "isWalletCardNeedCloudBackup wallet plugin not found");
            consumer.accept(false);
            return;
        }
        if (lkw.t() == null || !lkw.t().isWalletOpenCard()) {
            LogUtil.a("WearWalletFactoryUtil", "isWalletCardNeedCloudBackup not support new wallet");
            consumer.accept(false);
        } else {
            if (!eey.d(deviceInfo, InterfaceHiMap.POLY_LINE_MAX_SIZE)) {
                LogUtil.a("WearWalletFactoryUtil", "isWalletCardNeedCloudBackup cab not support");
                consumer.accept(false);
                return;
            }
            try {
                c(BaseApplication.getContext(), new Consumer<Integer>() { // from class: com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil.3
                    @Override // com.huawei.framework.servicemgr.Consumer
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void accept(Integer num) {
                        LogUtil.a("WearWalletFactoryUtil", "queryWalletCardCount count: ", num);
                        consumer.accept(Boolean.valueOf(num.intValue() > 0));
                    }
                });
            } catch (NoSuchMethodException e) {
                LogUtil.e("WearWalletFactoryUtil", "queryWalletCardCount error", ExceptionUtils.c(e));
                consumer.accept(false);
            }
        }
    }

    public void e(final Consumer<Boolean> consumer) {
        a(new Consumer() { // from class: tle
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                WearWalletFactoryUtil.c(consumer, (Integer) obj);
            }
        });
    }

    public static /* synthetic */ void c(Consumer consumer, Integer num) {
        if (num.intValue() == 1) {
            consumer.accept(false);
        } else {
            consumer.accept(true);
        }
    }

    public void e(Activity activity, final Consumer<Boolean> consumer) {
        d(activity, new Consumer() { // from class: tla
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                WearWalletFactoryUtil.e(consumer, (Integer) obj);
            }
        });
    }

    public static /* synthetic */ void e(Consumer consumer, Integer num) {
        if (num.intValue() == 1) {
            consumer.accept(false);
        } else {
            consumer.accept(true);
        }
    }

    private void d(Activity activity, Consumer<Integer> consumer) {
        LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity enter");
        this.f26262c = consumer;
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_75);
        activity.startActivityForResult(intent, 201010101);
    }

    private void a(Consumer<Integer> consumer) {
        LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity enter");
        this.f26262c = consumer;
        if (this.e == null) {
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity launcher is null");
            consumer.accept(-1);
        } else {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_75);
            this.e.launch(intent);
        }
    }

    private void c(Context context, final Consumer<Integer> consumer) throws NoSuchMethodException {
        Object objA = a(context);
        Method methodC = c();
        Class<?> clsD = d();
        if (objA == null || methodC == null || clsD == null) {
            LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount reflect error");
            consumer.accept(0);
        } else if (!clsD.isInterface()) {
            LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount callback type error");
            consumer.accept(0);
        } else {
            ReflectionUtils.e(methodC, objA, context, Proxy.newProxyInstance(clsD.getClassLoader(), new Class[]{clsD}, new InvocationHandler() { // from class: tlc
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return WearWalletFactoryUtil.b(consumer, obj, method, objArr);
                }
            }));
        }
    }

    public static /* synthetic */ Object b(Consumer consumer, Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        int iIntValue = 0;
        if ("onSuccess".equals(name)) {
            LogUtil.a("WearWalletFactoryUtil", "queryWalletCardCount onSuccess");
            iIntValue = ((Integer) objArr[0]).intValue();
        } else if ("onFail".equals(name)) {
            LogUtil.a("WearWalletFactoryUtil", "queryWalletCardCount onFail");
        } else {
            LogUtil.e("WearWalletFactoryUtil", "queryWalletCardCount unknown method");
        }
        consumer.accept(Integer.valueOf(iIntValue));
        return null;
    }

    private Object a(Context context) throws NoSuchMethodException {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Class<?> clsB = ReflectionUtils.b("com.huawei.wear.wallet.reset.business.utils.WearWalletFactoryUtil");
        if (clsB == null) {
            LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount util not found");
            return null;
        }
        Object objB = ReflectionUtils.b(clsB.getConstructor(Context.class), context);
        this.d = objB;
        if (objB != null) {
            return objB;
        }
        LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount create error");
        return null;
    }

    private Method c() throws NoSuchMethodException {
        Method method = this.f26261b;
        if (method != null) {
            return method;
        }
        if (this.d == null) {
            return null;
        }
        Class<?> clsB = ReflectionUtils.b("com.huawei.wear.wallet.reset.business.callback.QueryWalletCardCountCallback");
        this.f26260a = clsB;
        if (clsB == null) {
            LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount callback not found");
            return null;
        }
        if (!clsB.isInterface()) {
            LogUtil.j("WearWalletFactoryUtil", "queryWalletCardCount callback type error");
            return null;
        }
        Method methodD = ReflectionUtils.d(this.d, "queryWalletCardCount", Context.class, this.f26260a);
        this.f26261b = methodD;
        return methodD;
    }

    private Class<?> d() {
        Class<?> cls = this.f26260a;
        if (cls != null) {
            return cls;
        }
        Class<?> clsB = ReflectionUtils.b("com.huawei.wear.wallet.reset.business.callback.QueryWalletCardCountCallback");
        this.f26260a = clsB;
        return clsB;
    }

    public void e(int i, int i2, Intent intent) {
        LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity on result");
        if (this.f26262c == null) {
            LogUtil.j("WearWalletFactoryUtil", "startWalletRestoredActivity result callback is null");
            this.f26262c = null;
            return;
        }
        if (i2 != -1) {
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity result code:", Integer.valueOf(i2));
            this.f26262c.accept(-1);
            this.f26262c = null;
        } else if (intent == null) {
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity intent not set");
            this.f26262c.accept(-1);
            this.f26262c = null;
        } else {
            int intExtra = intent.getIntExtra("factoryresetresult", -1);
            LogUtil.a("WearWalletFactoryUtil", "startWalletRestoredActivity reset result:", Integer.valueOf(intExtra));
            this.f26262c.accept(Integer.valueOf(intExtra));
            this.f26262c = null;
        }
    }
}
