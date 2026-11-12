package com.huami.femalehealth.logiclib.manager;

import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/femalehealth/logiclib/manager/FHUploadPermissionManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "content", "", "showNoPermissionMsg", "a", "Ljava/lang/String;", "TAG", "b", "getToastMsg", "()Ljava/lang/String;", "setToastMsg", "(Ljava/lang/String;)V", "toastMsg", "", "<set-?>", "c", "Z", "getHasPermission", "()Z", "hasPermission", "Lkotlin/Function0;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getHasPermissionFun", "()Lkotlin/jvm/functions/Function0;", "setHasPermissionFun", "(Lkotlin/jvm/functions/Function0;)V", "hasPermissionFun", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class FHUploadPermissionManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FHUploadPermissionManager";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static Function0<Boolean> hasPermissionFun;

    @NotNull
    public static final FHUploadPermissionManager INSTANCE = new FHUploadPermissionManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String toastMsg = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean hasPermission = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("upload permission:", Boolean.valueOf(this.a));
        }
    }

    private FHUploadPermissionManager() {
    }

    public static /* synthetic */ void showNoPermissionMsg$default(FHUploadPermissionManager fHUploadPermissionManager, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = toastMsg;
        }
        fHUploadPermissionManager.showNoPermissionMsg(context, str);
    }

    public final boolean getHasPermission() {
        Function0<Boolean> function0 = hasPermissionFun;
        Boolean boolInvoke = function0 == null ? null : function0.invoke();
        boolean zBooleanValue = boolInvoke == null ? hasPermission : boolInvoke.booleanValue();
        HMLog.info("xyss_FHUploadPermissionManager", new a(zBooleanValue));
        return zBooleanValue;
    }

    @Nullable
    public final Function0<Boolean> getHasPermissionFun() {
        return hasPermissionFun;
    }

    @NotNull
    public final String getToastMsg() {
        return toastMsg;
    }

    public final void setHasPermissionFun(@Nullable Function0<Boolean> function0) {
        hasPermissionFun = function0;
    }

    public final void setToastMsg(@NotNull String str) {
        toastMsg = str;
    }

    public final void showNoPermissionMsg(@NotNull Context context, @NotNull String content) {
        if (toastMsg.length() > 0) {
            Toast.makeText(context, content, 0).show();
        }
    }
}
