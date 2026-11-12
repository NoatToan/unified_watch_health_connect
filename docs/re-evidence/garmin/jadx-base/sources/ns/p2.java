package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/p2;", "Lu00/b;", "Lls/f;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p2 extends u00.b<ls.f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127728c;

    public /* synthetic */ p2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.f0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strS;
        ls.f fVar = (ls.f) obj;
        fVar.getClass();
        Double distance = fVar.getDistance();
        if (distance != null) {
            double percentage = (fVar.getPercentage() / 100.0d) * distance.doubleValue();
            c22.l3.a aVar = c22.l3.f23124b;
            DecimalFormat decimalFormat = c22.l3.f23129g;
            boolean isUsingMetric = fVar.getIsUsingMetric();
            aVar.getClass();
            strS = c22.l3.a.S(this.f127728c, percentage, decimalFormat, true, isUsingMetric);
        } else {
            strS = "";
        }
        c22.l3.f23124b.getClass();
        String str = c22.l3.f23131i.format(fVar.getPercentage());
        str.getClass();
        l22.b bVar = this.f127728c;
        String strA = bVar.a(R.string.lbl_value_percent, str);
        return strS.length() > 0 ? bVar.a(R.string.string_string_bracket_pattern, strA, strS) : strA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(l22.b bVar, u00.c<ls.f> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127728c = bVar;
    }
}
