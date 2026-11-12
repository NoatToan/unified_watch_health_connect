package ks0;

import p005kotlin.Metadata;
import yr0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lks0/b;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f106379a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106380a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.BEFORE_TRAVEL_WESTWARD_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_WESTWARD_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.TRAVEL_DAY_WESTWARD_0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.DURING_FLIGHT_WESTWARD_0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.DURING_FLIGHT_WESTWARD_1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[h.DURING_TRAVEL_WESTWARD_0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_WESTWARD_1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_WESTWARD_1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[h.TRAVEL_DAY_WESTWARD_1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_DELAY_4.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[h.DURING_TRAVEL_WESTWARD_1.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_1.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_WESTWARD_2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_WESTWARD_2.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[h.TRAVEL_DAY_WESTWARD_2.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[h.DURING_FLIGHT_WESTWARD_2.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_2.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[h.DURING_FLIGHT_WESTWARD_3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_3.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[h.DURING_FLIGHT_WESTWARD_4.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_DELAY_4.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[h.DURING_FLIGHT_EASTWARD_4.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[h.DURING_TRAVEL_WESTWARD_2.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_2.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_2.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_2.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_4.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_2.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_WESTWARD_3.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_WESTWARD_3.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[h.TRAVEL_DAY_WESTWARD_3.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[h.TRAVEL_DAY_WESTWARD_4.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[h.DURING_TRAVEL_WESTWARD_3.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_3.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_3.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[h.TRAVEL_DAY_EASTWARD_3.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_3.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_WESTWARD_4.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_WESTWARD_4.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[h.DURING_TRAVEL_WESTWARD_4.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_DELAY_4.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_DELAY_4.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_DELAY_4.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_EASTWARD_4.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_EASTWARD_4.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[h.DURING_TRAVEL_EASTWARD_4.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[h.BEFORE_TRAVEL_SHORT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[h.BEFORE_NEXT_TRAVEL_SHORT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[h.TRAVEL_DAY_SHORT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[h.DURING_FLIGHT_SHORT.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[h.DURING_TRAVEL_SHORT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            f106380a = iArr;
        }
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f106379a = bVar;
    }
}
