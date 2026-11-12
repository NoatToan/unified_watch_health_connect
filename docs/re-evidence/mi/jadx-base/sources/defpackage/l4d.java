package defpackage;

import androidx.health.connect.client.records.metadata.DeviceTypes;

/* JADX INFO: loaded from: classes4.dex */
public class l4d {
    public static final l4d c = new l4d(DeviceTypes.UNKNOWN, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24633b;

    public interface a {
        l4d a(byte[] bArr, int i);

        int b();
    }

    public l4d(String str, String str2) {
        this.f24633b = str;
        this.f24632a = str2;
    }

    public String a() {
        return this.f24633b;
    }

    public String toString() {
        return a();
    }
}
