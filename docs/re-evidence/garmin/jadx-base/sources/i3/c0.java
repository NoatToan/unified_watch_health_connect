package i3;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/c0;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Lh4/r;", "modifier", "Lk6/u;", "properties", FirebaseAnalytics.Param.CONTENT, "<init>", "(Le23/a;Lh4/r;Lk6/u;Le23/p;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f87687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.r f87688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p004k6.u f87689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f87690d;

    public /* synthetic */ c0(e23.a aVar, h4.r rVar, p004k6.u uVar, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? h4.r.S : rVar, (i14 & 4) != 0 ? new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null) : uVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(e23.a<Unit> aVar, h4.r rVar, p004k6.u uVar, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f87687a = aVar;
        this.f87688b = rVar;
        this.f87689c = uVar;
        this.f87690d = pVar;
    }
}
