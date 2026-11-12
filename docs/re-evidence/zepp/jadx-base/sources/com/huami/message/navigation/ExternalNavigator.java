package com.huami.message.navigation;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J@\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&J,\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&J&\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&J$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H&J<\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&J5\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/huami/message/navigation/ExternalNavigator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "fromPostId", "fromFirstCommentId", "fromSecondCommentId", "fromUserId", "tp", "", "navigateToCommentDetail", "userId", "nickname", "source", "navigateToPrivateMsgActivity", "navigateToPersonalProfile", "startPostId", "startNextIndex", "startPostDetail", ShareConstants.RESULT_POST_ID, "reCommentId", "reUserId", "reUserNickname", "startCommentInputTransparent", "", "mode", "url", "pushUrl", "navigateToPage", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public interface ExternalNavigator {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void navigateToCommentDetail$default(ExternalNavigator externalNavigator, Context context, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToCommentDetail");
            }
            if ((i & 32) != 0) {
                str5 = null;
            }
            externalNavigator.navigateToCommentDetail(context, str, str2, str3, str4, str5);
        }

        public static /* synthetic */ void navigateToPersonalProfile$default(ExternalNavigator externalNavigator, Context context, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToPersonalProfile");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            externalNavigator.navigateToPersonalProfile(context, str, str2);
        }

        public static /* synthetic */ void navigateToPrivateMsgActivity$default(ExternalNavigator externalNavigator, Context context, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToPrivateMsgActivity");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            externalNavigator.navigateToPrivateMsgActivity(context, str, str2, str3);
        }

        public static /* synthetic */ void startCommentInputTransparent$default(ExternalNavigator externalNavigator, Context context, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCommentInputTransparent");
            }
            externalNavigator.startCommentInputTransparent(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ void startPostDetail$default(ExternalNavigator externalNavigator, Context context, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPostDetail");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            externalNavigator.startPostDetail(context, str, str2);
        }
    }

    void navigateToCommentDetail(@NotNull Context context, @NotNull String fromPostId, @NotNull String fromFirstCommentId, @Nullable String fromSecondCommentId, @Nullable String fromUserId, @Nullable String tp);

    void navigateToPage(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String pushUrl);

    void navigateToPersonalProfile(@NotNull Context context, @Nullable String userId, @Nullable String source);

    void navigateToPrivateMsgActivity(@NotNull Context context, @NotNull String userId, @NotNull String nickname, @Nullable String source);

    void startCommentInputTransparent(@NotNull Context context, @NotNull String postId, @Nullable String reCommentId, @Nullable String reUserId, @Nullable String reUserNickname);

    void startPostDetail(@NotNull Context context, @NotNull String startPostId, @Nullable String startNextIndex);
}
