package xz0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxz0/b;", "Ls51/d;", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Lxz0/a;", "inboxRequestActionListener", "<init>", "(Lxz0/a;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends s51.d<InboxRequestItem<?>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f192757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(InboxRequestItem.DIFF_CALLBACK);
        aVar.getClass();
        InboxRequestItem.INSTANCE.getClass();
        this.f192757i = aVar;
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
        InboxRequestItem<?> inboxRequestItemT = t(i14);
        if (inboxRequestItemT != null && (f0Var instanceof o)) {
            final o oVar = (o) f0Var;
            Button button = oVar.f192807f;
            Button button2 = oVar.f192808g;
            TextView textView = oVar.f192806e;
            oVar.f192803b.setProfileImageData(inboxRequestItemT.getUserProfileImageDataInItem());
            TextView textView2 = oVar.f192804c;
            textView2.setText(inboxRequestItemT.getTitleText());
            String dateTimeText = inboxRequestItemT.getViewState().getDateTimeText();
            if (dateTimeText == null || dateTimeText.length() <= 0) {
                v22.e.j(textView);
            } else {
                v22.e.q(textView);
                textView.setText(inboxRequestItemT.getViewState().getDateTimeText());
            }
            textView2.setVisibility(0);
            button2.setText(oVar.itemView.getContext().getString(R.string.lbl_accept));
            button.setText(oVar.itemView.getContext().getString(R.string.btn_decline_request));
            InboxRequestItem.ViewState viewState = inboxRequestItemT.getViewState();
            TextView textView3 = oVar.f192805d;
            textView3.setText(viewState.getInfoText());
            v22.e.r(textView3, g22.n.d(viewState.getInfoText()));
            TextView textView4 = oVar.f192810i;
            textView4.setText(viewState.getActionStateText());
            v22.e.r(textView4, g22.n.d(viewState.getActionStateText()));
            v22.e.r(button2, viewState.getShowActionButton());
            v22.e.r(button, viewState.getShowActionButton());
            ImageView imageView = oVar.f192809h;
            int i15 = o.a.f192811a[inboxRequestItemT.getRequestKey().ordinal()];
            if (i15 == 1) {
                final uz0.b bVar = (uz0.b) inboxRequestItemT.getInboxRequestDTO();
                v22.e.v(imageView, p005kotlin.jvm.internal.s.g(inboxRequestItemT.getViewState().getRequestViewed(), Boolean.FALSE));
                final int i16 = 1;
                oVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: xz0.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String displayName;
                        Long groupId;
                        int i17 = i16;
                        o oVar2 = oVar;
                        uz0.b bVar2 = bVar;
                        switch (i17) {
                            case 0:
                                int i18 = o.f192801j;
                                if (bVar2 != null && (displayName = bVar2.getDisplayName()) != null) {
                                    String fullName = bVar2.getFullName();
                                    if (fullName == null) {
                                        fullName = "";
                                    }
                                    oVar2.f192802a.D(displayName, fullName);
                                    break;
                                }
                                break;
                            default:
                                int i19 = o.f192801j;
                                if (bVar2 != null && (groupId = bVar2.getGroupId()) != null) {
                                    oVar2.f192802a.B(String.valueOf(groupId.longValue()), bVar2.getGroupName());
                                    break;
                                }
                                break;
                        }
                    }
                });
                button.setOnClickListener(new n(inboxRequestItemT, oVar, i14));
                button2.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 2));
                return;
            }
            if (i15 == 2) {
                final uz0.b bVar2 = (uz0.b) inboxRequestItemT.getInboxRequestDTO();
                v22.e.v(imageView, p005kotlin.jvm.internal.s.g(inboxRequestItemT.getViewState().getRequestViewed(), Boolean.FALSE));
                final int i17 = 0;
                oVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: xz0.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String displayName;
                        Long groupId;
                        int i18 = i17;
                        o oVar2 = oVar;
                        uz0.b bVar3 = bVar2;
                        switch (i18) {
                            case 0:
                                int i19 = o.f192801j;
                                if (bVar3 != null && (displayName = bVar3.getDisplayName()) != null) {
                                    String fullName = bVar3.getFullName();
                                    if (fullName == null) {
                                        fullName = "";
                                    }
                                    oVar2.f192802a.D(displayName, fullName);
                                    break;
                                }
                                break;
                            default:
                                int i110 = o.f192801j;
                                if (bVar3 != null && (groupId = bVar3.getGroupId()) != null) {
                                    oVar2.f192802a.B(String.valueOf(groupId.longValue()), bVar3.getGroupName());
                                    break;
                                }
                                break;
                        }
                    }
                });
                button.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 3));
                button2.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 4));
                return;
            }
            if (i15 == 3) {
                v22.e.v(imageView, p005kotlin.jvm.internal.s.g(inboxRequestItemT.getViewState().getRequestViewed(), Boolean.FALSE));
                oVar.itemView.setOnClickListener(null);
                button.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 6));
                button2.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 7));
                return;
            }
            if (i15 == 4) {
                ue0.n nVar = (ue0.n) inboxRequestItemT.getInboxRequestDTO();
                v22.e.j(imageView);
                oVar.itemView.setOnClickListener(new xp0.d(oVar, 6));
                button.setOnClickListener(new lg1.b(nVar, oVar, inboxRequestItemT, i14, 5));
                button2.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 5));
                return;
            }
            if (i15 != 5) {
                u0.r();
                return;
            }
            uz0.m mVar = (uz0.m) inboxRequestItemT.getInboxRequestDTO();
            v22.e.v(imageView, p005kotlin.jvm.internal.s.g(inboxRequestItemT.getViewState().getRequestViewed(), Boolean.FALSE));
            oVar.itemView.setOnClickListener(new wv2.h(10, mVar, oVar));
            button.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 8));
            button2.setOnClickListener(new n(oVar, inboxRequestItemT, i14, 0));
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 H(ViewGroup viewGroup, int i14) {
        View viewD = a0.d(viewGroup, R.layout.inbox_request_entry_item, viewGroup, false);
        viewD.getClass();
        return new o(viewD, this.f192757i);
    }
}
