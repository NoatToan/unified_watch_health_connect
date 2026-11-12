package n12;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Ln12/v0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "c", "d", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122319a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.editimage.b f122320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f122321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f122322d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/v0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Ln12/v0;Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f122323c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f122324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f122325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v0 v0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f122325b = v0Var;
            this.f122324a = new u0(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/v0$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroidx/compose/ui/platform/ComposeView;", "view", "<init>", "(Ln12/v0;Landroidx/compose/ui/platform/ComposeView;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f122330c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f122331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f122332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v0 v0Var, ComposeView composeView) {
            super(composeView);
            composeView.getClass();
            this.f122332b = v0Var;
            this.f122331a = composeView;
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f122319a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        c cVar = (c) this.f122319a.get(i14);
        if ((cVar instanceof c.a) || (cVar instanceof c.b)) {
            return 1;
        }
        if (cVar instanceof c.C2310c) {
            return 2;
        }
        lc.u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        Uri uri;
        f0Var.getClass();
        boolean z14 = f0Var instanceof d;
        ArrayList arrayList = this.f122319a;
        if (z14) {
            c cVar = (c) arrayList.get(i14);
            if ((cVar instanceof c.a) || (cVar instanceof c.b)) {
                d dVar = (d) f0Var;
                cVar.getClass();
                dVar.f122331a.setContent(new z3.e(-362541835, true, new w0(cVar, dVar.f122332b, dVar, 0)));
                return;
            }
            return;
        }
        if (f0Var instanceof b) {
            Object obj = arrayList.get(i14);
            c.C2310c c2310c = obj instanceof c.C2310c ? (c.C2310c) obj : null;
            if (c2310c == null) {
                return;
            }
            b bVar = (b) f0Var;
            u0 u0Var = bVar.f122324a;
            String strG = c2310c.f122328a.g();
            if (strG == null || (uri = Uri.parse(strG)) == null) {
                return;
            }
            u0Var.getClass();
            View view2 = u0Var.f122313b;
            ge1.b.T(u0Var, null, null, new p0(u0Var, uri, null), 3);
            u0Var.f122314c.setContentDescription(view2.getContext().getString(R.string.title_view_avatar));
            u0Var.a(c2310c.f122329b);
            view2.setOnClickListener(new lq.g(18, bVar.f122325b, uri));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 1) {
            Context context = viewGroup.getContext();
            context.getClass();
            return new d(this, new ComposeView(context, null, 0, 6, null));
        }
        if (i14 != 2) {
            vb.h.s(am.j.h(i14, "Unsupported view type: "));
            return null;
        }
        View viewD = androidx.room.a0.d(viewGroup, R.layout.edit_profile_image_grid_item_with_check, viewGroup, false);
        viewD.getClass();
        return new b(this, viewD);
    }

    public final void r(Uri uri) {
        uri.getClass();
        ArrayList arrayList = this.f122319a;
        c cVar = (c) p13.h0.m0(arrayList);
        if (cVar instanceof c.C2310c) {
            int iIndexOf = arrayList.indexOf(cVar);
            com.garmin.android.apps.connectmobile.userprofile.model.p pVar = ((c.C2310c) cVar).f122328a;
            String strG = pVar.g();
            boolean zEquals = uri.equals(strG != null ? Uri.parse(strG) : null);
            arrayList.set(iIndexOf, new c.C2310c(pVar, zEquals));
            notifyItemChanged(iIndexOf, Boolean.valueOf(zEquals));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln12/v0$a;", "", "<init>", "()V", "", "ITEM_TYPE_TOOL", "I", "ITEM_TYPE_PROFILE", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ln12/v0$c;", "", "<init>", "()V", "a", "b", "c", "Ln12/v0$c$a;", "Ln12/v0$c$b;", "Ln12/v0$c$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln12/v0$c$a;", "Ln12/v0$c;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f122326a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1255581613;
            }

            public final String toString() {
                return "Camera";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln12/v0$c$b;", "Ln12/v0$c;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f122327a = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -477355062;
            }

            public final String toString() {
                return "Gallery";
            }
        }

        /* JADX INFO: renamed from: n12.v0$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln12/v0$c$c;", "Ln12/v0$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/p;", "userProfileImageDTO", "", "isSelected", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/p;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2310c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.userprofile.model.p f122328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f122329b;

            static {
                Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.p> creator = com.garmin.android.apps.connectmobile.userprofile.model.p.CREATOR;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2310c(com.garmin.android.apps.connectmobile.userprofile.model.p pVar, boolean z14) {
                super(null);
                pVar.getClass();
                this.f122328a = pVar;
                this.f122329b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2310c)) {
                    return false;
                }
                C2310c c2310c = (C2310c) obj;
                return p005kotlin.jvm.internal.s.g(this.f122328a, c2310c.f122328a) && this.f122329b == c2310c.f122329b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f122329b) + (this.f122328a.hashCode() * 31);
            }

            public final String toString() {
                return "Profile(userProfileImageDTO=" + this.f122328a + ", isSelected=" + this.f122329b + ")";
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
        f0Var.getClass();
        list.getClass();
        if (!list.isEmpty() && (f0Var instanceof b)) {
            b bVar = (b) f0Var;
            Object objB0 = p13.h0.b0(list);
            Boolean bool = objB0 instanceof Boolean ? (Boolean) objB0 : null;
            bVar.f122324a.a(bool != null ? bool.booleanValue() : false);
            return;
        }
        onBindViewHolder(f0Var, i14);
    }
}
