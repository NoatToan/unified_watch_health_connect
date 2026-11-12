package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.imageload.HMLoadListener;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class AllActionsActivity extends BaseTitleActivity {
    private RecyclerView x;
    private ArrayList<ActionContent> y;

    public class a extends CommonRecycleAdapter<ActionContent> {
        public final /* synthetic */ TrainerInfo d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.training.ui.activity.AllActionsActivity$a$a, reason: collision with other inner class name */
        public class C1021a implements HMLoadListener {
            public final /* synthetic */ ImageView a;
            public final /* synthetic */ CommonViewHolder b;

            public C1021a(ImageView imageView, CommonViewHolder commonViewHolder) {
                this.a = imageView;
                this.b = commonViewHolder;
            }

            @Override // com.xiaomi.hm.health.imageload.HMLoadListener
            public boolean onLoadFailed(Exception exc) {
                this.a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.b.setVisibility(R.id.view_front_bg, 8);
                return false;
            }

            @Override // com.xiaomi.hm.health.imageload.HMLoadListener
            public boolean onLoadFinish(Object obj) {
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, List list, TrainerInfo trainerInfo) {
            super(i, i2, list);
            this.d = trainerInfo;
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, ActionContent actionContent) {
            ActionVideo actionVideo;
            List<ActionVideo> list = actionContent.videos;
            if (list == null || list.size() <= 0) {
                return;
            }
            if (actionContent.videos.size() == 2) {
                actionVideo = actionContent.videos.get(0).gender.intValue() == this.d.gender ? actionContent.videos.get(0) : actionContent.videos.get(1);
            } else {
                actionVideo = actionContent.videos.get(0);
            }
            ImageView imageView = (ImageView) commonViewHolder.getView(R.id.imv_background_item);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            commonViewHolder.setVisibility(R.id.view_front_bg, 0);
            Context context = imageView.getContext();
            String str = actionVideo.thumbnail;
            int i = R.drawable.icon_default_item_head;
            OtherUtils.loadWithGlideListener(context, imageView, str, i, i, new C1021a(imageView, commonViewHolder));
            commonViewHolder.setText(R.id.tx_video_name, actionVideo.name);
            if ("COUNT".equals(actionContent.type)) {
                commonViewHolder.setText(R.id.tx_repeat_times, AllActionsActivity.this.getResources().getQuantityString(R.plurals.with_unit_times, actionContent.repeatNumber.intValue(), actionContent.repeatNumber));
            } else {
                int longByGender = (int) (ParseJsonUtil.getLongByGender(actionContent.duration, this.d) / 1000);
                commonViewHolder.setText(R.id.tx_repeat_times, AllActionsActivity.this.getResources().getQuantityString(R.plurals.next_rest_time_seconds, longByGender, Integer.valueOf(longByGender)));
            }
            if (actionContent.nextRestTime.longValue() > 0) {
                int iLongValue = (int) (actionContent.nextRestTime.longValue() / 1000);
                commonViewHolder.setText(R.id.tx_rest_time, AllActionsActivity.this.getResources().getQuantityString(R.plurals.next_rest_time_seconds, iLongValue, Integer.valueOf(iLongValue)));
            } else {
                commonViewHolder.setVisibility(R.id.divider_line, 8);
                commonViewHolder.setVisibility(R.id.ll_rest, 8);
            }
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(ActionContent actionContent, int i) {
            Intent intent = new Intent(AllActionsActivity.this, (Class<?>) ActionDetailActivity.class);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT, AllActionsActivity.this.y);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, i);
            AllActionsActivity.this.startActivity(intent);
        }
    }

    private void initView() {
        TrainingDetail trainingDetail = (TrainingDetail) getIntent().getSerializableExtra("TRAINING_DETAIL");
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), trainingDetail != null ? trainingDetail.name : getString(R.string.all_actions), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.x = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.x.setLayoutManager(linearLayoutManager);
        LinearLayoutDecoration linearLayoutDecoration = new LinearLayoutDecoration(this, 1, R.dimen.divider, R.color.s4);
        int i2 = R.dimen.item_horizontal_margin;
        linearLayoutDecoration.setExtraPaddingStart(i2);
        linearLayoutDecoration.setExtraPaddingEnd(i2);
        linearLayoutDecoration.setExtraColor(i);
        this.x.addItemDecoration(linearLayoutDecoration);
        ArrayList<ActionContent> arrayList = (ArrayList) getIntent().getSerializableExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT);
        this.y = arrayList;
        m(arrayList);
    }

    private void m(List<ActionContent> list) {
        this.x.setAdapter(new a(R.layout.item_train_action, R.id.ll_item, list, TrainerInfo.get()));
    }

    public static void startActivity(Context context, ArrayList<ActionContent> arrayList, TrainingDetail trainingDetail) {
        Intent intent = new Intent(context, (Class<?>) AllActionsActivity.class);
        intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT, arrayList);
        intent.putExtra("TRAINING_DETAIL", trainingDetail);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycleview);
        initView();
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.MOVEMENT_LIST_VIEW_NUM);
    }
}
