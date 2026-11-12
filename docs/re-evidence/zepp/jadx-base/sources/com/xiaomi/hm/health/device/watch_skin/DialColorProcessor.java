package com.xiaomi.hm.health.device.watch_skin;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialColorProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "", "b", "[B", "argb", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;[B)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialColorProcessor implements IDialProcessor {
    public static final long INDEX_COLOR_END = 43;
    public static final long INDEX_COLOR_SET = 39;
    public static final long INDEX_COLOR_START = 40;

    @NotNull
    private static final String c = "DialColorProcessor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final byte[] argb;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "assembleDialWithColor e: " + this.a;
        }
    }

    public DialColorProcessor(@Nullable IDialProcessor iDialProcessor, @Nullable byte[] bArr) {
        this.processor = iDialProcessor;
        this.argb = bArr;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) throws Throwable {
        FileOutputStream fileOutputStream;
        IDialProcessor iDialProcessor = this.processor;
        if (iDialProcessor != null) {
            iDialProcessor.process(originPath);
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(originPath);
            try {
                String string = FileUtils.getAppFileDir(DeviceXFunctionsKt.getContext()).toString();
                String str = File.separator;
                File file = new File(string + str + WatchSkinManager.WATCH_SKIN_DIAL_PARENT_FILE_NAME + str + WatchSkinManager.WATCH_SKIN_DIAL_BIN_NAME);
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdir();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    Ref.IntRef intRef = new Ref.IntRef();
                    long j = 0;
                    while (true) {
                        int i = fileInputStream2.read();
                        intRef.element = i;
                        if (i == -1) {
                            break;
                        }
                        byte[] bArr = this.argb;
                        if (bArr == null || j != 39) {
                            if (bArr == null || j < 40 || j > 43) {
                                fileOutputStream.write(i);
                            } else {
                                fileOutputStream.write(bArr[(int) (((((long) bArr.length) + 40) - j) - 1)]);
                            }
                            j++;
                        } else {
                            j++;
                            fileOutputStream.write(1);
                        }
                    }
                    fileInputStream2.close();
                    fileOutputStream.close();
                    String path = file.getPath();
                    try {
                        fileInputStream2.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return path;
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream = fileInputStream2;
                    try {
                        HMLog.debug(c, new a(e));
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return "";
                        }
                        try {
                            fileOutputStream.close();
                            return "";
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
