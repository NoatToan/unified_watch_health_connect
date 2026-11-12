package javazoom.jl.decoder;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Objects;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes23.dex */
public class JavaLayerUtils {
    private static JavaLayerHook a;

    public static Object deserialize(InputStream inputStream, Class cls) throws IOException {
        Objects.requireNonNull(cls, "cls");
        Object objDeserialize = deserialize(inputStream, cls);
        if (cls.isInstance(objDeserialize)) {
            return objDeserialize;
        }
        throw new InvalidObjectException("type of deserialized instance not of required class.");
    }

    public static Object deserializeArray(InputStream inputStream, Class cls, int i) throws IOException {
        Objects.requireNonNull(cls, "elemType");
        if (i < -1) {
            throw new IllegalArgumentException(SessionDescription.p);
        }
        Object objDeserialize = deserialize(inputStream);
        Class<?> cls2 = objDeserialize.getClass();
        if (!cls2.isArray()) {
            throw new InvalidObjectException("object is not an array");
        }
        if (cls2.getComponentType() != cls) {
            throw new InvalidObjectException("unexpected array component type");
        }
        if (i == -1 || Array.getLength(objDeserialize) == i) {
            return objDeserialize;
        }
        throw new InvalidObjectException("array length mismatch");
    }

    public static Object deserializeArrayResource(String str, Class cls, int i) throws IOException {
        InputStream resourceAsStream = getResourceAsStream(str);
        if (resourceAsStream != null) {
            return deserializeArray(resourceAsStream, cls, i);
        }
        throw new IOException("unable to load resource '" + str + "'");
    }

    public static synchronized JavaLayerHook getHook() {
        return a;
    }

    public static synchronized InputStream getResourceAsStream(String str) {
        JavaLayerHook javaLayerHook;
        javaLayerHook = a;
        return javaLayerHook != null ? javaLayerHook.getResourceAsStream(str) : JavaLayerUtils.class.getResourceAsStream(str);
    }

    public static void serialize(OutputStream outputStream, Object obj) throws IOException {
        Objects.requireNonNull(outputStream, Argument.OUT);
        Objects.requireNonNull(obj, IconCompat.EXTRA_OBJ);
        new ObjectOutputStream(outputStream).writeObject(obj);
    }

    public static synchronized void setHook(JavaLayerHook javaLayerHook) {
        a = javaLayerHook;
    }

    public static Object deserialize(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, Argument.IN);
        try {
            return new ObjectInputStream(inputStream).readObject();
        } catch (ClassNotFoundException e) {
            throw new InvalidClassException(e.toString());
        }
    }
}
