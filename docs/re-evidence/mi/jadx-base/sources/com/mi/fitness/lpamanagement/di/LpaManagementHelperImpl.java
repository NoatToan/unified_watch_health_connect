package com.mi.fitness.lpamanagement.di;

import android.content.Context;
import com.mi.fitness.lpamanagement.export.LpaManagementHelper;
import com.mi.fitness.lpamanagement.ui.LpaManagementFragment;
import com.mi.fitness.lpamanagement.ui.download.DownloadProfileFragment;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/mi/fitness/lpamanagement/di/LpaManagementHelperImpl;", "Lcom/mi/fitness/lpamanagement/export/LpaManagementHelper;", "<init>", "()V", "goLpaManagement", "", "context", "Landroid/content/Context;", "lpaTest", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LpaManagementHelperImpl implements LpaManagementHelper {
    @Override // com.mi.fitness.lpamanagement.export.LpaManagementHelper
    public void goLpaManagement(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        dih.a().e(context, new FragmentParams.b().e(LpaManagementFragment.class).b());
    }

    @Override // com.mi.fitness.lpamanagement.export.LpaManagementHelper
    public void lpaTest(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DownloadProfileFragment.INSTANCE.startDownloadProfile("1$ggckoem.prod.ondemandconnectivity.com$4958BF1CCC127D689B780129FF17E3A63B5118D8724A25DD89431C34523CEA10", context);
    }
}
