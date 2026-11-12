package com.huami.message.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.api.MessageWebApi;
import com.huami.message.api.WebConst;
import com.huami.message.api.pojo.MessageCountBean;
import com.huami.message.converter.WebBeanToPoExKt;
import com.huami.message.db.MessageDb;
import com.huami.message.db.po.MessageCount;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.MessageType;
import com.huami.message.dto.NoticeType;
import com.huami.message.repo.MessageCountRepo;
import com.huami.message.util.AppExecutors;
import com.huami.message.vo.UnreadMessageVo;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >2\u00020\u0001:\u0001>B\u001f\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\b<\u0010=J,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0002J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002Ji\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018Ji\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0006\u0010 \u001a\u00020\u0016J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u0007J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u0007J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010$J\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\"\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0004R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108¨\u0006?"}, d2 = {"Lcom/huami/message/repo/MessageCountRepo;", "", "Lkotlin/Function1;", "Lcom/huami/message/vo/UnreadMessageVo;", "", "Lcom/huami/message/repo/CountExtractor;", "countExtractor", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", GoogleApiAvailabilityLight.b, "", "Lcom/huami/message/db/po/MessageCount;", "messageCountList", "i", "", WebConst.QueryParam.MESSAGE_ID, "reduceCount", "notifyType", WebConst.QueryParam.MESSAGE_TYPE, "messageSubTypes", "", "timestamp", "", com.google.android.exoplayer2.text.ttml.b.r, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "t", "loadAllUnreadMessageCount", "loadUnreadNotificationMessageCount", "loadUnreadUserMessageCount", "loadUnreadPraiseFavFollowCount", "loadUnreadCommentCount", "loadUnreadNoticeCount", "local", "loadUnreadMessageCountVo", "updateAllMessageCountAsRead", "updateNotificationCountAsRead", "(Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "updateNotificationCountAsMidongRead", "updateUserMessageCountAsRead", "updatePraiseFavFollowCountAsRead", "updateCommentCountAsRead", "messageCount", "updateChatMessageCountAsRead", "Lcom/huami/message/api/MessageWebApi;", "a", "Lcom/huami/message/api/MessageWebApi;", "webApi", "Lcom/huami/message/db/MessageDb;", "b", "Lcom/huami/message/db/MessageDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/message/util/AppExecutors;", "c", "Lcom/huami/message/util/AppExecutors;", "appExecutors", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "praiseFavFollowTypes", "e", "commentTypes", "<init>", "(Lcom/huami/message/api/MessageWebApi;Lcom/huami/message/db/MessageDb;Lcom/huami/message/util/AppExecutors;)V", "Companion", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageCountRepo {

    @NotNull
    public static final String TAG = "MessageCountRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MessageWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MessageDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<String> praiseFavFollowTypes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{MessageSubType.AGREE_COMMENT.getValue(), MessageSubType.AGREE_POST.getValue(), MessageSubType.AGREE_SECOND_COMMENT.getValue(), MessageSubType.COLLECT.getValue(), MessageSubType.FOLLOW.getValue()});

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<String> commentTypes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{MessageSubType.COMMENT.getValue(), MessageSubType.REPLY_COMMENT.getValue(), MessageSubType.REPLY_SECOND_COMMENT.getValue()});

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.LOADING.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer allCount = unreadMessageVo.getAllCount();
            if (allCount == null) {
                return 0;
            }
            return allCount.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer commentReplyCnt = unreadMessageVo.getCommentReplyCnt();
            if (commentReplyCnt == null) {
                return 0;
            }
            return commentReplyCnt.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/message/db/po/MessageCount;", "messageCountList", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<List<? extends MessageCount>, Unit> {
        public final /* synthetic */ MediatorLiveData<Resource<UnreadMessageVo>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MediatorLiveData<Resource<UnreadMessageVo>> mediatorLiveData) {
            super(1);
            this.b = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MessageCount> list) {
            invoke2((List<MessageCount>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<MessageCount> list) {
            this.b.postValue(Resource.INSTANCE.success(MessageCountRepo.this.i(list)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer noticeCount = unreadMessageVo.getNoticeCount();
            if (noticeCount == null) {
                return 0;
            }
            return noticeCount.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer noticeCount = unreadMessageVo.getNoticeCount();
            if (noticeCount == null) {
                return 0;
            }
            return noticeCount.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer praiseFavFollowCnt = unreadMessageVo.getPraiseFavFollowCnt();
            if (praiseFavFollowCnt == null) {
                return 0;
            }
            return praiseFavFollowCnt.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<UnreadMessageVo, Integer> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final int a(@NotNull UnreadMessageVo unreadMessageVo) {
            Integer messageCount = unreadMessageVo.getMessageCount();
            if (messageCount == null) {
                return 0;
            }
            return messageCount.intValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(UnreadMessageVo unreadMessageVo) {
            return Integer.valueOf(a(unreadMessageVo));
        }
    }

    public MessageCountRepo(@NotNull MessageWebApi messageWebApi, @NotNull MessageDb messageDb, @NotNull AppExecutors appExecutors) {
        this.webApi = messageWebApi;
        this.db = messageDb;
        this.appExecutors = appExecutors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnreadMessageVo i(List<MessageCount> messageCountList) {
        UnreadMessageVo unreadMessageVo = new UnreadMessageVo(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        for (MessageCount messageCount : messageCountList) {
            Integer allCount = unreadMessageVo.getAllCount();
            unreadMessageVo.setAllCount(allCount == null ? null : Integer.valueOf(allCount.intValue() + messageCount.getCount()));
            String noticeType = messageCount.getNoticeType();
            if (Intrinsics.areEqual(noticeType, NoticeType.NOTICE.getValue())) {
                Integer noticeCount = unreadMessageVo.getNoticeCount();
                unreadMessageVo.setNoticeCount(noticeCount == null ? null : Integer.valueOf(noticeCount.intValue() + messageCount.getCount()));
            } else if (Intrinsics.areEqual(noticeType, NoticeType.MESSAGE.getValue())) {
                Integer messageCount2 = unreadMessageVo.getMessageCount();
                unreadMessageVo.setMessageCount(messageCount2 == null ? null : Integer.valueOf(messageCount2.intValue() + messageCount.getCount()));
            }
            String subType = messageCount.getSubType();
            if (Intrinsics.areEqual(subType, MessageSubType.AGREE_POST.getValue()) ? true : Intrinsics.areEqual(subType, MessageSubType.AGREE_COMMENT.getValue()) ? true : Intrinsics.areEqual(subType, MessageSubType.AGREE_SECOND_COMMENT.getValue())) {
                Integer praiseCnt = unreadMessageVo.getPraiseCnt();
                unreadMessageVo.setPraiseCnt(praiseCnt == null ? null : Integer.valueOf(praiseCnt.intValue() + messageCount.getCount()));
                Integer praiseFavFollowCnt = unreadMessageVo.getPraiseFavFollowCnt();
                unreadMessageVo.setPraiseFavFollowCnt(praiseFavFollowCnt != null ? Integer.valueOf(praiseFavFollowCnt.intValue() + messageCount.getCount()) : null);
            } else if (Intrinsics.areEqual(subType, MessageSubType.COLLECT.getValue())) {
                Integer favoriteCnt = unreadMessageVo.getFavoriteCnt();
                unreadMessageVo.setFavoriteCnt(favoriteCnt == null ? null : Integer.valueOf(favoriteCnt.intValue() + messageCount.getCount()));
                Integer praiseFavFollowCnt2 = unreadMessageVo.getPraiseFavFollowCnt();
                unreadMessageVo.setPraiseFavFollowCnt(praiseFavFollowCnt2 != null ? Integer.valueOf(praiseFavFollowCnt2.intValue() + messageCount.getCount()) : null);
            } else if (Intrinsics.areEqual(subType, MessageSubType.FOLLOW.getValue())) {
                Integer followCnt = unreadMessageVo.getFollowCnt();
                unreadMessageVo.setFollowCnt(followCnt == null ? null : Integer.valueOf(followCnt.intValue() + messageCount.getCount()));
                Integer praiseFavFollowCnt3 = unreadMessageVo.getPraiseFavFollowCnt();
                unreadMessageVo.setPraiseFavFollowCnt(praiseFavFollowCnt3 != null ? Integer.valueOf(praiseFavFollowCnt3.intValue() + messageCount.getCount()) : null);
            } else if (Intrinsics.areEqual(subType, MessageSubType.COMMENT.getValue())) {
                Integer commentCnt = unreadMessageVo.getCommentCnt();
                unreadMessageVo.setCommentCnt(commentCnt == null ? null : Integer.valueOf(commentCnt.intValue() + messageCount.getCount()));
                Integer commentReplyCnt = unreadMessageVo.getCommentReplyCnt();
                unreadMessageVo.setCommentReplyCnt(commentReplyCnt != null ? Integer.valueOf(commentReplyCnt.intValue() + messageCount.getCount()) : null);
            } else if (Intrinsics.areEqual(subType, MessageSubType.REPLY_COMMENT.getValue()) ? true : Intrinsics.areEqual(subType, MessageSubType.REPLY_SECOND_COMMENT.getValue())) {
                Integer replyCnt = unreadMessageVo.getReplyCnt();
                unreadMessageVo.setReplyCnt(replyCnt == null ? null : Integer.valueOf(replyCnt.intValue() + messageCount.getCount()));
                Integer commentReplyCnt2 = unreadMessageVo.getCommentReplyCnt();
                unreadMessageVo.setCommentReplyCnt(commentReplyCnt2 != null ? Integer.valueOf(commentReplyCnt2.intValue() + messageCount.getCount()) : null);
            } else if (Intrinsics.areEqual(subType, MessageSubType.CHAT.getValue())) {
                Integer chatCnt = unreadMessageVo.getChatCnt();
                unreadMessageVo.setChatCnt(chatCnt != null ? Integer.valueOf(chatCnt.intValue() + messageCount.getCount()) : null);
            }
        }
        return unreadMessageVo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MediatorLiveData mediatorLiveData, MessageCountRepo messageCountRepo, final Function1 function1) {
        mediatorLiveData.addSource(messageCountRepo.db.messageDao().queryAllMessageCountPo(), new Observer() { // from class: o05
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageCountRepo.k(function1, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function1 function1, List list) {
        function1.invoke(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final MessageCountRepo messageCountRepo, MediatorLiveData mediatorLiveData) {
        String status = MessageStatus.NEW.getStatus();
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(status, "null cannot be cast to non-null type java.lang.String");
        final ApiResponse<MessageCountBean> apiResponseLoadMessageCount = messageCountRepo.webApi.loadMessageCount(null, null, status.toUpperCase(locale));
        if (apiResponseLoadMessageCount instanceof ApiSuccessResponse) {
            messageCountRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: r05
                @Override // java.lang.Runnable
                public final void run() {
                    MessageCountRepo.m(this.a, apiResponseLoadMessageCount);
                }
            });
        } else if (apiResponseLoadMessageCount instanceof ApiEmptyResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
        } else if (apiResponseLoadMessageCount instanceof ApiErrorResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) apiResponseLoadMessageCount).getErrorMessage(), null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MessageCountRepo messageCountRepo, ApiResponse apiResponse) {
        messageCountRepo.db.messageDao().insertMessageCount(WebBeanToPoExKt.toMessageCountList((MessageCountBean) ((ApiSuccessResponse) apiResponse).getBody()));
    }

    private final LiveData<Resource<Integer>> n(final Function1<? super UnreadMessageVo, Integer> countExtractor) {
        return Transformations.map(loadUnreadMessageCountVo(false), new Function() { // from class: n05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountRepo.o(countExtractor, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource o(Function1 function1, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            return Resource.INSTANCE.success(function1.invoke(resource.getData()));
        }
        if (i == 2) {
            return Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null);
        }
        if (i == 3) {
            return Resource.Companion.error$default(Resource.INSTANCE, resource.getMessage(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final LiveData<Resource<Boolean>> p(final String messageId, Integer reduceCount, final String notifyType, final String messageType, final List<String> messageSubTypes, final Long timestamp) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: u05
            @Override // java.lang.Runnable
            public final void run() {
                MessageCountRepo.r(this.a, notifyType, messageType, messageSubTypes, messageId, timestamp, mediatorLiveData);
            }
        });
        return mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData q(MessageCountRepo messageCountRepo, String str, Integer num, String str2, String str3, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = 0;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        return messageCountRepo.p(str, num, str2, str3, list, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final MessageCountRepo messageCountRepo, String str, String str2, List list, String str3, Long l, MediatorLiveData mediatorLiveData) {
        ApiResponse<String> apiResponseUpdateMessageStatus = messageCountRepo.webApi.updateMessageStatus(MessageStatus.READ.getStatus(), str, str2, list == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), str3, l);
        if (!(apiResponseUpdateMessageStatus instanceof ApiSuccessResponse)) {
            if (apiResponseUpdateMessageStatus instanceof ApiEmptyResponse) {
                mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                return;
            } else {
                if (apiResponseUpdateMessageStatus instanceof ApiErrorResponse) {
                    mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) apiResponseUpdateMessageStatus).getErrorMessage(), null, 2, null));
                    return;
                }
                return;
            }
        }
        final ApiResponse<MessageCountBean> apiResponseLoadMessageCount = messageCountRepo.webApi.loadMessageCount(null, null, MessageStatus.NEW.getStatus());
        if (apiResponseLoadMessageCount instanceof ApiSuccessResponse) {
            messageCountRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: s05
                @Override // java.lang.Runnable
                public final void run() {
                    MessageCountRepo.s(this.a, apiResponseLoadMessageCount);
                }
            });
            mediatorLiveData.postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
        } else if (apiResponseLoadMessageCount instanceof ApiEmptyResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
        } else if (apiResponseLoadMessageCount instanceof ApiErrorResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) apiResponseLoadMessageCount).getErrorMessage(), null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MessageCountRepo messageCountRepo, ApiResponse apiResponse) {
        messageCountRepo.db.messageDao().insertMessageCount(WebBeanToPoExKt.toMessageCountList((MessageCountBean) ((ApiSuccessResponse) apiResponse).getBody()));
    }

    private final LiveData<Resource<Boolean>> t(final String messageId, Integer reduceCount, final String notifyType, final String messageType, final List<String> messageSubTypes, final Long timestamp) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: t05
            @Override // java.lang.Runnable
            public final void run() {
                MessageCountRepo.v(this.a, notifyType, messageType, messageSubTypes, messageId, timestamp, mediatorLiveData);
            }
        });
        return mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData u(MessageCountRepo messageCountRepo, String str, Integer num, String str2, String str3, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = 0;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        return messageCountRepo.t(str, num, str2, str3, list, l);
    }

    public static /* synthetic */ LiveData updateNotificationCountAsMidongRead$default(MessageCountRepo messageCountRepo, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return messageCountRepo.updateNotificationCountAsMidongRead(l);
    }

    public static /* synthetic */ LiveData updateNotificationCountAsRead$default(MessageCountRepo messageCountRepo, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return messageCountRepo.updateNotificationCountAsRead(l);
    }

    public static /* synthetic */ LiveData updatePraiseFavFollowCountAsRead$default(MessageCountRepo messageCountRepo, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return messageCountRepo.updatePraiseFavFollowCountAsRead(l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MessageCountRepo messageCountRepo, String str, String str2, List list, String str3, Long l, MediatorLiveData mediatorLiveData) {
        ApiResponse<String> apiResponseUpdateMessageStatus = messageCountRepo.webApi.updateMessageStatus(MessageStatus.READ.getStatus(), str, str2, list == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), str3, l);
        if (apiResponseUpdateMessageStatus instanceof ApiSuccessResponse) {
            mediatorLiveData.postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
        } else if (apiResponseUpdateMessageStatus instanceof ApiEmptyResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
        } else if (apiResponseUpdateMessageStatus instanceof ApiErrorResponse) {
            mediatorLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) apiResponseUpdateMessageStatus).getErrorMessage(), null, 2, null));
        }
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadAllUnreadMessageCount() {
        return n(a.a);
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadUnreadCommentCount() {
        return n(b.a);
    }

    @NotNull
    public final LiveData<Resource<UnreadMessageVo>> loadUnreadMessageCountVo(boolean local) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        final c cVar = new c(mediatorLiveData);
        this.appExecutors.getMainThread().execute(new Runnable() { // from class: p05
            @Override // java.lang.Runnable
            public final void run() {
                MessageCountRepo.j(mediatorLiveData, this, cVar);
            }
        });
        if (!local) {
            this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: q05
                @Override // java.lang.Runnable
                public final void run() {
                    MessageCountRepo.l(this.a, mediatorLiveData);
                }
            });
        }
        return mediatorLiveData;
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadUnreadNoticeCount() {
        return n(d.a);
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadUnreadNotificationMessageCount() {
        return n(e.a);
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadUnreadPraiseFavFollowCount() {
        return n(f.a);
    }

    @NotNull
    public final LiveData<Resource<Integer>> loadUnreadUserMessageCount() {
        return n(g.a);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateAllMessageCountAsRead() {
        return q(this, null, null, null, null, null, null, 63, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateChatMessageCountAsRead(@NotNull String messageId, int messageCount) {
        return q(this, messageId, Integer.valueOf(messageCount), NoticeType.MESSAGE.getValue(), MessageType.USER.getValue(), kotlin.collections.e.listOf(MessageSubType.CHAT.getValue()), null, 32, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateCommentCountAsRead(long timestamp) {
        return q(this, null, null, NoticeType.MESSAGE.getValue(), MessageType.USER.getValue(), this.commentTypes, Long.valueOf(timestamp), 3, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateNotificationCountAsMidongRead(@Nullable Long timestamp) {
        return u(this, null, null, NoticeType.NOTICE.getValue(), null, null, timestamp, 27, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateNotificationCountAsRead(@Nullable Long timestamp) {
        return q(this, null, null, NoticeType.NOTICE.getValue(), null, null, timestamp, 27, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updatePraiseFavFollowCountAsRead(@Nullable Long timestamp) {
        return q(this, null, null, NoticeType.MESSAGE.getValue(), MessageType.USER.getValue(), this.praiseFavFollowTypes, timestamp, 3, null);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> updateUserMessageCountAsRead() {
        return q(this, null, null, NoticeType.MESSAGE.getValue(), null, null, null, 59, null);
    }
}
