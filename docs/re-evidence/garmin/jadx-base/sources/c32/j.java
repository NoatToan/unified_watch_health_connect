package c32;

import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import e23.l;
import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InlineUnitsTextFieldView f24120b;

    public /* synthetic */ j(InlineUnitsTextFieldView inlineUnitsTextFieldView, int i14) {
        this.f24119a = i14;
        this.f24120b = inlineUnitsTextFieldView;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f24119a;
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f24120b;
        switch (i14) {
            case 0:
                int i15 = InlineUnitsTextFieldView.T0;
                ((String) obj).getClass();
                p<? super InlineUnitsTextFieldView.a, ? super Number, Unit> pVar = inlineUnitsTextFieldView.S0;
                if (pVar != null) {
                    InlineUnitsTextFieldView.a aVar = inlineUnitsTextFieldView.K0;
                    aVar.getClass();
                    pVar.invoke(aVar, inlineUnitsTextFieldView.J0);
                }
                return Unit.INSTANCE;
            default:
                return InlineUnitsTextFieldView.i(inlineUnitsTextFieldView, (InlineUnitsTextFieldView.a) obj);
        }
    }
}
