package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnesssport.AiFitnessSportApi;
import com.huawei.pluginfitnesssport.OnCheckStandListenerWrapper;
import com.huawei.pluginfitnesssport.OnSensorListenerWrapper;
import com.huawei.pluginfitnesssport.OnSportSkeletonListenerWrapper;
import com.huawei.pluginfitnesssport.OnTrainSkeletonListenerWrapper;

/* JADX INFO: loaded from: classes14.dex */
public class pel extends AppBundlePluginProxy<AiFitnessSportApi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile pel f45239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f45240b;
    private static String d;
    private AiFitnessSportApi e;

    private pel() {
        super("AiFitnessSportProxy", d, f45240b);
        AiFitnessSportApi aiFitnessSportApiCreatePluginApi = createPluginApi();
        this.e = aiFitnessSportApiCreatePluginApi;
        LogUtil.a("AiFitnessSportProxy", "the mAiFitnessSportApi is null : ", Boolean.valueOf(aiFitnessSportApiCreatePluginApi == null));
    }

    public static pel e() {
        pel pelVar;
        if (f45239a == null) {
            synchronized (pel.class) {
                if (f45239a == null) {
                    b();
                    f45239a = new pel();
                }
                pelVar = f45239a;
            }
            return pelVar;
        }
        b();
        return f45239a;
    }

    private static void b() {
        int modelType = pqh.b().getModelType();
        if (modelType == -1) {
            LogUtil.j("AiFitnessSportProxy", "cpu platform unsupported");
            return;
        }
        if (modelType == 2) {
            LogUtil.a("AiFitnessSportProxy", "load PluginAiFitnessSportQua");
            d = "PluginAiFitnessSportQua";
            f45240b = "com.huawei.health.pluginaifitnesssportqua.AiFitnessSportQuaImpl";
        } else {
            if (modelType != 3) {
                return;
            }
            LogUtil.a("AiFitnessSportProxy", "load PluginAiFitnessSportKir");
            d = "PluginAiFitnessSportKir";
            f45240b = "com.huawei.health.pluginaifitnesssportkir.AiFitnessSportKirImpl";
        }
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(AiFitnessSportApi aiFitnessSportApi) {
        this.e = aiFitnessSportApi;
    }

    public void c(final Context context, final int i, final int i2, final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pen
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context2, Intent intent) {
                return this.f45244c.e(baseResponseCallback, context, i, i2, context2, intent);
            }
        });
    }

    /* synthetic */ boolean e(BaseResponseCallback baseResponseCallback, Context context, int i, int i2, Context context2, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "initModel mAiFitnessSportApi==null");
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
            return false;
        }
        if (baseResponseCallback == null) {
            LogUtil.a("AiFitnessSportProxy", "initModel result = ", Integer.valueOf(aiFitnessSportApi.initModel(context, i, i2)));
        } else {
            baseResponseCallback.onResponse(aiFitnessSportApi.initModel(context, i, i2), null);
        }
        return false;
    }

    public void a(final Image image) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pfb
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.e.e(image, context, intent);
            }
        });
    }

    /* synthetic */ boolean e(Image image, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setImage mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setImage(image);
        return false;
    }

    public void b(final OnSportSkeletonListenerWrapper onSportSkeletonListenerWrapper) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: peo
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45245c.a(onSportSkeletonListenerWrapper, context, intent);
            }
        });
    }

    /* synthetic */ boolean a(OnSportSkeletonListenerWrapper onSportSkeletonListenerWrapper, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.a("R_AiFitnessSportProxy", "setSportSkeletonListener mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setSportSkeletonListener(onSportSkeletonListenerWrapper);
        return false;
    }

    public void b(final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: peq
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.e.a(baseResponseCallback, context, intent);
            }
        });
    }

    /* synthetic */ boolean a(BaseResponseCallback baseResponseCallback, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "unloadModel mAiFitnessSportApi == null");
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
            return false;
        }
        if (baseResponseCallback == null) {
            LogUtil.a("AiFitnessSportProxy", "unloadModel result = ", Boolean.valueOf(aiFitnessSportApi.unloadModel()));
        } else {
            baseResponseCallback.onResponse(aiFitnessSportApi.unloadModel() ? 0 : -1, null);
        }
        return false;
    }

    public void c(final int i, final int i2, final int i3, final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: per
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45250b.c(baseResponseCallback, i, i2, i3, context, intent);
            }
        });
    }

    /* synthetic */ boolean c(BaseResponseCallback baseResponseCallback, int i, int i2, int i3, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setModelInfo mAiFitnessSportApi == null");
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
            return false;
        }
        if (baseResponseCallback == null) {
            LogUtil.a("AiFitnessSportProxy", "setModelInfo result = ", Integer.valueOf(aiFitnessSportApi.setModelInfo(i, i2, i3)));
        } else {
            baseResponseCallback.onResponse(aiFitnessSportApi.setModelInfo(i, i2, i3), null);
        }
        return false;
    }

    public void a(final int i, final int i2) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pep
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45246b.c(i, i2, context, intent);
            }
        });
    }

    /* synthetic */ boolean c(int i, int i2, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setCartoonView mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setCartoonView(i, i2);
        return false;
    }

    public void b(final String str, final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pex
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45258b.e(baseResponseCallback, str, context, intent);
            }
        });
    }

    /* synthetic */ boolean e(BaseResponseCallback baseResponseCallback, String str, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setMotionTemplate mAiFitnessSportApi == null");
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
            return false;
        }
        if (baseResponseCallback == null) {
            LogUtil.a("AiFitnessSportProxy", "setMotionTemplate result = ", Integer.valueOf(aiFitnessSportApi.setMotionTemplate(str)));
        } else {
            baseResponseCallback.onResponse(aiFitnessSportApi.setMotionTemplate(str), null);
        }
        return false;
    }

    public void a(final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pev
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45256b.b(baseResponseCallback, context, intent);
            }
        });
    }

    /* synthetic */ boolean b(BaseResponseCallback baseResponseCallback, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setPoseResult mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setPoseResult(baseResponseCallback);
        return false;
    }

    public void a() {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pey
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45260b.c(context, intent);
            }
        });
    }

    /* synthetic */ boolean c(Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setPause mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setPause();
        return false;
    }

    public void d() {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pet
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.e.a(context, intent);
            }
        });
    }

    /* synthetic */ boolean a(Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setResume mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setResume();
        return false;
    }

    public void a(Context context, final OnSensorListenerWrapper onSensorListenerWrapper) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: peu
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context2, Intent intent) {
                return this.f45253a.c(onSensorListenerWrapper, context2, intent);
            }
        });
    }

    /* synthetic */ boolean c(OnSensorListenerWrapper onSensorListenerWrapper, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "registerSensor mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.registerSensor(context, onSensorListenerWrapper);
        return false;
    }

    public void e(Context context) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pek
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context2, Intent intent) {
                return this.f45238a.b(context2, intent);
            }
        });
    }

    /* synthetic */ boolean b(Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "unregisterSensor mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.unregisterSensor(context);
        return false;
    }

    public void b(final OnCheckStandListenerWrapper onCheckStandListenerWrapper) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pes
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.d.d(onCheckStandListenerWrapper, context, intent);
            }
        });
    }

    /* synthetic */ boolean d(OnCheckStandListenerWrapper onCheckStandListenerWrapper, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setCheckStandListener mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setCheckStandListener(onCheckStandListenerWrapper);
        return false;
    }

    public void c(final BaseResponseCallback baseResponseCallback) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pfc
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f45265a.d(baseResponseCallback, context, intent);
            }
        });
    }

    /* synthetic */ boolean d(BaseResponseCallback baseResponseCallback, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "getSportVersion mAiFitnessSportApi == null");
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
            return false;
        }
        if (baseResponseCallback != null) {
            baseResponseCallback.onResponse(0, Integer.valueOf(aiFitnessSportApi.getSportVersion()));
        } else {
            LogUtil.a("AiFitnessSportProxy", "getSportVersion = ", Integer.valueOf(aiFitnessSportApi.getSportVersion()));
        }
        return false;
    }

    public void a(final int i) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pew
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.d.b(i, context, intent);
            }
        });
    }

    /* synthetic */ boolean b(int i, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setType mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setType(i);
        return false;
    }

    public void d(final OnTrainSkeletonListenerWrapper onTrainSkeletonListenerWrapper) {
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pem
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.d.c(onTrainSkeletonListenerWrapper, context, intent);
            }
        });
    }

    /* synthetic */ boolean c(OnTrainSkeletonListenerWrapper onTrainSkeletonListenerWrapper, Context context, Intent intent) {
        AiFitnessSportApi aiFitnessSportApi = this.e;
        if (aiFitnessSportApi == null) {
            LogUtil.j("R_AiFitnessSportProxy", "setTrainSkeletonListener mAiFitnessSportApi == null");
            return false;
        }
        aiFitnessSportApi.setTrainSkeletonListener(onTrainSkeletonListenerWrapper);
        return false;
    }
}
