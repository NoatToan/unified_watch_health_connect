package com.miui.headset.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\rH&¨\u0006\u0014"}, d2 = {"Lcom/miui/headset/api/IHeadset;", "", "circulateEnd", "", "fromHostId", "", "toHostId", "circulateStart", "getProfile", "Lcom/miui/headset/api/Profile;", "getQuery", "Lcom/miui/headset/api/Query;", "initService", "", "initialize", "release", "startDiscovery", "stopDiscovery", "unInitService", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IHeadset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/miui/headset/api/IHeadset$Companion;", "", "()V", "create", "Lcom/miui/headset/api/IHeadset;", "context", "Landroid/content/Context;", "headsetServiceListener", "Lcom/miui/headset/api/HeadsetServiceListener;", "headsetHostListener", "Lcom/miui/headset/api/HeadsetHostListener;", "alias", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ IHeadset create$default(Companion companion, Context context, HeadsetServiceListener headsetServiceListener, HeadsetHostListener headsetHostListener, String str, int i, Object obj) {
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(context, headsetServiceListener, headsetHostListener, str);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(headsetServiceListener, "headsetServiceListener");
            Intrinsics.checkNotNullParameter(headsetHostListener, "headsetHostListener");
            return create$default(this, context, headsetServiceListener, headsetHostListener, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener, @NotNull String alias) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(headsetServiceListener, "headsetServiceListener");
            Intrinsics.checkNotNullParameter(headsetHostListener, "headsetHostListener");
            Intrinsics.checkNotNullParameter(alias, "alias");
            return DefaultHeadsetClientFactory.INSTANCE.create(context, headsetServiceListener, headsetHostListener, alias);
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener) {
        return INSTANCE.create(context, headsetServiceListener, headsetHostListener);
    }

    int circulateEnd(@NotNull String fromHostId, @NotNull String toHostId);

    int circulateStart(@NotNull String fromHostId, @NotNull String toHostId);

    @NotNull
    Profile getProfile();

    @NotNull
    Query getQuery();

    void initService();

    void initialize();

    void release();

    void startDiscovery();

    void stopDiscovery();

    void unInitService();

    @JvmStatic
    @JvmOverloads
    @NotNull
    static IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener, @NotNull String str) {
        return INSTANCE.create(context, headsetServiceListener, headsetHostListener, str);
    }
}
