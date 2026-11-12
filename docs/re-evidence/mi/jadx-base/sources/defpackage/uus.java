package defpackage;

import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class uus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f36171a;

    static {
        int[] iArr = new int[d.values().length];
        f36171a = iArr;
        try {
            iArr[d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f36171a[d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f36171a[d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f36171a[d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
