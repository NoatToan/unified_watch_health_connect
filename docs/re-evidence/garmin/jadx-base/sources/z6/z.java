package z6;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private z() {
    }

    public static f0[] a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        f0[] f0VarArr = new f0[bundleArr.length];
        for (int i14 = 0; i14 < bundleArr.length; i14++) {
            Bundle bundle = bundleArr[i14];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            f0VarArr[i14] = new f0(bundle.getString("resultKey"), bundle.getCharSequence(Constants.ScionAnalytics.PARAM_LABEL), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return f0VarArr;
    }
}
