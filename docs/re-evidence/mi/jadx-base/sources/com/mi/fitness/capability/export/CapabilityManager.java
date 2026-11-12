package com.mi.fitness.capability.export;

import com.mi.fitness.capability.export.model.CapabilityModel;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/mi/fitness/capability/export/CapabilityManager;", "", "getCapabilities", "", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "isSupportAlexa", "getCapabilitiesInt", "", "Companion", "capability-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CapabilityManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mi/fitness/capability/export/CapabilityManager$Companion;", "", "<init>", "()V", "capability-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Set<CapabilityModel> getCapabilities();

    int getCapabilitiesInt();

    @NotNull
    CapabilityModel isSupportAlexa();
}
