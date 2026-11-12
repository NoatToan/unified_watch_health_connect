package defpackage;

import com.huawei.health.trusport_ee_jni.trusport_eeJNI;

/* JADX INFO: loaded from: classes32.dex */
public final class imk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final imk f37825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f37826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static imk[] f37827c;
    public static final imk d;
    public static final imk e;
    private final int f;
    private final String g;

    static {
        imk imkVar = new imk("TRUSPORT_EE_INTENSITY_LOW", trusport_eeJNI.TRUSPORT_EE_INTENSITY_LOW_get());
        d = imkVar;
        imk imkVar2 = new imk("TRUSPORT_EE_INTENSITY_MEDIUM");
        e = imkVar2;
        imk imkVar3 = new imk("TRUSPORT_EE_INTENSITY_HIGH");
        f37825a = imkVar3;
        f37827c = new imk[]{imkVar, imkVar2, imkVar3};
        f37826b = 0;
    }

    public final int a() {
        return this.f;
    }

    public String toString() {
        return this.g;
    }

    private imk(String str) {
        this.g = str;
        int i = f37826b;
        f37826b = i + 1;
        this.f = i;
    }

    private imk(String str, int i) {
        this.g = str;
        this.f = i;
        f37826b = i + 1;
    }
}
