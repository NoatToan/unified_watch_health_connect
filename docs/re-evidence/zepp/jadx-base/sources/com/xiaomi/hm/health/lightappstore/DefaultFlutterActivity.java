package com.xiaomi.hm.health.lightappstore;

import android.os.Bundle;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.StatusBarUtil;
import io.flutter.embedding.android.FlutterActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/lightappstore/DefaultFlutterActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultFlutterActivity extends FlutterActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/lightappstore/DefaultFlutterActivity$Companion;", "", "", "cachedEngineId", "Lio/flutter/embedding/android/FlutterActivity$CachedEngineIntentBuilder;", "withCachedEngine", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FlutterActivity.CachedEngineIntentBuilder withCachedEngine(@NotNull String cachedEngineId) {
            return new FlutterActivity.CachedEngineIntentBuilder(DefaultFlutterActivity.class, cachedEngineId);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        super.onCreate(savedInstanceState);
    }
}
