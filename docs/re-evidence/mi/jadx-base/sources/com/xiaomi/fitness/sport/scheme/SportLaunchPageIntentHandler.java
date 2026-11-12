package com.xiaomi.fitness.sport.scheme;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.sport.scheme.SportLaunchPageIntentHandler;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/scheme/SportLaunchPageIntentHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "sportTypeList", "", "", "authority", "parameterList", "pathList", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "doProcess", "", "context", "Landroid/content/Context;", "goToLaunchSportActivityWithSportType", DailyRecordKey.sportType, "", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportLaunchPageIntentHandler extends IntentSchemeHandle {

    @NotNull
    public static final String KEY_AUTHORITY = "intent";

    @NotNull
    public static final String KEY_PAGE_TYPE = "pageType";

    @NotNull
    public static final String SPORT_TYPE_HEALTH_WALKING = "go_health_walking";

    @NotNull
    public static final String SPORT_TYPE_INDOOR_RUNNING = "go_indoor_running";

    @NotNull
    public static final String SPORT_TYPE_OUTDOOR_RUNNING = "go_outdoor_running";

    @NotNull
    public static final String TAG = "SportLaunchPageIntentHandler";

    @NotNull
    private final List<String> sportTypeList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{SPORT_TYPE_HEALTH_WALKING, SPORT_TYPE_OUTDOOR_RUNNING, SPORT_TYPE_INDOOR_RUNNING});

    private final void goToLaunchSportActivityWithSportType(Context context, final int sportType) {
        LaunchExtensionKt.startActivity(context, (Class<?>) LaunchSportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: bpn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportLaunchPageIntentHandler.goToLaunchSportActivityWithSportType$lambda$0(sportType, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToLaunchSportActivityWithSportType$lambda$0(int i, Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("KEY_SPORT_TYPE", i);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c
    @NotNull
    /* JADX INFO: renamed from: authority */
    public String getAUTHORITY() {
        return "intent";
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri) && CollectionsKt___CollectionsKt.contains(this.sportTypeList, uri.getQueryParameter("pageType"));
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "doProcess uri=" + uri);
        String queryParameter = uri.getQueryParameter("pageType");
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode == -303151411) {
                if (queryParameter.equals(SPORT_TYPE_HEALTH_WALKING)) {
                    goToLaunchSportActivityWithSportType(context, 2);
                }
            } else if (iHashCode == 656851978) {
                if (queryParameter.equals(SPORT_TYPE_INDOOR_RUNNING)) {
                    goToLaunchSportActivityWithSportType(context, 3);
                }
            } else if (iHashCode == 1966608165 && queryParameter.equals(SPORT_TYPE_OUTDOOR_RUNNING)) {
                goToLaunchSportActivityWithSportType(context, 1);
            }
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{SPORT_TYPE_HEALTH_WALKING, SPORT_TYPE_OUTDOOR_RUNNING, SPORT_TYPE_INDOOR_RUNNING});
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return new ArrayList();
    }
}
