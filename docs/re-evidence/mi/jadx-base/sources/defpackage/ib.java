package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lib;", "Lni;", "", PluginDeviceInfo.FMODEL, "path", "", "version", "fwType", "imageSize", "imageCrc", "", "Lyd;", "fwTy", "<init>", "(Ljava/lang/String;Lyd;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class ib implements ni {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f20959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final yd f20960b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lib$a;", "", "", "BATCH_HEAD_VERSION", "I", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ib(@NotNull String path, @NotNull yd fwTy) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fwTy, "fwTy");
        this.f20959a = path;
        this.f20960b = fwTy;
    }

    @Override // defpackage.ni
    @NotNull
    public String a() throws Exception {
        String str = this.f20959a + ".header";
        a(str, 1, this.f20960b.a(), (int) new File(this.f20959a).length(), (int) hb.a(this.f20959a));
        if (hb.a(new String[]{this.f20959a}, str, false, 4, null)) {
            return str;
        }
        throw new Exception("generate fw header file exception");
    }

    public final void a(String path, int version, int fwType, int imageSize, int imageCrc) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(version);
        byteArrayOutputStream.write(fwType);
        byteArrayOutputStream.write(tet.p(imageSize));
        byteArrayOutputStream.write(tet.p(imageCrc));
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        byteArrayOutputStream.close();
    }
}
