package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class alt extends amf<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final alt f518a = new alt();
    private static final long serialVersionUID = 0;

    private alt() {
        super(ImmutableMap.of(), 0, null);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    private Object readResolve() {
        return f518a;
    }
}
