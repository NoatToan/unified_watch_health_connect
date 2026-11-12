package com.xiaomi.fitness.share.report.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fitness.share.report.fragment.CustomizeSportReportShareFragment;
import com.xiaomi.fitness.share.report.fragment.DefaultSportReportShareFragment;
import com.xiaomi.fitness.share.report.fragment.JustDanceSongSportReportShareFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/JustDanceShareMethodAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gpsValueValid", "", "wholePicBitmapUriStr", "", "switchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ZLjava/lang/String;Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceShareMethodAdapter extends FragmentStateAdapter {

    @NotNull
    public static final String TAG = "ShareMethodAdapter";
    private final boolean gpsValueValid;

    @NotNull
    private final SportBasicReport sportReport;

    @Nullable
    private final SwitchSongList switchSongList;

    @Nullable
    private final String wholePicBitmapUriStr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceShareMethodAdapter(@NotNull FragmentActivity fragment, @NotNull SportBasicReport sportReport, boolean z, @Nullable String str, @Nullable SwitchSongList switchSongList) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        this.sportReport = sportReport;
        this.gpsValueValid = z;
        this.wholePicBitmapUriStr = str;
        this.switchSongList = switchSongList;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        List<SwitchSongItem> songList;
        SwitchSongList switchSongList = this.switchSongList;
        if (switchSongList == null || ((songList = switchSongList.getSongList()) != null && songList.isEmpty())) {
            if (position != 0 && position == 1) {
                return CustomizeSportReportShareFragment.INSTANCE.newInstance(this.sportReport);
            }
            return DefaultSportReportShareFragment.INSTANCE.newInstance(this.sportReport, String.valueOf(this.wholePicBitmapUriStr));
        }
        if (position == 0) {
            return DefaultSportReportShareFragment.INSTANCE.newInstance(this.sportReport, String.valueOf(this.wholePicBitmapUriStr));
        }
        if (position != 1) {
            return position != 2 ? DefaultSportReportShareFragment.INSTANCE.newInstance(this.sportReport, String.valueOf(this.wholePicBitmapUriStr)) : CustomizeSportReportShareFragment.INSTANCE.newInstance(this.sportReport);
        }
        return JustDanceSongSportReportShareFragment.INSTANCE.newInstance(this.sportReport, this.switchSongList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<SwitchSongItem> songList;
        SwitchSongList switchSongList = this.switchSongList;
        return (switchSongList == null || ((songList = switchSongList.getSongList()) != null && songList.isEmpty())) ? 2 : 3;
    }
}
