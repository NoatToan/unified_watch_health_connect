package nl0;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnl0/c;", "", "Landroid/content/pm/PackageManager;", "pm", "<init>", "(Landroid/content/pm/PackageManager;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f126481a;

    public c(PackageManager packageManager) {
        packageManager.getClass();
        this.f126481a = packageManager;
    }

    public final boolean a(String str) {
        List<ResolveInfo> listQueryIntentActivities = this.f126481a.queryIntentActivities(new Intent(str), 0);
        listQueryIntentActivities.getClass();
        return listQueryIntentActivities.size() > 0;
    }
}
