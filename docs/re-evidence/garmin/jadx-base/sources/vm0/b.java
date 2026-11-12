package vm0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import ew1.h1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvm0/b;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.group.details.invite.b.d f178737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f178738b = true;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_cancel_intivation_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        com.garmin.android.apps.connectmobile.group.details.invite.b.d dVar;
        e eVar;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (!this.f178738b || (dVar = this.f178737a) == null || (eVar = dVar.f36375c) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.group.details.invite.b bVar = com.garmin.android.apps.connectmobile.group.details.invite.b.this;
        int i14 = dVar.f36374b;
        com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
        bVar.d7().C(i14, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        ((TextView) view2.findViewById(R.id.remove_invitation_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: vm0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178736b;

            {
                this.f178736b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        b bVar = this.f178736b;
                        com.garmin.android.apps.connectmobile.group.details.invite.b.d dVar = bVar.f178737a;
                        if (dVar != null) {
                            com.garmin.android.apps.connectmobile.group.details.invite.b bVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.this;
                            Context contextRequireContext = bVar2.requireContext();
                            contextRequireContext.getClass();
                            int i15 = dVar.f36374b;
                            e eVar = dVar.f36375c;
                            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(R.string.social_group_remove_your_invitation_title).setMessage(R.string.social_group_remove_invitation_message).setPositiveButton(R.string.lbl_remove, new h1(new h(bVar2, i15, eVar), 22)).setNegativeButton(R.string.lbl_close, new h1(new h(eVar, bVar2, i15), 23)).show();
                        }
                        bVar.f178738b = false;
                        bVar.dismiss();
                        break;
                    default:
                        b bVar3 = this.f178736b;
                        bVar3.f178738b = true;
                        bVar3.dismiss();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((TextView) view2.findViewById(R.id.cancel_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: vm0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178736b;

            {
                this.f178736b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        b bVar = this.f178736b;
                        com.garmin.android.apps.connectmobile.group.details.invite.b.d dVar = bVar.f178737a;
                        if (dVar != null) {
                            com.garmin.android.apps.connectmobile.group.details.invite.b bVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.this;
                            Context contextRequireContext = bVar2.requireContext();
                            contextRequireContext.getClass();
                            int i16 = dVar.f36374b;
                            e eVar = dVar.f36375c;
                            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(R.string.social_group_remove_your_invitation_title).setMessage(R.string.social_group_remove_invitation_message).setPositiveButton(R.string.lbl_remove, new h1(new h(bVar2, i16, eVar), 22)).setNegativeButton(R.string.lbl_close, new h1(new h(eVar, bVar2, i16), 23)).show();
                        }
                        bVar.f178738b = false;
                        bVar.dismiss();
                        break;
                    default:
                        b bVar3 = this.f178736b;
                        bVar3.f178738b = true;
                        bVar3.dismiss();
                        break;
                }
            }
        });
    }
}
