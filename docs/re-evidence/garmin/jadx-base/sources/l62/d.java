package l62;

import androidx.lifecycle.u1;
import j53.l;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll62/d;", "Landroidx/lifecycle/u1;", "Lo52/e;", "workoutDelegate", "<init>", "(Lo52/e;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o52.e f110544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f110545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f110546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f110547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f110548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f110549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f110550g;

    public d(o52.e eVar) {
        eVar.getClass();
        this.f110544a = eVar;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        p2 p2VarA = q2.a(new g(dateTimeNow, l.b(), -1L, -1L));
        this.f110545b = p2VarA;
        this.f110546c = s.d(p2VarA);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f110547d = p2VarA2;
        this.f110548e = s.d(p2VarA2);
        p2 p2VarA3 = q2.a(bool);
        this.f110549f = p2VarA3;
        this.f110550g = s.d(p2VarA3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ d(o52.e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null) : eVar);
    }
}
