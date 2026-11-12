package com.xiaomi.fitness.sport_eco_manager_export;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.kb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a&\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"INDOOR_RIDING_SPORTING", "", "INDOOR_SPORTING", "JUMP_SPORTING", "GYM_LAUNCH", "GYM_COURSE_INFO", "startLaunchGymActivity", "", "context", "Landroid/content/Context;", "action", "extras", "Landroid/os/Bundle;", "startIndoorSportActivity", "startIndoorRidingSportActivity", "startJumpSportingSportActivity", "sport-eco-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportRouterKt {

    @NotNull
    public static final String GYM_COURSE_INFO = "/course/activity/CourseInfoActivity";

    @NotNull
    public static final String GYM_LAUNCH = "/sport_eco/activity/launch_gym";

    @NotNull
    public static final String INDOOR_RIDING_SPORTING = "/sport_eco/activity/indoor_riding_sport";

    @NotNull
    public static final String INDOOR_SPORTING = "/sport_eco/activity/indoor_sport";

    @NotNull
    public static final String JUMP_SPORTING = "/sport_eco/activity/jump_sport";

    public static final void startIndoorRidingSportActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(INDOOR_RIDING_SPORTING).withAction(str).with(bundle).withFlags(context instanceof Activity ? 67108864 : 335577088).navigation(context);
    }

    public static /* synthetic */ void startIndoorRidingSportActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startIndoorRidingSportActivity(context, str, bundle);
    }

    public static final void startIndoorSportActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(INDOOR_SPORTING).withAction(str).with(bundle).withFlags(context instanceof Activity ? 67108864 : 335577088).navigation(context);
    }

    public static /* synthetic */ void startIndoorSportActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startIndoorSportActivity(context, str, bundle);
    }

    public static final void startJumpSportingSportActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(JUMP_SPORTING).withAction(str).with(bundle).withFlags(context instanceof Activity ? 67108864 : 335577088).navigation(context);
    }

    public static /* synthetic */ void startJumpSportingSportActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startJumpSportingSportActivity(context, str, bundle);
    }

    public static final void startLaunchGymActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(GYM_LAUNCH).withAction(str).with(bundle).navigation(context);
    }

    public static /* synthetic */ void startLaunchGymActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startLaunchGymActivity(context, str, bundle);
    }
}
