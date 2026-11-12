package com.xiaomi.fitness.login.internaltest;

import defpackage.im9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/login/internaltest/InternalTestPreference;", "", "<init>", "()V", "IS_SELECT", "", "getIS_SELECT", "()Z", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalTestPreference {

    @NotNull
    public static final InternalTestPreference INSTANCE = new InternalTestPreference();
    private static final boolean IS_SELECT = im9.O();

    private InternalTestPreference() {
    }

    public final boolean getIS_SELECT() {
        return IS_SELECT;
    }
}
