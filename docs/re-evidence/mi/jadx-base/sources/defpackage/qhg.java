package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class qhg {
    public static y5d a(int i, boolean z) {
        try {
            return (y5d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, Boolean.TYPE).newInstance(Integer.valueOf(i), Boolean.valueOf(z));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
