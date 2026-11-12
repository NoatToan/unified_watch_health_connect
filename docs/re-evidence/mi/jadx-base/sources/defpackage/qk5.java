package defpackage;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.ViewDataBinding;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class qk5 {
    public List<qk5> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i);

    public abstract ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i);

    public abstract ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i);

    public abstract int getLayoutId(String str);
}
