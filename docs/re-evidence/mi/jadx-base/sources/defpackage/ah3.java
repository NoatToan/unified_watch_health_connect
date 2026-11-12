package defpackage;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraInternal;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface ah3 {

    public interface a {
        ah3 a(Context context, ai3 ai3Var, xh3 xh3Var) throws InitializationException;
    }

    CameraInternal a(String str) throws CameraUnavailableException;

    Set<String> b();

    Object c();
}
