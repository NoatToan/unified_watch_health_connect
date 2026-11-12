package defpackage;

import org.joda.time.DateTime;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes3.dex */
public class elo extends i00 implements acd, flh, s67, vqh, sfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final elo f16786a = new elo();

    @Override // defpackage.vqh
    public void d(fgj fgjVar, Object obj, bw3 bw3Var) {
        String str = (String) obj;
        yqh yqhVarA = txc.a();
        fgjVar.clear();
        int iF = yqhVarA.f(fgjVar, str, 0);
        if (iF < str.length()) {
            if (iF < 0) {
                yqhVarA.j(fgjVar.getPeriodType()).g(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return String.class;
    }

    @Override // defpackage.s67
    public long f(Object obj) {
        long j;
        long j2;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i = length - 1;
            if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                String strSubstring = str.substring(2, i);
                int i2 = 0;
                int i3 = -1;
                for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                    if (strSubstring.charAt(i4) < '0' || strSubstring.charAt(i4) > '9') {
                        if (i4 == 0 && strSubstring.charAt(0) == '-') {
                            i2 = 1;
                        } else {
                            if (i4 <= i2 || strSubstring.charAt(i4) != '.' || i3 != -1) {
                                throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                            }
                            i3 = i4;
                        }
                    }
                }
                if (i3 > 0) {
                    j2 = Long.parseLong(strSubstring.substring(i2, i3));
                    String strSubstring2 = strSubstring.substring(i3 + 1);
                    if (strSubstring2.length() != 3) {
                        strSubstring2 = (strSubstring2 + "000").substring(0, 3);
                    }
                    j = Integer.parseInt(strSubstring2);
                } else {
                    long j3 = i2 != 0 ? Long.parseLong(strSubstring.substring(i2, strSubstring.length())) : Long.parseLong(strSubstring);
                    j = 0;
                    j2 = j3;
                }
                return i2 != 0 ? fl9.e(fl9.i(-j2, 1000), -j) : fl9.e(fl9.i(j2, 1000), j);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    @Override // defpackage.i00, defpackage.acd
    public long i(Object obj, bw3 bw3Var) {
        return sxc.i().u(bw3Var).j((String) obj);
    }

    @Override // defpackage.sfd
    public void j(egj egjVar, Object obj, bw3 bw3Var) {
        Period periodH;
        long jAdd;
        long jAdd2;
        String str = (String) obj;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        jq5 jq5VarU = sxc.i().u(bw3Var);
        yqh yqhVarA = txc.a();
        char cCharAt = strSubstring.charAt(0);
        bw3 chronology = null;
        if (cCharAt == 'P' || cCharAt == 'p') {
            periodH = yqhVarA.j(g(strSubstring)).h(strSubstring);
            jAdd = 0;
        } else {
            DateTime dateTimeF = jq5VarU.f(strSubstring);
            jAdd = dateTimeF.getMillis();
            chronology = dateTimeF.getChronology();
            periodH = null;
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTimeF2 = jq5VarU.f(strSubstring2);
            jAdd2 = dateTimeF2.getMillis();
            if (chronology == null) {
                chronology = dateTimeF2.getChronology();
            }
            if (bw3Var != null) {
                chronology = bw3Var;
            }
            if (periodH != null) {
                jAdd = chronology.add(periodH, jAdd2, -1);
            }
        } else {
            if (periodH != null) {
                throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            Period periodH2 = yqhVarA.j(g(strSubstring2)).h(strSubstring2);
            if (bw3Var != null) {
                chronology = bw3Var;
            }
            jAdd2 = chronology.add(periodH2, jAdd, 1);
        }
        egjVar.setInterval(jAdd, jAdd2);
        egjVar.setChronology(chronology);
    }

    @Override // defpackage.i00, defpackage.flh
    public int[] k(ogj ogjVar, Object obj, bw3 bw3Var, jq5 jq5Var) {
        if (jq5Var.e() != null) {
            bw3Var = bw3Var.withZone(jq5Var.e());
        }
        return bw3Var.get(ogjVar, jq5Var.u(bw3Var).j((String) obj));
    }
}
