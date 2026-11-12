package com.huami.watchfacesstore.device.process;

import com.huami.quicklz.QuickLz;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialDecompressProcessor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "process", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialDecompressProcessor implements IDialProcessor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decompress time: " + (this.a - this.b);
        }
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) {
        File parentFile;
        File appFileDir = FileUtils.getAppFileDir(KoinExtKt.getAppContext());
        String str = File.separator;
        File file = new File(appFileDir + str + WatchSkinManager.WATCH_SKIN_DIAL_PARENT_FILE_NAME + str + "de.bin");
        if (file.exists()) {
            file.delete();
        }
        File parentFile2 = file.getParentFile();
        boolean z = false;
        if (parentFile2 != null && !parentFile2.exists()) {
            z = true;
        }
        if (z && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdir();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        new QuickLz().decompress(originPath, file.getAbsolutePath());
        HMLog.debug("process", new a(System.currentTimeMillis(), jCurrentTimeMillis));
        return file.getAbsolutePath();
    }
}
