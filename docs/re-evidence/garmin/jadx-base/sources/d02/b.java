package d02;

import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Locale;
import m92.p0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld02/b;", "Lm92/p0;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements p0 {
    @Override // m92.p0
    public final String a(double d14) {
        x0 x0Var = x0.f105818a;
        return String.format(Locale.US, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((int) d14)}, 1));
    }
}
