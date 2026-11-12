package com.huami.bluetooth.profile.channel.module.todo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u00019BQ\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJh\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\tR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\tR\u0019\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\tR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\t¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "", "", "component1", "", "component2", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "component3", "component4", "()Ljava/lang/Long;", "component5", "", "component6", "component7", "component8", "id", "content", "source", "date", "time", "repeat", "completeTime", "firstRemind", "copy", "(JLjava/lang/String;Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;)Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "c", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "getSource", "()Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getDate", "e", "getTime", "f", LogUtil.I, "getRepeat", "()I", "g", "getCompleteTime", "h", "getFirstRemind", "<init>", "(JLjava/lang/String;Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;)V", "Source", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Todo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Source source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long date;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int repeat;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long completeTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long firstRemind;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "", "<init>", "()V", "Alexa", "Default", "XiaoAi", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$Default;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$XiaoAi;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$Alexa;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Source {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$Alexa;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Alexa extends Source {

            @NotNull
            public static final Alexa INSTANCE = new Alexa();

            private Alexa() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$Default;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Default extends Source {

            @NotNull
            public static final Default INSTANCE = new Default();

            private Default() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source$XiaoAi;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class XiaoAi extends Source {

            @NotNull
            public static final XiaoAi INSTANCE = new XiaoAi();

            private XiaoAi() {
                super(null);
            }
        }

        private Source() {
        }

        public /* synthetic */ Source(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Todo(long j, @NotNull String str, @NotNull Source source, @Nullable Long l, @Nullable Long l2, int i, @Nullable Long l3, @Nullable Long l4) {
        this.id = j;
        this.content = str;
        this.source = source;
        this.date = l;
        this.time = l2;
        this.repeat = i;
        this.completeTime = l3;
        this.firstRemind = l4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCompleteTime() {
        return this.completeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getFirstRemind() {
        return this.firstRemind;
    }

    @NotNull
    public final Todo copy(long id, @NotNull String content, @NotNull Source source, @Nullable Long date, @Nullable Long time, int repeat, @Nullable Long completeTime, @Nullable Long firstRemind) {
        return new Todo(id, content, source, date, time, repeat, completeTime, firstRemind);
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

    @Nullable
    public final Long getCompleteTime() {
        return this.completeTime;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    public final Long getFirstRemind() {
        return this.firstRemind;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iA = ((((b.a(this.id) * 31) + this.content.hashCode()) * 31) + this.source.hashCode()) * 31;
        Long l = this.date;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.time;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.repeat) * 31;
        Long l3 = this.completeTime;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.firstRemind;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Todo(id=" + this.id + ", content=" + this.content + ", source=" + this.source + ", date=" + this.date + ", time=" + this.time + ", repeat=" + this.repeat + ", completeTime=" + this.completeTime + ", firstRemind=" + this.firstRemind + ')';
    }

    public /* synthetic */ Todo(long j, String str, Source source, Long l, Long l2, int i, Long l3, Long l4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, source, l, l2, i, l3, (i2 & 128) != 0 ? null : l4);
    }
}
