package com.xiaomi.fitness.watch.face.market.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import defpackage.h39;
import defpackage.iki;
import defpackage.ovi;
import defpackage.ox8;
import defpackage.tv1;
import defpackage.wc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceTabListViewModel;", "Lox8;", "", "initTitle", "()V", "initSearchHistory", "setSearchHistory", "initSearchResult", "showIfKeywordEmpty", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lh39;", "titleBinding", "Lh39;", "Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter;", "searchAdapter", "Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter;", "Lcom/xiaomi/fitness/watch/face/market/search/FaceHistoryAdapter;", "historyAdapter", "Lcom/xiaomi/fitness/watch/face/market/search/FaceHistoryAdapter;", "Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceSearchFragment.kt\ncom/xiaomi/fitness/watch/face/market/search/FaceSearchFragment\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n65#2,16:216\n93#2,3:232\n29#3:235\n29#3:239\n1872#4,3:236\n*S KotlinDebug\n*F\n+ 1 FaceSearchFragment.kt\ncom/xiaomi/fitness/watch/face/market/search/FaceSearchFragment\n*L\n106#1:216,16\n106#1:232,3\n177#1:235\n126#1:239\n79#1:236,3\n*E\n"})
public final class FaceSearchFragment extends Hilt_FaceSearchFragment<FaceTabListViewModel, ox8> {

    @Nullable
    private FaceHistoryAdapter historyAdapter;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson;

    @Nullable
    private FaceSearchAdapter searchAdapter;

    @Nullable
    private h39 titleBinding;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose;

