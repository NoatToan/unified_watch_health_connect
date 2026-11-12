package com.huami.applet.jsengine.plugin;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/applet/jsengine/plugin/Method;", "", "", "component1", "component2", "action", "module", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "getModule", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Method {

    @NotNull
    private final String action;

    @NotNull
    private final String module;

    public Method(@NotNull String str, @NotNull String str2) {
        this.action = str;
        this.module = str2;
    }

    public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = method.action;
        }
        if ((i & 2) != 0) {
            str2 = method.module;
        }
        return method.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final Method copy(@NotNull String action, @NotNull String module) {
        return new Method(action, module);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Method)) {
            return false;
        }
        Method method = (Method) other;
        return Intrinsics.areEqual(this.action, method.action) && Intrinsics.areEqual(this.module, method.module);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.module.hashCode();
    }

    @NotNull
    public String toString() {
        return "Method(action=" + this.action + ", module=" + this.module + ')';
    }
}
