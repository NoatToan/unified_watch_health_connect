package com.xiaomi.xms.wearable;

import android.app.Activity;
import android.content.Context;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.xms.wearable.ui.ThirdAppListFragment;
import com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment;
import com.xms.wearable.export.XmsManager;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/xms/wearable/XmsManagerImpl;", "Lcom/xms/wearable/export/XmsManager;", "<init>", "()V", "gotoDeviceAuthorizationPage", "", "context", "Landroid/content/Context;", "gotoDebugPage", "Landroid/app/Activity;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class XmsManagerImpl implements XmsManager {
    @Override // com.xms.wearable.export.XmsManager
    public void gotoDebugPage(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        dih.a().e(context, new FragmentParams.b().e(ThirdAppDebugFragment.class).b());
    }

    @Override // com.xms.wearable.export.XmsManager
    public void gotoDeviceAuthorizationPage(@Nullable Context context) {
        if (context != null) {
            dih.a().e(context, new FragmentParams.b().e(ThirdAppListFragment.class).b());
        }
    }
}
