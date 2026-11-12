package xz0;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InboxRequestItem f192798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f192799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192800d;

    public /* synthetic */ n(InboxRequestItem inboxRequestItem, o oVar, int i14) {
        this.f192797a = 1;
        this.f192798b = inboxRequestItem;
        this.f192799c = oVar;
        this.f192800d = i14;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f192797a;
        int i15 = this.f192800d;
        InboxRequestItem<?> inboxRequestItem = this.f192798b;
        o oVar = this.f192799c;
        switch (i14) {
            case 0:
                oVar.f192802a.I5(inboxRequestItem, i15);
                break;
            case 1:
                int i16 = o.f192801j;
                Object inboxRequestDTO = inboxRequestItem.getInboxRequestDTO();
                uz0.b bVar = inboxRequestDTO instanceof uz0.b ? (uz0.b) inboxRequestDTO : null;
                if (bVar != null && bVar.getGroupVisibility() == uz0.a.HIDDEN) {
                    Context context = oVar.itemView.getContext();
                    context.getClass();
                    sz0.l.a(new a83.a(oVar, inboxRequestItem, i15, 16), context);
                } else {
                    oVar.f192802a.b2(inboxRequestItem, i15);
                }
                break;
            case 2:
                oVar.f192802a.t3(inboxRequestItem, i15);
                break;
            case 3:
                oVar.f192802a.p6(inboxRequestItem, i15);
                break;
            case 4:
                oVar.f192802a.O0(inboxRequestItem, i15);
                break;
            case 5:
                int i17 = o.f192801j;
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
                aVar.setTitle(aVar.getContext().getString(R.string.authorized_viewer_agreement));
                aVar.setMessage(aVar.getContext().getString(R.string.msg_as_authorized_viewer_agreement_details));
                aVar.setPositiveButton(aVar.getContext().getString(R.string.lbl_agree), new ew1.k(oVar, inboxRequestItem, i15, 6));
                aVar.setNegativeButton(aVar.getContext().getString(R.string.lbl_cancel), new xk1.v(5));
                aVar.create().show();
                break;
            case 6:
                oVar.f192802a.n5(inboxRequestItem, i15);
                break;
            case 7:
                oVar.f192802a.j5(inboxRequestItem, i15);
                break;
            default:
                oVar.f192802a.Q5(inboxRequestItem, i15);
                break;
        }
    }

    public /* synthetic */ n(o oVar, InboxRequestItem inboxRequestItem, int i14, int i15) {
        this.f192797a = i15;
        this.f192799c = oVar;
        this.f192798b = inboxRequestItem;
        this.f192800d = i14;
    }
}
