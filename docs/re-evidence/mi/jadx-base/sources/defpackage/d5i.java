package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d5i {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
