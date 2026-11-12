package com.huami.bluetooth.profile.channel.module.schedule.action;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataCreator;", "", Constant.h, "", "data", "", GoogleApiAvailabilityLight.a, "", "result", "b", "c", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "onSend", "onFinishSend", "onReceive", "", "a", "Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptorPrinter", "", "Lkotlin/Lazy;", "()Ljava/util/List;", "outInterceptors", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SimpleParseInterceptor implements IDataCreator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDataInterceptor interceptorPrinter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy outInterceptors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("notifyOuterOnFinishSend failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("notifyOuterOnReceive failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("notifyOuterOnSend failed: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onFinish send empty data, result: ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onReceive empty data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send empty data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<List<IDataInterceptor>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<IDataInterceptor> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "register interceptor";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "unregister interceptor";
        }
    }

    public SimpleParseInterceptor(@NotNull String str, @NotNull IDataInterceptor iDataInterceptor) {
        this.tag = str;
        this.interceptorPrinter = iDataInterceptor;
        this.outInterceptors = LazyKt__LazyJVMKt.lazy(g.a);
    }

    private final List<IDataInterceptor> a() {
        return (List) this.outInterceptors.getValue();
    }

    private final void b(byte cmd, boolean result) {
        try {
            Iterator<T> it2 = a().iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onFinishSend(cmd, result);
            }
        } catch (Exception e2) {
            HMLog.info(this.tag, new a(e2));
        }
    }

    private final void c(byte cmd, byte[] data) {
        try {
            Iterator<T> it2 = a().iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onReceive(cmd, data);
            }
        } catch (Exception e2) {
            HMLog.info(this.tag, new b(e2));
        }
    }

    private final void d(byte cmd, byte[] data) {
        try {
            Iterator<T> it2 = a().iterator();
            while (it2.hasNext()) {
                ((IDataInterceptor) it2.next()).onSend(cmd, data);
            }
        } catch (Exception e2) {
            HMLog.info(this.tag, new c(e2));
        }
    }

    public final void onFinishSend(@NotNull byte[] data, boolean result) {
        if (data.length == 0) {
            HMLog.info(this.tag, new d(result));
            return;
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        this.interceptorPrinter.onFinishSend(bFirst, result);
        b(bFirst, result);
    }

    public final void onReceive(@NotNull byte[] data) {
        if (data.length == 0) {
            HMLog.info(this.tag, e.a);
            return;
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        this.interceptorPrinter.onReceive(bFirst, data);
        c(bFirst, data);
    }

    public final void onSend(@NotNull byte[] data) {
        if (data.length == 0) {
            HMLog.info(this.tag, f.a);
            return;
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        this.interceptorPrinter.onSend(bFirst, data);
        d(bFirst, data);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        if (a().contains(this.interceptorPrinter)) {
            return;
        }
        HMLog.info(this.tag, h.a);
        a().add(interceptor);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        HMLog.info(this.tag, i.a);
        a().remove(interceptor);
    }

    public /* synthetic */ SimpleParseInterceptor(String str, IDataInterceptor iDataInterceptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? new DefaultInterceptor(str) : iDataInterceptor);
    }
}
