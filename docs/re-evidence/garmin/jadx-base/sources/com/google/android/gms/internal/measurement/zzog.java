package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzog {
    public static String zza(zzlh zzlhVar) {
        StringBuilder sb3 = new StringBuilder(zzlhVar.zzc());
        for (int i14 = 0; i14 < zzlhVar.zzc(); i14++) {
            byte bZza = zzlhVar.zza(i14);
            if (bZza == 34) {
                sb3.append("\\\"");
            } else if (bZza == 39) {
                sb3.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((bZza >>> 6) & 3) + 48));
                            sb3.append((char) (((bZza >>> 3) & 7) + 48));
                            sb3.append((char) ((bZza & 7) + 48));
                        } else {
                            sb3.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }
}
