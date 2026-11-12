package cn2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import d53.w;
import hb2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn2/d;", "", "<init>", "()V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f28092a = new d();

    private d() {
    }

    public static void a(Context context, String str, long j8, Integer num) {
        if (Build.VERSION.SDK_INT < 34) {
            Intent intent = new Intent(str);
            intent.putExtra("com.garmin.device.sharing.management.EXTRA_UNIT_ID", j8);
            intent.putExtra("com.garmin.device.sharing.management.EXTRA_PRODUCT_NUMBER", num);
            intent.putExtra("com.garmin.device.sharing.management.EXTRA_SOURCE_PACKAGE", context.getPackageName());
            context.sendBroadcast(intent, null);
            return;
        }
        a[] aVarArrValues = a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        for (a aVar : aVarArrValues) {
            arrayList.add(aVar.f28069a);
        }
        g.a[] aVarArrValues2 = g.a.values();
        ArrayList arrayList2 = new ArrayList();
        int length = aVarArrValues2.length;
        int i14 = 0;
        while (i14 < length) {
            g.a aVar2 = aVarArrValues2[i14];
            String str2 = aVar2.f82804a;
            str2.getClass();
            g.a[] aVarArr = aVarArrValues2;
            if (w.z(str2, "com.garmin", false)) {
                arrayList2.add(aVar2);
            }
            i14++;
            aVarArrValues2 = aVarArr;
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((g.a) it.next()).f82804a);
        }
        Set setH1 = h0.h1(arrayList, arrayList3);
        for (String str3 : h0.g1(setH1)) {
            if (!setH1.isEmpty()) {
                Intent intent2 = new Intent(str);
                intent2.setPackage(str3);
                intent2.putExtra("com.garmin.device.sharing.management.EXTRA_UNIT_ID", j8);
                intent2.putExtra("com.garmin.device.sharing.management.EXTRA_PRODUCT_NUMBER", num);
                intent2.putExtra("com.garmin.device.sharing.management.EXTRA_SOURCE_PACKAGE", context.getPackageName());
                context.sendBroadcast(intent2, null);
            }
        }
    }
}
