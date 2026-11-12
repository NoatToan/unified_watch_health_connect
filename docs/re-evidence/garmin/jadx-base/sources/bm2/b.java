package bm2;

import java.util.ArrayList;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    ALL_CATEGORIES,
    /* JADX INFO: Fake field, exist only in values array */
    AVIATION,
    /* JADX INFO: Fake field, exist only in values array */
    FITNESS,
    /* JADX INFO: Fake field, exist only in values array */
    GOLF,
    /* JADX INFO: Fake field, exist only in values array */
    OUTDOOR,
    WELLNESS,
    NOTFOUND_CATEGORY;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<String> f18895c = new ArrayList<>(values().length - 1);

    static {
        for (b bVar : EnumSet.allOf(b.class)) {
            if (bVar != NOTFOUND_CATEGORY) {
                f18895c.add(bVar.name());
            }
        }
    }
}
