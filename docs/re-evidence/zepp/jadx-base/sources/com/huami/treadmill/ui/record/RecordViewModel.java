package com.huami.treadmill.ui.record;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.treadmill.data.TdTrackrecord;
import com.huami.treadmill.helper.AppExecutorsLocator;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.ui.record.RecordViewModel;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001f\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0016R\u001b\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/huami/treadmill/ui/record/RecordViewModel;", "Landroidx/lifecycle/ViewModel;", "", "getRecords", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "uploadTrackRecords", "uploadBoltRecord", "", "num", "setSelectNum", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/treadmill/data/TdTrackrecord;", "a", "Landroidx/lifecycle/MutableLiveData;", "_records", "", "b", "_uploadStatus", "c", "_selectNum", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "records", "getUploadStatus", "uploadStatus", "getSelectNum", "selectNum", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class RecordViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<TdTrackrecord>> _records;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _uploadStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _selectNum;

    public RecordViewModel() {
        MutableLiveData<List<TdTrackrecord>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new ArrayList());
        Unit unit = Unit.INSTANCE;
        this._records = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this._uploadStatus = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(0);
        this._selectNum = mutableLiveData3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List list, final RecordViewModel recordViewModel) {
        final Boolean boolUploadBoltTrackRecords = ProxyBoltTrackRecord.INSTANCE.getInstance().uploadBoltTrackRecords(list);
        AppExecutorsLocator.INSTANCE.instance().getMainExecutor().execute(new Runnable() { // from class: r96
            @Override // java.lang.Runnable
            public final void run() {
                RecordViewModel.e(this.a, boolUploadBoltTrackRecords);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RecordViewModel recordViewModel, Boolean bool) {
        recordViewModel._uploadStatus.setValue(bool);
    }

    @NotNull
    public final LiveData<List<TdTrackrecord>> getRecords() {
        return this._records;
    }

    @NotNull
    public final LiveData<Integer> getSelectNum() {
        return this._selectNum;
    }

    @NotNull
    public final LiveData<Boolean> getUploadStatus() {
        return this._uploadStatus;
    }

    public final void setSelectNum(int num) {
        this._selectNum.setValue(Integer.valueOf(num));
    }

    public final void uploadBoltRecord(@NotNull final List<Trackrecord> uploadTrackRecords) {
        AppExecutorsLocator.INSTANCE.instance().getNetworkExecutor().execute(new Runnable() { // from class: s96
            @Override // java.lang.Runnable
            public final void run() {
                RecordViewModel.c(uploadTrackRecords, this);
            }
        });
    }

    /* JADX INFO: renamed from: getRecords, reason: collision with other method in class */
    public final void m3408getRecords() {
        MutableLiveData<List<TdTrackrecord>> mutableLiveData = this._records;
        List<Trackrecord> noOwnerBoltTrackRecords = ProxyBoltTrackRecord.INSTANCE.getInstance().getNoOwnerBoltTrackRecords();
        List<TdTrackrecord> mutableList = null;
        if (noOwnerBoltTrackRecords != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(noOwnerBoltTrackRecords, 10));
            for (Trackrecord trackrecord : noOwnerBoltTrackRecords) {
                List<TdTrackrecord> value = this._records.getValue();
                boolean zIsChecked = false;
                if (value != null) {
                    Iterator<T> it2 = value.iterator();
                    Object obj = null;
                    boolean z = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (z) {
                                break;
                            } else {
                                break;
                            }
                        }
                        Object next = it2.next();
                        TdTrackrecord tdTrackrecord = (TdTrackrecord) next;
                        if (Intrinsics.areEqual(tdTrackrecord.getTrackrecord().getTrackid(), trackrecord.getTrackid()) && Intrinsics.areEqual(tdTrackrecord.getTrackrecord().getSource(), trackrecord.getSource())) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                        obj = null;
                        break;
                    }
                    TdTrackrecord tdTrackrecord2 = (TdTrackrecord) obj;
                    if (tdTrackrecord2 != null) {
                        zIsChecked = tdTrackrecord2.isChecked();
                    }
                }
                arrayList.add(new TdTrackrecord(trackrecord, zIsChecked));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        }
        mutableLiveData.setValue(mutableList);
    }
}
