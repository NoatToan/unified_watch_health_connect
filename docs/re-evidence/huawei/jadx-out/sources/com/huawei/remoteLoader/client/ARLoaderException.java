package com.huawei.remoteLoader.client;

/* JADX INFO: loaded from: classes42.dex */
public class ARLoaderException extends Exception {
    public static final int ERROR_PACKAGE_NOT_AVAILABLE = 1;
    public static final int ERROR_PACKAGE_OBSOLETE = 2;
    private static final long serialVersionUID = -2628796958218702209L;
    private final int errorCode;

    @Override // java.lang.Throwable
    public String toString() {
        String strErrorCodeToString = errorCodeToString(this.errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(strErrorCodeToString).length() + 17);
        sb.append("LoaderException{");
        sb.append(strErrorCodeToString);
        sb.append("}");
        return sb.toString();
    }

    private static String errorCodeToString(int i) {
        if (i != 1) {
            return i != 2 ? "Unknown error" : "Package obsolete";
        }
        return "Package not available";
    }

    public ARLoaderException(int i) {
        this.errorCode = i;
    }
}
