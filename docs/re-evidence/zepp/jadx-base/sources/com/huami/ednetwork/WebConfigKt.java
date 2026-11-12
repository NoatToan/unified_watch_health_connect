package com.huami.ednetwork;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\"4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "", "", "a", "Lkotlin/jvm/functions/Function0;", "getWebHeader", "()Lkotlin/jvm/functions/Function0;", "setWebHeader", "(Lkotlin/jvm/functions/Function0;)V", "webHeader", "ednetwork_release"}, k = 2, mv = {1, 4, 0})
public final class WebConfigKt {

    @NotNull
    private static Function0<? extends Map<String, String>> a = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<Map<String, String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, String> invoke() {
            return new LinkedHashMap();
        }
    }

    @NotNull
    public static final Function0<Map<String, String>> getWebHeader() {
        return a;
    }

    public static final void setWebHeader(@NotNull Function0<? extends Map<String, String>> function0) {
        a = function0;
    }
}
