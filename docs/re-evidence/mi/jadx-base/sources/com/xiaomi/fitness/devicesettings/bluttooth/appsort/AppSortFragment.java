package com.xiaomi.fitness.devicesettings.bluttooth.appsort;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortViewModel;
import defpackage.eui;
import defpackage.jwo;
import defpackage.u2a;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortViewModel;", "Lu2a;", "", "initData", "()V", "", "Ljwo;", "appList", "showAppList", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "TAG", "Ljava/lang/String;", "Landroidx/recyclerview/widget/RecyclerView;", "sortRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter;)V", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "getMItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setMItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "", "supportHide", "Z", "supportMore", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppSortFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSortFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class AppSortFragment extends BaseBindingFragment<AppSortViewModel, u2a> {

    @NotNull
    private final String TAG = "AppSortFragment";
    public AppSortAdapter mAdapter;
    public l mItemTouchHelper;
    private RecyclerView sortRv;
    private boolean supportHide;
    private boolean supportMore;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AppSortViewModel access$getMViewModel(AppSortFragment appSortFragment) {
        return (AppSortViewModel) appSortFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        showLoading();
        ((AppSortViewModel) getMViewModel()).getAppList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AppSortFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, (num != null && num.intValue() == 0) ? wzi.common_set_success : wzi.common_set_error);
        }
        Gson gson = new Gson();
        this$0.getMAdapter().setOriginList((List) gson.fromJson(gson.toJson(this$0.getMAdapter().getAppSortList()), new TypeToken<List<? extends AppSortWrapper>>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortFragment$onViewCreated$1$1
        }.getType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AppSortFragment this$0, AppSortViewModel.GetAppListRet getAppListRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (getAppListRet.getCode() != 0 || getAppListRet.getList() == null) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.i2);
            }
        } else {
            this$0.showAppList(getAppListRet.getList());
        }
        return Unit.INSTANCE;
    }

    private final void showAppList(List<jwo> appList) {
        jwo jwoVarPrevious;
        int i;
        RecyclerView recyclerView;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ListIterator<jwo> listIterator = appList.listIterator(appList.size());
        do {
            if (!listIterator.hasPrevious()) {
                jwoVarPrevious = null;
                break;
            }
            jwoVarPrevious = listIterator.previous();
        } while (!jwoVarPrevious.g);
        boolean z = jwoVarPrevious != null;
        this.supportMore = z;
        Logger.i(this.TAG, "supportMore: " + z);
        for (jwo jwoVar : appList) {
            Logger.i(this.TAG, "showAppList id: " + jwoVar.c + " name: " + jwoVar.d + " hidden: " + jwoVar.f + " persist: " + jwoVar.e + " canMore: " + jwoVar.g + " inMore: " + jwoVar.h);
            if (jwoVar.f) {
                arrayList4.add(new AppSortWrapper(jwoVar, 2));
            } else if (jwoVar.h && this.supportMore) {
                arrayList3.add(new AppSortWrapper(jwoVar, 1));
            } else {
                arrayList2.add(new AppSortWrapper(jwoVar, 1));
            }
        }
        arrayList.addAll(arrayList2);
        if (this.supportMore) {
            i = 0;
            arrayList3.add(0, new AppSortWrapper(new jwo(), 3));
            arrayList.addAll(arrayList3);
        } else {
            i = 0;
        }
        if (this.supportHide) {
            arrayList4.add(i, new AppSortWrapper(new jwo(), 4));
            arrayList.addAll(arrayList4);
        }
        setMAdapter(new AppSortAdapter(this.supportHide, this.supportMore, new AppSortAdapter.DragListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortFragment.showAppList.2
            @Override // com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter.DragListener
            public void onOrderChange() {
                AppSortFragment.access$getMViewModel(AppSortFragment.this).setAppSort(AppSortFragment.this.getMAdapter().getAppSortList());
            }

            @Override // com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter.DragListener
            public void startDragItem(RecyclerView.d0 holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                AppSortFragment.this.getMItemTouchHelper().x(holder);
            }
        }));
        setMItemTouchHelper(new l(getMAdapter().getItemTouchHelperCallback()));
        l mItemTouchHelper = getMItemTouchHelper();
        RecyclerView recyclerView2 = this.sortRv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortRv");
            recyclerView2 = null;
        }
        mItemTouchHelper.d(recyclerView2);
        RecyclerView recyclerView3 = this.sortRv;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortRv");
            recyclerView = null;
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(getMAdapter());
        getMAdapter().setAppSortList(arrayList);
        Gson gson = new Gson();
        getMAdapter().setOriginList((List) gson.fromJson(gson.toJson(arrayList), new TypeToken<List<? extends AppSortWrapper>>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortFragment.showAppList.3
        }.getType()));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.p2;
    }

    @NotNull
    public final AppSortAdapter getMAdapter() {
        AppSortAdapter appSortAdapter = this.mAdapter;
        if (appSortAdapter != null) {
            return appSortAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @NotNull
    public final l getMItemTouchHelper() {
        l lVar = this.mItemTouchHelper;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mItemTouchHelper");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String did;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.W);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        boolean z = (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(did) & 16) == 16;
        this.supportHide = z;
        Logger.i(this.TAG, "supportHide: " + z);
        RecyclerView recyclerView = getMBinding().A;
        this.sortRv = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortRv");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((AppSortViewModel) getMViewModel()).getSetResult().observe(getViewLifecycleOwner(), new AppSortFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fh1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppSortFragment.onViewCreated$lambda$0(this.f17776a, (Integer) obj);
            }
        }));
        ((AppSortViewModel) getMViewModel()).getGetAppListRet().observe(getViewLifecycleOwner(), new AppSortFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gh1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppSortFragment.onViewCreated$lambda$1(this.f18970a, (AppSortViewModel.GetAppListRet) obj);
            }
        }));
        initData();
    }

    public final void setMAdapter(@NotNull AppSortAdapter appSortAdapter) {
        Intrinsics.checkNotNullParameter(appSortAdapter, "<set-?>");
        this.mAdapter = appSortAdapter;
    }

    public final void setMItemTouchHelper(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.mItemTouchHelper = lVar;
    }
}
