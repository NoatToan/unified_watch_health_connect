package ss;

import android.content.Context;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lss/f;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f160597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f160598b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<f12.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f160599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f160600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f160601c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f160599a = koinComponent;
            this.f160600b = qualifier;
            this.f160601c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f12.l, java.lang.Object] */
        @Override // e23.a
        public final f12.l invoke() {
            KoinComponent koinComponent = this.f160599a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(f12.l.class), this.f160600b, this.f160601c);
        }
    }

    static {
        f fVar = new f();
        f160597a = fVar;
        f160598b = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new a(fVar, null, null));
    }

    private f() {
    }

    public static final double a(Long l14) {
        Double dB = b(l14);
        return f(dB != null ? dB.doubleValue() : 0.0d);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    public static final Double b(Long l14) {
        if (l14 == null) {
            return null;
        }
        if (u.z(new Long[]{-1L, -2L}, l14)) {
            return Double.valueOf(l14.longValue());
        }
        f160597a.getClass();
        if (((f12.l) f160598b.getValue()).y()) {
            l3.a aVar = l3.f23124b;
            double dLongValue = l14.longValue();
            aVar.getClass();
            return Double.valueOf(l3.a.P1(dLongValue));
        }
        l3.a aVar2 = l3.f23124b;
        double dLongValue2 = l14.longValue();
        aVar2.getClass();
        return Double.valueOf(dLongValue2 / 453.592d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
    public static final long c(double d14) {
        double d15;
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        f160597a.getClass();
        ?? r14 = f160598b;
        double d16 = ((f12.l) r14.getValue()).y() ? 453.5d : 999.5d;
        if (d14 > d16) {
            d14 = d16;
        }
        if (((f12.l) r14.getValue()).y()) {
            l3.f23124b.getClass();
            d15 = 1000;
        } else {
            l3.f23124b.getClass();
            d15 = 453.592d;
        }
        return MathKt.d(d14 * d15);
    }

    public static final Object d(Double d14, boolean z14, boolean z15) {
        if (z14) {
            return Integer.valueOf(R.string.strength_training_body);
        }
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            return Integer.valueOf(R.string.symbol_double_dash);
        }
        if (z15) {
            l3.f23124b.getClass();
            return l3.f23130h.format(d14.doubleValue());
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public static final String e(Context context, Double d14, boolean z14, boolean z15) {
        context.getClass();
        Object objD = d(d14, z14, z15);
        if (objD instanceof Integer) {
            String string = context.getString(((Number) objD).intValue());
            string.getClass();
            return string;
        }
        if (objD instanceof String) {
            return (String) objD;
        }
        String string2 = context.getString(R.string.symbol_double_dash);
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, o13.l] */
    public static final double f(double d14) {
        if (u.z(new Double[]{Double.valueOf(-1.0d), Double.valueOf(-2.0d)}, Double.valueOf(d14))) {
            return d14;
        }
        l3.f23124b.getClass();
        double dV1 = l3.a.V1(d14);
        f160597a.getClass();
        double d15 = ((f12.l) f160598b.getValue()).y() ? 453.5d : 999.5d;
        if (dV1 > d15) {
            dV1 = d15;
        }
        if (dV1 < 0.0d) {
            return 0.0d;
        }
        return dV1;
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
