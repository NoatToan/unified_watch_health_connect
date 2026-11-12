package xe2;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f190554b;

    public /* synthetic */ u(y yVar, int i14) {
        this.f190553a = i14;
        this.f190554b = yVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f190553a) {
            case 0:
                ImageView imageView = this.f190554b.f190581e;
                if (imageView != null) {
                    imageView.setTag("");
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("customerImage");
                throw null;
            case 1:
                ImageView imageView2 = this.f190554b.f190581e;
                if (imageView2 != null) {
                    imageView2.setTag("");
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("customerImage");
                throw null;
            default:
                y yVar = this.f190554b;
                TextView textView = yVar.f190585i;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("childExchangesBlockedText");
                    throw null;
                }
                Button button = yVar.f190586j;
                if (button == null) {
                    p005kotlin.jvm.internal.s.m("continueButton");
                    throw null;
                }
                button.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(yVar.getString(R.string.child_accounts_not_allowed, yVar.getString(R.string.ssoApplicationName)));
                return Unit.INSTANCE;
        }
    }
}
