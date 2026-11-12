package com.xiaomi.fitness.feedback.history;

import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.a0j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryDetailModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "getDialogueInfoes", "", "Lcom/xiaomi/fitness/feedback/history/DialogueInfo;", "detail", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoryDetailModel extends BaseModel {
    @NotNull
    public final List<DialogueInfo> getDialogueInfoes(@NotNull HistoryDetail detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        ArrayList arrayList = new ArrayList();
        DialogueInfo dialogueInfo = new DialogueInfo();
        dialogueInfo.setTitle(ResourceExtKt.getString(a0j.E));
        dialogueInfo.setDate(detail.getTime());
        dialogueInfo.setContent(ResourceExtKt.getString(a0j.F));
        arrayList.add(dialogueInfo);
        DialogueInfo dialogueInfo2 = new DialogueInfo();
        dialogueInfo2.setTitle(ResourceExtKt.getString(a0j.J));
        dialogueInfo2.setDate(detail.getTime());
        dialogueInfo2.setContent(detail.getContent());
        arrayList.add(dialogueInfo2);
        return arrayList;
    }
}
