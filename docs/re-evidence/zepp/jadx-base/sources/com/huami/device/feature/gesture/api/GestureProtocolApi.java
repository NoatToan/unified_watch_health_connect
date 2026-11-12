package com.huami.device.feature.gesture.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J#\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureProtocolApi;", "", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gestureType", "Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureState;", "queryStatus", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", "listenResult", "state", "updateTrainStatus", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "disableGesture", "", "queryAllGestureState", "Companion", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public interface GestureProtocolApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int ST_CANCEL = 3;
    public static final int ST_EMPTY = 1;
    public static final int ST_FINISH = 4;
    public static final int ST_WORKING = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureProtocolApi$Companion;", "", "", "ST_EMPTY", LogUtil.I, "ST_WORKING", "ST_CANCEL", "ST_FINISH", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int ST_CANCEL = 3;
        public static final int ST_EMPTY = 1;
        public static final int ST_FINISH = 4;
        public static final int ST_WORKING = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object disableGesture(int i, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    Channel<GestureTypeFactory.GestureState> listenResult();

    @Nullable
    Object queryAllGestureState(@NotNull Continuation<? super List<GestureTypeFactory.GestureState>> continuation);

    @Nullable
    Object queryStatus(int i, @NotNull Continuation<? super GestureTypeFactory.GestureState> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object updateTrainStatus(int i, int i2, @NotNull Continuation<? super Integer> continuation) throws UpdateStatusException;
}
