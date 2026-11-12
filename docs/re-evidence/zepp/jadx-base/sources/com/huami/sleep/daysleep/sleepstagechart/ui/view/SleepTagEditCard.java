package com.huami.sleep.daysleep.sleepstagechart.ui.view;

import android.content.Context;
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
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.ui.SleepTagListAdapter;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.view.NestRecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0002'(B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepTagEditCard;", "Landroid/widget/FrameLayout;", "", "showEdit", "", z.j, "h", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "data", "setData", PointCategory.INIT, "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepTagEditCard$SleepEditListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSelectListener", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepTagListAdapter;", "a", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepTagListAdapter;", "getMAdapter", "()Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepTagListAdapter;", "mAdapter", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "mCounterTv", "c", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "mSelectTag", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepTagEditCard$SleepEditListener;", "mSelectListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "SleepEditListener", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagEditCard extends FrameLayout {
    private static final int e = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SleepTagListAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private TextView mCounterTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SleepTagDataVo mSelectTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private SleepEditListener mSelectListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepTagEditCard$SleepEditListener;", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "info", "", "manualEditTag", "addNeWTag", "closeMakeTag", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface SleepEditListener {
        void addNeWTag(@Nullable SleepTagDataVo info);

        void closeMakeTag();

        void manualEditTag(@Nullable SleepTagDataVo info);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SleepTagDataVo, Unit> {
        public a() {
            super(1);
        }

        public final void a(@Nullable SleepTagDataVo sleepTagDataVo) {
            boolean z = false;
            if (sleepTagDataVo != null && sleepTagDataVo.getTagType() == SleepTagType.ADD.getValue()) {
                z = true;
            }
            if (!z) {
                SleepTagEditCard.this.mSelectTag = sleepTagDataVo;
            } else {
                SleepTagEditCard.this.j(true);
                SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_DETAIL_TAP_DIY_CLICK);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SleepTagDataVo sleepTagDataVo) {
            a(sleepTagDataVo);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public SleepTagEditCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepTagEditCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepTagEditCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SleepTagEditCard sleepTagEditCard, View view) {
        SleepEditListener sleepEditListener = sleepTagEditCard.mSelectListener;
        if (sleepEditListener == null) {
            return;
        }
        sleepEditListener.addNeWTag(sleepTagEditCard.mSelectTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SleepTagEditCard sleepTagEditCard, View view) {
        SleepEditListener sleepEditListener = sleepTagEditCard.mSelectListener;
        if (sleepEditListener == null) {
            return;
        }
        sleepEditListener.closeMakeTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SleepTagEditCard sleepTagEditCard, View view) {
        sleepTagEditCard.j(false);
    }

    private final void h() {
        this.mCounterTv.setText("0/6");
        final EditText editText = (EditText) findViewById(R.id.inputEt);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard$initEditText$lambda-7$$inlined$addTextChangedListener$default$1
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
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: b37
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return SleepTagEditCard.i(editText, this, textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(EditText editText, SleepTagEditCard sleepTagEditCard, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            int i2 = R.id.inputEt;
            if (((EditText) editText.findViewById(i2)).getText().toString().length() > 0) {
                SleepTagDataVo sleepTagDataVo = new SleepTagDataVo(((EditText) editText.findViewById(i2)).getText().toString(), SleepTagType.MANUAL.getValue(), true);
                if (sleepTagEditCard.getMAdapter().has(sleepTagDataVo)) {
                    CustomToast.showShort(editText.getContext(), editText.getContext().getString(R.string.slp_tag_exist));
                } else {
                    sleepTagEditCard.getMAdapter().setSelected(sleepTagDataVo);
                    SleepEditListener sleepEditListener = sleepTagEditCard.mSelectListener;
                    if (sleepEditListener != null) {
                        sleepEditListener.manualEditTag(sleepTagDataVo);
                    }
                    ((EditText) editText.findViewById(i2)).setText("");
                    sleepTagEditCard.mSelectTag = sleepTagDataVo;
                    sleepTagEditCard.j(false);
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
    public final SleepTagListAdapter getMAdapter() {
        return this.mAdapter;
    }

    public final void init() {
        this.mSelectTag = null;
        this.mAdapter.cancelSelect();
    }

    public final void setData(@NotNull List<SleepTagDataVo> data) {
        this.mAdapter.updateData(data);
    }

    public final void setSelectListener(@NotNull SleepEditListener listener) {
        this.mSelectListener = listener;
    }

    @JvmOverloads
    public SleepTagEditCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SleepTagListAdapter sleepTagListAdapter = new SleepTagListAdapter(new ArrayList());
        this.mAdapter = sleepTagListAdapter;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.slp_tag_card_layout, (ViewGroup) this, true);
        ((ConstraintLayout) findViewById(R.id.selectView)).setBackgroundColor(ViewExKt.addAlpha(ContextCompat.getColor(context, R.color.p3), 0.1d));
        int i2 = R.id.tagRV;
        ((NestRecyclerView) findViewById(i2)).setAdapter(sleepTagListAdapter);
        ((NestRecyclerView) findViewById(i2)).setIntercept(true);
        ((TextView) findViewById(R.id.confirmTv)).setOnClickListener(new View.OnClickListener() { // from class: y27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepTagEditCard.e(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.selCancelTv)).setOnClickListener(new View.OnClickListener() { // from class: z27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepTagEditCard.f(this.a, view);
            }
        });
        this.mCounterTv = (TextView) findViewById(R.id.counterTv);
        h();
        sleepTagListAdapter.setOnItemClickListener(new a());
        ((TextView) findViewById(R.id.cancelTv)).setOnClickListener(new View.OnClickListener() { // from class: a37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepTagEditCard.g(this.a, view);
            }
        });
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.manualLayout);
        constraintLayout.setFocusable(true);
        constraintLayout.setFocusableInTouchMode(true);
    }
}
