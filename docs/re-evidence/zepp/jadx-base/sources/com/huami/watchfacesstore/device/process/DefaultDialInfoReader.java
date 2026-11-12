package com.huami.watchfacesstore.device.process;

import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DefaultDialInfoReader;", "Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "", "path", "", "", "readDialInfo", "(Ljava/lang/String;)[Ljava/lang/Long;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultDialInfoReader implements IDialInfoReader {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Long[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long[] lArr) {
            super(0);
            this.a = lArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Long[] lArr = this.a;
            return "dialId: " + lArr[0] + " dialSize: " + lArr[1];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "readDialSize e: " + this.a;
        }
    }

    @Override // com.huami.watchfacesstore.device.process.IDialInfoReader
    @NotNull
    public Long[] readDialInfo(@NotNull String path) {
        Long[] lArr = new Long[2];
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path));
            fileInputStream.skip(18L);
            byte[] bArr = new byte[4];
            fileInputStream.read(bArr);
            lArr[0] = Long.valueOf(GattUtils.bytesToLong(bArr, 0, 4));
            fileInputStream.skip(10L);
            byte[] bArr2 = new byte[4];
            fileInputStream.read(bArr2);
            lArr[1] = Long.valueOf(GattUtils.bytesToLong(bArr2, 0, 4));
            HMLog.info("DefaultDialInfoReader", new a(lArr));
        } catch (Exception e) {
            HMLog.info("DefaultDialInfoReader", new b(e));
        }
        return lArr;
    }
}
