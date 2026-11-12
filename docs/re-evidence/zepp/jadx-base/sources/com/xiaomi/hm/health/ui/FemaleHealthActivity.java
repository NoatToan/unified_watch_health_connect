package com.xiaomi.hm.health.ui;

import android.app.Activity;
import android.os.Bundle;
import com.chenenyu.router.annotation.Route;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Route({RouterHelper.FEMALE_HEALTH_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/FemaleHealthActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthActivity extends Activity {
    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FemaleMifitViewModel femaleViewModel = FemaleCheckUtil.INSTANCE.getFemaleViewModel();
        if (femaleViewModel != null) {
            FemaleMifitViewModel.jumpToFemaleHealth$default(femaleViewModel, this, false, 2, null);
        }
        finish();
    }
}
