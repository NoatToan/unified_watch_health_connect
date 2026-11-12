package uw0;

import am.x0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import c22.l3;
import c22.m3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luw0/e;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f172980a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172981a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.ASCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.DESCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f172981a = iArr;
        }
    }

    public e(l22.b bVar) {
        bVar.getClass();
        this.f172980a = bVar;
    }

    public abstract int a();

    public final String b(double d14, m3 m3Var) {
        m3Var.getClass();
        StringBuilder sb3 = new StringBuilder();
        l3.f23124b.getClass();
        double dG = l3.a.g(d14, m3.METER, m3Var);
        if (Double.isNaN(dG)) {
            sb3.append("");
        } else {
            String str = l3.f23131i.format(dG);
            str.getClass();
            sb3.append(str);
        }
        String string = this.f172980a.getString(m3Var.f23164e);
        sb3.append(StringUtils.SPACE);
        sb3.append(string);
        return sb3.toString();
    }

    public abstract int c();

    public abstract String d(x1 x1Var);

    public abstract String e(String str);

    public abstract int f();

    public abstract String g(x1 x1Var);

    public abstract String h(Context context, x1 x1Var);

    public abstract int i(x1 x1Var, x0 x0Var);

    public abstract Drawable[] j(Context context, x xVar);

    public abstract int k();

    public abstract int l();
}
