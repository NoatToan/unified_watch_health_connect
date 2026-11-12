package androidx.camera.camera2;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.UseCaseConfigFactory;
import defpackage.ah3;
import defpackage.ki3;
import defpackage.oe3;
import defpackage.te3;
import defpackage.vg3;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class Camera2Config {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class DefaultProvider implements ki3.b {
        @Override // ki3.b
        public ki3 getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static ki3 c() {
        ah3.a aVar = new ah3.a() { // from class: le3
            @Override // ah3.a
            public final ah3 a(Context context, ai3 ai3Var, xh3 xh3Var) {
                return new fd3(context, ai3Var, xh3Var);
            }
        };
        vg3.a aVar2 = new vg3.a() { // from class: me3
            @Override // vg3.a
            public final vg3 a(Context context, Object obj, Set set) {
                return Camera2Config.d(context, obj, set);
            }
        };
        return new ki3.a().c(aVar).d(aVar2).g(new UseCaseConfigFactory.b() { // from class: ne3
            @Override // androidx.camera.core.impl.UseCaseConfigFactory.b
            public final UseCaseConfigFactory a(Context context) {
                return Camera2Config.e(context);
            }
        }).a();
    }

    public static /* synthetic */ vg3 d(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new oe3(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }

    public static /* synthetic */ UseCaseConfigFactory e(Context context) throws InitializationException {
        return new te3(context);
    }
}
