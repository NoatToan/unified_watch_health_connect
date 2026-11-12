package defpackage;

import androidx.recyclerview.widget.h;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class uv6<T extends DailyRecordItem> extends h.f<T> {
    @Override // androidx.recyclerview.widget.h.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(T t, T t2) {
        return t.getTimestamp() == t2.getTimestamp() && Objects.equals(t.getSid(), t2.getSid());
    }

    @Override // androidx.recyclerview.widget.h.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(T t, T t2) {
        return t.getTimestamp() == t2.getTimestamp() && Objects.equals(t.getSid(), t2.getSid());
    }
}
