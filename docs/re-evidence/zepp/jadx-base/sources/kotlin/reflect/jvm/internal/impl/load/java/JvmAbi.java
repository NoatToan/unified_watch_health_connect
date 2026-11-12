package kotlin.reflect.jvm.internal.impl.load.java;

import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @JvmField
    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmField");

    @NotNull
    private static final ClassId a = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    private JvmAbi() {
    }

    @JvmStatic
    @NotNull
    public static final String getterName(@NotNull String str) {
        return startsWithIsPrefix(str) ? str : Intrinsics.stringPlus("get", CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
    }

    @JvmStatic
    public static final boolean isGetterName(@NotNull String str) {
        return m.startsWith$default(str, "get", false, 2, null) || m.startsWith$default(str, "is", false, 2, null);
    }

    @JvmStatic
    public static final boolean isSetterName(@NotNull String str) {
        return m.startsWith$default(str, WatchFaceArrivingEvent.CMD_SET, false, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String setterName(@NotNull String str) {
        return Intrinsics.stringPlus(WatchFaceArrivingEvent.CMD_SET, startsWithIsPrefix(str) ? str.substring(2) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(@NotNull String str) {
        if (!m.startsWith$default(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return Intrinsics.compare(97, (int) cCharAt) > 0 || Intrinsics.compare((int) cCharAt, 122) > 0;
    }
}
