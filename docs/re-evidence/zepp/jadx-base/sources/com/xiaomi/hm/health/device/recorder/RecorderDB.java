package com.xiaomi.hm.health.device.recorder;

import com.huami.devicerecorder.model.IRecorderDB;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.database.DeviceDataDb;
import com.xiaomi.hm.health.device.database.dao.DeviceRecordDao;
import com.xiaomi.hm.health.device.database.entity.DeviceRecordEntity;
import com.xiaomi.hm.health.di.koin.scope.ScopesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecorderDB;", "Lcom/huami/devicerecorder/model/IRecorderDB;", "Lcom/huami/devicerecorder/model/RecordFile;", "file", "Lcom/xiaomi/hm/health/device/database/entity/DeviceRecordEntity;", "b", "entity", "a", "recorderFile", "", "delete", "", "recorderFiles", Constant.METHOD_INSERT, "queryAll", "Lcom/xiaomi/hm/health/device/database/dao/DeviceRecordDao;", "Lcom/xiaomi/hm/health/device/database/dao/DeviceRecordDao;", "dao", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RecorderDB implements IRecorderDB {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRecordDao dao = ((DeviceDataDb) ScopesKt.deviceDataScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(DeviceDataDb.class), null, null)).deviceRecordDao();

    private final RecordFile a(DeviceRecordEntity entity) {
        return new RecordFile(entity.getId(), entity.getRecordTime(), entity.getDuration(), entity.getLocalPath(), entity.getServerPath(), true, true, entity.getFileSize(), null);
    }

    private final DeviceRecordEntity b(RecordFile file) {
        return new DeviceRecordEntity(file.getId(), file.getRecordTime(), file.getDuration(), file.getLocalPath(), file.getServerPath(), file.getFileSize());
    }

    @Override // com.huami.devicerecorder.model.IRecorderDB
    public void delete(@NotNull RecordFile recorderFile) {
        this.dao.delete(b(recorderFile));
    }

    @Override // com.huami.devicerecorder.model.IRecorderDB
    public void insert(@NotNull RecordFile recorderFile) {
        this.dao.insert(b(recorderFile));
    }

    @Override // com.huami.devicerecorder.model.IRecorderDB
    @NotNull
    public List<RecordFile> queryAll() {
        List<DeviceRecordEntity> allSyncedRecord = this.dao.getAllSyncedRecord();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allSyncedRecord, 10));
        Iterator<T> it2 = allSyncedRecord.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((DeviceRecordEntity) it2.next()));
        }
        return arrayList;
    }

    @Override // com.huami.devicerecorder.model.IRecorderDB
    public void delete(@NotNull List<RecordFile> recorderFiles) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(recorderFiles, 10));
        Iterator<T> it2 = recorderFiles.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((RecordFile) it2.next()));
        }
        this.dao.delete(arrayList);
    }

    @Override // com.huami.devicerecorder.model.IRecorderDB
    public void insert(@NotNull List<RecordFile> recorderFiles) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(recorderFiles, 10));
        Iterator<T> it2 = recorderFiles.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((RecordFile) it2.next()));
        }
        this.dao.insert(arrayList);
    }
}
