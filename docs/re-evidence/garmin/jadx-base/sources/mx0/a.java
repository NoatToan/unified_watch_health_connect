package mx0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmx0/a;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lmx0/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<T> extends RecyclerView.h<AbstractC2298a<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f121332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f121333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends T> f121334c;

    /* JADX INFO: renamed from: mx0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a$a;", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC2298a<T> extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC2298a(View view2) {
            super(view2);
            view2.getClass();
        }

        public abstract void d(T t7);
    }

    public a(Context context) {
        context.getClass();
        this.f121332a = context;
        this.f121333b = LayoutInflater.from(context);
        this.f121334c = j0.f134944a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f121334c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        AbstractC2298a abstractC2298a = (AbstractC2298a) f0Var;
        abstractC2298a.getClass();
        abstractC2298a.d(t(i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.f121333b;
        layoutInflater.getClass();
        return r(viewGroup, layoutInflater, i14);
    }

    public abstract AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14);

    public final T t(int i14) {
        int itemCount = getItemCount();
        if (i14 < itemCount) {
            return this.f121334c.get(i14);
        }
        h.z(k.e(i14, itemCount - 1, "Attempting to get item at invalid position: ", "/"));
        return null;
    }

    public final void u(List<? extends T> list) {
        list.getClass();
        this.f121334c = list;
        notifyDataSetChanged();
    }
}
