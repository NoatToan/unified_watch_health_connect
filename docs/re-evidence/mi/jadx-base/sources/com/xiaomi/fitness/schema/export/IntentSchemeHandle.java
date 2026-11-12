package com.xiaomi.fitness.schema.export;

import android.net.Uri;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.y0c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "Ly0c;", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "canHandle", "(Landroid/net/Uri;)Z", "", "", "parameterList", "()Ljava/util/List;", "pathList", "authority", "()Ljava/lang/String;", "<init>", "()V", "Companion", "schema-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class IntentSchemeHandle extends y0c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sAuthority = "intent";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle$Companion;", "", "<init>", "()V", "sAuthority", "", "getSAuthority", "()Ljava/lang/String;", "schema-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSAuthority() {
            return IntentSchemeHandle.sAuthority;
        }
    }

    @Override // defpackage.y0c
    @NotNull
    public String authority() {
        return sAuthority;
    }

    @Override // defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri) && (CollectionsKt___CollectionsKt.contains(parameterList(), uri.getQueryParameter("pageType")) || CollectionsKt___CollectionsKt.contains(pathList(), uri.getPath()));
    }

    @NotNull
    public abstract List<String> parameterList();

    @NotNull
    public abstract List<String> pathList();
}
