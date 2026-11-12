package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lxp;", "Lpw;", "", PluginDeviceInfo.FMODEL, "", "", "tips", "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xp extends pw {

    @Nullable
    public final List<String> d;

    public xp(@Nullable List<String> list) {
        super(3);
        this.d = list;
    }

    @Override // defpackage.pw
    @Nullable
    public byte[] a() throws IOException {
        if (this.d == null) {
            return new byte[]{0};
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.d.size());
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            byte[] bytes = it.next().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
