package com.xiaomi.fitness.sport_eco.scheme;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.w7r;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/scheme/LocalScheme;", "Lw7r;", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "canHandle", "(Landroid/net/Uri;)Z", "", "authority", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "doProcess", "(Landroid/content/Context;Landroid/net/Uri;)V", "<init>", "()V", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalScheme extends w7r {

    @NotNull
    public static final String localSport = "localsport";

    @NotNull
    public static final String sAuthority = "intent";

    @Override // defpackage.w7r
    @NotNull
    public String authority() {
        return "intent";
    }

    @Override // defpackage.w7r, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri) && CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.arrayListOf("localsport"), uri.getQueryParameter("pageType"));
    }

    @Override // defpackage.w7r
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getQueryParameter("pageType"), "localsport")) {
            Intent intent = new Intent(context, (Class<?>) GymLaunchEcoSportActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }
}
