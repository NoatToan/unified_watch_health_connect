package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.net.HttpHeaders;
import com.huami.moving.R;
import com.huami.moving.ui.view.SportingDataView;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0004'&()B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006*"}, d2 = {"Lcom/huami/moving/ui/view/SportingDataView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "info", "", "updateDataInfo", "Lcom/huami/moving/ui/view/SportingDataView$Tips;", "tips", "showTips", "Lcom/huami/moving/ui/view/SportingDataView$Warning;", "warning", "showWarning", "Lcom/huami/moving/ui/view/SportingDataView$ActionListener;", "a", "Lcom/huami/moving/ui/view/SportingDataView$ActionListener;", "getActionListener", "()Lcom/huami/moving/ui/view/SportingDataView$ActionListener;", "setActionListener", "(Lcom/huami/moving/ui/view/SportingDataView$ActionListener;)V", "actionListener", "b", "Lcom/huami/moving/ui/view/SportingDataView$Warning;", "Landroid/widget/TextView;", "getDataTextView", "()Landroid/widget/TextView;", "dataTextView", "getDescTextView", "descTextView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", "ActionListener", "Tips", HttpHeaders.WARNING, "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportingDataView extends LinearLayoutCompat {
    private static final float c = 15.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ActionListener actionListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Warning warning;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/moving/ui/view/SportingDataView$ActionListener;", "", "Lcom/huami/moving/ui/view/SportingDataView$Warning;", "warning", "", "onWarningClick", "Lcom/huami/moving/ui/view/SportingDataView;", ViewHierarchyConstants.VIEW_KEY, "onDataClick", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface ActionListener {
        void onDataClick(@NotNull SportingDataView view);

        void onWarningClick(@NotNull Warning warning);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/moving/ui/view/SportingDataView$Tips;", "", "<init>", "(Ljava/lang/String;I)V", "NO_TIPS", "NO_HEART_RATE_DEVICE", "DEVICE_NOT_SUPPORT", "DEVICE_DISCONNECTED", "BLUETOOTH_NO_ON", "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum Tips {
        NO_TIPS,
        NO_HEART_RATE_DEVICE,
        DEVICE_NOT_SUPPORT,
        DEVICE_DISCONNECTED,
        BLUETOOTH_NO_ON
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/moving/ui/view/SportingDataView$Warning;", "", "<init>", "(Ljava/lang/String;I)V", "NO_WARNING", "HR_DEVICE_LOOSEN", "HR_DEVICE_LOW_POWER", "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum Warning {
        NO_WARNING,
        HR_DEVICE_LOOSEN,
        HR_DEVICE_LOW_POWER
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tips.values().length];
            iArr[Tips.NO_HEART_RATE_DEVICE.ordinal()] = 1;
            iArr[Tips.DEVICE_NOT_SUPPORT.ordinal()] = 2;
            iArr[Tips.DEVICE_DISCONNECTED.ordinal()] = 3;
            iArr[Tips.BLUETOOTH_NO_ON.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SportingDataView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.warning = Warning.NO_WARNING;
        LayoutInflater.from(context).inflate(R.layout.view_sporting_data, this);
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SportingDataView, i, 0);
        int i2 = R.styleable.SportingDataView_dataText;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            ((TypefaceTextView) findViewById(R.id.tv_data)).setText(typedArrayObtainStyledAttributes.getText(i2));
        }
        int i3 = R.styleable.SportingDataView_dataTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ((TypefaceTextView) findViewById(R.id.tv_data)).setTextColor(typedArrayObtainStyledAttributes.getColorStateList(i3));
        }
        int i4 = R.styleable.SportingDataView_dataTextSize;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            ((TypefaceTextView) findViewById(R.id.tv_data)).setTextSize(0, typedArrayObtainStyledAttributes.getDimension(i4, 15.0f));
        }
        int i5 = R.styleable.SportingDataView_descText;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            ((TypefaceTextView) findViewById(R.id.tv_desc)).setText(typedArrayObtainStyledAttributes.getText(i5));
        }
        int i6 = R.styleable.SportingDataView_descTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            ((TypefaceTextView) findViewById(R.id.tv_desc)).setTextColor(typedArrayObtainStyledAttributes.getColorStateList(i6));
        }
        int i7 = R.styleable.SportingDataView_descTextSize;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            ((TypefaceTextView) findViewById(R.id.tv_desc)).setTextSize(0, typedArrayObtainStyledAttributes.getDimension(i7, 15.0f));
        }
        int i8 = R.styleable.SportingDataView_tipsBackground;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            ((TextView) findViewById(R.id.tv_tips)).setBackground(typedArrayObtainStyledAttributes.getDrawable(i8));
        }
        int i9 = R.styleable.SportingDataView_tipsText;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            ((TextView) findViewById(R.id.tv_tips)).setText(typedArrayObtainStyledAttributes.getText(i9));
        }
        int i10 = R.styleable.SportingDataView_tipsTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            ((TextView) findViewById(R.id.tv_tips)).setTextColor(typedArrayObtainStyledAttributes.getColorStateList(i10));
        }
        int i11 = R.styleable.SportingDataView_tipsTextSize;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            ((TextView) findViewById(R.id.tv_tips)).setTextSize(0, typedArrayObtainStyledAttributes.getDimension(i11, 15.0f));
        }
        int i12 = R.styleable.SportingDataView_warningDrawable;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            ((ImageView) findViewById(R.id.iv_warning)).setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i12));
        }
        int i13 = R.styleable.SportingDataView_warningPadding;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            ViewGroup.LayoutParams layoutParams = ((ImageView) findViewById(R.id.iv_warning)).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        ((ImageView) findViewById(R.id.iv_warning)).setOnClickListener(new View.OnClickListener() { // from class: ke7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportingDataView.c(this.a, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: je7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportingDataView.d(this.a, view);
            }
        };
        ((TypefaceTextView) findViewById(R.id.tv_data)).setOnClickListener(onClickListener);
        ((TypefaceTextView) findViewById(R.id.tv_desc)).setOnClickListener(onClickListener);
        ((TextView) findViewById(R.id.tv_tips)).setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SportingDataView sportingDataView, View view) {
        ActionListener actionListener = sportingDataView.getActionListener();
        if (actionListener == null) {
            return;
        }
        actionListener.onWarningClick(sportingDataView.warning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportingDataView sportingDataView, View view) {
        ActionListener actionListener = sportingDataView.getActionListener();
        if (actionListener == null) {
            return;
        }
        actionListener.onDataClick(sportingDataView);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final ActionListener getActionListener() {
        return this.actionListener;
    }

    @NotNull
    public final TextView getDataTextView() {
        return (TypefaceTextView) findViewById(R.id.tv_data);
    }

    @NotNull
    public final TextView getDescTextView() {
        return (TypefaceTextView) findViewById(R.id.tv_desc);
    }

    public final void setActionListener(@Nullable ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public final void showTips(@NotNull Tips tips) {
        String string;
        if (tips == Tips.NO_TIPS) {
            ((TextView) findViewById(R.id.tv_tips)).setVisibility(8);
            ((TypefaceTextView) findViewById(R.id.tv_data)).setVisibility(0);
            return;
        }
        int i = R.id.tv_tips;
        ((TextView) findViewById(i)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.tv_data)).setVisibility(4);
        TextView textView = (TextView) findViewById(i);
        int i2 = WhenMappings.$EnumSwitchMapping$0[tips.ordinal()];
        if (i2 == 1) {
            string = getResources().getString(R.string.sporting_tips_no_hr_device);
        } else if (i2 == 2) {
            string = getResources().getString(R.string.sporting_tips_device_not_support);
        } else if (i2 != 3) {
            string = i2 != 4 ? null : getResources().getString(R.string.running_ble_off);
        } else {
            string = getResources().getString(R.string.running_bracelet_not_connect);
        }
        textView.setText(string);
    }

    public final void showWarning(@NotNull Warning warning) {
        this.warning = warning;
        ((ImageView) findViewById(R.id.iv_warning)).setVisibility(warning == Warning.NO_WARNING ? 8 : 0);
    }

    public final void updateDataInfo(@NotNull String info) {
        ((TypefaceTextView) findViewById(R.id.tv_data)).setText(info);
    }

    public SportingDataView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportingDataView(@NotNull Context context) {
        this(context, null);
    }
}
