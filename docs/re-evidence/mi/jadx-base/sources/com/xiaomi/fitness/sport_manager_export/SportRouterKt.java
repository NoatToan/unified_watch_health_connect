package com.xiaomi.fitness.sport_manager_export;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.Postcard;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.route.track.view.TrackDetailActivity;
import defpackage.kb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a&\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u001e\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u001a\u001e\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u001a&\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"COMMON_SPORTING", "", "INDOOR_SPORTING", "GYM_LAUNCH", TrackDetailActivity.ROUTE_DETAIL, "CREATED_ROUTE_DETAIL", "startCommonSportActivity", "", "context", "Landroid/content/Context;", "action", "extras", "Landroid/os/Bundle;", "startLaunchGymActivity", "startRouteDetailActivity", SdkContants.KEY_BUNDLE, "startCreatedRouteDetailActivity", "startIndoorSportActivity", "sport-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportRouterKt {

    @NotNull
    public static final String COMMON_SPORTING = "/sport/activity/common_sport";

    @NotNull
    public static final String CREATED_ROUTE_DETAIL = "/sport/activity/created_route_detail";

    @NotNull
    public static final String GYM_LAUNCH = "/sport/activity/launch_gym";

    @NotNull
    public static final String INDOOR_SPORTING = "/sport/activity/indoor_sport";

    @NotNull
    public static final String ROUTE_DETAIL = "/sport/activity/route_detail";

    public static final void startCommonSportActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(COMMON_SPORTING).withAction(str).with(bundle).withFlags(67108864).navigation(context);
    }

    public static /* synthetic */ void startCommonSportActivity$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startCommonSportActivity(context, str, bundle);
    }

    public static final void startCreatedRouteDetailActivity(@Nullable Context context, @Nullable Bundle bundle) {
        Postcard postcardWith = kb.c().a(CREATED_ROUTE_DETAIL).with(bundle);
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        postcardWith.navigation(context);
    }

    public static /* synthetic */ void startCreatedRouteDetailActivity$default(Context context, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        startCreatedRouteDetailActivity(context, bundle);
    }

    public static final void startIndoorSportActivity(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(INDOOR_SPORTING).withAction(str).with(bundle).withFlags(context instanceof Activity ? 67108864 : 335577088).with(bundle).navigation(context);
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

    public static final void startRouteDetailActivity(@Nullable Context context, @Nullable Bundle bundle) {
        Postcard postcardWith = kb.c().a(ROUTE_DETAIL).with(bundle);
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        postcardWith.navigation(context);
    }

    public static /* synthetic */ void startRouteDetailActivity$default(Context context, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        startRouteDetailActivity(context, bundle);
    }
}
