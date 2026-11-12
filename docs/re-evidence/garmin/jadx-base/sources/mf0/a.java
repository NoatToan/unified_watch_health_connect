package mf0;

import o70.b;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmf0/a;", "Lr70/a;", "Lyz1/d;", "status", "Lgf0/a;", "ecgDto", "<init>", "(Lyz1/d;Lgf0/a;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f118290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf0.a f118291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f118292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f118293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f118294e;

    public a(d dVar, gf0.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f118290a = dVar;
        this.f118291b = aVar;
        this.f118292c = b.ECG;
        DateTime dateTimeK = aVar.k();
        this.f118293d = dateTimeK == null ? new DateTime() : dateTimeK;
        this.f118294e = aVar.getDetailId();
    }

    @Override // r70.s
    public final String a() {
        return this.f118292c.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF118293d() {
        return this.f118293d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF118294e() {
        return this.f118294e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getF118292c() {
        return this.f118292c;
    }
}
