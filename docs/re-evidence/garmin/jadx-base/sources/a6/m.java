package a6;

import p005kotlin.Metadata;
import p3.c2;
import p3.p0;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La6/m;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x3<Boolean> f1513a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"a6/m$a", "Landroidx/emoji2/text/d$f;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.emoji2.text.d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f1514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f1515b;

        public a(p1<Boolean> p1Var, m mVar) {
            this.f1514a = p1Var;
            this.f1515b = mVar;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.f1515b.f1513a = p.f1519a;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            this.f1514a.setValue(Boolean.TRUE);
            this.f1515b.f1513a = new q(true);
        }
    }

    public m() {
        this.f1513a = androidx.emoji2.text.d.e() ? a() : null;
    }

    public final x3<Boolean> a() {
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        if (dVarA.c() == 1) {
            return new q(true);
        }
        c2 c2VarN = p0.n(Boolean.FALSE);
        dVarA.i(new a(c2VarN, this));
        return c2VarN;
    }
}
