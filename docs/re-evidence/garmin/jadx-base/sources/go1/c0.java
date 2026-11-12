package go1;

import am.c2;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BC\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgo1/c0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "highlightedCommentUuid", "Lgo1/v;", "commentEventListener", "Lxg0/a;", "conversationEventListener", "Lxg0/n;", "mediaEventListener", "Lxg0/o;", "postEventListener", "Lam/c2;", "resourceType", "Lcs1/f;", "taggingSuggestionListener", "<init>", "(Ljava/lang/String;Lgo1/v;Lxg0/a;Lxg0/n;Lxg0/o;Lam/c2;Lcs1/f;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f78220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xg0.a f78221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xg0.n f78222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xg0.o f78223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f78224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cs1.f f78225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f78226h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78227a;

        static {
            int[] iArr = new int[c2.values().length];
            try {
                iArr[c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c2.NEWS_POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78227a = iArr;
        }
    }

    static {
        new a(null);
    }

    public c0(String str, v vVar, xg0.a aVar, xg0.n nVar, xg0.o oVar, c2 c2Var, cs1.f fVar) {
        vVar.getClass();
        aVar.getClass();
        nVar.getClass();
        oVar.getClass();
        fVar.getClass();
        this.f78219a = str;
        this.f78220b = vVar;
        this.f78221c = aVar;
        this.f78222d = nVar;
        this.f78223e = oVar;
        this.f78224f = c2Var;
        this.f78225g = fVar;
        this.f78226h = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f78226h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        w wVar = (w) p13.h0.e0(i14, this.f78226h);
        if (wVar != null) {
            return wVar.f78311a;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
        f0Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(f0Var, i14, list);
            return;
        }
        for (Object obj : list) {
            w wVar = (w) p13.h0.e0(i14, this.f78226h);
            if (wVar != null) {
                Parcelable parcelable = wVar.f78314d;
                w.c cVar = wVar.f78315e;
                if (obj instanceof u) {
                    a0 a0Var = f0Var instanceof a0 ? (a0) f0Var : null;
                    if (a0Var != null) {
                        a0Var.f78209d = wVar;
                        a0Var.f78210e = wVar.f78313c;
                        a0Var.f78211f = wVar.b();
                        a0Var.e(wVar);
                    }
                } else if (obj instanceof x) {
                    a0 a0Var2 = f0Var instanceof a0 ? (a0) f0Var : null;
                    if (a0Var2 != null) {
                        a0Var2.f78209d = wVar;
                        CommentView commentView = a0Var2.f78206a;
                        commentView.setLikeByUser(cVar.f78317b);
                        commentView.setLikeCount(cVar.f78318c);
                    }
                } else if (obj instanceof t) {
                    u22.b bVar = f0Var instanceof u22.b ? (u22.b) f0Var : null;
                    if (bVar != null) {
                        bVar.b(cVar.f78320e);
                    }
                } else if (obj instanceof s) {
                    a0 a0Var3 = f0Var instanceof a0 ? (a0) f0Var : null;
                    if (a0Var3 != null) {
                        ds1.a aVar = ((s) obj).f78309a;
                        CommentView commentView2 = a0Var3.f78206a;
                        commentView2.getClass();
                        commentView2.f47638j.a(aVar);
                    }
                } else if (obj instanceof e0) {
                    xg0.m mVar = f0Var instanceof xg0.m ? (xg0.m) f0Var : null;
                    if (mVar != null) {
                        wg0.a aVar2 = parcelable instanceof wg0.a ? (wg0.a) parcelable : null;
                        if (aVar2 != null) {
                            mVar.h(aVar2);
                        }
                    }
                } else if (obj instanceof f0) {
                    xg0.m mVar2 = f0Var instanceof xg0.m ? (xg0.m) f0Var : null;
                    if (mVar2 != null) {
                        wg0.a aVar3 = parcelable instanceof wg0.a ? (wg0.a) parcelable : null;
                        if (aVar3 != null) {
                            mVar2.f(aVar3);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) throws Exception {
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i14 == 0) {
            c2 c2Var = this.f78224f;
            int i15 = c2Var == null ? -1 : b.f78227a[c2Var.ordinal()];
            if (i15 == 1 || i15 == 2) {
                return new xg0.m(n23.j.b(viewGroup, R.layout.item_activity_feed, viewGroup, false), this.f78221c, this.f78222d, this.f78223e, true, null, 32, null);
            }
            throw new Exception("Fix me developer! Unsupported resourceType=[" + c2Var + "] found.");
        }
        v vVar = this.f78220b;
        if (i14 == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.view_previous_comments_list_item_3_0, viewGroup, false);
            viewInflate.setBackgroundColor(a7.b.getColor(viewGroup.getContext(), R.color.gcm_surface_1));
            return new h0(viewInflate, vVar);
        }
        if (i14 != 2) {
            throw new Exception(v.e0.f(i14, "Fix me developer! Unsupported viewType=[", "] found."));
        }
        Context context = viewGroup.getContext();
        context.getClass();
        return new a0(new CommentView(context, null, 0, 6, null), vVar, this.f78225g);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public final void r(w wVar, int i14) {
        boolean z14;
        Object f0Var;
        wVar.getClass();
        Parcelable parcelable = wVar.f78314d;
        ArrayList arrayList = this.f78226h;
        if (i14 >= arrayList.size()) {
            return;
        }
        w wVar2 = (w) arrayList.get(i14);
        arrayList.set(i14, wVar);
        w.c cVar = wVar2.f78315e;
        Parcelable parcelable2 = wVar2.f78314d;
        if (cVar.f78316a == null && wVar.f78315e.f78316a != null) {
            f0Var = new u(wVar);
        } else if (cVar.f78319d) {
            f0Var = new x(wVar);
        } else {
            boolean z15 = parcelable2 instanceof wg0.a;
            wg0.a aVar = z15 ? (wg0.a) parcelable2 : null;
            boolean z16 = false;
            if (aVar != null) {
                wg0.a aVar2 = parcelable instanceof wg0.a ? (wg0.a) parcelable : null;
                if (aVar2 == null) {
                    z14 = false;
                } else {
                    z14 = !p005kotlin.jvm.internal.s.g(aVar.f185060t, aVar2.f185060t);
                }
            } else {
                z14 = false;
            }
            if (z14) {
                f0Var = new e0(wVar);
            } else {
                wg0.a aVar3 = z15 ? (wg0.a) parcelable2 : null;
                if (aVar3 != null) {
                    wg0.a aVar4 = parcelable instanceof wg0.a ? (wg0.a) parcelable : null;
                    if (aVar4 != null) {
                        wg0.a.b bVar = wg0.a.F;
                        wg0.l lVar = aVar3.f185059r;
                        wg0.l lVar2 = aVar4.f185059r;
                        bVar.getClass();
                        z16 = !wg0.a.b.a(lVar, lVar2);
                    }
                }
                f0Var = z16 ? new f0(wVar) : null;
            }
        }
        notifyItemChanged(i14, f0Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo1/c0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        boolean z14;
        f0Var.getClass();
        w wVar = (w) p13.h0.e0(i14, this.f78226h);
        if (wVar != null) {
            ConversationCommentDTO conversationCommentDTO = wVar.f78313c;
            w.c cVar = wVar.f78315e;
            int i15 = wVar.f78311a;
            boolean z15 = false;
            if (i15 == 0) {
                Parcelable parcelable = wVar.f78314d;
                u22.a aVar = cVar.f78320e;
                if ((f0Var instanceof xg0.m) && (parcelable instanceof wg0.a)) {
                    ((xg0.m) f0Var).j((wg0.a) parcelable, 0, aVar);
                    return;
                }
                return;
            }
            if (i15 == 1) {
                ((h0) f0Var).b(cVar.f78320e);
                return;
            }
            if (i15 != 2) {
                return;
            }
            String str = this.f78219a;
            if (str == null) {
                z14 = false;
            } else {
                if (str.equalsIgnoreCase(conversationCommentDTO != null ? conversationCommentDTO.f44546a : null)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            a0 a0Var = (a0) f0Var;
            CommentView commentView = a0Var.f78206a;
            a0Var.f78209d = wVar;
            if (conversationCommentDTO == null) {
                return;
            }
            a0Var.f78210e = conversationCommentDTO;
            commentView.setHighlighted(z14);
            b12.b bVar = conversationCommentDTO.f44561p;
            bVar.getClass();
            commentView.setProfileImageData(bVar);
            String str2 = conversationCommentDTO.f44551f;
            if (str2 == null) {
                str2 = conversationCommentDTO.f44550e;
            }
            commentView.setAuthorFullName(str2);
            a0Var.e(wVar);
            boolean z16 = cVar.f78317b;
            int i16 = cVar.f78318c;
            commentView.setLikeByUser(z16);
            commentView.setLikeCount(i16);
            a0Var.f78211f = wVar.b();
            commentView.setSocialEnabled(true);
            if (s3.b()) {
                boolean z17 = i16 > 0;
                v22.e.r(commentView.f47635g, z17);
                TextView textView = commentView.f47636h;
                if (z17 && commentView.likeCount > 0) {
                    z15 = true;
                }
                v22.e.r(textView, z15);
            }
            commentView.setEditMode(cVar.f78320e);
            commentView.setOnCommentActionListener(new b0(a0Var, conversationCommentDTO));
            commentView.setTaggingSuggestionListener(a0Var.f78208c);
        }
    }
}
