package bi2;

import android.widget.NumberPicker;
import c22.f1;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements NumberPicker.Formatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18177a;

    @Override // android.widget.NumberPicker.Formatter
    public final String format(int i14) {
        switch (this.f18177a) {
            case 0:
                x0 x0Var = x0.f105818a;
                return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            case 1:
                f1.a aVar = f1.Y0;
                x0 x0Var2 = x0.f105818a;
                return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            case 2:
                x0 x0Var3 = x0.f105818a;
                return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            case 3:
                int i15 = p62.x.f136243d;
                return String.valueOf(i14);
            case 4:
                r22.f1.a aVar2 = r22.f1.f149645b1;
                x0 x0Var4 = x0.f105818a;
                return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            case 5:
                return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i14));
            default:
                int i16 = xh1.j.f191067f;
                x0 x0Var5 = x0.f105818a;
                return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
        }
    }
}
