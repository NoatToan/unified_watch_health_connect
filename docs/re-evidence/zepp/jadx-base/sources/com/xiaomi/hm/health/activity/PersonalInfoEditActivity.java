package com.xiaomi.hm.health.activity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.activity.PersonalInfoEditActivity;
import com.xiaomi.hm.health.databinding.ActivityPersonalInfoEditBinding;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/activity/PersonalInfoEditActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "empty", "", "o", "r", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/databinding/ActivityPersonalInfoEditBinding;", "x", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/databinding/ActivityPersonalInfoEditBinding;", "viewBinding", "Landroid/text/InputFilter;", "y", "Landroid/text/InputFilter;", "inputFilters", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PersonalInfoEditActivity extends BaseTitleActivity {

    @NotNull
    public static final String KEY_STATE = "state";
    public static final int MAX_CONTENT_LENGTH_CHINESE = 50;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new PersonalInfoEditActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityPersonalInfoEditBinding.class)));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private InputFilter inputFilters = new InputFilter() { // from class: gv5
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return PersonalInfoEditActivity.q(charSequence, i, i2, spanned, i3, i4);
        }
    };
    public static final /* synthetic */ KProperty<Object>[] z = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PersonalInfoEditActivity.class), "viewBinding", "getViewBinding()Lcom/xiaomi/hm/health/databinding/ActivityPersonalInfoEditBinding;"))};

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityPersonalInfoEditBinding n() {
        return (ActivityPersonalInfoEditBinding) this.viewBinding.getValue(this, z[0]);
    }

    private final void o(boolean empty) {
        setSystemBarMode(true);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(getBaseContext(), R.color.white100), getString(R.string.ft_title_activity_personal_info));
        getTitleTextView().setTextColor(ContextCompat.getColor(getBaseContext(), R.color.color_333333));
        getTitleTextView().setTextSize(17.0f);
        getLeft().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(getBaseContext(), R.color.color_333333), PorterDuff.Mode.SRC_ATOP));
        getRightTitle().setText(R.string.person_info_finish);
        getRightTitle().setTextSize(16.0f);
        r(empty);
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: hv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoEditActivity.p(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(PersonalInfoEditActivity personalInfoEditActivity, View view) {
        personalInfoEditActivity.setResult(-1, new Intent().putExtra("state", personalInfoEditActivity.n().ftCareTopicEdit.getText().toString()));
        personalInfoEditActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (spanned.toString().length() + charSequence.toString().length() > 50) {
            return "";
        }
        return (!(charSequence.length() == 0) || i4 - i3 < 1) ? charSequence : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean empty) {
        getRightTitle().setTextColor(empty ? ContextCompat.getColor(getBaseContext(), R.color.text_hint) : ContextCompat.getColor(getBaseContext(), R.color.cl_ff6000));
        getRightTitle().setEnabled(!empty);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(n().getRoot());
        String stringExtra = getIntent().getStringExtra("state");
        if (stringExtra != null) {
            if (TextUtils.isEmpty(stringExtra)) {
                n().ftCareTopicEdit.setHint(getString(R.string.ft_title_activity_personal_info_edit_hint));
            } else {
                n().ftCareTopicEdit.setText(stringExtra);
                n().ftCareTopicEdit.setSelection(stringExtra.length());
            }
        }
        o(stringExtra == null || stringExtra.length() == 0);
        n().ftCareTopicEdit.setFilters(new InputFilter[]{this.inputFilters});
        n().ftCareTopicEdit.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.hm.health.activity.PersonalInfoEditActivity.onCreate.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s) {
                PersonalInfoEditActivity.this.n().ftCareTopicEditCount.setText(PersonalInfoEditActivity.this.getString(R.string.feed_back_contnet_limit, new Object[]{NumberFormat.getNumberInstance().format(Integer.valueOf(s.toString().length())), NumberFormat.getNumberInstance().format((Object) 50)}));
                PersonalInfoEditActivity.this.r(s.toString().length() == 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
            }
        });
        n().ftCareTopicEditCount.setText(getString(R.string.feed_back_contnet_limit, new Object[]{NumberFormat.getNumberInstance().format(Integer.valueOf(n().ftCareTopicEditCount.getText().length())), NumberFormat.getNumberInstance().format((Object) 50)}));
    }
}
