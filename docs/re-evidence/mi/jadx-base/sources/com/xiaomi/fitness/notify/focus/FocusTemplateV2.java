package com.xiaomi.fitness.notify.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/FocusTemplateV2;", "", "template", "", "<init>", "(Ljava/lang/String;II)V", "getTemplate", "()I", "TEMPLATE_BASE", "TEMPLATE_DIDI_PSNGER", "TEMPLATE_TICKET", "TEMPLATE_EXPRESS_DELIVERY", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FocusTemplateV2 {
    TEMPLATE_BASE(0),
    TEMPLATE_DIDI_PSNGER(1),
    TEMPLATE_TICKET(2),
    TEMPLATE_EXPRESS_DELIVERY(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int template;

    FocusTemplateV2(int i) {
        this.template = i;
    }

    @NotNull
    public static EnumEntries<FocusTemplateV2> getEntries() {
        return $ENTRIES;
    }

    public final int getTemplate() {
        return this.template;
    }
}
