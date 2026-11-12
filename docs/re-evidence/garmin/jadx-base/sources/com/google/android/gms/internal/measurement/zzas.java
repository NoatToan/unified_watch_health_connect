package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.pattern.parser.Parser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tn.k;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
        } else {
            h.s("StringValue cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        return e0.h(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02c3 A[PHI: r11
      0x02c3: PHI (r11v6 boolean) = (r11v12 boolean), (r11v13 boolean), (r11v16 boolean) binds: [B:100:0x02af, B:101:0x02b1, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        int i14;
        zzas zzasVar;
        int i15;
        int i16;
        boolean zIsEmpty;
        zzg zzgVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || Parser.REPLACE_CONVERTER_WORD.equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                h.s(k.g(str, " is not a String function"));
                return null;
            }
        }
        String strZzc = "undefined";
        z = false;
        boolean z14 = false;
        switch (str.hashCode()) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    zzh.zza("hasOwnProperty", 1, list);
                    String str3 = this.zza;
                    zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                    if ("length".equals(zzaoVarZza.zzc())) {
                        return zzao.zzk;
                    }
                    double dDoubleValue = zzaoVarZza.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i14 = (int) dDoubleValue) < 0 || i14 >= str3.length()) ? zzao.zzl : zzao.zzk;
                }
                h.s("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zza("toString", 0, list);
                    return this;
                }
                h.s("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.zza("toLocaleLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase());
                }
                h.s("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.zzc("charAt", 1, list);
                    int iZzi = list.isEmpty() ? 0 : (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    String str4 = this.zza;
                    return (iZzi < 0 || iZzi >= str4.length()) ? zzao.zzm : new zzas(String.valueOf(str4.charAt(iZzi)));
                }
                h.s("Command not supported");
                return null;
            case -1354795244:
                zzasVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder(zzasVar.zza);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            sb3.append(zzgVar.zza((zzao) list.get(i17)).zzc());
                        }
                        return new zzas(sb3.toString());
                    }
                    return zzasVar;
                }
                h.s("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                }
                h.s("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    zzh.zzc("search", 1, list);
                    Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                    return matcher.find() ? new zzah(Double.valueOf(matcher.start())) : new zzah(Double.valueOf(-1.0d));
                }
                h.s("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.zza("toLocaleUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase());
                }
                h.s("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzc("lastIndexOf", 2, list);
                    String str5 = this.zza;
                    String strZzc2 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    return new zzah(Double.valueOf(str5.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zzi(dDoubleValue2)))));
                }
                h.s("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                }
                h.s("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.trim());
                }
                h.s("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    zzh.zzc("match", 1, list);
                    Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                    return matcher2.find() ? new zzae(Arrays.asList(new zzas(matcher2.group()))) : zzao.zzg;
                }
                h.s("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzc("slice", 2, list);
                    String str6 = this.zza;
                    double dZzi = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dZzi < 0.0d ? Math.max(((double) str6.length()) + dZzi, 0.0d) : Math.min(dZzi, str6.length());
                    double dZzi2 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str6.length());
                    int i18 = (int) dMax;
                    return new zzas(str6.substring(i18, Math.max(0, ((int) (dZzi2 < 0.0d ? Math.max(((double) str6.length()) + dZzi2, 0.0d) : Math.min(dZzi2, str6.length()))) - i18) + i18));
                }
                h.s("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    zzh.zzc("split", 2, list);
                    String str7 = this.zza;
                    if (str7.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                        long jZzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                        if (jZzh == 0) {
                            return new zzae();
                        }
                        String[] strArrSplit = str7.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i16 = zIsEmpty;
                            z14 = zIsEmpty;
                            i15 = length;
                            i16 = z14;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i15 = length - 1;
                            if (!strArrSplit[i15].isEmpty()) {
                                i16 = zIsEmpty;
                                z14 = zIsEmpty;
                                i15 = length;
                                i16 = z14;
                            }
                        }
                        i16 = zIsEmpty;
                        z14 = zIsEmpty;
                        if (length > jZzh) {
                            i15--;
                        }
                        while (i16 < i15) {
                            arrayList.add(new zzas(strArrSplit[i16]));
                            i16++;
                        }
                    }
                    return new zzae(arrayList);
                }
                h.s("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    zzh.zzc("substring", 2, list);
                    String str8 = this.zza;
                    int iZzi2 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                    int iZzi3 = list.size() > 1 ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : str8.length();
                    int iMin = Math.min(Math.max(iZzi2, 0), str8.length());
                    int iMin2 = Math.min(Math.max(iZzi3, 0), str8.length());
                    return new zzas(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                h.s("Command not supported");
                return null;
            case 1094496948:
                zzasVar = this;
                if (str.equals(Parser.REPLACE_CONVERTER_WORD)) {
                    zzh.zzc(Parser.REPLACE_CONVERTER_WORD, 2, list);
                    zzao zzaoVarZza2 = zzao.zzf;
                    if (!list.isEmpty()) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                        }
                    }
                    String str9 = strZzc;
                    String str10 = zzasVar.zza;
                    int iIndexOf = str10.indexOf(str9);
                    if (iIndexOf >= 0) {
                        if (zzaoVarZza2 instanceof zzai) {
                            zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str9), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                        }
                        String strSubstring = str10.substring(0, iIndexOf);
                        String strZzc4 = zzaoVarZza2.zzc();
                        String strSubstring2 = str10.substring(str9.length() + iIndexOf);
                        return new zzas(e0.h(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                    }
                    return zzasVar;
                }
                h.s("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzc("indexOf", 2, list);
                    String str11 = this.zza;
                    if (list.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        strZzc = zzgVar2.zza((zzao) list.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str11.indexOf(strZzc, (int) zzh.zzi(list.size() < 2 ? 0.0d : zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()))));
                }
            default:
                h.s("Command not supported");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
