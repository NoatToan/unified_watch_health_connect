package com.huami.watchfacesstore.usecase;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086\u0002R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watchfacesstore/usecase/CheckUpdateNotPayUseCase;", "", "", "watchFaceUrl", "watchFacePath", "", "invoke", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CheckUpdateNotPayUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "CheckUpdateNotPayUseCase";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "hasDownload watchFacePath: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onlineBinName: " + this.a + " localBinName: " + this.b;
        }
    }

    public static /* synthetic */ boolean invoke$default(CheckUpdateNotPayUseCase checkUpdateNotPayUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return checkUpdateNotPayUseCase.invoke(str, str2);
    }

    public final boolean invoke(@Nullable String watchFaceUrl, @Nullable String watchFacePath) {
        if (watchFaceUrl == null || watchFacePath == null) {
            return false;
        }
        HMLog.info(this.tag, new a(watchFacePath));
        if (!new File(watchFacePath).exists()) {
            return false;
        }
        WatchFaceManager watchFaceManager = WatchFaceManager.INSTANCE;
        String binName = watchFaceManager.getBinName(watchFaceUrl);
        String binName2 = watchFaceManager.getBinName(watchFacePath);
        HMLog.info(this.tag, new b(binName, binName2));
        return !Intrinsics.areEqual(binName, binName2);
    }
}
