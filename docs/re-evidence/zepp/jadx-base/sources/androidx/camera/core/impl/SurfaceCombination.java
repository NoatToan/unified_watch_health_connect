package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> arrangementsResultList, int n, int[] result, int index) {
        boolean z;
        if (index >= result.length) {
            arrangementsResultList.add((int[]) result.clone());
            return;
        }
        for (int i = 0; i < n; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= index) {
                    z = false;
                    break;
                } else {
                    if (i == result[i2]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                result[index] = i;
                generateArrangements(arrangementsResultList, n, result, index + 1);
            }
        }
    }

    private List<int[]> getElementsArrangements(int n) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, n, new int[n], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean isSupported(@NonNull List<SurfaceConfig> configList) {
        if (configList.isEmpty()) {
            return true;
        }
        if (configList.size() > this.mSurfaceConfigList.size()) {
            return false;
        }
        for (int[] iArr : getElementsArrangements(this.mSurfaceConfigList.size())) {
            boolean zIsSupported = true;
            for (int i = 0; i < this.mSurfaceConfigList.size() && (iArr[i] >= configList.size() || ((zIsSupported = zIsSupported & this.mSurfaceConfigList.get(i).isSupported(configList.get(iArr[i]))))); i++) {
            }
            if (zIsSupported) {
                return true;
            }
        }
        return false;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
