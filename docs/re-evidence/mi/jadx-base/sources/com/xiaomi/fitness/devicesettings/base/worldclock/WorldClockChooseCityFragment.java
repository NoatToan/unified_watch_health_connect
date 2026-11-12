package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockChooseCityFragment;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import defpackage.b1e;
import defpackage.eui;
import defpackage.mi6;
import defpackage.wzi;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 X2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001XB\u0007¢\u0006\u0004\bW\u0010\fJ\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\nJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010\"\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR*\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010I\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\nR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockChooseCityFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/ChooseWorldClockViewModel;", "Lmi6;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/a$b;", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "list", "", "filterData", "(Ljava/util/List;)V", "setClickListener", "()V", "", "newText", "onQueryTextSubmit", "(Ljava/lang/String;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "", "position", "smoothMoveToPosition", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "cities", "bindDataToView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljava/util/HashMap;", "hashMap", "onItemClick", "(Landroid/view/View;ILjava/util/HashMap;)V", "Lcom/xiaomi/fitness/baseui/dialog/ClearEditText;", "rlSearch", "Lcom/xiaomi/fitness/baseui/dialog/ClearEditText;", "getRlSearch", "()Lcom/xiaomi/fitness/baseui/dialog/ClearEditText;", "setRlSearch", "(Lcom/xiaomi/fitness/baseui/dialog/ClearEditText;)V", "Landroid/widget/TextView;", "dialog", "Landroid/widget/TextView;", "getDialog", "()Landroid/widget/TextView;", "setDialog", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/devicesettings/widget/SideBar;", "sidebar", "Lcom/xiaomi/fitness/devicesettings/widget/SideBar;", "getSidebar", "()Lcom/xiaomi/fitness/devicesettings/widget/SideBar;", "setSidebar", "(Lcom/xiaomi/fitness/devicesettings/widget/SideBar;)V", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/a;", "listAdapter", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/a;", "mSourceDateList", "Ljava/util/List;", "dataList", "filterDataList", "getFilterDataList", "()Ljava/util/List;", "setFilterDataList", "", "mShouldScroll", "Z", "mToPosition", "I", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WorldClockChooseCityFragment extends BaseBindingFragment<ChooseWorldClockViewModel, mi6> implements a.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "WorldClockChooseCityFragment";

    @NotNull
    private static final String sData = "sData";
    public TextView dialog;
    public LinearLayoutManager linearLayoutManager;

    @Nullable
    private a listAdapter;
    public RecyclerView mRecyclerView;
    private boolean mShouldScroll;
    private int mToPosition;
    public ClearEditText rlSearch;
    public SideBar sidebar;

    @NotNull
    private final List<TimeZoneItem> mSourceDateList = new ArrayList();

    @NotNull
    private final List<TimeZoneItem> dataList = new ArrayList();

    @NotNull
    private List<TimeZoneItem> filterDataList = new ArrayList();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockChooseCityFragment$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "sData", "getSData", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSData() {
            return WorldClockChooseCityFragment.sData;
        }

        @NotNull
        public final String getTAG() {
            return WorldClockChooseCityFragment.TAG;
        }
    }

    private final void bindDataToView(List<TimeZoneItem> cities) {
        if (cities == null) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.i2);
                return;
            }
            return;
        }
        this.mSourceDateList.clear();
        List<TimeZoneItem> list = cities;
        this.mSourceDateList.addAll(list);
        this.dataList.clear();
        this.dataList.addAll(list);
        Collections.sort(this.mSourceDateList);
        Collections.sort(this.dataList);
        this.filterDataList.clear();
        this.filterDataList.addAll(this.dataList);
        a aVar = this.listAdapter;
        Intrinsics.checkNotNull(aVar);
        aVar.notifyDataSetChanged();
    }

    private final void filterData(List<? extends TimeZoneItem> list) {
        a aVar = this.listAdapter;
        Intrinsics.checkNotNull(aVar);
        aVar.o(list);
        this.filterDataList.clear();
        this.filterDataList.addAll(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onQueryTextSubmit(String newText) {
        ((ChooseWorldClockViewModel) getMViewModel()).onQueryTextSubmit(newText, this.mSourceDateList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(WorldClockChooseCityFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.bindDataToView(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(WorldClockChooseCityFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.filterData(list);
        return Unit.INSTANCE;
    }

    private final void setClickListener() {
        getMRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: dor
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return WorldClockChooseCityFragment.setClickListener$lambda$2(this.f15765a, view, motionEvent);
            }
        });
        getSidebar().setOnTouchingLetterChangedListener(new SideBar.a() { // from class: eor
            @Override // com.xiaomi.fitness.devicesettings.widget.SideBar.a
            public final void a(String str) {
                WorldClockChooseCityFragment.setClickListener$lambda$4(this.f16907a, str);
            }
        });
        getRlSearch().setTextChangedLister(new ClearEditText.a() { // from class: for
            @Override // com.xiaomi.fitness.baseui.dialog.ClearEditText.a
            public final void a(String str) {
                WorldClockChooseCityFragment.setClickListener$lambda$5(this.f18035a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setClickListener$lambda$2(WorldClockChooseCityFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b1e.b(this$0.getRlSearch());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$4(final WorldClockChooseCityFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b1e.b(this$0.getRlSearch());
        char cCharAt = str.charAt(0);
        a aVar = this$0.listAdapter;
        Intrinsics.checkNotNull(aVar);
        final int iJ = aVar.j(cCharAt);
        xc6.d("WorldClockChooseCityFragment s:" + str + " position:" + iJ);
        if (iJ != -1) {
            this$0.getMRecyclerView().post(new Runnable() { // from class: aor
                @Override // java.lang.Runnable
                public final void run() {
                    WorldClockChooseCityFragment.setClickListener$lambda$4$lambda$3(this.f3309a, iJ);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$4$lambda$3(WorldClockChooseCityFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLinearLayoutManager().scrollToPositionWithOffset(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$5(WorldClockChooseCityFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!str.equals("")) {
            Intrinsics.checkNotNull(str);
            this$0.onQueryTextSubmit(str);
        } else {
            a aVar = this$0.listAdapter;
            Intrinsics.checkNotNull(aVar);
            aVar.o(this$0.mSourceDateList);
        }
    }

    private final void smoothMoveToPosition(RecyclerView mRecyclerView, int position) {
        if (mRecyclerView == null || isInvalid()) {
            return;
        }
        int childLayoutPosition = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(0));
        int childLayoutPosition2 = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(mRecyclerView.getChildCount() - 1));
        if (position < childLayoutPosition) {
            if (childLayoutPosition - position > 100) {
                mRecyclerView.scrollToPosition(position + 50);
            }
            mRecyclerView.smoothScrollToPosition(position);
        } else {
            if (position <= childLayoutPosition2) {
                int i = position - childLayoutPosition;
                if (i < 0 || i >= mRecyclerView.getChildCount()) {
                    return;
                }
                mRecyclerView.smoothScrollBy(0, mRecyclerView.getChildAt(i).getTop());
                return;
            }
            if (position - childLayoutPosition > 100) {
                mRecyclerView.scrollToPosition(position - 50);
            }
            mRecyclerView.smoothScrollToPosition(position);
            this.mToPosition = position;
            this.mShouldScroll = true;
        }
    }

    @NotNull
    public final TextView getDialog() {
        TextView textView = this.dialog;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    @NotNull
    public final List<TimeZoneItem> getFilterDataList() {
        return this.filterDataList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.z0;
    }

    @NotNull
    public final LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        return null;
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    @NotNull
    public final ClearEditText getRlSearch() {
        ClearEditText clearEditText = this.rlSearch;
        if (clearEditText != null) {
            return clearEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rlSearch");
        return null;
    }

    @NotNull
    public final SideBar getSidebar() {
        SideBar sideBar = this.sidebar;
        if (sideBar != null) {
            return sideBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sidebar");
        return null;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.worldclock.a.b
    public void onItemClick(@Nullable View view, int position, @Nullable HashMap<String, TimeZoneItem> hashMap) {
        TimeZoneItem timeZoneItem = this.dataList.get(position);
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(timeZoneItem);
        intent.putExtra(sData, arrayList);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        mActivity.setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.qa);
        setActionBarNormalTitleMode();
        setRlSearch(getMBinding().D);
        setMRecyclerView(getMBinding().B);
        setSidebar(getMBinding().E);
        setDialog(getMBinding().A);
        setLinearLayoutManager(new LinearLayoutManager(getMActivity()));
        getMRecyclerView().setLayoutManager(getLinearLayoutManager());
        this.listAdapter = new a(getMActivity(), this.dataList);
        getMRecyclerView().setAdapter(this.listAdapter);
        a aVar = this.listAdapter;
        if (aVar != null) {
            aVar.setOnItemClickListener(this);
        }
        getSidebar().setTextView(getDialog());
        setClickListener();
        ((ChooseWorldClockViewModel) getMViewModel()).getLoadListRet().observe(getViewLifecycleOwner(), new WorldClockChooseCityFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bor
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockChooseCityFragment.onViewCreated$lambda$0(this.f4427a, (List) obj);
            }
        }));
        ChooseWorldClockViewModel chooseWorldClockViewModel = (ChooseWorldClockViewModel) getMViewModel();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        chooseWorldClockViewModel.loadWordCityList(contextRequireContext);
        ((ChooseWorldClockViewModel) getMViewModel()).getTimeZoneItems().observe(getViewLifecycleOwner(), new WorldClockChooseCityFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cor
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockChooseCityFragment.onViewCreated$lambda$1(this.f14573a, (List) obj);
            }
        }));
    }

    public final void setDialog(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dialog = textView;
    }

    public final void setFilterDataList(@NotNull List<TimeZoneItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.filterDataList = list;
    }

    public final void setLinearLayoutManager(@NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.linearLayoutManager = linearLayoutManager;
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void setRlSearch(@NotNull ClearEditText clearEditText) {
        Intrinsics.checkNotNullParameter(clearEditText, "<set-?>");
        this.rlSearch = clearEditText;
    }

    public final void setSidebar(@NotNull SideBar sideBar) {
        Intrinsics.checkNotNullParameter(sideBar, "<set-?>");
        this.sidebar = sideBar;
    }
}
