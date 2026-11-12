package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.line.HealthLine;
import com.huawei.ui.commonui.oval.HealthOval;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class HealthBodyDetailData extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f28186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthBodyDetail f28187c;
    private Context d;

    public HealthBodyDetailData(Context context) {
        this(context, null);
        b(context);
    }

    public HealthBodyDetailData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("HealthBodyDetailData", "HealthBodyDetailData AttributeSet is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthBodyDetailData);
        try {
            this.f28185a = typedArrayObtainStyledAttributes.getInteger(R.styleable.HealthBodyDetailData_body_detail_or_report, 0);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthBodyDetailData", "HealthBodyDetailData Resources NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("HealthBodyDetailData", "initBodyDetailView Context is null");
            return;
        }
        this.d = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("HealthBodyDetailData", "initBodyDetailView LayoutInflater is null");
            return;
        }
        int i = this.f28185a;
        if (i == 0) {
            this.f28186b = layoutInflater.inflate(R.layout.health_body_detail_data, this);
        } else if (i == 2) {
            this.f28186b = layoutInflater.inflate(R.layout.health_body_detail_data_report_oversea, this);
        } else {
            this.f28186b = layoutInflater.inflate(R.layout.health_body_detail_data_report, this);
        }
        this.f28187c = (HealthBodyDetail) this.f28186b.findViewById(R.id.health_body_detail_data_body);
    }

    private void a(int i) {
        HealthOval healthOval;
        View view = this.f28186b;
        if (view == null) {
            LogUtil.j("HealthBodyDetailData", "initHealthOval View is null");
            return;
        }
        if (i == 1) {
            healthOval = (HealthOval) view.findViewById(R.id.health_body_detail_data_oval_trunk);
        } else if (i == 2) {
            healthOval = (HealthOval) view.findViewById(R.id.health_body_detail_data_oval_left_hand);
        } else if (i == 3) {
            healthOval = (HealthOval) view.findViewById(R.id.health_body_detail_data_oval_right_hand);
        } else if (i == 4) {
            healthOval = (HealthOval) view.findViewById(R.id.health_body_detail_data_oval_left_leg);
        } else if (i == 5) {
            healthOval = (HealthOval) view.findViewById(R.id.health_body_detail_data_oval_right_leg);
        } else {
            LogUtil.j("HealthBodyDetailData", "initHealthOval id does not exist");
            healthOval = null;
        }
        b(healthOval);
    }

    private void e(int i) {
        HealthLine healthLine;
        View view = this.f28186b;
        if (view == null) {
            LogUtil.j("HealthBodyDetailData", "initHealthLine View is null");
            return;
        }
        if (i == 1) {
            healthLine = (HealthLine) view.findViewById(R.id.health_body_detail_data_line_trunk);
        } else if (i == 2) {
            healthLine = (HealthLine) view.findViewById(R.id.health_body_detail_data_line_left_hand);
        } else if (i == 3) {
            healthLine = (HealthLine) view.findViewById(R.id.health_body_detail_data_line_right_hand);
        } else if (i == 4) {
            healthLine = (HealthLine) view.findViewById(R.id.health_body_detail_data_line_left_leg);
        } else if (i == 5) {
            healthLine = (HealthLine) view.findViewById(R.id.health_body_detail_data_line_right_leg);
        } else {
            LogUtil.j("HealthBodyDetailData", "initHealthLine id does not exist");
            healthLine = null;
        }
        b(healthLine);
    }

    private HealthTextView d(int i) {
        View view = this.f28186b;
        HealthTextView healthTextView = null;
        if (view == null) {
            LogUtil.j("HealthBodyDetailData", "initTitle View is null");
            return null;
        }
        if (i == 1) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_title_trunk);
        } else if (i == 2) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_title_left_hand);
        } else if (i == 3) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_title_right_hand);
        } else if (i == 4) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_title_left_leg);
        } else if (i == 5) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_title_right_leg);
        } else {
            LogUtil.j("HealthBodyDetailData", "initTitle id does not exist");
        }
        b(healthTextView);
        return healthTextView;
    }

    private HealthTextView b(int i) {
        View view = this.f28186b;
        HealthTextView healthTextView = null;
        if (view == null) {
            LogUtil.j("HealthBodyDetailData", "initValue View is null");
            return null;
        }
        if (i == 1) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_value_trunk);
        } else if (i == 2) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_value_left_hand);
        } else if (i == 3) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_value_right_hand);
        } else if (i == 4) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_value_left_leg);
        } else if (i == 5) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_body_detail_data_value_right_leg);
        } else {
            LogUtil.j("HealthBodyDetailData", "initValue id does not exist");
        }
        b(healthTextView);
        return healthTextView;
    }

    private void b(View view) {
        if (view == null) {
            LogUtil.j("HealthBodyDetailData", "viewSetVisibility ViewGroup is null");
        } else {
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
        }
    }

    public void setBodyDetailImageView(int i, int i2) {
        HealthBodyDetail healthBodyDetail = this.f28187c;
        if (healthBodyDetail == null) {
            return;
        }
        healthBodyDetail.setImageView(i, i2);
    }

    public void setBodyDetailType(int i) {
        HealthBodyDetail healthBodyDetail = this.f28187c;
        if (healthBodyDetail == null) {
            return;
        }
        healthBodyDetail.setType(i);
    }

    public void setValue(int i, String str) {
        HealthTextView healthTextViewB = b(i);
        if (healthTextViewB == null) {
            LogUtil.j("HealthBodyDetailData", "setValue HealthTextView is null");
        } else {
            healthTextViewB.setText(str);
        }
    }

    public void setContent(int i, int i2, String str) {
        setBodyDetailImageView(i, i2);
        a(i);
        e(i);
        d(i);
        setValue(i, str);
    }
}
