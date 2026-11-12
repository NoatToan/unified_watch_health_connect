package c03;

import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc03/b;", "Lc03/g;", "Lvd/g;", "statement", "<init>", "(Lvd/g;)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.g f22411a;

    public b(vd.g gVar) {
        gVar.getClass();
        this.f22411a = gVar;
    }

    @Override // c03.g
    public final d03.c b() {
        throw new UnsupportedOperationException();
    }

    @Override // c03.g
    public final void close() throws IOException {
        this.f22411a.close();
    }

    @Override // c03.g
    public final void execute() {
        this.f22411a.execute();
    }

    @Override // d03.g
    public final void r(int i14, String str) {
        vd.g gVar = this.f22411a;
        if (str == null) {
            gVar.u(i14);
        } else {
            gVar.r(i14, str);
        }
    }
}
