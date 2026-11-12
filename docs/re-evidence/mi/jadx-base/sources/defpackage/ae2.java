package defpackage;

import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity;
import com.xiaomi.fitness.sport.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;

/* JADX INFO: loaded from: classes10.dex */
public final class ae2<VM extends BaseSportVM<CommonSportModel>, VDB extends ViewDataBinding> {
    public static <VM extends BaseSportVM<CommonSportModel>, VDB extends ViewDataBinding> void a(BaseSportingActivity<VM, VDB> baseSportingActivity, IMusicPlayer iMusicPlayer) {
        baseSportingActivity.player = iMusicPlayer;
    }
}
