package com.facebook.bolts;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.setting.JsSettingActivity;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/facebook/bolts/AppLink;", "", "", "Lcom/facebook/bolts/AppLink$Target;", "a", "Ljava/util/List;", "getTargets", "()Ljava/util/List;", "targets", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "getSourceUrl", "()Landroid/net/Uri;", "sourceUrl", "c", "getWebUrl", JsSettingActivity.WEB_URL, "<init>", "(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V", AVTransport.TARGET, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppLink {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Target> targets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Uri sourceUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Uri webUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/facebook/bolts/AppLink$Target;", "", "", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "packageName", "b", "getClassName", "className", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "url", GoogleApiAvailabilityLight.a, "getAppName", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Target {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String packageName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String className;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Uri url;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final String appName;

        public Target(@NotNull String str, @NotNull String str2, @NotNull Uri uri, @NotNull String str3) {
            this.packageName = str;
            this.className = str2;
            this.url = uri;
            this.appName = str3;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        @NotNull
        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(@NotNull Uri uri, @Nullable List<Target> list, @NotNull Uri uri2) {
        this.sourceUrl = uri;
        this.webUrl = uri2;
        this.targets = list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    @NotNull
    public final List<Target> getTargets() {
        return Collections.unmodifiableList(this.targets);
    }

    @NotNull
    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
