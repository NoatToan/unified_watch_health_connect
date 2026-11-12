package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class rsh implements bsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32858b;
    public final TextView c;

    public rsh(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f32857a = linearLayout;
        this.f32858b = imageView;
        this.c = textView;
    }

    public static rsh a(View view) {
        int i = tqi.d;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = tqi.e;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new rsh((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static rsh c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(xti.f39460b, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // defpackage.bsq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f32857a;
    }
}
