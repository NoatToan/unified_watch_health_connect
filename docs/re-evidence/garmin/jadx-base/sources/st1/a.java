package st1;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import ww1.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lst1/a;", "", "Lgu1/b;", "atpRepo", "Luw1/b;", "trainingPlansRepo", "Lzf0/d;", "eventRepo", "<init>", "(Lgu1/b;Luw1/b;Lzf0/d;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu1.b f160848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.b f160849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0.d f160850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f160851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f160852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f160853f;

    static {
        new C3037a(null);
    }

    public a(gu1.b bVar, uw1.b bVar2, zf0.d dVar) {
        bVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        this.f160848a = bVar;
        this.f160849b = bVar2;
        this.f160850c = dVar;
        p2 p2VarA = q2.a(null);
        this.f160851d = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f160852e = s.d(p2VarA);
        this.f160853f = s.d(p2VarA2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        p2 p2Var;
        Object value;
        Object objA;
        do {
            p2Var = this.f160851d;
            value = p2Var.getValue();
            g3 g3Var = (g3) value;
            objA = null;
            if (g3Var != null) {
                if (((e0) g3Var.f35301b) != null) {
                    j0 j0Var = j0.f134944a;
                    j0Var.getClass();
                    objA = new e0(j0Var, null, null, null, null, j0Var, 0);
                }
                objA = g3.a(g3Var, objA);
            }
        } while (!p2Var.b(value, objA));
    }

    /* JADX INFO: renamed from: st1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lst1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3037a {
        public /* synthetic */ C3037a(j jVar) {
            this();
        }

        private C3037a() {
        }
    }
}
