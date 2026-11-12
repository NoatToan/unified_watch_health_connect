package com.huami.ai.speech.xiaoai.utils;

import com.xiaomi.ai.api.Template;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/ai/api/Template$PlayInfo;", "", "parseText", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class PlayInfoExtKt {
    @NotNull
    public static final String parseText(@NotNull Template.PlayInfo playInfo) {
        if (playInfo.getItems().size() == 0) {
            return "";
        }
        Template.PlayInfoItem playInfoItem = playInfo.getItems().get(0);
        StringBuilder sb = new StringBuilder();
        String mainTitle = playInfoItem.getTitle().getMainTitle();
        if (!(mainTitle == null || mainTitle.length() == 0)) {
            sb.append(mainTitle);
        }
        String subTitle = playInfoItem.getTitle().getSubTitle();
        if (!(subTitle == null || subTitle.length() == 0)) {
            sb.append('\n');
            sb.append(subTitle);
        }
        if (playInfoItem.getText().isPresent()) {
            if (playInfoItem.getText().get().length() > 0) {
                sb.append('\n');
                sb.append(playInfoItem.getText().get());
            }
        }
        return sb.toString();
    }
}
