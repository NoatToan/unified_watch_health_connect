package defpackage;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
public interface oxc<T> {
    default void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        onResponsiveLayout(configuration, fhlVar, z);
    }

    T getResponsiveSubject();

    void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z);
}
