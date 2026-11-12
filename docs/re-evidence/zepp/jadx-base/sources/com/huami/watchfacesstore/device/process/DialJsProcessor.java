package com.huami.watchfacesstore.device.process;

import com.baidu.ocr.sdk.utils.LogUtil;
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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialJsProcessor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "process", "a", "Ljava/lang/String;", "bgPath", "b", "previewPath", "", "c", LogUtil.I, "imageFmt", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialJsProcessor implements IDialProcessor {

    @NotNull
    public static final String BG_PATH = "assets/images/bg.png";

    @NotNull
    public static final String PREVIEW_PATH = "assets/images/preview.png";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bgPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String previewPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int imageFmt;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start png2tga " + DialJsProcessor.this.bgPath;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start  resPreview png2tga " + DialJsProcessor.this.previewPath;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "resPreview: " + this.a;
        }
    }

    public DialJsProcessor(@NotNull String str, @NotNull String str2, int i) {
        this.bgPath = str;
        this.previewPath = str2;
        this.imageFmt = i;
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
    public String process(@NotNull String originPath) throws Exception {
        String str = FileUtils.getAppFileDir(KoinExtKt.getAppContext()).getAbsolutePath() + "/custom_dial";
        String str2 = str + "/ret.zip";
        WatchFaceManager.INSTANCE.delete(str);
        ZipUtil.unzipFile(originPath, str);
        HMLog.info("DialJsProcessor", new a());
        DialProcess dialProcess = DialProcess.INSTANCE;
        int iPng2tga = dialProcess.png2tga(this.bgPath, str + "/assets/images/bg.png", this.imageFmt);
        HMLog.info("DialJsProcessor", new b(iPng2tga));
        if (iPng2tga != 0) {
            throw new Exception("表盘背景图转换错误");
        }
        HMLog.info("DialJsProcessor", new c());
        int iPng2tga2 = dialProcess.png2tga(this.previewPath, str + "/assets/images/preview.png", this.imageFmt);
        HMLog.info("DialJsProcessor", new d(iPng2tga2));
        if (iPng2tga2 != 0) {
            throw new Exception("表盘预览图转换错误");
        }
        File[] fileArrListFiles = new File(str).listFiles();
        ZipUtil.zipFiles(fileArrListFiles == null ? null : ArraysKt___ArraysKt.toList(fileArrListFiles), new File(str2));
        return str2;
    }
}
