package com.garmin.android.apps.connectmobile.notifications.model;

import am.j;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.o;
import b12.b;
import fb1.c;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;
import u4.d;
import ue0.n;
import uz0.g;
import uz0.m;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "", "<init>", "()V", "", "getViewTypeId", "()I", "viewTypeId", "Companion", "b", "Header", "Request", "RequestsEntry", "Activity", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Header;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$RequestsEntry;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class NotificationItem {
    public static final int $stable = 0;
    public static final int ACTIVITY_VIEW_TYPE_ID = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final o.f<NotificationItem> DIFF_CALLBACK = new a();
    public static final int HEADER_VIEW_TYPE_ID = 0;
    public static final int REQUESTS_ENTRY_VIEW_TYPE_ID = 3;
    public static final int REQUEST_VIEW_TYPE_ID = 1;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Header;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewTypeId", "", "getViewTypeId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Header extends NotificationItem {
        public static final int $stable = 0;
        private final String title;
        private final int viewTypeId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(String str) {
            super(null);
            str.getClass();
            this.title = str;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = header.title;
            }
            return header.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Header copy(String title) {
            title.getClass();
            return new Header(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && s.g(this.title, ((Header) other).title);
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // com.garmin.android.apps.connectmobile.notifications.model.NotificationItem
        public int getViewTypeId() {
            return this.viewTypeId;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return j.m("Header(title=", this.title, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/notifications/model/NotificationItem$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o.f<NotificationItem> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(NotificationItem notificationItem, NotificationItem notificationItem2) {
            NotificationItem notificationItem3 = notificationItem;
            NotificationItem notificationItem4 = notificationItem2;
            notificationItem3.getClass();
            notificationItem4.getClass();
            if ((notificationItem3 instanceof Activity) && (notificationItem4 instanceof Activity)) {
                return s.g(((Activity) notificationItem3).getViewState(), ((Activity) notificationItem4).getViewState());
            }
            if (!(notificationItem3 instanceof RequestsEntry) || !(notificationItem4 instanceof RequestsEntry)) {
                return ((notificationItem3 instanceof Request) && (notificationItem4 instanceof Request)) ? s.g(((Request) notificationItem3).getViewState(), ((Request) notificationItem4).getViewState()) : notificationItem3.equals(notificationItem4);
            }
            RequestsEntry requestsEntry = (RequestsEntry) notificationItem3;
            RequestsEntry requestsEntry2 = (RequestsEntry) notificationItem4;
            return requestsEntry.getRequestCount() == requestsEntry2.getRequestCount() && s.g(requestsEntry.getProfileImageDataList(), requestsEntry2.getProfileImageDataList());
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(NotificationItem notificationItem, NotificationItem notificationItem2) {
            NotificationItem notificationItem3 = notificationItem;
            NotificationItem notificationItem4 = notificationItem2;
            notificationItem3.getClass();
            notificationItem4.getClass();
            if (notificationItem3.getViewTypeId() != notificationItem4.getViewTypeId()) {
                return false;
            }
            if ((notificationItem3 instanceof Activity) && (notificationItem4 instanceof Activity)) {
                return s.g(((Activity) notificationItem3).getNotificationFullItemDTO(), ((Activity) notificationItem4).getNotificationFullItemDTO());
            }
            if ((notificationItem3 instanceof RequestsEntry) && (notificationItem4 instanceof RequestsEntry)) {
                RequestsEntry requestsEntry = (RequestsEntry) notificationItem3;
                RequestsEntry requestsEntry2 = (RequestsEntry) notificationItem4;
                return requestsEntry.getRequestCount() == requestsEntry2.getRequestCount() && s.g(requestsEntry.getProfileImageDataList(), requestsEntry2.getProfileImageDataList());
            }
            if ((notificationItem3 instanceof Request) && (notificationItem4 instanceof Request)) {
                Request request = (Request) notificationItem3;
                if (request.getRequestNotificationDTO() != null) {
                    Request request2 = (Request) notificationItem4;
                    if (request2.getRequestNotificationDTO() != null) {
                        return s.g(request.getRequestNotificationDTO(), request2.getRequestNotificationDTO());
                    }
                }
                if (request.getInboxGroupInviteRequestDTO() != null) {
                    Request request3 = (Request) notificationItem4;
                    if (request3.getInboxGroupInviteRequestDTO() != null) {
                        return s.g(request.getInboxGroupInviteRequestDTO(), request3.getInboxGroupInviteRequestDTO());
                    }
                }
                if (request.getAccountSharingInviteDTO() != null) {
                    Request request4 = (Request) notificationItem4;
                    if (request4.getAccountSharingInviteDTO() != null) {
                        return s.g(request.getAccountSharingInviteDTO(), request4.getAccountSharingInviteDTO());
                    }
                }
                if (request.getDeviceInviteDTO() != null) {
                    Request request5 = (Request) notificationItem4;
                    if (request5.getDeviceInviteDTO() != null) {
                        return s.g(request.getDeviceInviteDTO(), request5.getDeviceInviteDTO());
                    }
                }
            }
            return notificationItem3.equals(notificationItem4);
        }
    }

    public /* synthetic */ NotificationItem(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract int getViewTypeId();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.notifications.model.NotificationItem$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$b;", "", "<init>", "()V", "", "HEADER_VIEW_TYPE_ID", "I", "REQUEST_VIEW_TYPE_ID", "ACTIVITY_VIEW_TYPE_ID", "REQUESTS_ENTRY_VIEW_TYPE_ID", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    private NotificationItem() {
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010!\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$RequestsEntry;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "", "Lb12/b;", "profileImageDataList", "", "hasUnreadRequest", "", "requestCount", "<init>", "(Ljava/util/List;ZI)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()I", "copy", "(Ljava/util/List;ZI)Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$RequestsEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProfileImageDataList", "Z", "getHasUnreadRequest", "I", "getRequestCount", "viewTypeId", "getViewTypeId", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestsEntry extends NotificationItem {
        public static final int $stable = 8;
        private final boolean hasUnreadRequest;
        private final List<b> profileImageDataList;
        private final int requestCount;
        private final int viewTypeId;

        public RequestsEntry(List list, boolean z14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? j0.f134944a : list, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? 0 : i14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestsEntry copy$default(RequestsEntry requestsEntry, List list, boolean z14, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = requestsEntry.profileImageDataList;
            }
            if ((i15 & 2) != 0) {
                z14 = requestsEntry.hasUnreadRequest;
            }
            if ((i15 & 4) != 0) {
                i14 = requestsEntry.requestCount;
            }
            return requestsEntry.copy(list, z14, i14);
        }

        public final List<b> component1() {
            return this.profileImageDataList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasUnreadRequest() {
            return this.hasUnreadRequest;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getRequestCount() {
            return this.requestCount;
        }

        public final RequestsEntry copy(List<b> profileImageDataList, boolean hasUnreadRequest, int requestCount) {
            profileImageDataList.getClass();
            return new RequestsEntry(profileImageDataList, hasUnreadRequest, requestCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestsEntry)) {
                return false;
            }
            RequestsEntry requestsEntry = (RequestsEntry) other;
            return s.g(this.profileImageDataList, requestsEntry.profileImageDataList) && this.hasUnreadRequest == requestsEntry.hasUnreadRequest && this.requestCount == requestsEntry.requestCount;
        }

        public final boolean getHasUnreadRequest() {
            return this.hasUnreadRequest;
        }

        public final List<b> getProfileImageDataList() {
            return this.profileImageDataList;
        }

        public final int getRequestCount() {
            return this.requestCount;
        }

        @Override // com.garmin.android.apps.connectmobile.notifications.model.NotificationItem
        public int getViewTypeId() {
            return this.viewTypeId;
        }

        public int hashCode() {
            return Integer.hashCode(this.requestCount) + f.g(this.profileImageDataList.hashCode() * 31, 31, this.hasUnreadRequest);
        }

        public String toString() {
            List<b> list = this.profileImageDataList;
            boolean z14 = this.hasUnreadRequest;
            int i14 = this.requestCount;
            StringBuilder sb3 = new StringBuilder("RequestsEntry(profileImageDataList=");
            sb3.append(list);
            sb3.append(", hasUnreadRequest=");
            sb3.append(z14);
            sb3.append(", requestCount=");
            return j.q(sb3, i14, ")");
        }

        public RequestsEntry() {
            this(null, false, 0, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestsEntry(List<b> list, boolean z14, int i14) {
            super(null);
            list.getClass();
            this.profileImageDataList = list;
            this.hasUnreadRequest = z14;
            this.requestCount = i14;
            this.viewTypeId = 3;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJX\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b8\u0010\u001cR\u001a\u00109\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010%¨\u0006="}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "Lb12/b;", "userProfileImageData", "", "titleText", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;", "viewState", "Luz0/g;", "notificationFullItemDTO", "Lu4/d;", "iconVector", "", "displayFullTitle", "displayIcon", "<init>", "(Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;Luz0/g;Lu4/d;ZZ)V", "component1", "()Lb12/b;", "component2", "()Ljava/lang/CharSequence;", "component3", "()Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;", "component4", "()Luz0/g;", "component5", "()Lu4/d;", "component6", "()Z", "component7", "copy", "(Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;Luz0/g;Lu4/d;ZZ)Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitleText", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;", "getViewState", "setViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;)V", "Luz0/g;", "getNotificationFullItemDTO", "Lu4/d;", "getIconVector", "Z", "getDisplayFullTitle", "getDisplayIcon", "viewTypeId", "I", "getViewTypeId", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Activity extends NotificationItem {
        public static final int $stable = 8;
        private final boolean displayFullTitle;
        private final boolean displayIcon;
        private final d iconVector;
        private final g notificationFullItemDTO;
        private final CharSequence titleText;
        private final b userProfileImageData;
        private a viewState;
        private final int viewTypeId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(b bVar, CharSequence charSequence, a aVar, g gVar, d dVar, boolean z14, boolean z15) {
            super(null);
            bVar.getClass();
            charSequence.getClass();
            aVar.getClass();
            gVar.getClass();
            this.userProfileImageData = bVar;
            this.titleText = charSequence;
            this.viewState = aVar;
            this.notificationFullItemDTO = gVar;
            this.iconVector = dVar;
            this.displayFullTitle = z14;
            this.displayIcon = z15;
            this.viewTypeId = 2;
        }

        public static /* synthetic */ Activity copy$default(Activity activity, b bVar, CharSequence charSequence, a aVar, g gVar, d dVar, boolean z14, boolean z15, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = activity.userProfileImageData;
            }
            if ((i14 & 2) != 0) {
                charSequence = activity.titleText;
            }
            if ((i14 & 4) != 0) {
                aVar = activity.viewState;
            }
            if ((i14 & 8) != 0) {
                gVar = activity.notificationFullItemDTO;
            }
            if ((i14 & 16) != 0) {
                dVar = activity.iconVector;
            }
            if ((i14 & 32) != 0) {
                z14 = activity.displayFullTitle;
            }
            if ((i14 & 64) != 0) {
                z15 = activity.displayIcon;
            }
            boolean z16 = z14;
            boolean z17 = z15;
            d dVar2 = dVar;
            a aVar2 = aVar;
            return activity.copy(bVar, charSequence, aVar2, gVar, dVar2, z16, z17);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getTitleText() {
            return this.titleText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final a getViewState() {
            return this.viewState;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final g getNotificationFullItemDTO() {
            return this.notificationFullItemDTO;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final d getIconVector() {
            return this.iconVector;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getDisplayFullTitle() {
            return this.displayFullTitle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getDisplayIcon() {
            return this.displayIcon;
        }

        public final Activity copy(b userProfileImageData, CharSequence titleText, a viewState, g notificationFullItemDTO, d iconVector, boolean displayFullTitle, boolean displayIcon) {
            userProfileImageData.getClass();
            titleText.getClass();
            viewState.getClass();
            notificationFullItemDTO.getClass();
            return new Activity(userProfileImageData, titleText, viewState, notificationFullItemDTO, iconVector, displayFullTitle, displayIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) other;
            return s.g(this.userProfileImageData, activity.userProfileImageData) && s.g(this.titleText, activity.titleText) && s.g(this.viewState, activity.viewState) && s.g(this.notificationFullItemDTO, activity.notificationFullItemDTO) && s.g(this.iconVector, activity.iconVector) && this.displayFullTitle == activity.displayFullTitle && this.displayIcon == activity.displayIcon;
        }

        public final boolean getDisplayFullTitle() {
            return this.displayFullTitle;
        }

        public final boolean getDisplayIcon() {
            return this.displayIcon;
        }

        public final d getIconVector() {
            return this.iconVector;
        }

        public final g getNotificationFullItemDTO() {
            return this.notificationFullItemDTO;
        }

        public final CharSequence getTitleText() {
            return this.titleText;
        }

        public final b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public final a getViewState() {
            return this.viewState;
        }

        @Override // com.garmin.android.apps.connectmobile.notifications.model.NotificationItem
        public int getViewTypeId() {
            return this.viewTypeId;
        }

        public int hashCode() {
            int iHashCode = (this.notificationFullItemDTO.hashCode() + ((this.viewState.hashCode() + ((this.titleText.hashCode() + (this.userProfileImageData.hashCode() * 31)) * 31)) * 31)) * 31;
            d dVar = this.iconVector;
            return Boolean.hashCode(this.displayIcon) + f.g((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.displayFullTitle);
        }

        public final void setViewState(a aVar) {
            aVar.getClass();
            this.viewState = aVar;
        }

        public String toString() {
            b bVar = this.userProfileImageData;
            CharSequence charSequence = this.titleText;
            a aVar = this.viewState;
            g gVar = this.notificationFullItemDTO;
            d dVar = this.iconVector;
            boolean z14 = this.displayFullTitle;
            boolean z15 = this.displayIcon;
            StringBuilder sb3 = new StringBuilder("Activity(userProfileImageData=");
            sb3.append(bVar);
            sb3.append(", titleText=");
            sb3.append((Object) charSequence);
            sb3.append(", viewState=");
            sb3.append(aVar);
            sb3.append(", notificationFullItemDTO=");
            sb3.append(gVar);
            sb3.append(", iconVector=");
            sb3.append(dVar);
            sb3.append(", displayFullTitle=");
            sb3.append(z14);
            sb3.append(", displayIcon=");
            return hb.a.k(sb3, z15, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Activity$a;", "", "", "dateTime", "dateTimeContentDescription", "", "pendingDelete", "viewed", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f39548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f39549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f39550c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Boolean f39551d;

            public /* synthetic */ a(String str, String str2, boolean z14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? Boolean.FALSE : bool);
            }

            public static a a(a aVar, boolean z14) {
                String str = aVar.f39548a;
                String str2 = aVar.f39549b;
                Boolean bool = aVar.f39551d;
                aVar.getClass();
                return new a(str, str2, z14, bool);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return s.g(this.f39548a, aVar.f39548a) && s.g(this.f39549b, aVar.f39549b) && this.f39550c == aVar.f39550c && s.g(this.f39551d, aVar.f39551d);
            }

            public final int hashCode() {
                String str = this.f39548a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f39549b;
                int iG = f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f39550c);
                Boolean bool = this.f39551d;
                return iG + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = p6.b.i("ViewState(dateTime=", this.f39548a, ", dateTimeContentDescription=", this.f39549b, ", pendingDelete=");
                sbI.append(this.f39550c);
                sbI.append(", viewed=");
                sbI.append(this.f39551d);
                sbI.append(")");
                return sbI.toString();
            }

            public a(String str, String str2, boolean z14, Boolean bool) {
                this.f39548a = str;
                this.f39549b = str2;
                this.f39550c = z14;
                this.f39551d = bool;
            }

            public a() {
                this(null, null, false, null, 15, null);
            }
        }

        public /* synthetic */ Activity(b bVar, CharSequence charSequence, a aVar, g gVar, d dVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, charSequence, aVar, gVar, dVar, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? true : z15);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001HB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u00108R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010#R\u001a\u0010E\u001a\u00020)8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010+¨\u0006I"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "Lb12/b;", "userProfileImageData", "", "titleText", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;", "viewState", "Lvz0/b;", "requestKey", "Luz0/m;", "requestNotificationDTO", "Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "deviceInviteDTO", "Luz0/b;", "inboxGroupInviteRequestDTO", "Lue0/n;", "accountSharingInviteDTO", "<init>", "(Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;Lvz0/b;Luz0/m;Lcom/garmin/android/apps/connectmobile/smartscale/model/b;Luz0/b;Lue0/n;)V", "component1", "()Lb12/b;", "component2", "()Ljava/lang/CharSequence;", "component3", "()Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;", "component4", "()Lvz0/b;", "component5", "()Luz0/m;", "component6", "()Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "component7", "()Luz0/b;", "component8", "()Lue0/n;", "copy", "(Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;Lvz0/b;Luz0/m;Lcom/garmin/android/apps/connectmobile/smartscale/model/b;Luz0/b;Lue0/n;)Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitleText", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;", "getViewState", "setViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;)V", "Lvz0/b;", "getRequestKey", "setRequestKey", "(Lvz0/b;)V", "Luz0/m;", "getRequestNotificationDTO", "Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "getDeviceInviteDTO", "Luz0/b;", "getInboxGroupInviteRequestDTO", "Lue0/n;", "getAccountSharingInviteDTO", "viewTypeId", "I", "getViewTypeId", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request extends NotificationItem {
        public static final int $stable = 8;
        private final n accountSharingInviteDTO;
        private final com.garmin.android.apps.connectmobile.smartscale.model.b deviceInviteDTO;
        private final uz0.b inboxGroupInviteRequestDTO;
        private vz0.b requestKey;
        private final m requestNotificationDTO;
        private final CharSequence titleText;
        private final b userProfileImageData;
        private a viewState;
        private final int viewTypeId;

        public /* synthetic */ Request(b bVar, CharSequence charSequence, a aVar, vz0.b bVar2, m mVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar3, uz0.b bVar4, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, charSequence, aVar, (i14 & 8) != 0 ? null : bVar2, (i14 & 16) != 0 ? null : mVar, (i14 & 32) != 0 ? null : bVar3, (i14 & 64) != 0 ? null : bVar4, (i14 & 128) != 0 ? null : nVar);
        }

        public static /* synthetic */ Request copy$default(Request request, b bVar, CharSequence charSequence, a aVar, vz0.b bVar2, m mVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar3, uz0.b bVar4, n nVar, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = request.userProfileImageData;
            }
            if ((i14 & 2) != 0) {
                charSequence = request.titleText;
            }
            if ((i14 & 4) != 0) {
                aVar = request.viewState;
            }
            if ((i14 & 8) != 0) {
                bVar2 = request.requestKey;
            }
            if ((i14 & 16) != 0) {
                mVar = request.requestNotificationDTO;
            }
            if ((i14 & 32) != 0) {
                bVar3 = request.deviceInviteDTO;
            }
            if ((i14 & 64) != 0) {
                bVar4 = request.inboxGroupInviteRequestDTO;
            }
            if ((i14 & 128) != 0) {
                nVar = request.accountSharingInviteDTO;
            }
            uz0.b bVar5 = bVar4;
            n nVar2 = nVar;
            m mVar2 = mVar;
            com.garmin.android.apps.connectmobile.smartscale.model.b bVar6 = bVar3;
            return request.copy(bVar, charSequence, aVar, bVar2, mVar2, bVar6, bVar5, nVar2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getTitleText() {
            return this.titleText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final a getViewState() {
            return this.viewState;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final vz0.b getRequestKey() {
            return this.requestKey;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final m getRequestNotificationDTO() {
            return this.requestNotificationDTO;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final com.garmin.android.apps.connectmobile.smartscale.model.b getDeviceInviteDTO() {
            return this.deviceInviteDTO;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final uz0.b getInboxGroupInviteRequestDTO() {
            return this.inboxGroupInviteRequestDTO;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final n getAccountSharingInviteDTO() {
            return this.accountSharingInviteDTO;
        }

        public final Request copy(b userProfileImageData, CharSequence titleText, a viewState, vz0.b requestKey, m requestNotificationDTO, com.garmin.android.apps.connectmobile.smartscale.model.b deviceInviteDTO, uz0.b inboxGroupInviteRequestDTO, n accountSharingInviteDTO) {
            userProfileImageData.getClass();
            titleText.getClass();
            viewState.getClass();
            return new Request(userProfileImageData, titleText, viewState, requestKey, requestNotificationDTO, deviceInviteDTO, inboxGroupInviteRequestDTO, accountSharingInviteDTO);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return s.g(this.userProfileImageData, request.userProfileImageData) && s.g(this.titleText, request.titleText) && s.g(this.viewState, request.viewState) && this.requestKey == request.requestKey && s.g(this.requestNotificationDTO, request.requestNotificationDTO) && s.g(this.deviceInviteDTO, request.deviceInviteDTO) && s.g(this.inboxGroupInviteRequestDTO, request.inboxGroupInviteRequestDTO) && s.g(this.accountSharingInviteDTO, request.accountSharingInviteDTO);
        }

        public final n getAccountSharingInviteDTO() {
            return this.accountSharingInviteDTO;
        }

        public final com.garmin.android.apps.connectmobile.smartscale.model.b getDeviceInviteDTO() {
            return this.deviceInviteDTO;
        }

        public final uz0.b getInboxGroupInviteRequestDTO() {
            return this.inboxGroupInviteRequestDTO;
        }

        public final vz0.b getRequestKey() {
            return this.requestKey;
        }

        public final m getRequestNotificationDTO() {
            return this.requestNotificationDTO;
        }

        public final CharSequence getTitleText() {
            return this.titleText;
        }

        public final b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public final a getViewState() {
            return this.viewState;
        }

        @Override // com.garmin.android.apps.connectmobile.notifications.model.NotificationItem
        public int getViewTypeId() {
            return this.viewTypeId;
        }

        public int hashCode() {
            int iHashCode = (this.viewState.hashCode() + ((this.titleText.hashCode() + (this.userProfileImageData.hashCode() * 31)) * 31)) * 31;
            vz0.b bVar = this.requestKey;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            m mVar = this.requestNotificationDTO;
            int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            com.garmin.android.apps.connectmobile.smartscale.model.b bVar2 = this.deviceInviteDTO;
            int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            uz0.b bVar3 = this.inboxGroupInviteRequestDTO;
            int iHashCode5 = (iHashCode4 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
            n nVar = this.accountSharingInviteDTO;
            return iHashCode5 + (nVar != null ? nVar.hashCode() : 0);
        }

        public final void setRequestKey(vz0.b bVar) {
            this.requestKey = bVar;
        }

        public final void setViewState(a aVar) {
            aVar.getClass();
            this.viewState = aVar;
        }

        public String toString() {
            b bVar = this.userProfileImageData;
            CharSequence charSequence = this.titleText;
            return "Request(userProfileImageData=" + bVar + ", titleText=" + ((Object) charSequence) + ", viewState=" + this.viewState + ", requestKey=" + this.requestKey + ", requestNotificationDTO=" + this.requestNotificationDTO + ", deviceInviteDTO=" + this.deviceInviteDTO + ", inboxGroupInviteRequestDTO=" + this.inboxGroupInviteRequestDTO + ", accountSharingInviteDTO=" + this.accountSharingInviteDTO + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(b bVar, CharSequence charSequence, a aVar, vz0.b bVar2, m mVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar3, uz0.b bVar4, n nVar) {
            super(null);
            bVar.getClass();
            charSequence.getClass();
            aVar.getClass();
            this.userProfileImageData = bVar;
            this.titleText = charSequence;
            this.viewState = aVar;
            this.requestKey = bVar2;
            this.requestNotificationDTO = mVar;
            this.deviceInviteDTO = bVar3;
            this.inboxGroupInviteRequestDTO = bVar4;
            this.accountSharingInviteDTO = nVar;
            this.viewTypeId = 1;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request$a;", "", "", "infoText", "actionStateText", "actionPositiveText", "actionNegativeText", "", "showActionButton", "dateTimeText", "requestViewed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f39552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f39553b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f39554c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f39555d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f39556e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f39557f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Boolean f39558g;

            public /* synthetic */ a(String str, String str2, String str3, String str4, boolean z14, String str5, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : bool);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return s.g(this.f39552a, aVar.f39552a) && s.g(this.f39553b, aVar.f39553b) && s.g(this.f39554c, aVar.f39554c) && s.g(this.f39555d, aVar.f39555d) && this.f39556e == aVar.f39556e && s.g(this.f39557f, aVar.f39557f) && s.g(this.f39558g, aVar.f39558g);
            }

            public final int hashCode() {
                String str = this.f39552a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f39553b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f39554c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f39555d;
                int iG = f.g((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f39556e);
                String str5 = this.f39557f;
                int iHashCode4 = (iG + (str5 == null ? 0 : str5.hashCode())) * 31;
                Boolean bool = this.f39558g;
                return iHashCode4 + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = p6.b.i("ViewState(infoText=", this.f39552a, ", actionStateText=", this.f39553b, ", actionPositiveText=");
                sn.a.t(sbI, this.f39554c, ", actionNegativeText=", this.f39555d, ", showActionButton=");
                c.w(", dateTimeText=", this.f39557f, ", requestViewed=", sbI, this.f39556e);
                return p6.b.f(sbI, this.f39558g, ")");
            }

            public a(String str, String str2, String str3, String str4, boolean z14, String str5, Boolean bool) {
                this.f39552a = str;
                this.f39553b = str2;
                this.f39554c = str3;
                this.f39555d = str4;
                this.f39556e = z14;
                this.f39557f = str5;
                this.f39558g = bool;
            }
        }
    }
}
