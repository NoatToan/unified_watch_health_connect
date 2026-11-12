package xn2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxn2/n;", "Lxn2/a;", "Lxn2/z;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends xn2.a<z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f191720b = new a(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_felica_jre_terms_and_conditions, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.label_terms_and_conditions);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.NONE);
        WebView webView = (WebView) view2.findViewById(R.id.terms_and_conditions_web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.jreast.co.jp/mobilesuica/wearablesuica/index.html");
        final int i14 = 0;
        view2.findViewById(R.id.decline_button).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191719b;

            {
                this.f191719b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                n nVar = this.f191719b;
                switch (i15) {
                    case 0:
                        n.a aVar = n.f191720b;
                        nVar.b().E(z.a.JR);
                        break;
                    default:
                        n.a aVar2 = n.f191720b;
                        nVar.b().h(z.a.JR);
                        break;
                }
            }
        });
        final int i15 = 1;
        view2.findViewById(R.id.continue_button).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191719b;

            {
                this.f191719b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                n nVar = this.f191719b;
                switch (i16) {
                    case 0:
                        n.a aVar = n.f191720b;
                        nVar.b().E(z.a.JR);
                        break;
                    default:
                        n.a aVar2 = n.f191720b;
                        nVar.b().h(z.a.JR);
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxn2/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
