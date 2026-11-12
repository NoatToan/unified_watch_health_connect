package com.xiaomi.hm.health.device.settings.alert;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "", "", "a", "Ljava/lang/Integer;", "getActionId", "()Ljava/lang/Integer;", "actionId", "Ljava/lang/Class;", "Landroid/app/Activity;", "b", "Ljava/lang/Class;", "getClz", "()Ljava/lang/Class;", "clz", "<init>", "(Ljava/lang/Integer;Ljava/lang/Class;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class ItemAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Integer actionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Class<? extends Activity> clz;

    public ItemAction(@IdRes @Nullable Integer num, @NotNull Class<? extends Activity> cls) {
        this.actionId = num;
        this.clz = cls;
    }

    @Nullable
    public final Integer getActionId() {
        return this.actionId;
    }

    @NotNull
    public final Class<? extends Activity> getClz() {
        return this.clz;
    }
}
