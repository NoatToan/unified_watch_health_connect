package defpackage;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes18.dex */
public class thi {
    public static rfq e(boolean z, thh thhVar, thf thfVar, CompoundButton.OnCheckedChangeListener... onCheckedChangeListenerArr) {
        rfq rfqVar = new rfq();
        if (thhVar != null && thfVar != null) {
            rfqVar.e(thhVar.b());
            rfqVar.d(thhVar.a());
            rfqVar.e(thfVar.d());
            rfqVar.c(thfVar.a());
            rfqVar.a(thfVar.b());
            rfqVar.a(thhVar.e());
            rfqVar.c(z);
            if (onCheckedChangeListenerArr.length != 0) {
                rfqVar.e(onCheckedChangeListenerArr[0]);
            }
        }
        return rfqVar;
    }
}
