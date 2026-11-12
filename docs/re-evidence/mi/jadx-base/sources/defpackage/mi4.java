package defpackage;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public interface mi4 {
    void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener);

    Context peekAvailableContext();

    void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener);
}
