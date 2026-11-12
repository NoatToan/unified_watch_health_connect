package qm0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lqm0/a0;", "Ls51/d;", "Lwg0/a;", "Lxg0/a;", "conversationEventListener", "Lxg0/n;", "mediaEventListener", "Lxg0/o;", "postEventListener", "Lqm0/x$b;", "feedType", "<init>", "(Lxg0/a;Lxg0/n;Lxg0/o;Lqm0/x$b;)V", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends s51.d<wg0.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xg0.a f145472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xg0.n f145473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xg0.o f145474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x.b f145475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f145476m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqm0/a0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lqm0/a0;Landroid/view/View;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f145477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f145478b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145479a;

            static {
                int[] iArr = new int[x.b.values().length];
                try {
                    iArr[x.b.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x.b.ACTIVITY_FEED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x.b.POST_FEED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f145479a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f145478b = a0Var;
            View viewFindViewById = view2.findViewById(R.id.hint_text_view);
            viewFindViewById.getClass();
            this.f145477a = (TextView) viewFindViewById;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(xg0.a aVar, xg0.n nVar, xg0.o oVar, x.b bVar) {
        super(wg0.a.P);
        aVar.getClass();
        nVar.getClass();
        oVar.getClass();
        bVar.getClass();
        wg0.a.F.getClass();
        this.f145472i = aVar;
        this.f145473j = nVar;
        this.f145474k = oVar;
        this.f145475l = bVar;
        this.f145476m = 90;
    }

    @Override // s51.d
    public final void A(RecyclerView.f0 f0Var) {
        String string;
        if (f0Var instanceof b) {
            b bVar = (b) f0Var;
            TextView textView = bVar.f145477a;
            a0 a0Var = bVar.f145478b;
            int i14 = b.a.f145479a[a0Var.f145475l.ordinal()];
            if (i14 == 1) {
                string = String.format(u62.z.b(R.string.social_group_activity_and_post_feed_footer, bVar.itemView), Arrays.copyOf(new Object[]{Integer.valueOf(a0Var.f145476m)}, 1));
            } else if (i14 == 2) {
                string = String.format(u62.z.b(R.string.social_group_activity_feed_footer, bVar.itemView), Arrays.copyOf(new Object[]{Integer.valueOf(a0Var.f145476m)}, 1));
            } else {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                string = bVar.itemView.getContext().getString(R.string.social_group_post_feed_footer);
            }
            textView.setText(string);
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 D(ViewGroup viewGroup) {
        return new b(this, n23.j.b(viewGroup, R.layout.item_activity_footer, viewGroup, false));
    }

    @Override // s51.d
    public final void G(int i14, RecyclerView.f0 f0Var) {
        wg0.a aVarT = t(i14);
        if (aVarT != null && (f0Var instanceof xg0.m)) {
            ((xg0.m) f0Var).j(aVarT, i14, u22.a.NORMAL);
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 H(ViewGroup viewGroup, int i14) {
        View viewD = androidx.room.a0.d(viewGroup, R.layout.item_activity_feed, viewGroup, false);
        viewD.getClass();
        return new xg0.m(viewD, this.f145472i, this.f145473j, this.f145474k, false, null, 48, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
        f0Var.getClass();
        list.getClass();
        wg0.a aVarT = t(i14);
        if (aVarT == null) {
            return;
        }
        xg0.m mVar = f0Var instanceof xg0.m ? (xg0.m) f0Var : null;
        if (mVar == null) {
            return;
        }
        if (list.isEmpty()) {
            G(i14, f0Var);
            return;
        }
        Object obj = list.get(0);
        List list2 = obj instanceof List ? (List) obj : null;
        if (list2 == null) {
            G(i14, f0Var);
            return;
        }
        for (Object obj2 : list2) {
            if (obj2 instanceof wg0.m) {
                mVar.h(aVarT);
            } else if (obj2 instanceof wg0.l) {
                mVar.f(aVarT);
            } else {
                mVar.j(aVarT, i14, u22.a.NORMAL);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm0/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a0(xg0.a aVar, xg0.n nVar, xg0.o oVar, x.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, nVar, oVar, (i14 & 8) != 0 ? x.b.ACTIVITY_FEED : bVar);
    }
}
