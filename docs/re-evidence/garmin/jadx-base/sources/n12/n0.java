package n12;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Ln12/n0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Ln12/n0$f;", "onFrameSelectListener", "<init>", "(Ln12/n0$f;)V", "f", "d", "a", "c", JWKParameterNames.RSA_EXPONENT, "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f122268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f122269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f122270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f122271d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/n0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Ln12/n0;Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f122272d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f122273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f122274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n0 f122275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f122275c = n0Var;
            this.f122273a = new u0(view2);
            this.f122274b = view2.getContext();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/n0$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Ln12/n0;Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f122276c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f122277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0 f122278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n0 n0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f122278b = n0Var;
            this.f122277a = new u0(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/n0$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Ln12/n0;Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f122279a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n0 n0Var, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.gcp_hint_container);
            viewFindViewById.getClass();
            this.f122279a = (ComposeView) viewFindViewById;
        }
    }

    public interface f {
        void F0(com.garmin.android.apps.connectmobile.userprofile.model.e eVar);
    }

    static {
        new b(null);
    }

    public n0(f fVar) {
        fVar.getClass();
        this.f122268a = fVar;
        this.f122269b = new ArrayList();
        this.f122270c = true;
        this.f122271d = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f122269b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        e eVar = (e) this.f122269b.get(i14);
        if (eVar instanceof e.a) {
            return 1;
        }
        if (eVar instanceof e.b) {
            return 2;
        }
        if (eVar instanceof e.c) {
            return 3;
        }
        lc.u0.r();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String previewImageMobile;
        Object next;
        e eVar;
        f0Var.getClass();
        boolean z14 = f0Var instanceof a;
        ArrayList arrayList = this.f122269b;
        if (!z14) {
            if (!(f0Var instanceof c)) {
                if (f0Var instanceof d) {
                    ComposeView composeView = ((d) f0Var).f122279a;
                    n12.a.f122212a.getClass();
                    composeView.setContent(n12.a.f122214c);
                    return;
                }
                return;
            }
            Object obj = arrayList.get(i14);
            e.b bVar = obj instanceof e.b ? (e.b) obj : null;
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = bVar != null ? bVar.f122281a : null;
            c cVar = (c) f0Var;
            u0 u0Var = cVar.f122277a;
            n0 n0Var = cVar.f122278b;
            u0Var.a(i14 == n0Var.f122271d);
            u0Var.f122313b.setOnClickListener(new lq.g(17, n0Var, eVar2));
            if (eVar2 == null || (previewImageMobile = eVar2.getPreviewImageMobile()) == null) {
                previewImageMobile = "";
            }
            ge1.b.T(u0Var, null, null, new q0(u0Var, previewImageMobile, null), 3);
            ge1.b.T(u0Var, null, null, new t0(u0Var, !n0Var.f122270c, null), 3);
            return;
        }
        a aVar = (a) f0Var;
        int i15 = this.f122271d;
        arrayList.getClass();
        Iterator it = p13.h0.j1(arrayList).iterator();
        do {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                next = null;
                break;
            } else {
                next = o0Var.next();
                eVar = (e) ((p13.m0) next).f134952b;
                eVar.getClass();
            }
        } while (!(eVar instanceof e.a));
        p13.m0 m0Var = (p13.m0) next;
        boolean z15 = i15 == (m0Var != null ? m0Var.f134951a : -1);
        u0 u0Var2 = aVar.f122273a;
        u0Var2.a(z15);
        u0Var2.f122313b.setOnClickListener(new mt0.h0(aVar.f122275c, 9));
        Context context = aVar.f122274b;
        Drawable drawable = a7.b.getDrawable(context, R.drawable.profile_no_frame_drawable);
        if (drawable instanceof LayerDrawable) {
            Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.no_frame_icon);
            if (drawableFindDrawableByLayerId instanceof VectorDrawable) {
                drawableFindDrawableByLayerId.setTint(a7.b.getColor(context, R.color.gcm_icon_primary));
                drawableFindDrawableByLayerId.setTintMode(PorterDuff.Mode.SRC_IN);
            }
        }
        ge1.b.T(u0Var2, null, null, new s0(u0Var2, drawable, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 2) {
            View viewD = androidx.room.a0.d(viewGroup, R.layout.edit_profile_image_grid_item_with_check, viewGroup, false);
            viewD.getClass();
            return new c(this, viewD);
        }
        if (i14 != 3) {
            View viewD2 = androidx.room.a0.d(viewGroup, R.layout.edit_profile_image_grid_item_with_check, viewGroup, false);
            viewD2.getClass();
            return new a(this, viewD2);
        }
        View viewD3 = androidx.room.a0.d(viewGroup, R.layout.edit_profile_non_subscriber_hint_view, viewGroup, false);
        viewD3.getClass();
        return new d(this, viewD3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Ln12/n0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LIST_ITEM_TYPE_CLEAR", "I", "LIST_ITEM_TYPE_FRAME", "LIST_ITEM_TYPE_GCP_HOME", "POSITION_NO_SELECT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ln12/n0$e;", "", "<init>", "()V", "b", "a", "c", "Ln12/n0$e$a;", "Ln12/n0$e$b;", "Ln12/n0$e$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln12/n0$e$a;", "Ln12/n0$e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f122280a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1674276811;
            }

            public final String toString() {
                return "ClearItem";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln12/n0$e$b;", "Ln12/n0$e;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/e;", "frameDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/e;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.userprofile.model.e f122281a;

            static {
                Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.e> creator = com.garmin.android.apps.connectmobile.userprofile.model.e.CREATOR;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.garmin.android.apps.connectmobile.userprofile.model.e eVar) {
                super(null);
                eVar.getClass();
                this.f122281a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f122281a, ((b) obj).f122281a);
            }

            public final int hashCode() {
                return this.f122281a.hashCode();
            }

            public final String toString() {
                return "FrameItem(frameDTO=" + this.f122281a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln12/n0$e$c;", "Ln12/n0$e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f122282a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 566208977;
            }

            public final String toString() {
                return "GCPHomeItem";
            }
        }

        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }
}
