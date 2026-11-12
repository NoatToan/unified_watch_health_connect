package defpackage;

import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.common.UserView;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.base.BaseHistoryModel;

/* JADX INFO: loaded from: classes19.dex */
public class umx extends BaseHistoryModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f50375a;
    private long d;

    public umx(long j, long j2) {
        this.f50375a = j;
        this.d = j2;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.base.BaseHistoryModel, com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.icommon.IHistoryModel
    public long queryModelStartTime() {
        return this.f50375a;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.icommon.IHistoryModel
    public UserView queryUserView() {
        return UserView.DETAIL_DATAS;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.base.BaseHistoryModel, com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.model.icommon.IHistoryModel
    public long queryModelEndTime() {
        return this.d;
    }
}
