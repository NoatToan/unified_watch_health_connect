package com.xiaomi.accountsdk.diagnosis;

/* JADX INFO: loaded from: classes6.dex */
public class DiagnosisLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DiagnosisLogInterface f10831a = new d();

    private DiagnosisLog() {
    }

    public static DiagnosisLogInterface get() {
        return f10831a;
    }

    public static void set(DiagnosisLogInterface diagnosisLogInterface) {
        f10831a = diagnosisLogInterface;
    }
}
