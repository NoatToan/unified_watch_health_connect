package com.xiaomi.fitness.steps;

import defpackage.cbk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/steps/MiuiFeatureParser;", "", "<init>", "()V", "getBoolean", "", "name", "", "defaultValue", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiFeatureParser {

    @NotNull
    public static final MiuiFeatureParser INSTANCE = new MiuiFeatureParser();

    private MiuiFeatureParser() {
    }

    public final boolean getBoolean(@Nullable String name, boolean defaultValue) {
        Object objC = cbk.c("miui.util.FeatureParser", "getBoolean", new Class[]{String.class, Boolean.TYPE}, name, Boolean.valueOf(defaultValue));
        return (objC == null || !(objC instanceof Boolean)) ? defaultValue : ((Boolean) objC).booleanValue();
    }
}
