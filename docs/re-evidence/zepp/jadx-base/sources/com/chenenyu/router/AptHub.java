package com.chenenyu.router;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.apt.Afppg_ui_midongRouteTable;
import com.chenenyu.router.apt.AppRouteTable;
import com.chenenyu.router.apt.BloodOxygenUiRouteTable;
import com.chenenyu.router.apt.Bloodpressure_uiRouteTable;
import com.chenenyu.router.apt.BodyfatRouteTable;
import com.chenenyu.router.apt.CompanionRouteTable;
import com.chenenyu.router.apt.DevicexRouteTable;
import com.chenenyu.router.apt.Ecg_companionRouteTable;
import com.chenenyu.router.apt.HeartrateRouteTable;
import com.chenenyu.router.apt.LibRouteTable;
import com.chenenyu.router.apt.MovingRouteTable;
import com.chenenyu.router.apt.SleepRouteTable;
import com.chenenyu.router.apt.SleepuilibRouteTable;
import com.chenenyu.router.apt.StepRouteTable;
import com.chenenyu.router.apt.TemperatureRouteTable;
import com.chenenyu.router.apt.UilibInterceptorTable;
import com.chenenyu.router.apt.UilibRouteTable;
import com.chenenyu.router.template.ParamInjector;
import com.chenenyu.router.util.RLog;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AptHub {
    private static final String a = "$$Router$$ParamInjector";
    private static Map<String, Class<ParamInjector>> b = new HashMap();
    public static final Map<String, RouteInterceptor> interceptorInstances;
    public static final Map<String, Class<? extends RouteInterceptor>> interceptorTable;
    public static final Map<String, Class<?>> routeTable;
    public static final Map<Class<?>, String[]> targetInterceptorsTable;

    static {
        HashMap map = new HashMap();
        routeTable = map;
        HashMap map2 = new HashMap();
        interceptorTable = map2;
        interceptorInstances = new HashMap();
        targetInterceptorsTable = new LinkedHashMap();
        new BodyfatRouteTable().handle(map);
        new CompanionRouteTable().handle(map);
        new MovingRouteTable().handle(map);
        new LibRouteTable().handle(map);
        new BloodOxygenUiRouteTable().handle(map);
        new SleepRouteTable().handle(map);
        new StepRouteTable().handle(map);
        new Bloodpressure_uiRouteTable().handle(map);
        new Afppg_ui_midongRouteTable().handle(map);
        new HeartrateRouteTable().handle(map);
        new DevicexRouteTable().handle(map);
        new Ecg_companionRouteTable().handle(map);
        new SleepuilibRouteTable().handle(map);
        new UilibRouteTable().handle(map);
        new TemperatureRouteTable().handle(map);
        new AppRouteTable().handle(map);
        new UilibInterceptorTable().handle(map2);
    }

    public static void a(Object obj) {
        Class<?> cls;
        if (!(obj instanceof Activity) && !(obj instanceof Fragment)) {
            RLog.e("The obj you passed must be an instance of Activity or Fragment.");
            return;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        if (b.containsKey(canonicalName)) {
            cls = (Class) b.get(canonicalName);
        } else {
            try {
                cls = Class.forName(canonicalName + a);
                b.put(canonicalName, (Class<ParamInjector>) cls);
            } catch (ClassNotFoundException e) {
                RLog.e("Inject params failed.", e);
                return;
            }
        }
        try {
            ((ParamInjector) cls.newInstance()).inject(obj);
        } catch (Exception e2) {
            RLog.e("Inject params failed.", e2);
        }
    }
}
