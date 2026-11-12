package com.huami.treadmill.helper;

import android.app.Application;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.treadmill.api.TdmillApi;
import com.huami.treadmill.data.source.TdmillRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/treadmill/helper/DataLocator;", "", "", "isNeedDb", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "Lcom/huami/treadmill/api/TdmillApi;", "getTdmillApi", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface DataLocator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/treadmill/helper/DataLocator$Companion;", "", "Landroid/app/Application;", "app", "Lcom/huami/treadmill/helper/DataLocator;", DefaultSettingsSpiCall.n, "locator", "", "swap", "b", "Ljava/lang/Object;", "LOCK", "c", "Lcom/huami/treadmill/helper/DataLocator;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final Object LOCK = new Object();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private static DataLocator instance;

        private Companion() {
        }

        @NotNull
        public final DataLocator instance(@NotNull Application app) {
            DataLocator dataLocator;
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new DefaultDataLocator(app, false);
                }
                dataLocator = instance;
            }
            return dataLocator;
        }

        @VisibleForTesting
        public final void swap(@NotNull DataLocator locator) {
            instance = locator;
        }
    }

    @NotNull
    TdmillRepository getRepository(boolean isNeedDb);

    @NotNull
    TdmillApi getTdmillApi();
}
