package fb2;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes8.dex */
public class k<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70360e;

    public k(Context context, boolean z14) {
        super(context);
        this.f70360e = z14;
    }

    @Override // fb2.e
    public final View a() {
        View viewA;
        if (this.f70359d == null) {
            if (this.f70360e) {
                LinearLayout linearLayout = new LinearLayout(this.f70343a);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(g.a(this.f70343a));
                viewA = linearLayout;
            } else {
                viewA = g.a(this.f70343a);
            }
            this.f70359d = viewA;
        }
        return this.f70359d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        View viewA = a();
        this.f70359d = viewA;
        o(viewA);
        View view2 = this.f70359d;
        if (view2 == null) {
            return true;
        }
        this.f70345c = new l(view2);
        return true;
    }

    @Override // fb2.e
    public final boolean h(T t7) {
        return true;
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        return true;
    }

    public k(Context context) {
        this(context, false);
    }
}
