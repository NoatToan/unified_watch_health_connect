package sz0;

import android.content.Context;
import androidx.lifecycle.v1;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import ei0.t0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\t\nB\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lsz0/i0;", "Lcom/garmin/android/apps/connectmobile/e0$b;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lc22/a0;)V", "a", "b", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends com.garmin.android.apps.connectmobile.e0.b<String, NotificationItem> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f161413r = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f161414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c22.a0 f161415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ve0.b f161416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f161417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f161418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a22.i f161419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ax1.i f161420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jm0.b f161421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz0.a f161422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final te0.d f161423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f12.l f161424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c2 f161425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f161426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f161427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f161428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f161429q;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsz0/i0$a;", "", "Lue0/n;", "receivedInviteDTO", "", "responseCode", "<init>", "(Lue0/n;Ljava/lang/Integer;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ue0.n f161430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f161431b;

        public a(ue0.n nVar, Integer num) {
            this.f161430a = nVar;
            this.f161431b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f161430a, aVar.f161430a) && p005kotlin.jvm.internal.s.g(this.f161431b, aVar.f161431b);
        }

        public final int hashCode() {
            ue0.n nVar = this.f161430a;
            int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            Integer num = this.f161431b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "AcceptInviteResponse(receivedInviteDTO=" + this.f161430a + ", responseCode=" + this.f161431b + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161432a;

        static {
            int[] iArr = new int[ue0.c.values().length];
            try {
                iArr[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f161432a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sz0/i0$d", "Lli0/f;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends li0.f {
        public d(o53.b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list, List<? extends ki0.a.b.EnumC2007a> list2) {
            super(b0Var, list, list2);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
            i0.this.y4();
        }

        @Override // li0.f
        public final void n(String str, li0.l0 l0Var) {
            i0.this.y4();
        }
    }

    static {
        new b(null);
    }

    public i0(c22.a0 a0Var) {
        a0Var.getClass();
        this.f161414b = new t0();
        this.f161415c = a0Var;
        this.f161416d = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        this.f161417e = o13.m.b(new sk0.i0(25));
        this.f161418f = o13.m.b(new sk0.i0(26));
        a22.i.f537b.getClass();
        this.f161419g = a22.i.a.a();
        this.f161420h = ax1.i.a.a(ax1.i.f13633b);
        this.f161421i = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        this.f161422j = new wz0.a(null, null, null, 0, null, false, false, 127, null);
        this.f161423k = (te0.d) KoinJavaComponent.get$default(te0.d.class, null, null, 6, null);
        f12.l.f68084a.getClass();
        this.f161424l = f12.l.a.a();
        p2 p2VarA = q2.a(null);
        this.f161426n = p2VarA;
        this.f161427o = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f161428p = p2VarA2;
        this.f161429q = p2VarA2;
        new d(v1.a(this), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED));
    }

    public final void A4(Context context, vz0.b bVar, uz0.b bVar2, boolean z14) {
        uz0.b bVar3;
        CharSequence charSequenceB;
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        bVar.getClass();
        bVar2.getClass();
        wz0.a aVar = this.f161422j;
        List<NotificationItem> list = aVar.f188129a;
        List<NotificationItem> list2 = aVar.f188129a;
        Iterator<NotificationItem> it = list.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                bVar3 = bVar2;
                i14 = -1;
                break;
            }
            NotificationItem next = it.next();
            if (next instanceof NotificationItem.Request) {
                bVar3 = bVar2;
                if (p005kotlin.jvm.internal.s.g(((NotificationItem.Request) next).getInboxGroupInviteRequestDTO(), bVar3)) {
                    break;
                }
            }
            i14++;
        }
        if (i14 < 0 || i14 >= aVar.f188129a.size()) {
            return;
        }
        NotificationItem notificationItem = list2.get(i14);
        notificationItem.getClass();
        NotificationItem.Request.a viewState = ((NotificationItem.Request) notificationItem).getViewState();
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = aVar.f188131c;
        Long userProfileId = bVar3.getUserProfileId();
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = map.get(userProfileId != null ? Integer.valueOf((int) userProfileId.longValue()) : null);
        viewState.getClass();
        int i15 = o.a.f161465a[bVar.ordinal()];
        String str = "";
        if (i15 == 1) {
            String fullName = bVar3.getFullName();
            if (fullName == null) {
                fullName = bVar3.getDisplayName();
            }
            String string = context.getString(R.string.pn_member_request, fullName, bVar3.getGroupName());
            string.getClass();
            if (fullName == null) {
                fullName = "";
            }
            String groupName = bVar3.getGroupName();
            String str2 = str;
            if (groupName != null) {
                str2 = groupName;
            }
            charSequenceB = o.b(context, string, fullName, str2);
        } else if (i15 == 2) {
            String fullName2 = bVar3.getFullName();
            if (fullName2 == null) {
                charSequenceB = str;
                fullName2 = bVar3.getDisplayName();
            }
            charSequenceB = str;
            String fullName3 = bVar3.getFullName();
            if (fullName3 == null) {
                fullName3 = bVar3.getDisplayName();
            }
            String string2 = context.getString(R.string.pn_group_invite, fullName3, bVar3.getGroupName());
            string2.getClass();
            if (fullName2 == null) {
                fullName2 = "";
            }
            String groupName2 = bVar3.getGroupName();
            String str3 = str;
            if (groupName2 != null) {
                str3 = groupName2;
            }
            charSequenceB = o.b(context, string2, fullName2, str3);
        }
        String string3 = z14 ? context.getString(R.string.social_request_accepted) : context.getString(R.string.connections_request_deleted);
        string3.getClass();
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46879h) == null) {
            profileImageUrlSmall = bVar3.getProfileImageUrlSmall();
        }
        list2.set(i14, new NotificationItem.Request(new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequenceB, new NotificationItem.Request.a(viewState.f39552a, string3, null, null, false, viewState.f39557f, null, 76, null), null, null, null, bVar3, null, SyslogConstants.LOG_LOCAL7, null));
        aVar.f188134f = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar2 = this.f34755a;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    public final void B4(Context context, ue0.n nVar) {
        nVar.getClass();
        wz0.a aVar = this.f161422j;
        Iterator<NotificationItem> it = aVar.f188129a.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            NotificationItem next = it.next();
            if (next instanceof NotificationItem.Request) {
                ue0.n accountSharingInviteDTO = ((NotificationItem.Request) next).getAccountSharingInviteDTO();
                if (p005kotlin.jvm.internal.s.g(accountSharingInviteDTO != null ? accountSharingInviteDTO.getInviteId() : null, nVar.getInviteId())) {
                    break;
                }
            }
            i14++;
        }
        if (i14 < 0 || i14 >= aVar.f188129a.size()) {
            return;
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = aVar.f188131c;
        Long userId = nVar.getUserId();
        aVar.f188129a.set(i14, o.e(nVar, context, map.get(userId != null ? Integer.valueOf((int) userId.longValue()) : null)));
        aVar.f188134f = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar2 = this.f34755a;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C4(Context context, uz0.m mVar, boolean z14) {
        uz0.m mVar2;
        String profileImageUrlMedium;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        wz0.a aVar = this.f161422j;
        List<NotificationItem> list = aVar.f188129a;
        List<NotificationItem> list2 = aVar.f188129a;
        Iterator<NotificationItem> it = list.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                mVar2 = mVar;
                i14 = -1;
                break;
            }
            NotificationItem next = it.next();
            if (next instanceof NotificationItem.Request) {
                mVar2 = mVar;
                if (p005kotlin.jvm.internal.s.g(((NotificationItem.Request) next).getRequestNotificationDTO(), mVar2)) {
                    break;
                }
            }
            i14++;
        }
        if (i14 < 0 || i14 >= aVar.f188129a.size()) {
            return;
        }
        NotificationItem notificationItem = list2.get(i14);
        notificationItem.getClass();
        NotificationItem.Request.a viewState = ((NotificationItem.Request) notificationItem).getViewState();
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = aVar.f188131c;
        Long userId = mVar2.getUserId();
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = map.get(userId != null ? Integer.valueOf((int) userId.longValue()) : null);
        viewState.getClass();
        String fullName = mVar2.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String string = context.getString(R.string.follow_request_message, fullName);
        string.getClass();
        String fullName2 = mVar2.getFullName();
        CharSequence charSequenceB = o.b(context, string, fullName2 != null ? fullName2 : "");
        String string2 = z14 ? context.getString(R.string.social_request_accepted) : context.getString(R.string.follow_request_declined);
        string2.getClass();
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls.f46879h) == null) {
            profileImageUrlMedium = mVar2.getProfileImageUrlMedium();
        }
        list2.set(i14, new NotificationItem.Request(new b12.b(profileImageUrlMedium, null, null, null, null, 30, null), charSequenceB, new NotificationItem.Request.a(viewState.f39552a, string2, null, null, false, viewState.f39557f, Boolean.TRUE, 12, null), null, mVar2, null, null, null, 232, 0 == true ? 1 : 0));
        aVar.f188134f = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar2 = this.f34755a;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NotificationViewModel", "refresh");
        wz0.a aVar2 = this.f161422j;
        aVar2.f188129a.clear();
        aVar2.f188130b.clear();
        aVar2.f188132d = 0;
        aVar2.f188134f = false;
        aVar2.f188135g = false;
        com.garmin.android.apps.connectmobile.e0.b.a aVar3 = this.f34755a;
        if (aVar3 != null) {
            aVar3.a(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0.b
    public final h3<String, NotificationItem> x4(Context context) {
        return new wz0.b((a0) this.f161417e.getValue(), (re0.h) this.f161418f.getValue(), this.f161419g, new s70.r(context, 16), this.f161422j);
    }

    public final void y4() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NotificationViewModel", "refreshRequestsOnly");
        wz0.a aVar2 = this.f161422j;
        aVar2.f188129a.clear();
        aVar2.f188132d = 0;
        aVar2.f188134f = false;
        aVar2.f188135g = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar3 = this.f34755a;
        if (aVar3 != null) {
            aVar3.a(false);
        }
    }

    public final void z4(long j8, boolean z14) {
        NotificationItem.Activity.a viewState;
        uz0.g notificationFullItemDTO;
        Long lG;
        wz0.a aVar = this.f161422j;
        List<NotificationItem> list = aVar.f188130b;
        Iterator<NotificationItem> it = list.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            NotificationItem next = it.next();
            NotificationItem.Activity activity = next instanceof NotificationItem.Activity ? (NotificationItem.Activity) next : null;
            if (activity != null && (notificationFullItemDTO = activity.getNotificationFullItemDTO()) != null && (lG = notificationFullItemDTO.getNotificationId()) != null && lG.longValue() == j8) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 == -1) {
            return;
        }
        NotificationItem notificationItem = list.get(i14);
        NotificationItem.Activity activity2 = notificationItem instanceof NotificationItem.Activity ? (NotificationItem.Activity) notificationItem : null;
        if ((activity2 == null || (viewState = activity2.getViewState()) == null || !viewState.f39550c) && !z14) {
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "NotificationViewModel", "removeActivityNotificationAt");
        List<NotificationItem> list2 = aVar.f188130b;
        if (list2.size() == 2) {
            list2.clear();
        } else if (i14 < 0 || i14 >= list2.size()) {
            return;
        } else {
            list2.remove(i14);
        }
        aVar.f188134f = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar3 = this.f34755a;
        if (aVar3 != null) {
            aVar3.a(true);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lsz0/i0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_NEWS_FEED_NOTIFICATION_PAGE_SIZE", "I", "INBOX_PAGE_REQUEST_DISPLAY_LIMIT", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ i0(c22.a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new c22.a0(null, null, null, 7, null) : a0Var);
    }
}
