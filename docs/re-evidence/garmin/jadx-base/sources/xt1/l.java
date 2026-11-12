package xt1;

import android.os.Parcelable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxt1/l;", "Liu1/h;", "Lxw1/c;", "", "athletePlanId", "trainingPlan", "Liu1/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLxw1/c;Liu1/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends iu1.h<xw1.c> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f192184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xw1.c f192185m;

    static {
        Parcelable.Creator<xw1.c> creator = xw1.c.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j8, xw1.c cVar, iu1.j jVar) {
        super(null, null, false, xw1.c.class, null, null, jVar, null, 183, null);
        cVar.getClass();
        jVar.getClass();
        this.f192184l = j8;
        this.f192185m = cVar;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).x(String.valueOf(this.f192184l), this.f192185m);
    }
}
