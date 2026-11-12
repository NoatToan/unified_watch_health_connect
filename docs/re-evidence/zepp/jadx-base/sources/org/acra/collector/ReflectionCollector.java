package org.acra.collector;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class ReflectionCollector extends BaseReportFieldCollector {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.BUILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.BUILD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReportField.ENVIRONMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReflectionCollector() {
        super(ReportField.BUILD, ReportField.BUILD_CONFIG, ReportField.ENVIRONMENT);
    }

    private static void collectConstants(@NonNull Class<?> cls, @NonNull JSONObject jSONObject) throws JSONException {
        for (Field field : cls.getFields()) {
            try {
                Object obj = field.get(null);
                if (obj != null) {
                    if (field.getType().isArray()) {
                        jSONObject.put(field.getName(), new JSONArray((Collection) Arrays.asList((Object[]) obj)));
                    } else {
                        jSONObject.put(field.getName(), obj);
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
    }

    private void collectStaticGettersResults(@NonNull Class<?> cls, @NonNull JSONObject jSONObject) throws JSONException {
        for (Method method : cls.getMethods()) {
            if (method.getParameterTypes().length == 0 && ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !"getClass".equals(method.getName()))) {
                try {
                    jSONObject.put(method.getName(), method.invoke(null, null));
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                }
            }
        }
    }

    @NonNull
    private Class<?> getBuildConfigClass(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) throws ClassNotFoundException {
        Class<?> clsBuildConfigClass = coreConfiguration.buildConfigClass();
        if (!clsBuildConfigClass.equals(Object.class)) {
            return clsBuildConfigClass;
        }
        return Class.forName(context.getPackageName() + ".BuildConfig");
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws JSONException, ClassNotFoundException {
        JSONObject jSONObject = new JSONObject();
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            collectConstants(Build.class, jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            collectConstants(Build.VERSION.class, jSONObject2);
            jSONObject.put("VERSION", jSONObject2);
        } else if (i == 2) {
            collectConstants(getBuildConfigClass(context, coreConfiguration), jSONObject);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            collectStaticGettersResults(Environment.class, jSONObject);
        }
        crashReportData.put(reportField, jSONObject);
    }
}
