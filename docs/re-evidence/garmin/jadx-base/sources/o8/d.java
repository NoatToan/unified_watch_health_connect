package o8;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {122}, m = "insertRecords")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f130801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f130802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f130803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f130804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f130803c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130802b = obj;
        this.f130804d |= Integer.MIN_VALUE;
        return this.f130803c.e(null, this);
    }
}
