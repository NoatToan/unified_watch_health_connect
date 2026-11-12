package xz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f192793b;

        static {
            int[] iArr = new int[vz0.b.values().length];
            try {
                iArr[vz0.b.FOLLOW_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vz0.b.GROUP_INVITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vz0.b.GROUP_JOIN_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vz0.b.DEVICE_INVITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vz0.b.AUTHORIZED_VIEWER_INVITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f192792a = iArr;
            int[] iArr2 = new int[ue0.c.values().length];
            try {
                iArr2[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f192793b = iArr2;
        }
    }

    public static final InboxRequestItem<?> a(InboxRequestItem<?> inboxRequestItem, Context context, Boolean bool) {
        String string;
        inboxRequestItem.getClass();
        if (bool == null) {
            string = null;
        } else if (bool.booleanValue()) {
            string = context.getString(R.string.social_request_accepted);
        } else {
            string = inboxRequestItem.getRequestKey() == vz0.b.FOLLOW_REQUEST ? context.getString(R.string.follow_request_declined) : context.getString(R.string.connections_request_deleted);
        }
        String str = string;
        InboxRequestItem.ViewState viewState = new InboxRequestItem.ViewState(inboxRequestItem.getViewState().getInfoText(), inboxRequestItem.getViewState().getDateTimeText(), str, bool == null, Boolean.TRUE);
        int i14 = a.f192792a[inboxRequestItem.getRequestKey().ordinal()];
        if (i14 == 1) {
            vz0.b requestKey = inboxRequestItem.getRequestKey();
            b12.b userProfileImageDataInItem = inboxRequestItem.getUserProfileImageDataInItem();
            CharSequence titleText = inboxRequestItem.getTitleText();
            Object inboxRequestDTO = inboxRequestItem.getInboxRequestDTO();
            inboxRequestDTO.getClass();
            return new InboxRequestItem.FollowRequest(requestKey, userProfileImageDataInItem, titleText, (uz0.m) inboxRequestDTO, viewState);
        }
        if (i14 == 2 || i14 == 3) {
            vz0.b requestKey2 = inboxRequestItem.getRequestKey();
            b12.b userProfileImageDataInItem2 = inboxRequestItem.getUserProfileImageDataInItem();
            CharSequence titleText2 = inboxRequestItem.getTitleText();
            Object inboxRequestDTO2 = inboxRequestItem.getInboxRequestDTO();
            inboxRequestDTO2.getClass();
            return new InboxRequestItem.InboxGroupInviteRequest(requestKey2, userProfileImageDataInItem2, titleText2, (uz0.b) inboxRequestDTO2, viewState);
        }
        if (i14 == 4) {
            viewState.setActionStateText(str);
            vz0.b requestKey3 = inboxRequestItem.getRequestKey();
            b12.b userProfileImageDataInItem3 = inboxRequestItem.getUserProfileImageDataInItem();
            CharSequence titleText3 = inboxRequestItem.getTitleText();
            Object inboxRequestDTO3 = inboxRequestItem.getInboxRequestDTO();
            inboxRequestDTO3.getClass();
            return new InboxRequestItem.DeviceInviteRequest(requestKey3, userProfileImageDataInItem3, titleText3, (com.garmin.android.apps.connectmobile.smartscale.model.b) inboxRequestDTO3, viewState);
        }
        if (i14 != 5) {
            vb.h.s("Need implement Request key to InboxRequestItem ");
            return null;
        }
        vz0.b requestKey4 = inboxRequestItem.getRequestKey();
        b12.b userProfileImageDataInItem4 = inboxRequestItem.getUserProfileImageDataInItem();
        CharSequence titleText4 = inboxRequestItem.getTitleText();
        Object inboxRequestDTO4 = inboxRequestItem.getInboxRequestDTO();
        inboxRequestDTO4.getClass();
        return new InboxRequestItem.AuthorizedViewerInvites(requestKey4, userProfileImageDataInItem4, titleText4, (ue0.n) inboxRequestDTO4, viewState);
    }
}
