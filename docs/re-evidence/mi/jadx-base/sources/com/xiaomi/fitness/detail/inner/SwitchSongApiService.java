package com.xiaomi.fitness.detail.inner;

import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemArtist;
import defpackage.kdq;
import defpackage.uua;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SwitchSongApiService;", "", "getSwitchSongArcInfo", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItemArtist;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SwitchSongApiService {
    @Nullable
    @uua
    Object getSwitchSongArcInfo(@kdq @NotNull String str, @NotNull Continuation<? super SwitchSongItemArtist> continuation);
}
