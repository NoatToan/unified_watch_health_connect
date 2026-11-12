package ot2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lot2/a;", "", "<init>", "()V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133852a = new a();

    private a() {
    }

    public static String a(double d14, String str) {
        str.getClass();
        String str2 = new DecimalFormat(str).format(d14);
        str2.getClass();
        return str2;
    }

    public static String b(int i14, int i15, int i16) {
        if (i14 <= 0) {
            x0 x0Var = x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i16)}, 2));
        }
        x0 x0Var2 = x0.f105818a;
        return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, 3));
    }
}
