package com.huami.musiccontrol.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.tencent.open.SocialConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J(\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR!\u0010#\u001a\u00060\u001fR\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010'¨\u0006-"}, d2 = {"Lcom/huami/musiccontrol/controller/VolumeController;", "Lcom/huami/musiccontrol/controller/IVolumeController;", "", "e", "", "isUp", "b", "", "max", "c", "Landroid/media/AudioManager;", "manager", "targetVolume", "maxVolume", "tag", "f", "a", "userVolume", "g", PointCategory.INIT, "deInit", "volumeUp", "volumeDown", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "getCurrentVolume", "Lcom/huami/musiccontrol/controller/IVolumeController$IVolumeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setVolumeListener", "Landroid/media/AudioManager;", "audioManager", "Lcom/huami/musiccontrol/controller/IVolumeController$IVolumeListener;", "Lcom/huami/musiccontrol/controller/VolumeController$VolumeReceiver;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/musiccontrol/controller/VolumeController$VolumeReceiver;", SocialConstants.PARAM_RECEIVER, "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Z", "hasInit", "<init>", "()V", "Companion", "VolumeReceiver", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class VolumeController implements IVolumeController {
    private static final String f = "MusicCtrl_VolumeController";
    private static final String g = "android.media.VOLUME_CHANGED_ACTION";
    private static final int h = 100;
    private static final int i = -1;
    private static final int j = 30;
    private static final int k = 15;
    private static final int l = 1;
    private static final int m = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AudioManager audioManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private IVolumeController.IVolumeListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy receiver = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean hasInit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/musiccontrol/controller/VolumeController$VolumeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "a", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "getVolumeInfo", "()Lcom/huami/musiccontrol/bean/VolumeInfo;", "setVolumeInfo", "(Lcom/huami/musiccontrol/bean/VolumeInfo;)V", "volumeInfo", "<init>", "(Lcom/huami/musiccontrol/controller/VolumeController;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class VolumeReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private VolumeInfo volumeInfo;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ VolumeInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VolumeInfo volumeInfo) {
                super(0);
                this.b = volumeInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "volume changed pre: " + VolumeReceiver.this.getVolumeInfo() + "; current: " + this.b;
            }
        }

        public VolumeReceiver() {
        }

        @Nullable
        public final VolumeInfo getVolumeInfo() {
            return this.volumeInfo;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (!Intrinsics.areEqual(VolumeController.g, intent != null ? intent.getAction() : null)) {
                return;
            }
            VolumeInfo currentVolume = VolumeController.this.getCurrentVolume();
            if (!Intrinsics.areEqual(currentVolume, this.volumeInfo)) {
                HMLog.info(VolumeController.f, new a(currentVolume));
                this.volumeInfo = currentVolume;
                IVolumeController.IVolumeListener iVolumeListener = VolumeController.this.listener;
                if (iVolumeListener != null) {
                    iVolumeListener.onVolumeChanged(currentVolume);
                }
            }
        }

        public final void setVolumeInfo(@Nullable VolumeInfo volumeInfo) {
            this.volumeInfo = volumeInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "change volume failed as manager is null; isUp: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "change volume; is up: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, int i3, boolean z) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "no need change volume as userVolume is: " + this.a + "; maxVolume is: " + this.b + "; targetVolume is: " + this.c + "; isUp: " + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deInit finish as audio manager is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deInit failed as context is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deInit finish";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getCurrentVolume audioManager is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init failed as context is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init failed as manager is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/musiccontrol/controller/VolumeController$VolumeReceiver;", "Lcom/huami/musiccontrol/controller/VolumeController;", "a", "()Lcom/huami/musiccontrol/controller/VolumeController$VolumeReceiver;"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<VolumeReceiver> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VolumeReceiver invoke() {
            return VolumeController.this.new VolumeReceiver();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set volume failed; try another flag FLAG_PLAY_SOUND";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set volume failed; try another flag FLAG_SHOW_UI";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set volume failed; try to adjust volume flag 0";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set volume failed; try to adjust volume flag AudioManager.FLAG_PLAY_SOUND";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Ref.IntRef d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i, int i2, int i3, Ref.IntRef intRef, boolean z) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = intRef;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "change volume finish; targetVolume: " + this.a + "; userVolume: " + this.b + "; maxVolume: " + this.c + "; changedUserVolume: " + this.d.element + "; And is fixed volume: " + this.e;
        }
    }

    private final int a(AudioManager manager, boolean isUp, int tag) {
        manager.adjustVolume(isUp ? 1 : -1, tag);
        return manager.getStreamVolume(3);
    }

    private final boolean b(boolean isUp) {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            HMLog.info(f, new a(isUp));
            return false;
        }
        HMLog.info(f, new b(isUp));
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int iC = c(streamMaxVolume);
        int i2 = isUp ? iC + streamVolume : streamVolume - iC;
        if ((streamMaxVolume <= streamVolume && isUp) || (streamVolume <= 0 && !isUp)) {
            HMLog.info(f, new c(streamVolume, streamMaxVolume, i2, isUp));
        } else if (g(audioManager, i2, streamMaxVolume, streamVolume) == streamVolume) {
            return false;
        }
        return true;
    }

    private final int c(int max) {
        if (max > 30) {
            return (int) Math.ceil(max / 15);
        }
        return 1;
    }

    private final VolumeReceiver d() {
        return (VolumeReceiver) this.receiver.getValue();
    }

    private final void e() {
        Intent intent = new Intent();
        intent.setAction(g);
        d().onReceive(null, intent);
    }

    private final int f(AudioManager manager, int targetVolume, int maxVolume, int tag) {
        manager.setStreamVolume(3, Math.min(maxVolume, Math.max(0, targetVolume)), tag);
        return manager.getStreamVolume(3);
    }

    private final int g(AudioManager manager, int targetVolume, int maxVolume, int userVolume) {
        Ref.IntRef intRef = new Ref.IntRef();
        int iF = f(manager, targetVolume, maxVolume, 0);
        intRef.element = iF;
        if (iF == userVolume) {
            HMLog.info(f, k.a);
            intRef.element = f(manager, targetVolume, maxVolume, 4);
        }
        if (intRef.element == userVolume) {
            HMLog.info(f, l.a);
            intRef.element = f(manager, targetVolume, maxVolume, 1);
        }
        if (intRef.element == userVolume) {
            HMLog.info(f, m.a);
            intRef.element = a(manager, targetVolume > userVolume, 0);
        }
        if (intRef.element == userVolume) {
            HMLog.info(f, n.a);
            intRef.element = a(manager, targetVolume > userVolume, 4);
        }
        HMLog.info(f, new o(targetVolume, userVolume, maxVolume, intRef, Build.VERSION.SDK_INT >= 21 ? manager.isVolumeFixed() : false));
        return intRef.element;
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    public boolean deInit() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.audioManager == null) {
                HMLog.info(f, d.a);
                this.hasInit = false;
                return true;
            }
            Context appContext = MusicControllerModule.INSTANCE.getInstance().getAppContext();
            if (appContext == null) {
                HMLog.info(f, e.a);
                return false;
            }
            try {
                appContext.unregisterReceiver(d());
            } catch (Exception unused) {
            }
            d().setVolumeInfo(null);
            this.hasInit = false;
            HMLog.info(f, f.a);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    @NotNull
    public VolumeInfo getCurrentVolume() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            HMLog.info(f, g.a);
            return new VolumeInfo(-1);
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return new VolumeInfo(streamMaxVolume > 0 ? Math.min((streamVolume * 100) / streamMaxVolume, 100) : -1);
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    public boolean init() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.hasInit) {
                return true;
            }
            Context appContext = MusicControllerModule.INSTANCE.getInstance().getAppContext();
            if (appContext == null) {
                HMLog.info(f, h.a);
                return false;
            }
            AudioManager audioManager = (AudioManager) appContext.getSystemService("audio");
            this.audioManager = audioManager;
            if (audioManager == null) {
                HMLog.info(f, i.a);
                return false;
            }
            e();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(g);
            appContext.registerReceiver(d(), intentFilter);
            this.hasInit = true;
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    public void setVolumeListener(@Nullable IVolumeController.IVolumeListener listener) {
        this.listener = listener;
        VolumeInfo volumeInfo = d().getVolumeInfo();
        if (volumeInfo == null || listener == null) {
            return;
        }
        listener.onVolumeChanged(volumeInfo);
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    public boolean volumeDown() {
        return b(false);
    }

    @Override // com.huami.musiccontrol.controller.IVolumeController
    public boolean volumeUp() {
        return b(true);
    }
}
