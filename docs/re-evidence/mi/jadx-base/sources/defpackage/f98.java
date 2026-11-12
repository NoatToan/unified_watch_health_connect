package defpackage;

import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes5.dex */
public class f98 extends ImmutableListMultimap<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f98 f17548a = new f98();
    private static final long serialVersionUID = 0;

    public f98() {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve() {
        return f17548a;
    }
}
