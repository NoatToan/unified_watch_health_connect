package defpackage;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface gf8 {
    gf8 addContextValue(String str, Object obj);

    List<Pair<String, Object>> getContextEntries();

    Set<String> getContextLabels();

    List<Object> getContextValues(String str);

    Object getFirstContextValue(String str);

    String getFormattedExceptionMessage(String str);

    gf8 setContextValue(String str, Object obj);
}
