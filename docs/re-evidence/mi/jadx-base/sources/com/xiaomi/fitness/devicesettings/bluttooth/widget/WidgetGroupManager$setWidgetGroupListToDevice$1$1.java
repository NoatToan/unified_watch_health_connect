package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.eu6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManager$setWidgetGroupListToDevice$1$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetGroupManager$setWidgetGroupListToDevice$1$1 implements OnSyncCallback {
    final /* synthetic */ eu6<Boolean> $callback;

    public WidgetGroupManager$setWidgetGroupListToDevice$1$1(eu6<Boolean> eu6Var) {
        this.$callback = eu6Var;
    }

    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
    public void onError(String did, int type, int code) {
        ScopeExtKt.scope$default(null, new WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1(code, this.$callback, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
    public void onSuccess(String did, int type, SyncResult result) {
        ScopeExtKt.scope$default(null, new WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1(result, this.$callback, this, did, type, null), 1, null);
    }
}
