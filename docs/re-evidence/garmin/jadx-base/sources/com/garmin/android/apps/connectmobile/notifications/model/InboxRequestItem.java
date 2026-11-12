package com.garmin.android.apps.connectmobile.notifications.model;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import ue0.n;
import uz0.m;
import v.h;
import vz0.b;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006 !\"#$%B1\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0001\u0004&'()¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "T", "", "", "titleText", "Lb12/b;", "userProfileImageDataInItem", "Lvz0/b;", "requestKey", "inboxRequestDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "viewState", "<init>", "(Ljava/lang/CharSequence;Lb12/b;Lvz0/b;Ljava/lang/Object;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "Lb12/b;", "getUserProfileImageDataInItem", "()Lb12/b;", "Lvz0/b;", "getRequestKey", "()Lvz0/b;", "Ljava/lang/Object;", "getInboxRequestDTO", "()Ljava/lang/Object;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "getViewState", "()Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "setViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "Companion", "InboxGroupInviteRequest", "FollowRequest", "DeviceInviteRequest", "AuthorizedViewerInvites", "ViewState", "b", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$AuthorizedViewerInvites;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$DeviceInviteRequest;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$FollowRequest;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$InboxGroupInviteRequest;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class InboxRequestItem<T> {
    private final T inboxRequestDTO;
    private final b requestKey;
    private final CharSequence titleText;
    private final b12.b userProfileImageDataInItem;
    private ViewState viewState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final o.f<InboxRequestItem<?>> DIFF_CALLBACK = new a();

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$AuthorizedViewerInvites;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Lue0/n;", "Lvz0/b;", "inboxRequest", "Lb12/b;", "userProfileImageData", "", "title", "dataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "itemViewState", "<init>", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Lue0/n;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "component1", "()Lvz0/b;", "component2", "()Lb12/b;", "component3", "()Ljava/lang/CharSequence;", "component4", "()Lue0/n;", "component5", "()Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "copy", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Lue0/n;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$AuthorizedViewerInvites;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvz0/b;", "getInboxRequest", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitle", "Lue0/n;", "getDataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "getItemViewState", "setItemViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthorizedViewerInvites extends InboxRequestItem<n> {
        public static final int $stable = 8;
        private final n dataDTO;
        private final b inboxRequest;
        private ViewState itemViewState;
        private final CharSequence title;
        private final b12.b userProfileImageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizedViewerInvites(b bVar, b12.b bVar2, CharSequence charSequence, n nVar, ViewState viewState) {
            super(charSequence, bVar2, bVar, nVar, viewState, null);
            bVar.getClass();
            bVar2.getClass();
            charSequence.getClass();
            nVar.getClass();
            viewState.getClass();
            this.inboxRequest = bVar;
            this.userProfileImageData = bVar2;
            this.title = charSequence;
            this.dataDTO = nVar;
            this.itemViewState = viewState;
        }

        public static /* synthetic */ AuthorizedViewerInvites copy$default(AuthorizedViewerInvites authorizedViewerInvites, b bVar, b12.b bVar2, CharSequence charSequence, n nVar, ViewState viewState, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = authorizedViewerInvites.inboxRequest;
            }
            if ((i14 & 2) != 0) {
                bVar2 = authorizedViewerInvites.userProfileImageData;
            }
            if ((i14 & 4) != 0) {
                charSequence = authorizedViewerInvites.title;
            }
            if ((i14 & 8) != 0) {
                nVar = authorizedViewerInvites.dataDTO;
            }
            if ((i14 & 16) != 0) {
                viewState = authorizedViewerInvites.itemViewState;
            }
            ViewState viewState2 = viewState;
            CharSequence charSequence2 = charSequence;
            return authorizedViewerInvites.copy(bVar, bVar2, charSequence2, nVar, viewState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final n getDataDTO() {
            return this.dataDTO;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final AuthorizedViewerInvites copy(b inboxRequest, b12.b userProfileImageData, CharSequence title, n dataDTO, ViewState itemViewState) {
            inboxRequest.getClass();
            userProfileImageData.getClass();
            title.getClass();
            dataDTO.getClass();
            itemViewState.getClass();
            return new AuthorizedViewerInvites(inboxRequest, userProfileImageData, title, dataDTO, itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizedViewerInvites)) {
                return false;
            }
            AuthorizedViewerInvites authorizedViewerInvites = (AuthorizedViewerInvites) other;
            return this.inboxRequest == authorizedViewerInvites.inboxRequest && s.g(this.userProfileImageData, authorizedViewerInvites.userProfileImageData) && s.g(this.title, authorizedViewerInvites.title) && s.g(this.dataDTO, authorizedViewerInvites.dataDTO) && s.g(this.itemViewState, authorizedViewerInvites.itemViewState);
        }

        public final n getDataDTO() {
            return this.dataDTO;
        }

        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public int hashCode() {
            return this.itemViewState.hashCode() + ((this.dataDTO.hashCode() + ((this.title.hashCode() + ((this.userProfileImageData.hashCode() + (this.inboxRequest.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final void setItemViewState(ViewState viewState) {
            viewState.getClass();
            this.itemViewState = viewState;
        }

        public String toString() {
            b bVar = this.inboxRequest;
            b12.b bVar2 = this.userProfileImageData;
            CharSequence charSequence = this.title;
            return "AuthorizedViewerInvites(inboxRequest=" + bVar + ", userProfileImageData=" + bVar2 + ", title=" + ((Object) charSequence) + ", dataDTO=" + this.dataDTO + ", itemViewState=" + this.itemViewState + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$DeviceInviteRequest;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "Lvz0/b;", "inboxRequest", "Lb12/b;", "userProfileImageData", "", "title", "dataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "itemViewState", "<init>", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/smartscale/model/b;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "component1", "()Lvz0/b;", "component2", "()Lb12/b;", "component3", "()Ljava/lang/CharSequence;", "component4", "()Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "component5", "()Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "copy", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Lcom/garmin/android/apps/connectmobile/smartscale/model/b;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$DeviceInviteRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvz0/b;", "getInboxRequest", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitle", "Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "getDataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "getItemViewState", "setItemViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceInviteRequest extends InboxRequestItem<com.garmin.android.apps.connectmobile.smartscale.model.b> {
        public static final int $stable = 8;
        private final com.garmin.android.apps.connectmobile.smartscale.model.b dataDTO;
        private final b inboxRequest;
        private ViewState itemViewState;
        private final CharSequence title;
        private final b12.b userProfileImageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceInviteRequest(b bVar, b12.b bVar2, CharSequence charSequence, com.garmin.android.apps.connectmobile.smartscale.model.b bVar3, ViewState viewState) {
            super(charSequence, bVar2, bVar, bVar3, viewState, null);
            bVar.getClass();
            bVar2.getClass();
            charSequence.getClass();
            bVar3.getClass();
            viewState.getClass();
            this.inboxRequest = bVar;
            this.userProfileImageData = bVar2;
            this.title = charSequence;
            this.dataDTO = bVar3;
            this.itemViewState = viewState;
        }

        public static /* synthetic */ DeviceInviteRequest copy$default(DeviceInviteRequest deviceInviteRequest, b bVar, b12.b bVar2, CharSequence charSequence, com.garmin.android.apps.connectmobile.smartscale.model.b bVar3, ViewState viewState, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = deviceInviteRequest.inboxRequest;
            }
            if ((i14 & 2) != 0) {
                bVar2 = deviceInviteRequest.userProfileImageData;
            }
            if ((i14 & 4) != 0) {
                charSequence = deviceInviteRequest.title;
            }
            if ((i14 & 8) != 0) {
                bVar3 = deviceInviteRequest.dataDTO;
            }
            if ((i14 & 16) != 0) {
                viewState = deviceInviteRequest.itemViewState;
            }
            ViewState viewState2 = viewState;
            CharSequence charSequence2 = charSequence;
            return deviceInviteRequest.copy(bVar, bVar2, charSequence2, bVar3, viewState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final com.garmin.android.apps.connectmobile.smartscale.model.b getDataDTO() {
            return this.dataDTO;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final DeviceInviteRequest copy(b inboxRequest, b12.b userProfileImageData, CharSequence title, com.garmin.android.apps.connectmobile.smartscale.model.b dataDTO, ViewState itemViewState) {
            inboxRequest.getClass();
            userProfileImageData.getClass();
            title.getClass();
            dataDTO.getClass();
            itemViewState.getClass();
            return new DeviceInviteRequest(inboxRequest, userProfileImageData, title, dataDTO, itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInviteRequest)) {
                return false;
            }
            DeviceInviteRequest deviceInviteRequest = (DeviceInviteRequest) other;
            return this.inboxRequest == deviceInviteRequest.inboxRequest && s.g(this.userProfileImageData, deviceInviteRequest.userProfileImageData) && s.g(this.title, deviceInviteRequest.title) && s.g(this.dataDTO, deviceInviteRequest.dataDTO) && s.g(this.itemViewState, deviceInviteRequest.itemViewState);
        }

        public final com.garmin.android.apps.connectmobile.smartscale.model.b getDataDTO() {
            return this.dataDTO;
        }

        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public int hashCode() {
            return this.itemViewState.hashCode() + ((this.dataDTO.hashCode() + ((this.title.hashCode() + ((this.userProfileImageData.hashCode() + (this.inboxRequest.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final void setItemViewState(ViewState viewState) {
            viewState.getClass();
            this.itemViewState = viewState;
        }

        public String toString() {
            b bVar = this.inboxRequest;
            b12.b bVar2 = this.userProfileImageData;
            CharSequence charSequence = this.title;
            return "DeviceInviteRequest(inboxRequest=" + bVar + ", userProfileImageData=" + bVar2 + ", title=" + ((Object) charSequence) + ", dataDTO=" + this.dataDTO + ", itemViewState=" + this.itemViewState + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$FollowRequest;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Luz0/m;", "Lvz0/b;", "inboxRequest", "Lb12/b;", "userProfileImageData", "", "title", "dataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "itemViewState", "<init>", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Luz0/m;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "component1", "()Lvz0/b;", "component2", "()Lb12/b;", "component3", "()Ljava/lang/CharSequence;", "component4", "()Luz0/m;", "component5", "()Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "copy", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Luz0/m;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$FollowRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvz0/b;", "getInboxRequest", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitle", "Luz0/m;", "getDataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "getItemViewState", "setItemViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FollowRequest extends InboxRequestItem<m> {
        public static final int $stable = 8;
        private final m dataDTO;
        private final b inboxRequest;
        private ViewState itemViewState;
        private final CharSequence title;
        private final b12.b userProfileImageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FollowRequest(b bVar, b12.b bVar2, CharSequence charSequence, m mVar, ViewState viewState) {
            super(charSequence, bVar2, bVar, mVar, viewState, null);
            bVar.getClass();
            bVar2.getClass();
            charSequence.getClass();
            mVar.getClass();
            viewState.getClass();
            this.inboxRequest = bVar;
            this.userProfileImageData = bVar2;
            this.title = charSequence;
            this.dataDTO = mVar;
            this.itemViewState = viewState;
        }

        public static /* synthetic */ FollowRequest copy$default(FollowRequest followRequest, b bVar, b12.b bVar2, CharSequence charSequence, m mVar, ViewState viewState, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = followRequest.inboxRequest;
            }
            if ((i14 & 2) != 0) {
                bVar2 = followRequest.userProfileImageData;
            }
            if ((i14 & 4) != 0) {
                charSequence = followRequest.title;
            }
            if ((i14 & 8) != 0) {
                mVar = followRequest.dataDTO;
            }
            if ((i14 & 16) != 0) {
                viewState = followRequest.itemViewState;
            }
            ViewState viewState2 = viewState;
            CharSequence charSequence2 = charSequence;
            return followRequest.copy(bVar, bVar2, charSequence2, mVar, viewState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final m getDataDTO() {
            return this.dataDTO;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final FollowRequest copy(b inboxRequest, b12.b userProfileImageData, CharSequence title, m dataDTO, ViewState itemViewState) {
            inboxRequest.getClass();
            userProfileImageData.getClass();
            title.getClass();
            dataDTO.getClass();
            itemViewState.getClass();
            return new FollowRequest(inboxRequest, userProfileImageData, title, dataDTO, itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FollowRequest)) {
                return false;
            }
            FollowRequest followRequest = (FollowRequest) other;
            return this.inboxRequest == followRequest.inboxRequest && s.g(this.userProfileImageData, followRequest.userProfileImageData) && s.g(this.title, followRequest.title) && s.g(this.dataDTO, followRequest.dataDTO) && s.g(this.itemViewState, followRequest.itemViewState);
        }

        public final m getDataDTO() {
            return this.dataDTO;
        }

        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public int hashCode() {
            return this.itemViewState.hashCode() + ((this.dataDTO.hashCode() + ((this.title.hashCode() + ((this.userProfileImageData.hashCode() + (this.inboxRequest.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final void setItemViewState(ViewState viewState) {
            viewState.getClass();
            this.itemViewState = viewState;
        }

        public String toString() {
            b bVar = this.inboxRequest;
            b12.b bVar2 = this.userProfileImageData;
            CharSequence charSequence = this.title;
            return "FollowRequest(inboxRequest=" + bVar + ", userProfileImageData=" + bVar2 + ", title=" + ((Object) charSequence) + ", dataDTO=" + this.dataDTO + ", itemViewState=" + this.itemViewState + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$InboxGroupInviteRequest;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Luz0/b;", "Lvz0/b;", "inboxRequest", "Lb12/b;", "userProfileImageData", "", "title", "dataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "itemViewState", "<init>", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Luz0/b;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "component1", "()Lvz0/b;", "component2", "()Lb12/b;", "component3", "()Ljava/lang/CharSequence;", "component4", "()Luz0/b;", "component5", "()Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "copy", "(Lvz0/b;Lb12/b;Ljava/lang/CharSequence;Luz0/b;Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$InboxGroupInviteRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvz0/b;", "getInboxRequest", "Lb12/b;", "getUserProfileImageData", "Ljava/lang/CharSequence;", "getTitle", "Luz0/b;", "getDataDTO", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "getItemViewState", "setItemViewState", "(Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InboxGroupInviteRequest extends InboxRequestItem<uz0.b> {
        public static final int $stable = 8;
        private final uz0.b dataDTO;
        private final b inboxRequest;
        private ViewState itemViewState;
        private final CharSequence title;
        private final b12.b userProfileImageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InboxGroupInviteRequest(b bVar, b12.b bVar2, CharSequence charSequence, uz0.b bVar3, ViewState viewState) {
            super(charSequence, bVar2, bVar, bVar3, viewState, null);
            bVar.getClass();
            bVar2.getClass();
            charSequence.getClass();
            bVar3.getClass();
            viewState.getClass();
            this.inboxRequest = bVar;
            this.userProfileImageData = bVar2;
            this.title = charSequence;
            this.dataDTO = bVar3;
            this.itemViewState = viewState;
        }

        public static /* synthetic */ InboxGroupInviteRequest copy$default(InboxGroupInviteRequest inboxGroupInviteRequest, b bVar, b12.b bVar2, CharSequence charSequence, uz0.b bVar3, ViewState viewState, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bVar = inboxGroupInviteRequest.inboxRequest;
            }
            if ((i14 & 2) != 0) {
                bVar2 = inboxGroupInviteRequest.userProfileImageData;
            }
            if ((i14 & 4) != 0) {
                charSequence = inboxGroupInviteRequest.title;
            }
            if ((i14 & 8) != 0) {
                bVar3 = inboxGroupInviteRequest.dataDTO;
            }
            if ((i14 & 16) != 0) {
                viewState = inboxGroupInviteRequest.itemViewState;
            }
            ViewState viewState2 = viewState;
            CharSequence charSequence2 = charSequence;
            return inboxGroupInviteRequest.copy(bVar, bVar2, charSequence2, bVar3, viewState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final uz0.b getDataDTO() {
            return this.dataDTO;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final InboxGroupInviteRequest copy(b inboxRequest, b12.b userProfileImageData, CharSequence title, uz0.b dataDTO, ViewState itemViewState) {
            inboxRequest.getClass();
            userProfileImageData.getClass();
            title.getClass();
            dataDTO.getClass();
            itemViewState.getClass();
            return new InboxGroupInviteRequest(inboxRequest, userProfileImageData, title, dataDTO, itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InboxGroupInviteRequest)) {
                return false;
            }
            InboxGroupInviteRequest inboxGroupInviteRequest = (InboxGroupInviteRequest) other;
            return this.inboxRequest == inboxGroupInviteRequest.inboxRequest && s.g(this.userProfileImageData, inboxGroupInviteRequest.userProfileImageData) && s.g(this.title, inboxGroupInviteRequest.title) && s.g(this.dataDTO, inboxGroupInviteRequest.dataDTO) && s.g(this.itemViewState, inboxGroupInviteRequest.itemViewState);
        }

        public final uz0.b getDataDTO() {
            return this.dataDTO;
        }

        public final b getInboxRequest() {
            return this.inboxRequest;
        }

        public final ViewState getItemViewState() {
            return this.itemViewState;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final b12.b getUserProfileImageData() {
            return this.userProfileImageData;
        }

        public int hashCode() {
            return this.itemViewState.hashCode() + ((this.dataDTO.hashCode() + ((this.title.hashCode() + ((this.userProfileImageData.hashCode() + (this.inboxRequest.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final void setItemViewState(ViewState viewState) {
            viewState.getClass();
            this.itemViewState = viewState;
        }

        public String toString() {
            b bVar = this.inboxRequest;
            b12.b bVar2 = this.userProfileImageData;
            CharSequence charSequence = this.title;
            return "InboxGroupInviteRequest(inboxRequest=" + bVar + ", userProfileImageData=" + bVar2 + ", title=" + ((Object) charSequence) + ", dataDTO=" + this.dataDTO + ", itemViewState=" + this.itemViewState + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o.f<InboxRequestItem<?>> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(InboxRequestItem<?> inboxRequestItem, InboxRequestItem<?> inboxRequestItem2) {
            InboxRequestItem<?> inboxRequestItem3 = inboxRequestItem;
            InboxRequestItem<?> inboxRequestItem4 = inboxRequestItem2;
            inboxRequestItem3.getClass();
            inboxRequestItem4.getClass();
            return s.g(inboxRequestItem3.getViewState(), inboxRequestItem4.getViewState());
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(InboxRequestItem<?> inboxRequestItem, InboxRequestItem<?> inboxRequestItem2) {
            InboxRequestItem<?> inboxRequestItem3 = inboxRequestItem;
            InboxRequestItem<?> inboxRequestItem4 = inboxRequestItem2;
            inboxRequestItem3.getClass();
            inboxRequestItem4.getClass();
            if ((inboxRequestItem3 instanceof InboxGroupInviteRequest) && (inboxRequestItem4 instanceof InboxGroupInviteRequest)) {
                InboxGroupInviteRequest inboxGroupInviteRequest = (InboxGroupInviteRequest) inboxRequestItem3;
                if (inboxGroupInviteRequest.getInboxRequestDTO().getGroupMemberRequestId() != null) {
                    InboxGroupInviteRequest inboxGroupInviteRequest2 = (InboxGroupInviteRequest) inboxRequestItem4;
                    if (inboxGroupInviteRequest2.getInboxRequestDTO().getGroupMemberRequestId() != null) {
                        return s.g(inboxGroupInviteRequest.getInboxRequestDTO().getGroupMemberRequestId(), inboxGroupInviteRequest2.getInboxRequestDTO().getGroupMemberRequestId());
                    }
                }
                if (inboxGroupInviteRequest.getInboxRequestDTO().getGroupInviteId() != null) {
                    InboxGroupInviteRequest inboxGroupInviteRequest3 = (InboxGroupInviteRequest) inboxRequestItem4;
                    if (inboxGroupInviteRequest3.getInboxRequestDTO().getGroupInviteId() != null) {
                        return s.g(inboxGroupInviteRequest.getInboxRequestDTO().getGroupInviteId(), inboxGroupInviteRequest3.getInboxRequestDTO().getGroupInviteId());
                    }
                }
            } else if ((inboxRequestItem3 instanceof FollowRequest) && (inboxRequestItem4 instanceof FollowRequest)) {
                FollowRequest followRequest = (FollowRequest) inboxRequestItem3;
                if (followRequest.getInboxRequestDTO().getConnectionRequestId() != null) {
                    FollowRequest followRequest2 = (FollowRequest) inboxRequestItem4;
                    if (followRequest2.getInboxRequestDTO().getConnectionRequestId() != null) {
                        return s.g(followRequest.getInboxRequestDTO().getConnectionRequestId(), followRequest2.getInboxRequestDTO().getConnectionRequestId());
                    }
                }
            } else if ((inboxRequestItem3 instanceof DeviceInviteRequest) && (inboxRequestItem4 instanceof DeviceInviteRequest)) {
                DeviceInviteRequest deviceInviteRequest = (DeviceInviteRequest) inboxRequestItem3;
                if (deviceInviteRequest.getInboxRequestDTO().getDeviceInviteID() != null) {
                    DeviceInviteRequest deviceInviteRequest2 = (DeviceInviteRequest) inboxRequestItem4;
                    if (deviceInviteRequest2.getInboxRequestDTO().getDeviceInviteID() != null) {
                        return s.g(deviceInviteRequest.getInboxRequestDTO().getDeviceInviteID(), deviceInviteRequest2.getInboxRequestDTO().getDeviceInviteID());
                    }
                }
            } else if ((inboxRequestItem3 instanceof AuthorizedViewerInvites) && (inboxRequestItem4 instanceof AuthorizedViewerInvites)) {
                AuthorizedViewerInvites authorizedViewerInvites = (AuthorizedViewerInvites) inboxRequestItem3;
                if (authorizedViewerInvites.getInboxRequestDTO().getInviterUserId() != null) {
                    AuthorizedViewerInvites authorizedViewerInvites2 = (AuthorizedViewerInvites) inboxRequestItem4;
                    if (authorizedViewerInvites2.getInboxRequestDTO().getInviterUserId() != null) {
                        return s.g(authorizedViewerInvites.getInboxRequestDTO().getInviterUserId(), authorizedViewerInvites2.getInboxRequestDTO().getInviterUserId());
                    }
                }
            }
            return s.g(inboxRequestItem3.getViewState(), inboxRequestItem4.getViewState());
        }
    }

    private InboxRequestItem(CharSequence charSequence, b12.b bVar, b bVar2, T t7, ViewState viewState) {
        this.titleText = charSequence;
        this.userProfileImageDataInItem = bVar;
        this.requestKey = bVar2;
        this.inboxRequestDTO = t7;
        this.viewState = viewState;
    }

    public final T getInboxRequestDTO() {
        return this.inboxRequestDTO;
    }

    public final b getRequestKey() {
        return this.requestKey;
    }

    public final CharSequence getTitleText() {
        return this.titleText;
    }

    public final b12.b getUserProfileImageDataInItem() {
        return this.userProfileImageDataInItem;
    }

    public final ViewState getViewState() {
        return this.viewState;
    }

    public final void setViewState(ViewState viewState) {
        viewState.getClass();
        this.viewState = viewState;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$b;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InboxRequestItem(CharSequence charSequence, b12.b bVar, b bVar2, Object obj, ViewState viewState, j jVar) {
        this(charSequence, bVar, bVar2, obj, viewState);
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "", "infoText", "", "dateTimeText", "actionStateText", "showActionButton", "", "requestViewed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "getInfoText", "()Ljava/lang/String;", "setInfoText", "(Ljava/lang/String;)V", "getDateTimeText", "setDateTimeText", "getActionStateText", "setActionStateText", "getShowActionButton", "()Z", "setShowActionButton", "(Z)V", "getRequestViewed", "()Ljava/lang/Boolean;", "setRequestViewed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem$ViewState;", "equals", "other", "hashCode", "", "toString", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final int $stable = 8;
        private String actionStateText;
        private String dateTimeText;
        private String infoText;
        private Boolean requestViewed;
        private boolean showActionButton;

        public /* synthetic */ ViewState(String str, String str2, String str3, boolean z14, Boolean bool, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? true : z14, (i14 & 16) != 0 ? Boolean.FALSE : bool);
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, String str, String str2, String str3, boolean z14, Boolean bool, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = viewState.infoText;
            }
            if ((i14 & 2) != 0) {
                str2 = viewState.dateTimeText;
            }
            if ((i14 & 4) != 0) {
                str3 = viewState.actionStateText;
            }
            if ((i14 & 8) != 0) {
                z14 = viewState.showActionButton;
            }
            if ((i14 & 16) != 0) {
                bool = viewState.requestViewed;
            }
            Boolean bool2 = bool;
            String str4 = str3;
            return viewState.copy(str, str2, str4, z14, bool2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInfoText() {
            return this.infoText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDateTimeText() {
            return this.dateTimeText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getActionStateText() {
            return this.actionStateText;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowActionButton() {
            return this.showActionButton;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getRequestViewed() {
            return this.requestViewed;
        }

        public final ViewState copy(String infoText, String dateTimeText, String actionStateText, boolean showActionButton, Boolean requestViewed) {
            return new ViewState(infoText, dateTimeText, actionStateText, showActionButton, requestViewed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return s.g(this.infoText, viewState.infoText) && s.g(this.dateTimeText, viewState.dateTimeText) && s.g(this.actionStateText, viewState.actionStateText) && this.showActionButton == viewState.showActionButton && s.g(this.requestViewed, viewState.requestViewed);
        }

        public final String getActionStateText() {
            return this.actionStateText;
        }

        public final String getDateTimeText() {
            return this.dateTimeText;
        }

        public final String getInfoText() {
            return this.infoText;
        }

        public final Boolean getRequestViewed() {
            return this.requestViewed;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }

        public int hashCode() {
            String str = this.infoText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.dateTimeText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.actionStateText;
            int iG = f.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.showActionButton);
            Boolean bool = this.requestViewed;
            return iG + (bool != null ? bool.hashCode() : 0);
        }

        public final void setActionStateText(String str) {
            this.actionStateText = str;
        }

        public final void setDateTimeText(String str) {
            this.dateTimeText = str;
        }

        public final void setInfoText(String str) {
            this.infoText = str;
        }

        public final void setRequestViewed(Boolean bool) {
            this.requestViewed = bool;
        }

        public final void setShowActionButton(boolean z14) {
            this.showActionButton = z14;
        }

        public String toString() {
            String str = this.infoText;
            String str2 = this.dateTimeText;
            String str3 = this.actionStateText;
            boolean z14 = this.showActionButton;
            Boolean bool = this.requestViewed;
            StringBuilder sbI = p6.b.i("ViewState(infoText=", str, ", dateTimeText=", str2, ", actionStateText=");
            h.C(str3, ", showActionButton=", ", requestViewed=", sbI, z14);
            return p6.b.f(sbI, bool, ")");
        }

        public ViewState(String str, String str2, String str3, boolean z14, Boolean bool) {
            this.infoText = str;
            this.dateTimeText = str2;
            this.actionStateText = str3;
            this.showActionButton = z14;
            this.requestViewed = bool;
        }
    }
}
