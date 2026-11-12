package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading;

import androidx.annotation.StringRes;
import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingStatus;", "component1", "", "component2", "loadingStatus", "msg", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingStatus;", "getLoadingStatus", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingStatus;", "b", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingStatus;Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoadingVo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LoadingStatus loadingStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String msg;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005J \u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005J \u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005J \u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u001e\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005J \u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo$Companion;", "", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "liveData", "", "msgRes", "", "postStartMsg", "", "msgStr", "postCancelMsg", "postSuccessMsg", "postFailMsg", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void postCancelMsg$default(Companion companion, MutableLiveData mutableLiveData, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.postCancelMsg((MutableLiveData<LoadingVo>) mutableLiveData, str);
        }

        public static /* synthetic */ void postFailMsg$default(Companion companion, MutableLiveData mutableLiveData, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.postFailMsg((MutableLiveData<LoadingVo>) mutableLiveData, str);
        }

        public static /* synthetic */ void postStartMsg$default(Companion companion, MutableLiveData mutableLiveData, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.postStartMsg((MutableLiveData<LoadingVo>) mutableLiveData, str);
        }

        public static /* synthetic */ void postSuccessMsg$default(Companion companion, MutableLiveData mutableLiveData, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.postSuccessMsg((MutableLiveData<LoadingVo>) mutableLiveData, str);
        }

        public final void postCancelMsg(@NotNull MutableLiveData<LoadingVo> liveData, @StringRes int msgRes) {
            postCancelMsg(liveData, IntroduceShuffleFactoryKt.getString(msgRes));
        }

        public final void postFailMsg(@NotNull MutableLiveData<LoadingVo> liveData, @StringRes int msgRes) {
            postFailMsg(liveData, IntroduceShuffleFactoryKt.getString(msgRes));
        }

        public final void postStartMsg(@NotNull MutableLiveData<LoadingVo> liveData, @StringRes int msgRes) {
            postStartMsg(liveData, IntroduceShuffleFactoryKt.getString(msgRes));
        }

        public final void postSuccessMsg(@NotNull MutableLiveData<LoadingVo> liveData, @StringRes int msgRes) {
            postSuccessMsg(liveData, IntroduceShuffleFactoryKt.getString(msgRes));
        }

        public final void postCancelMsg(@NotNull MutableLiveData<LoadingVo> liveData, @Nullable String msgStr) {
            LoadingStatus loadingStatus = LoadingStatus.CANCEL;
            if (msgStr == null) {
                msgStr = "";
            }
            liveData.postValue(new LoadingVo(loadingStatus, msgStr));
        }

        public final void postFailMsg(@NotNull MutableLiveData<LoadingVo> liveData, @Nullable String msgStr) {
            LoadingStatus loadingStatus = LoadingStatus.FAIL;
            if (msgStr == null) {
                msgStr = "";
            }
            liveData.postValue(new LoadingVo(loadingStatus, msgStr));
        }

        public final void postStartMsg(@NotNull MutableLiveData<LoadingVo> liveData, @Nullable String msgStr) {
            LoadingStatus loadingStatus = LoadingStatus.START;
            if (msgStr == null) {
                msgStr = "";
            }
            liveData.postValue(new LoadingVo(loadingStatus, msgStr));
        }

        public final void postSuccessMsg(@NotNull MutableLiveData<LoadingVo> liveData, @Nullable String msgStr) {
            LoadingStatus loadingStatus = LoadingStatus.SUCCESS;
            if (msgStr == null) {
                msgStr = "";
            }
            liveData.postValue(new LoadingVo(loadingStatus, msgStr));
        }
    }

    public LoadingVo(@NotNull LoadingStatus loadingStatus, @NotNull String str) {
        this.loadingStatus = loadingStatus;
        this.msg = str;
    }

    public static /* synthetic */ LoadingVo copy$default(LoadingVo loadingVo, LoadingStatus loadingStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            loadingStatus = loadingVo.loadingStatus;
        }
        if ((i & 2) != 0) {
            str = loadingVo.msg;
        }
        return loadingVo.copy(loadingStatus, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final LoadingVo copy(@NotNull LoadingStatus loadingStatus, @NotNull String msg) {
        return new LoadingVo(loadingStatus, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingVo)) {
            return false;
        }
        LoadingVo loadingVo = (LoadingVo) other;
        return this.loadingStatus == loadingVo.loadingStatus && Intrinsics.areEqual(this.msg, loadingVo.msg);
    }

    @NotNull
    public final LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (this.loadingStatus.hashCode() * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadingVo(loadingStatus=" + this.loadingStatus + ", msg=" + this.msg + ")";
    }
}
