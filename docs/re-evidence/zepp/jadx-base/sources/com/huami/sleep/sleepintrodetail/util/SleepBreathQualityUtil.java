package com.huami.sleep.sleepintrodetail.util;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.sleep.R;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/util/SleepBreathQualityUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "getIntroList", "", "getSectionColor", "", "getSectionValue", "", "a", "F", "BREATH_QUALITY_MAX", "b", "BREATH_QUALITY_MIN", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBreathQualityUtil {

    @NotNull
    public static final SleepBreathQualityUtil INSTANCE = new SleepBreathQualityUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final float BREATH_QUALITY_MAX = 100.0f;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float BREATH_QUALITY_MIN = 60.0f;

    private SleepBreathQualityUtil() {
    }

    @NotNull
    public final List<SleepIntroItemVo> getIntroList(@NotNull Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SleepIntroItemVo(context.getString(R.string.increase_quality_fun1), context.getString(R.string.increase_quality_fun1_desc)));
        arrayList.add(new SleepIntroItemVo(context.getString(R.string.increase_quality_fun2), context.getString(R.string.increase_quality_fun2_desc)));
        arrayList.add(new SleepIntroItemVo(context.getString(R.string.increase_quality_fun3), context.getString(R.string.increase_quality_fun3_desc)));
        arrayList.add(new SleepIntroItemVo(context.getString(R.string.increase_quality_fun4), context.getString(R.string.increase_quality_fun4_desc)));
        return arrayList;
    }

    @NotNull
    public final int[] getSectionColor(@NotNull Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(context, R.color.s33), ContextCompat.getColor(context, R.color.s19)};
    }

    @NotNull
    public final float[] getSectionValue() {
        return new float[]{60.0f, 80.0f, 90.0f, 100.0f};
    }
}
