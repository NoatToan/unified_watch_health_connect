package com.huami.relatives;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H&J\b\u0010\u0015\u001a\u00020\u0006H&J\b\u0010\u0016\u001a\u00020\u0010H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001cH&J@\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u0017H&J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H&J*\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\rH&J\u001a\u0010+\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\u0004H&¨\u0006,"}, d2 = {"Lcom/huami/relatives/FriendsAndFamilyService;", "", "", "uid", "", WebAPI.PARAM_F_TOKEN, "", "type", "", "searchFriend", "cleanData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "addFriendActivityNewIntent", "friendActivityIntent", "Landroidx/fragment/app/Fragment;", "fragment", "onSelectFriendFrag", "Ljava/lang/Class;", "friendActivityClass", "eventFriendSearchScanType", "obtainFriendFrag", "", "isFriendFrag", "Landroid/app/Activity;", "activity", "showQrCode", "Landroidx/fragment/app/FragmentActivity;", "shareFriendInvite", "offset", "count", "refresh", "hasMore", WebAPI.PARAM_IS_REFRESH, "errorTip", "requestFriendListData", "jumpToCaptureActivity", "requestCode", "resultCode", "data", "onCaptureActivityResult", "friendStr", "jumpToDetailActivity", "relatives-service_release"}, k = 1, mv = {1, 4, 0})
public interface FriendsAndFamilyService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static /* synthetic */ void requestFriendListData$default(FriendsAndFamilyService friendsAndFamilyService, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFriendListData");
            }
            friendsAndFamilyService.requestFriendListData(i, i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? true : z4);
        }
    }

    @NotNull
    Intent addFriendActivityNewIntent(@NotNull Context context);

    void cleanData();

    int eventFriendSearchScanType();

    @NotNull
    Class<?> friendActivityClass();

    @NotNull
    Intent friendActivityIntent(@NotNull Context context);

    boolean isFriendFrag(@NotNull Fragment fragment);

    void jumpToCaptureActivity(@NotNull Activity activity);

    void jumpToDetailActivity(@NotNull Activity activity, @Nullable String friendStr);

    @NotNull
    Fragment obtainFriendFrag();

    void onCaptureActivityResult(@NotNull FragmentActivity activity, int requestCode, int resultCode, @Nullable Intent data);

    void onSelectFriendFrag(@Nullable Fragment fragment);

    void requestFriendListData(int offset, int count, boolean refresh, boolean hasMore, boolean isRefresh, boolean errorTip);

    void searchFriend(long uid, @NotNull String fToken, int type);

    void shareFriendInvite(@NotNull FragmentActivity activity);

    void showQrCode(@NotNull Activity activity);
}
