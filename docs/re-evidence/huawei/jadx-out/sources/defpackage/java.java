package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.reflect.KClass;

/* JADX INFO: renamed from: zce, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0010\n\u0002\b\u0005\u001a\u001f\u0010\u0014\u001a\u00020\u0015\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0002\u0010\u0017\"-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038G¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"-\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"+\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007\"+\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0011\";\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007\"'\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0019*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\";\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u0001\"\u000e\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u001d0\u001e*\b\u0012\u0004\u0012\u0002H\u001d0\u001e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"java", "Ljava/lang/Class;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaPrimitiveType", "", "getJavaPrimitiveType", "javaObjectType", "getJavaObjectType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "javaClass", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "annotationClass", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", ExifInterface.LONGITUDE_EAST, "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class java {
    public static final <T> Class<T> d(KClass<T> kClass) {
        zcp.c(kClass, "");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).getJClass();
        zcp.e(cls, "");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> Class<T> b(KClass<T> kClass) {
        zcp.c(kClass, "");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!cls.isPrimitive()) {
            zcp.e(cls, "");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals(SequenceDetailFieldConfig.DOUBLE)) {
                        cls = (Class<T>) Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals(SequenceDetailFieldConfig.CHAR)) {
                        cls = (Class<T>) Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        cls = (Class<T>) Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (Class<T>) Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                    }
                    break;
            }
        }
        zcp.e(cls, "");
        return cls;
    }

    public static final <T> KClass<T> b(Class<T> cls) {
        zcp.c(cls, "");
        return zcv.b(cls);
    }
}
