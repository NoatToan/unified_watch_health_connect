package pq2;

import android.app.Activity;
import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpq2/c;", "Lpq2/b;", "Landroid/content/Intent;", "targetIntent", "<init>", "(Landroid/content/Intent;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f139598a;

    public c(Intent intent) {
        intent.getClass();
        this.f139598a = intent;
    }

    @Override // pq2.b
    public final void a(Activity activity) {
        activity.getClass();
        Intent intent = this.f139598a;
        intent.setFlags(335675392);
        activity.startActivity(intent);
    }
}
