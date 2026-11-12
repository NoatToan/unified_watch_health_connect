package yl2;

import lm2.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyl2/a;", "Llm2/i$a;", "", "deviceId", "", "mac", "<init>", "(JLjava/lang/String;)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f197655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197656b;

    public /* synthetic */ a(long j8, String str, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str);
    }

    @Override // lm2.i.a
    public final byte[] b() {
        return null;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF197655a() {
        return this.f197655a;
    }

    @Override // lm2.i.a
    public final String f() {
        return null;
    }

    @Override // lm2.i.a
    public final bm2.d getDeviceInfo() {
        return null;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: getMacAddress, reason: from getter */
    public final String getF197656b() {
        return this.f197656b;
    }

    public a(long j8, String str) {
        this.f197655a = j8;
        this.f197656b = str;
    }
}
