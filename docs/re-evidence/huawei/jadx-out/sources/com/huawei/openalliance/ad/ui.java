package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ui implements ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20308a;

    @Override // com.huawei.openalliance.ad.ug
    public boolean a() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.ug
    public void a(Activity activity, uk ukVar, um umVar) {
        if (activity == null || activity.getApplicationContext() == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(ukVar.c() == null ? "" : ukVar.c());
        sb.append(ukVar.d() != null ? ukVar.d() : "");
        this.f20308a = sb.toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        List<Intent> listA = a(applicationContext.getPackageManager().queryIntentActivities(intent, 131072), umVar.d());
        Intent intentCreateChooser = Intent.createChooser(listA.remove(0), ukVar.b() != null ? ukVar.b() : "text/plain");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listA.toArray(new Parcelable[0]));
        intentCreateChooser.setFlags(268435456);
        applicationContext.startActivity(intentCreateChooser);
    }

    private List<Intent> a(List<ResolveInfo> list, List<String> list2) {
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            if (list2.contains(resolveInfo.activityInfo.packageName)) {
                hw.a("MoreShareProcessor", "%s Not showing", resolveInfo.activityInfo.packageName);
            } else {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", this.f20308a);
                intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                arrayList.add(intent);
            }
        }
        return arrayList;
    }
}
