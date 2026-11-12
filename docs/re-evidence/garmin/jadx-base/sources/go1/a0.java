package go1;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fo1.m0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lgo1/a0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lu22/b;", "Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView;", "commentView", "Lgo1/v;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcs1/f;", "taggingSuggestionListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView;Lgo1/v;Lcs1/f;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends RecyclerView.f0 implements u22.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f78205g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommentView f78206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f78207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cs1.f f78208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f78209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConversationCommentDTO f78210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78211f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78212a;

        static {
            int[] iArr = new int[u22.a.values().length];
            try {
                iArr[u22.a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f78212a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(CommentView commentView, v vVar, cs1.f fVar) {
        super(commentView);
        commentView.getClass();
        vVar.getClass();
        fVar.getClass();
        this.f78206a = commentView;
        this.f78207b = vVar;
        this.f78208c = fVar;
    }

    @Override // u22.b
    public final void b(u22.a aVar) {
        w wVar;
        aVar.getClass();
        this.f78206a.setEditMode(aVar);
        boolean zB = false;
        if (b.f78212a[aVar.ordinal()] == 1 && (wVar = this.f78209d) != null) {
            zB = wVar.b();
        }
        this.f78211f = zB;
    }

    public final String d(w wVar, boolean z14) {
        ConversationCommentDTO conversationCommentDTO = wVar.f78313c;
        if (conversationCommentDTO == null) {
            return "";
        }
        String str = conversationCommentDTO.f44548c;
        if (str == null || str.length() == 0 || wVar.f78315e.f78322g != null) {
            return u62.z.b(R.string.social_posting, this.itemView);
        }
        Context context = this.itemView.getContext();
        context.getClass();
        String strA = m0.a(conversationCommentDTO, context, z14);
        Boolean bool = conversationCommentDTO.f44559n;
        if (bool != null && bool.booleanValue()) {
            strA = this.itemView.getContext().getString(R.string.social_comment_edited, strA);
        }
        strA.getClass();
        return strA;
    }

    public final void e(w wVar) {
        CharSequence charSequenceValueOf;
        Spannable spannableC;
        List arrayList;
        String str;
        Context context = this.itemView.getContext();
        ArrayList arrayList2 = new ArrayList();
        w.c cVar = wVar.f78315e;
        ConversationCommentDTO conversationCommentDTO = wVar.f78313c;
        if (cVar.f78322g == null && cVar.f78323h.isEmpty()) {
            charSequenceValueOf = (conversationCommentDTO == null || (str = conversationCommentDTO.f44555j) == null) ? null : SpannableString.valueOf(str);
            if (conversationCommentDTO == null || (arrayList = conversationCommentDTO.f44562q) == null) {
                arrayList = new ArrayList();
            }
            arrayList2.addAll(arrayList);
        } else {
            charSequenceValueOf = cVar.f78322g;
            arrayList2.addAll(cVar.f78323h);
        }
        if (arrayList2.isEmpty()) {
            if (charSequenceValueOf == null) {
                charSequenceValueOf = "";
            }
            spannableC = new SpannableString(charSequenceValueOf);
        } else {
            context.getClass();
            spannableC = cs1.h.c(arrayList2, context, new z(this, 0));
        }
        CommentView commentView = this.f78206a;
        commentView.setCommentBody(spannableC);
        Spannable spannable = cVar.f78321f;
        if (spannable != null) {
            commentView.setEditingText(spannable);
        } else {
            commentView.setEditingText(SpannableString.valueOf(""));
        }
        commentView.setCommentCreatedTime(d(wVar, false));
        commentView.setCommentCreatedTimeContentDescription(d(wVar, true));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo1/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
