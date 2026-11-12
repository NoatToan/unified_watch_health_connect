package com.huami.sleep.sleephome.promotion;

import android.content.Context;
import android.util.TypedValue;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "", Constant.PAI_KEY_DAILY_PAI, "a", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class SleepPromotionManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
