package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class zwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41751a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f41752b = new Object();

    public static Bundle a(wwg.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.m() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(lkk lkkVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", lkkVar.i());
        bundle.putCharSequence("label", lkkVar.h());
        bundle.putCharSequenceArray("choices", lkkVar.e());
        bundle.putBoolean("allowFreeFormInput", lkkVar.c());
        bundle.putBundle("extras", lkkVar.g());
        Set<String> setD = lkkVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(lkk[] lkkVarArr) {
        if (lkkVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lkkVarArr.length];
        for (int i = 0; i < lkkVarArr.length; i++) {
            bundleArr[i] = b(lkkVarArr[i]);
        }
        return bundleArr;
    }
}
