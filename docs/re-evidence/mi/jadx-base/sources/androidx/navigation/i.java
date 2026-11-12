package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<D extends d> {

    public interface a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract D a();

    public abstract d b(D d, Bundle bundle, h hVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}
