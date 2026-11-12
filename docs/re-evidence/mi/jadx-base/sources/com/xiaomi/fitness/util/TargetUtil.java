package com.xiaomi.fitness.util;

import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import defpackage.cdp;
import defpackage.iji;
import defpackage.o8p;
import defpackage.x44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/util/TargetUtil;", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "createUserTarget", "()Ljava/util/List;", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "reportMap", "", "Lcdp;", "createThreeCircleMap", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/widget/TextView;", "txtDetailValue", "", "targetValueStr", "", "displayTargetValueStrRTL", "(Landroid/widget/TextView;Ljava/lang/String;)V", "displayTargetValueStr", "createUserInfoTargetModel", "()Lcdp;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTargetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetUtil.kt\ncom/xiaomi/fitness/util/TargetUtil\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n216#2,2:81\n*S KotlinDebug\n*F\n+ 1 TargetUtil.kt\ncom/xiaomi/fitness/util/TargetUtil\n*L\n25#1:81,2\n*E\n"})
public final class TargetUtil {

    @NotNull
    public static final TargetUtil INSTANCE = new TargetUtil();

    @NotNull
    private static final UserInfoManager userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);

    private TargetUtil() {
    }

    @JvmStatic
    @NotNull
    public static final Map<Long, cdp> createThreeCircleMap(@Nullable Map<Long, DailyGoalReport> reportMap) {
        HashMap map = new HashMap();
        if (reportMap != null && !reportMap.isEmpty()) {
            for (Map.Entry<Long, DailyGoalReport> entry : reportMap.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                map.put(Long.valueOf(jLongValue), RainbowExKt.generateThreeCircleModel(entry.getValue()));
            }
        }
        return map;
    }

    private final List<GoalItem> createUserTarget() {
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(userInfoMgr, false, 1, null);
        ArrayList arrayList = new ArrayList();
        try {
            for (Map.Entry<Integer, Integer> entry : UserProfileExtKt.getRainbowItemGoalMap(userProfile$default).entrySet()) {
                arrayList.add(new GoalItem(entry.getKey().intValue(), entry.getValue().intValue(), 0));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    @JvmStatic
    public static final void displayTargetValueStr(@NotNull TextView txtDetailValue, @NotNull String targetValueStr) {
        Intrinsics.checkNotNullParameter(txtDetailValue, "txtDetailValue");
        Intrinsics.checkNotNullParameter(targetValueStr, "targetValueStr");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) targetValueStr, "/", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            txtDetailValue.setText(targetValueStr);
            return;
        }
        String strSubstring = targetValueStr.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        txtDetailValue.setText(o8p.f(x44.a(iji.z0), targetValueStr, strSubstring));
    }

    @JvmStatic
    public static final void displayTargetValueStrRTL(@NotNull TextView txtDetailValue, @NotNull String targetValueStr) {
        Intrinsics.checkNotNullParameter(txtDetailValue, "txtDetailValue");
        Intrinsics.checkNotNullParameter(targetValueStr, "targetValueStr");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) targetValueStr, "/", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            txtDetailValue.setText(targetValueStr);
            return;
        }
        String strSubstring = targetValueStr.substring(0, iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        txtDetailValue.setText(o8p.f(x44.a(iji.z0), targetValueStr, strSubstring));
    }

    @Nullable
    public final cdp createUserInfoTargetModel() {
        return RainbowExKt.generateThreeCircleModel(new DailyGoalReport(0L, createUserTarget()));
    }
}
