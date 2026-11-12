package com.xiaomi.accountsdk.diagnosis;

/* JADX INFO: loaded from: classes18.dex */
public class DiagnosisLog {
    private static DiagnosisLogInterface a = new d();

    private DiagnosisLog() {
    }

    public static DiagnosisLogInterface get() {
        return a;
    }

    public static void set(DiagnosisLogInterface diagnosisLogInterface) {
        a = diagnosisLogInterface;
    }
}
