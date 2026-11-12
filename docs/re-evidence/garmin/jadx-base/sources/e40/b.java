package e40;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import dv0.n;
import java.util.ArrayList;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\t\nB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Le40/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lkotlin/Function0;", "", "selectionChangedListener", "<init>", "(Le23/a;)V", "b", "c", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f62835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f62836b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62837c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f62838d;

    /* JADX INFO: renamed from: e40.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le40/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Le40/b;Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C1321b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f62839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1321b(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f62839a = (TextView) view2.findViewById(R.id.section_header_text);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le40/b$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Le40/b;Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f62840e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f62841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f62842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f62843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f62844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f62841a = (ImageView) view2.findViewById(R.id.icon);
            this.f62842b = (TextView) view2.findViewById(R.id.label_top);
            this.f62843c = (TextView) view2.findViewById(R.id.label_bottom);
            this.f62844d = view2.findViewById(R.id.checkmark_icon);
            view2.setOnClickListener(new cw2.b(7, this, bVar));
        }
    }

    static {
        new a(null);
    }

    public b(e23.a<Unit> aVar) {
        this.f62835a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f62836b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (i14 == -1) {
            return -1;
        }
        return !(this.f62836b.get(i14) instanceof f.a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        boolean z14 = f0Var instanceof c;
        ArrayList arrayList = this.f62836b;
        if (!z14) {
            if (f0Var instanceof C1321b) {
                Object obj = arrayList.get(i14);
                f.a aVar = obj instanceof f.a ? (f.a) obj : null;
                if (aVar != null) {
                    String str = aVar.f62854a;
                    str.getClass();
                    ((C1321b) f0Var).f62839a.setText(str);
                    return;
                }
                return;
            }
            return;
        }
        Object obj2 = arrayList.get(i14);
        f.b bVar = obj2 instanceof f.b ? (f.b) obj2 : null;
        if (bVar != null) {
            c cVar = (c) f0Var;
            TextView textView = cVar.f62842b;
            String str2 = bVar.f62857c;
            Integer num = bVar.f62856b;
            ImageView imageView = cVar.f62841a;
            if (num != null) {
                imageView.setImageResource(num.intValue());
                Resources resources = imageView.getContext().getResources();
                resources.getClass();
                int iN = (int) xy2.b.n(resources, 32.0f);
                imageView.getLayoutParams().width = iN;
                imageView.getLayoutParams().height = iN;
                imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), R.color.gcm_icon_primary)));
                imageView.setVisibility(0);
            } else {
                imageView.getClass();
                imageView.setVisibility(8);
            }
            if (str2 == null || w.J(str2)) {
                textView.getClass();
                textView.setVisibility(8);
            } else {
                textView.setText(str2);
                textView.setContentDescription(textView.getText());
                textView.setVisibility(0);
            }
            TextView textView2 = cVar.f62843c;
            textView2.getClass();
            textView2.setVisibility(8);
            boolean z15 = bVar.f62858d;
            View view2 = cVar.f62844d;
            if (z15) {
                view2.getClass();
                view2.setVisibility(0);
            } else {
                view2.getClass();
                view2.setVisibility(4);
            }
            s0.r(cVar.itemView, new e40.c(bVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return i14 == 1 ? new c(this, j.b(viewGroup, R.layout.gcm4_checkable_two_line_row, viewGroup, false)) : new C1321b(this, j.b(viewGroup, R.layout.course_section_header, viewGroup, false));
    }

    public final void r(int i14) {
        if (i14 == -1) {
            return;
        }
        Object obj = this.f62836b.get(i14);
        f.b bVar = obj instanceof f.b ? (f.b) obj : null;
        if (bVar != null) {
            bVar.f62858d = !bVar.f62858d;
            notifyItemChanged(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Le40/b$a;", "", "<init>", "()V", "", "ITEM_TYPE_HEADER", "I", "ITEM_TYPE_SELECTABLE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
