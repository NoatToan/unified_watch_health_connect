package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f5413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.l f5414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5415c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5416d = new HashMap();

    private v(StreamConfigurationMap streamConfigurationMap, y.l lVar) {
        new HashMap();
        this.f5413a = new w(streamConfigurationMap);
        this.f5414b = lVar;
    }

    public static v b(StreamConfigurationMap streamConfigurationMap, y.l lVar) {
        return new v(streamConfigurationMap, lVar);
    }

    public final Size[] a(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map = this.f5415c;
        Size[] outputSizes = null;
        if (map.containsKey(numValueOf)) {
            if (((Size[]) map.get(Integer.valueOf(i14))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i14))).clone();
        }
        try {
            outputSizes = this.f5413a.f5417a.getOutputSizes(i14);
        } catch (Throwable unused) {
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return outputSizes;
        }
        Size[] sizeArrA = this.f5414b.a(outputSizes, i14);
        map.put(Integer.valueOf(i14), sizeArrA);
        return (Size[]) sizeArrA.clone();
    }
}
