package androidx.navigation;

import com.mi.health.course.export.data.CourseConfigModel;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\u0006\u0010\n\u001a>\u0010\r\u001a\u0014\u0012\u000e\b\u0001\u0012\n \f*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000e\u001a$\u0010\u0010\u001a\u00020\u000f*\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/i;", "Landroidx/navigation/d;", "T", "Landroidx/navigation/j;", "", "name", "get", "(Landroidx/navigation/j;Ljava/lang/String;)Landroidx/navigation/i;", "Lkotlin/reflect/KClass;", "clazz", "(Landroidx/navigation/j;Lkotlin/reflect/KClass;)Landroidx/navigation/i;", "navigator", "kotlin.jvm.PlatformType", CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Landroidx/navigation/j;Ljava/lang/String;Landroidx/navigation/i;)Landroidx/navigation/i;", "", "plusAssign", "(Landroidx/navigation/j;Landroidx/navigation/i;)V", "navigation-common-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavigatorProviderKt {
    @NotNull
    public static final <T extends i<? extends d>> T get(@NotNull j jVar, @NotNull String str) {
        T t = (T) jVar.e(str);
        Intrinsics.checkExpressionValueIsNotNull(t, "getNavigator(name)");
        return t;
    }

    public static final void plusAssign(@NotNull j jVar, @NotNull i<? extends d> iVar) {
        jVar.a(iVar);
    }

    @Nullable
    public static final i<? extends d> set(@NotNull j jVar, @NotNull String str, @NotNull i<? extends d> iVar) {
        return jVar.b(str, iVar);
    }

    @NotNull
    public static final <T extends i<? extends d>> T get(@NotNull j jVar, @NotNull KClass<T> kClass) {
        T t = (T) jVar.d(JvmClassMappingKt.getJavaClass((KClass) kClass));
        Intrinsics.checkExpressionValueIsNotNull(t, "getNavigator(clazz.java)");
        return t;
    }
}
