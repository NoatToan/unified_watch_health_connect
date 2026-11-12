package zm2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import xm2.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f205356a = UUID.fromString("6A4E2500-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f205357b = UUID.fromString("6A4E2501-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f205358c = UUID.fromString("6A4E2502-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f205359d = UUID.fromString("6A4E2503-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UUID f205360e = UUID.fromString("6A4E2504-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UUID f205361f = UUID.fromString("6A4E2505-667B-11E3-949A-0800200C9A66");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final UUID f205362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final UUID f205363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final UUID f205364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final UUID f205365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final UUID f205366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f205367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f205368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f205369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f205370o;

    /* JADX INFO: renamed from: zm2.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C3838a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205371a;

        static {
            int[] iArr = new int[h.values().length];
            f205371a = iArr;
            try {
                iArr[h.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f205371a[h.HEART_RATE_VARIABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f205371a[h.CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f205371a[h.ASCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f205371a[h.INTENSITY_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f205371a[h.HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f205371a[h.STRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f205371a[h.ACCELEROMETER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f205371a[h.SPO2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f205371a[h.BODY_BATTERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        UUID.fromString("6A4E2506-667B-11E3-949A-0800200C9A66");
        f205362g = UUID.fromString("6A4E2507-667B-11E3-949A-0800200C9A66");
        f205363h = UUID.fromString("6A4E2508-667B-11E3-949A-0800200C9A66");
        f205364i = UUID.fromString("6A4E2509-667B-11E3-949A-0800200C9A66");
        f205365j = UUID.fromString("6A4E250C-667B-11E3-949A-0800200C9A66");
        f205366k = UUID.fromString("6A4E250D-667B-11E3-949A-0800200C9A66");
        f205367l = 9486;
        h[] hVarArrValues = h.values();
        f205368m = new HashMap(hVarArrValues.length);
        f205369n = new HashMap(hVarArrValues.length);
        f205370o = new HashMap(hVarArrValues.length);
        for (h hVar : hVarArrValues) {
            f205370o.put(Integer.valueOf(hVar.f191549a), hVar);
            switch (C3838a.f205371a[hVar.ordinal()]) {
                case 1:
                    f205368m.put(hVar, f205358c);
                    break;
                case 2:
                    f205368m.put(hVar, f205362g);
                    break;
                case 3:
                    f205368m.put(hVar, f205359d);
                    break;
                case 4:
                    f205368m.put(hVar, f205360e);
                    break;
                case 5:
                    f205368m.put(hVar, f205361f);
                    break;
                case 6:
                    f205368m.put(hVar, f205357b);
                    break;
                case 7:
                    f205368m.put(hVar, f205363h);
                    break;
                case 8:
                    f205368m.put(hVar, f205364i);
                    break;
                case 9:
                    f205368m.put(hVar, f205365j);
                    break;
                case 10:
                    f205368m.put(hVar, f205366k);
                    break;
                default:
                    HashMap map = f205368m;
                    StringBuilder sb3 = new StringBuilder("6A4E");
                    int i14 = f205367l;
                    sb3.append(Integer.toHexString(i14));
                    sb3.append("-667B-11E3-949A-0800200C9A66");
                    map.put(hVar, UUID.fromString(sb3.toString()));
                    f205367l = i14 + 1;
                    break;
            }
        }
        for (Map.Entry entry : f205368m.entrySet()) {
            f205369n.put((UUID) entry.getValue(), (h) entry.getKey());
        }
    }
}
