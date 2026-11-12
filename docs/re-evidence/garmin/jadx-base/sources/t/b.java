package t;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.i0;
import java.util.Set;
import v.h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements i0.a {
    @Override // androidx.camera.core.impl.i0.a
    public final h0 a(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new h0(context, obj, set);
        } catch (CameraUnavailableException e4) {
            throw new InitializationException(e4);
        }
    }
}
