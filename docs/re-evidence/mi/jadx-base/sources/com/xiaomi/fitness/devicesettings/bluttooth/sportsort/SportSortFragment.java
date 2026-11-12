package com.xiaomi.fitness.devicesettings.bluttooth.sportsort;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortViewModel;
import com.xiaomi.fitness.devicesettings.utils.SportInfoUtil;
import defpackage.eui;
import defpackage.gha;
import defpackage.nuf;
import defpackage.rxo;
import defpackage.wzi;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel;", "Lgha;", "", "setSportOptionList", "()V", "loadSportOption", "", "Lrxo;", "sportOptionList", "initShowList", "(Ljava/util/List;)V", "formOptionList", "(Ljava/util/List;)Ljava/util/List;", "", "code", "showToast", "(I)V", "initTypeList", "", "listHasChanged", "()Z", "getExposeDataListSize", "()I", "type", "getOptionType", "(I)I", "sportsType", "", "getSportsType", "(I)Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortData;", "typeList", "showList", "saveList", "Landroidx/recyclerview/widget/l$e;", "mCallback", "Landroidx/recyclerview/widget/l$e;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportSortFragment extends BaseBindingFragment<SportSortViewModel, gha> {

    @NotNull
    private final String TAG;

    @Nullable
    private SportSortAdapter mAdapter;

    @NotNull
    private l.e mCallback;
    public RecyclerView mRecyclerView;

    @NotNull
    private final LinkedList<SportSortData> saveList;

    @NotNull
    private final LinkedList<SportSortData> showList;

    @NotNull
    private final LinkedList<rxo> sportOptionList;

    @NotNull
    private final LinkedList<SportSortData> typeList;

    public SportSortFragment() {
        super(eui.A2, 0, true);
        this.TAG = "SportSortFragment";
        this.sportOptionList = new LinkedList<>();
        this.typeList = new LinkedList<>();
        this.showList = new LinkedList<>();
        this.saveList = new LinkedList<>();
        this.mCallback = new l.h() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortFragment$mCallback$1
            {
                super(3, 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.clearView(recyclerView, viewHolder);
                nuf.c(viewHolder.itemView);
                if (this.this$0.listHasChanged()) {
                    this.this$0.setSportOptionList();
                    this.this$0.saveList.clear();
                    this.this$0.saveList.addAll(this.this$0.showList);
                }
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = target.getBindingAdapterPosition();
                if (bindingAdapterPosition >= bindingAdapterPosition2) {
                    int i = bindingAdapterPosition2 + 1;
                    if (i <= bindingAdapterPosition) {
                        int i2 = bindingAdapterPosition;
                        while (true) {
                            if (i2 < this.this$0.getExposeDataListSize()) {
                                Collections.swap(this.this$0.showList, i2, i2 - 1);
                            }
                            if (i2 == i) {
                                break;
                            }
                            i2--;
                        }
                    }
                } else {
                    int i3 = bindingAdapterPosition;
                    while (i3 < bindingAdapterPosition2) {
                        int i4 = i3 + 1;
                        if (i4 < this.this$0.getExposeDataListSize()) {
                            Collections.swap(this.this$0.showList, i3, i4);
                        }
                        i3 = i4;
                    }
                }
                SportSortAdapter sportSortAdapter = this.this$0.mAdapter;
                Intrinsics.checkNotNull(sportSortAdapter);
                sportSortAdapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
                View view;
                super.onSelectedChanged(viewHolder, actionState);
                if (viewHolder == null || (view = viewHolder.itemView) == null) {
                    return;
                }
                nuf.d(view);
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSwiped(RecyclerView.d0 viewHolder, int direction) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            }
        };
    }

    private final List<rxo> formOptionList(List<rxo> sportOptionList) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (rxo rxoVar : sportOptionList) {
            Intrinsics.checkNotNull(rxoVar);
            if (rxoVar.d) {
                linkedList2.add(rxoVar);
            } else {
                linkedList3.add(rxoVar);
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(linkedList3, new Comparator() { // from class: i1o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SportSortFragment.formOptionList$lambda$2((rxo) obj, (rxo) obj2);
            }
        });
        linkedList.clear();
        linkedList.addAll(linkedList2);
        linkedList.addAll(linkedList3);
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int formOptionList$lambda$2(rxo o1, rxo o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        if (o1.d || o2.d) {
            return 0;
        }
        int i = o1.c;
        int i2 = o2.c;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getExposeDataListSize() {
        Iterator<SportSortData> it = this.showList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            SportSortData next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SportSortData sportSortData = next;
            if (sportSortData.getViewType() != SportSortData.INSTANCE.getSPORT_SORT_EXPOSE() || !sportSortData.getIsExpose()) {
                break;
            }
            i++;
        }
        return i;
    }

    private final int getOptionType(int type) {
        return type / 100;
    }

    private final String getSportsType(int sportsType) {
        switch (sportsType) {
            case 0:
                String string = getString(wzi.V7);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 1:
                String string2 = getString(wzi.Y7);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = getString(wzi.X7);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = getString(wzi.R7);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = getString(wzi.Q7);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = getString(wzi.S7);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = getString(wzi.O7);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = getString(wzi.T7);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = getString(wzi.U7);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            default:
                String string10 = getString(wzi.W7);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
        }
    }

    private final void initShowList(List<rxo> sportOptionList) {
        List<rxo> list = sportOptionList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Logger.d(this.TAG, "getSportOptionList start");
        this.showList.clear();
        List<rxo> listFormOptionList = formOptionList(sportOptionList);
        int i = 0;
        int i2 = 0;
        while (i < this.typeList.size()) {
            if (i2 >= listFormOptionList.size() || !listFormOptionList.get(i2).d) {
                if (i == 0) {
                    this.showList.add(new SportSortData(11, 11, "", SportSortData.INSTANCE.getSPORT_SORT_HIDE(), false, false));
                }
                this.showList.add(this.typeList.get(i));
                while (i2 < listFormOptionList.size() && getOptionType(listFormOptionList.get(i2).c) == this.typeList.get(i).getCategoryName()) {
                    rxo rxoVar = listFormOptionList.get(i2);
                    LinkedList<SportSortData> linkedList = this.showList;
                    int categoryName = this.typeList.get(i).getCategoryName();
                    int i3 = rxoVar.c;
                    linkedList.add(new SportSortData(categoryName, i3, SportInfoUtil.getName(i3), SportSortData.INSTANCE.getSPORT_SORT_ITEM(), rxoVar.d, true));
                    i2++;
                }
                i++;
            } else {
                rxo rxoVar2 = listFormOptionList.get(i2);
                LinkedList<SportSortData> linkedList2 = this.showList;
                int i4 = rxoVar2.c;
                linkedList2.add(new SportSortData(10, i4, SportInfoUtil.getName(i4), SportSortData.INSTANCE.getSPORT_SORT_EXPOSE(), rxoVar2.d, false));
                i2++;
                Logger.d(this.TAG, "getSportOptionList sportType: " + rxoVar2.c);
            }
        }
        this.saveList.clear();
        this.saveList.addAll(this.showList);
        SportSortAdapter sportSortAdapter = this.mAdapter;
        if (sportSortAdapter != null) {
            sportSortAdapter.notifyDataSetChanged();
        }
    }

    private final void initTypeList() {
        LinkedList<SportSortData> linkedList = this.typeList;
        String sportsType = getSportsType(0);
        SportSortData.Companion companion = SportSortData.INSTANCE;
        linkedList.add(new SportSortData(0, 0, sportsType, companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(1, 1, getSportsType(1), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(2, 2, getSportsType(2), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(3, 3, getSportsType(3), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(4, 4, getSportsType(4), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(5, 5, getSportsType(5), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(6, 6, getSportsType(6), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(7, 7, getSportsType(7), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(8, 8, getSportsType(8), companion.getSPORT_SORT_TYPE(), false, false));
        this.typeList.add(new SportSortData(100, 100, getSportsType(100), companion.getSPORT_SORT_TYPE(), false, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean listHasChanged() {
        if (this.showList.size() != this.saveList.size()) {
            return false;
        }
        int size = this.showList.size();
        for (int i = 0; i < size; i++) {
            if (this.showList.get(i).getSportType() != this.saveList.get(i).getSportType()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadSportOption() {
        showLoading();
        ((SportSortViewModel) getMViewModel()).loadSportSortItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SportSortFragment this$0, SportSortViewModel.LoadRet loadRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (loadRet.getCode() == 0) {
            this$0.initShowList(loadRet.getOptionList());
        } else {
            this$0.showToast(loadRet.getCode());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SportSortFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Intrinsics.checkNotNull(num);
        this$0.showToast(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setSportOptionList() {
        showLoading();
        this.sportOptionList.clear();
        Logger.d(this.TAG, "setSportOptionList start");
        Iterator<SportSortData> it = this.showList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            SportSortData next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SportSortData sportSortData = next;
            int viewType = sportSortData.getViewType();
            SportSortData.Companion companion = SportSortData.INSTANCE;
            if (viewType == companion.getSPORT_SORT_ITEM() || sportSortData.getViewType() == companion.getSPORT_SORT_EXPOSE()) {
                rxo rxoVar = new rxo();
                rxoVar.c = sportSortData.getSportType();
                rxoVar.d = sportSortData.getIsExpose();
                this.sportOptionList.add(rxoVar);
                Logger.d(this.TAG, "setSportOptionList sportType: " + rxoVar.c + " order: " + i);
                i++;
            }
        }
        ((SportSortViewModel) getMViewModel()).setSportSortItem(this.sportOptionList);
    }

    private final void showToast(int code) {
        hideLoading();
        if (code == 0) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.d0);
                return;
            }
            return;
        }
        if (code != 1) {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.c0);
                return;
            }
            return;
        }
        Context context3 = getContext();
        if (context3 != null) {
            ToastExtKt.toastShort(context3, wzi.y4);
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initTypeList();
        loadSportOption();
        setMRecyclerView(getMBinding().A);
        l lVar = new l(this.mCallback);
        lVar.d(getMRecyclerView());
        this.mAdapter = new SportSortAdapter(lVar, this.showList, getMRecyclerView(), new SportSortAdapter.ChangeOptionCountCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortFragment.onViewCreated.1
            @Override // com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortAdapter.ChangeOptionCountCallback
            public void onChangeOptionCount() {
                SportSortFragment.this.saveList.clear();
                SportSortFragment.this.saveList.addAll(SportSortFragment.this.showList);
                SportSortFragment.this.setSportOptionList();
            }
        });
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMActivity()));
        getMRecyclerView().setAdapter(this.mAdapter);
        setTitle(wzi.N7);
        ((SportSortViewModel) getMViewModel()).getLoadRet().observe(getViewLifecycleOwner(), new SportSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j1o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportSortFragment.onViewCreated$lambda$0(this.f22333a, (SportSortViewModel.LoadRet) obj);
            }
        }));
        ((SportSortViewModel) getMViewModel()).getSetRet().observe(getViewLifecycleOwner(), new SportSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k1o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportSortFragment.onViewCreated$lambda$1(this.f23332a, (Integer) obj);
            }
        }));
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }
}
