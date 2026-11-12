package xn2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vg1.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxn2/s;", "Lxn2/a;", "Lxn2/d0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends xn2.a<d0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f191732b = new a(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_felica_provision_introduction, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.operator_suica);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        View viewFindViewById = view2.findViewById(R.id.suica_image);
        viewFindViewById.getClass();
        pn2.a.f138690a.getClass();
        yr2.j.b((ImageView) viewFindViewById, pn2.a.f(), 30, 4);
        TextView textView = (TextView) view2.findViewById(R.id.description);
        String string2 = getString(R.string.wallet_suica_provision_hint_supported_bank);
        string2.getClass();
        final int i14 = 0;
        textView.setText(yr2.f.a(new e23.l(this) { // from class: xn2.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f191729b;

            {
                this.f191729b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                final s sVar = this.f191729b;
                ((Integer) obj).getClass();
                s.a aVar = s.f191732b;
                switch (i15) {
                    case 0:
                        final int i16 = 0;
                        return new e23.a() { // from class: xn2.r
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                s sVar2 = sVar;
                                switch (i17) {
                                    case 0:
                                        s.a aVar2 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://msfaq.mobilesuica.com/faq/show/69")));
                                        break;
                                    default:
                                        s.a aVar3 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jreast.co.jp/mobilesuica/use/sf/")));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    default:
                        final int i17 = 1;
                        return new e23.a() { // from class: xn2.r
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                s sVar2 = sVar;
                                switch (i18) {
                                    case 0:
                                        s.a aVar2 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://msfaq.mobilesuica.com/faq/show/69")));
                                        break;
                                    default:
                                        s.a aVar3 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jreast.co.jp/mobilesuica/use/sf/")));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                }
            }
        }, string2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) view2.findViewById(R.id.to_learn_more);
        String string3 = getString(R.string.wallet_suica_provision_hint_to_learn_more);
        string3.getClass();
        final int i15 = 1;
        textView2.setText(yr2.f.a(new e23.l(this) { // from class: xn2.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f191729b;

            {
                this.f191729b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                final s sVar = this.f191729b;
                ((Integer) obj).getClass();
                s.a aVar = s.f191732b;
                switch (i16) {
                    case 0:
                        final int i17 = 0;
                        return new e23.a() { // from class: xn2.r
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                s sVar2 = sVar;
                                switch (i18) {
                                    case 0:
                                        s.a aVar2 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://msfaq.mobilesuica.com/faq/show/69")));
                                        break;
                                    default:
                                        s.a aVar3 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jreast.co.jp/mobilesuica/use/sf/")));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    default:
                        final int i18 = 1;
                        return new e23.a() { // from class: xn2.r
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                s sVar2 = sVar;
                                switch (i19) {
                                    case 0:
                                        s.a aVar2 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://msfaq.mobilesuica.com/faq/show/69")));
                                        break;
                                    default:
                                        s.a aVar3 = s.f191732b;
                                        sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jreast.co.jp/mobilesuica/use/sf/")));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                }
            }
        }, string3));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        view2.findViewById(R.id.next).setOnClickListener(new z0(this, 28));
        b().x();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxn2/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
