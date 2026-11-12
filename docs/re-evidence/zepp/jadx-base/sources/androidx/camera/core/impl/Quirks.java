package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Quirks {

    @NonNull
    private final List<Quirk> mQuirks;

    public Quirks(@NonNull final List<Quirk> quirks) {
        this.mQuirks = new ArrayList(quirks);
    }

    public boolean contains(@NonNull Class<? extends Quirk> quirkClass) {
        Iterator<Quirk> it2 = this.mQuirks.iterator();
        while (it2.hasNext()) {
            if (quirkClass.isAssignableFrom(it2.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public <T extends Quirk> T get(@NonNull final Class<T> quirkClass) {
        Iterator<Quirk> it2 = this.mQuirks.iterator();
        while (it2.hasNext()) {
            T t = (T) it2.next();
            if (t.getClass() == quirkClass) {
                return t;
            }
        }
        return null;
    }
}
