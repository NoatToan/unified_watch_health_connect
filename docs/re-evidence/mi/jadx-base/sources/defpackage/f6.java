package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lf6;", "", "", "toString", "", "dataSize", "I", PluginDeviceInfo.FMODEL, "()I", "timeUsage", PluginDeviceInfo.FICONON, "", "dataTransferRate$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FDESC, "()F", "dataTransferRate", "type", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17450b;
    public final int c;

    @NotNull
    public final Lazy d = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() throws Exception {
            if (f6.this.getF17450b() != 0 && f6.this.getC() == 0) {
                throw new Exception("传输耗时时间是0，可能是传输的太快");
            }
            return Float.valueOf(f6.this.getF17450b() / (f6.this.getC() * 1.024f));
        }
    }

    public f6(int i, int i2, int i3) {
        this.f17449a = i;
        this.f17450b = i2;
        this.c = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF17450b() {
        return this.f17450b;
    }

    public final float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @NotNull
    public String toString() {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl("DataTransferRate{type=" + this.f17449a + ",size=" + this.f17450b + ",time=" + this.c + ",rate=" + b() + "KB/s}");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = "DataTransferRate{type=" + this.f17449a + ",size=" + this.f17450b + ",time=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
        return (String) objM886constructorimpl;
    }
}
