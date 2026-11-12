package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.ICompatCameraControlCallback;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewRootImpl;
import defpackage.az5;
import defpackage.cz5;
import defpackage.dz5;
import defpackage.ebk;
import defpackage.irc;
import defpackage.pgl;
import defpackage.qr5;
import defpackage.rkr;
import defpackage.rr1;
import defpackage.tc8;

/* JADX INFO: loaded from: classes3.dex */
public class AutoDensityConfig extends a {
    private static final String TAG_CONFIG_CHANGE_FRAGMENT = "ConfigurationChangeFragment";
    private static AutoDensityConfig sInstance = null;
    private static boolean sUpdateSystemResources = true;
    private boolean sCanAccessHiddenAPI = false;

    private AutoDensityConfig(final Application application) {
        prepareInApplication(application);
        if (!(application instanceof miuix.app.Application)) {
            application.registerActivityLifecycleCallbacks(new a.b(this));
            application.registerComponentCallbacks(new ComponentCallbacks() { // from class: miuix.autodensity.AutoDensityConfig.2
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            });
        } else {
            miuix.app.Application application2 = (miuix.app.Application) application;
            application2.c(new a.b(this));
            application2.d(new ComponentCallbacks() { // from class: miuix.autodensity.AutoDensityConfig.1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            });
        }
    }

    private void addForOnConfigurationChange(Activity activity) {
        Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
        if (configurationChangeFragment != null) {
            ((ConfigurationChangeFragment) configurationChangeFragment).b(this);
            return;
        }
        ConfigurationChangeFragment configurationChangeFragment2 = new ConfigurationChangeFragment();
        configurationChangeFragment2.b(this);
        activity.getFragmentManager().beginTransaction().add(configurationChangeFragment2, TAG_CONFIG_CHANGE_FRAGMENT).commitAllowingStateLoss();
    }

    private void changeCurrentConfig(Activity activity) {
        try {
            ((Configuration) ebk.j(Activity.class, activity, "mCurrentConfig")).densityDpi = cz5.h().j().d;
            ActivityInfo activityInfo = (ActivityInfo) ebk.j(Activity.class, activity, "mActivityInfo");
            int i = activityInfo.configChanges;
            if ((i & 4096) == 0) {
                activityInfo.configChanges = i | 4096;
                Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
                if (configurationChangeFragment != null) {
                    ((ConfigurationChangeFragment) configurationChangeFragment).a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Context createAutoDensityContextWrapper(Context context) {
        return createAutoDensityContextWrapper(context, 0, 0);
    }

    public static Context createAutoDensityContextWrapperWithBaseDp(Context context, int i) {
        return createAutoDensityContextWrapper(context, 0, i);
    }

    public static void forceUpdateDensity(Context context) {
        if (sInstance != null) {
            dz5.r(context);
        }
    }

    private Fragment getConfigurationChangeFragment(Activity activity) {
        return activity.getFragmentManager().findFragmentByTag(TAG_CONFIG_CHANGE_FRAGMENT);
    }

    public static AutoDensityConfig init(Application application) {
        if (sInstance == null) {
            sInstance = init(application, true);
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isShouldAdaptAutoDensity(Application application) {
        if (application instanceof irc) {
            return ((irc) application).b();
        }
        return true;
    }

    private void removeCurrentConfig(Activity activity) {
        try {
            ebk.r(Activity.class, activity, "mCurrentConfig", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setForceDeviceScale(float f) {
        cz5.h().q(f);
    }

    public static void setForcePPI(int i) {
        cz5.h().r(i);
    }

    public static void setUpdateSystemRes(boolean z) {
        sUpdateSystemResources = z;
        if (z) {
            if (cz5.h().j() == null) {
                return;
            }
            dz5.n(cz5.h().j());
        } else {
            az5 az5VarI = cz5.h().i();
            if (az5VarI == null) {
                return;
            }
            dz5.n(az5VarI);
        }
    }

    @Deprecated
    public static void setUseDeprecatedDensityLogic(boolean z) {
        cz5.h().o(z);
    }

    @Deprecated
    public static void setUseStableDensityLogic(boolean z) {
        cz5.h().p(z);
    }

    public static boolean shouldUpdateSystemResource() {
        return sUpdateSystemResources;
    }

    private void tryToAddActivityConfigCallback(final Activity activity) {
        View viewPeekDecorView;
        if (!this.sCanAccessHiddenAPI || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: miuix.autodensity.AutoDensityConfig.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                try {
                    Object objO = ebk.o(View.class, view, "getViewRootImpl", new Class[0], new Object[0]);
                    final Object objJ = ebk.j(ViewRootImpl.class, objO, "mActivityConfigCallback");
                    ebk.o(ViewRootImpl.class, objO, "setActivityConfigCallback", new Class[]{ViewRootImpl.ActivityConfigCallback.class}, new ViewRootImpl.ActivityConfigCallback() { // from class: miuix.autodensity.AutoDensityConfig.3.1
                        public void onConfigurationChanged(Configuration configuration, int i) {
                            try {
                                ebk.o(ViewRootImpl.ActivityConfigCallback.class, objJ, "onConfigurationChanged", new Class[]{Configuration.class, Integer.TYPE}, configuration, Integer.valueOf(i));
                                boolean zIsShouldAdaptAutoDensity = AutoDensityConfig.isShouldAdaptAutoDensity(activity.getApplication());
                                ComponentCallbacks2 componentCallbacks2 = activity;
                                if (componentCallbacks2 instanceof irc) {
                                    zIsShouldAdaptAutoDensity = ((irc) componentCallbacks2).b();
                                }
                                if (zIsShouldAdaptAutoDensity) {
                                    dz5.r(activity);
                                }
                            } catch (Exception unused) {
                            }
                        }

                        public void requestCompatCameraControl(boolean z, boolean z2, ICompatCameraControlCallback iCompatCameraControlCallback) {
                        }
                    });
                } catch (Exception unused) {
                }
                view.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        };
        viewPeekDecorView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.mModifier.get(Integer.valueOf(activity.hashCode())).addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void updateDensity(Context context) {
        Application application;
        boolean z;
        boolean zIsShouldAdaptAutoDensity;
        if (sInstance == null) {
            return;
        }
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        if (!(context instanceof Activity)) {
            if (!(context instanceof Application)) {
                if (!(context instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context;
                while (true) {
                    if (!(contextWrapper.getBaseContext() instanceof ContextWrapper)) {
                        application = null;
                        break;
                    }
                    contextWrapper = (ContextWrapper) contextWrapper.getBaseContext();
                    if (contextWrapper instanceof Activity) {
                        context = (Activity) contextWrapper;
                        application = null;
                        r1 = context;
                        break;
                    } else if (contextWrapper instanceof Application) {
                        application = (Application) contextWrapper;
                        break;
                    }
                }
            } else {
                application = (Application) context;
            }
        } else {
            r1 = (Activity) context;
            application = null;
        }
        if (r1 != 0) {
            zIsShouldAdaptAutoDensity = isShouldAdaptAutoDensity(r1.getApplication());
            if (r1 instanceof irc) {
                boolean zB = ((irc) r1).b();
                z = zIsShouldAdaptAutoDensity;
                zIsShouldAdaptAutoDensity = zB;
            } else {
                z = zIsShouldAdaptAutoDensity;
            }
        } else {
            z = false;
            zIsShouldAdaptAutoDensity = application != null ? isShouldAdaptAutoDensity(application) : false;
        }
        if (zIsShouldAdaptAutoDensity) {
            forceUpdateDensity(context);
        } else if (z) {
            dz5.k(context);
        }
    }

    public static boolean updateDensityByConfig(Context context, Configuration configuration) {
        AutoDensityConfig autoDensityConfig = sInstance;
        if (autoDensityConfig == null || context == null) {
            return false;
        }
        return autoDensityConfig.updateDensityOnConfigChanged(context, configuration);
    }

    public static Configuration updateDensityOverrideConfiguration(Context context, Configuration configuration) {
        Configuration configurationH = dz5.h(context);
        if (configurationH != null) {
            tc8.t(context);
        } else {
            configurationH = configuration;
        }
        if (!dz5.p(configurationH)) {
            return configuration;
        }
        Configuration configuration2 = new Configuration(configurationH);
        dz5.t(context, configuration2);
        return configuration2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.a
    public boolean isEnableProcessInActivity(Activity activity) {
        boolean zB = false;
        try {
            if (activity instanceof irc) {
                zB = ((irc) activity).b();
            } else if (activity.getApplication() instanceof irc) {
                zB = ((irc) activity.getApplication()).b();
            }
        } catch (Exception unused) {
        }
        return zB;
    }

    @Override // miuix.autodensity.a
    public void onDensityChangedOnActivityCreated(Activity activity) {
        super.onDensityChangedOnActivityCreated(activity);
        addForOnConfigurationChange(activity);
    }

    @Override // miuix.autodensity.a
    public void onRegisterDensityCallback(Object obj) {
        qr5.d("registerCallback obj: " + obj);
    }

    @Override // miuix.autodensity.a
    public void prepareInApplication(Application application) {
        try {
            this.sCanAccessHiddenAPI = ((Boolean) ebk.o(ApplicationInfo.class, application.getApplicationInfo(), "isAllowedToUseHiddenApis", new Class[0], new Object[0])).booleanValue();
        } catch (Exception unused) {
        }
        qr5.b();
        cz5.h().k(application);
        if (isShouldAdaptAutoDensity(application)) {
            dz5.r(application);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.a
    public void processBeforeActivityConfigChanged(Activity activity, Configuration configuration) {
        qr5.d("->processBeforeActivityConfigChanged");
        boolean zIsShouldAdaptAutoDensity = isShouldAdaptAutoDensity(activity.getApplication());
        if (activity instanceof irc ? ((irc) activity).b() : zIsShouldAdaptAutoDensity) {
            dz5.r(activity);
            rkr rkrVarI = tc8.i(activity);
            onDensityChangedBeforeActivityConfigChanged(activity, configuration, rkrVarI);
            if (!pgl.c(rkrVarI.g)) {
                pgl.b(rkrVarI.g);
            }
            if (Build.VERSION.SDK_INT <= 31) {
                removeCurrentConfig(activity);
                return;
            } else {
                changeCurrentConfig(activity);
                return;
            }
        }
        if (zIsShouldAdaptAutoDensity) {
            boolean zK = dz5.k(activity);
            rkr rkrVarI2 = tc8.i(activity);
            onDensityChangedBeforeActivityConfigChanged(activity, configuration, rkrVarI2);
            if (zK) {
                if (!pgl.c(rkrVarI2.g)) {
                    pgl.b(rkrVarI2.g);
                }
                if (Build.VERSION.SDK_INT <= 31) {
                    removeCurrentConfig(activity);
                } else {
                    changeCurrentConfig(activity);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.a
    public void processOnActivityCreated(Activity activity) {
        qr5.d("->processOnActivityCreated");
        boolean zIsShouldAdaptAutoDensity = isShouldAdaptAutoDensity(activity.getApplication());
        boolean zB = activity instanceof irc ? ((irc) activity).b() : zIsShouldAdaptAutoDensity;
        updateApplicationDensity(activity.getApplication());
        if (zB) {
            dz5.r(activity);
            onDensityChangedOnActivityCreated(activity);
        } else if (zIsShouldAdaptAutoDensity) {
            dz5.k(activity);
            onDensityChangedOnActivityCreated(activity);
        }
    }

    @Override // miuix.autodensity.a
    public void processOnActivityDestroyed(Activity activity) {
        unregisterCallback(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.a
    public void processOnActivityDisplayChanged(int i, Activity activity) {
        qr5.d("->onDisplayChanged displayId: " + i + " config " + activity.getResources().getConfiguration() + "\n activity: " + activity);
        boolean zIsShouldAdaptAutoDensity = isShouldAdaptAutoDensity(activity.getApplication());
        if (activity instanceof irc ? ((irc) activity).b() : zIsShouldAdaptAutoDensity) {
            dz5.r(activity);
            onDensityChangedOnActivityDisplayChanged(i, activity);
        } else if (zIsShouldAdaptAutoDensity) {
            dz5.k(activity);
            onDensityChangedOnActivityDisplayChanged(i, activity);
        }
    }

    @Override // miuix.autodensity.a
    public void processOnAppConfigChanged(Application application, Configuration configuration) {
        qr5.d("->processOnAppConfigChanged");
        cz5.h().s(application, configuration);
        if (isShouldAdaptAutoDensity(application)) {
            dz5.r(application);
            onDensityChangedOnAppConfigChanged(application);
            configuration.densityDpi = cz5.h().j().d;
        }
    }

    @Override // miuix.autodensity.a
    public void registerCallback(Activity activity) {
        super.registerCallback(activity);
        tryToAddActivityConfigCallback(activity);
    }

    public void updateApplicationDensity(Application application) {
        if (Build.VERSION.SDK_INT == 29 && isShouldAdaptAutoDensity(application)) {
            dz5.r(application);
        }
    }

    public boolean updateDensityOnConfigChanged(Context context, Configuration configuration) {
        boolean zS = cz5.h().s(context, configuration);
        if (context instanceof Activity) {
            Application application = ((Activity) context).getApplication();
            if (isShouldAdaptAutoDensity(application)) {
                updateApplicationDensity(application);
            }
        }
        updateDensity(context);
        return zS;
    }

    public static Context createAutoDensityContextWrapper(Context context, int i) {
        return createAutoDensityContextWrapper(context, i, 0);
    }

    public static Context createAutoDensityContextWrapper(Context context, int i, int i2) {
        Configuration configuration = context.getResources().getConfiguration();
        Configuration configuration2 = new Configuration(configuration);
        if (cz5.h().j() == null) {
            cz5.h().k(context);
        }
        rr1 rr1Var = new rr1(context, i);
        cz5.h().t(context, configuration);
        rr1Var.d(configuration2);
        dz5.s(rr1Var, i2);
        return rr1Var;
    }

    public static AutoDensityConfig init(Application application, boolean z) {
        if (sInstance == null) {
            sUpdateSystemResources = z;
            sInstance = new AutoDensityConfig(application);
        }
        return sInstance;
    }
}
