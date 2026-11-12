package wq;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.material.textfield.TextInputLayout;
import d53.w;
import r53.p2;
import zb0.c1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f186546c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f186544a = i14;
        this.f186546c = obj;
        this.f186545b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        Editable text;
        Object value;
        String string;
        int i15 = this.f186544a;
        String string2 = null;
        pn2.u uVar = null;
        string2 = null;
        Object obj = this.f186545b;
        Object obj2 = this.f186546c;
        switch (i15) {
            case 0:
                ((b) obj2).invoke(Integer.valueOf(((NumberPicker) obj).getValue()));
                return;
            case 1:
                xg1.a aVar = (xg1.a) obj2;
                String str = xg1.a.f190873c;
                String strValueOf = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf.length() == 0) {
                    return;
                }
                try {
                    xg1.i<Integer> iVar = aVar.f190874a;
                    if (iVar != null) {
                        iVar.a(Integer.valueOf(Integer.parseInt(strValueOf)));
                    }
                    dialogInterface.dismiss();
                    return;
                } catch (NullPointerException e4) {
                    a2 a2Var = a2.SETTINGS;
                    String strN = fb1.c.n("NullPointerException: : ", e4.getMessage());
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, str, strN);
                    return;
                } catch (NumberFormatException e14) {
                    a2 a2Var2 = a2.SETTINGS;
                    String strN2 = fb1.c.n("NumberFormatException: : ", e14.getMessage());
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, str, strN2);
                    return;
                }
            case 2:
                xg1.e eVar = (xg1.e) obj2;
                xg1.e.a aVar2 = xg1.e.f190893b;
                dialogInterface.getClass();
                String strValueOf2 = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf2.length() == 0) {
                    return;
                }
                try {
                    xg1.i<Integer> iVar2 = eVar.f190894a;
                    if (iVar2 != null) {
                        iVar2.a(Integer.valueOf(Integer.parseInt(strValueOf2)));
                    }
                    dialogInterface.dismiss();
                    return;
                } catch (NumberFormatException e15) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.SETTINGS;
                    String str2 = "NumberFormatException: : " + e15.getMessage();
                    aVar3.getClass();
                    i2.a.b(a2Var3, "HeartRateDialogFragment", str2);
                    return;
                }
            case 3:
                xg1.f fVar = (xg1.f) obj2;
                String strValueOf3 = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf3.isEmpty()) {
                    return;
                }
                try {
                    xg1.i<Double> iVar3 = fVar.f190895a;
                    if (iVar3 != null) {
                        iVar3.a(Double.valueOf(strValueOf3));
                    }
                    dialogInterface.dismiss();
                    return;
                } catch (NumberFormatException e16) {
                    i2.a(a2.SETTINGS, "TimeDialogFragment", "NumberFormatException: : " + e16.getMessage());
                    return;
                }
            case 4:
                xg1.k kVar = (xg1.k) obj2;
                String str3 = xg1.k.f190899c;
                String strValueOf4 = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf4.length() == 0) {
                    return;
                }
                try {
                    xg1.i<Integer> iVar4 = kVar.f190900a;
                    if (iVar4 != null) {
                        iVar4.a(Integer.valueOf(Integer.parseInt(strValueOf4)));
                    }
                    dialogInterface.dismiss();
                    return;
                } catch (NullPointerException e17) {
                    a2 a2Var4 = a2.SETTINGS;
                    String strN3 = fb1.c.n("NullPointerException: : ", e17.getMessage());
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, str3, strN3);
                    return;
                } catch (NumberFormatException e18) {
                    a2 a2Var5 = a2.SETTINGS;
                    String strN4 = fb1.c.n("NumberFormatException: : ", e18.getMessage());
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, str3, strN4);
                    return;
                }
            case 5:
                xg1.o oVar = (xg1.o) obj2;
                EditText editText = (EditText) obj;
                xg1.o.b bVar = oVar.f190915a;
                if (bVar != null) {
                    if (editText != null && (text = editText.getText()) != null) {
                        string2 = text.toString();
                    }
                    if (string2 == null) {
                        string2 = "";
                    }
                    bVar.a(w.i0(string2).toString());
                }
                oVar.dismiss();
                return;
            case 6:
                xg1.q qVar = (xg1.q) obj2;
                String strValueOf5 = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf5.isEmpty()) {
                    return;
                }
                try {
                    xg1.i<Integer> iVar5 = qVar.f190917a;
                    if (iVar5 != null) {
                        iVar5.a(Integer.valueOf(strValueOf5));
                    }
                    dialogInterface.dismiss();
                    return;
                } catch (NumberFormatException e19) {
                    i2.a(a2.SETTINGS, "SingleNumberSelectionDi", "NumberFormatException: : " + e19.getMessage());
                    return;
                }
            case 7:
                xn2.e eVar2 = (xn2.e) obj2;
                xn2.e.a aVar4 = xn2.e.f191693i;
                pn2.u uVar2 = ((pn2.u[]) obj)[i14];
                if (uVar2 != null) {
                    TextInputLayout textInputLayout = eVar2.f191698e;
                    if (textInputLayout == null) {
                        p005kotlin.jvm.internal.s.m("gender");
                        throw null;
                    }
                    EditText editText2 = textInputLayout.getEditText();
                    editText2.getClass();
                    editText2.setText(uVar2.f138812b);
                    uVar = uVar2;
                }
                eVar2.f191700g = uVar;
                eVar2.z6();
                return;
            case 8:
                xn2.p pVar = (xn2.p) obj2;
                xn2.p.a aVar5 = xn2.p.f191723f;
                int value2 = ((NumberPicker) obj).getValue() * 1000;
                pVar.b().k(value2);
                TextView textView = pVar.f191726d;
                if (textView != null) {
                    textView.setText(pVar.f191724b.a(Integer.valueOf(value2)));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("balanceTextView");
                    throw null;
                }
            case 9:
                ya1.w wVar = (ya1.w) obj2;
                String string3 = w.i0(((EditText) obj).getText().toString()).toString();
                wVar.f195631d = string3;
                wVar.f195630c.setText(string3);
                wVar.f195628a.invoke(string3);
                dialogInterface.dismiss();
                return;
            case 10:
                Context context = (Context) obj;
                dialogInterface.dismiss();
                ((e23.a) obj2).invoke();
                try {
                    context.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                    return;
                } catch (ActivityNotFoundException e24) {
                    a2 a2Var6 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var6, "showDeviceRemovedAlert", e24);
                    return;
                }
            case 11:
                int i16 = c1.f203441z;
                wn1.g gVarY6 = ((c1) obj2).y6();
                String str4 = ((String[]) obj)[i14];
                str4.getClass();
                gVarY6.f186225h.R(str4);
                p2 p2Var = gVarY6.f186226i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, wn1.d.a((wn1.d) value, null, str4, null, null, null, null, 61)));
                dialogInterface.dismiss();
                return;
            case 12:
                vo.e eVar3 = (vo.e) obj;
                ap.d dVar = ((com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f) obj2).f29339a;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                eVar3.getClass();
                dVar.f11593e.c(eVar3);
                return;
            case 13:
                com.garmin.android.apps.connectmobile.cannedtextreply.c cVar = (com.garmin.android.apps.connectmobile.cannedtextreply.c) obj2;
                EditText editText3 = (EditText) obj;
                if (cVar.f31308a != null) {
                    String string4 = editText3.getText().toString();
                    int length = string4.length() - 1;
                    int i17 = 0;
                    Object[] objArr = false;
                    while (i17 <= length) {
                        Object[] objArr2 = p005kotlin.jvm.internal.s.h(string4.charAt(objArr == false ? i17 : length), 32) <= 0;
                        if (objArr == true) {
                            if (objArr2 != true) {
                                string = string4.subSequence(i17, length + 1).toString();
                                if (!TextUtils.isEmpty(string) || p005kotlin.jvm.internal.s.g(string, cVar.f31309b)) {
                                    CannedTextReplyActivity cannedTextReplyActivity = cVar.f31308a;
                                    cannedTextReplyActivity.getClass();
                                    cannedTextReplyActivity.f31275k = -1;
                                    return;
                                }
                                CannedTextReplyActivity cannedTextReplyActivity2 = cVar.f31308a;
                                cannedTextReplyActivity2.getClass();
                                string.getClass();
                                cannedTextReplyActivity2.f31276l = true;
                                int i18 = cannedTextReplyActivity2.f31275k;
                                if (i18 != -1) {
                                    cannedTextReplyActivity2.ga(i18, true, false);
                                    cannedTextReplyActivity2.f31275k = -1;
                                }
                                zy.l lVar = new zy.l(string, true, 0, 1);
                                cannedTextReplyActivity2.da(lVar, cannedTextReplyActivity2.ea(lVar), true, true);
                                cannedTextReplyActivity2.ia(true);
                                return;
                            }
                            length--;
                        } else if (objArr2 == true) {
                            i17++;
                        } else {
                            objArr = true;
                        }
                    }
                    string = string4.subSequence(i17, length + 1).toString();
                    if (TextUtils.isEmpty(string)) {
                    }
                    CannedTextReplyActivity cannedTextReplyActivity3 = cVar.f31308a;
                    cannedTextReplyActivity3.getClass();
                    cannedTextReplyActivity3.f31275k = -1;
                    return;
                }
                return;
            default:
                int i19 = zz0.j.f207619l;
                dialogInterface.dismiss();
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersInviteAccepted");
                ((zz0.j) obj2).f207620a.d3((ue0.n) obj);
                return;
        }
    }

    public /* synthetic */ c(NumberPicker numberPicker, Fragment fragment, int i14) {
        this.f186544a = i14;
        this.f186545b = numberPicker;
        this.f186546c = fragment;
    }
}
