package eg0;

import a3.d;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(InlineUnitsTextFieldView inlineUnitsTextFieldView, bg0.a.c cVar, p<? super bg0.a.c, ? super bg0.a.b, Unit> pVar) {
        inlineUnitsTextFieldView.getClass();
        if (cVar != null) {
            inlineUnitsTextFieldView.m(cVar.f17834a, new b(cVar.f17835b));
            b.f63971b.getClass();
            inlineUnitsTextFieldView.setUnitList(b.a.a());
            inlineUnitsTextFieldView.setOnDoneEditingNumber(new d(pVar, 11));
        }
    }
}
