package com.huami.healthlabel.healthlabelhistory;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.RecordContent;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelDayEntity;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryEntity;
import com.huami.healthlabel.healthlabelhistory.adapter.LoadMoreLabelHistoryData;
import com.huami.healthlabel.repository.HealthLabelRepo;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00178\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006'"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/HealthLabelHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "healthTagRecord", "", "lastLabelTime", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "a", "", "startTime", "lastLabelTimeStamp", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryEntity;", "lastHistoryData", "", "loadLabelHistoryData", "labelText", "endTime", "deleteLabelRecord", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/healthlabel/healthlabelhistory/adapter/LoadMoreLabelHistoryData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getLabelHistoryData", "()Landroidx/lifecycle/MutableLiveData;", "setLabelHistoryData", "(Landroidx/lifecycle/MutableLiveData;)V", "labelHistoryData", "", "c", "getLabelDeleteStatus", "labelDeleteStatus", "<init>", "(Lcom/huami/healthlabel/repository/HealthLabelRepo;)V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelHistoryViewModel extends ViewModel {
    public static final int PAGE_SIZE = 300;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<LoadMoreLabelHistoryData> labelHistoryData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> labelDeleteStatus = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryViewModel$deleteLabelRecord$1", f = "HealthLabelHistoryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j, long j2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
            this.e = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthLabelHistoryViewModel.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthLabelHistoryViewModel.this.getLabelDeleteStatus().postValue(Boxing.boxBoolean(HealthLabelHistoryViewModel.this.repo.deleteRecordLabel(this.c, this.d, this.e)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryViewModel$loadLabelHistoryData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryViewModel$loadLabelHistoryData$1", f = "HealthLabelHistoryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ List<HealthLabelHistoryEntity> d;
        public final /* synthetic */ Ref.BooleanRef e;
        public final /* synthetic */ SimpleDateFormat f;
        public final /* synthetic */ String g;
        public final /* synthetic */ SimpleDateFormat h;
        public final /* synthetic */ HealthLabelHistoryEntity i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, List<HealthLabelHistoryEntity> list, Ref.BooleanRef booleanRef, SimpleDateFormat simpleDateFormat, String str, SimpleDateFormat simpleDateFormat2, HealthLabelHistoryEntity healthLabelHistoryEntity, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = list;
            this.e = booleanRef;
            this.f = simpleDateFormat;
            this.g = str;
            this.h = simpleDateFormat2;
            this.i = healthLabelHistoryEntity;
            this.j = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthLabelHistoryViewModel.this.new AnonymousClass1(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            String str2;
            Iterator it2;
            List list;
            String str3;
            HealthLabelHistoryEntity healthLabelHistoryEntity;
            AnonymousClass1 anonymousClass1 = this;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (anonymousClass1.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(HealthLabelHistoryViewModel.this.repo.loadRecordLabelFromNet(300, 0L, anonymousClass1.c, null, true), new Comparator<T>() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryViewModel$loadLabelHistoryData$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HealthTagRecord) t2).getTimestamp()), Long.valueOf(((HealthTagRecord) t).getTimestamp()));
                }
            });
            List<HealthLabelHistoryEntity> list2 = anonymousClass1.d;
            SimpleDateFormat simpleDateFormat = anonymousClass1.f;
            String str4 = anonymousClass1.g;
            SimpleDateFormat simpleDateFormat2 = anonymousClass1.h;
            HealthLabelHistoryViewModel healthLabelHistoryViewModel = HealthLabelHistoryViewModel.this;
            Ref.BooleanRef booleanRef = anonymousClass1.e;
            HealthLabelHistoryEntity healthLabelHistoryEntity2 = anonymousClass1.i;
            String str5 = anonymousClass1.j;
            Iterator it3 = listSortedWith.iterator();
            while (it3.hasNext()) {
                HealthTagRecord healthTagRecord = (HealthTagRecord) it3.next();
                int size = list2.size();
                String strMillis2String = DateExtKt.millis2String(healthTagRecord.getTimestamp(), simpleDateFormat);
                if (size <= 0 || !Intrinsics.areEqual(DateExtKt.millis2String(list2.get(size - 1).getMLabelDate(), simpleDateFormat), strMillis2String)) {
                    if (Intrinsics.areEqual(str4, strMillis2String)) {
                        str = str4;
                        str2 = str5;
                        it2 = it3;
                        list = listSortedWith;
                        booleanRef.element = true;
                        if (healthLabelHistoryEntity2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (Intrinsics.areEqual(DateExtKt.millis2String(((HealthTagRecord) obj2).getTimestamp(), simpleDateFormat), DateExtKt.millis2String(healthTagRecord.getTimestamp(), simpleDateFormat))) {
                                    arrayList.add(obj2);
                                }
                            }
                            healthLabelHistoryEntity2.setUniqueID(UUID.randomUUID().toString());
                            str3 = str2;
                            healthLabelHistoryEntity2.getMDayLabelData().addAll(healthLabelHistoryViewModel.a(arrayList, str3));
                            Boxing.boxBoolean(list2.add(healthLabelHistoryEntity2));
                        }
                        anonymousClass1 = this;
                        str5 = str3;
                        listSortedWith = list;
                        str4 = str;
                        it3 = it2;
                    } else {
                        String strMillis2String2 = DateExtKt.millis2String(healthTagRecord.getTimestamp(), simpleDateFormat2);
                        if (size <= 0 || Intrinsics.areEqual(DateExtKt.millis2String(list2.get(size - 1).getMLabelDate(), simpleDateFormat2), strMillis2String2)) {
                            healthLabelHistoryEntity = new HealthLabelHistoryEntity(1);
                            healthLabelHistoryEntity.setUniqueID(UUID.randomUUID().toString());
                            healthLabelHistoryEntity.setMLabelDate(healthTagRecord.getTimestamp());
                        } else {
                            healthLabelHistoryEntity = new HealthLabelHistoryEntity(3);
                            healthLabelHistoryEntity.setUniqueID(UUID.randomUUID().toString());
                            healthLabelHistoryEntity.setMLabelDate(healthTagRecord.getTimestamp());
                        }
                        HealthLabelHistoryEntity healthLabelHistoryEntity3 = new HealthLabelHistoryEntity(2);
                        healthLabelHistoryEntity3.setUniqueID(UUID.randomUUID().toString());
                        healthLabelHistoryEntity3.setMLabelDate(healthTagRecord.getTimestamp());
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listSortedWith) {
                            String str6 = str4;
                            String str7 = str5;
                            Iterator it4 = it3;
                            List list3 = listSortedWith;
                            if (Intrinsics.areEqual(DateExtKt.millis2String(((HealthTagRecord) obj3).getTimestamp(), simpleDateFormat), DateExtKt.millis2String(healthTagRecord.getTimestamp(), simpleDateFormat))) {
                                arrayList2.add(obj3);
                            }
                            listSortedWith = list3;
                            str4 = str6;
                            str5 = str7;
                            it3 = it4;
                        }
                        str = str4;
                        str2 = str5;
                        it2 = it3;
                        list = listSortedWith;
                        healthLabelHistoryEntity3.setMDayLabelData(HealthLabelHistoryViewModel.b(healthLabelHistoryViewModel, arrayList2, null, 2, null));
                        list2.add(healthLabelHistoryEntity);
                        list2.add(healthLabelHistoryEntity3);
                    }
                    str3 = str2;
                    anonymousClass1 = this;
                    str5 = str3;
                    listSortedWith = list;
                    str4 = str;
                    it3 = it2;
                }
            }
            List list4 = listSortedWith;
            AnonymousClass1 anonymousClass2 = anonymousClass1;
            HealthLabelHistoryViewModel.this.getLabelHistoryData().postValue(new LoadMoreLabelHistoryData(anonymousClass2.d, list4.size() < 300, anonymousClass2.e.element));
            return Unit.INSTANCE;
        }
    }

    public HealthLabelHistoryViewModel(@NotNull HealthLabelRepo healthLabelRepo) {
        this.repo = healthLabelRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HealthLabelDayEntity> a(List<HealthTagRecord> healthTagRecord, String lastLabelTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        for (HealthTagRecord healthTagRecord2 : healthTagRecord) {
            int size = arrayList.size();
            String strMillis2String = DateExtKt.millis2String(healthTagRecord2.getTimestamp(), simpleDateFormat);
            if (size <= 0 || !Intrinsics.areEqual(DateExtKt.millis2String(((HealthLabelDayEntity) arrayList.get(size - 1)).getMLabelDate(), simpleDateFormat), strMillis2String)) {
                if (!Intrinsics.areEqual(strMillis2String, lastLabelTime)) {
                    HealthLabelDayEntity healthLabelDayEntity = new HealthLabelDayEntity(1);
                    healthLabelDayEntity.setMLabelDate(healthTagRecord2.getTimestamp());
                    arrayList.add(healthLabelDayEntity);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : healthTagRecord) {
                    if (Intrinsics.areEqual(DateExtKt.millis2String(((HealthTagRecord) obj).getTimestamp(), simpleDateFormat), DateExtKt.millis2String(healthTagRecord2.getTimestamp(), simpleDateFormat))) {
                        arrayList2.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList2) {
                    RecordContent recordContent = EntryExtKt.getRecordContent((HealthTagRecord) obj2);
                    String labelText = recordContent == null ? null : recordContent.getLabelText();
                    Object arrayList3 = linkedHashMap.get(labelText);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(labelText, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    List list = (List) ((Map.Entry) it2.next()).getValue();
                    HealthLabelDayEntity healthLabelDayEntity2 = new HealthLabelDayEntity(2);
                    int size2 = list.size();
                    if (size2 > 0) {
                        healthLabelDayEntity2.setMLabelDate(((HealthTagRecord) list.get(0)).getTimestamp());
                        RecordContent recordContent2 = EntryExtKt.getRecordContent((HealthTagRecord) list.get(0));
                        if (recordContent2 != null) {
                            healthLabelDayEntity2.setLabelText(size2 > 1 ? recordContent2.getLabelText() + "  +" + list.size() : recordContent2.getLabelText());
                            healthLabelDayEntity2.setLabelColor(recordContent2.getLabelColor());
                        }
                    }
                    healthLabelDayEntity2.setLabelCount(size2);
                    arrayList4.add(healthLabelDayEntity2);
                }
                arrayList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List b(HealthLabelHistoryViewModel healthLabelHistoryViewModel, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return healthLabelHistoryViewModel.a(list, str);
    }

    public static /* synthetic */ void loadLabelHistoryData$default(HealthLabelHistoryViewModel healthLabelHistoryViewModel, long j, long j2, HealthLabelHistoryEntity healthLabelHistoryEntity, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            healthLabelHistoryEntity = null;
        }
        healthLabelHistoryViewModel.loadLabelHistoryData(j, j3, healthLabelHistoryEntity);
    }

    public final void deleteLabelRecord(@NotNull String labelText, long startTime, long endTime) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(labelText, startTime, endTime, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getLabelDeleteStatus() {
        return this.labelDeleteStatus;
    }

    @NotNull
    public final MutableLiveData<LoadMoreLabelHistoryData> getLabelHistoryData() {
        return this.labelHistoryData;
    }

    public final void loadLabelHistoryData(long startTime, long lastLabelTimeStamp, @Nullable HealthLabelHistoryEntity lastHistoryData) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", Locale.getDefault());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        String strMillis2String = DateExtKt.millis2String(lastLabelTimeStamp, simpleDateFormat);
        String strMillis2String2 = DateExtKt.millis2String(lastLabelTimeStamp, simpleDateFormat3);
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(startTime, arrayList, new Ref.BooleanRef(), simpleDateFormat, strMillis2String, simpleDateFormat2, lastHistoryData, strMillis2String2, null), 2, null);
    }

    public final void setLabelHistoryData(@NotNull MutableLiveData<LoadMoreLabelHistoryData> mutableLiveData) {
        this.labelHistoryData = mutableLiveData;
    }
}
