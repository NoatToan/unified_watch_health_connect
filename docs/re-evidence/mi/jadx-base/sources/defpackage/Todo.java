package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uu, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"BQ\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010#\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006'"}, d2 = {"Luu;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "id", "J", PluginDeviceInfo.FICONOFFLINE, "()J", MiuiCursorConstants.CONTENT, "Ljava/lang/String;", PluginDeviceInfo.FDESC, "()Ljava/lang/String;", "Luu$a;", "source", "Luu$a;", PluginDeviceInfo.FLOCALIZATIONS, "()Luu$a;", DialWidgetType.DATE, "Ljava/lang/Long;", PluginDeviceInfo.FICONON, "()Ljava/lang/Long;", "time", "h", "repeat", "I", PluginDeviceInfo.FBLUETOOTHPAIR, "()I", "completeTime", PluginDeviceInfo.FMODEL, "firstRemind", PluginDeviceInfo.FICONOFF, "<init>", "(JLjava/lang/String;Luu$a;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Todo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String content;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final a source;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Long date;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Long time;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int repeat;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final Long completeTime;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final Long firstRemind;

    /* JADX INFO: renamed from: uu$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Luu$a;", "", "<init>", "()V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, "Luu$a$a;", "Luu$a$b;", "Luu$a$c;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a {

        /* JADX INFO: renamed from: uu$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu$a$a;", "Luu$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class C1120a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1120a f36133a = new C1120a();

            public C1120a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: uu$a$b */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu$a$b;", "Luu$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f36134a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: uu$a$c */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu$a$c;", "Luu$a;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f36135a = new c();

            public c() {
                super(null);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Todo(long j, @NotNull String content, @NotNull a source, @Nullable Long l, @Nullable Long l2, int i, @Nullable Long l3, @Nullable Long l4) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = j;
        this.content = content;
        this.source = source;
        this.date = l;
        this.time = l2;
        this.repeat = i;
        this.completeTime = l3;
        this.firstRemind = l4;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCompleteTime() {
        return this.completeTime;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFirstRemind() {
        return this.firstRemind;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Todo)) {
            return false;
        }
        Todo todo = (Todo) other;
        return this.id == todo.id && Intrinsics.areEqual(this.content, todo.content) && Intrinsics.areEqual(this.source, todo.source) && Intrinsics.areEqual(this.date, todo.date) && Intrinsics.areEqual(this.time, todo.time) && this.repeat == todo.repeat && Intrinsics.areEqual(this.completeTime, todo.completeTime) && Intrinsics.areEqual(this.firstRemind, todo.firstRemind);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + this.content.hashCode()) * 31) + this.source.hashCode()) * 31;
        Long l = this.date;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.time;
        int iHashCode3 = (((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.repeat)) * 31;
        Long l3 = this.completeTime;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.firstRemind;
        return iHashCode4 + (l4 != null ? l4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Todo(id=" + this.id + ", content=" + this.content + ", source=" + this.source + ", date=" + this.date + ", time=" + this.time + ", repeat=" + this.repeat + ", completeTime=" + this.completeTime + ", firstRemind=" + this.firstRemind + ')';
    }
}
