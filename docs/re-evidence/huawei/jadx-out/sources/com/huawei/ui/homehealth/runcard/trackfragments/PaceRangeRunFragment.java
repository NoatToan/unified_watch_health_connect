package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.activity.healthdata.AthleticAbilityEmptyActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import defpackage.wka;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes17.dex */
public class PaceRangeRunFragment extends BaseFragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f25875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f25876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f25877c;
    private HealthTextView d;
    private Context e;
    private HealthTextView f;
    private HealthSwitchButton g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private ImageView k;
    private RunningStateIndexData l;
    private OnRuntItemClickListener m;
    private LinearLayout n;
    private boolean o;

    public interface OnRuntItemClickListener {
        void onRunItemClick(int i, boolean z);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.j("Track_PaceRangeRunFragment", "onCreateView view is null");
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pace_range_run, viewGroup, false);
        this.e = getActivity();
        c(viewInflate);
        c();
        e();
        return viewInflate;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.g == compoundButton) {
            this.o = z;
            LogUtil.a("Track_PaceRangeRunFragment", "onCheckedChanged isChecked is ", Boolean.valueOf(z));
            OnRuntItemClickListener onRuntItemClickListener = this.m;
            if (onRuntItemClickListener != null) {
                onRuntItemClickListener.onRunItemClick(1, z);
            }
            c(z);
            e(z);
        }
    }

    private void c(boolean z) {
        if (z) {
            this.n.setClickable(false);
            this.f.setTextColor(ContextCompat.getColor(this.e, R.color.textColorTertiary));
            this.j.setTextColor(ContextCompat.getColor(this.e, R.color.textColorTertiary));
        } else {
            this.n.setClickable(true);
            this.f.setTextColor(ContextCompat.getColor(this.e, R.color.textColorPrimary));
            this.j.setTextColor(ContextCompat.getColor(this.e, R.color.textColorSecondary));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnRuntItemClickListener onRuntItemClickListener;
        int id = view.getId();
        if (R.id.hcrl_running_ability_index_container == id && (onRuntItemClickListener = this.m) != null) {
            onRuntItemClickListener.onRunItemClick(2, this.o);
        }
        if (R.id.htv_current_run == id) {
            Intent intent = new Intent(this.e, (Class<?>) RunningDataActivity.class);
            intent.putExtra("running_level_data", this.l);
            startActivity(intent);
        }
        if (R.id.htv_learn_run == id) {
            Intent intent2 = new Intent(this.e, (Class<?>) AthleticAbilityEmptyActivity.class);
            intent2.putExtra("athletic_ability_empty_flag", "running_no_record");
            startActivity(intent2);
        }
    }

    public void c(OnRuntItemClickListener onRuntItemClickListener) {
        this.m = onRuntItemClickListener;
    }

    private void c(View view) {
        this.g = (HealthSwitchButton) view.findViewById(R.id.hwb_auto_calc_toggle);
        this.n = (LinearLayout) view.findViewById(R.id.hcrl_running_ability_index_container);
        this.f = (HealthTextView) view.findViewById(R.id.htv_running_ability_index);
        this.j = (HealthTextView) view.findViewById(R.id.htv_running_ability_index_value);
        this.k = (ImageView) view.findViewById(R.id.img_pace_range_right_run);
        this.i = (HealthTextView) view.findViewById(R.id.htv_wearing_device);
        this.f25876b = (HealthTextView) view.findViewById(R.id.htv_base_newest_run);
        this.f25877c = (HealthTextView) view.findViewById(R.id.htv_no_wearing_device);
        this.f25875a = (HealthTextView) view.findViewById(R.id.htv_current_run);
        this.h = (HealthTextView) view.findViewById(R.id.htv_professional_guide);
        this.d = (HealthTextView) view.findViewById(R.id.htv_learn_run);
    }

    private void c() {
        a(getActivity());
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("running_level_data");
            if (parcelable instanceof RunningStateIndexData) {
                this.l = (RunningStateIndexData) parcelable;
            }
            z = arguments.getBoolean("setting_auto_calc_key_status", false);
            this.o = z;
            this.g.setChecked(z);
            c(z);
        }
        e(z);
    }

    private void e() {
        this.g.setOnCheckedChangeListener(this);
        this.n.setOnClickListener(this);
        this.f25875a.setOnClickListener(this);
        this.d.setOnClickListener(this);
    }

    private void a(Context context) {
        if (LanguageUtil.ba(context)) {
            a(R.drawable.common_ui_arrow_left);
        } else {
            a(R.drawable.common_ui_arrow_right);
        }
    }

    private void e(boolean z) {
        float fB = b();
        d(fB, z);
        a(fB, z);
    }

    private float b() {
        RunningStateIndexData runningStateIndexData = this.l;
        if (runningStateIndexData == null || runningStateIndexData.getRunningLevelCurrentData() == null) {
            return 0.0f;
        }
        return this.l.getRunningLevelCurrentData().getLastCurrentRunLevel();
    }

    private void d(float f, boolean z) {
        String string;
        String strA = wka.a(f);
        String string2 = getString(R.string.IDS_pace_range_no_input);
        if (z) {
            string = f == 0.0f ? getString(R.string.IDS_hwh_privacy_no_data) : strA;
        } else {
            string = string2;
        }
        e(string);
        int i = R.string.IDS_pace_current_run;
        if (f == 0.0f) {
            strA = string2;
        }
        String string3 = getString(i, strA);
        String string4 = getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_normal);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string3);
        spannableStringBuilder.append((CharSequence) (LanguageUtil.f(this.e) ? "" : " "));
        spannableStringBuilder.append((CharSequence) string4);
        spannableStringBuilder.setSpan(new UrlSpanNoUnderline(spannableStringBuilder.toString()), string3.length(), spannableStringBuilder.length(), 18);
        this.f25875a.setText(spannableStringBuilder);
        this.f25875a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void a(float f, boolean z) {
        if (z) {
            if (f == 0.0f) {
                d();
                return;
            } else {
                a();
                return;
            }
        }
        if (f == 0.0f) {
            h();
        } else {
            j();
        }
    }

    public void e(String str) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    private void a(int i) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    private void j() {
        this.i.setVisibility(8);
        this.f25876b.setVisibility(8);
        this.f25877c.setVisibility(8);
        this.h.setVisibility(8);
        this.f25875a.setVisibility(0);
        this.d.setVisibility(8);
    }

    private void h() {
        this.i.setVisibility(8);
        this.f25876b.setVisibility(8);
        this.f25877c.setVisibility(8);
        this.h.setVisibility(0);
        this.f25875a.setVisibility(8);
        this.d.setVisibility(0);
    }

    private void a() {
        this.i.setVisibility(8);
        this.f25876b.setVisibility(0);
        this.f25877c.setVisibility(8);
        this.h.setVisibility(8);
        this.f25875a.setVisibility(0);
        this.d.setVisibility(8);
    }

    private void d() {
        this.i.setVisibility(0);
        this.f25876b.setVisibility(8);
        this.f25877c.setVisibility(8);
        this.h.setVisibility(8);
        this.f25875a.setVisibility(8);
        this.d.setVisibility(0);
    }

    class UrlSpanNoUnderline extends URLSpan {
        UrlSpanNoUnderline(String str) {
            super(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(PaceRangeRunFragment.this.e, R.color.self_discovery_text_orange));
            textPaint.setUnderlineText(false);
        }
    }
}
