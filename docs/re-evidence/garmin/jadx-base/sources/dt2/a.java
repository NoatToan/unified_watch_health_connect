package dt2;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    void close(String str);

    Set<Integer> getConfiguration();

    void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite);
}
