package com.garmin.android.apps.connectmobile.group.details.invite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b32.g;
import com.garmin.android.apps.connectmobile.R;
import f12.u;
import g22.n;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import vm0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/c;", "Lb32/g;", "Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;", "callback", "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.a f36381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d.a aVar) {
        super(R.layout.item_group_invite);
        aVar.getClass();
        this.f36381c = aVar;
        this.f36382d = new ArrayList();
    }

    @Override // b32.g, b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        d.f36383j.getClass();
        d.a aVar = this.f36381c;
        aVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_group_invite, viewGroup, false);
        viewInflate.getClass();
        return new d(viewInflate, aVar);
    }

    @Override // b32.g, b32.e
    public final void d(RecyclerView.f0 f0Var, final int i14) {
        String str;
        f0Var.getClass();
        if (f0Var instanceof d) {
            final d dVar = (d) f0Var;
            final e eVar = (e) h0.e0(i14, this.f36382d);
            TextView textView = dVar.f36388e;
            dVar.f36386c.setProfileImageData(new b12.b(eVar != null ? eVar.f178745a : null, null, u.a(eVar != null ? eVar.f178747c : 0), null, null, 26, null));
            TextView textView2 = dVar.f36387d;
            if (eVar == null || (str = eVar.f178746b) == null) {
                str = eVar != null ? eVar.f178755k : null;
                if (str == null) {
                    str = "";
                }
            }
            textView2.setText(str);
            String str2 = eVar != null ? eVar.f178748d : null;
            textView.setText(str2 != null ? str2 : "");
            v22.e.r(textView, n.d(str2));
            TextView textView3 = dVar.f36391h;
            Button button = dVar.f36392i;
            Button button2 = dVar.f36390g;
            Button button3 = dVar.f36389f;
            dVar.f36384a.setOnClickListener(new u12.e(23, dVar, eVar));
            if ((eVar != null ? eVar.f178750f : null) != null) {
                button3.setOnClickListener(null);
                button3.setVisibility(8);
                button2.setOnClickListener(null);
                button2.setVisibility(8);
                v22.e.q(textView3);
                button.setOnClickListener(null);
                button.setVisibility(8);
                return;
            }
            if ((eVar != null ? eVar.f178751g : null) == null) {
                if ((eVar != null ? eVar.f178752h : null) == null) {
                    button3.setEnabled(true);
                    final int i15 = 0;
                    button3.setOnClickListener(new View.OnClickListener() { // from class: vm0.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i15) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.group.details.invite.d dVar2 = dVar;
                                    dVar2.f36389f.setEnabled(false);
                                    dVar2.f36385b.F3(i14, eVar);
                                    break;
                                case 1:
                                    dVar.f36385b.F3(i14, eVar);
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.group.details.invite.d dVar3 = dVar;
                                    dVar3.f36390g.setEnabled(false);
                                    dVar3.f36385b.L2(i14, eVar);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.group.details.invite.d dVar4 = dVar;
                                    dVar4.f36392i.setEnabled(false);
                                    dVar4.f36385b.K0(i14, eVar);
                                    break;
                            }
                        }
                    });
                    button3.setTextAppearance(R.style.InviteButton);
                    button3.setBackgroundResource(R.drawable.invite_member_invite_background_selector);
                    button3.setVisibility(0);
                    button2.setOnClickListener(null);
                    button2.setVisibility(8);
                    v22.e.j(textView3);
                    button.setOnClickListener(null);
                    button.setVisibility(8);
                    return;
                }
            }
            wm0.a aVar = eVar.f178751g;
            Long l14 = eVar.f178754j;
            wm0.c cVar = eVar.f178752h;
            if ((aVar != null ? aVar.getInviteStatus() : null) == wm0.b.DECLINED) {
                button3.setEnabled(true);
                final int i16 = 1;
                button3.setOnClickListener(new View.OnClickListener() { // from class: vm0.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar2 = dVar;
                                dVar2.f36389f.setEnabled(false);
                                dVar2.f36385b.F3(i14, eVar);
                                break;
                            case 1:
                                dVar.f36385b.F3(i14, eVar);
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar3 = dVar;
                                dVar3.f36390g.setEnabled(false);
                                dVar3.f36385b.L2(i14, eVar);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar4 = dVar;
                                dVar4.f36392i.setEnabled(false);
                                dVar4.f36385b.K0(i14, eVar);
                                break;
                        }
                    }
                });
                button3.setTextAppearance(R.style.RejectedInviteButton);
                button3.setBackgroundResource(R.drawable.rejected_invite_member_invite_background_selector);
                button3.setVisibility(0);
                button2.setOnClickListener(null);
                button2.setVisibility(8);
                v22.e.j(textView3);
                button.setOnClickListener(null);
                button.setVisibility(8);
                return;
            }
            if ((cVar != null ? cVar.getRequestStatus() : null) == wm0.d.REQUESTED && s.g(cVar.getRequestorId(), l14)) {
                button3.setOnClickListener(null);
                button3.setVisibility(8);
                button2.setEnabled(true);
                final int i17 = 2;
                button2.setOnClickListener(new View.OnClickListener() { // from class: vm0.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i17) {
                            case 0:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar2 = dVar;
                                dVar2.f36389f.setEnabled(false);
                                dVar2.f36385b.F3(i14, eVar);
                                break;
                            case 1:
                                dVar.f36385b.F3(i14, eVar);
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar3 = dVar;
                                dVar3.f36390g.setEnabled(false);
                                dVar3.f36385b.L2(i14, eVar);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.group.details.invite.d dVar4 = dVar;
                                dVar4.f36392i.setEnabled(false);
                                dVar4.f36385b.K0(i14, eVar);
                                break;
                        }
                    }
                });
                button2.setVisibility(0);
                v22.e.j(textView3);
                button.setOnClickListener(null);
                button.setVisibility(8);
                return;
            }
            if ((aVar != null ? aVar.getInviteStatus() : null) != wm0.b.INVITED || !s.g(aVar.getInviteeId(), l14)) {
                button3.setOnClickListener(null);
                button3.setVisibility(8);
                button2.setOnClickListener(null);
                button2.setVisibility(8);
                v22.e.j(textView3);
                button.setOnClickListener(null);
                button.setVisibility(8);
                return;
            }
            button3.setOnClickListener(null);
            button3.setVisibility(8);
            button2.setOnClickListener(null);
            button2.setVisibility(8);
            v22.e.j(textView3);
            button.setEnabled(true);
            final int i18 = 3;
            button.setOnClickListener(new View.OnClickListener() { // from class: vm0.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            com.garmin.android.apps.connectmobile.group.details.invite.d dVar2 = dVar;
                            dVar2.f36389f.setEnabled(false);
                            dVar2.f36385b.F3(i14, eVar);
                            break;
                        case 1:
                            dVar.f36385b.F3(i14, eVar);
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.group.details.invite.d dVar3 = dVar;
                            dVar3.f36390g.setEnabled(false);
                            dVar3.f36385b.L2(i14, eVar);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.group.details.invite.d dVar4 = dVar;
                            dVar4.f36392i.setEnabled(false);
                            dVar4.f36385b.K0(i14, eVar);
                            break;
                    }
                }
            });
            button.setVisibility(0);
        }
    }

    @Override // b32.g, b32.d
    public final int getItemCount() {
        return this.f36382d.size();
    }
}
