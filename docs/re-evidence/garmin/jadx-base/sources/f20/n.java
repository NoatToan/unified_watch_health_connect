package f20;

import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.lifecycle.v1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import r22.c1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf20/n;", "Lr22/c1;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ContactActivity f68404h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i14, int i15, ContactActivity contactActivity, Resources resources, int i16, int i17) {
        super(resources, i14, i16, i15, i17);
        this.f68404h = contactActivity;
        resources.getClass();
    }

    @Override // r22.c1, androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        if (p(f0Var)) {
            return androidx.recyclerview.widget.s.d.k(0, 4);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        List<l20.g> listA;
        List<l20.a> listF;
        f0Var.getClass();
        final ContactActivity contactActivity = this.f68404h;
        com.garmin.android.apps.connectmobile.contacts.h hVar = contactActivity.f32299m;
        Object obj = null;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        final o oVar = (o) hVar.f32728e.get(f0Var.getBindingAdapterPosition());
        l20.r rVar = contactActivity.f32293g;
        l20.a aVarC = (rVar == null || (listF = rVar.f()) == null) ? null : com.garmin.android.apps.connectmobile.contacts.b.c(oVar.f68406b, oVar.f68418n, listF);
        if (contactActivity.f32310z) {
            if (aVarC != null && (listA = aVarC.A()) != null) {
                for (Object obj2 : listA) {
                    Long userId = ((l20.g) obj2).getUserId();
                    com.garmin.android.apps.connectmobile.userprofile.model.g gVar = contactActivity.A;
                    if (p005kotlin.jvm.internal.s.g(userId, gVar != null ? gVar.f46857a : null)) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (l20.g) obj;
            }
            if (obj != null) {
                contactActivity.ea(Integer.valueOf(f0Var.getBindingAdapterPosition()));
                return;
            }
        }
        boolean z14 = oVar.f68415k;
        String str = oVar.f68408d;
        if (z14 && contactActivity.f32288b == 1) {
            final int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            final int i15 = 1;
            final int i16 = 1;
            new androidx.appcompat.app.e.a(contactActivity).setTitle(R.string.remove_assistance_contact).setMessage(contactActivity.getString(R.string.remove_assistance_contact_description, str)).setCancelable(false).setNeutralButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: f20.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i17) {
                    int i18 = i15;
                    int i19 = bindingAdapterPosition;
                    ContactActivity contactActivity2 = contactActivity;
                    switch (i18) {
                        case 0:
                            ContactActivity.a aVar = ContactActivity.T;
                            contactActivity2.ka(Integer.valueOf(i19));
                            break;
                        default:
                            ContactActivity.a aVar2 = ContactActivity.T;
                            contactActivity2.ka(Integer.valueOf(i19));
                            break;
                    }
                }
            }).setPositiveButton(R.string.remove_assistance_contact, new DialogInterface.OnClickListener() { // from class: f20.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i17) {
                    switch (i16) {
                        case 0:
                            ContactActivity contactActivity2 = contactActivity;
                            l20.r rVar2 = contactActivity2.f32293g;
                            List<l20.a> listF2 = rVar2 != null ? rVar2.f() : null;
                            if (listF2 == null) {
                                listF2 = j0.f134944a;
                            }
                            ArrayList arrayListD1 = h0.d1(listF2);
                            o oVar2 = oVar;
                            l20.a aVarC2 = com.garmin.android.apps.connectmobile.contacts.b.c(oVar2.f68406b, oVar2.f68418n, arrayListD1);
                            com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity2.ga();
                            dVarGa.getClass();
                            if ((aVarC2 != null ? aVarC2.getContactId() : null) != null) {
                                ge1.b.T(v1.a(dVarGa), null, null, new s(dVarGa, aVarC2, null), 3);
                            }
                            contactActivity2.ka(Integer.valueOf(bindingAdapterPosition));
                            break;
                        default:
                            ContactActivity contactActivity3 = contactActivity;
                            l20.r rVar3 = contactActivity3.f32293g;
                            List<l20.a> listF3 = rVar3 != null ? rVar3.f() : null;
                            if (listF3 == null) {
                                listF3 = j0.f134944a;
                            }
                            ArrayList arrayListD2 = h0.d1(listF3);
                            o oVar3 = oVar;
                            l20.a aVarC3 = com.garmin.android.apps.connectmobile.contacts.b.c(oVar3.f68406b, oVar3.f68418n, arrayListD2);
                            com.garmin.android.apps.connectmobile.contacts.d dVarGa2 = contactActivity3.ga();
                            dVarGa2.getClass();
                            if (aVarC3 != null) {
                                ge1.b.T(v1.a(dVarGa2), null, null, new u(dVarGa2, aVarC3, null), 3);
                            }
                            contactActivity3.ka(Integer.valueOf(bindingAdapterPosition));
                            break;
                    }
                }
            }).setNegativeButton(R.string.remove_from_garmin_connect, new ag0.d(22, contactActivity, oVar)).setOnCancelListener(new f(contactActivity, bindingAdapterPosition, 1)).show();
            return;
        }
        final int bindingAdapterPosition2 = f0Var.getBindingAdapterPosition();
        final int i17 = 0;
        final int i18 = 0;
        new androidx.appcompat.app.e.a(contactActivity).setTitle(R.string.contact_management_title_delete_contact).setMessage(contactActivity.getString(R.string.delete_contact_message, str)).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: f20.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i19) {
                int i110 = i17;
                int i111 = bindingAdapterPosition2;
                ContactActivity contactActivity2 = contactActivity;
                switch (i110) {
                    case 0:
                        ContactActivity.a aVar = ContactActivity.T;
                        contactActivity2.ka(Integer.valueOf(i111));
                        break;
                    default:
                        ContactActivity.a aVar2 = ContactActivity.T;
                        contactActivity2.ka(Integer.valueOf(i111));
                        break;
                }
            }
        }).setPositiveButton(R.string.lbl_delete, new DialogInterface.OnClickListener() { // from class: f20.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i19) {
                switch (i18) {
                    case 0:
                        ContactActivity contactActivity2 = contactActivity;
                        l20.r rVar2 = contactActivity2.f32293g;
                        List<l20.a> listF2 = rVar2 != null ? rVar2.f() : null;
                        if (listF2 == null) {
                            listF2 = j0.f134944a;
                        }
                        ArrayList arrayListD1 = h0.d1(listF2);
                        o oVar2 = oVar;
                        l20.a aVarC2 = com.garmin.android.apps.connectmobile.contacts.b.c(oVar2.f68406b, oVar2.f68418n, arrayListD1);
                        com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity2.ga();
                        dVarGa.getClass();
                        if ((aVarC2 != null ? aVarC2.getContactId() : null) != null) {
                            ge1.b.T(v1.a(dVarGa), null, null, new s(dVarGa, aVarC2, null), 3);
                        }
                        contactActivity2.ka(Integer.valueOf(bindingAdapterPosition2));
                        break;
                    default:
                        ContactActivity contactActivity3 = contactActivity;
                        l20.r rVar3 = contactActivity3.f32293g;
                        List<l20.a> listF3 = rVar3 != null ? rVar3.f() : null;
                        if (listF3 == null) {
                            listF3 = j0.f134944a;
                        }
                        ArrayList arrayListD2 = h0.d1(listF3);
                        o oVar3 = oVar;
                        l20.a aVarC3 = com.garmin.android.apps.connectmobile.contacts.b.c(oVar3.f68406b, oVar3.f68418n, arrayListD2);
                        com.garmin.android.apps.connectmobile.contacts.d dVarGa2 = contactActivity3.ga();
                        dVarGa2.getClass();
                        if (aVarC3 != null) {
                            ge1.b.T(v1.a(dVarGa2), null, null, new u(dVarGa2, aVarC3, null), 3);
                        }
                        contactActivity3.ka(Integer.valueOf(bindingAdapterPosition2));
                        break;
                }
            }
        }).setOnCancelListener(new f(contactActivity, bindingAdapterPosition2, 0)).show();
    }

    @Override // r22.c1
    public final boolean p(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        com.garmin.android.apps.connectmobile.contacts.h hVar = this.f68404h.f32299m;
        if (hVar != null) {
            return hVar.f32726c && f0Var.getItemViewType() == 1;
        }
        p005kotlin.jvm.internal.s.m("adapter");
        throw null;
    }
}
