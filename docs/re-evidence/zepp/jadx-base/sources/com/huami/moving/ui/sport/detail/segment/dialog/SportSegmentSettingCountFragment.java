package com.huami.moving.ui.sport.detail.segment.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huami.moving.R;
import com.huami.moving.ui.event.SegmentEditItemSaveEvent;
import com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingCountFragment;
import com.huami.widget.share.ShareAnalytics;
import com.huami.widget.wheelview.Constant;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingCountFragment;", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingBaseFragment;", "Lcom/huami/widget/wheelview/WheelView;", "personHeight", "", "g", "segmentCount", "h", "", "getCurrentItem", "Landroid/view/View;", "initView", "Lcom/huami/moving/ui/sport/detail/segment/dialog/StrengthTrainEditResult;", "editResult", ShareAnalytics.ParamValue.SAVE, "", "hasPadding", "hasBackground", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentSettingCountFragment extends SportSegmentSettingBaseFragment {

    @NotNull
    private static final String g = "SportSegmentSettingCountFragment";

    private final void g(WheelView personHeight) {
        h(personHeight);
    }

    private final int getCurrentItem() {
        StrengthTrainEditParams editParams;
        StrengthTrainEditOption editOption = getEditOption();
        if (editOption == null || (editParams = editOption.getEditParams()) == null) {
            return 0;
        }
        return editParams.getCurrentCount();
    }

    private final void h(WheelView segmentCount) {
        PickAdapter pickAdapter = new PickAdapter(getContext(), getEditOption().getMinCount(), getEditOption().getMaxCount(), segmentCount, ContextCompat.getColor(requireContext(), Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(requireContext(), Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(requireContext(), Constant.THIRD_TEXT_COLOR), false, 52, 20, 18, 16, 1);
        segmentCount.setViewAdapter(pickAdapter).setCurrentItem(getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WheelView wheelView, SportSegmentSettingCountFragment sportSegmentSettingCountFragment, View view) {
        StrengthTrainEditParams editParams;
        StrengthTrainEditParams editParams2;
        int currentItem = wheelView.getCurrentItem();
        StrengthTrainEditOption editOption = sportSegmentSettingCountFragment.getEditOption();
        if (editOption == null || (editParams = editOption.getEditParams()) == null) {
            return;
        }
        if (editParams.getCurrentCount() == currentItem) {
            sportSegmentSettingCountFragment.dismiss();
            return;
        }
        int currentIndex = editParams.getCurrentIndex();
        int currentPosition = editParams.getCurrentPosition();
        int currentCount = editParams.getCurrentCount();
        StrengthTrainEditOption editOption2 = sportSegmentSettingCountFragment.getEditOption();
        StrengthTrainEditResult strengthTrainEditResultBuild = null;
        if (editOption2 != null && (editParams2 = editOption2.getEditParams()) != null) {
            editParams2.getCurrentIndex();
            strengthTrainEditResultBuild = new StrengthTrainEditResult.Builder().resultCount(currentItem).oldCount(currentCount).index(currentIndex).currentPosition(currentPosition).build();
        }
        if (strengthTrainEditResultBuild != null) {
            sportSegmentSettingCountFragment.save(strengthTrainEditResultBuild);
        }
        sportSegmentSettingCountFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportSegmentSettingCountFragment sportSegmentSettingCountFragment, View view) {
        sportSegmentSettingCountFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SportSegmentSettingCountFragment sportSegmentSettingCountFragment, View view) {
        sportSegmentSettingCountFragment.dismiss();
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
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_segment_setting_count, (ViewGroup) null);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.info_height_wheel);
        WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.info_height_foot_wheel);
        View viewFindViewById = viewInflate.findViewById(R.id.wheel_split_line);
        wheelView2.setVisibility(8);
        viewFindViewById.setVisibility(8);
        g(wheelView);
        viewInflate.findViewById(R.id.height_btn_save).setOnClickListener(new View.OnClickListener() { // from class: xb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingCountFragment.i(wheelView, this, view);
            }
        });
        viewInflate.findViewById(R.id.height_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: vb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingCountFragment.j(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: wb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSegmentSettingCountFragment.k(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingBaseFragment
    public void save(@NotNull StrengthTrainEditResult editResult) {
        super.save(editResult);
        EventBus.getDefault().post(new SegmentEditItemSaveEvent(editResult, 0));
    }
}
