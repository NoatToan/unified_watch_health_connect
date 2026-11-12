package com.xiaomi.fitness.share.report.adapter;

import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.share.report.CompactTraceCardFragment;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.fragment.CustomizeSportReportShareFragment;
import com.xiaomi.fitness.share.report.fragment.DefaultSportReportShareFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/ShareMethodAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gpsValueValid", "", "wholePicBitmapUriStr", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ZLjava/lang/String;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareMethodAdapter extends FragmentStateAdapter {

    @NotNull
    public static final String TAG = "ShareMethodAdapter";
    private final boolean gpsValueValid;

    @NotNull
    private final SportBasicReport sportReport;

    @Nullable
    private final String wholePicBitmapUriStr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMethodAdapter(@NotNull FragmentActivity fragment, @NotNull SportBasicReport sportReport, boolean z, @Nullable String str) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        this.sportReport = sportReport;
        this.gpsValueValid = z;
        this.wholePicBitmapUriStr = str;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        if (position == 0) {
            return DefaultSportReportShareFragment.INSTANCE.newInstance(this.sportReport, String.valueOf(this.wholePicBitmapUriStr));
        }
        if (position != 1) {
            return position != 2 ? CompactTraceCardFragment.INSTANCE.newInstance(this.sportReport) : CompactTraceCardFragment.INSTANCE.newInstance(this.sportReport);
        }
        return CustomizeSportReportShareFragment.INSTANCE.newInstance(this.sportReport);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        boolean z = !AppUtil.INSTANCE.isPlayChannel();
        boolean zSupportsGps = SportReportShareExtKt.supportsGps(this.sportReport);
        boolean z2 = this.gpsValueValid;
        int i = Build.VERSION.SDK_INT;
        Logger.i("ShareMethodAdapter", "ShareMethodAdapter isChinaChannel=" + z + " supportGps=" + zSupportsGps + " gpsValueValid=" + z2 + " versionIsNew=" + (i >= 29));
        return (SportReportShareExtKt.supportsGps(this.sportReport) && this.gpsValueValid && i >= 29) ? 3 : 2;
    }
}
