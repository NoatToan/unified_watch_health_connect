package ohos.ace.plugin.vibratorplugin;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class VibratorPlugin {
    private static final int API_31 = 31;
    private static final int DEFAULT_VIBRATOR_ID = 0;
    private static final int EFFECT_CLICK_DURATION = 100;
    private static final int EFFECT_HEAVY_DURATION = 200;
    private static final int EFFECT_TICK_DURATION = 50;
    private static final int HAPTIC_CLOCK_TIMER_AMPLITUDE = 204;
    private static final long HAPTIC_CLOCK_TIMER_DURATION = 300;
    private static final int HAPTIC_EFFECT_HARD_AMPLITUDE = 80;
    private static final long HAPTIC_EFFECT_HARD_DURATION = 50;
    private static final int HAPTIC_EFFECT_SHARP_AMPLITUDE = 50;
    private static final long HAPTIC_EFFECT_SHARP_DURATION = 20;
    private static final int HAPTIC_EFFECT_SOFT_AMPLITUDE = 10;
    private static final long HAPTIC_EFFECT_SOFT_DURATION = 10;
    private static final int HAPTIC_NOTICE_FAIL_OR_WARNING_AMPLITUDE = 255;
    private static final int HAPTIC_NOTICE_SUCCESS_AMPLITUDE = 204;
    private static final long HAPTIC_NOTICE_SUCCESS_OR_FAIL_DURATION = 400;
    private static final long HAPTIC_NOTICE_WARNING_DURATION = 500;
    private static final int HAPTIC_OTHER_AMPLITUDE = 0;
    private static final long HAPTIC_OTHER_DURATION = 0;
    private static final int IS_NOT_SUPPORTED = 801;
    private static final String KEY_LANGUAGE = "app_language";
    private static final String LANGUAGE_SHARE_PREFERENCE = "language_prefs";
    private static final String LOG_TAG = "VibratorPlugin";
    private static final int PARAMETER_ERROR = 401;
    private static final int PERMISSION_DENIED = 201;
    private static final int REQUEST_VIBRATE_PERMISSION = 1001;
    private static final int VIBRATE_SUCCESS = 0;
    private AudioManager mAudioManager;
    private Context mContext;
    private VibrateMode mMode = VibrateMode.DEFAULT;
    private NotificationManager mNotificationManager;
    private Vibrator mVibrator;
    private Object mVibratorManager;

    public enum VibrateMode {
        TIME,
        PRESET,
        PATTERN,
        DEFAULT
    }

    private native void nativeGetEffectInfo(int i, boolean z);

    private native void nativeGetMultiVibratorInfo(List<List<Object>> list);

    protected native void nativeInit();

    public enum VibratorUsage {
        USAGE_UNKNOWN(0),
        USAGE_ALARM(1),
        USAGE_RING(2),
        USAGE_NOTIFICATION(3),
        USAGE_COMMUNICATION(4),
        USAGE_TOUCH(5),
        USAGE_MEDIA(6),
        USAGE_PHYSICAL_FEEDBACK(7),
        USAGE_SIMULATE_REALITY(8),
        USAGE_MAX(9);

        private final int value;

        VibratorUsage(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static VibratorUsage fromInt(int i) {
            for (VibratorUsage vibratorUsage : values()) {
                if (vibratorUsage.value == i) {
                    return vibratorUsage;
                }
            }
            return USAGE_UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: ohos.ace.plugin.vibratorplugin.VibratorPlugin$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage;

        static {
            int[] iArr = new int[VibratorUsage.values().length];
            $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage = iArr;
            try {
                iArr[VibratorUsage.USAGE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_ALARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_RING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_COMMUNICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_TOUCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_MEDIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_PHYSICAL_FEEDBACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[VibratorUsage.USAGE_SIMULATE_REALITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static boolean isSupportedVibrate(boolean z, boolean z2, VibratorUsage vibratorUsage) {
        if (z && z2) {
            switch (AnonymousClass1.$SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[vibratorUsage.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return true;
                default:
                    return false;
            }
        }
        int i = AnonymousClass1.$SwitchMap$ohos$ace$plugin$vibratorplugin$VibratorPlugin$VibratorUsage[vibratorUsage.ordinal()];
        if (i != 1) {
            switch (i) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public void getVibratorService() {
        this.mVibrator = (Vibrator) this.mContext.getSystemService("vibrator");
    }

    public VibratorPlugin(Context context) {
        this.mContext = context;
        init();
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Class<?> cls = Class.forName("android.os.VibratorManager");
                Log.i(LOG_TAG, "vibratorManagerClass Type: " + cls.getName());
                this.mVibratorManager = Context.class.getMethod("getSystemService", Class.class).invoke(this.mContext, cls);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                Log.e(LOG_TAG, "VibratorManager init failed: " + e.getMessage());
                this.mVibratorManager = null;
            }
        }
    }

    public boolean isHapticFeedbackEnabled() {
        NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService(RemoteMessageConst.NOTIFICATION);
        this.mNotificationManager = notificationManager;
        if (notificationManager == null) {
            return true;
        }
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        return (currentInterruptionFilter == 3 || currentInterruptionFilter == 2 || currentInterruptionFilter == 0) ? false : true;
    }

    public boolean getVibrationMode() {
        AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        this.mAudioManager = audioManager;
        return audioManager == null || audioManager.getRingerMode() != 0;
    }

    public int vibrate(long j, int i) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "vibrate: Vibration permission not granted");
            return 201;
        }
        if (this.mVibrator == null) {
            Log.w(LOG_TAG, "vibrate: init Vibrator service");
            getVibratorService();
        }
        if (!this.mVibrator.hasVibrator()) {
            Log.e(LOG_TAG, "vibrate: Device does not have a vibrator");
            return 801;
        }
        try {
            if (isSupportedVibrate(isHapticFeedbackEnabled(), getVibrationMode(), VibratorUsage.fromInt(i))) {
                VibrationEffect vibrationEffectCreateOneShot = VibrationEffect.createOneShot(j, -1);
                this.mMode = VibrateMode.TIME;
                this.mVibrator.vibrate(vibrationEffectCreateOneShot);
                return 0;
            }
            Log.e(LOG_TAG, "vibrate: Vibrator is error");
            return 801;
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "vibrate: Local vibration failed: " + e.getMessage());
            return 801;
        }
    }

    public int playVibratorEffect(String str, int i, int i2) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "vibrate: Vibration permission not granted");
            return 201;
        }
        if (this.mVibrator == null) {
            Log.i(LOG_TAG, "vibrate: init Vibrator service");
            getVibratorService();
        }
        if (!this.mVibrator.hasVibrator()) {
            Log.e(LOG_TAG, "vibrate: Device does not have a vibrator");
            return 801;
        }
        try {
            if (!isSupportedEffect(str)) {
                return 801;
            }
            int amplitude = getAmplitude(str);
            long duration = getDuration(str);
            if (str.equals("haptic.notice.success") || str.equals("haptic.notice.fail")) {
                i *= 2;
                duration /= 2;
            }
            if (str.equals("haptic.notice.warning")) {
                i *= 3;
                duration /= 3;
            }
            int i3 = i * 2;
            long[] jArr = new long[i3];
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4 += 2) {
                jArr[i4] = duration;
                iArr[i4] = amplitude;
                int i5 = i4 + 1;
                jArr[i5] = duration;
                iArr[i5] = 0;
            }
            VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
            this.mMode = VibrateMode.PRESET;
            this.mVibrator.vibrate(vibrationEffectCreateWaveform);
            Log.i(LOG_TAG, "playVibratorEffect: Vibrator is success");
            return 0;
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "SecurityException when playVibratorEffect: " + e.getMessage());
            return 801;
        }
    }

    public int stopVibrator(int i) {
        Object objInvoke;
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "stopVibrator: Vibration permission not granted");
            return 201;
        }
        if (this.mVibrator == null) {
            Log.i(LOG_TAG, "vibrate: init Vibrator service");
            getVibratorService();
        }
        if (!this.mVibrator.hasVibrator()) {
            Log.e(LOG_TAG, "vibrate: Device does not have a vibrator");
            return 801;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                Class<?> cls = Class.forName("android.os.VibratorManager");
                Log.i(LOG_TAG, "mVibratorManager Type: " + cls.getName());
                Method method = cls.getMethod("getVibrator", Integer.TYPE);
                if (method != null && (objInvoke = method.invoke(this.mVibratorManager, Integer.valueOf(i))) != null && (objInvoke instanceof Vibrator)) {
                    Vibrator vibrator = (Vibrator) objInvoke;
                    if (vibrator != null) {
                        vibrator.cancel();
                    }
                    this.mVibrator.cancel();
                }
                return 801;
            }
            this.mVibrator.cancel();
            Log.i(LOG_TAG, " stopVibrator: is success");
            return 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.e(LOG_TAG, "stopVibrator: SecurityException when stopping vibrator: " + e.getMessage());
            return 801;
        }
    }

    public int stopVibratorByMode(String str) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "vibrate: Vibration permission not granted");
            return 201;
        }
        String strTrim = str.toLowerCase(Locale.ROOT).trim();
        if ((!strTrim.equals("time") || this.mMode != VibrateMode.TIME) && ((!strTrim.equals("preset") || this.mMode != VibrateMode.PRESET) && (!strTrim.equals("pattern") || this.mMode != VibrateMode.PATTERN))) {
            return 0;
        }
        this.mMode = VibrateMode.DEFAULT;
        return stopVibrator(0);
    }

    public int isSupportEffect(String str, boolean[] zArr) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "vibrate: Vibration permission not granted");
            return 201;
        }
        if (this.mVibrator == null) {
            Log.i(LOG_TAG, "vibrate: init Vibrator service");
            getVibratorService();
        }
        if (!this.mVibrator.hasVibrator()) {
            Log.e(LOG_TAG, "vibrate: Device does not have a vibrator");
            return 801;
        }
        zArr[0] = isSupportedEffect(str);
        return 0;
    }

    public int playPattern(long[] jArr, int[] iArr, int i, int i2) {
        VibrationEffect vibrationEffectCreateWaveform;
        Log.i(LOG_TAG, "Java playPattern");
        if (this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0) {
            Log.e(LOG_TAG, "vibrate: Vibration permission not granted");
            return 201;
        }
        if (this.mVibrator == null) {
            Log.i(LOG_TAG, "vibrate: init Vibrator service");
            getVibratorService();
        }
        if (!this.mVibrator.hasVibrator()) {
            Log.e(LOG_TAG, "vibrate: Device does not have a vibrator");
            return 801;
        }
        try {
            if (isSupportedVibrate(isHapticFeedbackEnabled(), getVibrationMode(), VibratorUsage.fromInt(i2))) {
                if (iArr != null) {
                    vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, iArr, i);
                } else {
                    vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, i);
                }
                this.mVibrator.vibrate(vibrationEffectCreateWaveform);
                this.mMode = VibrateMode.PATTERN;
                return 0;
            }
            Log.e(LOG_TAG, "playPattern: playPattern is error");
            return 801;
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "SecurityException when playPattern: " + e.getMessage());
            return 801;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    public int getVibratorList() {
        int i;
        if (this.mVibrator == null) {
            return 801;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Method method = Class.forName("android.os.VibratorManager").getMethod("getVibratorIds", new Class[0]);
                if (method == null) {
                    return 801;
                }
                int[] iArr = (int[]) method.invoke(this.mVibratorManager, new Object[0]);
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                Log.e(LOG_TAG, "getVibratorList: Exception when stopping vibrator: " + e.getMessage());
                return 801;
            }
        } else {
            i = -1;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(-1);
        arrayList2.add(Integer.valueOf(i));
        arrayList2.add("");
        arrayList2.add(true);
        arrayList2.add(true);
        arrayList2.add(0);
        arrayList.add(arrayList2);
        nativeGetMultiVibratorInfo(arrayList);
        return 0;
    }

    public int getEffectInfo(String str) {
        Vibrator vibrator = this.mVibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return 801;
        }
        nativeGetEffectInfo((int) getDuration(str), isSupportedEffect(str));
        return 0;
    }

    public boolean getVibratorCapacity() {
        Log.i(LOG_TAG, "Java getVibratorCapacity");
        Vibrator vibrator = this.mVibrator;
        return vibrator != null && vibrator.hasVibrator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public static long getDuration(String str) {
        str.hashCode();
        switch (str) {
            case "haptic.notice.success":
            case "haptic.notice.fail":
                return 400L;
            case "haptic.clock.timer":
                return 300L;
            case "haptic.effect.sharp":
                return 20L;
            case "haptic.notice.warning":
                return 500L;
            case "haptic.effect.hard":
                return HAPTIC_EFFECT_HARD_DURATION;
            case "haptic.effect.soft":
                return 10L;
            default:
                return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    public static boolean isSupportedEffect(String str) {
        str.hashCode();
        switch (str) {
            case "haptic.notice.success":
            case "haptic.clock.timer":
            case "haptic.notice.fail":
            case "haptic.effect.sharp":
            case "haptic.notice.warning":
            case "haptic.effect.hard":
            case "haptic.effect.soft":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    public static int getAmplitude(String str) {
        str.hashCode();
        switch (str) {
            case "haptic.notice.success":
            case "haptic.clock.timer":
                return 204;
            case "haptic.notice.fail":
            case "haptic.notice.warning":
                return 255;
            case "haptic.effect.sharp":
                return 50;
            case "haptic.effect.hard":
                return 80;
            case "haptic.effect.soft":
                return 10;
            default:
                return 0;
        }
    }

    private Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            if (obj != null && (obj instanceof Map)) {
                Iterator it = ((Map) obj).values().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    Class<?> cls2 = next.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (declaredField2.getBoolean(next)) {
                        return null;
                    }
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    Object obj2 = declaredField3.get(next);
                    if (obj2 != null && (obj2 instanceof Activity)) {
                        return (Activity) obj2;
                    }
                }
                return null;
            }
            return null;
        } catch (ClassNotFoundException e) {
            Log.e(LOG_TAG, "getActivity failed: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            Log.e(LOG_TAG, "getActivity failed: " + e2.getMessage());
        } catch (NoSuchFieldException e3) {
            Log.e(LOG_TAG, "getActivity failed: " + e3.getMessage());
        } catch (NoSuchMethodException e4) {
            Log.e(LOG_TAG, "getActivity failed: " + e4.getMessage());
        } catch (InvocationTargetException e5) {
            Log.e(LOG_TAG, "getActivity failed: " + e5.getMessage());
        }
    }

    private void init() {
        nativeInit();
    }
}
