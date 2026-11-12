package com.huami.snore.ui.adapter;

import com.huami.snore.core.vo.VoiceShowInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/snore/ui/adapter/VoiceClickListener;", "", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "info", "", "onDelete", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "onPlay", "onUpload", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface VoiceClickListener {
    void onDelete(@Nullable VoiceShowInfo info);

    void onPlay(@Nullable WrapVoiceInfo info);

    void onUpload(@Nullable VoiceShowInfo info);
}
