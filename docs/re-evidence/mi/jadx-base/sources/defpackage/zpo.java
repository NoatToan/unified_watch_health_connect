package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class zpo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f41555b = new Size(320, 240);
    public static final Comparator<Size> c = new r94();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final clk f41556a = (clk) za6.a(clk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f41556a == null || !clk.a()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (c.compare(size, f41555b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
