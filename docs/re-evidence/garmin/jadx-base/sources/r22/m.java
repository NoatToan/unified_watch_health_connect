package r22;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lr22/m;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lkotlin/Function0;", "", "selectionChangedListener", "<init>", "(Le23/a;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m extends com.garmin.android.apps.connectmobile.f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f149750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f149751d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l<? super t1, Boolean> f149752e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lr22/m;Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f149753f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f149754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f149755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f149756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f149757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f149758e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f149754a = view2.getContext();
            this.f149755b = (ImageView) view2.findViewById(R.id.icon);
            this.f149756c = (TextView) view2.findViewById(R.id.label_top);
            this.f149757d = (TextView) view2.findViewById(R.id.label_bottom);
            this.f149758e = view2.findViewById(R.id.checkmark_icon);
            view2.setOnClickListener(new pm0.h(8, this, mVar));
        }
    }

    public m(e23.a<Unit> aVar) {
        this.f149750c = aVar;
    }

    public final ArrayList A() {
        ArrayList<t1> arrayList = this.f149751d;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (t1 t1Var : arrayList) {
            String str = t1Var.f149891a;
            Integer num = t1Var.f149892b;
            Drawable drawable = t1Var.f149893c;
            String str2 = t1Var.f149894d;
            String str3 = t1Var.f149895e;
            boolean z14 = t1Var.f149896f;
            boolean z15 = t1Var.f149897g;
            String str4 = t1Var.f149898h;
            boolean z16 = t1Var.f149899i;
            Integer num2 = t1Var.f149900j;
            str.getClass();
            arrayList2.add(new t1(str, num, drawable, str2, str3, z14, z15, str4, z16, num2));
        }
        return arrayList2;
    }

    public final void B(t1 t1Var) {
        t1Var.getClass();
        int iIndexOf = this.f149751d.indexOf(t1Var);
        if (iIndexOf == -1) {
            return;
        }
        g(this.f34942a.size() + iIndexOf);
    }

    public final void C(int i14) {
        if (i14 == -1) {
            return;
        }
        t1 t1Var = (t1) this.f149751d.get(i14);
        t1Var.f149897g = !t1Var.f149897g;
        notifyItemChanged(this.f34942a.size() + i14);
    }

    public abstract void g(int i14);

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f149751d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 != -1) {
            a aVar = f0Var instanceof a ? (a) f0Var : null;
            if (aVar != null) {
                t1 t1Var = (t1) this.f149751d.get(i14);
                TextView textView = aVar.f149757d;
                TextView textView2 = aVar.f149756c;
                View view2 = aVar.f149758e;
                Context context = aVar.f149754a;
                ImageView imageView = aVar.f149755b;
                t1Var.getClass();
                String str = t1Var.f149895e;
                boolean z14 = t1Var.f149896f;
                String str2 = t1Var.f149894d;
                Drawable drawable = t1Var.f149893c;
                Integer num = t1Var.f149900j;
                Integer num2 = t1Var.f149892b;
                if (num2 == null && drawable == null) {
                    imageView.getClass();
                    imageView.setVisibility(8);
                } else {
                    if (num2 != null) {
                        imageView.setImageResource(num2.intValue());
                    } else {
                        imageView.setImageDrawable(drawable);
                    }
                    if (num != null) {
                        int iIntValue = num.intValue();
                        imageView.getLayoutParams().width = iIntValue;
                        imageView.getLayoutParams().height = iIntValue;
                    }
                    imageView.getClass();
                    imageView.setVisibility(0);
                    if (t1Var.f149899i) {
                        context.getClass();
                        if (c22.b.e(context)) {
                            imageView.measure(0, 0);
                            imageView.getLayoutParams().width = (int) c22.b.c(context, num != null ? num.intValue() : imageView.getMeasuredWidth(), 1.5f);
                            imageView.getLayoutParams().height = (int) c22.b.c(context, num != null ? num.intValue() : imageView.getMeasuredHeight(), 1.5f);
                        }
                    }
                }
                if (str2 == null || d53.w.J(str2)) {
                    textView2.getClass();
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str2);
                    CharSequence text = t1Var.f149898h;
                    if (text == null) {
                        text = textView2.getText();
                    }
                    textView2.setContentDescription(text);
                    textView2.setEnabled(z14);
                    textView2.setVisibility(0);
                }
                if (str == null || d53.w.J(str)) {
                    textView.getClass();
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                    v22.d.d(textView, new qv1.l(16));
                    textView.setVisibility(0);
                }
                if (t1Var.f149897g) {
                    float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.icon_default);
                    int i15 = (int) dimensionPixelSize;
                    view2.getLayoutParams().width = i15;
                    view2.getLayoutParams().height = i15;
                    view2.setVisibility(0);
                    if (c22.b.e(context)) {
                        view2.measure(0, 0);
                        view2.getLayoutParams().width = (int) c22.b.c(context, dimensionPixelSize, 1.8f);
                        view2.getLayoutParams().height = (int) c22.b.c(context, dimensionPixelSize, 1.8f);
                    }
                } else {
                    view2.getClass();
                    view2.setVisibility(4);
                }
                androidx.core.view.s0.r(aVar.itemView, new l(t1Var));
                aVar.itemView.setEnabled(z14);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.gcm4_checkable_two_line_row, viewGroup, false));
    }
}
