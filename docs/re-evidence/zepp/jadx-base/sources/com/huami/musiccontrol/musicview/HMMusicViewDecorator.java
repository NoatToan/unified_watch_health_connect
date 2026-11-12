package com.huami.musiccontrol.musicview;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.musiccontrol.musiccenter.MusicCenter;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000e*\u0001\u0018\u0018\u0000 #2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator;", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "showMusic", "showNoPermission", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volume", "showVolume", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "playInfo", "showPlayState", "showMusicAndState", "supportMusicControl", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setViewListener", "Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "a", "Lkotlin/Lazy;", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "musicCenter", "com/huami/musiccontrol/musicview/HMMusicViewDecorator$musicChangeListener$1", "b", "Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator$musicChangeListener$1;", "musicChangeListener", "c", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "getMusicView$music_control_release", "()Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "musicView", "<init>", "(Lcom/huami/musiccontrol/musicview/IDeviceMusicView;)V", "Companion", "MusicViewListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class HMMusicViewDecorator implements IDeviceMusicView {
    private static final String d = "MusicCtrl_MusicView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy musicCenter = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HMMusicViewDecorator$musicChangeListener$1 musicChangeListener = new HMMusicViewDecorator$musicChangeListener$1(this);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IDeviceMusicView musicView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator$MusicViewListener;", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", "", "onNextClick", "onPreClick", "onPauseClick", "onPlayClick", "onVolumeUpClick", "onVolumeDownClick", "onEnterControlView", "onExitControlView", "<init>", "(Lcom/huami/musiccontrol/musicview/HMMusicViewDecorator;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class MusicViewListener implements IDeviceMusicView.IDeviceMusicViewListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onEnter";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "init failed";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return com.alipay.sdk.m.x.d.r;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
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
                return "onNext result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onPause result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class f extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onPlay result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class g extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onPre result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class h extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onVolumeDown result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class i extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onVolumeUp result: " + this.a;
            }
        }

        public MusicViewListener() {
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onEnterControlView() {
            HMLog.info(HMMusicViewDecorator.d, a.a);
            HMMusicViewDecorator.this.a().setMusicListener(HMMusicViewDecorator.this.musicChangeListener);
            if (HMMusicViewDecorator.this.a().init()) {
                return;
            }
            HMMusicViewDecorator.this.a().deInit();
            HMMusicViewDecorator.this.musicChangeListener.setPreMusic(null);
            HMMusicViewDecorator.this.musicChangeListener.setPrePlayInfo(null);
            HMLog.info(HMMusicViewDecorator.d, b.a);
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onExitControlView() {
            HMLog.info(HMMusicViewDecorator.d, c.a);
            HMMusicViewDecorator.this.a().setMusicListener(null);
            HMMusicViewDecorator.this.a().deInit();
            HMMusicViewDecorator.this.musicChangeListener.setPreMusic(null);
            HMMusicViewDecorator.this.musicChangeListener.setPrePlayInfo(null);
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onNextClick() {
            HMLog.info(HMMusicViewDecorator.d, new d(HMMusicViewDecorator.this.a().nextMusic()));
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onPauseClick() {
            HMLog.info(HMMusicViewDecorator.d, new e(HMMusicViewDecorator.this.a().pause()));
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onPlayClick() {
            HMLog.info(HMMusicViewDecorator.d, new f(HMMusicViewDecorator.this.a().play()));
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onPreClick() {
            HMLog.info(HMMusicViewDecorator.d, new g(HMMusicViewDecorator.this.a().preMusic()));
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onVolumeDownClick() {
            HMLog.info(HMMusicViewDecorator.d, new h(HMMusicViewDecorator.this.a().decreaseVolume()));
        }

        @Override // com.huami.musiccontrol.musicview.IDeviceMusicView.IDeviceMusicViewListener
        public void onVolumeUpClick() {
            HMLog.info(HMMusicViewDecorator.d, new i(HMMusicViewDecorator.this.a().increaseVolume()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "a", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<MusicCenter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicCenter invoke() {
            return MusicCenter.INSTANCE.get();
        }
    }

    public HMMusicViewDecorator(@NotNull IDeviceMusicView iDeviceMusicView) {
        this.musicView = iDeviceMusicView;
        iDeviceMusicView.setViewListener(new MusicViewListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicCenter a() {
        return (MusicCenter) this.musicCenter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getMusicView$music_control_release, reason: from getter */
    public final IDeviceMusicView getMusicView() {
        return this.musicView;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "")
    public /* synthetic */ void setViewListener(IDeviceMusicView.IDeviceMusicViewListener listener) {
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showMusic(@NotNull MusicInfo music) {
        return this.musicView.showMusic(music);
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showMusicAndState(@NotNull MusicInfo music, @NotNull MusicPlayInfo playInfo) {
        return this.musicView.showMusicAndState(music, playInfo);
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showNoPermission() {
        return this.musicView.showNoPermission();
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showPlayState(@NotNull MusicPlayInfo playInfo) {
        return this.musicView.showPlayState(playInfo);
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showVolume(@NotNull VolumeInfo volume) {
        return this.musicView.showVolume(volume);
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean supportMusicControl() {
        return this.musicView.supportMusicControl();
    }
}
