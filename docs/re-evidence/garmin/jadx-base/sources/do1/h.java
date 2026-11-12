package do1;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import fo1.g0;
import fo1.j0;
import fo1.l0;
import fo1.o0;
import o53.f0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.b f60596b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.social.b bVar, int i14) {
        this.f60595a = i14;
        this.f60596b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f60595a;
        com.garmin.android.apps.connectmobile.social.b bVar = this.f60596b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.social.b.a aVar = com.garmin.android.apps.connectmobile.social.b.T0;
                bVar.f7();
                break;
            case 1:
                com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                bVar.M7();
                TextView textView = bVar.E;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                break;
            case 2:
                com.garmin.android.apps.connectmobile.social.b.a aVar3 = com.garmin.android.apps.connectmobile.social.b.T0;
                if (view2 != null) {
                    Object tag = view2.getTag();
                    tag.getClass();
                    ConversationCommentDTO conversationCommentDTO = ((com.garmin.android.apps.connectmobile.social.d.a) tag).f44575k;
                    if (conversationCommentDTO != null) {
                        boolean z14 = conversationCommentDTO.f44556k;
                        com.garmin.android.apps.connectmobile.social.e eVar = bVar.F;
                        if (!z14) {
                            if (eVar != null) {
                                String str = conversationCommentDTO.f44546a;
                                str.getClass();
                                eVar.d(str);
                            }
                            o0 o0VarY6 = bVar.Y6();
                            String str2 = conversationCommentDTO.f44546a;
                            str2.getClass();
                            l0 l0Var = o0VarY6.f72654a;
                            l0Var.getClass();
                            dh.b.L(f0.N(new g0(l0Var, str2, null)), bVar, new com.garmin.android.apps.connectmobile.social.b.e(new i(bVar, conversationCommentDTO, 2)));
                        } else {
                            if (eVar != null) {
                                String str3 = conversationCommentDTO.f44546a;
                                str3.getClass();
                                eVar.d(str3);
                            }
                            o0 o0VarY7 = bVar.Y6();
                            String str4 = conversationCommentDTO.f44546a;
                            str4.getClass();
                            l0 l0Var2 = o0VarY7.f72654a;
                            l0Var2.getClass();
                            dh.b.L(f0.N(new j0(l0Var2, str4, null)), bVar, new com.garmin.android.apps.connectmobile.social.b.e(new i(bVar, conversationCommentDTO, 0)));
                        }
                    }
                }
                break;
            case 3:
                com.garmin.android.apps.connectmobile.social.b.a aVar4 = com.garmin.android.apps.connectmobile.social.b.T0;
                bv.g gVar = (bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null);
                androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                mVarRequireActivity.getClass();
                gVar.f(mVarRequireActivity, bVar.H0, bVar instanceof j10.s);
                break;
            default:
                com.garmin.android.apps.connectmobile.social.b.a aVar5 = com.garmin.android.apps.connectmobile.social.b.T0;
                if (view2 != null) {
                    Object tag2 = view2.getTag();
                    tag2.getClass();
                    ConversationCommentDTO conversationCommentDTO2 = ((com.garmin.android.apps.connectmobile.social.d.a) tag2).f44575k;
                    if (conversationCommentDTO2 != null) {
                        String string = bVar.getString(R.string.msg_conversation_confirm_delete);
                        string.getClass();
                        q1.b bVar2 = q1.f41066b;
                        com.google.android.exoplayer2.analytics.q qVar = new com.google.android.exoplayer2.analytics.q(12, bVar, conversationCommentDTO2);
                        bVar2.getClass();
                        q1 q1VarA = q1.b.a(R.string.title_conversation_confirm_delete, string, R.string.lbl_delete, R.string.lbl_cancel, qVar);
                        androidx.fragment.app.v childFragmentManager = bVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        q1VarA.v6(childFragmentManager, "delete_comment_dialog_fragment");
                    }
                }
                break;
        }
    }
}
