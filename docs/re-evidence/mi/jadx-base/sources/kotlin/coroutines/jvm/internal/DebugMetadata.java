package kotlin.coroutines.jvm.internal;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    @JvmName(name = PluginDeviceInfo.FICONON)
    String c() default "";

    @JvmName(name = PluginDeviceInfo.FBLUETOOTHPAIR)
    String f() default "";

    @JvmName(name = "i")
    int[] i() default {};

    @JvmName(name = e.f13808a)
    int[] l() default {};

    @JvmName(name = "m")
    String m() default "";

    @JvmName(name = "n")
    String[] n() default {};

    @JvmName(name = "s")
    String[] s() default {};

    @JvmName(name = "v")
    int v() default 1;
}
