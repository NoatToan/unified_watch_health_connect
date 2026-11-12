package com.garmin.android.music;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.Scopes;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.l1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import rs2.h;
import rs2.v;
import rs2.w;
import rs2.x;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010\"\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/garmin/android/music/MusicDataHandler;", "Lrs2/h;", "Lrs2/w;", "Lrs2/c;", Scopes.PROFILE, "<init>", "(Lrs2/c;)V", "deviceInfo", "Lrs2/v;", "messenger", "", TtmlNode.START, "(Lrs2/c;Lrs2/v;)V", "", "connectionId", "close", "(Ljava/lang/String;)V", "", "messageType", "", "payload", "Lrs2/x;", "responder", "onMessageReceived", "(I[BLrs2/x;)V", "Lo53/l1;", "onMusicControlCapabilitiesReceived$gncs_gdi_release", "([BLrs2/x;)Lo53/l1;", "onMusicControlCapabilitiesReceived", "onMusicControlMessageReceived$gncs_gdi_release", "onMusicControlMessageReceived", "", "Lcom/garmin/android/music/AMSEntityUpdate;", "entityUpdates", "sendMediaEntityUpdate", "(Ljava/util/List;)V", "Lrs2/c;", "Lrs2/v;", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "", "getConfiguration", "()Ljava/util/Set;", "configuration", "Companion", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MusicDataHandler implements h, w {
    public static final int MUSIC_CAPABILITIES_MESSAGE_ID = 5042;
    public static final int MUSIC_CONTROL_MESSAGE_ID = 5041;
    public static final int MUSIC_ENTITY_UPDATE_MESSAGE_ID = 5049;
    private final b0 coroutineScope;
    private v messenger;
    private final rs2.c profile;

    /* JADX INFO: renamed from: com.garmin.android.music.MusicDataHandler$sendMediaEntityUpdate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.garmin.android.music.MusicDataHandler$sendMediaEntityUpdate$2", f = "MusicDataHandler.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ ByteArrayOutputStream $msg;
        Object L$0;
        int label;
        final /* synthetic */ MusicDataHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteArrayOutputStream byteArrayOutputStream, MusicDataHandler musicDataHandler, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$msg = byteArrayOutputStream;
            this.this$0 = musicDataHandler;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$msg, this.this$0, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            byte[] bArr;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    byte[] byteArray = this.$msg.toByteArray();
                    v vVar = this.this$0.messenger;
                    if (vVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    byteArray.getClass();
                    this.L$0 = byteArray;
                    this.label = 1;
                    if (vVar.b(MusicDataHandler.MUSIC_ENTITY_UPDATE_MESSAGE_ID, byteArray, this) == aVar) {
                        return aVar;
                    }
                    bArr = byteArray;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bArr = (byte[]) this.L$0;
                    r.b(obj);
                }
                ih2.b.b("MusicDataHandler.sendMediaEntityUpdate -> sent entity update(s), size: " + bArr.length + " byte(s), payload: " + SmartNotificationsUtil.obfuscatePayloadIfNeeded(bArr));
            } catch (Throwable th3) {
                ih2.b.c("MusicDataHandler.sendMediaEntityUpdate", th3);
            }
            return Unit.INSTANCE;
        }
    }

    public MusicDataHandler(rs2.c cVar) {
        cVar.getClass();
        this.profile = cVar;
        this.coroutineScope = zl.a.e("MusicDataHandler", s0.f129406a.plus(ge1.b.h()));
    }

    @Override // rs2.h
    public void close(String connectionId) {
        connectionId.getClass();
        c0.d(this.coroutineScope, "MusicDataHandler closed");
    }

    @Override // rs2.h
    public Set<Integer> getConfiguration() {
        return u.m0(new Integer[]{7, 52});
    }

    @Override // rs2.w
    public void onMessageReceived(int messageType, byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        if (messageType == 5041) {
            onMusicControlMessageReceived$gncs_gdi_release(payload, responder);
        } else {
            if (messageType != 5042) {
                return;
            }
            onMusicControlCapabilitiesReceived$gncs_gdi_release(payload, responder);
        }
    }

    public final l1 onMusicControlCapabilitiesReceived$gncs_gdi_release(byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        return ge1.b.T(this.coroutineScope, null, null, new MusicDataHandler$onMusicControlCapabilitiesReceived$1(payload, responder, this, null), 3);
    }

    public final l1 onMusicControlMessageReceived$gncs_gdi_release(byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        return ge1.b.T(this.coroutineScope, null, null, new MusicDataHandler$onMusicControlMessageReceived$1(payload, responder, null), 3);
    }

    public final void sendMediaEntityUpdate(List<? extends AMSEntityUpdate> entityUpdates) throws IOException {
        entityUpdates.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<T> it = entityUpdates.iterator();
        while (it.hasNext()) {
            byte[] message = ((AMSEntityUpdate) it.next()).toMessage();
            message.getClass();
            byteArrayOutputStream.write(message.length);
            byteArrayOutputStream.write(message);
        }
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass2(byteArrayOutputStream, this, null), 3);
    }

    @Override // rs2.h
    public void start(rs2.c deviceInfo, v messenger) {
        deviceInfo.getClass();
        messenger.getClass();
        this.messenger = messenger;
        messenger.d(MUSIC_CAPABILITIES_MESSAGE_ID, this);
        messenger.d(MUSIC_CONTROL_MESSAGE_ID, this);
    }
}
