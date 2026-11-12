package go1;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import p005kotlin.Metadata;
import r22.c1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgo1/n;", "Lr22/c1;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f78291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Resources resources, int i14, int i15, int i16, int i17) {
        super(resources, i14, i15, i16, i17);
        this.f78291h = kVar;
        resources.getClass();
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        ConversationCommentDTO conversationCommentDTO;
        f0Var.getClass();
        int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
        k kVar = this.f78291h;
        w wVar = (w) p13.h0.e0(bindingAdapterPosition, kVar.y6().f78226h);
        if (wVar == null || (conversationCommentDTO = wVar.f78313c) == null) {
            return;
        }
        String str = conversationCommentDTO.f44547b;
        str.getClass();
        String str2 = conversationCommentDTO.f44546a;
        str2.getClass();
        String str3 = conversationCommentDTO.f44548c;
        str3.getClass();
        kVar.G6(bindingAdapterPosition, str, str2, str3);
    }

    @Override // r22.c1
    public final boolean p(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        if (f0Var.getItemViewType() != 2) {
            return false;
        }
        a0 a0Var = f0Var instanceof a0 ? (a0) f0Var : null;
        return a0Var != null && a0Var.f78211f;
    }
}
