package com.xiaomi.hm.health.step.stage.repo;

import com.google.gson.Gson;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.step.stage.local.dao.StageDao;
import com.xiaomi.hm.health.step.stage.local.entity.StageEntity;
import com.xiaomi.hm.health.step.stage.model.StageEventItem;
import com.xiaomi.hm.health.step.stage.model.StageItem;
import com.xiaomi.hm.health.step.stage.remote.IEventApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/repo/ActivityStageRepo;", "Lcom/xiaomi/hm/health/step/stage/repo/IActivityStageRepo;", "Lcom/xiaomi/hm/health/step/stage/local/entity/StageEntity;", "localEntity", "remoteEntity", "", "b", "", "c", "item", "Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "a", "addStageInfo", "", "Ljava/lang/String;", "userId", "Lcom/xiaomi/hm/health/step/stage/local/dao/StageDao;", "Lcom/xiaomi/hm/health/step/stage/local/dao/StageDao;", "dao", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "api", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/step/stage/local/dao/StageDao;Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ActivityStageRepo implements IActivityStageRepo {

    @NotNull
    private static final String d = "ActivityStageRepo";

    @NotNull
    private static final String e = "stepStage";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final StageDao dao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IEventApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Local stage data is same with input data,No need upload.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StageEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StageEntity stageEntity) {
            super(0);
            this.a = stageEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Before merge: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ StageEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StageEntity stageEntity) {
            super(0);
            this.a = stageEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "After merge: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Try upload events.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Upload stage success : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No data need upload.";
        }
    }

    public ActivityStageRepo(@NotNull String str, @NotNull StageDao stageDao, @NotNull IEventApi iEventApi) {
        this.userId = str;
        this.dao = stageDao;
        this.api = iEventApi;
    }

    private final StageEventItem a(StageEntity item) {
        return new StageEventItem(e, item.getUserId(), item.getDate(), item.getDeviceSource(), new Gson().toJson(item.getStage()));
    }

    private final boolean b(StageEntity localEntity, StageEntity remoteEntity) {
        boolean z;
        Object next;
        HMLog.debug(d, new b(localEntity));
        if (localEntity.getDeviceSource() != remoteEntity.getDeviceSource()) {
            localEntity.setDeviceSource(remoteEntity.getDeviceSource());
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.areEqual(localEntity.getTimeZoneId(), remoteEntity.getTimeZoneId())) {
            localEntity.setTimeZoneId(remoteEntity.getTimeZoneId());
            z = true;
        }
        for (StageItem stageItem : remoteEntity.getStage()) {
            Iterator<T> it2 = localEntity.getStage().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((StageItem) next).getTimeIndex() == stageItem.getTimeIndex()));
            StageItem stageItem2 = (StageItem) next;
            if (!Intrinsics.areEqual(stageItem2 != null ? stageItem2.getValue() : null, stageItem.getValue())) {
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) localEntity.getStage());
                if (stageItem2 != null) {
                    mutableList.remove(stageItem2);
                }
                mutableList.add(stageItem);
                z = true;
            }
        }
        if (z) {
            localEntity.setUploaded(false);
            CollectionsKt___CollectionsKt.sortedWith(localEntity.getStage(), new Comparator() { // from class: com.xiaomi.hm.health.step.stage.repo.ActivityStageRepo$mergeRemote$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((StageItem) t).getTimeIndex()), Integer.valueOf(((StageItem) t2).getTimeIndex()));
                }
            });
        }
        HMLog.debug(d, new c(localEntity));
        return z;
    }

    private final synchronized void c() {
        HMLog.info(d, d.a);
        List<StageEntity> needUploadData = this.dao.getNeedUploadData(this.userId);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(needUploadData, 10));
        Iterator<T> it2 = needUploadData.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((StageEntity) it2.next()));
        }
        if (arrayList.isEmpty()) {
            HMLog.info(d, f.a);
        } else {
            try {
                boolean zPostEvents = this.api.postEvents(arrayList);
                HMLog.info(d, new e(zPostEvents));
                if (zPostEvents) {
                    Iterator<T> it3 = needUploadData.iterator();
                    while (it3.hasNext()) {
                        ((StageEntity) it3.next()).setUploaded(true);
                    }
                    this.dao.insert(needUploadData);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.xiaomi.hm.health.step.stage.repo.IActivityStageRepo
    public synchronized void addStageInfo(@NotNull StageEntity item) {
        StageEntity stageEntityQuery = this.dao.query(this.userId, item.getDate());
        if (stageEntityQuery == null) {
            this.dao.insert(kotlin.collections.e.listOf(item));
        } else if (b(stageEntityQuery, item)) {
            this.dao.insert(kotlin.collections.e.listOf(stageEntityQuery));
        } else {
            HMLog.info(d, a.a);
        }
        c();
    }
}
