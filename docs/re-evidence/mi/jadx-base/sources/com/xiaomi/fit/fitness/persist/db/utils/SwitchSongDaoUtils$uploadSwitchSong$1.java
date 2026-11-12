package com.xiaomi.fit.fitness.persist.db.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.SwitchSongDaoUtils", f = "SwitchSongDaoUtils.kt", i = {0, 0}, l = {37}, m = "uploadSwitchSong$fitness_data_core_chinaProductRelease", n = {"this", "notUploadList"}, s = {"L$0", "L$1"})
public final class SwitchSongDaoUtils$uploadSwitchSong$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwitchSongDaoUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchSongDaoUtils$uploadSwitchSong$1(SwitchSongDaoUtils switchSongDaoUtils, Continuation<? super SwitchSongDaoUtils$uploadSwitchSong$1> continuation) {
        super(continuation);
        this.this$0 = switchSongDaoUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadSwitchSong$fitness_data_core_chinaProductRelease(this);
    }
}
