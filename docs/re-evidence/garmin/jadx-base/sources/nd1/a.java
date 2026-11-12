package nd1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.reminders.domain.updater.strategy.CacheRemindersUpdater;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnd1/a;", "Lnd1/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpd1/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Landroid/content/Context;Lpd1/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od1.b f125401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od1.a f125402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, pd1.a aVar) {
        super(aVar);
        context.getClass();
        aVar.getClass();
        this.f125401b = new od1.b(context, e());
        this.f125402c = new od1.a(context, d());
    }

    @Override // nd1.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final od1.a getF125402c() {
        return this.f125402c;
    }

    @Override // nd1.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final od1.b getF125401b() {
        return this.f125401b;
    }

    public abstract Class<? extends CacheRemindersUpdater> d();

    public abstract Class<? extends RemindersNetwork> e();
}
