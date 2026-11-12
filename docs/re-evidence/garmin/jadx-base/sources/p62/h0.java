package p62;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lp62/h0;", "Lp62/e0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "(Landroid/content/Context;Lm52/k;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends e0 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(Context context, m52.k kVar, PowerZonesDTO powerZonesDTO, boolean z14) {
        this(context, kVar, z14);
        context.getClass();
        kVar.getClass();
        if (powerZonesDTO != null) {
            x52.g.a aVar = x52.g.f189104d;
            Resources resources = context.getResources();
            resources.getClass();
            aVar.getClass();
            x52.g.a.b(resources, kVar, powerZonesDTO);
        }
    }

    @Override // p62.e0, p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        if (this.f136217c) {
            j0Var.C = x52.g.ZONE_1.f189113a;
            return j0Var;
        }
        j0Var.T = x52.g.ZONE_1.f189113a;
        return j0Var;
    }

    @Override // p62.e0
    public final String u(int i14) {
        x52.g.f189104d.getClass();
        x52.g gVarA = x52.g.a.a(i14);
        if (gVarA != null) {
            return gVarA.a(this.f136215a);
        }
        return null;
    }

    public /* synthetic */ h0(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }

    public /* synthetic */ h0(Context context, m52.k kVar, PowerZonesDTO powerZonesDTO, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, powerZonesDTO, (i14 & 8) != 0 ? true : z14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }
}
