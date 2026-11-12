package kotlin.reflect.jvm.internal.impl.types.checker;

import io.netty.util.internal.StringUtil;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes23.dex */
public final class ClassicTypeCheckerContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(Object obj) {
        return "ClassicTypeCheckerContext couldn't handle " + Reflection.getOrCreateKotlinClass(obj.getClass()) + StringUtil.SPACE + obj;
    }
}
