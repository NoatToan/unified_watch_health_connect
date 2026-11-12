package bs2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class kk implements lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<lk> f20263a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<LinkedList<jk>> f20264b = new ArrayList<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20265a;

        static {
            int[] iArr = new int[fb.values().length];
            f20265a = iArr;
            try {
                iArr[fb.BEGIN_DEPRECIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20265a[fb.END_DEPRECIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20265a[fb.CONSECUTIVE_DEPRECIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20265a[fb.END_ALL_DEPRECIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20265a[fb.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20265a[fb.STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20265a[fb.STOP_DISABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20265a[fb.STOP_ALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20265a[fb.STOP_DISABLE_ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20265a[fb.MARKER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public kk() {
        for (int i14 = 0; i14 < 256; i14++) {
            this.f20264b.add(new LinkedList<>());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[LOOP:0: B:26:0x0066->B:34:0x00ab, LOOP_START, PHI: r2
      0x0066: PHI (r2v12 int) = (r2v5 int), (r2v13 int) binds: [B:24:0x0061, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[LOOP:1: B:36:0x00be->B:44:0x0103, LOOP_START, PHI: r2
      0x00be: PHI (r2v10 int) = (r2v5 int), (r2v11 int) binds: [B:24:0x0061, B:44:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116 A[LOOP:2: B:46:0x0116->B:51:0x0141, LOOP_START, PHI: r2
      0x0116: PHI (r2v8 int) = (r2v5 int), (r2v9 int) binds: [B:24:0x0061, B:51:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144 A[LOOP:3: B:52:0x0144->B:60:0x0192, LOOP_START, PHI: r2
      0x0144: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:24:0x0061, B:60:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0150  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // bs2.lk
    public final void a(jk jkVar) {
        int i14;
        int i15;
        ArrayList<LinkedList<jk>> arrayList;
        jk jkVar2;
        l6 timestamp;
        jk jkVar3;
        l6 timestamp2;
        jk jkVar4;
        l6 timestamp3;
        jk jkVar5 = (jk) wb.c((bk) jkVar);
        short sShortValue = jkVar5.b() != null ? jkVar5.b().shortValue() : (short) 255;
        if (jkVar5.getEventType() == null) {
            return;
        }
        int[] iArr = a.f20265a;
        int i16 = iArr[jkVar5.getEventType().ordinal()];
        if (i16 == 1) {
            jkVar5.d(fb.START);
        } else {
            if (i16 != 2) {
                if (i16 == 3) {
                    jkVar5.d(fb.STOP);
                } else if (i16 == 4) {
                    jkVar5.d(fb.STOP_ALL);
                }
                i14 = iArr[jkVar5.getEventType().ordinal()];
                i15 = 0;
                arrayList = this.f20264b;
                switch (i14) {
                    case 5:
                        while (i15 < arrayList.get(sShortValue).size()) {
                            if (arrayList.get(sShortValue).get(i15).c() == jkVar5.c()) {
                                jkVar2 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                                timestamp = jkVar5.getTimestamp();
                                jkVar2.d(fb.STOP);
                                if (timestamp != null) {
                                    jkVar2.a(timestamp);
                                }
                                b(jkVar2);
                                arrayList.get(sShortValue).remove(i15);
                            }
                            i15++;
                        }
                        arrayList.get(sShortValue).add((jk) wb.c((bk) jkVar5));
                        break;
                    case 6:
                    case 7:
                        while (i15 < arrayList.get(sShortValue).size()) {
                            if (arrayList.get(sShortValue).get(i15).c() == jkVar5.c()) {
                                arrayList.get(sShortValue).remove(i15);
                            }
                            i15++;
                        }
                        break;
                    case 8:
                        while (i15 < arrayList.get(sShortValue).size()) {
                            if (arrayList.get(sShortValue).get(i15).c() != jkVar5.c()) {
                                jkVar3 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                                timestamp2 = jkVar5.getTimestamp();
                                jkVar3.d(fb.STOP);
                                if (timestamp2 != null) {
                                    jkVar3.a(timestamp2);
                                }
                                b(jkVar3);
                            }
                            i15++;
                        }
                        arrayList.get(sShortValue).clear();
                        jkVar5.d(fb.STOP);
                        break;
                    case 9:
                        while (i15 < arrayList.get(sShortValue).size()) {
                            if (arrayList.get(sShortValue).get(i15).c() != jkVar5.c()) {
                                jkVar4 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                                timestamp3 = jkVar5.getTimestamp();
                                jkVar4.d(fb.STOP_DISABLE);
                                if (timestamp3 != null) {
                                    jkVar4.a(timestamp3);
                                }
                                b(jkVar4);
                            }
                            i15++;
                        }
                        arrayList.get(sShortValue).clear();
                        jkVar5.d(fb.STOP_DISABLE);
                        break;
                }
                b(jkVar5);
            }
            jkVar5.d(fb.STOP);
        }
        sShortValue = 254;
        i14 = iArr[jkVar5.getEventType().ordinal()];
        i15 = 0;
        arrayList = this.f20264b;
        switch (i14) {
            case 5:
                while (i15 < arrayList.get(sShortValue).size()) {
                    if (arrayList.get(sShortValue).get(i15).c() == jkVar5.c()) {
                        jkVar2 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                        timestamp = jkVar5.getTimestamp();
                        jkVar2.d(fb.STOP);
                        if (timestamp != null) {
                            jkVar2.a(timestamp);
                        }
                        b(jkVar2);
                        arrayList.get(sShortValue).remove(i15);
                    }
                    i15++;
                }
                arrayList.get(sShortValue).add((jk) wb.c((bk) jkVar5));
                break;
            case 6:
            case 7:
                while (i15 < arrayList.get(sShortValue).size()) {
                    if (arrayList.get(sShortValue).get(i15).c() == jkVar5.c()) {
                        arrayList.get(sShortValue).remove(i15);
                    }
                    i15++;
                }
                break;
            case 8:
                while (i15 < arrayList.get(sShortValue).size()) {
                    if (arrayList.get(sShortValue).get(i15).c() != jkVar5.c()) {
                        jkVar3 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                        timestamp2 = jkVar5.getTimestamp();
                        jkVar3.d(fb.STOP);
                        if (timestamp2 != null) {
                            jkVar3.a(timestamp2);
                        }
                        b(jkVar3);
                    }
                    i15++;
                }
                arrayList.get(sShortValue).clear();
                jkVar5.d(fb.STOP);
                break;
            case 9:
                while (i15 < arrayList.get(sShortValue).size()) {
                    if (arrayList.get(sShortValue).get(i15).c() != jkVar5.c()) {
                        jkVar4 = (jk) wb.c((bk) arrayList.get(sShortValue).get(i15));
                        timestamp3 = jkVar5.getTimestamp();
                        jkVar4.d(fb.STOP_DISABLE);
                        if (timestamp3 != null) {
                            jkVar4.a(timestamp3);
                        }
                        b(jkVar4);
                    }
                    i15++;
                }
                arrayList.get(sShortValue).clear();
                jkVar5.d(fb.STOP_DISABLE);
                break;
        }
        b(jkVar5);
    }

    public final void b(jk jkVar) {
        Iterator<lk> it = this.f20263a.iterator();
        while (it.hasNext()) {
            it.next().a(jkVar);
        }
    }
}
