package sz0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import sg0.w0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsz0/z;", "Ls51/d;", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "Lsz0/k;", "notificationActionListener", "<init>", "(Lsz0/k;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends s51.d<NotificationItem> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f161534i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k kVar) {
        super(NotificationItem.DIFF_CALLBACK);
        kVar.getClass();
        NotificationItem.INSTANCE.getClass();
        this.f161534i = kVar;
    }

    @Override // s51.d
    public final void C(RecyclerView.f0 f0Var) {
        if (f0Var instanceof xg0.i) {
            ((xg0.i) f0Var).d();
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 F(ViewGroup viewGroup) {
        return new xg0.i(n23.j.b(viewGroup, R.layout.news_feed_loading_item, viewGroup, false));
    }

    @Override // s51.d
    public final void G(int i14, RecyclerView.f0 f0Var) {
        String string;
        NotificationItem notificationItemT = t(i14);
        if (notificationItemT == null) {
            return;
        }
        if ((f0Var instanceof zz0.g) && (notificationItemT instanceof NotificationItem.Header)) {
            ((zz0.g) f0Var).f207613a.setText(((NotificationItem.Header) notificationItemT).getTitle());
            return;
        }
        int i15 = 0;
        if ((f0Var instanceof zz0.j) && (notificationItemT instanceof NotificationItem.Request)) {
            zz0.j jVar = (zz0.j) f0Var;
            NotificationItem.Request request = (NotificationItem.Request) notificationItemT;
            jVar.f207621b.setProfileImageData(request.getUserProfileImageData());
            TextView textView = jVar.f207622c;
            textView.setText(request.getTitleText());
            jVar.f207624e.setText(request.getViewState().f39557f);
            NotificationItem.Request.a viewState = request.getViewState();
            textView.setVisibility(0);
            Button button = jVar.f207626g;
            String str = viewState.f39554c;
            String str2 = viewState.f39552a;
            button.setText(str);
            Button button2 = jVar.f207625f;
            String string2 = viewState.f39555d;
            if (string2 == null) {
                string2 = button2.getContext().getString(R.string.btn_decline_request);
                string2.getClass();
            }
            button2.setText(string2);
            TextView textView2 = jVar.f207623d;
            textView2.setText(str2);
            v22.e.r(textView2, g22.n.d(str2));
            TextView textView3 = jVar.f207629j;
            String str3 = viewState.f39553b;
            textView3.setText(str3);
            v22.e.r(textView3, g22.n.d(str3));
            boolean z14 = viewState.f39556e;
            v22.e.r(button, z14);
            v22.e.r(button2, z14);
            v22.e.j(jVar.f207627h);
            v22.e.j(jVar.f207628i);
            ImageView imageView = jVar.f207630k;
            if (request.getRequestNotificationDTO() != null) {
                v22.e.s(imageView, p005kotlin.jvm.internal.s.g(request.getViewState().f39558g, Boolean.FALSE));
                jVar.itemView.setOnClickListener(new zz0.h(request, jVar, 5));
                button2.setOnClickListener(new zz0.h(request, jVar, 6));
                button.setOnClickListener(new zz0.h(request, jVar));
                return;
            }
            if (request.getDeviceInviteDTO() != null) {
                v22.e.s(imageView, p005kotlin.jvm.internal.s.g(request.getViewState().f39558g, Boolean.FALSE));
                tz0.a aVar = (tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null);
                jVar.itemView.setOnClickListener(null);
                com.garmin.android.apps.connectmobile.smartscale.model.b deviceInviteDTO = request.getDeviceInviteDTO();
                if (deviceInviteDTO != null) {
                    button2.setOnClickListener(new ty0.a(aVar, 18, deviceInviteDTO, jVar));
                    button.setOnClickListener(new wv2.h(28, aVar, deviceInviteDTO));
                    return;
                }
                return;
            }
            if (request.getAccountSharingInviteDTO() != null) {
                v22.e.s(imageView, false);
                jVar.itemView.setOnClickListener(new zy.j(jVar, 1));
                button2.setOnClickListener(new zz0.h(request, jVar, 3));
                button.setOnClickListener(new zz0.h(request, jVar, 4));
                return;
            }
            if (request.getInboxGroupInviteRequestDTO() != null) {
                uz0.b inboxGroupInviteRequestDTO = request.getInboxGroupInviteRequestDTO();
                v22.e.s(imageView, p005kotlin.jvm.internal.s.g(request.getViewState().f39558g, Boolean.FALSE));
                jVar.itemView.setOnClickListener(new ty0.a(request, 17, inboxGroupInviteRequestDTO, jVar));
                button2.setOnClickListener(new zz0.h(request, jVar, 1));
                button.setOnClickListener(new zz0.h(request, jVar, 2));
                return;
            }
            return;
        }
        if (!(f0Var instanceof zz0.f) || !(notificationItemT instanceof NotificationItem.Activity)) {
            if ((f0Var instanceof zz0.a) && (notificationItemT instanceof NotificationItem.RequestsEntry)) {
                zz0.a aVar2 = (zz0.a) f0Var;
                NotificationItem.RequestsEntry requestsEntry = (NotificationItem.RequestsEntry) notificationItemT;
                w0 w0Var = new w0(this, 8);
                TextView textView4 = aVar2.f207582b;
                aVar2.itemView.setOnClickListener(new wv2.h(26, aVar2, w0Var));
                v22.e.r(aVar2.f207581a, requestsEntry.getHasUnreadRequest());
                int requestCount = requestsEntry.getRequestCount();
                View view2 = aVar2.itemView;
                if (requestCount == 1) {
                    string = u62.z.b(R.string.pn_you_have_1_request, view2);
                } else {
                    string = view2.getContext().getString(R.string.pn_you_have_number_requests, Integer.valueOf(requestCount));
                    string.getClass();
                }
                textView4.setText(string);
                v22.e.r(textView4, !d53.w.J(string));
                for (Object obj : aVar2.f207583c) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    UserLevelImageView userLevelImageView = (UserLevelImageView) obj;
                    b12.b bVar = (b12.b) p13.h0.e0(i15, requestsEntry.getProfileImageDataList());
                    if (bVar == null) {
                        bVar = b12.b.f14386g;
                    }
                    userLevelImageView.setProfileImageData(bVar);
                    i15 = i16;
                }
                return;
            }
            return;
        }
        zz0.f fVar = (zz0.f) f0Var;
        NotificationItem.Activity activity = (NotificationItem.Activity) notificationItemT;
        TextView textView5 = fVar.f207605e;
        TextView textView6 = fVar.f207604d;
        UserLevelImageView userLevelImageView2 = fVar.f207602b;
        u4.d iconVector = activity.getIconVector();
        ComposeView composeView = fVar.f207603c;
        if (iconVector != null) {
            composeView.setContent(new z3.e(51360595, true, new zz0.b(activity, 0)));
            composeView.setVisibility(0);
            v22.e.j(userLevelImageView2);
        } else {
            v22.e.j(composeView);
            userLevelImageView2.setProfileImageData(activity.getUserProfileImageData());
        }
        if (activity.getDisplayFullTitle()) {
            textView6.setMaxLines(10);
        } else {
            textView6.setMaxLines(3);
        }
        textView6.setText(activity.getTitleText());
        textView5.setText(activity.getViewState().f39548a);
        textView5.setContentDescription(activity.getViewState().f39549b);
        v22.e.j(fVar.f207606f);
        v22.e.v(fVar.f207612l, p005kotlin.jvm.internal.s.g(activity.getViewState().f39551d, Boolean.FALSE));
        v22.e.v(userLevelImageView2, activity.getDisplayIcon());
        fVar.d(activity.getViewState());
        ImageView imageView2 = fVar.f207609i;
        uz0.g notificationFullItemDTO = activity.getNotificationFullItemDTO();
        NotificationItem.Activity.a viewState2 = activity.getViewState();
        fVar.itemView.setOnClickListener(new wv2.h(27, notificationFullItemDTO, fVar));
        Long notificationId = notificationFullItemDTO.getNotificationId();
        if (notificationId != null) {
            long jLongValue = notificationId.longValue();
            if (v22.e.d(imageView2)) {
                Context context = fVar.itemView.getContext();
                context.getClass();
                int iC = MathKt.c(fVar.itemView.getContext().getResources().getDimension(R.dimen.spacing_xlarge) * j23.t.d(c22.b.a(context), 1.0f, 2.0f));
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams.height = iC;
                layoutParams.width = iC;
                imageView2.setLayoutParams(layoutParams);
                imageView2.setOnClickListener(new zz0.c(fVar, jLongValue, viewState2, activity, 0));
            }
            fVar.f207611k.setOnClickListener(new zz0.c(fVar, jLongValue, viewState2, activity, 1));
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 H(ViewGroup viewGroup, int i14) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i14 == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.notification_header_item, viewGroup, false);
            viewInflate.getClass();
            return new zz0.g(viewInflate);
        }
        k kVar = this.f161534i;
        if (i14 == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.notification_entry_item, viewGroup, false);
            viewInflate2.getClass();
            return new zz0.j(viewInflate2, kVar);
        }
        if (i14 == 2) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.notification_entry_item, viewGroup, false);
            viewInflate3.getClass();
            return new zz0.f(viewInflate3, kVar);
        }
        if (i14 != 3) {
            vb.h.s(v.e0.f(i14, "Fix me developer!! Unsupported viewType=[", "] was found."));
            return null;
        }
        zz0.a.f207580d.getClass();
        View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inbox_requests_entry_item, viewGroup, false);
        viewInflate4.getClass();
        return new zz0.a(viewInflate4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        NotificationItem notificationItemT = t(i14);
        if (notificationItemT != null) {
            return notificationItemT.getViewTypeId();
        }
        return 0;
    }
}
