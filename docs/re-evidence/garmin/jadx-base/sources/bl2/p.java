package bl2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.List;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements UnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18700a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CoreTransferException coreTransferException;
        switch (this.f18700a) {
            case 0:
                o13.p pVar = (o13.p) obj;
                r.a aVar = r.f18709p;
                pVar.getClass();
                pk2.x xVar = (pk2.x) pVar.f128594a;
                List list = (List) pVar.f128595b;
                if (!xVar.b() || (coreTransferException = xVar.f138497b) == null) {
                    return pVar;
                }
                pk2.x.f138495e.getClass();
                return new o13.p(pk2.x.a.d(coreTransferException), list);
            default:
                mv1.f fVar = (mv1.f) obj;
                fVar.getClass();
                return mv1.f.a(fVar, false);
        }
    }
}
