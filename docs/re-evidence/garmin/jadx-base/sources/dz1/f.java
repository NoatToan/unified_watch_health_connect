package dz1;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f61702b;

    public /* synthetic */ f(i iVar, int i14) {
        this.f61701a = i14;
        this.f61702b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        eg0.b bVar;
        my1.d dVarB;
        int i14 = this.f61701a;
        i iVar = this.f61702b;
        switch (i14) {
            case 0:
                gg0.f fVar = (gg0.f) obj;
                i.a aVar = i.F;
                if (fVar != null) {
                    int i15 = i.b.f61733a[fVar.ordinal()];
                    if (i15 == 1 || i15 == 2) {
                        cz1.a aVarW6 = iVar.w6();
                        ny1.b bVar2 = ny1.b.RUNNING_DISTANCE;
                        aVarW6.k5(bVar2);
                        iVar.z6(bVar2);
                    } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                        cz1.a aVarW7 = iVar.w6();
                        ny1.b bVar3 = ny1.b.CYCLING_DISTANCE;
                        aVarW7.k5(bVar3);
                        iVar.z6(bVar3);
                    } else {
                        iVar.w6().k5(ny1.b.CUSTOM);
                        iVar.w6().n5(ez1.b.CUSTOM);
                        RecyclerView recyclerView = iVar.f61726r;
                        if (recyclerView == null) {
                            s.m("rvDurationDistance");
                            throw null;
                        }
                        recyclerView.setVisibility(8);
                        RecyclerView recyclerView2 = iVar.f61727t;
                        if (recyclerView2 == null) {
                            s.m("rvDurationTime");
                            throw null;
                        }
                        recyclerView2.setVisibility(8);
                        LinearLayout linearLayout = iVar.f61715g;
                        if (linearLayout == null) {
                            s.m("llCustomView");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                    }
                }
                my1.d dVarD = iVar.w6().Z4().d();
                if ((dVarD != null ? dVarD.f121494k : null) != ez1.h.ALL) {
                    iVar.A6(false);
                }
                return Unit.INSTANCE;
            case 1:
                my1.d dVar = (my1.d) obj;
                i.a aVar2 = i.F;
                if (dVar != null) {
                    double d14 = dVar.f121496m;
                    double d15 = dVar.f121497n;
                    iVar.w6();
                    bg0.a.b bVar4 = dVar.f121498o;
                    bVar4.getClass();
                    int i16 = cz1.a.b.f56876b[bVar4.ordinal()];
                    if (i16 == 1) {
                        bVar = new eg0.b(bg0.a.b.METER);
                    } else if (i16 == 2) {
                        bVar = new eg0.b(bg0.a.b.KILOMETER);
                    } else if (i16 == 3) {
                        bVar = new eg0.b(bg0.a.b.MILE);
                    } else {
                        if (i16 != 4) {
                            u0.r();
                            return null;
                        }
                        bVar = new eg0.b(bg0.a.b.YARD);
                    }
                    iVar.D = bVar;
                    TextView textView = iVar.f61717i;
                    if (textView == null) {
                        s.m("textViewDistanceUnit");
                        throw null;
                    }
                    Context contextRequireContext = iVar.requireContext();
                    contextRequireContext.getClass();
                    textView.setText(bVar.f63972a.a(contextRequireContext));
                    if (dVar.f121493j == ez1.b.CUSTOM && dVar.f121491h) {
                        LinearLayout linearLayout2 = iVar.f61715g;
                        if (linearLayout2 == null) {
                            s.m("llCustomView");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                    }
                    if (d15 > 0.0d) {
                        TextView textView2 = iVar.f61721m;
                        if (textView2 == null) {
                            s.m("tvMinimumDistance");
                            throw null;
                        }
                        InlineUnitsTextFieldView.a aVar3 = iVar.D;
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        textView2.setText(d15 + StringUtils.SPACE + aVar3.a(contextRequireContext2));
                        EditText editText = iVar.f61720l;
                        if (editText == null) {
                            s.m("minimumDistanceEditText");
                            throw null;
                        }
                        editText.setText(String.valueOf(d15));
                    }
                    if (d14 > 0.0d) {
                        TextView textView3 = iVar.f61725q;
                        if (textView3 == null) {
                            s.m("tvMaximumDistance");
                            throw null;
                        }
                        InlineUnitsTextFieldView.a aVar4 = iVar.D;
                        Context contextRequireContext3 = iVar.requireContext();
                        contextRequireContext3.getClass();
                        textView3.setText(d14 + StringUtils.SPACE + aVar4.a(contextRequireContext3));
                        EditText editText2 = iVar.f61724p;
                        if (editText2 == null) {
                            s.m("maximumDistanceEditText");
                            throw null;
                        }
                        editText2.setText(String.valueOf(d14));
                    }
                }
                return Unit.INSTANCE;
            default:
                InlineUnitsTextFieldView.a aVar5 = (InlineUnitsTextFieldView.a) obj;
                i.a aVar6 = i.F;
                aVar5.getClass();
                iVar.D = aVar5;
                cz1.a aVarW8 = iVar.w6();
                my1.d dVarD2 = aVarW8.Z4().d();
                bg0.a.b bVar5 = dVarD2 != null ? dVarD2.f121498o : null;
                bg0.a.b bVar6 = bg0.a.b.MILE;
                if (aVar5.equals(new eg0.b(bVar6))) {
                    bVar5 = new eg0.b(bVar6).f63972a;
                } else {
                    bg0.a.b bVar7 = bg0.a.b.METER;
                    if (aVar5.equals(new eg0.b(bVar7))) {
                        bVar5 = new eg0.b(bVar7).f63972a;
                    } else {
                        bg0.a.b bVar8 = bg0.a.b.KILOMETER;
                        if (aVar5.equals(new eg0.b(bVar8))) {
                            bVar5 = new eg0.b(bVar8).f63972a;
                        } else {
                            bg0.a.b bVar9 = bg0.a.b.YARD;
                            if (aVar5.equals(new eg0.b(bVar9))) {
                                bVar5 = new eg0.b(bVar9).f63972a;
                            }
                        }
                    }
                }
                my1.d dVarD3 = aVarW8.Z4().d();
                y0<my1.d> y0VarZ4 = aVarW8.Z4();
                if (dVarD3 != null) {
                    if (bVar5 == null) {
                        bg0.a.f17827a.getClass();
                        bVar5 = new eg0.b(bg0.a.C0255a.a()).f63972a;
                    }
                    dVarB = my1.d.b(dVarD3, null, null, null, null, null, null, null, false, null, null, null, 0.0d, 0.0d, bVar5, null, null, 1032191);
                } else {
                    dVarB = null;
                }
                y0VarZ4.m(dVarB);
                TextView textView4 = iVar.f61717i;
                if (textView4 == null) {
                    s.m("textViewDistanceUnit");
                    throw null;
                }
                InlineUnitsTextFieldView.a aVar7 = iVar.D;
                Context contextRequireContext4 = iVar.requireContext();
                contextRequireContext4.getClass();
                textView4.setText(aVar7.a(contextRequireContext4));
                EditText editText3 = iVar.f61720l;
                if (editText3 == null) {
                    s.m("minimumDistanceEditText");
                    throw null;
                }
                Editable text = editText3.getText();
                if (text != null && text.length() != 0) {
                    TextView textView5 = iVar.f61721m;
                    if (textView5 == null) {
                        s.m("tvMinimumDistance");
                        throw null;
                    }
                    lz1.f.a aVar8 = lz1.f.f115404a;
                    EditText editText4 = iVar.f61720l;
                    if (editText4 == null) {
                        s.m("minimumDistanceEditText");
                        throw null;
                    }
                    double d16 = Double.parseDouble(editText4.getText().toString());
                    aVar8.getClass();
                    double dO = lz1.f.a.o(d16, 3);
                    InlineUnitsTextFieldView.a aVar9 = iVar.D;
                    Context contextRequireContext5 = iVar.requireContext();
                    contextRequireContext5.getClass();
                    textView5.setText(dO + StringUtils.SPACE + aVar9.a(contextRequireContext5));
                }
                EditText editText5 = iVar.f61724p;
                if (editText5 == null) {
                    s.m("maximumDistanceEditText");
                    throw null;
                }
                Editable text2 = editText5.getText();
                if (text2 != null && text2.length() != 0) {
                    TextView textView6 = iVar.f61725q;
                    if (textView6 == null) {
                        s.m("tvMaximumDistance");
                        throw null;
                    }
                    lz1.f.a aVar10 = lz1.f.f115404a;
                    EditText editText6 = iVar.f61724p;
                    if (editText6 == null) {
                        s.m("maximumDistanceEditText");
                        throw null;
                    }
                    double d17 = Double.parseDouble(editText6.getText().toString());
                    aVar10.getClass();
                    double dO2 = lz1.f.a.o(d17, 3);
                    InlineUnitsTextFieldView.a aVar11 = iVar.D;
                    Context contextRequireContext6 = iVar.requireContext();
                    contextRequireContext6.getClass();
                    textView6.setText(dO2 + StringUtils.SPACE + aVar11.a(contextRequireContext6));
                }
                return Unit.INSTANCE;
        }
    }
}
