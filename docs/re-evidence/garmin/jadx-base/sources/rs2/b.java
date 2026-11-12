package rs2;

import com.garmin.proto.generated.GDISmartProto;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.h0;
import p13.k0;
import p13.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\b\b\u0017\u0018\u0000 B2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J)\u0010\u001c\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001c\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010!J)\u0010\"\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001dJ1\u0010#\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102¨\u0006D"}, d2 = {"Lrs2/b;", "Lrs2/g;", "", "connectionId", "<init>", "(Ljava/lang/String;)V", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "smart", "", "shouldAppendLog", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;)Z", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", "", "onExtensionsRegistered", "(Lcom/google/protobuf/ExtensionRegistryLite;)V", "", "requestId", "onSendRequest", "(ILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "onReceiveResponse", "onSendNotification", "onProtobufRequest", "onProtobufRespond", "transactionId", "messageType", "", "payload", "onWrite", "(Ljava/lang/Integer;I[B)V", "requestType", "Lrs2/y;", "status", "(Ljava/lang/Integer;ILrs2/y;[B)V", "onRequestRead", "onResponseRead", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onMessageReadFailed", "onClose", "()V", "Ljava/lang/String;", "getConnectionId", "()Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "Ljava/util/SortedMap;", "registeredExtensions", "Ljava/util/SortedMap;", "getRegisteredExtensions", "()Ljava/util/SortedMap;", "", "extensionFilter", "Ljava/util/Set;", "getExtensionFilter", "()Ljava/util/Set;", "isProtobufLite", "Companion", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b implements g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final o13.l<Field> extensionsByNameField$delegate = o13.m.b(new ro0.h(4));
    private static final o13.l<Method> getAllFieldsMethod$delegate = o13.m.b(new ro0.h(5));
    private final String connectionId;
    private boolean enabled;
    private final Set<String> extensionFilter;
    private boolean isProtobufLite;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final o13.l logger;
    private final SortedMap<Integer, String> registeredExtensions;

    public b(String str) {
        str.getClass();
        this.connectionId = str;
        this.logger = o13.m.b(new ro0.g(this, 5));
        TreeMap treeMap = new TreeMap();
        u0.k(treeMap, new o13.p[0]);
        this.registeredExtensions = treeMap;
        this.extensionFilter = new LinkedHashSet();
        this.isProtobufLite = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field extensionsByNameField_delegate$lambda$5() {
        try {
            try {
                Field declaredField = ExtensionRegistry.class.getDeclaredField("immutableExtensionsByName");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            Field declaredField2 = ExtensionRegistry.class.getDeclaredField("extensionsByName");
            declaredField2.setAccessible(true);
            return declaredField2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getAllFieldsMethod_delegate$lambda$6() {
        try {
            return GDISmartProto.Smart.class.getMethod("getAllFields", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger logger_delegate$lambda$0(b bVar) {
        d dVar = d.f154380a;
        String str = bVar.connectionId;
        dVar.getClass();
        return LoggerFactory.getLogger(d.a("ProtobufLogger", -1L, bVar, str));
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Set<String> getExtensionFilter() {
        return this.extensionFilter;
    }

    public final Logger getLogger() {
        Object value = this.logger.getValue();
        value.getClass();
        return (Logger) value;
    }

    public final SortedMap<Integer, String> getRegisteredExtensions() {
        return this.registeredExtensions;
    }

    @Override // rs2.f
    public void onClose() {
    }

    @Override // rs2.g
    public void onExtensionsRegistered(ExtensionRegistryLite extensionRegistry) {
        extensionRegistry.getClass();
        if (extensionRegistry instanceof ExtensionRegistry) {
            this.isProtobufLite = false;
            ExtensionRegistry extensionRegistry2 = (ExtensionRegistry) extensionRegistry;
            INSTANCE.getClass();
            Field field = (Field) extensionsByNameField$delegate.getValue();
            Object obj = field != null ? field.get(extensionRegistry2) : null;
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                map = k0.f134949a;
                map.getClass();
            }
            for (ExtensionRegistry.ExtensionInfo extensionInfo : map.values()) {
                this.registeredExtensions.put(Integer.valueOf(extensionInfo.descriptor.getNumber()), extensionInfo.descriptor.getName());
            }
            SortedMap<Integer, String> sortedMap = this.registeredExtensions;
            ArrayList arrayList = new ArrayList(sortedMap.size());
            for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
                arrayList.add(entry.getKey() + ": " + ((Object) entry.getValue()));
            }
            getLogger().debug("Registered extensions:\n".concat(h0.k0(arrayList, "\n", null, null, null, 62)));
        }
    }

    @Override // rs2.f
    public void onMessageReadFailed(String error) {
        error.getClass();
    }

    @Override // rs2.g
    public void onProtobufRequest(int requestId, GDISmartProto.Smart smart) {
        smart.getClass();
        if (shouldAppendLog(smart)) {
            getLogger().debug("onProtobufRequest:\n" + smart);
        }
    }

    @Override // rs2.g
    public void onProtobufRespond(int requestId, GDISmartProto.Smart smart) {
        smart.getClass();
        if (shouldAppendLog(smart)) {
            getLogger().debug("onProtobufRespond:\n" + smart);
        }
    }

    @Override // rs2.g
    public void onReceiveResponse(int requestId, GDISmartProto.Smart smart) {
        smart.getClass();
        if (shouldAppendLog(smart)) {
            getLogger().debug("onReceiveResponse:\n" + smart);
        }
    }

    @Override // rs2.f
    public void onRequestRead(Integer transactionId, int messageType, byte[] payload) {
        payload.getClass();
    }

    @Override // rs2.f
    public void onResponseRead(Integer transactionId, int messageType, y status, byte[] payload) {
        status.getClass();
        payload.getClass();
    }

    @Override // rs2.g
    public void onSendNotification(int requestId, GDISmartProto.Smart smart) {
        smart.getClass();
        if (shouldAppendLog(smart)) {
            getLogger().debug("onSendNotification:\n" + smart);
        }
    }

    @Override // rs2.g
    public void onSendRequest(int requestId, GDISmartProto.Smart smart) {
        smart.getClass();
        if (shouldAppendLog(smart)) {
            getLogger().debug("onSendRequest:\n" + smart);
        }
    }

    @Override // rs2.f
    public void onWrite(Integer transactionId, int requestType, y status, byte[] payload) {
        status.getClass();
        payload.getClass();
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final boolean shouldAppendLog(GDISmartProto.Smart smart) {
        smart.getClass();
        if (!this.enabled) {
            return false;
        }
        if (this.isProtobufLite || this.extensionFilter.isEmpty()) {
            return true;
        }
        INSTANCE.getClass();
        Method method = (Method) getAllFieldsMethod$delegate.getValue();
        Object objInvoke = method != null ? method.invoke(smart, null) : null;
        Map map = objInvoke instanceof Map ? (Map) objInvoke : null;
        if (map == null) {
            map = k0.f134949a;
            map.getClass();
        }
        Set setKeySet = map.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (this.extensionFilter.contains(((Descriptors.FieldDescriptor) it.next()).getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: rs2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs2/b$a;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // rs2.f
    public void onWrite(Integer transactionId, int messageType, byte[] payload) {
        payload.getClass();
    }
}
