package com.xiaomi.fitness.active.pk;

import com.xiaomi.fitness.active.pk.push.ActivePkSchemaHandler;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.xfl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ActivePkComponent;", "", "<init>", "()V", "initPush", "", "reportCountryAndLanguage", "reportCountryAndLanguageToServerIfNeed", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "active_pk")
public final class ActivePkComponent {

    @NotNull
    public static final String TAG = "ActivePkComponent";

    private final void reportCountryAndLanguageToServerIfNeed() {
        RegionExtKt.getInstance(RegionManager.INSTANCE).reportCountryAndLanguageToServerIfNeed();
    }

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void initPush() {
        xfl.a().d(new ActivePkSchemaHandler());
    }

    @ComponentTask(notEarlierThan = 9, notLaterThan = 8, onMainThread = false)
    public final void reportCountryAndLanguage() {
        reportCountryAndLanguageToServerIfNeed();
    }
}
