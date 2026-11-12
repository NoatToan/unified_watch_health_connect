package defpackage;

import android.content.Context;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.r;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface vg3 {

    public interface a {
        vg3 a(Context context, Object obj, Set<String> set) throws InitializationException;
    }

    SurfaceConfig a(String str, int i, Size size);

    Map<r<?>, Size> b(String str, List<SurfaceConfig> list, List<r<?>> list2);
}
