package go1;

import android.content.Context;
import android.text.Editable;
import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgo1/b0;", "Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$b;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends CommentView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f78215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f78216b;

    public b0(a0 a0Var, ConversationCommentDTO conversationCommentDTO) {
        this.f78215a = a0Var;
        this.f78216b = conversationCommentDTO;
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onClickComment");
        this.f78215a.f78207b.D2();
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void b() {
        String str;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onClickLikeCount");
        a0 a0Var = this.f78215a;
        v vVar = a0Var.f78207b;
        ConversationCommentDTO conversationCommentDTO = a0Var.f78210e;
        if (conversationCommentDTO == null || (str = conversationCommentDTO.f44546a) == null) {
            str = "";
        }
        vVar.n(str);
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void c() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onClickProfile");
        v vVar = this.f78215a.f78207b;
        ConversationCommentDTO conversationCommentDTO = this.f78216b;
        String str = conversationCommentDTO.f44550e;
        str.getClass();
        vVar.s1(str, conversationCommentDTO.f44551f);
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void d() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onDisplayCommentBottomSheet");
        a0 a0Var = this.f78215a;
        w wVar = a0Var.f78209d;
        if (wVar == null) {
            return;
        }
        a0Var.f78207b.p4(wVar, a0Var.getBindingAdapterPosition());
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void e() {
        a0 a0Var = this.f78215a;
        a0Var.f78207b.o1(a0Var.getBindingAdapterPosition(), false);
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void f(Editable editable) {
        editable.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onEditSave");
        a0 a0Var = this.f78215a;
        w wVar = a0Var.f78209d;
        CommentView commentView = a0Var.f78206a;
        if (wVar == null) {
            return;
        }
        w.c cVar = wVar.f78315e;
        cVar.f78322g = editable;
        ArrayList arrayListB = cs1.h.b(editable);
        cVar.f78323h.addAll(arrayListB);
        Context context = a0Var.itemView.getContext();
        context.getClass();
        commentView.setCommentBody(cs1.h.c(arrayListB, context, new z(a0Var, 1)));
        commentView.setCommentCreatedTime(a0Var.d(wVar, false));
        commentView.setCommentCreatedTimeContentDescription(a0Var.d(wVar, true));
        a0Var.f78207b.o1(a0Var.getBindingAdapterPosition(), true);
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void g(Editable editable) {
        w wVar = this.f78215a.f78209d;
        if (wVar == null) {
            return;
        }
        wVar.f78315e.f78321f = editable;
    }

    @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
    public final void h() {
        ConversationCommentDTO conversationCommentDTO;
        if (s3.b()) {
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CommentViewHolder", "onLikeOrUnlike");
        a0 a0Var = this.f78215a;
        CommentView commentView = a0Var.f78206a;
        w wVar = a0Var.f78209d;
        if (wVar == null || (conversationCommentDTO = wVar.f78313c) == null) {
            return;
        }
        w.c cVar = wVar.f78315e;
        if (cVar.f78319d) {
            return;
        }
        cVar.f78319d = true;
        boolean z14 = cVar.f78317b;
        if (z14) {
            commentView.setLikeByUser(false);
            commentView.setLikeCount(commentView.getLikeCount() - 1);
        } else {
            commentView.setLikeByUser(true);
            commentView.setLikeCount(commentView.getLikeCount() + 1);
        }
        v vVar = a0Var.f78207b;
        String str = conversationCommentDTO.f44546a;
        str.getClass();
        vVar.p0(str, z14);
    }
}
