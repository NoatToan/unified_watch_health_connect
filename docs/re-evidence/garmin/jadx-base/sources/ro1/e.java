package ro1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityInfo f153929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f153930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153931c;

    public e(ActivityInfo activityInfo, Drawable drawable, String str) {
        this.f153929a = activityInfo;
        this.f153930b = drawable;
        this.f153931c = str;
    }

    public static ArrayList a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            String str = resolveInfo.activityInfo.permission;
            boolean z14 = str == null || a7.b.checkSelfPermission(context, str) == 0;
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            boolean z15 = activityInfo.exported;
            if (z14 && z15) {
                arrayList.add(new e(activityInfo, resolveInfo.loadIcon(packageManager), resolveInfo.loadLabel(packageManager).toString()));
            }
        }
        return arrayList;
    }

    public final String toString() {
        return this.f153929a.packageName + ":" + this.f153931c;
    }
}
