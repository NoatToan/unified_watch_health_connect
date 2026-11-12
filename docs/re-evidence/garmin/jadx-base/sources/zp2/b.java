package zp2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o53.l1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wd2.h0;
import yo2.h;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzp2/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f206600h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicReference<yo2.b> f206604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f206605e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<l1> f206601a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<h> f206602b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Double> f206603c = new y0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Boolean> f206606f = new y0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f206607g = new h0(this, 19);

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f206600h = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayUpdateDeviceViewModel");
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f206602b.k(this.f206607g);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lzp2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "POLL_INITIAL_DELAY_MILLIS", "J", "POLL_MAX_DELAY_MILLIS", "", "POLL_FACTOR_MILLIS", "D", "POLL_TIMEOUT_MILLIS", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
