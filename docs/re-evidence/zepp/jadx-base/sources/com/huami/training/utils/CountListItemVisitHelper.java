package com.huami.training.utils;

import com.huami.watch.companion.mediac.Command;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nR2\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/training/utils/CountListItemVisitHelper;", "VO", "", "v", "", "position", "", DataItem.HTTP_METHOD_PUT, "(Ljava/lang/Object;I)V", "count", "(ILjava/lang/Object;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", Command.DISABLE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class CountListItemVisitHelper<VO> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LinkedHashMap<VO, Integer> da = new LinkedHashMap<>();

    public abstract void count(int position, VO v);

    public final void put(VO v, int position) {
        if (this.da.containsKey(v)) {
            return;
        }
        this.da.put(v, Integer.valueOf(position));
        count(position, v);
    }
}
