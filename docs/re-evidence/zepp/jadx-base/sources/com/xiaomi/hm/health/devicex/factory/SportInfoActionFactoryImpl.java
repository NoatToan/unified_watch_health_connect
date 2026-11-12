package com.xiaomi.hm.health.devicex.factory;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.huami.devicex.injection.action.SportInfoActionFactory;
import com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/factory/SportInfoActionFactoryImpl;", "Lcom/huami/devicex/injection/action/SportInfoActionFactory;", "", "type", "position", "Landroid/graphics/Bitmap;", "mPosBitmap", "Landroidx/fragment/app/Fragment;", "createFragmentByType", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportInfoActionFactoryImpl implements SportInfoActionFactory {
    @Override // com.huami.devicex.injection.action.SportInfoActionFactory
    @FlowPreview
    @ExperimentalCoroutinesApi
    @Nullable
    public Fragment createFragmentByType(int type, int position, @Nullable Bitmap mPosBitmap) {
        SportDataManager.getInstance();
        if (type == 0) {
            return null;
        }
        if (type != 1) {
            return type != 2 ? null : null;
        }
        DaySleepChartFragment daySleepChartFragmentNewInstance = DaySleepChartFragment.INSTANCE.newInstance(HMPersonInfo.getInstance().getUserInfo().getUserid(), position);
        daySleepChartFragmentNewInstance.setmPosBitmap(mPosBitmap);
        return daySleepChartFragmentNewInstance;
    }
}
