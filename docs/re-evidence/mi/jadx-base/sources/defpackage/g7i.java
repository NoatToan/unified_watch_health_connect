package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.c;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class g7i extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f18687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f18688b;
    public final SparseArray<View> c;
    public boolean d;
    public boolean e;

    public g7i(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.c = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i = vpi.f37111a;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f18687a = view.getBackground();
        if (textView != null) {
            this.f18688b = textView.getTextColors();
        }
    }

    public View a(int i) {
        View view = this.c.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            this.c.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public void d() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f18687a;
        if (background != drawable) {
            c.v0(this.itemView, drawable);
        }
        TextView textView = (TextView) a(R.id.title);
        if (textView == null || this.f18688b == null || textView.getTextColors().equals(this.f18688b)) {
            return;
        }
        textView.setTextColor(this.f18688b);
    }

    public void e(boolean z) {
        this.d = z;
    }

    public void f(boolean z) {
        this.e = z;
    }
}
