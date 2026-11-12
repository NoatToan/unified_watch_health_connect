package zd;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b<T> {
    T create(Context context);

    List<Class<? extends b<?>>> dependencies();
}
