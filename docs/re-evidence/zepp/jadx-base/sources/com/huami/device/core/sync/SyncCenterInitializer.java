package com.huami.device.core.sync;

import android.content.Context;
import androidx.startup.Initializer;
import com.huami.koinstartup.StartKoinInitializer;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/device/core/sync/SyncCenterInitializer;", "Landroidx/startup/Initializer;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "create", "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class SyncCenterInitializer implements Initializer<Unit> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt__CollectionsKt.mutableListOf(StartKoinInitializer.class);
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        HMLog.info("SyncCenter-startup", new Function0<String>() { // from class: com.huami.device.core.sync.SyncCenterInitializer.create.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "SyncCenter module start up.";
            }
        });
        SyncCenterFactory.INSTANCE.init$sync_center_release(context);
    }
}
