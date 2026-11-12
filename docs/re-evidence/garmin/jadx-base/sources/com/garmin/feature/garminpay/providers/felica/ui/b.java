package com.garmin.feature.garminpay.providers.felica.ui;

import com.google.common.base.Optional;
import hs2.c;
import java.io.File;
import java.util.List;
import p005kotlin.Metadata;
import sy2.e;
import uy2.b1;
import vn2.a1;
import vq2.f;
import wr2.q;
import yn2.i;

/* JADX INFO: loaded from: classes11.dex */
public interface b extends e<a1>, vq2.e, f, i, yn2.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/b$a;", "Luy2/b1;", "Lcom/garmin/feature/garminpay/providers/felica/ui/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b1<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uy2.a1 f51095b;

        public a() {
            vn2.b1 b1Var = new vn2.b1(0);
            b1.f173453a.getClass();
            this.f51095b = new uy2.a1(b1Var);
        }

        @Override // uy2.b1
        public final void a(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            this.f51095b.a(bVar2);
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/b$b;", "Luy2/b1;", "Lcom/garmin/feature/garminpay/providers/felica/ui/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1053b implements b1<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uy2.a1 f51096b;

        public C1053b() {
            vn2.b1 b1Var = new vn2.b1(1);
            b1.f173453a.getClass();
            this.f51096b = new uy2.a1(b1Var);
        }

        @Override // uy2.b1
        public final void a(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            this.f51096b.a(bVar2);
        }
    }

    void T8(String str);

    void V7(q.b bVar, long j8, List list);

    void V8();

    void W(String str, String str2);

    void c();

    void call();

    void d1(long j8, String str);

    void e();

    void h();

    void i();

    void j();

    @uy2.a(providerClass = C1053b.class)
    void k6(long j8, String str);

    void q(String str);

    void r4(pn2.e eVar);

    void t7(File file);

    void v(String str);

    @uy2.a(providerClass = a.class)
    void v9(long j8, String str);

    void w(String str);

    void y(pn2.e eVar);

    void y4(long j8, List<vr2.q> list, Optional<c> optional, String str);
}
