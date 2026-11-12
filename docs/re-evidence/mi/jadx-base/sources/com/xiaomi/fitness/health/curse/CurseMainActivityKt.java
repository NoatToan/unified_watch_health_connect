package com.xiaomi.fitness.health.curse;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG_L", "", "startCurseActivity", "", "context", "Landroid/content/Context;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseMainActivityKt {

    @NotNull
    private static final String TAG_L = "CurseActivity";

    public static final void startCurseActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) CurseMainActivity.class));
    }
}
