package defpackage;

import com.xiaomi.push.ih;
import com.xiaomi.push.ii;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class cbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5173b;

    static {
        int[] iArr = new int[ii.values().length];
        f5173b = iArr;
        try {
            iArr[ii.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5173b[ii.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5173b[ii.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5173b[ii.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ih.values().length];
        f5172a = iArr2;
        try {
            iArr2[ih.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5172a[ih.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
