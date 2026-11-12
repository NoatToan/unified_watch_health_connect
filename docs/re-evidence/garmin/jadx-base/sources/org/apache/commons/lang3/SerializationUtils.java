package org.apache.commons.lang3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SerializationUtils {

    public static class ClassLoaderAwareObjectInputStream extends ObjectInputStream {
        private static final Map<String, Class<?>> primitiveTypes;
        private final ClassLoader classLoader;

        static {
            HashMap map = new HashMap();
            primitiveTypes = map;
            map.put("byte", Byte.TYPE);
            map.put("short", Short.TYPE);
            map.put("int", Integer.TYPE);
            map.put("long", Long.TYPE);
            map.put("float", Float.TYPE);
            map.put("double", Double.TYPE);
            map.put("boolean", Boolean.TYPE);
            map.put("char", Character.TYPE);
            map.put("void", Void.TYPE);
        }

        public ClassLoaderAwareObjectInputStream(InputStream inputStream, ClassLoader classLoader) {
            super(inputStream);
            this.classLoader = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            String name = objectStreamClass.getName();
            try {
                try {
                    return Class.forName(name, false, this.classLoader);
                } catch (ClassNotFoundException e4) {
                    Class<?> cls = primitiveTypes.get(name);
                    if (cls != null) {
                        return cls;
                    }
                    throw e4;
                }
            } catch (ClassNotFoundException unused) {
                return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
            }
        }
    }

    public static <T extends Serializable> T clone(T t7) {
        if (t7 == null) {
            return null;
        }
        try {
            ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream = new ClassLoaderAwareObjectInputStream(new ByteArrayInputStream(serialize(t7)), t7.getClass().getClassLoader());
            try {
                T t14 = (T) classLoaderAwareObjectInputStream.readObject();
                classLoaderAwareObjectInputStream.close();
                return t14;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        classLoaderAwareObjectInputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (IOException e4) {
            throw new SerializationException("IOException while reading or closing cloned object data", e4);
        } catch (ClassNotFoundException e14) {
            throw new SerializationException("ClassNotFoundException while reading cloned object data", e14);
        }
    }

    public static <T> T deserialize(InputStream inputStream) {
        Validate.notNull(inputStream, "inputStream", new Object[0]);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            try {
                T t7 = (T) objectInputStream.readObject();
                objectInputStream.close();
                return t7;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        objectInputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (IOException | ClassNotFoundException e4) {
            throw new SerializationException(e4);
        }
    }

    public static <T extends Serializable> T roundtrip(T t7) {
        return (T) deserialize(serialize(t7));
    }

    public static void serialize(Serializable serializable, OutputStream outputStream) {
        Validate.notNull(outputStream, "outputStream", new Object[0]);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (IOException e4) {
            throw new SerializationException(e4);
        }
    }

    public static byte[] serialize(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        serialize(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static <T> T deserialize(byte[] bArr) {
        Validate.notNull(bArr, "objectData", new Object[0]);
        return (T) deserialize(new ByteArrayInputStream(bArr));
    }
}
