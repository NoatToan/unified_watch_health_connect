package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import e23.p;
import o13.r;
import o53.b0;
import o53.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/DataTransferCompat;", "", "<init>", "()V", "", "deviceId", "Lzj2/e;", "dataTransfer", "", "transferId", "size", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/DataTransferCallback;", "callback", "", "receive", "(JLzj2/e;IILcom/garmin/android/apps/connectmobile/gfdi/protobuf/DataTransferCallback;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DataTransferCompat {
    public static final int $stable = 0;
    public static final DataTransferCompat INSTANCE = new DataTransferCompat();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCompat$receive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCompat$receive$1", f = "DataTransferCompat.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ DataTransferCallback $callback;
        final /* synthetic */ zj2.e $dataTransfer;
        final /* synthetic */ long $deviceId;
        final /* synthetic */ int $size;
        final /* synthetic */ int $transferId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zj2.e eVar, int i14, int i15, DataTransferCallback dataTransferCallback, long j8, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$dataTransfer = eVar;
            this.$transferId = i14;
            this.$size = i15;
            this.$callback = dataTransferCallback;
            this.$deviceId = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DataTransferCallback dataTransferCallback, long j8, int i14, int i15) {
            dataTransferCallback.onDataTransferProgress(j8, (i14 * 100) / i15);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$dataTransfer, this.$transferId, this.$size, this.$callback, this.$deviceId, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnonymousClass1 anonymousClass1;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    zj2.e eVar = this.$dataTransfer;
                    int i15 = this.$transferId;
                    int i16 = this.$size;
                    final DataTransferCallback dataTransferCallback = this.$callback;
                    final long j8 = this.$deviceId;
                    p pVar = new p() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.a
                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return DataTransferCompat.AnonymousClass1.invokeSuspend$lambda$0(dataTransferCallback, j8, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    };
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        obj = eVar.c(i15, i16, pVar, null, anonymousClass1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Exception unused) {
                        anonymousClass1.$callback.onDataTransferFailed(anonymousClass1.$deviceId);
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    anonymousClass1 = this;
                }
                anonymousClass1.$callback.onDataTransferComplete(anonymousClass1.$deviceId, (byte[]) obj);
            } catch (Exception unused2) {
                anonymousClass1 = this;
            }
            return Unit.INSTANCE;
        }
    }

    private DataTransferCompat() {
    }

    public static final void receive(long deviceId, zj2.e dataTransfer, int transferId, int size, DataTransferCallback callback) {
        dataTransfer.getClass();
        callback.getClass();
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(dataTransfer, transferId, size, callback, deviceId, null), 3);
    }
}
