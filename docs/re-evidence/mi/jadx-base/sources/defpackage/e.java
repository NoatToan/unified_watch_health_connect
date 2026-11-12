package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Le;", "Lpw;", "", PluginDeviceInfo.FMODEL, "", "text", "", "isFinal", "<init>", "(Ljava/lang/String;Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class e extends pw {

    @NotNull
    public final String d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull String text, boolean z) {
        super(7);
        Intrinsics.checkNotNullParameter(text, "text");
        this.d = text;
        this.e = z;
    }

    @Override // defpackage.pw
    @NotNull
    public byte[] a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.e ? 1 : 0);
        byte[] bytes = this.d.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }
}
