package com.huami.widget.share.config;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRV\u0010\u0017\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/widget/share/config/ShareKitConfig;", "", "", "a", "Z", "isMainLandChannel", "()Z", "setMainLandChannel", "(Z)V", "Lkotlin/Function2;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", ShareConstants.RESULT_POST_ID, "", "b", "Lkotlin/jvm/functions/Function2;", "getFitTimeNavigator", "()Lkotlin/jvm/functions/Function2;", "setFitTimeNavigator", "(Lkotlin/jvm/functions/Function2;)V", "fitTimeNavigator", "<init>", "()V", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareKitConfig {

    @NotNull
    public static final ShareKitConfig INSTANCE = new ShareKitConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean isMainLandChannel = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Function2<? super Context, ? super String, Unit> fitTimeNavigator;

    private ShareKitConfig() {
    }

    @Nullable
    public final Function2<Context, String, Unit> getFitTimeNavigator() {
        return fitTimeNavigator;
    }

    public final boolean isMainLandChannel() {
        return isMainLandChannel;
    }

    public final void setFitTimeNavigator(@Nullable Function2<? super Context, ? super String, Unit> function2) {
        fitTimeNavigator = function2;
    }

    public final void setMainLandChannel(boolean z) {
        isMainLandChannel = z;
    }
}
