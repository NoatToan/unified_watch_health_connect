package com.huami.device.feature.quickcards.cards.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0010J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J!\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/device/feature/quickcards/cards/api/DeviceApi;", "DTO", "", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCards", "items", "updateCards", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceApi<DTO> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String TAG = "DeviceApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/device/feature/quickcards/cards/api/DeviceApi$Companion;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String TAG = "DeviceApi";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object queryCards(@NotNull Continuation<? super List<? extends DTO>> continuation);

    @Nullable
    Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object updateCards(@NotNull List<? extends DTO> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation);
}
