package cp2;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.x1;
import c32.k;
import c42.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import com.garmin.android.apps.connectmobile.workouts.data.model.e0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.m;
import o13.p;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import wr2.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcp2/f;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends br2.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f54931p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f54932q = m.b(new com.google.accompanist.drawablepainter.a(7));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f54933r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f54934t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f54935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f54936w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54937a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ep2.b f54940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ap2.h f54942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComplexEditText f54943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ComplexEditText f54944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComplexEditText f54945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComplexEditText f54946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ComplexEditText f54947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f54948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f54949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yq2.a f54950n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<ep2.g> f54938b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<ep2.g> f54939c = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<ep2.h> f54951o = x.k(ep2.h.NAME, ep2.h.PAN, ep2.h.EXP_MONTH, ep2.h.EXP_YEAR, ep2.h.CVV);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54952a;

        static {
            int[] iArr = new int[ep2.h.values().length];
            try {
                iArr[ep2.h.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ep2.h.PAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ep2.h.EXP_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ep2.h.EXP_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ep2.h.CVV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f54952a = iArr;
        }
    }

    static {
        int i14 = Calendar.getInstance().get(1);
        f54933r = i14;
        f54934t = Calendar.getInstance().get(2) + 1;
        f54935v = Calendar.getInstance().get(1) + 1;
        f54936w = i14;
    }

    public static void w6(ComplexEditText complexEditText, gp2.d dVar) {
        String strA = dVar != null ? dVar.a() : null;
        EditText editText = complexEditText.editText;
        TextView textView = complexEditText.additionalMessageLabel;
        v22.e.q(textView);
        ImageView imageView = complexEditText.additionalMessageIcon;
        v22.e.q(imageView);
        imageView.setBackground(a7.b.getDrawable(complexEditText.parentContainer.getContext(), R.drawable.icon_danger));
        editText.setBackground(j.a.a(complexEditText.getContext(), R.drawable.gcm_edit_text_border_error));
        textView.setText(strA);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fit_pay_payment_card_info_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Button button = this.f54949m;
        if (button != null) {
            if (button != null) {
                button.setEnabled(false);
            } else {
                s.m("submitCardInfo");
                throw null;
            }
        }
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Button button = this.f54949m;
        if (button != null) {
            if (button != null) {
                button.setEnabled(true);
            } else {
                s.m("submitCardInfo");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0320  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        boolean z14;
        boolean z15;
        String str;
        p pVar;
        String strValueOf;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ap2.h hVar = (ap2.h) new x1(mVarRequireActivity).b(s0.f105811a.b(ap2.h.class));
        this.f54942f = hVar;
        gp2.g gVar = hVar.f11700d.get();
        this.f54937a = gVar == gp2.g.VERIFY_CREDENTIAL || gVar == gp2.g.VERIFY_CREDIT_CARD;
        ap2.h hVar2 = this.f54942f;
        if (hVar2 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        Boolean bool = hVar2.f11718x.get();
        bool.getClass();
        this.f54941e = bool.booleanValue();
        ap2.h hVar3 = this.f54942f;
        if (hVar3 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        this.f54938b = hVar3.C4();
        ap2.h hVar4 = this.f54942f;
        if (hVar4 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        List<ep2.g> listD = hVar4.f11702f.get();
        if (listD == null && (listD = hVar4.f11712p.d()) == null) {
            listD = hVar4.f11713q.d();
        }
        if (listD == null) {
            listD = j0.f134944a;
        }
        this.f54939c = listD;
        hn2.c cVarU6 = u6();
        String string = this.f54937a ? getString(R.string.verify_card_details) : getString(R.string.wallet_title_add_a_card);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        a7.e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f54950n = aVar;
        View viewFindViewById = view2.findViewById(R.id.layout_name_on_card);
        viewFindViewById.getClass();
        ComplexEditText complexEditText = (ComplexEditText) viewFindViewById;
        this.f54943g = complexEditText;
        complexEditText.setResourceId(R.id.edit_text_name_on_card);
        View viewFindViewById2 = view2.findViewById(R.id.layout_card_number);
        viewFindViewById2.getClass();
        ComplexEditText complexEditText2 = (ComplexEditText) viewFindViewById2;
        this.f54944h = complexEditText2;
        complexEditText2.setResourceId(R.id.edit_text_card_number);
        View viewFindViewById3 = view2.findViewById(R.id.layout_expiration_month);
        viewFindViewById3.getClass();
        ComplexEditText complexEditText3 = (ComplexEditText) viewFindViewById3;
        this.f54945i = complexEditText3;
        complexEditText3.setResourceId(R.id.dropdown_expiration_month);
        View viewFindViewById4 = view2.findViewById(R.id.layout_expiration_year);
        viewFindViewById4.getClass();
        ComplexEditText complexEditText4 = (ComplexEditText) viewFindViewById4;
        this.f54946j = complexEditText4;
        complexEditText4.setResourceId(R.id.dropdown_expiration_year);
        View viewFindViewById5 = view2.findViewById(R.id.layout_security_code);
        viewFindViewById5.getClass();
        ComplexEditText complexEditText5 = (ComplexEditText) viewFindViewById5;
        this.f54947k = complexEditText5;
        complexEditText5.setResourceId(R.id.edit_text_security_code);
        View viewFindViewById6 = view2.findViewById(R.id.consent_ecom_label);
        viewFindViewById6.getClass();
        this.f54948l = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.button_submit);
        viewFindViewById7.getClass();
        this.f54949m = (Button) viewFindViewById7;
        Resources resources = getResources();
        resources.getClass();
        ap2.h hVar5 = this.f54942f;
        if (hVar5 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        List<ep2.b> listD2 = hVar5.f11714r.d();
        ComplexEditText complexEditText6 = this.f54944h;
        if (complexEditText6 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        EditText editText = complexEditText6.getEditText();
        ComplexEditText complexEditText7 = this.f54947k;
        if (complexEditText7 == null) {
            s.m("securityCodeLayout");
            throw null;
        }
        EditText editText2 = complexEditText7.getEditText();
        ComplexEditText complexEditText8 = this.f54944h;
        if (complexEditText8 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        fp2.d dVar = new fp2.d(resources, listD2, editText, editText2, complexEditText8);
        TextView textView = this.f54948l;
        if (textView == null) {
            s.m("ecomConsentLayout");
            throw null;
        }
        textView.setVisibility(((l) zf.b.r()).m() ? 0 : 8);
        ComplexEditText complexEditText9 = this.f54947k;
        if (complexEditText9 == null) {
            s.m("securityCodeLayout");
            throw null;
        }
        complexEditText9.setVisibility(y6(ep2.h.CVV) ? 0 : 8);
        ComplexEditText complexEditText10 = this.f54947k;
        if (complexEditText10 == null) {
            s.m("securityCodeLayout");
            throw null;
        }
        complexEditText10.getTopLabel().setText(getString(R.string.security_code));
        ComplexEditText complexEditText11 = this.f54947k;
        if (complexEditText11 == null) {
            s.m("securityCodeLayout");
            throw null;
        }
        complexEditText11.getEditText().setInputType(2);
        ComplexEditText complexEditText12 = this.f54947k;
        if (complexEditText12 == null) {
            s.m("securityCodeLayout");
            throw null;
        }
        complexEditText12.getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4)});
        if (this.f54941e) {
            ComplexEditText complexEditText13 = this.f54947k;
            if (complexEditText13 == null) {
                s.m("securityCodeLayout");
                throw null;
            }
            EditText editText3 = complexEditText13.getEditText();
            ap2.h hVar6 = this.f54942f;
            if (hVar6 == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            editText3.setText(hVar6.f11699c.get().getSecurityCode());
        }
        ComplexEditText complexEditText14 = this.f54946j;
        if (complexEditText14 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        complexEditText14.setVisibility(y6(ep2.h.EXP_YEAR) ? 0 : 8);
        ComplexEditText complexEditText15 = this.f54946j;
        if (complexEditText15 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        complexEditText15.getTopLabel().setText(getString(R.string.expiration_year));
        ComplexEditText complexEditText16 = this.f54946j;
        if (complexEditText16 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        EditText editText4 = complexEditText16.getEditText();
        ComplexEditText complexEditText17 = this.f54946j;
        if (complexEditText17 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        editText4.addTextChangedListener(new fp2.g(complexEditText17, complexEditText17.getEditText()));
        ComplexEditText complexEditText18 = this.f54946j;
        if (complexEditText18 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        final int i14 = 1;
        complexEditText18.setOnClickListener(new e23.l(this) { // from class: cp2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f54930b;

            {
                this.f54930b = this;
            }

            /* JADX WARN: Type inference failed for: r5v6, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.List] */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int iIndexOf;
                String string2;
                Integer numValueOf;
                p pVar2;
                Object next;
                B b14;
                Editable editableText;
                int i15 = i14;
                Object obj2 = null;
                f fVar = this.f54930b;
                switch (i15) {
                    case 0:
                        f.a aVar2 = f.f54931p;
                        ((View) obj).getClass();
                        ArrayList arrayList = new ArrayList();
                        ap2.h hVar7 = fVar.f54942f;
                        if (hVar7 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD4 = hVar7.D4();
                        if (arrayListD4 != null) {
                            Iterator it = arrayListD4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((p) it.next()).f128595b);
                            }
                        }
                        ComplexEditText complexEditText19 = fVar.f54946j;
                        if (complexEditText19 == null) {
                            s.m("expirationYearLayout");
                            throw null;
                        }
                        Editable editableText2 = complexEditText19.getEditText().getEditableText();
                        Integer numI = (editableText2 == null || (string2 = editableText2.toString()) == null) ? null : d53.t.i(string2);
                        if (numI != null) {
                            if (numI.intValue() == f.f54933r) {
                                int i16 = Calendar.getInstance().get(2);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(arrayList);
                                arrayList.clear();
                                int i17 = 0;
                                for (Object obj3 : arrayList2) {
                                    int i18 = i17 + 1;
                                    if (i17 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    String str2 = (String) obj3;
                                    if (i17 >= i16) {
                                        arrayList.add(str2);
                                    }
                                    i17 = i18;
                                }
                            }
                        }
                        ap2.h hVar8 = fVar.f54942f;
                        if (hVar8 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD5 = hVar8.D4();
                        if (arrayListD5 != null) {
                            ap2.h hVar9 = fVar.f54942f;
                            if (hVar9 == null) {
                                s.m("fitPayAddCardViewModel");
                                throw null;
                            }
                            ArrayList arrayListD6 = hVar9.D4();
                            if (arrayListD6 != null) {
                                for (Object obj4 : arrayListD6) {
                                    B b15 = ((p) obj4).f128595b;
                                    ComplexEditText complexEditText20 = fVar.f54945i;
                                    if (complexEditText20 == null) {
                                        s.m("expirationMonthLayout");
                                        throw null;
                                    }
                                    Editable editableText3 = complexEditText20.getEditText().getEditableText();
                                    if (s.g(b15, editableText3 != null ? editableText3.toString() : null)) {
                                        obj2 = obj4;
                                        obj2 = (p) obj2;
                                    }
                                }
                                obj2 = (p) obj2;
                            }
                            iIndexOf = arrayListD5.indexOf(obj2);
                        } else {
                            iIndexOf = 0;
                        }
                        br2.c cVar = br2.c.f19585a;
                        androidx.fragment.app.m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        androidx.appcompat.app.e eVarR = br2.c.r(cVar, mVarRequireActivity2, fVar.getString(R.string.menu_option_month), (String[]) arrayList.toArray(new String[0]), iIndexOf, new c0(18, fVar, arrayList), new p(fVar.getString(R.string.lbl_cancel), new e0(10)));
                        if (eVarR != null) {
                            eVarR.show();
                        }
                        return Unit.INSTANCE;
                    default:
                        f.a aVar3 = f.f54931p;
                        ((View) obj).getClass();
                        r0 r0Var = new r0();
                        ArrayList arrayList3 = new ArrayList();
                        int i19 = f.f54936w;
                        arrayList3.add(String.valueOf(i19));
                        for (int i24 = 0; i24 < 10; i24++) {
                            i19++;
                            arrayList3.add(String.valueOf(i19));
                        }
                        r0Var.f105810a = h0.b1(arrayList3);
                        ap2.h hVar10 = fVar.f54942f;
                        if (hVar10 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD7 = hVar10.D4();
                        if (arrayListD7 != null) {
                            ap2.h hVar11 = fVar.f54942f;
                            if (hVar11 == null) {
                                s.m("fitPayAddCardViewModel");
                                throw null;
                            }
                            ArrayList arrayListD8 = hVar11.D4();
                            if (arrayListD8 != null) {
                                Iterator it3 = arrayListD8.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        b14 = ((p) next).f128595b;
                                        ComplexEditText complexEditText21 = fVar.f54945i;
                                        if (complexEditText21 == null) {
                                            s.m("expirationMonthLayout");
                                            throw null;
                                        }
                                        editableText = complexEditText21.getEditText().getEditableText();
                                    } else {
                                        next = null;
                                    }
                                    pVar2 = (p) next;
                                } while (!s.g(b14, editableText != null ? editableText.toString() : null));
                                pVar2 = (p) next;
                            } else {
                                pVar2 = null;
                            }
                            numValueOf = Integer.valueOf(arrayListD7.indexOf(pVar2));
                        } else {
                            numValueOf = null;
                        }
                        int i25 = Calendar.getInstance().get(2);
                        if (numValueOf != null && numValueOf.intValue() != -1 && numValueOf.intValue() < i25) {
                            Iterable iterable = (Iterable) r0Var.f105810a;
                            ?? arrayList4 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (!s.g((String) obj5, String.valueOf(Calendar.getInstance().get(1)))) {
                                    arrayList4.add(obj5);
                                }
                            }
                            r0Var.f105810a = arrayList4;
                        }
                        List list = (List) r0Var.f105810a;
                        ComplexEditText complexEditText22 = fVar.f54946j;
                        if (complexEditText22 == null) {
                            s.m("expirationYearLayout");
                            throw null;
                        }
                        Editable editableText4 = complexEditText22.getEditText().getEditableText();
                        int iG0 = h0.g0(editableText4 != null ? editableText4.toString() : null, list);
                        br2.c cVar2 = br2.c.f19585a;
                        androidx.fragment.app.m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        androidx.appcompat.app.e eVarR2 = br2.c.r(cVar2, mVarRequireActivity3, fVar.getString(R.string.menu_option_year), (String[]) ((Collection) r0Var.f105810a).toArray(new String[0]), iG0, new c0(17, fVar, r0Var), new p(fVar.getString(R.string.lbl_cancel), new e0(9)));
                        if (eVarR2 != null) {
                            eVarR2.show();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        ComplexEditText complexEditText19 = this.f54946j;
        if (complexEditText19 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        complexEditText19.getEditText().setFocusable(0);
        if (this.f54941e) {
            ComplexEditText complexEditText20 = this.f54946j;
            if (complexEditText20 == null) {
                s.m("expirationYearLayout");
                throw null;
            }
            EditText editText5 = complexEditText20.getEditText();
            ap2.h hVar7 = this.f54942f;
            if (hVar7 == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            Integer expYear = hVar7.f11699c.get().getExpYear();
            if (expYear == null || (strValueOf = String.valueOf(expYear.intValue())) == null) {
                strValueOf = "";
            }
            editText5.setText(strValueOf);
        }
        ap2.h hVar8 = this.f54942f;
        if (hVar8 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        ArrayList arrayListD4 = hVar8.D4();
        ComplexEditText complexEditText21 = this.f54945i;
        if (complexEditText21 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        complexEditText21.setVisibility(y6(ep2.h.EXP_MONTH) ? 0 : 8);
        ComplexEditText complexEditText22 = this.f54945i;
        if (complexEditText22 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        complexEditText22.getTopLabel().setText(getString(R.string.expiration_month));
        ComplexEditText complexEditText23 = this.f54945i;
        if (complexEditText23 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        EditText editText6 = complexEditText23.getEditText();
        ComplexEditText complexEditText24 = this.f54945i;
        if (complexEditText24 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        editText6.addTextChangedListener(new fp2.e(arrayListD4, complexEditText24, complexEditText24.getEditText()));
        ComplexEditText complexEditText25 = this.f54945i;
        if (complexEditText25 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        final int i15 = 0;
        complexEditText25.setOnClickListener(new e23.l(this) { // from class: cp2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f54930b;

            {
                this.f54930b = this;
            }

            /* JADX WARN: Type inference failed for: r5v6, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.List] */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int iIndexOf;
                String string2;
                Integer numValueOf;
                p pVar2;
                Object next;
                B b14;
                Editable editableText;
                int i16 = i15;
                Object obj2 = null;
                f fVar = this.f54930b;
                switch (i16) {
                    case 0:
                        f.a aVar2 = f.f54931p;
                        ((View) obj).getClass();
                        ArrayList arrayList = new ArrayList();
                        ap2.h hVar9 = fVar.f54942f;
                        if (hVar9 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD5 = hVar9.D4();
                        if (arrayListD5 != null) {
                            Iterator it = arrayListD5.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((p) it.next()).f128595b);
                            }
                        }
                        ComplexEditText complexEditText110 = fVar.f54946j;
                        if (complexEditText110 == null) {
                            s.m("expirationYearLayout");
                            throw null;
                        }
                        Editable editableText2 = complexEditText110.getEditText().getEditableText();
                        Integer numI = (editableText2 == null || (string2 = editableText2.toString()) == null) ? null : d53.t.i(string2);
                        if (numI != null) {
                            if (numI.intValue() == f.f54933r) {
                                int i17 = Calendar.getInstance().get(2);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(arrayList);
                                arrayList.clear();
                                int i18 = 0;
                                for (Object obj3 : arrayList2) {
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    String str2 = (String) obj3;
                                    if (i18 >= i17) {
                                        arrayList.add(str2);
                                    }
                                    i18 = i19;
                                }
                            }
                        }
                        ap2.h hVar10 = fVar.f54942f;
                        if (hVar10 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD6 = hVar10.D4();
                        if (arrayListD6 != null) {
                            ap2.h hVar11 = fVar.f54942f;
                            if (hVar11 == null) {
                                s.m("fitPayAddCardViewModel");
                                throw null;
                            }
                            ArrayList arrayListD7 = hVar11.D4();
                            if (arrayListD7 != null) {
                                for (Object obj4 : arrayListD7) {
                                    B b15 = ((p) obj4).f128595b;
                                    ComplexEditText complexEditText26 = fVar.f54945i;
                                    if (complexEditText26 == null) {
                                        s.m("expirationMonthLayout");
                                        throw null;
                                    }
                                    Editable editableText3 = complexEditText26.getEditText().getEditableText();
                                    if (s.g(b15, editableText3 != null ? editableText3.toString() : null)) {
                                        obj2 = obj4;
                                        obj2 = (p) obj2;
                                    }
                                }
                                obj2 = (p) obj2;
                            }
                            iIndexOf = arrayListD6.indexOf(obj2);
                        } else {
                            iIndexOf = 0;
                        }
                        br2.c cVar = br2.c.f19585a;
                        androidx.fragment.app.m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        androidx.appcompat.app.e eVarR = br2.c.r(cVar, mVarRequireActivity2, fVar.getString(R.string.menu_option_month), (String[]) arrayList.toArray(new String[0]), iIndexOf, new c0(18, fVar, arrayList), new p(fVar.getString(R.string.lbl_cancel), new e0(10)));
                        if (eVarR != null) {
                            eVarR.show();
                        }
                        return Unit.INSTANCE;
                    default:
                        f.a aVar3 = f.f54931p;
                        ((View) obj).getClass();
                        r0 r0Var = new r0();
                        ArrayList arrayList3 = new ArrayList();
                        int i110 = f.f54936w;
                        arrayList3.add(String.valueOf(i110));
                        for (int i24 = 0; i24 < 10; i24++) {
                            i110++;
                            arrayList3.add(String.valueOf(i110));
                        }
                        r0Var.f105810a = h0.b1(arrayList3);
                        ap2.h hVar12 = fVar.f54942f;
                        if (hVar12 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ArrayList arrayListD8 = hVar12.D4();
                        if (arrayListD8 != null) {
                            ap2.h hVar13 = fVar.f54942f;
                            if (hVar13 == null) {
                                s.m("fitPayAddCardViewModel");
                                throw null;
                            }
                            ArrayList arrayListD9 = hVar13.D4();
                            if (arrayListD9 != null) {
                                Iterator it3 = arrayListD9.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        b14 = ((p) next).f128595b;
                                        ComplexEditText complexEditText27 = fVar.f54945i;
                                        if (complexEditText27 == null) {
                                            s.m("expirationMonthLayout");
                                            throw null;
                                        }
                                        editableText = complexEditText27.getEditText().getEditableText();
                                    } else {
                                        next = null;
                                    }
                                    pVar2 = (p) next;
                                } while (!s.g(b14, editableText != null ? editableText.toString() : null));
                                pVar2 = (p) next;
                            } else {
                                pVar2 = null;
                            }
                            numValueOf = Integer.valueOf(arrayListD8.indexOf(pVar2));
                        } else {
                            numValueOf = null;
                        }
                        int i25 = Calendar.getInstance().get(2);
                        if (numValueOf != null && numValueOf.intValue() != -1 && numValueOf.intValue() < i25) {
                            Iterable iterable = (Iterable) r0Var.f105810a;
                            ?? arrayList4 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (!s.g((String) obj5, String.valueOf(Calendar.getInstance().get(1)))) {
                                    arrayList4.add(obj5);
                                }
                            }
                            r0Var.f105810a = arrayList4;
                        }
                        List list = (List) r0Var.f105810a;
                        ComplexEditText complexEditText28 = fVar.f54946j;
                        if (complexEditText28 == null) {
                            s.m("expirationYearLayout");
                            throw null;
                        }
                        Editable editableText4 = complexEditText28.getEditText().getEditableText();
                        int iG0 = h0.g0(editableText4 != null ? editableText4.toString() : null, list);
                        br2.c cVar2 = br2.c.f19585a;
                        androidx.fragment.app.m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        androidx.appcompat.app.e eVarR2 = br2.c.r(cVar2, mVarRequireActivity3, fVar.getString(R.string.menu_option_year), (String[]) ((Collection) r0Var.f105810a).toArray(new String[0]), iG0, new c0(17, fVar, r0Var), new p(fVar.getString(R.string.lbl_cancel), new e0(9)));
                        if (eVarR2 != null) {
                            eVarR2.show();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        ComplexEditText complexEditText26 = this.f54945i;
        if (complexEditText26 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        complexEditText26.getEditText().setFocusable(0);
        if (this.f54941e) {
            ap2.h hVar9 = this.f54942f;
            if (hVar9 == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            Integer expMonth = hVar9.f11699c.get().getExpMonth();
            Integer numE = expMonth != null ? b71.i.e(1, expMonth) : null;
            if (numE == null) {
                str = "";
            } else {
                ap2.h hVar10 = this.f54942f;
                if (hVar10 == null) {
                    s.m("fitPayAddCardViewModel");
                    throw null;
                }
                ArrayList arrayListD5 = hVar10.D4();
                str = (arrayListD5 == null || (pVar = (p) arrayListD5.get(numE.intValue())) == null) ? null : (String) pVar.f128595b;
                if (str == null) {
                    str = "";
                }
            }
            ComplexEditText complexEditText27 = this.f54945i;
            if (complexEditText27 == null) {
                s.m("expirationMonthLayout");
                throw null;
            }
            complexEditText27.getEditText().setText(str);
        }
        ComplexEditText complexEditText28 = this.f54944h;
        if (complexEditText28 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        complexEditText28.setVisibility(y6(ep2.h.PAN) ? 0 : 8);
        ComplexEditText complexEditText29 = this.f54944h;
        if (complexEditText29 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        complexEditText29.getTopLabel().setText(getString(R.string.wallet_card_number));
        ComplexEditText complexEditText30 = this.f54944h;
        if (complexEditText30 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        complexEditText30.getEditText().setInputType(2);
        ComplexEditText complexEditText31 = this.f54944h;
        if (complexEditText31 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        complexEditText31.getEditText().addTextChangedListener(dVar);
        u uVar = u.f186888a;
        Locale localeA = hb2.h.a(requireContext().getApplicationContext());
        localeA.getClass();
        uVar.getClass();
        try {
            byte directionality = Character.getDirectionality(localeA.getDisplayName().charAt(0));
            z14 = directionality == 1 || directionality == 2;
        } catch (Exception unused) {
        }
        ComplexEditText complexEditText32 = this.f54944h;
        if (z14) {
            if (complexEditText32 == null) {
                s.m("cardNumberLayout");
                throw null;
            }
            complexEditText32.getEditText().setTextDirection(3);
            ComplexEditText complexEditText33 = this.f54944h;
            if (complexEditText33 == null) {
                s.m("cardNumberLayout");
                throw null;
            }
            complexEditText33.getEditText().setGravity(5);
        } else {
            if (complexEditText32 == null) {
                s.m("cardNumberLayout");
                throw null;
            }
            complexEditText32.getEditText().setGravity(3);
        }
        if (this.f54941e) {
            ComplexEditText complexEditText34 = this.f54944h;
            if (complexEditText34 == null) {
                s.m("cardNumberLayout");
                throw null;
            }
            EditText editText7 = complexEditText34.getEditText();
            ap2.h hVar11 = this.f54942f;
            if (hVar11 == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            editText7.setText(hVar11.f11699c.get().getCardNumber());
        }
        ComplexEditText complexEditText35 = this.f54943g;
        if (complexEditText35 == null) {
            s.m("nameOnCardLayout");
            throw null;
        }
        complexEditText35.setVisibility(y6(ep2.h.NAME) ? 0 : 8);
        ComplexEditText complexEditText36 = this.f54943g;
        if (complexEditText36 == null) {
            s.m("nameOnCardLayout");
            throw null;
        }
        complexEditText36.getTopLabel().setText(getString(R.string.cardholder_name));
        ComplexEditText complexEditText37 = this.f54943g;
        if (complexEditText37 == null) {
            s.m("nameOnCardLayout");
            throw null;
        }
        complexEditText37.getEditText().setInputType(1);
        Locale localeA2 = hb2.h.a(requireContext().getApplicationContext());
        localeA2.getClass();
        try {
            byte directionality2 = Character.getDirectionality(localeA2.getDisplayName().charAt(0));
            z15 = directionality2 == 1 || directionality2 == 2;
        } catch (Exception unused2) {
        }
        ComplexEditText complexEditText38 = this.f54943g;
        if (z15) {
            if (complexEditText38 == null) {
                s.m("nameOnCardLayout");
                throw null;
            }
            complexEditText38.getEditText().setTextDirection(3);
            ComplexEditText complexEditText39 = this.f54943g;
            if (complexEditText39 == null) {
                s.m("nameOnCardLayout");
                throw null;
            }
            complexEditText39.getEditText().setGravity(5);
        } else {
            if (complexEditText38 == null) {
                s.m("nameOnCardLayout");
                throw null;
            }
            complexEditText38.getEditText().setGravity(3);
        }
        if (this.f54941e) {
            ComplexEditText complexEditText40 = this.f54943g;
            if (complexEditText40 == null) {
                s.m("nameOnCardLayout");
                throw null;
            }
            EditText editText8 = complexEditText40.getEditText();
            ap2.h hVar12 = this.f54942f;
            if (hVar12 == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            editText8.setText(hVar12.f11699c.get().getCardHolderName());
        }
        String string2 = getString(R.string.common_button_next);
        string2.getClass();
        k kVar = new k(this, 28);
        Button button = this.f54949m;
        if (button == null) {
            s.m("submitCardInfo");
            throw null;
        }
        button.setEnabled(true);
        Button button2 = this.f54949m;
        if (button2 == null) {
            s.m("submitCardInfo");
            throw null;
        }
        button2.setText(string2);
        Button button3 = this.f54949m;
        if (button3 == null) {
            s.m("submitCardInfo");
            throw null;
        }
        button3.setOnClickListener(new com.garmin.android.apps.connectmobile.connectiq.x(kVar, 3));
        yq2.a aVar2 = this.f54950n;
        if (aVar2 == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        aVar2.x(false);
        if (this.f54941e) {
            return;
        }
        ComplexEditText complexEditText41 = this.f54943g;
        if (complexEditText41 == null) {
            s.m("nameOnCardLayout");
            throw null;
        }
        complexEditText41.getEditText().setText("");
        ComplexEditText complexEditText42 = this.f54944h;
        if (complexEditText42 == null) {
            s.m("cardNumberLayout");
            throw null;
        }
        complexEditText42.getEditText().setText("");
        ComplexEditText complexEditText43 = this.f54945i;
        if (complexEditText43 == null) {
            s.m("expirationMonthLayout");
            throw null;
        }
        complexEditText43.getEditText().setText("");
        ComplexEditText complexEditText44 = this.f54946j;
        if (complexEditText44 == null) {
            s.m("expirationYearLayout");
            throw null;
        }
        complexEditText44.getEditText().setText("");
        ComplexEditText complexEditText45 = this.f54947k;
        if (complexEditText45 != null) {
            complexEditText45.getEditText().setText("");
        } else {
            s.m("securityCodeLayout");
            throw null;
        }
    }

    public final boolean y6(ep2.h hVar) {
        List<ep2.g> list = this.f54939c;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (h0.R(this.f54951o, ((ep2.g) it.next()).getName())) {
                List<ep2.g> list2 = this.f54939c;
                ArrayList arrayList = new ArrayList(y.r(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((ep2.g) it3.next()).getName());
                }
                return arrayList.contains(hVar);
            }
        }
        return true;
    }

    public final boolean z6(ep2.h hVar) {
        if (!this.f54937a) {
            int i14 = b.f54952a[hVar.ordinal()];
            return i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5;
        }
        List<ep2.g> list = this.f54938b;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ep2.g) it.next()).getName());
        }
        return arrayList.contains(hVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcp2/f$a;", "", "<init>", "()V", "", "SECURITY_CODE_LENGTH", "I", "MAX_MONTHS_SHOWN", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) f.f54932q.getValue();
        }

        private a() {
        }
    }
}
