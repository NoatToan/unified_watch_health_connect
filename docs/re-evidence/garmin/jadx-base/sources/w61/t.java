package w61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.view.CaterpillarChart;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lw61/t;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f183252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.performance.stats.improvement.d f183253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f183255d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw61/t$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lw61/t;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f183256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f183257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f183258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, View view2) {
            super(view2);
            view2.getClass();
            this.f183258c = tVar;
            View viewFindViewById = view2.findViewById(R.id.layout);
            viewFindViewById.getClass();
            View viewFindViewById2 = view2.findViewById(R.id.label_left);
            viewFindViewById2.getClass();
            this.f183256a = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.label_right);
            viewFindViewById3.getClass();
            this.f183257b = (TextView) viewFindViewById3;
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            if (getBindingAdapterPosition() != -1) {
                int bindingAdapterPosition = getBindingAdapterPosition();
                t tVar = this.f183258c;
                if (bindingAdapterPosition <= tVar.f183255d.size() && !((x61.j) tVar.f183255d.get(getBindingAdapterPosition())).f189259f) {
                    tVar.f183254c = getBindingAdapterPosition() != tVar.f183254c ? getBindingAdapterPosition() : -1;
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = tVar.f183253b;
                    if (dVar != null) {
                        int size = (tVar.f183255d.size() - 1) - getBindingAdapterPosition();
                        CaterpillarChart caterpillarChart = dVar.f40133m;
                        if (caterpillarChart == null) {
                            p005kotlin.jvm.internal.s.m("trainingStatusSummaryChart");
                            throw null;
                        }
                        caterpillarChart.a(size);
                    }
                    tVar.notifyDataSetChanged();
                }
            }
        }
    }

    static {
        new a(null);
    }

    public t(Context context) {
        context.getClass();
        this.f183252a = context;
        this.f183254c = -2;
        this.f183255d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f183255d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 >= 0) {
            b bVar = (b) f0Var;
            x61.j jVar = (x61.j) this.f183255d.get(i14);
            jVar.getClass();
            TextView textView = bVar.f183256a;
            textView.setText(jVar.f189254a);
            t tVar = bVar.f183258c;
            int i15 = jVar.f189255b;
            boolean z14 = jVar.f189259f;
            Context context = tVar.f183252a;
            Drawable drawable = a7.b.getDrawable(context, R.drawable.dot_small);
            GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i15);
            }
            if (z14) {
                if (gradientDrawable != null) {
                    gradientDrawable.setStroke(3, a7.b.getColor(context, R.color.gcm_icon_secondary));
                }
            } else if (gradientDrawable != null) {
                gradientDrawable.setStroke(3, i15);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(gradientDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding((int) tVar.f183252a.getResources().getDimension(R.dimen.spacing_small));
            bVar.f183257b.setText(jVar.f189256c);
            int i16 = tVar.f183254c;
            if (i16 >= 0) {
                bVar.itemView.setAlpha(bVar.getBindingAdapterPosition() != tVar.f183254c ? 0.2f : 1.0f);
            } else if (i16 == -1 || i16 == -2) {
                bVar.itemView.setAlpha(1.0f);
            }
            int i17 = i14 % 2;
            View view2 = bVar.itemView;
            if (i17 == 0) {
                view2.setBackgroundResource(R.color.gcm_table_row_even);
            } else {
                view2.setBackgroundResource(R.color.gcm_table_row_odd);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f183252a).inflate(R.layout.gcm_simple_list_item_one_row, viewGroup, false);
        viewInflate.getClass();
        return new b(this, viewInflate);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lw61/t$a;", "", "<init>", "()V", "", "DEFAULT_HIGHLIGHT_POSITION", "I", "NO_HIGHLIGHT_POSITION", "", "ALPHA_FADE_IN", "F", "ALPHA_FADE_OUT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
