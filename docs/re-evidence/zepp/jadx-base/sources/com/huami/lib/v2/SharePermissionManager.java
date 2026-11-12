package com.huami.lib.v2;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.ShareType;
import com.huami.permission.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import com.huami.watch.notification.TransportUri;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J8\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/lib/v2/SharePermissionManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/lib/ShareType;", "type", "Lcom/huami/lib/v2/RequestMultiplePermissionCallback;", "callback", "", "requestSharePermission", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "hasSharePermission", "", "a", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "_requestSharePermission", "(Landroidx/fragment/app/FragmentActivity;Lcom/huami/lib/ShareType;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class SharePermissionManager {

    @NotNull
    public static final SharePermissionManager INSTANCE = new SharePermissionManager();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.HEART_RATE.ordinal()] = 1;
            iArr[ShareType.STRESS.ordinal()] = 2;
            iArr[ShareType.BODY_FAT.ordinal()] = 3;
            iArr[ShareType.BASE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SharePermissionManager() {
    }

    private final String a(ShareType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return "key_share_heart_rate";
        }
        if (i == 2) {
            return "key_share_stress";
        }
        if (i == 3) {
            return "key_share_body_fat";
        }
        if (i == 4) {
            return "key_share_base";
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final boolean hasSharePermission(@NotNull Context context) {
        return ZeppPermissionManagerKt.hasPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
    }

    @JvmStatic
    public static final void requestSharePermission(@NotNull FragmentActivity activity, @NotNull ShareType type, @NotNull RequestMultiplePermissionCallback callback) {
        INSTANCE._requestSharePermission(activity, type, RequestMultiplePermissionCallbackKt.requestDslToCallback(callback));
    }

    @JvmName(name = "_requestSharePermission")
    public final void _requestSharePermission(@NotNull FragmentActivity activity, @NotNull ShareType type, @NotNull Function1<? super RequestMultiplePermissionDsl, Unit> block) {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        String strA = a(type);
        int i = R.string.permission_denied_msg_home_basic;
        PermissionXKt.withPermissions(activity, listListOf, strA, new MainPermissionsRationale(activity.getString(i), false, 0, 6, null), new MainAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(i), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"})))), block);
    }
}
