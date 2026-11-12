package defpackage;

import android.content.Context;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b7a {

    public interface a {
        Set<Boolean> d();
    }

    public static boolean a(Context context) {
        Set<Boolean> setD = ((a) EntryPointAccessors.fromApplication(context, a.class)).d();
        e6i.d(setD.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setD.isEmpty()) {
            return true;
        }
        return setD.iterator().next().booleanValue();
    }
}
