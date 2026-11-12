package defpackage;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface rbj<K extends Comparable, V> {
    Map<Range<K>, V> asMapOfRanges();
}
