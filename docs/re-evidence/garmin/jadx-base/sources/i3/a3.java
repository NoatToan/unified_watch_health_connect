package i3;

import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/a3;", "", "Lj23/l;", "yearRange", "Li3/bc;", "selectableDates", "Ll3/k0;", "dateInputFormat", "Li3/l3;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Lj23/l;Li3/bc;Ll3/k0;Li3/l3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.l f87413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc f87414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3.k0 f87415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f87416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f87417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f87418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f87419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f87420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f87421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f87422j;

    public a3(j23.l lVar, bc bcVar, l3.k0 k0Var, l3 l3Var, String str, String str2, String str3, String str4) {
        this.f87413a = lVar;
        this.f87414b = bcVar;
        this.f87415c = k0Var;
        this.f87416d = l3Var;
        this.f87417e = str;
        this.f87418f = str2;
        this.f87419g = str3;
        this.f87420h = str4;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public final String a(l3.d0 d0Var, int i14, Locale locale) {
        Long l14;
        long jLongValue;
        if (d0Var == null) {
            String upperCase = this.f87415c.f109296a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.f87417e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i15 = d0Var.f109208a;
        long j8 = d0Var.f109211d;
        j23.l lVar = this.f87413a;
        if (!lVar.d(i15)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{j1.a(lVar.f96796a, 7, locale), j1.a(lVar.f96797b, 7, locale)}, 2);
            return String.format(this.f87418f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        bc bcVar = this.f87414b;
        bcVar.getClass();
        if (!bcVar.a(j8)) {
            Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.f87416d.b(Long.valueOf(j8), locale, false)}, 1);
            return String.format(this.f87419g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
        }
        o7.f89153b.getClass();
        if (i14 == o7.f89154c) {
            Long l15 = this.f87422j;
            if (j8 <= (l15 != null ? l15.longValue() : Long.MAX_VALUE)) {
                if (i14 == o7.f89155d) {
                    return "";
                }
                l14 = this.f87421i;
                if (l14 != null) {
                    jLongValue = l14.longValue();
                } else {
                    jLongValue = Long.MIN_VALUE;
                }
                if (j8 >= jLongValue) {
                    return "";
                }
            }
        } else {
            if (i14 == o7.f89155d) {
                return "";
            }
            l14 = this.f87421i;
            if (l14 != null) {
                jLongValue = l14.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            if (j8 >= jLongValue) {
                return "";
            }
        }
        return this.f87420h;
    }
}
