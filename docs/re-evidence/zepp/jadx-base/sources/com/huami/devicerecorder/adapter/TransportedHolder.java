package com.huami.devicerecorder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.R;
import com.huami.devicerecorder.adapter.TransportedHolder;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.devicerecorder.model.RecordUtils;
import com.huami.devicerecorder.player.IRecorderPlayer;
import com.huami.tools.log.HMLog;
import com.loc.z;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R!\u00104\u001a\u000601R\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b(\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006B"}, d2 = {"Lcom/huami/devicerecorder/adapter/TransportedHolder;", "Lcom/huami/devicerecorder/adapter/ViewHolder;", "", "isPlaying", "", "progress", "duration", "", hl.k, "playing", z.j, "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "Lcom/huami/devicerecorder/model/PageMode;", "mode", "onBind", "onViewDetachedFromWindow", "onViewAttachedFromWindow", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "timeTv", "Landroid/widget/SeekBar;", "c", "Landroid/widget/SeekBar;", "seekBar", "Landroid/widget/ProgressBar;", GoogleApiAvailabilityLight.a, "Landroid/widget/ProgressBar;", "progressBar", "e", "playTimeTv", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "playBtn", "g", "pauseBtn", "h", "shareBtn", "i", "deleteBtn", "Lcom/huami/devicerecorder/player/IRecorderPlayer;", "Lcom/huami/devicerecorder/player/IRecorderPlayer;", "getPlayer", "()Lcom/huami/devicerecorder/player/IRecorderPlayer;", "setPlayer", "(Lcom/huami/devicerecorder/player/IRecorderPlayer;)V", "player", "Lcom/huami/devicerecorder/adapter/TransportedHolder$c;", "Lkotlin/Lazy;", "()Lcom/huami/devicerecorder/adapter/TransportedHolder$c;", "playerCallback", "l", "Lcom/huami/devicerecorder/model/PlayItemData;", "m", "Z", "isChangingProgress", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/huami/devicerecorder/adapter/IItemClickListener;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class TransportedHolder extends ViewHolder {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView timeTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SeekBar seekBar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ProgressBar progressBar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final TextView playTimeTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ImageView playBtn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ImageView pauseBtn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ImageView shareBtn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ImageView deleteBtn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IRecorderPlayer player;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private PlayItemData itemData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isChangingProgress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play failed as record file is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause failed as record file is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"com/huami/devicerecorder/adapter/TransportedHolder$c", "Lcom/huami/devicerecorder/player/IRecorderPlayer$IPlayerCallback;", "Lcom/huami/devicerecorder/player/IRecorderPlayer;", "recordPlayer", "", "injectPlayer", "Lcom/huami/devicerecorder/model/PlayItemData;", "item", "onPlay", "onStop", "onPaused", "", "progress", "duration", "onProgressChanged", "", "needNotifyAbout", "onError", "onFileNotExit", "<init>", "(Lcom/huami/devicerecorder/adapter/TransportedHolder;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class c implements IRecorderPlayer.IPlayerCallback {
        public c() {
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void injectPlayer(@NotNull IRecorderPlayer recordPlayer) {
            TransportedHolder.this.setPlayer(recordPlayer);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public boolean needNotifyAbout(@NotNull PlayItemData item) {
            return Intrinsics.areEqual(TransportedHolder.this.itemData, item);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onError(@NotNull PlayItemData item) {
            onStop(item);
            IItemClickListener iItemClickListener = TransportedHolder.this.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            if (iItemClickListener == null) {
                return;
            }
            iItemClickListener.onPlayInvalidFile(TransportedHolder.this.getAdapterPosition(), item);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onFileNotExit(@NotNull PlayItemData item) {
            onStop(item);
            IItemClickListener iItemClickListener = TransportedHolder.this.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            if (iItemClickListener == null) {
                return;
            }
            iItemClickListener.onPlayFileNotFound(TransportedHolder.this.getAdapterPosition(), item);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onPaused(@NotNull PlayItemData item) {
            TransportedHolder.this.j(false);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onPlay(@NotNull PlayItemData item) {
            TransportedHolder.this.j(true);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onProgressChanged(@NotNull PlayItemData item, int progress, int duration) {
            if (TransportedHolder.this.isChangingProgress) {
                return;
            }
            TransportedHolder.this.k(item.isPlaying(), progress, duration);
        }

        @Override // com.huami.devicerecorder.player.IRecorderPlayer.IPlayerCallback
        public void onStop(@NotNull PlayItemData item) {
            TransportedHolder.this.j(false);
            TransportedHolder.this.k(false, item.getPosition(), item.getRecordFile().getDuration());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/huami/devicerecorder/adapter/TransportedHolder$c;", "Lcom/huami/devicerecorder/adapter/TransportedHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return TransportedHolder.this.new c();
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
            return "set playing states failed as file si null";
        }
    }

    public TransportedHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable final IItemClickListener iItemClickListener) {
        super(layoutInflater.inflate(R.layout.item_device_recorder, viewGroup, false), iItemClickListener);
        this.timeTv = (TextView) findViewById(R.id.tv_time);
        SeekBar seekBar = (SeekBar) findViewById(R.id.sb_recorder);
        this.seekBar = seekBar;
        this.progressBar = (ProgressBar) findViewById(R.id.pb_recorder);
        this.playTimeTv = (TextView) findViewById(R.id.tv_position);
        ImageView imageView = (ImageView) findViewById(R.id.btn_play);
        this.playBtn = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.btn_pause);
        this.pauseBtn = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.btn_share);
        this.shareBtn = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.btn_delete);
        this.deleteBtn = imageView4;
        this.playerCallback = LazyKt__LazyJVMKt.lazy(new d());
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: bz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransportedHolder.e(iItemClickListener, this, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: dz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransportedHolder.f(this.a, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: cz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransportedHolder.g(this.a, view);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: az7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransportedHolder.h(iItemClickListener, this, view);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huami.devicerecorder.adapter.TransportedHolder.5

            /* JADX INFO: renamed from: com.huami.devicerecorder.adapter.TransportedHolder$5$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "change progress failed as record file is null";
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar2, int progress, boolean fromUser) {
                if (fromUser) {
                    PlayItemData playItemData = TransportedHolder.this.itemData;
                    if (playItemData == null) {
                        HMLog.info(ViewHolder.TAG, a.a);
                        return;
                    }
                    int duration = (playItemData.getRecordFile().getDuration() * progress) / 100;
                    IRecorderPlayer player = TransportedHolder.this.getPlayer();
                    if (player == null) {
                        return;
                    }
                    player.setPlayerPosition(playItemData, duration);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar2) {
                TransportedHolder.this.isChangingProgress = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar2) {
                TransportedHolder.this.isChangingProgress = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(IItemClickListener iItemClickListener, TransportedHolder transportedHolder, View view) {
        if (iItemClickListener == null) {
            return;
        }
        iItemClickListener.onShareClick(transportedHolder.getAdapterPosition(), transportedHolder.itemData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TransportedHolder transportedHolder, View view) {
        PlayItemData playItemData = transportedHolder.itemData;
        if (playItemData == null) {
            HMLog.info(ViewHolder.TAG, a.a);
            return;
        }
        IRecorderPlayer player = transportedHolder.getPlayer();
        if (player == null) {
            return;
        }
        player.play(playItemData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TransportedHolder transportedHolder, View view) {
        PlayItemData playItemData = transportedHolder.itemData;
        if (playItemData == null) {
            HMLog.info(ViewHolder.TAG, b.a);
            return;
        }
        IRecorderPlayer player = transportedHolder.getPlayer();
        if (player == null) {
            return;
        }
        player.pause(playItemData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(IItemClickListener iItemClickListener, TransportedHolder transportedHolder, View view) {
        if (iItemClickListener == null) {
            return;
        }
        iItemClickListener.onDeleteClick(transportedHolder.getAdapterPosition(), transportedHolder.itemData);
    }

    private final c i() {
        return (c) this.playerCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean playing) {
        if (this.itemData == null) {
            HMLog.info(ViewHolder.TAG, e.a);
            return;
        }
        if (playing) {
            this.playBtn.setVisibility(8);
            this.pauseBtn.setVisibility(0);
            this.deleteBtn.setEnabled(false);
            this.progressBar.setVisibility(4);
            this.seekBar.setVisibility(0);
            return;
        }
        this.playBtn.setVisibility(0);
        this.pauseBtn.setVisibility(8);
        this.deleteBtn.setEnabled(true);
        this.progressBar.setVisibility(0);
        this.seekBar.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean isPlaying, int progress, int duration) {
        RecordUtils recordUtils = RecordUtils.INSTANCE;
        String duration2 = recordUtils.formatDuration(duration);
        if (isPlaying) {
            String duration3 = recordUtils.formatDuration(progress);
            this.playTimeTv.setText(duration3 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + duration2);
        } else {
            this.playTimeTv.setText(duration2);
        }
        this.seekBar.setProgress(duration > 0 ? (progress * 100) / duration : 0);
        this.progressBar.setProgress(this.seekBar.getProgress());
    }

    @Nullable
    public final IRecorderPlayer getPlayer() {
        return this.player;
    }

    @Override // com.huami.devicerecorder.adapter.ViewHolder
    public void onBind(@NotNull PlayItemData itemData, @NotNull PageMode mode) {
        IItemClickListener iItemClickListener = getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (iItemClickListener != null) {
            iItemClickListener.registerPlayerCallback(i());
        }
        this.itemData = itemData;
        this.timeTv.setText(RecordUtils.INSTANCE.formatDate(itemData.getRecordFile().getRecordTime()));
        j(itemData.isPlaying());
        k(itemData.isPlaying(), itemData.getPosition(), itemData.getRecordFile().getDuration());
    }

    @Override // com.huami.devicerecorder.adapter.ViewHolder
    public void onViewAttachedFromWindow() {
        IRecorderPlayer iRecorderPlayer = this.player;
        if (iRecorderPlayer != null) {
            iRecorderPlayer.registerPlayerCallback(i());
        }
        PlayItemData playItemData = this.itemData;
        if (playItemData == null) {
            return;
        }
        j(playItemData.isPlaying());
        k(playItemData.isPlaying(), playItemData.getPosition(), playItemData.getRecordFile().getDuration());
    }

    @Override // com.huami.devicerecorder.adapter.ViewHolder
    public void onViewDetachedFromWindow() {
        IRecorderPlayer iRecorderPlayer = this.player;
        if (iRecorderPlayer == null) {
            return;
        }
        iRecorderPlayer.unRegisterPlayerCallback(i());
    }

    public final void setPlayer(@Nullable IRecorderPlayer iRecorderPlayer) {
        this.player = iRecorderPlayer;
    }
}
