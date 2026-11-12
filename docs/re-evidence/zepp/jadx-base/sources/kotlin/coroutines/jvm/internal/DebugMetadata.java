package kotlin.coroutines.jvm.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    @JvmName(name = "c")
    String c() default "";

    @JvmName(name = "f")
    String f() default "";

    @JvmName(name = "i")
    int[] i() default {};

    @JvmName(name = "l")
    int[] l() default {};

    @JvmName(name = "m")
    String m() default "";

    @JvmName(name = GoogleApiAvailabilityLight.b)
    String[] n() default {};

    @JvmName(name = SOAP.XMLNS)
    String[] s() default {};

    @JvmName(name = "v")
    int v() default 1;
}
