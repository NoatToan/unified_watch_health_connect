package s70;

import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import p3.p2;
import v62.j6;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        int i15;
        int i16;
        p3.o0 o0VarE = mVar.E(308874315);
        int i17 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.ALERT;
            s62.a.f157643a.getClass();
            u4.d dVarA = j6.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.assistance_contacts_validation_my_day_card_title);
            if (s3.b()) {
                i15 = 475484657;
                i16 = R.string.msg_assistance_contacts_list_attention_needed;
            } else {
                i15 = 475487081;
                i16 = R.string.assistance_contact_red_banner_message;
            }
            sVar.d(rVar, bVar, dVarA, strQ, com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false), null, null, aVar, o0VarE, (i17 & 14) | 48 | ((i17 << 21) & 234881024), 224);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(rVar, aVar, i14, 6);
        }
    }
}
