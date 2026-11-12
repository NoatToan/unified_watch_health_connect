package lo;

import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements r22.y1.d, r22.a2.d, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f113895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f113896c;

    public /* synthetic */ l(t tVar, String str, int i14) {
        this.f113894a = i14;
        this.f113895b = tVar;
        this.f113896c = str;
    }

    @Override // r22.y1.d
    public void c(Object obj) {
        boolean z14 = obj instanceof Boolean;
        t tVar = this.f113895b;
        String str = this.f113896c;
        if (z14) {
            tVar.f113949a.d1(str, ((Boolean) obj).booleanValue());
            tVar.w6();
        } else if (obj instanceof String) {
            tVar.f113949a.c1(str, (String) obj);
            tVar.w6();
        } else if (obj instanceof Double) {
            tVar.f113949a.e1(false, str, ((Double) obj).doubleValue());
            tVar.w6();
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        switch (this.f113894a) {
            case 1:
                int i17 = (i16 * 10) + (i15 * 1000) + (i14 * DateTimeConstants.MILLIS_PER_MINUTE);
                t tVar = this.f113895b;
                tVar.f113949a.e1(false, this.f113896c, i17);
                tVar.w6();
                break;
            default:
                int iD = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
                t tVar2 = this.f113895b;
                String str4 = this.f113896c;
                tVar2.f113949a.e1(false, str4, iD);
                if (str4.equals("calories")) {
                    tVar2.f113949a.d1("autoCalcCalories", false);
                    tVar2.f113949a.d1("autoCalcRestingCalories", false);
                }
                tVar2.w6();
                break;
        }
    }

    @Override // lo.i.a
    public void j(double d14) {
        t tVar = this.f113895b;
        tVar.f113949a.e1(false, this.f113896c, d14);
        tVar.w6();
    }
}
