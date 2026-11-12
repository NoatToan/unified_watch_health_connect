package xt1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fu1.q;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxt1/m;", "Liu1/h;", "Lfu1/q;", "", "athletePlanId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "language", "Liu1/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Liu1/i;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends iu1.h<q> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f192186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f192187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f192188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f192189o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j8, DateTime dateTime, DateTime dateTime2, String str, iu1.i<? super q> iVar) {
        super(null, null, false, q.class, null, iVar, null, null, 215, null);
        dateTime.getClass();
        dateTime2.getClass();
        str.getClass();
        iVar.getClass();
        this.f192186l = j8;
        this.f192187m = str;
        this.f192188n = dateTime.toString("yyyy-MM-dd");
        this.f192189o = dateTime2.toString("yyyy-MM-dd");
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        gu1.a aVar = (gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120);
        String str = this.f192188n;
        str.getClass();
        String str2 = this.f192189o;
        str2.getClass();
        return aVar.q(this.f192186l, str, str2, this.f192187m);
    }
}
