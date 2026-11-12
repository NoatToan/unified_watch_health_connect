package od1;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.reminders.domain.updater.strategy.CacheRemindersUpdater;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import ue.i0;
import ue.l;
import ue.x;
import ve.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lod1/a;", "Lod1/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "Lcom/garmin/android/apps/connectmobile/reminders/domain/updater/strategy/CacheRemindersUpdater;", "updater", "<init>", "(Landroid/content/Context;Ljava/lang/Class;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends CacheRemindersUpdater> f131178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f131179b;

    static {
        new C2492a(null);
    }

    public a(Context context, Class<? extends CacheRemindersUpdater> cls) {
        context.getClass();
        cls.getClass();
        this.f131178a = cls;
        this.f131179b = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
    }

    @Override // od1.c
    public final void a() {
        Class<? extends CacheRemindersUpdater> cls = this.f131178a;
        String simpleName = cls.getSimpleName();
        x xVarA = new x.a(cls).a();
        a2 a2Var = a2.USER_REMINDERS;
        String strM = j.m("[enqueueWork] ", simpleName, StringUtils.SPACE);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "CacheRemindersUpdateStrategy", strM);
        this.f131179b.a(simpleName, l.REPLACE, xVarA).a();
    }

    /* JADX INFO: renamed from: od1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lod1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2492a {
        public /* synthetic */ C2492a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2492a() {
        }
    }
}
