package rk2;

import java.util.LinkedHashSet;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk2/a;", "Lrk2/i;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f153357a = new LinkedHashSet();

    @Override // rk2.i
    public final Boolean a(UUID uuid) {
        return Boolean.valueOf(this.f153357a.contains(uuid));
    }

    @Override // rk2.i
    public final Unit b(wk2.f fVar) {
        if (s.g(fVar.f185843b, "software-update")) {
            this.f153357a.add(fVar.f185842a);
        }
        return Unit.INSTANCE;
    }
}
