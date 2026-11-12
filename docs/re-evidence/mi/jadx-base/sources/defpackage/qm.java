package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lqm;", "Li7t;", "", "doWork", "()V", "", "ex", PluginDeviceInfo.FMODEL, "(Ljava/lang/Throwable;)V", "Lk7;", "dfuApi", "Lxd;", "info", "Lyh;", "callback", "<init>", "(Lk7;Lxd;Lyh;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class qm extends i7t {

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public final k7 t;

    @NotNull
    public final xd u;

    @NotNull
    public final yh v;

    @Nullable
    public zat w;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lqm$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public qm(@NotNull k7 dfuApi, @NotNull xd info, @NotNull yh callback) {
        Intrinsics.checkNotNullParameter(dfuApi, "dfuApi");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.t = dfuApi;
        this.u = info;
        this.v = callback;
        if (callback instanceof zat) {
            this.w = (zat) callback;
        }
    }

    public final void a(Throwable ex) {
        if (ex == null) {
            t5t.d("NewDfuTask", "Throwable is null!!!");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        for (Throwable cause = ex.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append((Object) stringBuffer);
        t5t.d("NewDfuTask", sb.toString());
    }

    @Override // defpackage.i7t
    public void doWork() {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            this.t.c(true);
            this.v.a(0);
            if (this.t.b()) {
                DfuProtocolInfo dfuProtocolInfoJ = this.t.j();
                t5t.d("NewDfuTask", dfuProtocolInfoJ.toString());
                zat zatVar = this.w;
                if (zatVar != null) {
                    zatVar.a(dfuProtocolInfoJ.toString());
                }
                Boolean boolA = n7.f27610a.a(dfuProtocolInfoJ.getVersion()).a(this.t, dfuProtocolInfoJ, this.u, this.v);
                zat zatVar2 = this.w;
                if (zatVar2 != null) {
                    zatVar2.a("Upgrade result: " + boolA);
                }
                t5t.d("NewDfuTask", "Upgrade result:" + boolA);
                if (boolA != null) {
                    this.v.onFwStop(boolA.booleanValue());
                }
            } else {
                t5t.d("NewDfuTask", "Init dfu api failed");
                zat zatVar3 = this.w;
                if (zatVar3 != null) {
                    zatVar3.a("Init dfu api failed");
                }
                this.v.onFwStop(false);
            }
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            a(thM889exceptionOrNullimpl);
            this.v.onFwStop(false);
            zat zatVar4 = this.w;
            if (zatVar4 != null) {
                zatVar4.a("upgrade failure with error " + thM889exceptionOrNullimpl.getMessage());
            }
            if (thM889exceptionOrNullimpl instanceof FileNotFoundException) {
                this.v.onError(bm.FILE_NOT_FOUND.getT());
            } else {
                this.v.onError(bm.UNKNOW.getT());
            }
        }
        t5t.d("NewDfuTask", "DeInit");
        zat zatVar5 = this.w;
        if (zatVar5 != null) {
            zatVar5.a("destruction .....");
        }
        this.t.deInit();
        this.t.c(false);
    }
}
