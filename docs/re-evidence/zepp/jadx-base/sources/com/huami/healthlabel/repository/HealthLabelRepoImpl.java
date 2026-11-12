package com.huami.healthlabel.repository;

import android.widget.Toast;
import androidx.annotation.WorkerThread;
import androidx.p008lifecycle.LiveData;
import com.facebook.appevents.UserDataStore;
import com.huami.healthlabel.R;
import com.huami.healthlabel.db.LabelDb;
import com.huami.healthlabel.db.dao.HealthLabelDao;
import com.huami.healthlabel.db.dao.HomeLabelDao;
import com.huami.healthlabel.db.po.HealthLabel;
import com.huami.healthlabel.db.po.HomeLabel;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.entry.LabelItems;
import com.huami.healthlabel.entry.LabelProperties;
import com.huami.healthlabel.repository.HealthLabelRepoImpl;
import com.huami.healthlabel.utils.LoadOnActiveLiveData;
import com.huami.healthlabel.utils.SpUtilsKt;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.huami.healthlabel.web.ApiResponse;
import com.huami.healthlabel.web.ApiSuccessResponse;
import com.huami.healthlabel.web.JsonParseException;
import com.huami.healthlabel.web.WebApi;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b3\u00104J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0017J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0014\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016JC\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J \u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020!H\u0016R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/healthlabel/repository/HealthLabelRepoImpl;", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "labels", "", "updateHomeLabel", "", "deleteAndUpdateHomeLabel", "shouldFetch", "Landroidx/lifecycle/LiveData;", "Lcom/huami/healthlabel/repository/Resource;", "loadAllManagerLabel", "Lcom/huami/healthlabel/db/po/HomeLabel;", "loadAllManagerLabelFromLocal", "loadShowHomeLabel", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "labelHealthTag", "insertMyHealthRecord", "labelHealthTags", "insertMyHealthRecordFromDb", "", "limit", "", "startTime", "endTime", "nextTime", "loadRecordLabel", "(IJJLjava/lang/Long;)Landroidx/lifecycle/LiveData;", "reverse", "loadRecordLabelFromNet", "(IJJLjava/lang/Long;Z)Ljava/util/List;", "loadRecordLabelFromLocal", "", "labelText", "deleteRecordLabel", "clearHomeLabelCache", "body", "markDeleteHomeLabel", "Lcom/huami/healthlabel/repository/AppExecutors;", "a", "Lcom/huami/healthlabel/repository/AppExecutors;", "appExecutors", "Lcom/huami/healthlabel/db/LabelDb;", "b", "Lcom/huami/healthlabel/db/LabelDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/healthlabel/web/WebApi;", "c", "Lcom/huami/healthlabel/web/WebApi;", "webApi", "<init>", "(Lcom/huami/healthlabel/repository/AppExecutors;Lcom/huami/healthlabel/db/LabelDb;Lcom/huami/healthlabel/web/WebApi;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelRepoImpl implements HealthLabelRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LabelDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WebApi webApi;

    public HealthLabelRepoImpl(@NotNull AppExecutors appExecutors, @NotNull LabelDb labelDb, @NotNull WebApi webApi) {
        this.appExecutors = appExecutors;
        this.db = labelDb;
        this.webApi = webApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HealthLabelRepoImpl healthLabelRepoImpl) {
        healthLabelRepoImpl.db.homeLabelDao().deleteAllLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HealthLabelRepoImpl healthLabelRepoImpl, HealthTagRecord healthTagRecord) {
        healthLabelRepoImpl.db.healthLabelDao().insertLabel(EntryExtKt.convert(healthTagRecord));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HealthLabelRepoImpl healthLabelRepoImpl, HealthTagRecord healthTagRecord) {
        healthLabelRepoImpl.webApi.insertHealthLabelRecord(healthTagRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HealthLabelRepoImpl healthLabelRepoImpl, List list) {
        healthLabelRepoImpl.webApi.insertHealthLabelRecord((List<HealthTagRecord>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HealthLabelRepoImpl healthLabelRepoImpl, String str) {
        healthLabelRepoImpl.webApi.markDeleteHomeLabel(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HealthLabelRepoImpl healthLabelRepoImpl, List list) {
        HomeLabelDao homeLabelDao = healthLabelRepoImpl.db.homeLabelDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(EntryExtKt.convert((HomeHealthLabel) it2.next()));
        }
        homeLabelDao.insertLabel(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HealthLabelRepoImpl healthLabelRepoImpl, List list) {
        healthLabelRepoImpl.webApi.updateHomeTable(list);
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public void clearHomeLabelCache() {
        this.appExecutors.diskIO().execute(new Runnable() { // from class: pw3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelRepoImpl.h(this.a);
            }
        });
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @WorkerThread
    public boolean deleteAndUpdateHomeLabel(@NotNull List<HomeHealthLabel> labels) {
        int code = this.webApi.updateHomeTable(labels).getCode();
        if (!(200 <= code && code < 300)) {
            return false;
        }
        HomeLabelDao homeLabelDao = this.db.homeLabelDao();
        homeLabelDao.deleteAllLabel();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(labels, 10));
        Iterator<T> it2 = labels.iterator();
        while (it2.hasNext()) {
            arrayList.add(EntryExtKt.convert((HomeHealthLabel) it2.next()));
        }
        homeLabelDao.insertLabel(arrayList);
        return true;
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public boolean deleteRecordLabel(@NotNull String labelText, long startTime, long endTime) {
        List<HealthLabel> listQuerySameLabels = this.db.healthLabelDao().querySameLabels(startTime, endTime, labelText);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQuerySameLabels, 10));
        Iterator<T> it2 = listQuerySameLabels.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((HealthLabel) it2.next()).getTimestamp()));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        String string = arrayList.toString();
        boolean zDeleteHealthLabelRecord = this.webApi.deleteHealthLabelRecord(m.replace$default(string.substring(1, string.length() - 1), " ", "", false, 4, (Object) null));
        if (zDeleteHealthLabelRecord) {
            this.db.healthLabelDao().deleteLabel(labelText, startTime, endTime);
        }
        return zDeleteHealthLabelRecord;
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public void insertMyHealthRecord(@NotNull final HealthTagRecord labelHealthTag) {
        if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            UtilsKt.toast(R.string.health_label_network_error);
        } else {
            this.appExecutors.diskIO().execute(new Runnable() { // from class: qw3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelRepoImpl.i(this.a, labelHealthTag);
                }
            });
            this.appExecutors.networkIO().execute(new Runnable() { // from class: rw3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelRepoImpl.j(this.a, labelHealthTag);
                }
            });
        }
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public void insertMyHealthRecordFromDb(@NotNull final List<HealthTagRecord> labelHealthTags) {
        if (UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            this.appExecutors.networkIO().execute(new Runnable() { // from class: uw3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelRepoImpl.k(this.a, labelHealthTags);
                }
            });
        }
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @NotNull
    public LiveData<Resource<List<HomeHealthLabel>>> loadAllManagerLabel(final boolean shouldFetch) {
        return new NetworkBoundResource<List<? extends HomeLabel>, LabelProperties, List<? extends HomeHealthLabel>>(this.appExecutors) { // from class: com.huami.healthlabel.repository.HealthLabelRepoImpl.loadAllManagerLabel.1

            /* JADX INFO: renamed from: com.huami.healthlabel.repository.HealthLabelRepoImpl$loadAllManagerLabel$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/healthlabel/web/ApiResponse;", "Lcom/huami/healthlabel/entry/LabelProperties;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<LabelProperties>> {
                public final /* synthetic */ HealthLabelRepoImpl a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HealthLabelRepoImpl healthLabelRepoImpl) {
                    super(0);
                    this.a = healthLabelRepoImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<LabelProperties> getA() {
                    return this.a.webApi.loadAllHomeTable();
                }
            }

            /* JADX INFO: renamed from: com.huami.healthlabel.repository.HealthLabelRepoImpl$loadAllManagerLabel$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "健康管理标签解析失败";
                }
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<LabelProperties>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(HealthLabelRepoImpl.this.appExecutors.networkIO(), new a(HealthLabelRepoImpl.this));
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            @NotNull
            public LiveData<List<? extends HomeLabel>> loadFromDb() {
                return HealthLabelRepoImpl.this.db.homeLabelDao().queryAllLabel();
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ List<? extends HomeHealthLabel> poToVo(List<? extends HomeLabel> list) {
                return poToVo2((List<HomeLabel>) list);
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends HomeLabel> list) {
                return shouldFetch2((List<HomeLabel>) list);
            }

            @Nullable
            /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
            public List<HomeHealthLabel> poToVo2(@Nullable List<HomeLabel> po) {
                if (po == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
                Iterator<T> it2 = po.iterator();
                while (it2.hasNext()) {
                    arrayList.add(EntryExtKt.convert((HomeLabel) it2.next()));
                }
                return arrayList;
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public void saveCallResult(@NotNull LabelProperties result) throws JSONException {
                try {
                    List<HomeHealthLabel> list = EntryExtKt.parse(result);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(EntryExtKt.convert((HomeHealthLabel) it2.next()));
                    }
                    HealthLabelRepoImpl.this.db.homeLabelDao().deleteAllLabel();
                    HealthLabelRepoImpl.this.db.homeLabelDao().insertLabel(arrayList);
                } catch (JsonParseException unused) {
                    HMLog.warn$default("HealthLabel", null, b.a, 2, null);
                }
            }

            /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
            public boolean shouldFetch2(@Nullable List<HomeLabel> data) {
                return shouldFetch;
            }
        }.asLiveData();
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @WorkerThread
    @NotNull
    public List<HomeLabel> loadAllManagerLabelFromLocal() {
        return this.db.homeLabelDao().queryAllLabelList();
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @NotNull
    public LiveData<Resource<List<HealthTagRecord>>> loadRecordLabel(final int limit, final long startTime, final long endTime, @Nullable final Long nextTime) {
        return new NetworkBoundResource<List<? extends HealthLabel>, LabelItems, List<? extends HealthTagRecord>>(this.appExecutors) { // from class: com.huami.healthlabel.repository.HealthLabelRepoImpl.loadRecordLabel.1

            /* JADX INFO: renamed from: com.huami.healthlabel.repository.HealthLabelRepoImpl$loadRecordLabel$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/healthlabel/web/ApiResponse;", "Lcom/huami/healthlabel/entry/LabelItems;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<LabelItems>> {
                public final /* synthetic */ HealthLabelRepoImpl a;
                public final /* synthetic */ int b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Long e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HealthLabelRepoImpl healthLabelRepoImpl, int i, long j, long j2, Long l) {
                    super(0);
                    this.a = healthLabelRepoImpl;
                    this.b = i;
                    this.c = j;
                    this.d = j2;
                    this.e = l;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<LabelItems> getA() {
                    return WebApi.DefaultImpls.loadHealthLabelRecord$default(this.a.webApi, this.b, Long.valueOf(this.c), Long.valueOf(this.d), this.e, false, 16, null);
                }
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<LabelItems>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(HealthLabelRepoImpl.this.appExecutors.networkIO(), new a(HealthLabelRepoImpl.this, limit, startTime, endTime, nextTime));
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            @NotNull
            public LiveData<List<? extends HealthLabel>> loadFromDb() {
                return HealthLabelRepoImpl.this.db.healthLabelDao().queryLabel(limit, startTime, endTime);
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ List<? extends HealthTagRecord> poToVo(List<? extends HealthLabel> list) {
                return poToVo2((List<HealthLabel>) list);
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends HealthLabel> list) {
                return shouldFetch2((List<HealthLabel>) list);
            }

            /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
            public boolean shouldFetch2(@Nullable List<HealthLabel> data) {
                return true;
            }

            @Nullable
            /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
            public List<HealthTagRecord> poToVo2(@Nullable List<HealthLabel> po) {
                if (po == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
                Iterator<T> it2 = po.iterator();
                while (it2.hasNext()) {
                    arrayList.add(EntryExtKt.convert((HealthLabel) it2.next()));
                }
                return arrayList;
            }

            @Override // com.huami.healthlabel.repository.NetworkBoundResource
            public void saveCallResult(@NotNull LabelItems result) {
                if (!SpUtilsKt.getHasRecordData()) {
                    SpUtilsKt.setHasRecordData(true);
                }
                HealthLabelRepoImpl.this.db.healthLabelDao().deleteLabel(startTime, endTime);
                HealthLabelDao healthLabelDao = HealthLabelRepoImpl.this.db.healthLabelDao();
                List<HealthTagRecord> items = result.getItems();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList.add(EntryExtKt.convert((HealthTagRecord) it2.next()));
                }
                healthLabelDao.insertLabel(arrayList);
            }
        }.asLiveData();
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @NotNull
    public List<HealthTagRecord> loadRecordLabelFromLocal(int limit, long startTime, long endTime) {
        List<HealthLabel> listQueryLabelList = this.db.healthLabelDao().queryLabelList(limit, startTime, endTime);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryLabelList, 10));
        Iterator<T> it2 = listQueryLabelList.iterator();
        while (it2.hasNext()) {
            arrayList.add(EntryExtKt.convert((HealthLabel) it2.next()));
        }
        return arrayList;
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @NotNull
    public List<HealthTagRecord> loadRecordLabelFromNet(int limit, long startTime, long endTime, @Nullable Long nextTime, boolean reverse) {
        ApiResponse<LabelItems> apiResponseLoadHealthLabelRecord = this.webApi.loadHealthLabelRecord(limit, Long.valueOf(startTime), Long.valueOf(endTime), nextTime, reverse);
        if (!(apiResponseLoadHealthLabelRecord instanceof ApiSuccessResponse)) {
            List<HealthLabel> listQueryLabelList = this.db.healthLabelDao().queryLabelList(limit, startTime, endTime);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryLabelList, 10));
            Iterator<T> it2 = listQueryLabelList.iterator();
            while (it2.hasNext()) {
                arrayList.add(EntryExtKt.convert((HealthLabel) it2.next()));
            }
            return arrayList;
        }
        List<HealthTagRecord> items = ((LabelItems) ((ApiSuccessResponse) apiResponseLoadHealthLabelRecord).getBody()).getItems();
        this.db.healthLabelDao().deleteLabel(startTime, endTime);
        HealthLabelDao healthLabelDao = this.db.healthLabelDao();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it3 = items.iterator();
        while (it3.hasNext()) {
            arrayList2.add(EntryExtKt.convert((HealthTagRecord) it3.next()));
        }
        healthLabelDao.insertLabel(arrayList2);
        return items;
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    @NotNull
    public List<HomeLabel> loadShowHomeLabel() {
        return this.db.homeLabelDao().queryLabel(true);
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public void markDeleteHomeLabel(@NotNull final String body) {
        this.appExecutors.networkIO().execute(new Runnable() { // from class: sw3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelRepoImpl.l(this.a, body);
            }
        });
    }

    @Override // com.huami.healthlabel.repository.HealthLabelRepo
    public void updateHomeLabel(@NotNull final List<HomeHealthLabel> labels) {
        if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            Toast.makeText(UtilsKt.getGlobalContext(), UtilsKt.getGlobalContext().getString(R.string.health_label_save_network_error), 0).show();
        } else {
            this.appExecutors.diskIO().execute(new Runnable() { // from class: vw3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelRepoImpl.m(this.a, labels);
                }
            });
            this.appExecutors.networkIO().execute(new Runnable() { // from class: tw3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelRepoImpl.n(this.a, labels);
                }
            });
        }
    }
}
