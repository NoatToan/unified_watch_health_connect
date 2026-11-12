package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class k8q {
    public static UUID a(int i) {
        return UUID.fromString(String.format("0000%04x-0000-1000-8000-00805f9b34fb", Integer.valueOf(i)));
    }
}
