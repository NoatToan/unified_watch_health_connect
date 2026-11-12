package com.xiaomi.fitness.route.track.view;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.route.track.TrackListFragmentOperator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackListFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "intent", "Landroid/content/Intent;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroid/content/Intent;Landroidx/fragment/app/FragmentActivity;)V", "fragmentMaps", "", "", "Lcom/xiaomi/fitness/route/track/TrackListFragmentOperator;", "getFragmentMaps", "()Ljava/util/Map;", "getFragment", "position", "createFragment", "Landroidx/fragment/app/Fragment;", "getItemCount", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackListFragmentAdapter extends FragmentStateAdapter {

    @NotNull
    private final Map<Integer, TrackListFragmentOperator> fragmentMaps;

    @Nullable
    private final Intent intent;

    public /* synthetic */ TrackListFragmentAdapter(Intent intent, FragmentActivity fragmentActivity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : intent, fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        if (position == 0) {
            TrackListFragmentOperator trackListFragmentOperator = this.fragmentMaps.get(0);
            Intrinsics.checkNotNull(trackListFragmentOperator, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.TrackCreateListFragment");
            TrackCreateListFragment trackCreateListFragment = (TrackCreateListFragment) trackListFragmentOperator;
            trackCreateListFragment.setIntent(this.intent);
            return trackCreateListFragment;
        }
        if (position == 1) {
            TrackListFragmentOperator trackListFragmentOperator2 = this.fragmentMaps.get(1);
            Intrinsics.checkNotNull(trackListFragmentOperator2, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.TrackCollectListFragment");
            return (TrackCollectListFragment) trackListFragmentOperator2;
        }
        TrackListFragmentOperator trackListFragmentOperator3 = this.fragmentMaps.get(2);
        Intrinsics.checkNotNull(trackListFragmentOperator3, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.TrackImportListFragment");
        TrackImportListFragment trackImportListFragment = (TrackImportListFragment) trackListFragmentOperator3;
        trackImportListFragment.setIntent(this.intent);
        return trackImportListFragment;
    }

    @Nullable
    public final TrackListFragmentOperator getFragment(int position) {
        return this.fragmentMaps.get(Integer.valueOf(position));
    }

    @NotNull
    public final Map<Integer, TrackListFragmentOperator> getFragmentMaps() {
        return this.fragmentMaps;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackListFragmentAdapter(@Nullable Intent intent, @NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.intent = intent;
        this.fragmentMaps = MapsKt__MapsKt.mutableMapOf(TuplesKt.to(0, new TrackCreateListFragment()), TuplesKt.to(1, new TrackCollectListFragment()), TuplesKt.to(2, new TrackImportListFragment()));
    }
}
