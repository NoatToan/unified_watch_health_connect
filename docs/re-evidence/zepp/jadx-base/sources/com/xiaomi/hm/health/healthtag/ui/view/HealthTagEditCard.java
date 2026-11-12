package com.xiaomi.hm.health.healthtag.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.m.x.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.module.ktx.NumberExtKt;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import com.huami.sleep.view.NestRecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthtag.core.dto.HealthDataTagType;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard;
import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0002+,B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0003J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagEditCard;", "Landroid/widget/FrameLayout;", "", "showEdit", "", z.j, "h", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "data", "setData", "", "title", d.o, PointCategory.INIT, "Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagEditCard$EditListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSelectListener", "Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagListAdapter;", "a", "Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagListAdapter;", "getMAdapter", "()Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagListAdapter;", "mAdapter", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "mCounterTv", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "c", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "mSelectTag", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagEditCard$EditListener;", "mSelectListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "EditListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthTagEditCard extends FrameLayout {
    private static final int e = 6;
    private static final double f = 0.2d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthTagListAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private TextView mCounterTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TagInfoVo mSelectTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private EditListener mSelectListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagEditCard$EditListener;", "", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "info", "", "manualEditTag", "addNewTag", "closeMakeTag", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface EditListener {
        void addNewTag(@Nullable TagInfoVo info);

        void closeMakeTag();

        void manualEditTag(@Nullable TagInfoVo info);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " confirmTv.setOnClickListener    " + HealthTagEditCard.this.mSelectTag;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<TagInfoVo, Unit> {
        public b() {
            super(1);
        }

        public final void a(@Nullable TagInfoVo tagInfoVo) {
            boolean z = false;
            if (tagInfoVo != null && tagInfoVo.getTagType() == HealthDataTagType.INSTANCE.getADD()) {
                z = true;
            }
            if (z) {
                HealthTagEditCard.this.j(true);
            } else {
                HealthTagEditCard.this.mSelectTag = tagInfoVo;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TagInfoVo tagInfoVo) {
            a(tagInfoVo);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public HealthTagEditCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HealthTagEditCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HealthTagEditCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HealthTagEditCard healthTagEditCard, View view) {
        HMLog.debug$default(null, healthTagEditCard.new a(), 1, null);
        EditListener editListener = healthTagEditCard.mSelectListener;
        if (editListener == null) {
            return;
        }
        editListener.addNewTag(healthTagEditCard.mSelectTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HealthTagEditCard healthTagEditCard, View view) {
        EditListener editListener = healthTagEditCard.mSelectListener;
        if (editListener == null) {
            return;
        }
        editListener.closeMakeTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HealthTagEditCard healthTagEditCard, View view) {
        healthTagEditCard.j(false);
    }

    @SuppressLint({"SetTextI18n"})
    private final void h() {
        this.mCounterTv.setText("0/6");
        final EditText editText = (EditText) findViewById(R.id.inputEt);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard$initEditText$lambda-7$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                this.a.mCounterTv.setText(((EditText) editText.findViewById(R.id.inputEt)).getText().toString().length() + "/6");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xx3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return HealthTagEditCard.i(editText, this, textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(EditText editText, HealthTagEditCard healthTagEditCard, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            int i2 = R.id.inputEt;
            if (((EditText) editText.findViewById(i2)).getText().toString().length() > 0) {
                TagInfoVo tagInfoVo = new TagInfoVo(((EditText) editText.findViewById(i2)).getText().toString(), SleepTagType.MANUAL.getValue(), true);
                if (healthTagEditCard.getMAdapter().has(tagInfoVo)) {
                    CustomToast.showShort(editText.getContext(), editText.getContext().getString(com.huami.watch.hmwatchmanager.R.string.slp_tag_exist));
                } else {
                    healthTagEditCard.getMAdapter().setSelected(tagInfoVo);
                    EditListener editListener = healthTagEditCard.mSelectListener;
                    if (editListener != null) {
                        editListener.manualEditTag(tagInfoVo);
                    }
                    ((EditText) editText.findViewById(i2)).setText("");
                    healthTagEditCard.mSelectTag = tagInfoVo;
                    healthTagEditCard.j(false);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean showEdit) {
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.manualLayout), showEdit);
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.selectView), !showEdit);
        int i = R.id.inputEt;
        EditText editText = (EditText) findViewById(i);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        if (showEdit) {
            Object systemService = getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput((EditText) findViewById(i), 0);
        } else {
            Object systemService2 = getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService2).hideSoftInputFromWindow(((EditText) findViewById(i)).getWindowToken(), 0);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final HealthTagListAdapter getMAdapter() {
        return this.mAdapter;
    }

    public final void init() {
        this.mSelectTag = null;
        this.mAdapter.cancelSelect();
    }

    public final void setData(@NotNull List<TagInfoDto> data) {
        this.mAdapter.updateData(data);
    }

    public final void setSelectListener(@NotNull EditListener listener) {
        this.mSelectListener = listener;
    }

    public final void setTitle(@NotNull String title) {
        ((TextView) findViewById(R.id.tagTitleTv)).setText(title);
    }

    @JvmOverloads
    public HealthTagEditCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HealthTagListAdapter healthTagListAdapter = new HealthTagListAdapter(new ArrayList());
        this.mAdapter = healthTagListAdapter;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(com.huami.watch.hmwatchmanager.R.layout.health_tag_card_layout, (ViewGroup) this, true).findViewById(com.huami.watch.hmwatchmanager.R.id.selectView).setBackgroundTintList(ColorStateList.valueOf(NumberExtKt.addAlpha(ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.s53), 0.2d)));
        int i2 = R.id.tagRV;
        ((NestRecyclerView) findViewById(i2)).setAdapter(healthTagListAdapter);
        ((NestRecyclerView) findViewById(i2)).setIntercept(true);
        ((TextView) findViewById(R.id.confirmTv)).setOnClickListener(new View.OnClickListener() { // from class: ux3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthTagEditCard.e(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.selCancelTv)).setOnClickListener(new View.OnClickListener() { // from class: vx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthTagEditCard.f(this.a, view);
            }
        });
        this.mCounterTv = (TextView) findViewById(com.huami.watch.hmwatchmanager.R.id.counterTv);
        h();
        healthTagListAdapter.setOnItemClickListener(new b());
        ((TextView) findViewById(R.id.cancelTv)).setOnClickListener(new View.OnClickListener() { // from class: wx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthTagEditCard.g(this.a, view);
            }
        });
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.manualLayout);
        constraintLayout.setFocusable(true);
        constraintLayout.setFocusableInTouchMode(true);
    }
}
