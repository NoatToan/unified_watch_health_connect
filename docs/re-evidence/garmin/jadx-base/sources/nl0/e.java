package nl0;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnl0/e;", "Lnl0/a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "productNumberStr", "productSKU", "<init>", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126485c;

    public e(Activity activity, String str, String str2) {
        activity.getClass();
        str.getClass();
        str2.getClass();
        this.f126483a = activity;
        this.f126484b = str;
        this.f126485c = str2;
    }

    @Override // nl0.a
    public final void execute() {
        Intent intent = new Intent("com.garmin.android.apps.golf.PAIRING_SCREEN");
        intent.putExtra("extra.device.product.number", this.f126484b);
        intent.putExtra("extra.device.product.sku", this.f126485c);
        intent.setFlags(335675392);
        Activity activity = this.f126483a;
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.size() <= 0) {
            new n(activity).execute();
        } else {
            activity.startActivity(intent);
            activity.finish();
        }
    }
}
