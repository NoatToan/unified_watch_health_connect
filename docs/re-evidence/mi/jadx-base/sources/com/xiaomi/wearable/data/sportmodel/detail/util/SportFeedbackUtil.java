package com.xiaomi.wearable.data.sportmodel.detail.util;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.detail.model.SportFeedbackLabelModel;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/wearable/data/sportmodel/detail/util/SportFeedbackUtil;", "", "<init>", "()V", "createFeedbackLabelList", "", "Lcom/xiaomi/fitness/detail/model/SportFeedbackLabelModel;", "indoorFlag", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportFeedbackUtil {

    @NotNull
    public static final SportFeedbackUtil INSTANCE = new SportFeedbackUtil();

    private SportFeedbackUtil() {
    }

    @NotNull
    public final List<SportFeedbackLabelModel> createFeedbackLabelList(boolean indoorFlag) {
        return indoorFlag ? CollectionsKt__CollectionsKt.mutableListOf(new SportFeedbackLabelModel(1, ResourceExtKt.getString(j1j.w4), ResourceExtKt.getString(j1j.w4), false, 8, null), new SportFeedbackLabelModel(2, ResourceExtKt.getString(j1j.x4), ResourceExtKt.getString(j1j.x4), false, 8, null), new SportFeedbackLabelModel(5, ResourceExtKt.getString(j1j.A4), ResourceExtKt.getString(j1j.A4), false, 8, null), new SportFeedbackLabelModel(6, ResourceExtKt.getString(j1j.B4), ResourceExtKt.getString(j1j.B4), false, 8, null), new SportFeedbackLabelModel(7, ResourceExtKt.getString(j1j.C4), ResourceExtKt.getString(j1j.C4), false, 8, null), new SportFeedbackLabelModel(4, ResourceExtKt.getString(j1j.z4), ResourceExtKt.getString(j1j.z4), false, 8, null), new SportFeedbackLabelModel(8, ResourceExtKt.getString(j1j.D4), ResourceExtKt.getString(j1j.D4), false, 8, null)) : CollectionsKt__CollectionsKt.mutableListOf(new SportFeedbackLabelModel(1, ResourceExtKt.getString(j1j.w4), ResourceExtKt.getString(j1j.w4), false, 8, null), new SportFeedbackLabelModel(2, ResourceExtKt.getString(j1j.x4), ResourceExtKt.getString(j1j.x4), false, 8, null), new SportFeedbackLabelModel(3, ResourceExtKt.getString(j1j.y4), ResourceExtKt.getString(j1j.y4), false, 8, null), new SportFeedbackLabelModel(4, ResourceExtKt.getString(j1j.z4), ResourceExtKt.getString(j1j.z4), false, 8, null), new SportFeedbackLabelModel(5, ResourceExtKt.getString(j1j.A4), ResourceExtKt.getString(j1j.A4), false, 8, null), new SportFeedbackLabelModel(6, ResourceExtKt.getString(j1j.B4), ResourceExtKt.getString(j1j.B4), false, 8, null), new SportFeedbackLabelModel(7, ResourceExtKt.getString(j1j.C4), ResourceExtKt.getString(j1j.C4), false, 8, null), new SportFeedbackLabelModel(8, ResourceExtKt.getString(j1j.D4), ResourceExtKt.getString(j1j.D4), false, 8, null));
    }
}
