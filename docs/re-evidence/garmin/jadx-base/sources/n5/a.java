package n5;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b7.g;
import o4.f0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final long a(m mVar, int i14) {
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Resources resources = (Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return f0.b(resources.getColor(i14, theme));
    }
}
