package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u000bJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0006\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ?\u0010\u0006\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015H\u0002¢\u0006\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0014X\u0094D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lgl;", "Lc1;", "Lhl;", "Ljts;", "", "rawData", PluginDeviceInfo.FMODEL, "([B)Lhl;", "cmd", "data", "", "(Lhl;[B)V", "", "Lel;", "cards", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "(Ljava/util/List;)Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", PluginDeviceInfo.FDESC, "", "T", "Lu4;", "codec", "(Lhl;[BLu4;)V", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Lhw;", "versionCodec$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONOFFLINE, "()Lhw;", "versionCodec", "Lil;", "memberCardsCodec$delegate", PluginDeviceInfo.FICONOFF, "()Lil;", "memberCardsCodec", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gl extends c1<hl> implements jts {

    @NotNull
    public final String t;

    @NotNull
    public final Lazy u;

    @NotNull
    public final Lazy v;

    @Nullable
    public Function0<? extends List<MemberCard>> w;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lil;", PluginDeviceInfo.FMODEL, "()Lil;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<il> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final il invoke() {
            return new il();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhw;", PluginDeviceInfo.FMODEL, "()Lhw;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<hw> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hw invoke() {
            return new hw();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = "MemberCardApiImpl";
        this.u = LazyKt__LazyJVMKt.lazy(b.t);
        this.v = LazyKt__LazyJVMKt.lazy(a.t);
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hl parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return hl.f20179a.a(rawData);
    }

    public final void b(hl cmd, byte[] data) {
        int iA = c3.a(data, 1, 0, 2, null);
        if (iA != 1) {
            c1.dispatchError$default(this, cmd, iA, null, 4, null);
        } else {
            dispatchResponse(cmd, Boolean.TRUE);
        }
    }

    public final il d() {
        return (il) this.v.getValue();
    }

    public final hw e() {
        return (hw) this.u.getValue();
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public String getT() {
        return this.t;
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleCommand(@NotNull hl cmd, @NotNull byte[] data) {
        List<MemberCard> listInvoke;
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(cmd, hl.n.f20192b)) {
            a(hl.m.f20191b, data, e());
            return;
        }
        if (Intrinsics.areEqual(cmd, hl.l.f20190b)) {
            a(hl.k.f20189b, data, d());
            return;
        }
        if (Intrinsics.areEqual(cmd, hl.b.f20181b)) {
            b(hl.a.f20180b, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hl.e.f20183b)) {
            b(hl.d.f20182b, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hl.h.f20186b)) {
            b(hl.g.f20185b, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hl.j.f20188b)) {
            b(hl.i.f20187b, data);
            return;
        }
        if (!Intrinsics.areEqual(cmd, hl.f.f20184b)) {
            throw new RuntimeException("Invalid device command！");
        }
        Function0<? extends List<MemberCard>> function0 = this.w;
        if (function0 == null || (listInvoke = function0.invoke()) == null) {
            return;
        }
        a(listInvoke);
    }

    @NotNull
    public Response<Boolean> a(@NotNull List<MemberCard> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        hl.g gVar = hl.g.f20185b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf((byte) cards.size()));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.addAll(ArraysKt___ArraysKt.toList(((MemberCard) it.next()).getY()));
        }
        Unit unit = Unit.INSTANCE;
        return c1.sendRequest$default(this, gVar, CollectionsKt___CollectionsKt.toByteArray(arrayList), 0L, 4, null);
    }

    public final <T> void a(hl cmd, byte[] data, u4<? extends T, byte[]> codec) {
        int iA = c3.a(data, 1, 0, 2, null);
        if (iA == 1) {
            dispatchResponse(cmd, codec.decode(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length)));
        } else {
            c1.dispatchError$default(this, cmd, iA, null, 4, null);
        }
    }
}
