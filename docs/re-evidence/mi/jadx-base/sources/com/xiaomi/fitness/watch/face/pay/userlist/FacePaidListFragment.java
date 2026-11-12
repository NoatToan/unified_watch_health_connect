package com.xiaomi.fitness.watch.face.pay.userlist;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketPageManager;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListFragment;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListViewModel;
import defpackage.ld8;
import defpackage.mx8;
import defpackage.orf;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.so8;
import defpackage.uno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\u0018J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010\u000f\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListViewModel;", "Lmx8;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "list", "onFilterInstallList", "(Ljava/util/List;)Ljava/util/List;", "", "index", "faceData", "", "onPaidItemClick", "(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "trackExpose", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "()V", "Lorf;", "event", "onDataEvent", "(Lorf;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;", "adapter", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;)V", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "Lkotlin/Lazy;", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "", "tracked", "Z", "", "source", "Ljava/lang/String;", "", "loadTime", "J", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFacePaidListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePaidListFragment.kt\ncom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1#2:161\n1863#3,2:162\n*S KotlinDebug\n*F\n+ 1 FacePaidListFragment.kt\ncom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListFragment\n*L\n73#1:162,2\n*E\n"})
public final class FacePaidListFragment extends Hilt_FacePaidListFragment<FacePaidListViewModel, mx8> {

    @NotNull
    private static final String SOURCE = "source";

    @NotNull
    private static final String TAG = "FacePaidListFragment";
    public FacePaidListAdapter adapter;
    private long loadTime;

    @NotNull
    private String source;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose;
    private boolean tracked;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListFragment$onViewCreated$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Integer, FaceData, Unit> {
        public AnonymousClass2(Object obj) {
            super(2, obj, FacePaidListFragment.class, "onPaidItemClick", "onPaidItemClick(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, FaceData faceData) {
            invoke(num.intValue(), faceData);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, FaceData p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((FacePaidListFragment) this.receiver).onPaidItemClick(i, p1);
        }
    }

    public FacePaidListFragment() {
        super(ovi.i);
        this.trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n49
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FacePaidListFragment.trackExpose_delegate$lambda$0();
            }
        });
        this.source = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FacePaidListViewModel access$getMViewModel(FacePaidListFragment facePaidListFragment) {
        return (FacePaidListViewModel) facePaidListFragment.getMViewModel();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    private final List<FaceData> onFilterInstallList(List<FaceData> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        List<WatchFace> localFace = FaceManager.INSTANCE.getLocalFace();
        for (FaceData faceData : list) {
            Iterator<T> it = localFace.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((WatchFace) next).getId(), faceData.getId()));
            if (next == null) {
                arrayList.add(faceData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPaidItemClick(int index, FaceData faceData) {
        DeviceFaceMarketPageManager deviceFaceMarketPageManager = DeviceFaceMarketPageManager.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        deviceFaceMarketPageManager.toFaceDetailPage(contextRequireContext, faceData, "user_content", "paid_notinstalled", index + 1, this.source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FacePaidListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        payManagerExtKt.gotoOrderPageList(fragmentActivityRequireActivity, "watchface_market", Feature.WATCHFACE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$4(FacePaidListFragment this$0, FacePaidListViewModel.PaidFaceData paidFaceData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<FaceData> list = CollectionsKt___CollectionsKt.toList(this$0.onFilterInstallList(paidFaceData.getList()));
        this$0.trackExpose(list);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new FacePaidItem((FaceData) it.next(), this$0.loadTime));
            }
            this$0.getAdapter().setDataList(arrayList);
            MoreRecyclerView recyclerView = ((mx8) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.setVisible(recyclerView, true);
            Group emptyView = ((mx8) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ViewExtKt.setVisible(emptyView, false);
        } else {
            MoreRecyclerView recyclerView2 = ((mx8) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            ViewExtKt.setVisible(recyclerView2, false);
            Group emptyView2 = ((mx8) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ViewExtKt.setVisible(emptyView2, true);
        }
        if (!paidFaceData.getHasNext()) {
            MoreRecyclerView.setStatus$default(((mx8) this$0.getMBinding()).C, Status.DONE, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void trackExpose(List<FaceData> list) {
        if (this.tracked || list.isEmpty()) {
            return;
        }
        this.tracked = true;
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.82.1.1.35077"), "name", "watchface_2nd_page", FaceDetailFragment.PAGE_NAME, getString(p1j.p0), "expose_source", "paid_notinstalled", "source", this.source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$0() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    @NotNull
    public final FacePaidListAdapter getAdapter() {
        FacePaidListAdapter facePaidListAdapter = this.adapter;
        if (facePaidListAdapter != null) {
            return facePaidListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        this.loadTime = System.currentTimeMillis();
        ((FacePaidListViewModel) getMViewModel()).m658getPaidFaceList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof FaceReSycEvent) {
            this.loadTime = System.currentTimeMillis();
            ((FacePaidListViewModel) getMViewModel()).m658getPaidFaceList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView recyclerView = ((mx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        trackExpose.endTrackItemExpose(recyclerView);
        ld8.c().r(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarNormalTitleMode();
        setTitle(p1j.p0);
        IActionBar.DefaultImpls.setEndTextView$default(this, 0, p1j.o0, null, 17.0f, new View.OnClickListener() { // from class: o49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FacePaidListFragment.onViewCreated$lambda$1(this.f28725a, view2);
            }
        }, 5, null);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("source")) == null) {
            string = "";
        }
        this.source = string;
        setAdapter(new FacePaidListAdapter(string, new AnonymousClass2(this)));
        ((mx8) getMBinding()).C.setAdapter(getAdapter());
        ((mx8) getMBinding()).C.setLayoutManager(new GridLayoutManager(getContext(), FaceManager.getListCount()));
        ((mx8) getMBinding()).C.addItemDecoration(new so8(FaceIcon.LIST_SPACE, 1, false).c(ExtUtilsKt.getDp(22)));
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView recyclerView = ((mx8) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, recyclerView, 0, null, 6, null);
        ((FacePaidListViewModel) getMViewModel()).getPaidFaceList().observe(getViewLifecycleOwner(), new FacePaidListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p49
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FacePaidListFragment.onViewCreated$lambda$4(this.f29985a, (FacePaidListViewModel.PaidFaceData) obj);
            }
        }));
        ((mx8) getMBinding()).C.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListFragment.onViewCreated.4
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                FacePaidListFragment.this.loadTime = System.currentTimeMillis();
                FacePaidListFragment.access$getMViewModel(FacePaidListFragment.this).m658getPaidFaceList();
            }
        });
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    public final void setAdapter(@NotNull FacePaidListAdapter facePaidListAdapter) {
        Intrinsics.checkNotNullParameter(facePaidListAdapter, "<set-?>");
        this.adapter = facePaidListAdapter;
    }
}
