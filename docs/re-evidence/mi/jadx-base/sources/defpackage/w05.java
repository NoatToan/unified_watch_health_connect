package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class w05 implements x8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37408b;
    public final int c;
    public final g9p d;
    public final ReadableMap e;
    public final bdo f;
    public final boolean g;

    public w05(g9p g9pVar, int i, int i2, String str, ReadableMap readableMap, bdo bdoVar, boolean z) {
        this.d = g9pVar;
        this.f37407a = str;
        this.f37408b = i;
        this.c = i2;
        this.e = readableMap;
        this.f = bdoVar;
        this.g = z;
    }

    @Override // defpackage.x8g
    public void a(y8g y8gVar) {
        throw null;
    }

    public String toString() {
        return "CreateMountItem [" + this.c + "] - component: " + this.f37407a + " - rootTag: " + this.f37408b + " - isLayoutable: " + this.g;
    }
}
