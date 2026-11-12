package com.miui.circulate.device.api;

import android.database.ContentObserver;
import android.net.Uri;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/miui/circulate/device/api/ObserverRegister;", "", "activeObservers", "", "Landroid/net/Uri;", "Lcom/miui/circulate/device/api/ObserverRegister$ContentObserverDesc;", "registerContentObserver", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "notifyForDescendants", "", "observer", "Landroid/database/ContentObserver;", "unregisterContentObserver", "ContentObserverDesc", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ObserverRegister {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/miui/circulate/device/api/ObserverRegister$ContentObserverDesc;", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "notifyForDescendants", "", "observer", "Landroid/database/ContentObserver;", "(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V", "getNotifyForDescendants", "()Z", "getObserver", "()Landroid/database/ContentObserver;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ContentObserverDesc {
        private final boolean notifyForDescendants;

        @NotNull
        private final ContentObserver observer;

        @NotNull
        private final Uri uri;

        public ContentObserverDesc(@NotNull Uri uri, boolean z, @NotNull ContentObserver observer) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.uri = uri;
            this.notifyForDescendants = z;
            this.observer = observer;
        }

        public static /* synthetic */ ContentObserverDesc copy$default(ContentObserverDesc contentObserverDesc, Uri uri, boolean z, ContentObserver contentObserver, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = contentObserverDesc.uri;
            }
            if ((i & 2) != 0) {
                z = contentObserverDesc.notifyForDescendants;
            }
            if ((i & 4) != 0) {
                contentObserver = contentObserverDesc.observer;
            }
            return contentObserverDesc.copy(uri, z, contentObserver);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getNotifyForDescendants() {
            return this.notifyForDescendants;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ContentObserver getObserver() {
            return this.observer;
        }

        @NotNull
        public final ContentObserverDesc copy(@NotNull Uri uri, boolean notifyForDescendants, @NotNull ContentObserver observer) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(observer, "observer");
            return new ContentObserverDesc(uri, notifyForDescendants, observer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentObserverDesc)) {
                return false;
            }
            ContentObserverDesc contentObserverDesc = (ContentObserverDesc) other;
            return Intrinsics.areEqual(this.uri, contentObserverDesc.uri) && this.notifyForDescendants == contentObserverDesc.notifyForDescendants && Intrinsics.areEqual(this.observer, contentObserverDesc.observer);
        }

        public final boolean getNotifyForDescendants() {
            return this.notifyForDescendants;
        }

        @NotNull
        public final ContentObserver getObserver() {
            return this.observer;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            boolean z = this.notifyForDescendants;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((iHashCode + r1) * 31) + this.observer.hashCode();
        }

        @NotNull
        public String toString() {
            return "ContentObserverDesc(uri=" + this.uri + ", notifyForDescendants=" + this.notifyForDescendants + ", observer=" + this.observer + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Map<Uri, ContentObserverDesc> activeObservers(@NotNull ObserverRegister observerRegister) {
            return MapsKt__MapsKt.emptyMap();
        }
    }

    @NotNull
    Map<Uri, ContentObserverDesc> activeObservers();

    void registerContentObserver(@NotNull Uri uri, boolean notifyForDescendants, @NotNull ContentObserver observer);

    void unregisterContentObserver(@NotNull ContentObserver observer);
}
