package com.xiaomi.fitness.devicesettings.bluttooth.music;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSongList;
import defpackage.clf;
import defpackage.dlf;
import defpackage.elf;
import defpackage.s7r;
import defpackage.sxo;
import defpackage.txo;
import defpackage.vkf;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 X2\u00020\u0001:\u0007XYZ[\\]^B\u0007¢\u0006\u0004\bW\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b)\u0010*R#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001f\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040+8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070+8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b7\u0010/R\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080+8\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0+8\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0+8\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0+8\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010/R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020F0+8\u0006¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020I0\f8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\bJ\u00103R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0+8\u0006¢\u0006\f\n\u0004\bL\u0010-\u001a\u0004\bM\u0010/R\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N0+8\u0006¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\bP\u0010/R\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00070+8\u0006¢\u0006\f\n\u0004\bQ\u0010-\u001a\u0004\bR\u0010/R\u0013\u0010V\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "pageIndex", "", "getSongsByPage", "(I)V", "", "isRemove", "index", "Lclf;", "song", "", "Lelf;", "songList", "querySongListByID", "(ZILclf;Ljava/util/List;)V", "getSongs", "()V", "getDeviceStorageInfo", "getSongList", "position", "removeSong", "(ILclf;)V", "", "name", "onSongListRename", "(Ljava/lang/String;ILelf;)V", "onSongListRemove", "(ILelf;)V", "querySongList", "(ZLclf;Ljava/util/List;)V", "addSongListId", "addSongToSongList", "(Lclf;I)V", "removeSongFromSongList", "(Lclf;Lelf;)V", "songName", "newID", "addSongList", "(Ljava/lang/String;I)V", "getSongListNewId", "(Ljava/util/List;)I", "Landroidx/lifecycle/MutableLiveData;", "songsLiveData", "Landroidx/lifecycle/MutableLiveData;", "getSongsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "currentSongList", "Ljava/util/List;", "getCurrentSongList", "()Ljava/util/List;", "Lsxo;", "storageInfo", "getStorageInfo", "isSupport", "Ldlf;", "songSummary", "getSongSummary", "supportFormatLivaData", "getSupportFormatLivaData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongRemoveResponse;", "songRemoveResponse", "getSongRemoveResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRenameResponse;", "songListRenameResponse", "getSongListRenameResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRemoveResponse;", "songListRemoveResponse", "getSongListRemoveResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$QuerySongListResponse;", "querySongListResponse", "getQuerySongListResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "getAddSongList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$AddSongToSongListResponse;", "addSongToSongListResponse", "getAddSongToSongListResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$RemoveSongFromSongListResponse;", "songRemoveFromSongListResponse", "getSongRemoveFromSongListResponse", "addSongListResponse", "getAddSongListResponse", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "Companion", "SongRemoveResponse", "SongListRenameResponse", "SongListRemoveResponse", "QuerySongListResponse", "AddSongToSongListResponse", "RemoveSongFromSongListResponse", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicSettingsViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "MUSIC_SET";

    @NotNull
    private final MutableLiveData<List<clf>> songsLiveData = new MutableLiveData<>();

    @NotNull
    private final List<clf> currentSongList = new ArrayList();

    @NotNull
    private final MutableLiveData<sxo> storageInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> isSupport = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<dlf> songSummary = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> supportFormatLivaData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SongRemoveResponse> songRemoveResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SongListRenameResponse> songListRenameResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SongListRemoveResponse> songListRemoveResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<QuerySongListResponse> querySongListResponse = new MutableLiveData<>();

    @NotNull
    private final List<AddSongList> addSongList = new ArrayList();

    @NotNull
    private final MutableLiveData<AddSongToSongListResponse> addSongToSongListResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<RemoveSongFromSongListResponse> songRemoveFromSongListResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> addSongListResponse = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$AddSongToSongListResponse;", "", "", "component1", "()Z", "Lclf;", "component2", "()Lclf;", "", "component3", "()I", "isSuc", "song", "addSongListId", "copy", "(ZLclf;I)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$AddSongToSongListResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lclf;", "getSong", "I", "getAddSongListId", "<init>", "(ZLclf;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class AddSongToSongListResponse {
        private final int addSongListId;
        private final boolean isSuc;

        @NotNull
        private final clf song;

        public AddSongToSongListResponse(boolean z, @NotNull clf song, int i) {
            Intrinsics.checkNotNullParameter(song, "song");
            this.isSuc = z;
            this.song = song;
            this.addSongListId = i;
        }

        public static /* synthetic */ AddSongToSongListResponse copy$default(AddSongToSongListResponse addSongToSongListResponse, boolean z, clf clfVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = addSongToSongListResponse.isSuc;
            }
            if ((i2 & 2) != 0) {
                clfVar = addSongToSongListResponse.song;
            }
            if ((i2 & 4) != 0) {
                i = addSongToSongListResponse.addSongListId;
            }
            return addSongToSongListResponse.copy(z, clfVar, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final clf getSong() {
            return this.song;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAddSongListId() {
            return this.addSongListId;
        }

        @NotNull
        public final AddSongToSongListResponse copy(boolean isSuc, @NotNull clf song, int addSongListId) {
            Intrinsics.checkNotNullParameter(song, "song");
            return new AddSongToSongListResponse(isSuc, song, addSongListId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddSongToSongListResponse)) {
                return false;
            }
            AddSongToSongListResponse addSongToSongListResponse = (AddSongToSongListResponse) other;
            return this.isSuc == addSongToSongListResponse.isSuc && Intrinsics.areEqual(this.song, addSongToSongListResponse.song) && this.addSongListId == addSongToSongListResponse.addSongListId;
        }

        public final int getAddSongListId() {
            return this.addSongListId;
        }

        @NotNull
        public final clf getSong() {
            return this.song;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isSuc) * 31) + this.song.hashCode()) * 31) + Integer.hashCode(this.addSongListId);
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "AddSongToSongListResponse(isSuc=" + this.isSuc + ", song=" + this.song + ", addSongListId=" + this.addSongListId + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$QuerySongListResponse;", "", "", "component1", "()Z", "component2", "Lclf;", "component3", "()Lclf;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "component4", "()Ljava/util/List;", "isSuc", "isRemove", "song", "addSongLists", "copy", "(ZZLclf;Ljava/util/List;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$QuerySongListResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lclf;", "getSong", "Ljava/util/List;", "getAddSongLists", "<init>", "(ZZLclf;Ljava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class QuerySongListResponse {

        @NotNull
        private final List<AddSongList> addSongLists;
        private final boolean isRemove;
        private final boolean isSuc;

        @NotNull
        private final clf song;

        public QuerySongListResponse(boolean z, boolean z2, @NotNull clf song, @NotNull List<AddSongList> addSongLists) {
            Intrinsics.checkNotNullParameter(song, "song");
            Intrinsics.checkNotNullParameter(addSongLists, "addSongLists");
            this.isSuc = z;
            this.isRemove = z2;
            this.song = song;
            this.addSongLists = addSongLists;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuerySongListResponse copy$default(QuerySongListResponse querySongListResponse, boolean z, boolean z2, clf clfVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = querySongListResponse.isSuc;
            }
            if ((i & 2) != 0) {
                z2 = querySongListResponse.isRemove;
            }
            if ((i & 4) != 0) {
                clfVar = querySongListResponse.song;
            }
            if ((i & 8) != 0) {
                list = querySongListResponse.addSongLists;
            }
            return querySongListResponse.copy(z, z2, clfVar, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRemove() {
            return this.isRemove;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final clf getSong() {
            return this.song;
        }

        @NotNull
        public final List<AddSongList> component4() {
            return this.addSongLists;
        }

        @NotNull
        public final QuerySongListResponse copy(boolean isSuc, boolean isRemove, @NotNull clf song, @NotNull List<AddSongList> addSongLists) {
            Intrinsics.checkNotNullParameter(song, "song");
            Intrinsics.checkNotNullParameter(addSongLists, "addSongLists");
            return new QuerySongListResponse(isSuc, isRemove, song, addSongLists);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuerySongListResponse)) {
                return false;
            }
            QuerySongListResponse querySongListResponse = (QuerySongListResponse) other;
            return this.isSuc == querySongListResponse.isSuc && this.isRemove == querySongListResponse.isRemove && Intrinsics.areEqual(this.song, querySongListResponse.song) && Intrinsics.areEqual(this.addSongLists, querySongListResponse.addSongLists);
        }

        @NotNull
        public final List<AddSongList> getAddSongLists() {
            return this.addSongLists;
        }

        @NotNull
        public final clf getSong() {
            return this.song;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isSuc) * 31) + Boolean.hashCode(this.isRemove)) * 31) + this.song.hashCode()) * 31) + this.addSongLists.hashCode();
        }

        public final boolean isRemove() {
            return this.isRemove;
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "QuerySongListResponse(isSuc=" + this.isSuc + ", isRemove=" + this.isRemove + ", song=" + this.song + ", addSongLists=" + this.addSongLists + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$RemoveSongFromSongListResponse;", "", "", "component1", "()Z", "Lclf;", "component2", "()Lclf;", "Lelf;", "component3", "()Lelf;", "isSuc", "song", "songList", "copy", "(ZLclf;Lelf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$RemoveSongFromSongListResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lclf;", "getSong", "Lelf;", "getSongList", "<init>", "(ZLclf;Lelf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class RemoveSongFromSongListResponse {
        private final boolean isSuc;

        @NotNull
        private final clf song;

        @NotNull
        private final elf songList;

        public RemoveSongFromSongListResponse(boolean z, @NotNull clf song, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(song, "song");
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.isSuc = z;
            this.song = song;
            this.songList = songList;
        }

        public static /* synthetic */ RemoveSongFromSongListResponse copy$default(RemoveSongFromSongListResponse removeSongFromSongListResponse, boolean z, clf clfVar, elf elfVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = removeSongFromSongListResponse.isSuc;
            }
            if ((i & 2) != 0) {
                clfVar = removeSongFromSongListResponse.song;
            }
            if ((i & 4) != 0) {
                elfVar = removeSongFromSongListResponse.songList;
            }
            return removeSongFromSongListResponse.copy(z, clfVar, elfVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final clf getSong() {
            return this.song;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final elf getSongList() {
            return this.songList;
        }

        @NotNull
        public final RemoveSongFromSongListResponse copy(boolean isSuc, @NotNull clf song, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(song, "song");
            Intrinsics.checkNotNullParameter(songList, "songList");
            return new RemoveSongFromSongListResponse(isSuc, song, songList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveSongFromSongListResponse)) {
                return false;
            }
            RemoveSongFromSongListResponse removeSongFromSongListResponse = (RemoveSongFromSongListResponse) other;
            return this.isSuc == removeSongFromSongListResponse.isSuc && Intrinsics.areEqual(this.song, removeSongFromSongListResponse.song) && Intrinsics.areEqual(this.songList, removeSongFromSongListResponse.songList);
        }

        @NotNull
        public final clf getSong() {
            return this.song;
        }

        @NotNull
        public final elf getSongList() {
            return this.songList;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isSuc) * 31) + this.song.hashCode()) * 31) + this.songList.hashCode();
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "RemoveSongFromSongListResponse(isSuc=" + this.isSuc + ", song=" + this.song + ", songList=" + this.songList + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRemoveResponse;", "", "", "component1", "()Z", "", "component2", "()I", "Lelf;", "component3", "()Lelf;", "isSuc", "position", "songList", "copy", "(ZILelf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRemoveResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "I", "getPosition", "Lelf;", "getSongList", "<init>", "(ZILelf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SongListRemoveResponse {
        private final boolean isSuc;
        private final int position;

        @NotNull
        private final elf songList;

        public SongListRemoveResponse(boolean z, int i, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.isSuc = z;
            this.position = i;
            this.songList = songList;
        }

        public static /* synthetic */ SongListRemoveResponse copy$default(SongListRemoveResponse songListRemoveResponse, boolean z, int i, elf elfVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = songListRemoveResponse.isSuc;
            }
            if ((i2 & 2) != 0) {
                i = songListRemoveResponse.position;
            }
            if ((i2 & 4) != 0) {
                elfVar = songListRemoveResponse.songList;
            }
            return songListRemoveResponse.copy(z, i, elfVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final elf getSongList() {
            return this.songList;
        }

        @NotNull
        public final SongListRemoveResponse copy(boolean isSuc, int position, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            return new SongListRemoveResponse(isSuc, position, songList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SongListRemoveResponse)) {
                return false;
            }
            SongListRemoveResponse songListRemoveResponse = (SongListRemoveResponse) other;
            return this.isSuc == songListRemoveResponse.isSuc && this.position == songListRemoveResponse.position && Intrinsics.areEqual(this.songList, songListRemoveResponse.songList);
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final elf getSongList() {
            return this.songList;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isSuc) * 31) + Integer.hashCode(this.position)) * 31) + this.songList.hashCode();
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "SongListRemoveResponse(isSuc=" + this.isSuc + ", position=" + this.position + ", songList=" + this.songList + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRenameResponse;", "", "", "component1", "()Z", "", "component2", "()Ljava/lang/String;", "", "component3", "()I", "Lelf;", "component4", "()Lelf;", "isSuc", "name", "position", "songList", "copy", "(ZLjava/lang/String;ILelf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRenameResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getName", "I", "getPosition", "Lelf;", "getSongList", "<init>", "(ZLjava/lang/String;ILelf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SongListRenameResponse {
        private final boolean isSuc;

        @NotNull
        private final String name;
        private final int position;

        @NotNull
        private final elf songList;

        public SongListRenameResponse(boolean z, @NotNull String name, int i, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.isSuc = z;
            this.name = name;
            this.position = i;
            this.songList = songList;
        }

        public static /* synthetic */ SongListRenameResponse copy$default(SongListRenameResponse songListRenameResponse, boolean z, String str, int i, elf elfVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = songListRenameResponse.isSuc;
            }
            if ((i2 & 2) != 0) {
                str = songListRenameResponse.name;
            }
            if ((i2 & 4) != 0) {
                i = songListRenameResponse.position;
            }
            if ((i2 & 8) != 0) {
                elfVar = songListRenameResponse.songList;
            }
            return songListRenameResponse.copy(z, str, i, elfVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final elf getSongList() {
            return this.songList;
        }

        @NotNull
        public final SongListRenameResponse copy(boolean isSuc, @NotNull String name, int position, @NotNull elf songList) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(songList, "songList");
            return new SongListRenameResponse(isSuc, name, position, songList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SongListRenameResponse)) {
                return false;
            }
            SongListRenameResponse songListRenameResponse = (SongListRenameResponse) other;
            return this.isSuc == songListRenameResponse.isSuc && Intrinsics.areEqual(this.name, songListRenameResponse.name) && this.position == songListRenameResponse.position && Intrinsics.areEqual(this.songList, songListRenameResponse.songList);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final elf getSongList() {
            return this.songList;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isSuc) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.position)) * 31) + this.songList.hashCode();
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "SongListRenameResponse(isSuc=" + this.isSuc + ", name=" + this.name + ", position=" + this.position + ", songList=" + this.songList + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongRemoveResponse;", "", "", "component1", "()Z", "", "component2", "()I", "Lclf;", "component3", "()Lclf;", "isSuc", "position", "song", "copy", "(ZILclf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongRemoveResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "I", "getPosition", "Lclf;", "getSong", "<init>", "(ZILclf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SongRemoveResponse {
        private final boolean isSuc;
        private final int position;

        @NotNull
        private final clf song;

        public SongRemoveResponse(boolean z, int i, @NotNull clf song) {
            Intrinsics.checkNotNullParameter(song, "song");
            this.isSuc = z;
            this.position = i;
            this.song = song;
        }

        public static /* synthetic */ SongRemoveResponse copy$default(SongRemoveResponse songRemoveResponse, boolean z, int i, clf clfVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = songRemoveResponse.isSuc;
            }
            if ((i2 & 2) != 0) {
                i = songRemoveResponse.position;
            }
            if ((i2 & 4) != 0) {
                clfVar = songRemoveResponse.song;
            }
            return songRemoveResponse.copy(z, i, clfVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final clf getSong() {
            return this.song;
        }

        @NotNull
        public final SongRemoveResponse copy(boolean isSuc, int position, @NotNull clf song) {
            Intrinsics.checkNotNullParameter(song, "song");
            return new SongRemoveResponse(isSuc, position, song);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SongRemoveResponse)) {
                return false;
            }
            SongRemoveResponse songRemoveResponse = (SongRemoveResponse) other;
            return this.isSuc == songRemoveResponse.isSuc && this.position == songRemoveResponse.position && Intrinsics.areEqual(this.song, songRemoveResponse.song);
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final clf getSong() {
            return this.song;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isSuc) * 31) + Integer.hashCode(this.position)) * 31) + this.song.hashCode();
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "SongRemoveResponse(isSuc=" + this.isSuc + ", position=" + this.position + ", song=" + this.song + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$addSongList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$addSongList$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $newID;
        final /* synthetic */ String $songName;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, MusicSettingsViewModel musicSettingsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$songName = str;
            this.$newID = i;
            this.this$0 = musicSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$songName, this.$newID, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 4;
            elf.a aVar = new elf.a();
            aVar.c = 1;
            aVar.e = this.$songName;
            aVar.d = this.$newID;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final int i = this.$newID;
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.addSongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "addSongList Response onError code:" + code);
                    musicSettingsViewModel.getAddSongListResponse().postValue(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.w();
                    Logger.i("MUSIC_SET", "addSongList Response:" + bVarW + "  newID:" + i);
                    musicSettingsViewModel.getAddSongListResponse().postValue(Boolean.TRUE);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$addSongToSongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$addSongToSongList$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $addSongListId;
        final /* synthetic */ clf $song;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20801(int i, clf clfVar, MusicSettingsViewModel musicSettingsViewModel, Continuation<? super C20801> continuation) {
            super(2, continuation);
            this.$addSongListId = i;
            this.$song = clfVar;
            this.this$0 = musicSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20801(this.$addSongListId, this.$song, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 8;
            elf.a aVar = new elf.a();
            aVar.c = 5;
            aVar.d = this.$addSongListId;
            aVar.f = this.$song.c;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final int i = this.$addSongListId;
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            final clf clfVar = this.$song;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.addSongToSongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "addSongToSongList onError code:" + code);
                    new AddSongToSongListResponse(false, clfVar, i);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i("MUSIC_SET", "addSongToSongList onSuccess addSongListId:" + i);
                    musicSettingsViewModel.getAddSongToSongListResponse().postValue(new AddSongToSongListResponse(true, clfVar, i));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getDeviceStorageInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getDeviceStorageInfo$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20811(Continuation<? super C20811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSettingsViewModel.this.new C20811(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 62;
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = MusicSettingsViewModel.this;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.getDeviceStorageInfo.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "getDeviceStorageInfo storageInfo onError code:" + code);
                    musicSettingsViewModel.getStorageInfo().postValue(null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    txo txoVarE;
                    s7r packet2;
                    txo txoVarE2;
                    sxo sxoVarH = null;
                    Logger.i("MUSIC_SET", "getDeviceStorageInfo storageInfo:" + ((result == null || (packet2 = result.getPacket()) == null || (txoVarE2 = packet2.E()) == null) ? null : txoVarE2.H()));
                    MutableLiveData<sxo> storageInfo = musicSettingsViewModel.getStorageInfo();
                    if (result != null && (packet = result.getPacket()) != null && (txoVarE = packet.E()) != null) {
                        sxoVarH = txoVarE.H();
                    }
                    storageInfo.postValue(sxoVarH);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getSongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getSongList$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20821(Continuation<? super C20821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSettingsViewModel.this.new C20821(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 3;
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = MusicSettingsViewModel.this;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.getSongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "getSongList songSummary onError code:" + code);
                    musicSettingsViewModel.getSongSummary().postValue(null);
                    if (code == 1) {
                        musicSettingsViewModel.isSupport().postValue(Boolean.FALSE);
                    } else {
                        musicSettingsViewModel.isSupport().postValue(Boolean.TRUE);
                    }
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    s7r packet2;
                    vkf vkfVarA2;
                    dlf dlfVarV;
                    s7r packet3;
                    vkf vkfVarA3;
                    dlf dlfVarV2 = null;
                    Logger.i("MUSIC_SET", "getSongList songSummary:" + ((result == null || (packet3 = result.getPacket()) == null || (vkfVarA3 = packet3.A()) == null) ? null : vkfVarA3.v()));
                    if (result != null && (packet2 = result.getPacket()) != null && (vkfVarA2 = packet2.A()) != null && (dlfVarV = vkfVarA2.v()) != null) {
                        AnyExtKt.main$default(null, new MusicSettingsViewModel$getSongList$1$1$onSuccess$1$1(musicSettingsViewModel, dlfVarV, null), 1, null);
                    }
                    MutableLiveData<dlf> songSummary = musicSettingsViewModel.getSongSummary();
                    if (result != null && (packet = result.getPacket()) != null && (vkfVarA = packet.A()) != null) {
                        dlfVarV2 = vkfVarA.v();
                    }
                    songSummary.postValue(dlfVarV2);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getSongs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$getSongs$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20831(Continuation<? super C20831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSettingsViewModel.this.new C20831(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicSettingsViewModel.this.getSongsByPage(0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$onSongListRemove$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$onSongListRemove$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $position;
        final /* synthetic */ elf $songList;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20851(elf elfVar, MusicSettingsViewModel musicSettingsViewModel, int i, Continuation<? super C20851> continuation) {
            super(2, continuation);
            this.$songList = elfVar;
            this.this$0 = musicSettingsViewModel;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20851(this.$songList, this.this$0, this.$position, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 5;
            elf.a aVar = new elf.a();
            aVar.c = 2;
            aVar.d = this.$songList.c;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            final int i = this.$position;
            final elf elfVar = this.$songList;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.onSongListRemove.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "onSongListRemove songListRemoveResponse onError code:" + code);
                    musicSettingsViewModel.getSongListRemoveResponse().postValue(new SongListRemoveResponse(false, i, elfVar));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW;
                    Logger.i("MUSIC_SET", "onSongListRemove songListRemoveResponse:" + ((result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null || (bVarW = vkfVarA.w()) == null) ? null : Integer.valueOf(bVarW.c)));
                    musicSettingsViewModel.getSongListRemoveResponse().postValue(new SongListRemoveResponse(true, i, elfVar));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$onSongListRename$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$onSongListRename$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ int $position;
        final /* synthetic */ elf $songList;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20861(elf elfVar, String str, MusicSettingsViewModel musicSettingsViewModel, int i, Continuation<? super C20861> continuation) {
            super(2, continuation);
            this.$songList = elfVar;
            this.$name = str;
            this.this$0 = musicSettingsViewModel;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20861(this.$songList, this.$name, this.this$0, this.$position, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 6;
            elf.a aVar = new elf.a();
            aVar.c = 3;
            aVar.d = this.$songList.c;
            aVar.e = this.$name;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            final String str = this.$name;
            final int i = this.$position;
            final elf elfVar = this.$songList;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.onSongListRename.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "onSongListRename songListRenameResponse onError code:" + code);
                    musicSettingsViewModel.getSongListRenameResponse().postValue(new SongListRenameResponse(false, str, i, elfVar));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW;
                    Logger.i("MUSIC_SET", "onSongListRename songListRenameResponse:" + ((result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null || (bVarW = vkfVarA.w()) == null) ? null : Integer.valueOf(bVarW.c)));
                    musicSettingsViewModel.getSongListRenameResponse().postValue(new SongListRenameResponse(true, str, i, elfVar));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$querySongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$querySongList$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRemove;
        final /* synthetic */ clf $song;
        final /* synthetic */ List<elf> $songList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20871(boolean z, clf clfVar, List<elf> list, Continuation<? super C20871> continuation) {
            super(2, continuation);
            this.$isRemove = z;
            this.$song = clfVar;
            this.$songList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSettingsViewModel.this.new C20871(this.$isRemove, this.$song, this.$songList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicSettingsViewModel.this.querySongListByID(this.$isRemove, 0, this.$song, this.$songList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$removeSong$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$removeSong$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $position;
        final /* synthetic */ clf $song;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20891(clf clfVar, MusicSettingsViewModel musicSettingsViewModel, int i, Continuation<? super C20891> continuation) {
            super(2, continuation);
            this.$song = clfVar;
            this.this$0 = musicSettingsViewModel;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20891(this.$song, this.this$0, this.$position, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 13;
            clf.e eVar = new clf.e();
            eVar.c = this.$song.c;
            vkf vkfVar = new vkf();
            vkfVar.D(eVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            final int i = this.$position;
            final clf clfVar = this.$song;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.removeSong.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "removeSong songRemoveResponse onError code:" + code);
                    musicSettingsViewModel.getSongRemoveResponse().postValue(new SongRemoveResponse(false, i, clfVar));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    Logger.i("MUSIC_SET", "removeSong songRemoveResponse:" + ((result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.t()));
                    musicSettingsViewModel.getSongRemoveResponse().postValue(new SongRemoveResponse(true, i, clfVar));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$removeSongFromSongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel$removeSongFromSongList$1", f = "MusicSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ clf $song;
        final /* synthetic */ elf $songList;
        int label;
        final /* synthetic */ MusicSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20901(elf elfVar, clf clfVar, MusicSettingsViewModel musicSettingsViewModel, Continuation<? super C20901> continuation) {
            super(2, continuation);
            this.$songList = elfVar;
            this.$song = clfVar;
            this.this$0 = musicSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20901(this.$songList, this.$song, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 9;
            elf.a aVar = new elf.a();
            aVar.c = 6;
            aVar.d = this.$songList.c;
            aVar.f = this.$song.c;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSettingsViewModel musicSettingsViewModel = this.this$0;
            final clf clfVar = this.$song;
            final elf elfVar = this.$songList;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.removeSongFromSongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "removeSongFromList Response onError code:" + code);
                    musicSettingsViewModel.getSongRemoveFromSongListResponse().postValue(new RemoveSongFromSongListResponse(false, clfVar, elfVar));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    Logger.i("MUSIC_SET", "removeSongFromList Response:" + ((result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.w()));
                    musicSettingsViewModel.getSongRemoveFromSongListResponse().postValue(new RemoveSongFromSongListResponse(true, clfVar, elfVar));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSongListNewId$lambda$0(elf item, elf t1) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(t1, "t1");
        return item.c - t1.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSongsByPage(int pageIndex) {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 10;
        clf.c cVar = new clf.c();
        cVar.c = pageIndex;
        vkf vkfVar = new vkf();
        vkfVar.C(cVar);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.getSongsByPage.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("MUSIC_SET", "getSongsOutList songGetResponse onError code:" + code);
                MusicSettingsViewModel.this.getSongsLiveData().postValue(MusicSettingsViewModel.this.getCurrentSongList());
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                clf.d dVarS = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.s();
                Logger.i("MUSIC_SET", "getSongsOutList songGetResponse:" + dVarS);
                if (dVarS == null) {
                    MusicSettingsViewModel.this.getSongsLiveData().postValue(MusicSettingsViewModel.this.getCurrentSongList());
                    return;
                }
                clf[] clfVarArr = dVarS.c;
                if (clfVarArr != null && clfVarArr.length != 0) {
                    CollectionsKt__MutableCollectionsKt.addAll(MusicSettingsViewModel.this.getCurrentSongList(), clfVarArr);
                }
                int i = dVarS.d;
                if (i == 0) {
                    MusicSettingsViewModel.this.getSongsLiveData().postValue(MusicSettingsViewModel.this.getCurrentSongList());
                } else {
                    MusicSettingsViewModel.this.getSongsByPage(i);
                }
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySongListByID(final boolean isRemove, final int index, final clf song, final List<elf> songList) {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 7;
        elf.a aVar = new elf.a();
        aVar.c = 4;
        aVar.d = songList.get(index).c;
        vkf vkfVar = new vkf();
        vkfVar.E(aVar);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel.querySongListByID.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("MUSIC_SET", "querySongList songListResponse onError code:" + code);
                if (this.getAddSongList().size() == songList.size()) {
                    this.getQuerySongListResponse().postValue(new QuerySongListResponse(false, isRemove, song, this.getAddSongList()));
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                elf.b bVarW;
                byte[] bArr;
                List mutableList = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null || (bVarW = vkfVarA.w()) == null || (bArr = bVarW.d) == null) ? null : ArraysKt___ArraysKt.toMutableList(bArr);
                byte[] id = song.c;
                Intrinsics.checkNotNullExpressionValue(id, "id");
                List mutableList2 = ArraysKt___ArraysKt.toMutableList(id);
                Logger.i("MUSIC_SET", "querySongList songListResponse songIds:" + mutableList + "  song:" + mutableList2 + " songList.id:" + songList.get(index).c);
                this.getAddSongList().add(new AddSongList((mutableList == null || !mutableList.containsAll(mutableList2)) ? 0 : 2, songList.get(index)));
                int i = index + 1;
                if (i == songList.size()) {
                    this.getQuerySongListResponse().postValue(new QuerySongListResponse(true, isRemove, song, this.getAddSongList()));
                } else {
                    this.querySongListByID(isRemove, i, song, songList);
                }
            }
        }, 0, 8, null);
    }

    public final void addSongList(@NotNull String songName, int newID) {
        Intrinsics.checkNotNullParameter(songName, "songName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(songName, newID, this, null), 2, null);
    }

    public final void addSongToSongList(@NotNull clf song, int addSongListId) {
        Intrinsics.checkNotNullParameter(song, "song");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20801(addSongListId, song, this, null), 2, null);
    }

    @NotNull
    public final List<AddSongList> getAddSongList() {
        return this.addSongList;
    }

    @NotNull
    public final MutableLiveData<Boolean> getAddSongListResponse() {
        return this.addSongListResponse;
    }

    @NotNull
    public final MutableLiveData<AddSongToSongListResponse> getAddSongToSongListResponse() {
        return this.addSongToSongListResponse;
    }

    @NotNull
    public final List<clf> getCurrentSongList() {
        return this.currentSongList;
    }

    public final void getDeviceStorageInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20811(null), 2, null);
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final MutableLiveData<QuerySongListResponse> getQuerySongListResponse() {
        return this.querySongListResponse;
    }

    public final void getSongList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20821(null), 2, null);
    }

    public final int getSongListNewId(@NotNull List<elf> songList) {
        Intrinsics.checkNotNullParameter(songList, "songList");
        int i = 1;
        if (songList.isEmpty()) {
            return 1;
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(songList, new Comparator() { // from class: xcg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MusicSettingsViewModel.getSongListNewId$lambda$0((elf) obj, (elf) obj2);
            }
        });
        Iterator<elf> it = songList.iterator();
        while (it.hasNext() && it.next().c == i) {
            i++;
        }
        return i;
    }

    @NotNull
    public final MutableLiveData<SongListRemoveResponse> getSongListRemoveResponse() {
        return this.songListRemoveResponse;
    }

    @NotNull
    public final MutableLiveData<SongListRenameResponse> getSongListRenameResponse() {
        return this.songListRenameResponse;
    }

    @NotNull
    public final MutableLiveData<RemoveSongFromSongListResponse> getSongRemoveFromSongListResponse() {
        return this.songRemoveFromSongListResponse;
    }

    @NotNull
    public final MutableLiveData<SongRemoveResponse> getSongRemoveResponse() {
        return this.songRemoveResponse;
    }

    @NotNull
    public final MutableLiveData<dlf> getSongSummary() {
        return this.songSummary;
    }

    public final void getSongs() {
        this.currentSongList.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20831(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<clf>> getSongsLiveData() {
        return this.songsLiveData;
    }

    @NotNull
    public final MutableLiveData<sxo> getStorageInfo() {
        return this.storageInfo;
    }

    @NotNull
    public final MutableLiveData<Integer> getSupportFormatLivaData() {
        return this.supportFormatLivaData;
    }

    @NotNull
    public final MutableLiveData<Boolean> isSupport() {
        return this.isSupport;
    }

    public final void onSongListRemove(int position, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(songList, "songList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20851(songList, this, position, null), 2, null);
    }

    public final void onSongListRename(@NotNull String name, int position, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(songList, "songList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20861(songList, name, this, position, null), 2, null);
    }

    public final void querySongList(boolean isRemove, @NotNull clf song, @NotNull List<elf> songList) {
        Intrinsics.checkNotNullParameter(song, "song");
        Intrinsics.checkNotNullParameter(songList, "songList");
        this.addSongList.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20871(isRemove, song, songList, null), 2, null);
    }

    public final void removeSong(int position, @NotNull clf song) {
        Intrinsics.checkNotNullParameter(song, "song");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20891(song, this, position, null), 2, null);
    }

    public final void removeSongFromSongList(@NotNull clf song, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(song, "song");
        Intrinsics.checkNotNullParameter(songList, "songList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20901(songList, song, this, null), 2, null);
    }
}
