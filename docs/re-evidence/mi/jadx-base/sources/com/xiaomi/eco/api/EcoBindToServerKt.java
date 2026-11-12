package com.xiaomi.eco.api;

import defpackage.ga0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\",\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"(\u0010\r\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"", "mNodeId", "Ljava/lang/String;", "mToken", "Lga0;", "value", "getNodeId", "(Lga0;)Ljava/lang/String;", "setNodeId", "(Lga0;Ljava/lang/String;)V", "nodeId", "getToken", "setToken", "token", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0})
public final class EcoBindToServerKt {

    @Nullable
    private static String mNodeId = null;

    @NotNull
    private static String mToken = "";

    @Nullable
    public static final String getNodeId(@NotNull ga0 ga0Var) {
        Intrinsics.checkNotNullParameter(ga0Var, "<this>");
        return mNodeId;
    }

    @NotNull
    public static final String getToken(@NotNull ga0 ga0Var) {
        Intrinsics.checkNotNullParameter(ga0Var, "<this>");
        return mToken;
    }

    public static final void setNodeId(@NotNull ga0 ga0Var, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ga0Var, "<this>");
        mNodeId = str;
    }

    public static final void setToken(@NotNull ga0 ga0Var, @NotNull String value) {
        Intrinsics.checkNotNullParameter(ga0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        mToken = value;
    }
}
