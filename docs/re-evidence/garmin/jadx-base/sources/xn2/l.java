package xn2;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxn2/l;", "Lxn2/a;", "Lxn2/a0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends xn2.a<a0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f191717b = new a(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_garmin_terms_and_conditions, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.label_terms_and_conditions);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.NONE);
        TextView textView = (TextView) view2.findViewById(R.id.terms_and_conditions_message);
        String string2 = getString(R.string.wallet_terms_and_conditions_description);
        string2.getClass();
        final int i14 = 0;
        textView.setText(yr2.f.a(new e23.l(this) { // from class: xn2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f191712b;

            {
                this.f191712b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                final l lVar = this.f191712b;
                ((Integer) obj).getClass();
                l.a aVar = l.f191717b;
                switch (i15) {
                    case 0:
                        final int i16 = 0;
                        return new e23.a() { // from class: xn2.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                l lVar2 = lVar;
                                switch (i17) {
                                    case 0:
                                        l.a aVar2 = l.f191717b;
                                        lVar2.b().R();
                                        break;
                                    default:
                                        l.a aVar3 = l.f191717b;
                                        lVar2.b().K();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    default:
                        final int i17 = 1;
                        return new e23.a() { // from class: xn2.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                l lVar2 = lVar;
                                switch (i18) {
                                    case 0:
                                        l.a aVar2 = l.f191717b;
                                        lVar2.b().R();
                                        break;
                                    default:
                                        l.a aVar3 = l.f191717b;
                                        lVar2.b().K();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                }
            }
        }, string2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) view2.findViewById(R.id.privacy_policy_message);
        String string3 = getString(R.string.wallet_terms_and_conditions_privacy);
        string3.getClass();
        final int i15 = 1;
        textView2.setText(yr2.f.a(new e23.l(this) { // from class: xn2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f191712b;

            {
                this.f191712b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                final l lVar = this.f191712b;
                ((Integer) obj).getClass();
                l.a aVar = l.f191717b;
                switch (i16) {
                    case 0:
                        final int i17 = 0;
                        return new e23.a() { // from class: xn2.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                l lVar2 = lVar;
                                switch (i18) {
                                    case 0:
                                        l.a aVar2 = l.f191717b;
                                        lVar2.b().R();
                                        break;
                                    default:
                                        l.a aVar3 = l.f191717b;
                                        lVar2.b().K();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    default:
                        final int i18 = 1;
                        return new e23.a() { // from class: xn2.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                l lVar2 = lVar;
                                switch (i19) {
                                    case 0:
                                        l.a aVar2 = l.f191717b;
                                        lVar2.b().R();
                                        break;
                                    default:
                                        l.a aVar3 = l.f191717b;
                                        lVar2.b().K();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                }
            }
        }, string3));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        final int i16 = 0;
        view2.findViewById(R.id.decline_button).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f191714b;

            {
                this.f191714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                l lVar = this.f191714b;
                switch (i17) {
                    case 0:
                        l.a aVar = l.f191717b;
                        lVar.b().E(z.a.Garmin);
                        break;
                    default:
                        l.a aVar2 = l.f191717b;
                        lVar.b().h(z.a.Garmin);
                        break;
                }
            }
        });
        final int i17 = 1;
        view2.findViewById(R.id.continue_button).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f191714b;

            {
                this.f191714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                l lVar = this.f191714b;
                switch (i18) {
                    case 0:
                        l.a aVar = l.f191717b;
                        lVar.b().E(z.a.Garmin);
                        break;
                    default:
                        l.a aVar2 = l.f191717b;
                        lVar.b().h(z.a.Garmin);
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxn2/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