    public FaceSearchFragment() {
        super(ovi.j, tv1.d);
        this.mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceSearchFragment.mGson_delegate$lambda$0();
            }
        });
        this.trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceSearchFragment.trackExpose_delegate$lambda$1();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceTabListViewModel access$getMViewModel(FaceSearchFragment faceSearchFragment) {
        return (FaceTabListViewModel) faceSearchFragment.getMViewModel();
    }

    private final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSearchHistory() {
        this.historyAdapter = new FaceHistoryAdapter(new Function1() { // from class: f59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceSearchFragment.initSearchHistory$lambda$12(this.f17418a, (String) obj);
            }
        });
        ((ox8) getMBinding()).E.setAdapter(this.historyAdapter);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(ApplicationExtKt.getApplication());
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        flexboxLayoutManager.R(4);
        ((ox8) getMBinding()).E.setLayoutManager(flexboxLayoutManager);
        setSearchHistory();
        ((ox8) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: g59
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceSearchFragment.initSearchHistory$lambda$14(this.f18612a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSearchHistory$lambda$12(FaceSearchFragment this$0, String it) {
        ClearEditText clearEditText;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        h39 h39Var = this$0.titleBinding;
        if (h39Var != null && (clearEditText = h39Var.B) != null) {
            clearEditText.setText(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSearchHistory$lambda$14(FaceSearchFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FacePreference.INSTANCE.setFACE_SEARCH_HISTORY("");
        this$0.setSearchHistory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSearchResult() {
        this.searchAdapter = new FaceSearchAdapter(new Function2() { // from class: d59
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceSearchFragment.initSearchResult$lambda$15(((Integer) obj).intValue(), (FaceData) obj2);
            }
        });
        ((ox8) getMBinding()).G.setAdapter(this.searchAdapter);
        ((ox8) getMBinding()).G.setLayoutManager(new GridLayoutManager(getContext(), FaceManager.getListCount()));
        ((ox8) getMBinding()).G.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment.initSearchResult.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                FaceTabListViewModel.requestData$default(FaceSearchFragment.access$getMViewModel(FaceSearchFragment.this), 6, "SearchType", false, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSearchResult$lambda$15(int i, FaceData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void initTitle() {
        setTitleBackground(iki.f21256a);
        final h39 h39VarA0 = h39.A0(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(h39VarA0, "inflate(...)");
        h39VarA0.A.setOnClickListener(new View.OnClickListener() { // from class: l59
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceSearchFragment.initTitle$lambda$7(this.f24679a, view);
            }
        });
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            h39VarA0.A.setScaleX(-1.0f);
        } else {
            h39VarA0.A.setScaleX(1.0f);
        }
        ClearEditText editText = h39VarA0.B;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment$initTitle$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                FaceSearchFragment.access$getMViewModel(this.this$0).setKeyword(String.valueOf(s));
                ClearEditText clearEditText = h39VarA0.B;
                String keyword = FaceSearchFragment.access$getMViewModel(this.this$0).getKeyword();
                clearEditText.setClearIconVisible(keyword != null && keyword.length() > 0);
                String keyword2 = FaceSearchFragment.access$getMViewModel(this.this$0).getKeyword();
                if (keyword2 != null && keyword2.length() != 0) {
                    h39VarA0.C.setTextColor(BaseFragmentExtKt.getColor(this.this$0, iki.e));
                    h39VarA0.C.setEnabled(true);
                    return;
                }
                this.this$0.showIfKeywordEmpty();
                TextView search = h39VarA0.C;
                Intrinsics.checkNotNullExpressionValue(search, "search");
                ViewExtKt.visible(search);
                h39VarA0.C.setEnabled(false);
                h39VarA0.C.setTextColor(BaseFragmentExtKt.getColor(this.this$0, iki.f21258k));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        h39VarA0.C.setOnClickListener(new View.OnClickListener() { // from class: m59
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceSearchFragment.initTitle$lambda$10(h39VarA0, this, view);
            }
        });
        h39VarA0.B.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c59
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                FaceSearchFragment.initTitle$lambda$11(h39VarA0, this, view, z);
            }
        });
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setDisplayShowCustomEnabled(true);
        }
        View root = h39VarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setCustomView(root, new ActionBar.LayoutParams(-1, -1));
        this.titleBinding = h39VarA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initTitle$lambda$10(h39 binding, FaceSearchFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final String strValueOf = String.valueOf(binding.B.getText());
        ((FaceTabListViewModel) this$0.getMViewModel()).setKeyword(strValueOf);
        TextView search = binding.C;
        Intrinsics.checkNotNullExpressionValue(search, "search");
        ViewExtKt.gone(search);
        Group historyGroup = ((ox8) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(historyGroup, "historyGroup");
        ViewExtKt.gone(historyGroup);
        ((FaceTabListViewModel) this$0.getMViewModel()).requestData(6, "SearchType", false);
        FacePreference facePreference = FacePreference.INSTANCE;
        List listSubList = (List) this$0.getMGson().fromJson(facePreference.getFACE_SEARCH_HISTORY(), new TypeToken<List<String>>() { // from class: com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment$initTitle$lambda$10$$inlined$fromJson$1
        }.getType());
        if (listSubList == null) {
            listSubList = new ArrayList();
        }
        CollectionsKt__MutableCollectionsKt.removeAll(listSubList, new Function1() { // from class: k59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FaceSearchFragment.initTitle$lambda$10$lambda$9(strValueOf, (String) obj));
            }
        });
        if (!StringsKt__StringsKt.isBlank(strValueOf)) {
            listSubList.add(0, strValueOf);
            if (listSubList.size() > 10) {
                listSubList = listSubList.subList(0, 10);
            }
            facePreference.setFACE_SEARCH_HISTORY(this$0.getMGson().toJson(listSubList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTitle$lambda$10$lambda$9(String text, String it) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initTitle$lambda$11(h39 binding, FaceSearchFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            binding.B.setClearIconVisible(false);
            return;
        }
        TextView search = binding.C;
        Intrinsics.checkNotNullExpressionValue(search, "search");
        ViewExtKt.visible(search);
        this$0.setSearchHistory();
        FaceSearchAdapter faceSearchAdapter = this$0.searchAdapter;
        if (faceSearchAdapter != null) {
            faceSearchAdapter.updateList(new ArrayList());
        }
        FaceSearchAdapter faceSearchAdapter2 = this$0.searchAdapter;
        if (faceSearchAdapter2 != null) {
            faceSearchAdapter2.notifyDataSetChanged();
        }
        NestedScrollView searchScroll = ((ox8) this$0.getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(searchScroll, "searchScroll");
        ViewExtKt.gone(searchScroll);
        ClearEditText clearEditText = binding.B;
        clearEditText.setClearIconVisible(String.valueOf(clearEditText.getText()).length() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$7(FaceSearchFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(FaceSearchFragment this$0, StateData.Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NestedScrollView searchScroll = ((ox8) this$0.getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(searchScroll, "searchScroll");
        StateData.Status status2 = StateData.Status.SUCCESS;
        ViewExtKt.setVisible(searchScroll, status == status2 || status == StateData.Status.LOADING);
        ConstraintLayout emptyView = ((ox8) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ViewExtKt.setVisible(emptyView, (status == status2 || status == StateData.Status.LOADING) ? false : true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(FaceSearchFragment this$0, Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView moreRecyclerView = ((ox8) this$0.getMBinding()).G;
        Intrinsics.checkNotNull(status);
        MoreRecyclerView.setStatus$default(moreRecyclerView, status, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$6(FaceSearchFragment this$0, FaceTabListViewModel.TabListDataWrapper tabListDataWrapper) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        MoreRecyclerView searchRecyc = ((ox8) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(searchRecyc, "searchRecyc");
        ViewExtKt.setVisible(searchRecyc, !tabListDataWrapper.getList().isEmpty());
        ConstraintLayout emptyView = ((ox8) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ViewExtKt.setVisible(emptyView, tabListDataWrapper.getList().isEmpty());
        FaceSearchAdapter faceSearchAdapter = this$0.searchAdapter;
        if (faceSearchAdapter != null) {
            faceSearchAdapter.updateList(tabListDataWrapper.getList());
        }
        if (tabListDataWrapper.getStart() > 0) {
            FaceSearchAdapter faceSearchAdapter2 = this$0.searchAdapter;
            if (faceSearchAdapter2 != null) {
                faceSearchAdapter2.notifyItemRangeChanged(tabListDataWrapper.getStart(), tabListDataWrapper.getList().size());
            }
        } else {
            FaceSearchAdapter faceSearchAdapter3 = this$0.searchAdapter;
            if (faceSearchAdapter3 != null) {
                faceSearchAdapter3.notifyDataSetChanged();
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : tabListDataWrapper.getList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(i2 + "-" + ((FaceData) obj).getId());
            if (i < tabListDataWrapper.getList().size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.103.0.1.39635");
        Object[] objArr = new Object[10];
        objArr[0] = "name";
        objArr[1] = "watchface_search_results";
        objArr[2] = SearchIntents.EXTRA_QUERY;
        String keyword = ((FaceTabListViewModel) this$0.getMViewModel()).getKeyword();
        String str = "";
        if (keyword == null) {
            keyword = "";
        }
        objArr[3] = keyword;
        objArr[4] = "count";
        objArr[5] = Integer.valueOf(tabListDataWrapper.getList().size());
        objArr[6] = "watchface_position_id";
        objArr[7] = sb.toString();
        objArr[8] = "device_model";
        if (wearableDeviceModel != null && (model = DeviceModelExtKt.getModel(wearableDeviceModel)) != null) {
            str = model;
        }
        objArr[9] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSearchHistory() {
        List<String> arrayList = (List) getMGson().fromJson(FacePreference.INSTANCE.getFACE_SEARCH_HISTORY(), new TypeToken<List<String>>() { // from class: com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment$setSearchHistory$$inlined$fromJson$1
        }.getType());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Group historyGroup = ((ox8) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(historyGroup, "historyGroup");
        ViewExtKt.setVisible(historyGroup, !arrayList.isEmpty());
        FaceHistoryAdapter faceHistoryAdapter = this.historyAdapter;
        if (faceHistoryAdapter != null) {
            faceHistoryAdapter.updateList(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showIfKeywordEmpty() {
        TextView textView;
        FaceSearchAdapter faceSearchAdapter = this.searchAdapter;
        if (faceSearchAdapter != null) {
            faceSearchAdapter.updateList(new ArrayList());
        }
        FaceSearchAdapter faceSearchAdapter2 = this.searchAdapter;
        if (faceSearchAdapter2 != null) {
            faceSearchAdapter2.notifyDataSetChanged();
        }
        NestedScrollView searchScroll = ((ox8) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(searchScroll, "searchScroll");
        ViewExtKt.gone(searchScroll);
        ConstraintLayout emptyView = ((ox8) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ViewExtKt.gone(emptyView);
        setSearchHistory();
        h39 h39Var = this.titleBinding;
        if (h39Var == null || (textView = h39Var.C) == null) {
            return;
        }
        ViewExtKt.visible(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$1() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView searchRecyc = ((ox8) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(searchRecyc, "searchRecyc");
        trackExpose.endTrackItemExpose(searchRecyc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initTitle();
        initSearchHistory();
        initSearchResult();
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView searchRecyc = ((ox8) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(searchRecyc, "searchRecyc");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, searchRecyc, 0, null, 6, null);
        showIfKeywordEmpty();
        ((FaceTabListViewModel) getMViewModel()).getPageLiveData().observe(getViewLifecycleOwner(), new FaceSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceSearchFragment.onViewCreated$lambda$2(this.f19707a, (StateData.Status) obj);
            }
        }));
        ((FaceTabListViewModel) getMViewModel()).getLoadStatus().observe(getViewLifecycleOwner(), new FaceSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceSearchFragment.onViewCreated$lambda$3(this.f20798a, (Status) obj);
            }
        }));
        ((FaceTabListViewModel) getMViewModel()).getFeedItems().observe(getViewLifecycleOwner(), new FaceSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceSearchFragment.onViewCreated$lambda$6(this.f22430a, (FaceTabListViewModel.TabListDataWrapper) obj);
            }
        }));
    }
}
