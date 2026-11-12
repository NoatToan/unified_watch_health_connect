package db0;

import n02.m;
import org.joda.time.DateTimeConstants;
import p3.a2;
import p3.p1;
import r82.g;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f58961c;

    public /* synthetic */ a(int i14, p1 p1Var, int i15) {
        this.f58959a = i15;
        this.f58960b = i14;
        this.f58961c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f58959a) {
            case 0:
                return new a2(c.d((this.f58960b % DateTimeConstants.SECONDS_PER_HOUR) / 60, (i53.c) this.f58961c.getF182175a()));
            case 1:
                return new a2(m.b((i53.c) this.f58961c.getF182175a(), this.f58960b / 60));
            case 2:
                return new a2(m.b((i53.c) this.f58961c.getF182175a(), this.f58960b % 60));
            case 3:
                return new a2(g.l(this.f58960b / DateTimeConstants.SECONDS_PER_HOUR, (i53.c) this.f58961c.getF182175a()));
            case 4:
                return new a2(g.l((this.f58960b % DateTimeConstants.SECONDS_PER_HOUR) / 60, (i53.c) this.f58961c.getF182175a()));
            default:
                return new a2(g.l(this.f58960b % 60, (i53.c) this.f58961c.getF182175a()));
        }
    }
}
