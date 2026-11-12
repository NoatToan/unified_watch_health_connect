package com.huami.hid.utils;

import android.os.Build;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/hid/utils/ReflectHiddenApi;", "", "", "", "methods", "", "a", "([Ljava/lang/String;)Z", "exemptAll$hid_release", "()Z", "exemptAll", "Ljava/lang/Object;", "vmRuntime", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "setHiddenApiExemptions", "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class ReflectHiddenApi {

    @NotNull
    public static final ReflectHiddenApi INSTANCE = new ReflectHiddenApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Object vmRuntime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Method setHiddenApiExemptions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("exception: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                Object objInvoke = null;
                Object objInvoke2 = declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
                }
                Class cls = (Class) objInvoke2;
                Object objInvoke3 = declaredMethod2.invoke(cls, "getRuntime", null);
                Method method = objInvoke3 instanceof Method ? (Method) objInvoke3 : null;
                Object objInvoke4 = declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                setHiddenApiExemptions = objInvoke4 instanceof Method ? (Method) objInvoke4 : null;
                if (method != null) {
                    objInvoke = method.invoke(null, new Object[0]);
                }
                vmRuntime = objInvoke;
            } catch (Exception e) {
                HMLog.info("ReflectHiddenApi", new a(e));
            }
        }
    }

    private ReflectHiddenApi() {
    }

    private final boolean a(String... methods) {
        Method method;
        Object obj = vmRuntime;
        if (obj == null || (method = setHiddenApiExemptions) == null) {
            return false;
        }
        try {
            method.invoke(obj, methods);
            return true;
        } catch (Exception e) {
            HMLog.info("ReflectHiddenApi", new b(e));
            return false;
        }
    }

    public final boolean exemptAll$hid_release() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a("L");
        }
        return true;
    }
}
