package id1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\nB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lid1/a;", "T", "Landroidx/recyclerview/widget/x;", "Lid1/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/recyclerview/widget/o$f;", "callback", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/o$f;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<T> extends x<T, AbstractC1773a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f93013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93014d;

    /* JADX INFO: renamed from: id1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid1/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1773a extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC1773a(View view2) {
            super(view2);
            view2.getClass();
        }

        public abstract void d(int i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, o.f<T> fVar) {
        super(fVar);
        context.getClass();
        fVar.getClass();
        this.f93012b = context;
        this.f93013c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        AbstractC1773a abstractC1773a = (AbstractC1773a) f0Var;
        abstractC1773a.getClass();
        abstractC1773a.d(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.f93013c;
        layoutInflater.getClass();
        return u(viewGroup, layoutInflater, i14);
    }

    public abstract AbstractC1773a u(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14);
}
