package com.xiaomi.hm.health.remote;

import java.lang.reflect.Field;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001J4\u0010\f\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/remote/Reflection;", "", "Ljava/lang/Class;", "clz", "", "fieldName", "inst", "a", "clzName", "getClassMember", "value", "", "setClassMember", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Reflection {

    @NotNull
    public static final Reflection INSTANCE = new Reflection();

    private Reflection() {
    }

    private final Object a(Class<Object> clz, String fieldName, Object inst) throws NoSuchFieldException {
        Field declaredField = clz.getDeclaredField(fieldName);
        declaredField.setAccessible(true);
        return declaredField.get(inst);
    }

    public static /* synthetic */ Object b(Reflection reflection, Class cls, String str, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return reflection.a(cls, str, obj);
    }

    public static /* synthetic */ Object getClassMember$default(Reflection reflection, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return reflection.getClassMember(str, str2, obj);
    }

    public static /* synthetic */ void setClassMember$default(Reflection reflection, Class cls, String str, Object obj, Object obj2, int i, Object obj3) throws IllegalAccessException, NoSuchFieldException {
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            obj2 = null;
        }
        reflection.setClassMember(cls, str, obj, obj2);
    }

    @Nullable
    public final Object getClassMember(@NotNull String clzName, @NotNull String fieldName, @Nullable Object inst) {
        return a(Class.forName(clzName), fieldName, inst);
    }

    public final void setClassMember(@NotNull Class<Object> clz, @NotNull String fieldName, @Nullable Object inst, @Nullable Object value) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = clz.getDeclaredField(fieldName);
        declaredField.setAccessible(true);
        declaredField.set(inst, value);
    }
}
