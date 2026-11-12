package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lqs;", "", "", "type", "I", PluginDeviceInfo.FMODEL, "()I", "", "desc", "<init>", "(ILjava/lang/String;)V", PluginDeviceInfo.FDESC, "Lqs$a;", "Lqs$b;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f31788b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs$a;", "Lqs;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends qs {

        @NotNull
        public static final a c = new a();

        public a() {
            super(1, "睡着", null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs$b;", "Lqs;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends qs {

        @NotNull
        public static final b c = new b();

        public b() {
            super(0, "醒来", null);
        }
    }

    public /* synthetic */ qs(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF31787a() {
        return this.f31787a;
    }

    public qs(int i, String str) {
        this.f31787a = i;
        this.f31788b = str;
    }
}
