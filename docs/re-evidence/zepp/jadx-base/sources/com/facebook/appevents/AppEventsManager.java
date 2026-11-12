package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventsManager;", "", "", "start", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppEventsManager {

    @NotNull
    public static final AppEventsManager INSTANCE = new AppEventsManager();

    private AppEventsManager() {
    }

    @JvmStatic
    public static final void start() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsManager.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.getAppSettingsAsync(new FetchedAppSettingsManager.FetchedAppSettingsCallback() { // from class: com.facebook.appevents.AppEventsManager.start.1

                /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a implements FeatureManager.Callback {
                    public static final a a = new a();

                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z) {
                        if (z) {
                            MetadataIndexer.enable();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b implements FeatureManager.Callback {
                    public static final b a = new b();

                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z) {
                        if (z) {
                            RestrictiveDataManager.enable();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c implements FeatureManager.Callback {
                    public static final c a = new c();

                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z) {
                        if (z) {
                            ModelManager.enable();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1$d */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d implements FeatureManager.Callback {
                    public static final d a = new d();

                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z) {
                        if (z) {
                            EventDeactivationManager.enable();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1$e */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e implements FeatureManager.Callback {
                    public static final e a = new e();

                    @Override // com.facebook.internal.FeatureManager.Callback
                    public final void onCompleted(boolean z) {
                        if (z) {
                            InAppPurchaseManager.enableAutoLogging();
                        }
                    }
                }

                @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
                public void onError() {
                }

                @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
                public void onSuccess(@Nullable FetchedAppSettings fetchedAppSettings) {
                    FeatureManager.checkFeature(FeatureManager.Feature.AAM, a.a);
                    FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, b.a);
                    FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, c.a);
                    FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, d.a);
                    FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, e.a);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsManager.class);
        }
    }
}
