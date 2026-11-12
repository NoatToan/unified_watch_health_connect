package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements zd.b<a> {

    public static class a {
    }

    @Override // zd.b
    public final a create(Context context) {
        Choreographer.getInstance().postFrameCallback(new com.mapbox.maps.renderer.b(this, context.getApplicationContext()));
        return new a();
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
