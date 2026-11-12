package com.huami.message.repo;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiResponse;
import com.huami.message.api.MessageWebApi;
import com.huami.message.api.pojo.Items;
import com.huami.message.api.pojo.NotificationBean;
import com.huami.message.converter.PoToVoExKt;
import com.huami.message.converter.WebBeanToPoExKt;
import com.huami.message.db.MessageDb;
import com.huami.message.db.po.NotificationPo;
import com.huami.message.dto.GroupExType;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.NoticeType;
import com.huami.message.paging.Listing;
import com.huami.message.paging.PagingHelper;
import com.huami.message.paging.PagingKey;
import com.huami.message.paging.PagingKeyCache;
import com.huami.message.repo.NotificationRepo;
import com.huami.message.util.AppExecutors;
import com.huami.message.vo.NotificationItemVo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/message/repo/NotificationRepo;", "", "Lcom/huami/message/paging/Listing;", "Lcom/huami/message/vo/NotificationItemVo;", "loadNotification", "Lcom/huami/message/util/AppExecutors;", "a", "Lcom/huami/message/util/AppExecutors;", "appExecutors", "Lcom/huami/message/db/MessageDb;", "b", "Lcom/huami/message/db/MessageDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/message/api/MessageWebApi;", "c", "Lcom/huami/message/api/MessageWebApi;", "webApi", "Lcom/huami/message/paging/PagingKeyCache;", GoogleApiAvailabilityLight.a, "Lcom/huami/message/paging/PagingKeyCache;", "pagingKeyCache", "<init>", "(Lcom/huami/message/util/AppExecutors;Lcom/huami/message/db/MessageDb;Lcom/huami/message/api/MessageWebApi;Lcom/huami/message/paging/PagingKeyCache;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationRepo {

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/NotificationBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Items<NotificationBean>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Items<NotificationBean> items) {
            return items.getNext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/NotificationBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Items<NotificationBean>, Integer> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final int a(@NotNull Items<NotificationBean> items) {
            return items.getItems().size();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Items<NotificationBean> items) {
            return Integer.valueOf(a(items));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/NotificationBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, ApiResponse<Items<NotificationBean>>> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiResponse<Items<NotificationBean>> invoke(@Nullable String str) {
            return NotificationRepo.this.webApi.loadNotification(str, 10, "NEW,READ", NoticeType.NOTICE.getValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"", "nextPageKey", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/NotificationBean;", "webBean", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<String, Items<NotificationBean>, Items<NotificationBean>> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Items<NotificationBean> invoke(@Nullable String str, @NotNull Items<NotificationBean> items) {
            Object obj;
            Object next;
            List<? extends NotificationBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) items.getItems());
            if (mutableList.size() > 0) {
                Iterator<T> it2 = mutableList.iterator();
                do {
                    obj = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!TextUtils.equals(((NotificationBean) next).getStatus(), MessageStatus.NEW.getStatus()));
                NotificationBean notificationBean = (NotificationBean) next;
                for (Object obj2 : mutableList) {
                    if (TextUtils.equals(((NotificationBean) obj2).getStatus(), MessageStatus.READ.getStatus())) {
                        obj = obj2;
                        break;
                    }
                }
                NotificationBean notificationBean2 = (NotificationBean) obj;
                if (TextUtils.isEmpty(str)) {
                    if (notificationBean != null) {
                        mutableList.add(0, new NotificationBean(5L, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, GroupExType.NOTICE_LATEST.getValue(), (String) null, (String) null, 14334, (DefaultConstructorMarker) null));
                    }
                    if (notificationBean == null && notificationBean2 != null) {
                        mutableList.add(0, new NotificationBean(6L, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, GroupExType.NOTICE_HISTORY.getValue(), (String) null, (String) null, 14334, (DefaultConstructorMarker) null));
                    }
                }
                if (notificationBean2 != null && notificationBean != null) {
                    mutableList.add(mutableList.indexOf(notificationBean2), new NotificationBean(4L, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, GroupExType.NOTICE_HISTORY.getValue(), (String) null, (String) null, 14334, (DefaultConstructorMarker) null));
                }
                items.setItems(mutableList);
            }
            return items;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NotificationRepo.this.db.messageDao().deleteNotificationPo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return NotificationRepo.this.db.messageDao().notificationPoCount() == 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/NotificationBean;", "body", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Items<NotificationBean>, Unit> {
        public g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(NotificationRepo notificationRepo, List list) {
            notificationRepo.db.messageDao().insertNotificationList(WebBeanToPoExKt.toNotificationPo((List<NotificationBean>) list));
        }

        public final void b(@NotNull Items<NotificationBean> items) {
            final List<NotificationBean> items2 = items.getItems();
            final NotificationRepo notificationRepo = NotificationRepo.this;
            notificationRepo.db.runInTransaction(new Runnable() { // from class: com.huami.message.repo.c
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationRepo.g.c(notificationRepo, items2);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Items<NotificationBean> items) {
            b(items);
            return Unit.INSTANCE;
        }
    }

    public NotificationRepo(@NotNull AppExecutors appExecutors, @NotNull MessageDb messageDb, @NotNull MessageWebApi messageWebApi, @NotNull PagingKeyCache pagingKeyCache) {
        this.appExecutors = appExecutors;
        this.db = messageDb;
        this.webApi = messageWebApi;
        this.pagingKeyCache = pagingKeyCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationItemVo b(NotificationPo notificationPo) {
        return PoToVoExKt.toNotificationItemVo(notificationPo);
    }

    @NotNull
    public final Listing<NotificationItemVo> loadNotification() {
        AppExecutors appExecutors = this.appExecutors;
        MessageDb messageDb = this.db;
        PagingKeyCache pagingKeyCache = this.pagingKeyCache;
        DataSource.Factory<Integer, ToValue> map = messageDb.messageDao().queryNotificationByPaging().map(new Function() { // from class: ih5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return NotificationRepo.b((NotificationPo) obj);
            }
        });
        return new PagingHelper(appExecutors, messageDb, pagingKeyCache, PagingKey.NOTIFICATION_LIST, a.a, b.a, new c(), d.a, map, new e(), new f(), new g(), null, null, null, 28672, null).getListing();
    }
}
