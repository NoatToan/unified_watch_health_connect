package com.xiaomi.hm.health.device.watch_skin;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.dial_process.DialProcess;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialZeppOSProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Ljava/lang/String;", "getBgPath", "()Ljava/lang/String;", "bgPath", "<init>", "(Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialZeppOSProcessor implements IDialProcessor {

    @NotNull
    public static final String BG_PATH = "assets/images/bg.png";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bgPath;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start png2tga";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "res: " + this.a;
        }
    }

    public DialZeppOSProcessor(@NotNull String str) {
        this.bgPath = str;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @NotNull
    public final String getBgPath() {
        return this.bgPath;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) throws Throwable {
        String str = FileUtils.getAppFileDir(KoinExtKt.getAppContext()).getAbsolutePath() + "/custom_dial";
        String str2 = str + "/ret.zip";
        WatchFaceManager.INSTANCE.delete(str);
        ZipUtil.unzipFile(originPath, str);
        HMLog.info("DialJsProcessor", a.a);
        HMLog.info("DialJsProcessor", new b(DialProcess.png2tga$default(DialProcess.INSTANCE, this.bgPath, str + "/assets/images/bg.png", 0, 4, null)));
        ZipUtil.zipFiles(ArraysKt___ArraysKt.toList(new File(str).listFiles()), new File(str2));
        return str2;
    }
}
