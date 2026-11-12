package xn2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxn2/p;", "Lxn2/a;", "Lxn2/c0;", "Lxn2/g0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends xn2.a<c0> implements g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f191723f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tn2.e f191724b = new tn2.e(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f191725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f191726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f191727e;

    @Override // xn2.g0
    public final void E3(int i14) {
        Z5(new ap.b(this, i14, 21));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.f191725c = viewGroup;
        return layoutInflater.inflate(R.layout.fragment_felica_provision, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = u6().getString(R.string.wallet_initial_charge);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        int[] intArray = requireArguments().getIntArray("extra.initial.charge.options");
        if (intArray == null) {
            vb.h.s("Required value was null.");
            return;
        }
        this.f191727e = intArray;
        View viewFindViewById = view2.findViewById(R.id.suica_image);
        viewFindViewById.getClass();
        pn2.a.f138690a.getClass();
        yr2.j.b((ImageView) viewFindViewById, pn2.a.f(), 30, 4);
        final int i14 = 0;
        view2.findViewById(R.id.current_balance_container).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f191722b;

            {
                this.f191722b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                p pVar = this.f191722b;
                switch (i15) {
                    case 0:
                        p.a aVar = p.f191723f;
                        pVar.b().S();
                        break;
                    default:
                        p.a aVar2 = p.f191723f;
                        pVar.b().y();
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.balance);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f191726d = textView;
        int[] iArr = this.f191727e;
        if (iArr == null) {
            p005kotlin.jvm.internal.s.m("initialChargeOptions");
            throw null;
        }
        if (iArr.length == 0) {
            n23.j.s("Array is empty.");
            return;
        }
        textView.setText(this.f191724b.a(Integer.valueOf(iArr[0])));
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: xn2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f191722b;

            {
                this.f191722b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                p pVar = this.f191722b;
                switch (i16) {
                    case 0:
                        p.a aVar = p.f191723f;
                        pVar.b().S();
                        break;
                    default:
                        p.a aVar2 = p.f191723f;
                        pVar.b().y();
                        break;
                }
            }
        });
        final int i16 = 1;
        view2.findViewById(R.id.google_pay).setOnClickListener(new View.OnClickListener(this) { // from class: xn2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f191722b;

            {
                this.f191722b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                p pVar = this.f191722b;
                switch (i17) {
                    case 0:
                        p.a aVar = p.f191723f;
                        pVar.b().S();
                        break;
                    default:
                        p.a aVar2 = p.f191723f;
                        pVar.b().y();
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxn2/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "INITIAL_CHARGE_OPTIONS_EXTRA_KEY", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
