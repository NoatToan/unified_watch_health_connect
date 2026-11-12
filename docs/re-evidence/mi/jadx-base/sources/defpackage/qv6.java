package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duokan.airkan.authorization.VerifyCodeInputView;

/* JADX INFO: loaded from: classes4.dex */
public final class qv6 implements bsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f31875b;
    public final VerifyCodeInputView c;

    public qv6(LinearLayout linearLayout, TextView textView, VerifyCodeInputView verifyCodeInputView) {
        this.f31874a = linearLayout;
        this.f31875b = textView;
        this.c = verifyCodeInputView;
    }

    public static qv6 a(View view) {
        int i = eqi.f16965a;
        TextView textView = (TextView) dsq.a(view, i);
        if (textView != null) {
            i = eqi.f16966b;
            VerifyCodeInputView verifyCodeInputView = (VerifyCodeInputView) dsq.a(view, i);
            if (verifyCodeInputView != null) {
                return new qv6((LinearLayout) view, textView, verifyCodeInputView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static qv6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static qv6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(gvi.f19372a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // defpackage.bsq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f31874a;
    }
}
