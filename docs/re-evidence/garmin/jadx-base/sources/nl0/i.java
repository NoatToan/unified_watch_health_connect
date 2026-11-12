package nl0;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnl0/i;", "Lnl0/a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Activity;)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements nl0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126490a;

    static {
        new a(null);
    }

    public i(Activity activity) {
        activity.getClass();
        this.f126490a = activity;
    }

    @Override // nl0.a
    public final void execute() {
        Intent intent = new Intent("com.garmin.android.apps.golf.VIEW_SCORECARD_LIST");
        intent.setFlags(335675392);
        Activity activity = this.f126490a;
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.size() <= 0) {
            new n(activity).execute();
        } else {
            activity.startActivity(intent);
            activity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnl0/i$a;", "", "<init>", "()V", "", "GOLF_APP_SCORECARD_LIST_ACTION", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
