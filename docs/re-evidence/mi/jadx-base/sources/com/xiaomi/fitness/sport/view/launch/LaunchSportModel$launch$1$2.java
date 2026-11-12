package com.xiaomi.fitness.sport.view.launch;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel$launch$1$2;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import defpackage.zr3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport/view/launch/LaunchSportModel$launch$1$2", "Lzr3;", "Landroid/app/ActivityOptions;", "activityOptions", "", "onCardZoomTriggered", "(Landroid/app/ActivityOptions;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LaunchSportModel$launch$1$2 extends zr3 {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Bundle $bundle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchSportModel$launch$1$2(FragmentActivity fragmentActivity, View view, Bundle bundle) {
        super(fragmentActivity, view, null);
        this.$activity = fragmentActivity;
        this.$bundle = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCardZoomTriggered$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    @Override // defpackage.zr3
    public void onCardZoomTriggered(ActivityOptions activityOptions) {
        FragmentActivity fragmentActivity = this.$activity;
        final Bundle bundle = this.$bundle;
        LaunchExtensionKt.startActivity(fragmentActivity, CommonSportActivity.class, activityOptions, new Function1() { // from class: u4e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchSportModel$launch$1$2.onCardZoomTriggered$lambda$0(bundle, (Intent) obj);
            }
        });
    }
}
