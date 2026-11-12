package me;

import androidx.window.extensions.WindowExtensionsProvider;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme/f;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f117961a = new f();

    static {
        s0.f105811a.b(f.class).D();
    }

    private f() {
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            c.f117954a.getClass();
            k kVar = k.STRICT;
            return 0;
        } catch (NullPointerException unused2) {
            c.f117954a.getClass();
            k kVar2 = k.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            c.f117954a.getClass();
            k kVar3 = k.STRICT;
            return 0;
        }
    }
}
