package org.acra.collector;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class SettingsCollector extends BaseReportFieldCollector {
    private static final String ERROR = "Error: ";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.SETTINGS_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.SETTINGS_SECURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReportField.SETTINGS_GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SettingsCollector() {
        super(ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, ReportField.SETTINGS_GLOBAL);
    }

    @NonNull
    private JSONObject collectSettings(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull Class<?> cls) throws NoSuchMethodException {
        JSONObject jSONObject = new JSONObject();
        Field[] fields = cls.getFields();
        Method method = cls.getMethod("getString", ContentResolver.class, String.class);
        for (Field field : fields) {
            if (!field.isAnnotationPresent(Deprecated.class) && field.getType() == String.class && isAuthorized(coreConfiguration, field)) {
                try {
                    Object objInvoke = method.invoke(null, context.getContentResolver(), field.get(null));
                    if (objInvoke != null) {
                        jSONObject.put(field.getName(), objInvoke);
                    }
                } catch (Exception e) {
                    ACRA.log.w(ACRA.LOG_TAG, ERROR, e);
                }
            }
        }
        return jSONObject;
    }

    private boolean isAuthorized(@NonNull CoreConfiguration coreConfiguration, @Nullable Field field) {
        if (field == null || field.getName().startsWith("WIFI_AP")) {
            return false;
        }
        Iterator<String> it2 = coreConfiguration.excludeMatchingSettingsKeys().iterator();
        while (it2.hasNext()) {
            if (field.getName().matches(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws Exception {
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            crashReportData.put(ReportField.SETTINGS_SYSTEM, collectSettings(context, coreConfiguration, Settings.System.class));
        } else if (i == 2) {
            crashReportData.put(ReportField.SETTINGS_SECURE, collectSettings(context, coreConfiguration, Settings.Secure.class));
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            crashReportData.put(ReportField.SETTINGS_GLOBAL, Build.VERSION.SDK_INT >= 17 ? collectSettings(context, coreConfiguration, Settings.Global.class) : null);
        }
    }
}
