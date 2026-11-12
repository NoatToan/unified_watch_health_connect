package od1;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import sd1.i;
import ue.i0;
import ue.l;
import ue.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lod1/b;", "Lod1/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork;", "updater", "<init>", "(Landroid/content/Context;Ljava/lang/Class;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends RemindersNetwork> f131180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f131181b;

    public b(Context context, Class<? extends RemindersNetwork> cls) {
        context.getClass();
        cls.getClass();
        this.f131180a = cls;
        this.f131181b = new i(com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context));
    }

    @Override // od1.c
    public final void a() {
        i iVar = this.f131181b;
        iVar.getClass();
        Class<? extends RemindersNetwork> cls = this.f131180a;
        String simpleName = cls.getSimpleName();
        x xVarA = new x.a(cls).a();
        a2 a2Var = a2.USER_REMINDERS;
        String strM = j.m("[enqueueWork] ", simpleName, StringUtils.SPACE);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "WorkManagerRemindersNetworkUpdater", strM);
        iVar.f158633a.a(simpleName, l.REPLACE, xVarA).a();
    }
}
