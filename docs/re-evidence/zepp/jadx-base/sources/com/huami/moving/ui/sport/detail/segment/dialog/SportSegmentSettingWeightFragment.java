package com.huami.moving.ui.sport.detail.segment.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huami.moving.R;
import com.huami.moving.ui.event.SegmentEditItemSaveEvent;
import com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingWeightFragment;
import com.huami.widget.share.ShareAnalytics;
import com.huami.widget.wheelview.Constant;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingWeightFragment;", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment;", "Lcom/huami/widget/wheelview/WheelView;", "wheelInt", "wheelDecimal", "", "l", "", "h", "g", "Landroid/view/View;", "initView", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditResult;", "editResult", ShareAnalytics.ParamValue.SAVE, "", "hasPadding", "hasBackground", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentSettingWeightFragment extends SportSegmentSettingBaseFragment {

    @NotNull
    private static final String g = "SportSegmentSettingWeightFragment";

    private final int g() {
        StrengthTrainEditParams editParams;
        StrengthTrainEditOption editOption = getEditOption();
        if (editOption == null || (editParams = editOption.getEditParams()) == null) {
            return 0;
        }
        return editParams.getCurrentUnit();
    }

    private final int h() {
        StrengthTrainEditParams editParams;
        StrengthTrainEditOption editOption = getEditOption();
        if (editOption == null || (editParams = editOption.getEditParams()) == null) {
            return 0;
        }
        return editParams.getCurrentWeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WheelView wheelView, WheelView wheelView2, SportSegmentSettingWeightFragment sportSegmentSettingWeightFragment, View view) {
        StrengthTrainEditParams editParams;
        StrengthTrainEditParams editParams2;
        int currentItem = wheelView.getCurrentItem();
        int currentItem2 = wheelView2.getCurrentItem();
        StrengthTrainEditOption editOption = sportSegmentSettingWeightFragment.getEditOption();
        if (editOption == null || (editParams = editOption.getEditParams()) == null) {
            return;
        }
        if (editParams.getCurrentWeight() == currentItem && editParams.getCurrentUnit() == currentItem2) {
            sportSegmentSettingWeightFragment.dismiss();
            return;
        }
        int currentIndex = editParams.getCurrentIndex();
        int currentPosition = editParams.getCurrentPosition();
        int currentWeight = editParams.getCurrentWeight();
        int currentUnit = editParams.getCurrentUnit();
        StrengthTrainEditOption editOption2 = sportSegmentSettingWeightFragment.getEditOption();
        StrengthTrainEditResult strengthTrainEditResultBuild = null;
        if (editOption2 != null && (editParams2 = editOption2.getEditParams()) != null) {
            editParams2.getCurrentIndex();
            strengthTrainEditResultBuild = new StrengthTrainEditResult.Builder().resultWeight(currentItem).oldWeight(currentWeight).resultUnit(currentItem2).oldUnit(currentUnit).index(currentIndex).currentPosition(currentPosition).build();
        }
        if (strengthTrainEditResultBuild != null) {
            sportSegmentSettingWeightFragment.save(strengthTrainEditResultBuild);
        }
        sportSegmentSettingWeightFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportSegmentSettingWeightFragment sportSegmentSettingWeightFragment, View view) {
        sportSegmentSettingWeightFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SportSegmentSettingWeightFragment sportSegmentSettingWeightFragment, View view) {
        sportSegmentSettingWeightFragment.dismiss();
    }

    private final void l(WheelView wheelInt, WheelView wheelDecimal) {
        PickAdapter pickAdapter = new PickAdapter(requireContext(), getEditOption().getMinWeight(), getEditOption().getMaxWeight(), wheelInt, ContextCompat.getColor(requireContext(), Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(requireContext(), Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(requireContext(), Constant.THIRD_TEXT_COLOR), false, 52, 20, 18, 16, 1);
        wheelInt.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        wheelInt.setViewAdapter(pickAdapter).setCurrentItem(h());
        PickAdapter pickAdapter2 = new PickAdapter(requireContext(), new String[]{getString(R.string.segment_weight_unit_kg), getString(R.string.segment_weight_unit_lb)}, wheelDecimal, false);
        wheelDecimal.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        wheelDecimal.setViewAdapter(pickAdapter2).setCurrentItem(g());
    }

    @Override // com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_segment_setting_weight, (ViewGroup) null);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.setting_weight_int_wheel);
        final WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.setting_weight_decimal_wheel);
        l(wheelView, wheelView2);
        viewInflate.findViewById(R.id.weight_btn_save).setOnClickListener(new View.OnClickListener() { // from class: ac7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingWeightFragment.i(wheelView, wheelView2, this, view);
            }
        });
        viewInflate.findViewById(R.id.weight_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: zb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingWeightFragment.j(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: yb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingWeightFragment.k(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingBaseFragment
    public void save(@NotNull StrengthTrainEditResult editResult) {
        super.save(editResult);
        EventBus.getDefault().post(new SegmentEditItemSaveEvent(editResult, 1));
    }
}
