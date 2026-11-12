package com.huami.watchfacesstore.device;

import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.ext.KoinExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!Jj\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022%\u0010\u0010\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132%\u0010\u0015\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J7\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052%\u0010\u0015\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000fH\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/watchfacesstore/device/WatchDeviceManager;", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "", "fwVersion", "bgPath", "", "transparentColor", "watchFacePath", "transparentPath", "Lkotlin/Function1;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "Lkotlin/ParameterName;", "name", "state", "", "Lcom/huami/watchfacesstore/device/OnSyncResultCallBack;", "onSyncResultCallBack", "syncWatchFace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "watchFaceIds", "onResultCallBack", "deleteWatchFace", "id", "", "setWatchFaceById", "currentId", "replaceWatchFace", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "a", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "mDeviceManager", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchDeviceManager implements WFDeviceManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager mDeviceManager = KoinExtKt.getDeviceManager();

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public void deleteWatchFace(@NotNull List<Integer> watchFaceIds, @NotNull Function1<? super WatchFaceState, Unit> onResultCallBack) {
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public void replaceWatchFace(int currentId, @NotNull Function1<? super WatchFaceState, Unit> onResultCallBack) {
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    public boolean setWatchFaceById(int id) {
        return false;
    }

    @Override // com.huami.watchfacesstore.device.WFDeviceManager
    @Nullable
    public Object syncWatchFace(@Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull String str3, @Nullable String str4, @NotNull Function1<? super WatchFaceState, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
