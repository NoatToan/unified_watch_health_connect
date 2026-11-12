package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzoa;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class j4 extends k4 {
    private final com.google.android.gms.internal.measurement.zzej g;
    public final /* synthetic */ m4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(m4 m4Var, String str, int i, com.google.android.gms.internal.measurement.zzej zzejVar) {
        super(str, i);
        this.h = m4Var;
        this.g = zzejVar;
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final int a() {
        return this.g.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean b() {
        return this.g.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:109:0x030e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0314  */
    /* JADX WARN: Code duplicated, block: B:113:0x031c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0328  */
    /* JADX WARN: Code duplicated, block: B:122:0x0389 A[EDGE_INSN: B:122:0x0389->B:125:0x03e1 BREAK  A[LOOP:0: B:41:0x0122->B:46:0x0157]] */
    /* JADX WARN: Code duplicated, block: B:123:0x03b5 A[EDGE_INSN: B:123:0x03b5->B:125:0x03e1 BREAK  A[LOOP:0: B:41:0x0122->B:46:0x0157]] */
    /* JADX WARN: Code duplicated, block: B:158:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x03e1 A[EDGE_INSN: B:176:0x03e1->B:125:0x03e1 BREAK  A[LOOP:0: B:41:0x0122->B:46:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x03e1 A[EDGE_INSN: B:179:0x03e1->B:125:0x03e1 BREAK  A[LOOP:0: B:41:0x0122->B:46:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x03e1 A[EDGE_INSN: B:187:0x03e1->B:125:0x03e1 BREAK  A[LOOP:0: B:41:0x0122->B:46:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x0157 A[LOOP:0: B:41:0x0122->B:46:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x0192  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0221  */
    /* JADX WARN: Code duplicated, block: B:82:0x024b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0284  */
    /* JADX WARN: Code duplicated, block: B:90:0x0296  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d5  */
    public final boolean k(Long l, Long l2, zzfo zzfoVar, long j, g gVar, boolean z) {
        HashSet hashSet;
        Iterator<com.google.android.gms.internal.measurement.zzel> it2;
        ArrayMap arrayMap;
        Iterator<com.google.android.gms.internal.measurement.zzfs> it3;
        Iterator<com.google.android.gms.internal.measurement.zzel> it4;
        com.google.android.gms.internal.measurement.zzel next;
        boolean z2;
        String strZze;
        Object obj;
        Boolean boolH;
        Boolean boolG;
        String str;
        Boolean boolI;
        com.google.android.gms.internal.measurement.zzfs next2;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzel next3;
        zzoa.zzc();
        boolean zZzs = this.h.zzs.zzf().zzs(this.a, zzdy.zzY);
        long j2 = this.g.zzn() ? gVar.e : j;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.h.zzs.zzay().zzq(), 2)) {
            this.h.zzs.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.b), this.g.zzp() ? Integer.valueOf(this.g.zzb()) : null, this.h.zzs.zzj().zzd(this.g.zzg()));
            this.h.zzs.zzay().zzj().zzb("Filter definition", this.h.zzf.zzu().u(this.g));
        }
        if (!this.g.zzp() || this.g.zzb() > 256) {
            this.h.zzs.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzel.zzn(this.a), String.valueOf(this.g.zzp() ? Integer.valueOf(this.g.zzb()) : null));
            return false;
        }
        boolean z3 = this.g.zzk() || this.g.zzm() || this.g.zzn();
        if (z && !z3) {
            this.h.zzs.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.zzp() ? Integer.valueOf(this.g.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzej zzejVar = this.g;
        String strZzh = zzfoVar.zzh();
        if (!zzejVar.zzo()) {
            hashSet = new HashSet();
            it2 = zzejVar.zzh().iterator();
            while (true) {
                if (it2.hasNext()) {
                    arrayMap = new ArrayMap();
                    it3 = zzfoVar.zzi().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            it4 = zzejVar.zzh().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                next = it4.next();
                                if (next.zzh() || !next.zzg()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                strZze = next.zze();
                                if (strZze.isEmpty()) {
                                    obj = arrayMap.get(strZze);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                if (obj == null) {
                                                    this.h.zzs.zzay().zzk().zzc("Unknown param type. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                this.h.zzs.zzay().zzj().zzc("Missing param for filter. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (next.zzk()) {
                                                if (next.zzi()) {
                                                    this.h.zzs.zzay().zzk().zzc("No filter for String param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (zzku.E(str)) {
                                                    this.h.zzs.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                boolI = k4.i(str, next.zzc());
                                            } else {
                                                boolI = k4.f((String) obj, next.zzd(), this.h.zzs.zzay());
                                            }
                                            if (boolI != null) {
                                                break;
                                            }
                                            if (boolI.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (next.zzi()) {
                                                this.h.zzs.zzay().zzk().zzc("No number filter for double param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                break;
                                            }
                                            boolG = k4.g(((Double) obj).doubleValue(), next.zzc());
                                            if (boolG != null) {
                                                break;
                                            }
                                            if (boolG.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (next.zzi()) {
                                            this.h.zzs.zzay().zzk().zzc("No number filter for long param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                            break;
                                        }
                                        boolH = k4.h(((Long) obj).longValue(), next.zzc());
                                        if (boolH != null) {
                                            break;
                                        }
                                        if (boolH.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    this.h.zzs.zzay().zzk().zzb("Event has empty param name. event", this.h.zzs.zzj().zzd(strZzh));
                                    break;
                                }
                            }
                        } else {
                            next2 = it3.next();
                            if (!hashSet.contains(next2.zzg())) {
                                if (next2.zzw()) {
                                    if (next2.zzu()) {
                                        if (next2.zzy()) {
                                            this.h.zzs.zzay().zzk().zzc("Unknown value for param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(next2.zzg()));
                                            break;
                                        }
                                        arrayMap.put(next2.zzg(), next2.zzh());
                                    } else {
                                        String strZzg = next2.zzg();
                                        if (next2.zzu()) {
                                            dValueOf = Double.valueOf(next2.zza());
                                        } else {
                                            dValueOf = null;
                                        }
                                        arrayMap.put(strZzg, dValueOf);
                                    }
                                } else {
                                    String strZzg2 = next2.zzg();
                                    if (next2.zzw()) {
                                        lValueOf = Long.valueOf(next2.zzd());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(strZzg2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    next3 = it2.next();
                    if (next3.zze().isEmpty()) {
                        this.h.zzs.zzay().zzk().zzb("null or empty param name in filter. event", this.h.zzs.zzj().zzd(strZzh));
                        break;
                    }
                    hashSet.add(next3.zze());
                }
            }
        } else {
            Boolean boolH2 = k4.h(j2, zzejVar.zzf());
            if (boolH2 != null) {
                if (boolH2.booleanValue()) {
                    hashSet = new HashSet();
                    it2 = zzejVar.zzh().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            arrayMap = new ArrayMap();
                            it3 = zzfoVar.zzi().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    it4 = zzejVar.zzh().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        next = it4.next();
                                        if (next.zzh()) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        strZze = next.zze();
                                        if (strZze.isEmpty()) {
                                            obj = arrayMap.get(strZze);
                                            if (obj instanceof Long) {
                                                if (obj instanceof Double) {
                                                    if (obj instanceof String) {
                                                        if (obj == null) {
                                                            this.h.zzs.zzay().zzk().zzc("Unknown param type. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        this.h.zzs.zzay().zzj().zzc("Missing param for filter. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (next.zzk()) {
                                                        if (next.zzi()) {
                                                            this.h.zzs.zzay().zzk().zzc("No filter for String param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        str = (String) obj;
                                                        if (zzku.E(str)) {
                                                            this.h.zzs.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        boolI = k4.i(str, next.zzc());
                                                    } else {
                                                        boolI = k4.f((String) obj, next.zzd(), this.h.zzs.zzay());
                                                    }
                                                    if (boolI != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolI.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (next.zzi()) {
                                                    boolG = k4.g(((Double) obj).doubleValue(), next.zzc());
                                                    if (boolG != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolG.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    this.h.zzs.zzay().zzk().zzc("No number filter for double param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                            } else if (next.zzi()) {
                                                boolH = k4.h(((Long) obj).longValue(), next.zzc());
                                                if (boolH != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolH.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                this.h.zzs.zzay().zzk().zzc("No number filter for long param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(strZze));
                                                break;
                                            }
                                        } else {
                                            this.h.zzs.zzay().zzk().zzb("Event has empty param name. event", this.h.zzs.zzj().zzd(strZzh));
                                            break;
                                        }
                                    }
                                } else {
                                    next2 = it3.next();
                                    if (!hashSet.contains(next2.zzg())) {
                                        if (next2.zzw()) {
                                            if (next2.zzu()) {
                                                if (next2.zzy()) {
                                                    this.h.zzs.zzay().zzk().zzc("Unknown value for param. event, param", this.h.zzs.zzj().zzd(strZzh), this.h.zzs.zzj().zze(next2.zzg()));
                                                    break;
                                                }
                                                arrayMap.put(next2.zzg(), next2.zzh());
                                            } else {
                                                String strZzg3 = next2.zzg();
                                                if (next2.zzu()) {
                                                    dValueOf = Double.valueOf(next2.zza());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                arrayMap.put(strZzg3, dValueOf);
                                            }
                                        } else {
                                            String strZzg4 = next2.zzg();
                                            if (next2.zzw()) {
                                                lValueOf = Long.valueOf(next2.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(strZzg4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            next3 = it2.next();
                            if (next3.zze().isEmpty()) {
                                this.h.zzs.zzay().zzk().zzb("null or empty param name in filter. event", this.h.zzs.zzj().zzd(strZzh));
                                break;
                            }
                            hashSet.add(next3.zze());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        this.h.zzs.zzay().zzj().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (z3 && zzfoVar.zzu()) {
            Long lValueOf2 = Long.valueOf(zzfoVar.zzd());
            if (this.g.zzm()) {
                if (zZzs && this.g.zzo()) {
                    lValueOf2 = l;
                }
                this.f = lValueOf2;
            } else {
                if (zZzs && this.g.zzo()) {
                    lValueOf2 = l2;
                }
                this.e = lValueOf2;
            }
        }
        return true;
    }
}
