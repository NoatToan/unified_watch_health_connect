package com.huawei.ui.commonui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import defpackage.qqf;

/* JADX INFO: loaded from: classes43.dex */
public class HealthSpecification extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f23986a;
    private Context d;

    public HealthSpecification(Context context) {
        this(context, null);
        this.d = context;
        a();
    }

    public HealthSpecification(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "HealthSpecification AttributeSet is null");
        } else {
            this.d = context;
            a();
        }
    }

    private void a() {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initView Context is null");
            return;
        }
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initView LayoutInflater is null");
        } else {
            this.f23986a = layoutInflater.inflate(R.layout.health_specification, this);
        }
    }

    private HealthTextView b(int i) {
        View view = this.f23986a;
        HealthTextView healthTextView = null;
        if (view == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initValue View is null");
            return null;
        }
        if (i == 0) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_value_left);
        } else if (i == 1) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_value_mid);
        } else if (i == 2) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_value_right);
        } else {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initValue id does not exist");
        }
        b(healthTextView);
        return healthTextView;
    }

    private HealthSeekBar b() {
        View view = this.f23986a;
        if (view == null) {
            return null;
        }
        return (HealthSeekBar) view.findViewById(R.id.health_specification_health_seek_bar);
    }

    private ImageView a(int i) {
        View view = this.f23986a;
        ImageView imageView = null;
        if (view == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initImageView View is null");
            return null;
        }
        if (i == 0) {
            imageView = (ImageView) view.findViewById(R.id.health_specification_left);
        } else if (i == 1) {
            imageView = (ImageView) view.findViewById(R.id.health_specification_left_mid);
        } else if (i == 2) {
            imageView = (ImageView) view.findViewById(R.id.health_specification_right_mid);
        } else if (i == 3) {
            imageView = (ImageView) view.findViewById(R.id.health_specification_right);
        } else {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initImageView id does not exist");
        }
        b(imageView);
        return imageView;
    }

    private HealthTextView c(int i) {
        View view = this.f23986a;
        HealthTextView healthTextView = null;
        if (view == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initDescription View is null");
            return null;
        }
        if (i == 0) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_description_left);
        } else if (i == 1) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_description_left_mid);
        } else if (i == 2) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_description_right_mid);
        } else if (i == 3) {
            healthTextView = (HealthTextView) view.findViewById(R.id.health_specification_description_right);
        } else {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initDescription id does not exist");
        }
        b(healthTextView);
        return healthTextView;
    }

    private Drawable d() {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initDrawable Context is null");
            return null;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "initDrawable Resources is null");
            return null;
        }
        return resources.getDrawable(R.drawable.shape_round_rectangle_seek_bar);
    }

    private Drawable d(int i) {
        Drawable drawableD = d();
        Context context = this.d;
        if (context == null || drawableD == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "tintDrawable Context or Drawable is null");
            return null;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "tintDrawable Resources is null");
            return null;
        }
        return qqf.c(drawableD, resources.getColor(i));
    }

    private void b(View view) {
        if (view == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "viewSetVisibility View is null");
        } else if (view.getVisibility() == 0) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "viewSetVisibility View do not show");
        } else {
            view.setVisibility(0);
        }
    }

    public void setProgress(int i) {
        HealthSeekBar healthSeekBarB = b();
        if (healthSeekBarB == null) {
            return;
        }
        healthSeekBarB.setProgress(i);
    }

    public void setImageDrawable(int i, int i2, String str) {
        setImageDrawable(i, i2);
        setDescription(i, str);
    }

    public void setImageDrawable(int i, int i2) {
        ImageView imageViewA = a(i);
        Drawable drawableD = d(i2);
        if (imageViewA == null || drawableD == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "setImageDrawable ImageView or Drawable is null");
        } else {
            imageViewA.setImageDrawable(drawableD);
        }
    }

    public void setValue(int i, String str) {
        HealthTextView healthTextViewB = b(i);
        if (healthTextViewB == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "setValue HealthTextView is null");
        } else {
            healthTextViewB.setText(str);
        }
    }

    public void setDescription(int i, String str) {
        HealthTextView healthTextViewC = c(i);
        if (healthTextViewC == null) {
            LogUtil.j("CommonUI_HealthSpecificationSeekBar", "setDescription HealthTextView is null");
        } else {
            healthTextViewC.setText(str);
        }
    }
}
