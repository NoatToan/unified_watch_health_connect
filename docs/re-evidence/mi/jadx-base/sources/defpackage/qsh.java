package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class qsh implements bsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f31804b;
    public final Button c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final Button f;
    public final LinearLayout g;

    public qsh(LinearLayout linearLayout, TextView textView, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, Button button2, LinearLayout linearLayout4) {
        this.f31803a = linearLayout;
        this.f31804b = textView;
        this.c = button;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = button2;
        this.g = linearLayout4;
    }

    public static qsh a(View view) {
        int i = tqi.f34945a;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = tqi.f34946b;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = tqi.c;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = tqi.f;
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                    if (linearLayout2 != null) {
                        i = tqi.g;
                        Button button2 = (Button) view.findViewById(i);
                        if (button2 != null) {
                            i = tqi.h;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                            if (linearLayout3 != null) {
                                return new qsh((LinearLayout) view, textView, button, linearLayout, linearLayout2, button2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static qsh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static qsh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(xti.f39459a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // defpackage.bsq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f31803a;
    }
}
