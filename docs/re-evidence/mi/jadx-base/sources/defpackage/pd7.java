package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class pd7 {
    public static String a(int i) {
        if (i == -5) {
            return "EcoApiConstants.RESULT_CANCELED";
        }
        if (i == -4) {
            return "EcoApiConstants.RESULT_BUSY";
        }
        if (i == -3) {
            return "EcoApiConstants.RESULT_DISCONNECTED";
        }
        if (i != -2) {
            return i != -1 ? "" : "EcoApiConstants.RESULT_TIMEOUT";
        }
        return "EcoApiConstants.RESULT_FAILED";
    }
}
