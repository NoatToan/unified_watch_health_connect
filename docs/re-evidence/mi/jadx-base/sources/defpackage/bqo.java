package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class bqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<SurfaceConfig> f4489a = new ArrayList();

    public static void b(List<int[]> list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(list, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public boolean a(SurfaceConfig surfaceConfig) {
        return this.f4489a.add(surfaceConfig);
    }

    public final List<int[]> c(int i) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean d(List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f4489a.size()) {
            return false;
        }
        for (int[] iArr : c(this.f4489a.size())) {
            boolean zD = true;
            for (int i = 0; i < this.f4489a.size() && (iArr[i] >= list.size() || ((zD = zD & this.f4489a.get(i).d(list.get(iArr[i]))))); i++) {
            }
            if (zD) {
                return true;
            }
        }
        return false;
    }
}
