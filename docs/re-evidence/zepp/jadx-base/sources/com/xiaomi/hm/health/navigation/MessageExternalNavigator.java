package com.xiaomi.hm.health.navigation;

import android.content.Context;
import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.huami.message.navigation.ExternalNavigator;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.manager.HMAdManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J>\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016J6\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J5\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/navigation/MessageExternalNavigator;", "Lcom/huami/message/navigation/ExternalNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "nickname", "source", "", "navigateToPrivateMsgActivity", "fromPostId", "fromFirstCommentId", "fromSecondCommentId", "fromUserId", "tp", "navigateToCommentDetail", "navigateToPersonalProfile", "startPostId", "startNextIndex", "startPostDetail", ShareConstants.RESULT_POST_ID, "reCommentId", "reUserId", "reUserNickname", "startCommentInputTransparent", "", "mode", "url", "pushUrl", "navigateToPage", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MessageExternalNavigator implements ExternalNavigator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "MessageExternalNavigator";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, String str) {
            super(0);
            this.a = num;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigateToAdJumpAction:mode:" + this.a + " url:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigateToCommentDetail:userId:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigateToPrivateMsgActivity:userId:" + this.a + ",nickname:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startPostDetail:startPostId:" + this.a;
        }
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void navigateToCommentDetail(@NotNull Context context, @NotNull String fromPostId, @NotNull String fromFirstCommentId, @Nullable String fromSecondCommentId, @Nullable String fromUserId, @Nullable String tp) {
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void navigateToPage(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String pushUrl) {
        HMLog.info(this.tag, new a(mode, url));
        if (!(pushUrl == null || pushUrl.length() == 0)) {
            if (url != null && m.startsWith$default(url, "watch", false, 2, null)) {
                HMIntentHandler.handleMifit(context, Uri.parse(pushUrl));
                return;
            }
        }
        HMAdManager.doJumpAction(context, mode, url, (String) null, (Map<String, String>) null, "messagebox");
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void navigateToPersonalProfile(@NotNull Context context, @Nullable String userId, @Nullable String source) {
        HMLog.info(this.tag, new b(userId));
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void navigateToPrivateMsgActivity(@NotNull Context context, @NotNull String userId, @NotNull String nickname, @Nullable String source) {
        HMLog.info(this.tag, new c(userId, nickname));
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void startCommentInputTransparent(@NotNull Context context, @NotNull String postId, @Nullable String reCommentId, @Nullable String reUserId, @Nullable String reUserNickname) {
    }

    @Override // com.huami.message.navigation.ExternalNavigator
    public void startPostDetail(@NotNull Context context, @NotNull String startPostId, @Nullable String startNextIndex) {
        HMLog.info(this.tag, new d(startPostId));
    }
}
