package com.xiaomi.fit.fitness.device.hm.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/api/IHuamiDataParse;", "", "dataParse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "dataType", "Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;", "sid", "", "data", "(Lcom/xiaomi/fit/fitness/device/hm/api/HuaMiParseType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHuamiDataParse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/api/IHuamiDataParse$Companion;", "", "<init>", "()V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object dataParse(@NotNull HuaMiParseType huaMiParseType, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation);
}
