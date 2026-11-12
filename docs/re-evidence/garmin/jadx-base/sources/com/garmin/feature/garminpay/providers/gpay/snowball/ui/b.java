package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import fo2.a0;
import fo2.i;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import po2.h0;
import po2.n;
import po2.o;
import uy2.a1;
import uy2.b1;
import vq2.f;

/* JADX INFO: loaded from: classes11.dex */
public interface b extends sy2.e<n>, e, vq2.e, f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/b$a;", "Luy2/b1;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b1<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f51269b;

        public a() {
            o oVar = new o(0);
            b1.f173453a.getClass();
            this.f51269b = new a1(oVar);
        }

        @Override // uy2.b1
        public final void a(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            this.f51269b.a(bVar2);
        }
    }

    void D6(String str);

    void G8();

    void O8();

    void P3();

    void P4(String str, List<i> list, CurrencyValue currencyValue);

    void Q4(List<h0> list);

    void T4();

    void W(String str, String str2);

    void W6(String str);

    void X8();

    void c();

    void e1(List<a0> list);

    void f1();

    @uy2.a(providerClass = a.class)
    void f3(String str);

    void g4();

    i0 getScope();

    void h6(long j8, String str);

    void o3();

    void o9(String str, String str2);

    void q(String str);

    void t4(long j8, String str);

    void u0(LocalDate localDate);

    void v(String str);

    void w(String str);

    void z5(String str);
}
