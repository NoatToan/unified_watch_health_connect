package yn2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.analytics.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.a1;
import uy2.b1;
import w5.r;

/* JADX INFO: loaded from: classes11.dex */
public interface d extends b, vq2.d {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyn2/d$a;", "Luy2/b1;", "Lsy2/e;", "Lyn2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b1<sy2.e<? extends c>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f198203b;

        public a() {
            ya1.h hVar = new ya1.h(28);
            b1.f173453a.getClass();
            this.f198203b = new a1(hVar);
        }

        @Override // uy2.b1
        public final void a(sy2.e<? extends c> eVar) {
            sy2.e<? extends c> eVar2 = eVar;
            eVar2.getClass();
            this.f198203b.a(eVar2);
        }
    }

    un2.a F5();

    @uy2.a(providerClass = a.class)
    default void T2(Integer num) {
        un2.a aVarF5 = F5();
        float fFloatValue = num.floatValue();
        aVarF5.getClass();
        u uVar = new u(aVarF5, fFloatValue);
        int i14 = w03.b.f181178a;
        new z03.c(uVar).k(l13.a.f108327b).h(r03.a.a()).a(new y03.h());
    }

    default void i9(String str, e23.a<Unit> aVar) {
        str.getClass();
        C3(R.string.wallet_access_error, r.v(R.string.wallet_message_error_contact_garmin_jp_support_center, str), str, R.string.lbl_ok, new xx1.d(aVar, 2));
    }
}
