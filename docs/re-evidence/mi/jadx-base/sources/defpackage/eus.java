package defpackage;

import com.xiaomi.push.service.bg;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class eus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17086a;

    static {
        int[] iArr = new int[bg.c.values().length];
        f17086a = iArr;
        try {
            iArr[bg.c.unbind.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17086a[bg.c.binding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17086a[bg.c.binded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
