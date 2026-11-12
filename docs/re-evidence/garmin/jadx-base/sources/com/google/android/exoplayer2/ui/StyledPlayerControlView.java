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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ForwardingPlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverrides;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    private View audioTrackButton;
    private AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final View nextButton;
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Timeline.Period period;
    private final View playPauseButton;
    private PlaybackSpeedAdapter playbackSpeedAdapter;
    private View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final View previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private Resources resources;
    private final View rewindButton;
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private SettingsAdapter settingsAdapter;
    private View settingsButton;
    private RecyclerView settingsView;
    private PopupWindow settingsWindow;
    private int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        private boolean hasSelectionOverride(TrackSelectionOverrides trackSelectionOverrides) {
            for (int i14 = 0; i14 < this.tracks.size(); i14++) {
                if (trackSelectionOverrides.getOverride(this.tracks.get(i14).trackGroupInfo.getTrackGroup()) != null) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view2) {
            if (StyledPlayerControlView.this.player == null) {
                return;
            }
            TrackSelectionParameters trackSelectionParameters = StyledPlayerControlView.this.player.getTrackSelectionParameters();
            TrackSelectionOverrides trackSelectionOverridesBuild = trackSelectionParameters.trackSelectionOverrides.buildUpon().clearOverridesOfType(1).build();
            HashSet hashSet = new HashSet(trackSelectionParameters.disabledTrackTypes);
            hashSet.remove(1);
            ((Player) Util.castNonNull(StyledPlayerControlView.this.player)).setTrackSelectionParameters(trackSelectionParameters.buildUpon().setTrackSelectionOverrides(trackSelectionOverridesBuild).setDisabledTrackTypes(hashSet).build());
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters.trackSelectionOverrides)) {
                StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                TrackInformation trackInformation = list.get(i14);
                if (trackInformation.isSelected()) {
                    StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).getTrackSelectionParameters().trackSelectionOverrides) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new f(this, 0));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view2) {
            Player player = StyledPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (StyledPlayerControlView.this.nextButton == view2) {
                player.seekToNext();
                return;
            }
            if (StyledPlayerControlView.this.previousButton == view2) {
                player.seekToPrevious();
                return;
            }
            if (StyledPlayerControlView.this.fastForwardButton == view2) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.rewindButton == view2) {
                player.seekBack();
                return;
            }
            View view3 = StyledPlayerControlView.this.playPauseButton;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (view3 == view2) {
                styledPlayerControlView.dispatchPlayPause(player);
                return;
            }
            if (styledPlayerControlView.repeatToggleButton == view2) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), StyledPlayerControlView.this.repeatToggleModes));
                return;
            }
            if (StyledPlayerControlView.this.shuffleButton == view2) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                return;
            }
            View view4 = StyledPlayerControlView.this.settingsButton;
            StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
            if (view4 == view2) {
                styledPlayerControlView2.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.displaySettingsWindow(styledPlayerControlView3.settingsAdapter);
                return;
            }
            View view5 = styledPlayerControlView2.playbackSpeedButton;
            StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
            if (view5 == view2) {
                styledPlayerControlView4.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
                styledPlayerControlView5.displaySettingsWindow(styledPlayerControlView5.playbackSpeedAdapter);
                return;
            }
            View view6 = styledPlayerControlView4.audioTrackButton;
            StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
            if (view6 == view2) {
                styledPlayerControlView6.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView7 = StyledPlayerControlView.this;
                styledPlayerControlView7.displaySettingsWindow(styledPlayerControlView7.audioTrackSelectionAdapter);
            } else if (styledPlayerControlView6.subtitleButton == view2) {
                StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView8 = StyledPlayerControlView.this;
                styledPlayerControlView8.displaySettingsWindow(styledPlayerControlView8.textTrackSelectionAdapter);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.needToHideBars) {
                StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                StyledPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                StyledPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                StyledPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                StyledPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                StyledPlayerControlView.this.updateTimeline();
            }
            if (events.contains(12)) {
                StyledPlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.contains(2)) {
                StyledPlayerControlView.this.updateTrackLists();
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j8) {
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j8));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j8) {
            StyledPlayerControlView.this.scrubbing = true;
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j8));
            }
            StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j8, boolean z14) {
            StyledPlayerControlView.this.scrubbing = false;
            if (!z14 && StyledPlayerControlView.this.player != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.seekToTimeBarPosition(styledPlayerControlView.player, j8);
            }
            StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z14);
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.h<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i14, View view2) {
            if (i14 != this.selectedIndex) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i14]);
            }
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i14) {
            String[] strArr = this.playbackSpeedTexts;
            if (i14 < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i14]);
            }
            subSettingViewHolder.checkView.setVisibility(i14 == this.selectedIndex ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f53113a.lambda$onBindViewHolder$0(i14, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i14) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public void updateSelectedIndex(float f14) {
            int i14 = 0;
            float f15 = Float.MAX_VALUE;
            int i15 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i14 >= fArr.length) {
                    this.selectedIndex = i15;
                    return;
                }
                float fAbs = Math.abs(f14 - fArr[i14]);
                if (fAbs < f15) {
                    i15 = i14;
                    f15 = fAbs;
                }
                i14++;
            }
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j8, long j14);
    }

    public final class SettingViewHolder extends RecyclerView.f0 {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view2) {
            super(view2);
            if (Util.SDK_INT < 26) {
                view2.setFocusable(true);
            }
            this.mainTextView = (TextView) view2.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view2.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view2.findViewById(R.id.exo_icon);
            view2.setOnClickListener(new f(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view2) {
            StyledPlayerControlView.this.onSettingViewClicked(getAdapterPosition());
        }
    }

    public class SettingsAdapter extends RecyclerView.h<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i14) {
            return i14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i14) {
            settingViewHolder.mainTextView.setText(this.mainTexts[i14]);
            if (this.subTexts[i14] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i14]);
            }
            if (this.iconIds[i14] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i14]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i14) {
            return StyledPlayerControlView.this.new SettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public void setSubTextAtPosition(int i14, String str) {
            this.subTexts[i14] = str;
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.f0 {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view2) {
            super(view2);
            if (Util.SDK_INT < 26) {
                view2.setFocusable(true);
            }
            this.textView = (TextView) view2.findViewById(R.id.exo_text);
            this.checkView = view2.findViewById(R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view2) {
            if (StyledPlayerControlView.this.player != null) {
                TrackSelectionParameters trackSelectionParameters = StyledPlayerControlView.this.player.getTrackSelectionParameters();
                StyledPlayerControlView.this.player.setTrackSelectionParameters(trackSelectionParameters.buildUpon().setDisabledTrackTypes(new ImmutableSet.Builder().addAll((Iterable) trackSelectionParameters.disabledTrackTypes).add(3).build()).build());
                StyledPlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z14 = false;
            for (int i14 = 0; i14 < list.size(); i14++) {
                if (list.get(i14).isSelected()) {
                    z14 = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.subtitleButton != null) {
                ImageView imageView = StyledPlayerControlView.this.subtitleButton;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z14 ? styledPlayerControlView.subtitleOnButtonDrawable : styledPlayerControlView.subtitleOffButtonDrawable);
                ImageView imageView2 = StyledPlayerControlView.this.subtitleButton;
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                imageView2.setContentDescription(z14 ? styledPlayerControlView2.subtitleOnContentDescription : styledPlayerControlView2.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i14) {
            super.onBindViewHolder(subSettingViewHolder, i14);
            if (i14 > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i14 + (-1)).isSelected() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z14;
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_none);
            int i14 = 0;
            while (true) {
                if (i14 >= this.tracks.size()) {
                    z14 = true;
                    break;
                } else {
                    if (this.tracks.get(i14).isSelected()) {
                        z14 = false;
                        break;
                    }
                    i14++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z14 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new f(this, 2));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }
    }

    public static final class TrackInformation {
        public final TracksInfo.TrackGroupInfo trackGroupInfo;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(TracksInfo tracksInfo, int i14, int i15, String str) {
            this.trackGroupInfo = tracksInfo.getTrackGroupInfos().get(i14);
            this.trackIndex = i15;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroupInfo.isTrackSelected(this.trackIndex);
        }
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.h<SubSettingViewHolder> {
        protected List<TrackInformation> tracks = new ArrayList();

        public TrackSelectionAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(TrackGroup trackGroup, TrackInformation trackInformation, View view2) {
            if (StyledPlayerControlView.this.player == null) {
                return;
            }
            TrackSelectionParameters trackSelectionParameters = StyledPlayerControlView.this.player.getTrackSelectionParameters();
            TrackSelectionOverrides trackSelectionOverridesBuild = trackSelectionParameters.trackSelectionOverrides.buildUpon().setOverrideForType(new TrackSelectionOverrides.TrackSelectionOverride(trackGroup, ImmutableList.of(Integer.valueOf(trackInformation.trackIndex)))).build();
            HashSet hashSet = new HashSet(trackSelectionParameters.disabledTrackTypes);
            hashSet.remove(Integer.valueOf(trackInformation.trackGroupInfo.getTrackType()));
            ((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).setTrackSelectionParameters(trackSelectionParameters.buildUpon().setTrackSelectionOverrides(trackSelectionOverridesBuild).setDisabledTrackTypes(hashSet).build());
            onTrackSelection(trackInformation.trackName);
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        public void clear() {
            this.tracks = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(List<TrackInformation> list);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i14) {
            if (StyledPlayerControlView.this.player == null) {
                return;
            }
            if (i14 == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i14 - 1);
            final TrackGroup trackGroup = trackInformation.trackGroupInfo.getTrackGroup();
            boolean z14 = ((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).getTrackSelectionParameters().trackSelectionOverrides.getOverride(trackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z14 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f53115a.lambda$onBindViewHolder$0(trackGroup, trackInformation, view2);
                }
            });
        }

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i14) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public abstract void onTrackSelection(String str);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i14);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i14, AttributeSet attributeSet2) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        TextView textView;
        boolean z27;
        super(context, attributeSet, i14);
        int resourceId = R.layout.exo_styled_player_control_view;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.StyledPlayerControlView, i14, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerControlView_controller_layout_id, resourceId);
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_show_timeout, this.showTimeoutMs);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z29 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z34 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z35 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z36 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z37 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z38 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                boolean z39 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z15 = z36;
                z16 = z37;
                z14 = z38;
                z18 = z28;
                z19 = z29;
                z24 = z34;
                z17 = z39;
                z25 = z35;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = true;
            z18 = true;
            z19 = true;
            z24 = true;
            z25 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb3 = new StringBuilder();
        this.formatBuilder = sb3;
        this.formatter = new Formatter(sb3, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        this.updateProgressAction = new b(this, 1);
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.fullScreenButton = imageView2;
        int i15 = 4;
        initializeFullScreenButton(imageView2, new f(this, i15));
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new f(this, i15));
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        int i16 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i16);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
            z26 = z14;
            textView = null;
        } else if (viewFindViewById4 != null) {
            z26 = z14;
            textView = null;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i16);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            z26 = z14;
            textView = null;
            this.timeBar = null;
        }
        TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.playPauseButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.previousButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.nextButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        Typeface typefaceA = b7.g.a(R.font.roboto_medium_numbers, context);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : textView;
        this.rewindButtonTextView = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceA);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.rewindButton = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(componentListener);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : textView;
        this.fastForwardButtonTextView = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceA);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.fastForwardButton = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(componentListener);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener);
        }
        Resources resources = context.getResources();
        this.resources = resources;
        this.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = this.resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.vrButton = viewFindViewById10;
        if (viewFindViewById10 != null) {
            updateButton(false, viewFindViewById10);
        }
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = new StyledPlayerControlViewLayoutManager(this);
        this.controlViewLayoutManager = styledPlayerControlViewLayoutManager;
        styledPlayerControlViewLayoutManager.setAnimationEnabled(z17);
        this.settingsAdapter = new SettingsAdapter(new String[]{this.resources.getString(R.string.exo_controls_playback_speed), this.resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{this.resources.getDrawable(R.drawable.exo_styled_controls_speed), this.resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.settingsWindowMargin = this.resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.settingsView = recyclerView;
        recyclerView.setAdapter(this.settingsAdapter);
        this.settingsView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.settingsView, -2, -2, true);
        this.settingsWindow = popupWindow;
        if (Util.SDK_INT < 23) {
            z27 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z27 = false;
        }
        this.settingsWindow.setOnDismissListener(componentListener);
        this.needToHideBars = true;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.subtitleOnButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.subtitleOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.subtitleOnContentDescription = this.resources.getString(R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = this.resources.getString(R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        this.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        this.playbackSpeedAdapter = new PlaybackSpeedAdapter(this.resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        this.fullScreenExitDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.fullScreenEnterDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.repeatOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.repeatOneButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.repeatAllButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.shuffleOnButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.shuffleOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.fullScreenExitContentDescription = this.resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.fullScreenEnterContentDescription = this.resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = this.resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = this.resources.getString(R.string.exo_controls_shuffle_off_description);
        this.controlViewLayoutManager.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.controlViewLayoutManager.setShowButton(viewFindViewById9, z19);
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z18);
        this.controlViewLayoutManager.setShowButton(this.previousButton, z24);
        this.controlViewLayoutManager.setShowButton(this.nextButton, z25);
        this.controlViewLayoutManager.setShowButton(imageView5, z15);
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z16);
        this.controlViewLayoutManager.setShowButton(viewFindViewById10, z26);
        this.controlViewLayoutManager.setShowButton(imageView4, this.repeatToggleModes != 0 ? true : z27);
        addOnLayoutChangeListener(new k(this, 1));
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i14 = 0; i14 < windowCount; i14++) {
            if (timeline.getWindow(i14, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private void dispatchPause(Player player) {
        player.pause();
    }

    private void dispatchPlay(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            seekTo(player, player.getCurrentMediaItemIndex(), C.TIME_UNSET);
        }
        player.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlayPause(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            dispatchPlay(player);
        } else {
            dispatchPause(player);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.h<?> hVar) {
        this.settingsView.setAdapter(hVar);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(this, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private ImmutableList<TrackInformation> gatherSupportedTrackInfosOfType(TracksInfo tracksInfo, int i14) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<TracksInfo.TrackGroupInfo> trackGroupInfos = tracksInfo.getTrackGroupInfos();
        for (int i15 = 0; i15 < trackGroupInfos.size(); i15++) {
            TracksInfo.TrackGroupInfo trackGroupInfo = trackGroupInfos.get(i15);
            if (trackGroupInfo.getTrackType() == i14) {
                TrackGroup trackGroup = trackGroupInfo.getTrackGroup();
                for (int i16 = 0; i16 < trackGroup.length; i16++) {
                    if (trackGroupInfo.isTrackSupported(i16)) {
                        builder.add(new TrackInformation(tracksInfo, i15, i16, this.trackNameProvider.getTrackName(trackGroup.getFormat(i16))));
                    }
                }
            }
        }
        return builder.build();
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i14) {
        return typedArray.getInt(R.styleable.StyledPlayerControlView_repeat_toggle_modes, i14);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            TracksInfo currentTracksInfo = this.player.getCurrentTracksInfo();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracksInfo, 1));
            boolean showButton = this.controlViewLayoutManager.getShowButton(this.subtitleButton);
            TextTrackSelectionAdapter textTrackSelectionAdapter = this.textTrackSelectionAdapter;
            if (showButton) {
                textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracksInfo, 3));
            } else {
                textTrackSelectionAdapter.init(ImmutableList.of());
            }
        }
    }

    private static void initializeFullScreenButton(View view2, View.OnClickListener onClickListener) {
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
        view2.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i14) {
        return i14 == 90 || i14 == 89 || i14 == 85 || i14 == 79 || i14 == 126 || i14 == 127 || i14 == 87 || i14 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullScreenButtonClicked(View view2) {
        if (this.onFullScreenModeChangedListener == null) {
            return;
        }
        boolean z14 = !this.isFullScreen;
        this.isFullScreen = z14;
        updateFullScreenButtonForState(this.fullScreenButton, z14);
        updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.isFullScreen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        int i26 = i17 - i15;
        int i27 = i25 - i19;
        if (!(i16 - i14 == i24 - i18 && i26 == i27) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view2, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i14) {
        if (i14 == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter);
        } else if (i14 == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter);
        } else {
            this.settingsWindow.dismiss();
        }
    }

    private void seekTo(Player player, int i14, long j8) {
        player.seekTo(i14, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j8) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j8 < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j8 = durationMs;
                    break;
                } else {
                    j8 -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j8);
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f14) {
        Player player = this.player;
        if (player == null) {
            return;
        }
        player.setPlaybackParameters(player.getPlaybackParameters().withSpeed(f14));
    }

    private boolean shouldShowPauseButton() {
        Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    private void updateButton(boolean z14, View view2) {
        if (view2 == null) {
            return;
        }
        view2.setEnabled(z14);
        view2.setAlpha(z14 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view2 = this.fastForwardButton;
        if (view2 != null) {
            view2.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullScreenButtonForState(ImageView imageView, boolean z14) {
        if (imageView == null) {
            return;
        }
        if (z14) {
            imageView.setImageDrawable(this.fullScreenExitDrawable);
            imageView.setContentDescription(this.fullScreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    private static void updateFullScreenButtonVisibility(View view2, boolean z14) {
        if (view2 == null) {
            return;
        }
        if (z14) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPauseButton = shouldShowPauseButton();
            View view2 = this.playPauseButton;
            if (zShouldShowPauseButton) {
                ((ImageView) view2).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_pause));
                this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_pause_description));
            } else {
                ((ImageView) view2).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_play));
                this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_play_description));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                contentPosition = player.getContentPosition() + this.currentWindowOffset;
                contentBufferedPosition = player.getContentBufferedPosition() + this.currentWindowOffset;
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f14 = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f14 > 0.0f ? (long) (jMin / f14) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view2 = this.rewindButton;
        if (view2 != null) {
            view2.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            ImageView imageView2 = this.shuffleButton;
            if (player == null) {
                updateButton(false, imageView2);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, imageView2);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        int i14;
        Timeline.Window window;
        long j8;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z14 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j14 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i14 = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z15 = this.multiWindowTimeBar;
            int i15 = z15 ? 0 : currentMediaItemIndex;
            int windowCount = z15 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i14 = 0;
            long j15 = 0;
            while (i15 <= windowCount) {
                if (i15 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j15);
                }
                currentTimeline.getWindow(i15, this.window);
                Timeline.Window window2 = this.window;
                long j16 = window2.durationUs;
                long j17 = C.TIME_UNSET;
                if (j16 == C.TIME_UNSET) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z14);
                    break;
                }
                int i16 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i16 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i16, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j8 = j14;
                                long j18 = this.period.durationUs;
                                if (j18 != j17) {
                                    adGroupTimeUs = j18;
                                }
                                removedAdGroupCount++;
                                j14 = j8;
                                j17 = C.TIME_UNSET;
                            } else {
                                j8 = j14;
                            }
                            long positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                            if (positionInWindowUs >= j8) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i14 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i14] = Util.usToMs(positionInWindowUs + j15);
                                this.playedAdGroups[i14] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i14++;
                            }
                            removedAdGroupCount++;
                            j14 = j8;
                            j17 = C.TIME_UNSET;
                        }
                        i16++;
                        j17 = C.TIME_UNSET;
                    }
                }
                j15 += window.durationUs;
                i15++;
                j14 = j14;
                z14 = true;
            }
            j14 = j15;
        }
        long jUsToMs = Util.usToMs(j14);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i17 = i14 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i17 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i17);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i17);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i14, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i14, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i17);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            dispatchPlayPause(player);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            dispatchPlay(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        dispatchPause(player);
        return true;
    }

    public Player getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        this.controlViewLayoutManager.onLayout(z14, i14, i15, i16, i17);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        View view2 = this.playPauseButton;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z14) {
        this.controlViewLayoutManager.setAnimationEnabled(z14);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener != null);
        updateFullScreenButtonVisibility(this.minimalFullScreenButton, onFullScreenModeChangedListener != null);
    }

    public void setPlayer(Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        if (player instanceof ForwardingPlayer) {
            ((ForwardingPlayer) player).getWrappedPlayer();
        }
        updateAll();
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i14) {
        this.repeatToggleModes = i14;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i14 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i14 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i14 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i14 != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z14);
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z14) {
        this.showMultiWindowTimeBar = z14;
        updateTimeline();
    }

    public void setShowNextButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z14);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z14);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z14);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z14);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z14);
    }

    public void setShowTimeoutMs(int i14) {
        this.showTimeoutMs = i14;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z14) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z14);
    }

    public void setTimeBarMinUpdateInterval(int i14) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i14, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view2 = this.vrButton;
        if (view2 != null) {
            view2.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, attributeSet);
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }
}
