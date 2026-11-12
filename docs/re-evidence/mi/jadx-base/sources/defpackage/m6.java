package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lm6;", "Ljh;", "", "cmd", "", "result", "", PluginDeviceInfo.FMODEL, "", "data", PluginDeviceInfo.FDESC, "", "tag", "<init>", "(Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class m6 implements jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f25793a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ byte t;
        public final /* synthetic */ boolean u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte b2, boolean z) {
            super(0);
            this.t = b2;
            this.u = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "on Send 0x" + Integer.toHexString(this.t) + " result: " + this.u + ';';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ byte t;
        public final /* synthetic */ byte[] u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte b2, byte[] bArr) {
            super(0);
            this.t = b2;
            this.u = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onReceive cmd: 0x" + Integer.toHexString(this.t) + "; response: " + tet.x(this.u);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte t;
        public final /* synthetic */ byte[] u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte b2, byte[] bArr) {
            super(0);
            this.t = b2;
            this.u = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onSend cmd: 0x" + Integer.toHexString(this.t) + "; bytes: " + tet.x(this.u);
        }
    }

    public m6(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f25793a = tag;
    }

    @Override // defpackage.jh
    public void a(byte cmd, boolean result) {
        le.c(this.f25793a, new a(cmd, result));
    }

    @Override // defpackage.jh
    public void b(byte cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        le.c(this.f25793a, new b(cmd, data));
    }

    @Override // defpackage.jh
    public void a(byte cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        le.c(this.f25793a, new c(cmd, data));
    }
}
