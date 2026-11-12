package com.xiaomi.fitness.ubox.export;

import android.net.Uri;
import androidx.navigation.NavController;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.hig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "", "<init>", "()V", "TAG", "", "navController", "Landroidx/navigation/NavController;", "bind", "", "navigate", "deepLinkWithParams", "ubox-guide-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuideNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideNavigator.kt\ncom/xiaomi/fitness/ubox/export/GuideNavigator\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,30:1\n29#2:31\n*S KotlinDebug\n*F\n+ 1 GuideNavigator.kt\ncom/xiaomi/fitness/ubox/export/GuideNavigator\n*L\n26#1:31\n*E\n"})
public final class GuideNavigator {

    @NotNull
    private final String TAG = "GuideNavigator";

    @Nullable
    private NavController navController;

    public final void bind(@NotNull NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.navController = navController;
    }

    public final void navigate(@NotNull String deepLinkWithParams) {
        Intrinsics.checkNotNullParameter(deepLinkWithParams, "deepLinkWithParams");
        if (this.navController == null) {
            Logger.i(this.TAG, "NavController is NULL");
        }
        hig higVarA = hig.a.b(Uri.parse("guide://" + deepLinkWithParams)).a();
        Intrinsics.checkNotNullExpressionValue(higVarA, "build(...)");
        NavController navController = this.navController;
        if (navController != null) {
            navController.r(higVarA);
        }
    }
}
