package defpackage;

import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public class lqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25357b;

    public lqk(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("The resource content must not be null");
        }
        this.f25356a = str;
        this.f25357b = str2;
    }

    public String a() {
        return this.f25356a;
    }
}
