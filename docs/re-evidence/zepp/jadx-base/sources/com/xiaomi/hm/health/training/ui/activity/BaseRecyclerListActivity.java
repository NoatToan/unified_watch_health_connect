package com.xiaomi.hm.health.training.ui.activity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import de.greenrobot.event.EventBus;
import java.util.List;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseRecyclerListActivity<T> extends BaseTitleActivity {
    public RecyclerView recycler_view;
    public TrainerInfo trainer = TrainerInfo.get();

    @Inject
    public TrainingNavigationController x;

    private void l() {
        this.x = TrainingInjection.get().getNavigationController();
    }

    public void findViews() {
        this.recycler_view = (RecyclerView) $(R.id.recycler_view);
    }

    public abstract EventReqTrainingData.MethodType getMethodType();

    public void initRecyclerView() {
        this.recycler_view.setLayoutManager(new LinearLayoutManager(this));
        this.recycler_view.addItemDecoration(new LinearLayoutDecoration(this, 1, R.dimen.divider_size_dp8, R.color.s4));
        this.recycler_view.setHasFixedSize(true);
    }

    public abstract void loadData();

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l();
        EventBus.getDefault().register(this);
        GlobalTitleStyleKt.setUnifyTitleStyle(this, provideTitleText(), "");
        setContentView(R.layout.activity_recycleview);
        findViews();
        initRecyclerView();
        loadData();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventReqTrainingData eventReqTrainingData) {
        if (eventReqTrainingData.method == getMethodType().method) {
            Object obj = eventReqTrainingData.respData;
            if (obj != null && eventReqTrainingData.resultFlag == 0) {
                updateListUI((List) obj);
            } else if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
                IconToast.showError(this, R.string.net_not_work);
            } else {
                IconToast.showError(this, R.string.load_error);
            }
        }
    }

    public abstract String provideTitleText();

    public abstract void updateListUI(List<T> list);
}
