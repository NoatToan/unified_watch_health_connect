package com.huawei.ui.main.stories.privacy.template.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyDayDataView extends LinearLayout implements BaseComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCardView f28721b;
    private HealthRecycleView d;

    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public View getView(Context context) {
        return this;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public void setPresenter(PrivacyDetailFragmentContract.PrivacyFragmentPresenter privacyFragmentPresenter) {
    }

    public PrivacyDayDataView(Context context) {
        this(context, null);
    }

    public PrivacyDayDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28720a = context;
        a();
    }

    private void a() {
        Context context = this.f28720a;
        if (context != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            if (layoutInflaterFrom != null) {
                layoutInflaterFrom.inflate(R.layout.privacy_day_data_view, this);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f28720a);
            this.f28721b = (HealthCardView) findViewById(R.id.privacy_card_view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.privacy_day_data_recycle_view);
            this.d = healthRecycleView;
            healthRecycleView.setLayoutManager(linearLayoutManager);
            this.d.b(false);
            this.d.e(false);
            setBackgroundColor(getResources().getColor(R.color.transparent));
            return;
        }
        LogUtil.j("PrivacyDayDataView", "mContext is null");
    }

    public void setAdapter(DayDataViewAdapter dayDataViewAdapter) {
        this.d.setAdapter(dayDataViewAdapter);
    }

    public void setCardViewBackground(Drawable drawable) {
        this.f28721b.setBackground(drawable);
    }
}
