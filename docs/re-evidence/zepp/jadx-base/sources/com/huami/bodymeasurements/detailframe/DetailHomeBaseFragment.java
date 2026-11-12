package com.huami.bodymeasurements.detailframe;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.detailframe.dto.DateMode;
import com.huami.bodymeasurements.detailframe.event.EventTargetPage;
import com.huami.bodymeasurements.detailframe.event.EventTargetType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import de.greenrobot.event.EventBus;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0018H&J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "c", GoogleApiAvailabilityLight.a, "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "hidden", "onHiddenChanged", "", "time", "detailFragment", "Lcom/huami/bodymeasurements/detailframe/event/EventTargetPage;", "event", "onEventMainThread", "Ljava/util/Date;", "a", "Ljava/util/Date;", "startDate", "endDate", "Lcom/huami/bodymeasurements/detailframe/dto/DateMode;", "Lcom/huami/bodymeasurements/detailframe/dto/DateMode;", "dateMode", "", "Ljava/lang/String;", "logTag", "e", LogUtil.I, "curItem", "<init>", "(Ljava/util/Date;Ljava/util/Date;Lcom/huami/bodymeasurements/detailframe/dto/DateMode;)V", "PagerAdapter", "detailframe_release"}, k = 1, mv = {1, 5, 1})
public abstract class DetailHomeBaseFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Date startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Date endDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DateMode dateMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String logTag = getClass().getSimpleName();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int curItem;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment$PagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "getItemCount", "a", LogUtil.I, "pagerCount", "fragment", "<init>", "(Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment;Landroidx/fragment/app/Fragment;I)V", "detailframe_release"}, k = 1, mv = {1, 5, 1})
    public final class PagerAdapter extends FragmentStateAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int pagerCount;

        public PagerAdapter(Fragment fragment, int i) {
            super(fragment);
            this.pagerCount = i;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            return DetailHomeBaseFragment.this.detailFragment(TimeUtils.INSTANCE.getTimeFromStartByOffset(DetailHomeBaseFragment.this.startDate, position, DetailHomeBaseFragment.this.dateMode));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount, reason: from getter */
        public int getPagerCount() {
            return this.pagerCount;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("pageCount:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ EventTargetPage a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventTargetPage eventTargetPage, int i) {
            super(0);
            this.a = eventTargetPage;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onEventMainThread event:" + this.a + ",targetPage:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("hidden:", Boolean.valueOf(this.a));
        }
    }

    public DetailHomeBaseFragment(@NotNull Date date, @NotNull Date date2, @NotNull DateMode dateMode) {
        this.startDate = date;
        this.endDate = date2;
        this.dateMode = dateMode;
    }

    private final int b() {
        return TimeUtils.INSTANCE.getDifferByDateMode(this.startDate, this.endDate, this.dateMode) + 1;
    }

    private final void c() {
        int iB = b();
        HMLog.info(this.logTag, new a(iB));
        this.curItem = iB - 1;
        View view = getView();
        ((ViewPager2) (view == null ? null : view.findViewById(R.id.viewpager))).setAdapter(new PagerAdapter(this, iB));
        d();
    }

    private final void d() {
        View view = getView();
        ((ViewPager2) (view == null ? null : view.findViewById(R.id.viewpager))).setCurrentItem(this.curItem, false);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract Fragment detailFragment(long time);

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bm_detail_layout_home_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventTargetPage event) {
        Context context;
        int differByDateMode = TimeUtils.INSTANCE.getDifferByDateMode(this.startDate, new Date(event.getTargetTime()), this.dateMode);
        this.curItem = differByDateMode;
        HMLog.info(this.logTag, new b(event, differByDateMode));
        if (this.dateMode == DateMode.DAY && event.getType() == EventTargetType.ADD && (context = getContext()) != null) {
            CustomToast.showShort(context, getString(R.string.bm_common_save_success));
        }
        if (isVisible()) {
            d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        HMLog.info(this.logTag, new c(hidden));
        if (hidden) {
            return;
        }
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c();
    }
}
