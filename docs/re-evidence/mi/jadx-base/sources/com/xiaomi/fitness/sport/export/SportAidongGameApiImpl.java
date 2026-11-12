package com.xiaomi.fitness.sport.export;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.sport_export.SportAidongGameApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/export/SportAidongGameApiImpl;", "Lcom/xiaomi/fitness/sport_export/SportAidongGameApi;", "<init>", "()V", "doAllNecessaryCheckAndGoToAidongSdkIfNeed", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportAidongGameApiImpl implements SportAidongGameApi {

    @NotNull
    public static final String TAG = "SportAidongGameApiImpl";

    @Override // com.xiaomi.fitness.sport_export.SportAidongGameApi
    public void doAllNecessaryCheckAndGoToAidongSdkIfNeed(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$default(null, activity, null, 5, null);
    }
}
