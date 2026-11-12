package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H$J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpw;", "", "", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "version", "I", PluginDeviceInfo.FICONON, "()I", "(I)V", "cmd", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class pw {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30839b = 1;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lpw$a;", "", "", "CMD_ASR", "I", "CMD_CONTINUE", "CMD_DELETE_NOTIFICATION", "CMD_ERROR", "CMD_NLP", "CMD_SEND_NOTIFICATION", "CMD_SESSION_READY", "CMD_TTS_AUDIO", "CMD_TTS_TEXT", "CMD_VAD", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pw(int i) {
        this.f30838a = i;
    }

    public final void a(int i) {
        this.f30839b = i;
    }

    @Nullable
    public abstract byte[] a();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF30838a() {
        return this.f30838a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF30839b() {
        return this.f30839b;
    }

    @NotNull
    public final byte[] d() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(getF30838a());
        byte[] bArrA = a();
        if (bArrA != null) {
            byteArrayOutputStream.write(bArrA);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }
}
