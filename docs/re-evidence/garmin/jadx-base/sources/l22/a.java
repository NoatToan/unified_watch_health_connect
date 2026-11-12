package l22;

import android.content.Context;
import c22.c3;
import c22.g2;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll22/a;", "Ll22/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109162a;

    public a(Context context) {
        context.getClass();
        this.f109162a = context;
    }

    @Override // l22.b
    public final String a(int i14, Object... objArr) {
        String string = this.f109162a.getString(i14, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    @Override // l22.b
    public final String b(c3 c3Var) {
        c3Var.getClass();
        return dh.b.A(this.f109162a, c3Var);
    }

    @Override // l22.b
    public final String c(int i14, int i15, Object... objArr) {
        String quantityString = this.f109162a.getResources().getQuantityString(i14, i15, Arrays.copyOf(objArr, objArr.length));
        quantityString.getClass();
        return quantityString;
    }

    public final String d(g2 g2Var, Object... objArr) {
        g2Var.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return dh.b.C(this.f109162a, g2Var.f23059a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // l22.b
    public final String getString(int i14) {
        String string = this.f109162a.getString(i14);
        string.getClass();
        return string;
    }
}
