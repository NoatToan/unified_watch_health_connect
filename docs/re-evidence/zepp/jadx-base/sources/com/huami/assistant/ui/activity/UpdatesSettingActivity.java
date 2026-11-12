package com.huami.assistant.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.assistant.R;
import com.huami.assistant.model.AssistantConfigManager;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.util.AssistantAnalyticsEvents;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.util.Analytics;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesSettingActivity extends BaseActivity {
    private a b;

    public class a extends BaseQuickAdapter<Integer, BaseViewHolder> {
        public a() {
            super(R.layout.item_updates_setting);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Integer num, CompoundButton compoundButton, boolean z) {
            AssistantConfigManager.getInstance().setUpdatesVisible(this.mContext, num.intValue(), z);
            Analytics.event(this.mContext, AssistantAnalyticsEvents.getSwitchEventIdById(num.intValue()), z ? 1 : 0);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder helper, final Integer item) {
            helper.setText(R.id.item_updates_setting_title, UpdateType.valueOf(item.intValue()).categoryResId);
            int i = R.id.item_updates_setting_switch;
            helper.setChecked(i, AssistantConfigManager.getInstance().isUpdatesVisible(this.mContext, item.intValue()));
            helper.setOnCheckedChangeListener(i, new CompoundButton.OnCheckedChangeListener() { // from class: com.huami.assistant.ui.activity.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.b(item, compoundButton, z);
                }
            });
        }
    }

    private void d() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.updates_setting_actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: o48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.updates_setting));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        onBackPressed();
    }

    private void initData() {
        ArrayList arrayList = new ArrayList();
        for (UpdateType updateType : UpdateType.values()) {
            if (updateType.isVisible() && updateType.isDeviceSupport(this)) {
                arrayList.add(Integer.valueOf(updateType.typeId));
            }
        }
        this.b.setNewData(arrayList);
    }

    private void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.updates_setting_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider_line_item));
        recyclerView.addItemDecoration(dividerItemDecoration);
        a aVar = new a();
        this.b = aVar;
        aVar.bindToRecyclerView(recyclerView);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates_setting);
        d();
        initView();
        initData();
    }
}
