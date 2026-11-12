package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "", "start", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentManager {

    @NotNull
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements FeatureManager.Callback {
        public static final a a = new a();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                CrashHandler.INSTANCE.enable();
                if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                    ExceptionAnalyzer.enable();
                    CrashShieldHandler.enable();
                }
                if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                    ThreadCheckHandler.enable();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements FeatureManager.Callback {
        public static final b a = new b();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                ErrorReportHandler.enable();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements FeatureManager.Callback {
        public static final c a = new c();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                ANRHandler.enable();
            }
        }
    }

    private InstrumentManager() {
    }

    @JvmStatic
    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, a.a);
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, b.a);
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, c.a);
        }
    }
}
