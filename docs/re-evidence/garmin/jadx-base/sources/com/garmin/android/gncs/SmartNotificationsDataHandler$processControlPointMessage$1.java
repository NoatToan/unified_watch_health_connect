package com.garmin.android.gncs;

import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.gncs.messages.GncsControlPointResponseMessage;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import java.io.ByteArrayOutputStream;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;
import rs2.y;
import ss2.n;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$processControlPointMessage$1", f = "SmartNotificationsDataHandler.kt", l = {394, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR}, m = "invokeSuspend")
public final class SmartNotificationsDataHandler$processControlPointMessage$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ byte[] $payload;
    final /* synthetic */ x $responder;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmartNotificationsDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler$processControlPointMessage$1(SmartNotificationsDataHandler smartNotificationsDataHandler, byte[] bArr, x xVar, t13.d<? super SmartNotificationsDataHandler$processControlPointMessage$1> dVar) {
        super(2, dVar);
        this.this$0 = smartNotificationsDataHandler;
        this.$payload = bArr;
        this.$responder = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new SmartNotificationsDataHandler$processControlPointMessage$1(this.this$0, this.$payload, this.$responder, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((SmartNotificationsDataHandler$processControlPointMessage$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[Catch: all -> 0x0011, TRY_ENTER, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000c, B:13:0x0023, B:41:0x00b9, B:43:0x00bd, B:49:0x00db, B:37:0x00a1, B:50:0x00f6, B:33:0x0081, B:46:0x00cd), top: B:56:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000c, B:13:0x0023, B:41:0x00b9, B:43:0x00bd, B:49:0x00db, B:37:0x00a1, B:50:0x00f6, B:33:0x0081, B:46:0x00cd), top: B:56:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000c, B:13:0x0023, B:41:0x00b9, B:43:0x00bd, B:49:0x00db, B:37:0x00a1, B:50:0x00f6, B:33:0x0081, B:46:0x00cd), top: B:56:0x0006, inners: #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r5.b(r10, r9) == r0) goto L52;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ANCSMessageBase.AncsError ancsError;
        byte[] bArr;
        ANCSMessageBase.AncsError ancsErrorValidateControlPointMessage;
        byte[] bArrB;
        x xVar;
        y yVar;
        byte[] byteArray;
        ANCSMessageBase.AncsError ancsError2;
        byte[] bArr2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                r.b(obj);
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    byte[] sessionKey = this.this$0.getDataSourceSender$gncs_gdi_release().mDelegate.getSessionKey();
                    bArrB = this.$payload;
                    if (sessionKey != null) {
                        try {
                            bArrB = n.b(bArrB, 0, bArrB.length, true, sessionKey);
                        } catch (Throwable th3) {
                            th = th3;
                            bArr = bArrB;
                            ancsError = null;
                            ih2.b.c(this.this$0.logTag + "failed to parse 'NotificationControlPointMessage'", th);
                            ancsErrorValidateControlPointMessage = ancsError;
                            bArrB = bArr;
                            xVar = this.$responder;
                            if (byteArrayOutputStream != null) {
                                yVar = y.ACK;
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                                this.L$0 = bArrB;
                                this.L$1 = ancsErrorValidateControlPointMessage;
                                this.label = 1;
                                if (xVar.a(yVar, byteArray, this) == aVar) {
                                    ancsError2 = ancsErrorValidateControlPointMessage;
                                    bArr2 = bArrB;
                                    if (ancsError2 == ANCSMessageBase.AncsError.NO_ERROR) {
                                        SmartNotificationsDataHandler.Callback callback = this.this$0.callback;
                                        bArr2.getClass();
                                        callback.onGncsMessageReceived(bArr2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                y yVar2 = y.LENGTH_ERROR;
                                this.label = 2;
                            }
                            return aVar;
                        }
                    }
                    SmartNotificationsDataHandler.Validator validator = this.this$0.validator;
                    bArrB.getClass();
                    ancsErrorValidateControlPointMessage = validator.validateControlPointMessage(bArrB);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        if (ancsErrorValidateControlPointMessage == ANCSMessageBase.AncsError.NO_ERROR) {
                            byteArrayOutputStream2.write(GncsControlPointResponseMessage.ResponseType.SUCCESSFUL.getValue());
                        } else {
                            byteArrayOutputStream2.write(GncsControlPointResponseMessage.ResponseType.ANCS_ERROR_OCCURRED.getValue());
                        }
                        byteArrayOutputStream2.write(ancsErrorValidateControlPointMessage.value);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Throwable th4) {
                        byte[] bArr3 = bArrB;
                        ancsError = ancsErrorValidateControlPointMessage;
                        th = th4;
                        bArr = bArr3;
                        ih2.b.c(this.this$0.logTag + "failed to parse 'NotificationControlPointMessage'", th);
                        ancsErrorValidateControlPointMessage = ancsError;
                        bArrB = bArr;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    ancsError = null;
                    bArr = null;
                }
                xVar = this.$responder;
                if (byteArrayOutputStream != null) {
                    yVar = y.ACK;
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    this.L$0 = bArrB;
                    this.L$1 = ancsErrorValidateControlPointMessage;
                    this.label = 1;
                    if (xVar.a(yVar, byteArray, this) == aVar) {
                        ancsError2 = ancsErrorValidateControlPointMessage;
                        bArr2 = bArrB;
                        if (ancsError2 == ANCSMessageBase.AncsError.NO_ERROR) {
                            SmartNotificationsDataHandler.Callback callback2 = this.this$0.callback;
                            bArr2.getClass();
                            callback2.onGncsMessageReceived(bArr2);
                        }
                    }
                } else {
                    y yVar3 = y.LENGTH_ERROR;
                    this.label = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                ancsError2 = (ANCSMessageBase.AncsError) this.L$1;
                bArr2 = (byte[]) this.L$0;
                r.b(obj);
                if (ancsError2 == ANCSMessageBase.AncsError.NO_ERROR && this.this$0.profile.getF92746j() != -1) {
                    try {
                        SmartNotificationsDataHandler.Callback callback3 = this.this$0.callback;
                        bArr2.getClass();
                        callback3.onGncsMessageReceived(bArr2);
                    } catch (Throwable th6) {
                        ih2.b.c(this.this$0.logTag + "processControlPointMessage callback failed", th6);
                    }
                }
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Throwable th7) {
            ih2.b.c(this.this$0.logTag + "failed to respond to 'NotificationControlPointMessage'", th7);
        }
        return Unit.INSTANCE;
    }
}
