package io.netty.util.internal.svm;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;
import com.xiaomi.smarthome.homeroom.model.Home;

/* JADX INFO: loaded from: classes2.dex */
@TargetClass(className = "io.netty.util.internal.PlatformDependent0")
final class PlatformDependent0Substitution {

    @RecomputeFieldValue(declClassName = "java.nio.Buffer", kind = RecomputeFieldValue.Kind.FieldOffset, name = Home.JSON_KEY_ADDRESS)
    @Alias
    private static long ADDRESS_FIELD_OFFSET;

    private PlatformDependent0Substitution() {
    }
}
