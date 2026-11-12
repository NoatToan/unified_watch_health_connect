package com.huami.sky.ui.setting;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.sky.ui.R;
import com.huami.sky.ui.setting.PlaySettingPickDialog;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.WheelView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0014R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rRT\u0010\u001a\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/sky/ui/setting/PlaySettingPickDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", "initView", "", "item", "", "setCurrentItem", "getCurrentItem", "", "hasPadding", "", "e", "[Ljava/lang/Integer;", "playSettingArr", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "minutes", "f", "Lkotlin/jvm/functions/Function2;", "getCompleteListener", "()Lkotlin/jvm/functions/Function2;", "setCompleteListener", "(Lkotlin/jvm/functions/Function2;)V", "completeListener", "Lcom/huami/widget/wheelview/WheelView;", "g", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "h", LogUtil.I, "mCurPos", "", "i", "[I", "gradientColorArr", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlaySettingPickDialog extends BaseDialogFragment {
    public static final int DURATION_MINUTES_120 = 120;
    public static final int DURATION_MINUTES_15 = 15;
    public static final int DURATION_MINUTES_180 = 180;
    public static final int DURATION_MINUTES_240 = 240;
    public static final int DURATION_MINUTES_30 = 30;
    public static final int DURATION_MINUTES_45 = 45;
    public static final int DURATION_MINUTES_60 = 60;
    public static final int DURATION_MINUTES_90 = 90;
    public static final int DURATION_NO_LIMIT = -1;
    public static final int MAX_MINUTES = 90;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> completeListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private WheelView wheelView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mCurPos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Integer[] playSettingArr = {15, 30, 45, 60, 90, 120, 180, 240, -1};

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final int[] gradientColorArr = {Color.parseColor("#00CCCCCC"), Color.parseColor("#80CCCCCC"), Color.parseColor("#00CCCCCC")};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WheelView wheelView = PlaySettingPickDialog.this.wheelView;
            Objects.requireNonNull(wheelView);
            return "wheelView.currentItem " + wheelView.getCurrentItem();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PlaySettingPickDialog playSettingPickDialog, View view) {
        playSettingPickDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PlaySettingPickDialog playSettingPickDialog, View view) {
        Function2<Integer, Integer, Unit> completeListener;
        HMLog.info("PlaySettingPickDialog", playSettingPickDialog.new a());
        WheelView wheelView = playSettingPickDialog.wheelView;
        Objects.requireNonNull(wheelView);
        int currentItem = wheelView.getCurrentItem();
        if (currentItem > -1 && currentItem < playSettingPickDialog.playSettingArr.length && (completeListener = playSettingPickDialog.getCompleteListener()) != null) {
            completeListener.invoke(Integer.valueOf(currentItem), playSettingPickDialog.playSettingArr[currentItem]);
        }
        playSettingPickDialog.dismiss();
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getCompleteListener() {
        return this.completeListener;
    }

    public final int getCurrentItem() {
        return this.playSettingArr[this.mCurPos].intValue();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_sky_play_pick, (ViewGroup) null);
        WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.wheelView);
        wheelView.setStyle(WheelView.Style.LINE_GRADIENT);
        wheelView.setLinearGradient(this.gradientColorArr, new float[]{0.0f, 0.5f, 1.0f});
        wheelView.setSelectBgHeight(49.0f);
        wheelView.setViewAdapter(new PlayTimePickerAdapter(requireContext(), this.playSettingArr, wheelView));
        wheelView.setCurrentItem(this.mCurPos);
        Unit unit = Unit.INSTANCE;
        this.wheelView = wheelView;
        ((TextView) viewInflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: t06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaySettingPickDialog.e(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.done_button)).setOnClickListener(new View.OnClickListener() { // from class: u06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaySettingPickDialog.f(this.a, view);
            }
        });
        return viewInflate;
    }

    public final void setCompleteListener(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.completeListener = function2;
    }

    public final void setCurrentItem(int item) {
        this.mCurPos = ArraysKt___ArraysKt.indexOf(this.playSettingArr, Integer.valueOf(item));
    }
}
