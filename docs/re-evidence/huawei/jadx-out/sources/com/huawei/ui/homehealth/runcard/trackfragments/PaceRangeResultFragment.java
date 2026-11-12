package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes17.dex */
public class PaceRangeResultFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f25871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f25872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25873c;
    private RelativeLayout d;
    private RelativeLayout e;
    private HealthTextView f;
    private boolean g = true;
    private HealthTextView h;
    private OnResultItemClickListener i;
    private HealthTextView j;

    public interface OnResultItemClickListener {
        void onResultItemClick(int i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.j("Track_PaceRangeResultFragment", "onCreateView view is null");
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pace_range_result, viewGroup, false);
        b(viewInflate);
        d();
        c();
        return viewInflate;
    }

    private void b(View view) {
        this.e = (RelativeLayout) view.findViewById(R.id.layout_pace_range_distance);
        this.d = (RelativeLayout) view.findViewById(R.id.layout_pace_range_achievement);
        this.f25872b = (ImageView) view.findViewById(R.id.img_pace_range_right_distance);
        this.f25871a = (ImageView) view.findViewById(R.id.img_pace_range_right_achievement);
        this.h = (HealthTextView) view.findViewById(R.id.tv_pace_range_right_distance);
        this.j = (HealthTextView) view.findViewById(R.id.tv_pace_range_label_achievement);
        this.f = (HealthTextView) view.findViewById(R.id.tv_pace_range_right_achievement);
    }

    private void d() {
        String string;
        FragmentActivity activity = getActivity();
        this.f25873c = activity;
        e(activity);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            String string2 = arguments.getString("achievement_value", "");
            string = arguments.getString("distance_value", "");
            str = string2;
        } else {
            string = "";
        }
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        d(string);
    }

    private void c() {
        this.e.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.h.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.PaceRangeResultFragment.5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                PaceRangeResultFragment.this.b(!editable.toString().trim().equals(PaceRangeResultFragment.this.getString(R.string.IDS_pace_range_no_input)));
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnResultItemClickListener onResultItemClickListener;
        OnResultItemClickListener onResultItemClickListener2;
        int id = view.getId();
        if (R.id.layout_pace_range_distance == id && (onResultItemClickListener2 = this.i) != null) {
            onResultItemClickListener2.onResultItemClick(1);
        }
        if (R.id.layout_pace_range_achievement == id && (onResultItemClickListener = this.i) != null && this.g) {
            onResultItemClickListener.onResultItemClick(2);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        b(!this.h.getText().toString().trim().equals(getString(R.string.IDS_pace_range_no_input)));
    }

    private void e(Context context) {
        if (LanguageUtil.ba(context)) {
            c(R.drawable.common_ui_arrow_left);
            e(R.drawable.common_ui_arrow_left);
        } else {
            c(R.drawable.common_ui_arrow_right);
            e(R.drawable.common_ui_arrow_right);
        }
    }

    public void c(OnResultItemClickListener onResultItemClickListener) {
        this.i = onResultItemClickListener;
    }

    private void c(int i) {
        ImageView imageView = this.f25872b;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    private void e(int i) {
        ImageView imageView = this.f25871a;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void d(String str) {
        HealthTextView healthTextView = this.h;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void b(String str) {
        HealthTextView healthTextView = this.f;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            a();
        } else {
            b();
        }
    }

    private void a() {
        b(ContextCompat.getColor(this.f25873c, R.color.textColorPrimary));
        a(ContextCompat.getColor(this.f25873c, R.color.textColorSecondary));
        c(true);
    }

    private void b() {
        b(ContextCompat.getColor(this.f25873c, R.color.textColorTertiary));
        a(ContextCompat.getColor(this.f25873c, R.color.textColorTertiary));
        c(false);
    }

    private void a(int i) {
        HealthTextView healthTextView = this.f;
        if (healthTextView != null) {
            healthTextView.setTextColor(i);
        }
    }

    private void b(int i) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setTextColor(i);
        }
    }

    private void c(boolean z) {
        if (this.d != null) {
            this.g = z;
        }
    }
}
