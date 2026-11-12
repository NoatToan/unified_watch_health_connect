package so2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import pk1.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lso2/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "c", JWKParameterNames.RSA_EXPONENT, "b", "d", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3031a f160454c = new C3031a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f160455d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f160456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f160457b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lso2/a$b;", "Lso2/a$e;", "Lso2/a;", "", "cardName", "cardImageUrl", "", "Lfo2/i;", "chargeAmountCandidates", "activationFee", "<init>", "(Lso2/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfo2/i;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f160458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i f160459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f160460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f160461h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, String str, String str2, List<i> list, i iVar) {
            super(aVar, str2, list);
            str.getClass();
            str2.getClass();
            list.getClass();
            iVar.getClass();
            this.f160461h = aVar;
            this.f160458e = str;
            this.f160459f = iVar;
            this.f160460g = R.string.wallet_add_funds;
        }

        @Override // so2.a.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF160463f() {
            return this.f160460g;
        }

        @Override // so2.a.e
        public final void b(hn2.c cVar) {
            cVar.X9(true);
            String string = cVar.getString(R.string.wallet_activate_card);
            string.getClass();
            cVar.W9(string, hn2.c.a.BACK);
        }

        @Override // so2.a.e
        public final void c() {
            a aVar = this.f160461h;
            View view2 = aVar.getView();
            if (view2 == null) {
                e();
                return;
            }
            TextView textView = (TextView) view2.findViewById(R.id.text_charge_amount);
            ko2.c cVar = ko2.c.f105778b;
            double dA = this.f160467c.getTotalCredit().a();
            cVar.getClass();
            ko2.b.f105773a.getClass();
            String str = ko2.b.f105776d.format(dA);
            str.getClass();
            textView.setText(str);
            TextView textView2 = (TextView) view2.findViewById(R.id.text_promotion_amount);
            CurrencyValue totalCredit = this.f160467c.getTotalCredit();
            CurrencyValue totalCost = this.f160467c.getTotalCost();
            ko2.a aVar2 = totalCredit.f51219b;
            if (totalCost != null) {
                ko2.a aVar3 = totalCost.f51219b;
                totalCredit = aVar2.getF105772d() < aVar3.getF105772d() ? new CurrencyValue(totalCredit.f51218a - totalCost.c(aVar2), aVar2) : new CurrencyValue(totalCredit.c(aVar3) - totalCost.f51218a, aVar3);
            }
            if (totalCredit.f51218a != 0) {
                textView2.setVisibility(0);
                textView2.setText(aVar.getString(R.string.wallet_activate_card_bonus_hint, ko2.c.f(totalCredit.a()), aVar.getString(R.string.wallet_currency_cny)));
            } else {
                textView2.setVisibility(8);
            }
            ((Button) view2.findViewById(R.id.button_pay)).setText(aVar.getString(R.string.wallet_pay_with_a_value, cVar.a(Double.valueOf(this.f160467c.getTotalCost().b(this.f160459f.getTotalCost()).a()))));
        }
    }

    public interface c {
        void a();

        void b(i iVar, CurrencyValue currencyValue);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lso2/a$d;", "Lso2/a$e;", "Lso2/a;", "", "cardImageUrl", "", "Lfo2/i;", "chargeAmountCandidates", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "currentBalance", "<init>", "(Lso2/a;Ljava/lang/String;Ljava/util/List;Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CurrencyValue f160462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f160463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a f160464g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, String str, List<i> list, CurrencyValue currencyValue) {
            super(aVar, str, list);
            str.getClass();
            list.getClass();
            currencyValue.getClass();
            this.f160464g = aVar;
            this.f160462e = currencyValue;
            this.f160463f = R.string.wallet_recharge_amount;
        }

        @Override // so2.a.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF160463f() {
            return this.f160463f;
        }

        @Override // so2.a.e
        public final void b(hn2.c cVar) {
            cVar.X9(true);
            String string = cVar.getString(R.string.wallet_top_up);
            string.getClass();
            cVar.W9(string, hn2.c.a.BACK);
        }

        @Override // so2.a.e
        public final void c() {
            a aVar = this.f160464g;
            View view2 = aVar.getView();
            if (view2 == null) {
                e();
                return;
            }
            TextView textView = (TextView) view2.findViewById(R.id.text_charge_amount);
            textView.setVisibility(0);
            ko2.c cVar = ko2.c.f105778b;
            double dA = this.f160467c.getTotalCredit().a();
            cVar.getClass();
            ko2.b.f105773a.getClass();
            String str = ko2.b.f105776d.format(dA);
            str.getClass();
            textView.setText(str);
            TextView textView2 = (TextView) view2.findViewById(R.id.text_balance);
            textView2.setVisibility(0);
            textView2.setText(cVar.a(Double.valueOf(this.f160462e.b(this.f160467c.getTotalCredit()).a())));
            ((Button) view2.findViewById(R.id.button_pay)).setText(aVar.getString(R.string.wallet_recharge_with_a_value, cVar.a(Double.valueOf(this.f160467c.getTotalCost().a()))));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lso2/a$e;", "", "", "cardImageUrl", "", "Lfo2/i;", "chargeAmountCandidates", "<init>", "(Lso2/a;Ljava/lang/String;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f160465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<i> f160466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f160467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f160468d;

        public e(a aVar, String str, List<i> list) {
            str.getClass();
            list.getClass();
            this.f160468d = aVar;
            this.f160465a = str;
            this.f160466b = list;
            this.f160467c = (i) h0.b0(list);
        }

        /* JADX INFO: renamed from: a */
        public abstract int getF160463f();

        public abstract void b(hn2.c cVar);

        public abstract void c();

        public final void d() {
            a aVar = this.f160468d;
            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(aVar.requireActivity());
            NumberPicker numberPicker = new NumberPicker(aVar.requireActivity());
            List<i> list = this.f160466b;
            numberPicker.setMaxValue(list.size() - 1);
            numberPicker.setMinValue(0);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((i) it.next()).getTotalCredit().a()));
            }
            ko2.c cVar = ko2.c.f105778b;
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                double dDoubleValue = ((Number) it3.next()).doubleValue();
                cVar.getClass();
                ko2.b.f105773a.getClass();
                String str = ko2.b.f105776d.format(dDoubleValue);
                str.getClass();
                arrayList2.add(str);
            }
            numberPicker.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
            Iterator<i> it4 = list.iterator();
            int i14 = 0;
            while (it4.hasNext()) {
                if (s.g(it4.next(), this.f160467c)) {
                    numberPicker.setValue(i14);
                    numberPicker.setDescendantFocusability(393216);
                    numberPicker.setWrapSelectorWheel(false);
                    aVar2.setTitle(getF160463f());
                    aVar2.setView(numberPicker);
                    aVar2.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.connectiq.i(0));
                    aVar2.setPositiveButton(R.string.lbl_done, new t(6, numberPicker, this));
                    aVar2.show();
                }
                i14++;
            }
            i14 = -1;
            numberPicker.setValue(i14);
            numberPicker.setDescendantFocusability(393216);
            numberPicker.setWrapSelectorWheel(false);
            aVar2.setTitle(getF160463f());
            aVar2.setView(numberPicker);
            aVar2.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.connectiq.i(0));
            aVar2.setPositiveButton(R.string.lbl_done, new t(6, numberPicker, this));
            aVar2.show();
        }

        public final void e() {
            Toast.makeText(this.f160468d.requireContext(), "view is null", 1).show();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f160455d = gt2.b.f79005a.h("PAY#SB#ChargeFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_snowball_charge, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f160456a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        c cVar = this.f160456a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void u6() {
        e eVar = this.f160457b;
        if (eVar != null) {
            hn2.c cVarF = o72.t.F(this);
            if (cVarF == null) {
                f160455d.error("Failed to cast activity to GarminPayBaseActivity");
            } else {
                eVar.b(cVarF);
            }
        }
    }

    /* JADX INFO: renamed from: so2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lso2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3031a {
        public /* synthetic */ C3031a(j jVar) {
            this();
        }

        private C3031a() {
        }
    }
}
