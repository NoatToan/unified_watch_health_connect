package qp2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ps2.n;
import ps2.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqp2/b;", "Landroidx/lifecycle/u1;", "Lps2/r;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f146028d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f146029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewFitPayTermsAndConditionActivity f146030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Boolean> f146031c;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f146028d = gt2.b.f79005a.h("PAY#FitPayTermsAndConditionsViewModel");
    }

    public b() {
        new y0();
        this.f146031c = new y0<>();
    }

    @Override // ps2.r
    public final void k4(hs2.b bVar) {
        bVar.getClass();
        this.f146031c.m(Boolean.valueOf(bVar == hs2.b.READY));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        n nVar = this.f146029a;
        if (nVar != null) {
            nVar.q(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqp2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
