package defpackage;

import com.huawei.health.trusport_ee_jni.trusport_eeJNI;

/* JADX INFO: loaded from: classes32.dex */
public final class imo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final imo f37837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f37838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final imo f37839c;
    private static imo[] d;
    public static final imo e;
    private final int g;
    private final String j;

    static {
        imo imoVar = new imo("TRUSPORT_EE_SEX_MALE", trusport_eeJNI.TRUSPORT_EE_SEX_MALE_get());
        f37837a = imoVar;
        imo imoVar2 = new imo("TRUSPORT_EE_SEX_FEMALE");
        f37839c = imoVar2;
        imo imoVar3 = new imo("TRUSPORT_EE_SEX_UNKNOWN");
        e = imoVar3;
        d = new imo[]{imoVar, imoVar2, imoVar3};
        f37838b = 0;
    }

    public final int d() {
        return this.g;
    }

    public String toString() {
        return this.j;
    }

    private imo(String str) {
        this.j = str;
        int i = f37838b;
        f37838b = i + 1;
        this.g = i;
    }

    private imo(String str, int i) {
        this.j = str;
        this.g = i;
        f37838b = i + 1;
    }
}
