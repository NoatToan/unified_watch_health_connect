package sz0;

import android.content.Context;
import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lsz0/v;", "Lg/a;", "Lo13/p;", "", "", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends g.a<o13.p<? extends String, ? extends String>, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.a
    public final Intent a(Context context, o13.p<? extends String, ? extends String> pVar) {
        o13.p<? extends String, ? extends String> pVar2 = pVar;
        context.getClass();
        pVar2.getClass();
        return ((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).x(context, (String) pVar2.f128594a, (String) pVar2.f128595b, Boolean.FALSE);
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
