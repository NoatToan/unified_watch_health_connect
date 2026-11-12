package defpackage;

import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.wear.api.WearApiCall;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w6r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f37672b;
    public final WearApiCall c;
    public final boolean d;
    public final int e;
    public final String f;
    public me4 g;
    public WearApiTask h;
    public volatile boolean i;

    public w6r(String str, byte[] bArr, boolean z, WearApiCall wearApiCall, int i, String str2) {
        this.f37671a = str;
        this.f37672b = bArr;
        this.d = z;
        this.c = wearApiCall;
        this.e = i;
        this.f = str2;
    }

    public void a() {
        this.i = true;
        WearApiTask wearApiTask = this.h;
        if (wearApiTask != null) {
            wearApiTask.cancel();
            this.h = null;
        }
    }

    public final boolean b() {
        return this.i;
    }

    public void c(me4 me4Var) {
        this.g = me4Var;
    }
}
