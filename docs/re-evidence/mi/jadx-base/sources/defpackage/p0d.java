package defpackage;

import android.content.res.Configuration;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface p0d {
    default boolean a(Configuration configuration, fhl fhlVar, boolean z, List<usk> list) {
        return false;
    }

    boolean onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z);
}
