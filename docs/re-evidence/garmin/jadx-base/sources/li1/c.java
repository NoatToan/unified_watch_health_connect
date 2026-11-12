package li1;

import c22.l3;
import c22.m3;
import f12.l;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import ns.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lli1/c;", "Lns/p;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DecimalFormat f112897i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l22.b f112898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112899h;

    static {
        new a(null);
        l3.f23124b.getClass();
        f112897i = l3.f23131i;
    }

    public /* synthetic */ c(l22.b bVar, boolean z14, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() : z14);
    }

    @Override // ns.p
    public final String h(String str, boolean z14) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f112898g, str);
        boolean z15 = this.f112899h;
        if (z15 && z14) {
            bVar.x();
            String lowerCase = bVar.f132238b.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        if (z15) {
            bVar.y();
            String lowerCase2 = bVar.f132238b.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return lowerCase2;
        }
        if (z14) {
            bVar.i();
            String lowerCase3 = bVar.f132238b.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            return lowerCase3;
        }
        bVar.g();
        String lowerCase4 = bVar.f132238b.toLowerCase(Locale.ROOT);
        lowerCase4.getClass();
        return lowerCase4;
    }

    @Override // ns.p
    public final m3 i() {
        return this.f112899h ? m3.METER : m3.FOOT;
    }

    @Override // ns.p
    public final boolean n(Double d14, m3 m3Var) {
        m3Var.getClass();
        if (d14 == null) {
            return false;
        }
        double dDoubleValue = d14.doubleValue();
        l3.f23124b.getClass();
        return new BigDecimal(String.valueOf(l3.a.g(dDoubleValue, m3.METER, m3Var))).setScale(1, f112897i.getRoundingMode()).doubleValue() == 1.0d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lli1/c$a;", "", "<init>", "()V", "Ljava/text/DecimalFormat;", "format", "Ljava/text/DecimalFormat;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l22.b bVar, boolean z14) {
        super(bVar, z14, false, f112897i, null, 20, null);
        bVar.getClass();
        this.f112898g = bVar;
        this.f112899h = z14;
    }
}
