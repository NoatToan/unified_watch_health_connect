package com.garmin.android.music;

import com.google.maps.android.BuildConfig;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import rs2.x;
import rs2.y;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.android.music.MusicDataHandler$onMusicControlMessageReceived$1", f = "MusicDataHandler.kt", l = {119, 122}, m = "invokeSuspend")
public final class MusicDataHandler$onMusicControlMessageReceived$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ byte[] $payload;
    final /* synthetic */ x $responder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicDataHandler$onMusicControlMessageReceived$1(byte[] bArr, x xVar, d<? super MusicDataHandler$onMusicControlMessageReceived$1> dVar) {
        super(2, dVar);
        this.$payload = bArr;
        this.$responder = xVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MusicDataHandler$onMusicControlMessageReceived$1(this.$payload, this.$responder, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MusicDataHandler$onMusicControlMessageReceived$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r0.b(r6, r5) == r1) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                r.b(obj);
                Object objF = u.F(this.$payload);
                if (objF == null) {
                    objF = BuildConfig.TRAVIS;
                }
                ih2.b.b("MusicDataHandler.onMusicControlMessageReceived -> command: " + objF);
                int length = this.$payload.length;
                x xVar = this.$responder;
                if (length == 0) {
                    y yVar = y.LENGTH_ERROR;
                    this.label = 1;
                    if (xVar.b(yVar, this) == aVar) {
                    }
                    return Unit.INSTANCE;
                }
                y yVar2 = y.ACK;
                this.label = 2;
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            MusicManager.getInstance().onMusicControlCommandReceived(MusicControlCommand.fromId(this.$payload[0]));
        } catch (Throwable th3) {
            ih2.b.c("MusicDataHandler.onMusicControlMessageReceived", th3);
        }
        return Unit.INSTANCE;
    }
}
