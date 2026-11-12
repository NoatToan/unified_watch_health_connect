package com.xiaomi.hm.health.running.calori;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.ext.TimeEx;
import com.loc.z;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J#\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CalorieHelper;", "", "", "isMale", "", "age", "weight", "height", "", "a", "", "timeStamp", "minute", "b", "(Ljava/lang/Long;I)I", "currentTime", "getRestCalByUser", "F", "COEFFICIENT_AGE", LogUtil.I, "DEFAULT_AGE", "c", "MAX_AGE", GoogleApiAvailabilityLight.a, "COEFFICIENT_HEIGHT", "e", "COEFFICIENT_WEIGHT", "f", "MAX_WEIGHT", "g", "DEFAULT_WEIGHT", "h", "COEFFICIENT_MALE", "i", "COEFFICIENT_FEMALE", z.j, "J", "MINUTE_COUNT", hl.k, "DAY_COUNT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CalorieHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final float COEFFICIENT_AGE = 5.0f;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DEFAULT_AGE = 25;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MAX_AGE = 100;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float COEFFICIENT_HEIGHT = 6.25f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int COEFFICIENT_WEIGHT = 10;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int MAX_WEIGHT = 200;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int DEFAULT_WEIGHT = 65;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int COEFFICIENT_MALE = 5;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int COEFFICIENT_FEMALE = 161;

    @NotNull
    public static final CalorieHelper INSTANCE = new CalorieHelper();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static long MINUTE_COUNT = TimeUnit.MINUTES.toSeconds(1);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static long DAY_COUNT = TimeUnit.DAYS.toMinutes(1);

    private CalorieHelper() {
    }

    private final float a(boolean isMale, int age, int weight, int height) {
        float f;
        long j;
        if (height == 0) {
            return 65.0f / MINUTE_COUNT;
        }
        boolean z = false;
        if (!(1 <= age && age <= 100)) {
            age = 25;
        }
        if (1 <= weight && weight <= 200) {
            z = true;
        }
        if (!z) {
            weight = 65;
        }
        if (isMale) {
            f = (((weight * 10) + (height * COEFFICIENT_HEIGHT)) - (age * 5.0f)) + 5;
            j = DAY_COUNT;
        } else {
            f = (((weight * 10) + (height * COEFFICIENT_HEIGHT)) - (age * 5.0f)) - 161;
            j = DAY_COUNT;
        }
        float f2 = f / j;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    private final int b(Long timeStamp, int minute) {
        if (timeStamp == null) {
            return 0;
        }
        long jLongValue = timeStamp.longValue();
        return (int) ((jLongValue - TimeEx.INSTANCE.getDayStartTime(jLongValue)) / TimeUnit.MINUTES.toMillis(minute));
    }

    public static /* synthetic */ int c(CalorieHelper calorieHelper, Long l, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return calorieHelper.b(l, i);
    }

    public final int getRestCalByUser(long currentTime) {
        float fFloatValue;
        try {
            Result.Companion companion = Result.Companion;
            HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
            boolean z = true;
            if (userInfo.getGender() != 1) {
                z = false;
            }
            CalorieHelper calorieHelper = INSTANCE;
            fFloatValue = c(calorieHelper, Long.valueOf(currentTime), 0, 2, null) * calorieHelper.a(z, userInfo.getAge(), (int) userInfo.getWeight(), userInfo.getHeight());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Float fValueOf = Float.valueOf(65.0f / MINUTE_COUNT);
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = fValueOf;
            }
            fFloatValue = ((Number) objM3845constructorimpl).floatValue();
        }
        return (int) fFloatValue;
    }
}
