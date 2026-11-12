package com.garmin.android.music;

import com.google.common.base.Ascii;
import com.google.maps.android.BuildConfig;
import e23.p;
import java.io.ByteArrayOutputStream;
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
@e(c = "com.garmin.android.music.MusicDataHandler$onMusicControlCapabilitiesReceived$1", f = "MusicDataHandler.kt", l = {98}, m = "invokeSuspend")
public final class MusicDataHandler$onMusicControlCapabilitiesReceived$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ byte[] $payload;
    final /* synthetic */ x $responder;
    int I$0;
    int label;
    final /* synthetic */ MusicDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicDataHandler$onMusicControlCapabilitiesReceived$1(byte[] bArr, x xVar, MusicDataHandler musicDataHandler, d<? super MusicDataHandler$onMusicControlCapabilitiesReceived$1> dVar) {
        super(2, dVar);
        this.$payload = bArr;
        this.$responder = xVar;
        this.this$0 = musicDataHandler;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MusicDataHandler$onMusicControlCapabilitiesReceived$1(this.$payload, this.$responder, this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MusicDataHandler$onMusicControlCapabilitiesReceived$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                Object objF = u.F(this.$payload);
                if (objF == null) {
                    objF = BuildConfig.TRAVIS;
                }
                ih2.b.b("MusicDataHandler.onMusicControlCapabilitiesReceived -> capability flags: " + objF);
                byte[] bArr = this.$payload;
                i14 = bArr.length == 0 ? Ascii.DEL : bArr[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = {MusicControlCommand.TOGGLE_PLAY_PAUSE.f50583id, MusicControlCommand.SKIP_TO_NEXT_ITEM.f50583id, MusicControlCommand.SKIP_TO_PREVIOUS_ITEM.f50583id, MusicControlCommand.VOLUME_UP.f50583id, MusicControlCommand.VOLUME_DOWN.f50583id};
                byteArrayOutputStream.write(5);
                byteArrayOutputStream.write(bArr2);
                x xVar = this.$responder;
                y yVar = y.ACK;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                this.I$0 = i14;
                this.label = 1;
                if (xVar.a(yVar, byteArray, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.I$0;
                r.b(obj);
            }
            String f92741e = this.this$0.profile.getF92741e();
            String str = f92741e.length() > 0 ? f92741e : null;
            if (str == null) {
                return Unit.INSTANCE;
            }
            if (i14 != 0) {
                MusicManager.getInstance().subscribe(str, (byte) i14, new GfdiMusicControlTransport(this.this$0));
            } else {
                MusicManager.getInstance().unsubscribe(str);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            ih2.b.c("MusicDataHandler.onMusicControlCapabilitiesReceived", th3);
        }
    }
}
