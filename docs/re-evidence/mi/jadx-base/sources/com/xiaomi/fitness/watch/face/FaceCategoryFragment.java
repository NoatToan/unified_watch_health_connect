package com.xiaomi.fitness.watch.face;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceCategoryFragment;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceMarketItemDecoration;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.h6a;
import defpackage.iki;
import defpackage.ovi;
import defpackage.tv1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceCategoryFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel;", "Lh6a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "()V", "setListener", "", "getLayoutId", "()I", "layoutId", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceCategoryFragment extends Hilt_FaceCategoryFragment<FaceCategoryViewModel, h6a> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FaceCategoryFragment() {
        super(ovi.c0, tv1.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(FaceCategoryFragment this$0, StateData.Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            ((h6a) this$0.getMBinding()).B.showContent();
        } else if (i == 2) {
            StateLayout.showLoading$default(((h6a) this$0.getMBinding()).B, 0, null, 3, null);
        } else if (i != 3) {
            StateLayout.showError$default(((h6a) this$0.getMBinding()).B, null, 1, null);
        } else {
            StateLayout.showEmpty$default(((h6a) this$0.getMBinding()).B, 0, null, 0, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(FaceCategoryFragment this$0, FaceAllTabInfo item, int i, View itemView) {
        String model;
        String model2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Bundle bundle = new Bundle();
        bundle.putInt(FaceTabListFragment.TAB_TYPE, 2);
        bundle.putInt(FaceTabListFragment.TAB_SOURCE, 5);
        bundle.putString(FaceTabListFragment.TAB_ID, String.valueOf(item.getTabId()));
        BaseFragmentExKt.gotoPage(this$0, FaceTabListFragment.class, bundle);
        IOnetrack.Companion companion = IOnetrack.INSTANCE;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(companion);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.94.0.1.36945");
        Object[] objArr = new Object[4];
        objArr[0] = "name";
        objArr[1] = item.getTabName();
        objArr[2] = "device_model";
        WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getCurrentDeviceModel();
        String str = "";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[3] = model;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(companion);
        OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("click_v3", "56.104.0.1.39637");
        Object[] objArr2 = new Object[6];
        objArr2[0] = "name";
        objArr2[1] = "all_categorization";
        objArr2[2] = "detail";
        objArr2[3] = (i + 1) + "-" + item.getTabName();
        objArr2[4] = "device_model";
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null && (model2 = DeviceModelExtKt.getModel(wearableDeviceModel2)) != null) {
            str = model2;
        }
        objArr2[5] = str;
        oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return ovi.c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        ((FaceCategoryViewModel) getMViewModel()).loadData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        setTitle(arguments != null ? arguments.getString(FaceTabListFragment.TAB_NAME) : null);
        setTitleBackground(iki.j);
        ((h6a) getMBinding()).A.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        ((h6a) getMBinding()).A.addItemDecoration(new FaceMarketItemDecoration());
        ((FaceCategoryViewModel) getMViewModel()).getPageLiveData().observe(getViewLifecycleOwner(), new FaceCategoryFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yn8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceCategoryFragment.onViewCreated$lambda$0(this.f40341a, (StateData.Status) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((FaceCategoryViewModel) getMViewModel()).getFaceCategoryAdapter().setOnItemClickListener(new Function3() { // from class: xn8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FaceCategoryFragment.setListener$lambda$2(this.f39277a, (FaceAllTabInfo) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
    }
}
