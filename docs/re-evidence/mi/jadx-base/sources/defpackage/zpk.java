package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class zpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk8 f41553a;

    public zpk() {
        this((qk8) za6.a(qk8.class));
    }

    public List<Size> a(SurfaceConfig.ConfigType configType, List<Size> list) {
        Size sizeA;
        qk8 qk8Var = this.f41553a;
        if (qk8Var == null || (sizeA = qk8Var.a(configType)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeA);
        for (Size size : list) {
            if (!size.equals(sizeA)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    public zpk(qk8 qk8Var) {
        this.f41553a = qk8Var;
    }
}
