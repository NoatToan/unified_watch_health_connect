package r;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f148674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f148675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f148676c;

    public d(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f148674a = iCustomTabsService;
        this.f148675b = componentName;
        this.f148676c = context;
    }

    public static String a(Context context, List<String> list) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public final g b(b bVar, PendingIntent pendingIntent) {
        boolean zNewSession;
        c cVar = new c(this, bVar);
        ICustomTabsService iCustomTabsService = this.f148674a;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = iCustomTabsService.newSessionWithExtras(cVar, bundle);
            } else {
                zNewSession = iCustomTabsService.newSession(cVar);
            }
            if (zNewSession) {
                return new g(iCustomTabsService, cVar, this.f148675b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
