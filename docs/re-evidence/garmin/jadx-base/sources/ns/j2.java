package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/j2;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/j2$a;", "stressType", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/j2$a;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127672d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/j2$a;", "", "", "paramStringId", "labelStringId", "shortPostfixLabelId", "<init>", "(Ljava/lang/String;IIII)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Avg(R.string.param_avg_stress, R.string.allday_stress_average_stress, R.string.sleep_lbl_average_prefix),
        Max(R.string.param_max_stress, R.string.lbl_max_stress, R.string.common_max);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f127677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f127678c;

        a(int i14, int i15, int i16) {
            this.f127676a = i14;
            this.f127677b = i15;
            this.f127678c = i16;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l22.b bVar, a aVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127671c = bVar;
        this.f127672d = aVar;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strA = NumberFormat.getIntegerInstance().format(Integer.valueOf(MathKt.b(((Number) obj).doubleValue())));
        boolean zH = oe2.f.H(i14, 64);
        a aVar = this.f127672d;
        l22.b bVar = this.f127671c;
        if (zH) {
            if (aVar != null) {
                int i15 = aVar.f127676a;
                strA.getClass();
                strA = bVar.a(i15, strA);
            }
            strA.getClass();
            return strA;
        }
        if (!oe2.f.H(i14, 128)) {
            strA.getClass();
            return strA;
        }
        if (aVar != null) {
            String string = bVar.getString(aVar.f127678c);
            strA.getClass();
            strA = bVar.a(R.string.string_space_string_pattern, strA, string);
        }
        strA.getClass();
        return strA;
    }

    @Override // u00.b
    public final String d(int i14) {
        a aVar;
        l22.b bVar = this.f127671c;
        String string = bVar.getString(R.string.no_value);
        return (!oe2.f.H(i14, 64) || (aVar = this.f127672d) == null) ? string : bVar.a(aVar.f127676a, string);
    }

    @Override // u00.b
    public final String e(Double d14) {
        a aVar = this.f127672d;
        if (aVar == null) {
            return null;
        }
        return this.f127671c.getString(aVar.f127677b);
    }

    public /* synthetic */ j2(l22.b bVar, a aVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? new ms.r() : cVar);
    }
}
