package bs;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.mapsdkadapter.q;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import po.c0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbs/c;", "Lrs/c;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements rs.c<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19646a;

    public c(Context context) {
        context.getClass();
        this.f19646a = context;
    }

    @Override // rs.c
    public final ArrayList a(Object obj) {
        List immutableList;
        wg0.d dVar = (wg0.d) obj;
        dVar.getClass();
        Context context = this.f19646a;
        Resources resources = context.getResources();
        resources.getClass();
        uo.a aVarC = c0.c(resources, new l22.a(context), dVar.f185087j, dVar.f185085h);
        if (aVarC == null || (immutableList = Util.toImmutableList(aVarC.f172067a)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : immutableList) {
            if (!((q) obj2).f50328a.f93153a.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // rs.c
    public final int b(wg0.d dVar) {
        dVar.getClass();
        return dVar.f185088k.getMapType();
    }

    @Override // rs.c
    public final List c(wg0.d dVar) {
        dVar.getClass();
        Context context = this.f19646a;
        Resources resources = context.getResources();
        resources.getClass();
        uo.a aVarC = c0.c(resources, new l22.a(context), dVar.f185087j, dVar.f185085h);
        if (aVarC != null) {
            return Util.toImmutableList(aVarC.f172068b);
        }
        return null;
    }
}
