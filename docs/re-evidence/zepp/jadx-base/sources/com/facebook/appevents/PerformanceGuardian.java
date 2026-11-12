package com.facebook.appevents;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J,\u0010\r\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J:\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00061"}, d2 = {"Lcom/facebook/appevents/PerformanceGuardian;", "", "", "a", "", "activityName", "Lcom/facebook/appevents/PerformanceGuardian$UseCase;", "useCase", "", "isBannedActivity", "", "startTime", "endTime", "limitProcessTime", "", "", "activityExceedLimitCountMap", "", "bannedActivitySet", "c", "previousVersion", "b", "Z", "initialized", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljava/lang/String;", "BANNED_ACTIVITY_STORE", GoogleApiAvailabilityLight.a, "CACHE_APP_VERSION", "e", LogUtil.I, "ACTIVITY_PROCESS_TIME_THRESHOLD", "f", "MAX_EXCEED_LIMIT_COUNT", "g", "Ljava/util/Set;", "bannedSuggestedEventActivitySet", "h", "bannedCodelessActivitySet", "i", "Ljava/util/Map;", "activityProcessTimeMapCodeless", z.j, "activityProcessTimeMapSe", "<init>", "()V", "UseCase", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class PerformanceGuardian {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean initialized = false;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static SharedPreferences sharedPreferences = null;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String BANNED_ACTIVITY_STORE = "com.facebook.internal.BANNED_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CACHE_APP_VERSION = "app_version";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int ACTIVITY_PROCESS_TIME_THRESHOLD = 40;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int MAX_EXCEED_LIMIT_COUNT = 3;

    @NotNull
    public static final PerformanceGuardian INSTANCE = new PerformanceGuardian();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final Set<String> bannedSuggestedEventActivitySet = new HashSet();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final Set<String> bannedCodelessActivitySet = new HashSet();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final Map<String, Integer> activityProcessTimeMapCodeless = new HashMap();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final Map<String, Integer> activityProcessTimeMapSe = new HashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/PerformanceGuardian$UseCase;", "", "<init>", "(Ljava/lang/String;I)V", "CODELESS", "SUGGESTED_EVENT", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum UseCase {
        CODELESS,
        SUGGESTED_EVENT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UseCase.values().length];
            $EnumSwitchMapping$0 = iArr;
            UseCase useCase = UseCase.CODELESS;
            iArr[useCase.ordinal()] = 1;
            UseCase useCase2 = UseCase.SUGGESTED_EVENT;
            iArr[useCase2.ordinal()] = 2;
            int[] iArr2 = new int[UseCase.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[useCase.ordinal()] = 1;
            iArr2[useCase2.ordinal()] = 2;
        }
    }

    private PerformanceGuardian() {
    }

    @JvmStatic
    private static final synchronized void a() {
        if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
            return;
        }
        try {
            if (initialized) {
                return;
            }
            SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(BANNED_ACTIVITY_STORE, 0);
            sharedPreferences = sharedPreferences2;
            if (INSTANCE.b(sharedPreferences2.getString("app_version", ""))) {
                Set<String> set = bannedCodelessActivitySet;
                Set<String> stringSet = sharedPreferences.getStringSet(UseCase.CODELESS.toString(), new LinkedHashSet());
                if (stringSet == null) {
                    stringSet = new LinkedHashSet<>();
                }
                set.addAll(stringSet);
                Set<String> set2 = bannedSuggestedEventActivitySet;
                Set<String> stringSet2 = sharedPreferences.getStringSet(UseCase.SUGGESTED_EVENT.toString(), new LinkedHashSet());
                if (stringSet2 == null) {
                    stringSet2 = new LinkedHashSet<>();
                }
                set2.addAll(stringSet2);
            } else {
                sharedPreferences.edit().clear().apply();
            }
            initialized = true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PerformanceGuardian.class);
        }
    }

    private final boolean b(String previousVersion) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String appVersion = Utility.getAppVersion();
            if (appVersion == null || previousVersion == null) {
                return false;
            }
            if (previousVersion.length() == 0) {
                return false;
            }
            return Intrinsics.areEqual(previousVersion, appVersion);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void c(UseCase useCase, String activityName, Map<String, Integer> activityExceedLimitCountMap, Set<String> bannedActivitySet) {
        Integer num;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int iIntValue = 0;
            if (activityExceedLimitCountMap.containsKey(activityName) && (num = activityExceedLimitCountMap.get(activityName)) != null) {
                iIntValue = num.intValue();
            }
            int i = iIntValue + 1;
            activityExceedLimitCountMap.put(activityName, Integer.valueOf(i));
            if (i >= 3) {
                bannedActivitySet.add(activityName);
                sharedPreferences.edit().putStringSet(useCase.toString(), bannedActivitySet).putString("app_version", Utility.getAppVersion()).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final boolean isBannedActivity(@NotNull String activityName, @Nullable UseCase useCase) {
        if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
            return false;
        }
        try {
            a();
            if (useCase != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[useCase.ordinal()];
                if (i == 1) {
                    return bannedCodelessActivitySet.contains(activityName);
                }
                if (i == 2) {
                    return bannedSuggestedEventActivitySet.contains(activityName);
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PerformanceGuardian.class);
            return false;
        }
    }

    @JvmStatic
    public static final void limitProcessTime(@Nullable String activityName, @Nullable UseCase useCase, long startTime, long endTime) {
        if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
            return;
        }
        try {
            a();
            long j = endTime - startTime;
            if (activityName != null && j >= 40 && useCase != null) {
                int i = WhenMappings.$EnumSwitchMapping$1[useCase.ordinal()];
                if (i == 1) {
                    INSTANCE.c(useCase, activityName, activityProcessTimeMapCodeless, bannedCodelessActivitySet);
                } else {
                    if (i != 2) {
                        return;
                    }
                    INSTANCE.c(useCase, activityName, activityProcessTimeMapSe, bannedSuggestedEventActivitySet);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PerformanceGuardian.class);
        }
    }
}
