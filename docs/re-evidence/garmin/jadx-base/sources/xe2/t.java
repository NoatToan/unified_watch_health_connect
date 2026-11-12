package xe2;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f190550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f190551c;

    public /* synthetic */ t(y yVar, boolean z14, int i14) {
        this.f190549a = i14;
        this.f190550b = yVar;
        this.f190551c = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f190549a;
        boolean z14 = this.f190551c;
        y yVar = this.f190550b;
        switch (i14) {
            case 0:
                Button button = yVar.f190586j;
                if (button == null) {
                    p005kotlin.jvm.internal.s.m("continueButton");
                    throw null;
                }
                button.setEnabled(z14);
                if (z14) {
                    ImageView imageView = yVar.f190581e;
                    if (imageView == null) {
                        p005kotlin.jvm.internal.s.m("customerImage");
                        throw null;
                    }
                    if (p005kotlin.jvm.internal.s.g(imageView.getTag(), "evaluate")) {
                        androidx.lifecycle.n0 viewLifecycleOwner = yVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
                        x53.c cVar = o53.s0.f129406a;
                        ge1.b.T(i0VarW, x53.b.f189152a, null, new x(yVar, null), 2);
                    }
                }
                return Unit.INSTANCE;
            default:
                Button button2 = yVar.f190586j;
                if (button2 == null) {
                    p005kotlin.jvm.internal.s.m("continueButton");
                    throw null;
                }
                button2.setEnabled(z14);
                TextView textView = yVar.f190585i;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("childExchangesBlockedText");
                    throw null;
                }
                textView.setVisibility(8);
                button2.setOnClickListener(yVar.f190587k);
                button2.setVisibility(0);
                return Unit.INSTANCE;
        }
    }
}
