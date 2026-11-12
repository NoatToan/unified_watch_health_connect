package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kq, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lkq;", "", "", "toString", "", "sessionId", "Lbl;", "source", "url", "offset", "format", "<init>", "(ILbl;Ljava/lang/String;II)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class RequestAudio {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final bl source;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int offset;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int format;

    /* JADX INFO: renamed from: kq$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lkq$a;", "", "", "data", "Lkq;", PluginDeviceInfo.FMODEL, "", "OPUS_16000_1_16", "I", "OPUS_8000_1_16", "REQUEST_AUDIO", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RequestAudio a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte b2 = data[0];
            int i = data[1] & 255;
            bl blVarA = bl.u.a(dl.a(data[2], data[3]));
            int iA = dl.a(data, 4);
            int i2 = iA + 2;
            return new RequestAudio(i, blVarA, dl.a(data, 4, iA), dl.a(data[iA + 1], data[i2]), data[iA + 3] & 255);
        }
    }

    public RequestAudio(int i, @NotNull bl source, @NotNull String url, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        this.sessionId = i;
        this.source = source;
        this.url = url;
        this.offset = i2;
        this.format = i3;
    }

    @NotNull
    public String toString() {
        return "RequestAudio(sessionId=" + this.sessionId + ", source=" + this.source + ", url='" + this.url + "', offset=" + this.offset + ", format=" + this.format + ')';
    }
}
