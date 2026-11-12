package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import defpackage.gmf;
import defpackage.z07;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\tJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR)\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011RE\u0010\u001e\u001a0\u0012,\u0012*\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011R\"\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "Lz07;", "documentFile", "", "getDocumentSize", "(Lz07;)V", "updateDocumentSize", "()V", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "installedDistrictMapDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "getInstalledDistrictMapDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "", "downloadDistrictLiveData", "getDownloadDistrictLiveData", "cancelDownloadDistrictLiveData", "getCancelDownloadDistrictLiveData", "districtInstallCompleteLiveData", "getDistrictInstallCompleteLiveData", "", "loadStatusLiveData", "getLoadStatusLiveData", "Lgmf;", "Lkotlin/Pair;", "installedDownloadStatusMediatorLiveData", "Lgmf;", "getInstalledDownloadStatusMediatorLiveData", "()Lgmf;", "storageSizeLiveData", "getStorageSizeLiveData", "unZipErrorLiveData", "getUnZipErrorLiveData", "supportSize", "J", "getSupportSize", "()J", "setSupportSize", "(J)V", "totalSize", "getTotalSize", "setTotalSize", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOfflineMapManagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineMapManagerViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,124:1\n13402#2,2:125\n*S KotlinDebug\n*F\n+ 1 OfflineMapManagerViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel\n*L\n63#1:125,2\n*E\n"})
public final class OfflineMapManagerViewModel extends BaseViewModel<BaseModel> {

    @NotNull
    public static final String TAG = "OfflineMapManagerViewModel";
    private long totalSize;

    @NotNull
    private final MutableLiveData<ConcurrentHashMap<String, DistrictData>> installedDistrictMapDataLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<DistrictData> cancelDownloadDistrictLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<DistrictData> districtInstallCompleteLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> loadStatusLiveData = new MutableLiveData<>();

    @NotNull
    private final gmf<Pair<ConcurrentHashMap<String, DistrictData>, ConcurrentHashMap<Long, DistrictData>>> installedDownloadStatusMediatorLiveData = new gmf<>();

    @NotNull
    private final MutableLiveData<Long> storageSizeLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Unit> unZipErrorLiveData = new MutableLiveData<>();
    private long supportSize = 34359738368L;

    @NotNull
    public final MutableLiveData<DistrictData> getCancelDownloadDistrictLiveData() {
        return this.cancelDownloadDistrictLiveData;
    }

    @NotNull
    public final MutableLiveData<DistrictData> getDistrictInstallCompleteLiveData() {
        return this.districtInstallCompleteLiveData;
    }

    public final void getDocumentSize(@NotNull z07 documentFile) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(documentFile, "documentFile");
        try {
            if (documentFile.l()) {
                z07[] z07VarArrM = documentFile.m();
                Intrinsics.checkNotNullExpressionValue(z07VarArrM, "listFiles(...)");
                for (z07 z07Var : z07VarArrM) {
                    Intrinsics.checkNotNull(z07Var);
                    getDocumentSize(z07Var);
                }
                return;
            }
            Uri uriK = documentFile.k();
            Intrinsics.checkNotNullExpressionValue(uriK, "getUri(...)");
            if (!Intrinsics.areEqual(uriK.getScheme(), MiuiCursorConstants.CONTENT) || (cursorQuery = AppUtil.getApp().getContentResolver().query(uriK, null, null, null, null)) == null) {
                return;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    int columnIndex = cursor2.getColumnIndex("_size");
                    int columnIndex2 = cursor2.getColumnIndex("_display_name");
                    long j = cursor2.getLong(columnIndex);
                    cursor2.getString(columnIndex2);
                    this.totalSize += j;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            Logger.i(getTAG(), "getDocumentSize error 文件访问失败");
        }
    }

    @NotNull
    public final MutableLiveData<ConcurrentHashMap<Long, DistrictData>> getDownloadDistrictLiveData() {
        return this.downloadDistrictLiveData;
    }

    @NotNull
    public final MutableLiveData<ConcurrentHashMap<String, DistrictData>> getInstalledDistrictMapDataLiveData() {
        return this.installedDistrictMapDataLiveData;
    }

    @NotNull
    public final gmf<Pair<ConcurrentHashMap<String, DistrictData>, ConcurrentHashMap<Long, DistrictData>>> getInstalledDownloadStatusMediatorLiveData() {
        return this.installedDownloadStatusMediatorLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getLoadStatusLiveData() {
        return this.loadStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<Long> getStorageSizeLiveData() {
        return this.storageSizeLiveData;
    }

    public final long getSupportSize() {
        return this.supportSize;
    }

    public final long getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final MutableLiveData<Unit> getUnZipErrorLiveData() {
        return this.unZipErrorLiveData;
    }

    public final void setSupportSize(long j) {
        this.supportSize = j;
    }

    public final void setTotalSize(long j) {
        this.totalSize = j;
    }

    public final void updateDocumentSize() {
        z07 z07VarH;
        this.totalSize = 0L;
        Uri offline_map_storage_dir_uri = SettingsPageUtilExtKt.getOffline_map_storage_dir_uri();
        if (offline_map_storage_dir_uri == null || (z07VarH = z07.h(ApplicationExtKt.getApplication(), offline_map_storage_dir_uri)) == null) {
            return;
        }
        getDocumentSize(z07VarH);
        this.storageSizeLiveData.postValue(Long.valueOf(this.totalSize));
    }
}
