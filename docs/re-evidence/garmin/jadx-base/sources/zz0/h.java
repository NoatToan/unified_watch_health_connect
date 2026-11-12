package zz0;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import sz0.k;
import ue0.n;
import uz0.m;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationItem.Request f207615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f207616c;

    public /* synthetic */ h(NotificationItem.Request request, j jVar) {
        this.f207614a = 0;
        this.f207616c = jVar;
        this.f207615b = request;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        String displayName;
        int i14 = this.f207614a;
        j jVar = this.f207616c;
        NotificationItem.Request request = this.f207615b;
        switch (i14) {
            case 0:
                int i15 = j.f207619l;
                Context context = jVar.itemView.getContext();
                context.getClass();
                d1.b(context, new i(request, jVar));
                break;
            case 1:
                k kVar = jVar.f207620a;
                int i16 = j.f207619l;
                if (request.getRequestKey() == vz0.b.GROUP_JOIN_REQUEST) {
                    kVar.s4(request);
                } else if (request.getRequestKey() == vz0.b.GROUP_INVITE) {
                    kVar.z0(request);
                }
                break;
            case 2:
                k kVar2 = jVar.f207620a;
                int i17 = j.f207619l;
                if (request.getRequestKey() == vz0.b.GROUP_JOIN_REQUEST) {
                    kVar2.L1(request);
                } else if (request.getRequestKey() == vz0.b.GROUP_INVITE) {
                    kVar2.a6(request);
                }
                break;
            case 3:
                int i18 = j.f207619l;
                n accountSharingInviteDTO = request.getAccountSharingInviteDTO();
                if (accountSharingInviteDTO != null) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "AuthorizedViewersInviteDeclined");
                    jVar.f207620a.a1(accountSharingInviteDTO);
                }
                break;
            case 4:
                int i19 = j.f207619l;
                n accountSharingInviteDTO2 = request.getAccountSharingInviteDTO();
                if (accountSharingInviteDTO2 != null) {
                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
                    aVar.setTitle(aVar.getContext().getString(R.string.authorized_viewer_agreement));
                    aVar.setMessage(aVar.getContext().getString(R.string.as_authorized_viewer_agreement_details));
                    aVar.setPositiveButton(aVar.getContext().getString(R.string.lbl_agree), new wq.c(14, jVar, accountSharingInviteDTO2));
                    aVar.setNegativeButton(aVar.getContext().getString(R.string.lbl_cancel), new zo.g(5));
                    aVar.create().show();
                    break;
                }
                break;
            case 5:
                int i24 = j.f207619l;
                m requestNotificationDTO = request.getRequestNotificationDTO();
                if (requestNotificationDTO != null && (displayName = requestNotificationDTO.getDisplayName()) != null) {
                    String fullName = request.getRequestNotificationDTO().getFullName();
                    if (fullName == null) {
                        fullName = "";
                    }
                    jVar.f207620a.D(displayName, fullName);
                    break;
                }
                break;
            default:
                int i25 = j.f207619l;
                m requestNotificationDTO2 = request.getRequestNotificationDTO();
                if (requestNotificationDTO2 != null) {
                    jVar.f207620a.A1(requestNotificationDTO2);
                }
                break;
        }
    }

    public /* synthetic */ h(NotificationItem.Request request, j jVar, int i14) {
        this.f207614a = i14;
        this.f207615b = request;
        this.f207616c = jVar;
    }
}
