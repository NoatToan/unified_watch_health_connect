package com.xiaomi.fitness.service;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000528\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/service/ActivityForServiceLauncher;", "", "startForActivityResult", "", "intent", "Landroid/content/Intent;", "callBack", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "data", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ActivityForServiceLauncher {
    void startForActivityResult(@NotNull Intent intent, @NotNull Function2<? super Integer, ? super Intent, Unit> callBack);
}
