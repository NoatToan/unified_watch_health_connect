package com.huami.watch.companion.esim.arch;

import androidx.p008lifecycle.MutableLiveData;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.companion.esim.model.SimpleProfileInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/huami/watch/companion/esim/model/SimpleProfileInfo;", "<init>", "()V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class EsimProfileLiveData extends MutableLiveData<Map<String, SimpleProfileInfo>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final EsimProfileLiveData a = new EsimProfileLiveData();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData$Companion;", "", "Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", DefaultSettingsSpiCall.n, "Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "getInstance", "()Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EsimProfileLiveData getInstance() {
            return EsimProfileLiveData.a;
        }
    }
}
