package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;

/* JADX INFO: loaded from: classes5.dex */
public class g98 extends ImmutableSetMultimap<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g98 f18751a = new g98();
    private static final long serialVersionUID = 0;

    public g98() {
        super(ImmutableMap.of(), 0, null);
    }

    private Object readResolve() {
        return f18751a;
    }
}
