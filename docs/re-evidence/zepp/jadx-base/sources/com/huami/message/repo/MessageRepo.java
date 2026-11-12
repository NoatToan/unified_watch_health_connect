package com.huami.message.repo;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.DataSource;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.fittime.domain.model.Friend;
import com.huami.fittime.domain.repo.RelationRepo;
import com.huami.message.api.MessageWebApi;
import com.huami.message.api.WebConst;
import com.huami.message.api.pojo.Items;
import com.huami.message.api.pojo.PrivateMessageBean;
import com.huami.message.api.pojo.SubMessageBean;
import com.huami.message.converter.OtherToPoKt;
import com.huami.message.converter.PoToVoExKt;
import com.huami.message.converter.WebBeanToPoExKt;
import com.huami.message.db.MessageDb;
import com.huami.message.db.po.PrivateMessagePo;
import com.huami.message.db.po.SubMessagePo;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.NoticeType;
import com.huami.message.paging.Listing;
import com.huami.message.paging.PagingHelper;
import com.huami.message.paging.PagingKey;
import com.huami.message.paging.PagingKeyCache;
import com.huami.message.repo.MessageRepo;
import com.huami.message.util.AppExecutors;
import com.huami.message.vo.PrivateMessageItemVo;
import com.huami.message.vo.SubMessageItemVo;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b.\u0010/J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0005R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/message/repo/MessageRepo;", "", "Lcom/huami/message/dto/NoticeType;", WebConst.QueryParam.NOTICE_TYPE, "", "", "messageSubTypes", "groupSubTypes", "Lcom/huami/message/paging/Listing;", "Lcom/huami/message/vo/SubMessageItemVo;", z.j, "Lcom/huami/message/vo/PrivateMessageItemVo;", "loadPrivateMessageList", "privateMessage", "Lcom/huami/message/dto/MessageStatus;", "messageStatus", "", "updatePrivateMsgStatus", "updateAllMessageStatus", "loadSubMessageForLikes", "loadSubMessageForComment", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "postFollowStatus", "Lcom/huami/message/util/AppExecutors;", "a", "Lcom/huami/message/util/AppExecutors;", "appExecutors", "Lcom/huami/message/db/MessageDb;", "b", "Lcom/huami/message/db/MessageDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/message/api/MessageWebApi;", "c", "Lcom/huami/message/api/MessageWebApi;", "webApi", "Lcom/huami/message/paging/PagingKeyCache;", GoogleApiAvailabilityLight.a, "Lcom/huami/message/paging/PagingKeyCache;", "pagingKeyCache", "Lcom/huami/fittime/domain/repo/RelationRepo;", "e", "Lcom/huami/fittime/domain/repo/RelationRepo;", "relationRepo", "<init>", "(Lcom/huami/message/util/AppExecutors;Lcom/huami/message/db/MessageDb;Lcom/huami/message/api/MessageWebApi;Lcom/huami/message/paging/PagingKeyCache;Lcom/huami/fittime/domain/repo/RelationRepo;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MessageDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MessageWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final RelationRepo relationRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Items<PrivateMessageBean>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Items<PrivateMessageBean> items) {
            return items.getNext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Items<PrivateMessageBean>, Integer> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final int a(@NotNull Items<PrivateMessageBean> items) {
            return items.getItems().size();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Items<PrivateMessageBean> items) {
            return Integer.valueOf(a(items));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, ApiResponse<Items<PrivateMessageBean>>> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<PrivateMessageBean>> invoke(@Nullable String str) {
            return MessageRepo.this.webApi.loadMessageCenter(str, 10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MessageRepo.this.db.messageDao().deleteFullPrivateMessagePo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Boolean> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return MessageRepo.this.db.messageDao().privateMessagePoCount() == 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "body", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Items<PrivateMessageBean>, Unit> {
        public f() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MessageRepo messageRepo, List list) {
            messageRepo.db.messageDao().insertPrivateMessageList(WebBeanToPoExKt.toPrivateMessagePo((List<PrivateMessageBean>) list));
        }

        public final void b(@NotNull Items<PrivateMessageBean> items) {
            final List<PrivateMessageBean> items2 = items.getItems();
            final MessageRepo messageRepo = MessageRepo.this;
            messageRepo.db.runInTransaction(new Runnable() { // from class: com.huami.message.repo.a
                @Override // java.lang.Runnable
                public final void run() {
                    MessageRepo.f.c(messageRepo, items2);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<PrivateMessageBean> items) {
            b(items);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Items<SubMessageBean>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Items<SubMessageBean> items) {
            return items.getNext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Items<SubMessageBean>, Integer> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final int a(@NotNull Items<SubMessageBean> items) {
            return items.getItems().size();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Items<SubMessageBean> items) {
            return Integer.valueOf(a(items));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<String, ApiResponse<Items<SubMessageBean>>> {
        public final /* synthetic */ NoticeType a;
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ MessageRepo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(NoticeType noticeType, List<String> list, MessageRepo messageRepo) {
            super(1);
            this.a = noticeType;
            this.b = list;
            this.c = messageRepo;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<SubMessageBean>> invoke(@Nullable String str) {
            return this.c.webApi.loadMessageListV2(str, 10, "NEW,READ", this.a.getValue(), CollectionsKt___CollectionsKt.joinToString$default(this.b, ",", null, null, 0, null, null, 62, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "webBean", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function2<String, Items<SubMessageBean>, Items<SubMessageBean>> {
        public final /* synthetic */ List<String> a;
        public final /* synthetic */ NoticeType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<String> list, NoticeType noticeType) {
            super(2);
            this.a = list;
            this.b = noticeType;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Items<SubMessageBean> invoke(@Nullable String str, @NotNull Items<SubMessageBean> items) {
            Object next;
            List<SubMessageBean> items2 = items.getItems();
            Object obj = null;
            List<? extends SubMessageBean> mutableList = items2 == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) items2);
            if (mutableList != null) {
                List<String> list = this.a;
                NoticeType noticeType = this.b;
                if (mutableList.size() > 0) {
                    Iterator<T> it2 = mutableList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!TextUtils.equals(((SubMessageBean) next).getStatus(), MessageStatus.NEW.getStatus()));
                    SubMessageBean subMessageBean = (SubMessageBean) next;
                    for (Object obj2 : mutableList) {
                        if (TextUtils.equals(((SubMessageBean) obj2).getStatus(), MessageStatus.READ.getStatus())) {
                            obj = obj2;
                            break;
                        }
                    }
                    SubMessageBean subMessageBean2 = (SubMessageBean) obj;
                    if (TextUtils.isEmpty(str)) {
                        if (subMessageBean != null) {
                            MessageSubType messageSubType = MessageSubType.COMMENT_LATEST;
                            if (list.contains(messageSubType.getValue())) {
                                mutableList.add(0, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 1L, messageSubType.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                            }
                            MessageSubType messageSubType2 = MessageSubType.AGREE_LATEST;
                            if (list.contains(messageSubType2.getValue())) {
                                mutableList.add(0, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 2L, messageSubType2.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                            }
                        }
                        if (subMessageBean == null && subMessageBean2 != null) {
                            MessageSubType messageSubType3 = MessageSubType.COMMENT_HISTORY;
                            if (list.contains(messageSubType3.getValue())) {
                                mutableList.add(0, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 3L, messageSubType3.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                            }
                            MessageSubType messageSubType4 = MessageSubType.AGREE_HISTORY;
                            if (list.contains(messageSubType4.getValue())) {
                                mutableList.add(0, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 4L, messageSubType4.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                            }
                        }
                    }
                    if (subMessageBean2 != null && subMessageBean != null) {
                        int iIndexOf = mutableList.indexOf(subMessageBean2);
                        MessageSubType messageSubType5 = MessageSubType.COMMENT_HISTORY;
                        if (list.contains(messageSubType5.getValue())) {
                            mutableList.add(iIndexOf, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 3L, messageSubType5.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                        }
                        MessageSubType messageSubType6 = MessageSubType.AGREE_HISTORY;
                        if (list.contains(messageSubType6.getValue())) {
                            mutableList.add(iIndexOf, new SubMessageBean((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 4L, messageSubType6.getValue(), (String) null, noticeType.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268075007, (DefaultConstructorMarker) null));
                        }
                    }
                    items.setItems(mutableList);
                }
            }
            return items;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public final /* synthetic */ NoticeType b;
        public final /* synthetic */ List<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(NoticeType noticeType, List<String> list) {
            super(0);
            this.b = noticeType;
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MessageRepo.this.db.messageDao().deleteSubMessagePo(this.b.getValue(), this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ NoticeType b;
        public final /* synthetic */ List<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(NoticeType noticeType, List<String> list) {
            super(0);
            this.b = noticeType;
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return MessageRepo.this.db.messageDao().subMessagePoCount(this.b.getValue(), this.c) == 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "body", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Items<SubMessageBean>, Unit> {
        public m() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MessageRepo messageRepo, List list) {
            messageRepo.db.messageDao().insertSubMessageList(WebBeanToPoExKt.toSubMessagePo((List<SubMessageBean>) list));
        }

        public final void b(@NotNull Items<SubMessageBean> items) {
            final List<SubMessageBean> items2 = items.getItems();
            final MessageRepo messageRepo = MessageRepo.this;
            messageRepo.db.runInTransaction(new Runnable() { // from class: com.huami.message.repo.b
                @Override // java.lang.Runnable
                public final void run() {
                    MessageRepo.m.c(messageRepo, items2);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<SubMessageBean> items) {
            b(items);
            return Unit.INSTANCE;
        }
    }

    public MessageRepo(@NotNull AppExecutors appExecutors, @NotNull MessageDb messageDb, @NotNull MessageWebApi messageWebApi, @NotNull PagingKeyCache pagingKeyCache, @NotNull RelationRepo relationRepo) {
        this.appExecutors = appExecutors;
        this.db = messageDb;
        this.webApi = messageWebApi;
        this.pagingKeyCache = pagingKeyCache;
        this.relationRepo = relationRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrivateMessageItemVo i(PrivateMessagePo privateMessagePo) {
        return PoToVoExKt.toPrivateMessageItemVo(privateMessagePo);
    }

    private final Listing<SubMessageItemVo> j(NoticeType noticeType, List<String> messageSubTypes, List<String> groupSubTypes) {
        return new PagingHelper(this.appExecutors, this.db, this.pagingKeyCache, Intrinsics.stringPlus(PagingKey.MESSAGE_CENTER_LIST_PREFIX, groupSubTypes.isEmpty() ^ true ? groupSubTypes.get(0) : ""), g.a, h.a, new i(noticeType, messageSubTypes, this), new j(groupSubTypes, noticeType), this.db.messageDao().querySubMessageByPaging(noticeType.getValue(), groupSubTypes).map(new Function() { // from class: z15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageRepo.k((SubMessagePo) obj);
            }
        }), new k(noticeType, groupSubTypes), new l(noticeType, groupSubTypes), new m(), null, null, null, 28672, null).getListing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubMessageItemVo k(SubMessagePo subMessagePo) {
        return PoToVoExKt.toSubMessageItemVo(subMessagePo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData l(final MessageRepo messageRepo, final String str, Resource resource) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (Status.LOADING == resource.getStatus()) {
            mediatorLiveData.setValue(Resource.INSTANCE.loading(Boolean.FALSE));
        }
        final Friend friend = (Friend) resource.getData();
        if (Status.SUCCESS == resource.getStatus() && friend != null) {
            messageRepo.appExecutors.getNetworkIO().execute(new Runnable() { // from class: e25
                @Override // java.lang.Runnable
                public final void run() {
                    MessageRepo.m(this.a, str, friend, mediatorLiveData);
                }
            });
        } else if (Status.ERROR == resource.getStatus()) {
            mediatorLiveData.setValue(Resource.INSTANCE.error("error", Boolean.FALSE));
        }
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MessageRepo messageRepo, String str, Friend friend, MediatorLiveData mediatorLiveData) {
        messageRepo.db.messageDao().updateSubMessageForFollowStatus(str, OtherToPoKt.toFollowStatusPo(friend.getFollowStatus()));
        mediatorLiveData.postValue(Resource.INSTANCE.success(Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final MessageRepo messageRepo, final MessageStatus messageStatus) {
        messageRepo.db.runInTransaction(new Runnable() { // from class: a25
            @Override // java.lang.Runnable
            public final void run() {
                MessageRepo.o(this.a, messageStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MessageRepo messageRepo, MessageStatus messageStatus) {
        messageRepo.db.messageDao().updateAllMessageStatus(messageStatus.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final MessageRepo messageRepo, final PrivateMessageItemVo privateMessageItemVo, final MessageStatus messageStatus) {
        messageRepo.db.runInTransaction(new Runnable() { // from class: c25
            @Override // java.lang.Runnable
            public final void run() {
                MessageRepo.q(this.a, privateMessageItemVo, messageStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(MessageRepo messageRepo, PrivateMessageItemVo privateMessageItemVo, MessageStatus messageStatus) {
        messageRepo.db.messageDao().updateMessageStatus(privateMessageItemVo.getId(), messageStatus.name());
    }

    @NotNull
    public final Listing<PrivateMessageItemVo> loadPrivateMessageList() {
        AppExecutors appExecutors = this.appExecutors;
        MessageDb messageDb = this.db;
        PagingKeyCache pagingKeyCache = this.pagingKeyCache;
        DataSource.Factory<Integer, ToValue> map = messageDb.messageDao().queryFullPrivateMessageByPaging().map(new Function() { // from class: y15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageRepo.i((PrivateMessagePo) obj);
            }
        });
        return new PagingHelper(appExecutors, messageDb, pagingKeyCache, PagingKey.MESSAGE_CENTER_LIST, a.a, b.a, new c(), null, map, new d(), new e(), new f(), null, null, null, 28800, null).getListing();
    }

    @NotNull
    public final Listing<SubMessageItemVo> loadSubMessageForComment() {
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(MessageSubType.COMMENT.getValue(), MessageSubType.REPLY_COMMENT.getValue(), MessageSubType.REPLY_SECOND_COMMENT.getValue());
        ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(MessageSubType.COMMENT_LATEST.getValue(), MessageSubType.COMMENT_HISTORY.getValue());
        arrayListArrayListOf2.addAll(arrayListArrayListOf);
        return j(NoticeType.MESSAGE, arrayListArrayListOf, arrayListArrayListOf2);
    }

    @NotNull
    public final Listing<SubMessageItemVo> loadSubMessageForLikes() {
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(MessageSubType.AGREE_POST.getValue(), MessageSubType.AGREE_COMMENT.getValue(), MessageSubType.AGREE_SECOND_COMMENT.getValue(), MessageSubType.COLLECT.getValue(), MessageSubType.FOLLOW.getValue());
        ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(MessageSubType.AGREE_LATEST.getValue(), MessageSubType.AGREE_HISTORY.getValue());
        arrayListArrayListOf2.addAll(arrayListArrayListOf);
        return j(NoticeType.MESSAGE, arrayListArrayListOf, arrayListArrayListOf2);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> postFollowStatus(@NotNull final String userId) {
        return Transformations.switchMap(this.relationRepo.postFollowStatus(userId), new Function() { // from class: x15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageRepo.l(this.a, userId, (Resource) obj);
            }
        });
    }

    public final void updateAllMessageStatus(@NotNull final MessageStatus messageStatus) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: b25
            @Override // java.lang.Runnable
            public final void run() {
                MessageRepo.n(this.a, messageStatus);
            }
        });
    }

    public final void updatePrivateMsgStatus(@NotNull final PrivateMessageItemVo privateMessage, @NotNull final MessageStatus messageStatus) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: d25
            @Override // java.lang.Runnable
            public final void run() {
                MessageRepo.p(this.a, privateMessage, messageStatus);
            }
        });
    }
}
