package com.huami.watch.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.tools.analytics.EventBuilders;
import com.huami.tools.analytics.HuamiAnalytics;
import com.huami.tools.analytics.Tracker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Analytics {
    private static final String a = "Analytics";
    private static final String b = "2882303761517458333";
    private static final String c = "5401745821333";
    private static final String d = "Event";
    private static final String e = "39372B947945988B2F751F1C";
    private static final String f = "2B7459B9B7603C138849E0B9";
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i;
    private static WeakReference<Context> j;
    private static boolean k;
    private static String l;

    private static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    private static Tracker b() {
        return HuamiAnalytics.get().getAnonymousTracker();
    }

    public static void config(@NonNull Context context, boolean z, boolean z2) {
        Log.d(a, "Config ON : " + z, new Object[0]);
        if (z == g) {
            return;
        }
        g = z;
        if (z) {
            config(context, true, z2, i, k, l);
        }
    }

    @Deprecated
    public static void endEvent(Context context, String str) {
        endEvent(context, str, null);
    }

    public static void endPage(String str) {
        if (g) {
            if (i) {
                Log.v(a, "End Page : " + str, new Object[0]);
            }
            if (h) {
                b().recordPageEnd(str);
            }
        }
    }

    public static void endSession(Activity activity) {
        if (g) {
            if (i) {
                Log.v(a, "End Session : " + activity, new Object[0]);
            }
            if (h) {
                b().recordPageEnd(activity.getLocalClassName());
            }
        }
    }

    public static void event(Context context, String str) {
        if (g) {
            if (i) {
                Log.v(a, "Event : " + str, new Object[0]);
            }
            if (!TextUtils.isEmpty(str) && h) {
                b().record(new EventBuilders.CountEventBuilder().setId(str).build());
            }
        }
    }

    public static void exception(Context context, String str) {
    }

    public static void exception(Context context, Throwable th) {
    }

    public static void exception(Throwable th) {
        WeakReference<Context> weakReference;
        Context context;
        if (!g || (weakReference = j) == null || (context = weakReference.get()) == null) {
            return;
        }
        exception(context, th);
    }

    @Deprecated
    public static String getMiDeviceId(Context context) {
        return "";
    }

    public static boolean isEnabled() {
        return g;
    }

    @Deprecated
    public static void numericPropertyEvent(String str, long j2) {
    }

    @Deprecated
    public static void propertyEvent(String str, String str2) {
    }

    @Deprecated
    public static void startEvent(Context context, String str) {
        startEvent(context, str, null);
    }

    public static void startPage(String str) {
        if (g) {
            if (i) {
                Log.v(a, "Start Page : " + str, new Object[0]);
            }
            if (h) {
                b().recordPageStart(str);
            }
        }
    }

    public static void startSession(Activity activity) {
        if (g) {
            if (i) {
                Log.v(a, "Start Session : " + activity, new Object[0]);
            }
            if (h) {
                b().recordPageStart(activity.getLocalClassName());
            }
        }
    }

    @Deprecated
    public static void endEvent(Context context, String str, String str2) {
        if (g && i) {
            Log.v(a, "End Event : " + str + ", Value : " + str2, new Object[0]);
        }
    }

    @Deprecated
    public static void startEvent(Context context, String str, String str2) {
        if (g && i) {
            Log.v(a, "Start Event : " + str + ", Value : " + str2, new Object[0]);
        }
    }

    public static void config(@NonNull Context context, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        g = z;
        if (z) {
            h = z2;
            i = z3;
            j = new WeakReference<>(context.getApplicationContext());
            k = z4;
            l = str;
            Log.d(a, "Config ON, Huami ON: " + h + ", Debug : " + z3 + ", CurrentChannel : " + str, new Object[0]);
            if (h) {
                HuamiAnalytics.get().initializeAnonymousTracker(z3 ? f : e, str);
                b().setDebug(z3);
                b().enableAutoTrackPage(z4);
                HuamiAnalytics.get().enable(true);
                Log.d(a, "HuamiAnalytics Uid: " + HuamiAnalytics.getAnonymousId(context), new Object[0]);
                return;
            }
            return;
        }
        Log.d(a, "Config OFF!!", new Object[0]);
    }

    public static void event(Context context, String str, String str2) {
        if (g) {
            if (i) {
                Log.v(a, "Event : " + str + ", Value : " + str2, new Object[0]);
            }
            if (h) {
                b().record(EventBuilders.newCountEventBuilder().setId(str).setValue(str2).build());
            }
        }
    }

    public static void event(Context context, String str, HashMap<String, String> map) {
        if (g) {
            if (i) {
                Log.v(a, "Event : " + str + ", Properties : " + map, new Object[0]);
            }
            if (h) {
                EventBuilders.CountEventBuilder id = EventBuilders.newCountEventBuilder().setId(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    id.addExtra(entry.getKey(), entry.getValue());
                }
                b().record(id.build());
            }
        }
    }

    public static void event(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(str2, str3);
        event(context, str, (HashMap<String, String>) map);
    }

    public static void event(String str) {
        WeakReference<Context> weakReference;
        Context context;
        if (!g || (weakReference = j) == null || (context = weakReference.get()) == null) {
            return;
        }
        event(context, str);
    }

    public static void event(Context context, String str, HashMap<String, String> map, int i2) {
        if (g) {
            if (i) {
                Log.v(a, "Event : " + str + ", Properties : " + map + ", Value : " + i2, new Object[0]);
            }
            if (h) {
                EventBuilders.CalculationEventBuilder value = EventBuilders.newCalculationEventBuilder().setId(str).setValue(i2);
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        value.addExtra(entry.getKey(), entry.getValue());
                    }
                }
                b().record(value.build());
            }
        }
    }

    public static void event(Context context, String str, int i2) {
        event(context, str, (HashMap<String, String>) null, i2);
    }

    public static void event(Context context, String str, String str2, String str3, int i2) {
        HashMap map = new HashMap();
        map.put(str2, str3);
        event(context, str, (HashMap<String, String>) map, i2);
    }
}
