package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0006B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lb8;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "processor", "bgPath", "previewBmpPath", "<init>", "(Lph;Ljava/lang/String;Ljava/lang/String;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class b8 implements ph {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ph f3903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f3904b;

    @NotNull
    public final String c;
    public final int d;
    public final int e;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u0011"}, d2 = {"Lb8$a;", "", "", "CACHE_SIZE", "I", "", "INDEX_BG_KONGMING_SET", "J", "INDEX_BG_KONGMING_SIZE_END", "INDEX_BG_KONGMING_SIZE_START", "INDEX_BG_KONGMING_SIZE_TYPE", "INDEX_KONGMING_PREVIEW_OFFSET_END", "INDEX_KONGMING_PREVIEW_OFFSET_START", "INDEX_KONGMING_PREVIEW_SIZE_END", "INDEX_KONGMING_PREVIEW_SIZE_START", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b8(@Nullable ph phVar, @NotNull String bgPath, @NotNull String previewBmpPath) {
        Intrinsics.checkNotNullParameter(bgPath, "bgPath");
        Intrinsics.checkNotNullParameter(previewBmpPath, "previewBmpPath");
        this.f3903a = phVar;
        this.f3904b = bgPath;
        this.c = previewBmpPath;
        this.d = 1;
        this.e = 2;
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) throws IOException {
        long j;
        File parentFile;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        ph phVar = this.f3903a;
        String strA = phVar != null ? phVar.a(context, originPath) : null;
        File file = new File(this.f3904b);
        long length = file.length();
        long length2 = new File(this.c).length();
        FileInputStream fileInputStream = new FileInputStream(new File(strA));
        fileInputStream.skip(45L);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        int iD = tet.d(bArr, 0, 4);
        fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(new File(strA));
        FileInputStream fileInputStream3 = new FileInputStream(file);
        FileInputStream fileInputStream4 = new FileInputStream(this.c);
        File fileA = hct.a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(fileA);
        String str = File.separator;
        sb.append(str);
        sb.append("custom_dial");
        sb.append(str);
        sb.append("ret.bin");
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        File parentFile2 = file2.getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = file2.getParentFile()) != null) {
            parentFile.mkdir();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArrQ = tet.q(length);
        byte[] bArrQ2 = tet.q(length2);
        long j2 = iD;
        byte[] bArrQ3 = tet.q(length + j2);
        long j3 = 0;
        while (j3 != j2) {
            if (49 > j3 || j3 >= 53) {
                j = j2;
                if (j3 == 53) {
                    fileInputStream2.read();
                    j3++;
                    fileOutputStream.write(this.d);
                } else if (37 <= j3 && j3 < 41) {
                    fileInputStream2.read();
                    fileOutputStream.write(bArrQ3[(int) (j3 - 37)]);
                } else if (41 > j3 || j3 >= 45) {
                    fileOutputStream.write(fileInputStream2.read());
                } else {
                    fileInputStream2.read();
                    fileOutputStream.write(bArrQ2[(int) (j3 - 41)]);
                }
                j2 = j;
            } else {
                fileInputStream2.read();
                j = j2;
                fileOutputStream.write(bArrQ[(int) (j3 - 49)]);
            }
            j3++;
            j2 = j;
        }
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = fileInputStream3.read(bArr2);
            if (i == -1) {
                break;
            }
            fileOutputStream.write(bArr2, 0, i);
        }
        while (true) {
            int i2 = fileInputStream4.read(bArr2);
            if (i2 == -1) {
                fileOutputStream.close();
                fileInputStream2.close();
                fileInputStream3.close();
                fileInputStream4.close();
                String absolutePath = file2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "retFile.absolutePath");
                return absolutePath;
            }
            fileOutputStream.write(bArr2, 0, i2);
        }
    }
}
