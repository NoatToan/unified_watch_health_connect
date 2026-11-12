package na0;

import androidx.lifecycle.v1;
import d53.y;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.p<Integer, String, Unit> {
    public f(Object obj) {
        super(2, obj, j.class, "onDigitEntered", "onDigitEntered(ILjava/lang/String;)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Integer num, String str) {
        Object value;
        ArrayList arrayListD1;
        int iIntValue = num.intValue();
        String str2 = str;
        str2.getClass();
        j jVar = (j) this.receiver;
        jVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        int length = str2.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str2.charAt(i14);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        String strT0 = y.t0(1, sb3.toString());
        if ((iIntValue == 0 || iIntValue == 2) && strT0.equals("0")) {
            strT0 = "";
        }
        p2 p2Var = jVar.f125131a;
        do {
            value = p2Var.getValue();
            arrayListD1 = h0.d1((List) value);
            arrayListD1.set(iIntValue, strT0);
        } while (!p2Var.b(value, arrayListD1));
        if (strT0.length() > 0 && iIntValue < 4) {
            ge1.b.T(v1.a(jVar), null, null, new k(jVar, iIntValue, null), 3);
        }
        return Unit.INSTANCE;
    }
}
