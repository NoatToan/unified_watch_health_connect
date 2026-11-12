package rv2;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import bv2.j;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import cx2.g;
import java.util.Comparator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lrv2/a;", "Landroidx/recyclerview/widget/x;", "Lsv2/a;", "Lrv2/a$b;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "", "rowId", "", "iconSet", "iconFrame", "Landroidx/core/widget/NestedScrollView;", "nestedScrollView", "Ldx2/c;", "settingsViewModel", "<init>", "(Lo53/b0;ILjava/lang/String;Ljava/lang/String;Landroidx/core/widget/NestedScrollView;Ldx2/c;)V", "a", "b", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends x<sv2.a, b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f154753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f154756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NestedScrollView f154757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dx2.c f154758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f154759h;

    /* JADX INFO: renamed from: rv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrv2/a$a;", "Landroidx/recyclerview/widget/o$f;", "Lsv2/a;", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2932a extends o.f<sv2.a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(sv2.a aVar, sv2.a aVar2) {
            sv2.a aVar3 = aVar;
            sv2.a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return aVar3.equals(aVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(sv2.a aVar, sv2.a aVar2) {
            sv2.a aVar3 = aVar;
            sv2.a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return aVar3.equals(aVar4);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrv2/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Landroid/view/View;", "view", "<init>", "(Lrv2/a;Lo53/b0;Landroid/view/View;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f154760c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f154761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f154762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, b0 b0Var, View view2) {
            super(view2);
            b0Var.getClass();
            view2.getClass();
            this.f154762b = aVar;
            this.f154761a = b0Var;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((sv2.a) t7).f161030a), Integer.valueOf(((sv2.a) t14).f161030a));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((sv2.a) t7).f161030a), Integer.valueOf(((sv2.a) t14).f161030a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var, int i14, String str, String str2, NestedScrollView nestedScrollView, dx2.c cVar) {
        super(new C2932a());
        b0Var.getClass();
        nestedScrollView.getClass();
        cVar.getClass();
        this.f154753b = b0Var;
        this.f154754c = i14;
        this.f154755d = str;
        this.f154756e = str2;
        this.f154757f = nestedScrollView;
        this.f154758g = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.f154759h = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        b0 b0Var = bVar.f154761a;
        sv2.a aVarR = r(i14);
        aVarR.getClass();
        sv2.a aVar = aVarR;
        String str = aVar.f161031b;
        a aVar2 = bVar.f154762b;
        AppCompatImageView appCompatImageView = (AppCompatImageView) bVar.itemView.findViewById(R.id.icon_frame);
        String str2 = this.f154755d;
        if (appCompatImageView != null) {
            oc.b.H(appCompatImageView, aVar.f161032c);
            if (aVar.f161032c) {
                g.f(appCompatImageView, new zw2.g.c(str2, aVar2.f154756e, null, null), b0Var, 4);
            }
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) bVar.itemView.findViewById(R.id.icon);
        if (appCompatImageView2 != null) {
            g.f(appCompatImageView2, new zw2.g.c(str2, str, null, null), b0Var, 4);
            appCompatImageView2.setOnClickListener(new j(aVar, 28, aVar2, appCompatImageView2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, this.f154753b, n23.j.b(viewGroup, R.layout.rts_watch_face_grid_item_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.x
    public final void t(List<sv2.a> list) {
        super.t(h0.N0(list, new c()));
    }
}
