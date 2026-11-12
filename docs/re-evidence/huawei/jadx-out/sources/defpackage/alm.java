package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class alm extends ama<Object, Object> {
    static final alm e = new alm();
    private static final long serialVersionUID = 0;

    private alm() {
        super(ImmutableMap.of(), 0);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    private Object readResolve() {
        return e;
    }
}
