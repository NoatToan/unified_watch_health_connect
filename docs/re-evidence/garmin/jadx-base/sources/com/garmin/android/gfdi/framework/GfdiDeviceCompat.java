package com.garmin.android.gfdi.framework;

import e23.p;
import java.io.InputStream;
import java.io.OutputStream;
import o13.r;
import o53.b0;
import o53.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.u;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/gfdi/framework/GfdiDeviceCompat;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Ljava/io/OutputStream;", "output", "", "connectionId", "Lrs2/u;", "hostConfig", "Lrs2/i$b;", "guidCheck", "Lk7/b;", "Lrs2/i;", "onSuccess", "", "onFailure", "", "open", "(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;Lrs2/u;Lrs2/i$b;Lk7/b;Lk7/b;)V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GfdiDeviceCompat {
    public static final GfdiDeviceCompat INSTANCE = new GfdiDeviceCompat();

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiDeviceCompat$open$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.GfdiDeviceCompat$open$1", f = "GfdiDeviceCompat.kt", l = {22}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ String $connectionId;
        final /* synthetic */ rs2.i.b $guidCheck;
        final /* synthetic */ u $hostConfig;
        final /* synthetic */ InputStream $input;
        final /* synthetic */ k7.b<Throwable> $onFailure;
        final /* synthetic */ k7.b<rs2.i> $onSuccess;
        final /* synthetic */ OutputStream $output;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InputStream inputStream, OutputStream outputStream, String str, u uVar, rs2.i.b bVar, k7.b<rs2.i> bVar2, k7.b<Throwable> bVar3, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$input = inputStream;
            this.$output = outputStream;
            this.$connectionId = str;
            this.$hostConfig = uVar;
            this.$guidCheck = bVar;
            this.$onSuccess = bVar2;
            this.$onFailure = bVar3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$input, this.$output, this.$connectionId, this.$hostConfig, this.$guidCheck, this.$onSuccess, this.$onFailure, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Throwable th3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                try {
                    rs2.i.a aVar2 = rs2.i.f154387h;
                    InputStream inputStream = this.$input;
                    OutputStream outputStream = this.$output;
                    String str = this.$connectionId;
                    u uVar = this.$hostConfig;
                    rs2.i.b bVar = this.$guidCheck;
                    this.label = 1;
                    rs2.e.f154382c.getClass();
                    anonymousClass1 = this;
                    try {
                        obj = aVar2.b(inputStream, outputStream, str, uVar, bVar, rs2.e.f154384e, anonymousClass1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = th;
                        anonymousClass1.$onFailure.accept(th3);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    anonymousClass1 = this;
                    th3 = th;
                    anonymousClass1.$onFailure.accept(th3);
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    r.b(obj);
                    anonymousClass1 = this;
                } catch (Throwable th6) {
                    th3 = th6;
                    anonymousClass1 = this;
                    anonymousClass1.$onFailure.accept(th3);
                }
            }
            anonymousClass1.$onSuccess.accept((rs2.i) obj);
            return Unit.INSTANCE;
        }
    }

    private GfdiDeviceCompat() {
    }

    public static /* synthetic */ void open$default(GfdiDeviceCompat gfdiDeviceCompat, InputStream inputStream, OutputStream outputStream, String str, u uVar, rs2.i.b bVar, k7.b bVar2, k7.b bVar3, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            bVar = rs2.i.b.NOTIFY_MISMATCH;
        }
        gfdiDeviceCompat.open(inputStream, outputStream, str, uVar, bVar, bVar2, bVar3);
    }

    public final void open(InputStream input, OutputStream output, String connectionId, u hostConfig, rs2.i.b guidCheck, k7.b<rs2.i> onSuccess, k7.b<Throwable> onFailure) {
        input.getClass();
        output.getClass();
        connectionId.getClass();
        hostConfig.getClass();
        guidCheck.getClass();
        onSuccess.getClass();
        onFailure.getClass();
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(input, output, connectionId, hostConfig, guidCheck, onSuccess, onFailure, null), 3);
    }
}
