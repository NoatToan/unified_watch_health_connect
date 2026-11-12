package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B#\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019¨\u0006 "}, d2 = {"Lbc;", "Lf1;", "Ljava/io/File;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/io/File;)Ljava/util/Calendar;", "Lkotlin/Function1;", "Lmb;", "getErrorCodeTrans", "Lkotlin/jvm/functions/Function1;", PluginDeviceInfo.FICONOFF, "()Lkotlin/jvm/functions/Function1;", "", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "()Z", "setLoop", "(Z)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "file", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;Ljava/io/File;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bc extends f1<File> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f4040k = new a(null);
    public static boolean l;

    @Nullable
    public final Function1<mb, mb> h;
    public boolean i;

    @NotNull
    public final bi<File> j;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lbc$a;", "", "", "DEBUG_MODE", "Z", PluginDeviceInfo.FMODEL, "()Z", "setDEBUG_MODE", "(Z)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return bc.l;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmb;", "code", PluginDeviceInfo.FMODEL, "(Lmb;)Lmb;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<mb, mb> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mb invoke2(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            if (!bc.f4040k.a()) {
                return code;
            }
            if (code == mb.SUCCESS) {
                code = null;
            }
            return code == null ? mb.CANCEL : code;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(@NotNull Calendar startTime, @NotNull File file, int i) {
        super(startTime, 7, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(file, "file");
        this.h = b.t;
        this.j = new z9(file);
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @NotNull File data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // defpackage.f1
    @Nullable
    public Function1<mb, mb> d() {
        return this.h;
    }

    @Override // defpackage.f1
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getI() {
        return this.i;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<File> a() {
        return this.j;
    }
}
