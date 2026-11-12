package defpackage;

import android.util.Log;
import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.ResultCallback;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ksw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f39388b;

    static {
        HashSet hashSet = new HashSet();
        f39388b = hashSet;
        hashSet.add("Gender");
        hashSet.add("Birthday");
        hashSet.add("Height");
        hashSet.add("Weight");
    }

    public static boolean c(krl krlVar, ResultCallback resultCallback) {
        if ((krlVar.getType() != 10002 && krlVar.getType() != 10006) || krlVar.getStartTime() == krlVar.getEndTime()) {
            return true;
        }
        Log.w("DataValidateUtil", "startTime is not equal to endTime");
        resultCallback.onResultHandler(2, HiHealthError.e(2));
        return false;
    }
}
