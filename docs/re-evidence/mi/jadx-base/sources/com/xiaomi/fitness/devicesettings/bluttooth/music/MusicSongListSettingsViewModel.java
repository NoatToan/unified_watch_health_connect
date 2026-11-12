package com.xiaomi.fitness.devicesettings.bluttooth.music;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSong;
import defpackage.clf;
import defpackage.elf;
import defpackage.s7r;
import defpackage.vkf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u0007¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bJ%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0012J#\u0010\u001e\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001a0 8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u0011\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001a0 8\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b\u0019\u0010%R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u001a8\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020 8\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "bytes", "", "pageIndex", "", "getSongsOutList", "([BI)V", "songListID", "onSongListRemove", "(I)V", "Lkotlin/Function1;", "songIDList", "querySongList", "(ILkotlin/jvm/functions/Function1;)V", "it", "getSongsInSongList", "([B)V", "getSong", "position", "Lclf;", "song", "removeSongFromList", "(IILclf;)V", "getSongsOutSongList", "", "", "songIDs", "addSongListId", "addSongToSongList", "(Ljava/util/List;I)V", "Landroidx/lifecycle/MutableLiveData;", "", "songListRemoveResponse", "Landroidx/lifecycle/MutableLiveData;", "getSongListRemoveResponse", "()Landroidx/lifecycle/MutableLiveData;", "songsInSongList", "currentSongList", "Ljava/util/List;", "getCurrentSongList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$SongRemoveResponse;", "songRemoveResponse", "getSongRemoveResponse", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;", "songsOutSongList", "currentOutSongList", "getCurrentOutSongList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$AddSongToSongListResponse;", "addSongToSongListResponse", "getAddSongToSongListResponse", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "()V", "Companion", "SongRemoveResponse", "AddSongToSongListResponse", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicSongListSettingsViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "MUSIC_SET";

    @NotNull
    private final MutableLiveData<Boolean> songListRemoveResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<clf>> songsInSongList = new MutableLiveData<>();

    @NotNull
    private final List<clf> currentSongList = new ArrayList();

    @NotNull
    private final MutableLiveData<SongRemoveResponse> songRemoveResponse = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<AddSong>> songsOutSongList = new MutableLiveData<>();

    @NotNull
    private final List<AddSong> currentOutSongList = new ArrayList();

    @NotNull
    private final MutableLiveData<AddSongToSongListResponse> addSongToSongListResponse = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$AddSongToSongListResponse;", "", "isSuc", "", "songIDs", "", "", "<init>", "(ZLjava/util/List;)V", "()Z", "getSongIDs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddSongToSongListResponse {
        private final boolean isSuc;

        @NotNull
        private final List<Byte> songIDs;

        public AddSongToSongListResponse(boolean z, @NotNull List<Byte> songIDs) {
            Intrinsics.checkNotNullParameter(songIDs, "songIDs");
            this.isSuc = z;
            this.songIDs = songIDs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddSongToSongListResponse copy$default(AddSongToSongListResponse addSongToSongListResponse, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addSongToSongListResponse.isSuc;
            }
            if ((i & 2) != 0) {
                list = addSongToSongListResponse.songIDs;
            }
            return addSongToSongListResponse.copy(z, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @NotNull
        public final List<Byte> component2() {
            return this.songIDs;
        }

        @NotNull
        public final AddSongToSongListResponse copy(boolean isSuc, @NotNull List<Byte> songIDs) {
            Intrinsics.checkNotNullParameter(songIDs, "songIDs");
            return new AddSongToSongListResponse(isSuc, songIDs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddSongToSongListResponse)) {
                return false;
            }
            AddSongToSongListResponse addSongToSongListResponse = (AddSongToSongListResponse) other;
            return this.isSuc == addSongToSongListResponse.isSuc && Intrinsics.areEqual(this.songIDs, addSongToSongListResponse.songIDs);
        }

        @NotNull
        public final List<Byte> getSongIDs() {
            return this.songIDs;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isSuc) * 31) + this.songIDs.hashCode();
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        @NotNull
        public String toString() {
            return "AddSongToSongListResponse(isSuc=" + this.isSuc + ", songIDs=" + this.songIDs + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$SongRemoveResponse;", "", "", "component1", "()Z", "", "component2", "()I", "Lclf;", "component3", "()Lclf;", "isSuc", "position", "songList", "copy", "(ZILclf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$SongRemoveResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "I", "getPosition", "Lclf;", "getSongList", "<init>", "(ZILclf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SongRemoveResponse {
        private final boolean isSuc;
        private final int position;

        @NotNull
        private final clf songList;

        public SongRemoveResponse(boolean z, int i, @NotNull clf songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.isSuc = z;
            this.position = i;
            this.songList = songList;
        }

        public static /* synthetic */ SongRemoveResponse copy$default(SongRemoveResponse songRemoveResponse, boolean z, int i, clf clfVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = songRemoveResponse.isSuc;
            }
            if ((i2 & 2) != 0) {
                i = songRemoveResponse.position;
            }
            if ((i2 & 4) != 0) {
                clfVar = songRemoveResponse.songList;
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
        public final clf getSongList() {
            return this.songList;
        }

        @NotNull
        public final SongRemoveResponse copy(boolean isSuc, int position, @NotNull clf songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            return new SongRemoveResponse(isSuc, position, songList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SongRemoveResponse)) {
                return false;
            }
            SongRemoveResponse songRemoveResponse = (SongRemoveResponse) other;
            return this.isSuc == songRemoveResponse.isSuc && this.position == songRemoveResponse.position && Intrinsics.areEqual(this.songList, songRemoveResponse.songList);
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final clf getSongList() {
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
            return "SongRemoveResponse(isSuc=" + this.isSuc + ", position=" + this.position + ", songList=" + this.songList + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$addSongToSongList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$addSongToSongList$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $addSongListId;
        final /* synthetic */ List<Byte> $songIDs;
        int label;
        final /* synthetic */ MusicSongListSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, List<Byte> list, MusicSongListSettingsViewModel musicSongListSettingsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$addSongListId = i;
            this.$songIDs = list;
            this.this$0 = musicSongListSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$addSongListId, this.$songIDs, this.this$0, continuation);
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
            aVar.f = CollectionsKt___CollectionsKt.toByteArray(this.$songIDs);
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSongListSettingsViewModel musicSongListSettingsViewModel = this.this$0;
            final List<Byte> list = this.$songIDs;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.addSongToSongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    new AddSongToSongListResponse(false, list);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    musicSongListSettingsViewModel.getAddSongToSongListResponse().postValue(new AddSongToSongListResponse(true, list));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$getSongsInSongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$getSongsInSongList$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20921(byte[] bArr, Continuation<? super C20921> continuation) {
            super(2, continuation);
            this.$it = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSongListSettingsViewModel.this.new C20921(this.$it, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicSongListSettingsViewModel.this.getSong(this.$it, 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$getSongsOutSongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$getSongsOutSongList$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20941(byte[] bArr, Continuation<? super C20941> continuation) {
            super(2, continuation);
            this.$it = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MusicSongListSettingsViewModel.this.new C20941(this.$it, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicSongListSettingsViewModel.this.getSongsOutList(this.$it, 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$onSongListRemove$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$onSongListRemove$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $songListID;
        int label;
        final /* synthetic */ MusicSongListSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20951(int i, MusicSongListSettingsViewModel musicSongListSettingsViewModel, Continuation<? super C20951> continuation) {
            super(2, continuation);
            this.$songListID = i;
            this.this$0 = musicSongListSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20951(this.$songListID, this.this$0, continuation);
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
            aVar.d = this.$songListID;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final MusicSongListSettingsViewModel musicSongListSettingsViewModel = this.this$0;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.onSongListRemove.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "onSongListRemove songListRemoveResponse onError code:" + code);
                    musicSongListSettingsViewModel.getSongListRemoveResponse().postValue(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW;
                    Logger.i("MUSIC_SET", "onSongListRemove songListRemoveResponse:" + ((result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null || (bVarW = vkfVarA.w()) == null) ? null : Integer.valueOf(bVarW.c)));
                    musicSongListSettingsViewModel.getSongListRemoveResponse().postValue(Boolean.TRUE);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$querySongList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$querySongList$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<byte[], Unit> $songIDList;
        final /* synthetic */ int $songListID;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20961(int i, Function1<? super byte[], Unit> function1, Continuation<? super C20961> continuation) {
            super(2, continuation);
            this.$songListID = i;
            this.$songIDList = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20961(this.$songListID, this.$songIDList, continuation);
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
            s7rVar.f = 7;
            elf.a aVar = new elf.a();
            aVar.c = 4;
            aVar.d = this.$songListID;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final Function1<byte[], Unit> function1 = this.$songIDList;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.querySongList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "getSongsInSongList onError code:" + code);
                    function1.invoke2(null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW;
                    s7r packet2;
                    vkf vkfVarA2;
                    elf.b bVarW2;
                    byte[] bArr = null;
                    Logger.i("MUSIC_SET", "getSongsInSongList songIds:" + ((result == null || (packet2 = result.getPacket()) == null || (vkfVarA2 = packet2.A()) == null || (bVarW2 = vkfVarA2.w()) == null) ? null : bVarW2.d));
                    Function1<byte[], Unit> function2 = function1;
                    if (result != null && (packet = result.getPacket()) != null && (vkfVarA = packet.A()) != null && (bVarW = vkfVarA.w()) != null) {
                        bArr = bVarW.d;
                    }
                    function2.invoke2(bArr);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$removeSongFromList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel$removeSongFromList$1", f = "MusicSongListSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $position;
        final /* synthetic */ clf $song;
        final /* synthetic */ int $songListID;
        int label;
        final /* synthetic */ MusicSongListSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20971(int i, clf clfVar, MusicSongListSettingsViewModel musicSongListSettingsViewModel, int i2, Continuation<? super C20971> continuation) {
            super(2, continuation);
            this.$songListID = i;
            this.$song = clfVar;
            this.this$0 = musicSongListSettingsViewModel;
            this.$position = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20971(this.$songListID, this.$song, this.this$0, this.$position, continuation);
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
            aVar.d = this.$songListID;
            aVar.f = this.$song.c;
            vkf vkfVar = new vkf();
            vkfVar.E(aVar);
            s7rVar.Y(vkfVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final int i = this.$songListID;
            final clf clfVar = this.$song;
            final MusicSongListSettingsViewModel musicSongListSettingsViewModel = this.this$0;
            final int i2 = this.$position;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.removeSongFromList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("MUSIC_SET", "removeSongFromList songlistResponse onError code:" + code);
                    musicSongListSettingsViewModel.getSongRemoveResponse().postValue(new SongRemoveResponse(false, i2, clfVar));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    vkf vkfVarA;
                    elf.b bVarW = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.w();
                    Logger.i("MUSIC_SET", "removeSongFromList result:" + bVarW + " songListID:" + i + " songIds:" + clfVar.c);
                    musicSongListSettingsViewModel.getSongRemoveResponse().postValue(new SongRemoveResponse(true, i2, clfVar));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSongsOutList(final byte[] bytes, int pageIndex) {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 10;
        clf.c cVar = new clf.c();
        cVar.c = pageIndex;
        vkf vkfVar = new vkf();
        vkfVar.C(cVar);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.getSongsOutList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("MUSIC_SET", "getSongsOutList songGetResponse onError code:" + code);
                MusicSongListSettingsViewModel.this.getSongsOutSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentOutSongList());
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                clf.d dVarS = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.s();
                Logger.i("MUSIC_SET", "getSongsOutList songGetResponse:" + dVarS);
                if (dVarS == null) {
                    MusicSongListSettingsViewModel.this.getSongsOutSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentOutSongList());
                    return;
                }
                clf[] clfVarArr = dVarS.c;
                if (clfVarArr != null && clfVarArr.length != 0) {
                    byte[] bArr = bytes;
                    MusicSongListSettingsViewModel musicSongListSettingsViewModel = MusicSongListSettingsViewModel.this;
                    for (clf clfVar : clfVarArr) {
                        List mutableList = ArraysKt___ArraysKt.toMutableList(bArr);
                        byte[] id = clfVar.c;
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        if (mutableList.containsAll(ArraysKt___ArraysKt.toMutableList(id))) {
                            List<AddSong> currentOutSongList = musicSongListSettingsViewModel.getCurrentOutSongList();
                            Intrinsics.checkNotNull(clfVar);
                            currentOutSongList.add(new AddSong(2, clfVar));
                        } else {
                            List<AddSong> currentOutSongList2 = musicSongListSettingsViewModel.getCurrentOutSongList();
                            Intrinsics.checkNotNull(clfVar);
                            currentOutSongList2.add(new AddSong(0, clfVar));
                        }
                    }
                }
                int i = dVarS.d;
                if (i == 0) {
                    MusicSongListSettingsViewModel.this.getSongsOutSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentOutSongList());
                } else {
                    MusicSongListSettingsViewModel.this.getSongsOutList(bytes, i);
                }
            }
        }, 0, 8, null);
    }

    public final void addSongToSongList(@NotNull List<Byte> songIDs, int addSongListId) {
        Intrinsics.checkNotNullParameter(songIDs, "songIDs");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(addSongListId, songIDs, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<AddSongToSongListResponse> getAddSongToSongListResponse() {
        return this.addSongToSongListResponse;
    }

    @NotNull
    public final List<AddSong> getCurrentOutSongList() {
        return this.currentOutSongList;
    }

    @NotNull
    public final List<clf> getCurrentSongList() {
        return this.currentSongList;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getSong(@NotNull final byte[] bytes, int pageIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 10;
        clf.c cVar = new clf.c();
        cVar.c = pageIndex;
        vkf vkfVar = new vkf();
        vkfVar.C(cVar);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel.getSong.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("MUSIC_SET", "getSong songGetResponse onError code:" + code);
                MusicSongListSettingsViewModel.this.getSongsInSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentSongList());
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                clf.d dVarS = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.s();
                Logger.i("MUSIC_SET", "getSong songGetResponse:" + dVarS);
                if (dVarS == null) {
                    MusicSongListSettingsViewModel.this.getSongsInSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentSongList());
                    return;
                }
                clf[] clfVarArr = dVarS.c;
                if (clfVarArr != null && clfVarArr.length != 0) {
                    byte[] bArr = bytes;
                    MusicSongListSettingsViewModel musicSongListSettingsViewModel = MusicSongListSettingsViewModel.this;
                    for (clf clfVar : clfVarArr) {
                        List mutableList = ArraysKt___ArraysKt.toMutableList(bArr);
                        byte[] id = clfVar.c;
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        if (mutableList.containsAll(ArraysKt___ArraysKt.toMutableList(id))) {
                            List<clf> currentSongList = musicSongListSettingsViewModel.getCurrentSongList();
                            Intrinsics.checkNotNull(clfVar);
                            currentSongList.add(clfVar);
                        }
                    }
                }
                int i = dVarS.d;
                if (i == 0) {
                    MusicSongListSettingsViewModel.this.getSongsInSongList().postValue(MusicSongListSettingsViewModel.this.getCurrentSongList());
                } else {
                    MusicSongListSettingsViewModel.this.getSong(bytes, i);
                }
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSongListRemoveResponse() {
        return this.songListRemoveResponse;
    }

    @NotNull
    public final MutableLiveData<SongRemoveResponse> getSongRemoveResponse() {
        return this.songRemoveResponse;
    }

    @NotNull
    public final MutableLiveData<List<clf>> getSongsInSongList() {
        return this.songsInSongList;
    }

    @NotNull
    public final MutableLiveData<List<AddSong>> getSongsOutSongList() {
        return this.songsOutSongList;
    }

    public final void onSongListRemove(int songListID) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20951(songListID, this, null), 2, null);
    }

    public final void querySongList(int songListID, @NotNull Function1<? super byte[], Unit> songIDList) {
        Intrinsics.checkNotNullParameter(songIDList, "songIDList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20961(songListID, songIDList, null), 2, null);
    }

    public final void removeSongFromList(int songListID, int position, @NotNull clf song) {
        Intrinsics.checkNotNullParameter(song, "song");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20971(songListID, song, this, position, null), 2, null);
    }

    public final void getSongsInSongList(@NotNull byte[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.currentSongList.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20921(it, null), 2, null);
    }

    public final void getSongsOutSongList(@NotNull byte[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.currentOutSongList.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20941(it, null), 2, null);
    }
}
