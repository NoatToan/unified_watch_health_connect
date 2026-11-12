package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class h5i implements x8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19718b;
    public final int c;
    public final ReadableMap d;
    public final bdo e;
    public final g9p f;
    public final boolean g;

    public h5i(g9p g9pVar, int i, int i2, String str, ReadableMap readableMap, bdo bdoVar, boolean z) {
        this.f = g9pVar;
        this.f19717a = str;
        this.f19718b = i;
        this.d = readableMap;
        this.e = bdoVar;
        this.c = i2;
        this.g = z;
    }

    @Override // defpackage.x8g
    public void a(y8g y8gVar) {
        if (lm8.s) {
            cm8.b(lm8.f25208r, "Executing pre-allocation of: " + toString());
        }
        throw null;
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.c + "] - component: " + this.f19717a + " rootTag: " + this.f19718b + " isLayoutable: " + this.g + " props: " + this.d;
    }
}
