package com.huami.message.utils;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.huami.message.dto.MessageSubType;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper;", "", "eventBuilder", "", "recordDelegate", "", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "AwesomeAttentionCollectionHelper", "CommentDetialHelper", "CommentReplyHelper", "MessageCenterEventHelper", "OtherPagerHelper", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageRecorderEventHelper {

    @NotNull
    public static final MessageRecorderEventHelper INSTANCE = new MessageRecorderEventHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "MsgRecorderEventHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper$AwesomeAttentionCollectionHelper;", "", "", "awesomeAttentionCollectionPager", "", WebConst.QueryParam.MESSAGE_TYPE, "messageStatus", "jobkey", "awesomeAttentionCollectionMessageShow", "awesomeAttentionCollectionMessageClick", "id", "awesomeAttentionCollectionAttentionClick", "a", "Ljava/lang/String;", "getTYPE_MESSAGE_AGREE_DYNAMIC", "()Ljava/lang/String;", "TYPE_MESSAGE_AGREE_DYNAMIC", "b", "getTYPE_MESSAGE_AGREE_COMMENT", "TYPE_MESSAGE_AGREE_COMMENT", "c", "getTYPE_MESSAGE_AGREE_REPLY", "TYPE_MESSAGE_AGREE_REPLY", GoogleApiAvailabilityLight.a, "getTYPE_MESSAGE_COLLECT_DYNAMIC", "TYPE_MESSAGE_COLLECT_DYNAMIC", "e", "getTYPE_MESSAGE_AGREE_FOLLOW", "TYPE_MESSAGE_AGREE_FOLLOW", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class AwesomeAttentionCollectionHelper {

        @NotNull
        public static final AwesomeAttentionCollectionHelper INSTANCE = new AwesomeAttentionCollectionHelper();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String TYPE_MESSAGE_AGREE_DYNAMIC = "agree_dynamic";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String TYPE_MESSAGE_AGREE_COMMENT = "agree_comment";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static final String TYPE_MESSAGE_AGREE_REPLY = "agree_reply";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private static final String TYPE_MESSAGE_COLLECT_DYNAMIC = "collect_dynamic";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static final String TYPE_MESSAGE_AGREE_FOLLOW = Type.FOLLOW_MESSAGE;

        private AwesomeAttentionCollectionHelper() {
        }

        public final void awesomeAttentionCollectionAttentionClick(@NotNull String id, @NotNull String jobkey) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_C");
            countEventBuilder.addExtra("tp", "follow_button");
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("uid", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void awesomeAttentionCollectionMessageClick(@NotNull String messageType, @NotNull String messageStatus, @NotNull String jobkey) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_C");
            countEventBuilder.addExtra("tp", messageType);
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("status", messageStatus);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void awesomeAttentionCollectionMessageShow(@NotNull String messageType, @NotNull String messageStatus, @NotNull String jobkey) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_V");
            countEventBuilder.addExtra("tp", messageType);
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("status", messageStatus);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void awesomeAttentionCollectionPager() {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_V");
            countEventBuilder.addExtra("tp", "agree_collect_follow");
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        @NotNull
        public final String getTYPE_MESSAGE_AGREE_COMMENT() {
            return TYPE_MESSAGE_AGREE_COMMENT;
        }

        @NotNull
        public final String getTYPE_MESSAGE_AGREE_DYNAMIC() {
            return TYPE_MESSAGE_AGREE_DYNAMIC;
        }

        @NotNull
        public final String getTYPE_MESSAGE_AGREE_FOLLOW() {
            return TYPE_MESSAGE_AGREE_FOLLOW;
        }

        @NotNull
        public final String getTYPE_MESSAGE_AGREE_REPLY() {
            return TYPE_MESSAGE_AGREE_REPLY;
        }

        @NotNull
        public final String getTYPE_MESSAGE_COLLECT_DYNAMIC() {
            return TYPE_MESSAGE_COLLECT_DYNAMIC;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b&\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004R\u001c\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001c\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001c\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001c\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016¨\u0006/"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper$CommentDetialHelper;", "", "Lcom/huami/message/dto/MessageSubType;", "subType", "", "commentDetailTp", WebConst.QueryParam.MESSAGE_TYPE, "commentID", "count", "", "commentDetailPage", "id", "commentDetialCommentBody", "replyid", "commentid", "commentDetialReplyClick", "parentId", "commentReplyEditClcik", "commentReplySendBtnClcik", "a", "Ljava/lang/String;", "getAGREE_DYNAMIC", "()Ljava/lang/String;", "AGREE_DYNAMIC", "b", "getAGREE_COMMENT", "AGREE_COMMENT", "c", "getAGREE_REPLY", "AGREE_REPLY", GoogleApiAvailabilityLight.a, "getCOLLECT_DYNAMIC", "COLLECT_DYNAMIC", "e", "getFOLLOW", Constant.FOLLOW_STATUS, "f", "getCOMMENT_DYNAMIC", "COMMENT_DYNAMIC", "g", "getCOMMENT_COMMENT", "COMMENT_COMMENT", "h", "getCOMMENT_REPLY", "COMMENT_REPLY", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class CommentDetialHelper {

        @NotNull
        public static final CommentDetialHelper INSTANCE = new CommentDetialHelper();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String AGREE_DYNAMIC = "agree_dynamic";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String AGREE_COMMENT = "agree_comment";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static final String AGREE_REPLY = "agree_reply";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private static final String COLLECT_DYNAMIC = "collect_dynamic";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static final String FOLLOW = Type.FOLLOW_MESSAGE;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_DYNAMIC = "comment_dynamic";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_COMMENT = "comment_comment";

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_REPLY = "comment_reply";

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageSubType.values().length];
                iArr[MessageSubType.AGREE_COMMENT.ordinal()] = 1;
                iArr[MessageSubType.AGREE_SECOND_COMMENT.ordinal()] = 2;
                iArr[MessageSubType.COMMENT.ordinal()] = 3;
                iArr[MessageSubType.REPLY_COMMENT.ordinal()] = 4;
                iArr[MessageSubType.REPLY_SECOND_COMMENT.ordinal()] = 5;
                iArr[MessageSubType.AGREE_POST.ordinal()] = 6;
                iArr[MessageSubType.COLLECT.ordinal()] = 7;
                iArr[MessageSubType.FOLLOW.ordinal()] = 8;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private CommentDetialHelper() {
        }

        public final void commentDetailPage(@NotNull String messageType, @NotNull String commentID, @NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COMMENTDETAIIL_V");
            countEventBuilder.addExtra("tp", messageType);
            countEventBuilder.addExtra("id", commentID);
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        @NotNull
        public final String commentDetailTp(@Nullable MessageSubType subType) {
            switch (subType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[subType.ordinal()]) {
                case 1:
                    return AGREE_COMMENT;
                case 2:
                    return AGREE_REPLY;
                case 3:
                    return COMMENT_DYNAMIC;
                case 4:
                    return COMMENT_COMMENT;
                case 5:
                    return COMMENT_REPLY;
                case 6:
                    return AGREE_DYNAMIC;
                case 7:
                    return COLLECT_DYNAMIC;
                case 8:
                    return FOLLOW;
                default:
                    return "";
            }
        }

        public final void commentDetialCommentBody(@NotNull String id) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COMMENTDETAIIL_C");
            countEventBuilder.addExtra("tp", "go_dynamic");
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentDetialReplyClick(@NotNull String id, @NotNull String replyid, @NotNull String commentid) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COMMENTDETAIIL_C");
            countEventBuilder.addExtra("tp", "reply");
            countEventBuilder.addExtra("replyid", replyid);
            countEventBuilder.addExtra("commentid", commentid);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplyEditClcik(@NotNull String parentId) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COMMENTDETAIL_C");
            countEventBuilder.addExtra("tp", "replyframe");
            countEventBuilder.addExtra("id", parentId);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplySendBtnClcik(@NotNull String parentId) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COMMENTDETAIL_C");
            countEventBuilder.addExtra("tp", "send_button");
            countEventBuilder.addExtra("id", parentId);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        @NotNull
        public final String getAGREE_COMMENT() {
            return AGREE_COMMENT;
        }

        @NotNull
        public final String getAGREE_DYNAMIC() {
            return AGREE_DYNAMIC;
        }

        @NotNull
        public final String getAGREE_REPLY() {
            return AGREE_REPLY;
        }

        @NotNull
        public final String getCOLLECT_DYNAMIC() {
            return COLLECT_DYNAMIC;
        }

        @NotNull
        public final String getCOMMENT_COMMENT() {
            return COMMENT_COMMENT;
        }

        @NotNull
        public final String getCOMMENT_DYNAMIC() {
            return COMMENT_DYNAMIC;
        }

        @NotNull
        public final String getCOMMENT_REPLY() {
            return COMMENT_REPLY;
        }

        @NotNull
        public final String getFOLLOW() {
            return FOLLOW;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J&\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper$CommentReplyHelper;", "", "", "commentReplyPager", "", WebConst.QueryParam.MESSAGE_TYPE, "messageStatus", "jobkey", "commentReplyMessage", "commentReplyMessageClick", "uid", "commentid", "dynamicid", "commentReplyReplyClick", "a", "Ljava/lang/String;", "getCOMMENT_DYNAMIC", "()Ljava/lang/String;", "COMMENT_DYNAMIC", "b", "getCOMMENT_COMMENT", "COMMENT_COMMENT", "c", "getCOMMENT_REPLY", "COMMENT_REPLY", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class CommentReplyHelper {

        @NotNull
        public static final CommentReplyHelper INSTANCE = new CommentReplyHelper();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_DYNAMIC = "comment_dynamic";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_COMMENT = "comment_comment";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static final String COMMENT_REPLY = "comment_reply";

        private CommentReplyHelper() {
        }

        public final void commentReplyMessage(@NotNull String messageType, @NotNull String messageStatus, @NotNull String jobkey) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_V");
            countEventBuilder.addExtra("tp", messageType);
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("status", messageStatus);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplyMessageClick(@NotNull String messageType, @NotNull String messageStatus, @NotNull String jobkey) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_C");
            countEventBuilder.addExtra("tp", messageType);
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("status", messageStatus);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplyPager() {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_V");
            countEventBuilder.addExtra("tp", "comment_reply");
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplyReplyClick(@NotNull String jobkey, @NotNull String uid, @NotNull String commentid, @NotNull String dynamicid) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGELIST_C");
            countEventBuilder.addExtra("tp", "reply_button");
            countEventBuilder.addExtra("id", jobkey);
            countEventBuilder.addExtra("uid", uid);
            countEventBuilder.addExtra("commentid", commentid);
            countEventBuilder.addExtra("dynamicid", dynamicid);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        @NotNull
        public final String getCOMMENT_COMMENT() {
            return COMMENT_COMMENT;
        }

        @NotNull
        public final String getCOMMENT_DYNAMIC() {
            return COMMENT_DYNAMIC;
        }

        @NotNull
        public final String getCOMMENT_REPLY() {
            return COMMENT_REPLY;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002¨\u0006\u0019"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper$MessageCenterEventHelper;", "", "", "count_official", "count_user", "", "messageCenterPage", "count", "messageCenterNotificationPage", "messageCenterNotificationClick", "messageCenterUserMessagePage", "messageCenterUserMessageClick", "viewCleanButton", "clickCleanButton", "tp", "id", "status", "viewNotification", "clickNotification", "awesomeAttentionCollectionClick", "commentReplyClick", "messageChatView", "messageChatClick", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class MessageCenterEventHelper {

        @NotNull
        public static final MessageCenterEventHelper INSTANCE = new MessageCenterEventHelper();

        private MessageCenterEventHelper() {
        }

        public final void awesomeAttentionCollectionClick(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "agree_collect_follow");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void clickCleanButton(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "clean_button");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void clickNotification(@NotNull String tp, @NotNull String id, @NotNull String status) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", tp);
            countEventBuilder.addExtra("id", id);
            countEventBuilder.addExtra("status", status);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void commentReplyClick(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "comment_reply");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCenterNotificationClick(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "official_tab");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCenterNotificationPage(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", "official_tab");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCenterPage(@NotNull String count_official, @NotNull String count_user) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", "messagebox");
            countEventBuilder.addExtra("count_official", count_official);
            countEventBuilder.addExtra("count_user", count_user);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCenterUserMessageClick(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "user_tab");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCenterUserMessagePage(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", "user_tab");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageChatClick(@NotNull String id) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_C");
            countEventBuilder.addExtra("tp", "chat");
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageChatView(@NotNull String id) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", "chat");
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void viewCleanButton(@NotNull String count) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", "clean_button");
            countEventBuilder.addExtra("count", count);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void viewNotification(@NotNull String tp, @NotNull String id, @NotNull String status) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MESSAGEBOX_V");
            countEventBuilder.addExtra("tp", tp);
            countEventBuilder.addExtra("id", id);
            countEventBuilder.addExtra("status", status);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\"\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001a\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\"\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\"\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002J\"\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u001e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001b¨\u0006$"}, d2 = {"Lcom/huami/message/utils/MessageRecorderEventHelper$OtherPagerHelper;", "", "", "source", "a", "", "setStatusHomeSource", "setStatusRunSource", "getStatusHomeSource", "getStatusRunSource", "jobkey", "id", "dynamicDetailPage", "homePage", "messageChatPage", "statusHomePage", "runHomePage", "runHistoryHomePage", "courseDetailHomePage", "topicDetailPage", "topicListPage", "fr", "mineDevicePage", "tp1", "tp2", "messageCount", "FROM_PUSH", "Ljava/lang/String;", "FROM_MESSAGEBOX", "FROM_OTHER", "SOURCE", "statusHomeSource", "b", "statusRunSource", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class OtherPagerHelper {

        @NotNull
        public static final String FROM_MESSAGEBOX = "messagebox";

        @NotNull
        public static final String FROM_OTHER = "other";

        @NotNull
        public static final String FROM_PUSH = "push";

        @NotNull
        public static final OtherPagerHelper INSTANCE = new OtherPagerHelper();

        @NotNull
        public static final String SOURCE = "source";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private static String statusHomeSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private static String statusRunSource;

        private OtherPagerHelper() {
        }

        private final String a(String source) {
            return source == null ? "other" : source;
        }

        public static /* synthetic */ void courseDetailHomePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.courseDetailHomePage(str, str2, str3);
        }

        public static /* synthetic */ void dynamicDetailPage$default(OtherPagerHelper otherPagerHelper, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.dynamicDetailPage(str, str2, str3);
        }

        public static /* synthetic */ void homePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.homePage(str, str2);
        }

        public static /* synthetic */ void messageChatPage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.messageChatPage(str, str2);
        }

        public static /* synthetic */ void mineDevicePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.mineDevicePage(str, str2, str3);
        }

        public static /* synthetic */ void runHistoryHomePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.runHistoryHomePage(str, str2);
        }

        public static /* synthetic */ void runHomePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.runHomePage(str, str2);
        }

        public static /* synthetic */ void statusHomePage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.statusHomePage(str, str2);
        }

        public static /* synthetic */ void topicDetailPage$default(OtherPagerHelper otherPagerHelper, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.topicDetailPage(str, str2, str3);
        }

        public static /* synthetic */ void topicListPage$default(OtherPagerHelper otherPagerHelper, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            otherPagerHelper.topicListPage(str, str2);
        }

        public final void courseDetailHomePage(@Nullable String source, @NotNull String jobkey, @NotNull String id) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("COURSE_DETAIL_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void dynamicDetailPage(@Nullable String source, @NotNull String jobkey, @NotNull String id) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("AOS_DETAIL_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        @Nullable
        public final String getStatusHomeSource() {
            return statusHomeSource;
        }

        @Nullable
        public final String getStatusRunSource() {
            return statusRunSource;
        }

        public final void homePage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("USERHOME_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageChatPage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("CHAT_DETAIL_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void messageCount(@NotNull String tp1, @NotNull String tp2, @NotNull String id) {
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MINE_DEVICE_V");
            countEventBuilder.addExtra("tp1", tp1);
            countEventBuilder.addExtra("tp2", tp2);
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void mineDevicePage(@Nullable String source, @NotNull String jobkey, @NotNull String fr) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("MINE_DEVICE_V");
            countEventBuilder.addExtra("fr", fr);
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void runHistoryHomePage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("RUN_HISTORY_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void runHomePage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("RUN_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void setStatusHomeSource(@Nullable String source) {
            statusHomeSource = source;
        }

        public final void setStatusRunSource(@Nullable String source) {
            statusRunSource = source;
        }

        public final void statusHomePage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("STATUS_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void topicDetailPage(@Nullable String source, @NotNull String jobkey, @NotNull String id) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("TOPIC_DETAIL_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            countEventBuilder.addExtra("id", id);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void topicListPage(@Nullable String source, @NotNull String jobkey) {
            String strA = a(source);
            MessageRecorderEventHelper messageRecorderEventHelper = MessageRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("TOPIC_LIST_V");
            countEventBuilder.addExtra("source", strA);
            countEventBuilder.addExtra("mid", jobkey);
            MessageRecorderEventHelperKt.recordUser(countEventBuilder);
            messageRecorderEventHelper.recordDelegate(MessageRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.message.utils.MessageRecorderEventHelper$recordDelegate$1", f = "MessageRecorderEventHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Object obj2 = this.b;
                if (obj2 instanceof CountEventBuilder) {
                    Analytics.recordEvent((CountEventBuilder) obj2);
                } else if (obj2 instanceof CalculationEventBuilder) {
                    Analytics.recordEvent((CalculationEventBuilder) obj2);
                } else if (obj2 instanceof ExceptionEventBuilder) {
                    Analytics.recordEvent((ExceptionEventBuilder) obj2);
                }
            } catch (Exception e) {
                Log.e(MessageRecorderEventHelper.tag, "error", e);
            } catch (Throwable th) {
                Log.e(MessageRecorderEventHelper.tag, "error", th);
            }
            return Unit.INSTANCE;
        }
    }

    private MessageRecorderEventHelper() {
    }

    public final void recordDelegate(@Nullable Object eventBuilder) {
        BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getDefault(), CoroutineStart.DEFAULT, new a(eventBuilder, null));
    }
}
