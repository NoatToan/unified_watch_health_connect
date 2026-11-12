package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pmb {
    public static String a(int i) {
        if (i == 0) {
            return i + ":NOISE CANCELLING";
        }
        if (i == 1) {
            return i + ":CLEAR";
        }
        if (i != 2) {
            return i + ":Not Support";
        }
        return i + ":OFF";
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return i + ":Host Found";
            case 2:
                return i + ":Active Headset Change";
            case 3:
                return i + ":Active Headset Lost";
            case 4:
                return i + ":Headset Property Changed";
            case 5:
                return i + ":Headset Name Changed";
            case 6:
                return i + ":Headset Volume Changed";
            case 7:
                return i + ":Headset Battery Changed";
            case 8:
                return i + ":Headset Mode Changed";
            default:
                return i + ":Unknown";
        }
    }
}
