package n70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln70/t;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llc0/f;", "getBluetoothStateUseCase", "<init>", "(Landroid/content/Context;Llc0/f;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f124574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc0.f f124575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.p2 f124576c;

    public t(Context context, lc0.f fVar) {
        context.getClass();
        fVar.getClass();
        this.f124574a = context;
        this.f124575b = fVar;
        j22.b.f96736a.getClass();
        this.f124576c = r53.q2.a(Boolean.valueOf(j22.b.b(context)));
    }

    public static final boolean a(t tVar) {
        tVar.getClass();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD == null || arrayListD.isEmpty()) {
            return false;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            if (((sd2.f) it.next()).isPaired()) {
                return true;
            }
        }
        return false;
    }
}
