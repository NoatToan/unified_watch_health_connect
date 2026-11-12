package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000b\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0003J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0011"}, d2 = {"Ls9;", "", "Lol;", "", "originResponse", "", PluginDeviceInfo.FICONOFF, "Ls9$b;", PluginDeviceInfo.FDESC, "byteArray", "Lu9;", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FICONON, "T", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33423a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ls9$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: s9$b, reason: from toString */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Ls9$b;", "", "", PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "other", "equals", "responseCmd", "code", "desc", "<init>", "(IILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Response {

        @NotNull
        public static final a d = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        public final int responseCmd;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        public final int code;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String desc;

        /* JADX INFO: renamed from: s9$b$a */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Ls9$b$a;", "", "", "responseCmd", "Ls9$b;", PluginDeviceInfo.FICONON, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Response a(int responseCmd) {
                return new Response(responseCmd, 1, "Invalid param");
            }

            @NotNull
            public final Response b(int responseCmd) {
                return new Response(responseCmd, 2, "Not support cmd");
            }

            @NotNull
            public final Response c(int responseCmd) {
                return new Response(responseCmd, 0, "Success");
            }
        }

        public Response(int i, int i2, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.responseCmd = i;
            this.code = i2;
            this.desc = desc;
        }

        public final boolean a() {
            return this.code == 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return this.responseCmd == response.responseCmd && this.code == response.code && Intrinsics.areEqual(this.desc, response.desc);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.responseCmd) * 31) + Integer.hashCode(this.code)) * 31) + this.desc.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(responseCmd=" + this.responseCmd + ", code=" + this.code + ", desc=" + this.desc + ')';
        }
    }

    public final <T> ol<T> a(ol<byte[]> originResponse) {
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            Failure failure = (Failure) originResponse;
            return new Failure(failure.getMsg(), failure.getCode());
        }
        if (originResponse instanceof fu) {
            return null;
        }
        return ol.a.a(ol.f29263a, "Unknown error", 0, 2, null);
    }

    @NotNull
    public final ol<Response> b(@NotNull ol<byte[]> originResponse) {
        Response responseC;
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        ol<Response> olVarA = a(originResponse);
        if (olVarA != null) {
            return olVarA;
        }
        try {
            Result.Companion companion = Result.Companion;
            byte[] bArr = (byte[]) ((fu) originResponse).a();
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            if (b3 == 0) {
                responseC = Response.d.c(b2);
            } else if (b3 == 1) {
                responseC = Response.d.a(b2);
            } else {
                if (b3 != 2) {
                    return new Failure("Unknown error: " + originResponse, 0, 2, null);
                }
                responseC = Response.d.b(b2);
            }
            return new fu(responseC);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                objM886constructorimpl = new Failure("decode response failed: " + thM889exceptionOrNullimpl, 0, 2, null);
            }
            return (ol) objM886constructorimpl;
        }
    }

    @NotNull
    public final ol<Boolean> c(@NotNull ol<byte[]> originResponse) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        ol<Boolean> olVarA = a(originResponse);
        if (olVarA != null) {
            return olVarA;
        }
        try {
            Result.Companion companion = Result.Companion;
            byte[] bArr = (byte[]) ((fu) originResponse).a();
            byte b2 = bArr[0];
            objM886constructorimpl = Result.m886constructorimpl(new fu(Boolean.valueOf(c3.a(bArr[1]))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            objM886constructorimpl = new Failure("decode switch failed: " + thM889exceptionOrNullimpl, 0, 2, null);
        }
        return (ol) objM886constructorimpl;
    }

    @NotNull
    public final ol<Integer> d(@NotNull ol<byte[]> originResponse) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        ol<Integer> olVarA = a(originResponse);
        if (olVarA != null) {
            return olVarA;
        }
        try {
            Result.Companion companion = Result.Companion;
            byte[] bArr = (byte[]) ((fu) originResponse).a();
            byte b2 = bArr[0];
            objM886constructorimpl = Result.m886constructorimpl(new fu(Integer.valueOf(bArr[1])));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            objM886constructorimpl = new Failure("decode version failed: " + thM889exceptionOrNullimpl, 0, 2, null);
        }
        return (ol) objM886constructorimpl;
    }

    @Nullable
    public final FallDownTrigger a(@NotNull byte[] byteArray) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(null, 0, 3, null);
            w2Var.a(byteArray);
            w2Var.c();
            objM886constructorimpl = Result.m886constructorimpl(new FallDownTrigger(w2Var.d(4), w2Var.g()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        return (FallDownTrigger) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }
}
