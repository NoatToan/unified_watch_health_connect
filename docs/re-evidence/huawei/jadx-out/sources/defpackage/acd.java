package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ext.Java7Handlers;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class acd implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f239a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final acd f240c;
    private static final Java7Handlers d;
    private static final Class<?> e;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f241b;
    private final Map<String, Object> g;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            defpackage.acd.e = r1
            defpackage.acd.f239a = r2
            com.fasterxml.jackson.databind.ext.Java7Handlers r0 = com.fasterxml.jackson.databind.ext.Java7Handlers.instance()     // Catch: java.lang.Throwable -> L10
        L10:
            defpackage.acd.d = r0
            acd r0 = new acd
            r0.<init>()
            defpackage.acd.f240c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acd.<clinit>():void");
    }

    protected acd() {
        HashMap map = new HashMap();
        this.f241b = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.g = map2;
        map2.put("java.sql.Timestamp", agf.f380b);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public JsonSerializer<?> a(yt ytVar, JavaType javaType, BeanDescription beanDescription) {
        Object objE;
        JsonSerializer<?> serializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        if (a(rawClass, e)) {
            return (JsonSerializer) e("com.fasterxml.jackson.databind.ext.DOMSerializer", javaType);
        }
        Java7Handlers java7Handlers = d;
        if (java7Handlers != null && (serializerForJavaNioFilePath = java7Handlers.getSerializerForJavaNioFilePath(rawClass)) != null) {
            return serializerForJavaNioFilePath;
        }
        String name = rawClass.getName();
        Object obj = this.g.get(name);
        if (obj != null) {
            if (obj instanceof JsonSerializer) {
                return (JsonSerializer) obj;
            }
            return (JsonSerializer) e((String) obj, javaType);
        }
        if ((name.startsWith("javax.xml.") || e(rawClass, "javax.xml.")) && (objE = e("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", javaType)) != null) {
            return ((Serializers) objE).findSerializer(ytVar, javaType, beanDescription);
        }
        return null;
    }

    public JsonDeserializer<?> d(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym {
        Object objE;
        JsonDeserializer<?> deserializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Java7Handlers java7Handlers = d;
        if (java7Handlers != null && (deserializerForJavaNioFilePath = java7Handlers.getDeserializerForJavaNioFilePath(rawClass)) != null) {
            return deserializerForJavaNioFilePath;
        }
        if (a(rawClass, e)) {
            return (JsonDeserializer) e("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", javaType);
        }
        if (a(rawClass, f239a)) {
            return (JsonDeserializer) e("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", javaType);
        }
        String name = rawClass.getName();
        String str = this.f241b.get(name);
        if (str != null) {
            return (JsonDeserializer) e(str, javaType);
        }
        if ((name.startsWith("javax.xml.") || e(rawClass, "javax.xml.")) && (objE = e("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", javaType)) != null) {
            return ((Deserializers) objE).findBeanDeserializer(javaType, yiVar, beanDescription);
        }
        return null;
    }

    public boolean e(Class<?> cls) {
        if (a(cls, e) || a(cls, f239a)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("javax.xml.") || e(cls, "javax.xml.")) {
            return true;
        }
        return this.f241b.containsKey(name);
    }

    private boolean a(Class<?> cls, Class<?> cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    private Object e(String str, JavaType javaType) {
        try {
            return b(Class.forName(str), javaType);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + ahw.a(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private Object b(Class<?> cls, JavaType javaType) {
        try {
            return ahw.b((Class) cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + ahw.a(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private boolean e(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }
}
