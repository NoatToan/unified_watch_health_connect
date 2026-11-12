package com.huami.privacy.plugin;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/privacy/plugin/IsMainProcess;", "Lcom/huami/privacy/plugin/PrivacyPlugin;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/privacy/plugin/CurrentProcessName;", "b", "Lcom/huami/privacy/plugin/CurrentProcessName;", "currentProcessName", "getValue", "()Ljava/lang/Boolean;", "value", "<init>", "(Landroid/content/Context;Lcom/huami/privacy/plugin/CurrentProcessName;)V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class IsMainProcess implements PrivacyPlugin<Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CurrentProcessName currentProcessName;

    public IsMainProcess(@NotNull Context context, @NotNull CurrentProcessName currentProcessName) {
        this.context = context;
        this.currentProcessName = currentProcessName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.privacy.plugin.PrivacyPlugin
    @NotNull
    public Boolean getValue() {
        return Boolean.valueOf(Intrinsics.areEqual(this.context.getApplicationContext().getPackageName(), this.currentProcessName.getValue()));
    }
}
