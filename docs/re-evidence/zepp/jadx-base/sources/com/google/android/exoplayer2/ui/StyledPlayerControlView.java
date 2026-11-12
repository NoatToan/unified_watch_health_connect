package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int M0 = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final int N0 = 0;
    private static final int O0 = 1;
    private final Drawable A;
    private boolean A0;
    private final Drawable B;
    private int B0;
    private final float C;

    @Nullable
    private DefaultTrackSelector C0;
    private final float D;
    private j D0;
    private final String E;
    private j E0;
    private final String F;
    private TrackNameProvider F0;
    private final Drawable G;

    @Nullable
    private ImageView G0;
    private final Drawable H;

    @Nullable
    private ImageView H0;
    private final String I;

    @Nullable
    private ImageView I0;
    private final String J;

    @Nullable
    private View J0;
    private final Drawable K;

    @Nullable
    private View K0;
    private final Drawable L;

    @Nullable
    private View L0;
    private final String M;
    private final String N;

    @Nullable
    private Player O;
    private ControlDispatcher P;

    @Nullable
    private ProgressUpdateListener Q;

    @Nullable
    private OnFullScreenModeChangedListener R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final c a;
    private final CopyOnWriteArrayList<VisibilityListener> b;

    @Nullable
    private final View c;

    @Nullable
    private final View d;

    @Nullable
    private final View e;

    @Nullable
    private final View f;

    @Nullable
    private final View g;

    @Nullable
    private final TextView h;

    @Nullable
    private final TextView i;

    @Nullable
    private final ImageView j;

    @Nullable
    private final ImageView k;

    @Nullable
    private final View l;

    @Nullable
    private final TextView m;
    private int m0;

    @Nullable
    private final TextView n;
    private int n0;

    @Nullable
    private final TimeBar o;
    private int o0;
    private final StringBuilder p;
    private long[] p0;
    private final Formatter q;
    private boolean[] q0;
    private final Timeline.Period r;
    private long[] r0;
    private final Timeline.Window s;
    private boolean[] s0;
    private final Runnable t;
    private long t0;
    private final Drawable u;
    private y u0;
    private final Drawable v;
    private Resources v0;
    private final Drawable w;
    private RecyclerView w0;
    private final String x;
    private f x0;
    private final String y;
    private d y0;
    private final String z;
    private PopupWindow z0;

    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean isFullScreen);
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long position, long bufferedPosition);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int visibility);
    }

    public final class b extends j {
        private b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(View view) {
            if (StyledPlayerControlView.this.C0 != null) {
                DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = StyledPlayerControlView.this.C0.getParameters().buildUpon();
                for (int i = 0; i < this.a.size(); i++) {
                    parametersBuilderBuildUpon = parametersBuilderBuildUpon.clearSelectionOverrides(this.a.get(i).intValue());
                }
                ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.C0)).setParameters(parametersBuilderBuildUpon);
            }
            StyledPlayerControlView.this.x0.c(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            StyledPlayerControlView.this.z0.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void b(List<Integer> rendererIndices, List<i> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= rendererIndices.size()) {
                    z = false;
                    break;
                }
                int iIntValue = rendererIndices.get(i).intValue();
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(iIntValue);
                if (StyledPlayerControlView.this.C0 != null && StyledPlayerControlView.this.C0.getParameters().hasSelectionOverride(iIntValue, trackGroups)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (trackInfos.isEmpty()) {
                StyledPlayerControlView.this.x0.c(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
            } else if (z) {
                for (int i2 = 0; i2 < trackInfos.size(); i2++) {
                    i iVar = trackInfos.get(i2);
                    if (iVar.e) {
                        StyledPlayerControlView.this.x0.c(1, iVar.d);
                        break;
                    }
                }
            } else {
                StyledPlayerControlView.this.x0.c(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            }
            this.a = rendererIndices;
            this.b = trackInfos;
            this.c = mappedTrackInfo;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void e(g holder) {
            boolean z;
            holder.a.setText(R.string.exo_track_selection_auto);
            DefaultTrackSelector.Parameters parameters = ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.C0)).getParameters();
            int i = 0;
            while (true) {
                if (i >= this.a.size()) {
                    z = false;
                    break;
                }
                int iIntValue = this.a.get(i).intValue();
                if (parameters.hasSelectionOverride(iIntValue, ((MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.c)).getTrackGroups(iIntValue))) {
                    z = true;
                    break;
                }
                i++;
            }
            holder.b.setVisibility(z ? 4 : 0);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void g(String subtext) {
            StyledPlayerControlView.this.x0.c(1, subtext);
        }
    }

    public final class c implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            n0.a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            n0.b(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            n0.c(this, commands);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = StyledPlayerControlView.this.O;
            if (player == null) {
                return;
            }
            StyledPlayerControlView.this.u0.X();
            if (StyledPlayerControlView.this.d == view) {
                StyledPlayerControlView.this.P.dispatchNext(player);
                return;
            }
            if (StyledPlayerControlView.this.c == view) {
                StyledPlayerControlView.this.P.dispatchPrevious(player);
                return;
            }
            if (StyledPlayerControlView.this.f == view) {
                if (player.getPlaybackState() != 4) {
                    StyledPlayerControlView.this.P.dispatchFastForward(player);
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.g == view) {
                StyledPlayerControlView.this.P.dispatchRewind(player);
                return;
            }
            if (StyledPlayerControlView.this.e == view) {
                StyledPlayerControlView.this.X(player);
                return;
            }
            if (StyledPlayerControlView.this.j == view) {
                StyledPlayerControlView.this.P.dispatchSetRepeatMode(player, RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), StyledPlayerControlView.this.o0));
                return;
            }
            if (StyledPlayerControlView.this.k == view) {
                StyledPlayerControlView.this.P.dispatchSetShuffleModeEnabled(player, !player.getShuffleModeEnabled());
                return;
            }
            if (StyledPlayerControlView.this.J0 == view) {
                StyledPlayerControlView.this.u0.W();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.Y(styledPlayerControlView.x0);
                return;
            }
            if (StyledPlayerControlView.this.K0 == view) {
                StyledPlayerControlView.this.u0.W();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.Y(styledPlayerControlView2.y0);
            } else if (StyledPlayerControlView.this.L0 == view) {
                StyledPlayerControlView.this.u0.W();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.Y(styledPlayerControlView3.E0);
            } else if (StyledPlayerControlView.this.G0 == view) {
                StyledPlayerControlView.this.u0.W();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.Y(styledPlayerControlView4.D0);
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
        public /* synthetic */ void onCues(List list) {
            n0.d(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            n0.e(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            n0.f(this, i, z);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.A0) {
                StyledPlayerControlView.this.u0.X();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6)) {
                StyledPlayerControlView.this.s0();
            }
            if (events.containsAny(5, 6, 8)) {
                StyledPlayerControlView.this.u0();
            }
            if (events.contains(9)) {
                StyledPlayerControlView.this.v0();
            }
            if (events.contains(10)) {
                StyledPlayerControlView.this.y0();
            }
            if (events.containsAny(9, 10, 12, 0, 17, 18)) {
                StyledPlayerControlView.this.r0();
            }
            if (events.containsAny(12, 0)) {
                StyledPlayerControlView.this.z0();
            }
            if (events.contains(13)) {
                StyledPlayerControlView.this.t0();
            }
            if (events.contains(2)) {
                StyledPlayerControlView.this.A0();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            n0.h(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n0.i(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            m0.e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
            m0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            n0.j(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            n0.k(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
        public /* synthetic */ void onMetadata(Metadata metadata) {
            n0.l(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            n0.m(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            n0.n(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            n0.o(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            n0.p(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            n0.q(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            n0.r(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            m0.o(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            n0.s(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            m0.q(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            n0.t(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onRenderedFirstFrame() {
            n0.u(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            n0.v(this, i);
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long position) {
            if (StyledPlayerControlView.this.n != null) {
                StyledPlayerControlView.this.n.setText(Util.getStringForTime(StyledPlayerControlView.this.p, StyledPlayerControlView.this.q, position));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long position) {
            StyledPlayerControlView.this.W = true;
            if (StyledPlayerControlView.this.n != null) {
                StyledPlayerControlView.this.n.setText(Util.getStringForTime(StyledPlayerControlView.this.p, StyledPlayerControlView.this.q, position));
            }
            StyledPlayerControlView.this.u0.W();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long position, boolean canceled) {
            StyledPlayerControlView.this.W = false;
            if (!canceled && StyledPlayerControlView.this.O != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.k0(styledPlayerControlView.O, position);
            }
            StyledPlayerControlView.this.u0.X();
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            n0.w(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            n0.x(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            m0.v(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            n0.y(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            n0.z(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            m0.x(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            n0.A(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            n0.B(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            n0.C(this, trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            com.google.android.exoplayer2.video.b.c(this, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            n0.D(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f) {
            n0.E(this, f);
        }
    }

    public final class d extends RecyclerView.Adapter<g> {
        private final String[] a;
        private final int[] b;
        private int c;

        public d(String[] playbackSpeedTexts, int[] playbackSpeedsMultBy100) {
            this.a = playbackSpeedTexts;
            this.b = playbackSpeedsMultBy100;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i, View view) {
            if (i != this.c) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.b[i] / 100.0f);
            }
            StyledPlayerControlView.this.z0.dismiss();
        }

        public String b() {
            return this.a[this.c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g holder, final int position) {
            String[] strArr = this.a;
            if (position < strArr.length) {
                holder.a.setText(strArr[position]);
            }
            holder.b.setVisibility(position == this.c ? 0 : 4);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c(position, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup parent, int viewType) {
            return new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, parent, false));
        }

        public void f(float playbackSpeed) {
            int iRound = Math.round(playbackSpeed * 100.0f);
            int i = 0;
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            while (true) {
                int[] iArr = this.b;
                if (i >= iArr.length) {
                    this.c = i2;
                    return;
                }
                int iAbs = Math.abs(iRound - iArr[i]);
                if (iAbs < i3) {
                    i2 = i;
                    i3 = iAbs;
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.a.length;
        }
    }

    public final class e extends RecyclerView.ViewHolder {
        private final TextView a;
        private final TextView b;
        private final ImageView c;

        public e(View itemView) {
            super(itemView);
            if (Util.SDK_INT < 26) {
                itemView.setFocusable(true);
            }
            this.a = (TextView) itemView.findViewById(R.id.exo_main_text);
            this.b = (TextView) itemView.findViewById(R.id.exo_sub_text);
            this.c = (ImageView) itemView.findViewById(R.id.exo_icon);
            itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            StyledPlayerControlView.this.h0(getAdapterPosition());
        }
    }

    public class f extends RecyclerView.Adapter<e> {
        private final String[] a;
        private final String[] b;
        private final Drawable[] c;

        public f(String[] mainTexts, Drawable[] iconIds) {
            this.a = mainTexts;
            this.b = new String[mainTexts.length];
            this.c = iconIds;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(e holder, int position) {
            holder.a.setText(this.a[position]);
            if (this.b[position] == null) {
                holder.b.setVisibility(8);
            } else {
                holder.b.setText(this.b[position]);
            }
            if (this.c[position] == null) {
                holder.c.setVisibility(8);
            } else {
                holder.c.setImageDrawable(this.c[position]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e onCreateViewHolder(ViewGroup parent, int viewType) {
            return StyledPlayerControlView.this.new e(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, parent, false));
        }

        public void c(int position, String subText) {
            this.b[position] = subText;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            return position;
        }
    }

    public static class g extends RecyclerView.ViewHolder {
        public final TextView a;
        public final View b;

        public g(View itemView) {
            super(itemView);
            if (Util.SDK_INT < 26) {
                itemView.setFocusable(true);
            }
            this.a = (TextView) itemView.findViewById(R.id.exo_text);
            this.b = itemView.findViewById(R.id.exo_check);
        }
    }

    public final class h extends j {
        private h() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(View view) {
            if (StyledPlayerControlView.this.C0 != null) {
                DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = StyledPlayerControlView.this.C0.getParameters().buildUpon();
                for (int i = 0; i < this.a.size(); i++) {
                    int iIntValue = this.a.get(i).intValue();
                    parametersBuilderBuildUpon = parametersBuilderBuildUpon.clearSelectionOverrides(iIntValue).setRendererDisabled(iIntValue, true);
                }
                ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.C0)).setParameters(parametersBuilderBuildUpon);
                StyledPlayerControlView.this.z0.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void b(List<Integer> rendererIndices, List<i> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
            boolean z = false;
            for (int i = 0; i < trackInfos.size(); i++) {
                if (trackInfos.get(i).e) {
                    z = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.G0 != null) {
                ImageView imageView = StyledPlayerControlView.this.G0;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.G : styledPlayerControlView.H);
                StyledPlayerControlView.this.G0.setContentDescription(z ? StyledPlayerControlView.this.I : StyledPlayerControlView.this.J);
            }
            this.a = rendererIndices;
            this.b = trackInfos;
            this.c = mappedTrackInfo;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g holder, int position) {
            super.onBindViewHolder(holder, position);
            if (position > 0) {
                holder.b.setVisibility(this.b.get(position + (-1)).e ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void e(g holder) {
            boolean z;
            holder.a.setText(R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    z = true;
                    break;
                } else {
                    if (this.b.get(i).e) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            holder.b.setVisibility(z ? 0 : 4);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.j
        public void g(String subtext) {
        }
    }

    public static final class i {
        public final int a;
        public final int b;
        public final int c;
        public final String d;
        public final boolean e;

        public i(int rendererIndex, int groupIndex, int trackIndex, String trackName, boolean selected) {
            this.a = rendererIndex;
            this.b = groupIndex;
            this.c = trackIndex;
            this.d = trackName;
            this.e = selected;
        }
    }

    public abstract class j extends RecyclerView.Adapter<g> {
        public List<Integer> a = new ArrayList();
        public List<i> b = new ArrayList();

        @Nullable
        public MappingTrackSelector.MappedTrackInfo c = null;

        public j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(i iVar, View view) {
            if (this.c == null || StyledPlayerControlView.this.C0 == null) {
                return;
            }
            DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = StyledPlayerControlView.this.C0.getParameters().buildUpon();
            for (int i = 0; i < this.a.size(); i++) {
                int iIntValue = this.a.get(i).intValue();
                parametersBuilderBuildUpon = iIntValue == iVar.a ? parametersBuilderBuildUpon.setSelectionOverride(iIntValue, ((MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.c)).getTrackGroups(iIntValue), new DefaultTrackSelector.SelectionOverride(iVar.b, iVar.c)).setRendererDisabled(iIntValue, false) : parametersBuilderBuildUpon.clearSelectionOverrides(iIntValue).setRendererDisabled(iIntValue, true);
            }
            ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.C0)).setParameters(parametersBuilderBuildUpon);
            g(iVar.d);
            StyledPlayerControlView.this.z0.dismiss();
        }

        public abstract void b(List<Integer> rendererIndices, List<i> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo);

        public void clear() {
            this.b = Collections.emptyList();
            this.c = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d */
        public void onBindViewHolder(g holder, int position) {
            if (StyledPlayerControlView.this.C0 == null || this.c == null) {
                return;
            }
            if (position == 0) {
                e(holder);
                return;
            }
            final i iVar = this.b.get(position - 1);
            boolean z = ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.C0)).getParameters().hasSelectionOverride(iVar.a, this.c.getTrackGroups(iVar.a)) && iVar.e;
            holder.a.setText(iVar.d);
            holder.b.setVisibility(z ? 0 : 4);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c(iVar, view);
                }
            });
        }

        public abstract void e(g holder);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup parent, int viewType) {
            return new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, parent, false));
        }

        public abstract void g(String subtext);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            if (this.b.isEmpty()) {
                return 0;
            }
            return this.b.size() + 1;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        b0();
        n0(this.D0.getA() > 0, this.G0);
    }

    private static boolean U(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i2 = 0; i2 < windowCount; i2++) {
            if (timeline.getWindow(i2, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private void V(Player player) {
        this.P.dispatchSetPlayWhenReady(player, false);
    }

    private void W(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            this.P.dispatchPrepare(player);
        } else if (playbackState == 4) {
            j0(player, player.getCurrentWindowIndex(), C.TIME_UNSET);
        }
        this.P.dispatchSetPlayWhenReady(player, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            W(player);
        } else {
            V(player);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(RecyclerView.Adapter<?> adapter) {
        this.w0.setAdapter(adapter);
        x0();
        this.A0 = false;
        this.z0.dismiss();
        this.A0 = true;
        this.z0.showAsDropDown(this, (getWidth() - this.z0.getWidth()) - this.B0, (-this.z0.getHeight()) - this.B0);
    }

    private void Z(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, List<i> tracks) {
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
        TrackSelection trackSelection = ((Player) Assertions.checkNotNull(this.O)).getCurrentTrackSelections().get(rendererIndex);
        for (int i2 = 0; i2 < trackGroups.length; i2++) {
            TrackGroup trackGroup = trackGroups.get(i2);
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                Format format = trackGroup.getFormat(i3);
                if (mappedTrackInfo.getTrackSupport(rendererIndex, i2, i3) == 4) {
                    tracks.add(new i(rendererIndex, i2, i3, this.F0.getTrackName(format), (trackSelection == null || trackSelection.indexOf(format) == -1) ? false : true));
                }
            }
        }
    }

    private static int a0(TypedArray a2, int defaultValue) {
        return a2.getInt(R.styleable.StyledPlayerControlView_repeat_toggle_modes, defaultValue);
    }

    private void b0() {
        DefaultTrackSelector defaultTrackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;
        this.D0.clear();
        this.E0.clear();
        if (this.O == null || (defaultTrackSelector = this.C0) == null || (currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < currentMappedTrackInfo.getRendererCount(); i2++) {
            if (currentMappedTrackInfo.getRendererType(i2) == 3 && this.u0.A(this.G0)) {
                Z(currentMappedTrackInfo, i2, arrayList);
                arrayList3.add(Integer.valueOf(i2));
            } else if (currentMappedTrackInfo.getRendererType(i2) == 1) {
                Z(currentMappedTrackInfo, i2, arrayList2);
                arrayList4.add(Integer.valueOf(i2));
            }
        }
        this.D0.b(arrayList3, arrayList, currentMappedTrackInfo);
        this.E0.b(arrayList4, arrayList2, currentMappedTrackInfo);
    }

    private static void c0(View fullScreenButton, View.OnClickListener listener) {
        if (fullScreenButton == null) {
            return;
        }
        fullScreenButton.setVisibility(8);
        fullScreenButton.setOnClickListener(listener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean d0(int keyCode) {
        return keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(View v) {
        if (this.R == null) {
            return;
        }
        boolean z = !this.S;
        this.S = z;
        p0(this.H0, z);
        p0(this.I0, this.S);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.R;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.S);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        int i2 = bottom - top;
        int i3 = oldBottom - oldTop;
        if (!(right - left == oldRight - oldLeft && i2 == i3) && this.z0.isShowing()) {
            x0();
            this.z0.update(v, (getWidth() - this.z0.getWidth()) - this.B0, (-this.z0.getHeight()) - this.B0, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int position) {
        if (position == 0) {
            Y(this.y0);
        } else if (position == 1) {
            Y(this.E0);
        } else {
            this.z0.dismiss();
        }
    }

    private boolean j0(Player player, int windowIndex, long positionMs) {
        return this.P.dispatchSeekTo(player, windowIndex, positionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Player player, long positionMs) {
        int currentWindowIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.V && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentWindowIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentWindowIndex, this.s).getDurationMs();
                if (positionMs < durationMs) {
                    break;
                }
                if (currentWindowIndex == windowCount - 1) {
                    positionMs = durationMs;
                    break;
                } else {
                    positionMs -= durationMs;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = player.getCurrentWindowIndex();
        }
        j0(player, currentWindowIndex, positionMs);
        u0();
    }

    private boolean l0() {
        Player player = this.O;
        return (player == null || player.getPlaybackState() == 4 || this.O.getPlaybackState() == 1 || !this.O.getPlayWhenReady()) ? false : true;
    }

    private void n0(boolean enabled, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(enabled);
        view.setAlpha(enabled ? this.C : this.D);
    }

    private void o0() {
        Player player;
        ControlDispatcher controlDispatcher = this.P;
        int fastForwardIncrementMs = (int) (((!(controlDispatcher instanceof DefaultControlDispatcher) || (player = this.O) == null) ? 15000L : ((DefaultControlDispatcher) controlDispatcher).getFastForwardIncrementMs(player)) / 1000);
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(String.valueOf(fastForwardIncrementMs));
        }
        View view = this.f;
        if (view != null) {
            view.setContentDescription(this.v0.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, fastForwardIncrementMs, Integer.valueOf(fastForwardIncrementMs)));
        }
    }

    private void p0(@Nullable ImageView fullScreenButton, boolean isFullScreen) {
        if (fullScreenButton == null) {
            return;
        }
        if (isFullScreen) {
            fullScreenButton.setImageDrawable(this.K);
            fullScreenButton.setContentDescription(this.M);
        } else {
            fullScreenButton.setImageDrawable(this.L);
            fullScreenButton.setContentDescription(this.N);
        }
    }

    private static void q0(@Nullable View fullScreenButton, boolean visible) {
        if (fullScreenButton == null) {
            return;
        }
        if (visible) {
            fullScreenButton.setVisibility(0);
        } else {
            fullScreenButton.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        boolean z;
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean z2;
        if (isVisible() && this.T) {
            Player player = this.O;
            boolean z3 = false;
            if (player != null) {
                boolean zIsCommandAvailable3 = player.isCommandAvailable(4);
                zIsCommandAvailable2 = player.isCommandAvailable(6);
                boolean z4 = player.isCommandAvailable(10) && this.P.isRewindEnabled();
                if (player.isCommandAvailable(11) && this.P.isFastForwardEnabled()) {
                    z3 = true;
                }
                zIsCommandAvailable = player.isCommandAvailable(8);
                z = z3;
                z3 = z4;
                z2 = zIsCommandAvailable3;
            } else {
                z = false;
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                z2 = false;
            }
            if (z3) {
                w0();
            }
            if (z) {
                o0();
            }
            n0(zIsCommandAvailable2, this.c);
            n0(z3, this.g);
            n0(z, this.f);
            n0(zIsCommandAvailable, this.d);
            TimeBar timeBar = this.o;
            if (timeBar != null) {
                timeBar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        if (isVisible() && this.T && this.e != null) {
            if (l0()) {
                ((ImageView) this.e).setImageDrawable(this.v0.getDrawable(R.drawable.exo_styled_controls_pause));
                this.e.setContentDescription(this.v0.getString(R.string.exo_controls_pause_description));
            } else {
                ((ImageView) this.e).setImageDrawable(this.v0.getDrawable(R.drawable.exo_styled_controls_play));
                this.e.setContentDescription(this.v0.getString(R.string.exo_controls_play_description));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float speed) {
        Player player = this.O;
        if (player == null) {
            return;
        }
        this.P.dispatchSetPlaybackParameters(player, player.getPlaybackParameters().withSpeed(speed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        Player player = this.O;
        if (player == null) {
            return;
        }
        this.y0.f(player.getPlaybackParameters().speed);
        this.x0.c(0, this.y0.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        long contentBufferedPosition;
        if (isVisible() && this.T) {
            Player player = this.O;
            long contentPosition = 0;
            if (player != null) {
                contentPosition = this.t0 + player.getContentPosition();
                contentBufferedPosition = this.t0 + player.getContentBufferedPosition();
            } else {
                contentBufferedPosition = 0;
            }
            TextView textView = this.n;
            if (textView != null && !this.W) {
                textView.setText(Util.getStringForTime(this.p, this.q, contentPosition));
            }
            TimeBar timeBar = this.o;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.o.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.Q;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.t);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.t, 1000L);
                return;
            }
            TimeBar timeBar2 = this.o;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f2 = player.getPlaybackParameters().speed;
            postDelayed(this.t, Util.constrainValue(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.n0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        ImageView imageView;
        if (isVisible() && this.T && (imageView = this.j) != null) {
            if (this.o0 == 0) {
                n0(false, imageView);
                return;
            }
            Player player = this.O;
            if (player == null) {
                n0(false, imageView);
                this.j.setImageDrawable(this.u);
                this.j.setContentDescription(this.x);
                return;
            }
            n0(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.j.setImageDrawable(this.u);
                this.j.setContentDescription(this.x);
            } else if (repeatMode == 1) {
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.j.setImageDrawable(this.w);
                this.j.setContentDescription(this.z);
            }
        }
    }

    private void w0() {
        Player player;
        ControlDispatcher controlDispatcher = this.P;
        int rewindIncrementMs = (int) (((!(controlDispatcher instanceof DefaultControlDispatcher) || (player = this.O) == null) ? 5000L : ((DefaultControlDispatcher) controlDispatcher).getRewindIncrementMs(player)) / 1000);
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(rewindIncrementMs));
        }
        View view = this.g;
        if (view != null) {
            view.setContentDescription(this.v0.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, rewindIncrementMs, Integer.valueOf(rewindIncrementMs)));
        }
    }

    private void x0() {
        this.w0.measure(0, 0);
        this.z0.setWidth(Math.min(this.w0.getMeasuredWidth(), getWidth() - (this.B0 * 2)));
        this.z0.setHeight(Math.min(getHeight() - (this.B0 * 2), this.w0.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        ImageView imageView;
        if (isVisible() && this.T && (imageView = this.k) != null) {
            Player player = this.O;
            if (!this.u0.A(imageView)) {
                n0(false, this.k);
                return;
            }
            if (player == null) {
                n0(false, this.k);
                this.k.setImageDrawable(this.B);
                this.k.setContentDescription(this.F);
            } else {
                n0(true, this.k);
                this.k.setImageDrawable(player.getShuffleModeEnabled() ? this.A : this.B);
                this.k.setContentDescription(player.getShuffleModeEnabled() ? this.E : this.F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    public void z0() {
        int i2;
        Timeline.Window window;
        long positionInWindowUs;
        long[] jArr;
        int length;
        Player player = this.O;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.V = this.U && U(player.getCurrentTimeline(), this.s);
        long j2 = 0;
        this.t0 = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i2 = 0;
        } else {
            int currentWindowIndex = player.getCurrentWindowIndex();
            boolean z2 = this.V;
            int i3 = z2 ? 0 : currentWindowIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
            long j3 = 0;
            i2 = 0;
            while (i3 <= windowCount) {
                if (i3 == currentWindowIndex) {
                    this.t0 = C.usToMs(j3);
                }
                currentTimeline.getWindow(i3, this.s);
                Timeline.Window window2 = this.s;
                if (window2.durationUs == C.TIME_UNSET) {
                    Assertions.checkState(this.V ^ z);
                    break;
                }
                int i4 = window2.firstPeriodIndex;
                while (true) {
                    window = this.s;
                    if (i4 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i4, this.r);
                        int adGroupCount = this.r.getAdGroupCount();
                        for (int removedAdGroupCount = this.r.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                            long adGroupTimeUs = this.r.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j4 = this.r.durationUs;
                                if (j4 != C.TIME_UNSET) {
                                    adGroupTimeUs = j4;
                                    positionInWindowUs = adGroupTimeUs + this.r.getPositionInWindowUs();
                                    if (positionInWindowUs >= 0) {
                                        jArr = this.p0;
                                        if (i2 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.p0 = Arrays.copyOf(jArr, length);
                                            this.q0 = Arrays.copyOf(this.q0, length);
                                        }
                                        this.p0[i2] = C.usToMs(j3 + positionInWindowUs);
                                        this.q0[i2] = this.r.hasPlayedAdGroup(removedAdGroupCount);
                                        i2++;
                                    }
                                }
                            } else {
                                positionInWindowUs = adGroupTimeUs + this.r.getPositionInWindowUs();
                                if (positionInWindowUs >= 0) {
                                    jArr = this.p0;
                                    if (i2 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.p0 = Arrays.copyOf(jArr, length);
                                        this.q0 = Arrays.copyOf(this.q0, length);
                                    }
                                    this.p0[i2] = C.usToMs(j3 + positionInWindowUs);
                                    this.q0[i2] = this.r.hasPlayedAdGroup(removedAdGroupCount);
                                    i2++;
                                }
                            }
                        }
                        i4++;
                    }
                }
                j3 += window.durationUs;
                i3++;
                z = true;
            }
            j2 = j3;
        }
        long jUsToMs = C.usToMs(j2);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.p, this.q, jUsToMs));
        }
        TimeBar timeBar = this.o;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.r0.length;
            int i5 = i2 + length2;
            long[] jArr2 = this.p0;
            if (i5 > jArr2.length) {
                this.p0 = Arrays.copyOf(jArr2, i5);
                this.q0 = Arrays.copyOf(this.q0, i5);
            }
            System.arraycopy(this.r0, 0, this.p0, i2, length2);
            System.arraycopy(this.s0, 0, this.q0, i2, length2);
            this.o.setAdGroupTimesMs(this.p0, this.q0, i5);
        }
        u0();
    }

    public void addVisibilityListener(VisibilityListener listener) {
        Assertions.checkNotNull(listener);
        this.b.add(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return dispatchMediaKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        Player player = this.O;
        if (player == null || !d0(keyCode)) {
            return false;
        }
        if (event.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            this.P.dispatchFastForward(player);
            return true;
        }
        if (keyCode == 89) {
            this.P.dispatchRewind(player);
            return true;
        }
        if (event.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            X(player);
            return true;
        }
        if (keyCode == 87) {
            this.P.dispatchNext(player);
            return true;
        }
        if (keyCode == 88) {
            this.P.dispatchPrevious(player);
            return true;
        }
        if (keyCode == 126) {
            W(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        V(player);
        return true;
    }

    public void e0() {
        Iterator<VisibilityListener> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().onVisibilityChange(getVisibility());
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.O;
    }

    public int getRepeatToggleModes() {
        return this.o0;
    }

    public boolean getShowShuffleButton() {
        return this.u0.A(this.k);
    }

    public boolean getShowSubtitleButton() {
        return this.u0.A(this.G0);
    }

    public int getShowTimeoutMs() {
        return this.m0;
    }

    public boolean getShowVrButton() {
        return this.u0.A(this.l);
    }

    public void hide() {
        this.u0.C();
    }

    public void hideImmediately() {
        this.u0.F();
    }

    public void i0() {
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
    }

    public boolean isAnimationEnabled() {
        return this.u0.I();
    }

    public boolean isFullyVisible() {
        return this.u0.J();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void m0() {
        s0();
        r0();
        v0();
        y0();
        A0();
        t0();
        z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u0.P();
        this.T = true;
        if (isFullyVisible()) {
            this.u0.X();
        }
        m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u0.Q();
        this.T = false;
        removeCallbacks(this.t);
        this.u0.W();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.u0.R(changed, left, top, right, bottom);
    }

    public void removeVisibilityListener(VisibilityListener listener) {
        this.b.remove(listener);
    }

    public void setAnimationEnabled(boolean animationEnabled) {
        this.u0.Y(animationEnabled);
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (this.P != controlDispatcher) {
            this.P = controlDispatcher;
            r0();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
        if (extraAdGroupTimesMs == null) {
            this.r0 = new long[0];
            this.s0 = new boolean[0];
        } else {
            boolean[] zArr = (boolean[]) Assertions.checkNotNull(extraPlayedAdGroups);
            Assertions.checkArgument(extraAdGroupTimesMs.length == zArr.length);
            this.r0 = extraAdGroupTimesMs;
            this.s0 = zArr;
        }
        z0();
    }

    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener listener) {
        this.R = listener;
        q0(this.H0, listener != null);
        q0(this.I0, listener != null);
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.O;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener((Player.Listener) this.a);
        }
        this.O = player;
        if (player != null) {
            player.addListener((Player.Listener) this.a);
        }
        if (player instanceof ExoPlayer) {
            TrackSelector trackSelector = ((ExoPlayer) player).getTrackSelector();
            if (trackSelector instanceof DefaultTrackSelector) {
                this.C0 = (DefaultTrackSelector) trackSelector;
            }
        } else {
            this.C0 = null;
        }
        m0();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener listener) {
        this.Q = listener;
    }

    public void setRepeatToggleModes(int repeatToggleModes) {
        this.o0 = repeatToggleModes;
        Player player = this.O;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (repeatToggleModes == 0 && repeatMode != 0) {
                this.P.dispatchSetRepeatMode(this.O, 0);
            } else if (repeatToggleModes == 1 && repeatMode == 2) {
                this.P.dispatchSetRepeatMode(this.O, 1);
            } else if (repeatToggleModes == 2 && repeatMode == 1) {
                this.P.dispatchSetRepeatMode(this.O, 2);
            }
        }
        this.u0.Z(this.j, repeatToggleModes != 0);
        v0();
    }

    public void setShowFastForwardButton(boolean showFastForwardButton) {
        this.u0.Z(this.f, showFastForwardButton);
        r0();
    }

    public void setShowMultiWindowTimeBar(boolean showMultiWindowTimeBar) {
        this.U = showMultiWindowTimeBar;
        z0();
    }

    public void setShowNextButton(boolean showNextButton) {
        this.u0.Z(this.d, showNextButton);
        r0();
    }

    public void setShowPreviousButton(boolean showPreviousButton) {
        this.u0.Z(this.c, showPreviousButton);
        r0();
    }

    public void setShowRewindButton(boolean showRewindButton) {
        this.u0.Z(this.g, showRewindButton);
        r0();
    }

    public void setShowShuffleButton(boolean showShuffleButton) {
        this.u0.Z(this.k, showShuffleButton);
        y0();
    }

    public void setShowSubtitleButton(boolean showSubtitleButton) {
        this.u0.Z(this.G0, showSubtitleButton);
    }

    public void setShowTimeoutMs(int showTimeoutMs) {
        this.m0 = showTimeoutMs;
        if (isFullyVisible()) {
            this.u0.X();
        }
    }

    public void setShowVrButton(boolean showVrButton) {
        this.u0.Z(this.l, showVrButton);
    }

    public void setTimeBarMinUpdateInterval(int minUpdateIntervalMs) {
        this.n0 = Util.constrainValue(minUpdateIntervalMs, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            n0(onClickListener != null, this.l);
        }
    }

    public void show() {
        this.u0.c0();
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, attrs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$a] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i2, @Nullable AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? r9;
        super(context, attributeSet, i2);
        int resourceId = R.layout.exo_styled_player_control_view;
        this.m0 = 5000;
        this.o0 = 0;
        this.n0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.StyledPlayerControlView, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerControlView_controller_layout_id, resourceId);
                this.m0 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_show_timeout, this.m0);
                this.o0 = a0(typedArrayObtainStyledAttributes, this.o0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.n0));
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z7 = z13;
                z8 = z14;
                z3 = z9;
                z4 = z10;
                z5 = z11;
                z = z16;
                z6 = z12;
                z2 = z15;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = false;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar = new c();
        this.a = cVar;
        this.b = new CopyOnWriteArrayList<>();
        this.r = new Timeline.Period();
        this.s = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.p = sb;
        this.q = new Formatter(sb, Locale.getDefault());
        this.p0 = new long[0];
        this.q0 = new boolean[0];
        this.r0 = new long[0];
        this.s0 = new boolean[0];
        this.P = new DefaultControlDispatcher();
        this.t = new Runnable() { // from class: nh7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u0();
            }
        };
        this.m = (TextView) findViewById(R.id.exo_duration);
        this.n = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.G0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.H0 = imageView2;
        c0(imageView2, new View.OnClickListener() { // from class: lh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.I0 = imageView3;
        c0(imageView3, new View.OnClickListener() { // from class: lh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f0(view);
            }
        });
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.J0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.K0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.L0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i3 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i3);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.o = timeBar;
            r9 = 0;
        } else if (viewFindViewById4 != null) {
            r9 = 0;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.o = defaultTimeBar;
        } else {
            r9 = 0;
            this.o = null;
        }
        TimeBar timeBar2 = this.o;
        if (timeBar2 != null) {
            timeBar2.addListener(cVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.d = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        ?? FindViewById = findViewById(R.id.exo_rew);
        ?? r6 = FindViewById == 0 ? (TextView) findViewById(R.id.exo_rew_with_amount) : r9;
        this.i = r6;
        if (r6 != 0) {
            r6.setTypeface(font);
        }
        FindViewById = FindViewById == 0 ? r6 : FindViewById;
        this.g = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(cVar);
        }
        ?? FindViewById2 = findViewById(R.id.exo_ffwd);
        ?? r7 = FindViewById2 == 0 ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : r9;
        this.h = r7;
        if (r7 != 0) {
            r7.setTypeface(font);
        }
        FindViewById2 = FindViewById2 == 0 ? r7 : FindViewById2;
        this.f = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.j = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.k = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context.getResources();
        this.v0 = resources;
        this.C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = this.v0.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.l = viewFindViewById8;
        if (viewFindViewById8 != null) {
            n0(false, viewFindViewById8);
        }
        y yVar = new y(this);
        this.u0 = yVar;
        yVar.Y(z);
        this.x0 = new f(new String[]{this.v0.getString(R.string.exo_controls_playback_speed), this.v0.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{this.v0.getDrawable(R.drawable.exo_styled_controls_speed), this.v0.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.B0 = this.v0.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, r9);
        this.w0 = recyclerView;
        recyclerView.setAdapter(this.x0);
        this.w0.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.w0, -2, -2, true);
        this.z0 = popupWindow;
        if (Util.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.z0.setOnDismissListener(cVar);
        this.A0 = true;
        this.F0 = new DefaultTrackNameProvider(getResources());
        this.G = this.v0.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.H = this.v0.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.I = this.v0.getString(R.string.exo_controls_cc_enabled_description);
        this.J = this.v0.getString(R.string.exo_controls_cc_disabled_description);
        this.D0 = new h();
        this.E0 = new b();
        this.y0 = new d(this.v0.getStringArray(R.array.exo_playback_speeds), this.v0.getIntArray(R.array.exo_speed_multiplied_by_100));
        this.K = this.v0.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.L = this.v0.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.u = this.v0.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.v = this.v0.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.w = this.v0.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.A = this.v0.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.B = this.v0.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.M = this.v0.getString(R.string.exo_controls_fullscreen_exit_description);
        this.N = this.v0.getString(R.string.exo_controls_fullscreen_enter_description);
        this.x = this.v0.getString(R.string.exo_controls_repeat_off_description);
        this.y = this.v0.getString(R.string.exo_controls_repeat_one_description);
        this.z = this.v0.getString(R.string.exo_controls_repeat_all_description);
        this.E = this.v0.getString(R.string.exo_controls_shuffle_on_description);
        this.F = this.v0.getString(R.string.exo_controls_shuffle_off_description);
        this.u0.Z((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.u0.Z(this.f, z4);
        this.u0.Z(this.g, z3);
        this.u0.Z(this.c, z5);
        this.u0.Z(this.d, z6);
        this.u0.Z(this.k, z7);
        this.u0.Z(this.G0, z8);
        this.u0.Z(this.l, z2);
        this.u0.Z(this.j, this.o0 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mh7
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.a.g0(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }
}
