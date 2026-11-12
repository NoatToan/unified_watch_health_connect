package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class jxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f23230b = new AtomicInteger(0);
    public YRNBundleInfo c;

    public int a() {
        return this.f23230b.decrementAndGet();
    }

    public YRNBundleInfo b() {
        return this.c;
    }

    public int c() {
        return this.f23230b.get();
    }

    public void d() {
        this.f23230b.incrementAndGet();
    }

    public boolean e() {
        return this.f23229a;
    }

    public void f(boolean z) {
        this.f23229a = z;
    }

    public String toString() {
        return "YRNInstanceInfo{dirty=" + this.f23229a + ", count=" + this.f23230b + ", bundleInfo=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
