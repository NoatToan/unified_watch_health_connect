package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface iad<T> {
    T create(Context context);

    List<Class<? extends iad<?>>> dependencies();
}
