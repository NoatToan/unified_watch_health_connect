package do1;

import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.b f60598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f60599c;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.social.b bVar, ConversationCommentDTO conversationCommentDTO, int i14) {
        this.f60597a = i14;
        this.f60598b = bVar;
        this.f60599c = conversationCommentDTO;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        View view2;
        int i14 = this.f60597a;
        ConversationCommentDTO conversationCommentDTO = this.f60599c;
        com.garmin.android.apps.connectmobile.social.b bVar = this.f60598b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.social.b.a aVar = com.garmin.android.apps.connectmobile.social.b.T0;
                g3Var.getClass();
                int i15 = com.garmin.android.apps.connectmobile.social.b.c.f44519a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    conversationCommentDTO.f44556k = false;
                    conversationCommentDTO.f44557l--;
                    com.garmin.android.apps.connectmobile.social.e eVar = bVar.F;
                    if (eVar != null) {
                        String str = conversationCommentDTO.f44546a;
                        str.getClass();
                        eVar.a(str);
                    }
                } else if (i15 == 2) {
                    bVar.h7(conversationCommentDTO, g3Var.f35304e, false);
                } else if (i15 != 3) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                g3Var.getClass();
                int i16 = com.garmin.android.apps.connectmobile.social.b.c.f44519a[g3Var.f35300a.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            u0.r();
                            return null;
                        }
                    } else if (bVar.getActivity() != null) {
                        com.garmin.android.apps.connectmobile.social.e eVar2 = bVar.F;
                        if (eVar2 != null) {
                            String str2 = conversationCommentDTO.f44546a;
                            str2.getClass();
                            eVar2.a(str2);
                        }
                        String strM = am.j.m("Error removing comment ID [", conversationCommentDTO.f44546a, "].");
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "CommentsListFragment", strM);
                        lj0.b bVar2 = lj0.b.f112956j;
                        bVar2.getClass();
                        g22.e.b(bVar, bVar2);
                    }
                } else if (bVar.getActivity() != null) {
                    com.garmin.android.apps.connectmobile.social.e eVar3 = bVar.F;
                    if (eVar3 != null) {
                        String str3 = conversationCommentDTO.f44546a;
                        str3.getClass();
                        eVar3.a(str3);
                    }
                    com.garmin.android.apps.connectmobile.social.e eVar4 = bVar.F;
                    if (eVar4 != null) {
                        eVar4.remove(conversationCommentDTO);
                    }
                    com.garmin.android.apps.connectmobile.social.b.InterfaceC0842b interfaceC0842b = bVar.K0;
                    if (interfaceC0842b != null) {
                        int i17 = bVar.Q0 - 1;
                        bVar.Q0 = i17;
                        interfaceC0842b.r1(i17);
                    }
                    com.garmin.android.apps.connectmobile.social.e eVar5 = bVar.F;
                    if (eVar5 != null) {
                        eVar5.notifyDataSetChanged();
                    }
                    if (bVar.getActivity() != null && (view2 = bVar.L0) != null) {
                        com.garmin.android.apps.connectmobile.social.e eVar6 = bVar.F;
                        view2.setVisibility((eVar6 == null || eVar6.getCount() != 0) ? 8 : 0);
                    }
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.social.b.a aVar4 = com.garmin.android.apps.connectmobile.social.b.T0;
                g3Var.getClass();
                int i18 = com.garmin.android.apps.connectmobile.social.b.c.f44519a[g3Var.f35300a.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        bVar.h7(conversationCommentDTO, g3Var.f35304e, true);
                    } else if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                } else if (g3Var.f35301b != 0) {
                    conversationCommentDTO.f44556k = true;
                    conversationCommentDTO.f44557l++;
                    com.garmin.android.apps.connectmobile.social.e eVar7 = bVar.F;
                    if (eVar7 != null) {
                        String str4 = conversationCommentDTO.f44546a;
                        str4.getClass();
                        eVar7.a(str4);
                    }
                } else {
                    bVar.h7(conversationCommentDTO, null, true);
                }
                return Unit.INSTANCE;
        }
    }
}
