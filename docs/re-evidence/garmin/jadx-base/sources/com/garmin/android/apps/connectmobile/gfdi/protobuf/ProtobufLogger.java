package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import c22.s3;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0003R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufLogger;", "", "<init>", "()V", "", "connectionId", "Lrs2/g;", "createLogger", "(Ljava/lang/String;)Lrs2/g;", "Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;", "extension", "", "addExtensionFilter", "(Lcom/google/protobuf/GeneratedMessage$GeneratedExtension;)V", "removeExtensionFilter", "clearExtensionFilter", "", "Lrs2/b;", "instances", "Ljava/util/List;", "getInstances", "()Ljava/util/List;", "", "value", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "Lcom/google/protobuf/Descriptors$FieldDescriptor;", "extensionFilter", "Ljava/util/Set;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProtobufLogger {
    public static final int $stable;
    public static final ProtobufLogger INSTANCE;
    private static boolean enabled;
    private static final Set<Descriptors.FieldDescriptor> extensionFilter;
    private static final List<rs2.b> instances;

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    static {
        boolean z14;
        ProtobufLogger protobufLogger = new ProtobufLogger();
        INSTANCE = protobufLogger;
        instances = new ArrayList();
        extensionFilter = new LinkedHashSet();
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().R()) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        protobufLogger.setEnabled(z14);
        $stable = 8;
    }

    private ProtobufLogger() {
    }

    public final void addExtensionFilter(GeneratedMessage.GeneratedExtension<?, ?> extension) {
        extension.getClass();
        extensionFilter.add(extension.getDescriptor());
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            Set<String> extensionFilter2 = ((rs2.b) it.next()).getExtensionFilter();
            String name = extension.getDescriptor().getName();
            name.getClass();
            extensionFilter2.add(name);
        }
    }

    public final void clearExtensionFilter() {
        extensionFilter.clear();
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((rs2.b) it.next()).getExtensionFilter().clear();
        }
    }

    public final rs2.g createLogger(String connectionId) {
        connectionId.getClass();
        return new rs2.b(connectionId) { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufLogger.createLogger.1
            {
                ProtobufLogger protobufLogger = ProtobufLogger.INSTANCE;
                protobufLogger.getInstances().add(this);
                setEnabled(protobufLogger.getEnabled());
                Set<String> extensionFilter2 = getExtensionFilter();
                Set set = ProtobufLogger.extensionFilter;
                ArrayList arrayList = new ArrayList(y.r(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Descriptors.FieldDescriptor) it.next()).getName());
                }
                extensionFilter2.addAll(arrayList);
            }

            @Override // rs2.b, rs2.f
            public void onClose() {
                ProtobufLogger.INSTANCE.getInstances().remove(this);
            }
        };
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final List<rs2.b> getInstances() {
        return instances;
    }

    public final void removeExtensionFilter(GeneratedMessage.GeneratedExtension<?, ?> extension) {
        extension.getClass();
        extensionFilter.remove(extension.getDescriptor());
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((rs2.b) it.next()).getExtensionFilter().remove(extension.getDescriptor().getName());
        }
    }

    public final void setEnabled(boolean z14) {
        enabled = z14;
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((rs2.b) it.next()).setEnabled(z14);
        }
    }
}
