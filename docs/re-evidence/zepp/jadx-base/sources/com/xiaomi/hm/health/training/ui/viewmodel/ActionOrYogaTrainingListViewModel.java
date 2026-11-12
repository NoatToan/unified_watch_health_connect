package com.xiaomi.hm.health.training.ui.viewmodel;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.paging.PagedList;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.InstrumentsAndBodyparts;
import com.xiaomi.hm.health.training.api.entity.Listing;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.entity.FilterItems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class ActionOrYogaTrainingListViewModel extends AndroidViewModel {
    private final Listing<ActionOrYogaTraining> a;
    private final LiveData<PagedList<ActionOrYogaTraining>> b;
    private final LiveData<Resource<Void>> c;
    private final LiveData<Resource<Void>> d;
    private final LiveData<FilterItems> e;
    private final MediatorLiveData<String> f;
    private final MediatorLiveData<String> g;
    private final MediatorLiveData<FilterItems.Difficulty> h;

    @Inject
    public ActionOrYogaTrainingListViewModel(@NonNull Application application, TrainingDataSource trainingDataSource) {
        super(application);
        MediatorLiveData<String> mediatorLiveData = new MediatorLiveData<>();
        this.f = mediatorLiveData;
        MediatorLiveData<String> mediatorLiveData2 = new MediatorLiveData<>();
        this.g = mediatorLiveData2;
        MediatorLiveData<FilterItems.Difficulty> mediatorLiveData3 = new MediatorLiveData<>();
        this.h = mediatorLiveData3;
        Listing<ActionOrYogaTraining> listingLoadActionOrYogaTrainings = trainingDataSource.loadActionOrYogaTrainings(new Supplier() { // from class: r5
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.k();
            }
        }, new Supplier() { // from class: p5
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.m();
            }
        }, new Supplier() { // from class: q5
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.n();
            }
        });
        this.a = listingLoadActionOrYogaTrainings;
        this.b = listingLoadActionOrYogaTrainings.getPagedList();
        this.c = listingLoadActionOrYogaTrainings.getNetworkState();
        this.d = listingLoadActionOrYogaTrainings.getRefreshState();
        LiveData map = Transformations.map(trainingDataSource.loadInstrumentsAndBodyparts(), new Function() { // from class: k5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.a.o((Resource) obj);
            }
        });
        this.e = map;
        mediatorLiveData.addSource(map, new Observer() { // from class: m5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.p((FilterItems) obj);
            }
        });
        mediatorLiveData2.addSource(map, new Observer() { // from class: l5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.q((FilterItems) obj);
            }
        });
        mediatorLiveData3.addSource(map, new Observer() { // from class: n5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.r((FilterItems) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String k() {
        if (this.h.getValue() != null) {
            return this.h.getValue().level;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String m() {
        String value = this.g.getValue();
        if (getBodyPartNameList().indexOf(value) > 0) {
            return value;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n() {
        String value = this.f.getValue();
        if (getInstrumentNameList().indexOf(value) > 0) {
            return value;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FilterItems o(Resource resource) {
        if (resource == null || !resource.isComplete()) {
            return null;
        }
        return t(getApplication(), (InstrumentsAndBodyparts) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(FilterItems filterItems) {
        List<String> list;
        if (filterItems == null || (list = filterItems.instruments) == null || list.isEmpty()) {
            return;
        }
        this.f.setValue(filterItems.instruments.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(FilterItems filterItems) {
        List<String> list;
        if (filterItems == null || (list = filterItems.bodyparts) == null || list.isEmpty()) {
            return;
        }
        this.g.setValue(filterItems.bodyparts.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(FilterItems filterItems) {
        List<FilterItems.Difficulty> list;
        if (filterItems == null || (list = filterItems.difficulties) == null || list.isEmpty()) {
            return;
        }
        this.h.setValue(filterItems.difficulties.get(0));
    }

    private static <I, O> List<O> s(List<I> list, com.xiaomi.hm.health.training.api.function.Function<I, O> function) {
        ArrayList arrayList = new ArrayList();
        Iterator<I> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(function.apply(it2.next()));
        }
        return arrayList;
    }

    private static FilterItems t(@NonNull Context context, @Nullable InstrumentsAndBodyparts instrumentsAndBodyparts) {
        List<String> list;
        List<String> list2;
        FilterItems filterItems = new FilterItems();
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.not_limit_instrument));
        if (instrumentsAndBodyparts != null && (list2 = instrumentsAndBodyparts.instruments) != null) {
            arrayList.addAll(list2);
        }
        filterItems.instruments = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(context.getString(R.string.not_limit_body_part));
        if (instrumentsAndBodyparts != null && (list = instrumentsAndBodyparts.bodyparts) != null) {
            arrayList2.addAll(list);
        }
        filterItems.bodyparts = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (String str : context.getResources().getStringArray(R.array.train_difficulity)) {
            String[] strArrSplit = str.split(",");
            FilterItems.Difficulty difficulty = new FilterItems.Difficulty();
            if (strArrSplit.length > 0) {
                difficulty.name = strArrSplit[0];
            }
            if (strArrSplit.length > 1) {
                difficulty.level = strArrSplit[1];
            }
            arrayList3.add(difficulty);
        }
        filterItems.difficulties = arrayList3;
        return filterItems;
    }

    @NonNull
    public List<String> getBodyPartNameList() {
        List<String> list;
        FilterItems value = this.e.getValue();
        return (value == null || (list = value.bodyparts) == null) ? Collections.emptyList() : list;
    }

    @NonNull
    public List<FilterItems.Difficulty> getDifficultyList() {
        List<FilterItems.Difficulty> list;
        FilterItems value = this.e.getValue();
        return (value == null || (list = value.difficulties) == null) ? Collections.emptyList() : list;
    }

    @NonNull
    public List<String> getDifficultyNameList() {
        return s(getDifficultyList(), new com.xiaomi.hm.health.training.api.function.Function() { // from class: o5
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return ((FilterItems.Difficulty) obj).name;
            }
        });
    }

    @NonNull
    public List<String> getInstrumentNameList() {
        List<String> list;
        FilterItems value = this.e.getValue();
        return (value == null || (list = value.instruments) == null) ? Collections.emptyList() : list;
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c;
    }

    public LiveData<PagedList<ActionOrYogaTraining>> getPagedList() {
        return this.b;
    }

    public LiveData<Resource<Void>> getRefreshState() {
        return this.d;
    }

    public LiveData<String> getSelectedBodypart() {
        return this.g;
    }

    public LiveData<FilterItems.Difficulty> getSelectedDifficulty() {
        return this.h;
    }

    @Nullable
    public String getSelectedDifficultyName() {
        if (this.h.getValue() != null) {
            return this.h.getValue().name;
        }
        return null;
    }

    public LiveData<String> getSelectedInstrument() {
        return this.f;
    }

    public void refresh() {
        Runnable refresh = this.a.getRefresh();
        if (refresh != null) {
            refresh.run();
        }
    }

    public void retry() {
        Runnable retry = this.a.getRetry();
        if (retry != null) {
            retry.run();
        }
    }

    public boolean setSelectedBodypart(String str) {
        if (TextUtils.equals(this.g.getValue(), str)) {
            return false;
        }
        this.g.setValue(str);
        return true;
    }

    public boolean setSelectedDifficulty(FilterItems.Difficulty difficulty) {
        if (TextUtils.equals(this.h.getValue() != null ? this.h.getValue().level : null, difficulty.level)) {
            return false;
        }
        this.h.setValue(difficulty);
        return true;
    }

    public boolean setSelectedInstrument(@Nullable String str) {
        if (TextUtils.equals(this.f.getValue(), str)) {
            return false;
        }
        this.f.setValue(str);
        return true;
    }
}
